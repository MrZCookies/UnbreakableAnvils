package com.mrzcookie.unbreakableanvils;

import com.destroystokyo.paper.event.block.AnvilDamagedEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class UnbreakableAnvilsPlugin extends JavaPlugin implements Listener {
    public static UnbreakableAnvilsPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        Bukkit.getLogger().log(Level.INFO, "[UnbreakableAnvils] UnbreakableAnvils Enabled!");

        getServer().getPluginManager().registerEvents(this, plugin);
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().log(Level.INFO, "[UnbreakableAnvils] UnbreakableAnvils Disabled!");
    }

    @EventHandler
    public void onAnvilDamage(AnvilDamagedEvent event) {
        event.setCancelled(true);
    }
}
