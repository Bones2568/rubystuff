package com.bones2568.rubymod.init;

import com.bones2568.rubymod.RubyMod;
import com.bones2568.rubymod.RubyMod.RubyModModItemGroup;
import com.bones2568.rubymod.objects.blocks.CustonOreBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(RubyMod.MODID)
@Mod.EventBusSubscriber(modid = RubyMod.MODID, bus = Bus.MOD)
public class BlockInit 
{
public static final Block rubyblock = null;
public static final Block rubyore = null;


	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) 
	{		           
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6.0f).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName("rubyblock"));
		event.getRegistry().register(new CustonOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(4f, 6.0f).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("rubyore")); 
	}
		
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) 
	{	
		event.getRegistry().register(new BlockItem(rubyblock, new Item.Properties().maxStackSize(64).group(RubyModModItemGroup.instance)).setRegistryName("rubyblock"));
		event.getRegistry().register(new BlockItem(rubyore, new Item.Properties().maxStackSize(64).group(RubyModModItemGroup.instance)).setRegistryName("rubyore"));	
	}

	public static boolean rubyore() {
		// TODO Auto-generated method stub
		return false;
	}}
