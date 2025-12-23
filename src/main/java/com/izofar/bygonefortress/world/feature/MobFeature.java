package com.izofar.bygonefortress.world.feature;

import com.izofar.bygonefortress.util.random.ModWeightedEntry;
import net.minecraft.core.BlockPos;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.phys.Vec3;

import java.util.function.Supplier;

public class MobFeature<T extends Mob> extends Feature<NoneFeatureConfiguration> {

	private final WeightedList<ModWeightedEntry<Supplier<EntityType<? extends T>>>> entityTypes;

	public MobFeature(WeightedList<ModWeightedEntry<Supplier<EntityType<? extends T>>>> entityTypes) {
		super(NoneFeatureConfiguration.CODEC);
		this.entityTypes = entityTypes;
	}
	
	public MobFeature(Supplier<EntityType<? extends T>> entityType) {
		super(NoneFeatureConfiguration.CODEC);
		this.entityTypes = WeightedList.of(new ModWeightedEntry<>(entityType, 1));
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		BlockPos position = context.origin().below();
		Mob entity = this.entityTypes.getRandom(context.random()).get().getData().get().create(context.level().getLevel(), EntitySpawnReason.STRUCTURE);
		if (entity == null)
			return false;
		entity.moveOrInterpolateTo(new Vec3((double) position.getX() + 0.5D, position.getY(), (double) position.getZ() + 0.5D), 0.0F, 0.0F);
		entity.finalizeSpawn(context.level(), context.level().getCurrentDifficultyAt(position), EntitySpawnReason.SPAWNER, null);
		entity.setPersistenceRequired();
		context.level().addFreshEntity(entity);
		return true;
	}

}
