package com.izofar.bygonefortress.init;

import com.izofar.bygonefortress.BygoneFortressMod;
import com.izofar.bygonefortress.world.feature.MobFeature;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import java.util.function.Supplier;

public abstract class ModFeatures {


	public static final Supplier<Feature<NoneFeatureConfiguration>> MOB_FEATURE_WITHER_SKELETON = ()-> Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(BygoneFortressMod.MODID,"mob_feature_wither_skeleton"), new MobFeature<>(() -> EntityType.WITHER_SKELETON));

	public static void register() {
		MOB_FEATURE_WITHER_SKELETON.get();
	}

}
