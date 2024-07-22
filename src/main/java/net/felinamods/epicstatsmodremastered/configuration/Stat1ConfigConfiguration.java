package net.felinamods.epicstatsmodremastered.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class Stat1ConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> STAT_1_T;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_1_NAME;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_1_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_1_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT1_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_1_E1_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_1_E1_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_1_E1_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_1_E1_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_1_E2_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_1_E2_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_1_E2_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_1_E2_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_1_E3_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_1_E3_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_1_E3_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_1_E3_MAX;
	static {
		BUILDER.push("Stat 1");
		STAT_1_T = BUILDER.comment("Defines if the stat is on or off").define("Stat 1", true);
		STAT_1_NAME = BUILDER.comment("Defines which name do you want to use for this stat in the menu").define("Stat 1 Name ", "Strength");
		STAT_1_ID = BUILDER.comment("Defines the ID of the attribute, example: minecraft:generic.attack_speed").define("Stat 1 ID", "minecraft:generic.attack_damage");
		STAT_1_V = BUILDER.comment("The value added to the attribute per level").define("Stat 1 Value", (double) 0.1);
		STAT1_MAX = BUILDER.define("Stat 1 Max", (double) 100);
		BUILDER.pop();
		BUILDER.push("Extra 1");
		STAT_1_E1_ID = BUILDER.define("Stat 1 Extra 1 ID", "modid:attribute");
		STAT_1_E1_V = BUILDER.define("Stat 1 Extra 1 Value", (double) 1);
		STAT_1_E1_LVLREQ = BUILDER.define("Stat 1 Extra 1 LVL Req", (double) 1);
		STAT_1_E1_MAX = BUILDER.define("Stat 1 Extra 1 Max", (double) 1);
		BUILDER.pop();
		BUILDER.push("Extra 2");
		STAT_1_E2_ID = BUILDER.define("Stat 1 Extra 2 ID", "awawa:wawa");
		STAT_1_E2_V = BUILDER.define("Stat 1 Extra 2 Value", (double) 1);
		STAT_1_E2_LVLREQ = BUILDER.define("Stat 1 Extra 2 LVL Req", (double) 1);
		STAT_1_E2_MAX = BUILDER.define("Stat 1 Extra 2 Max", (double) 1);
		BUILDER.pop();
		BUILDER.push("Extra 3");
		STAT_1_E3_ID = BUILDER.define("Stat 1 Extra 3 ID", "aaa:aaaa");
		STAT_1_E3_V = BUILDER.define("Stat 1 Extra 3 Value", (double) 1);
		STAT_1_E3_LVLREQ = BUILDER.define("Stat 1 Extra 3 LVL Req", (double) 1);
		STAT_1_E3_MAX = BUILDER.define("Stat 1 Extra 3 Max", (double) 1);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
