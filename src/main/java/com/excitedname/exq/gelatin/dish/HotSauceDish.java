package com.excitedname.exq.gelatin.dish;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ingredients.Ingredients;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class HotSauceDish extends Item {
	
	public int FirstPotionid;
	public int FirstPotionDuration;
	public int FirstPotionAmplifier;
	public float FirstPotionEffectProbability;

	public int SecondPotionid;
	public int SecondPotionDuration;
	public int SecondPotionAmplifier;
	public float SecondPotionEffectProbability;
	
	public int ThirdPotionid;
	public int ThirdPotionDuration;
	public int ThirdPotionAmplifier;
	public float ThirdPotionEffectProbability;

	//Declaration (Boolean)}

		public HotSauceDish() {
			
			this.setUnlocalizedName("Hot Sauce Dish");
			this.setTextureName("Hot Sauce Dish");
			this.setCreativeTab(Tabs.GelatinTab);
			this.setContainerItem(Ingredients.GlassDish);
			this.setFirstPotionEffect(Potion.fireResistance.id, 20, 2, 1F);
			this.setSecondPotionEffect(Potion.moveSpeed.id, 20, 2, 1F);
			this.setThirdPotionEffect(Potion.harm.id, 1, 0, 0.5F);
			
		}
		
		public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
			super.onEaten(par1ItemStack,  par2World,  par3EntityPlayer);
			
			if (!par3EntityPlayer.capabilities.isCreativeMode)
	        {
	            --par1ItemStack.stackSize;
	        }
			
			if (!par2World.isRemote && this.FirstPotionid > 0 && par2World.rand.nextFloat() < this.FirstPotionEffectProbability){
				par3EntityPlayer.addPotionEffect(new PotionEffect(this.FirstPotionid, this.FirstPotionDuration * 540, this.FirstPotionAmplifier));
			}
			
			if (!par2World.isRemote && this.SecondPotionid > 0 && par2World.rand.nextFloat() < this.SecondPotionEffectProbability){
				par3EntityPlayer.addPotionEffect(new PotionEffect(this.SecondPotionid, this.SecondPotionDuration * 30, this.SecondPotionAmplifier));
			}
			
			if (!par2World.isRemote && this.ThirdPotionid > 0 && par2World.rand.nextFloat() < this.ThirdPotionEffectProbability){
				par3EntityPlayer.addPotionEffect(new PotionEffect(this.ThirdPotionid, this.ThirdPotionDuration * 1, this.ThirdPotionAmplifier));
			}
			
			return par1ItemStack;
			
	     }
				
		public int getMaxItemUseDuration(ItemStack par1ItemStack)
	    {
	        return 14;
	    }

	    public EnumAction getItemUseAction(ItemStack par1ItemStack)
	    {
	        return EnumAction.drink;
	    }

	    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	    	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	        return par1ItemStack;
			
		}
	    
	    public HotSauceDish setFirstPotionEffect(int par1, int par2, int par3, float par4){
			
			this.FirstPotionid = par1;
			this.FirstPotionDuration = par2;
			this.FirstPotionAmplifier = par3;
			this.FirstPotionEffectProbability = par4;
			return this;			
		}
		
		public HotSauceDish setSecondPotionEffect(int par1, int par2, int par3, float par4){
			
			this.SecondPotionid = par1;
			this.SecondPotionDuration = par2;
			this.SecondPotionAmplifier = par3;
			this.SecondPotionEffectProbability = par4;
			return this;			
		}
		
		public HotSauceDish setThirdPotionEffect(int par1, int par2, int par3, float par4){
			
			this.ThirdPotionid = par1;
			this.ThirdPotionDuration = par2;
			this.ThirdPotionAmplifier = par3;
			this.ThirdPotionEffectProbability = par4;
			return this;			
		}

	//Texture Icon	

		@Override
		@SideOnly(Side.CLIENT)
			
		public void registerIcons(IIconRegister iconReg){
			itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
				.substring(this.getUnlocalizedName().indexOf(".")+1));
		}
	}
