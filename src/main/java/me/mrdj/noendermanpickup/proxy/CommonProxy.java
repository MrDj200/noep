package me.mrdj.noendermanpickup.proxy;

import me.mrdj.noendermanpickup.events.EventHandler;
import me.mrdj.noendermanpickup.utils.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespacedDefaultedByKey;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 *
 * @author Dj
 */
@Mod.EventBusSubscriber
public class CommonProxy 
{
    public void preInit(FMLPreInitializationEvent event) 
    {
    }
    
    public void init(FMLInitializationEvent event) 
    {
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }
    
    public void postInit(FMLPostInitializationEvent event) 
    {
        RegistryNamespacedDefaultedByKey<ResourceLocation, Block> test = Block.REGISTRY;
        for (Block b : test)
        {
            EntityEnderman.setCarriable(b, false);
            LogHelper.info("Disabled Enderman Pickup of Block: " + b.getLocalizedName());
        }
    }
}