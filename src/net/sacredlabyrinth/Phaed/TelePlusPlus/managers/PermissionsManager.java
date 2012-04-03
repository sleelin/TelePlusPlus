package net.sacredlabyrinth.Phaed.TelePlusPlus.managers;

import net.sacredlabyrinth.Phaed.TelePlusPlus.TelePlusPlus;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PermissionsManager {
    @SuppressWarnings("unused")
	private TelePlusPlus plugin;
    
    public final String menu = "tpp.tp.menu";    
    public final String player = "tpp.tp.player";
    public final String coords = "tpp.tp.coords";
    public final String here = "tpp.tp.here";
    public final String toggle = "tpp.tp.toggle";
    public final String back = "tpp.tp.back";
    public final String origin = "tpp.tp.origin";
    public final String clear = "tpp.tp.clear";
    public final String lightning = "tpp.tp.lightning";
    public final String othersPlayer = "tpp.others.player";
    public final String othersCoords = "tpp.others.coords";
    public final String world = "tpp.world.tp";
    public final String top = "tpp.jump.top";
    public final String up = "tpp.jump.up";
    public final String jump = "tpp.jump.jump";
    public final String above = "tpp.mod.above";
    public final String mass = "tpp.mod.mass";
    public final String tool = "tpp.mod.tool";
    public final String mover = "tpp.mod.mover";    
    public final String noTp = "tpp.mod.notp";    
    public final String notify = "tpp.mod.notify";
    public final String take = "tpp.mod.take";
    public final String bypassLog = "tpp.admin.bypass.log";    
    public final String bypassNotify = "tpp.admin.bypass.notify";    
    public final String bypassNoTp = "tpp.admin.bypass.notp";
    public final String request = "tpp.request";
    public final String options = "tpp.admin.options";
    public final String version = "tpp.version";
    
    public PermissionsManager(TelePlusPlus plugin) {
        this.plugin = plugin;
    }
    
    public boolean hasPermission(Player player, String permission) {
        if (player == null) {
            return false;
        } else {
        	if (player.hasPermission(permission)){
        		return true;
        	} else {
        		player.sendMessage(ChatColor.RED + "You don't have permission to do that");
        		return false;
        	}
        }
    }
    
}
