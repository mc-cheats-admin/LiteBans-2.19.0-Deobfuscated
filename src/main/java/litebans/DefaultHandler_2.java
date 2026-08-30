package litebans;

import java.io.Closeable;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import litebans.api.Database;
import litebans.api.Entry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DefaultHandler_2
extends Database {
    private final PlatformPlugin BaseCoreGenericHandler;
    private int LiteBansModule_31;
    public DefaultHandler_2(@NotNull PlatformPlugin plugin) {
        this.plugin = plugin;
    }

    public final int c() {
        return this.LiteBansModule_31;
    }

    @Override
    public boolean isPlayerBanned(@Nullable UUID uUID, @Nullable String string, @Nullable String string2) {
        return this.plugin(uUID, string, string2, BanHandler.LiteBansModule_240) != null;
    }

    @Override
    public boolean isPlayerMuted(@Nullable UUID uUID, @Nullable String string, @Nullable String string2) {
        return this.plugin(uUID, string, string2, BanHandler.GnuSparseMapHandler) != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final Entry BaseCoreGenericHandler(UUID uUID, String string, String string2, BanHandler a_2) {
        Object object;
        Object object2;
        String string3;
        String string4;
        this.LiteBansModule_31();
        if (uUID == null && string == null) {
            return null;
        }
        DatabaseMonitorService w2 = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"__DEFAULT__")) {
            string4 = w2.ServerSyncService();
        } else {
            string4 = string2;
            if (string4 == null) {
                string4 = string3 = w2.ServerSyncService();
            }
        }
        if (uUID != null && a_2 == BanHandler.GnuSparseMapHandler && (object2 = ((PunishmentTableService)(object = (PunishmentTableService)this.plugin.BaseCoreGenericHandler(PunishmentTableService.class))).BaseCoreGenericHandler(uUID, string, string2)) != null) {
            return LiteBansModule_268.BaseCoreGenericHandler.BaseCoreGenericHandler(this.plugin, (SilentHandler)object2);
        }
        object = w2.LiteBansModule_194();
        object2 = null;
        try {
            SilentHandler dZ2;
            LiteBansModule_82 ch2 = (LiteBansModule_82)object;
            boolean flag = false;
            if (AllHandler_3.BaseCoreGenericHandler(ch2, Objects.toString(uUID), string, a_2, string3, false, false, 48, null) == null) {
                Entry entry = null;
                return entry;
            }
            SilentHandler dZ3 = dZ2;
            Entry entry = LiteBansModule_268.BaseCoreGenericHandler.BaseCoreGenericHandler(this.plugin, dZ3);
            return entry;
        }
        catch (Throwable throwable) {
            object2 = throwable;
            throw throwable;
        }
        finally {
            BlockHandler.BaseCoreGenericHandler((Closeable)object, (Throwable)object2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final Entry BaseCoreGenericHandler(long l3, String string, BanHandler a_2) {
        this.LiteBansModule_31();
        if (!(l3 >= 0L)) {
            boolean flag = false;
            String string2 = "Negative ID: " + l3;
            throw new IllegalArgumentException(string2.toString());
        }
        DatabaseMonitorService w2 = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
        String string3 = ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"__DEFAULT__") ? w2.ServerSyncService() : string;
        Closeable closeable = w2.LiteBansModule_194();
        Throwable throwable = null;
        try {
            SilentHandler dZ2;
            LiteBansModule_82 ch2 = (LiteBansModule_82)closeable;
            boolean flag = false;
            String string4 = string3;
            if (string4 == null) {
                string4 = w2.ServerSyncService();
            }
            if (AllHandler_3.BaseCoreGenericHandler(ch2, l3, a_2, string4, false, 8, null) == null) {
                Entry entry = null;
                return entry;
            }
            SilentHandler dZ3 = dZ2;
            Entry entry = LiteBansModule_268.BaseCoreGenericHandler.BaseCoreGenericHandler(this.plugin, dZ3);
            return entry;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            BlockHandler.BaseCoreGenericHandler(closeable, throwable);
        }
    }

    @Override
    public boolean isPlayerBanned(@Nullable UUID uUID, @Nullable String string) {
        return this.isPlayerBanned(uUID, string, "__DEFAULT__");
    }

    @Override
    public boolean isPlayerMuted(@Nullable UUID uUID, @Nullable String string) {
        return this.isPlayerMuted(uUID, string, "__DEFAULT__");
    }

    @Override
    public Entry getBan(@Nullable UUID uUID, @Nullable String string, @Nullable String string2) {
        return this.plugin(uUID, string, string2, BanHandler.LiteBansModule_240);
    }

    @Override
    public Entry getBan(long l3, @Nullable String string) {
        return this.plugin(l3, string, BanHandler.LiteBansModule_240);
    }

    @Override
    public Entry getMute(@Nullable UUID uUID, @Nullable String string, @Nullable String string2) {
        return this.plugin(uUID, string, string2, BanHandler.GnuSparseMapHandler);
    }

    @Override
    public Entry getMute(long l3, @Nullable String string) {
        return this.plugin(l3, string, BanHandler.GnuSparseMapHandler);
    }

    @Override
    public Entry getWarning(@Nullable UUID uUID, @Nullable String string, @Nullable String string2) {
        return this.plugin(uUID, string, string2, BanHandler.c);
    }

    @Override
    public Entry getWarning(long l3, @Nullable String string) {
        return this.plugin(l3, string, BanHandler.c);
    }

    @Override
    public Entry getKick(@Nullable UUID uUID, @Nullable String string, @Nullable String string2) {
        return this.plugin(uUID, string, string2, BanHandler.g);
    }

    @Override
    public Entry getKick(long l3, @Nullable String string) {
        return this.plugin(l3, string, BanHandler.g);
    }

    @Override
    public PreparedStatement prepareStatement(@NotNull String string) {
        String string2 = string;
        this.LiteBansModule_31();
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        DatabaseMonitorService w2 = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
        LiteBansModule_82 ch2 = w2.LiteBansModule_194();
        if (ch2.LiteBansModule_31()) {
            throw new IllegalStateException("Database connection not available");
        }
        if (StringUtilities.c((CharSequence)string2, '{', false, 2, null)) {
            string2 = StringUtilities.BaseCoreGenericHandler(string2, c[6], configService.LiteBansModule_194().AsyncBackgroundTask_5(), false, 4, null);
            for (BansHandler_2 kL2 : BansHandler_2.values()) {
                String string3 = kL2.name();
                string2 = StringUtilities.BaseCoreGenericHandler(string2, '{' + string3.toLowerCase(Locale.ENGLISH) + '}', kL2.toString(), false, 4, null);
            }
        }
        int n = this.LiteBansModule_31;
        this.LiteBansModule_31 = n + 1;
        return new LiteBansModule_29(ch2.c((CharSequence)string2).LiteBansModule_31(), ch2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection getUsersByIP(@Nullable String string) {
        Object object;
        block13: {
            block12: {
                this.LiteBansModule_31();
                if (string == null) break block12;
                object = string;
                boolean flag = false;
                if (HexEncodingHelper.BaseCoreGenericHandler.i((String)object) && !HexEncodingHelper.BaseCoreGenericHandler(string)) break block13;
            }
            throw new IllegalArgumentException(c[7] + string);
        }
        object = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
        Closeable closeable = ((DatabaseMonitorService)object).LiteBansModule_194();
        Throwable throwable = null;
        try {
            boolean flag;
            LiteBansModule_297 iA2;
            LiteBansModule_82 ch2 = (LiteBansModule_82)closeable;
            boolean flag2 = false;
            List list = AllHandler_3.LiteBansModule_31(ch2, string, 0, 2, null);
            if (list.isEmpty()) {
                Collection collection = CollectionUtilities.e();
                return collection;
            }
            Iterable iterable = list;
            boolean flag3 = false;
            Iterable iterable2 = iterable;
            Collection collection = new ArrayList();
            boolean flag4 = false;
            for (Object t2 : iterable2) {
                iA2 = (LiteBansModule_297)t2;
                flag = false;
                if (!HexEncodingHelper.BaseCoreGenericHandler(iA2.LiteBansModule_31())) continue;
                collection.add(t2);
            }
            iterable = (List)collection;
            flag3 = false;
            iterable2 = iterable;
            collection = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable, 10));
            flag4 = false;
            for (Object t2 : iterable2) {
                iA2 = (LiteBansModule_297)t2;
                Collection collection2 = collection;
                flag = false;
                collection2.add(UUID.fromString(iA2.LiteBansModule_31()));
            }
            Collection collection3 = CollectionUtilities.LiteBansModule_31((Iterable)((List)collection));
            return collection3;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            BlockHandler.BaseCoreGenericHandler(closeable, throwable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public String getPlayerName(@NotNull UUID uUID) {
        this.LiteBansModule_31();
        DatabaseMonitorService w2 = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
        Closeable closeable = w2.LiteBansModule_194();
        Throwable throwable = null;
        try {
            LiteBansModule_82 ch2 = (LiteBansModule_82)closeable;
            boolean flag = false;
            LiteBansModule_297 iA2 = ch2.c(uUID.toString());
            String string = iA2 != null ? iA2.BaseCoreGenericHandler() : null;
            return string;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            BlockHandler.BaseCoreGenericHandler(closeable, throwable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public UUID getPlayerUUID(@NotNull String string) {
        this.LiteBansModule_31();
        DatabaseMonitorService w2 = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
        Closeable closeable = w2.LiteBansModule_194();
        Throwable throwable = null;
        try {
            LiteBansModule_82 ch2 = (LiteBansModule_82)closeable;
            boolean flag = false;
            LiteBansModule_297 iA2 = ch2.c(string);
            String string2 = HexEncodingHelper.BaseCoreGenericHandler.g(iA2 != null ? iA2.LiteBansModule_31() : null);
            if (HexEncodingHelper.BaseCoreGenericHandler(string2)) {
                UUID uUID = UUID.fromString(string2);
                return uUID;
            }
            UUID uUID = null;
            return uUID;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            BlockHandler.BaseCoreGenericHandler(closeable, throwable);
        }
    }

    public String toString() {
        return c[8];
    }

    private final void LiteBansModule_31() {
        if (this.plugin.ServerSyncService()) {
            throw new IllegalStateException(c[9]);
        }
    }

    private static final void BaseCoreGenericHandler() {
        c = new String[]{"__DEFAULT__", "Negative ID: ", "__DEFAULT__", "__DEFAULT__", "__DEFAULT__", "Database connection not available", "{table_prefix}", "Target is not HikariDataSource IP address: ", "Database", "Database queries cannot be executed on the main server thread!"};
    }

    }

