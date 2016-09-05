package com.github.atomicblom.shearmadness.utility;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public final class Reference
{
    public static final String MOD_ID = "shearmadness";
    public static final String MOD_NAME = "Shear Madness";
    public static final String VERSION = "@MOD_VERSION@";
    public static final CreativeTabs CreativeTab = CreativeTabs.BUILDING_BLOCKS;
    public static final String MOD_GUI_FACTORY = "com.github.atomicblom.shearmadness.configuration.client.ModGuiFactory";
    public static final String BEHAVIOUR_COMMENT = "Sets the behaviour when a sheep is sheared\n" +
            "* RevertSheep - will change the sheep back to a normal sheep (default).\n" +
            "* ChiselFarm  - will allow the sheep to produce chiseled blocks (warning, this currently allows duping ores).\n" +
            "* CannotShear - You cannot shear the sheep while chiseled.\n";
    public static final String ALLOW_REDSTONE_COMMENT = "Chiseled redstone sheep will trigger Redstone circuits.";
    public static final String ALLOW_GLOWSTONE_COMMENT = "Chiseled glowstone sheep will light up the area around them.\n" +
            "WARNING: testing shows this creates a lot of chunk recalculation. I do not recommend this option.";
    public static final String ALLOW_CACTUS_COMMENT = "Chiseled Cactus sheep will deal damage players and destroy items.";
    public static final String ALLOW_TNT_COMMENT = "Chiseled TNT Sheep will be explode if exposed to active redstone.";
    public static final String ALLOW_FIRE_DAMAGE_COMMENT = "Chiseled Magma sheep will deal fire damage when touched.";
    public static final String DEBUG_MODELS = "Models will be regenerated every frame drawn.";
    public static final java.lang.String DEBUG_INVISIBLE_BLOCKS = "Invisible Blocks will be shown in-game";

    private Reference() {}

    public static final class ModID {
        public static final String IMMERSIVE_ENGINEERING = "immersiveengineering";
    }

    public static final class Blocks {
        public static final String NORMAL_VARIANT = "normal";

        public static final ResourceLocation InvisibleRedstone = new ResourceLocation(MOD_ID, "invisibleRedstone");
        public static final ResourceLocation InvisibleGlowstone = new ResourceLocation(MOD_ID, "invisibleGlowstone");

        private Blocks() {}
    }

}
