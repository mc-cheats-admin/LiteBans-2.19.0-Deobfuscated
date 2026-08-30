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

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2) {
        boolean flag;
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
        if (jv_0Array2.length == 0) {
            list = CollectionUtilities.e();
        } else {
            arrayList = new ArrayList(Math.max(1, jv_0Array2.length / SQLiteDriverHandler_3.LiteBansModule_403.LiteBansModule_31()));
            n = 0;
            object6 = new HashSet(jv_0Array2.length);
            tempObj = new ArrayList(jv_0Array2.length * 2);
            while (true) {
                boolean flag3;
                Object object10 = object7;
                StringBuilder stringBuilder = new StringBuilder("SELECT * FROM " + object8 + " WHERE(" + ("active=" + ((SQLiteDriverHandler_3)object10).c().LiteBansModule_31() + " AND(until<1 OR until>?)") + ")AND(");
                int n3 = jv_0Array2.length;
                while (n2 < n3) {
                    CommandSenderWrapper sender = jv_0Array2[n2];
                    helperObj = sender.LiteBansModule_31();
                    stringBuilder.append("uuid=?");
                    ((ArrayList)tempObj).add(sender.BaseCoreGenericHandler());
                    if (helperObj != null && !((HashSet)object6).contains(helperObj)) {
                        stringBuilder.append(" OR(ipban=").append(((SQLiteDriverHandler_3)object7).c().LiteBansModule_31()).append(" AND ").append("ip=?)");
                        ((ArrayList)tempObj).add(helperObj);
                        ((HashSet)object6).add(helperObj);
                    }
                    if (n > SQLiteDriverHandler_3.LiteBansModule_403.LiteBansModule_31()) break;
                    if (n2 != n3 - 1) {
                        stringBuilder.append(" OR ");
                    }
                    ++n2;
                    ++n;
                }
                n = 0;
                stringBuilder.append(")AND(server_scope='*' OR server_scope=? OR server_scope=?)");
                resultObj = stringBuilder.toString();
                helperObj = ((SQLiteDriverHandler_3)object7).g();
                if (((ConfigService)helperObj).g()) {
                    Object object11 = helperObj;
                    flag3 = false;
                    ((ConfigService)object11).BaseCoreGenericHandler((Object)(n2 + ": " + (String)resultObj));
                }
                helperObj = ((SQLiteDriverHandler_3)object7).c((CharSequence)resultObj);
                LiteBansModule_185.BaseCoreGenericHandler((LiteBansModule_60)helperObj);
                contextObj = helperObj;
                flag3 = false;
                Object object12 = object9 = contextObj;
                Iterable iterable = (Iterable)tempObj;
                for (Object t2 : iterable) {
                    String string = (String)t2;
                    ((LiteBansModule_60)contextObj).BaseCoreGenericHandler(string);
                }
                contextObj = helperObj;
                String string = jv_0Array2[0].LiteBansModule_241();
                targetObj = object12 = contextObj;
                flag = false;
                ((LiteBansModule_60)contextObj).BaseCoreGenericHandler(string);
                contextObj = helperObj;
                string = ((SQLiteDriverHandler_3)object7).AsyncBackgroundTask_5().ServerSyncService();
                n4 = 0;
                targetObj = object12 = contextObj;
                flag = false;
                ((LiteBansModule_60)contextObj).BaseCoreGenericHandler(string);
                arrayList.add(helperObj);
                if (n2 >= jv_0Array2.length) break;
                ((ArrayList)tempObj).clear();
            }
            list = arrayList;
        }
        List list2 = list;
        object7 = new ConcurrentHashMap();
        object8 = list2;
        Iterator iterator = object8.iterator();
        while (iterator.hasNext()) {
            arrayList = iterator.next();
            LiteBansModule_60 bT2 = (LiteBansModule_60)((Object)arrayList);
            n = 0;
            object6 = LiteBansModule_185.c(bT2);
            if (!object6.next()) continue;
            do {
                String string;
                if ((string = ((SilentHandler)(tempObj = gZ2.BaseCoreGenericHandler((ResultSet)object6, BanHandler.GnuSparseMapHandler))).DatabaseMonitorService()) != null && string.length() == 36) {
                    ((Map)object7).put(UUID.fromString(string), tempObj);
                }
                resultObj = ((SQLiteDriverHandler_3)ch2).e().q();
                helperObj = resultObj;
                contextObj = new ArrayList();
                for (Object object12 : helperObj) {
                    targetObj = (CommandSenderWrapper)object12;
                    flag = false;
                    if (!((SilentHandler)tempObj).BaseCoreGenericHandler(targetObj.BaseCoreGenericHandler(), targetObj.LiteBansModule_31(), DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), false, 1, null))) continue;
                    contextObj.add(object12);
                }
                resultObj = (List)contextObj;
                bl10 = false;
                helperObj = resultObj.iterator();
                while (helperObj.hasNext()) {
                    contextObj = helperObj.next();
                    CommandSenderWrapper senderWrapper = (CommandSenderWrapper)contextObj;
                    ((Map)object7).put(senderWrapper.AsyncBackgroundTask_5(), tempObj);
                }
            } while (object6.next());
        }
        if (this.plugin().LiteBansModule_31().size() != ((ConcurrentHashMap)object7).size()) {
            this.plugin().BaseCoreGenericHandler((ConcurrentHashMap)object7);
        }
    }

    public final void BaseCoreGenericHandler(@NotNull String string, @NotNull SilentHandler dZ2) {
        try {
            UUID uUID = UUID.fromString(LiteBansModule_346.LiteBansModule_195(string));
            ((Map)this.plugin().LiteBansModule_31()).put(uUID, dZ2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
            ConfigService.BaseCoreGenericHandler(configService, illegalArgumentException, 0, 2, null);
        }
    }

    public final void BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4) {
        String string5 = string2;
        ObjectUtilities.BaseCoreGenericHandler((Object)string5);
        new LiteBansModule_213(this.plugin, string, string5, string3, string4).run();
    }

    public final SilentHandler BaseCoreGenericHandler(@NotNull UUID uUID, @Nullable String string, @Nullable String string2) {
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        DatabaseMonitorService w2 = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
        Object targetObj = configService;
        if (ObjectUtilities.BaseCoreGenericHandler(LiteBansModule_254.BaseCoreGenericHandler((ConfigService)targetObj), (Object)MessageKey.BaseCoreGenericHandler(targetObj, false, true))) {
            return null;
        }
        targetObj = (SilentHandler)this.plugin().LiteBansModule_31().get(uUID);
        if (targetObj != null) {
            String string3 = uUID.toString();
            if (((SilentHandler)targetObj).BaseCoreGenericHandler(string3, string, DatabaseMonitorService.BaseCoreGenericHandler(w2, false, 1, null))) {
                String string4;
                String string5 = ((SilentHandler)targetObj).m();
                if (string5 == null) {
                    string5 = LiteBansModule_182.LiteBansModule_195.LiteBansModule_31();
                }
                if ((string4 = string2) == null) {
                    string4 = w2.ServerSyncService();
                }
                if (LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(string5, string4)) {
                    return targetObj;
                }
            } else if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)((SilentHandler)targetObj).PunishmentTableService())) {
                this.plugin().LiteBansModule_31().remove(uUID);
            }
            ConfigService q_03 = configService;
            if (q_03.g()) {
                ConfigService q_04 = q_03;
                q_04.BaseCoreGenericHandler((Object)("PlayerQuitListener! " + uUID));
            }
        }
        return null;
    }

    public final void BaseCoreGenericHandler(@Nullable String string, @Nullable String string2) {
        CommandSenderWrapper sender;
        LiteBansModule_213 g_2;
        block3: {
            if (string == null) {
                return;
            }
            g_2 = new LiteBansModule_213(this.plugin, null, string, string2, null);
            MessageHandler messageHandler = g_2;
            for (Object contextObj : (Object[])messageHandler.LiteBansModule_241().q()) {
                CommandSenderWrapper senderWrapper = (CommandSenderWrapper)contextObj;
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)senderWrapper.BaseCoreGenericHandler(), (Object)string)) continue;
                targetObj = contextObj;
                break block3;
            }
            targetObj = null;
        }
        if ((sender = (CommandSenderWrapper)targetObj) != null) {
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
        return dZ2.DatabaseMonitorService() != null && ObjectUtilities.BaseCoreGenericHandler((Object)dZ2.DatabaseMonitorService(), (Object)((SilentHandler)entry.getValue()).DatabaseMonitorService()) || dZ2.LiteBansModule_241() && dZ2.PunishmentTableService() != null && ObjectUtilities.BaseCoreGenericHandler((Object)dZ2.PunishmentTableService(), (Object)((SilentHandler)entry.getValue()).PunishmentTableService());
    }

    private static final void AsyncBackgroundTask_5() {
        c = new String[]{"", "SELECT * FROM ", " WHERE(", "active=", " AND(until<1 OR until>?)", ")AND(", "uuid=?", " OR(ipban=", " AND ", "ip=?)", " OR ", ")AND(server_scope='*' OR server_scope=? OR server_scope=?)", ": ", "PlayerQuitListener! "};
    }

    static {
        PunishmentTableService.AsyncBackgroundTask_5();
    }
}

