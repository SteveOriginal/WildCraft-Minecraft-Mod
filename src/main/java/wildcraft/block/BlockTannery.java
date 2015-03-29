package wildcraft.block;

import java.util.List;
import java.util.Random;

import wildcraft.WildCraft;
import wildcraft.core.ModBlocks;
import wildcraft.entity.tile.TileEntityTannery;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTannery extends BlockContainer {

	private final boolean isActive;

	private static boolean keepInventory;
	private Random rand = new Random();

	public BlockTannery(Material mat, boolean isActive) {
		super(mat);
		this.isActive = isActive;
	}
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
	{
		float f = 0.0625F;
		return AxisAlignedBB.getBoundingBox((double)((float)x + f), (double)y, (double)((float)z + f), (double)((float)(x + 1) - f), (double)((float)(y + 1) - f), (double)((float)(z + 1) - f));
	}

	/**
	 * Returns the bounding box of the wired rectangular prism to render.
	 */
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z)
	{
		float f = 0.0625F;
		return AxisAlignedBB.getBoundingBox((double)((float)x + f), (double)y, (double)((float)z + f), (double)((float)(x + 1) - f), (double)(y + 1), (double)((float)(z + 1) - f));
	}

	public int getRenderType()
	{
		return -28;
	}
	public boolean isOpaqueCube()
	{
		return false;
	}
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	public Item getItemDropped(int i, Random random, int j) {
		return Item.getItemFromBlock(ModBlocks.tannery_off);
	}

	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		this.setDefaultDirection(world, x, y, z);
	}

	private void setDefaultDirection(World world, int x, int y, int z) {
		if(!world.isRemote) {
			Block b1 = world.getBlock(x, y, z - 1);
			Block b2 = world.getBlock(x,  y,  z + 1);
			Block b3 = world.getBlock(x - 1, y, z);
			Block b4  = world.getBlock(x + 1, y, z);

			byte b0 = 3;

			if(b1.func_149730_j() && !b2.func_149730_j()) {
				b0 = 3;	
			}

			if(b2.func_149730_j() && !b1.func_149730_j()) {
				b0 = 2;	
			}

			if(b3.func_149730_j() && !b4.func_149730_j()) {
				b0 = 5;	
			}

			if(b4.func_149730_j() && !b3.func_149730_j()) {
				b0 = 4;	
			}

			world.setBlockMetadataWithNotify(x, y, x, b0, 2);
		}

	}


	@Override
	public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9) {
		if (!player.isSneaking()) {
			player.openGui(WildCraft.instance, WildCraft.guiId_tannery, var1, var2, var3, var4);
			return true;
		} else {
			return false;
		}
	}
	@Override
	public TileEntity createNewTileEntity(World world, int i) {
		return new TileEntityTannery();
	}


	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityplayer, ItemStack itemstack) {
		int l = MathHelper.floor_double((double)(entityplayer.rotationYaw * 4.0F / 360.F) + 0.5D) & 3;

		if(l == 0) {
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
		}

		if(l == 1) {
			world.setBlockMetadataWithNotify(x, y, z, 5, 2);
		}

		if(l == 2) {
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
		}

		if(l == 3) {
			world.setBlockMetadataWithNotify(x, y, z, 4, 2);
		}

		if(itemstack.hasDisplayName()) {
			((TileEntityTannery)world.getTileEntity(x, y, z)).func_145951_a(itemstack.getDisplayName());
		}
	}

	public static void updateTanneryBlockState(boolean active, World worldObj, int xCoord, int yCoord, int zCoord) {
		int i = worldObj.getBlockMetadata(xCoord, yCoord, zCoord);

		TileEntity tileentity = worldObj.getTileEntity(xCoord, yCoord, zCoord);
		keepInventory = true;

		if(active) {
			worldObj.setBlock(xCoord, yCoord, zCoord, ModBlocks.tannery_on);
		}else{
			worldObj.setBlock(xCoord, yCoord, zCoord, ModBlocks.tannery_off);
		}

		keepInventory = false;

		worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, i, 2);

		if(tileentity != null) {
			tileentity.validate();
			worldObj.setTileEntity(xCoord, yCoord, zCoord, tileentity);
		}
	}

	public void breakBlock(World world, int x, int y, int z, Block oldblock, int oldMetadata) {
		if(!keepInventory) {
			TileEntityTannery tileentity = (TileEntityTannery) world.getTileEntity(x, y, z);

			if(tileentity != null) {
				for(int i = 0; i < tileentity.getSizeInventory(); i++) {
					ItemStack itemstack = tileentity.getStackInSlot(i);

					if(itemstack != null) {
						float f = this.rand.nextFloat() * 0.8F + 0.1F;
						float f1 = this.rand.nextFloat() * 0.8F + 0.1F;
						float f2 = this.rand.nextFloat() * 0.8F + 0.1F;

						while(itemstack.stackSize > 0) {
							int j = this.rand.nextInt(21) + 10;

							if(j > itemstack.stackSize) {
								j = itemstack.stackSize;
							}

							itemstack.stackSize -= j;

							EntityItem item = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j, itemstack.getItemDamage()));

							if(itemstack.hasTagCompound()) {
								item.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
							}

							world.spawnEntityInWorld(item);
						}
					}
				}

				world.func_147453_f(x, y, z, oldblock);
			}
		}

		super.breakBlock(world, x, y, z, oldblock, oldMetadata);
	}


}