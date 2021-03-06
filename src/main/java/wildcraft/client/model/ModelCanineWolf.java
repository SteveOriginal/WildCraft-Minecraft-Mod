package wildcraft.client.model;

import wildcraft.client.model.mowzie.*;
import wildcraft.entity.animal.EntityCanine;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;


public class ModelCanineWolf extends MowzieModelBase {
	public MowzieModelRenderer Body;
	public MowzieModelRenderer LeftHip;
	public MowzieModelRenderer RightHip;
	public MowzieModelRenderer LeftShoulder;
	public MowzieModelRenderer RightShoulder;
	public MowzieModelRenderer Mane;
	public MowzieModelRenderer Body2;
	public MowzieModelRenderer Neck1;
	public MowzieModelRenderer Neck2;
	public MowzieModelRenderer Head1;
	public MowzieModelRenderer HeadMane1;
	public MowzieModelRenderer EarLeft1;
	public MowzieModelRenderer EarRight1;
	public MowzieModelRenderer Snout1;
	public MowzieModelRenderer LowerJaw;
	public MowzieModelRenderer EyeLeft;
	public MowzieModelRenderer EyeRight;
	public MowzieModelRenderer HeadMane2;
	public MowzieModelRenderer HeadMane3;
	public MowzieModelRenderer EarLeft2;
	public MowzieModelRenderer EarRight2;
	public MowzieModelRenderer Nose;
	public MowzieModelRenderer Snout2;
	public MowzieModelRenderer Body3;
	public MowzieModelRenderer Tail1;
	public MowzieModelRenderer Tail2;
	public MowzieModelRenderer Tail3_a;
	public MowzieModelRenderer Tail4;
	public MowzieModelRenderer Tail3_b;
	public MowzieModelRenderer Tail5;
	public MowzieModelRenderer LeftBackLeg;
	public MowzieModelRenderer LeftBackFoot;
	public MowzieModelRenderer RightBackLeg;
	public MowzieModelRenderer RightBackFoot;
	public MowzieModelRenderer LeftFrontLeg;
	public MowzieModelRenderer LeftFrontFoot;
	public MowzieModelRenderer RightFrontLeg;
	public MowzieModelRenderer RightFrontFoot;

	public ModelCanineWolf() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.LeftFrontFoot = new MowzieModelRenderer(this, 54, 59);
		this.LeftFrontFoot.setRotationPoint(0.0F, 6.5F, 0.2F);
		this.LeftFrontFoot.addBox(-1.0F, -0.1F, -2.3F, 2, 2, 3);
		this.setRotateAngle(LeftFrontFoot, 0.23561944901923448F, 0.0F, 0.0F);
		this.EyeRight = new MowzieModelRenderer(this, 7, 56);
		this.EyeRight.setRotationPoint(1.7F, -1.7F, -3.1F);
		this.EyeRight.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1);
		this.RightShoulder = new MowzieModelRenderer(this, 19, 48);
		this.RightShoulder.setRotationPoint(-3.5F, 10.5F, -5.0F);
		this.RightShoulder.addBox(-2.0F, -1.0F, -1.5F, 2, 7, 3);
		this.setRotateAngle(RightShoulder, 0.3141592653589793F, 0.0F, 0.0F);
		this.LeftBackLeg = new MowzieModelRenderer(this, 48, 48);
		this.LeftBackLeg.setRotationPoint(1.0F, 5.4F, 0.0F);
		this.LeftBackLeg.addBox(-0.5F, 0.0F, -1.0F, 1, 7, 2);
		this.setRotateAngle(LeftBackLeg, 0.5410520681182421F, 0.0F, 0.0F);
		this.RightFrontFoot = new MowzieModelRenderer(this, 54, 59);
		this.RightFrontFoot.setRotationPoint(0.0F, 6.5F, 0.2F);
		this.RightFrontFoot.addBox(-1.0F, -0.1F, -2.3F, 2, 2, 3);
		this.setRotateAngle(RightFrontFoot, 0.23561944901923448F, 0.0F, 0.0F);
		this.HeadMane1 = new MowzieModelRenderer(this, 19, 34);
		this.HeadMane1.setRotationPoint(0.0F, 1.0F, 0.5F);
		this.HeadMane1.addBox(-3.4F, -2.7F, -2.8F, 7, 4, 3);
		this.setRotateAngle(HeadMane1, -0.06981317007977318F, 0.0F, 0.0F);
		this.Tail5 = new MowzieModelRenderer(this, 21, 29);
		this.Tail5.setRotationPoint(0.0F, 0.0F, 2.0F);
		this.Tail5.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2);
		this.setRotateAngle(Tail5, 0.18203784098300857F, 0.0F, 0.0F);
		this.Head1 = new MowzieModelRenderer(this, 44, 19);
		this.Head1.setRotationPoint(0.0F, -0.5F, -3.1F);
		this.Head1.addBox(-2.5F, -2.5F, -4.0F, 5, 5, 5);
		this.setRotateAngle(Head1, 0.7265805676052395F, 0.0F, 0.0F);
		this.EarRight2 = new MowzieModelRenderer(this, 60, 0);
		this.EarRight2.setRotationPoint(0.0F, -1.5F, 0.0F);
		this.EarRight2.addBox(-0.5F, -1.5F, -0.5F, 1, 1, 1);
		this.setRotateAngle(EarRight2, 0.07853981633974483F, 0.0F, 0.0F);
		this.RightFrontLeg = new MowzieModelRenderer(this, 30, 48);
		this.RightFrontLeg.setRotationPoint(-1.0F, 5.6F, 0.0F);
		this.RightFrontLeg.addBox(-0.5F, -0.3F, -1.0F, 1, 7, 2);
		this.setRotateAngle(RightFrontLeg, -0.5759586531581287F, 0.0F, 0.0F);
		this.LeftShoulder = new MowzieModelRenderer(this, 19, 48);
		this.LeftShoulder.setRotationPoint(3.5F, 10.5F, -5.0F);
		this.LeftShoulder.addBox(0.0F, -1.0F, -1.5F, 2, 7, 3);
		this.setRotateAngle(LeftShoulder, 0.3141592653589793F, 0.0F, 0.0F);
		this.Neck1 = new MowzieModelRenderer(this, 0, 36);
		this.Neck1.setRotationPoint(0.0F, -0.8F, -6.9F);
		this.Neck1.addBox(-2.5F, -3.0F, -3.0F, 5, 6, 4);
		this.setRotateAngle(Neck1, -0.36425021489121656F, 0.0F, 0.0F);
		this.Mane = new MowzieModelRenderer(this, 30, 0);
		this.Mane.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.Mane.addBox(-3.5F, -4.0F, -7.0F, 7, 7, 7);
		this.Body3 = new MowzieModelRenderer(this, 15, 16);
		this.Body3.setRotationPoint(0.0F, 0.0F, 0.4F);
		this.Body3.addBox(-2.0F, -2.0F, 0.2F, 4, 4, 1);
		this.setRotateAngle(Body3, -0.17453292519943295F, 0.0F, 0.0F);
		this.EyeLeft = new MowzieModelRenderer(this, 0, 56);
		this.EyeLeft.setRotationPoint(-1.7F, -1.7F, -3.1F);
		this.EyeLeft.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1);
		this.Body = new MowzieModelRenderer(this, 0, 0);
		this.Body.setRotationPoint(0.0F, 11.5F, 0.0F);
		this.Body.addBox(-3.0F, -3.0F, 0.0F, 6, 7, 9);
		this.Neck2 = new MowzieModelRenderer(this, 0, 47);
		this.Neck2.setRotationPoint(0.0F, 0.3F, -2.3F);
		this.Neck2.addBox(-2.0F, -3.0F, -4.0F, 4, 5, 4);
		this.setRotateAngle(Neck2, -0.3590142271352336F, 0.0F, 0.0F);
		this.LeftHip = new MowzieModelRenderer(this, 37, 48);
		this.LeftHip.setRotationPoint(3.0F, 10.5F, 6.0F);
		this.LeftHip.addBox(0.0F, -1.0F, -1.0F, 2, 7, 3);
		this.setRotateAngle(LeftHip, -0.3141592653589793F, 0.0F, 0.0F);
		this.Tail4 = new MowzieModelRenderer(this, 16, 23);
		this.Tail4.setRotationPoint(0.0F, 0.0F, 5.6F);
		this.Tail4.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2);
		this.setRotateAngle(Tail4, 0.18203784098300857F, 0.0F, 0.0F);
		this.RightBackLeg = new MowzieModelRenderer(this, 48, 48);
		this.RightBackLeg.setRotationPoint(-1.0F, 5.4F, 0.0F);
		this.RightBackLeg.addBox(-0.5F, 0.0F, -1.0F, 1, 7, 2);
		this.setRotateAngle(RightBackLeg, 0.5410520681182421F, 0.0F, 0.0F);
		this.EarRight1 = new MowzieModelRenderer(this, 52, 0);
		this.EarRight1.setRotationPoint(-1.7F, -1.9F, -1.8F);
		this.EarRight1.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 1);
		this.setRotateAngle(EarRight1, 0.27314402793711257F, 0.0F, -0.5009094953223726F);
		this.HeadMane3 = new MowzieModelRenderer(this, 41, 35);
		this.HeadMane3.setRotationPoint(0.0F, 1.3F, 0.2F);
		this.HeadMane3.addBox(-3.0F, 0.0F, -2.8F, 6, 1, 2);
		this.HeadMane2 = new MowzieModelRenderer(this, 34, 30);
		this.HeadMane2.setRotationPoint(0.0F, -0.5F, 0.5F);
		this.HeadMane2.addBox(-3.0F, -2.7F, -2.8F, 6, 1, 2);
		this.Tail1 = new MowzieModelRenderer(this, 25, 0);
		this.Tail1.setRotationPoint(0.0F, 0.0F, 1.0F);
		this.Tail1.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2);
		this.setRotateAngle(Tail1, -0.17453292519943295F, 0.0F, 0.0F);
		this.Nose = new MowzieModelRenderer(this, 14, 56);
		this.Nose.setRotationPoint(0.0F, -0.7F, -3.7F);
		this.Nose.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		this.Snout2 = new MowzieModelRenderer(this, 19, 42);
		this.Snout2.setRotationPoint(0.0F, -0.6F, -3.2F);
		this.Snout2.addBox(-1.0F, -0.4F, 0.0F, 2, 1, 4);
		this.setRotateAngle(Snout2, 0.22759093446006054F, 0.0F, 0.0F);
		this.Body2 = new MowzieModelRenderer(this, 0, 16);
		this.Body2.setRotationPoint(0.0F, 0.0F, 9.0F);
		this.Body2.addBox(-2.5F, -2.4F, -1.0F, 5, 6, 2);
		this.setRotateAngle(Body2, -0.27314402793711257F, 0.0F, 0.0F);
		this.RightHip = new MowzieModelRenderer(this, 37, 48);
		this.RightHip.setRotationPoint(-3.0F, 10.5F, 6.0F);
		this.RightHip.addBox(-2.0F, -1.0F, -1.0F, 2, 7, 3);
		this.setRotateAngle(RightHip, -0.3141592653589793F, 0.0F, 0.0F);
		this.EarLeft1 = new MowzieModelRenderer(this, 52, 0);
		this.EarLeft1.setRotationPoint(1.7F, -1.9F, -1.8F);
		this.EarLeft1.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 1);
		this.setRotateAngle(EarLeft1, 0.27314402793711257F, 0.0F, 0.5009094953223726F);
		this.LeftBackFoot = new MowzieModelRenderer(this, 54, 59);
		this.LeftBackFoot.setRotationPoint(0.0F, 6.8F, 0.1F);
		this.LeftBackFoot.addBox(-1.0F, -0.2F, -2.3F, 2, 2, 3);
		this.setRotateAngle(LeftBackFoot, -0.23212879051524585F, 0.0F, 0.0F);
		this.LeftFrontLeg = new MowzieModelRenderer(this, 30, 48);
		this.LeftFrontLeg.setRotationPoint(1.0F, 5.6F, 0.0F);
		this.LeftFrontLeg.addBox(-0.5F, -0.3F, -1.0F, 1, 7, 2);
		this.setRotateAngle(LeftFrontLeg, -0.5759586531581287F, 0.0F, 0.0F);
		this.Snout1 = new MowzieModelRenderer(this, 50, 39);
		this.Snout1.setRotationPoint(0.0F, 0.0F, -4.0F);
		this.Snout1.addBox(-1.5F, -1.0F, -4.0F, 3, 2, 4);
		this.Tail3_b = new MowzieModelRenderer(this, 0, 25);
		this.Tail3_b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Tail3_b.addBox(-1.999F, -2.0F, 0.0F, 4, 4, 6);
		this.RightBackFoot = new MowzieModelRenderer(this, 54, 59);
		this.RightBackFoot.setRotationPoint(0.0F, 6.8F, 0.1F);
		this.RightBackFoot.addBox(-1.0F, -0.2F, -2.3F, 2, 2, 3);
		this.setRotateAngle(RightBackFoot, -0.23212879051524585F, 0.0F, 0.0F);
		this.LowerJaw = new MowzieModelRenderer(this, 30, 24);
		this.LowerJaw.setRotationPoint(0.0F, 1.5F, -3.6F);
		this.LowerJaw.addBox(-1.0F, -0.5F, -4.0F, 2, 1, 4);
		this.EarLeft2 = new MowzieModelRenderer(this, 60, 0);
		this.EarLeft2.setRotationPoint(0.0F, -1.5F, 0.0F);
		this.EarLeft2.addBox(-0.5F, -1.5F, -0.5F, 1, 1, 1);
		this.setRotateAngle(EarLeft2, 0.07853981633974483F, 0.0F, 0.0F);
		this.Tail2 = new MowzieModelRenderer(this, 29, 15);
		this.Tail2.setRotationPoint(0.0F, 0.0F, 1.6F);
		this.Tail2.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4);
		this.setRotateAngle(Tail2, -0.18203784098300857F, 0.0F, 0.0F);
		this.Tail3_a = new MowzieModelRenderer(this, 0, 25);
		this.Tail3_a.setRotationPoint(0.0F, 0.0F, 3.6F);
		this.Tail3_a.addBox(-2.001F, -2.0F, 0.0F, 4, 4, 6);
		this.setRotateAngle(Tail3_a, 0.136659280431156F, 0.0F, 0.0F);

		this.Tail3_a.addChild(this.Tail3_b);
		this.RightBackLeg.addChild(this.RightBackFoot);
		this.Head1.addChild(this.LowerJaw);
		this.EarLeft1.addChild(this.EarLeft2);
		this.Tail1.addChild(this.Tail2);
		this.Tail2.addChild(this.Tail3_a);
		this.LeftShoulder.addChild(this.LeftFrontLeg);
		this.Head1.addChild(this.Snout1);
		this.LeftFrontLeg.addChild(this.LeftFrontFoot);
		this.Head1.addChild(this.EyeRight);
		this.LeftHip.addChild(this.LeftBackLeg);
		this.RightFrontLeg.addChild(this.RightFrontFoot);
		this.Head1.addChild(this.HeadMane1);
		this.Tail4.addChild(this.Tail5);
		this.Neck2.addChild(this.Head1);
		this.EarRight1.addChild(this.EarRight2);
		this.RightShoulder.addChild(this.RightFrontLeg);
		this.Mane.addChild(this.Neck1);
		this.Body.addChild(this.Mane);
		this.Body2.addChild(this.Body3);
		this.Head1.addChild(this.EyeLeft);
		this.Neck1.addChild(this.Neck2);
		this.Tail3_a.addChild(this.Tail4);
		this.RightHip.addChild(this.RightBackLeg);
		this.Head1.addChild(this.EarRight1);
		this.HeadMane2.addChild(this.HeadMane3);
		this.HeadMane1.addChild(this.HeadMane2);
		this.Body3.addChild(this.Tail1);
		this.Snout1.addChild(this.Nose);
		this.Snout1.addChild(this.Snout2);
		this.Body.addChild(this.Body2);
		this.Head1.addChild(this.EarLeft1);
		this.LeftBackLeg.addChild(this.LeftBackFoot);

		Body.setInitValuesToCurrentPose();
		LeftHip.setInitValuesToCurrentPose();
		RightHip.setInitValuesToCurrentPose();
		LeftShoulder.setInitValuesToCurrentPose();
		RightShoulder.setInitValuesToCurrentPose();
		Mane.setInitValuesToCurrentPose();
		Body2.setInitValuesToCurrentPose();
		Neck1.setInitValuesToCurrentPose();
		Neck2.setInitValuesToCurrentPose();
		Head1.setInitValuesToCurrentPose();
		HeadMane1.setInitValuesToCurrentPose();
		EarLeft1.setInitValuesToCurrentPose();
		EarRight1.setInitValuesToCurrentPose();
		Snout1.setInitValuesToCurrentPose();
		LowerJaw.setInitValuesToCurrentPose();
		EyeLeft.setInitValuesToCurrentPose();
		EyeRight.setInitValuesToCurrentPose();
		HeadMane2.setInitValuesToCurrentPose();
		HeadMane3.setInitValuesToCurrentPose();
		EarLeft2.setInitValuesToCurrentPose();
		EarRight2.setInitValuesToCurrentPose();
		Nose.setInitValuesToCurrentPose();
		Snout2.setInitValuesToCurrentPose();
		Body3.setInitValuesToCurrentPose();
		Tail1.setInitValuesToCurrentPose();
		Tail2.setInitValuesToCurrentPose();
		Tail3_a.setInitValuesToCurrentPose();
		Tail4.setInitValuesToCurrentPose();
		Tail3_b.setInitValuesToCurrentPose();
		Tail5.setInitValuesToCurrentPose();
		LeftBackLeg.setInitValuesToCurrentPose();
		LeftBackFoot.setInitValuesToCurrentPose();
		RightBackLeg.setInitValuesToCurrentPose();
		RightBackFoot.setInitValuesToCurrentPose();
		LeftFrontLeg.setInitValuesToCurrentPose();
		LeftFrontFoot.setInitValuesToCurrentPose();
		RightFrontLeg.setInitValuesToCurrentPose();
		RightFrontFoot.setInitValuesToCurrentPose();

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.RightShoulder.render(f5);
		this.LeftShoulder.render(f5);
		this.Body.render(f5);
		this.LeftHip.render(f5);
		this.RightHip.render(f5);
	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity){
		setAngles();
		EntityCanine mob = (EntityCanine) entity;
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		MowzieModelRenderer[] tail = {this.Body2, this.Body3, this.Tail1, this.Tail2, this.Tail3_a, this.Tail4, this.Tail5};
		faceTarget(Neck1, 24, f3, f4);
		faceTarget(Neck2, 18, f3, f4);
		faceTarget(Head1, 10, f3, f4);
		tailSwing(tail, 0.22F, -0.1F * f1, 2, f, 1);
		chainWave(tail, 0.05F, -0.05F, 2, mob.frame, 1F, 1);
		if(mob.isSitting()){
			this.setRotateAngle(LeftHip, -0.8196066167365371F, 0.0F, 0.0F);
			this.setRotateAngle(RightHip, -0.8196066167365371F, 0.0F, 0.0F);
			this.setRotateAngle(LeftBackFoot, -1.0927506446736497F, 0.0F, 0.0F);
			this.setRotateAngle(RightBackFoot, -1.0927506446736497F, 0.0F, 0.0F);
			this.setRotateAngle(LeftBackLeg, 1.9123572614101867F, 0.0F, 0.0F);
			this.setRotateAngle(RightBackLeg, 1.9123572614101867F, 0.0F, 0.0F);
			this.setRotateAngle(Tail1, 0.18203784098300857F, 0.0F, 0.0F);
			this.setRotateAngle(Tail5, 0.18203784098300857F, 0.0F, 0.0F);
			this.setRotateAngle(Mane, 0.08726646259971647F, 0.0F, 0.0F);
			this.setRotateAngle(Body2, -0.27314402793711257F, 0.0F, 0.0F);
			this.setRotateAngle(Tail4, 0.18203784098300857F, 0.0F, 0.0F);
			this.setRotateAngle(Neck2, 0.091106186954104F, 0.0F, 0.0F);
			this.setRotateAngle(Tail3_a, 0.136659280431156F, 0.0F, 0.0F);
			this.setRotateAngle(Tail2, 0.091106186954104F, 0.0F, 0.0F);
			this.setRotateAngle(Neck1, -0.18203784098300857F, 0.0F, 0.0F);
			this.setRotateAngle(Head1, 0.7265805676052395F, 0.0F, 0.0F);
			this.setRotateAngle(Body, -0.6373942428283291F, 0.0F, 0.0F);
			this.setRotateAngle(Body3, 0.17453292519943295F, 0.0F, 0.0F);
			this.setRotateAngle(LeftHip, 3, 15F, 4.3F);
			this.setRotateAngle(RightHip, -3, 15F, 4.3F);
			this.setRotateAngle(LeftBackLeg, 1F, 5F, 1F);
			this.setRotateAngle(RightBackLeg, -1F, 5F, 1F);


		}else{
			tailSwing(tail, 0.22F, -0.1F * f1, 2, f, 0);
			chainWave(tail, 0.44F, -0.3F, 2, f, f1, 1);
			walk(LeftHip,1F, 0.6F, false, 0F, 0.4F, f, f1,0);
			walk(LeftBackLeg, 1F, 0.5F, true, 1F, 0F, f, f1, 0);
			walk(LeftBackFoot,1F, 0.2F, true, 0.5F, 1F, f, f1, 0);
			walk(RightHip,1F, 0.6F, true, 0F, 0.4F, f, f1, 0);
			walk(RightBackLeg,1F, 0.5F, false, 1F, 0F, f, f1, 0);
			walk(RightBackFoot,1F, 0.2F, false, 0.5F, 1F, f, f1, 0);
			walk(LeftShoulder,1F, 0.5F, true, 0F, 0.4F, f, f1, 0);
			walk(LeftFrontLeg,1F, 0.7F, true, 1F, 0F, f, f1, 0);
			walk(LeftFrontFoot,1F, 0.2F, false, 0.5F, 1F, f, f1, 0);
			walk(RightShoulder,1F, 0.5F, false, 0F, 0.4F, f, f1, 0);
			walk(RightFrontLeg,1F, 0.7F, false, 1F, 0F, f, f1, 0);
			walk(RightFrontFoot,1F, 0.2F, true, 0.5F, 1F, f, f1, 0);
		}

	}
	public void setAngles(){
		Body.setCurrentPoseToInitValues();
		LeftHip.setCurrentPoseToInitValues();
		RightHip.setCurrentPoseToInitValues();
		LeftShoulder.setCurrentPoseToInitValues();
		RightShoulder.setCurrentPoseToInitValues();
		Mane.setCurrentPoseToInitValues();
		Body2.setCurrentPoseToInitValues();
		Neck1.setCurrentPoseToInitValues();
		Neck2.setCurrentPoseToInitValues();
		Head1.setCurrentPoseToInitValues();
		HeadMane1.setCurrentPoseToInitValues();
		EarLeft1.setCurrentPoseToInitValues();
		EarRight1.setCurrentPoseToInitValues();
		Snout1.setCurrentPoseToInitValues();
		LowerJaw.setCurrentPoseToInitValues();
		EyeLeft.setCurrentPoseToInitValues();
		EyeRight.setCurrentPoseToInitValues();
		HeadMane2.setCurrentPoseToInitValues();
		HeadMane3.setCurrentPoseToInitValues();
		EarLeft2.setCurrentPoseToInitValues();
		EarRight2.setCurrentPoseToInitValues();
		Nose.setCurrentPoseToInitValues();
		Snout2.setCurrentPoseToInitValues();
		Body3.setCurrentPoseToInitValues();
		Tail1.setCurrentPoseToInitValues();
		Tail2.setCurrentPoseToInitValues();
		Tail3_a.setCurrentPoseToInitValues();
		Tail4.setCurrentPoseToInitValues();
		Tail3_b.setCurrentPoseToInitValues();
		Tail5.setCurrentPoseToInitValues();
		LeftBackLeg.setCurrentPoseToInitValues();
		LeftBackFoot.setCurrentPoseToInitValues();
		RightBackLeg.setCurrentPoseToInitValues();
		RightBackFoot.setCurrentPoseToInitValues();
		LeftFrontLeg.setCurrentPoseToInitValues();
		LeftFrontFoot.setCurrentPoseToInitValues();
		RightFrontLeg.setCurrentPoseToInitValues();
		RightFrontFoot.setCurrentPoseToInitValues();

	}
	public void setRotateAngle(MowzieModelRenderer MowzieModelRenderer, float x, float y, float z) {
		MowzieModelRenderer.rotateAngleX = x;
		MowzieModelRenderer.rotateAngleY = y;
		MowzieModelRenderer.rotateAngleZ = z;
	}
}
