package me.earth.example.module;

import me.earth.earthhack.impl.event.events.misc.TickEvent;
import me.earth.earthhack.impl.event.listeners.ModuleListener;
import me.earth.earthhack.impl.util.text.ChatUtil;

final class ListenerTick extends ModuleListener<TestModule, TickEvent>
{
    public ListenerTick(TestModule module)
    {
        super(module, TickEvent.class);
    }

    @Override
    public void invoke(TickEvent event) {
        if (mc.player == null || mc.world == null) return;

        ChatUtil.sendMessage(String.format("Test shit! %s (Pig is Pig)", module.sl.getValue()));

        if (mc.player.onGround)
            mc.player.motionY = 0.4;

    }

}