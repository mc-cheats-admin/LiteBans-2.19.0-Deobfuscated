package litebans;

import litebans.bp_0;
import litebans.hb_0;
import litebans.hl;
import litebans.hw_0;
import net.md_5.bungee.chat.ChatVersion;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

public class es_0 {
    private static boolean b;
    private static boolean c;
    private static boolean e;
    private static boolean d;
    private static /* synthetic */ String[] a;

    public static boolean b() {
        return c;
    }

    public static boolean c() {
        return e;
    }

    public static boolean a() {
        return d;
    }

    public static void a(Player player, String string) {
        Player.Spigot spigot = player.spigot();
        if (bp_0.b()) {
            if (b) {
                spigot.sendMessage(hw_0.a(string, ChatVersion.V1_21_5));
            } else {
                spigot.sendMessage(hw_0.a(string, ChatVersion.V1_16));
            }
        } else {
            spigot.sendMessage(bp_0.b(string));
        }
    }

    static {
        es_0.d();
        b = hb_0.a("org.bukkit.block.TestBlock");
        c = hb_0.a("net.md_5.bungee.api.chat.BaseComponent");
        e = false;
        d = false;
        try {
            AsyncPlayerPreLoginEvent.class.getMethod("kickMessage", new Class[0]);
            d = true;
            Class.forName("io.papermc.paper.threadedregions.scheduler.RegionScheduler");
            int n = Thread.activeCount();
            Thread[] threadArray = new Thread[n];
            Thread.enumerate(threadArray);
            for (Thread thread : threadArray) {
                if (thread == null || !thread.getName().startsWith("Folia Watchdog")) continue;
                e = true;
            }
        }
        catch (LinkageError | ReflectiveOperationException throwable) {
            // empty catch block
        }
    }

    private static final void d() {
        a = new String[]{"org.bukkit.block.TestBlock", "net.md_5.bungee.api.chat.BaseComponent", "kickMessage", "io.papermc.paper.threadedregions.scheduler.RegionScheduler", "Folia Watchdog"};
    }
}

