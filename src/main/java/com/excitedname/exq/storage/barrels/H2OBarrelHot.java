package com.excitedname.exq.storage.barrels;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class H2OBarrelHot extends Item {

	public H2OBarrelHot(){
		
		this.setUnlocalizedName("Dihydrogen Monoxide Barrel(Hot)");
		this.setTextureName("Dihydrogen Monoxide Barrel(Hot)");
		this.setCreativeTab(Tabs.StorageTab);		
	}
	
//Texture Icon
	
	@Override
	@SideOnly(Side.CLIENT)
	
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
