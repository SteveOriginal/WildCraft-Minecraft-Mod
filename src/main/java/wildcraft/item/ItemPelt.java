package wildcraft.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemPelt extends Item

{
	private static final String[] pelts = new String[] {"wolf", "pig"};
	private IIcon[] textures;
	
	public ItemPelt()
	{
		super();
		this.setHasSubtypes(true);
	}
	

	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTabs, List list)
    {
		for (int i = 0; i < pelts.length; ++i) 
		{
			if (i != 11)
			{
				list.add(new ItemStack(item, 1, i));
			}
		}
    }

	@Override
	public void registerIcons(IIconRegister iconRegister)
	{
		textures = new IIcon[pelts.length];

		for (int i = 0; i < pelts.length; ++i) 
		{
			textures[i] = iconRegister.registerIcon("wildcraft:pelt_"+ pelts[i]);
		}
	}

	@Override
	public IIcon getIconFromDamage(int meta)
	{
		if (meta < 0 || meta >= textures.length) 
		{
			meta = 0;
		}

		return textures[meta];
	}


	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		int meta = itemStack.getItemDamage();
		if (meta < 0 || meta >= pelts.length) 
		{
			meta = 0;
		}

		return super.getUnlocalizedName() + "." + pelts[meta];
	}
}

