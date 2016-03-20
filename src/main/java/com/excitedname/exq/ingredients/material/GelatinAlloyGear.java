package com.excitedname.exq.ingredients.material;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class GelatinAlloyGear extends Item {

	public GelatinAlloyGear(){
		
		this.setUnlocalizedName("Gelatin Alloy Gear");
		this.setTextureName("Gelatin Alloy Gear");
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
