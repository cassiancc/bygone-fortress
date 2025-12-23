package com.izofar.bygonefortress.init;

import com.izofar.bygonefortress.BygoneFortressMod;
import com.izofar.bygonefortress.world.structure.NetherFortressStructure;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public abstract class ModStructures {

	public static final DeferredRegister<StructureType<?>> MODDED_STRUCTURES = DeferredRegister.create(Registries.STRUCTURE_TYPE, BygoneFortressMod.MODID);

	public static final Supplier<StructureType<NetherFortressStructure>> NETHER_FORTRESS = MODDED_STRUCTURES.register("fortress", () -> () -> NetherFortressStructure.CODEC);
	
	public static void register(IEventBus eventBus) { MODDED_STRUCTURES.register(eventBus); }
}
