package com.bones2568.rubymod.init;

import java.util.function.Supplier;

import com.bones2568.rubymod.RubyMod;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

    enum RubyArmorMaterial implements IArmorMaterial
{
    Ruby("ruby", 45, new int[] {5, 8, 10, 5}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, () ->
    {
        return Ingredient.fromItems(ItemInit.ruby.getItem());
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {51, 53, 51, 55};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyValue<Ingredient> repairMaterial;

    private RubyArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn, int enchantabilityIn, SoundEvent equipSoundIn, float p_i48533_8_, Supplier<Ingredient> repairMaterialSupplier)
    {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountsIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = equipSoundIn;
        this.toughness = p_i48533_8_;
        this.repairMaterial = new LazyValue<>(repairMaterialSupplier);
    }

    public int getDurability(EquipmentSlotType slotIn)
    {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    public int getDamageReductionAmount(EquipmentSlotType slotIn)
    {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    public int getEnchantability()
    {
        return this.enchantability;
    }

    public SoundEvent getSoundEvent()
    {
        return this.soundEvent;
    }

    public Ingredient getRepairMaterial()
    {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName()
    {
        return RubyMod.MODID + ":" + this.name;
    }

    public float getToughness()
    {
        return this.toughness;
    }
}