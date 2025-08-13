package net.fastcreepermod.fastcreepermod;

import net.fabricmc.api.ModInitializer;

import net.fastcreepermod.fastcreepermod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class FastCreeperMod implements ModInitializer {
	public static final String MOD_ID = "fastcreepermod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

        ModItems.registerModItems();

	}
}