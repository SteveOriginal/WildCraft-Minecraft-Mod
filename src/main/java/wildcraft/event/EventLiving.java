package wildcraft.event;

import wildcraft.entity.animal.EntityCanine;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;

public class EventLiving {

	@SubscribeEvent
	public void onEntityJoinWorld(EntityJoinWorldEvent event){
		if(event.entity instanceof EntityWolf){
			EntityCanine newMob = new EntityCanine(event.world);
			if(!event.world.isRemote){
			newMob.setLocationAndAngles(event.entity.posX, event.entity.posY, event.entity.posZ, event.entity.rotationYaw, event.entity.rotationPitch);
			newMob.onSpawn();
			event.world.spawnEntityInWorld(newMob);
			}
			event.entity.setDead();

		}
		
	}


}
