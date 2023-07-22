package dev.finny.teleportbow.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import dev.finny.teleportbow.utils.BowUtils;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;

public class GiveCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p) {
            if (args.length == 0) {
                ItemStack bow = BowUtils.createTeleportBow();
                p.getInventory().addItem(bow);
                p.getInventory().addItem(new ItemStack(Material.ARROW, 1));

                p.sendMessage(Component.text("You have recieved a teleport bow!!!"));
            } else {
                Player target = Bukkit.getPlayerExact(args[0]);

                if (target == null) {
                    p.sendMessage(Component.text("This player does not exist.", TextColor.color(255, 0, 0)));
                    return true;
                }

                ItemStack bow = BowUtils.createTeleportBow();
                target.getInventory().addItem(bow);
                target.getInventory().addItem(new ItemStack(Material.ARROW, 1));

                target.sendMessage(Component.text("You have recieved a teleport bow!!!"));
            }
        }
        return true;
    }
}
