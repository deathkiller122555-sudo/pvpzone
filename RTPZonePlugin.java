package me.yourname.rtpzone;

import org.bukkit.plugin.java.JavaPlugin;

public class RTPZonePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("RTPZone enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("RTPZone disabled!");
    }
}