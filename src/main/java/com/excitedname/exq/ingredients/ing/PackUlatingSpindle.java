package com.excitedname.exq.ingredients.ing;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class PackUlatingSpindle extends Item {

	public PackUlatingSpindle(){
		
		this.setUnlocalizedName("Pack-U-Lating Spindle");
		this.setTextureName("Pack-U-Lating Spindle");
		this.setCreativeTab(Tabs.IngTab);
		this.setFull3D();
	}
	
//Texture Icon
	
	@Override
	@SideOnly(Side.CLIENT)
	
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
