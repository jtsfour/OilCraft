package com.jtsfour.oilcraft.client.render;

import java.util.ArrayList;

import com.jtsfour.oilcraft.block.OilCraftBlock;
import com.jtsfour.oilcraft.block.OilCraftBlockHandler;
import com.jtsfour.oilcraft.item.OilCraftItem;
import com.jtsfour.oilcraft.item.OilCraftItemHandler;

public class OilCraftRenderHandler {
	
	public static void registerBlockModels(){
		ArrayList<OilCraftBlock> blocks = OilCraftBlockHandler.getBlocks();
		for(int i=0;i<blocks.size();i++){
			blocks.get(i).registerModels();
		}
	}
	
	public static void registerItemModels(){
		ArrayList<OilCraftItem> items = OilCraftItemHandler.getItems();
		for(int i=0;i<items.size();i++){
			items.get(i).registerModels();
		}
	}
}
