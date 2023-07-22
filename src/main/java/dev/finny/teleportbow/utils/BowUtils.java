package dev.finny.teleportbow.utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;

public class BowUtils {
    public static ItemStack createTeleportBow() {

        ItemStack bow = new ItemStack(Material.BOW, 1);
        ItemMeta bowMeta = bow.getItemMeta();
        bowMeta.displayName(Component.text("Teleport Bow", TextColor.color(0, 255, 0), TextDecoration.BOLD));
        List<Component> lore = new ArrayList<>();
        lore.add(Component.text("Shoot your shot"));
        lore.add(Component.text("and teleport anywhere."));
        bowMeta.lore(lore);
        bowMeta.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
        bowMeta.setUnbreakable(true);
        bowMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        bow.setItemMeta(bowMeta);

        return bow;
    }
}
