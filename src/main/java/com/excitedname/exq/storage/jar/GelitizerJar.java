package com.excitedname.exq.storage.jar;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ingredients.Ingredients;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class GelitizerJar extends Item {

	public GelitizerJar(){
		
		this.setUnlocalizedName("Gelitizer Jar");
		this.setTextureName("Gelitizer Jar");
		this.setCreativeTab(Tabs.StorageTab);	
		this.setContainerItem(Ingredients.GlassJar);
	}
	
//Texture Icon
	
	@Override
	@SideOnly(Side.CLIENT)
	
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
