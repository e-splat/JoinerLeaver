package net.esplat.joinerleaver.commands;

import net.esplat.joinerleaver.Main;
import net.esplat.joinerleaver.utils.color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class reloadCommand implements CommandExecutor {

    private final Main plugin;

    public reloadCommand(Main plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender.hasPermission("reload.use")) {
            Main.getInstance().reloadConfig();
            sender.sendMessage(color.translate(plugin.getConfig().getString("message.success-reload")));
        } else {

            sender.sendMessage(color.translate (plugin.getConfig().getString("message.no-permission")));
        }
        return false;
    }
}
