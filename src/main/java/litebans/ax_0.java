package litebans;

import litebans.BukkitPlugin;
import litebans.jv_0;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.Plugin;

/*
 * Renamed from litebans.ax
 */
public static class ax_0 {
    private static final Runnable a = () -> {};

    public static void a(BukkitPlugin bukkitPlugin, Runnable runnable) {
        bukkitPlugin.getServer().getGlobalRegionScheduler().execute((Plugin)bukkitPlugin, runnable);
    }

    public static void a(BukkitPlugin bukkitPlugin, jv_0 jv_02, Runnable runnable) {
        ((Entity)jv_02.c()).getScheduler().execute((Plugin)bukkitPlugin, runnable, a, 0L);
    }

    public static void a(BukkitPlugin bukkitPlugin, Location location, Runnable runnable) {
        bukkitPlugin.getServer().getRegionScheduler().execute((Plugin)bukkitPlugin, location, runnable);
    }
}

