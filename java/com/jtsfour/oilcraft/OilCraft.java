package com.jtsfour.oilcraft;

import com.jtsfour.oilcraft.client.OilCraftClientProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = OilCraft.MODID, version = OilCraft.VERSION)
public class OilCraft
{
    public static final String MODID = "oilcraft";
    public static final String VERSION = "1.0";
    
    public static boolean ISCLIENT = false;
    
    @SidedProxy(clientSide = "com.jtsfour.oilcraft.client.OilCraftClientProxy",serverSide = "com.jtsfour.oilcraft.OilCraftCommonProxy")
    public static OilCraftCommonProxy proxy;
    
    @Mod.Instance("oilcraft")
    public static OilCraft instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	if(proxy instanceof OilCraftClientProxy){
    		ISCLIENT=true;
    	}
        proxy.preInit();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit();
    }
}
