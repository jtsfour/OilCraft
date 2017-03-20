package com.jtsfour.oilcraft.client;

import com.jtsfour.oilcraft.OilCraftCommonProxy;
import com.jtsfour.oilcraft.client.render.OilCraftRenderHandler;

public class OilCraftClientProxy extends OilCraftCommonProxy {
	
	
	@Override
	public void preInit(){
		super.preInit();
		OilCraftRenderHandler.registerBlockModels();
		OilCraftRenderHandler.registerItemModels();
	}
	
	@Override
	public void init(){
		super.init();
	}
	
	@Override
	public void postInit(){
		super.postInit();
	}
}
