package com.excitedname.exq.storage.fluid;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ingredients.Ingredients;
import com.excitedname.exq.ref.Ref;
import com.excitedname.exq.utilities.Utilities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class H2OCoolVat extends Item {

	public H2OCoolVat(){
		
		this.setUnlocalizedName("Dihydrogen Monoxide Vat(Cool)");
		this.setTextureName("Dihydrogen Monoxide Vat(Cool)");
		this.setCreativeTab(Tabs.StorageTab);
		this.setContainerItem(Utilities.TheVat);
	}
	
//Texture Icon
	
	@Override
	@SideOnly(Side.CLIENT)
	
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}