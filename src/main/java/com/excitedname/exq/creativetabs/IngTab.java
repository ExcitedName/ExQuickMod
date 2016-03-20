package com.excitedname.exq.creativetabs;

import com.excitedname.exq.ingredients.Ingredients;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class IngTab extends CreativeTabs {
	
	public IngTab(int id, String label) {
		super(id, label);
	}

	@Override
	public Item getTabIconItem() {
		return Ingredients.DiamondShard;
	}
	
	@Override
	public String getTranslatedTabLabel(){
		return this.getTabLabel();
	}

}


