package litebans;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.Plugin;

public class LiteBansModule_26 {
    private static final Runnable BaseCoreGenericHandler = () -> { }

    public static void BaseCoreGenericHandler(BukkitPlugin bukkitPlugin, Runnable runnable) {
        bukkitPlugin.getServer().getGlobalRegionScheduler().execute((Plugin)bukkitPlugin, runnable);
    }

    public static void BaseCoreGenericHandler(BukkitPlugin bukkitPlugin, CommandSenderWrapper sender, Runnable runnable) {
        ((Entity)sender.c()).getScheduler().execute((Plugin)bukkitPlugin, runnable, BaseCoreGenericHandler, 0L);
    }

    public static void BaseCoreGenericHandler(BukkitPlugin bukkitPlugin, Location location, Runnable runnable) {
        bukkitPlugin.getServer().getRegionScheduler().execute((Plugin)bukkitPlugin, location, runnable);
}

