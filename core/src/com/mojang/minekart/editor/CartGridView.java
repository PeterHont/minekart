package com.mojang.minekart.editor;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;

/**
    Shows the 3x2 grid where you can place stuff on your cart
 */
public class CartGridView extends Group {
    private final int gridCols = 3;
    private final int gridRows = 2;

    public CartGridView() {
        addActor(new CartTileView());
    }


}
