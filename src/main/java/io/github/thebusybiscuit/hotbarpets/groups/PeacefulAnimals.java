package io.github.thebusybiscuit.hotbarpets.groups;

import io.github.thebusybiscuit.hotbarpets.PetTexture;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.hotbarpets.HotbarPet;
import io.github.thebusybiscuit.hotbarpets.HotbarPets;
import io.github.thebusybiscuit.hotbarpets.PetGroup;
import io.github.thebusybiscuit.hotbarpets.pets.DolphinPet;
import io.github.thebusybiscuit.hotbarpets.pets.RabbitPet;
import io.github.thebusybiscuit.hotbarpets.pets.SquidPet;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.mini2Dx.gettext.GetText;

public final class PeacefulAnimals implements PetGroup {

    public PeacefulAnimals(HotbarPets plugin) {
        load(plugin);
    }

    @Override
    public String getName() {
        return GetText.tr("&aAnimal (Peaceful)");
    }

    @Override
    public void load(HotbarPets plugin) {
        // @formatter:off
        new HotbarPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_FISH", PetTexture.FISH_PET.getHash(), GetText.tr("&3Fish Pet"), getName(), GetText.tr("&7Favourite Food: Seeds"), "", GetText.tr("&fGives you Fish over time...")), new ItemStack(Material.WHEAT_SEEDS), new ItemStack[] {
                new ItemStack(Material.IRON_INGOT), new ItemStack(Material.COD), new ItemStack(Material.IRON_INGOT),
                new ItemStack(Material.COD), new ItemStack(Material.DIAMOND), new ItemStack(Material.COD),
                new ItemStack(Material.WATER_BUCKET), SlimefunItems.GOLD_18K, new ItemStack(Material.WATER_BUCKET)
        }).register(plugin);

        new SquidPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_SQUID", PetTexture.SQUID_PET.getHash(), GetText.tr("&bSquid Pet"), getName(), GetText.tr("&7Favourite Food: Raw Cod"), "", GetText.tr("&fRight-Click: &7Gives you Water Breathing")), new ItemStack(Material.COD), new ItemStack[] {
                new ItemStack(Material.COAL), new ItemStack(Material.COD), new ItemStack(Material.COAL),
                new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.DIAMOND), new ItemStack(Material.WATER_BUCKET),
                new ItemStack(Material.COD), SlimefunItems.GOLD_16K, new ItemStack(Material.COD)
        }).register(plugin);

        new RabbitPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_RABBIT", PetTexture.RABBIT_PET.getHash(), GetText.tr("&eRabbit Pet"), getName(), GetText.tr("&7Favourite Food: Carrots"), "", GetText.tr("&fRight-Click: &7Gives you 30 seconds of Luck")), new ItemStack(Material.CARROT), new ItemStack[] {
                new ItemStack(Material.GOLDEN_CARROT), new ItemStack(Material.RABBIT_HIDE), new ItemStack(Material.GOLDEN_CARROT),
                new ItemStack(Material.RABBIT_HIDE), new ItemStack(Material.DIAMOND), new ItemStack(Material.RABBIT_HIDE),
                new ItemStack(Material.GOLDEN_CARROT), new ItemStack(Material.RABBIT_FOOT), new ItemStack(Material.GOLDEN_CARROT)
        }).register(plugin);

        new DolphinPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_DOLPHIN", PetTexture.DOLPHIN_PET.getHash(), GetText.tr("&bDolphin Pet"), getName(), GetText.tr("&7Favourite Food: Ink Sacks"), "", GetText.tr("&fRight-Click: &7Dolphin's Grace")), new ItemStack(Material.INK_SAC), new ItemStack[] {
                new ItemStack(Material.LAPIS_LAZULI), new ItemStack(Material.COD), new ItemStack(Material.LAPIS_LAZULI),
                new ItemStack(Material.SALMON), new ItemStack(Material.EMERALD), new ItemStack(Material.SALMON),
                new ItemStack(Material.LAPIS_LAZULI), new ItemStack(Material.COD), new ItemStack(Material.LAPIS_LAZULI)
        }).register(plugin);

        new HotbarPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_PANDA", PetTexture.PANDA_PET.getHash(), GetText.tr("&8Panda &fPet"), getName(),GetText.tr("&7Favorite Food: Bamboo"), "", GetText.tr("&fThis sleepy Panda protects you from Insomnia"), GetText.tr("&fPhantoms will no longer chase you at night")), new ItemStack(Material.BAMBOO), new ItemStack[] {
                new ItemStack(Material.BAMBOO), new ItemStack(Material.DIAMOND), new ItemStack(Material.BAMBOO),
                new ItemStack(Material.DIAMOND), new ItemStack(Material.EMERALD), new ItemStack(Material.DIAMOND),
                new ItemStack(Material.ACACIA_LEAVES), new ItemStack(Material.BAMBOO), new ItemStack(Material.ACACIA_LEAVES)
        }).register(plugin);
        // @formatter:on
    }
}
