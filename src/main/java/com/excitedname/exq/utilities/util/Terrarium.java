package com.excitedname.exq.utilities.util;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Terrarium extends Item {

	public Terrarium(){
		
		this.setUnlocalizedName("Terrarium");
		this.setTextureName("Terrarium");
		this.setCreativeTab(Tabs.UtilTab);	
		this.setMaxStackSize(1);
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
		return false;
	}
	
	public boolean hasContainerItem(){
		return true;
	}  
	
	public ItemStack getContainerItem(ItemStack itemStack){
		itemStack.attemptDamageItem(0, itemRand);
		
       return itemStack;
   	}
	
//Texture Icon
	
	@Override
	@SideOnly(Side.CLIENT)
	
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
