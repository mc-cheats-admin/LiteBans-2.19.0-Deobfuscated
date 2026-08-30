package litebans;

import litebans.bp_0;
import litebans.hb_0;
import litebans.hl;
import litebans.hw_0;
import net.md_5.bungee.chat.ChatVersion;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

/*
 * Renamed from litebans.es
 */
public static class es_0 {
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
        b = hb_0.a(a[0]);
        c = hb_0.a(a[1]);
        e = false;
        d = false;
        try {
            AsyncPlayerPreLoginEvent.class.getMethod(a[2], new Class[0]);
            d = true;
            Class.forName(a[3]);
            int n = Thread.activeCount();
            Thread[] threadArray = new Thread[n];
            Thread.enumerate(threadArray);
            for (Thread thread : threadArray) {
                if (thread == null || !thread.getName().startsWith(a[4])) continue;
                e = true;
            }
        }
        catch (LinkageError | ReflectiveOperationException throwable) {
            // empty catch block
        }
    }

    private static final void d() {
        a = new String[]{hl.a("\ueb94\ueb89\ueb9c\uebd5\ueb99\ueb8e\ueb90\ueb90\ueb92\ueb8f\uebd5\ueb99\ueb97\ueb94\ueb98\ueb90\uebd5\uebaf\ueb9e\ueb88\ueb8f\uebb9\ueb97\ueb94\ueb98\ueb90", 1595796475), hl.a("\u4b33\u4b38\u4b29\u4b73\u4b30\u4b39\u4b02\u4b68\u4b73\u4b3f\u4b28\u4b33\u4b3a\u4b38\u4b38\u4b73\u4b3c\u4b2d\u4b34\u4b73\u4b3e\u4b35\u4b3c\u4b29\u4b73\u4b1f\u4b3c\u4b2e\u4b38\u4b1e\u4b32\u4b30\u4b2d\u4b32\u4b33\u4b38\u4b33\u4b29", 1848134493), hl.a("\ua487\ua485\ua48f\ua487\ua4a1\ua489\ua49f\ua49f\ua48d\ua48b\ua489", 2122163436), hl.a("\u51cd\u51cb\u518a\u51d4\u51c5\u51d4\u51c1\u51d6\u51c9\u51c7\u518a\u51d4\u51c5\u51d4\u51c1\u51d6\u518a\u51d0\u51cc\u51d6\u51c1\u51c5\u51c0\u51c1\u51c0\u51d6\u51c1\u51c3\u51cd\u51cb\u51ca\u51d7\u518a\u51d7\u51c7\u51cc\u51c1\u51c0\u51d1\u51c8\u51c1\u51d6\u518a\u51f6\u51c1\u51c3\u51cd\u51cb\u51ca\u51f7\u51c7\u51cc\u51c1\u51c0\u51d1\u51c8\u51c1\u51d6", 224612772), hl.a("\u8ecc\u8ee5\u8ee6\u8ee3\u8eeb\u8eaa\u8edd\u8eeb\u8efe\u8ee9\u8ee2\u8eee\u8ee5\u8eed", -2035839350)};
    }
}

