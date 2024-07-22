
package net.felinamods.epicstatsmodremastered.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.felinamods.epicstatsmodremastered.world.inventory.StatsMenuRemasteredMenu;
import net.felinamods.epicstatsmodremastered.procedures.KeyVitProcedure;
import net.felinamods.epicstatsmodremastered.procedures.KeyStrProcedure;
import net.felinamods.epicstatsmodremastered.procedures.KeyStaProcedure;
import net.felinamods.epicstatsmodremastered.procedures.KeyResProcedure;
import net.felinamods.epicstatsmodremastered.procedures.KeyMagProcedure;
import net.felinamods.epicstatsmodremastered.procedures.KeyLckProcedure;
import net.felinamods.epicstatsmodremastered.procedures.KeyIntProcedure;
import net.felinamods.epicstatsmodremastered.procedures.KeyExchangeProcedure;
import net.felinamods.epicstatsmodremastered.procedures.KeyDexProcedure;
import net.felinamods.epicstatsmodremastered.procedures.GoInfoRProcedure;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StatsMenuRemasteredButtonMessage {
	private final int buttonID, x, y, z;

	public StatsMenuRemasteredButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public StatsMenuRemasteredButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(StatsMenuRemasteredButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(StatsMenuRemasteredButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = StatsMenuRemasteredMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			KeyExchangeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			KeyStrProcedure.execute(entity);
		}
		if (buttonID == 2) {

			KeyVitProcedure.execute(entity);
		}
		if (buttonID == 3) {

			KeyResProcedure.execute(entity);
		}
		if (buttonID == 4) {

			KeyIntProcedure.execute(entity);
		}
		if (buttonID == 5) {

			KeyMagProcedure.execute(entity);
		}
		if (buttonID == 6) {

			KeyDexProcedure.execute(entity);
		}
		if (buttonID == 7) {

			KeyStaProcedure.execute(entity);
		}
		if (buttonID == 8) {

			KeyLckProcedure.execute(entity);
		}
		if (buttonID == 9) {

			GoInfoRProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EpicStatsModRemasteredMod.addNetworkMessage(StatsMenuRemasteredButtonMessage.class, StatsMenuRemasteredButtonMessage::buffer, StatsMenuRemasteredButtonMessage::new, StatsMenuRemasteredButtonMessage::handler);
	}
}
