package dev.mixi

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.util.ResourceLocation

object KotlinBlock : Block(Material.ROCK) {

    init {
        unlocalizedName = "kotlinblock"
        registryName = ResourceLocation(MixiMod.MOD_ID, "kotlinblock")
    }
}

// reference https://suppergerrie2.com/minecraft-1-12-modding-with-forge-4-custom-block/