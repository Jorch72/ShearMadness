package com.github.atomicblom.shearmadness.api;

import com.google.common.collect.Iterators;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.Iterator;

public class ItemStackHelper
{
    public static boolean isStackForBlock(ItemStack itemStack, Block block)
    {
        final Item item = itemStack.getItem();
        if (item instanceof ItemBlock) {
            if (((ItemBlock) item).block == block) {
                return true;
            }
        }
        return false;
    }

    public static Boolean isStackForBlock(ItemStack itemStack, Block block, int meta) {
        return isStackForBlock(itemStack, block) && itemStack.getItemDamage() == meta;
    }

    public static boolean isStackForBlock(ItemStack itemStack, Block... blocks) {
        return isStackForBlock(itemStack, Iterators.forArray(blocks));
    }

    private static boolean isStackForBlock(ItemStack itemStack, Iterator<Block> blocks) {
        final Item item = itemStack.getItem();
        if (item instanceof ItemBlock) {
            Block block = ((ItemBlock) item).block;
            while (blocks.hasNext()) {
                if (blocks.next() == block) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isStackForBlock(ItemStack itemStack, Iterable<Block> blocks) {
        return isStackForBlock(itemStack, blocks.iterator());
    }
}