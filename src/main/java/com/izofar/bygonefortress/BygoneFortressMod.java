package com.izofar.bygonefortress;

import com.izofar.bygonefortress.init.*;
import com.izofar.bygonefortress.util.ModStructureUtils;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BygoneFortressMod implements ModInitializer
{
    public static final String MODID = "bygonefortress";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        ModStructures.register();
        ModFeatures.register();
        ModProcessors.register();
        ModStructureUtils.addBasaltRestrictions();
        ModTags.initTags();

    }
}
