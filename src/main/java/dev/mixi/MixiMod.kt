package dev.mixi

import net.minecraft.block.Block
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.init.Blocks
import net.minecraft.init.Items
import net.minecraft.item.Item
import net.minecraft.item.ItemBlock
import net.minecraft.item.ItemStack
import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import org.apache.logging.log4j.Logger
import org.jline.utils.Log

@Mod(modid = MixiMod.MOD_ID, name = MixiMod.NAME, version = MixiMod.VERSION)
@Mod.EventBusSubscriber
class MixiMod {
    private lateinit var logger: Logger

    @EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        logger = event.modLog
    }

    @EventHandler
    fun init(event: FMLInitializationEvent) {
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.registryName)
    }

    companion object {
        const val MOD_ID = "miximod"
        const val NAME = "Mixi Mod"
        const val VERSION = "1.0"

        @JvmStatic
        @SubscribeEvent
        fun registerItems(event: RegistryEvent.Register<Item>) {
            val tab: CreativeTabs = object : CreativeTabs("mitenerod") {
                override fun getTabIconItem(): ItemStack {
                    return ItemStack(Items.APPLE)
                }
            }

            event.registry.registerAll(
                    MiteneRod.setCreativeTab(tab),
                    ItemBlock(MixiBlock.setCreativeTab(tab))
                            .setRegistryName(MixiBlock.registryName),
                    ItemBlock(KotlinBlock.setCreativeTab(tab))
                            .setRegistryName(KotlinBlock.registryName)

            )
        }

        @JvmStatic
        @SubscribeEvent
        fun registerModel(event: ModelRegistryEvent) {
            ModelLoader.setCustomModelResourceLocation(
                    MiteneRod,
                    0,
                    ModelResourceLocation(MiteneRod.registryName!!, "inventory")
            )
            ModelLoader.setCustomModelResourceLocation(
                    Item.getItemFromBlock(MixiBlock),
                    0,
                    ModelResourceLocation(MixiBlock.registryName!!, "inventory")
            )
            ModelLoader.setCustomModelResourceLocation(
                    Item.getItemFromBlock(KotlinBlock),
                    0,
                    ModelResourceLocation(KotlinBlock.registryName!!, "inventory")

            )
        }

        @JvmStatic
        @SubscribeEvent
        fun registerBlock(event: RegistryEvent.Register<Block>) {
            event.registry.registerAll(
                    MixiBlock,
                    KotlinBlock
            )
        }
    }
}
