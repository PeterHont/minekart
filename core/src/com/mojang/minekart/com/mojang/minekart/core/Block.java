package com.mojang.minekart.com.mojang.minekart.core;

public class Block implements Itemable {

    public float friction;

    public Block(final Properties properties) {
        friction = properties.friction;
    }

    public static class Properties {
        private float friction = 0.6f;

        public Properties setFriction(final float friction) {
            this.friction = friction;
            return this;
        }
    }

    @Override
    public Item asItem() {
        // TODO ItemBlock concept
        return null;
    }
}
