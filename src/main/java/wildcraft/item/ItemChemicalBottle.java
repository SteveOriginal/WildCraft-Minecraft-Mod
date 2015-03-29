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


public class ItemChemicalBottle extends Item

{
	private static final String[] items = new String[] {"tannin"};
	private IIcon[] textures;

	public ItemChemicalBottle()
	{
		super();
		this.setHasSubtypes(true);
	}



	@Override
	public void getSubItems(Item item, CreativeTabs creativeTabs, List list)
	{
		for (int i = 0; i < items.length; ++i) 
		{
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public void registerIcons(IIconRegister iconRegister)
	{
		textures = new IIcon[items.length];

		for (int i = 0; i < items.length; ++i) 
		{
			textures[i] = iconRegister.registerIcon("wildcraft:"+"bottle_" + items[i]);
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
	@SideOnly(Side.CLIENT)
	public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		switch (stack.getItemDamage())
		{
		case 0:
			list.add( StatCollector.translateToLocal("wildcraft.chemical.tannin"));
			break;
		
		}
	}

}

