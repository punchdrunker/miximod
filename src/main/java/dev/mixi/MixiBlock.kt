package dev.mixi

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.util.ResourceLocation

object MixiBlock : Block(Material.ROCK) {

    init {
        unlocalizedName = "mixiblock"
        registryName = ResourceLocation(MixiMod.MOD_ID, "mixiblock")
    }
}