package com.excitedname.exq.gelatin.cube;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class GelatinCube extends ItemFood {


		public GelatinCube(int food, float saturation, boolean wolfFood) {
			super(2, 5.0F, true);
			this.setUnlocalizedName("Gelatin Cube");
			this.setTextureName("Gelatin Cube");
			this.setCreativeTab(Tabs.GelatinTab);
		}

	//Texture Icon	

	@Override
	@SideOnly(Side.CLIENT)
		
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
