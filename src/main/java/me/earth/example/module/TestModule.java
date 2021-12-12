package me.earth.example.module;

import me.earth.earthhack.api.module.Module;
import me.earth.earthhack.api.module.util.Category;
import me.earth.earthhack.api.setting.Setting;
import me.earth.earthhack.api.setting.settings.NumberSetting;

import java.awt.*;

public class TestModule extends Module
{
    public TestModule()
    {
        super("ExampleModule", Category.Movement);
        this.listeners.add(new ListenerTick(this));
        this.setData(new TestModuleData(this));
    }

    protected final Setting<Integer> sl =
            register(new NumberSetting<>("slider", 16, 1, 16));

}