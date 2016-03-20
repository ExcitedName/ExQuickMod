package com.excitedname.exq.creativetabs;

import com.excitedname.exq.storage.Storage;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class StorageTab extends CreativeTabs {

	public StorageTab(int id, String label) {
		super(id, label);
	}

	@Override
	public Item getTabIconItem() {
		return Storage.GelatinBarrel;
	}
	
	@Override
	public String getTranslatedTabLabel(){
		return this.getTabLabel();
	}

}
