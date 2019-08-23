package dev.mixi

import net.minecraft.item.Item
import net.minecraft.util.ResourceLocation

object MiteneRod: Item() {
    init {
        maxStackSize = 1
        unlocalizedName = "mitenerod"
        registryName = ResourceLocation(MixiMod.MOD_ID, "mitenerod")
    }
}