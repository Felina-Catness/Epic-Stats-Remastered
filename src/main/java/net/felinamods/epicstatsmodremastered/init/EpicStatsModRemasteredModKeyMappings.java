
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.felinamods.epicstatsmodremastered.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.felinamods.epicstatsmodremastered.network.KeyMenuMessage;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EpicStatsModRemasteredModKeyMappings {
	public static final KeyMapping KEY_MENU = new KeyMapping("key.epic_stats_mod_remastered.key_menu", GLFW.GLFW_KEY_M, "key.categories.epic_stats") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				KEY_MENU_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - KEY_MENU_LASTPRESS);
				EpicStatsModRemasteredMod.PACKET_HANDLER.sendToServer(new KeyMenuMessage(1, dt));
				KeyMenuMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long KEY_MENU_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(KEY_MENU);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				KEY_MENU.consumeClick();
			}
		}
	}
}
