package me.mrdj.noendermanpickup.core;

import me.mrdj.noendermanpickup.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 *
 * @author Dj
 */
@Mod(modid = NoEndermanPickup.MODID, name = NoEndermanPickup.NAME, version = NoEndermanPickup.VERSION, acceptableRemoteVersions = "*", acceptedMinecraftVersions = "*") 
public class NoEndermanPickup 
{
    public static CommonProxy proxy = new CommonProxy();
    public static final String MODID = "noendermanpickup";
    public static final String NAME = "No Enderman Pickup";
    public static final String VERSION = "1.1";  
    
    @EventHandler
    void preInit( FMLPreInitializationEvent event )
    {
        proxy.preInit(event);
    }
    
    @EventHandler
    void init( FMLInitializationEvent event )
    {
        proxy.init(event);
    }
    
    @EventHandler
    void postInit( FMLPostInitializationEvent event )
    {
        proxy.postInit(event);
    }
}
