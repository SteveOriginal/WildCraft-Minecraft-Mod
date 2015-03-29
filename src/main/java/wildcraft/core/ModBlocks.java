package wildcraft.core;

import wildcraft.WildCraft;
import wildcraft.block.BlockTannery;
import wildcraft.entity.tile.TileEntityTannery;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static Block tannery_on;
	public static Block tannery_off;

	public static void init() {
		assign();
		register();
	}

	public static void assign() {
		tannery_on = new BlockTannery(Material.wood, true).setBlockTextureName("cobblestone").setBlockName("wildcraft.tannery").setHardness(2.0F).setResistance(10.0F);
		tannery_off = new BlockTannery(Material.wood, false).setBlockTextureName("cobblestone").setBlockName("wildcraft.tannery").setCreativeTab(WildCraft.tab).setHardness(2.0F).setResistance(10.0F);

	}
	public static void register() {
		GameRegistry.registerBlock(tannery_on, "tannery_on");
		GameRegistry.registerBlock(tannery_off, "tannery_off");

		GameRegistry.registerTileEntity(TileEntityTannery.class, "TileEntityTannery");

	}

}
