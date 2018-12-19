package com.mojang.minekart.com.mojang.minekart.core;

public final class ItemStack {
    public static final ItemStack EMPTY = new ItemStack(Items.TEST_ITEM_PLS_IGNORE);

    public int count;
    public final Item item;

    public ItemStack(final Itemable item) {
        this(item, 1);
    }

    public ItemStack(final Itemable item, final int count) {
        this.item = item == null ? null : item.asItem();
        this.count = count;
    }

    /** Helper to not deal with nulls */
    public static ItemStack get(final ItemStack itemStack) {
        return itemStack == null ? EMPTY : itemStack;
    }
}
