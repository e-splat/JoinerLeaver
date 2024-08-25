package net.esplat.joinerleaver.events;

import net.esplat.joinerleaver.utils.color;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import net.esplat.joinerleaver.Main;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {

    private Main plugin;

    public PlayerListener (Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        event.setJoinMessage(null);
        Bukkit.broadcastMessage(color.translate(plugin.getConfig().getString("message.join")).replace("%player%", player.getName()));
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage(null);
        Bukkit.broadcastMessage(color.translate(plugin.getConfig().getString("message.leave")).replace("%player%", player.getName()));
    }
}
