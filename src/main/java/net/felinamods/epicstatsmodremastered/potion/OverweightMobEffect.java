
package net.felinamods.epicstatsmodremastered.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class OverweightMobEffect extends MobEffect {
	public OverweightMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
