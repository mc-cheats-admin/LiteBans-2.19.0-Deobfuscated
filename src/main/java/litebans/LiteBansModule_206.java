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

public final class LiteBansModule_206
extends MessageHandler {
    private final String GnuSparseMapHandler;
    private final LiteBansModule_82 LiteBansModule_401;
    private final CommandSenderWrapper LiteBansModule_194;
    private final boolean BroadcastService;
    private int AsyncBackgroundTask_5;
    private boolean PunishmentTableService;
    private boolean i;
    private boolean q;
    private boolean e;
    private int g;
    private int n;
    private final ArrayList r;
    private LiteBansModule_297 Utf8Handler_2;
    private String AsyncBackgroundTask_21;
    private String m;
    public LiteBansModule_206(@NotNull String string, @NotNull LiteBansModule_82 ch2, @Nullable CommandSenderWrapper sender, boolean flag, int n) {
        super(ch2.e());
        this.GnuSparseMapHandler = string;
        this.LiteBansModule_401 = ch2;
        this.LiteBansModule_194 = sender;
        this.BroadcastService = flag;
        this.AsyncBackgroundTask_5 = n;
        this.r = new ArrayList();
        this.m = "";
    }

    public /* synthetic */ LiteBansModule_206(String string, LiteBansModule_82 ch2, CommandSenderWrapper sender, boolean flag, int n, int n2, LiteBansModule_14 aJ2) {
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

    public final boolean LiteBansModule_194() {
        return this.e;
    }

    public final int Utf8Handler_2() {
        return this.g;
    }

    public final int m() {
        return this.n;
    }

    public final ArrayList LiteBansModule_240() {
        return this.r;
    }

    public final LiteBansModule_297 LiteBansModule_401() {
        return this.Utf8Handler_2;
    }

    public final String GnuSparseMapHandler() {
        return this.AsyncBackgroundTask_21;
    }

    public final String c() {
        return this.m;
    }

    public final LiteBansModule_206 i() {
        try {
            try {
                if (LiteBansCommand.i == null) {
                    throw new LiteBansException_2();
                }
            }
            catch (Exception v1) {
                var2_4 = this;
                var3_7 = false;
                ConfigService.BaseCoreGenericHandler((ConfigService)var2_4.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class), v1, 0, 2, null);
                this.AsyncBackgroundTask_5();
                throw new CommandExitException();
            }
            if (this.AsyncBackgroundTask_5 == 0) {
                var1_2 = this;
                var2_5 = false;
                this.AsyncBackgroundTask_5 = ((ConfigService)var1_2.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().HoverTextFormatter();
            }
            var3_8 = var1_2 = this.GnuSparseMapHandler;
            var2_6 = var3_8.toLowerCase(Locale.ENGLISH);
            var3_8 = this.LiteBansModule_401.BaseCoreGenericHandler((String)var1_2, this.AsyncBackgroundTask_5);
            v0 = (LiteBansModule_297)CollectionUtilities.AsyncBackgroundTask_5((List)var3_8);
            if (v0 == null) {
                this.AsyncBackgroundTask_5();
                throw new CommandExitException();
            }
            this.Utf8Handler_2 = var4_9 = v0;
            this.plugin(var2_6);
            this.plugin(var4_9.LiteBansModule_31());
            var5_10 = new HashSet<PunishmentService>(var3_8.size());
            var6_11 = var3_8.iterator();
            while (var6_11.hasNext()) {
                var8_12 = ((LiteBansModule_297)var6_11.next()).AsyncBackgroundTask_5();
                if (var8_12 == null || StringUtilities.BaseCoreGenericHandler((CharSequence)var8_12, '#', false, 2, null)) continue;
                ((Collection)var5_10).add(var8_12);
            }
            this.g = var5_10.size();
            this.AsyncBackgroundTask_21 = var4_9.i();
            var6_11 = this;
            var7_15 = false;
            var8_12 = var6_11;
            var9_17 = false;
            if (!((ConfigService)var8_12.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().PunishmentService()) ** GOTO lbl-1000
            var6_11 = this;
            var7_15 = false;
            var8_12 = var6_11;
            var9_17 = false;
            if (!((ConfigService)var8_12.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_3() && this.g > 1) {
                v1 = true;
            } else lbl-1000:
            // 2 sources

            {
                v1 = false;
            }
            this.e = v1;
            var6_11 = null;
            var7_16 = var1_2;
            var8_13 = false;
            if (0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler.i((String)var7_16)) {
                var6_11 = var3_8;
                this.AsyncBackgroundTask_21 = var1_2;
            } else {
                var6_11 = this.LiteBansModule_401.BaseCoreGenericHandler(this.AsyncBackgroundTask_21, this.AsyncBackgroundTask_5);
            }
            if (var6_11.isEmpty()) {
                this.AsyncBackgroundTask_5();
                throw new CommandExitException();
            }
            var7_16 = this.LiteBansModule_240().q();
            var8_14 = new HashSet<PunishmentService>(8);
            var9_18 = new HashMap<K, V>(8);
            v2 = this.r;
            ObjectUtilities.BaseCoreGenericHandler(var7_16);
            this.plugin(var8_14, var9_18, (List)var6_11, v2, var7_16);
            if (this.e) {
                this.plugin((List)var3_8, var8_14, var9_18, var7_16);
            }
            this.n = this.r.size();
            this.m = CollectionUtilities.BaseCoreGenericHandler(this.r, MessageKey.ProxyConnection, null, null, 0, null, (LiteBansModule_178)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, BaseCoreGenericHandler(litebans.LiteBansModule_327 ), (Llitebans/LiteBansModule_327;)Ljava/lang/CharSequence;)(), 30, null);
        }
        catch (LiteBansException var1_3) {
            if (!this.BroadcastService && this.LiteBansModule_194 != null) {
                ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, this.LiteBansModule_194, String.valueOf(var1_3.getMessage()), null, 4, null);
            }
            this.PunishmentTableService = true;
        }
        return this;
    }

    private final void BaseCoreGenericHandler(List list, HashSet hashSet, HashMap hashMap, CommandSenderWrapper[] jv_0Array) {
        int n = this.g;
        for (int i = 1; i < n; ++i) {
            String string = ((LiteBansModule_297)list.get(i)).AsyncBackgroundTask_5();
            List list2 = this.LiteBansModule_401.BaseCoreGenericHandler(string, this.AsyncBackgroundTask_5);
            if (list2.isEmpty()) continue;
            this.plugin(hashSet, hashMap, list2, this.r, jv_0Array);
        }
    }

    private final void BaseCoreGenericHandler(String string) {
        MessageHandler messageHandler = this;
        boolean flag = false;
        MessageHandler fg_03 = messageHandler;
        boolean flag2 = false;
        Set set = ((ConfigService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_23();
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
        Object object;
        Object object2;
        int n;
        Object object3;
        LiteBansModule_297 iA2;
        block3: {
            iA2 = this.Utf8Handler_2;
            Object object4 = iA2;
            if (object4 == null || (object4 = ((LiteBansModule_297)object4).LiteBansModule_31()) == null) {
                throw new LiteBansModule_35();
            }
            Object object5 = object4;
            CommandSenderWrapper[] jv_0Array = this.LiteBansModule_240().q();
            ObjectUtilities.BaseCoreGenericHandler(jv_0Array);
            object3 = jv_0Array;
            boolean flag3 = false;
            n = ((CommandSenderWrapper[])object3).length;
            for (int i = 0; i < n; ++i) {
                object = object2 = object3[i];
                flag2 = false;
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)object.BaseCoreGenericHandler(), object5)) continue;
                flag = true;
                break block3;
            }
            flag = false;
        }
        boolean flag4 = flag;
        object3 = null;
        Object object6 = object3 = flag4 ? MessageKey.BroadcastService : MessageKey.n;
        if (this.LiteBansModule_194 != null) {
            LiteBansModule_82 ch2 = this.LiteBansModule_401;
            n = 0;
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, this.LiteBansModule_194, AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.P, iA2, false, 2, null), null, 4, null);
            object2 = (CharSequence)object3;
            object = iA2.BaseCoreGenericHandler();
            flag2 = false;
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, this.LiteBansModule_194, "" + object2 + object, null, 4, null);
        }
        throw new LiteBansException(MessageKey.HikariPool);
    }

    public final void BaseCoreGenericHandler(@NotNull HashSet hashSet, @NotNull HashMap hashMap, @NotNull List list, @NotNull List list2, @NotNull CommandSenderWrapper[] jv_0Array) {
        Object object = this;
        boolean flag = false;
        Object object22 = object;
        boolean flag2 = false;
        DiscordWebhookClient eG2 = ((ConfigService)((MessageHandler)object22).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194();
        object = eG2.LiteBansModule_23();
        for (Object object22 : list) {
            boolean flag3;
            Object object3;
            CommandSenderWrapper sender;
            Object object4;
            boolean flag4;
            Object object5;
            Object object6;
            int n;
            boolean flag5;
            Date date;
            String string;
            String string2;
            String string3;
            block19: {
                CommandSenderWrapper jv_03;
                string3 = ((LiteBansModule_297)object22).LiteBansModule_240();
                string2 = ((LiteBansModule_297)object22).c();
                string = ((LiteBansModule_297)object22).AsyncBackgroundTask_5();
                date = ((LiteBansModule_297)object22).e();
                if (string2 == null || string3 == null) continue;
                LiteBansModule_297 iA2 = this.Utf8Handler_2;
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)(iA2 != null ? iA2.LiteBansModule_31() : null)) && System.currentTimeMillis() - date.getTime() > eG2.BroadcastService()) continue;
                String string4 = (String)hashMap.get(string2);
                if (string4 == null) {
                    ((Map)hashMap).put(string2, string3);
                } else if (!ObjectUtilities.BaseCoreGenericHandler((Object)string3, (Object)string4)) continue;
                if (!((Collection)object).isEmpty()) {
                    boolean flag6;
                    block18: {
                        String[] args = new String[]{string3.toLowerCase(Locale.ROOT), string2, string};
                        flag5 = false;
                        int n2 = args.length;
                        for (n = 0; n < n2; ++n) {
                            object5 = object6 = args[n];
                            int n3 = 0;
                            if (!CollectionUtilities.BaseCoreGenericHandler((Iterable)object, object5)) continue;
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
                for (CommandSenderWrapper jv_04 : jv_0Array) {
                    object4 = jv_04;
                    boolean flag7 = false;
                    if (!ObjectUtilities.BaseCoreGenericHandler((Object)object4.BaseCoreGenericHandler(), (Object)string2)) continue;
                    jv_03 = jv_04;
                    break block19;
                }
                jv_03 = sender = null;
            }
            if ((object3 = this.LiteBansModule_194) == null || (object3 = object3.LiteBansModule_240()) == null) {
                MessageHandler messageHandler = this;
                boolean flag8 = false;
                object3 = object6 = ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService();
            }
            if (sender != null) {
                object5 = sender.i();
                if (ObjectUtilities.BaseCoreGenericHandler((Object)string3, object5)) {
                    if (!hashSet.contains(object5)) {
                        SilentHandler dZ2 = null;
                        if (eG2.ak()) {
                            dZ2 = AllHandler_3.BaseCoreGenericHandler(this.LiteBansModule_401, string2, string, BanHandler.GnuSparseMapHandler, (String)object6, false, false, 48, null);
                            n = dZ2 != null ? 1 : 0;
                        }
                        MessageKey am2 = n != 0 ? MessageKey.PunishmentTableService : MessageKey.BroadcastService;
                        ((Collection)list2).add(new LiteBansModule_327(am2, (String)object5, string2, date, null, dZ2));
                        ((Collection)hashSet).add(object5);
                    } else {
                        flag5 = true;
                    }
                } else if (!hashSet.contains(string3)) {
                    ((Collection)list2).add(new LiteBansModule_327(MessageKey.n, string3, string2, date, null, null));
                    ((Collection)hashSet).add(string3);
                }
                flag4 = true;
            }
            if (hashSet.contains(string3)) {
                flag5 = true;
            }
            if (flag5 || flag4) continue;
            object5 = AllHandler_3.BaseCoreGenericHandler(this.LiteBansModule_401, string2, string, null, (String)object6, false, false, 52, null);
            SilentHandler dZ3 = null;
            int n4 = object5 != null ? 1 : 0;
            boolean bl9 = flag3 = object5 != null && !ObjectUtilities.BaseCoreGenericHandler((Object)((SilentHandler)object5).DatabaseMonitorService(), (Object)string2);
            if (eG2.ak()) {
                dZ3 = AllHandler_3.BaseCoreGenericHandler(this.LiteBansModule_401, string2, string, BanHandler.GnuSparseMapHandler, (String)object6, false, false, 48, null);
                int n5 = n = dZ3 != null ? 1 : 0;
            }
            if (n4 != 0) {
                this.i = true;
            }
            if (n != 0) {
                this.q = true;
            }
            object4 = flag3 ? MessageKey.cd : (n4 != 0 ? MessageKey.DatabaseMonitorService : (n != 0 ? MessageKey.PunishmentTableService : MessageKey.n));
            ((Collection)list2).add(new LiteBansModule_327((CharSequence)object4, string3, string2, date, (SilentHandler)object5, dZ3));
            ((Collection)hashSet).add(string3);
        }
    }

    private static final CharSequence BaseCoreGenericHandler(LiteBansModule_327 j02) {
        CharSequence charSequence = j02.AsyncBackgroundTask_5();
        CharSequence charSequence2 = j02.e();
        boolean flag = false;
        return "" + charSequence + charSequence2;
    }

    }

