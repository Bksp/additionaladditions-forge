package dqu.additionaladditions.material;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.Locale;

public class GildedNetheriteArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = {529, 610, 651, 447};
    private static final int[] PROTECTION_VALUES = {3, 6, 8, 3};
    public static final String NAME = "gilded_netherite";

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getIndex()];
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getIndex()];
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.NETHERITE_INGOT);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public float getToughness() {
        return 3.5F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.1F;
    }

    @Override
    public int getEnchantmentValue() {
        return 20;
    }

    @Override
    public String toString() {
        return NAME.toUpperCase(Locale.ROOT);
    }
}
