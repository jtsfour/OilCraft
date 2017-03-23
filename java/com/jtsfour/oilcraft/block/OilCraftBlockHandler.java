package com.jtsfour.oilcraft.block;

import java.util.ArrayList;

import com.jtsfour.oilcraft.tileentity.SeismicWaveGenEntity;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OilCraftBlockHandler {
	
	private static ArrayList<OilCraftBlock> blocks = new ArrayList<OilCraftBlock>();
	
	public final static CreativeTabs OilCraftTab = new CreativeTabs("oilcraft_tab"){
		public Item getTabIconItem() {
			return Items.REDSTONE;
		}
   	
	};
	
	//make static block objects here
	public static OilCraftBlock seismicwavegen;
	public static void preInit(){
		//define block objects here
		seismicwavegen = new SeismicWaveGenBlock();
		//add blocks using addBlock()
		addBlock(seismicwavegen);
	}
	
	public static void init(){
		for(int i=0;i<blocks.size();i++){
			blocks.get(i).registerBlock();
		}
		
		//register tile entities
		GameRegistry.registerTileEntity(SeismicWaveGenEntity.class, "oilcraft:seismicwavegenentity");
	}
	
	private static void addBlock(OilCraftBlock block){
			blocks.add(block);
	}
	
	public final static ArrayList<OilCraftBlock> getBlocks(){
		return blocks;
	}

}
