package de.l4zs.l4utils

import net.axay.kspigot.chat.KColors
import net.axay.kspigot.main.KSpigot

class L4Utils : KSpigot() {

    override fun startup() {
        logger.info("${KColors.GREEN}The Plugin was successfully enabled!")
    }

    override fun shutdown() {
        logger.info("${KColors.RED}The Plugin was disabled!")
    }

}