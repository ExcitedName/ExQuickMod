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

public class DragonDish extends Item {
	
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
	
	public int FourthPotionid;
	public int FourthPotionDuration;
	public int FourthPotionAmplifier;
	public float FourthPotionEffectProbability;
	
	public int FifthPotionid;
	public int FifthPotionDuration;
	public int FifthPotionAmplifier;
	public float FifthPotionEffectProbability;
	
	
		public DragonDish() {
			
			this.setUnlocalizedName("Dragon Dish");
			this.setTextureName("Dragon Dish");
			this.setCreativeTab(Tabs.GelatinTab);
			this.setContainerItem(Ingredients.GlassDish);
			this.setFirstPotionEffect(Potion.moveSpeed.id, 20, 2, 1F);
			this.setSecondPotionEffect(Potion.jump.id, 20, 2, 1F);
			this.setThirdPotionEffect(Potion.resistance.id, 20, 3, 1F);
			this.setFourthPotionEffect(Potion.damageBoost.id, 20, 3, 1F);
			this.setFifthPotionEffect(Potion.fireResistance.id, 20, 3, 1F);
		}
		
		public boolean hasEffect(ItemStack par1GelatinCrystal, int pass){
			return true;
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
				par3EntityPlayer.addPotionEffect(new PotionEffect(this.SecondPotionid, this.SecondPotionDuration * 540, this.SecondPotionAmplifier));
			}
			
			if (!par2World.isRemote && this.ThirdPotionid > 0 && par2World.rand.nextFloat() < this.ThirdPotionEffectProbability){
				par3EntityPlayer.addPotionEffect(new PotionEffect(this.ThirdPotionid, this.ThirdPotionDuration * 540, this.ThirdPotionAmplifier));
			}
			
			if (!par2World.isRemote && this.FourthPotionid > 0 && par2World.rand.nextFloat() < this.FourthPotionEffectProbability){
				par3EntityPlayer.addPotionEffect(new PotionEffect(this.FourthPotionid, this.FourthPotionDuration * 540, this.FourthPotionAmplifier));
			}
			
			if (!par2World.isRemote && this.FifthPotionid > 0 && par2World.rand.nextFloat() < this.FifthPotionEffectProbability){
				par3EntityPlayer.addPotionEffect(new PotionEffect(this.FifthPotionid, this.FifthPotionDuration * 540, this.FifthPotionAmplifier));
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
	    
	    public DragonDish setFirstPotionEffect(int par1, int par2, int par3, float par4){
			
			this.FirstPotionid = par1;
			this.FirstPotionDuration = par2;
			this.FirstPotionAmplifier = par3;
			this.FirstPotionEffectProbability = par4;
			return this;			
		}
		
		public DragonDish setSecondPotionEffect(int par1, int par2, int par3, float par4){
			
			this.SecondPotionid = par1;
			this.SecondPotionDuration = par2;
			this.SecondPotionAmplifier = par3;
			this.SecondPotionEffectProbability = par4;
			return this;			
		}
		
		public DragonDish setThirdPotionEffect(int par1, int par2, int par3, float par4){
			
			this.ThirdPotionid = par1;
			this.ThirdPotionDuration = par2;
			this.ThirdPotionAmplifier = par3;
			this.ThirdPotionEffectProbability = par4;
			return this;			
		}
		
		public DragonDish setFourthPotionEffect(int par1, int par2, int par3, float par4){
			
			this.FourthPotionid = par1;
			this.FourthPotionDuration = par2;
			this.FourthPotionAmplifier = par3;
			this.FourthPotionEffectProbability = par4;
			return this;			
		}
		
		public DragonDish setFifthPotionEffect(int par1, int par2, int par3, float par4){
			
			this.FifthPotionid = par1;
			this.FifthPotionDuration = par2;
			this.FifthPotionAmplifier = par3;
			this.FifthPotionEffectProbability = par4;
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