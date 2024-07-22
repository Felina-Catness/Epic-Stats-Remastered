package net.felinamods.epicstatsmodremastered.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.felinamods.epicstatsmodremastered.world.inventory.StatsMenuRemasteredMenu;
import net.felinamods.epicstatsmodremastered.procedures.WeightStatusRenderProcedure;
import net.felinamods.epicstatsmodremastered.procedures.WeightRenderProcedure;
import net.felinamods.epicstatsmodremastered.procedures.WeightGUIRenderProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat8onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat8NameProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat8LevelProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat7onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat7NameProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat7LevelProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat6onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat6NameProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat6LevelProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat5onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat5NameProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat5LevelProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat4onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat4NameProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat4LevelProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat3onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat3NameProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat3LevelProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat2onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat2NameProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat2LevelProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat1onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat1NameProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat1LevelProcedure;
import net.felinamods.epicstatsmodremastered.procedures.SPRenderProcedure;
import net.felinamods.epicstatsmodremastered.procedures.PlayerRenderProcedure;
import net.felinamods.epicstatsmodremastered.procedures.PlayerNameRenderProcedure;
import net.felinamods.epicstatsmodremastered.procedures.PlayerExRenderProcedure;
import net.felinamods.epicstatsmodremastered.procedures.LevelRenderProcedure;
import net.felinamods.epicstatsmodremastered.procedures.ExchangeRenderProcedure;
import net.felinamods.epicstatsmodremastered.network.StatsMenuRemasteredButtonMessage;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StatsMenuRemasteredScreen extends AbstractContainerScreen<StatsMenuRemasteredMenu> {
	private final static HashMap<String, Object> guistate = StatsMenuRemasteredMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_exchange_exp;
	Button button_1;
	Button button_11;
	Button button_12;
	Button button_13;
	Button button_14;
	Button button_15;
	Button button_16;
	Button button_17;
	Button button_empty;

	public StatsMenuRemasteredScreen(StatsMenuRemasteredMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("epic_stats_mod_remastered:textures/screens/stats_menu_remastered.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (PlayerRenderProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -125, this.topPos + 69, 60, 0f + (float) Math.atan((this.leftPos + -125 - mouseX) / 40.0), (float) Math.atan((this.topPos + 20 - mouseY) / 40.0),
					livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (Stat1onProcedure.execute()) {
			guiGraphics.blit(new ResourceLocation("epic_stats_mod_remastered:textures/screens/tile033.png"), this.leftPos + -48, this.topPos + -72, 0, 0, 16, 16, 16, 16);
		}
		if (Stat2onProcedure.execute()) {
			guiGraphics.blit(new ResourceLocation("epic_stats_mod_remastered:textures/screens/tile268.png"), this.leftPos + -48, this.topPos + -52, 0, 0, 16, 16, 16, 16);
		}
		if (Stat3onProcedure.execute()) {
			guiGraphics.blit(new ResourceLocation("epic_stats_mod_remastered:textures/screens/tile160.png"), this.leftPos + -48, this.topPos + -32, 0, 0, 16, 16, 16, 16);
		}
		if (Stat4onProcedure.execute()) {
			guiGraphics.blit(new ResourceLocation("epic_stats_mod_remastered:textures/screens/tile246.png"), this.leftPos + -48, this.topPos + -12, 0, 0, 16, 16, 16, 16);
		}
		if (Stat5onProcedure.execute()) {
			guiGraphics.blit(new ResourceLocation("epic_stats_mod_remastered:textures/screens/tile238.png"), this.leftPos + -48, this.topPos + 8, 0, 0, 16, 16, 16, 16);
		}
		if (Stat6onProcedure.execute()) {
			guiGraphics.blit(new ResourceLocation("epic_stats_mod_remastered:textures/screens/tile092.png"), this.leftPos + -48, this.topPos + 28, 0, 0, 16, 16, 16, 16);
		}
		if (Stat7onProcedure.execute()) {
			guiGraphics.blit(new ResourceLocation("epic_stats_mod_remastered:textures/screens/tile174.png"), this.leftPos + -48, this.topPos + 48, 0, 0, 16, 16, 16, 16);
		}
		if (Stat8onProcedure.execute()) {
			guiGraphics.blit(new ResourceLocation("epic_stats_mod_remastered:textures/screens/tile198.png"), this.leftPos + -48, this.topPos + 68, 0, 0, 16, 16, 16, 16);
		}
		if (WeightGUIRenderProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("epic_stats_mod_remastered:textures/screens/weightwawa.png"), this.leftPos + 12, this.topPos + 98, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				PlayerNameRenderProcedure.execute(entity), -163, -92, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_stats_mod_remastered.stats_menu_remastered.label_level"), -164, 75, -1, false);
		guiGraphics.drawString(this.font,

				LevelRenderProcedure.execute(entity), -132, 75, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_stats_mod_remastered.stats_menu_remastered.label_exp"), -164, 87, -1, false);
		guiGraphics.drawString(this.font,

				PlayerExRenderProcedure.execute(entity), -140, 87, -1, false);
		if (WeightGUIRenderProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.epic_stats_mod_remastered.stats_menu_remastered.label_weight"), 32, 93, -1, false);
		if (WeightGUIRenderProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					WeightRenderProcedure.execute(entity), 72, 93, -1, false);
		guiGraphics.drawString(this.font,

				SPRenderProcedure.execute(entity), -38, -92, -1, false);
		if (Stat1onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat1NameProcedure.execute(), -23, -72, -1, false);
		if (Stat1onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat1LevelProcedure.execute(entity), 82, -72, -1, false);
		if (Stat2onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat2NameProcedure.execute(), -23, -52, -1, false);
		if (Stat2onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat2LevelProcedure.execute(entity), 82, -52, -1, false);
		if (Stat3onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat3NameProcedure.execute(), -23, -32, -1, false);
		if (Stat3onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat3LevelProcedure.execute(entity), 82, -32, -1, false);
		if (Stat4onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat4NameProcedure.execute(), -23, -12, -1, false);
		if (Stat4onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat4LevelProcedure.execute(entity), 82, -12, -1, false);
		if (Stat5onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat5NameProcedure.execute(), -23, 8, -1, false);
		if (Stat5onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat5LevelProcedure.execute(entity), 82, 8, -1, false);
		if (Stat6onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat6NameProcedure.execute(), -23, 28, -1, false);
		if (Stat6onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat6LevelProcedure.execute(entity), 82, 28, -1, false);
		if (Stat7onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat7NameProcedure.execute(), -23, 48, -1, false);
		if (Stat7onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat7LevelProcedure.execute(entity), 82, 48, -1, false);
		if (Stat8onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat8NameProcedure.execute(), -23, 68, -1, false);
		if (Stat8onProcedure.execute())
			guiGraphics.drawString(this.font,

					Stat8LevelProcedure.execute(entity), 82, 68, -1, false);
		if (WeightGUIRenderProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.epic_stats_mod_remastered.stats_menu_remastered.label_status"), 32, 108, -1, false);
		guiGraphics.drawString(this.font,

				WeightStatusRenderProcedure.execute(entity), 72, 108, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_exchange_exp = Button.builder(Component.translatable("gui.epic_stats_mod_remastered.stats_menu_remastered.button_exchange_exp"), e -> {
			if (ExchangeRenderProcedure.execute()) {
				EpicStatsModRemasteredMod.PACKET_HANDLER.sendToServer(new StatsMenuRemasteredButtonMessage(0, x, y, z));
				StatsMenuRemasteredButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 82, this.topPos + -102, 87, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ExchangeRenderProcedure.execute())
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_exchange_exp", button_exchange_exp);
		this.addRenderableWidget(button_exchange_exp);
		button_1 = Button.builder(Component.translatable("gui.epic_stats_mod_remastered.stats_menu_remastered.button_1"), e -> {
			if (Stat1onProcedure.execute()) {
				EpicStatsModRemasteredMod.PACKET_HANDLER.sendToServer(new StatsMenuRemasteredButtonMessage(1, x, y, z));
				StatsMenuRemasteredButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 132, this.topPos + -77, 35, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (Stat1onProcedure.execute())
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_1", button_1);
		this.addRenderableWidget(button_1);
		button_11 = Button.builder(Component.translatable("gui.epic_stats_mod_remastered.stats_menu_remastered.button_11"), e -> {
			if (Stat2onProcedure.execute()) {
				EpicStatsModRemasteredMod.PACKET_HANDLER.sendToServer(new StatsMenuRemasteredButtonMessage(2, x, y, z));
				StatsMenuRemasteredButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 132, this.topPos + -57, 35, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (Stat2onProcedure.execute())
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_11", button_11);
		this.addRenderableWidget(button_11);
		button_12 = Button.builder(Component.translatable("gui.epic_stats_mod_remastered.stats_menu_remastered.button_12"), e -> {
			if (Stat3onProcedure.execute()) {
				EpicStatsModRemasteredMod.PACKET_HANDLER.sendToServer(new StatsMenuRemasteredButtonMessage(3, x, y, z));
				StatsMenuRemasteredButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 132, this.topPos + -37, 35, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (Stat3onProcedure.execute())
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_12", button_12);
		this.addRenderableWidget(button_12);
		button_13 = Button.builder(Component.translatable("gui.epic_stats_mod_remastered.stats_menu_remastered.button_13"), e -> {
			if (Stat4onProcedure.execute()) {
				EpicStatsModRemasteredMod.PACKET_HANDLER.sendToServer(new StatsMenuRemasteredButtonMessage(4, x, y, z));
				StatsMenuRemasteredButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 132, this.topPos + -17, 35, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (Stat4onProcedure.execute())
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_13", button_13);
		this.addRenderableWidget(button_13);
		button_14 = Button.builder(Component.translatable("gui.epic_stats_mod_remastered.stats_menu_remastered.button_14"), e -> {
			if (Stat5onProcedure.execute()) {
				EpicStatsModRemasteredMod.PACKET_HANDLER.sendToServer(new StatsMenuRemasteredButtonMessage(5, x, y, z));
				StatsMenuRemasteredButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 132, this.topPos + 3, 35, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (Stat5onProcedure.execute())
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_14", button_14);
		this.addRenderableWidget(button_14);
		button_15 = Button.builder(Component.translatable("gui.epic_stats_mod_remastered.stats_menu_remastered.button_15"), e -> {
			if (Stat6onProcedure.execute()) {
				EpicStatsModRemasteredMod.PACKET_HANDLER.sendToServer(new StatsMenuRemasteredButtonMessage(6, x, y, z));
				StatsMenuRemasteredButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 132, this.topPos + 23, 35, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (Stat6onProcedure.execute())
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_15", button_15);
		this.addRenderableWidget(button_15);
		button_16 = Button.builder(Component.translatable("gui.epic_stats_mod_remastered.stats_menu_remastered.button_16"), e -> {
			if (Stat7onProcedure.execute()) {
				EpicStatsModRemasteredMod.PACKET_HANDLER.sendToServer(new StatsMenuRemasteredButtonMessage(7, x, y, z));
				StatsMenuRemasteredButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 132, this.topPos + 43, 35, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (Stat7onProcedure.execute())
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_16", button_16);
		this.addRenderableWidget(button_16);
		button_17 = Button.builder(Component.translatable("gui.epic_stats_mod_remastered.stats_menu_remastered.button_17"), e -> {
			if (Stat8onProcedure.execute()) {
				EpicStatsModRemasteredMod.PACKET_HANDLER.sendToServer(new StatsMenuRemasteredButtonMessage(8, x, y, z));
				StatsMenuRemasteredButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 132, this.topPos + 63, 35, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (Stat8onProcedure.execute())
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_17", button_17);
		this.addRenderableWidget(button_17);
		button_empty = Button.builder(Component.translatable("gui.epic_stats_mod_remastered.stats_menu_remastered.button_empty"), e -> {
			if (true) {
				EpicStatsModRemasteredMod.PACKET_HANDLER.sendToServer(new StatsMenuRemasteredButtonMessage(9, x, y, z));
				StatsMenuRemasteredButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 172, this.topPos + -77, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
