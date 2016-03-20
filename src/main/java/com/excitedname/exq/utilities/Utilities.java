package com.excitedname.exq.utilities;

import com.excitedname.exq.ingredients.Ingredients;
import com.excitedname.exq.ingredients.distilleries.MinerDistillery;
import com.excitedname.exq.ingredients.glassware.GlassExtractionTube;
import com.excitedname.exq.ingredients.glassware.GlassFunnel;
import com.excitedname.exq.ingredients.glassware.UtilityGlassT1;
import com.excitedname.exq.ingredients.glassware.UtilityGlassT2;
import com.excitedname.exq.ingredients.glassware.UtilityGlassT3;
import com.excitedname.exq.ingredients.ing.BunsenBurner;
import com.excitedname.exq.ingredients.ing.CoolingElement;
import com.excitedname.exq.ingredients.ing.HeatingElement;
import com.excitedname.exq.ingredients.ing.IronStamp;
import com.excitedname.exq.ingredients.ing.PackUlatingSpindle;
import com.excitedname.exq.ingredients.orb.GelatinOrbT1;
import com.excitedname.exq.ingredients.orb.GelatinOrbT2;
import com.excitedname.exq.ingredients.orb.GelatinOrbT3;
import com.excitedname.exq.ingredients.orb.UtilityOrbT1;
import com.excitedname.exq.ingredients.orb.UtilityOrbT2;
import com.excitedname.exq.ingredients.orb.UtilityOrbT3;
import com.excitedname.exq.utilities.gchamber.GChamberT1;
import com.excitedname.exq.utilities.gchamber.GChamberT2;
import com.excitedname.exq.utilities.gchamber.GChamberT3;
import com.excitedname.exq.utilities.util.CeramicJuicer;
import com.excitedname.exq.utilities.util.Distillery;
import com.excitedname.exq.utilities.util.MortarandPestel;
import com.excitedname.exq.utilities.util.PackUlater;
import com.excitedname.exq.utilities.util.Smeltry;
import com.excitedname.exq.utilities.util.Solidifier;
import com.excitedname.exq.utilities.util.StampMill;
import com.excitedname.exq.utilities.util.Terrarium;
import com.excitedname.exq.utilities.util.TheVat;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Utilities {

	
public static void Util() {

		CeramicJuicer = new CeramicJuicer();
		GameRegistry.registerItem(CeramicJuicer, "Ceramic Juicer");
	
		MortarandPestel = new MortarandPestel();
		GameRegistry.registerItem(MortarandPestel, "Mortar and Pestel");
	
		StampMill = new StampMill();
		GameRegistry.registerItem(StampMill, "Stamp Mill");
		
		TheVat = new TheVat();
		GameRegistry.registerItem(TheVat, "The Vat");
		
		Smeltry = new Smeltry();
		GameRegistry.registerItem(Smeltry, "Smeltry");
		
		Solidifier = new Solidifier();
		GameRegistry.registerItem(Solidifier, "Solidifier");
		
		Distillery = new Distillery();
		GameRegistry.registerItem(Distillery, "Distillery");
		
		Terrarium = new Terrarium();
		GameRegistry.registerItem(Terrarium, "Terrarium");
						
		PackUlater = new PackUlater();
		GameRegistry.registerItem(PackUlater, "Pack-U-Later");	
	}	
	
	public static Item CeramicJuicer;
	public static Item MortarandPestel;
	public static Item StampMill;
	public static Item TheVat;
	public static Item Smeltry;
	public static Item Solidifier;
	public static Item Distillery;
	public static Item Terrarium;	
	public static Item PackUlater;
	
	
public static void GChamber() {
		
		GChamberT1 = new GChamberT1();
		GameRegistry.registerItem(GChamberT1, "Gelatin Chamber(Tier 1)");
		
		GChamberT2 = new GChamberT2();
		GameRegistry.registerItem(GChamberT2, "Gelatin Chamber(Tier 2)");
		
		GChamberT3 = new GChamberT3();
		GameRegistry.registerItem(GChamberT3, "Gelatin Chamber(Tier 3)");
	}
	
	public static Item GChamberT1;
	public static Item GChamberT2;
	public static Item GChamberT3;
		
		

	
//Recipes

public static void UtilRecipes(){
	
//Ceramic Juicer
	GameRegistry.addSmelting(Ingredients.ClayJuicer, new ItemStack(Utilities.CeramicJuicer), 0.0F);
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Utilities.CeramicJuicer), new Object [] {
		"SC",
		"s ",
		
			'C', Ingredients.ClayJuicer, 'S', Utilities.Smeltry, 's', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Utilities.CeramicJuicer), new Object [] {
		"GC",
		"S ",
		
			'G', Utilities.GChamberT2, 'C', Ingredients.ClayJuicer, 'S', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Utilities.CeramicJuicer), new Object [] {
		"GC",
		"S ",
		
			'G', Utilities.GChamberT3, 'C', Ingredients.ClayJuicer, 'S', "dustCharcoal"
	}));
	
//Mortar & pestel
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Utilities.MortarandPestel), new Object [] { 
		"  R",
		"NFN",
		"NIN",
		
			'R', Ingredients.IronRod, 'F', Ingredients.GlassFunnel, 'N', "nuggetIron", 'I', Items.iron_ingot
	}));
	
//Stamp Mill
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Utilities.StampMill), new Object []{
		"PBP",
		"RSR",
		"PWP",
		
			'P', Blocks.planks, 'R', Ingredients.IronRod, 'S', Ingredients.IronStamp, 'W', Blocks.heavy_weighted_pressure_plate, 
			'B', "itemBasicGear"
	}));
	
//The Vat
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Utilities.TheVat), new Object [] {
		"IJI",
		"GBG",
		"IEI",
		
			'I', Items.iron_ingot, 'E', Ingredients.GlassExtractionTube, 'B', Items.bucket, 
			'J', Utilities.CeramicJuicer, 'G', Blocks.glass_pane
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Utilities.TheVat), new Object [] {
		"IJI",
		"GBG",
		"IEI",
		
			'I', Items.iron_ingot, 'E', Ingredients.GlassExtractionTube, 'B', Items.bucket, 
			'J', Utilities.CeramicJuicer, 'G', "paneGlass"
	}));
	
//Smeltry
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Utilities.Smeltry), new Object [] {
		"IBI",
		"BCB",
		"IHI",
		
			'H', Ingredients.HeatingElement, 'I', Items.iron_ingot, 'C', "itemMachineChassi", 'B', Blocks.furnace
	}));
	
//Solidifier
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Utilities.Solidifier), new Object []{
		"IBI",
		"BCB",
		"IcI",
		
			'c', Ingredients.CoolingElement, 'I', Items.iron_ingot, 'C', "itemMachineChassi", 'B', Blocks.furnace
	}));

//Distillery
	GameRegistry.addShapedRecipe(new ItemStack(Utilities.Distillery), new Object []{
		"BBB",
		"BJB",
		"BBB",
		
			'B', Ingredients.GlassBlank, 'J', Ingredients.GlassJar
	});
	
//Terrarium
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Utilities.Terrarium), new Object []{
		"GGG",
		"GSG",
		"CPC",
		
			'G', Ingredients.GlassBlank, 'S', Ingredients.GelatinousSoil, 'C', "ingotCopper", 'P', Blocks.planks
	}));
	
//Pack-U-Later
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Utilities.PackUlater), new Object [] {
		"   ",
		"N S",
		"CLC",
		
			'N', "nuggetIron", 'S', Ingredients.PackUlatingSpindle, 'L', Blocks.planks, 'C', "ingotCopper"
	}));	
	
}
		

public static void GChamberRecipes() {
	
	//Gelatin Chamber(Tier 1)
		GameRegistry.addShapedRecipe(new ItemStack(Utilities.GChamberT1), new Object []{
			"NSN",
			"NON",
			"NSN",
			
				'O', Ingredients.GelatinOrbT1, 'N', Ingredients.GelatinAlloyNugget, 'S', Ingredients.GelatinShard
		});
		
	//Gelatin Chamber(Tier 2)
		GameRegistry.addShapedRecipe(new ItemStack(Utilities.GChamberT2), new Object []{
			"ICI",
			"IOI",
			"ICI",
			
				'O', Ingredients.GelatinOrbT2, 'I', Ingredients.GelatinAlloy, 'C', Ingredients.GelatinCrystal
		});
	
	//Gelatin Chamber(Tier 3)
		GameRegistry.addShapedRecipe(new ItemStack(Utilities.GChamberT3), new Object []{
			"IVI",
			"IOI",
			"IVI",
			
				'O', Ingredients.GelatinOrbT3, 'I', Ingredients.GelatinAlloyDark, 'V', Ingredients.GelatinCrystalVibrant
		});						
	}
		
}





















