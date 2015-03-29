package wildcraft.core;

import wildcraft.WildCraft;
import wildcraft.item.ItemChemicalBottle;
import wildcraft.item.ItemMotar;
import wildcraft.item.ItemPelt;
import wildcraft.item.ItemPestle;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {

	public static Item tabIcon;
	public static Item motar;
	public static Item pestle;
	public static Item pelt;
	public static Item chemicalBottle;

	public static void init(){
		assign();
		register();
	}
	public static void assign(){
		tabIcon = new Item().setTextureName("wildcraft:slash").setUnlocalizedName("wildcraft.tabIcon");
		motar = new ItemMotar().setTextureName("wildcraft:motar").setUnlocalizedName("wildcraft.motar").setCreativeTab(WildCraft.tab);
		pestle = new ItemPestle().setTextureName("wildcraft:pestle").setUnlocalizedName("wildcraft.pestle").setCreativeTab(WildCraft.tab);
		pelt = new ItemPelt().setUnlocalizedName("wildcraft.pelt").setCreativeTab(WildCraft.tab);
		chemicalBottle = new ItemChemicalBottle().setUnlocalizedName("wildcraft.chemBottle").setCreativeTab(WildCraft.tab);
	}
	public static void register(){
		GameRegistry.registerItem(tabIcon, "slashIcon");
		GameRegistry.registerItem(motar, "motar");
		GameRegistry.registerItem(pestle, "pestle");
		GameRegistry.registerItem(pelt, "pelt");
		GameRegistry.registerItem(chemicalBottle, "chemicalBottle");


	}
}
