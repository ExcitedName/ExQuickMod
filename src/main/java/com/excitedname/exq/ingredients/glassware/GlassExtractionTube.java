package com.excitedname.exq.ingredients.glassware;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class GlassExtractionTube extends Item {

	public GlassExtractionTube(){
		
		this.setUnlocalizedName("Glass Extraction Tube");
		this.setTextureName("Glass Extraction Tube");
		this.setCreativeTab(Tabs.IngTab);		
	}
	
//Texture Icon
	
	@Override
	@SideOnly(Side.CLIENT)
	
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
