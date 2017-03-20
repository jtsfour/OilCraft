package com.jtsfour.oilcraft.item;

import com.jtsfour.oilcraft.OilCraft;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OilCraftItem extends Item {
	
	
	private String NAME;
	
	public OilCraftItem(String name) {
		super();
		NAME=name;
		setUnlocalizedName(OilCraft.MODID+"_"+NAME);
		setRegistryName(OilCraft.MODID+"_"+NAME);
	}
	
	public void registerItem(){
		GameRegistry.register(this);
	}
	
	public void registerModels(){
		if(OilCraft.ISCLIENT){
			ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(OilCraft.MODID+":"+getRegistryName(),"inventory"));
		}else{
			System.out.println("ERROR OilCraftItem#registerModels called from server !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}
}
