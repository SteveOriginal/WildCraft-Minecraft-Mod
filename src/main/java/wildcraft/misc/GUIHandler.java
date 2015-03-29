package wildcraft.misc;

import wildcraft.WildCraft;
import wildcraft.client.gui.GuiTannery;
import wildcraft.entity.tile.TileEntityTannery;
import wildcraft.inventory.ContainerTannery;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		Entity entity2 = world.getEntityByID(x);

		switch(ID) {
		case WildCraft.guiId_tannery:
			if(entity != null) {

				if (entity instanceof TileEntityTannery) {
					return new ContainerTannery(player.inventory, (TileEntityTannery) entity);

				}
			}
			break;


		}



		return null;

	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		Entity entity2 = world.getEntityByID(x);

		switch(ID) {

		case WildCraft.guiId_tannery:
			if(entity != null) {

				if (entity instanceof TileEntityTannery) {
					return new GuiTannery(player.inventory, (TileEntityTannery) entity);
				}
			}
			break;


		}
		return null;

	}

}

