package com.jtsfour.oilcraft.block;

import java.util.ArrayList;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OilCraftBlockHandler {
	
	private static ArrayList<OilCraftBlock> blocks = new ArrayList<OilCraftBlock>();
	
	public final static CreativeTabs DWCoreTab = new CreativeTabs("oilcraft_tab"){
		public Item getTabIconItem() {
			return Items.REDSTONE;
		}
   	
	};
	
	//make static block objects here
	public static void preInit(){
		//define block objects here
		//add blocks using addBlock()
	}
	
	public static void init(){
		for(int i=0;i<blocks.size();i++){
			blocks.get(i).registerBlock();
		}
	}
	
	private static void addBlock(OilCraftBlock block){
			blocks.add(block);
	}
	
	public static ArrayList<OilCraftBlock> getBlocks(){
		return blocks;
	}

}
