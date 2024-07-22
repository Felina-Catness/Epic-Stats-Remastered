package net.felinamods.epicstatsmodremastered.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class Stat8ConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> STAT_8_T;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_8_NAME;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_8_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_8_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT8_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_8_E1_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_8_E1_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_8_E1_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_8_E1_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_8_E2_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_8_E2_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_8_E2_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_8_E2_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_8_E3_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_8_E3_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_8_E3_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_8_E3_MAX;
	static {
		BUILDER.push("Stat 8");
		STAT_8_T = BUILDER.comment("Defines if the stat is on or off").define("Stat 8", true);
		STAT_8_NAME = BUILDER.comment("Defines which name do you want to use for this stat in the menu").define("Stat 8 Name ", "Luck");
		STAT_8_ID = BUILDER.comment("Defines the ID of the attribute, example: minecraft:generic.attack_speed").define("Stat 8 ID", "minecraft:generic.luck");
		STAT_8_V = BUILDER.comment("The value added to the attribute per level").define("Stat 8 Value", (double) 0.1);
		STAT8_MAX = BUILDER.define("Stat 8 Max", (double) 100);
		BUILDER.pop();
		BUILDER.push("Extra 1");
		STAT_8_E1_ID = BUILDER.define("Stat 8 Extra 1 ID", "aaa:aaaas");
		STAT_8_E1_V = BUILDER.define("Stat 8 Extra 1 Value", (double) 3);
		STAT_8_E1_LVLREQ = BUILDER.define("Stat 8 Extra 1 LVL Req", (double) 4);
		STAT_8_E1_MAX = BUILDER.define("Stat 8 Extra 1 Max", (double) 4);
		BUILDER.pop();
		BUILDER.push("Extra 2");
		STAT_8_E2_ID = BUILDER.define("Stat 8 Extra 2 ID", "");
		STAT_8_E2_V = BUILDER.define("Stat 8 Extra 2 Value", (double) 3);
		STAT_8_E2_LVLREQ = BUILDER.define("Stat 8 Extra 2 LVL Req", (double) 4);
		STAT_8_E2_MAX = BUILDER.define("Stat 8 Extra 2 Max", (double) 44);
		BUILDER.pop();
		BUILDER.push("Extra 3");
		STAT_8_E3_ID = BUILDER.define("Stat 8 Extra 3 ID", "aaa:aasssa");
		STAT_8_E3_V = BUILDER.define("Stat 8 Extra 3 Value", (double) 4);
		STAT_8_E3_LVLREQ = BUILDER.define("Stat 8 Extra 3 LVL Req", (double) 4);
		STAT_8_E3_MAX = BUILDER.define("Stat 8 Extra 3 Max", (double) 3);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
