
package wildcraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTannery extends ModelBase
{
  //fields
    ModelRenderer Bottom;
    ModelRenderer Top;
    ModelRenderer BackSupportRight;
    ModelRenderer FrontSupportRight;
    ModelRenderer BackSupportLeft;
    ModelRenderer FrontSupportLeft;
    ModelRenderer Middle;
  
  public ModelTannery()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Bottom = new ModelRenderer(this, 0, 0);
      Bottom.addBox(-7F, -3F, -7F, 14, 3, 14);
      Bottom.setRotationPoint(0F, 24F, 0F);
      Bottom.setTextureSize(64, 64);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 17);
      Top.addBox(-6.5F, -2F, -1F, 13, 2, 2);
      Top.setRotationPoint(0F, 10.3F, 0F);
      Top.setTextureSize(64, 64);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      BackSupportRight = new ModelRenderer(this, 6, 21);
      BackSupportRight.addBox(-1F, -13.6F, -0.2F, 2, 14, 1);
      BackSupportRight.setRotationPoint(-5F, 21F, 5.8F);
      BackSupportRight.setTextureSize(64, 64);
      BackSupportRight.mirror = true;
      setRotation(BackSupportRight, 0.4363323F, 0F, 0F);
      FrontSupportRight = new ModelRenderer(this, 12, 21);
      FrontSupportRight.addBox(-1F, -13.6F, -0.8F, 2, 14, 1);
      FrontSupportRight.setRotationPoint(-5F, 21F, -5.8F);
      FrontSupportRight.setTextureSize(64, 64);
      FrontSupportRight.mirror = true;
      setRotation(FrontSupportRight, -0.4363323F, 0F, 0F);
      BackSupportLeft = new ModelRenderer(this, 0, 21);
      BackSupportLeft.addBox(-1F, -13.6F, -0.2F, 2, 14, 1);
      BackSupportLeft.setRotationPoint(5F, 21F, 5.8F);
      BackSupportLeft.setTextureSize(64, 64);
      BackSupportLeft.mirror = true;
      setRotation(BackSupportLeft, 0.4363323F, 0F, 0F);
      FrontSupportLeft = new ModelRenderer(this, 18, 21);
      FrontSupportLeft.addBox(-1F, -13.6F, -0.8F, 2, 14, 1);
      FrontSupportLeft.setRotationPoint(5F, 21F, -5.8F);
      FrontSupportLeft.setTextureSize(64, 64);
      FrontSupportLeft.mirror = true;
      setRotation(FrontSupportLeft, -0.4363323F, 0F, 0F);
      Middle = new ModelRenderer(this, 24, 21);
      Middle.addBox(-3F, -4F, -3F, 6, 4, 6);
      Middle.setRotationPoint(0F, 21F, 0F);
      Middle.setTextureSize(64, 64);
      Middle.mirror = true;
      setRotation(Middle, 0F, 0F, 0F);
  }
  
  public void render(float f5)
  {
    Bottom.render(f5);
    Top.render(f5);
    BackSupportRight.render(f5);
    FrontSupportRight.render(f5);
    BackSupportLeft.render(f5);
    FrontSupportLeft.render(f5);
    Middle.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
 
}
