package inferioraccretionteam.inferioraccretion.entity.client;

import inferioraccretionteam.inferioraccretion.entity.custom.UndeadHog;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class UndeadHogRenderer extends MobRenderer<UndeadHog, UndeadHogModel<UndeadHog>> {
    private static final ResourceLocation UNDEADHOG_LOCATION = new ResourceLocation("inferioraccretion:textures/entity/undead_hog/undead_hog.png");

    public UndeadHogRenderer(EntityRendererProvider.Context p_174454_) {
        super(p_174454_, new UndeadHogModel<>(p_174454_.bakeLayer(UndeadHogModel.LAYER_LOCATION)), 0.7F);
    }

    @Override
    @SuppressWarnings("NullableProblems")
    public ResourceLocation getTextureLocation(UndeadHog pEntity) {
        return UNDEADHOG_LOCATION;
    }
}