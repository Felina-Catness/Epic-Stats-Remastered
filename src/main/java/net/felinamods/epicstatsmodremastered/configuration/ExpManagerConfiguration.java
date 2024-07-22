package net.felinamods.epicstatsmodremastered.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class ExpManagerConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Double> EXP_BASE;
	public static final ForgeConfigSpec.ConfigValue<Double> EXP_BONUS;
	public static final ForgeConfigSpec.ConfigValue<Double> EXP_MIN;
	public static final ForgeConfigSpec.ConfigValue<Double> EXP_MAX;
	public static final ForgeConfigSpec.ConfigValue<Boolean> OLD_EXP;
	public static final ForgeConfigSpec.ConfigValue<Boolean> EXP_DIVISION_T;
	public static final ForgeConfigSpec.ConfigValue<Double> EXP_DIVISION_V;
	public static final ForgeConfigSpec.ConfigValue<Boolean> EXP_EXCHANGE_T;
	public static final ForgeConfigSpec.ConfigValue<Double> EXP_EXCHANGE_V;
	public static final ForgeConfigSpec.ConfigValue<Double> EXP_START;
	public static final ForgeConfigSpec.ConfigValue<String> EXP_FROM;
	public static final ForgeConfigSpec.ConfigValue<Double> TYPES_USED;
	public static final ForgeConfigSpec.ConfigValue<Double> MAX_PLAYER_LEVEL;
	public static final ForgeConfigSpec.ConfigValue<String> LETTER_LEVEL_UP;
	public static final ForgeConfigSpec.ConfigValue<Double> SP_PER_LEVEL;
	public static final ForgeConfigSpec.ConfigValue<Boolean> NEW_MENU;
	public static final ForgeConfigSpec.ConfigValue<Boolean> NO_KEYBIND;
	public static final ForgeConfigSpec.ConfigValue<Boolean> MENU_ITEM;
	public static final ForgeConfigSpec.ConfigValue<String> MENU_ITEM_V;
	public static final ForgeConfigSpec.ConfigValue<Boolean> MENU_BLOCK;
	public static final ForgeConfigSpec.ConfigValue<String> MENU_BLOCK_V;
	public static final ForgeConfigSpec.ConfigValue<Boolean> EF_WEIGHT;
	public static final ForgeConfigSpec.ConfigValue<Double> EF_WEIGHT_PER_LEVEL;
	public static final ForgeConfigSpec.ConfigValue<Double> EF_WEIGHT_AT_THE_START;
	public static final ForgeConfigSpec.ConfigValue<Double> EF_WEIGHT_STAT;
	public static final ForgeConfigSpec.ConfigValue<Double> EF_WEIGHT_LIMIT;
	public static final ForgeConfigSpec.ConfigValue<Double> AUTOLVL_CAP;
	static {
		BUILDER.push("Exp Manager");
		EXP_BASE = BUILDER.comment("The exp base, do not modify if unsure").define("EXP Base", (double) 20);
		EXP_BONUS = BUILDER.comment("A custom bonus to earned exp").define("EXP Bonus", (double) 0);
		EXP_MIN = BUILDER.comment("Minimal exp value, do not modify if unsure").define("EXP Min", (double) 100);
		EXP_MAX = BUILDER.comment("Maximum exp value, do not modify if unsure").define("EXP Max", (double) 200);
		OLD_EXP = BUILDER.comment("This option makes get level up harder. It also can be tweaked with Exp division.").define("Old EXP", false);
		EXP_DIVISION_T = BUILDER.comment("Makes a division on the exp to tweak it, do not modify or use if unsure").define("Exp Division", false);
		EXP_DIVISION_V = BUILDER.comment("The division value").define("EXP Division Value", (double) 0);
		EXP_EXCHANGE_T = BUILDER.comment("Makes the game allowing to exchange vanilla exp to mod exp").define("Exp Exchange", false);
		EXP_EXCHANGE_V = BUILDER.comment("The value of the exchange").define("EXP Exchange Value", (double) 20);
		EXP_START = BUILDER.define("EXP Start", (double) 50);
		EXP_FROM = BUILDER.comment("This config allows to configure how the system will work, in tag mode only entities inside tag will give exp and in type mode only entities with the correct type will give exp").define("The exp is taken from",
				"Type");
		TYPES_USED = BUILDER.comment("1 = only entities with enemy type, 2 = enemy and mob, 3 = enemy, mob and passive, 4 = ememy, mob, passive and player. Formatting is 1.0, 2.0 and etc").define("Allowed types", (double) 1);
		BUILDER.pop();
		BUILDER.push("Misc");
		MAX_PLAYER_LEVEL = BUILDER.comment("Max level for all players in server").define("Max Player Level", (double) 200);
		LETTER_LEVEL_UP = BUILDER.define("Letter in the lvlup chat", "M");
		SP_PER_LEVEL = BUILDER.define("SP per level up", (double) 1);
		NEW_MENU = BUILDER.define("Use Legacy menu screen?", true);
		NO_KEYBIND = BUILDER.define("Use other methods to open the menu?", false);
		MENU_ITEM = BUILDER.define("Do right click with one item?", true);
		MENU_ITEM_V = BUILDER.define("Item ID", "minecraft:stick");
		MENU_BLOCK = BUILDER.define("Right clicking a block?", true);
		MENU_BLOCK_V = BUILDER.define("Block ID", "minecraft:dirt");
		BUILDER.pop();
		BUILDER.push("Epic Fight");
		EF_WEIGHT = BUILDER.comment("This feature depends in Epic Fight Mod to work, it makes you have a weight limit while carrying armors.").define("Weight", true);
		EF_WEIGHT_PER_LEVEL = BUILDER.comment("Determines the amount of weight bonus per stat level").define("Weight per level", (double) 1);
		EF_WEIGHT_AT_THE_START = BUILDER.comment("Do not modify this :3").define("Weight at the start", (double) 40);
		EF_WEIGHT_STAT = BUILDER.comment("Determines which stat is used to rise weight").define("Weight Stat", (double) 3);
		EF_WEIGHT_LIMIT = BUILDER.comment("Determines the limit of weight when you enter for first time in a world").define("Weight Limit Modifier", (double) 50);
		BUILDER.pop();
		BUILDER.push("Autoleveling");
		AUTOLVL_CAP = BUILDER.comment("A cap to Autoleveling mobs").define("Auto Leveling Cap", (double) 1);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
