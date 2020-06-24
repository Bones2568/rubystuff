 package com.bones2568.rubymod.init;

import com.bones2568.rubymod.RubyMod;
import com.bones2568.rubymod.RubyMod.RubyModModItemGroup;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = RubyMod.MODID, bus = Bus.MOD)
@ObjectHolder(RubyMod.MODID)
public class ItemInit {

	public static final Item ruby = null;
	public static final Item ruby_nugget = null;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {	
		
	 event.getRegistry().register(new Item(new Item.Properties().group(RubyModModItemGroup.instance)).setRegistryName("ruby"));
	 event.getRegistry().register(new Item(new Item.Properties().group(RubyModModItemGroup.instance)).setRegistryName("ruby_nugget"));	


	}
     


               }