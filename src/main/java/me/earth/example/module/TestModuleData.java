package me.earth.example.module;

import me.earth.earthhack.api.module.data.DefaultData;

final class TestModuleData extends DefaultData<TestModule>
{
    public TestModuleData(TestModule module) {
        super(module);
    }

    @Override
    public int getColor() {
        return 0xffffffff;
    }

    @Override
    public String getDescription() {
        return ": ^) ";
    }

}