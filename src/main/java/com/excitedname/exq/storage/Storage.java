package com.excitedname.exq.storage;

import com.excitedname.exq.gelatin.Gelatin;
import com.excitedname.exq.ingredients.Ingredients;
import com.excitedname.exq.storage.barrels.BoneBarrel;
import com.excitedname.exq.storage.barrels.CharcoalBarrel;
import com.excitedname.exq.storage.barrels.CoalBarrel;
import com.excitedname.exq.storage.barrels.CrackedBarrel;
import com.excitedname.exq.storage.barrels.CreeperBarrel;
import com.excitedname.exq.storage.barrels.DragonBarrel;
import com.excitedname.exq.storage.barrels.ExplosiveBarrel;
import com.excitedname.exq.storage.barrels.FeatherBarrel;
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
import com.excitedname.exq.storage.jar.GelitilizerJar;
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
	
		H2OCoolJar = new H2OCoolJar(Blocks.flowing_water);
		GameRegistry.registerItem(H2OCoolJar, "Dihydrogen Monoxide Jar(Cool)");
		
		H2OHotJar = new H2OHotJar();
		GameRegistry.registerItem(H2OHotJar, "Dihydrogen Monoxide Jar(Hot)");
		
		AcidJar = new AcidJar();
		GameRegistry.registerItem(AcidJar, "Acid Jar");
		
		PurifiedCollagenSolutionJar = new PurifiedCollagenSolutionJar();
		GameRegistry.registerItem(PurifiedCollagenSolutionJar, "Purified Collagen Solution Jar");
		
		GelatinSolutionJar = new GelatinSolutionJar();
		GameRegistry.registerItem(GelatinSolutionJar, "Gelatin Solution Jar");
		
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
	public static Item GelitilizerJar;
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
	public static Item GelatinSolutionJar;
	public static Item LavaJar;

	
public static void Barrel() {
	
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
		
		FeatherBarrel = new FeatherBarrel();
		GameRegistry.registerItem(FeatherBarrel, "Feather Barrel");
		
		BoneBarrel = new BoneBarrel();
		GameRegistry.registerItem(BoneBarrel, "Bone Barrel");
		
		CrackedBarrel = new CrackedBarrel();
		GameRegistry.registerItem(CrackedBarrel, "Cracked Barrel");
		
		LilyBarrel = new LilyBarrel();
		GameRegistry.registerItem(LilyBarrel, "Lily Barrel");
		
		LilyVibrantBarrel = new LilyVibrantBarrel();
		GameRegistry.registerItem(LilyVibrantBarrel, "Lily Vibrant Barrel");
	
	}
	
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
	public static Item PrimingPowderBarrel;		
	public static Item GroundTriliteBarrel;		
	public static Item GroundRDXBarrel;			
	public static Item GroundMeatBarrel;
	public static Item GlassBarrel;	
	public static Item FeatherBarrel;	
	public static Item BoneBarrel;
	public static Item CrackedBarrel;
	public static Item LilyBarrel;	
	public static Item LilyVibrantBarrel;
	
	
public static void Vat() {
	
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
	
	public static Item H2OCoolVat;
	public static Item H2OHotVat;
	public static Item AcidVat;
	public static Item PurifiedCollagenSolutionVat;
	public static Item GelatinSolutionVat;
	public static Item LavaVat;
		
	
	
//Recipes
public static void GelatinJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Utilities.PackUlater, 'C', Gelatin.GelatinCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinJar), new Object []{
		"CCC",
		"CGC",
		"CCC",
		
			'G', Utilities.GChamberT3, 'C', Gelatin.GelatinCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinJar, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.GelatinBarrel
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinJar, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.GelatinBarrel
	});
	
}
	

public static void MinerJarRecipes() {
		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.MinerJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Utilities.PackUlater, 'C', Gelatin.MinerCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.MinerJar), new Object []{
		"CCC",
		"CJC",
		"CCC",
		
			'J', Ingredients.GlassJar, 'C', Gelatin.MinerCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.MinerJar), new Object []{
		"DDD",
		"DJD",
		"DDD",
		
			'J', Ingredients.GlassJar, 'D', Gelatin.MinerDish.setContainerItem(Ingredients.GlassDish)
	});
	
	GameRegistry.addShapelessRecipe(new ItemStack(Storage.MinerJar, 8),
			Storage.MinerBarrel);
	
}

	
public static void TravellerJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TravellerJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Utilities.PackUlater, 'C', Gelatin.TravellerCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TravellerJar), new Object []{
		"CCC",
		"CGC",
		"CCC",
		
			'G', Utilities.GChamberT3, 'C', Gelatin.TravellerCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TravellerJar), new Object []{
		"DDD",
		"DGD",
		"DDD",
		
			'G', Utilities.GChamberT3, 'D', Gelatin.TravellerDish.setContainerItem(Ingredients.GlassDish)
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.TravellerJar, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.TravellerBarrel
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TravellerJar, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.TravellerBarrel
	});
	
}
	

public static void IronSkinJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.IronSkinJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Utilities.PackUlater, 'C', Gelatin.IronSkinCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.IronSkinJar), new Object []{
		"CCC",
		"CGC",
		"CCC",
		
			'G', Utilities.GChamberT3, 'C', Gelatin.IronSkinCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.IronSkinJar), new Object []{
		"DDD",
		"DGD",
		"DDD",
		
			'G', Utilities.GChamberT3, 'D', Gelatin.IronSkinDish.setContainerItem(Ingredients.GlassDish)
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.IronSkinJar, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.IronSkinBarrel
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.IronSkinJar, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.IronSkinBarrel
	});
	
}


public static void WarriorJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.WarriorJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Utilities.PackUlater, 'C', Gelatin.WarriorCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.WarriorJar), new Object []{
		"CCC",
		"CGC",
		"CCC",
		
			'G', Utilities.GChamberT3, 'C', Gelatin.WarriorCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.WarriorJar), new Object []{
		"DDD",
		"DGD",
		"DDD",
		
			'G', Utilities.GChamberT3, 'D', Gelatin.WarriorDish.setContainerItem(Ingredients.GlassDish)
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.WarriorJar, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.WarriorBarrel
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.WarriorJar, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.WarriorBarrel
	});	
	
}


public static void HealthJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.HealthJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Utilities.PackUlater, 'C', Gelatin.HealthCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.HealthJar), new Object []{
		"CCC",
		"CGC",
		"CCC",
		
			'G', Utilities.GChamberT3, 'C', Gelatin.HealthCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.HealthJar), new Object []{
		"DDD",
		"DGD",
		"DDD",
		
			'G', Utilities.GChamberT3, 'D', Gelatin.HealthDish.setContainerItem(Ingredients.GlassDish)
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.HealthJar, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.HealthBarrel
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.HealthJar, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.HealthBarrel
	});
	
}


public static void NVisionJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.NightVisionJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Utilities.PackUlater, 'C', Gelatin.NightVisionCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.NightVisionJar), new Object []{
		"CCC",
		"CGC",
		"CCC",
		
			'G', Utilities.GChamberT3, 'C', Gelatin.NightVisionCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.NightVisionJar), new Object []{
		"DDD",
		"DGD",
		"DDD",
		
			'G', Utilities.GChamberT3, 'D', Gelatin.NightVisionDish.setContainerItem(Ingredients.GlassDish)
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.NightVisionJar, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.NightVisionBarrel
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.NightVisionJar, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.NightVisionBarrel
	});
	
}


public static void TorchJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TorchJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Utilities.PackUlater, 'C', Gelatin.TorchCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TorchJar), new Object []{
		"CCC",
		"CGC",
		"CCC",
		
			'G', Utilities.GChamberT3, 'C', Gelatin.TorchCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TorchJar), new Object []{
		"DDD",
		"DGD",
		"DDD",
		
			'G', Utilities.GChamberT3, 'D', Gelatin.TorchDish.setContainerItem(Ingredients.GlassDish)
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.TorchJar, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.TorchBarrel
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TorchJar, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.TorchBarrel
	});
	
}


public static void ExplosiveJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.ExplosiveJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Utilities.PackUlater, 'C', Gelatin.ExplosiveCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.ExplosiveJar), new Object []{
		"CCC",
		"CGC",
		"CCC",
		
			'G', Utilities.GChamberT3, 'C', Gelatin.ExplosiveCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.ExplosiveJar), new Object []{
		"DDD",
		"DGD",
		"DDD",
		
			'G', Utilities.GChamberT3, 'D', Gelatin.ExplosiveDish.setContainerItem(Ingredients.GlassDish)
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.ExplosiveJar, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.ExplosiveBarrel
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.ExplosiveJar, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.ExplosiveBarrel
	});
	
}


public static void KrackenJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.KrackenJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Utilities.PackUlater, 'C', Gelatin.KrackenCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.KrackenJar), new Object []{
		"CCC",
		"CGC",
		"CCC",
		
			'G', Utilities.GChamberT3, 'C', Gelatin.KrackenCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.KrackenJar), new Object []{
		"DDD",
		"DGD",
		"DDD",
		
			'G', Utilities.GChamberT3, 'D', Gelatin.KrackenDish.setContainerItem(Ingredients.GlassDish)
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.KrackenJar, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.KrackenBarrel
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.KrackenJar, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.KrackenBarrel
	});
	
}


public static void DragonJarRecipes() {
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.DragonJar), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Utilities.PackUlater, 'C', Gelatin.DragonCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.DragonJar), new Object []{
		"CCC",
		"CGC",
		"CCC",
		
			'G', Utilities.GChamberT3, 'C', Gelatin.DragonCube
	});
			
	GameRegistry.addShapedRecipe(new ItemStack(Storage.DragonJar), new Object []{
		"DDD",
		"DGD",
		"DDD",
		
			'G', Utilities.GChamberT3, 'D', Gelatin.DragonDish.setContainerItem(Ingredients.GlassDish)
	});

	GameRegistry.addShapedRecipe(new ItemStack(Storage.DragonJar, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.DragonBarrel
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.DragonJar, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.DragonBarrel
	});
	
}


public static void CreeperJarRecipes() {
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.CreeperJar), new Object []{
		"HHH",
		"HSM",
		"HCG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassGelatinMold, 'G', Storage.GelatinSolutionJar, 
			'H', Ingredients.CreeperSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.CreeperJar), new Object []{
		"HHH",
		"HGM",
		"HCS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.CreeperSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.CreeperJar), new Object []{
		"HHH",
		"HGM",
		"HCS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.CreeperSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Storage.CreeperJar, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.CreeperBarrel
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.CreeperJar, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.CreeperBarrel
	});
	
}


public static void SkeletonJarRecipes() {
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.SkeletonJar), new Object []{
		"HHH",
		"HSM",
		"HCG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassGelatinMold, 'G', Storage.GelatinSolutionJar, 
			'H', Ingredients.SkeletonSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.SkeletonJar), new Object []{
		"HHH",
		"HGM",
		"HCS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.SkeletonSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.SkeletonJar), new Object []{
		"HHH",
		"HGM",
		"HCS",
	
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.SkeletonSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Storage.SkeletonJar, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.SkeletonBarrel
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.SkeletonJar, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.SkeletonBarrel
	});	
	
}


public static void ZombieJarRecipes() {
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.ZombieJar), new Object []{
		"HHH",
		"HSM",
		"HCG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassGelatinMold, 'G', Storage.GelatinSolutionJar, 
			'H', Ingredients.ZombieSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.ZombieJar), new Object []{
		"HHH",
		"HGM",
		"HCS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.ZombieSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Storage.ZombieJar), new Object []{
		"HHH",
		"HGM",
		"HCS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.ZombieSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Storage.ZombieJar, 8), new Object []{
		"   ",
		" P ",
		" B ",
		
			'P', Utilities.PackUlater, 'B', Storage.ZombieBarrel
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Storage.ZombieJar, 8), new Object []{
		"   ",
		" G ",
		" B ",
		
			'G', Utilities.GChamberT3, 'B', Storage.ZombieBarrel
	});	
	
}


public static void BarrelRecipes() {
		
	//Creeper
	GameRegistry.addShapedRecipe(new ItemStack(Storage.CreeperBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.CreeperJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.CreeperBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.CreeperJar
	});
		
	
	//Dragon
	GameRegistry.addShapedRecipe(new ItemStack(Storage.DragonBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.DragonJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.DragonBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.DragonJar
	});
		
		
	//Explosive
	GameRegistry.addShapedRecipe(new ItemStack(Storage.ExplosiveBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.ExplosiveJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.ExplosiveBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.ExplosiveJar
	});
		
		
	//Gelatin
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.GelatinJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.GelatinJar
	});
		
		
	//Health
	GameRegistry.addShapedRecipe(new ItemStack(Storage.HealthBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.HealthJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.HealthBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.HealthJar
	});
		
		
	//Iron Skin
	GameRegistry.addShapedRecipe(new ItemStack(Storage.IronSkinBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.IronSkinJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.IronSkinBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.IronSkinJar
	});
	
	
	//Kracken
	GameRegistry.addShapedRecipe(new ItemStack(Storage.KrackenBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.KrackenJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.KrackenBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.KrackenJar
	});
	
	
	//Miner
	GameRegistry.addShapedRecipe(new ItemStack(Storage.MinerBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.MinerJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.MinerBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.MinerJar
	});
	
	
	//Night Vision
	GameRegistry.addShapedRecipe(new ItemStack(Storage.NightVisionBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.NightVisionJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.NightVisionBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.NightVisionJar
	});
	
	
	//Skeleton
	GameRegistry.addShapedRecipe(new ItemStack(Storage.SkeletonBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.SkeletonJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.SkeletonBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.SkeletonJar
	});
	
	
	//Torch
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TorchBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.TorchJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TorchBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.TorchJar
	});
	
	
	//Traveller
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TravellerBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.TravellerJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.TravellerBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.TravellerJar
	});
	
	
	//Warrior
	GameRegistry.addShapedRecipe(new ItemStack(Storage.WarriorBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.WarriorJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.WarriorBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.WarriorJar
	});
	
	
	//Zombie
	GameRegistry.addShapedRecipe(new ItemStack(Storage.ZombieBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.ZombieJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.ZombieBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.ZombieJar
	});		
	
	//Bone
	GameRegistry.addShapedRecipe(new ItemStack(Storage.BoneBarrel), new Object []{
		"BBB",
		"BPB",
		"BBB",
		
			'P', Utilities.PackUlater, 'B', Items.bone
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.BoneBarrel), new Object []{
		"BBB",
		"BGB",
		"BBB",
		
			'G', Utilities.GChamberT3, 'B', Items.bone
	});
	
	
	//Charcoal
	GameRegistry.addShapedRecipe(new ItemStack(Storage.CharcoalBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.GroundCharcoalJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.CharcoalBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.GroundCharcoalJar
	});
	
	
	//Cracked
	GameRegistry.addShapedRecipe(new ItemStack(Storage.CrackedBarrel), new Object []{
		"CCC",
		"CPC",
		"CCC",
		
			'P', Utilities.PackUlater, 'C', Ingredients.CrackedBone
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.CrackedBarrel), new Object []{
		"CCC",
		"CGC",
		"CCC",
		
			'G', Utilities.GChamberT3, 'C', Ingredients.CrackedBone
	});
	
	
	//Gelatin Solution
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.GelatinSolutionJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelatinSolutionVat), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.GelatinSolutionJar
	});
	
	
	//Gelitizer
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelitizerBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.GelitilizerJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GelitizerBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.GelitilizerJar
	});
	
	
	//Glass
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GlassBarrel), new Object []{
		"BBB",
		"BPB",
		"BBB",
		
			'P', Utilities.PackUlater, 'B', Ingredients.GlassBlank
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GlassBarrel), new Object []{
		"BBB",
		"BGB",
		"BBB",
		
			'G', Utilities.GChamberT3, 'B', Ingredients.GlassBlank
	});
	
	
	//Ground Flour
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundFlourBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.GroundFlourJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundFlourBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.GroundFlourJar
	});
	
	
	//Ground Marrow
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundMarrowBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.GroundMarrowJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundMarrowBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.GroundMarrowJar
	});
	
	
	//Ground Sugar
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundSugarBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.GroundSugarJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.GroundSugarBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.GroundSugarJar
	});
	
	//Feather
	GameRegistry.addShapedRecipe(new ItemStack(Storage.FeatherBarrel), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Items.feather
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.FeatherBarrel), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Items.feather
	});
	
	//H2O Cool
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolVat), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.H2OCoolJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OCoolVat), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.H2OCoolJar
	});
	
	//H2O Hot
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OHotVat), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.H2OHotJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.H2OHotVat), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.H2OHotJar
	});
	
	//Lava
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaVat), new Object []{
		"JJJ",
		"JPJ",
		"JJJ",
		
			'P', Utilities.PackUlater, 'J', Storage.LavaJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LavaVat), new Object []{
		"JJJ",
		"JGJ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.LavaJar
	});
	
	//Lily
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LilyBarrel), new Object []{
		"LLL",
		"LPL",
		"LLL",
		
			'P', Utilities.PackUlater, 'L', Ingredients.GelatinLily
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Storage.LilyBarrel), new Object []{
		"LLL",
		"LGL",
		"LLL",
		
			'G', Utilities.GChamberT3, 'L', Ingredients.GelatinLily
	});
}

}








