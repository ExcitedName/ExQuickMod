package com.excitedname.exq.storage;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.gelatin.Gelatin;
import com.excitedname.exq.ingredients.Ingredients;
import com.excitedname.exq.storage.barrels.BoneBarrel;
import com.excitedname.exq.storage.barrels.CharcoalBarrel;
import com.excitedname.exq.storage.barrels.CoalBarrel;
import com.excitedname.exq.storage.barrels.CrackedBarrel;
import com.excitedname.exq.storage.barrels.CreeperBarrel;
import com.excitedname.exq.storage.barrels.DragonBarrel;
import com.excitedname.exq.storage.barrels.ExplosiveBarrel;
import com.excitedname.exq.storage.barrels.GelatinBarrel;
import com.excitedname.exq.storage.barrels.GelitizerBarrel;
import com.excitedname.exq.storage.barrels.GlassBarrel;
import com.excitedname.exq.storage.barrels.GroundFlourBarrel;
import com.excitedname.exq.storage.barrels.GroundMarrowBarrel;
import com.excitedname.exq.storage.barrels.GroundMeatBarrel;
import com.excitedname.exq.storage.barrels.GroundRDXBarrel;
import com.excitedname.exq.storage.barrels.GroundSugarBarrel;
import com.excitedname.exq.storage.barrels.GroundTriliteBarrel;
import com.excitedname.exq.storage.barrels.HealthBarrel;
import com.excitedname.exq.storage.barrels.HotSauceBarrel;
import com.excitedname.exq.storage.barrels.IronSkinBarrel;
import com.excitedname.exq.storage.barrels.KrackenBarrel;
import com.excitedname.exq.storage.barrels.LilyBarrel;
import com.excitedname.exq.storage.barrels.LilyVibrantBarrel;
import com.excitedname.exq.storage.barrels.MinerBarrel;
import com.excitedname.exq.storage.barrels.NightVisionBarrel;
import com.excitedname.exq.storage.barrels.PrimingPowderBarrel;
import com.excitedname.exq.storage.barrels.SkeletonBarrel;
import com.excitedname.exq.storage.barrels.TorchBarrel;
import com.excitedname.exq.storage.barrels.TravellerBarrel;
import com.excitedname.exq.storage.barrels.WarriorBarrel;
import com.excitedname.exq.storage.barrels.WoodPulpBarrel;
import com.excitedname.exq.storage.barrels.ZombieBarrel;
import com.excitedname.exq.storage.fluid.AcidJar;
import com.excitedname.exq.storage.fluid.AcidVat;
import com.excitedname.exq.storage.fluid.GelatinSolutionJar;
import com.excitedname.exq.storage.fluid.GelatinSolutionVat;
import com.excitedname.exq.storage.fluid.H2OCoolJar;
import com.excitedname.exq.storage.fluid.H2OCoolVat;
import com.excitedname.exq.storage.fluid.H2OHotJar;
import com.excitedname.exq.storage.fluid.H2OHotVat;
import com.excitedname.exq.storage.fluid.LavaJar;
import com.excitedname.exq.storage.fluid.LavaVat;
import com.excitedname.exq.storage.fluid.PurifiedCollagenSolutionJar;
import com.excitedname.exq.storage.fluid.PurifiedCollagenSolutionVat;
import com.excitedname.exq.storage.jar.CreeperJar;
import com.excitedname.exq.storage.jar.DragonJar;
import com.excitedname.exq.storage.jar.ExplosiveJar;
import com.excitedname.exq.storage.jar.GelatinJar;
import com.excitedname.exq.storage.jar.GelitizerJar;
import com.excitedname.exq.storage.jar.GroundCharcoalJar;
import com.excitedname.exq.storage.jar.GroundCoalJar;
import com.excitedname.exq.storage.jar.GroundFlourJar;
import com.excitedname.exq.storage.jar.GroundMarrowJar;
import com.excitedname.exq.storage.jar.GroundMeatJar;
import com.excitedname.exq.storage.jar.GroundRDXJar;
import com.excitedname.exq.storage.jar.GroundSugarJar;
import com.excitedname.exq.storage.jar.GroundTriliteJar;
import com.excitedname.exq.storage.jar.HealthJar;
import com.excitedname.exq.storage.jar.HotSauceJar;
import com.excitedname.exq.storage.jar.IronSkinJar;
import com.excitedname.exq.storage.jar.KrackenJar;
import com.excitedname.exq.storage.jar.MinerJar;
import com.excitedname.exq.storage.jar.NightVisionJar;
import com.excitedname.exq.storage.jar.PrimingPowderJar;
import com.excitedname.exq.storage.jar.SkeletonJar;
import com.excitedname.exq.storage.jar.TorchJar;
import com.excitedname.exq.storage.jar.TravellerJar;
import com.excitedname.exq.storage.jar.WarriorJar;
import com.excitedname.exq.storage.jar.WoodPulpJar;
import com.excitedname.exq.storage.jar.ZombieJar;
import com.excitedname.exq.utilities.Utilities;
import com.excitedname.exq.utilities.util.Barrel;
import com.excitedname.exq.utilities.util.TheVat;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Storage {	

public static void Jar() {
		
		GelatinJar = new GelatinJar();
		GameRegistry.registerItem(GelatinJar, "Gelatin Jar");
		
		MinerJar = new MinerJar();
		GameRegistry.registerItem(MinerJar, "Miner Jar");
		
		TravellerJar = new TravellerJar();
		GameRegistry.registerItem(TravellerJar, "Traveller Jar");
		
		IronSkinJar = new IronSkinJar();
		GameRegistry.registerItem(IronSkinJar, "Iron Skin Jar");
		
		WarriorJar = new WarriorJar();
		GameRegistry.registerItem(WarriorJar, "Warrior Jar");
		
		HealthJar = new HealthJar();
		GameRegistry.registerItem(HealthJar, "Health Jar");
		
		HotSauceJar = new HotSauceJar();
		GameRegistry.registerItem(HotSauceJar, "Hot Sauce Jar");
		
		NightVisionJar = new NightVisionJar();
		GameRegistry.registerItem(NightVisionJar, "Night Vision Jar");
		
		TorchJar = new TorchJar();
		GameRegistry.registerItem(TorchJar, "Torch Jar");
		
		ExplosiveJar = new ExplosiveJar();
		GameRegistry.registerItem(ExplosiveJar, "Explosive Jar");
		
		KrackenJar = new KrackenJar();
		GameRegistry.registerItem(KrackenJar, "Kracken Jar");
		
		DragonJar = new DragonJar();
		GameRegistry.registerItem(DragonJar, "Dragon Jar");
		
		CreeperJar = new CreeperJar();
		GameRegistry.registerItem(CreeperJar, "Creeper Jar");
		
		SkeletonJar = new SkeletonJar();
		GameRegistry.registerItem(SkeletonJar, "Skeleton Jar");
		
		ZombieJar = new ZombieJar();
		GameRegistry.registerItem(ZombieJar, "Zombie Jar");
	
		GelitizerJar = new GelitizerJar();
		GameRegistry.registerItem(GelitizerJar, "Gelitizer(Jar)");		
		
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
	
		H2OCoolJar = new H2OCoolJar(Blocks.flowing_water);
		GameRegistry.registerItem(H2OCoolJar, "Dihydrogen Monoxide Jar(Cool)");
		
		H2OHotJar = new H2OHotJar();
		GameRegistry.registerItem(H2OHotJar, "Dihydrogen Monoxide Jar(Hot)");
		
		AcidJar = new AcidJar();
		GameRegistry.registerItem(AcidJar, "Acid Jar");
		
		PurifiedCollagenSolutionJar = new PurifiedCollagenSolutionJar();
		GameRegistry.registerItem(PurifiedCollagenSolutionJar, "Purified Collagen Solution Jar");
		
		LavaJar = new LavaJar(Blocks.flowing_lava);
		GameRegistry.registerItem(LavaJar, "Lava Jar");
		
	}
	
	public static Item GelatinJar;
	public static Item MinerJar;
	public static Item TravellerJar;
	public static Item IronSkinJar;
	public static Item WarriorJar;
	public static Item HealthJar;
	public static Item HotSauceJar;
	public static Item NightVisionJar;
	public static Item TorchJar;
	public static Item ExplosiveJar;
	public static Item KrackenJar;
	public static Item DragonJar;
	public static Item CreeperJar;
	public static Item SkeletonJar;
	public static Item ZombieJar;
	public static Item GelitizerJar;
	public static Item GroundMarrowJar;
	public static Item GroundFlourJar;
	public static Item GroundSugarJar;
	public static Item GroundCoalJar;
	public static Item GroundCharcoalJar;
	public static Item WoodPulpJar;
	public static Item PrimingPowderJar;	
	public static Item GroundTriliteJar;	
	public static Item GroundRDXJar;		
	public static Item GroundMeatJar;
	public static Item H2OCoolJar;
	public static Item H2OHotJar;
	public static Item AcidJar;
	public static Item PurifiedCollagenSolutionJar;
	public static Item LavaJar;

	
public static void Barrel() {
	
		Barrel = new Barrel();
		GameRegistry.registerItem(Barrel, "Barrel");
	
		GelatinBarrel = new GelatinBarrel();
		GameRegistry.registerItem(GelatinBarrel, "Gelatin Barrel");
		
		MinerBarrel = new MinerBarrel();
		GameRegistry.registerItem(MinerBarrel, "Miner Barrel");
		
		TravellerBarrel = new TravellerBarrel();
		GameRegistry.registerItem(TravellerBarrel, "Traveller Barrel");
		
		IronSkinBarrel = new IronSkinBarrel();
		GameRegistry.registerItem(IronSkinBarrel, "Iron Skin Barrel");
		
		WarriorBarrel = new WarriorBarrel();
		GameRegistry.registerItem(WarriorBarrel, "Warrior Barrel");
		
		HealthBarrel = new HealthBarrel();
		GameRegistry.registerItem(HealthBarrel, "Health Barrel");
		
		HotSauceBarrel = new HotSauceBarrel();
		GameRegistry.registerItem(HotSauceBarrel, "Hot Sauce Barrel");
		
		NightVisionBarrel = new NightVisionBarrel();
		GameRegistry.registerItem(NightVisionBarrel, "Night Vision Barrel");
		
		TorchBarrel = new TorchBarrel();
		GameRegistry.registerItem(TorchBarrel, "Torch Barrel");
		
		ExplosiveBarrel = new ExplosiveBarrel();
		GameRegistry.registerItem(ExplosiveBarrel, "Explosive Barrel");
		
		KrackenBarrel = new KrackenBarrel();
		GameRegistry.registerItem(KrackenBarrel, "Kracken Barrel");
		
		DragonBarrel = new DragonBarrel();
		GameRegistry.registerItem(DragonBarrel, "Dragon Barrel");
		
		CreeperBarrel = new CreeperBarrel();
		GameRegistry.registerItem(CreeperBarrel, "Creeper Barrel");
		
		SkeletonBarrel = new SkeletonBarrel();
		GameRegistry.registerItem(SkeletonBarrel, "Skeleton Barrel");
		
		ZombieBarrel = new ZombieBarrel();
		GameRegistry.registerItem(ZombieBarrel, "Zombie Barrel");
		
		GelitizerBarrel = new GelitizerBarrel();
		GameRegistry.registerItem(GelitizerBarrel, "Gelitizer Barrel");				
			
		GroundMarrowBarrel = new GroundMarrowBarrel();
		GameRegistry.registerItem(GroundMarrowBarrel, "Ground Marrow Barrel");
		
		GroundFlourBarrel = new GroundFlourBarrel();
		GameRegistry.registerItem(GroundFlourBarrel, "Ground Flour Barrel");
		
		GroundSugarBarrel = new GroundSugarBarrel();
		GameRegistry.registerItem(GroundSugarBarrel, "Ground Sugar Barrel");
		
		CoalBarrel = new CoalBarrel();
		GameRegistry.registerItem(CoalBarrel, "Coal Barrel");
		
		CharcoalBarrel = new CharcoalBarrel();
		GameRegistry.registerItem(CharcoalBarrel, "Charcoal Barrel");
		
		WoodPulpBarrel = new WoodPulpBarrel();
		GameRegistry.registerItem(WoodPulpBarrel, "Wood Pulp Barrel");
		
		PrimingPowderBarrel = new PrimingPowderBarrel();
		GameRegistry.registerItem(PrimingPowderBarrel, "Priming Powder Barrel");
		
		GroundTriliteBarrel = new GroundTriliteBarrel();
		GameRegistry.registerItem(GroundTriliteBarrel, "Ground Trilite Barrel");
		
		GroundRDXBarrel = new GroundRDXBarrel();
		GameRegistry.registerItem(GroundRDXBarrel, "Ground RDX Barrel");
		
		GroundMeatBarrel = new GroundMeatBarrel();
		GameRegistry.registerItem(GroundMeatBarrel, "Ground Meat Barrel");
		
		GlassBarrel = new GlassBarrel();
		GameRegistry.registerItem(GlassBarrel, "Glass Barrel");
		
		BoneBarrel = new BoneBarrel();
		GameRegistry.registerItem(BoneBarrel, "Bone Barrel");
		
		CrackedBarrel = new CrackedBarrel();
		GameRegistry.registerItem(CrackedBarrel, "Cracked Barrel");
		
		LilyBarrel = new LilyBarrel();
		GameRegistry.registerItem(LilyBarrel, "Lily Barrel");
		
		LilyVibrantBarrel = new LilyVibrantBarrel();
		GameRegistry.registerItem(LilyVibrantBarrel, "Lily Vibrant Barrel");
	
	}
	
	public static Item Barrel;
	public static Item GelatinBarrel;
	public static Item MinerBarrel;
	public static Item TravellerBarrel;
	public static Item IronSkinBarrel;
	public static Item WarriorBarrel;
	public static Item HealthBarrel;
	public static Item HotSauceBarrel;
	public static Item NightVisionBarrel;
	public static Item TorchBarrel;	
	public static Item ExplosiveBarrel;
	public static Item KrackenBarrel;
	public static Item DragonBarrel;
	public static Item CreeperBarrel;
	public static Item SkeletonBarrel;	
	public static Item ZombieBarrel;
	public static Item GelitizerBarrel;
	public static Item GroundMarrowBarrel;
	public static Item GroundFlourBarrel;
	public static Item GroundSugarBarrel;
	public static Item CoalBarrel;				
	public static Item CharcoalBarrel;
	public static Item WoodPulpBarrel;
	public static Item PrimingPowderBarrel;		
	public static Item GroundTriliteBarrel;		
	public static Item GroundRDXBarrel;			
	public static Item GroundMeatBarrel;
	public static Item GlassBarrel;	
	public static Item BoneBarrel;
	public static Item CrackedBarrel;
	public static Item LilyBarrel;	
	public static Item LilyVibrantBarrel;
	
	
public static void Vat() {
	
	TheVat = new TheVat();
	GameRegistry.registerItem(TheVat, "The Vat");
	
	H2OCoolVat = new H2OCoolVat();
	GameRegistry.registerItem(H2OCoolVat, "Vat(Cool H2O)");
	
	H2OHotVat = new H2OHotVat();
	GameRegistry.registerItem(H2OHotVat, "Vat(Hot H2O)");
	
	AcidVat = new AcidVat();
	GameRegistry.registerItem(AcidVat, "Acid Vat");
	
	PurifiedCollagenSolutionVat = new PurifiedCollagenSolutionVat();
	GameRegistry.registerItem(PurifiedCollagenSolutionVat, "Purified Collagen Solution Vat");
	
	GelatinSolutionVat = new GelatinSolutionVat();
	GameRegistry.registerItem(GelatinSolutionVat, "Gelatin Solution Vat");
	
	LavaVat = new LavaVat();
	GameRegistry.registerItem(LavaVat, "Lava Vat");
}
	
	public static Item TheVat;
	public static Item H2OCoolVat;
	public static Item H2OHotVat;
	public static Item AcidVat;
	public static Item PurifiedCollagenSolutionVat;
	public static Item GelatinSolutionVat;
	public static Item LavaVat;
		
	
	
//Recipes
public static void GelatinJarRecipes() {
	
//Gelatin	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Ingredients.GlassJar, 'C', Gelatin.GelatinCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.GelatinBarrel
	});
	
//Ground Meat Jar
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundMeatJar, 1, 1), new Object []{
		"BBB",
		"BJB",
		"BBB",
		
			'J', Ingredients.GlassJar, 'B', Ingredients.GlassBlank
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundMeatJar, 8, 1), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.GlassBarrel
	});
	
}
	

public static void MinerJarRecipes() {
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.MinerJar), new Object []{
		"CCC",
		"CJC",
		"CCC",
		
			'J', Ingredients.GlassJar, 'C', Gelatin.MinerCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.MinerJar), new Object []{
		" D ",
		"DJD",
		" D ",
		
			'J', Ingredients.GlassJar, 'D', Gelatin.MinerDish.setContainerItem(Ingredients.GlassDish)
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.MinerJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.MinerBarrel
	});
	
}

	
public static void TravellerJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TravellerJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Ingredients.GlassJar, 'C', Gelatin.TravellerCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TravellerJar), new Object []{
		" D ",
		"DJD",
		" D ",
		
			'J', Ingredients.GlassJar, 'D', Gelatin.TravellerDish
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TravellerJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.TravellerBarrel
	});
	
}
	

public static void IronSkinJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.IronSkinJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Ingredients.GlassJar, 'C', Gelatin.IronSkinCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.IronSkinJar), new Object []{
		" D ",
		"DJD",
		" D ",
		
			'J', Ingredients.GlassJar, 'D', Gelatin.IronSkinDish
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.IronSkinJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.IronSkinBarrel
	});
	
}


public static void WarriorJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.WarriorJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Ingredients.GlassJar, 'C', Gelatin.WarriorCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.WarriorJar), new Object []{
		" D ",
		"DJD",
		" D ",
		
			'J', Ingredients.GlassJar, 'D', Gelatin.WarriorDish
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.WarriorJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.WarriorBarrel
	});
	
}


public static void HealthJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.HealthJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Ingredients.GlassJar, 'C', Gelatin.HealthCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.HealthJar), new Object []{
		" D ",
		"DJD",
		" D ",
		
			'J', Ingredients.GlassJar, 'D', Gelatin.HealthDish
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.HealthJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.HealthBarrel
	});
	
}


public static void HotSauceJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.HotSauceJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Ingredients.GlassJar, 'C', Gelatin.HotSauceCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.HotSauceJar), new Object []{
		" D ",
		"DJD",
		" D ",
		
			'J', Ingredients.GlassJar, 'D', Gelatin.HotSauceDish
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.HotSauceJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.HotSauceBarrel
	});
	
}


public static void NVisionJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.NightVisionJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Ingredients.GlassJar, 'C', Gelatin.NightVisionCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.NightVisionJar), new Object []{
		" D ",
		"DJD",
		" D ",
		
			'J', Ingredients.GlassJar, 'D', Gelatin.NightVisionDish
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.NightVisionJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.NightVisionBarrel
	});
	
}


public static void TorchJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TorchJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Ingredients.GlassJar, 'C', Gelatin.TorchCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TorchJar), new Object []{
		" D ",
		"DJD",
		" D ",
		
			'J', Ingredients.GlassJar, 'D', Gelatin.TorchDish
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.TorchJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.TorchBarrel
	});
	
}


public static void ExplosiveJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.ExplosiveJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Ingredients.GlassJar, 'C', Gelatin.ExplosiveCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.ExplosiveJar), new Object []{
		" D ",
		"DJD",
		" D ",
		
			'J', Ingredients.GlassJar, 'D', Gelatin.ExplosiveDish
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.ExplosiveJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.ExplosiveBarrel
	});
	
}


public static void KrackenJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.KrackenJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Ingredients.GlassJar, 'C', Gelatin.KrackenCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.KrackenJar), new Object []{
		" D ",
		"DJD",
		" D ",
		
			'J', Ingredients.GlassJar, 'D', Gelatin.KrackenDish
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.KrackenJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.KrackenBarrel
	});
	
}


public static void DragonJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.DragonJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Ingredients.GlassJar, 'C', Gelatin.DragonCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.DragonJar), new Object []{
		" D ",
		"DJD",
		" D ",
		
			'J', Ingredients.GlassJar, 'D', Gelatin.DragonDish
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.DragonJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.DragonBarrel
	});
	
}


public static void CreeperJarRecipes() {
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.CreeperJar), new Object []{
		"   ",
		"HSM",
		"HCG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassJar, 'G', Ingredients.GelatinSolution, 
			'H', Ingredients.CreeperSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.CreeperJar), new Object []{
		"   ",
		"HGM",
		"HCS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassJar, 'S', Ingredients.GelatinSolution, 
			'H', Ingredients.CreeperSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.CreeperJar), new Object []{
		"   ",
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassJar, 'S', Ingredients.GelatinSolution, 
			'H', Ingredients.CreeperSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Storage.CreeperJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.CreeperBarrel
	});
	
}


public static void SkeletonJarRecipes() {
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.SkeletonJar), new Object []{
		"   ",
		"HSM",
		"HCG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassJar, 'G', Ingredients.GelatinSolution, 
			'H', Ingredients.SkeletonSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.SkeletonJar), new Object []{
		"   ",
		"HGM",
		"HCS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassJar, 'S', Ingredients.GelatinSolution, 
			'H', Ingredients.SkeletonSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.SkeletonJar), new Object []{
		"   ",
		"HGM",
		" CS",
	
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassJar, 'S', Ingredients.GelatinSolution, 
			'H', Ingredients.SkeletonSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Storage.SkeletonJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.SkeletonBarrel
	});
	
}


public static void ZombieJarRecipes() {
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.ZombieJar), new Object []{
		"   ",
		"HSM",
		"HCG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassJar, 'G', Ingredients.GelatinSolution, 
			'H', Ingredients.ZombieSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.ZombieJar), new Object []{
		"   ",
		"HGM",
		"HCS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassJar, 'S', Ingredients.GelatinSolution, 
			'H', Ingredients.ZombieSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.ZombieJar), new Object []{
		"   ",
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassJar, 'S', Ingredients.GelatinSolution, 
			'H', Ingredients.ZombieSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Storage.ZombieJar, 8), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'C', Ingredients.GlassJar, 'P', Storage.ZombieBarrel
	});
	
}


public static void BarrelRecipes() {
		
//Barrel
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.Barrel, 2), new Object [] {
		"S S",
		"R R",
		"SSS",
		
			'S', Blocks.wooden_slab, 'R', Ingredients.IronRod
	}));
	
//Creeper
	GameRegistry.addShapedRecipe(new ItemStack(Storage.CreeperBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.CreeperJar
	});		
	
//Dragon
	GameRegistry.addShapedRecipe(new ItemStack(Storage.DragonBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.DragonJar
	});
		
		
//Explosive
	GameRegistry.addShapedRecipe(new ItemStack(Storage.ExplosiveBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.ExplosiveJar
	});		
		
//Gelatin
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.GelatinJar
	});		
		
//Health
	GameRegistry.addShapedRecipe(new ItemStack(Storage.HealthBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.HealthJar
	});
	
//Hot Sauce
	GameRegistry.addShapedRecipe(new ItemStack(Storage.HotSauceBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.HotSauceJar
	});
		
//Iron Skin
	GameRegistry.addShapedRecipe(new ItemStack(Storage.IronSkinBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.IronSkinJar
	});
	
//Kracken
	GameRegistry.addShapedRecipe(new ItemStack(Storage.KrackenBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.KrackenJar
	});
	
//Miner
	GameRegistry.addShapedRecipe(new ItemStack(Storage.MinerBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.MinerJar
	});
	
//Night Vision
	GameRegistry.addShapedRecipe(new ItemStack(Storage.NightVisionBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.NightVisionJar
	});	
	
//Skeleton
	GameRegistry.addShapedRecipe(new ItemStack(Storage.SkeletonBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.SkeletonJar
	});	
	
//Torch
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TorchBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.TorchJar
	});	
	
//Traveller
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TravellerBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.TravellerJar
	});
	
//Warrior
	GameRegistry.addShapedRecipe(new ItemStack(Storage.WarriorBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.WarriorJar
	});
	
//Zombie
	GameRegistry.addShapedRecipe(new ItemStack(Storage.ZombieBarrel), new Object []{
		"JJJ",
		"JBJ",
		"JJJ",
		
			'B', Storage.Barrel, 'J', Storage.ZombieJar
	});		
	
//Bone
	GameRegistry.addShapedRecipe(new ItemStack(Storage.BoneBarrel), new Object []{
		"BBB",
		"BPB",
		"BBB",
		
			'P', Storage.Barrel, 'B', Items.bone
	});
	
//Coal
	GameRegistry.addShapedRecipe(new ItemStack(Storage.CoalBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.Barrel, 'J', Storage.GroundCoalJar
	});
	
//Charcoal
	GameRegistry.addShapedRecipe(new ItemStack(Storage.CharcoalBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.Barrel, 'J', Storage.GroundCharcoalJar
	});
	
//Cracked
	GameRegistry.addShapedRecipe(new ItemStack(Storage.CrackedBarrel), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Storage.Barrel, 'C', Ingredients.CrackedBone
	});
	
//Gelitizer
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelitizerBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.Barrel, 'J', Storage.GelitizerJar
	});	
	
//Glass
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GlassBarrel), new Object []{
		"BBB",
		"BPB",
		"BBB",
		
			'P', Storage.Barrel, 'B', new ItemStack(Storage.GroundMeatJar, 1, 1)
	});
	
//Ground Flour
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundFlourBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.Barrel, 'J', Storage.GroundFlourJar
	});
	
//Ground Marrow
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundMarrowBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.Barrel, 'J', Storage.GroundMarrowJar
	});	
	
//Ground Meat
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundMeatBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.Barrel, 'J', Storage.GroundMeatJar
	});
	
//Ground Sugar
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundSugarBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.Barrel, 'J', Storage.GroundSugarJar
	});
	
//Ground Sugar
	GameRegistry.addShapedRecipe(new ItemStack(Storage.WoodPulpBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.Barrel, 'J', Storage.WoodPulpJar
	});
	
//Priming Powder Jar
	GameRegistry.addShapedRecipe(new ItemStack(Storage.PrimingPowderJar), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Ingredients.GlassJar, 'J', Ingredients.PrimingPowder
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.PrimingPowderJar, 8), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'J', Ingredients.GlassJar, 'P', Storage.PrimingPowderBarrel
	});
	
//Priming Powder Barrel
	GameRegistry.addShapedRecipe(new ItemStack(Storage.PrimingPowderBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.Barrel, 'J', Storage.PrimingPowderJar
	});
	
//Ground Tilite Jar
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundTriliteJar), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Ingredients.GlassJar, 'J', Ingredients.GroundTrilite
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundTriliteJar, 8), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'J', Ingredients.GlassJar, 'P', Storage.GroundTriliteBarrel
	});
	
//Ground Tilite Barrel
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundTriliteBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.Barrel, 'J', Storage.GroundTriliteJar
	});
	
//Ground RDX Jar
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundRDXJar), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Ingredients.GlassJar, 'J', Ingredients.GroundRDX
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundRDXJar, 8), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'J', Ingredients.GlassJar, 'P', Storage.GroundRDXBarrel
	});
	
//Ground RDX Barrel
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundRDXBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.Barrel, 'J', Storage.GroundRDXJar
	});
	
//Lily
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LilyBarrel), new Object []{
		"LLL",
		"LPL",
		"LLL",
		
			'P', Storage.Barrel, 'L', Ingredients.GelatinLily
	});
	
//Vibrant Lily
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LilyVibrantBarrel), new Object []{
		"LLL",
		"LPL",
		"LLL",
		
			'P', Storage.Barrel, 'L', Ingredients.GelatinLilyVibrant
	});
}


public static void VatRecipes() {

//Vat
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.TheVat, 4), new Object [] {
		"I I",
		"G G",
		"IBI",
		
			'I', Items.iron_ingot, 'G', Blocks.glass_pane, 'B', Blocks.iron_block
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.TheVat, 4), new Object [] {
		"I I",
		"G G",
		"IBI",
		
			'I', Items.iron_ingot, 'G', "paneGlass", 'B', Blocks.iron_block
	}));
	
//Gelatin Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.GelatinSolution
	});	
	
//Miner Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 1), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.MinerSolution
	});
	
//Traveller Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 2), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.TravellerSolution
	});	
	
//Iron Skin Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 3), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.IronSkinSolution
	});
	
//Warrior Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 4), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.WarriorSolution
	});	
	
//Health Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 5), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.HealthSolution
	});
	
//Hot Sauce Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 6), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.HotSauceSolution
	});	
	
//Night Vision Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 7), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.NightVisionSolution
	});
	
//Torch Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 8), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.TorchSolution
	});	
	
//CompB Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 9), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.CompBSolution
	});
	
//Kracken Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 10), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.KrackenSolution
	});	
	
//Dragon Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 11), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.DragonSolution
	});
	
//Creeper Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 12), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.CreeperSolution.setContainerItem(Ingredients.GlassBottle)
	});	
	
//Skeleton Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 13), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.SkeletonSolution.setContainerItem(Ingredients.GlassBottle)
	});
	
//Zombie Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 14), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Ingredients.ZombieSolution.setContainerItem(Ingredients.GlassBottle)
	});	
	
//Gelatin Juice Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 15), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Gelatin.GelatinJuice
	});
	
//Healing Gelatin Juice Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat, 1, 16), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Gelatin.GelatinJuiceHealing.setContainerItem(Ingredients.GlassBottle)
	});
	
//H2O Jar Cool		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolJar), new Object []{
		"   ",
		" J ",
		" B ",
		
			'B', Items.water_bucket, 'J', Ingredients.GlassJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolJar, 8), new Object []{
		"JJJ",
		"JVJ",
		"JJJ",
		
			'V', Storage.H2OCoolVat, 'J', Ingredients.GlassJar
	});
	
//H2O Vat Cool
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolVat), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Storage.H2OCoolJar
	});	
	
//H20 Jar Hot
	GameRegistry.addSmelting(Storage.H2OCoolJar, new ItemStack(Storage.H2OHotJar), 0.3F);
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.H2OHotJar), new Object [] {
		"   ",
		"JSW",
		" C ",
		
			'S', Utilities.Smeltry, 'W', Storage.H2OCoolJar, 'C', "dustCharcoal", 'J', Ingredients.GlassJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.H2OHotJar), new Object [] {
		"   ",
		"JGW",
		" C ",
		
			'G', Utilities.GChamberT2, 'W', Storage.H2OCoolJar, 'C', "dustCharcoal", 'J', Ingredients.GlassJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.H2OHotJar), new Object [] {
		"   ",
		"JGW",
		" C ",
		
			'G', Utilities.GChamberT3, 'W', Storage.H2OCoolJar, 'C', "dustCharcoal", 'J', Ingredients.GlassJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.H2OHotJar, 2), new Object [] {
		"   ",
		"JGW",
		"JCW",
		
			'G', Utilities.GChamberT3, 'W', Storage.H2OCoolJar, 'C', "dustCharcoal", 'J', Ingredients.GlassJar
	}));
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OHotJar, 8), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.H2OHotVat, 'J', Ingredients.GlassJar
	});
	
//H2O Vat Hot
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OHotVat), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Storage.H2OHotJar
	});	
	
//Jar of Acid	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidJar, 2), new Object [] {
		"YGY",
		"YJY",
		"YGY",
		
			'J', Storage.H2OHotJar, 'Y', "listAllcitrus", 'G', Ingredients.GlassJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidJar, 2), new Object [] {
		"YGY",
		"YJY",
		"YGY",
		
			'J', Storage.H2OHotJar, 'Y', "cropYuzu", 'G', Ingredients.GlassJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidJar, 2), new Object [] {
		"YGY",
		"YJY",
		"YGY",
	
			'J', Storage.H2OHotJar, 'Y', "cropCranberry", 'G', Ingredients.GlassJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidJar, 2), new Object [] {
		"YGY",
		"YJY",
		"YGY",
		
			'J', Storage.H2OHotJar, 'Y', "cropBlackberry", 'G', Ingredients.GlassJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidJar, 2), new Object [] {
		"YGY",
		"YJY",
		"YGY",
		
			'J', Storage.H2OHotJar, 'Y', "cropRaspberry", 'G', Ingredients.GlassJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidJar, 2), new Object [] {
		"YGY",
		"YJY",
		"YGY",
		
			'J', Storage.H2OHotJar, 'Y', "cropStrawberry", 'G', Ingredients.GlassJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidJar, 2), new Object [] {
		"YGY",
		"YJY",
		"YGY",
		
			'J', Storage.H2OHotJar, 'Y', "cropGrape", 'G', Ingredients.GlassJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidJar, 2), new Object [] {
		"YGY",
		"YJY",
		"YGY",
		
			'J', Storage.H2OHotJar, 'Y', "cropPineapple", 'G', Ingredients.GlassJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.AcidJar, 2), new Object [] {
		"YGY",
		"YJY",
		"YGY",
		
			'J', Storage.H2OHotJar, 'Y', "cropKiwi", 'G', Ingredients.GlassJar
	}));
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.AcidJar, 8), new Object []{
		"JJJ",
		"JVJ",
		"JJJ",
		
			'V', Storage.AcidVat, 'J', Ingredients.GlassJar
	});
	
//Vat of Acid
	GameRegistry.addShapedRecipe(new ItemStack(Storage.AcidVat), new Object [] {
		"JJJ",
		"JVJ",
		"JJJ",
		
			'V', Storage.TheVat, 'J', Storage.AcidJar
	});	
	
//Lava Jar	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaJar), new Object [] {
		"SSS",
		"SGS",
		"CJC",
		
			'G', Utilities.GChamberT2, 'C', Storage.GroundCharcoalJar, 'S', Blocks.stone, 
			'J', Ingredients.GlassJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaJar), new Object [] {
		"SSS",
		"SGS",
		"CJC",
		
			'G', Utilities.GChamberT3, 'C', Storage.GroundCharcoalJar, 'S', Blocks.stone, 
			'J', Ingredients.GlassJar 
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaJar, 2), new Object [] {
		"SSS",
		"SGS",
		"JLJ",
		
			'G', Utilities.GChamberT3, 'L', Storage.LavaJar, 'S', Blocks.stone, 
			'J', Ingredients.GlassJar 
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaJar), new Object []{
		"   ",
		" J ",
		" B ",
		
			'J', Ingredients.GlassJar, 'B', Items.lava_bucket
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaJar, 8), new Object []{
		"JJJ",
		"JVJ",
		"JJJ",
		
			'V', Storage.LavaVat, 'J', Ingredients.GlassJar
	});
	
//Lava Vat
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaVat), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Storage.LavaJar
	});	
	
//Purified Collagen Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.PurifiedCollagenSolutionJar, 2), new Object []{
		"MJM",
		"MAM",
		"MJM",
		
			'A', Storage.AcidJar, 'M', Ingredients.GroundMarrow, 'J', Ingredients.GlassJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.PurifiedCollagenSolutionJar, 3), new Object []{
		"MMM",
		"JAJ",
		"MJM",
		
			'A', Storage.AcidJar, 'M', Ingredients.GroundMeat, 'J', Ingredients.GlassJar
	});	
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.PurifiedCollagenSolutionJar, 4), new Object []{
		"LJL",
		"JAJ",
		"LJL",
		
			'A', Storage.AcidJar, 'L', Items.leather, 'J', Ingredients.GlassJar
	}));
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.PurifiedCollagenSolutionJar, 8), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.PurifiedCollagenSolutionVat, 'J', Ingredients.GlassJar
	});	
	
//Purified Collagen Solution Vat
	GameRegistry.addShapedRecipe(new ItemStack(Storage.PurifiedCollagenSolutionVat), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Storage.TheVat, 'J', Storage.PurifiedCollagenSolutionJar
	});
	
	
	
}


}








