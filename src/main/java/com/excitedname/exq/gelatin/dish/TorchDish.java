package com.excitedname.exq.gelatin.dish;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.gelatin.cube.HealthCube;
import com.excitedname.exq.ingredients.Ingredients;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class TorchDish extends Item {
	
		public TorchDish() {
			
			this.setUnlocalizedName("Torch Dish");
			this.setTextureName("Torch Dish");
			this.setCreativeTab(Tabs.GelatinTab);
		}
		
		public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
			super.onEaten(par1ItemStack,  par2World,  par3EntityPlayer);
			
			if (!par3EntityPlayer.capabilities.isCreativeMode)
	        {
	            --par1ItemStack.stackSize;
	        }
					
			return par1ItemStack;
	    }
		
		public int getMaxItemUseDuration(ItemStack par1ItemStack)
	    {
	        return 12;
	    }

	    public EnumAction getItemUseAction(ItemStack par1ItemStack)
	    {
	        return EnumAction.eat;
	    }

	    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	    	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	        return par1ItemStack;
			
	    }
		
	//Texture Icon	

		@Override
		@SideOnly(Side.CLIENT)
			
		public void registerIcons(IIconRegister iconReg){
			itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
				.substring(this.getUnlocalizedName().indexOf(".")+1));
		}
	}