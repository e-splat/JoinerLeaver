package net.esplat.joinerleaver;

import net.esplat.joinerleaver.events.PlayerListener;
import net.esplat.joinerleaver.commands.reloadCommand;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    private static Main instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        System.out.println("Stopped JoinerLeaver, see you on next startup!");

        getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
        getCommand("jlreload").setExecutor(new reloadCommand(this));

        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Stopped JoinerLeaver, see you on next startup!");


    }

    public static Main getInstance() {
        return instance;
    }
}
