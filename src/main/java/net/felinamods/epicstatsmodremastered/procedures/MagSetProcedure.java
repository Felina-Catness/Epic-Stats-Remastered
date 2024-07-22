package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.felinamods.epicstatsmodremastered.network.EpicStatsModRemasteredModVariables;
import net.felinamods.epicstatsmodremastered.configuration.Stat5ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

public class MagSetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
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
					double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_new
							+ (double) Stat5ConfigConfiguration.STAT_5_V.get();
					entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stat_5_new = _setval;
						capability.syncPlayerVariables(entity);
					});
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
		if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat5ConfigConfiguration.STAT_5_E1_ID.get())))) != null) {
			if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_level >= (double) Stat5ConfigConfiguration.STAT_5_E1_LVL_REQ.get()
					&& ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat5ConfigConfiguration.STAT_5_E1_ID.get())))).getValue() < (double) Stat5ConfigConfiguration.STAT_5_E1_MAX.get()) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("attribute" + " " + "@s" + " " + Stat5ConfigConfiguration.STAT_5_E1_ID.get() + " " + "modifier" + " " + "remove" + " " + "60cdef63-615e-46c8-b117-2068c760a59b"));
					}
				}
				{
					double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_extra1_new
							+ (double) Stat5ConfigConfiguration.STAT_5_E1_V.get();
					entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stat_5_extra1_new = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								("attribute" + " " + "@s" + " " + Stat5ConfigConfiguration.STAT_5_E1_ID.get() + " " + "modifier" + " " + "add" + " " + "60cdef63-615e-46c8-b117-2068c760a59b" + " " + "slot5e1" + " "
										+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_extra1_new + " " + "add"));
					}
				}
			}
		} else {
			EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat5ConfigConfiguration.STAT_5_E1_ID.get() + " doesn't exist"));
		}
		if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat5ConfigConfiguration.STAT_5_E2_ID.get())))) != null) {
			if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_level >= (double) Stat5ConfigConfiguration.STAT_5_E2_LVL_REQ.get()
					&& ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat5ConfigConfiguration.STAT_5_E2_ID.get())))).getValue() < (double) Stat5ConfigConfiguration.STAT_5_E2_MAX.get()) {
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
					double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_extra2_new
							+ (double) Stat5ConfigConfiguration.STAT_5_E2_V.get();
					entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stat_5_extra2_new = _setval;
						capability.syncPlayerVariables(entity);
					});
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
			if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_level >= (double) Stat5ConfigConfiguration.STAT_5_E3_LVL_REQ.get()
					&& ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat5ConfigConfiguration.STAT_5_E3_ID.get())))).getValue() < (double) Stat5ConfigConfiguration.STAT_5_E3_MAX.get()) {
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
					double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_5_extra3_new
							+ (double) Stat5ConfigConfiguration.STAT_5_E3_V.get();
					entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stat_5_extra3_new = _setval;
						capability.syncPlayerVariables(entity);
					});
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
	}
}
