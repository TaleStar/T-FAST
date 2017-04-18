package tw.tfast

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;

/**
 * Start loading inside code.
 *
 * Code base on bukkit.
 */
import tw.tfast.Warning.WarningState;
import tw.tfast.command.CommandException;
import tw.tfast.command.CommandSender;
import tw.tfast.command.ConsoleCommandSender;
import tw.tfast.command.PluginCommand;
import tw.tfast.entity.Player;
import tw.tfast.event.inventory.InventoryType;
import tw.tfast.help.HelpMap;
import tw.tfast.inventory.ItemStack;
import tw.tfast.inventory.Inventory;
import tw.tfast.inventory.InventoryHolder;
import tw.tfast.inventory.ItemFactory;
import tw.tfast.inventory.Recipe;
import tw.tfast.map.MapView;
import tw.tfast.plugin.PluginManager;
import tw.tfast.plugin.ServicesManager;
import tw.tfast.plugin.messaging.Messenger;
import tw.tfast.scheduler.BukkitScheduler;
import tw.tfast.scoreboard.ScoreboardManager;
import tw.tfast.util.CachedServerIcon;

import com.avaje.ebean.config.ServerConfig;

/**
 * The core of T-Fast
 */
public final class TFast{
    private static Server server;
        private static TFast() {}
            private static Server getServer() {
                return server;
            }
     public static void setServer(Server server) {
        if (Bukkit.server != null) {
            throw new UnsupportedOperationException("Cannot redefine singleton Server");
        }
        Bukkit.server = server;
            server.getLogger().info("This server is running " + getName() + " version " + getVersion() + " (Implementing API version " + getBukkitVersion() + ")");
        }
    
    /**
     * getVersion()
     */
    public static String getVersion() {
        return server.getVersion();
    }

    /**
     * getBukkitVersion()
     */
    public static String getBukkitVersion() {
        return server.getBukkitVersion();
    }
        /**
     * getName()
     */
    public static String getName() {
        return server.getName();
    }
    
    /**
     * _INVALID_getOnlinePlayers()
     */
    @Deprecated
    public static Player[] _INVALID_getOnlinePlayers() {
        return server._INVALID_getOnlinePlayers();
    }

    /**
     * getOnlinePlayers()
     */
    public static Collection<? extends Player> getOnlinePlayers() {
        return server.getOnlinePlayers();
    }

    /**
     * getMaxPlayers()
     */
    public static int getMaxPlayers() {
        return server.getMaxPlayers();
    }

    /**
     * getPort()
     */
    public static int getPort() {
        return server.getPort();
    }

    /**
     * getViewDistance()
     */
    public static int getViewDistance() {
        return server.getViewDistance();
    }

    /**
     * getIp()
     */
    public static String getIp() {
        return server.getIp();
    }

    /**
     * getServerName()
     */
    public static String getServerName() {
        return server.getServerName();
    }

    /**
     * getServerId()
     */
    public static String getServerId() {
        return server.getServerId();
    }


} 
