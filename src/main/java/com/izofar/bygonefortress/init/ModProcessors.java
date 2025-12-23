package com.izofar.bygonefortress.init;

import com.izofar.bygonefortress.BygoneFortressMod;
import com.izofar.bygonefortress.world.processors.DataBlockProcessor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public abstract class ModProcessors {

    public static final DeferredRegister<StructureProcessorType<?>> STRUCTURE_PROCESSOR = DeferredRegister.create(BuiltInRegistries.STRUCTURE_PROCESSOR, BygoneFortressMod.MODID);

    public static final Supplier<StructureProcessorType<DataBlockProcessor>> DATA_BLOCK_PROCESSOR = STRUCTURE_PROCESSOR.register("data_block_processor", () -> () -> DataBlockProcessor.CODEC);

    public static void register(IEventBus eventBus){
        STRUCTURE_PROCESSOR.register(eventBus);
    }
}
