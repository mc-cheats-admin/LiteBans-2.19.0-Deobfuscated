package litebans;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_207
extends MessageHandler {
    private final String GnuSparseMapHandler;
    private final LiteBansModule_83 LiteBansModule_403;
    private final CommandSenderWrapper LiteBansModule_195;
    private final boolean BroadcastService;
    private int AsyncBackgroundTask_5;
    private boolean PunishmentTableService;
    private boolean i;
    private boolean q;
    private boolean e;
    private int g;
    private int n;
    private final ArrayList r;
    private LiteBansModule_298 Utf8Handler_2;
    private String AsyncBackgroundTask_21;
    private String m;
        public LiteBansModule_207(@NotNull String string, @NotNull LiteBansModule_83 ch2, @Nullable CommandSenderWrapper sender, boolean flag, int n) {
        super(ch2.e());
        this.GnuSparseMapHandler = string;
        this.LiteBansModule_403 = ch2;
        this.LiteBansModule_195 = sender;
        this.BroadcastService = flag;
        this.AsyncBackgroundTask_5 = n;
        this.r = new ArrayList();
        this.m = "";
    }

    public /* synthetic */ LiteBansModule_207(String string, LiteBansModule_83 ch2, CommandSenderWrapper sender, boolean flag, int n, int n2, LiteBansModule_14 aJ2) {
        if ((n2 & 4) != 0) {
            sender = null;
        }
        if ((n2 & 8) != 0) {
            flag = true;
        }
        if ((n2 & 0x10) != 0) {
            n = 0;
        }
        this(string, ch2, sender, flag, n);
    }

    public final boolean e() {
        return this.PunishmentTableService;
    }

    public final boolean n() {
        return this.i;
    }

    public final boolean LiteBansModule_31() {
        return this.q;
    }

    public final boolean LiteBansModule_195() {
        return this.e;
    }

    public final int Utf8Handler_2() {
        return this.g;
    }

    public final int m() {
        return this.n;
    }

    public final ArrayList LiteBansModule_241() {
        return this.r;
    }

    public final LiteBansModule_298 LiteBansModule_403() {
        return this.Utf8Handler_2;
    }

    public final String GnuSparseMapHandler() {
        return this.AsyncBackgroundTask_21;
    }

    public final String c() {
        return this.m;
    }

    public final LiteBansModule_207 i() {
        try {
            try {
                if (LiteBansCommand.i == null) {
                    throw new LiteBansException_2();
                }
            }
            catch (Exception v1) {
                v2 = this;
                ConfigService.BaseCoreGenericHandler((ConfigService)v2.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class), v1, 0, 2, null);
                this.AsyncBackgroundTask_5();
                throw new CommandExitException();
            }
            if (this.AsyncBackgroundTask_5 == 0) {
                v3 = this;
                this.AsyncBackgroundTask_5 = ((ConfigService)v3.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().HoverTextFormatter();
            }
            v4 = v3 = this.GnuSparseMapHandler;
            v5 = v4.toLowerCase(Locale.ENGLISH);
            v4 = this.LiteBansModule_403.BaseCoreGenericHandler((String)v3, this.AsyncBackgroundTask_5);
            v0 = (LiteBansModule_298)CollectionUtilities.AsyncBackgroundTask_5((List)v4);
            if (v0 == null) {
                this.AsyncBackgroundTask_5();
                throw new CommandExitException();
            }
            this.Utf8Handler_2 = v6 = v0;
            this.plugin(v5);
            this.plugin(v6.LiteBansModule_31());
            v7 = new HashSet<PunishmentService>(v4.size());
            v8 = v4.iterator();
            while (v8.hasNext()) {
                v9 = ((LiteBansModule_298)v8.next()).AsyncBackgroundTask_5();
                if (v9 == null || StringUtilities.BaseCoreGenericHandler((CharSequence)v9, '#', false, 2, null)) continue;
                ((Collection)v7).add(v9);
            }
            this.g = v7.size();
            this.AsyncBackgroundTask_21 = v6.i();
            v8 = this;
            v9 = v8;
            if (!((ConfigService)v9.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().PunishmentService()) ** GOTO lbl-1000
            v8 = this;
            v9 = v8;
            if (!((ConfigService)v9.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_3() && this.g > 1) {
                v1 = true;
            } else lbl-1000:
                        {
                v1 = false;
            }
            this.e = v1;
            v10 = v3;
            if (LiteBansModule_346.BaseCoreGenericHandler.i((String)v10)) {
                v8 = v4;
                this.AsyncBackgroundTask_21 = v3;
            } else {
                v8 = this.LiteBansModule_403.BaseCoreGenericHandler(this.AsyncBackgroundTask_21, this.AsyncBackgroundTask_5);
            }
            if (v8.isEmpty()) {
                this.AsyncBackgroundTask_5();
                throw new CommandExitException();
            }
            v10 = this.LiteBansModule_241().q();
            v11 = new HashSet<PunishmentService>(8);
            v12 = new HashMap<K, V>(8);
            v2 = this.r;
            ObjectUtilities.BaseCoreGenericHandler(v10);
            this.plugin(v11, v12, (List)v8, v2, v10);
            if (this.e) {
                this.plugin((List)v4, v11, v12, v10);
            }
            this.n = this.r.size();
            this.m = CollectionUtilities.BaseCoreGenericHandler(this.r, MessageKey.ProxyConnection, null, null, 0, null, (LiteBansModule_179)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, BaseCoreGenericHandler(litebans.LiteBansModule_328 ), (Llitebans/LiteBansModule_328;)Ljava/lang/CharSequence;)(), 30, null);
        }
        catch (LiteBansException v13) {
            if (!this.BroadcastService && this.LiteBansModule_195 != null) {
                ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, this.LiteBansModule_195, String.valueOf(v13.getMessage()), null, 4, null);
            }
            this.PunishmentTableService = true;
        }
        return this;
    }

    private final void BaseCoreGenericHandler(List list, HashSet hashSet, HashMap hashMap, CommandSenderWrapper[] jv_0Array) {
        int n = this.g;
        for (int i = 1; i < n; ++i) {
            String string = ((LiteBansModule_298)list.get(i)).AsyncBackgroundTask_5();
            List list2 = this.LiteBansModule_403.BaseCoreGenericHandler(string, this.AsyncBackgroundTask_5);
            if (list2.isEmpty()) continue;
            this.plugin(hashSet, hashMap, list2, this.r, jv_0Array);
        }
    }

    private final void BaseCoreGenericHandler(String string) {
        MessageHandler messageHandler = this;
        MessageHandler fg_03 = messageHandler;
        Set set = ((ConfigService)fg_03.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_23();
        if (set.isEmpty()) {
            return;
        }
        if (CollectionUtilities.BaseCoreGenericHandler((Iterable)set, (Object)string)) {
            this.plugin();
            throw new CommandExitException();
        }
    }

    private final Void AsyncBackgroundTask_5() {
        throw new LiteBansModule_35();
    }

    private final Void BaseCoreGenericHandler() {
        boolean flag;
        boolean flag2;
        int n;
        LiteBansModule_298 iA2;
        block3: {
            iA2 = this.Utf8Handler_2;
            Object helperObj = iA2;
            if (helperObj == null || (helperObj = ((LiteBansModule_298)helperObj).LiteBansModule_31()) == null) {
                throw new LiteBansModule_35();
            }
            Object tempObj = helperObj;
            CommandSenderWrapper[] jv_0Array = this.LiteBansModule_241().q();
            ObjectUtilities.BaseCoreGenericHandler(jv_0Array);
            resultObj = jv_0Array;
            n = ((CommandSenderWrapper[])resultObj).length;
            for (int i = 0; i < n; ++i) {
                targetObj = contextObj = resultObj[i];
                flag2 = false;
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)targetObj.BaseCoreGenericHandler(), tempObj)) continue;
                flag = true;
                break block3;
            }
            flag = false;
        }
        boolean flag4 = flag;
        resultObj = null;
        Object object6 = resultObj = flag4 ? MessageKey.BroadcastService : MessageKey.n;
        if (this.LiteBansModule_195 != null) {
            LiteBansModule_83 ch2 = this.LiteBansModule_403;
            n = 0;
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, this.LiteBansModule_195, AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.P, iA2, false, 2, null), null, 4, null);
            contextObj = (CharSequence)resultObj;
            targetObj = iA2.BaseCoreGenericHandler();
            flag2 = false;
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, this.LiteBansModule_195, "" + contextObj + targetObj, null, 4, null);
        }
        throw new LiteBansException(MessageKey.HikariPool);
    }

    public final void BaseCoreGenericHandler(@NotNull HashSet hashSet, @NotNull HashMap hashMap, @NotNull List list, @NotNull List list2, @NotNull CommandSenderWrapper[] jv_0Array) {
                Object object22 = targetObj;
        DiscordWebhookClient eG2 = ((ConfigService)((MessageHandler)object22).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195();
        targetObj = eG2.LiteBansModule_23();
        for (Object object22 : list) {
            boolean flag3;
            CommandSenderWrapper sender;
            boolean flag4;
            int n;
            boolean flag5;
            Date date;
            String string;
            String string2;
            String string3;
            block19: {
                CommandSenderWrapper senderWrapper;
                string3 = ((LiteBansModule_298)object22).LiteBansModule_241();
                string2 = ((LiteBansModule_298)object22).c();
                string = ((LiteBansModule_298)object22).AsyncBackgroundTask_5();
                date = ((LiteBansModule_298)object22).e();
                if (string2 == null || string3 == null) continue;
                LiteBansModule_298 iA2 = this.Utf8Handler_2;
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)(iA2 != null ? iA2.LiteBansModule_31() : null)) && System.currentTimeMillis() - date.getTime() > eG2.BroadcastService()) continue;
                String string4 = (String)hashMap.get(string2);
                if (string4 == null) {
                    ((Map)hashMap).put(string2, string3);
                } else if (!ObjectUtilities.BaseCoreGenericHandler((Object)string3, (Object)string4)) continue;
                if (!((Collection)targetObj).isEmpty()) {
                    boolean flag6;
                    block18: {
                        String[] args = new String[]{string3.toLowerCase(Locale.ROOT), string2, string};
                        flag5 = false;
                        int n2 = args.length;
                        for (n = 0; n < n2; ++n) {
                            tempObj = object6 = args[n];
                            if (!CollectionUtilities.BaseCoreGenericHandler((Iterable)targetObj, tempObj)) continue;
                            flag6 = true;
                            break block18;
                        }
                        flag6 = false;
                    }
                    if (flag6) continue;
                }
                flag4 = false;
                flag5 = false;
                n = 0;
                for (CommandSenderWrapper senderWrapper : jv_0Array) {
                    helperObj = senderWrapper;
                    if (!ObjectUtilities.BaseCoreGenericHandler((Object)helperObj.BaseCoreGenericHandler(), (Object)string2)) continue;
                    senderWrapper = senderWrapper;
                    break block19;
                }
                senderWrapper = sender = null;
            }
            if ((resultObj = this.LiteBansModule_195) == null || (resultObj = resultObj.LiteBansModule_241()) == null) {
                MessageHandler messageHandler = this;
                resultObj = object6 = ((DatabaseMonitorService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService();
            }
            if (sender != null) {
                tempObj = sender.i();
                if (ObjectUtilities.BaseCoreGenericHandler((Object)string3, tempObj)) {
                    if (!hashSet.contains(tempObj)) {
                        SilentHandler dZ2 = null;
                        if (eG2.ak()) {
                            dZ2 = AllHandler_3.BaseCoreGenericHandler(this.LiteBansModule_403, string2, string, BanHandler.GnuSparseMapHandler, (String)object6, false, false, 48, null);
                            n = dZ2 != null ? 1 : 0;
                        }
                        MessageKey am2 = n != 0 ? MessageKey.PunishmentTableService : MessageKey.BroadcastService;
                        ((Collection)list2).add(new LiteBansModule_328(am2, (String)tempObj, string2, date, null, dZ2));
                        ((Collection)hashSet).add(tempObj);
                    } else {
                        flag5 = true;
                    }
                } else if (!hashSet.contains(string3)) {
                    ((Collection)list2).add(new LiteBansModule_328(MessageKey.n, string3, string2, date, null, null));
                    ((Collection)hashSet).add(string3);
                }
                flag4 = true;
            }
            if (hashSet.contains(string3)) {
                flag5 = true;
            }
            if (flag5 || flag4) continue;
            tempObj = AllHandler_3.BaseCoreGenericHandler(this.LiteBansModule_403, string2, string, null, (String)object6, false, false, 52, null);
            SilentHandler dZ3 = null;
            int n4 = tempObj != null ? 1 : 0;
            boolean bl9 = flag3 = tempObj != null && !ObjectUtilities.BaseCoreGenericHandler((Object)((SilentHandler)tempObj).DatabaseMonitorService(), (Object)string2);
            if (eG2.ak()) {
                dZ3 = AllHandler_3.BaseCoreGenericHandler(this.LiteBansModule_403, string2, string, BanHandler.GnuSparseMapHandler, (String)object6, false, false, 48, null);
                int n5 = n = dZ3 != null ? 1 : 0;
            }
            if (n4 != 0) {
                this.i = true;
            }
            if (n != 0) {
                this.q = true;
            }
            helperObj = flag3 ? MessageKey.cd : (n4 != 0 ? MessageKey.DatabaseMonitorService : (n != 0 ? MessageKey.PunishmentTableService : MessageKey.n));
            ((Collection)list2).add(new LiteBansModule_328((CharSequence)helperObj, string3, string2, date, (SilentHandler)tempObj, dZ3));
            ((Collection)hashSet).add(string3);
        }
    }

    private static final CharSequence BaseCoreGenericHandler(LiteBansModule_328 j02) {
        CharSequence charSequence = j02.AsyncBackgroundTask_5();
        CharSequence charSequence2 = j02.e();
        return "" + charSequence + charSequence2;
    }

    private static final void g() {
        LiteBansModule_241 = new String[]{""};
    }

    static {
        LiteBansModule_207.g();
    }
}

