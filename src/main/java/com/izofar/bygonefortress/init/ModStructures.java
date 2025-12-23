package com.izofar.bygonefortress.init;

import com.izofar.bygonefortress.BygoneFortressMod;
import com.izofar.bygonefortress.world.structure.NetherFortressStructure;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.StructureType;

import java.util.function.Supplier;

public abstract class ModStructures {

	public static final Supplier<StructureType<NetherFortressStructure>> NETHER_FORTRESS = ()-> Registry.register(BuiltInRegistries.STRUCTURE_TYPE, new ResourceLocation(BygoneFortressMod.MODID, "fortress"), ()-> NetherFortressStructure.CODEC);
	
	public static void register() {
		NETHER_FORTRESS.get();

	}
}
