package com.mojang.minekart.com.mojang.minekart.core;

public class Item implements Itemable {
    private static final int MAX_STACK_SIZE = 64;
    private int cooldown;
    private int maxStackSize;

    private String textureName;

    public Item(final Properties properties) {
        cooldown = properties.cooldown;
        maxStackSize = properties.maxStackSize;
        textureName = properties.textureName;
    }

    @Override
    public Item asItem() {
        return this;
    }

    public String getTextureName() {
        return textureName;
    }

    public static class Properties {
        private int maxStackSize = MAX_STACK_SIZE;
        private int cooldown = 1;
        private String textureName;

        public Properties setTextureName(final String name) {
            textureName = name;
            return this;
        }

        public Properties stacksTo(final int max) {
            maxStackSize = max;
            return this;
        }

        public Properties setCooldown(final int millis) {
            cooldown = millis;
            return this;
        }
    }
}
