package litebans;

import java.util.Collection;
import litebans.api.Entry;
import litebans.api.Events;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_268 {
    public static final LiteBansModule_268 BaseCoreGenericHandler;
    private LiteBansModule_268() {
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull PlatformPlugin plugin, @NotNull CharSequence charSequence, @Nullable String string) {
        LiteBansModule_268 hq2 = this;
        LiteBansModule_82 ch3 = ch2;
        Collection collection = hq2.LiteBansModule_31();
        if (!collection.isEmpty()) {
            plugin.LiteBansModule_31(new AsyncBackgroundTask_18(collection, ch3, charSequence, string));
}

    public final Entry BaseCoreGenericHandler(@NotNull PlatformPlugin plugin, @NotNull SilentHandler dZ2) {
        SilentHandler dZ3 = dZ2;
        return new LiteBansModule_358(plugin, dZ3.BaseCoreGenericHandler(), dZ3.ServerSyncService().c().toString(), dZ3.DatabaseMonitorService(), dZ3.PunishmentTableService(), ((Object)dZ3.LiteBansModule_31()).toString(), dZ3.e(), dZ3.LiteBansModule_433(), dZ3.AsyncBackgroundTask_21(), dZ3.q(), String.valueOf(dZ3.CommandThrottleService()), dZ3.BroadcastService(), dZ3.LiteBansModule_401(), dZ3.m(), dZ3.GnuSparseMapHandler(), dZ3.r(), dZ3.AsyncBackgroundTask_5(), dZ3.LiteBansModule_240(), dZ3.AsyncBackgroundTask_22());
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull PlatformPlugin plugin, @NotNull SilentHandler dZ2) {
        Entry entry = this.plugin(plugin, dZ2);
        LiteBansModule_268 hq2 = this;
        LiteBansModule_82 ch3 = ch2;
        Collection collection = hq2.LiteBansModule_31();
        if (!collection.isEmpty()) {
            plugin.LiteBansModule_31(new AsyncBackgroundTask_10(collection, ch3, entry));
}

    public final void LiteBansModule_31(@NotNull LiteBansModule_82 ch2, @NotNull PlatformPlugin plugin, @NotNull SilentHandler dZ2) {
        Entry entry = this.plugin(plugin, dZ2);
        LiteBansModule_268 hq2 = this;
        LiteBansModule_82 ch3 = ch2;
        Collection collection = hq2.LiteBansModule_31();
        if (!collection.isEmpty()) {
            plugin.LiteBansModule_31(new AsyncBackgroundTask_19(collection, ch3, entry));
}

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull Throwable throwable) {
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
        LiteBansModule_268.BaseCoreGenericHandler();
        BaseCoreGenericHandler = new LiteBansModule_268();
}

