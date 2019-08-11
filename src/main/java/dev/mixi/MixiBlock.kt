package dev.mixi

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.util.BlockRenderLayer
import net.minecraft.util.ResourceLocation
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly

class MixiBlock(material: Material) : Block(material){

    init {
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
        unlocalizedName = "mixiblock"
        registryName = ResourceLocation(MixiMod.MOD_ID, "mixiblock")
    }

    @SideOnly(Side.CLIENT)
    override fun getBlockLayer(): BlockRenderLayer {
        return BlockRenderLayer.SOLID
    }
}