
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.felinamods.epicstatsmodremastered.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.felinamods.epicstatsmodremastered.potion.WisdomMobEffect;
import net.felinamods.epicstatsmodremastered.potion.OverweightMobEffect;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

public class EpicStatsModRemasteredModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, EpicStatsModRemasteredMod.MODID);
	public static final RegistryObject<MobEffect> WISDOM = REGISTRY.register("wisdom", () -> new WisdomMobEffect());
	public static final RegistryObject<MobEffect> OVERWEIGHT = REGISTRY.register("overweight", () -> new OverweightMobEffect());
}
