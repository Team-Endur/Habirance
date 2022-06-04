package net.inferioraccretionteam.inferioraccretion.world.feature;

import net.inferioraccretionteam.inferioraccretion.InferiorAccretion;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModPlacedFeatures {

    //public static final Holder<PlacedFeature> ALABASTER_PLACED = PlacementUtils.register("alabaster_placed",
    //        ModConfiguredFeatures.ALABASTER, ModOrePlacement.alabasterPlacement());

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, InferiorAccretion.MOD_ID);

    public static final RegistryObject<PlacedFeature> ALABASTER_PLACED = PLACED_FEATURES.register("alabaster_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ALABASTER.getHolder().get(), ModOrePlacement.commonOrePlacement(10 ,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(0)))));

    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }

    /*
    public static final Holder<PlacedFeature> ALABASTER_PLACED = PlacementUtils.register("alabaster_placed",
            //Veins per chunk
            ModConfiguredFeatures.ALABASTER, ModOrePlacement.commonOrePlacement(10 ,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(0))));*/
}