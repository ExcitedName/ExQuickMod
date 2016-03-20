package com.excitedname.exq.ingredients.orb;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GelatinOrbT3 extends Item {

	public GelatinOrbT3(){
		
		this.setUnlocalizedName("Gelatin Orb(Tier 3)");
		this.setTextureName("Gelatin Orb(Tier 3)");
		this.setCreativeTab(Tabs.IngTab);		
	}
	
	public boolean hasEffect(ItemStack par1GelatinPearl, int pass){
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
