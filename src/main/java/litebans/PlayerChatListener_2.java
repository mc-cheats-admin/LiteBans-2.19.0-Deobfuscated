package litebans;

import java.util.Collection;
import java.util.Iterator;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.jetbrains.annotations.NotNull;

public final class PlayerChatListener_2
implements LiteBansModule_88 {
    private final PlatformPlugin AsyncBackgroundTask_5;
    private final ConfigService e;
    private final PunishmentTableService c;
    private final DatabaseMonitorService LiteBansModule_31;
    public PlayerChatListener_2(@NotNull PlatformPlugin plugin) {
        this.AsyncBackgroundTask_5 = plugin;
        this.e = (ConfigService)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(ConfigService.class);
        this.c = (PunishmentTableService)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(PunishmentTableService.class);
        this.LiteBansModule_31 = (DatabaseMonitorService)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(DatabaseMonitorService.class);
    }

    public final PlatformPlugin c() {
        return this.AsyncBackgroundTask_5;
    }

    public final ConfigService LiteBansModule_31() {
        return this.e;
    }

    public final PunishmentTableService LiteBansModule_194() {
        return this.c;
    }

    public final DatabaseMonitorService e() {
        return this.LiteBansModule_31;
    }

    @EventHandler(priority=EventPriority.LOW, ignoreCancelled=true)
    public final void BaseCoreGenericHandler(@NotNull AsyncPlayerChatEvent asyncPlayerChatEvent) {
        try {
            CommandSenderWrapper sender = this.AsyncBackgroundTask_5.BaseCoreGenericHandler(asyncPlayerChatEvent.getPlayer());
            ObjectUtilities.BaseCoreGenericHandler(sender);
            String string = this.e.BaseCoreGenericHandler(sender, (Object)asyncPlayerChatEvent);
            SilentHandler dZ2 = this.c.BaseCoreGenericHandler(sender.AsyncBackgroundTask_5(), string, this.LiteBansModule_31.ServerSyncService());
            if (dZ2 != null) {
                this.plugin(asyncPlayerChatEvent, sender, dZ2);
                return;
}
        catch (NullPointerException nullPointerException) {
            PlatformPlugin plugin = this.AsyncBackgroundTask_5;
            PlatformPlugin di_03 = plugin;
            if (!di_03.isEnabled() || plugin.AsyncBackgroundTask_21()) {
                ConfigService.BaseCoreGenericHandler(this.e, nullPointerException, 0, 2, null);
            }
            throw nullPointerException;
}

    @EventHandler(priority=EventPriority.LOW, ignoreCancelled=true)
    public final void BaseCoreGenericHandler(@NotNull PlayerCommandPreprocessEvent playerCommandPreprocessEvent) {
        CommandSenderWrapper sender = this.AsyncBackgroundTask_5.BaseCoreGenericHandler(playerCommandPreprocessEvent.getPlayer());
        ObjectUtilities.BaseCoreGenericHandler(sender);
        String string = this.e.BaseCoreGenericHandler(sender, (Object)playerCommandPreprocessEvent);
        SilentHandler dZ2 = this.c.BaseCoreGenericHandler(sender.AsyncBackgroundTask_5(), string, this.LiteBansModule_31.ServerSyncService());
        if (dZ2 != null) {
            boolean flag;
            String string2;
            Object object;
{
                Object object2;
                Object object3;
                object = new char[]{' '};
                String string3 = (String)StringUtilities.BaseCoreGenericHandler((CharSequence)playerCommandPreprocessEvent.getMessage(), object, false, 0, 6, null).get(0);
                object = this.e.LiteBansModule_194();
                string2 = null;
                string2 = playerCommandPreprocessEvent.getMessage();
                if (LiteBansModule_242.BaseCoreGenericHandler((CharSequence)string2)) {
                    string2 = LiteBansModule_242.LiteBansModule_31(string2);
                }
                if (StringUtilities.c((CharSequence)string3, ':', false, 2, null) && object.InitHandler()) {
                    object3 = string2;
                    object2 = new NativepatternHandler("^/[^ ]+:");
                    String string4 = "/";
                    string2 = ((NativepatternHandler)object2).BaseCoreGenericHandler((CharSequence)object3, string4);
                }
                object3 = object.LiteBansModule_10();
                object2 = (Iterable)object3;
                if (object2 instanceof Collection && ((Collection)object2).isEmpty()) {
                    flag = false;
                } else {
                    Iterator iterator = object2.iterator();
                    while (iterator.hasNext()) {
                        Object t2 = iterator.next();
                        String string5 = (String)t2;
                        if (!StringUtilities.c(string2, string5, true)) continue;
                        flag = true;
                        break;
                    }
                    flag = false;
}
            if (flag || object.LiteBansModule_9().contains(string2)) {
                this.plugin(playerCommandPreprocessEvent, sender, dZ2);
                return;
}

    private final void BaseCoreGenericHandler(Object object, CommandSenderWrapper sender, SilentHandler dZ2) {
        TestHandler_2 f82 = this.c.BaseCoreGenericHandler();
        LiteBansModule_158 ec_02 = this.AsyncBackgroundTask_5.i();
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        f82.BaseCoreGenericHandler(object, sender, ((BungeecordHandler_2)ec_02).c(object), dZ2);
    }

    static /* synthetic */ void BaseCoreGenericHandler(PlayerChatListener_2 hE2, Object object, CommandSenderWrapper sender, SilentHandler dZ2, int n, Object object2) {
        if ((n & 4) != 0) {
            dZ2 = null;
        }
        hE2.BaseCoreGenericHandler(object, sender, dZ2);
    }

    @Override
    public PlayerChatListener_2 BaseCoreGenericHandler() {
        PlayerChatListener_2 hE2;
        PlayerChatListener_2 hE3 = hE2 = this;
        LiteBansModule_175[] em_0Array = new LiteBansModule_175[]{hE3};
        hE3.AsyncBackgroundTask_5.LiteBansModule_31(em_0Array);
        return hE2;
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.plugin();
    }

    private static final void AsyncBackgroundTask_5() {
        BaseCoreGenericHandler = new String[]{"^/[^ ]+:", "/", ""};
}

