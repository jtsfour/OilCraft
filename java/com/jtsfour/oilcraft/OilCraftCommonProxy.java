package com.jtsfour.oilcraft;

import com.jtsfour.oilcraft.block.OilCraftBlockHandler;
import com.jtsfour.oilcraft.item.OilCraftItemHandler;

import net.minecraftforge.oredict.OreDictionary;

public class OilCraftCommonProxy {
	
	public OilCraftCommonProxy(){
		
	}
	
	public void preInit(){
		OilCraftBlockHandler.preInit();
		OilCraftItemHandler.preInit();
	}
	
	public void init(){
		OilCraftBlockHandler.init();
		OilCraftItemHandler.init();
	}
	
	public void postInit(){
		//random debug
		String[] names = OreDictionary.getOreNames();
		for(int i=0;i>-1;i++){
			try{
				System.out.println(names[i]);
			}catch(Exception e){
				break;
			}
		}
	}
}
