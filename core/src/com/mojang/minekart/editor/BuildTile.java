package com.mojang.minekart.editor;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/*
    Shows a single tile square, which can contain a block/item.
 */
public class BuildTile extends Actor {
    public final static int TILE_SIZE = 64;
    private Texture gridSquareTexture;


    public BuildTile() {
        gridSquareTexture = new Texture("square.png");
        setWidth(TILE_SIZE);
        setHeight(TILE_SIZE);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        TextureRegion region = new TextureRegion(gridSquareTexture);

        batch.draw(region, getX(), getY(), getOriginX(), getOriginY(),
                getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
    }

}
