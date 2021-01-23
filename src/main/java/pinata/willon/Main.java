package pinata.willon;

import org.bukkit.plugin.java.JavaPlugin;
import pinata.willon.commands.Pinata;
import pinata.willon.utils.Settings;

public final class Main extends JavaPlugin {

    public static Main instance;
    Settings settings = new Settings();

    @Override
    public void onEnable() {
        instance = this;
        settings.loadYml();
        getCommand("pinata").setExecutor(new Pinata());
    }

    @Override
    public void onDisable() {
    }

    public static Main getInstance() {
        return instance;
    }
}
