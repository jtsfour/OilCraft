package com.jtsfour.oilcraft;

import com.jtsfour.oilcraft.block.OilCraftBlockHandler;

public class OilCraftCommonProxy {
	
	public OilCraftCommonProxy(){
		
	}
	
	public void preInit(){
		OilCraftBlockHandler.preInit();
	}
	
	public void init(){
		OilCraftBlockHandler.init();
	}
	
	public void postInit(){
		
	}
}
