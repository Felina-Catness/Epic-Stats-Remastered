
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.felinamods.epicstatsmodremastered.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.felinamods.epicstatsmodremastered.enchantment.ExpHunterEnchantment;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

public class EpicStatsModRemasteredModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, EpicStatsModRemasteredMod.MODID);
	public static final RegistryObject<Enchantment> EXP_HUNTER = REGISTRY.register("exp_hunter", () -> new ExpHunterEnchantment());
}
