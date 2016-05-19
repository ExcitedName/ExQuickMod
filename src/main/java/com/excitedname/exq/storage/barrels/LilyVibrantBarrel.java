package com.excitedname.exq.storage.barrels;

import com.excitedname.exq.ref.Ref;
import com.excitedname.exq.storage.Storage;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LilyVibrantBarrel extends Item {

	public LilyVibrantBarrel(){
		
		this.setUnlocalizedName("Lily Vibrant Barrel");
		this.setTextureName("Lily Vibrant Barrel");
		this.setContainerItem(Storage.Barrel);
	}
	
	public boolean hasEffect(ItemStack par1GelatinCrystal, int pass){
		return true;
	}
	
//Texture Icon
	
	@Override
	@SideOnly(Side.CLIENT)
	
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}