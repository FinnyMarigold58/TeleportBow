package dev.finny.teleportbow;

import org.bukkit.plugin.java.JavaPlugin;

import dev.finny.teleportbow.commands.GiveCommand;
import dev.finny.teleportbow.listeners.BowListener;

public class TeleportBow extends JavaPlugin {

    @Override
    public void onEnable(){
        System.out.println("HISHdiashdioashdoas");

        getCommand("givebow").setExecutor(new GiveCommand());  
        getServer().getPluginManager().registerEvents(new BowListener(), this);
    }
}