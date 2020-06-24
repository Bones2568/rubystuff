package com.bones2568.rubymod.objects.blocks;

import java.util.Random;

import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;

public class CustonOreBlock extends OreBlock {
	
	public CustonOreBlock(Properties properties) {
		super(properties);
	}
   
	@Override
	protected int getExperience(Random random) {
		return MathHelper.nextInt(random, 3, 7);
	}
}








