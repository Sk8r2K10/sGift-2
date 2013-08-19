package me.Sk8r2K10.sgift2;

import me.Sk8r2K10.sgift2.util.GiftCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class sGift2 extends JavaPlugin {

    public static final String PREFIX = ChatColor.GRAY + "[" + ChatColor.YELLOW + "sGift 2" + ChatColor.GRAY + "] " + ChatColor.RESET;
    public final GiftCommand giftCommand = new GiftCommand(this);

    public void onDisable() {

    }

    public void onEnable() {
        getCommand("gift").setExecutor(giftCommand);
    }
}
