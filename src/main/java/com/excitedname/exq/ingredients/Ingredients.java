package com.excitedname.exq.ingredients;

import com.excitedname.exq.gelatin.Gelatin;
import com.excitedname.exq.ingredients.distilleries.MinerDistillery;
import com.excitedname.exq.ingredients.glassware.GlassBlank;
import com.excitedname.exq.ingredients.glassware.GlassBottle;
import com.excitedname.exq.ingredients.glassware.GlassDish;
import com.excitedname.exq.ingredients.glassware.GlassExtractionTube;
import com.excitedname.exq.ingredients.glassware.GlassFunnel;
import com.excitedname.exq.ingredients.glassware.GlassGelatinMold;
import com.excitedname.exq.ingredients.glassware.GlassJar;
import com.excitedname.exq.ingredients.glassware.UtilityGlassT1;
import com.excitedname.exq.ingredients.glassware.UtilityGlassT2;
import com.excitedname.exq.ingredients.glassware.UtilityGlassT3;
import com.excitedname.exq.ingredients.ground.GelitilizerJar;
import com.excitedname.exq.ingredients.ground.GroundCharcoalDish;
import com.excitedname.exq.ingredients.ground.GroundCharcoalJar;
import com.excitedname.exq.ingredients.ground.GroundCoalDish;
import com.excitedname.exq.ingredients.ground.GroundCoalJar;
import com.excitedname.exq.ingredients.ground.GroundFlourDish;
import com.excitedname.exq.ingredients.ground.GroundFlourJar;
import com.excitedname.exq.ingredients.ground.GroundGelatin;
import com.excitedname.exq.ingredients.ground.GroundMarrowDish;
import com.excitedname.exq.ingredients.ground.GroundMarrowJar;
import com.excitedname.exq.ingredients.ground.GroundMeatDish;
import com.excitedname.exq.ingredients.ground.GroundMeatJar;
import com.excitedname.exq.ingredients.ground.GroundRDXJar;
import com.excitedname.exq.ingredients.ground.GroundSugarJar;
import com.excitedname.exq.ingredients.ground.GroundTriliteJar;
import com.excitedname.exq.ingredients.ground.PrimingPowderJar;
import com.excitedname.exq.ingredients.ground.WoodPulpDish;
import com.excitedname.exq.ingredients.ground.WoodPulpJar;
import com.excitedname.exq.ingredients.ing.AppleofHealth;
import com.excitedname.exq.ingredients.ing.BunsenBurner;
import com.excitedname.exq.ingredients.ing.CanOSpinach;
import com.excitedname.exq.ingredients.ing.ClayJuicer;
import com.excitedname.exq.ingredients.ing.CoolingElement;
import com.excitedname.exq.ingredients.ing.CraftingMedallion;
import com.excitedname.exq.ingredients.ing.ETool;
import com.excitedname.exq.ingredients.ing.FeatherJar;
import com.excitedname.exq.ingredients.ing.FishinaJar;
import com.excitedname.exq.ingredients.ing.GelatinousCarrot;
import com.excitedname.exq.ingredients.ing.GelatinousSoil;
import com.excitedname.exq.ingredients.ing.HeatingElement;
import com.excitedname.exq.ingredients.ing.IronStamp;
import com.excitedname.exq.ingredients.ing.PackUlatingSpindle;
import com.excitedname.exq.ingredients.ing.PotatoMedallion;
import com.excitedname.exq.ingredients.ing.Shield;
import com.excitedname.exq.ingredients.ing.SpringBoard;
import com.excitedname.exq.ingredients.material.CrackedBone;
import com.excitedname.exq.ingredients.material.CrystalFire;
import com.excitedname.exq.ingredients.material.CrystalIce;
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
		
		MinerDistillery = new MinerDistillery();
		GameRegistry.registerItem(MinerDistillery, "Distillery(Miner)");
		
		ETool = new ETool();
		GameRegistry.registerItem(ETool, "E-Tool");
		
		FeatherJar = new FeatherJar();
		GameRegistry.registerItem(FeatherJar, "Feather Jar");
		
		SpringBoard = new SpringBoard();
		GameRegistry.registerItem(SpringBoard, "Spring Board");
		
		Shield = new Shield();
		GameRegistry.registerItem(Shield, "Shield");
		
		CanOSpinach = new CanOSpinach();
		GameRegistry.registerItem(CanOSpinach, "Can O' Spinach");
		
		AppleofHealth = new AppleofHealth();
		GameRegistry.registerItem(AppleofHealth, "Apple of Health");
		
		GelatinousCarrot = new GelatinousCarrot();
		GameRegistry.registerItem(GelatinousCarrot, "Gelatinous Carrot");
		
		FishinaJar = new FishinaJar();
		GameRegistry.registerItem(FishinaJar, "Fish in a Jar");
		
	}
	
	public static Item MinerDistillery;
	public static Item ETool;
	public static Item FeatherJar;
	public static Item SpringBoard;
	public static Item Shield;
	public static Item CanOSpinach;
	public static Item AppleofHealth;
	public static Item GelatinousCarrot;	
	public static Item FishinaJar;
	
	
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
					
		HotSauceSolution = new HotSauceSolution();
		GameRegistry.registerItem(HotSauceSolution, "Hot Sauce Solution");
				
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
	public static Item NightVisionSolution;
	public static Item TorchSolution;
	public static Item CompBSolution;
	public static Item KrackenSolution;
	public static Item DragonSolution;
	public static Item HotSauceSolution;
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
		
		GlassExtractionTube = new GlassExtractionTube();
		GameRegistry.registerItem(GlassExtractionTube, "Glass Extraction Tube");
		
		GlassGelatinMold = new GlassGelatinMold();
		GameRegistry.registerItem(GlassGelatinMold, "Glass Gelatin Mold");
		
		GlassBottle = new GlassBottle();
		GameRegistry.registerItem(GlassBottle, "Glass Bottle");
		
		GlassDish = new GlassDish();
		GameRegistry.registerItem(GlassDish, "Glass Dish");	
		
		GlassJar = new GlassJar(Blocks.air);
		GameRegistry.registerItem(GlassJar, "Glass Jar");

	}

	public static Item GlassBlank; 
	public static Item UtilityGlassT1;
	public static Item UtilityGlassT2;
	public static Item UtilityGlassT3;
	public static Item GlassFunnel;
	public static Item GlassExtractionTube;
	public static Item GlassGelatinMold;
	public static Item GlassBottle;
	public static Item GlassDish;	
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
		
		CrystalFire = new CrystalFire();
		GameRegistry.registerItem(CrystalFire, "Crystal of Fire");
		
		CrystalIce = new CrystalIce();
		GameRegistry.registerItem(CrystalIce, "Crystal of Ice");
		
		GelatinAlloyNugget = new GelatinAlloyNugget();
		GameRegistry.registerItem(GelatinAlloyNugget, "Gelatin Alloy Nugget");
		
		IronNugget = new IronNugget();
		GameRegistry.registerItem(IronNugget, "Iron Nugget");
		
		DiamondShard = new DiamondShard();
		GameRegistry.registerItem(DiamondShard, "Diamond Shard");
		
		EmeraldShard = new EmeraldShard();
		GameRegistry.registerItem(EmeraldShard, "Emerald Shard");
		
		GelatinShard = new GelatinShard();
		GameRegistry.registerItem(GelatinShard, "Gelatin Shard");
		
		GelatinShardVibrant = new GelatinShardVibrant();
		GameRegistry.registerItem(GelatinShardVibrant, "Gelatin Shard Vibrant");
		
		IceShard = new IceShard();
		GameRegistry.registerItem(IceShard, "Ice Shard");
		
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
	public static Item CrystalFire;
	public static Item CrystalIce;	
	public static Item GelatinAlloyNugget;
	public static Item IronNugget;	
	public static Item DiamondShard;
	public static Item EmeraldShard;	
	public static Item GelatinShard;
	public static Item GelatinShardVibrant;
	public static Item IceShard;
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
		
		GroundMarrowDish = new GroundMarrowDish();
		GameRegistry.registerItem(GroundMarrowDish, "Ground Marrow Dish");
		
		GroundFlourDish = new GroundFlourDish();
		GameRegistry.registerItem(GroundFlourDish, "Ground Flour Dish");
		
		GroundCoalDish = new GroundCoalDish();
		GameRegistry.registerItem(GroundCoalDish, "Ground Coal Dish");
		
		GroundCharcoalDish = new GroundCharcoalDish();
		GameRegistry.registerItem(GroundCharcoalDish, "Ground Charcoal Dish");		
		
		WoodPulpDish = new WoodPulpDish();
		GameRegistry.registerItem(WoodPulpDish, "Wood Pulp Dish");
		
		GroundMeatDish = new GroundMeatDish();
		GameRegistry.registerItem(GroundMeatDish, "Ground Meat Dish");

		GelitilizerJar = new GelitilizerJar();
		GameRegistry.registerItem(GelitilizerJar, "Gelitilizer(Jar)");		
		
		GroundMarrowJar = new GroundMarrowJar();
		GameRegistry.registerItem(GroundMarrowJar, "Ground Marrow Jar");
		
		GroundFlourJar = new GroundFlourJar();
		GameRegistry.registerItem(GroundFlourJar, "Ground Flour Jar");
		
		GroundSugarJar = new GroundSugarJar();
		GameRegistry.registerItem(GroundSugarJar, "Ground Sugar Jar");
		
		GroundCoalJar = new GroundCoalJar();
		GameRegistry.registerItem(GroundCoalJar, "Ground Coal Jar");
				
		GroundCharcoalJar = new GroundCharcoalJar();
		GameRegistry.registerItem(GroundCharcoalJar, "Ground Charcoal Jar");
		
		WoodPulpJar = new WoodPulpJar();
		GameRegistry.registerItem(WoodPulpJar, "Wood Pulp Jar");
		
		PrimingPowderJar = new PrimingPowderJar();
		GameRegistry.registerItem(PrimingPowderJar, "Priming Powder Jar");
		
		GroundTriliteJar = new GroundTriliteJar();
		GameRegistry.registerItem(GroundTriliteJar, "Ground Trilite Jar");
		
		GroundRDXJar = new GroundRDXJar();
		GameRegistry.registerItem(GroundRDXJar, "Ground RDX Jar");
		
		GroundMeatJar = new GroundMeatJar();
		GameRegistry.registerItem(GroundMeatJar, "Ground Meat Jar");
				
	}

	public static Item GroundGelatin;	
	public static Item GroundMarrowDish;
	public static Item GroundFlourDish;	
	public static Item GroundCoalDish;
	public static Item GroundCharcoalDish;
	public static Item WoodPulpDish;
	public static Item GroundMeatDish;	
	public static Item GelitilizerJar;
	public static Item GroundMarrowJar;
	public static Item GroundFlourJar;
	public static Item GroundSugarJar;
	public static Item GroundCoalJar;		//
	public static Item GroundCharcoalJar;
	public static Item WoodPulpJar;			//
	public static Item PrimingPowderJar;	
	public static Item GroundTriliteJar;	
	public static Item GroundRDXJar;		
	public static Item GroundMeatJar;			//	
	
	
	
	
//Recipes	
	
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
		"Ss",
		"Cc",
		
			'S', Utilities.Smeltry, 's', Ingredients.GroundSugarJar, 
			'C', "dustCharcoal", 'c', Storage.PurifiedCollagenSolutionJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.GelatinSolutionJar, 2), new Object [] {
		"Ss",
		"Cc",
		
			'S', Utilities.GChamberT2, 's', Ingredients.GroundSugarJar, 
			'C', "dustCharcoal", 'c', Storage.PurifiedCollagenSolutionJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.GelatinSolutionJar, 3), new Object [] {
		"Ss",
		"Cc",
		
			'S', Utilities.GChamberT3, 's', Ingredients.GroundSugarJar, 
			'C', "dustCharcoal", 'c', Storage.PurifiedCollagenSolutionJar
	}));
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionJar, 8), new Object []{
		"P",
		"B",
		
			'P', Utilities.PackUlater, 'B', Storage.GelatinSolutionVat
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionJar, 8), new Object []{
		"G",
		"B",
		
			'G', Utilities.GChamberT3, 'B', Storage.GelatinSolutionVat
	});
	
//Miner Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.MinerSolution, 3), new Object []{
		"YEY",
		"SDS",
		"YEY",
		
			'Y', new ItemStack(Items.dye, 12, 12), 'D', Ingredients.MinerDistillery, 'S', Ingredients.GelatinShard, 
			'E', Ingredients.ETool
	});
	
//Traveller Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.TravellerSolution, 3), new Object []{
		"YFY",
		"SDS",
		"YBY",
		
			'D', Ingredients.MinerDistillery, 'F', Ingredients.FeatherJar, 'Y', new ItemStack(Items.dye, 6, 6), 
			'S', Ingredients.GelatinShard, 'B', Ingredients.SpringBoard
	});
	
//Iron Skin Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.IronSkinSolution, 3), new Object []{
		"YSY",
		"GDG",
		"YSY",
		
			'Y', new ItemStack(Items.dye, 5, 5), 'D', Ingredients.MinerDistillery, 'S', Ingredients.Shield, 
			'G', Ingredients.GelatinShard
	});	
	
//Warrior
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WarriorSolution, 3), new Object []{
		"YCY",
		"SDS",
		"YCY",
		
			'D', Ingredients.MinerDistillery, 'Y', new ItemStack(Items.dye, 14, 14),
			'S', Ingredients.GelatinShard, 'C', Ingredients.CanOSpinach
	});
	
//Health Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.HealthSolution, 3), new Object []{
		"YAY",
		"SDS",
		"YAY",
		
			'D', Ingredients.MinerDistillery, 'A', Ingredients.AppleofHealth, 
			'Y', new ItemStack(Items.dye, 1, 1), 'S', Ingredients.GelatinShard
	});

//Night Vision Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.NightVisionSolution, 3), new Object []{
		"YGY",
		"SDS",
		"YGY",
		
			'Y', new ItemStack(Items.dye, 2, 2), 'D', Ingredients.MinerDistillery, 'S', Ingredients.GelatinShard, 
			'G', Ingredients.GelatinousCarrot
	});
	
//Torch Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.TorchSolution, 3), new Object []{
		"YTY",
		"TDT",
		"YTY",
		
			'D', Ingredients.MinerDistillery, 'T', Gelatin.GelatinLamp, 'Y', new ItemStack(Items.dye, 11, 11)
	});
	
//Explosive Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CompBSolution, 3), new Object []{
		"YTY",
		"RDR",
		"YTY",
		
			'D', Ingredients.MinerDistillery, 'T', Ingredients.GroundTriliteJar, 
			'Y', new ItemStack(Items.dye), 'R', Ingredients.GroundRDXJar
	});
	
//Kracken Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.KrackenSolution), new Object []{
		"YGY",
		"WDE",
		"YFY",
		
			'Y', new ItemStack(Items.dye, 4, 4), 'D', Ingredients.MinerDistillery, 'W', Ingredients.FishinaJar, 
			'F', Ingredients.FeatherJar, 'E', Ingredients.ETool, 'G', Ingredients.GelatinousCarrot
	});			
		
//Dragon Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.DragonSolution), new Object []{
		"VHV",
		"IGW",
		"VTV",
		
			'G', Utilities.GChamberT3, 'T', Ingredients.TravellerSolution, 'W', Ingredients.WarriorSolution, 
			'I', Ingredients.IronSkinSolution, 'V', Ingredients.GelatinShardVibrant, 'H', Ingredients.HotSauceSolution
	});				
		
//Hot Sauce Solution
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.HotSauceSolution, 3), new Object []{
		"PSP",
		"ADC",
		"PSP",
		
			'D', Ingredients.MinerDistillery, 'P', "listAllpepper", 'C', Items.carrot, 
			'A', Items.apple, 'S', Ingredients.GelatinShard
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.HotSauceSolution, 3), new Object []{
		"OSO",
		"ADC",
		"RSR",
		
			'D', Ingredients.MinerDistillery, 'O', new ItemStack(Items.dye, 14, 14), 'R', new ItemStack(Items.dye, 1, 1), 
			'C', Items.carrot, 'A', Items.apple, 'S', Ingredients.GelatinShard
	}));		
		
//Creeper Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CreeperSolution), new Object []{
		"YGY",
		"SDS",
		"YGY",
		
			'D', Ingredients.MinerDistillery, 'G', Items.gunpowder, 'Y', new ItemStack(Items.dye, 10, 10), 
			'S', Ingredients.GelatinShard
	});
		
//Skeleton Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.SkeletonSolution, 3), new Object []{
		"YBY",
		"SDS",
		"YBY",
		
			'D', Ingredients.MinerDistillery, 'B', Items.bone, 'Y', new ItemStack(Items.dye, 15, 15), 
			'S', Ingredients.GelatinShard
	});			
		
//Zombie Solution
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.ZombieSolution), new Object []{
		"GFG",
		"SDS",
		"BFB",
		
			'D', Ingredients.MinerDistillery, 'F', Items.rotten_flesh, 'G', new ItemStack(Items.dye, 2, 2), 
			'B', new ItemStack(Items.dye, 4, 4), 'S', Ingredients.GelatinShard
	});	

}


public static void IngRecipes() {
	
//Clay Juicer
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.ClayJuicer), new Object []{
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
		"BCB",
		"RBR",
		
			'R', "dustRedstone", 'B', "ingotBronze", 'C', Ingredients.CrystalFire
	}));
	
//Cooling Element
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.CoolingElement), new Object []{
		"RBR",
		"BCB",
		"RBR",
		
			'B', "ingotBronze", 'C', Ingredients.CrystalIce, 'R', Items.redstone
	}));
	
//Bunsen Burner
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.BunsenBurner), new Object [] {
		" c ",
		" N ",
		"ICI",
		
			'I', Items.iron_ingot, 'C', Ingredients.GroundCharcoalJar, 'N', "nuggetIron", 'c', "nuggetCopper"
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
	
//E-Tool
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.ETool), new Object []{
		" NG",
		" RN",
		"R  ",
		
			'R', Ingredients.IronRod, 'G', Ingredients.GelatinShard, 'N', "nuggetIron"
	}));
	
//Feather Jar
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.FeatherJar), new Object []{
		"FFF",
		"FPF",
		"FFF",
		
			'F', Items.feather, 'P', Utilities.PackUlater
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.FeatherJar), new Object []{
		"FFF",
		"FGF",
		"FFF",
		
			'G', Utilities.GChamberT3, 'F', Items.feather
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.FeatherJar, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Storage.FeatherBarrel
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.FeatherJar, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Storage.FeatherBarrel
	});
	
//Spring Board
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.SpringBoard), new Object []{
		"SSS",
		" P ",
		"NIN",
		
			'S', Blocks.wooden_slab, 'P', Blocks.piston, 'N', "nuggetIron", 'I', Items.iron_ingot
	}));
	
//Shield
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.Shield), new Object []{
		"SNS",
		"SIS",
		" N ",
		
			'I', Items.iron_ingot, 'S', Ingredients.GelatinShard, 'N', "nuggetIron"
	}));
	
//Can O' Spinach
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.CanOSpinach), new Object [] {
		"NSN",
		"NBN",
		"NSN",
		
			'S', Ingredients.GelatinShard, 'N', "nuggetIron", 'B', Ingredients.AppleofHealth					
	}));
	
//Apple of Health
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.AppleofHealth), new Object [] {
		"SNS",
		"NAN",
		"SNS",
		
			'S', Ingredients.GelatinShard, 'N', Items.gold_nugget, 'A', Items.apple					
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.AppleofHealth, 8), new Object [] {
		"P",
		"B",
		
			'P', Utilities.PackUlater, 'B', Storage.AppleofHealthBarrel				
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.AppleofHealth, 8), new Object [] {
		"G",
		"B",
		
			'G', Utilities.GChamberT3, 'B', Storage.AppleofHealthBarrel				
	});
	
//Gelatinous Carrot
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinousCarrot), new Object []{
		"SNS",
		"NCN",
		"SNS",
		
			'C', Items.carrot, 'S', Ingredients.GelatinShard, 'N', Items.gold_nugget
	});	
	
//Fish in a Jar
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.FishinaJar, 2), new Object []{
		"F",
		"V",
		"F",
		
			'V', Storage.H2OCoolVat, 'F', Items.fish
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.FishinaJar, 2), new Object []{
		"F",
		"V",
		"F",
		
			'V', Storage.H2OCoolVat, 'F', new ItemStack(Items.fish, 1, 1)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.FishinaJar, 2), new Object []{
		"F",
		"V",
		"F",
		
			'V', Storage.H2OCoolVat, 'F', new ItemStack(Items.fish, 2, 2)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.FishinaJar, 2), new Object []{
		"F",
		"V",
		"F",
		
			'V', Storage.H2OCoolVat, 'F', new ItemStack(Items.fish, 3, 3)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.FishinaJar, 2), new Object []{
		"F",
		"V",
		"F",
		
			'V', Storage.H2OCoolVat, 'F', Items.cooked_fished
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.FishinaJar, 2), new Object []{
		"F",
		"V",
		"F",
		
			'V', Storage.H2OCoolVat, 'F', new ItemStack(Items.cooked_fished, 1, 1)
	});

}


public static void GlasswareRecipes() {
		
//Glass Blank
	GameRegistry.addSmelting(Blocks.glass, new ItemStack(Ingredients.GlassBlank, 8), 0.1F);
	
	GameRegistry.addSmelting(Blocks.stained_glass, new ItemStack(Ingredients.GlassBlank, 8), 0.1F);
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBlank, 8), new Object []{
		"SB",
		"C ",
		
			'S', Utilities.Smeltry, 'B', Blocks.glass, 'C', Ingredients.GroundCharcoalDish
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBlank, 8), new Object []{
		"SB",
		"C ",
		
			'S', Utilities.Smeltry, 'B', Blocks.stained_glass, 'C', Ingredients.GroundCharcoalDish
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBlank, 8), new Object []{
		"GB",
		"C ",
		
			'G', Utilities.GChamberT2, 'B', Blocks.glass, 'C', Ingredients.GroundCharcoalDish
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBlank, 8), new Object []{
		"GB",
		"C ",
		
			'G', Utilities.GChamberT2, 'B', Blocks.stained_glass, 'C', Ingredients.GroundCharcoalDish
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBlank, 8), new Object []{
		"GB",
		"CC",
		
			'G', Utilities.GChamberT3, 'B', Blocks.glass, 'C', Ingredients.GroundCharcoalDish
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBlank, 8), new Object []{
		"GB",
		"CC",
		
			'G', Utilities.GChamberT3, 'B', Blocks.stained_glass, 'C', Ingredients.GroundCharcoalDish
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBlank, 8), new Object []{
		"P",
		"B",
		
			'P', Utilities.PackUlater, 'B', Storage.GlassBarrel
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassBlank, 8), new Object []{
		"G",
		"B",
		
			'G', Utilities.GChamberT3, 'B', Storage.GlassBarrel
	});
		
//Funnel
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassFunnel), new Object []{
		"G G",
		"G G",
		" G ",
		
			'G', Ingredients.GlassBlank
	});
	
//Extraction Tube
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassExtractionTube), new Object []{
		"G G",
		"G G",
		"G G",
		
			'G', Ingredients.GlassBlank
	});

//Glass Gelatin Mold
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GlassGelatinMold), new Object [] {
		"   ",
		"B B",
		"BBB",
			
			'B', Ingredients.GlassBlank
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
		"   ",	
		"BBB",
			
			'B', Ingredients.GlassBlank
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
			
			'I', "ingotSteel", 'G', Storage.GelatinJar, 'S', Utilities.Smeltry, 'C', Ingredients.GroundCharcoalJar
	}));

	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GelatinAlloy), new Object []{
		" G ",
		"IS ",
		" C ",
			
			'I', "ingotSteel", 'G', Storage.GelatinJar, 'S', Utilities.GChamberT2, 'C', Ingredients.GroundCharcoalJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GelatinAlloy, 2), new Object []{
		" G ",
		"IS ",
		" C ",
			
			'I', "ingotSteel", 'G', Storage.GelatinJar, 'S', Utilities.GChamberT3, 'C', Ingredients.GroundCharcoalJar
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
			'C', Ingredients.GroundCharcoalJar, 'P', "itemPulsatingCrystal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GelatinAlloyDark, 2), new Object []{
		" G ",
		"ISP",
		" C ",
			
			'I', "ingotDarkSteel", 'G', Ingredients.GelatinAlloy, 'S', Utilities.GChamberT3, 
			'C', Ingredients.GroundCharcoalJar, 'P', "itemPulsatingCrystal"
	}));
	
//Gelatin Crystal
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinCrystal), new Object []{
		"GGG",
		"ECD",
		"GcG",
		
			'D', Items.diamond, 'E', Items.emerald, 'G', Gelatin.GelatinCube, 
			'C', Utilities.Smeltry, 'c', Ingredients.GroundCharcoalJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinCrystal), new Object []{
		"GGG",
		"ECD",
		"GcG",
		
			'D', Items.diamond, 'E', Items.emerald, 'G', Gelatin.GelatinCube, 
			'C', Utilities.GChamberT2, 'c', Ingredients.GroundCharcoalJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinCrystal), new Object []{
		"GGG",
		"ECD",
		"GcG",
		
			'D', Items.diamond, 'E', Items.emerald, 'G', Gelatin.GelatinCube, 
			'C', Utilities.GChamberT3, 'c', Ingredients.GroundCharcoalJar
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
			'G', Gelatin.GelatinCube, 'c', Ingredients.GroundCharcoalJar	
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GelatinCrystalVibrant), new Object []{
		"GGG",
		"VCP",
		"GcG",
		
			'C', Utilities.GChamberT3, 'V', "itemVibrantCrystal", 'P', "itemPulsatingCrystal", 
			'G', Gelatin.GelatinCube, 'c', Ingredients.GroundCharcoalJar	
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GelatinCrystalVibrant), new Object []{
		"NNN",
		"N N",
		"NNN",
		
			'N', Ingredients.GelatinShardVibrant
	}));
	
//Crystal Fire
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.CrystalFire), new Object []{
		"CCC",
		"CSC",
		"CCC",
			
			'S', "shardDiamond", 'C', "dustCharcoal"
	}));
	
//Crystal Ice
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.CrystalIce), new Object []{
		"III",
		"ISI",
		"III",
			
			'S', "shardDiamond", 'I', Ingredients.IceShard
	}));
	
//Gelatin Alloy Nugget
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinAlloyNugget, 8), new Object []{
		"A",
		
			'A', Ingredients.GelatinAlloy
	});
	
//Iron Nugget
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.IronNugget, 9), new Object []{
		"M",
		"I",
		
			'M', Ingredients.CraftingMedallion, 'I', Items.iron_ingot
	});		
		
//Diamond Shard
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.DiamondShard, 9), new Object [] {
		"S",
		"D",
		
			'S', Ingredients.CraftingMedallion, 'D', Items.diamond		
	});		
		
//Emerald Shard		
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.EmeraldShard, 9), new Object [] {
		"S",
		"D",
		
			'S', Ingredients.CraftingMedallion, 'D', Items.emerald				
	});
	
//Gelatin Shard	
	GameRegistry.addShapelessRecipe(new ItemStack(Ingredients.GelatinShard, 8),
		Ingredients.GelatinCrystal);
	
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinShard, 2), new Object []{
		"G",
		"L",
		
			'L', Ingredients.GelatinLily, 'G', Utilities.GChamberT1				
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinShard, 4), new Object []{
		"G",
		"L",
		
			'L', Ingredients.GelatinLily, 'G', Utilities.GChamberT2				
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinShard, 6), new Object []{
		"G",
		"L",
		
			'L', Ingredients.GelatinLily, 'G', Utilities.GChamberT3			
	});
	
//Vibrant Gelatin Shard
	GameRegistry.addShapelessRecipe(new ItemStack(Ingredients.GelatinShardVibrant, 8),
			Ingredients.GelatinCrystalVibrant);
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinShardVibrant, 2), new Object []{
		"G",
		"L",
		
			'L', Ingredients.GelatinLilyVibrant, 'G', Utilities.GChamberT1				
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinShardVibrant, 2), new Object []{
		"G",
		"L",
		
			'L', Ingredients.GelatinLilyVibrant, 'G', Utilities.GChamberT2				
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinShardVibrant, 4), new Object []{
		"G",
		"L",
		
			'L', Ingredients.GelatinLilyVibrant, 'G', Utilities.GChamberT3			
	});
	
//Ice Shard
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.IceShard, 4), new Object []{
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
		"S",
		"B",
		
			'S', Utilities.StampMill, 'B', Items.bone					
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CrackedBone), new Object [] {
		"G",
		"B",
		
			'G', Utilities.GChamberT1, 'B', Items.bone					
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CrackedBone), new Object [] {
		"G",
		"B",
		
			'G', Utilities.GChamberT2, 'B', Items.bone					
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CrackedBone), new Object [] {
		"G",
		"B",
		
			'G', Utilities.GChamberT3, 'B', Items.bone					
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CrackedBone, 8), new Object [] {
		"P",
		"B",
		
			'P', Utilities.PackUlater, 'B', Storage.CrackedBarrel					
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.CrackedBone, 8), new Object [] {
		"G",
		"B",
		
			'G', Utilities.GChamberT3, 'B', Storage.CrackedBarrel					
	});
		
//Gelatin Lily
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLily, 2), new Object []{
		" G ",
		"STS",
		" G ",
		
			'G', Ingredients.GelitilizerJar, 'T', Utilities.Terrarium, 'S', Ingredients.GelatinShard
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLily, 4), new Object []{
		" G ",
		"SCS",
		" G ",
		
			'G', Ingredients.GelitilizerJar, 'C', Utilities.GChamberT3, 'S', Ingredients.GelatinShard
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLily, 8), new Object []{
		"P",
		"B",
		
			'P', Utilities.PackUlater, 'B', Storage.LilyBarrel
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLily, 8), new Object []{
		"G",
		"B",
		
			'G', Utilities.GChamberT3, 'B', Storage.LilyBarrel
	});
	
//Gelatin Lily Vibrant
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLilyVibrant, 2), new Object []{
		" G ",
		"STS",
		" G ",
		
			'G', Ingredients.GelitilizerJar, 'T', Utilities.Terrarium, 'S', Ingredients.GelatinShardVibrant
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLilyVibrant, 4), new Object []{
		" G ",
		"SCS",
		" G ",
		
			'G', Ingredients.GelitilizerJar, 'C', Utilities.GChamberT3, 'S', Ingredients.GelatinShardVibrant
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLilyVibrant, 8), new Object []{
		"P",
		"B",
		
			'P', Utilities.PackUlater, 'B', Storage.LilyVibrantBarrel
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelatinLilyVibrant, 8), new Object []{
		"G",
		"B",
		
			'G', Utilities.GChamberT3, 'B', Storage.LilyVibrantBarrel
	});
	
}


public static void GroundRecipes() {
	
//Ground Gelatin
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundGelatin), new Object []{
		"M",
		"C",
		
			'M', Utilities.MortarandPestel, 'C', Gelatin.GelatinCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundGelatin), new Object []{
		"G",
		"C",
		
			'G', Utilities.GChamberT1, 'C', Gelatin.GelatinCube 
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundGelatin), new Object []{
		"G",
		"C",
		
			'G', Utilities.GChamberT2, 'C', Gelatin.GelatinCube 
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundGelatin), new Object []{
		"G",
		"C",
		
			'G', Utilities.GChamberT3, 'C', Gelatin.GelatinCube 
	});
	
//Ground Marrow Dish
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundMarrowDish), new Object []{
		"M",
		"C",
		
			'M', Utilities.MortarandPestel, 'C', Ingredients.CrackedBone
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundMarrowDish), new Object []{
		"G",
		"C",
		
			'G', Utilities.GChamberT1, 'C', Ingredients.CrackedBone
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundMarrowDish), new Object []{
		"G",
		"C",
		
			'G', Utilities.GChamberT2, 'C', Ingredients.CrackedBone
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundMarrowDish), new Object []{
		"G",
		"C",
		
			'G', Utilities.GChamberT3, 'C', Ingredients.CrackedBone
	});

	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundMarrowDish, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Ingredients.GroundMarrowJar
	});

	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundMarrowDish, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Ingredients.GroundMarrowJar
	});
	
//Ground Flour Dish
	GameRegistry.addSmelting(Ingredients.GroundFlourDish, new ItemStack(Items.bread), 0.0F);
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundFlourDish), new Object []{
		"M",
		"W",
		
			'M', Utilities.MortarandPestel, 'W', Items.wheat
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundFlourDish), new Object []{
		"G",
		"W",
		
			'G', Utilities.GChamberT1, 'W', Items.wheat
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundFlourDish), new Object []{
		"G",
		"W",
		
			'G', Utilities.GChamberT2, 'W', Items.wheat
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundFlourDish), new Object []{
		"G",
		"W",
		
			'G', Utilities.GChamberT3, 'W', Items.wheat
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundFlourDish, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Ingredients.GroundFlourJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundFlourDish, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Ingredients.GroundFlourJar
	});
	
//Ground Meat Dish		
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"S",
		"M",
		
			'S', Utilities.StampMill, 'M', "listAllmeatraw"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"G",
		"M",
		
			'G', Utilities.GChamberT1, 'M', "listAllmeatraw"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"G",
		"M",
		
			'G', Utilities.GChamberT2, 'M', "listAllmeatraw"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"G",
		"M",
		
			'G', Utilities.GChamberT3, 'M', "listAllmeatraw"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"S",
		"M",
		
			'S', Utilities.StampMill, 'M', Items.beef
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"G",
		"M",
		
			'G', Utilities.GChamberT1, 'M', Items.beef
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"G",
		"M",
		
			'G', Utilities.GChamberT2, 'M', Items.beef
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"G",
		"M",
		
			'G', Utilities.GChamberT3, 'M', Items.beef
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"S",
		"M",
		
			'S', Utilities.StampMill, 'M', Items.chicken
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"G",
		"M",
		
			'G', Utilities.GChamberT1, 'M', Items.chicken
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"G",
		"M",
		
			'G', Utilities.GChamberT2, 'M', Items.chicken
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"G",
		"M",
		
			'G', Utilities.GChamberT3, 'M', Items.chicken
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"S",
		"M",
		
			'S', Utilities.StampMill, 'M', Items.porkchop
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"G",
		"M",
		
			'G', Utilities.GChamberT1, 'M', Items.porkchop
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"G",
		"M",
		
			'G', Utilities.GChamberT2, 'M', Items.porkchop
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundMeatDish), new Object []{
		"G",
		"M",
		
			'G', Utilities.GChamberT3, 'M', Items.porkchop
	}));
	
//Coal Dish
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundCoalDish), new Object [] {
		"M",
		"C",
		
			'M', Utilities.MortarandPestel, 'C', Items.coal		
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundCoalDish), new Object [] {
		"G",
		"C",
		
			'G', Utilities.GChamberT1, 'C', Items.coal		
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundCoalDish), new Object [] {
		"G",
		"C",
		
			'G', Utilities.GChamberT2, 'C', Items.coal		
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundCoalDish), new Object [] {
		"G",
		"C",
		
			'G', Utilities.GChamberT3, 'C', Items.coal		
	});
	
//Charcoal Dish
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundCharcoalDish), new Object [] {
		"M",
		"C",
			
			'M', Utilities.MortarandPestel, 'C', new ItemStack(Items.coal, 1, 1)
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundCharcoalDish), new Object [] {
		"G",
		"C",
			
			'G', Utilities.GChamberT1, 'C', new ItemStack(Items.coal, 1, 1)
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundCharcoalDish), new Object [] {
		"G",
		"C",
			
			'G', Utilities.GChamberT2, 'C', new ItemStack(Items.coal, 1, 1)
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundCharcoalDish), new Object [] {
		"G",
		"C",
			
			'G', Utilities.GChamberT3, 'C', new ItemStack(Items.coal, 1, 1)
	}));
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundCharcoalDish, 8), new Object [] {
		"P", 
		"J",
			
			'P', Utilities.PackUlater, 'J', Ingredients.GroundCharcoalJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundCharcoalDish, 8), new Object [] {
		"G",
		"J",
			
			'G', Utilities.GChamberT3, 'J', Ingredients.GroundCharcoalJar
	});
	
//Wood Pulp
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WoodPulpDish), new Object []{
		"S",
		"W",
		
			'S', Utilities.StampMill, 'W', Blocks.log
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WoodPulpDish), new Object []{
		"S",
		"W",
		
			'S', Utilities.StampMill, 'W', Blocks.log2
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WoodPulpDish), new Object []{
		"G",
		"W",
		
			'G', Utilities.GChamberT1, 'W', Blocks.log
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WoodPulpDish), new Object []{
		"G",
		"W",
		
			'G', Utilities.GChamberT1, 'W', Blocks.log2
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WoodPulpDish), new Object []{
		"G",
		"W",
		
			'G', Utilities.GChamberT2, 'W', Blocks.log
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WoodPulpDish), new Object []{
		"G",
		"W",
		
			'G', Utilities.GChamberT2, 'W', Blocks.log2
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WoodPulpDish), new Object []{
		"G",
		"W",
		
			'G', Utilities.GChamberT3, 'W', Blocks.log
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.WoodPulpDish), new Object []{
		"G",
		"W",
		
			'G', Utilities.GChamberT3, 'W', Blocks.log2
	});
		
//Gelitizer Jar
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelitilizerJar), new Object []{
		"GGG",
		"GBG",
		"GGG",
		
			'G', Ingredients.GroundGelatin, 'B', new ItemStack(Items.dye, 15, 15)
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelitilizerJar, 8), new Object []{
		"P",
		"G",
		
			'G', Storage.GelitizerBarrel, 'P', Utilities.PackUlater
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GelitilizerJar, 8), new Object []{
		"P",
		"G",
		
			'P', Utilities.GChamberT3, 'G', Storage.GelitizerBarrel
	});
	
//Ground Marrow Jar	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundMarrowJar), new Object []{
		"DDD",
		"DPD",
		"DDD",
		
			'P', Utilities.PackUlater, 'D', Ingredients.GroundMarrowDish
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundMarrowJar), new Object []{
		"DDD",
		"DGD",
		"DDD",
		
			'G', Utilities.GChamberT3, 'D', Ingredients.GroundMarrowDish
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundMarrowJar, 8), new Object []{
		"P",
		"B",
		
			'P', Utilities.PackUlater, 'B', Storage.GroundMarrowBarrel
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundMarrowJar, 8), new Object []{
		"G",
		"B",
		
			'G', Utilities.GChamberT3, 'B', Storage.GroundMarrowBarrel
	});	
		
//Ground Flour Jar
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundFlourJar), new Object []{
		"WWW",
		"WPW",
		"WWW",
		
			'P', Utilities.PackUlater, 'W', Ingredients.GroundFlourDish
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundFlourJar), new Object []{
		"WWW",
		"WGW",
		"WWW",
		
			'G', Utilities.GChamberT3, 'W', Ingredients.GroundFlourDish
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundFlourJar, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Storage.GroundFlourBarrel
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundFlourJar, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Storage.GroundFlourBarrel
	});
	
//Ground Sugar
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundSugarJar), new Object []{
		"SSS",
		"SPS",
		"SSS",
		
			'P', Utilities.PackUlater, 'S', Items.sugar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundSugarJar), new Object []{
		"SSS",
		"SGS",
		"SSS",
		
			'G', Utilities.GChamberT3, 'S', Items.sugar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundSugarJar, 8), new Object []{
		"P",
		"B",
		
			'P', Utilities.PackUlater, 'B', Storage.GroundSugarBarrel
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundSugarJar, 8), new Object []{
		"G",
		"B",
		
			'G', Utilities.GChamberT3, 'B', Storage.GroundSugarBarrel
	});
	
//Charcoal Jar				
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundCharcoalJar), new Object [] {
		"DDD",
		"DPD",
		"DDD",
			
			'P', Utilities.PackUlater, 'D', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Ingredients.GroundCharcoalJar), new Object [] {
		"DDD",
		"DGD",
		"DDD",
			
			'G', Utilities.GChamberT3, 'D', "dustCharcoal"
	}));
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundCharcoalJar, 8), new Object [] {
		"P",
		"B",
		
			'P', Utilities.PackUlater, 'B', Storage.CharcoalBarrel					
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundCharcoalJar, 8), new Object [] {
		"G",
		"B",
		
			'G', Utilities.GChamberT3, 'B', Storage.CharcoalBarrel					
	});
	
//Priming Powder
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.PrimingPowderJar, 2), new Object []{
		"M",
		"P",
		
			'M', Utilities.MortarandPestel, 'P', Items.gunpowder
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.PrimingPowderJar, 2), new Object []{
		"G",
		"P",
		
			'G', Utilities.GChamberT1, 'P', Items.gunpowder
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.PrimingPowderJar, 3), new Object []{
		"G",
		"P",
		
			'G', Utilities.GChamberT2, 'P', Items.gunpowder
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.PrimingPowderJar, 4), new Object []{
		"G",
		"P",
		
			'G', Utilities.GChamberT3, 'P', Items.gunpowder
	});
		
//Tilite Powder
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundTriliteJar), new Object []{
		"M",
		"T",
		
			'M', Utilities.MortarandPestel, 'T', Blocks.tnt
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundTriliteJar, 2), new Object []{
		"G",
		"T",
		
			'G', Utilities.GChamberT1, 'T', Blocks.tnt
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundTriliteJar, 3), new Object []{
		"G",
		"T",
		
			'G', Utilities.GChamberT2, 'T', Blocks.tnt
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundTriliteJar, 4), new Object []{
		"G",
		"T",
		
			'G', Utilities.GChamberT3, 'T', Blocks.tnt
	});			
		
//RDX Powder
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundRDXJar, 2), new Object []{
		"PCP",
		"CMC",
		"PCP",
		
			'P', Ingredients.PrimingPowderJar, 'C', Items.clay_ball, 'M', Utilities.MortarandPestel
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundRDXJar, 2), new Object []{
		"PCP",
		"CGC",
		"PCP",
		
			'P', Ingredients.PrimingPowderJar, 'C', Items.clay_ball, 'G', Utilities.GChamberT1
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundRDXJar, 3), new Object []{
		"PCP",
		"CGC",
		"PCP",
		
			'P', Ingredients.PrimingPowderJar, 'C', Items.clay_ball, 'G', Utilities.GChamberT2
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.GroundRDXJar, 4), new Object []{
		"PCP",
		"CGC",
		"PCP",
		
			'P', Ingredients.PrimingPowderJar, 'C', Items.clay_ball, 'G', Utilities.GChamberT3
	});
	
//Charcoal	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.coal, 1, 1), new Object [] {
		"P",
		"C",
			
			'P', Utilities.PackUlater, 'C', Ingredients.GroundCharcoalDish
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.coal, 1, 1), new Object [] {
		"G",
		"C",
			
			'G', Utilities.GChamberT3, 'C', Ingredients.GroundCharcoalDish
	}));
		
//Coal
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.coal), new Object [] {
		"P",
		"D",
			
			'P', Utilities.PackUlater, 'D', "dustCoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.coal), new Object [] {
		"G",
		"D",
			
			'G', Utilities.GChamberT3, 'D', "dustCoal"
	}));
	
}
		
	
public static void FluidRecipes() {
	
//Lava Jar				
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaJar), new Object [] {
		"SSS",
		"SGS",
		"CCC",
		
			'G', Utilities.Smeltry, 'C', Ingredients.GroundCharcoalJar, 'S', Blocks.stone
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaJar), new Object [] {
		"SSS",
		"SGS",
		"C C",
		
			'G', Utilities.GChamberT2, 'C', Ingredients.GroundCharcoalJar, 'S', Blocks.stone 
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaJar), new Object [] {
		"SSS",
		"SGS",
		"C C",
		
			'G', Utilities.GChamberT3, 'C', Ingredients.GroundCharcoalJar, 'S', Blocks.stone 
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaJar, 2), new Object [] {
		"SSS",
		"SGS",
		" L ",
		
			'G', Utilities.GChamberT3, 'C', Storage.LavaJar, 'S', Blocks.stone 
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaJar), new Object []{
		"V",
		"B",
		
			'V', Utilities.TheVat, 'B', Items.lava_bucket
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaJar), new Object []{
		"G",
		"B",
		
			'G', Utilities.GChamberT2, 'B', Items.lava_bucket
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaJar), new Object []{
		"G",
		"B",
		
			'G', Utilities.GChamberT3, 'B', Items.lava_bucket
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaJar, 8), new Object []{
		"P",
		"B",
		
			'P', Utilities.PackUlater, 'B', Storage.LavaVat
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaJar, 8), new Object []{
		"G",
		"B",
		
			'G', Utilities.GChamberT3, 'B', Storage.LavaVat
	});
	
//Purified Collagen Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.PurifiedCollagenSolutionJar), new Object []{
		"V",
		"M",
		
			'V', Storage.AcidVat, 'M', Ingredients.GroundMarrowJar
	});
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.PurifiedCollagenSolutionJar, 2), new Object []{
		"V",
		"L",
		
			'V', Storage.AcidVat, 'L', Items.leather
	}));
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.PurifiedCollagenSolutionJar, 3), new Object []{
		"V",
		"M",
		
			'V', Storage.AcidVat, 'M', Ingredients.GroundMeatDish
	});	

//H2O Jar Cool	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolJar), new Object []{
		"LLL",
		"LVL",
		"LLL",
		
			'L', Blocks.leaves, 'V', Utilities.TheVat
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolJar), new Object []{
		"LLL",
		"LVL",
		"LLL",
		
			'L', Blocks.leaves2, 'V', Utilities.TheVat
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolJar, 2), new Object []{
		"LLL",
		"LGL",
		"LLL",
		
			'G', Utilities.GChamberT2, 'L', Blocks.leaves
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolJar, 2), new Object []{
		"LLL",
		"LGL",
		"LLL",
		
			'G', Utilities.GChamberT2, 'L', Blocks.leaves2
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolJar, 3), new Object []{
		"LLL",
		"LGL",
		"LLL",
		
			'G', Utilities.GChamberT3, 'L', Blocks.leaves
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolJar, 3), new Object []{
		"LLL",
		"LGL",
		"LLL",
		
			'G', Utilities.GChamberT3, 'L', Blocks.leaves2
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolJar), new Object []{
		"VJ",
		"B ",
		
			'V', Utilities.TheVat, 'B', Items.water_bucket, 'J', Ingredients.GlassJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolJar), new Object []{
		"GJ",
		"B ",
		
			'G', Utilities.GChamberT2, 'B', Items.water_bucket, 'J', Ingredients.GlassJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolJar), new Object []{
		"GJ",
		"B ",
		
			'G', Utilities.GChamberT3, 'B', Items.water_bucket, 'J', Ingredients.GlassJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolJar, 8), new Object []{
		"JJJ",
		"JVJ",
		"JJJ",
		
			'V', Storage.H2OCoolVat, 'J', Ingredients.GlassJar
	});
			
//H20 Jar Hot
	GameRegistry.addSmelting(Storage.H2OCoolJar, new ItemStack(Storage.H2OHotJar), 0.3F);
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.H2OHotJar), new Object [] {
		"SW",
		"C ",
		
			'S', Utilities.Smeltry, 'W', Storage.H2OCoolJar, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.H2OHotJar), new Object [] {
		"GW",
		"C ",
		
			'G', Utilities.GChamberT2, 'W', Storage.H2OCoolJar, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.H2OHotJar), new Object [] {
		"GW",
		"C ",
		
			'G', Utilities.GChamberT3, 'W', Storage.H2OCoolJar, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OHotJar, 8), new Object []{
		"P",
		"B",
		
			'P', Utilities.PackUlater, 'B', Storage.H2OHotVat
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OHotJar, 8), new Object []{
		"G",
		"B",
		
			'G', Utilities.GChamberT3, 'B', Storage.H2OHotVat
	});
	
//The Vat H20 Cool
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolVat), new Object [] {
		"JJJ",
		"JVJ",
		"JJJ",
		
			'V', Utilities.TheVat, 'J', Storage.H2OCoolJar
	});
	
	
//The Vat H20 Hot
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OHotVat), new Object [] {
		"V",
		"J",
		
			'V', Utilities.TheVat, 'J', Storage.H2OHotJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OHotVat), new Object [] {
		"G",
		"J",
		
			'G', Utilities.GChamberT2, 'J', Storage.H2OHotJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OHotVat), new Object [] {
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Storage.H2OHotJar
	});
	
//Vat of Acid
	GameRegistry.addShapedRecipe(new ItemStack(Storage.AcidVat), new Object [] {
		"RAR",
		"AVA",
		"RAR",
		
			'V', Storage.H2OHotVat, 'R', Items.rotten_flesh, 'A', Items.apple
	});
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidVat), new Object [] {
		"CCC",
		"CVC",
		"CCC",
		
			'V', Storage.H2OHotVat, 'C', "listAllcitrus"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidVat), new Object [] {
		"YYY",
		"YVY",
		"YYY",
		
			'V', Storage.H2OHotVat, 'Y', "cropYuzu"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidVat), new Object [] {
		"YYY",
		"YVY",
		"YYY",
		
			'V', Storage.H2OHotVat, 'Y', "cropCranberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidVat), new Object [] {
		"YYY",
		"YVY",
		"YYY",
		
			'V', Storage.H2OHotVat, 'Y', "cropBlackberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidVat), new Object [] {
		"CCC",
		"CVC",
		"CCC",
		
			'V', Storage.H2OHotVat, 'C', "cropCandleberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidVat), new Object [] {
		"YYY",
		"YVY",
		"YYY",
		
			'V', Storage.H2OHotVat, 'Y', "cropRaspberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidVat), new Object [] {
		"YYY",
		"YVY",
		"YYY",
		
			'V', Storage.H2OHotVat, 'Y', "cropStrawberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidVat), new Object [] {
		"YYY",
		"YVY",
		"YYY",
		
			'V', Storage.H2OHotVat, 'Y', "cropGrape"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidVat), new Object [] {
		"YYY",
		"YVY",
		"YYY",
		
			'V', Storage.H2OHotVat, 'Y', "cropPineapple"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidVat), new Object [] {
		"YYY",
		"YVY",
		"YYY",
		
			'V', Storage.H2OHotVat, 'Y', "cropKiwi"
	}));	
	
//Distillery Filled
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.MinerDistillery), new Object []{
		"D",
		"J",
		
			'D', Utilities.Distillery, 'J', Storage.H2OHotJar, 'C', Ingredients.CraftingMedallion
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Ingredients.MinerDistillery), new Object []{
		"GC",
		"J ",
		
			'G', Utilities.GChamberT3, 'J', Storage.H2OHotJar, 'C', Ingredients.CraftingMedallion
	});
	
}

}






