package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.felinamods.epicstatsmodremastered.network.EpicStatsModRemasteredModVariables;
import net.felinamods.epicstatsmodremastered.configuration.Stat6ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

public class DexSetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_ID.get())))) != null) {
			if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_ID.get())))).getValue() < (double) Stat6ConfigConfiguration.STAT6_MAX.get()) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat6ConfigConfiguration.STAT_6_ID.get() + " " + "modifier" + " " + "remove" + " " + "704ce0c0-e5f9-44ae-8221-3afab8d8485e"));
					}
				}
				{
					double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_new
							+ (double) Stat6ConfigConfiguration.STAT_6_V.get();
					entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stat_6_new = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								("attribute" + " " + "@s" + " " + Stat6ConfigConfiguration.STAT_6_ID.get() + " " + "modifier" + " " + "add" + " " + "704ce0c0-e5f9-44ae-8221-3afab8d8485e" + " " + "slot6" + " "
										+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_new + " " + "add"));
					}
				}
			}
		} else {
			EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat6ConfigConfiguration.STAT_6_ID.get() + " doesn't exist"));
		}
		if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_E1_ID.get())))) != null) {
			if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_level >= (double) Stat6ConfigConfiguration.STAT_6_E1_LVLREQ.get()) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_E1_ID.get())))).getValue() < (double) Stat6ConfigConfiguration.STAT_6_E1_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat6ConfigConfiguration.STAT_6_E1_ID.get() + " " + "modifier" + " " + "remove" + " " + "11a711b6-0b3d-4123-b822-2d32a402423c"));
						}
					}
					{
						double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_extra1_new
								+ (double) Stat6ConfigConfiguration.STAT_6_E1_V.get();
						entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.stat_6_extra1_new = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
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
			if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_level >= (double) Stat6ConfigConfiguration.STAT_6_E2_LVLREQ.get()) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_E2_ID.get())))).getValue() < (double) Stat6ConfigConfiguration.STAT_6_E2_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat6ConfigConfiguration.STAT_6_E2_ID.get() + " " + "modifier" + " " + "remove" + " " + "6e9036ea-f2fd-4687-b7c3-40ee4647bb8f"));
						}
					}
					{
						double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_extra2_new
								+ (double) Stat6ConfigConfiguration.STAT_6_E2_V.get();
						entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.stat_6_extra2_new = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
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
			if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_level >= (double) Stat6ConfigConfiguration.STAT_6_E3_LVLREQ.get()) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat6ConfigConfiguration.STAT_6_E3_ID.get())))).getValue() < (double) Stat6ConfigConfiguration.STAT_6_E3_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat6ConfigConfiguration.STAT_6_E3_ID.get() + " " + "modifier" + " " + "remove" + " " + "d31be804-e77d-455c-a3c2-1a284ce3cda9"));
						}
					}
					{
						double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_extra3_new
								+ (double) Stat6ConfigConfiguration.STAT_6_E3_V.get();
						entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.stat_6_extra3_new = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat6ConfigConfiguration.STAT_6_E3_ID.get() + " " + "modifier" + " " + "add" + " " + "d31be804-e77d-455c-a3c2-1a284ce3cda9" + " " + "slot6e3" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_6_extra3_new + " " + "add"));
						}
					}
				}
			}
		} else {
			EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat6ConfigConfiguration.STAT_6_E3_ID.get() + " doesn't exist"));
		}
	}
}
