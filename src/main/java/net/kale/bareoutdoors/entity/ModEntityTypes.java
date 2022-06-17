package net.kale.bareoutdoors.entity;

import net.kale.bareoutdoors.BareOutdoors;
import net.kale.bareoutdoors.entity.custom.NewtEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, BareOutdoors.MOD_ID);

    public static final RegistryObject<EntityType<NewtEntity>> NEWT = ENTITY_TYPES.register("newt",
            () -> EntityType.Builder.of(NewtEntity::new, MobCategory.CREATURE)
                    .sized(0.9f, 1.5f)
                    .build(new ResourceLocation(BareOutdoors.MOD_ID, "newt").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
