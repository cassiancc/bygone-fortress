package com.izofar.bygonefortress.util.random;


import net.minecraft.client.sounds.SoundEngine;
import net.minecraft.client.sounds.Weighted;
import net.minecraft.util.RandomSource;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.entity.ai.behavior.ShufflingList;

import java.util.Map;

public class ModWeightedEntry<T> implements Weighted<T> {

	private final T data;
    private final int weight;
	
    public ModWeightedEntry(T data, int weight) {
        this.data = data;
        this.weight = weight;
     }

     public T getData() {
        return this.data;
     }

     @Override
     public int getWeight() {
        return this.weight;
     }

    @Override
    public T getSound(RandomSource randomSource) {
        return null;
    }

    @Override
    public void preloadIfRequired(SoundEngine soundEngine) {

    }

}
