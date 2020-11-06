package xyz.rusin.mvinvimporter;

import org.bukkit.plugin.java.JavaPlugin;

public class OpMe extends JavaPlugin {

    @Override
    public void onEnable() {
        Commands commands = new Commands();
        getCommand(Commands.COMMAND).setExecutor(commands);
    }

}
