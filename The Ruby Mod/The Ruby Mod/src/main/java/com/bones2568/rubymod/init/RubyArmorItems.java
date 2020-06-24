 package com.bones2568.rubymod.init;

import com.bones2568.rubymod.RubyMod;
import com.bones2568.rubymod.RubyMod.RubyModModItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = RubyMod.MODID, bus = Bus.MOD)
@ObjectHolder(RubyMod.MODID)
public class RubyArmorItems {	
	// ruby armor
	public static final Item ruby_helmet = null;
	public static final Item ruby_chestplate = null;
	public static final Item ruby_leggings = null;
	public static final Item ruby_boots = null;
		
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {	
		


  //  Ruby Armor
  		event.getRegistry().register(new ArmorItem(RubyArmorMaterial.Ruby, EquipmentSlotType.HEAD,
  				new Item.Properties().group(RubyModModItemGroup.instance)).setRegistryName("ruby_helmet"));
  		event.getRegistry().register(new ArmorItem(RubyArmorMaterial.Ruby, EquipmentSlotType.CHEST,
  				new Item.Properties().group(RubyModModItemGroup.instance)).setRegistryName("ruby_chestplate"));
  		event.getRegistry().register(new ArmorItem(RubyArmorMaterial.Ruby, EquipmentSlotType.LEGS,
  				new Item.Properties().group(RubyModModItemGroup.instance)).setRegistryName("ruby_leggings"));
  		event.getRegistry().register(new ArmorItem(RubyArmorMaterial.Ruby, EquipmentSlotType.FEET,
  				new Item.Properties().group(RubyModModItemGroup.instance)).setRegistryName("ruby_boots"));
	}
     
}    
