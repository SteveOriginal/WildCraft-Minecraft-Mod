package wildcraft;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import wildcraft.client.render.block.RenderTannery;
import wildcraft.client.render.entity.*;
import wildcraft.client.render.item.RenderItemBlock;
import wildcraft.core.ModBlocks;
import wildcraft.core.ModItems;
import wildcraft.entity.animal.EntityCanine;
import wildcraft.entity.tile.TileEntityTannery;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ProxyClient extends ProxyCommon{

	public void render(){
		RenderingRegistry.registerEntityRenderingHandler(EntityCanine.class, new RenderCanine());
		TileEntitySpecialRenderer render1 = new RenderTannery();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTannery.class, render1);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.tannery_off),new RenderItemBlock(render1, new TileEntityTannery()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.tannery_on),new RenderItemBlock(render1, new TileEntityTannery()));
	}

}
