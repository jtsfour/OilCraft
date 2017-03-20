package com.jtsfour.oilcraft.item;

import java.util.ArrayList;

public class OilCraftItemHandler {
	
	private static ArrayList<OilCraftItem> items = new ArrayList<OilCraftItem>();
	
	
	
	public static void preInit(){
		
	}
	
	public static void init(){
		for(int i=0;i<items.size();i++){
			items.get(i).registerItem();
		}
	}
	
	private static void addItem(OilCraftItem item){
		items.add(item);
	}
	
	public static final ArrayList<OilCraftItem> getItems(){
		return items;
	}

}
