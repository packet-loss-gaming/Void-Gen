package gg.packetloss.voidgen;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class VoidGen extends JavaPlugin {
    private Logger logger;

    @Override
    public void onEnable() {
        logger = getLogger();
        logger.info("Enabled!");

    }

    @Override
    public void onDisable() {
        logger.info("Disabled.");
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String uid) {
        return new VoidGenTerrainGenerator();
    }
}
