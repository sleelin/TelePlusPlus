package net.sacredlabyrinth.Phaed.TelePlusPlus.managers;

import java.util.logging.Logger;
import net.sacredlabyrinth.Phaed.TelePlusPlus.TelePlusPlus;
import net.sacredlabyrinth.Phaed.TelePlusPlus.Helper;

import net.sacredlabyrinth.Phaed.TelePlusPlus.ChatBlock;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

/**
 *
 * @author luricos
 */
public final class HelpManager {
    protected TelePlusPlus plugin;
    protected static final Logger logger = Logger.getLogger("Minecraft");
    
    public HelpManager(TelePlusPlus plugin) {
        this.plugin = plugin;
    }
    
    public void initialize() {
    	// nothing to see here
    }
    
    public void showInternalHelp(Player player) {
        if ((plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.menu)) && (!plugin.settingsManager.disableMenu)) {
            ChatBlock.sendBlank(player);
            ChatBlock.saySingle(player, ChatColor.LIGHT_PURPLE + plugin.name + " " + plugin.getDescription().getVersion() + ChatColor.DARK_GRAY + " ----------------------------------------------------------------------------------");
            ChatBlock.sendBlank(player);

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.player) && !plugin.settingsManager.disablePlayer) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp [player]" + ChatColor.DARK_PURPLE + " - Teleport to another player");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.othersPlayer) && !plugin.settingsManager.disableOthersPlayer) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp [player(s)] to [player]" + ChatColor.DARK_PURPLE + " - Teleport players to player");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.othersCoords) && !plugin.settingsManager.disableOthersCoords) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp [player(s)] to [x] [y] [z]" + ChatColor.DARK_PURPLE + " - Teleport players to coords");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.coords) && !plugin.settingsManager.disableCoords) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp [x] [y] [z]" + ChatColor.DARK_PURPLE + " - Teleport to coordinates");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.world) && !plugin.settingsManager.disableWorld) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp [world] <x> <y> <z>" + ChatColor.DARK_PURPLE + " - Teleport to world");
            }
            
            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.here) && !plugin.settingsManager.disableHere) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp here [player(s)]" + ChatColor.DARK_PURPLE + " - Teleport players to you");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.mass) && !plugin.settingsManager.disableMass) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp mass" + ChatColor.DARK_PURPLE + " - Teleport all players to you");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.top) && !plugin.settingsManager.disableTop) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp top" + ChatColor.DARK_PURPLE + " - Teleport to the block highest above you");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.up) && !plugin.settingsManager.disableUp) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp up <height>" + ChatColor.DARK_PURPLE + " - Teleport up on a glass block");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.above) && !plugin.settingsManager.disableAbove) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp above [player] <height>" + ChatColor.DARK_PURPLE + " - Teleport above a player");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.jump) && !plugin.settingsManager.disableJump) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp jump" + ChatColor.DARK_PURPLE + " - Teleport to the block you're looking at");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.toggle) && !plugin.settingsManager.disableToggle) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp toggle" + ChatColor.DARK_PURPLE + " - Toggle teleporting to you on/off");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.back) && !plugin.settingsManager.disableBack) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp back" + ChatColor.DARK_PURPLE + " - Teleport back to your previous locations");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.origin) && !plugin.settingsManager.disableOrigin) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp origin" + ChatColor.DARK_PURPLE + " - Go back to where you were before all tps");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.clear) && !plugin.settingsManager.disableClear) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp clear" + ChatColor.DARK_PURPLE + " - Clear your tp history and " + Helper.friendlyBlockType(Material.getMaterial(plugin.settingsManager.moverItem).toString()).toLowerCase() + " selections");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.tool) && !plugin.settingsManager.disableTool) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp tool" + ChatColor.DARK_PURPLE + " - Get a " + Helper.friendlyBlockType(Material.getMaterial(plugin.settingsManager.toolItem).toString()).toLowerCase() + " to tp yourself around");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.mover) && !plugin.settingsManager.disableMover) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp mover" + ChatColor.DARK_PURPLE + " - Get a " + Helper.friendlyBlockType(Material.getMaterial(plugin.settingsManager.moverItem).toString()).toLowerCase() + " to tp others around");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.request) && !plugin.settingsManager.disableRequest) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp request [player|x y z] [reason]" + ChatColor.DARK_PURPLE + " - Request tp");
            }

            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.options) && !plugin.settingsManager.disableOptions) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp options <node> <value>" + ChatColor.DARK_PURPLE + " - Get or set options-node");
            }
            
            if (plugin.permissionsManager.hasPermission(player, plugin.permissionsManager.version) && !plugin.settingsManager.disableVersion) {
                ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp version" + ChatColor.DARK_PURPLE + " - Display version");
            }
            
            ChatBlock.sendMessage(player, "  ", ChatColor.WHITE + "/tp [help|menu]" + ChatColor.DARK_PURPLE + " - List "+plugin.name+" commands");

            ChatBlock.sendBlank(player);
        }        
    }
    
    public Boolean isHelpActive() {
        return false;
    }
}