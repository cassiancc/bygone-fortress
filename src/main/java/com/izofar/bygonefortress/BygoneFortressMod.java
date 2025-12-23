package com.izofar.bygonefortress;

import com.izofar.bygonefortress.init.*;
import com.izofar.bygonefortress.util.ModStructureUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BygoneFortressMod.MODID)
public class BygoneFortressMod
{
    public static final String MODID = "bygonefortress";
    public static final Logger LOGGER = LogManager.getLogger();

    public BygoneFortressMod(IEventBus eventBus) {

        ModStructures.register(eventBus);
        ModFeatures.register(eventBus);
        ModProcessors.register(eventBus);

        eventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModStructureUtils.addBasaltRestrictions();
            ModTags.initTags();
        });
    }

}
