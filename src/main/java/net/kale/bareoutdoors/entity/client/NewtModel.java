package net.kale.bareoutdoors.entity.client;

import net.kale.bareoutdoors.BareOutdoors;
import net.kale.bareoutdoors.entity.custom.NewtEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NewtModel extends AnimatedGeoModel<NewtEntity> {
    @Override
    public ResourceLocation getModelLocation(NewtEntity object) {
        return new ResourceLocation(BareOutdoors.MOD_ID, "geo/newt.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(NewtEntity object) {
        return NewtRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(NewtEntity animatable) {
        return new ResourceLocation(BareOutdoors.MOD_ID, "animations/newt.animation.json");
    }
}
