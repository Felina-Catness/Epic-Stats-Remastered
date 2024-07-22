package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.felinamods.epicstatsmodremastered.network.EpicStatsModRemasteredModVariables;
import net.felinamods.epicstatsmodremastered.init.EpicStatsModRemasteredModEnchantments;
import net.felinamods.epicstatsmodremastered.configuration.ExpManagerConfiguration;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ExpManageMainProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double explimit = 0;
		String waw = "";
		if (EnchantmentHelper.getItemEnchantmentLevel(EpicStatsModRemasteredModEnchantments.EXP_HUNTER.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			if (entity.getPersistentData().getDouble("LEVEL") > 0) {
				if ((ExpManagerConfiguration.EXP_FROM.get()).equals("Type")) {
					if ((double) ExpManagerConfiguration.TYPES_USED.get() == 1) {
						if (sourceentity instanceof Player && entity instanceof Monster) {
							{
								double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * 2 * (double) ExpManagerConfiguration.AUTOLVL_CAP.get();
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					} else if ((double) ExpManagerConfiguration.TYPES_USED.get() == 2) {
						if (sourceentity instanceof Player && (entity instanceof Monster || entity instanceof Mob)) {
							{
								double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * 2 * (double) ExpManagerConfiguration.AUTOLVL_CAP.get();
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					} else if ((double) ExpManagerConfiguration.TYPES_USED.get() == 3) {
						if (sourceentity instanceof Player && (entity instanceof Monster || entity instanceof Mob || entity instanceof PathfinderMob)) {
							{
								double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * 2 * (double) ExpManagerConfiguration.AUTOLVL_CAP.get();
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					} else if ((double) ExpManagerConfiguration.TYPES_USED.get() == 4) {
						if (sourceentity instanceof Player && (entity instanceof Monster || entity instanceof Mob || entity instanceof PathfinderMob || entity instanceof ServerPlayer)) {
							{
								double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * 2 * (double) ExpManagerConfiguration.AUTOLVL_CAP.get();
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					}
				} else if ((ExpManagerConfiguration.EXP_FROM.get()).equals("Tag")) {
					if (sourceentity instanceof Player && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("epic_stats_mod_remastered:esr_entities")))) {
						{
							double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
									+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
									+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * 2 * (double) ExpManagerConfiguration.AUTOLVL_CAP.get();
							sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.EXP_lvl = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				}
			} else {
				if ((ExpManagerConfiguration.EXP_FROM.get()).equals("Type")) {
					if ((double) ExpManagerConfiguration.TYPES_USED.get() == 1) {
						if (sourceentity instanceof Player && entity instanceof Monster) {
							{
								double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * 2;
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					} else if ((double) ExpManagerConfiguration.TYPES_USED.get() == 2) {
						if (sourceentity instanceof Player && (entity instanceof Monster || entity instanceof Mob)) {
							{
								double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * 2;
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					} else if ((double) ExpManagerConfiguration.TYPES_USED.get() == 3) {
						if (sourceentity instanceof Player && (entity instanceof Monster || entity instanceof Mob || entity instanceof PathfinderMob)) {
							{
								double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * 2;
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					} else if ((double) ExpManagerConfiguration.TYPES_USED.get() == 4) {
						if (sourceentity instanceof Player && (entity instanceof Monster || entity instanceof Mob || entity instanceof PathfinderMob || entity instanceof ServerPlayer)) {
							{
								double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * 2;
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					}
				} else if ((ExpManagerConfiguration.EXP_FROM.get()).equals("Tag")) {
					if (sourceentity instanceof Player && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("epic_stats_mod_remastered:esr_entities")))) {
						{
							double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
									+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
									+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * 2;
							sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.EXP_lvl = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				}
			}
		} else {
			if (entity.getPersistentData().getDouble("LEVEL") > 0) {
				if ((ExpManagerConfiguration.EXP_FROM.get()).equals("Type")) {
					if ((double) ExpManagerConfiguration.TYPES_USED.get() == 1) {
						if (sourceentity instanceof Player && entity instanceof Monster) {
							{
								double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * (double) ExpManagerConfiguration.AUTOLVL_CAP.get();
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					} else if ((double) ExpManagerConfiguration.TYPES_USED.get() == 2) {
						if (sourceentity instanceof Player && (entity instanceof Monster || entity instanceof Mob)) {
							{
								double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * (double) ExpManagerConfiguration.AUTOLVL_CAP.get();
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					} else if ((double) ExpManagerConfiguration.TYPES_USED.get() == 3) {
						if (sourceentity instanceof Player && (entity instanceof Monster || entity instanceof Mob || entity instanceof PathfinderMob)) {
							{
								double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * (double) ExpManagerConfiguration.AUTOLVL_CAP.get();
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					} else if ((double) ExpManagerConfiguration.TYPES_USED.get() == 4) {
						if (sourceentity instanceof Player && (entity instanceof Monster || entity instanceof Mob || entity instanceof PathfinderMob || entity instanceof ServerPlayer)) {
							{
								double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * (double) ExpManagerConfiguration.AUTOLVL_CAP.get();
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					}
				} else if ((ExpManagerConfiguration.EXP_FROM.get()).equals("Tag")) {
					if (sourceentity instanceof Player && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("epic_stats_mod_remastered:esr_entities")))) {
						{
							double _setval = ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
									+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
									+ Mth.nextInt(RandomSource.create(), 1, (int) (double) ExpManagerConfiguration.EXP_BONUS.get())) * (double) ExpManagerConfiguration.AUTOLVL_CAP.get();
							sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.EXP_lvl = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				}
			} else {
				if ((ExpManagerConfiguration.EXP_FROM.get()).equals("Type")) {
					if ((double) ExpManagerConfiguration.TYPES_USED.get() == 1) {
						if (sourceentity instanceof Player && entity instanceof Monster) {
							{
								double _setval = (sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 0, (int) (double) ExpManagerConfiguration.EXP_BONUS.get());
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					} else if ((double) ExpManagerConfiguration.TYPES_USED.get() == 2) {
						if (sourceentity instanceof Player && (entity instanceof Monster || entity instanceof Mob)) {
							{
								double _setval = (sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 0, (int) (double) ExpManagerConfiguration.EXP_BONUS.get());
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					} else if ((double) ExpManagerConfiguration.TYPES_USED.get() == 3) {
						if (sourceentity instanceof Player && (entity instanceof Monster || entity instanceof Mob || entity instanceof PathfinderMob)) {
							{
								double _setval = (sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 0, (int) (double) ExpManagerConfiguration.EXP_BONUS.get());
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					} else if ((double) ExpManagerConfiguration.TYPES_USED.get() == 4) {
						if (sourceentity instanceof Player && (entity instanceof Monster || entity instanceof Mob || entity instanceof PathfinderMob || entity instanceof ServerPlayer)) {
							{
								double _setval = (sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
										+ Mth.nextInt(RandomSource.create(), 0, (int) (double) ExpManagerConfiguration.EXP_BONUS.get());
								sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.EXP_lvl = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					}
				} else if ((ExpManagerConfiguration.EXP_FROM.get()).equals("Tag")) {
					if (sourceentity instanceof Player && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("epic_stats_mod_remastered:esr_entities")))) {
						{
							double _setval = (sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl
									+ (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + entity.getBbHeight()
									+ Mth.nextInt(RandomSource.create(), 0, (int) (double) ExpManagerConfiguration.EXP_BONUS.get());
							sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.EXP_lvl = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				}
			}
		}
		if ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).player_lvl < (double) ExpManagerConfiguration.MAX_PLAYER_LEVEL.get()) {
			while ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl >= (sourceentity
					.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl_max) {
				{
					double _setval = (sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).SP
							+ (double) ExpManagerConfiguration.SP_PER_LEVEL.get();
					sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SP = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				if (ExpManagerConfiguration.OLD_EXP.get() == false) {
					if (ExpManagerConfiguration.EXP_DIVISION_T.get() == false) {
						{
							double _setval = (sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl_max
									+ (double) ExpManagerConfiguration.EXP_BASE.get() + Mth.nextDouble(RandomSource.create(), (double) ExpManagerConfiguration.EXP_MIN.get(), (double) ExpManagerConfiguration.EXP_MAX.get());
							sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.EXP_lvl_max = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					} else if (ExpManagerConfiguration.EXP_DIVISION_T.get() == true) {
						{
							double _setval = (sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl_max
									+ ((double) ExpManagerConfiguration.EXP_BASE.get() + Mth.nextDouble(RandomSource.create(), (double) ExpManagerConfiguration.EXP_MIN.get(), (double) ExpManagerConfiguration.EXP_MAX.get()))
											/ (double) ExpManagerConfiguration.EXP_DIVISION_V.get();
							sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.EXP_lvl_max = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				} else if (ExpManagerConfiguration.OLD_EXP.get() == true) {
					if (ExpManagerConfiguration.EXP_DIVISION_T.get() == false) {
						{
							double _setval = (sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl_max
									+ (sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl_max
									+ Mth.nextDouble(RandomSource.create(), (double) ExpManagerConfiguration.EXP_MIN.get(), (double) ExpManagerConfiguration.EXP_MAX.get());
							sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.EXP_lvl_max = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					} else if (ExpManagerConfiguration.EXP_DIVISION_T.get() == true) {
						{
							double _setval = (sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl_max
									+ ((sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl_max
											+ Mth.nextDouble(RandomSource.create(), (double) ExpManagerConfiguration.EXP_MIN.get(), (double) ExpManagerConfiguration.EXP_MAX.get())) / (double) ExpManagerConfiguration.EXP_DIVISION_V.get();
							sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.EXP_lvl_max = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				}
				{
					double _setval = (sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).player_lvl + 1;
					sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.player_lvl = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("chat.text.lvlup").getString() + "" + ExpManagerConfiguration.LETTER_LEVEL_UP.get())), false);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.toast.challenge_complete")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.toast.challenge_complete")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				{
					double _setval = (sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).total_sp + 1;
					sourceentity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.total_sp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
		}
	}
}
