package com.kuronami.supercontinent;

import com.kuronami.isekaiapi.api.Isekai;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Supercontinent.MODID)
public final class Supercontinent {
    public static final String MODID = "supercontinent";
    public static final String VERSION = "0.1.0";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Supercontinent(IEventBus modBus) {
        LOGGER.info("Supercontinent v{} loading", VERSION);
        LOGGER.info("Supercontinent: Isekai API facade ready (query={}, remap={})",
                Isekai.query().getClass().getSimpleName(),
                Isekai.remap().getClass().getSimpleName());
    }
}
