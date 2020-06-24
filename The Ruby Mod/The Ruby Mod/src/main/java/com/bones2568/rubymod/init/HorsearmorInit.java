package com.bones2568.rubymod.init;

import com.bones2568.rubymod.RubyMod;
import com.bones2568.rubymod.RubyMod.RubyModModItemGroup;

import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class HorsearmorInit 
{   
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			RubyMod.MODID);
	
	
	
	public static final RegistryObject<Item> HORSE_ARMOR = ITEMS.register("horse_armor",() -> new Item(new Item.Properties()));

	public static final RegistryObject<Item> HORSE_ARMOR_RUBY = ITEMS.register("horse_armor_ruby",
	        () -> new HorseArmorItem(12, new ResourceLocation(RubyMod.MODID, "textures/entity/horse/armor/horse_armor_ruby.png"), (new Item.Properties()).maxStackSize(1).group(RubyModModItemGroup.instance)));






	








}