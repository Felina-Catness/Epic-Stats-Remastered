
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.felinamods.epicstatsmodremastered.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

public class EpicStatsModRemasteredModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, EpicStatsModRemasteredMod.MODID);
	public static final RegistryObject<SoundEvent> BOOK = REGISTRY.register("book", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("epic_stats_mod_remastered", "book")));
}
