package com.rustik;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = rustikssecondmod.modId, name = rustikssecondmod.name, version = rustikssecondmod.version)
public class rustikssecondmod {
    public static final String modId = "rustikssecondmod";
    public static final String name = "Rustik's Second Mod";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static rustikssecondmod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
