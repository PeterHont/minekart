package com.mojang.minekart.editor;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.mojang.minekart.com.mojang.minekart.core.ItemStack;
import com.mojang.minekart.com.mojang.minekart.core.Items;
import com.mojang.minekart.com.mojang.minekart.core.inventory.ItemPool;

/**
 * Shows a vertical column of tiles with items that you can drag into your cart
 */
public class ItemPoolView extends Group {
    private ItemPool itemPool;

    public ItemPoolView() {
        itemPool = new ItemPool();
        initPool();
        for (int row = 0; row < itemPool.getContainerSize(); ++row) {
            BuildTile tile = new BuildTile(itemPool.getItem(row));
            tile.setPosition(0, row * BuildTile.TILE_SIZE);
            addActor(tile);
        }
    }

    private void initPool() {
        for (int i = 0; i < itemPool.getContainerSize(); i++) {
            itemPool.setItem(i, new ItemStack(Items.TEST_ITEM_PLS_IGNORE));
        }
    }

}
