package net.felinamods.epicstatsmodremastered.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class Stat6ConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> STAT_6_T;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_6_NAME;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_6_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_6_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT6_MAX;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_6_DEFAULT;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_6_E1_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_6_E1_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_6_E1_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_6_E1_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_6_E2_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_6_E2_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_6_E2_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_6_E2_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_6_E3_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_6_E3_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_6_E3_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_6_E3_MAX;
	static {
		BUILDER.push("Stat 6");
		STAT_6_T = BUILDER.comment("Defines if the stat is on or off").define("Stat 6", true);
		STAT_6_NAME = BUILDER.comment("Defines which name do you want to use for this stat in the menu").define("Stat 6 Name ", "Dexterity");
		STAT_6_ID = BUILDER.comment("Defines the ID of the attribute, example: minecraft:generic.attack_speed").define("Stat 6 ID", "minecraft:generic.attack_speed");
		STAT_6_V = BUILDER.comment("The value added to the attribute per level").define("Stat 6 Value", (double) 0.1);
		STAT6_MAX = BUILDER.define("Stat 6 Max", (double) 3);
		BUILDER.pop();
		BUILDER.push("Misc");
		STAT_6_DEFAULT = BUILDER.define("Stat 6 Default", (double) 3.5);
		BUILDER.pop();
		BUILDER.push("Extra 1");
		STAT_6_E1_ID = BUILDER.define("Stat 6 Extra 1 ID", "aaaa:ff");
		STAT_6_E1_V = BUILDER.define("Stat 6 Extra 1 Value", (double) 4);
		STAT_6_E1_LVLREQ = BUILDER.define("Stat 6 Extra 1 LVL Req", (double) 1);
		STAT_6_E1_MAX = BUILDER.define("Stat 6 Extra 1 Max", (double) 44);
		BUILDER.pop();
		BUILDER.push("Extra 2");
		STAT_6_E2_ID = BUILDER.define("Stat 6 Extra 2 ID", "aaa:ddd");
		STAT_6_E2_V = BUILDER.define("Stat 6 Extra 2 Value", (double) 3);
		STAT_6_E2_LVLREQ = BUILDER.define("Stat 6 Extra 2 LVL Req", (double) 4);
		STAT_6_E2_MAX = BUILDER.define("Stat 6 Extra 2 Max", (double) 33);
		BUILDER.pop();
		BUILDER.push("Extra 3");
		STAT_6_E3_ID = BUILDER.define("Stat 6 Extra 3 ID", "aaaa:dd");
		STAT_6_E3_V = BUILDER.define("Stat 6 Extra 3 Value", (double) 33);
		STAT_6_E3_LVLREQ = BUILDER.define("Stat 6 Extra 3 LVL Req", (double) 4);
		STAT_6_E3_MAX = BUILDER.define("Stat 6 Extra 3 Max", (double) 4);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
