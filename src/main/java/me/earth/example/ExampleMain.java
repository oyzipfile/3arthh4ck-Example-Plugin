package me.earth.example;

import me.earth.earthhack.api.plugin.Plugin;
import me.earth.earthhack.api.register.exception.AlreadyRegisteredException;
import me.earth.earthhack.impl.managers.Managers;
import me.earth.example.module.TestModule;

@SuppressWarnings("unused")
public class ExampleMain implements Plugin
{
    @Override
    public void load()
    {
        try {

            Managers.MODULES.register(new TestModule());

        }
        catch (AlreadyRegisteredException e) { e.printStackTrace(); }
    }
}
