package com.ivan_van.rpgmeoremvitem.item;

import com.ivan_van.rpgmeoremvitem.RPGmeoremvitem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RPGmeoremvitem.MOD_ID);

    public static final RegistryObject<Item> LOST_FETTER = ITEMS.register("lostfetter",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
