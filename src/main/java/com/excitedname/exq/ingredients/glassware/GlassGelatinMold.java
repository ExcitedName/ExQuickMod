package com.excitedname.exq.ingredients.glassware;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GlassGelatinMold extends Item {

	public GlassGelatinMold(){
		
		this.setUnlocalizedName("Glass Gelatin Mold");
		this.setTextureName("Glass Gelatin Mold");
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
