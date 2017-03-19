package com.jtsfour.oilcraft.block;

import java.lang.reflect.InvocationTargetException;

import javax.annotation.Nullable;

import com.jtsfour.oilcraft.OilCraft;
import com.jtsfour.oilcraft.item.OilCraftItemBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OilCraftBlock extends Block {
	
	private OilCraftItemBlock ITEM_BLOCK;
	
	private String NAME;
	private boolean ITEMB;
	private boolean FLAG=true;

	public OilCraftBlock(Material materialIn, String name) {
		super(materialIn);
		NAME=name;
		ITEMB=false;
		ITEM_BLOCK=null;
		setUnlocalizedName(OilCraft.MODID+"_"+NAME);
		setRegistryName(OilCraft.MODID+"_"+NAME);
	}
	
	public OilCraftBlock(Material materialIn, String name, Class<? extends OilCraftItemBlock> itemclass){
		super(materialIn);
		NAME=name;
		ITEMB=true;
		setUnlocalizedName(OilCraft.MODID+"_"+NAME);
		setRegistryName(OilCraft.MODID+"_"+NAME);
		try {
			ITEM_BLOCK = itemclass.getConstructor(OilCraftBlock.class).newInstance(this);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			System.out.println("ERROR OilCraft "+itemclass.getName()+" does not have a valid contructor for use");
		}
	}
	
	public String getName(){
		return NAME;
	}
	
	public boolean hasItemBlock(){
		return ITEMB;
	}
	
	@Nullable
	public OilCraftItemBlock getItemBlock(){
		if(hasItemBlock()){
			return ITEM_BLOCK;
		}else{
			return null;
		}
	}
	
	public void registerBlock(){
		if(FLAG){
			if(!hasItemBlock()){
				GameRegistry.register(this);
			}else{
				GameRegistry.register(this);
				ITEM_BLOCK.registerItemBlock();
			}
				
		}
		FLAG=false;
	}
	
	public void registerModels(){
		if(OilCraft.ISCLIENT){
			if(!hasItemBlock()){
				ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(OilCraft.MODID+":"+getRegistryName(),"inventory"));
			}else{
				ITEM_BLOCK.registerModels();
			}
		}else{
			System.out.println("ERROR OilCraftBlock#registerModels called from server !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}
	

}
