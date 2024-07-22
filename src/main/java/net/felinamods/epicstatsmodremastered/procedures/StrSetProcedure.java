package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.felinamods.epicstatsmodremastered.network.EpicStatsModRemasteredModVariables;
import net.felinamods.epicstatsmodremastered.configuration.Stat1ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

public class StrSetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AttributeModifier temp = null;
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
					double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_new
							+ (double) Stat1ConfigConfiguration.STAT_1_V.get();
					entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stat_1_new = _setval;
						capability.syncPlayerVariables(entity);
					});
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
			if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_level >= (double) Stat1ConfigConfiguration.STAT_1_E1_LVLREQ.get()) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat1ConfigConfiguration.STAT_1_E1_ID.get())))).getValue() < (double) Stat1ConfigConfiguration.STAT_1_E1_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat1ConfigConfiguration.STAT_1_E1_ID.get() + " " + "modifier" + " " + "remove" + " " + "f717b98e-2304-4d46-a162-ad4f24903715"));
						}
					}
					{
						double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_extra1_new
								+ (double) Stat1ConfigConfiguration.STAT_1_E1_V.get();
						entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.stat_1_extra1_new = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
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
			if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_level >= (double) Stat1ConfigConfiguration.STAT_1_E2_LVLREQ.get()) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat1ConfigConfiguration.STAT_1_E2_ID.get())))).getValue() < (double) Stat1ConfigConfiguration.STAT_1_E2_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat1ConfigConfiguration.STAT_1_E2_ID.get() + " " + "modifier" + " " + "remove" + " " + "ded86a50-1698-4524-87a6-e3bdff1b5414"));
						}
					}
					{
						double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_extra2_new
								+ (double) Stat1ConfigConfiguration.STAT_1_E2_V.get();
						entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.stat_1_extra2_new = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
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
			if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_level < (double) Stat1ConfigConfiguration.STAT_1_E3_LVLREQ.get()) {
				if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation((Stat1ConfigConfiguration.STAT_1_E3_ID.get())))).getValue() < (double) Stat1ConfigConfiguration.STAT_1_E3_MAX.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("attribute" + " " + "@s" + " " + Stat1ConfigConfiguration.STAT_1_E3_ID.get() + " " + "modifier" + " " + "remove" + " " + "d1fdd06b-e67e-4771-91ec-81800e8e355a"));
						}
					}
					{
						double _setval = (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_extra3_new
								+ (double) Stat1ConfigConfiguration.STAT_1_E3_V.get();
						entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.stat_1_extra3_new = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("attribute" + " " + "@s" + " " + Stat1ConfigConfiguration.STAT_1_E3_ID.get() + " " + "modifier" + " " + "add" + " " + "d1fdd06b-e67e-4771-91ec-81800e8e355a" + " " + "slot1" + " "
											+ (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).stat_1_extra3_new + " " + "add"));
						}
					}
				}
			}
		} else {
			EpicStatsModRemasteredMod.LOGGER.error(("The attribute for stat " + Stat1ConfigConfiguration.STAT_1_E3_ID.get() + " doesn't exist"));
		}
	}
}
