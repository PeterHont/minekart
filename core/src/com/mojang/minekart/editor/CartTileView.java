package com.mojang.minekart.editor;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/*
    Shows a single tile in the build grid
 */
public class CartTileView extends Actor {
    private Texture gridSquareTexture;

    public CartTileView() {
        gridSquareTexture = new Texture("square.png");
        setWidth(32);
        setHeight(32);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        TextureRegion region = new TextureRegion(gridSquareTexture);

        batch.draw(region, getX(), getY(), getOriginX(), getOriginY(),
                getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
    }

}
