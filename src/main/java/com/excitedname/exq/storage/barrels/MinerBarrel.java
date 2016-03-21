package com.excitedname.exq.storage.barrels;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;
import com.excitedname.exq.utilities.Utilities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class MinerBarrel extends Item {

	public MinerBarrel(){
		
		this.setUnlocalizedName("Miner Barrel");
		this.setTextureName("Miner Barrel");
		this.setCreativeTab(Tabs.StorageTab);	
		this.setContainerItem(Utilities.Barrel);
	}
	
//Texture Icon
	
	@Override
	@SideOnly(Side.CLIENT)
	
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}