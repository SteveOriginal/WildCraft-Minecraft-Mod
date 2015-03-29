package wildcraft.client.render.block;

import java.util.List;

import org.lwjgl.opengl.GL11;

import wildcraft.client.model.ModelTannery;
import wildcraft.entity.tile.TileEntityTannery;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;


public class RenderTannery extends TileEntitySpecialRenderer {
	public static final ResourceLocation texture = new ResourceLocation("wildcraft:textures/model/tannery.png");

	private ModelTannery model;
	EntityItem inputEntity;
	EntityItem outputEntity;

	public RenderTannery(){
		this.model = new ModelTannery();
	}

	public void renderTileEntityTanneryAt(TileEntityTannery tileentity, double x, double y, double z, float f) {
		if(tileentity.shouldRenderItem1){
		if(tileentity.getStackInSlot(0) != null){
			if(tileentity.getStackInSlot(0).getItem() != null){
				inputEntity = new EntityItem(Minecraft.getMinecraft().theWorld, 0D, 0D, 0D, new ItemStack(((TileEntityTannery) tileentity).getStackInSlot(0).getItem(), 1 , ((TileEntityTannery) tileentity).getStackInSlot(0).getItemDamage()));
			}
		}
		}
		if(tileentity.shouldRenderItem1){
		if(tileentity.getStackInSlot(2) != null){
			if(tileentity.getStackInSlot(2).getItem() != null){
				outputEntity = new EntityItem(Minecraft.getMinecraft().theWorld, 0D, 0D, 0D, new ItemStack(((TileEntityTannery) tileentity).getStackInSlot(2).getItem(), 1 , ((TileEntityTannery) tileentity).getStackInSlot(2).getItemDamage()));
			}
		}
		}
		int i = 0;
		if (tileentity.hasWorldObj())
		{
			i = tileentity.getBlockMetadata();
		}
		short short1 = 0;
		if (i == 2)
		{

			short1 = 180;
		}
		if (i == 3){
			short1 = 0;
		}
		if (i == 4)
		{
			short1 = 90;
		}
		if (i == 5)
		{
			short1 = -90;
		}
		if(tileentity.getStackInSlot(0) != null){
			if(tileentity.getStackInSlot(0).getItem() != null){
				GL11.glPushMatrix();
				inputEntity.hoverStart = 0.0F;
				RenderItem.renderInFrame = true;
				GL11.glTranslatef((float)x, (float)y, (float)z);
				if(i == 2){
					GL11.glTranslatef((float)0.5F, (float)0.35F, (float)0.2F);
					GL11.glRotatef(180, 0F, 1F, 1F);
					GL11.glRotatef(65, 1F, 0F, 0F);
					float Item1Scale = 1.4F;
					GL11.glScalef(Item1Scale, Item1Scale, Item1Scale);
					GL11.glDisable(GL11.GL_CULL_FACE);
					RenderManager.instance.renderEntityWithPosYaw(inputEntity, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
					GL11.glEnable(GL11.GL_CULL_FACE);

					RenderItem.renderInFrame = false;
				}
				if(i == 3){
					GL11.glTranslatef((float)0.5F, (float)0.35F, (float)0.8F);
					GL11.glRotatef(180, 0F, 1F, 1F);
					GL11.glRotatef(115, 1F, 0F, 0F);
					float Item1Scale = 1.4F;
					GL11.glScalef(Item1Scale, Item1Scale, Item1Scale);
					GL11.glDisable(GL11.GL_CULL_FACE);
					RenderManager.instance.renderEntityWithPosYaw(inputEntity, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
					GL11.glEnable(GL11.GL_CULL_FACE);					RenderItem.renderInFrame = false;
				}
				if(i == 4){
					GL11.glTranslatef((float)0.2F, (float)0.35F, (float)0.5F);
					GL11.glRotatef(180, 0F, 1F, 1F);
					GL11.glRotatef(-90, 0F, 0F, 1F);
					GL11.glRotatef(115, 1F, 0F, 0F);
					float Item1Scale = 1.4F;
					GL11.glScalef(Item1Scale, Item1Scale, Item1Scale);
					GL11.glDisable(GL11.GL_CULL_FACE);
					RenderManager.instance.renderEntityWithPosYaw(inputEntity, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
					GL11.glEnable(GL11.GL_CULL_FACE);					RenderItem.renderInFrame = false;
				}
				if(i == 5){
					GL11.glTranslatef((float)0.8F, (float)0.35F, (float)0.5F);
					GL11.glRotatef(180, 0F, 1F, 1F);
					GL11.glRotatef(90, 0F, 0F, 1F);
					GL11.glRotatef(115, 1F, 0F, 0F);
					float Item1Scale = 1.4F;
					GL11.glScalef(Item1Scale, Item1Scale, Item1Scale);
					GL11.glDisable(GL11.GL_CULL_FACE);
					RenderManager.instance.renderEntityWithPosYaw(inputEntity, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
					GL11.glEnable(GL11.GL_CULL_FACE);					RenderItem.renderInFrame = false;
				}
				GL11.glPopMatrix();

			}


		}

		if(tileentity.getStackInSlot(2) != null){
			if(tileentity.getStackInSlot(2).getItem() != null){
				GL11.glPushMatrix();
				outputEntity.hoverStart = 0.0F;
				RenderItem.renderInFrame = true;
				GL11.glTranslatef((float)x, (float)y, (float)z);
				if(i == 2){
					GL11.glTranslatef((float)0.5F, (float)0.35F, (float)0.8F);
					GL11.glRotatef(180, 0F, 1F, 1F);
					GL11.glRotatef(180, 0F, 0F, 1F);
					GL11.glRotatef(65, 1F, 0F, 0F);
					float Item1Scale = 1.4F;
					GL11.glScalef(Item1Scale, Item1Scale, Item1Scale);
					GL11.glDisable(GL11.GL_CULL_FACE);
					RenderManager.instance.renderEntityWithPosYaw(outputEntity, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
					GL11.glEnable(GL11.GL_CULL_FACE);					RenderItem.renderInFrame = false;
				}
				if(i == 3){
					GL11.glTranslatef((float)0.5F, (float)0.35F, (float)0.2F);
					GL11.glRotatef(180, 0F, 1F, 1F);
					GL11.glRotatef(180, 0F, 0F, 1F);
					GL11.glRotatef(115, 1F, 0F, 0F);
					float Item1Scale = 1.4F;
					GL11.glScalef(Item1Scale, Item1Scale, Item1Scale);
					GL11.glDisable(GL11.GL_CULL_FACE);
					RenderManager.instance.renderEntityWithPosYaw(outputEntity, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
					GL11.glEnable(GL11.GL_CULL_FACE);					RenderItem.renderInFrame = false;
				}
				if(i == 4){
					GL11.glTranslatef((float)0.8F, (float)0.35F, (float)0.5F);
					GL11.glRotatef(180, 0F, 1F, 1F);
					GL11.glRotatef(180, 0F, 0F, 1F);
					GL11.glRotatef(-90, 0F, 0F, 1F);
					GL11.glRotatef(115, 1F, 0F, 0F);
					float Item1Scale = 1.4F;
					GL11.glScalef(Item1Scale, Item1Scale, Item1Scale);
					GL11.glDisable(GL11.GL_CULL_FACE);
					RenderManager.instance.renderEntityWithPosYaw(outputEntity, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
					GL11.glEnable(GL11.GL_CULL_FACE);					RenderItem.renderInFrame = false;
				}
				if(i == 5){
					GL11.glTranslatef((float)0.2F, (float)0.35F, (float)0.5F);
					GL11.glRotatef(180, 0F, 1F, 1F);
					GL11.glRotatef(180, 0F, 0F, 1F);
					GL11.glRotatef(90, 0F, 0F, 1F);
					GL11.glRotatef(115, 1F, 0F, 0F);
					float Item1Scale = 1.4F;
					GL11.glScalef(Item1Scale, Item1Scale, Item1Scale);
					GL11.glDisable(GL11.GL_CULL_FACE);
					RenderManager.instance.renderEntityWithPosYaw(outputEntity, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
					GL11.glEnable(GL11.GL_CULL_FACE);					RenderItem.renderInFrame = false;
				}
				GL11.glPopMatrix();

			}


		}
		GL11.glPushMatrix();
		GL11.glTranslatef(0f, 0f,0f);
		GL11.glTranslated((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(180, 0F, 0F, 1F);
		GL11.glRotatef((float)short1, 0.0F, 1.0F, 0.0F);
		GL11.glPushMatrix();
		this.bindTexture(texture);
		this.model.render(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
		/*GL11.glPopMatrix();
		GL11.glPushMatrix();
		pickaxeEntity.hoverStart = 0.0F;
		RenderItem.renderInFrame = true;
		GL11.glTranslatef((float)x + 0.8F, (float)y + 0.719F, (float)z + 0.65F);
		GL11.glRotatef(180, 0F, 1F, 1F);
		GL11.glScalef(0.8F, 0.8F, 0.8F);
		GL11.glRotatef((float)short1, 0.0F, 1.0F, 0.0F);
		RenderManager.instance.renderEntityWithPosYaw(pickaxeEntity, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
		RenderItem.renderInFrame = false;
		GL11.glPopMatrix();
		GL11.glPopMatrix();
		GL11.glPushMatrix();

		 */
	}



	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		renderTileEntityTanneryAt((TileEntityTannery)tileentity, x, y, z, f);
	}
}
