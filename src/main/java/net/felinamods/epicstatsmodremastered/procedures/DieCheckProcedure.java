package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.felinamods.epicstatsmodremastered.world.inventory.StatsMenuMenu;
import net.felinamods.epicstatsmodremastered.network.EpicStatsModRemasteredModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DieCheckProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player || entity instanceof ServerPlayer) {
			if (entity instanceof Player _plr2 && _plr2.containerMenu instanceof StatsMenuMenu) {
				{
					boolean _setval = true;
					entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.lostitems = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
