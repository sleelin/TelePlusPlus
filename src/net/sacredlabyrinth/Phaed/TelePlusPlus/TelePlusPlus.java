package net.sacredlabyrinth.Phaed.TelePlusPlus;

import java.util.logging.Logger;

import net.sacredlabyrinth.Phaed.TelePlusPlus.listeners.TPBlockListener;
import net.sacredlabyrinth.Phaed.TelePlusPlus.listeners.TPPlayerListener;
import net.sacredlabyrinth.Phaed.TelePlusPlus.listeners.TPEntityListener;
import net.sacredlabyrinth.Phaed.TelePlusPlus.managers.PermissionsManager;
import net.sacredlabyrinth.Phaed.TelePlusPlus.managers.SettingsManager;
import net.sacredlabyrinth.Phaed.TelePlusPlus.managers.CommandManager;
import net.sacredlabyrinth.Phaed.TelePlusPlus.managers.GlassedManager;
import net.sacredlabyrinth.Phaed.TelePlusPlus.managers.BonedManager;
import net.sacredlabyrinth.Phaed.TelePlusPlus.managers.ItemManager;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandSender;

public class TelePlusPlus extends JavaPlugin
{
    private TPPlayerListener playerListener;
    private TPEntityListener entityListener;
    private TPBlockListener blockListener;
    public PermissionsManager pm;
    public SettingsManager sm;
    public CommandManager com;
    public GlassedManager gm;
    public BonedManager bm;
    public ItemManager im;
    
    public static Logger log;
    public String name = "Tele++";
    
    public void onEnable()
    {
	playerListener = new TPPlayerListener(this);
	blockListener = new TPBlockListener(this);
	entityListener = new TPEntityListener(this);
	pm = new PermissionsManager(this);
	sm = new SettingsManager(this);
	com = new CommandManager(this);
	gm = new GlassedManager(this);
	im = new ItemManager(this);
	bm = new BonedManager();
	
	getServer().getPluginManager().registerEvent(Event.Type.PLAYER_ITEM, playerListener, Priority.Normal, this);
	getServer().getPluginManager().registerEvent(Event.Type.PLAYER_MOVE, playerListener, Priority.Normal, this);
	getServer().getPluginManager().registerEvent(Event.Type.BLOCK_DAMAGED, blockListener, Priority.Highest, this);
	getServer().getPluginManager().registerEvent(Event.Type.ENTITY_DAMAGED, entityListener, Priority.Highest, this);
	
	log = Logger.getLogger("Minecraft");
	log.info("[" + name + "] version [" + this.getDescription().getVersion() + "] loaded");
    }
    
    public void onDisable()
    {
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)
    {
	try
	{
	    String[] split = args;
	    String commandName = command.getName().toLowerCase();
	    if (sender instanceof Player)
	    {
		if (commandName.equals("tp"))
		{
		    return com.processCommand((Player) sender, split);
		}
	    }
	    return false;
	}
	catch (Throwable ex)
	{
	    ex.printStackTrace();
	    return true;
	}
    }
}
