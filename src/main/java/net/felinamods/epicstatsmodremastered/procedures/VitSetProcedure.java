package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.felinamods.epicstatsmodremastered.network.EpicStatsModRemasteredModVariables;
import net.felinamods.epicstatsmodremastered.configuration.Stat2ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

public class VitSetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_ID.get())))) != null) {
			if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_ID.get())))).getValue() < (double) Stat2ConfigConfiguration.STAT2_MAX.get()) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat2ConfigConfiguration.STAT_2_ID.get() + " " + "modifier" + " " + "remove" + " " + "e883933b-deb1-4547-a3be-69a181b18991"));
					}
				}
				{
					double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_new
							+ (double) Stat2ConfigConfiguration.STAT_2_V.get();
					entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stat_2_new = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								("attribute" + " " + "@s" + " " + Stat2ConfigConfiguration.STAT_2_ID.get() + " " + "modifier" + " " + "add" + " " + "e883933b-deb1-4547-a3be-69a181b18991" + " " + "slot2" + " "
										+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_new + " " + "add"));
					}
				}
			}
		} else {
			EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat2ConfigConfiguration.STAT_2_ID.get() + " doesn't exist"));
		}
		if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_E1_ID.get())))) != null) {
			if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_level >= (double) Stat2ConfigConfiguration.STAT_2_E1_LVLREQ.get()) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_E1_ID.get())))).getValue() < (double) Stat2ConfigConfiguration.STAT_2_E1_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat2ConfigConfiguration.STAT_2_E1_ID.get() + " " + "modifier" + " " + "remove" + " " + "38bfc07a-bc30-4ea4-bb45-dac93b5f4e67"));
						}
					}
					{
						double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_extra1_new
								+ (double) Stat2ConfigConfiguration.STAT_2_E1_V.get();
						entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.stat_2_extra1_new = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
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
			if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_level >= (double) Stat2ConfigConfiguration.STAT_2_E2_LVLREQ.get()) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_E2_ID.get())))).getValue() < (double) Stat2ConfigConfiguration.STAT_2_E2_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat2ConfigConfiguration.STAT_2_E2_ID.get() + " " + "modifier" + " " + "remove" + " " + "640709c5-fc90-4d2b-a834-674d287b328d"));
						}
					}
					{
						double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_extra2_new
								+ (double) Stat2ConfigConfiguration.STAT_2_E2_V.get();
						entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.stat_2_extra2_new = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
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
			if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_level >= (double) Stat2ConfigConfiguration.STAT_2_E3_LVLREQ.get()) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat2ConfigConfiguration.STAT_2_E3_ID.get())))).getValue() < (double) Stat2ConfigConfiguration.STAT_2_E3_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat2ConfigConfiguration.STAT_2_E3_ID.get() + " " + "modifier" + " " + "remove" + " " + "fe4bbcd8-7249-4fa4-a600-6b7fab146c0b"));
						}
					}
					{
						double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_extra3_new
								+ (double) Stat2ConfigConfiguration.STAT_2_E3_V.get();
						entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.stat_2_extra3_new = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat2ConfigConfiguration.STAT_2_E3_ID.get() + " " + "modifier" + " " + "add" + " " + "fe4bbcd8-7249-4fa4-a600-6b7fab146c0b" + " " + "slot2e3" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_2_extra3_new + " " + "add"));
						}
					}
				}
			}
		} else {
			EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat2ConfigConfiguration.STAT_2_E3_ID.get() + " doesn't exist"));
		}
	}
}
