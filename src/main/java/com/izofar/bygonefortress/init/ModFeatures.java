package com.izofar.bygonefortress.init;

import com.izofar.bygonefortress.BygoneFortressMod;
import com.izofar.bygonefortress.world.feature.MobFeature;
import com.izofar.bygonefortress.world.feature.MobPassengerFeature;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ReplaceBlobsFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.ReplaceSphereConfiguration;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public abstract class ModFeatures {

	public static final DeferredRegister<Feature<?>> MODDED_FEATURES = DeferredRegister.create(BuiltInRegistries.FEATURE, BygoneFortressMod.MODID);

	public static final Supplier<Feature<NoneFeatureConfiguration>> MOB_FEATURE_WITHER_SKELETON = MODDED_FEATURES.register("mob_feature_wither_skeleton", () -> new MobFeature<>(() -> EntityType.WITHER_SKELETON));

	public static void register(IEventBus eventBus) { MODDED_FEATURES.register(eventBus); }

}
