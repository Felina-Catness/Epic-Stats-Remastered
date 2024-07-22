package net.felinamods.epicstatsmodremastered.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

import java.util.function.Supplier;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EpicStatsModRemasteredModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		EpicStatsModRemasteredMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		EpicStatsModRemasteredMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.pl_boots = original.pl_boots;
			clone.pl_chest = original.pl_chest;
			clone.pl_head = original.pl_head;
			clone.pl_leggins = original.pl_leggins;
			clone.pl_mainhand = original.pl_mainhand;
			clone.pl_offhand = original.pl_offhand;
			clone.book = original.book;
			clone.current_weight_limit = original.current_weight_limit;
			clone.EXP_lvl = original.EXP_lvl;
			clone.EXP_lvl_max = original.EXP_lvl_max;
			clone.player_lvl = original.player_lvl;
			clone.SP = original.SP;
			clone.stat_1_level = original.stat_1_level;
			clone.stat_1_new = original.stat_1_new;
			clone.stat_2_level = original.stat_2_level;
			clone.stat_2_new = original.stat_2_new;
			clone.stat_3_level = original.stat_3_level;
			clone.stat_3_new = original.stat_3_new;
			clone.stat_4_extra1_new = original.stat_4_extra1_new;
			clone.stat_4_extra2_new = original.stat_4_extra2_new;
			clone.stat_4_extra3_new = original.stat_4_extra3_new;
			clone.stat_4_level = original.stat_4_level;
			clone.stat_4_new = original.stat_4_new;
			clone.stat_5_extra1_new = original.stat_5_extra1_new;
			clone.stat_5_extra2_new = original.stat_5_extra2_new;
			clone.stat_5_level = original.stat_5_level;
			clone.stat_5_new = original.stat_5_new;
			clone.stat_6_level = original.stat_6_level;
			clone.stat_6_new = original.stat_6_new;
			clone.stat_7_extra1_new = original.stat_7_extra1_new;
			clone.stat_7_extra2_new = original.stat_7_extra2_new;
			clone.stat_7_level = original.stat_7_level;
			clone.stat_7_new = original.stat_7_new;
			clone.stat_8_level = original.stat_8_level;
			clone.stat_8_new = original.stat_8_new;
			clone.total_sp = original.total_sp;
			clone.lostitems = original.lostitems;
			clone.playerID = original.playerID;
			clone.stat_1_extra1_new = original.stat_1_extra1_new;
			clone.stat_1_extra2_new = original.stat_1_extra2_new;
			clone.stat_1_extra3_new = original.stat_1_extra3_new;
			clone.stat_2_extra1_new = original.stat_2_extra1_new;
			clone.stat_2_extra2_new = original.stat_2_extra2_new;
			clone.stat_2_extra3_new = original.stat_2_extra3_new;
			clone.stat_3_extra1_new = original.stat_3_extra1_new;
			clone.stat_3_extra2_new = original.stat_3_extra2_new;
			clone.stat_3_extra3_new = original.stat_3_extra3_new;
			clone.stat_5_extra3_new = original.stat_5_extra3_new;
			clone.stat_6_extra3_new = original.stat_6_extra3_new;
			clone.stat_6_extra2_new = original.stat_6_extra2_new;
			clone.stat_6_extra1_new = original.stat_6_extra1_new;
			clone.stat_7_extra3_new = original.stat_7_extra3_new;
			clone.stat_8_extra1_new = original.stat_8_extra1_new;
			clone.stat_8_extra2_new = original.stat_8_extra2_new;
			clone.stat_8_extra3_new = original.stat_8_extra3_new;
			clone.bookanim = original.bookanim;
			clone.bookanimreversed = original.bookanimreversed;
			if (!event.isWasDeath()) {
				clone.exphunter_on = original.exphunter_on;
				clone.weight_effect_timer = original.weight_effect_timer;
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					EpicStatsModRemasteredMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					EpicStatsModRemasteredMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					EpicStatsModRemasteredMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "epic_stats_mod_remastered_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				EpicStatsModRemasteredMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "epic_stats_mod_remastered_mapvars";
		public BlockState stat_4_etra = Blocks.AIR.defaultBlockState();

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			stat_4_etra = NbtUtils.readBlockState(BuiltInRegistries.BLOCK.asLookup(), nbt.getCompound("stat_4_etra"));
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.put("stat_4_etra", NbtUtils.writeBlockState(stat_4_etra));
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				EpicStatsModRemasteredMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("epic_stats_mod_remastered", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public ItemStack pl_boots = ItemStack.EMPTY;
		public ItemStack pl_chest = ItemStack.EMPTY;
		public ItemStack pl_head = ItemStack.EMPTY;
		public ItemStack pl_leggins = ItemStack.EMPTY;
		public ItemStack pl_mainhand = ItemStack.EMPTY;
		public ItemStack pl_offhand = ItemStack.EMPTY;
		public boolean exphunter_on = false;
		public double weight_effect_timer = 0.0;
		public double book = 1.0;
		public double current_weight_limit = 50.0;
		public double EXP_lvl = 0.0;
		public double EXP_lvl_max = 50.0;
		public double player_lvl = 1.0;
		public double SP = 0.0;
		public double stat_1_level = 1.0;
		public double stat_1_new = 0.0;
		public double stat_2_level = 1.0;
		public double stat_2_new = 0.0;
		public double stat_3_level = 1.0;
		public double stat_3_new = 0.0;
		public double stat_4_extra1_new = 0.0;
		public double stat_4_extra2_new = 0.0;
		public double stat_4_extra3_new = 0.0;
		public double stat_4_level = 1.0;
		public double stat_4_new = 0.0;
		public double stat_5_extra1_new = 0.0;
		public double stat_5_extra2_new = 0.0;
		public double stat_5_level = 1.0;
		public double stat_5_new = 0;
		public double stat_6_level = 1.0;
		public double stat_6_new = 0;
		public double stat_7_extra1_new = 0;
		public double stat_7_extra2_new = 0;
		public double stat_7_level = 1.0;
		public double stat_7_new = 0;
		public double stat_8_level = 1.0;
		public double stat_8_new = 0;
		public double total_sp = 0.0;
		public boolean lostitems = false;
		public String playerID = "\"\"";
		public double stat_1_extra1_new = 0;
		public double stat_1_extra2_new = 0;
		public double stat_1_extra3_new = 0;
		public double stat_2_extra1_new = 0;
		public double stat_2_extra2_new = 0;
		public double stat_2_extra3_new = 0;
		public double stat_3_extra1_new = 0;
		public double stat_3_extra2_new = 0;
		public double stat_3_extra3_new = 0;
		public double stat_5_extra3_new = 0;
		public double stat_6_extra3_new = 0;
		public double stat_6_extra2_new = 0;
		public double stat_6_extra1_new = 0;
		public double stat_7_extra3_new = 0;
		public double stat_8_extra1_new = 0;
		public double stat_8_extra2_new = 0;
		public double stat_8_extra3_new = 0;
		public double bookanim = 0;
		public double bookanimreversed = 0.0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				EpicStatsModRemasteredMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.put("pl_boots", pl_boots.save(new CompoundTag()));
			nbt.put("pl_chest", pl_chest.save(new CompoundTag()));
			nbt.put("pl_head", pl_head.save(new CompoundTag()));
			nbt.put("pl_leggins", pl_leggins.save(new CompoundTag()));
			nbt.put("pl_mainhand", pl_mainhand.save(new CompoundTag()));
			nbt.put("pl_offhand", pl_offhand.save(new CompoundTag()));
			nbt.putBoolean("exphunter_on", exphunter_on);
			nbt.putDouble("weight_effect_timer", weight_effect_timer);
			nbt.putDouble("book", book);
			nbt.putDouble("current_weight_limit", current_weight_limit);
			nbt.putDouble("EXP_lvl", EXP_lvl);
			nbt.putDouble("EXP_lvl_max", EXP_lvl_max);
			nbt.putDouble("player_lvl", player_lvl);
			nbt.putDouble("SP", SP);
			nbt.putDouble("stat_1_level", stat_1_level);
			nbt.putDouble("stat_1_new", stat_1_new);
			nbt.putDouble("stat_2_level", stat_2_level);
			nbt.putDouble("stat_2_new", stat_2_new);
			nbt.putDouble("stat_3_level", stat_3_level);
			nbt.putDouble("stat_3_new", stat_3_new);
			nbt.putDouble("stat_4_extra1_new", stat_4_extra1_new);
			nbt.putDouble("stat_4_extra2_new", stat_4_extra2_new);
			nbt.putDouble("stat_4_extra3_new", stat_4_extra3_new);
			nbt.putDouble("stat_4_level", stat_4_level);
			nbt.putDouble("stat_4_new", stat_4_new);
			nbt.putDouble("stat_5_extra1_new", stat_5_extra1_new);
			nbt.putDouble("stat_5_extra2_new", stat_5_extra2_new);
			nbt.putDouble("stat_5_level", stat_5_level);
			nbt.putDouble("stat_5_new", stat_5_new);
			nbt.putDouble("stat_6_level", stat_6_level);
			nbt.putDouble("stat_6_new", stat_6_new);
			nbt.putDouble("stat_7_extra1_new", stat_7_extra1_new);
			nbt.putDouble("stat_7_extra2_new", stat_7_extra2_new);
			nbt.putDouble("stat_7_level", stat_7_level);
			nbt.putDouble("stat_7_new", stat_7_new);
			nbt.putDouble("stat_8_level", stat_8_level);
			nbt.putDouble("stat_8_new", stat_8_new);
			nbt.putDouble("total_sp", total_sp);
			nbt.putBoolean("lostitems", lostitems);
			nbt.putString("playerID", playerID);
			nbt.putDouble("stat_1_extra1_new", stat_1_extra1_new);
			nbt.putDouble("stat_1_extra2_new", stat_1_extra2_new);
			nbt.putDouble("stat_1_extra3_new", stat_1_extra3_new);
			nbt.putDouble("stat_2_extra1_new", stat_2_extra1_new);
			nbt.putDouble("stat_2_extra2_new", stat_2_extra2_new);
			nbt.putDouble("stat_2_extra3_new", stat_2_extra3_new);
			nbt.putDouble("stat_3_extra1_new", stat_3_extra1_new);
			nbt.putDouble("stat_3_extra2_new", stat_3_extra2_new);
			nbt.putDouble("stat_3_extra3_new", stat_3_extra3_new);
			nbt.putDouble("stat_5_extra3_new", stat_5_extra3_new);
			nbt.putDouble("stat_6_extra3_new", stat_6_extra3_new);
			nbt.putDouble("stat_6_extra2_new", stat_6_extra2_new);
			nbt.putDouble("stat_6_extra1_new", stat_6_extra1_new);
			nbt.putDouble("stat_7_extra3_new", stat_7_extra3_new);
			nbt.putDouble("stat_8_extra1_new", stat_8_extra1_new);
			nbt.putDouble("stat_8_extra2_new", stat_8_extra2_new);
			nbt.putDouble("stat_8_extra3_new", stat_8_extra3_new);
			nbt.putDouble("bookanim", bookanim);
			nbt.putDouble("bookanimreversed", bookanimreversed);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			pl_boots = ItemStack.of(nbt.getCompound("pl_boots"));
			pl_chest = ItemStack.of(nbt.getCompound("pl_chest"));
			pl_head = ItemStack.of(nbt.getCompound("pl_head"));
			pl_leggins = ItemStack.of(nbt.getCompound("pl_leggins"));
			pl_mainhand = ItemStack.of(nbt.getCompound("pl_mainhand"));
			pl_offhand = ItemStack.of(nbt.getCompound("pl_offhand"));
			exphunter_on = nbt.getBoolean("exphunter_on");
			weight_effect_timer = nbt.getDouble("weight_effect_timer");
			book = nbt.getDouble("book");
			current_weight_limit = nbt.getDouble("current_weight_limit");
			EXP_lvl = nbt.getDouble("EXP_lvl");
			EXP_lvl_max = nbt.getDouble("EXP_lvl_max");
			player_lvl = nbt.getDouble("player_lvl");
			SP = nbt.getDouble("SP");
			stat_1_level = nbt.getDouble("stat_1_level");
			stat_1_new = nbt.getDouble("stat_1_new");
			stat_2_level = nbt.getDouble("stat_2_level");
			stat_2_new = nbt.getDouble("stat_2_new");
			stat_3_level = nbt.getDouble("stat_3_level");
			stat_3_new = nbt.getDouble("stat_3_new");
			stat_4_extra1_new = nbt.getDouble("stat_4_extra1_new");
			stat_4_extra2_new = nbt.getDouble("stat_4_extra2_new");
			stat_4_extra3_new = nbt.getDouble("stat_4_extra3_new");
			stat_4_level = nbt.getDouble("stat_4_level");
			stat_4_new = nbt.getDouble("stat_4_new");
			stat_5_extra1_new = nbt.getDouble("stat_5_extra1_new");
			stat_5_extra2_new = nbt.getDouble("stat_5_extra2_new");
			stat_5_level = nbt.getDouble("stat_5_level");
			stat_5_new = nbt.getDouble("stat_5_new");
			stat_6_level = nbt.getDouble("stat_6_level");
			stat_6_new = nbt.getDouble("stat_6_new");
			stat_7_extra1_new = nbt.getDouble("stat_7_extra1_new");
			stat_7_extra2_new = nbt.getDouble("stat_7_extra2_new");
			stat_7_level = nbt.getDouble("stat_7_level");
			stat_7_new = nbt.getDouble("stat_7_new");
			stat_8_level = nbt.getDouble("stat_8_level");
			stat_8_new = nbt.getDouble("stat_8_new");
			total_sp = nbt.getDouble("total_sp");
			lostitems = nbt.getBoolean("lostitems");
			playerID = nbt.getString("playerID");
			stat_1_extra1_new = nbt.getDouble("stat_1_extra1_new");
			stat_1_extra2_new = nbt.getDouble("stat_1_extra2_new");
			stat_1_extra3_new = nbt.getDouble("stat_1_extra3_new");
			stat_2_extra1_new = nbt.getDouble("stat_2_extra1_new");
			stat_2_extra2_new = nbt.getDouble("stat_2_extra2_new");
			stat_2_extra3_new = nbt.getDouble("stat_2_extra3_new");
			stat_3_extra1_new = nbt.getDouble("stat_3_extra1_new");
			stat_3_extra2_new = nbt.getDouble("stat_3_extra2_new");
			stat_3_extra3_new = nbt.getDouble("stat_3_extra3_new");
			stat_5_extra3_new = nbt.getDouble("stat_5_extra3_new");
			stat_6_extra3_new = nbt.getDouble("stat_6_extra3_new");
			stat_6_extra2_new = nbt.getDouble("stat_6_extra2_new");
			stat_6_extra1_new = nbt.getDouble("stat_6_extra1_new");
			stat_7_extra3_new = nbt.getDouble("stat_7_extra3_new");
			stat_8_extra1_new = nbt.getDouble("stat_8_extra1_new");
			stat_8_extra2_new = nbt.getDouble("stat_8_extra2_new");
			stat_8_extra3_new = nbt.getDouble("stat_8_extra3_new");
			bookanim = nbt.getDouble("bookanim");
			bookanimreversed = nbt.getDouble("bookanimreversed");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EpicStatsModRemasteredMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.pl_boots = message.data.pl_boots;
					variables.pl_chest = message.data.pl_chest;
					variables.pl_head = message.data.pl_head;
					variables.pl_leggins = message.data.pl_leggins;
					variables.pl_mainhand = message.data.pl_mainhand;
					variables.pl_offhand = message.data.pl_offhand;
					variables.exphunter_on = message.data.exphunter_on;
					variables.weight_effect_timer = message.data.weight_effect_timer;
					variables.book = message.data.book;
					variables.current_weight_limit = message.data.current_weight_limit;
					variables.EXP_lvl = message.data.EXP_lvl;
					variables.EXP_lvl_max = message.data.EXP_lvl_max;
					variables.player_lvl = message.data.player_lvl;
					variables.SP = message.data.SP;
					variables.stat_1_level = message.data.stat_1_level;
					variables.stat_1_new = message.data.stat_1_new;
					variables.stat_2_level = message.data.stat_2_level;
					variables.stat_2_new = message.data.stat_2_new;
					variables.stat_3_level = message.data.stat_3_level;
					variables.stat_3_new = message.data.stat_3_new;
					variables.stat_4_extra1_new = message.data.stat_4_extra1_new;
					variables.stat_4_extra2_new = message.data.stat_4_extra2_new;
					variables.stat_4_extra3_new = message.data.stat_4_extra3_new;
					variables.stat_4_level = message.data.stat_4_level;
					variables.stat_4_new = message.data.stat_4_new;
					variables.stat_5_extra1_new = message.data.stat_5_extra1_new;
					variables.stat_5_extra2_new = message.data.stat_5_extra2_new;
					variables.stat_5_level = message.data.stat_5_level;
					variables.stat_5_new = message.data.stat_5_new;
					variables.stat_6_level = message.data.stat_6_level;
					variables.stat_6_new = message.data.stat_6_new;
					variables.stat_7_extra1_new = message.data.stat_7_extra1_new;
					variables.stat_7_extra2_new = message.data.stat_7_extra2_new;
					variables.stat_7_level = message.data.stat_7_level;
					variables.stat_7_new = message.data.stat_7_new;
					variables.stat_8_level = message.data.stat_8_level;
					variables.stat_8_new = message.data.stat_8_new;
					variables.total_sp = message.data.total_sp;
					variables.lostitems = message.data.lostitems;
					variables.playerID = message.data.playerID;
					variables.stat_1_extra1_new = message.data.stat_1_extra1_new;
					variables.stat_1_extra2_new = message.data.stat_1_extra2_new;
					variables.stat_1_extra3_new = message.data.stat_1_extra3_new;
					variables.stat_2_extra1_new = message.data.stat_2_extra1_new;
					variables.stat_2_extra2_new = message.data.stat_2_extra2_new;
					variables.stat_2_extra3_new = message.data.stat_2_extra3_new;
					variables.stat_3_extra1_new = message.data.stat_3_extra1_new;
					variables.stat_3_extra2_new = message.data.stat_3_extra2_new;
					variables.stat_3_extra3_new = message.data.stat_3_extra3_new;
					variables.stat_5_extra3_new = message.data.stat_5_extra3_new;
					variables.stat_6_extra3_new = message.data.stat_6_extra3_new;
					variables.stat_6_extra2_new = message.data.stat_6_extra2_new;
					variables.stat_6_extra1_new = message.data.stat_6_extra1_new;
					variables.stat_7_extra3_new = message.data.stat_7_extra3_new;
					variables.stat_8_extra1_new = message.data.stat_8_extra1_new;
					variables.stat_8_extra2_new = message.data.stat_8_extra2_new;
					variables.stat_8_extra3_new = message.data.stat_8_extra3_new;
					variables.bookanim = message.data.bookanim;
					variables.bookanimreversed = message.data.bookanimreversed;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
