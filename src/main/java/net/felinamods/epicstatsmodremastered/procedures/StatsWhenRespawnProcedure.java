package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.felinamods.epicstatsmodremastered.network.EpicStatsModRemasteredModVariables;
import net.felinamods.epicstatsmodremastered.configuration.Stat8ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.Stat7ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.Stat6ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.Stat5ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.Stat4ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.Stat3ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.Stat2ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.Stat1ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StatsWhenRespawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat1ConfigConfiguration.STAT_1_ID.get())))) != null) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat1ConfigConfiguration.STAT_1_ID.get())))).getValue() < (double) Stat1ConfigConfiguration.STAT1_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat1ConfigConfiguration.STAT_1_ID.get() + " " + "modifier" + " " + "remove" + " " + "a567db52-9437-47c9-ba1e-f6ebcc51d578"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat1ConfigConfiguration.STAT_1_ID.get() + " " + "modifier" + " " + "add" + " " + "a567db52-9437-47c9-ba1e-f6ebcc51d578" + " " + "slot1" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat1ConfigConfiguration.STAT_1_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat1ConfigConfiguration.STAT_1_E1_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_level >= (double) Stat1ConfigConfiguration.STAT_1_E1_LVLREQ
						.get()) {
					if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat1ConfigConfiguration.STAT_1_E1_ID.get())))).getValue() < (double) Stat1ConfigConfiguration.STAT_1_E1_MAX.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat1ConfigConfiguration.STAT_1_E1_ID.get() + " " + "modifier" + " " + "remove" + " " + "f717b98e-2304-4d46-a162-ad4f24903715"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat1ConfigConfiguration.STAT_1_E1_ID.get() + " " + "modifier" + " " + "add" + " " + "f717b98e-2304-4d46-a162-ad4f24903715" + " " + "slot1" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_extra1_new + " " + "add"));
							}
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat1ConfigConfiguration.STAT_1_E1_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat1ConfigConfiguration.STAT_1_E2_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_level >= (double) Stat1ConfigConfiguration.STAT_1_E2_LVLREQ
						.get()) {
					if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat1ConfigConfiguration.STAT_1_E2_ID.get())))).getValue() < (double) Stat1ConfigConfiguration.STAT_1_E2_MAX.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat1ConfigConfiguration.STAT_1_E2_ID.get() + " " + "modifier" + " " + "remove" + " " + "ded86a50-1698-4524-87a6-e3bdff1b5414"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat1ConfigConfiguration.STAT_1_E2_ID.get() + " " + "modifier" + " " + "add" + " " + "ded86a50-1698-4524-87a6-e3bdff1b5414" + " " + "slot1" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_extra2_new + " " + "add"));
							}
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat1ConfigConfiguration.STAT_1_E1_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat1ConfigConfiguration.STAT_1_E3_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_level >= (double) Stat1ConfigConfiguration.STAT_1_E3_LVLREQ
						.get()) {
					if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat1ConfigConfiguration.STAT_1_E3_ID.get())))).getValue() < (double) Stat1ConfigConfiguration.STAT_1_E3_MAX.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat1ConfigConfiguration.STAT_1_E3_ID.get() + " " + "modifier" + " " + "remove" + " " + "d1fdd06b-e67e-4771-91ec-81800e8e355a"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat1ConfigConfiguration.STAT_1_E3_ID.get() + " " + "modifier" + " " + "add" + " " + "d1fdd06b-e67e-4771-91ec-81800e8e355a" + " " + "slot1" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_extra3_new + " " + "add"));
							}
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat1ConfigConfiguration.STAT_1_E3_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_ID.get())))) != null) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_ID.get())))).getValue() < (double) Stat2ConfigConfiguration.STAT2_MAX.get()) {
					if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_level != 1) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat2ConfigConfiguration.STAT_2_ID.get() + " " + "modifier" + " " + "remove" + " " + "e883933b-deb1-4547-a3be-69a181b18991"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat2ConfigConfiguration.STAT_2_ID.get() + " " + "modifier" + " " + "add" + " " + "e883933b-deb1-4547-a3be-69a181b18991" + " " + "slot2" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_new + " " + "add"));
							}
						}
					} else {
						((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_ID.get())))).setBaseValue(((double) Stat2ConfigConfiguration.STAT_2_DEFAULT.get()));
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat2ConfigConfiguration.STAT_2_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_E1_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_level >= (double) Stat2ConfigConfiguration.STAT_2_E1_LVLREQ
						.get()) {
					if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_E1_ID.get())))).getValue() < (double) Stat2ConfigConfiguration.STAT_2_E1_MAX.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat2ConfigConfiguration.STAT_2_E1_ID.get() + " " + "modifier" + " " + "remove" + " " + "38bfc07a-bc30-4ea4-bb45-dac93b5f4e67"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat2ConfigConfiguration.STAT_2_E1_ID.get() + " " + "modifier" + " " + "add" + " " + "38bfc07a-bc30-4ea4-bb45-dac93b5f4e67" + " " + "slot2e1" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_extra1_new + " " + "add"));
							}
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat2ConfigConfiguration.STAT_2_E1_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_E2_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_level >= (double) Stat2ConfigConfiguration.STAT_2_E2_LVLREQ
						.get()) {
					if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_E2_ID.get())))).getValue() < (double) Stat2ConfigConfiguration.STAT_2_E2_MAX.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat2ConfigConfiguration.STAT_2_E2_ID.get() + " " + "modifier" + " " + "remove" + " " + "640709c5-fc90-4d2b-a834-674d287b328d"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat2ConfigConfiguration.STAT_2_E2_ID.get() + " " + "modifier" + " " + "add" + " " + "640709c5-fc90-4d2b-a834-674d287b328d" + " " + "slot2e2" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_extra1_new + " " + "add"));
							}
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat2ConfigConfiguration.STAT_2_E2_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_E3_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_level >= (double) Stat2ConfigConfiguration.STAT_2_E3_LVLREQ
						.get()) {
					if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_E3_ID.get())))).getValue() < (double) Stat2ConfigConfiguration.STAT_2_E3_MAX.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat2ConfigConfiguration.STAT_2_E3_ID.get() + " " + "modifier" + " " + "remove" + " " + "fe4bbcd8-7249-4fa4-a600-6b7fab146c0b"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat2ConfigConfiguration.STAT_2_E3_ID.get() + " " + "modifier" + " " + "add" + " " + "fe4bbcd8-7249-4fa4-a600-6b7fab146c0b" + " " + "slot2e3" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_extra3_new + " " + "add"));
							}
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat2ConfigConfiguration.STAT_2_E3_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat3ConfigConfiguration.STAT_3_ID.get())))) != null) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat3ConfigConfiguration.STAT_3_ID.get())))).getValue() < (double) Stat3ConfigConfiguration.STAT3_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat3ConfigConfiguration.STAT_3_ID.get() + " " + "modifier" + " " + "remove" + " " + "a831a1d2-e483-46c6-9de3-329bad9f2328"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat3ConfigConfiguration.STAT_3_ID.get() + " " + "modifier" + " " + "add" + " " + "a831a1d2-e483-46c6-9de3-329bad9f2328" + " " + "slot3" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_3_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat3ConfigConfiguration.STAT_3_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat3ConfigConfiguration.STAT_3_ID.get())))) != null) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat3ConfigConfiguration.STAT_3_ID.get())))).getValue() < (double) Stat3ConfigConfiguration.STAT3_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat3ConfigConfiguration.STAT_3_ID.get() + " " + "modifier" + " " + "remove" + " " + "a831a1d2-e483-46c6-9de3-329bad9f2328"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat3ConfigConfiguration.STAT_3_ID.get() + " " + "modifier" + " " + "add" + " " + "a831a1d2-e483-46c6-9de3-329bad9f2328" + " " + "slot3" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_3_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat3ConfigConfiguration.STAT_3_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat3ConfigConfiguration.STAT_3_E1_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_3_level >= (double) Stat3ConfigConfiguration.STAT_3_E1_LVLREQ
						.get()) {
					if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat3ConfigConfiguration.STAT_3_E1_ID.get())))).getValue() < (double) Stat3ConfigConfiguration.STAT_3_E1_MAX.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat3ConfigConfiguration.STAT_3_E1_ID.get() + " " + "modifier" + " " + "remove" + " " + "fcb9eb56-ecba-41da-843d-0eb8abe844a0"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat3ConfigConfiguration.STAT_3_E1_ID.get() + " " + "modifier" + " " + "add" + " " + "fcb9eb56-ecba-41da-843d-0eb8abe844a0" + " " + "slot3e1" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_3_extra1_new + " " + "add"));
							}
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat3ConfigConfiguration.STAT_3_E1_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat3ConfigConfiguration.STAT_3_E2_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_3_level >= (double) Stat3ConfigConfiguration.STAT_3_E2_LVLREQ
						.get()) {
					if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat3ConfigConfiguration.STAT_3_E2_ID.get())))).getValue() < (double) Stat3ConfigConfiguration.STAT_3_E2_MAX.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat3ConfigConfiguration.STAT_3_E2_ID.get() + " " + "modifier" + " " + "remove" + " " + "970bf594-d30c-43dc-9da4-9e091ec543d7"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat3ConfigConfiguration.STAT_3_E2_ID.get() + " " + "modifier" + " " + "add" + " " + "970bf594-d30c-43dc-9da4-9e091ec543d7" + " " + "slot3e2" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_3_extra2_new + " " + "add"));
							}
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat3ConfigConfiguration.STAT_3_E2_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat3ConfigConfiguration.STAT_3_E3_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_3_level >= (double) Stat3ConfigConfiguration.STAT_3_E3_LVLREQ
						.get()) {
					if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat3ConfigConfiguration.STAT_3_E3_ID.get())))).getValue() < (double) Stat3ConfigConfiguration.STAT_3_E2_MAX.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat3ConfigConfiguration.STAT_3_E3_ID.get() + " " + "modifier" + " " + "remove" + " " + "e6ad694d-f8f0-42dc-b93a-4fd6739295a3"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat3ConfigConfiguration.STAT_3_E3_ID.get() + " " + "modifier" + " " + "add" + " " + "e6ad694d-f8f0-42dc-b93a-4fd6739295a3" + " " + "slot3e3" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_3_extra3_new + " " + "add"));
							}
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat3ConfigConfiguration.STAT_3_E3_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat4ConfigConfiguration.STAT_4_ID.get())))) != null) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat4ConfigConfiguration.STAT_4_ID.get())))).getValue() < (double) Stat4ConfigConfiguration.STAT4_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat4ConfigConfiguration.STAT_4_ID.get() + " " + "modifier" + " " + "remove" + " " + "7ff85fbb-e04a-4f6f-9272-05ca70dbdf97"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat4ConfigConfiguration.STAT_4_ID.get() + " " + "modifier" + " " + "add" + " " + "7ff85fbb-e04a-4f6f-9272-05ca70dbdf97" + " " + "slot4" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_4_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat4ConfigConfiguration.STAT_4_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat4ConfigConfiguration.STAT_4_E1_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_4_level >= (double) Stat4ConfigConfiguration.STAT_4_E1_LVL_REQ
						.get() && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat4ConfigConfiguration.STAT_4_E1_ID.get())))).getValue() < (double) Stat4ConfigConfiguration.STAT_4_E1_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat4ConfigConfiguration.STAT_4_E1_ID.get() + " " + "modifier" + " " + "remove" + " " + "0740475b-dd35-4e20-8c5b-ff066a4be278"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat4ConfigConfiguration.STAT_4_E1_ID.get() + " " + "modifier" + " " + "add" + " " + "0740475b-dd35-4e20-8c5b-ff066a4be278" + " " + "slot4e1" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_4_extra1_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat4ConfigConfiguration.STAT_4_E1_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat4ConfigConfiguration.STAT_4_E2_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_4_level >= (double) Stat4ConfigConfiguration.STAT_4_E2_LVL_REQ
						.get() && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat4ConfigConfiguration.STAT_4_E2_ID.get())))).getValue() < (double) Stat4ConfigConfiguration.STAT_4_E2_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat4ConfigConfiguration.STAT_4_E2_ID.get() + " " + "modifier" + " " + "remove" + " " + "cdb39f16-44dc-441f-a3d6-57f084de9a41"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat4ConfigConfiguration.STAT_4_E2_ID.get() + " " + "modifier" + " " + "add" + " " + "cdb39f16-44dc-441f-a3d6-57f084de9a41" + " " + "slot4e2" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_4_extra2_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat4ConfigConfiguration.STAT_4_E2_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat4ConfigConfiguration.STAT_4_E3_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_4_level >= (double) Stat4ConfigConfiguration.STAT_4_E3_LVL_REQ
						.get() && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat4ConfigConfiguration.STAT_4_E3_ID.get())))).getValue() < (double) Stat4ConfigConfiguration.STAT_4_E3_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat4ConfigConfiguration.STAT_4_E3_ID.get() + " " + "modifier" + " " + "remove" + " " + "98f50334-1864-48b6-86bc-30628a3cf1b0"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat4ConfigConfiguration.STAT_4_E3_ID.get() + " " + "modifier" + " " + "add" + " " + "98f50334-1864-48b6-86bc-30628a3cf1b0" + " " + "slot4e3" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_4_extra3_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat4ConfigConfiguration.STAT_4_E3_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat5ConfigConfiguration.STAT_5_ID.get())))) != null) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat5ConfigConfiguration.STAT_5_ID.get())))).getValue() < (double) Stat5ConfigConfiguration.STAT5_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat5ConfigConfiguration.STAT_5_ID.get() + " " + "modifier" + " " + "remove" + " " + "fa2fec5e-4918-4e90-9c72-89bd5473f87c"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat5ConfigConfiguration.STAT_5_ID.get() + " " + "modifier" + " " + "add" + " " + "fa2fec5e-4918-4e90-9c72-89bd5473f87c" + " " + "slot5" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat5ConfigConfiguration.STAT_5_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat5ConfigConfiguration.STAT_5_E2_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_level >= (double) Stat5ConfigConfiguration.STAT_5_E2_LVL_REQ
						.get() && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat5ConfigConfiguration.STAT_5_E2_ID.get())))).getValue() < (double) Stat5ConfigConfiguration.STAT_5_E2_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat5ConfigConfiguration.STAT_5_E2_ID.get() + " " + "modifier" + " " + "remove" + " " + "2d936e8c-0cbf-4318-a163-a0e8def5b6d5"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat5ConfigConfiguration.STAT_5_E2_ID.get() + " " + "modifier" + " " + "add" + " " + "2d936e8c-0cbf-4318-a163-a0e8def5b6d5" + " " + "slot5e2" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_extra2_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat5ConfigConfiguration.STAT_5_E2_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat5ConfigConfiguration.STAT_5_E3_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_level >= (double) Stat5ConfigConfiguration.STAT_5_E3_LVL_REQ
						.get() && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat5ConfigConfiguration.STAT_5_E3_ID.get())))).getValue() < (double) Stat5ConfigConfiguration.STAT_5_E3_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat5ConfigConfiguration.STAT_5_E3_ID.get() + " " + "modifier" + " " + "remove" + " " + "0ebdde8c-39f3-4775-a385-f928f66a3453"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat5ConfigConfiguration.STAT_5_E3_ID.get() + " " + "modifier" + " " + "add" + " " + "0ebdde8c-39f3-4775-a385-f928f66a3453" + " " + "slot5e2" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_extra3_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat5ConfigConfiguration.STAT_5_E3_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat5ConfigConfiguration.STAT_5_E1_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_level != 1) {
					if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_level >= (double) Stat5ConfigConfiguration.STAT_5_E1_LVL_REQ
							.get() && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat5ConfigConfiguration.STAT_5_E1_ID.get())))).getValue() < (double) Stat5ConfigConfiguration.STAT_5_E1_MAX.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat5ConfigConfiguration.STAT_5_E1_ID.get() + " " + "modifier" + " " + "remove" + " " + "60cdef63-615e-46c8-b117-2068c760a59b"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat5ConfigConfiguration.STAT_5_E1_ID.get() + " " + "modifier" + " " + "add" + " " + "60cdef63-615e-46c8-b117-2068c760a59b" + " " + "slot5e1" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_extra1_new + " " + "add"));
							}
						}
					}
				} else {
					if (Stat5ConfigConfiguration.IRON_MANA_T.get() == true) {
						((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat5ConfigConfiguration.STAT_5_E1_ID.get())))).setBaseValue(((double) Stat5ConfigConfiguration.IRONS_MANA.get()));
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat5ConfigConfiguration.STAT_5_E1_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_ID.get())))) != null) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_ID.get())))).getValue() < (double) Stat6ConfigConfiguration.STAT6_MAX.get()) {
					if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).player_lvl != 1) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat6ConfigConfiguration.STAT_6_ID.get() + " " + "modifier" + " " + "remove" + " " + "704ce0c0-e5f9-44ae-8221-3afab8d8485e"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat6ConfigConfiguration.STAT_6_ID.get() + " " + "modifier" + " " + "add" + " " + "704ce0c0-e5f9-44ae-8221-3afab8d8485e" + " " + "slot6" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_new + " " + "add"));
							}
						}
					} else {
						((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_ID.get())))).setBaseValue(((double) Stat6ConfigConfiguration.STAT_6_DEFAULT.get()));
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat6ConfigConfiguration.STAT_6_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_E1_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_level >= (double) Stat6ConfigConfiguration.STAT_6_E1_LVLREQ
						.get()) {
					if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_E1_ID.get())))).getValue() < (double) Stat6ConfigConfiguration.STAT_6_E1_MAX.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat6ConfigConfiguration.STAT_6_E1_ID.get() + " " + "modifier" + " " + "remove" + " " + "11a711b6-0b3d-4123-b822-2d32a402423c"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat6ConfigConfiguration.STAT_6_E1_ID.get() + " " + "modifier" + " " + "add" + " " + "11a711b6-0b3d-4123-b822-2d32a402423c" + " " + "slot6e1" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_extra1_new + " " + "add"));
							}
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat6ConfigConfiguration.STAT_6_E1_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_E2_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_level >= (double) Stat6ConfigConfiguration.STAT_6_E2_LVLREQ
						.get()) {
					if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_E2_ID.get())))).getValue() < (double) Stat6ConfigConfiguration.STAT_6_E2_MAX.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat6ConfigConfiguration.STAT_6_E2_ID.get() + " " + "modifier" + " " + "remove" + " " + "6e9036ea-f2fd-4687-b7c3-40ee4647bb8f"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat6ConfigConfiguration.STAT_6_E2_ID.get() + " " + "modifier" + " " + "add" + " " + "6e9036ea-f2fd-4687-b7c3-40ee4647bb8f" + " " + "slot6e2" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_extra2_new + " " + "add"));
							}
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat6ConfigConfiguration.STAT_6_E2_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_E3_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_level >= (double) Stat6ConfigConfiguration.STAT_6_E3_LVLREQ
						.get()) {
					if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_E3_ID.get())))).getValue() < (double) Stat6ConfigConfiguration.STAT_6_E3_MAX.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat6ConfigConfiguration.STAT_6_E3_ID.get() + " " + "modifier" + " " + "remove" + " " + "d31be804-e77d-455c-a3c2-1a284ce3cda9"));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat6ConfigConfiguration.STAT_6_E3_ID.get() + " " + "modifier" + " " + "add" + " " + "d31be804-e77d-455c-a3c2-1a284ce3cda9" + " " + "slot6e3" + " "
												+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_extra3_new + " " + "add"));
							}
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat6ConfigConfiguration.STAT_6_E3_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat7ConfigConfiguration.STAT_7_ID.get())))) != null) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat7ConfigConfiguration.STAT_7_ID.get())))).getValue() < (double) Stat7ConfigConfiguration.STAT7_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat7ConfigConfiguration.STAT_7_ID.get() + " " + "modifier" + " " + "remove" + " " + "4a25f850-e06d-4087-ba12-4edda48db3a2"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat7ConfigConfiguration.STAT_7_ID.get() + " " + "modifier" + " " + "add" + " " + "4a25f850-e06d-4087-ba12-4edda48db3a2" + " " + "slot7" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_7_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat7ConfigConfiguration.STAT_7_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat7ConfigConfiguration.STAT_7_E1_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_7_level >= (double) Stat7ConfigConfiguration.STAT_7_E1_LVL_REQ
						.get() && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat7ConfigConfiguration.STAT_7_E1_ID.get())))).getValue() < (double) Stat7ConfigConfiguration.STAT_7_E1_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat7ConfigConfiguration.STAT_7_E1_ID.get() + " " + "modifier" + " " + "remove" + " " + "98e2a1d6-fc72-4324-b8dc-2fea065e1fcf"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat7ConfigConfiguration.STAT_7_E1_ID.get() + " " + "modifier" + " " + "add" + " " + "98e2a1d6-fc72-4324-b8dc-2fea065e1fcf" + " " + "slot7e1" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_7_extra1_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat7ConfigConfiguration.STAT_7_E1_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat7ConfigConfiguration.STAT_7_E2_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_7_level >= (double) Stat7ConfigConfiguration.STAT_7_E2_LVL_REQ
						.get() && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat7ConfigConfiguration.STAT_7_E2_ID.get())))).getValue() < (double) Stat7ConfigConfiguration.STAT_7_E2_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat7ConfigConfiguration.STAT_7_E2_ID.get() + " " + "modifier" + " " + "remove" + " " + "2fe1de3d-0e71-4616-a403-db83a2060780"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat7ConfigConfiguration.STAT_7_E2_ID.get() + " " + "modifier" + " " + "add" + " " + "2fe1de3d-0e71-4616-a403-db83a2060780" + " " + "slot7e2" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_7_extra2_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat7ConfigConfiguration.STAT_7_E2_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat7ConfigConfiguration.STAT_7_E3_ID.get())))) != null) {
				if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_7_level >= (double) Stat7ConfigConfiguration.STAT_7_E3_LVL_REQ
						.get() && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat7ConfigConfiguration.STAT_7_E3_ID.get())))).getValue() < (double) Stat7ConfigConfiguration.STAT_7_E3_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat7ConfigConfiguration.STAT_7_E3_ID.get() + " " + "modifier" + " " + "remove" + " " + "5006ad39-7eaf-4340-8d8e-c0678f0a12bf"));
						}
					}
					{
						double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_7_extra3_new
								+ (double) Stat7ConfigConfiguration.STAT_7_E3_V.get();
						entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.stat_7_extra3_new = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat7ConfigConfiguration.STAT_7_E3_ID.get() + " " + "modifier" + " " + "add" + " " + "5006ad39-7eaf-4340-8d8e-c0678f0a12bf" + " " + "slot7e3" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_7_extra3_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat7ConfigConfiguration.STAT_7_E3_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat8ConfigConfiguration.STAT_8_ID.get())))) != null) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat8ConfigConfiguration.STAT_8_ID.get())))).getValue() < (double) Stat8ConfigConfiguration.STAT8_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat8ConfigConfiguration.STAT_8_ID.get() + " " + "modifier" + " " + "remove" + " " + "84aca4a2-a6dd-4bc9-ba43-a04bbd4f3591"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat8ConfigConfiguration.STAT_8_ID.get() + " " + "modifier" + " " + "add" + " " + "84aca4a2-a6dd-4bc9-ba43-a04bbd4f3591" + " " + "slot8" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_8_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat8ConfigConfiguration.STAT_8_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat8ConfigConfiguration.STAT_8_E1_ID.get())))) != null) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat8ConfigConfiguration.STAT_8_E1_ID.get())))).getValue() < (double) Stat8ConfigConfiguration.STAT_8_E1_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat8ConfigConfiguration.STAT_8_E1_ID.get() + " " + "modifier" + " " + "remove" + " " + "b038dbc9-838f-49e5-8162-88a5a90ab39e"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat8ConfigConfiguration.STAT_8_E1_ID.get() + " " + "modifier" + " " + "add" + " " + "b038dbc9-838f-49e5-8162-88a5a90ab39e" + " " + "slot8e1" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_8_extra1_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat8ConfigConfiguration.STAT_8_E1_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat8ConfigConfiguration.STAT_8_E2_ID.get())))) != null) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat8ConfigConfiguration.STAT_8_E2_ID.get())))).getValue() < (double) Stat8ConfigConfiguration.STAT_8_E2_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat8ConfigConfiguration.STAT_8_E2_ID.get() + " " + "modifier" + " " + "remove" + " " + "c1bce24b-7cda-43e4-be29-880033feb297"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat8ConfigConfiguration.STAT_8_E2_ID.get() + " " + "modifier" + " " + "add" + " " + "c1bce24b-7cda-43e4-be29-880033feb297" + " " + "slot8e2" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_8_extra2_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat8ConfigConfiguration.STAT_8_E2_ID.get() + " doesn't exist"));
			}
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat8ConfigConfiguration.STAT_8_E3_ID.get())))) != null) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat8ConfigConfiguration.STAT_8_E3_ID.get())))).getValue() < (double) Stat8ConfigConfiguration.STAT_8_E3_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat8ConfigConfiguration.STAT_8_E3_ID.get() + " " + "modifier" + " " + "remove" + " " + "2513cb89-560b-4577-8108-1e2a3a8a45ad"));
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat8ConfigConfiguration.STAT_8_E3_ID.get() + " " + "modifier" + " " + "add" + " " + "2513cb89-560b-4577-8108-1e2a3a8a45ad" + " " + "slot8e3" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_8_extra3_new + " " + "add"));
						}
					}
				}
			} else {
				EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat8ConfigConfiguration.STAT_8_E3_ID.get() + " doesn't exist"));
			}
		}
	}
}
