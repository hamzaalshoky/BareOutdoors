package net.kale.bareoutdoors.item;

import net.kale.bareoutdoors.BareOutdoors;
import net.kale.bareoutdoors.entity.ModEntityTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BareOutdoors.MOD_ID);

    public static final RegistryObject<Item> NEWT_SPAWN_EGG = ITEMS.register("newt_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.NEWT,5982784, 4797748,
                    new Item.Properties().tab(ModCreativeModeTabs.BARE_OUTDOORS_TAB)));

    public static final RegistryObject<Item> NEWT_BUCKET = ITEMS.register("newt_bucket",
            () -> new MobBucketItem(ModEntityTypes.NEWT, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
                    (new Item.Properties()).stacksTo(1).tab(ModCreativeModeTabs.BARE_OUTDOORS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
