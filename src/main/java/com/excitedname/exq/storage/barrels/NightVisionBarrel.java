package com.excitedname.exq.storage.barrels;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class NightVisionBarrel extends Item {

	//Declaration (Boolean)}

		public NightVisionBarrel() {
			
			this.setUnlocalizedName("Night Vision Barrel");
			this.setTextureName("Night Vision Barrel");
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
