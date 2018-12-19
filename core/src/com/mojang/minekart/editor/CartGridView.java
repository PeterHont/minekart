package com.mojang.minekart.editor;

import com.badlogic.gdx.scenes.scene2d.Group;

/**
    Shows the 3x2 grid where you can place stuff on your cart
 */
public class CartGridView extends Group {
    private final int gridCols = 3;
    private final int gridRows = 2;

    public CartGridView() {
        for (int row = 0; row < gridRows; ++row) {
            for (int col = 0; col < gridCols; ++col) {
                BuildTile tile = new BuildTile();
                tile.setPosition(col * BuildTile.TILE_SIZE, row * BuildTile.TILE_SIZE);
                addActor(tile);
            }
        }
    }


}
