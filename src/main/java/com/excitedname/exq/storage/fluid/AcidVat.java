package com.excitedname.exq.storage.fluid;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;
import com.excitedname.exq.storage.Storage;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class AcidVat extends Item {

	public AcidVat(){
		
		this.setUnlocalizedName("Acid Vat");
		this.setTextureName("Acid Vat");
		this.setCreativeTab(Tabs.StorageTab);
		this.setContainerItem(Storage.TheVat);
	}
	
//Texture Icon
	
	@Override
	@SideOnly(Side.CLIENT)
	
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
