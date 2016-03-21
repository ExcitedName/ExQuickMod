package com.excitedname.exq.ingredients.solution;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ingredients.Ingredients;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class MinerSolution extends Item {

	public MinerSolution(){
		
		this.setUnlocalizedName("Miner Solution");
		this.setTextureName("Miner Solution");
		this.setCreativeTab(Tabs.GelatinTab);
		this.setContainerItem(Ingredients.GlassBottle);
	}
	
//Texture Icon
	
	@Override
	@SideOnly(Side.CLIENT)
	
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
