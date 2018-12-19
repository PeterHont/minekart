package com.mojang.minekart.editor;

import com.badlogic.gdx.scenes.scene2d.Group;

/**
 * Shows a vertical column of tiles with items that you can drag into your cart
 */
public class ItemPoolView extends Group {
    private int howManySlots = 6;

    public ItemPoolView() {
        for (int row = 0; row < howManySlots; ++row) {
            BuildTile tile = new BuildTile();
            tile.setPosition(0, row * BuildTile.TILE_SIZE);
            addActor(tile);
        }
    }

}
