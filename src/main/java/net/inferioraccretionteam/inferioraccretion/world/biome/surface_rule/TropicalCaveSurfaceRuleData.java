package net.inferioraccretionteam.inferioraccretion.world.biome.surface_rule;

import net.inferioraccretionteam.inferioraccretion.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;

public class TropicalCaveSurfaceRuleData {
    private static final SurfaceRules.RuleSource LIMESTONE = makeStateRule(ModBlocks.LIMESTONE.get());
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource RED_TERRACOTTA = makeStateRule(Blocks.RED_TERRACOTTA);
    private static final SurfaceRules.RuleSource BLUE_TERRACOTTA = makeStateRule(Blocks.BLUE_TERRACOTTA);

    public static SurfaceRules.RuleSource makeRules()
    {
        //SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        //SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return SurfaceRules.sequence(
                //SurfaceRules.ifTrue(SurfaceRules.isBiome(TestBiomes.HOT_RED), RED_TERRACOTTA),
                //SurfaceRules.ifTrue(SurfaceRules.isBiome(TestBiomes.COLD_BLUE), BLUE_TERRACOTTA),

                // Default to a grass and dirt surface
                //SurfaceRules.ifTrue(SurfaceRules.DEEP_UNDER_FLOOR, LIMESTONE),
                //SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, LIMESTONE)


        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block)
    {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
