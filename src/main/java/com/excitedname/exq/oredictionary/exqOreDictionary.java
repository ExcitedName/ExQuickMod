package com.excitedname.exq.oredictionary;

import com.excitedname.exq.ingredients.Ingredients;
import com.excitedname.exq.storage.Storage;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class exqOreDictionary {

	public static void InitexqOreDictionary() {
		
		OreDictionary.getOreName(0);
		
		OreDictionary.registerOre("shardDiamond", new ItemStack(Ingredients.DiamondShard));
		
		OreDictionary.registerOre("shardEmerald", new ItemStack(Ingredients.EmeraldShard));
		
		OreDictionary.registerOre("shardGelatin", new ItemStack(Ingredients.GelatinShard));
		
		OreDictionary.registerOre("ingotGelatinAlloy", new ItemStack(Ingredients.GelatinAlloy));
		
		OreDictionary.registerOre("ingotDarkGelatinAlloy", new ItemStack(Ingredients.GelatinAlloyDark));
		
		OreDictionary.registerOre("gearGelatinAlloy", new ItemStack(Ingredients.GelatinAlloyGear));
		
		OreDictionary.registerOre("dustCharcoal", new ItemStack(Ingredients.GroundCharcoalDish));
		
		OreDictionary.registerOre("dustCoal", new ItemStack(Ingredients.GroundCoalDish));
		
		OreDictionary.registerOre("nuggetIron", new ItemStack(Ingredients.IronNugget));
		
		OreDictionary.registerOre("foodFlour", new ItemStack(Ingredients.GroundFlourDish));
		
		OreDictionary.registerOre("ingotSteel", new ItemStack(Ingredients.SteelIngot));
		
		OreDictionary.registerOre("bucketEmpty", new ItemStack(Ingredients.GlassJar));
		
		OreDictionary.registerOre("bucketWater", new ItemStack(Storage.H2OCoolJar));
		
		OreDictionary.registerOre("bucketLava", new ItemStack(Storage.LavaJar));
		
	}
}








