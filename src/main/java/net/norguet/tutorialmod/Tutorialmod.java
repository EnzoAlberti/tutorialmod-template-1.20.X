package net.norguet.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.norguet.tutorialmod.block.ModBlocks;
import net.norguet.tutorialmod.item.ModItemGroups;
import net.norguet.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorialmod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();	//Register the ruby tab, otherwise the game crashes
		ModItems.registerModItems();		//Register the item, otherwise the game crashes
		ModBlocks.registerModBlocks();		//Register the block, otherwise the game crashes
	}
}