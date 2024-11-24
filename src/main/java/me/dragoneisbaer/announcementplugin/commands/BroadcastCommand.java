package me.dragoneisbaer.announcementplugin.commands;

import me.dragoneisbaer.announcementplugin.AnnouncementPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;


public class BroadcastCommand implements CommandExecutor {

    Plugin plugin = AnnouncementPlugin.getPlugin(AnnouncementPlugin.class);

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender.hasPermission("bc.broadcast")) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.DARK_RED + "You need to specify a Message.");
            } else {
                StringBuilder message = new StringBuilder();
                for (int i = 0; i < args.length; i++) {
                    message.append(args[i]).append(" ");
                }
                plugin.getServer().broadcastMessage(ChatColor.DARK_RED + (ChatColor.BOLD + "[BROADCAST] " ) + ChatColor.RESET + ChatColor.translateAlternateColorCodes('&', String.valueOf(message)));
            }
        }
        return true;
    }
}
