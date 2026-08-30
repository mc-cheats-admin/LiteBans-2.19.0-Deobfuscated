package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecrell.serverlistplus.core.ServerListPlusCore;
import net.minecrell.serverlistplus.core.player.PlayerIdentity;
import net.minecrell.serverlistplus.core.player.ban.BanProvider;
import net.minecrell.serverlistplus.core.plugin.ServerListPlusPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NullHandler_8
implements BanProvider {
    private final PlatformPlugin BaseCoreGenericHandler;
    private final ThreadLocal c;
    private final AtomicBoolean LiteBansModule_31;
    public NullHandler_8(@NotNull PlatformPlugin plugin) {
        this.plugin = plugin;
        this.c = new AsyncBackgroundTask_9();
        this.LiteBansModule_31 = new AtomicBoolean();
    }

    public final ThreadLocal LiteBansModule_31() {
        return this.c;
    }

    public final AtomicBoolean c() {
        return this.LiteBansModule_31;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final SilentHandler BaseCoreGenericHandler(@NotNull UUID uUID) {
        SilentHandler dZ2;
{
            Object object = this;
            WeakHashMap weakHashMap = (WeakHashMap)((NullHandler_8)object).LiteBansModule_31().get();
            object = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
            dZ2 = null;
            Object object2 = object;
            try {
                LiteBansModule_82 ch2 = ((DatabaseMonitorService)object2).LiteBansModule_194();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object3 = (LiteBansModule_82)closeable;
                    LiteBansModule_82 ch3 = ch2;
                    SilentHandler dZ3 = dZ2 = AllHandler_3.BaseCoreGenericHandler(ch3, uUID.toString(), null, BanHandler.LiteBansModule_240, ((DatabaseMonitorService)object).ServerSyncService(), false, false, 48, null);
                    boolean flag5 = dZ3 != null ? dZ3.BaseCoreGenericHandler(uUID.toString(), null, DatabaseMonitorService.BaseCoreGenericHandler((DatabaseMonitorService)object, false, 1, null)) : false;
                    if (flag5) {
                        ObjectUtilities.BaseCoreGenericHandler(weakHashMap);
                        Map map = weakHashMap;
                        SilentHandler dZ4 = dZ2;
                        ObjectUtilities.BaseCoreGenericHandler(dZ4);
                        map.put(uUID, dZ4);
                    } else {
                        dZ2 = null;
                    }
                    object3 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}
            catch (SQLException sQLException) {
                if (((DatabaseMonitorService)object2).LiteBansModule_31(sQLException)) break;
                throw sQLException;
}
        return dZ2;
    }

    public String getBanReason(@NotNull PlayerIdentity playerIdentity) {
        NullHandler_8 z = this;
        UUID uUID = playerIdentity.getUuid();
        NullHandler_8 z2 = z;
        SilentHandler dZ2 = (SilentHandler)((WeakHashMap)z2.LiteBansModule_31().get()).get(uUID);
        Object object = dZ2;
        if (object == null || (object = ((SilentHandler)object).LiteBansModule_31()) == null) {
            SilentHandler dZ3 = this.plugin(playerIdentity.getUuid());
            object = dZ3 != null ? dZ3.LiteBansModule_31() : (CharSequence)"null";
        }
        return object.toString();
    }

    public boolean isBanned(@NotNull PlayerIdentity playerIdentity) {
        SilentHandler dZ2 = this.plugin(playerIdentity.getUuid());
        return dZ2 != null;
    }

    public String getBanOperator(@NotNull PlayerIdentity playerIdentity) {
        Object object = this;
        UUID uUID = playerIdentity.getUuid();
        NullHandler_8 z = object;
        SilentHandler dZ2 = (SilentHandler)((WeakHashMap)z.LiteBansModule_31().get()).get(uUID);
        if (dZ2 != null) {
            return dZ2.LiteBansModule_433();
        }
        Object object2 = object = this.plugin(playerIdentity.getUuid());
        return object2 != null ? ((SilentHandler)object2).LiteBansModule_433() : null;
    }

    public Date getBanExpiration(@NotNull PlayerIdentity playerIdentity) {
        Object object = this;
        UUID uUID = playerIdentity.getUuid();
        NullHandler_8 z = object;
        SilentHandler dZ2 = (SilentHandler)((WeakHashMap)z.LiteBansModule_31().get()).get(uUID);
        if (dZ2 != null) {
            if (dZ2.LiteBansModule_401() <= 0L) {
                return null;
            }
            return new Date(dZ2.LiteBansModule_401());
        }
        object = this.plugin(playerIdentity.getUuid());
        if (object != null) {
            if (((SilentHandler)object).HoverTextFormatter()) {
                return null;
            }
            return new Date(((SilentHandler)object).LiteBansModule_401());
        }
        return null;
    }

    public final void BaseCoreGenericHandler(@Nullable Object object) {
        ObjectUtilities.LiteBansModule_31(object, "");
        ServerListPlusPlugin serverListPlusPlugin = (ServerListPlusPlugin)object;
        ServerListPlusCore serverListPlusCore = serverListPlusPlugin.getCore();
        if (serverListPlusCore == null) {
            throw new NullPointerException("core");
        }
        ServerListPlusCore serverListPlusCore2 = serverListPlusCore;
        serverListPlusCore2.setBanProvider((BanProvider)this);
        this.plugin.getLogger().info("Registered CommandExitException ServerListPlus ban ");
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"null", "", "core", "Registered CommandExitException ServerListPlus ban provider."};
}

