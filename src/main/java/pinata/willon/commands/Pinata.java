package pinata.willon.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pinata.willon.utils.Settings;

public class Pinata implements CommandExecutor {

    private Settings settings = new Settings();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (args[0].equalsIgnoreCase("set")) {
                if (args.length == 0){
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&',
                            settings.getSettingsConfiguration().getString("message.admin.set")
                    ));
                    return true;
                }
                Location loc = p.getLocation();
                p.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        settings.getSettingsConfiguration().getString("message.admin.set")
                                + " "
                                + loc.getX()
                                + " "
                                + loc.getY()
                                + " "
                                + loc.getZ()
                ));
            }
        } else {
            Bukkit.getConsoleSender().sendMessage("§cEzt a parancsot csak játékos használhatja!");
        }
        return false;
    }
}
