package net.kale.bareoutdoors.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.kale.bareoutdoors.BareOutdoors;
import net.kale.bareoutdoors.entity.custom.NewtEntity;
import net.kale.bareoutdoors.entity.variant.NewtVariant;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class NewtRenderer extends GeoEntityRenderer<NewtEntity> {
    public static final Map<NewtVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(NewtVariant.class), (p_114874_) -> {
                p_114874_.put(NewtVariant.EASTERN,
                        new ResourceLocation(BareOutdoors.MOD_ID, "textures/entity/newt/eastern_newt.png"));
                p_114874_.put(NewtVariant.ANDERSONS_CROCODILE,
                        new ResourceLocation(BareOutdoors.MOD_ID, "textures/entity/newt/anderson_crocodile_newt.png"));
                p_114874_.put(NewtVariant.FIRE_BELLY,
                        new ResourceLocation(BareOutdoors.MOD_ID, "textures/entity/newt/fire_belly_newt.png"));
                p_114874_.put(NewtVariant.CRESTED,
                        new ResourceLocation(BareOutdoors.MOD_ID, "textures/entity/newt/crested_newt.png"));
            });

    public NewtRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new NewtModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(NewtEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }


    @Override
    public RenderType getRenderType(NewtEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
            stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
