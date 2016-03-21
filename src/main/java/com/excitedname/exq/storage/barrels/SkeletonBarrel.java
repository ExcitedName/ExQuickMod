package com.excitedname.exq.storage.barrels;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;
import com.excitedname.exq.utilities.Utilities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class SkeletonBarrel extends Item {

	//Declaration (Boolean)}

		public SkeletonBarrel() {
			
			this.setUnlocalizedName("Skeleton Barrel");
			this.setTextureName("Skeleton Barrel");
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
