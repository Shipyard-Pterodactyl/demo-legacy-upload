package demo.legacy;

import org.bukkit.plugin.java.JavaPlugin;

public final class DemoLegacy extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("DemoLegacy " + getPluginMeta().getVersion() + " enabled");
    }
}
