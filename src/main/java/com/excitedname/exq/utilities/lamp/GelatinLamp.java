package com.excitedname.exq.utilities.lamp;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class GelatinLamp extends Block {

	public GelatinLamp(Material material) {
		super(material.iron);

		this.setBlockName("Gelatin Lamp");
		this.setBlockTextureName("Gelatin Lamp");
		this.setCreativeTab(Tabs.UtilTab);
		this.setHardness(0.01F);
		this.setResistance(2000.0F);
		this.setStepSound(soundTypeMetal);
		this.setLightLevel(0.945F);
		this.setBlockBounds(0.375F, 0.0F, 0.375F, 0.625F, 0.01F, 0.625F);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	};
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconReg) {
		blockIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + (this.getUnlocalizedName()).substring(5));
	}
}
