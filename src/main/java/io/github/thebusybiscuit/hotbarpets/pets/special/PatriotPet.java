package io.github.thebusybiscuit.hotbarpets.pets.special;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.thebusybiscuit.hotbarpets.SimpleBasePet;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

public class PatriotPet extends SimpleBasePet {

    public PatriotPet(Category category, SlimefunItemStack item, ItemStack food, ItemStack[] recipe) {
        super(category, item, food, recipe);
    }

    @Override
    public void onUseItem(Player p) {
        p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 200, 0));
        p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0));
        p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 0));
        p.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 100, 0));
        p.getWorld().playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_CONVERTED_TO_DROWNED, 1.0F, 2.0F);
    }

}
