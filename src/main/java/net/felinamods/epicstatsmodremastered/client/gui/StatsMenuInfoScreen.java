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

import net.felinamods.epicstatsmodremastered.world.inventory.StatsMenuInfoMenu;
import net.felinamods.epicstatsmodremastered.procedures.WeightGUIRenderProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat8onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat7onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat6onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat5onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat4onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat3onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat2onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.Stat1onProcedure;
import net.felinamods.epicstatsmodremastered.procedures.PlayerRenderProcedure;
import net.felinamods.epicstatsmodremastered.procedures.PlayerNameRenderProcedure;
import net.felinamods.epicstatsmodremastered.network.StatsMenuInfoButtonMessage;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StatsMenuInfoScreen extends AbstractContainerScreen<StatsMenuInfoMenu> {
	private final static HashMap<String, Object> guistate = StatsMenuInfoMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_return;

	public StatsMenuInfoScreen(StatsMenuInfoMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("epic_stats_mod_remastered:textures/screens/stats_menu_info.png");

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

		guiGraphics.blit(new ResourceLocation("epic_stats_mod_remastered:textures/screens/level_screen.png"), this.leftPos + -214, this.topPos + -120, 0, 0, 432, 256, 432, 256);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_stats_mod_remastered.stats_menu_info.label_increases_player_attack_damage"), -23, -67, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_stats_mod_remastered.stats_menu_info.label_increases_player_health"), -23, -47, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_stats_mod_remastered.stats_menu_info.label_increases_player_armor"), -23, -27, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_stats_mod_remastered.stats_menu_info.label_increases_player_spell_damage_an"), -23, -7, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_stats_mod_remastered.stats_menu_info.label_increases_player_mana_and_spell"), -23, 13, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_stats_mod_remastered.stats_menu_info.label_increases_player_attack_speed"), -23, 33, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_stats_mod_remastered.stats_menu_info.label_increases_player_stamina"), -23, 53, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_stats_mod_remastered.stats_menu_info.label_increases_player_luck"), -23, 73, -1, false);
		if (WeightGUIRenderProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.epic_stats_mod_remastered.stats_menu_info.label_players_weight"), 37, 103, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_stats_mod_remastered.stats_menu_info.label_stats_info"), 17, -97, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_return = Button.builder(Component.translatable("gui.epic_stats_mod_remastered.stats_menu_info.button_return"), e -> {
			if (true) {
				EpicStatsModRemasteredMod.PACKET_HANDLER.sendToServer(new StatsMenuInfoButtonMessage(0, x, y, z));
				StatsMenuInfoButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 83, 56, 20).build();
		guistate.put("button:button_return", button_return);
		this.addRenderableWidget(button_return);
	}
}
