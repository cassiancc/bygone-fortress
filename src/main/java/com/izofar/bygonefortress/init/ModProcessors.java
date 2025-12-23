package com.izofar.bygonefortress.init;

import com.izofar.bygonefortress.BygoneFortressMod;
import com.izofar.bygonefortress.world.processors.DataBlockProcessor;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;

import java.util.function.Supplier;

public abstract class ModProcessors {


    public static final Supplier<StructureProcessorType<DataBlockProcessor>> DATA_BLOCK_PROCESSOR = ()-> Registry.register(BuiltInRegistries.STRUCTURE_PROCESSOR,new ResourceLocation(BygoneFortressMod.MODID, "data_block_processor"), () -> DataBlockProcessor.CODEC);

    public static void register(){
        DATA_BLOCK_PROCESSOR.get();
    }
}
