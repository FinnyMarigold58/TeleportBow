package dev.finny.teleportbow.listeners;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;

public class BowListener implements Listener {
    @EventHandler
    public void onArrowLand(ProjectileHitEvent e) {

        if (e.getEntity().getShooter() instanceof Player p) {
            ItemStack itemInMainHand = p.getInventory().getItemInMainHand();
            if (itemInMainHand.getItemMeta().hasDisplayName()) {
                if (itemInMainHand.getItemMeta().displayName()
                        .equals(Component.text("Teleport Bow", TextColor.color(0, 255, 0), TextDecoration.BOLD))) {
                    Location location = e.getEntity().getLocation();

                    p.teleport(location);
                    e.getEntity().remove();
                    p.sendMessage(Component.text("TADA YOU TELEPORTED"));
                }
            }
        }

    }
}
