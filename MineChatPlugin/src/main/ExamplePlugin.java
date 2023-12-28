package main;

import de.minetrain.minechat.main.Main;
import de.minetrain.minechat.utils.plugins.MinePlugin;

public class ExamplePlugin implements MinePlugin{
	
    @Override
    public void load() {
    	System.err.println("Plugin loadet!");
    	Main.getEventManager().addListener(new EventExample());
    }

    @Override
    public void stop() {
        // Implement stop logic for plugin shutdown
    }

    @Override
    public void reload() {
        // Implement reload logic for plugin reload
    }
}