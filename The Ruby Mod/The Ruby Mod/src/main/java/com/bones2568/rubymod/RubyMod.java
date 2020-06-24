package com.bones2568.rubymod;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bones2568.rubymod.init.HorsearmorInit;
import com.bones2568.rubymod.world.gen.Rubyore;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("rubymod")
@Mod.EventBusSubscriber(modid = RubyMod.MODID, bus = Bus.MOD)
public class RubyMod
{
    public static final String MODID = "rubymod";
    public static final Logger LOGGER = LogManager.getLogger();
    public static RubyMod instance;

    public RubyMod()  {
    final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
	modEventBus.addListener(this::setup);
    
	HorsearmorInit.ITEMS.register(modEventBus);
    
    {
    	
    	@SuppressWarnings("unused")
		final IEventBus modEventBus1 = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
       

         instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }}

    private void setup(final FMLCommonSetupEvent event)
    {

        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @SuppressWarnings("resource")
	private void doClientStuff(final FMLClientSetupEvent event) {
  
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }
    
    @SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event1)  {
    	Rubyore.generateOre();
    
    }
			
	 @SubscribeEvent
	    public void onServerStarting(FMLServerStartingEvent event) {}
	   
		public static class RubyModModItemGroup extends ItemGroup
				   
		{      public static final RubyModModItemGroup instance = new RubyModModItemGroup(ItemGroup.GROUPS.length, "rubymoditemgroup");
			   private RubyModModItemGroup (int index, String label)
			   {
				  super(index, label);
			   }
			        
			   public ItemStack createIcon()
			   {
			      return new ItemStack(com.bones2568.rubymod.init.BlockInit.rubyblock);
			   }	
			   
			   {
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD) class RegistryEvents {
        @SubscribeEvent
        public void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
         
            LOGGER.info("HELLO from Register Block");
        
    
        }}}}}
