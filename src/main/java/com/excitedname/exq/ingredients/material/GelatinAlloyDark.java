package com.excitedname.exq.ingredients.material;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GelatinAlloyDark extends Item {

public GelatinAlloyDark(){
		
		this.setUnlocalizedName("Dark Gelatin Alloy");
		this.setTextureName("Dark Gelatin Alloy");
		this.setCreativeTab(Tabs.IngTab);		
	}

	public boolean hasEffect(ItemStack par1GelatinAlloyDark, int pass){
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
