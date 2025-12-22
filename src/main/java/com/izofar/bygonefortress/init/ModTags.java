package com.izofar.bygonefortress.init;

import com.izofar.bygonefortress.BygoneFortressMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.structure.Structure;

public class ModTags {
    public static TagKey<Structure> NO_BASALT;

    public static void initTags(){
       NO_BASALT = TagKey.create(Registries.STRUCTURE, new ResourceLocation(BygoneFortressMod.MODID, "no_basalt"));
    }
}
