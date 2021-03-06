package com.excitedname.exq.ingredients.glassware;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UtilityGlassT3 extends Item {

	public UtilityGlassT3(){
		
		this.setUnlocalizedName("Utility Glass(Tier 3)");
		this.setTextureName("Utility Glass(Tier 3)");
	}
	
	public boolean hasEffect(ItemStack par1CrystalFire, int pass){
		return true;
	}
	
//Texture Icon
	
	@Override
	@SideOnly(Side.CLIENT)
	
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}