package net.felinamods.epicstatsmodremastered.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class Stat2ConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> STAT_2_T;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_2_NAME;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_2_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_2_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT2_MAX;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_2_DEFAULT;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_2_E1_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_2_E1_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_2_E1_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_2_E1_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_2_E2_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_2_E2_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_2_E2_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_2_E2_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_2_E3_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_2_E3_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_2_E3_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_2_E3_MAX;
	static {
		BUILDER.push("Stat 2");
		STAT_2_T = BUILDER.comment("Defines if the stat is on or off").define("Stat 2", true);
		STAT_2_NAME = BUILDER.comment("Defines which name do you want to use for this stat in the menu").define("Stat 2 Name ", "Vitality");
		STAT_2_ID = BUILDER.comment("Defines the ID of the attribute, example: minecraft:generic.attack_speed").define("Stat 2 ID", "minecraft:generic.max_health");
		STAT_2_V = BUILDER.comment("The value added to the attribute per level").define("Stat 2 Value", (double) 0.5);
		STAT2_MAX = BUILDER.define("Stat 2 Max", (double) 100);
		BUILDER.pop();
		BUILDER.push("Misc");
		STAT_2_DEFAULT = BUILDER.define("Stat 2 Default Value", (double) 20);
		BUILDER.pop();
		BUILDER.push("Extra 1");
		STAT_2_E1_ID = BUILDER.define("Stat 2 Extra 1 ID", "aaa:aaa2");
		STAT_2_E1_V = BUILDER.define("Stat 2 Extra 1 Value", (double) 0.1);
		STAT_2_E1_LVLREQ = BUILDER.define("Stat 2 Extra 1 LVL Req", (double) 1);
		STAT_2_E1_MAX = BUILDER.define("Stat 2 Extra 1 Max", (double) 100);
		BUILDER.pop();
		BUILDER.push("Extra 2");
		STAT_2_E2_ID = BUILDER.define("Stat 2 Extra 2 ID", "aw:awa");
		STAT_2_E2_V = BUILDER.define("Stat 2 Extra 2 Value", (double) 0.8);
		STAT_2_E2_LVLREQ = BUILDER.define("Stat 2 Extra 2 LVL Req", (double) 1);
		STAT_2_E2_MAX = BUILDER.define("Stat 2 Extra 2 Max", (double) 3);
		BUILDER.pop();
		BUILDER.push("Extra 3");
		STAT_2_E3_ID = BUILDER.define("Stat 2 Extra 3 ID", "ada:aaaa");
		STAT_2_E3_V = BUILDER.define("Stat 2 Extra 3 Value", (double) 4);
		STAT_2_E3_LVLREQ = BUILDER.define("Stat 2 Extra 3 LVL Req", (double) 5);
		STAT_2_E3_MAX = BUILDER.define("Stat 2 Extra 3 Max", (double) 55);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
