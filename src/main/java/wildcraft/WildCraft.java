package wildcraft;

import wildcraft.core.ModBlocks;
import wildcraft.core.ModItems;
import wildcraft.core.ModRecipes;
import wildcraft.entity.animal.EntityCanine;
import wildcraft.event.EventLiving;
import wildcraft.misc.CreativeTabWild;
import wildcraft.misc.EntityHandler;
import wildcraft.misc.GUIHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = WildCraft.MODID, version = WildCraft.VERSION)
public class WildCraft
{

	public static final String MODID = "wildcraft";
	public static final String VERSION = "Pre-Release";
	public static CreativeTabs tab;

	@Instance(MODID)
	public static WildCraft instance;

	@SidedProxy(clientSide = "wildcraft.ProxyClient", serverSide = "wildcraft.ProxyCommon")
	public static ProxyCommon proxy;
	public static final int guiId_tannery = 0;

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		tab = new CreativeTabWild(CreativeTabs.getNextID(), MODID);
		ModBlocks.init();
		ModItems.init();
		ModRecipes.init();
		MinecraftForge.EVENT_BUS.register(new EventLiving());
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GUIHandler());

		proxy.render();	
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	}
}

