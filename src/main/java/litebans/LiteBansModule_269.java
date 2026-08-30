package litebans;

import java.util.Collection;
import litebans.api.Entry;
import litebans.api.Events;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_269 {
    public static final LiteBansModule_269 BaseCoreGenericHandler;
        private LiteBansModule_269() {
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull PlatformPlugin plugin, @NotNull CharSequence charSequence, @Nullable String string) {
        LiteBansModule_269 hq2 = this;
        LiteBansModule_83 ch3 = ch2;
        Collection collection = hq2.LiteBansModule_31();
        if (!collection.isEmpty()) {
            plugin.LiteBansModule_31(new AsyncBackgroundTask_18(collection, ch3, charSequence, string));
        }
    }

    public final Entry BaseCoreGenericHandler(@NotNull PlatformPlugin plugin, @NotNull SilentHandler dZ2) {
        SilentHandler dZ3 = dZ2;
        return new LiteBansModule_360(plugin, dZ3.BaseCoreGenericHandler(), dZ3.ServerSyncService().c().toString(), dZ3.DatabaseMonitorService(), dZ3.PunishmentTableService(), ((Object)dZ3.LiteBansModule_31()).toString(), dZ3.e(), dZ3.LiteBansModule_435(), dZ3.AsyncBackgroundTask_21(), dZ3.q(), String.valueOf(dZ3.CommandThrottleService()), dZ3.BroadcastService(), dZ3.LiteBansModule_403(), dZ3.m(), dZ3.GnuSparseMapHandler(), dZ3.r(), dZ3.AsyncBackgroundTask_5(), dZ3.LiteBansModule_241(), dZ3.AsyncBackgroundTask_22());
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull PlatformPlugin plugin, @NotNull SilentHandler dZ2) {
        Entry entry = this.plugin(plugin, dZ2);
        LiteBansModule_269 hq2 = this;
        LiteBansModule_83 ch3 = ch2;
        Collection collection = hq2.LiteBansModule_31();
        if (!collection.isEmpty()) {
            plugin.LiteBansModule_31(new AsyncBackgroundTask_10(collection, ch3, entry));
        }
    }

    public final void LiteBansModule_31(@NotNull LiteBansModule_83 ch2, @NotNull PlatformPlugin plugin, @NotNull SilentHandler dZ2) {
        Entry entry = this.plugin(plugin, dZ2);
        LiteBansModule_269 hq2 = this;
        LiteBansModule_83 ch3 = ch2;
        Collection collection = hq2.LiteBansModule_31();
        if (!collection.isEmpty()) {
            plugin.LiteBansModule_31(new AsyncBackgroundTask_19(collection, ch3, entry));
        }
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull Throwable throwable) {
        ch2.e().getLogger().severe("An uncaught exception was thrown LiteBansModule_61 BaseCoreGenericHandler LiteBans API event ");
        if (throwable instanceof Exception) {
            ch2.e().getLogger().severe("This is likely BaseCoreGenericHandler bug InitializerHandler_3 BaseCoreGenericHandler plugin which is using the LiteBans ");
        }
        throwable.printStackTrace();
    }

    public final Collection LiteBansModule_31() {
        Events events = Events.get();
        ObjectUtilities.LiteBansModule_31(events, "");
        return ((EventsHandler)events).LiteBansModule_31();
    }

    static {
        LiteBansModule_269.BaseCoreGenericHandler();
        BaseCoreGenericHandler = new LiteBansModule_269();
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_31 = new String[]{"An uncaught exception was thrown LiteBansModule_61 BaseCoreGenericHandler LiteBans API event ", "This is likely BaseCoreGenericHandler bug InitializerHandler_3 BaseCoreGenericHandler plugin which is using the LiteBans ", ""};
    }
}

