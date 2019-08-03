package dev.mixi

import net.minecraft.item.Item
import net.minecraft.util.ResourceLocation

object MiteneRod: Item() {
    init {
        this.maxStackSize = 1
        this.unlocalizedName = "mitenerod"
        this.registryName = ResourceLocation(MixiMod.MOD_ID, "mitenerod")
    }
}