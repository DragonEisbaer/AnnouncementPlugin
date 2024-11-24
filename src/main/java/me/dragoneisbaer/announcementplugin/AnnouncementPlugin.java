package me.dragoneisbaer.announcementplugin;

import me.dragoneisbaer.announcementplugin.commands.BroadcastCommand;
import me.dragoneisbaer.announcementplugin.events.WorldChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class AnnouncementPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().log(Level.INFO, "[AnnouncementPlugin] started.");
        getCommand("bc").setExecutor(new BroadcastCommand());
        getServer().getPluginManager().registerEvents(new WorldChangeEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().log(Level.INFO, "[AnnouncementPlugin] stopped.");
    }
}
