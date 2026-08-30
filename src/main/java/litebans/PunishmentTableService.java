package litebans;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PunishmentTableService
extends PluginModule {
    public TestHandler_2 LiteBansModule_31;
    public PunishmentTableService(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    public final TestHandler_2 BaseCoreGenericHandler() {
        TestHandler_2 f82 = this.LiteBansModule_31;
        if (f82 != null) {
            return f82;
        }
        ObjectUtilities.e("");
        return null;
    }

    public final void BaseCoreGenericHandler(@NotNull TestHandler_2 f82) {
        this.LiteBansModule_31 = f82;
    }

    @Override
    public void e() {
        this.plugin(new TestHandler_2(this.plugin));
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2) {
        boolean flag;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        int n;
        ArrayList<Object> arrayList;
        List list;
        CommandSenderWrapper[] jv_0Array = ch2.e().q();
        ObjectUtilities.BaseCoreGenericHandler(jv_0Array);
        if (jv_0Array.length == 0 || ch2.LiteBansModule_31()) {
            return;
        }
        if (!(ch2 instanceof SQLiteDriverHandler_3)) {
            AssertionUtilities.BaseCoreGenericHandler();
            throw new CommandExitException();
        }
        SQLiteDriverHandler_3 gZ2 = (SQLiteDriverHandler_3)ch2;
        Object object7 = gZ2;
        Object object8 = BansHandler_2.m;
        CommandSenderWrapper[] jv_0Array2 = jv_0Array;
        boolean flag2 = false;
        if (jv_0Array2.length == 0) {
            list = CollectionUtilities.e();
        } else {
            arrayList = new ArrayList(Math.max(1, jv_0Array2.length / SQLiteDriverHandler_3.LiteBansModule_401.LiteBansModule_31()));
            int n2 = 0;
            n = 0;
            object6 = new HashSet(jv_0Array2.length);
            object5 = new ArrayList(jv_0Array2.length * 2);
            while (true) {
                Object object9;
                boolean flag3;
                Object object10 = object7;
                boolean flag4 = false;
                StringBuilder stringBuilder = new StringBuilder("SELECT * FROM " + object8 + " WHERE(" + ("active=" + ((SQLiteDriverHandler_3)object10).c().LiteBansModule_31() + " AND(until<1 OR until>?)") + ")AND(");
                int n3 = jv_0Array2.length;
                while (n2 < n3) {
                    CommandSenderWrapper sender = jv_0Array2[n2];
                    object4 = sender.LiteBansModule_31();
                    stringBuilder.append("uuid=?");
                    ((ArrayList)object5).add(sender.BaseCoreGenericHandler());
                    if (object4 != null && !((HashSet)object6).contains(object4)) {
                        stringBuilder.append(" OR(ipban=").append(((SQLiteDriverHandler_3)object7).c().LiteBansModule_31()).append(" AND ").append("ip=?)");
                        ((ArrayList)object5).add(object4);
                        ((HashSet)object6).add(object4);
                    }
                    if (n > SQLiteDriverHandler_3.LiteBansModule_401.LiteBansModule_31()) break;
                    if (n2 != n3 - 1) {
                        stringBuilder.append(" OR ");
                    }
                    ++n2;
                    ++n;
                }
                n = 0;
                stringBuilder.append(")AND(server_scope='*' OR server_scope=? OR server_scope=?)");
                object3 = stringBuilder.toString();
                object4 = ((SQLiteDriverHandler_3)object7).g();
                boolean flag5 = false;
                if (((ConfigService)object4).g()) {
                    Object object11 = object4;
                    flag3 = false;
                    ((ConfigService)object11).BaseCoreGenericHandler((Object)(n2 + ": " + (String)object3));
                }
                object4 = ((SQLiteDriverHandler_3)object7).c((CharSequence)object3);
                LiteBansModule_184.BaseCoreGenericHandler((LiteBansModule_60)object4);
                object2 = object4;
                flag3 = false;
                Object object12 = object9 = object2;
                boolean flag6 = false;
                Iterable iterable = (Iterable)object5;
                boolean flag7 = false;
                for (Object t2 : iterable) {
                    String string = (String)t2;
                    boolean flag8 = false;
                    ((LiteBansModule_60)object2).BaseCoreGenericHandler(string);
                }
                object2 = object4;
                String string = jv_0Array2[0].LiteBansModule_240();
                int n4 = 0;
                object = object12 = object2;
                flag = false;
                ((LiteBansModule_60)object2).BaseCoreGenericHandler(string);
                object2 = object4;
                string = ((SQLiteDriverHandler_3)object7).AsyncBackgroundTask_5().ServerSyncService();
                n4 = 0;
                object = object12 = object2;
                flag = false;
                ((LiteBansModule_60)object2).BaseCoreGenericHandler(string);
                arrayList.add(object4);
                if (n2 >= jv_0Array2.length) break;
                ((ArrayList)object5).clear();
            }
            list = arrayList;
        }
        List list2 = list;
        object7 = new ConcurrentHashMap();
        object8 = list2;
        boolean bl9 = false;
        Iterator iterator = object8.iterator();
        while (iterator.hasNext()) {
            arrayList = iterator.next();
            LiteBansModule_60 bT2 = (LiteBansModule_60)((Object)arrayList);
            n = 0;
            object6 = LiteBansModule_184.c(bT2);
            if (!object6.next()) continue;
            do {
                String string;
                if ((string = ((SilentHandler)(object5 = gZ2.BaseCoreGenericHandler((ResultSet)object6, BanHandler.GnuSparseMapHandler))).DatabaseMonitorService()) != null && string.length() == 36) {
                    ((Map)object7).put(UUID.fromString(string), object5);
                }
                object3 = ((SQLiteDriverHandler_3)ch2).e().q();
                boolean bl10 = false;
                object4 = object3;
                object2 = new ArrayList();
                boolean bl11 = false;
                for (Object object12 : object4) {
                    object = (CommandSenderWrapper)object12;
                    flag = false;
                    if (!((SilentHandler)object5).BaseCoreGenericHandler(object.BaseCoreGenericHandler(), object.LiteBansModule_31(), DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), false, 1, null))) continue;
                    object2.add(object12);
                }
                object3 = (List)object2;
                bl10 = false;
                object4 = object3.iterator();
                while (object4.hasNext()) {
                    object2 = object4.next();
                    CommandSenderWrapper jv_03 = (CommandSenderWrapper)object2;
                    int n5 = 0;
                    ((Map)object7).put(jv_03.AsyncBackgroundTask_5(), object5);
                }
            } while (object6.next());
        }
        if (this.plugin().LiteBansModule_31().size() != ((ConcurrentHashMap)object7).size()) {
            this.plugin().BaseCoreGenericHandler((ConcurrentHashMap)object7);
        }
    }

    public final void BaseCoreGenericHandler(@NotNull String string, @NotNull SilentHandler dZ2) {
        try {
            UUID uUID = UUID.fromString(HexEncodingHelper.LiteBansModule_194(string));
            ((Map)this.plugin().LiteBansModule_31()).put(uUID, dZ2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
            ConfigService.BaseCoreGenericHandler(configService, illegalArgumentException, 0, 2, null);
        }
    }

    public final void BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4) {
        boolean flag = false;
        String string5 = string2;
        ObjectUtilities.BaseCoreGenericHandler((Object)string5);
        new LiteBansModule_212(this.plugin, string, string5, string3, string4).run();
    }

    public final SilentHandler BaseCoreGenericHandler(@NotNull UUID uUID, @Nullable String string, @Nullable String string2) {
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        DatabaseMonitorService w2 = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
        Object object = configService;
        boolean flag = false;
        if (ObjectUtilities.BaseCoreGenericHandler(LiteBansModule_253.BaseCoreGenericHandler((ConfigService)object), (Object)MessageKey.BaseCoreGenericHandler(object, false, true))) {
            return null;
        }
        object = (SilentHandler)this.plugin().LiteBansModule_31().get(uUID);
        if (object != null) {
            String string3 = uUID.toString();
            if (((SilentHandler)object).BaseCoreGenericHandler(string3, string, DatabaseMonitorService.BaseCoreGenericHandler(w2, false, 1, null))) {
                String string4;
                String string5 = ((SilentHandler)object).m();
                if (string5 == null) {
                    string5 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
                }
                if ((string4 = string2) == null) {
                    string4 = w2.ServerSyncService();
                }
                if (LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(string5, string4)) {
                    return object;
                }
            } else if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)((SilentHandler)object).PunishmentTableService())) {
                this.plugin().LiteBansModule_31().remove(uUID);
            }
            ConfigService q_03 = configService;
            boolean flag2 = false;
            if (q_03.g()) {
                ConfigService q_04 = q_03;
                boolean flag3 = false;
                q_04.BaseCoreGenericHandler((Object)("PlayerQuitListener! " + uUID));
            }
        }
        return null;
    }

    public final void BaseCoreGenericHandler(@Nullable String string, @Nullable String string2) {
        CommandSenderWrapper sender;
        Object object;
        LiteBansModule_212 g_2;
        block3: {
            if (string == null) {
                return;
            }
            g_2 = new LiteBansModule_212(this.plugin, null, string, string2, null);
            MessageHandler messageHandler = g_2;
            boolean flag = false;
            for (Object object2 : (Object[])messageHandler.LiteBansModule_240().q()) {
                CommandSenderWrapper jv_03 = (CommandSenderWrapper)object2;
                boolean flag2 = false;
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)jv_03.BaseCoreGenericHandler(), (Object)string)) continue;
                object = object2;
                break block3;
            }
            object = null;
        }
        if ((sender = (CommandSenderWrapper)object) != null) {
            g_2.run();
        }
    }

    public final boolean BaseCoreGenericHandler(@Nullable SilentHandler dZ2) {
        SilentHandler dZ3 = dZ2;
        if ((dZ3 != null ? dZ3.ServerSyncService() : null) == BanHandler.GnuSparseMapHandler) {
            boolean flag = CollectionUtilities.BaseCoreGenericHandler((Iterable)this.plugin().LiteBansModule_31().entrySet(), arg_0 -> PunishmentTableService.BaseCoreGenericHandler(dZ2, arg_0));
            if (flag) {
                this.plugin(dZ2.DatabaseMonitorService(), dZ2.PunishmentTableService());
            }
            return flag;
        }
        return false;
    }

    @Override
    public void c() {
        this.plugin().LiteBansModule_31().clear();
    }

    private static final boolean BaseCoreGenericHandler(SilentHandler dZ2, Map.Entry entry) {
        return dZ2.DatabaseMonitorService() != null && ObjectUtilities.BaseCoreGenericHandler((Object)dZ2.DatabaseMonitorService(), (Object)((SilentHandler)entry.getValue()).DatabaseMonitorService()) || dZ2.LiteBansModule_240() && dZ2.PunishmentTableService() != null && ObjectUtilities.BaseCoreGenericHandler((Object)dZ2.PunishmentTableService(), (Object)((SilentHandler)entry.getValue()).PunishmentTableService());
    }

    private static final void AsyncBackgroundTask_5() {
        c = new String[]{"", "SELECT * FROM ", " WHERE(", "active=", " AND(until<1 OR until>?)", ")AND(", "uuid=?", " OR(ipban=", " AND ", "ip=?)", " OR ", ")AND(server_scope='*' OR server_scope=? OR server_scope=?)", ": ", "PlayerQuitListener! "};
    }

    }

