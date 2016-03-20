package com.excitedname.exq.creativetabs;

import com.excitedname.exq.utilities.Utilities;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class UtilTab extends CreativeTabs {

	public UtilTab(int id, String label) {
		super(id, label);
	}

	@Override
	public Item getTabIconItem() {
		return Utilities.GChamberT3;
	}
	
	@Override
	public String getTranslatedTabLabel(){
		return this.getTabLabel();
	}
}
	
