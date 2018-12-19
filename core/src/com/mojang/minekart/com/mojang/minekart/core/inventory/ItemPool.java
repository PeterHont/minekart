package com.mojang.minekart.com.mojang.minekart.core.inventory;

import com.mojang.minekart.com.mojang.minekart.core.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ItemPool implements Container {
    private final List<ItemStack> items = new ArrayList<>(getContainerSize());

    public ItemPool() {
        for (int i = 0; i < getContainerSize(); i++) {
            items.add(ItemStack.EMPTY);
        }
    }

    @Override
    public int getContainerSize() {
        return 4;
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public ItemStack getItem(final int slot) {
        return ItemStack.get(items.get(slot));
    }

    @Override
    public void setItem(final int slot, final ItemStack itemStack) {
        items.set(slot, ItemStack.get(itemStack));
    }
}
