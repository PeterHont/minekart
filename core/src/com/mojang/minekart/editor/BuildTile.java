package com.mojang.minekart.editor;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mojang.minekart.com.mojang.minekart.core.ItemStack;
/*
    Shows a single tile square, which can contain a block/item.
 */
public class BuildTile extends Actor {
    public final static int TILE_SIZE = 64;
    private Texture gridSquareTexture;
    private Texture itemTexture;


    public BuildTile(final ItemStack itemStack) {
        gridSquareTexture = new Texture("square.png");
        itemTexture = new Texture(itemStack.item.getTextureName());
        setWidth(TILE_SIZE);
        setHeight(TILE_SIZE);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        TextureRegion region = new TextureRegion(gridSquareTexture);
        TextureRegion region2= new TextureRegion(itemTexture);

        batch.draw(region, getX(), getY(), getOriginX(), getOriginY(),
                getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());

        batch.draw(region2, getX(), getY(), getOriginX(), getOriginY(),
                getWidth(), getHeight(), getScaleX() * 0.9f, getScaleY() * 0.9f, getRotation());
    }

}
