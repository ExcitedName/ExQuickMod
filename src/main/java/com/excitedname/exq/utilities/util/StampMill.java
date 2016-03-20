package com.excitedname.exq.utilities.util;

import java.util.List;
import java.util.Random;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class StampMill extends Item {
	
	
	public StampMill(){
		
		this.setUnlocalizedName("Stamp Mill");
		this.setTextureName("Stamp Mill");
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
