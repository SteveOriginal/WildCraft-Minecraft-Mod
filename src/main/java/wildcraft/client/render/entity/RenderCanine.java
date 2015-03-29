package wildcraft.client.render.entity;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import wildcraft.client.model.ModelCanineWolf;
import wildcraft.entity.animal.EntityCanine;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderCanine
extends RenderLiving
{
	private static final ResourceLocation texture_wolf_brown_male = new ResourceLocation("wildcraft:textures/model/dog/wolf_brown_male.png");

	public RenderCanine()
	{
		super(new ModelCanineWolf(), 0.3F);
	}
	@Override
	protected void preRenderCallback(EntityLivingBase mob, float par2) {
		preRenderScale((EntityCanine)mob, par2);
	}
	protected void preRenderScale(EntityCanine entity, float par2)
	{
		GL11.glScalef(entity.getAnimalSize(), entity.getAnimalSize(), entity.getAnimalSize());
	}

	protected ResourceLocation getEntityTextures(EntityCanine mob)
	{ 
		return texture_wolf_brown_male;

	}

	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return getEntityTextures((EntityCanine)entity);
	}
}
