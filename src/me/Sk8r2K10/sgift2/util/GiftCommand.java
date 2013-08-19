package me.Sk8r2K10.sgift2.util;

import me.Sk8r2K10.sgift2.sGift2;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiftCommand implements CommandExecutor {

    private sGift2 plugin;

    public GiftCommand(sGift2 inst) {
        this.plugin = inst;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = null;
        if (sender instanceof Player) {
            player = (Player)sender;
        }
        if (player == null) {
            sender.sendMessage(sGift2.PREFIX + ChatColor.RED + "You cannot send gifts as console!");
            return false;
        }

        if (label.equalsIgnoreCase("gift")) {
            if (args.length < 2) {
                player.sendMessage(sGift2.PREFIX + ChatColor.RED + "Invalid command usage.");
                this.help(player);
                return false;
            }
            if (args.length == 2) {
                //Item stuff (Item in hand, amount)
            }
            if (args.length == 3) {
                //Item stuff (Item defined, amount)
            }
        }
        return false;
    }

    private void help(Player player) {
        //help
    }
}
