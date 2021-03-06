package com.excitedname.exq.storage.barrels;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;
import com.excitedname.exq.storage.Storage;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class DragonBarrel extends Item {

	//Declaration (Boolean)}

		public DragonBarrel() {
			
			this.setUnlocalizedName("Dragon Barrel");
			this.setTextureName("Dragon Barrel");
			this.setCreativeTab(Tabs.StorageTab);
			this.setContainerItem(Storage.Barrel);
		}
		
		//public boolean hasEffect(ItemStack par1GelatinCrystal, int pass){
			//return true;
		//}

	//Texture Icon	

		@Override
		@SideOnly(Side.CLIENT)
			
		public void registerIcons(IIconRegister iconReg){
			itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
				.substring(this.getUnlocalizedName().indexOf(".")+1));
		}
	}
