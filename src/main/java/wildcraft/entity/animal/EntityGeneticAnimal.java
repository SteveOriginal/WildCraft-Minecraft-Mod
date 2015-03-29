package wildcraft.entity.animal;

import java.util.Random;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityGeneticAnimal extends EntityTameable {

	protected int animID;
	protected int animTick;
	public float frame;
	public float minSize;
	public float maxSize;
	public int adultAge;
	public int maxAge;

	public EntityGeneticAnimal(World world) {
		super(world);

		animID = 0;
		animTick = 0;

	}
	protected void entityInit(){
		super.entityInit();
		this.dataWatcher.addObject(27, Byte.valueOf((byte)0));
		this.dataWatcher.addObject(28, Byte.valueOf((byte)0));
		this.dataWatcher.addObject(29, Byte.valueOf((byte)0));
		this.dataWatcher.addObject(30, Byte.valueOf((byte)0));
	}

	public void writeEntityToNBT(NBTTagCompound tag)
	{
		super.writeEntityToNBT(tag);
		tag.setInteger("Gender", getGender());
		tag.setInteger("AnimalAge", getAnimalAge());
		tag.setInteger("Breed", getBreed());
		tag.setInteger("GeneticVariation", getGeneticVariation());
	}
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		if (this.animID != 0) this.animTick++;
		this.frame++;
	}
	public void readEntityFromNBT(NBTTagCompound tag)
	{
		super.readEntityFromNBT(tag);
		setGender(tag.getInteger("Gender"));
		setAnimalAge(tag.getInteger("AnimalAge"));
		setBreed(tag.getInteger("Breed"));
		setGeneticVariation(tag.getInteger("GeneticVariation"));

	}
	@Override
	public void setScaleForAge(boolean par1) {
		this.setScale(getAnimalSize());
	}
	/**Called when Entity is Spawned with Egg. Only for replacing mobs*/
	public void onSpawn(){
		this.setAnimalAge(adultAge);
	}
	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData par1EntityLivingData) {
		par1EntityLivingData = super.onSpawnWithEgg(par1EntityLivingData);
		this.setAnimalAge(adultAge);
		return par1EntityLivingData;
	}
	public float getAnimalSize() {
		float step;
		step = (maxSize - minSize) / (adultAge + 1);

		if (getAnimalAge() > adultAge) {
			return minSize + (step * adultAge);
		}

		return minSize + (step * getAnimalAge());
	}
	public boolean isChild() {
		return  getAnimalAge() < adultAge;
	}
	/**returns and integer for the mobs gender. 0 = female, 1 = male*/
	public int getGender()
	{
		return this.dataWatcher.getWatchableObjectByte(27);
	}
	/**returns and integer for the mobs gender. 0 = female, 1 = male*/
	public void setGender(int i)
	{
		this.dataWatcher.updateObject(27, Byte.valueOf((byte)i));
	}
	/**returns and integer for the mobs breed/kind.*/
	public int getBreed()
	{
		return this.dataWatcher.getWatchableObjectByte(28);
	}
	/**returns and integer for the mobs breed/kind.*/
	public void setBreed(int i)
	{
		this.dataWatcher.updateObject(28, Byte.valueOf((byte)i));
	}
	/**returns and integer for the mobs breed/kind.*/
	public int getGeneticVariation()
	{
		return this.dataWatcher.getWatchableObjectByte(29);
	}
	/**returns and integer for the mobs breed/kind.*/
	public void setGeneticVariation(int i)
	{
		this.dataWatcher.updateObject(29, Byte.valueOf((byte)i));
	}
	/**returns and integer for the mobs age.*/
	public int getAnimalAge()
	{
		return this.dataWatcher.getWatchableObjectByte(30);
	}
	/**returns and integer for the mobs age.*/
	public void setAnimalAge(int i)
	{
		this.dataWatcher.updateObject(30, Byte.valueOf((byte)i));
	}
	public boolean increaseAnimalAge() {
		if (getAnimalAge() < maxAge) {
			setAnimalAge(getAnimalAge() + 1);
			return true;
		}

		return false;
	}
	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}
}
