package net.remixrenegade.rebalanceddelight.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.remixrenegade.rebalanceddelight.RebalancedDelight;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RebalancedDelight.MOD_ID);

    public static final DeferredItem<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
