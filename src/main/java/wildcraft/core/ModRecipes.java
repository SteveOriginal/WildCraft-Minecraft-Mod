package wildcraft.core;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.tannery_off), new Object[] {"XXX", "YZY", "ZZZ", Character.valueOf('X'), "plankWood", Character.valueOf('Y'), "stickWood", Character.valueOf('Z'), Blocks.cobblestone}));
		GameRegistry.addRecipe(new ItemStack(ModItems.motar), new Object[] {"X X", " X ", Character.valueOf('X'), Blocks.cobblestone});
		GameRegistry.addRecipe(new ItemStack(ModItems.pestle), new Object[] {"X", "Y", Character.valueOf('X'), Items.stick, Character.valueOf('Y'), Blocks.cobblestone});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.chemicalBottle, 1, 0), new Object[]{Item.getItemById(373), Items.apple, new ItemStack(ModItems.motar, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.pestle, 1, OreDictionary.WILDCARD_VALUE) });
     
	}

}
