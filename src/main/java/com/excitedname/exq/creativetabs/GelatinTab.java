package com.excitedname.exq.creativetabs;

import com.excitedname.exq.gelatin.Gelatin;
import com.excitedname.exq.storage.Storage;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class GelatinTab extends CreativeTabs {

	public GelatinTab(int id, String label) {
		super(id, label);
	}

	@Override
	public Item getTabIconItem() {
		return Gelatin.GelatinJuiceHealing;
	}
	
	@Override
	public String getTranslatedTabLabel(){
		return this.getTabLabel();
	}

}
