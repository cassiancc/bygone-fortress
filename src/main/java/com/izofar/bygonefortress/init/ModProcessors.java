package com.izofar.bygonefortress.init;

import com.izofar.bygonefortress.BygoneFortressMod;
import com.izofar.bygonefortress.world.processors.DataBlockProcessor;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public abstract class ModProcessors {

    public static final MapCodec<DataBlockProcessor> DATA_BLOCK_PROCESSOR = Registry.register(BuiltInRegistries.STRUCTURE_PROCESSOR, Identifier.fromNamespaceAndPath(BygoneFortressMod.MODID, "data_block_processor"), DataBlockProcessor.CODEC);

    public static void register(){

    }
}
