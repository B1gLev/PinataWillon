package pinata.willon.utils;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import pinata.willon.Main;

import java.io.File;

public class Settings {

    private File settings;
    private FileConfiguration settingsConfiguration;

    public void loadYml(){
        settings = new File(Main.getInstance().getDataFolder(), "settings.yml");
        settingsConfiguration = YamlConfiguration.loadConfiguration(settings);
        if (!settings.exists()){
            Main.getInstance().saveResource("settings.yml", false);
        }
    }

    public FileConfiguration getSettingsConfiguration() {
        return settingsConfiguration;
    }

    public void setSettingsConfiguration(FileConfiguration settingsConfiguration) {
        this.settingsConfiguration = settingsConfiguration;
    }
}
