package com.mojang.minekart.com.mojang.minekart.core.inventory;

import com.mojang.minekart.com.mojang.minekart.core.ItemStack;

public interface Container {
    int getContainerSize();
    boolean isEmpty();
    ItemStack getItem(int slot);
    void setItem(int slot, ItemStack itemStack);
}
