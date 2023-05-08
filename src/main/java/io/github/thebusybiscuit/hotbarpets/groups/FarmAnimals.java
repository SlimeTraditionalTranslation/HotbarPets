package io.github.thebusybiscuit.hotbarpets.groups;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.hotbarpets.HotbarPet;
import io.github.thebusybiscuit.hotbarpets.HotbarPets;
import io.github.thebusybiscuit.hotbarpets.PetGroup;
import io.github.thebusybiscuit.hotbarpets.PetTexture;
import io.github.thebusybiscuit.hotbarpets.pets.CowPet;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.mini2Dx.gettext.GetText;

public final class FarmAnimals implements PetGroup {

    public FarmAnimals(HotbarPets plugin) {
        load(plugin);
    }

    @Override
    public String getName() {
        return GetText.tr("&2Farm Animal (Peaceful)");
    }

    @Override
    public void load(HotbarPets plugin) {
        // @formatter:off
        SlimefunItemStack cow = new SlimefunItemStack("HOTBAR_PET_COW", PetTexture.COW_PET.getHash(), GetText.tr("&6Cow Pet"), getName(), GetText.tr("&7Favourite Food: Wheat"), "", GetText.tr("&fRight-Click: &7Removes negative Potion Effects"));

        new HotbarPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_PIG", PetTexture.PIG_PET.getHash(), GetText.tr("&dPig Pet"), getName(), GetText.tr("&7Favourite Food: Carrots"), "", GetText.tr("&fBonus Saturation when eating"), GetText.tr("&fAllows you to eat poisonous Food")), new ItemStack(Material.CARROT), new ItemStack[] {
                new ItemStack(Material.REDSTONE), new ItemStack(Material.CARROT), new ItemStack(Material.REDSTONE),
                new ItemStack(Material.PORKCHOP), new ItemStack(Material.DIAMOND), new ItemStack(Material.PORKCHOP),
                new ItemStack(Material.REDSTONE), SlimefunItems.GOLD_16K, new ItemStack(Material.REDSTONE)
        }).register(plugin);

        new HotbarPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_CHICKEN", PetTexture.CHICKEN_PET.getHash(), GetText.tr("&fChicken Pet"), getName(), GetText.tr("&7Favourite Food: Seeds"), "", GetText.tr("&fGives you Eggs over time...")), new ItemStack(Material.WHEAT_SEEDS), new ItemStack[] {
                new ItemStack(Material.REDSTONE), new ItemStack(Material.FEATHER), new ItemStack(Material.REDSTONE),
                new ItemStack(Material.COOKED_CHICKEN), new ItemStack(Material.DIAMOND), new ItemStack(Material.COOKED_CHICKEN),
                new ItemStack(Material.REDSTONE), SlimefunItems.GOLD_16K, new ItemStack(Material.REDSTONE)
        }).register(plugin);

        new HotbarPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_MOOSHROOM", PetTexture.MOOSHROOM_PET.getHash(), GetText.tr("&dMooshroom Pet"), getName(), GetText.tr("&7Favourite Food: Red Mushrooms"), "", GetText.tr("&fGives you Mushroom Stew over time...")), new ItemStack(Material.RED_MUSHROOM), new ItemStack[] {
                new ItemStack(Material.LAPIS_LAZULI), new ItemStack(Material.COOKED_BEEF), new ItemStack(Material.LAPIS_LAZULI),
                new ItemStack(Material.RED_MUSHROOM), new ItemStack(Material.DIAMOND), new ItemStack(Material.BROWN_MUSHROOM),
                new ItemStack(Material.LAPIS_LAZULI), SlimefunItems.GOLD_16K, new ItemStack(Material.LAPIS_LAZULI)
        }).register(plugin);

        new CowPet(plugin.getItemGroup(), cow, new ItemStack(Material.WHEAT), new ItemStack[] {
                new ItemStack(Material.COAL), new ItemStack(Material.WHEAT), new ItemStack(Material.COAL),
                new ItemStack(Material.COOKED_BEEF), new ItemStack(Material.DIAMOND), new ItemStack(Material.COOKED_BEEF),
                new ItemStack(Material.COAL), SlimefunItems.GOLD_16K, new ItemStack(Material.COAL)
        }).register(plugin);

        new HotbarPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_GOLDEN_COW", PetTexture.GOLDEN_COW_PET.getHash(), GetText.tr("&6Golden Cow Pet"), getName(), GetText.tr("&7Favourite Food: Golden Carrots"), "", GetText.tr("&fGives you Golden Ingots over time..."), GetText.tr("&f(That means you have a net gain of 1 golden nugget)")), new ItemStack(Material.GOLDEN_CARROT), new ItemStack[] {
                new ItemStack(Material.GOLDEN_CARROT), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GOLDEN_CARROT),
                new ItemStack(Material.GOLD_NUGGET), cow, new ItemStack(Material.GOLD_NUGGET),
                new ItemStack(Material.GOLDEN_CARROT), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GOLDEN_CARROT)
        }).register(plugin);
        // @formatter:on
    }

}
