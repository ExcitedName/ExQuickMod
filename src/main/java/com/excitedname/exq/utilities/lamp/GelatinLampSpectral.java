package com.excitedname.exq.utilities.lamp;

import java.util.Random;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class GelatinLampSpectral extends Block {

	public GelatinLampSpectral(Material material) {
		super(material.iron);

		this.setBlockName("Gelatin Lamp(Spectral)");
		this.setBlockTextureName("Gelatin Lamp(Spectral)");
		this.setCreativeTab(Tabs.UtilTab);
		this.setHardness(0.01F);
		this.setResistance(2000.0F);
		this.setStepSound(soundTypeMetal);
		this.setLightLevel(1.0F);
		this.setBlockBounds(0.375F, 0.0F, 0.375F, 0.625F, 0.01F, 0.625F);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	};
	    
	 @SideOnly(Side.CLIENT)
	 public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
	    {
	        int l = p_149734_1_.getBlockMetadata(p_149734_2_, p_149734_3_, p_149734_4_);
	        double d0 = (double)((float)p_149734_2_ + 0.5F);
	        double d1 = (double)((float)p_149734_3_ + 0.7F);
	        double d2 = (double)((float)p_149734_4_ + 0.5F);
	        double d3 = 0.2199999988079071D;
	        double d4 = 0.27000001072883606D;

	        if (l == 1)
	        {
	            p_149734_1_.spawnParticle("portal", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("flame", d2 - d4, d2 + d4, d2, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 2)
	        {
	            p_149734_1_.spawnParticle("portal", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("flame", d2 - d4, d2 + d4, d2, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 3)
	        {
	            p_149734_1_.spawnParticle("portal", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("flame", d0, d2 + d4, d3 - d4, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 4)
	        {
	            p_149734_1_.spawnParticle("portal", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("flame", d0, d2 + d4, d3 - d4, 0.0D, 0.0D, 0.0D);
	        }
	        else
	        {
	            p_149734_1_.spawnParticle("portal", d0, d1, d2, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("flame", d1, d2, d3, 0.0D, 0.0D, 0.0D);
	        }
	    }
	 
	//USEFUL changes the shape of the block micro block status.
		
		//public MovingObjectPosition collisionRayTrace(World p_149731_1_, int p_149731_2_, int p_149731_3_, int p_149731_4_, Vec3 p_149731_5_, Vec3 p_149731_6_)
	   // {
	       // int l = p_149731_1_.getBlockMetadata(p_149731_2_, p_149731_3_, p_149731_4_) & 7;
	       // float f = 0.15F;

	       // if (l == 1)
	       // {
	           // this.setBlockBounds(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
	      //  }
	       // else if (l == 2)
	        //{
	          //  this.setBlockBounds(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
	       // }
	       // else if (l == 3)
	       // {
	        //    this.setBlockBounds(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
	       // }
	       // else if (l == 4)
	       // {
	        //    this.setBlockBounds(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
	       // }
	       // else
	       // {
	          //  f = 0.1F;
	           // this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
	      //  }

	        //return super.collisionRayTrace(p_149731_1_, p_149731_2_, p_149731_3_, p_149731_4_, p_149731_5_, p_149731_6_);
	   // }
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconReg) {
		blockIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + (this.getUnlocalizedName()).substring(5));
	}	
}
