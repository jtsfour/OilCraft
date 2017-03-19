package com.jtsfour.oilcraft.client.render;

import java.util.ArrayList;

import com.jtsfour.oilcraft.block.OilCraftBlock;
import com.jtsfour.oilcraft.block.OilCraftBlockHandler;

public class OilCraftRenderHandler {
	
	public static void registerBlockModels(){
		ArrayList<OilCraftBlock> blocks = OilCraftBlockHandler.getBlocks();
		for(int i=0;i<blocks.size();i++){
			blocks.get(i).registerModels();
		}
	}
}
