package com.mojang.minekart.com.mojang.minekart.core.inventory;

import com.mojang.minekart.com.mojang.minekart.core.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class MinecartInventory implements Container {
    private final List<ItemStack> items = new ArrayList<>(getContainerSize());

    public MinecartInventory() {
        for (int i = 0; i < getContainerSize(); i++) {
            items.add(ItemStack.EMPTY);
        }
    }

    @Override
    public int getContainerSize() {
        return 6;
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public ItemStack getItem(final int slot) {
        if (items.contains(slot)) {
            return items.get(slot);
        }
        return ItemStack.EMPTY;
    }

    @Override
    public void setItem(final int slot, final ItemStack itemStack) {
        items.set(slot, ItemStack.get(itemStack));
    }
}
