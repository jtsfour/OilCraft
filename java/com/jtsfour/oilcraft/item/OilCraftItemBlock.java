package com.jtsfour.oilcraft.item;

import com.jtsfour.oilcraft.OilCraft;
import com.jtsfour.oilcraft.block.OilCraftBlock;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OilCraftItemBlock extends ItemBlock {
	
	public String NAME;
	
	public OilCraftItemBlock(OilCraftBlock block){
		super(block);
		NAME=block.getName();
		setUnlocalizedName(OilCraft.MODID+"_"+NAME);
		setRegistryName(OilCraft.MODID+"_"+NAME);
	}

	public void registerItemBlock() {
		GameRegistry.register(this);
	}
	
	public void registerModels(){
		if(OilCraft.ISCLIENT){
			ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(OilCraft.MODID+":"+getRegistryName(),"inventory"));
		}else{
			System.out.println("ERROR OilCraftItemBlock#registerModels called from server !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}

}
