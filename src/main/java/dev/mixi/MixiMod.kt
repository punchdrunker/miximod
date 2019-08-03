package dev.mixi

import net.minecraft.init.Blocks
import net.minecraft.item.Item
import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import org.apache.logging.log4j.Logger

@Mod(modid = MixiMod.MOD_ID, name = MixiMod.NAME, version = MixiMod.VERSION)
@Mod.EventBusSubscriber
class MixiMod {

    @EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        logger = event.getModLog()
    }

    @EventHandler
    fun init(event: FMLInitializationEvent) {
        // some example code
        logger!!.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName())
    }

    companion object {
        const val MOD_ID = "miximod"
        const val NAME = "Mixi Mod"
        const val VERSION = "1.0"

        private var logger: Logger? = null

        @JvmStatic
        @SubscribeEvent
        fun registerItems(e: RegistryEvent.Register<Item>) {
            logger?.info("register item")
        }

        @JvmStatic
        @SubscribeEvent
        fun registerModel(e: ModelRegistryEvent) {
            logger?.info("register model")
        }
    }
}
