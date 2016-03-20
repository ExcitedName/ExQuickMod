package com.excitedname.exq.storage.fluid;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class PurifiedCollagenSolutionJar extends Item {

	public PurifiedCollagenSolutionJar(){
		
		this.setUnlocalizedName("Purified Collagen Solution Jar");
		this.setTextureName("Purified Collagen Solution Jar");
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
