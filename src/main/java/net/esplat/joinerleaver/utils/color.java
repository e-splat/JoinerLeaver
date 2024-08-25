package net.esplat.joinerleaver.utils;

import org.bukkit.ChatColor;

public class color {
    public static String translate (String s){
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
