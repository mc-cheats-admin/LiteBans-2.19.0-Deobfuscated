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
            catch (Exception v1) {
                                ConfigService.BaseCoreGenericHandler((ConfigService)arg1.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class), v1, 0, 2, null);
                this.AsyncBackgroundTask_5();
                throw new CommandExitException();
            }
            if (this.AsyncBackgroundTask_5 == 0) {
                                this.AsyncBackgroundTask_5 = ((ConfigService)arg2.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().HoverTextFormatter();
            }
            arg3 = arg2 = this.GnuSparseMapHandler;
            arg4 = arg3.toLowerCase(Locale.ENGLISH);
            arg3 = this.LiteBansModule_401.BaseCoreGenericHandler((String)arg2, this.AsyncBackgroundTask_5);
            v0 = (LiteBansModule_297)CollectionUtilities.AsyncBackgroundTask_5((List)arg3);
            if (v0 == null) {
                this.AsyncBackgroundTask_5();
                throw new CommandExitException();
            }
            this.Utf8Handler_2 = arg5 = v0;
            this.plugin(arg4);
            this.plugin(arg5.LiteBansModule_31());
            arg6 = new HashSet<PunishmentService>(arg3.size());
            arg7 = arg3.iterator();
            while (arg7.hasNext()) {
                arg8 = ((LiteBansModule_297)arg7.next()).AsyncBackgroundTask_5();
                if (arg8 == null || StringUtilities.BaseCoreGenericHandler(arg8, '#', false, 2, null)) continue;
                ((Collection)arg6).add(arg8);
            }
            this.g = arg6.size();
            this.AsyncBackgroundTask_21 = arg5.i();
                        arg8 = arg7;
            if (!((ConfigService)arg8.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().PunishmentService()) ** GOTO lbl-1000
                        arg8 = arg7;
            if (!((ConfigService)arg8.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_3() && this.g > 1) {
            } else lbl-1000:
                        {
            }
            this.e = v1;
            arg9 = arg2;
            if (HexEncodingHelper.BaseCoreGenericHandler.i((String)arg9)) {
                arg7 = arg3;
                this.AsyncBackgroundTask_21 = arg2;
            } else {
                arg7 = this.LiteBansModule_401.BaseCoreGenericHandler(this.AsyncBackgroundTask_21, this.AsyncBackgroundTask_5);
            }
            if (arg7.isEmpty()) {
                this.AsyncBackgroundTask_5();
                throw new CommandExitException();
            }
            arg9 = this.LiteBansModule_240().q();
            arg10 = new HashSet<PunishmentService>(8);
            arg11 = new HashMap<K, V>(8);
            v2 = this.r;
            ObjectUtilities.BaseCoreGenericHandler(arg9);
            this.plugin(arg10, arg11, (List)arg7, v2, arg9);
            if (this.e) {
                this.plugin((List)arg3, arg10, arg11, arg9);
            }
            this.n = this.r.size();
            this.m = CollectionUtilities.BaseCoreGenericHandler(this.r, MessageKey.ProxyConnection, null, null, 0, null, (LiteBansModule_178)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, BaseCoreGenericHandler(litebans.LiteBansModule_327 ), (Llitebans/LiteBansModule_327;)Ljava/lang/CharSequence;)(), 30, null);
        }
        catch (LiteBansException arg12) {
            if (!this.BroadcastService && this.LiteBansModule_194 != null) {
                ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, this.LiteBansModule_194, String.valueOf(arg12.getMessage()), null, 4, null);
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

    private final void BaseCoreGenericHandler(String string) {
        MessageHandler messageHandler = this;
        MessageHandler fg_03 = messageHandler;
        Set set = ((ConfigService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_23();
        if (set.isEmpty()) {
            return;
        }
        if (CollectionUtilities.BaseCoreGenericHandler((Iterable)set, string)) {
            this.plugin();
            throw new CommandExitException();
}

    private final Void AsyncBackgroundTask_5() {
        throw new LiteBansModule_35();
    }

    private final Void BaseCoreGenericHandler() {
        boolean flag;
        boolean flag2;
        int n;
        LiteBansModule_297 iA2;
{
            iA2 = this.Utf8Handler_2;
            Object helperObj = iA2;
            if (helperObj == null || (helperObj = ((LiteBansModule_297)helperObj).LiteBansModule_31()) == null) {
                throw new LiteBansModule_35();
            }
            Object tempObj = helperObj;
            CommandSenderWrapper[] jv_0Array = this.LiteBansModule_240().q();
            ObjectUtilities.BaseCoreGenericHandler(jv_0Array);
            resultObj = jv_0Array;
            n = ((CommandSenderWrapper[])resultObj).length;
            for (int i = 0; i < n; ++i) {
                targetObj = contextObj = resultObj[i];
                flag2 = false;
                if (!ObjectUtilities.BaseCoreGenericHandler(targetObj.BaseCoreGenericHandler(), tempObj)) continue;
                flag = true;
                break;
            }
            flag = false;
        }
        boolean flag4 = flag;
        resultObj = null;
        Object object6 = resultObj = flag4 ? MessageKey.BroadcastService : MessageKey.n;
        if (this.LiteBansModule_194 != null) {
            LiteBansModule_82 ch2 = this.LiteBansModule_401;
            n = 0;
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, this.LiteBansModule_194, AllHandler_3.BaseCoreGenericHandler(ch2, MessageKey.P, iA2, false, 2, null), null, 4, null);
            contextObj = resultObj;
            targetObj = iA2.BaseCoreGenericHandler();
            flag2 = false;
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, this.LiteBansModule_194, "" + contextObj + targetObj, null, 4, null);
        }
        throw new LiteBansException(MessageKey.HikariPool);
    }

    public final void BaseCoreGenericHandler(@NotNull HashSet hashSet, @NotNull HashMap hashMap, @NotNull List list, @NotNull List list2, @NotNull CommandSenderWrapper[] jv_0Array) {
                Object object22 = targetObj;
        DiscordWebhookClient eG2 = ((ConfigService)((MessageHandler)object22).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194();
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
{
                CommandSenderWrapper senderWrapper;
                string3 = ((LiteBansModule_297)object22).LiteBansModule_240();
                string2 = ((LiteBansModule_297)object22).c();
                string = ((LiteBansModule_297)object22).AsyncBackgroundTask_5();
                date = ((LiteBansModule_297)object22).e();
                if (string2 == null || string3 == null) continue;
                LiteBansModule_297 iA2 = this.Utf8Handler_2;
                if (!ObjectUtilities.BaseCoreGenericHandler(string2, (Object)(iA2 != null ? iA2.LiteBansModule_31() : null)) && System.currentTimeMillis() - date.getTime() > eG2.BroadcastService()) continue;
                String string4 = (String)hashMap.get(string2);
                if (string4 == null) {
                    ((Map)hashMap).put(string2, string3);
                } else if (!ObjectUtilities.BaseCoreGenericHandler(string3, string4)) continue;
                if (!targetObj.isEmpty()) {
                    boolean flag6;
{
                        String[] args = new String[]{string3.toLowerCase(Locale.ROOT), string2, string};
                        flag5 = false;
                        int n2 = args.length;
                        for (n = 0; n < n2; ++n) {
                            tempObj = object6 = args[n];
                            if (!CollectionUtilities.BaseCoreGenericHandler((Iterable)targetObj, tempObj)) continue;
                            flag6 = true;
                            break;
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
                    if (!ObjectUtilities.BaseCoreGenericHandler(helperObj.BaseCoreGenericHandler(), string2)) continue;
                    senderWrapper = senderWrapper;
                    break;
                }
                senderWrapper = sender = null;
            }
            if ((resultObj = this.LiteBansModule_194) == null || (resultObj = resultObj.LiteBansModule_240()) == null) {
                MessageHandler messageHandler = this;
                resultObj = object6 = ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService();
            }
            if (sender != null) {
                tempObj = sender.i();
                if (ObjectUtilities.BaseCoreGenericHandler(string3, tempObj)) {
                    if (!hashSet.contains(tempObj)) {
                        SilentHandler dZ2 = null;
                        if (eG2.ak()) {
                            dZ2 = AllHandler_3.BaseCoreGenericHandler(this.LiteBansModule_401, string2, string, BanHandler.GnuSparseMapHandler, (String)object6, false, false, 48, null);
                            n = dZ2 != null ? 1 : 0;
                        }
                        MessageKey am2 = n != 0 ? MessageKey.PunishmentTableService : MessageKey.BroadcastService;
                        ((Collection)list2).add(new LiteBansModule_327(am2, (String)tempObj, string2, date, null, dZ2));
                        ((Collection)hashSet).add(tempObj);
                    } else {
                        flag5 = true;
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
            tempObj = AllHandler_3.BaseCoreGenericHandler(this.LiteBansModule_401, string2, string, null, (String)object6, false, false, 52, null);
            SilentHandler dZ3 = null;
            int n4 = tempObj != null ? 1 : 0;
            boolean bl9 = flag3 = tempObj != null && !ObjectUtilities.BaseCoreGenericHandler((Object)((SilentHandler)tempObj).DatabaseMonitorService(), string2);
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
            helperObj = flag3 ? MessageKey.cd : (n4 != 0 ? MessageKey.DatabaseMonitorService : (n != 0 ? MessageKey.PunishmentTableService : MessageKey.n));
            ((Collection)list2).add(new LiteBansModule_327(helperObj, string3, string2, date, (SilentHandler)tempObj, dZ3));
            ((Collection)hashSet).add(string3);
}

    private static final CharSequence BaseCoreGenericHandler(LiteBansModule_327 j02) {
        CharSequence charSequence = j02.AsyncBackgroundTask_5();
        CharSequence charSequence2 = j02.e();
        return "" + charSequence + charSequence2;
}

