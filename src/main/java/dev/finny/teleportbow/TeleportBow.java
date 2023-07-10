package dev.finny.teleportbow;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import dev.finny.teleportbow.commands.GiveCommand;
import dev.finny.teleportbow.listeners.BowListener;

public class TeleportBow extends JavaPlugin {
    public final Logger logger = getLogger();

    @Override
    public void onEnable(){
        logger.info("HISHdiashdioashdoas");

        getCommand("givebow").setExecutor(new GiveCommand());  
        getServer().getPluginManager().registerEvents(new BowListener(), this);
    }
}