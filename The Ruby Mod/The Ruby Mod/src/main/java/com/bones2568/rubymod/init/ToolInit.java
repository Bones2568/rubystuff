 package com.bones2568.rubymod.init;

import com.bones2568.rubymod.RubyMod;
import com.bones2568.rubymod.RubyMod.RubyModModItemGroup;

import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;


@Mod.EventBusSubscriber(modid = RubyMod.MODID, bus = Bus.MOD)
@ObjectHolder(RubyMod.MODID)
public class ToolInit {	
	//armor
		public static final Item ruby_axe = null;
		public static final Item ruby_sword = null;
		public static final Item ruby_pickaxe = null;
		public static final Item ruby_hoe = null;
		public static final Item ruby_shovel = null;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {	
		
		// Ruby Tools
		     event.getRegistry().register(new SwordItem(RubyItemTier.RUBY,  (int) 3.0f, -2.4F, new Item.Properties().group(RubyModModItemGroup.instance)).setRegistryName("ruby_sword")); 
		     event.getRegistry().register(new ShovelItem(RubyItemTier.RUBY, 3.0F, -2.4F, new Item.Properties().group(RubyModModItemGroup.instance)).setRegistryName("ruby_shovel")); 
		     event.getRegistry().register(new AxeItem(RubyItemTier.RUBY, 4.0f, -3.0f, new Item.Properties().group(RubyModModItemGroup.instance)).setRegistryName("ruby_axe")); 
		     event.getRegistry().register(new PickaxeItem(RubyItemTier.RUBY, (int) 2.5f, -2.4F, new Item.Properties().group(RubyModModItemGroup.instance)).setRegistryName("ruby_pickaxe")); 
		     event.getRegistry().register(new HoeItem(RubyItemTier.RUBY, 2, new Item.Properties().group(RubyModModItemGroup.instance)).setRegistryName("ruby_hoe"));

	}
     


               }