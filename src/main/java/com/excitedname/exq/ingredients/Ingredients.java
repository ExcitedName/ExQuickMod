package com.excitedname.exq.ingredients;

import com.excitedname.exq.gelatin.Gelatin;
import com.excitedname.exq.ingredients.distilleries.Dist;
import com.excitedname.exq.ingredients.distilleries.DistH2O;
import com.excitedname.exq.ingredients.distilleries.DistLav;
import com.excitedname.exq.ingredients.glassware.GlassBlank;
import com.excitedname.exq.ingredients.glassware.GlassBottle;
import com.excitedname.exq.ingredients.glassware.GlassCondensingCoil;
import com.excitedname.exq.ingredients.glassware.GlassDish;
import com.excitedname.exq.ingredients.glassware.GlassFunnel;
import com.excitedname.exq.ingredients.glassware.GlassGelatinMold;
import com.excitedname.exq.ingredients.glassware.GlassJar;
import com.excitedname.exq.ingredients.glassware.UtilityGlassT1;
import com.excitedname.exq.ingredients.glassware.UtilityGlassT2;
import com.excitedname.exq.ingredients.glassware.UtilityGlassT3;
import com.excitedname.exq.ingredients.ground.GroundCharcoal;
import com.excitedname.exq.ingredients.ground.GroundCoal;
import com.excitedname.exq.ingredients.ground.GroundFlour;
import com.excitedname.exq.ingredients.ground.GroundGelatin;
import com.excitedname.exq.ingredients.ground.GroundMarrow;
import com.excitedname.exq.ingredients.ground.GroundMeat;
import com.excitedname.exq.ingredients.ground.GroundRDX;
import com.excitedname.exq.ingredients.ground.GroundTrilite;
import com.excitedname.exq.ingredients.ground.PrimingPowder;
import com.excitedname.exq.ingredients.ground.WoodPulp;
import com.excitedname.exq.ingredients.ing.BunsenBurner;
import com.excitedname.exq.ingredients.ing.ClayJuicer;
import com.excitedname.exq.ingredients.ing.CoolingElement;
import com.excitedname.exq.ingredients.ing.CraftingMedallion;
import com.excitedname.exq.ingredients.ing.GelatinousSoil;
import com.excitedname.exq.ingredients.ing.HeatingElement;
import com.excitedname.exq.ingredients.ing.IronStamp;
import com.excitedname.exq.ingredients.ing.PackUlatingSpindle;
import com.excitedname.exq.ingredients.ing.PotatoMedallion;
import com.excitedname.exq.ingredients.material.CrackedBone;
import com.excitedname.exq.ingredients.material.DiamondShard;
import com.excitedname.exq.ingredients.material.EmeraldShard;
import com.excitedname.exq.ingredients.material.GelatinAlloy;
import com.excitedname.exq.ingredients.material.GelatinAlloyDark;
import com.excitedname.exq.ingredients.material.GelatinAlloyGear;
import com.excitedname.exq.ingredients.material.GelatinAlloyNugget;
import com.excitedname.exq.ingredients.material.GelatinCrystal;
import com.excitedname.exq.ingredients.material.GelatinCrystalVibrant;
import com.excitedname.exq.ingredients.material.GelatinLily;
import com.excitedname.exq.ingredients.material.GelatinLilyVibrant;
import com.excitedname.exq.ingredients.material.GelatinShard;
import com.excitedname.exq.ingredients.material.GelatinShardVibrant;
import com.excitedname.exq.ingredients.material.IceShard;
import com.excitedname.exq.ingredients.material.IronNugget;
import com.excitedname.exq.ingredients.material.IronRod;
import com.excitedname.exq.ingredients.material.SteelIngot;
import com.excitedname.exq.ingredients.orb.GelatinOrbT1;
import com.excitedname.exq.ingredients.orb.GelatinOrbT2;
import com.excitedname.exq.ingredients.orb.GelatinOrbT3;
import com.excitedname.exq.ingredients.orb.UtilityOrbT1;
import com.excitedname.exq.ingredients.orb.UtilityOrbT2;
import com.excitedname.exq.ingredients.orb.UtilityOrbT3;
import com.excitedname.exq.ingredients.solution.CompBSolution;
import com.excitedname.exq.ingredients.solution.CreeperSolution;
import com.excitedname.exq.ingredients.solution.DragonSolution;
import com.excitedname.exq.ingredients.solution.HealthSolution;
import com.excitedname.exq.ingredients.solution.HotSauceSolution;
import com.excitedname.exq.ingredients.solution.IronSkinSolution;
import com.excitedname.exq.ingredients.solution.KrackenSolution;
import com.excitedname.exq.ingredients.solution.MinerSolution;
import com.excitedname.exq.ingredients.solution.NightVisionSolution;
import com.excitedname.exq.ingredients.solution.SkeletonSolution;
import com.excitedname.exq.ingredients.solution.TorchSolution;
import com.excitedname.exq.ingredients.solution.TravellerSolution;
import com.excitedname.exq.ingredients.solution.WarriorSolution;
import com.excitedname.exq.ingredients.solution.ZombieSolution;
import com.excitedname.exq.storage.Storage;
import com.excitedname.exq.utilities.Utilities;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Ingredients {
	
	
public static void Distilleries() {
		
		Dist = new Dist();
		GameRegistry.registerItem(Dist, "Dist");
		
		DistH2O = new DistH2O(Blocks.flowing_water);
		GameRegistry.registerItem(DistH2O, "DistH2O");
		
		DistLav = new DistLav(Blocks.flowing_lava);
		GameRegistry.registerItem(DistLav, "DistLav");
		
	}
	
	public static Item Dist;
	public static Item DistH2O;
	public static Item DistLav;
	
	
public static void Solution() {
			
		MinerSolution = new MinerSolution();
		GameRegistry.registerItem(MinerSolution, "Miner Solution");
		
		TravellerSolution = new TravellerSolution();
		GameRegistry.registerItem(TravellerSolution, "Traveller Solution");
		
		IronSkinSolution = new IronSkinSolution();
		GameRegistry.registerItem(IronSkinSolution, "Iron Skin Solution");
		
		WarriorSolution = new WarriorSolution();
		GameRegistry.registerItem(WarriorSolution, "Warrior Solution");
		
		HealthSolution = new HealthSolution();
		GameRegistry.registerItem(HealthSolution, "Health Solution");
		
		HotSauceSolution = new HotSauceSolution();
		GameRegistry.registerItem(HotSauceSolution, "Hot Sauce Solution");
		
		NightVisionSolution = new NightVisionSolution();
		GameRegistry.registerItem(NightVisionSolution, "Night Vision Solution");
		
		TorchSolution = new TorchSolution();
		GameRegistry.registerItem(TorchSolution, "Torch Solution");
		
		CompBSolution = new CompBSolution();
		GameRegistry.registerItem(CompBSolution, "CompB Solution");
		
		KrackenSolution = new KrackenSolution();
		GameRegistry.registerItem(KrackenSolution, "Kracken Solution");
		
		DragonSolution = new DragonSolution();
		GameRegistry.registerItem(DragonSolution, "Dragon Solution");
				
		CreeperSolution = new CreeperSolution();
		GameRegistry.registerItem(CreeperSolution, "Creeper Solution");
		
		SkeletonSolution = new SkeletonSolution();
		GameRegistry.registerItem(SkeletonSolution, "Skeleton Solution");
		
		ZombieSolution = new ZombieSolution();
		GameRegistry.registerItem(ZombieSolution, "Zombie Solution");
	}
		
	public static Item MinerSolution;
	public static Item TravellerSolution;
	public static Item IronSkinSolution;
	public static Item WarriorSolution;
	public static Item HealthSolution;
	public static Item HotSauceSolution;
	public static Item NightVisionSolution;
	public static Item TorchSolution;
	public static Item CompBSolution;
	public static Item KrackenSolution;
	public static Item DragonSolution;
	public static Item CreeperSolution;
	public static Item SkeletonSolution;					
	public static Item ZombieSolution;	
		

public static void UtilIng() {
		
		ClayJuicer = new ClayJuicer();
		GameRegistry.registerItem(ClayJuicer, "Clay Juicer");
	
		IronStamp = new IronStamp();
		GameRegistry.registerItem(IronStamp, "Iron Stamp");
		
		HeatingElement = new HeatingElement();
		GameRegistry.registerItem(HeatingElement, "Heating Element");
		
		CoolingElement = new CoolingElement();
		GameRegistry.registerItem(CoolingElement, "Cooling Element");
		
		BunsenBurner = new BunsenBurner();
		GameRegistry.registerItem(BunsenBurner, "Bunsen Burner");
		
		GelatinousSoil = new GelatinousSoil();
		GameRegistry.registerItem(GelatinousSoil, "Gelatinous Soil");
		
		PackUlatingSpindle = new PackUlatingSpindle();
		GameRegistry.registerItem(PackUlatingSpindle, "Pack-U-Lating Spindle");
		
	}
		
	public static Item ClayJuicer;
	public static Item IronStamp;	
	public static Item HeatingElement;
	public static Item CoolingElement;
	public static Item BunsenBurner;
	public static Item GelatinousSoil;
	public static Item PackUlatingSpindle;
			
	
public static void Orb() {
		
		UtilityOrbT1 = new UtilityOrbT1();
		GameRegistry.registerItem(UtilityOrbT1, "Utility Orb(Tier 1)");
		
		UtilityOrbT2 = new UtilityOrbT2();
		GameRegistry.registerItem(UtilityOrbT2, "Utility Orb(Tier 2)");
		
		UtilityOrbT3 = new UtilityOrbT3();
		GameRegistry.registerItem(UtilityOrbT3, "Utility Orb(Tier 3)");
	
		GelatinOrbT1 = new GelatinOrbT1();
		GameRegistry.registerItem(GelatinOrbT1, "Gelatin Orb(Tier 1)");
		
		GelatinOrbT2 = new GelatinOrbT2();
		GameRegistry.registerItem(GelatinOrbT2, "Gelatin Orb(Tier 2)");
		
		GelatinOrbT3 = new GelatinOrbT3();
		GameRegistry.registerItem(GelatinOrbT3, "Gelatin Orb(Tier 3)");		
	}
	
	public static Item UtilityOrbT1;
	public static Item UtilityOrbT2;
	public static Item UtilityOrbT3;
	public static Item GelatinOrbT1;
	public static Item GelatinOrbT2;
	public static Item GelatinOrbT3;
	

public static void Glassware() {
		
		GlassBlank = new GlassBlank();
		GameRegistry.registerItem(GlassBlank, "Glass Blank");
		
		UtilityGlassT1 = new UtilityGlassT1();
		GameRegistry.registerItem(UtilityGlassT1, "Utility Glass(Tier 1)");
		
		UtilityGlassT2= new UtilityGlassT2();
		GameRegistry.registerItem(UtilityGlassT2, "Utility Glass(Tier 2)");
		
		UtilityGlassT3= new UtilityGlassT3();
		GameRegistry.registerItem(UtilityGlassT3, "Utility Glass(Tier 3)");

		GlassFunnel = new GlassFunnel();
		GameRegistry.registerItem(GlassFunnel, "Glass Funnel");
		
		GlassGelatinMold = new GlassGelatinMold();
		GameRegistry.registerItem(GlassGelatinMold, "Glass Gelatin Mold");
		
		GlassDish = new GlassDish();
		GameRegistry.registerItem(GlassDish, "Glass Dish");
		
		GlassCondensingCoil = new GlassCondensingCoil();
		GameRegistry.registerItem(GlassCondensingCoil, "Glass Condensing Coil");
		
		GlassBottle = new GlassBottle();
		GameRegistry.registerItem(GlassBottle, "Glass Bottle");	
		
		GlassJar = new GlassJar(Blocks.air);
		GameRegistry.registerItem(GlassJar, "Glass Jar");

	}

	public static Item GlassBlank; 
	public static Item UtilityGlassT1;
	public static Item UtilityGlassT2;
	public static Item UtilityGlassT3;
	public static Item GlassFunnel;
	public static Item GlassGelatinMold;
	public static Item GlassDish;
	public static Item GlassCondensingCoil;
	public static Item GlassBottle;	
	public static Item GlassJar;


public static void Material() {
		
		GelatinAlloy = new GelatinAlloy();
		GameRegistry.registerItem(GelatinAlloy, "Gelatin Alloy");
		
		GelatinAlloyDark = new GelatinAlloyDark();
		GameRegistry.registerItem(GelatinAlloyDark, "Dark Gelatin Alloy");
		
		SteelIngot = new SteelIngot();
		GameRegistry.registerItem(SteelIngot, "Steel Ingot");
		
		GelatinCrystal = new GelatinCrystal();
		GameRegistry.registerItem(GelatinCrystal, "Gelatin Crystal");
		
		GelatinCrystalVibrant = new GelatinCrystalVibrant();
		GameRegistry.registerItem(GelatinCrystalVibrant, "Gelatin Crystal Vibrant");
		
		GelatinAlloyNugget = new GelatinAlloyNugget();
		GameRegistry.registerItem(GelatinAlloyNugget, "Gelatin Alloy Nugget");
		
		IronNugget = new IronNugget();
		GameRegistry.registerItem(IronNugget, "Iron Nugget");
		
		IceShard = new IceShard();
		GameRegistry.registerItem(IceShard, "Ice Shard");
		
		DiamondShard = new DiamondShard();
		GameRegistry.registerItem(DiamondShard, "Diamond Shard");
		
		EmeraldShard = new EmeraldShard();
		GameRegistry.registerItem(EmeraldShard, "Emerald Shard");
		
		GelatinShard = new GelatinShard();
		GameRegistry.registerItem(GelatinShard, "Gelatin Shard");
		
		GelatinShardVibrant = new GelatinShardVibrant();
		GameRegistry.registerItem(GelatinShardVibrant, "Gelatin Shard Vibrant");
		
		IronRod = new IronRod();
		GameRegistry.registerItem(IronRod, "Iron Rod");
		
		GelatinAlloyGear = new GelatinAlloyGear();
		GameRegistry.registerItem(GelatinAlloyGear, "Gelatin Alloy Gear");
		
		CrackedBone = new CrackedBone();
		GameRegistry.registerItem(CrackedBone, "Cracked Bone");
		
		GelatinLily = new GelatinLily();
		GameRegistry.registerItem(GelatinLily, "Gelatin Lily");	
		
		GelatinLilyVibrant = new GelatinLilyVibrant();
		GameRegistry.registerItem(GelatinLilyVibrant, "Gelatin LilyVibrant ");
		
	}

	public static Item GelatinAlloy;
	public static Item GelatinAlloyDark;
	public static Item SteelIngot;
	public static Item GelatinCrystal;
	public static Item GelatinCrystalVibrant;	
	public static Item GelatinAlloyNugget;
	public static Item IronNugget;
	public static Item IceShard;
	public static Item DiamondShard;
	public static Item EmeraldShard;	
	public static Item GelatinShard;
	public static Item GelatinShardVibrant;
	public static Item IronRod;
	public static Item GelatinAlloyGear;		
	public static Item CrackedBone;
	public static Item GelatinLily;
	public static Item GelatinLilyVibrant;
	
	
public static void Medallion() {
		
		CraftingMedallion= new CraftingMedallion();
		GameRegistry.registerItem(CraftingMedallion, "Crafting Medallion");
		
		PotatoMedallion = new PotatoMedallion();
		GameRegistry.registerItem(PotatoMedallion, "Potato Medallion");
		
	}

	public static Item CraftingMedallion;		
	public static Item PotatoMedallion;
		
	
public static void Ground() {
		
		GroundGelatin = new GroundGelatin();
		GameRegistry.registerItem(GroundGelatin, "Ground Gelatin");
		
		GroundMarrow = new GroundMarrow();
		GameRegistry.registerItem(GroundMarrow, "Ground Marrow");
		
		GroundFlour = new GroundFlour();
		GameRegistry.registerItem(GroundFlour, "Ground Flour");
		
		GroundCoal = new GroundCoal();
		GameRegistry.registerItem(GroundCoal, "Ground Coal");
		
		GroundCharcoal = new GroundCharcoal();
		GameRegistry.registerItem(GroundCharcoal, "Ground Charcoal");		
		
		WoodPulp = new WoodPulp();
		GameRegistry.registerItem(WoodPulp, "Wood Pulp");
		
		PrimingPowder = new PrimingPowder();
		GameRegistry.registerItem(PrimingPowder, "Priming Powder");
		
		GroundTrilite = new GroundTrilite();
		GameRegistry.registerItem(GroundTrilite, "Ground Trilite");
		
		GroundRDX = new GroundRDX();
		GameRegistry.registerItem(GroundRDX, "Ground RDX");
		
		GroundMeat = new GroundMeat();
		GameRegistry.registerItem(GroundMeat, "Ground Meat");
				
	}

	public static Item GroundGelatin;	
	public static Item GroundMarrow;
	public static Item GroundFlour;	
	public static Item GroundCoal;
	public static Item GroundCharcoal;
	public static Item WoodPulp;
	public static Item PrimingPowder;
	public static Item GroundTrilite;
	public static Item GroundRDX;
	public static Item GroundMeat;	
	
	
	
//Recipes	
	
public static void DistRecipes() {
	
//Distillery H2O
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.DistH2O), new Object []{
		"   ",
		" D ",
		" J ",
		
			'D', Utilities.Distillery, 'J', Storage.H2OCoolJar
	});
	
//Distillery Lava
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.DistLav), new Object []{
		"   ",
		" D ",
		" J ",
		
			'D', Utilities.Distillery, 'J', Storage.LavaJar
	});
		
//Miner Dist
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.Dist), new Object []{
		"YSY",
		"BDR",
		"TsG",
		
			'D', Ingredients.DistH2O, 'Y', new ItemStack(Items.dye, 12, 12), 
			'S', Ingredients.GelatinCrystal, 's', Items.sugar, 'B', "foodBlueberrysmoothie", 'T', "foodStrawberrysmoothie", 
			'R', "foodRaspberrysmoothie", 'G', "foodGooseberrysmoothie"
	}));
	
//Traveller Dist
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.Dist, 1, 1), new Object []{
		"YSY",
		"CDC",
		"CsC",
		
			'D', Ingredients.DistH2O, 'Y', new ItemStack(Items.dye, 6, 6), 
			'S', Ingredients.GelatinCrystal, 's', Items.sugar, 'C', "foodCoffee"
	}));
	
//Iron Skin Dist
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.Dist, 1, 2), new Object []{
		"YSY",
		"BDR",
		"TsG",
		
			'D', Ingredients.DistH2O, 'Y', new ItemStack(Items.dye, 5, 5), 
			'S', Ingredients.GelatinCrystal, 's', Items.sugar, 'B', "foodBananasmoothie", 'T', "foodApricotsmoothie", 
			'R', "foodFigsmoothie", 'G', "foodPapayasmoothie"
	}));	
	
//Warrior Dist
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.Dist, 1, 3), new Object []{
		"YSY",
		"BDR",
		"TsG",
		
			'D', Ingredients.DistH2O, 'Y', new ItemStack(Items.dye, 14, 14), 
			'S', Ingredients.GelatinCrystal, 's', Items.sugar, 'B', "foodLemonsmoothie", 'T', "foodLimesmoothie", 
			'R', "foodOrangesmoothie", 'G', "foodPersimmonsmoothie"
	}));

//Health Dist
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.Dist, 1, 4), new Object []{
		"YSY",
		"BDR",
		"TsG",
		
			'D', Ingredients.DistH2O, 'Y', new ItemStack(Items.dye, 1, 1), 
			'S', Ingredients.GelatinCrystal, 's', Items.sugar, 'B', "foodMelonsmoothie", 'T', "foodMangosmoothie", 
			'R', "foodStarfruitsmoothie", 'G', "foodKiwismoothie"
	}));

//Night Vision Dist
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.Dist, 1, 6), new Object []{
		"ySY",
		"BDR",
		"TsG",
		
			'D', Ingredients.DistH2O, 'Y', new ItemStack(Items.dye, 5, 5), 'y', new ItemStack(Items.dye, 4, 4),
			'S', Ingredients.GelatinCrystal, 's', Items.sugar, 'B', "foodBlackberrysmoothie", 'T', "foodCherrysmoothie", 
			'R', "foodPeachsmoothie", 'G', "foodPomegranatesmoothie"
	}));
	
//Torch Dist
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.Dist, 1, 7), new Object []{
		"YSY",
		"LDL",
		"LsL",
		
			'D', Ingredients.DistH2O, 'Y', new ItemStack(Items.dye, 11, 11), 
			'S', Ingredients.GelatinCrystal, 's', Items.sugar, 'L', Utilities.GelatinLamp
	}));
	
//Explosive Dist
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.Dist, 1, 8), new Object []{
		"ySY",
		"RDR",
		"TsT",
		
			'D', Ingredients.DistH2O, 'Y', new ItemStack(Items.dye, 0, 0), 'y', new ItemStack(Items.dye, 14, 14), 
			'S', Ingredients.GelatinCrystal, 's', Items.sugar, 'T', Storage.GroundTriliteJar, 
			'R', Storage.GroundRDXJar
	}));
	
//Kracken Dist
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.Dist, 1, 9), new Object []{
		"YSY",
		"BDR",
		"GsG",
		
			'D', Ingredients.DistH2O, 'Y', new ItemStack(Items.dye, 6, 6), 
			'S', Ingredients.GelatinCrystal, 's', Items.sugar, 'B', "foodBlueberrysmoothie",
			'R', "foodBlackberrysmoothie", 'G', "listAllfishraw"
	}));			
		
//Dragon Dist
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.Dist, 1, 10), new Object []{
		"VHV",
		"IGW",
		"VTV",
		
			'G', Ingredients.DistLav, 'T', Ingredients.TravellerSolution, 'W', Ingredients.WarriorSolution, 
			'I', Ingredients.IronSkinSolution, 'V', Ingredients.GelatinCrystalVibrant, 'H', Ingredients.HotSauceSolution
	});				
		
//Hot Sauce Dist
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.Dist, 1, 5), new Object []{
		"ySY",
		"PDP",
		"AsC",
		
			'D', Ingredients.DistH2O, 'P', "listAllpepper", 'C', Items.carrot, 
			'A', Items.apple, 'S', Ingredients.GelatinCrystal, 'Y', new ItemStack(Items.dye, 1, 1), 
			'y', new ItemStack(Items.dye, 14, 14), 's', Items.sugar
	}));		
		
//Creeper Dist
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.Dist, 1, 11), new Object []{
		"YSY",
		"GDG",
		"GsG",
		
			'D', Ingredients.DistH2O, 'G', Items.gunpowder, 'Y', new ItemStack(Items.dye, 10, 10), 
			'S', Ingredients.GelatinCrystal, 's', Items.sugar
	});
		
//Skeleton Dist
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.Dist, 1, 12), new Object []{
		"YSY",
		"BDB",
		"BsB",
		
			'D', Ingredients.DistH2O, 'B', Items.bone, 'Y', new ItemStack(Items.dye, 15, 15), 
			'S', Ingredients.GelatinCrystal, 's', Items.sugar
	});			
		
//Zombie Dist
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.Dist, 1, 13), new Object []{
		"ySY",
		"BDB",
		"BsB",
		
			'D', Ingredients.DistH2O, 'B', Items.rotten_flesh, 'y', new ItemStack(Items.dye, 2, 2), 
			'Y', new ItemStack(Items.dye, 4, 4), 'S', Ingredients.GelatinCrystal, 's', Items.sugar
	});	
	
}


public static void OrbRecipes() {
	
//Gelatin Orb(Tier 1)
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinOrbT1), new Object []{
		"GGG",
		"GSG",
		"GGG",
		
			'G', Ingredients.UtilityGlassT1, 'S', Ingredients.GelatinShard
	});		
	
//Gelatin Orb(Tier 2)
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinOrbT2), new Object []{
		"GGG",
		"GCG",
		"GGG",
		
			'G', Ingredients.UtilityGlassT2, 'C', Ingredients.GelatinCrystal
	});		
		
//Gelatin Orb(Tier 3)
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinOrbT3), new Object []{
		"GGG",
		"GCG",
		"GGG",
		
			'G', Ingredients.UtilityGlassT3, 'C', Ingredients.GelatinCrystalVibrant
	});
	
}	
	

public static void SolutionRecipes() {
	
//Gelatin Solution
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.GelatinSolutionJar), new Object [] {
		"   ",
		"JSs",
		" Cc",
		
			'S', Utilities.Smeltry, 's', Storage.GroundSugarJar, 'J', Ingredients.GlassJar,
			'C', "dustCharcoal", 'c', Storage.PurifiedCollagenSolutionJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.GelatinSolutionJar), new Object [] {
		"   ",
		"JSs",
		" Cc",
		
			'S', Utilities.GChamberT2, 's', Storage.GroundSugarJar, 'J', Ingredients.GlassJar,
			'C', "dustCharcoal", 'c', Storage.PurifiedCollagenSolutionJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.GelatinSolutionJar), new Object [] {
		"   ",
		"JSs",
		" Cc",
		
			'S', Utilities.GChamberT3, 's', Storage.GroundSugarJar, 'J', Ingredients.GlassJar, 
			'C', "dustCharcoal", 'c', Storage.PurifiedCollagenSolutionJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.GelatinSolutionJar, 2), new Object [] {
		"   ",
		"JSs",
		"JCc",
		
			'S', Utilities.GChamberT3, 's', Storage.GroundSugarJar, 'J', Ingredients.GlassJar, 
			'C', "dustCharcoal", 'c', Storage.PurifiedCollagenSolutionJar
	}));
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat), new Object []{
		"JJJ",
		"JVJ",
		"JJJ",
		
			'J', Storage.GelatinSolutionJar, 'V', Utilities.TheVat
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionJar, 8), new Object []{
		"JJJ",
		"JVJ",
		"JJJ",
		
			'J', Ingredients.GlassJar, 'V', Storage.GelatinSolutionVat
	});	
	
//Miner Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.MinerSolution), new Object []{
		" C ",
		" DR",
		" bB",
		
			'D', Ingredients.Dist, 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.MinerSolution), new Object []{
		" C ",
		"LD ",
		"Bb ",
		
			'D', Ingredients.Dist, 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.MinerSolution, 2), new Object []{
		" C ",
		"LDR",
		"BbB",
		
			'D', Ingredients.Dist, 'b', new ItemStack(Ingredients.BunsenBurner, 1, 1), 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), 
			'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
//Traveller Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.TravellerSolution), new Object []{
		" C ",
		" DR",
		" bB",
		
			'D', new ItemStack(Ingredients.Dist, 1, 1), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.TravellerSolution), new Object []{
		" C ",
		"LD ",
		"Bb ",
		
			'D', new ItemStack(Ingredients.Dist, 1, 1), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.TravellerSolution, 2), new Object []{
		" C ",
		"LDR",
		"BbB",
		
			'D', new ItemStack(Ingredients.Dist, 1, 1), 'b', new ItemStack(Ingredients.BunsenBurner, 1, 1), 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), 
			'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
//Iron Skin Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.IronSkinSolution), new Object []{
		" C ",
		" DR",
		" bB",
		
			'D', new ItemStack(Ingredients.Dist, 2, 2), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.IronSkinSolution), new Object []{
		" C ",
		"LD ",
		"Bb ",
		
			'D', new ItemStack(Ingredients.Dist, 2, 2), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.IronSkinSolution, 2), new Object []{
		" C ",
		"LDR",
		"BbB",
		
			'D', new ItemStack(Ingredients.Dist, 2, 2), 'b', new ItemStack(Ingredients.BunsenBurner, 1, 1), 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), 
			'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
//Warrior Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WarriorSolution), new Object []{
		" C ",
		" DR",
		" bB",
		
			'D', new ItemStack(Ingredients.Dist, 3, 3), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WarriorSolution), new Object []{
		" C ",
		"LD ",
		"Bb ",
		
			'D', new ItemStack(Ingredients.Dist, 3, 3), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WarriorSolution, 2), new Object []{
		" C ",
		"LDR",
		"BbB",
		
			'D', new ItemStack(Ingredients.Dist, 3, 3), 'b', new ItemStack(Ingredients.BunsenBurner, 1, 1), 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), 
			'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
//Health Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.HealthSolution), new Object []{
		" C ",
		" DR",
		" bB",
		
			'D', new ItemStack(Ingredients.Dist, 4, 4), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.HealthSolution), new Object []{
		" C ",
		"LD ",
		"Bb ",
		
			'D', new ItemStack(Ingredients.Dist, 4, 4), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.HealthSolution, 2), new Object []{
		" C ",
		"LDR",
		"BbB",
		
			'D', new ItemStack(Ingredients.Dist, 4, 4), 'b', new ItemStack(Ingredients.BunsenBurner, 1, 1), 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), 
			'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});

//Hot Sauce Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.HotSauceSolution), new Object []{
		" C ",
		" DR",
		" bB",
		
			'D', new ItemStack(Ingredients.Dist, 5, 5), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.HotSauceSolution), new Object []{
		" C ",
		"LD ",
		"Bb ",
		
			'D', new ItemStack(Ingredients.Dist, 5, 5), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.HotSauceSolution, 2), new Object []{
		" C ",
		"LDR",
		"BbB",
		
			'D', new ItemStack(Ingredients.Dist, 5, 5), 'b', new ItemStack(Ingredients.BunsenBurner, 1, 1), 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), 
			'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
//Night Vision Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.NightVisionSolution), new Object []{
		" C ",
		" DR",
		" bB",
		
			'D', new ItemStack(Ingredients.Dist, 6, 6), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.NightVisionSolution), new Object []{
		" C ",
		"LD ",
		"Bb ",
		
			'D', new ItemStack(Ingredients.Dist, 6, 6), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.NightVisionSolution, 2), new Object []{
		" C ",
		"LDR",
		"BbB",
		
			'D', new ItemStack(Ingredients.Dist, 6, 6), 'b', new ItemStack(Ingredients.BunsenBurner, 1, 1), 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), 
			'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
//Torch Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.TorchSolution), new Object []{
		" C ",
		" DR",
		" bB",
		
			'D', new ItemStack(Ingredients.Dist, 7, 7), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.TorchSolution), new Object []{
		" C ",
		"LD ",
		"Bb ",
		
			'D', new ItemStack(Ingredients.Dist, 7, 7), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.TorchSolution, 2), new Object []{
		" C ",
		"LDR",
		"BbB",
		
			'D', new ItemStack(Ingredients.Dist, 7, 7), 'b', new ItemStack(Ingredients.BunsenBurner, 1, 1), 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), 
			'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
//CompB Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CompBSolution), new Object []{
		" C ",
		" DR",
		" bB",
		
			'D', new ItemStack(Ingredients.Dist, 8, 8), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CompBSolution), new Object []{
		" C ",
		"LD ",
		"Bb ",
		
			'D', new ItemStack(Ingredients.Dist, 8, 8), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CompBSolution, 2), new Object []{
		" C ",
		"LDR",
		"BbB",
		
			'D', new ItemStack(Ingredients.Dist, 8, 8), 'b', new ItemStack(Ingredients.BunsenBurner, 1, 1), 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), 
			'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
//Kracken Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.KrackenSolution), new Object []{
		" C ",
		" DR",
		" bB",
		
			'D', new ItemStack(Ingredients.Dist, 9, 9), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.KrackenSolution), new Object []{
		" C ",
		"LD ",
		"Bb ",
		
			'D', new ItemStack(Ingredients.Dist, 9, 9), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.KrackenSolution, 2), new Object []{
		" C ",
		"LDR",
		"BbB",
		
			'D', new ItemStack(Ingredients.Dist, 9, 9), 'b', new ItemStack(Ingredients.BunsenBurner, 1, 1), 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), 
			'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
//Dragon Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.DragonSolution), new Object []{
		" C ",
		" DR",
		" bB",
		
			'D', new ItemStack(Ingredients.Dist, 10, 10), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.DragonSolution), new Object []{
		" C ",
		"LD ",
		"Bb ",
		
			'D', new ItemStack(Ingredients.Dist, 10, 10), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.DragonSolution, 2), new Object []{
		" C ",
		"LDR",
		"BbB",
		
			'D', new ItemStack(Ingredients.Dist, 10, 10), 'b', new ItemStack(Ingredients.BunsenBurner, 1, 1), 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), 
			'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
//Creeper Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CreeperSolution), new Object []{
		" C ",
		" DR",
		" bB",
		
			'D', new ItemStack(Ingredients.Dist, 11, 11), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CreeperSolution), new Object []{
		" C ",
		"LD ",
		"Bb ",
		
			'D', new ItemStack(Ingredients.Dist, 11, 11), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CreeperSolution, 2), new Object []{
		" C ",
		"LDR",
		"BbB",
		
			'D', new ItemStack(Ingredients.Dist, 11, 11), 'b', new ItemStack(Ingredients.BunsenBurner, 1, 1), 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), 
			'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
//Skeleton Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.SkeletonSolution), new Object []{
		" C ",
		" DR",
		" bB",
		
			'D', new ItemStack(Ingredients.Dist, 12, 12), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.SkeletonSolution), new Object []{
		" C ",
		"LD ",
		"Bb ",
		
			'D', new ItemStack(Ingredients.Dist, 12, 12), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.SkeletonSolution, 2), new Object []{
		" C ",
		"LDR",
		"BbB",
		
			'D', new ItemStack(Ingredients.Dist, 12, 12), 'b', new ItemStack(Ingredients.BunsenBurner, 1, 1), 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), 
			'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
//Zombie Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.ZombieSolution), new Object []{
		" C ",
		" DR",
		" bB",
		
			'D', new ItemStack(Ingredients.Dist, 13, 13), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.ZombieSolution), new Object []{
		" C ",
		"LD ",
		"Bb ",
		
			'D', new ItemStack(Ingredients.Dist, 13, 13), 'b', Ingredients.BunsenBurner, 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.ZombieSolution, 2), new Object []{
		" C ",
		"LDR",
		"BbB",
		
			'D', new ItemStack(Ingredients.Dist, 13, 13), 'b', new ItemStack(Ingredients.BunsenBurner, 1, 1), 'B', Ingredients.GlassBottle, 
			'C', Ingredients.GlassCondensingCoil, 'R', new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), 
			'L', new ItemStack(Ingredients.GlassCondensingCoil, 1, 1)
	});
	


}


public static void IngRecipes() {
	
//Clay Juicer
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.ClayJuicer), new Object []{
		"   ",
		" C ",
		"CCC",
		
			'C', Items.clay_ball
	});	
	
//Iron Stamp
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.IronStamp), new Object [] {
		" N ",
		"NIN",
		"NNN",
		
			'I', "ingotLead", 'N', "nuggetIron"
	}));	
		
//Heating Element
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.HeatingElement), new Object [] {
		"RBR",
		"BNB",
		"RBR",
		
			'R', "dustRedstone", 'B', "ingotBronze", 'N', Items.gold_nugget
	}));
	
//Heating ElementT2
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.HeatingElement, 1, 1), new Object [] {
		"RBR",
		"BHB",
		"RBR",
		
			'R', "nuggetPulsatingIron", 'B', "ingotEnergeticAlloy", 'H', new ItemStack(Ingredients.HeatingElement)
	}));
	
//Cooling Element
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.CoolingElement), new Object []{
		"RBR",
		"BNB",
		"RBR",
		
			'B', "ingotBronze", 'N', Items.gold_nugget, 'R', new ItemStack(Items.dye, 4, 4)
	}));
	
//Bunsen Burner
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.BunsenBurner), new Object [] {
		" C ",
		" I ",
		"IHI",
		
			'I', Items.iron_ingot, 'H', Ingredients.HeatingElement, 'C', "ingotCopper"
	}));
	
//Bunsen BurnerT2
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.BunsenBurner, 1, 1), new Object [] {
		" D ",
		" I ",
		"IHI",
		
			'I', "ingotPulsatingIron", 'H', new ItemStack(Ingredients.HeatingElement, 1, 1), 'D', Ingredients.GelatinAlloyDark
	}));
	
//Gelatinous Soil
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinousSoil), new Object []{
		"GNG",
		"NPN",
		"GNG",
		
			'N', Items.gold_nugget, 'P', new ItemStack(Blocks.dirt, 1, 2), 'G', Ingredients.GelatinShard
	});
	
//Pack-U-Lating Spindle
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.PackUlatingSpindle), new Object []{
		"PPP",
		"GSG",
		"PPP",
		
			'S', Items.stick, 'P', Items.paper, 'G', "itemBasicGear"
	}));
	
//Crafting Medallion
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CraftingMedallion), new Object []{
		" D ",
		"DCD",
		" D ",
		
			'C', Blocks.cobblestone, 'D', Blocks.dirt
	});
	
//Potato Medallion
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.PotatoMedallion), new Object [] {
		"PCP",
		"CGC",
		"PCP",
		
			'G', Utilities.GChamberT3, 'P', Items.baked_potato, 'C', Ingredients.GelatinCrystalVibrant
	});

}


public static void GlasswareRecipes() {
		
//Glass Pane	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.glass_pane), new Object []{
		"   ",
		"BB ",
		"BB ",
		
			'B', Ingredients.GlassBlank
	});
	
//Glass Blank
	GameRegistry.addSmelting(Blocks.glass, new ItemStack(Ingredients.GlassBlank, 8), 0.1F);
	
	GameRegistry.addSmelting(Blocks.stained_glass, new ItemStack(Ingredients.GlassBlank, 8), 0.1F);
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBlank, 8), new Object []{
		"   ",
		" SB",
		" C ",
		
			'S', Utilities.Smeltry, 'B', Blocks.glass, 'C', Ingredients.GroundCharcoal
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBlank, 8), new Object []{
		"   ",
		" SB",
		" C ",
		
			'S', Utilities.Smeltry, 'B', Blocks.stained_glass, 'C', Ingredients.GroundCharcoal
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBlank, 8), new Object []{
		"   ",
		" GB",
		" C ",
		
			'G', Utilities.GChamberT2, 'B', Blocks.glass, 'C', Ingredients.GroundCharcoal
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBlank, 8), new Object []{
		"   ",
		" GB",
		" C ",
		
			'G', Utilities.GChamberT2, 'B', Blocks.stained_glass, 'C', Ingredients.GroundCharcoal
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBlank, 8), new Object []{
		"   ",
		" GB",
		" C ",
		
			'G', Utilities.GChamberT3, 'B', Blocks.glass, 'C', Ingredients.GroundCharcoal
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBlank, 8), new Object []{
		"   ",
		" GB",
		" C ",
		
			'G', Utilities.GChamberT3, 'B', Blocks.stained_glass, 'C', Ingredients.GroundCharcoal
	});
	
	GameRegistry.addShapelessRecipe(new ItemStack(Ingredients.GlassBlank, 8),
			Storage.GlassBarrel);
		
//Funnel
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassFunnel), new Object []{
		"G G",
		"G G",
		" G ",
		
			'G', Ingredients.GlassBlank
	});

//Glass Gelatin Mold
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassGelatinMold), new Object [] {
		"   ",
		"B B",
		"BBB",
			
			'B', Ingredients.GlassBlank
	});
	
//Glass Capillary Tube
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassCondensingCoil), new Object []{
		"G G",
		"G G",
		"G G",
		
			'G', Ingredients.GlassBlank
	});
	
//Glass Condensing Coil Left
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassCondensingCoil, 1, 1), new Object []{
		"G  ",
		"GGG",
		"  G",
		
			'G', Ingredients.GlassBlank
	});
	
//Glass Condensing Coil Right
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassCondensingCoil, 2, 2), new Object []{
		"  G",
		"GGG",
		"G  ",
		
			'G', Ingredients.GlassBlank
	});
		
//Glass Bottle
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBottle), new Object [] {
		" B ",
		"B B",
		"BBB",
			
			'B', Ingredients.GlassBlank
	});
		
//Glass Dish
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassDish), new Object [] {
		"   ",
		" G ",	
		"BBB",
			
			'B', Ingredients.GlassBlank, 'G', Utilities.GChamberT3
	});	
	
//Glass Jar
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassJar), new Object [] {
		"BBB",
		"B B",	
		"BBB",
			
			'B', Ingredients.GlassBlank
	});
	
}
	

public static void MaterialRecipes() {	
		
//Gelatin Alloy		
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GelatinAlloy), new Object []{
		" G ",
		"IS ",
		" C ",
			
			'I', "ingotSteel", 'G', Storage.GelatinJar, 'S', Utilities.Smeltry, 'C', Storage.GroundCharcoalJar
	}));

	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GelatinAlloy), new Object []{
		" G ",
		"IS ",
		" C ",
			
			'I', "ingotSteel", 'G', Storage.GelatinJar, 'S', Utilities.GChamberT2, 'C', Storage.GroundCharcoalJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GelatinAlloy, 2), new Object []{
		" G ",
		"IS ",
		" C ",
			
			'I', "ingotSteel", 'G', Storage.GelatinJar, 'S', Utilities.GChamberT3, 'C', Storage.GroundCharcoalJar
	}));
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinAlloy), new Object []{
		"NNN",
		"N N",
		"NNN",
		
			'N', Ingredients.GelatinAlloyNugget
	});		
	
//Gelatin Alloy Dark	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GelatinAlloyDark), new Object []{
		" G ",
		"ISP",
		" C ",
			
			'I', "ingotDarkSteel", 'G', Ingredients.GelatinAlloy, 'S', Utilities.GChamberT2, 
			'C', Storage.GroundCharcoalJar, 'P', "itemPulsatingCrystal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GelatinAlloyDark), new Object []{
		" G ",
		"ISP",
		" C ",
			
			'I', "ingotDarkSteel", 'G', Ingredients.GelatinAlloy, 'S', Utilities.GChamberT3, 
			'C', Storage.GroundCharcoalJar, 'P', "itemPulsatingCrystal"
	}));
	
//Gelatin Crystal
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinCrystal), new Object []{
		"GGG",
		"ECD",
		"GcG",
		
			'D', Items.diamond, 'E', Items.emerald, 'G', Gelatin.GelatinCube, 
			'C', Utilities.Smeltry, 'c', Storage.GroundCharcoalJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinCrystal), new Object []{
		"GGG",
		"ECD",
		"GcG",
		
			'D', Items.diamond, 'E', Items.emerald, 'G', Gelatin.GelatinCube, 
			'C', Utilities.GChamberT2, 'c', Storage.GroundCharcoalJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinCrystal), new Object []{
		"GGG",
		"ECD",
		"GcG",
		
			'D', Items.diamond, 'E', Items.emerald, 'G', Gelatin.GelatinCube, 
			'C', Utilities.GChamberT3, 'c', Storage.GroundCharcoalJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinCrystal), new Object []{
		"SSS",
		"S S",
		"SSS",
		
			'S', Ingredients.GelatinShard			
	});
	
	
//Vibrant Gelatin Crystal		
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GelatinCrystalVibrant), new Object []{
		"GGG",
		"VCP",
		"GcG",
		
			'C', Utilities.GChamberT2, 'V', "itemVibrantCrystal", 'P', "itemPulsatingCrystal", 
			'G', Gelatin.GelatinCube, 'c', Storage.GroundCharcoalJar	
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GelatinCrystalVibrant), new Object []{
		"GGG",
		"VCP",
		"GcG",
		
			'C', Utilities.GChamberT3, 'V', "itemVibrantCrystal", 'P', "itemPulsatingCrystal", 
			'G', Gelatin.GelatinCube, 'c', Storage.GroundCharcoalJar	
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GelatinCrystalVibrant), new Object []{
		"NNN",
		"N N",
		"NNN",
		
			'N', Ingredients.GelatinShardVibrant
	}));
	
//Gelatin Alloy Nugget
	GameRegistry.addShapelessRecipe(new ItemStack(Ingredients.GelatinAlloyNugget, 8),
			Ingredients.GelatinAlloy);
	
//Iron Nugget
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.IronNugget, 9), new Object []{
		"   ",
		" M ",
		" I ",
		
			'M', Ingredients.CraftingMedallion, 'I', Items.iron_ingot
	});		
		
//Diamond Shard
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.DiamondShard, 9), new Object [] {
		"   ",
		" S ",
		" D ",
		
			'S', Ingredients.CraftingMedallion, 'D', Items.diamond		
	});		
		
//Emerald Shard		
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.EmeraldShard, 9), new Object [] {
		"   ",
		" S ",
		" D ",
		
			'S', Ingredients.CraftingMedallion, 'D', Items.emerald				
	});
	
//Gelatin Shard	
	GameRegistry.addShapelessRecipe(new ItemStack(Ingredients.GelatinShard, 8),
		Ingredients.GelatinCrystal);
	
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinShard, 2), new Object []{
		"   ",
		" G ",
		" L ",
		
			'L', Ingredients.GelatinLily, 'G', Utilities.GChamberT1				
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinShard, 4), new Object []{
		"   ",
		" G ",
		" L ",
		
			'L', Ingredients.GelatinLily, 'G', Utilities.GChamberT2				
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinShard, 6), new Object []{
		"   ",
		" G ",
		" L ",
		
			'L', Ingredients.GelatinLily, 'G', Utilities.GChamberT3			
	});
	
//Vibrant Gelatin Shard
	GameRegistry.addShapelessRecipe(new ItemStack(Ingredients.GelatinShardVibrant, 8),
			Ingredients.GelatinCrystalVibrant);
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinShardVibrant, 2), new Object []{
		"   ",
		" G ",
		" L ",
		
			'L', Ingredients.GelatinLilyVibrant, 'G', Utilities.GChamberT1				
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinShardVibrant, 2), new Object []{
		"   ",
		" G ",
		" L ",
		
			'L', Ingredients.GelatinLilyVibrant, 'G', Utilities.GChamberT2				
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinShardVibrant, 4), new Object []{
		"   ",
		" G ",
		" L ",
		
			'L', Ingredients.GelatinLilyVibrant, 'G', Utilities.GChamberT3			
	});
	
//Ice Shard
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.IceShard), new Object []{
		"SSS",
		"SMS",
		"SSS",
		
			'M', Ingredients.CraftingMedallion, 'S', Items.snowball
	});	
	
//Iron Rod
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.IronRod), new Object []{
		"  N",
		" N ",
		"N  ",
			
			'N', "nuggetIron"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.IronRod), new Object []{
		"N  ",
		" N ",
		"  N",
		
			'N', "nuggetIron"					
	}));
	
//Gelatin Alloy Gear
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GelatinAlloyGear), new Object []{
		"RGR",
		"G G",
		"RGR",
		
			'G', Ingredients.GelatinAlloy, 'R', Ingredients.IronRod
	}));
	
//Cracked Bone
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CrackedBone), new Object [] {
		"   ",
		" S ",
		" B ",
		
			'S', Utilities.StampMill, 'B', Items.bone					
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CrackedBone), new Object [] {
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT1, 'B', Items.bone					
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CrackedBone), new Object [] {
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT2, 'B', Items.bone					
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CrackedBone), new Object [] {
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Items.bone					
	});
	
	GameRegistry.addShapelessRecipe(new ItemStack(Ingredients.CrackedBone, 8),
			Storage.CrackedBarrel);
		
//Gelatin Lily
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLily, 2), new Object []{
		" G ",
		"STS",
		" G ",
		
			'G', Storage.GelitizerJar, 'T', Utilities.Terrarium, 'S', Ingredients.GelatinShard
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLily, 4), new Object []{
		" G ",
		"SCS",
		" G ",
		
			'G', Storage.GelitizerJar, 'C', Utilities.GChamberT3, 'S', Ingredients.GelatinShard
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLily, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.LilyBarrel
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLily, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.LilyBarrel
	});
	
//Gelatin Lily Vibrant
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLilyVibrant, 2), new Object []{
		" G ",
		"STS",
		" G ",
		
			'G', Storage.GelitizerJar, 'T', Utilities.Terrarium, 'S', Ingredients.GelatinShardVibrant
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLilyVibrant, 4), new Object []{
		" G ",
		"SCS",
		" G ",
		
			'G', Storage.GelitizerJar, 'C', Utilities.GChamberT3, 'S', Ingredients.GelatinShardVibrant
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLilyVibrant, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.LilyVibrantBarrel
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLilyVibrant, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.LilyVibrantBarrel
	});
	
}


public static void GroundRecipes() {
	
//Ground Gelatin
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundGelatin), new Object []{
		"   ",
		" M ",
		" C ",
		
			'M', Utilities.MortarandPestel, 'C', Gelatin.GelatinCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundGelatin), new Object []{
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT1, 'C', Gelatin.GelatinCube 
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundGelatin), new Object []{
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT2, 'C', Gelatin.GelatinCube 
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundGelatin), new Object []{
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT3, 'C', Gelatin.GelatinCube 
	});
	
//Ground Marrow
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundMarrow), new Object []{
		"   ",
		" M ",
		" C ",
		
			'M', Utilities.MortarandPestel, 'C', Ingredients.CrackedBone
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundMarrow), new Object []{
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT1, 'C', Ingredients.CrackedBone
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundMarrow), new Object []{
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT2, 'C', Ingredients.CrackedBone
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundMarrow), new Object []{
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT3, 'C', Ingredients.CrackedBone
	});

	GameRegistry.addShapelessRecipe(new ItemStack(Ingredients.GroundMarrow, 8),
			Storage.GroundMarrowJar);
	
//Ground Marrow Jar	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundMarrowJar), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'P', Ingredients.GlassJar, 'D', Ingredients.GroundMarrow
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundMarrowJar, 8), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'D', Ingredients.GlassJar, 'P', Storage.GroundMarrowBarrel
	});
	
//Ground Flour Dish
	GameRegistry.addSmelting(Ingredients.GroundFlour, new ItemStack(Items.bread), 0.0F);
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundFlour), new Object []{
		"   ",
		" M ",
		" W ",
		
			'M', Utilities.MortarandPestel, 'W', Items.wheat
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundFlour), new Object []{
		"   ",
		" G ",
		" W ",
		
			'G', Utilities.GChamberT1, 'W', Items.wheat
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundFlour), new Object []{
		"   ",
		" G ",
		" W ",
		
			'G', Utilities.GChamberT2, 'W', Items.wheat
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundFlour), new Object []{
		"   ",
		" G ",
		" W ",
		
			'G', Utilities.GChamberT3, 'W', Items.wheat
	});
	
//Ground Flour Jar	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundFlourJar), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'P', Ingredients.GlassJar, 'D', Ingredients.GroundFlour
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundFlourJar, 8), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'D', Ingredients.GlassJar, 'P', Storage.GroundFlourBarrel
	});
	
//Ground Meat Dish		
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" S ",
		" M ",
		
			'S', Utilities.StampMill, 'M', "listAllmeatraw"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" G ",
		" M ",
		
			'G', Utilities.GChamberT1, 'M', "listAllmeatraw"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" G ",
		" M ",
		
			'G', Utilities.GChamberT2, 'M', "listAllmeatraw"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" G ",
		" M ",
	
			'G', Utilities.GChamberT3, 'M', "listAllmeatraw"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" S ",
		" M ",
		
			'S', Utilities.StampMill, 'M', Items.beef
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" G ",
		" M ",
		
			'G', Utilities.GChamberT1, 'M', Items.beef
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" G ",
		" M ",
		
			'G', Utilities.GChamberT2, 'M', Items.beef
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" G ",
		" M ",
		
			'G', Utilities.GChamberT3, 'M', Items.beef
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" S ",
		" M ",
		
			'S', Utilities.StampMill, 'M', Items.chicken
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" G ",
		" M ",
		
			'G', Utilities.GChamberT1, 'M', Items.chicken
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" G ",
		" M ",
		
			'G', Utilities.GChamberT2, 'M', Items.chicken
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" G ",
		" M ",
		
			'G', Utilities.GChamberT3, 'M', Items.chicken
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" S ",
		" M ",
		
			'S', Utilities.StampMill, 'M', Items.porkchop
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" G ",
		" M ",
		
			'G', Utilities.GChamberT1, 'M', Items.porkchop
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" G ",
		" M ",
		
			'G', Utilities.GChamberT2, 'M', Items.porkchop
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeat), new Object []{
		"   ",
		" G ",
		" M ",
		
			'G', Utilities.GChamberT3, 'M', Items.porkchop
	}));
	
//Ground Meat Jar	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundMeatJar), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'P', Ingredients.GlassJar, 'D', Ingredients.GroundMeat
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundMeatJar, 8), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'D', Ingredients.GlassJar, 'P', Storage.GroundMeatBarrel
	});
	
//Ground Coal
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundCoal), new Object [] {
		"   ",
		" M ",
		" C ",
		
			'M', Utilities.MortarandPestel, 'C', Items.coal		
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundCoal), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT1, 'C', Items.coal		
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundCoal), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT2, 'C', Items.coal		
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundCoal), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT3, 'C', Items.coal		
	});
	
//Ground Coal Jar	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundCoalJar), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'P', Ingredients.GlassJar, 'D', Ingredients.GroundCoal
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundCoalJar, 8), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'D', Ingredients.GlassJar, 'P', Storage.CoalBarrel
	});
	
//Ground Charcoal
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundCharcoal), new Object [] {
		"   ",
		" M ",
		" C ",
			
			'M', Utilities.MortarandPestel, 'C', new ItemStack(Items.coal, 1, 1)
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundCharcoal), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT1, 'C', new ItemStack(Items.coal, 1, 1)
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundCharcoal), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT2, 'C', new ItemStack(Items.coal, 1, 1)
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundCharcoal), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT3, 'C', new ItemStack(Items.coal, 1, 1)
	}));
	
	GameRegistry.addShapelessRecipe(new ItemStack(Ingredients.GroundCharcoal, 8),
			Storage.CharcoalBarrel);
	
//Ground Charoal Jar	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundCharcoalJar), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'P', Ingredients.GlassJar, 'D', Ingredients.GroundCharcoal
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundCharcoalJar, 8), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'D', Ingredients.GlassJar, 'P', Storage.CharcoalBarrel
	});
	
//Wood Pulp
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WoodPulp), new Object []{
		" S ",
		"WSW",
		" W ",
		
			'S', Utilities.MortarandPestel, 'W', Blocks.planks
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WoodPulp), new Object []{
		" W ",
		"WGW",
		" W ",
			
			'G', Utilities.GChamberT1, 'W', Blocks.planks
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WoodPulp), new Object []{
		" W ",
		"WGW",
		" W ",
		
			'G', Utilities.GChamberT2, 'W', Blocks.planks
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WoodPulp), new Object []{
		" W ",
		"WGW",
		" W ",
		
			'G', Utilities.GChamberT3, 'W', Blocks.planks
	});
	
//Wood Pulp Jar	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.WoodPulpJar), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'P', Ingredients.GlassJar, 'D', Ingredients.WoodPulp
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.WoodPulpJar, 8), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'D', Ingredients.GlassJar, 'P', Storage.WoodPulpBarrel
	});	
		
//Gelitizer Jar
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelitizerJar), new Object []{
		"GGG",
		"GBG",
		"GGG",
		
			'G', Ingredients.GroundGelatin, 'B', new ItemStack(Items.dye, 15, 15)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelitizerJar, 8), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'D', Ingredients.GlassJar, 'P', Storage.GelitizerBarrel
	});
	
//Ground Sugar
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundSugarJar), new Object []{
		"SSS",
		"SPS",
		"SSS",
		
			'P', Ingredients.GlassJar, 'S', Items.sugar
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundSugarJar, 8), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'D', Ingredients.GlassJar, 'P', Storage.GroundSugarBarrel
	});
	
//Priming Powder
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.PrimingPowder, 2), new Object []{
		"   ",
		" M ",
		" P ",
		
			'M', Utilities.MortarandPestel, 'P', Items.gunpowder
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.PrimingPowder, 2), new Object []{
		"   ",
		" G ",
		" P ",
		
			'G', Utilities.GChamberT1, 'P', Items.gunpowder
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.PrimingPowder, 3), new Object []{
		"   ",
		" G ",
		" P ",
		
			'G', Utilities.GChamberT2, 'P', Items.gunpowder
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.PrimingPowder, 4), new Object []{
		"   ",
		" G ",
		" P ",
		
			'G', Utilities.GChamberT3, 'P', Items.gunpowder
	});
		
//Tilite Powder
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundTrilite, 2), new Object []{
		"   ",
		" M ",
		" T ",
		
			'M', Utilities.MortarandPestel, 'T', Blocks.tnt
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundTrilite, 2), new Object []{
		"   ",
		" G ",
		" T ",
		
			'G', Utilities.GChamberT1, 'T', Blocks.tnt
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundTrilite, 3), new Object []{
		"   ",
		" G ",
		" T ",
		
			'G', Utilities.GChamberT2, 'T', Blocks.tnt
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundTrilite, 4), new Object []{
		"   ",
		" G ",
		" T ",
		
			'G', Utilities.GChamberT3, 'T', Blocks.tnt
	});			
		
//RDX Powder
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundRDX, 2), new Object []{
		"PCP",
		"CMC",
		"PCP",
		
			'P', Ingredients.PrimingPowder, 'C', Items.clay_ball, 'M', Utilities.MortarandPestel
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundRDX, 2), new Object []{
		"PCP",
		"CGC",
		"PCP",
		
			'P', Ingredients.PrimingPowder, 'C', Items.clay_ball, 'G', Utilities.GChamberT1
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundRDX, 2), new Object []{
		"PCP",
		"CGC",
		"PCP",
		
			'P', Ingredients.PrimingPowder, 'C', Items.clay_ball, 'G', Utilities.GChamberT2
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundRDX, 3), new Object []{
		"PCP",
		"CGC",
		"PCP",
		
			'P', Ingredients.PrimingPowder, 'C', Items.clay_ball, 'G', Utilities.GChamberT3
	});
	
//Charcoal	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.coal, 1, 1), new Object [] {
		"   ",
		" P ",
		" C ",
			
			'P', Utilities.PackUlater, 'C', Ingredients.GroundCharcoal
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.coal, 1, 1), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT3, 'C', Ingredients.GroundCharcoal
	}));
		
//Coal
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.coal), new Object [] {
		"   ",
		" P ",
		" D ",
			
			'P', Utilities.PackUlater, 'D', "dustCoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.coal), new Object [] {
		"   ",
		" G ",
		" D ",
			
			'G', Utilities.GChamberT3, 'D', "dustCoal"
	}));
	
}
		
}






