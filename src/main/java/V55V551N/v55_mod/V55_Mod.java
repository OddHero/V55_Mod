package V55V551N.v55_mod;

import V55V551N.v55_mod.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "V55_Mod", name = "V55 Mod", version = "1.7.10-0.1")
public class V55_Mod {

    @Mod.Instance("V55_Mod")
    public static V55_Mod instance;

    @SidedProxy(clientSide = "V55V551N.v55_mod.proxy.ClientProxy", serverSide = "V55V551N.v55_mod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
