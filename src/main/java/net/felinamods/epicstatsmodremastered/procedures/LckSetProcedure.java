package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.felinamods.epicstatsmodremastered.network.EpicStatsModRemasteredModVariables;
import net.felinamods.epicstatsmodremastered.configuration.Stat8ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

public class LckSetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
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
					double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_8_new
							+ (double) Stat8ConfigConfiguration.STAT_8_V.get();
					entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stat_8_new = _setval;
						capability.syncPlayerVariables(entity);
					});
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
					double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_8_extra1_new
							+ (double) Stat8ConfigConfiguration.STAT_8_E1_V.get();
					entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stat_8_extra1_new = _setval;
						capability.syncPlayerVariables(entity);
					});
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
					double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_8_extra2_new
							+ (double) Stat8ConfigConfiguration.STAT_8_E2_V.get();
					entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stat_8_extra2_new = _setval;
						capability.syncPlayerVariables(entity);
					});
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
					double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_8_extra3_new
							+ (double) Stat8ConfigConfiguration.STAT_8_E3_V.get();
					entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stat_8_extra3_new = _setval;
						capability.syncPlayerVariables(entity);
					});
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
