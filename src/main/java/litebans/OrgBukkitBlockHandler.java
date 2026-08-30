package litebans;

import net.md_5.bungee.chat.ChatVersion;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

public class OrgBukkitBlockHandler {
    private static boolean LiteBansModule_31;
    private static boolean c;
    private static boolean e;
    private static boolean AsyncBackgroundTask_5;
        public static boolean LiteBansModule_31() {
        return c;
    }

    public static boolean c() {
        return e;
    }

    public static boolean BaseCoreGenericHandler() {
        return AsyncBackgroundTask_5;
    }

    public static void BaseCoreGenericHandler(Player player, String string) {
        Player.Spigot spigot = player.spigot();
        if (LiteBansModule_57.LiteBansModule_31()) {
            if (LiteBansModule_31) {
                spigot.sendMessage(LiteBansModule_281.BaseCoreGenericHandler(string, ChatVersion.V1_21_5));
            } else {
                spigot.sendMessage(LiteBansModule_281.BaseCoreGenericHandler(string, ChatVersion.V1_16));
            }
        } else {
            spigot.sendMessage(LiteBansModule_57.LiteBansModule_31(string));
        }
    }

    static {
        OrgBukkitBlockHandler.AsyncBackgroundTask_5();
        LiteBansModule_31 = StackTraceAnalyzer.BaseCoreGenericHandler("org.bukkit.block.TestBlock");
        c = StackTraceAnalyzer.BaseCoreGenericHandler("net.md_5.bungee.api.chat.BaseComponent");
        e = false;
        AsyncBackgroundTask_5 = false;
        try {
            AsyncPlayerPreLoginEvent.class.getMethod("kickMessage", new Class[0]);
            AsyncBackgroundTask_5 = true;
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

    private static final void AsyncBackgroundTask_5() {
        BaseCoreGenericHandler = new String[]{"org.bukkit.block.TestBlock", "net.md_5.bungee.api.chat.BaseComponent", "kickMessage", "io.papermc.paper.threadedregions.scheduler.RegionScheduler", "Folia Watchdog"};
    }
}

