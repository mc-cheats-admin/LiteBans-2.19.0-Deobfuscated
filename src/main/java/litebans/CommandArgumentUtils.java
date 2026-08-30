package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import litebans.api.PlayerProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CommandArgumentUtils {
    public static final String BaseCoreGenericHandler(@NotNull MessageHandler messageHandler, @NotNull CommandSenderWrapper sender, @NotNull String[] args, @NotNull String string) {
        GlobalHandler_2 jG2 = LiteBansModule_181.LiteBansModule_194;
        Object object = messageHandler;
        boolean flag = false;
        object = ((DatabaseMonitorService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService();
        flag = false;
        LiteBansModule_181 eq_02 = jG2.BaseCoreGenericHandler(sender, CollectionUtilities.AsyncBackgroundTask_5(Arrays.copyOf(args, args.length)), (String)object, false);
        boolean flag2 = false;
        CharSequence charSequence = eq_02.BaseCoreGenericHandler();
        return charSequence == null || charSequence.length() == 0 ? LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(string, (String)object, sender) : eq_02.BaseCoreGenericHandler();
    }

    public static /* synthetic */ String BaseCoreGenericHandler(MessageHandler messageHandler, CommandSenderWrapper sender, String[] args, String string, int n, Object object) {
        if ((n & 4) != 0) {
            MessageHandler fg_03 = messageHandler;
            boolean flag = false;
            MessageHandler fg_04 = fg_03;
            boolean flag2 = false;
            string = ((ConfigService)fg_04.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().BuilderactionHandler();
        }
        return CommandArgumentUtils.BaseCoreGenericHandler(messageHandler, sender, args, string);
    }

    public static final void BaseCoreGenericHandler(@NotNull MessageHandler messageHandler, @NotNull CharSequence charSequence) {
        CommandSenderWrapper sender = (CommandSenderWrapper)MessageHandler.BaseCoreGenericHandler.LiteBansModule_31().get();
        if (sender != null) {
            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(sender, charSequence, messageHandler.LiteBansModule_240());
        }
    }

    public static final SilentHandler BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull SilentHandler dZ2, boolean flag, boolean flag2) {
        SilentHandler dZ3;
        SilentHandler dZ4 = dZ3 = dZ2;
        boolean flag3 = false;
        if (flag) {
            LiteBansModule_268.BaseCoreGenericHandler.LiteBansModule_31(ch2, ch2.e(), dZ2);
            PunishmentTableService p2 = (PunishmentTableService)ch2.e().BaseCoreGenericHandler(PunishmentTableService.class);
            BroadcastService o2 = (BroadcastService)ch2.e().BaseCoreGenericHandler(BroadcastService.class);
            if (flag2) {
                p2.BaseCoreGenericHandler(dZ2);
            }
            o2.BaseCoreGenericHandler(dZ2);
        } else {
            ch2.c(dZ2);
            dZ2.BaseCoreGenericHandler(ch2.LiteBansModule_31(dZ2));
            LiteBansModule_268.BaseCoreGenericHandler.BaseCoreGenericHandler(ch2, ch2.e(), dZ2);
        }
        return dZ3;
    }

    public static /* synthetic */ SilentHandler BaseCoreGenericHandler(LiteBansModule_82 ch2, SilentHandler dZ2, boolean flag, boolean flag2, int n, Object object) {
        if ((n & 2) != 0) {
            flag = false;
        }
        if ((n & 4) != 0) {
            flag2 = true;
        }
        return CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ2, flag, flag2);
    }

    public static final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull BroadcastHandler ij2, @NotNull CharSequence charSequence, @Nullable BanHandler a_2, @Nullable String string) {
        ServerSyncService u2 = (ServerSyncService)ch2.e().BaseCoreGenericHandler(ServerSyncService.class);
        CharSequence charSequence2 = charSequence;
        if (a_2 != null) {
            LiteBansModule_303 iF2 = ServerSyncService.GnuSparseMapHandler;
            Object[] objectArray = new CharSequence[3];
            objectArray[0] = charSequence;
            objectArray[1] = a_2;
            String string2 = string;
            if (string2 == null) {
                string2 = "";
            }
            objectArray[2] = string2;
            boolean flag = false;
            charSequence2 = ArrayUtilities.BaseCoreGenericHandler(objectArray, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
        }
        ServerSyncService.BaseCoreGenericHandler(u2, ij2, ch2, charSequence2, 0, 8, null);
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LiteBansModule_82 ch2, BroadcastHandler ij2, CharSequence charSequence, BanHandler a_2, String string, int n, Object object) {
        if ((n & 4) != 0) {
            a_2 = null;
        }
        if ((n & 8) != 0) {
            string = null;
        }
        CommandArgumentUtils.BaseCoreGenericHandler(ch2, ij2, charSequence, a_2, string);
    }

    public static final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull SilentHandler dZ2, int n) {
        int n2;
        BroadcastService o2 = (BroadcastService)ch2.e().BaseCoreGenericHandler(BroadcastService.class);
        ConfigService configService = (ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class);
        CommandSenderWrapper[] jv_0Array = ch2.e().q();
        ObjectUtilities.BaseCoreGenericHandler(jv_0Array);
        if (jv_0Array.length == 0) {
            return;
        }
        String string = dZ2.m();
        if (string == null) {
            ConfigService.BaseCoreGenericHandler(configService, dZ2, 0, 2, null);
            return;
        }
        Object object = jv_0Array;
        boolean flag = false;
        Object object2 = object;
        Collection<CommandSenderWrapper> collection = new ArrayList();
        boolean flag2 = false;
        int n3 = ((CommandSenderWrapper[])object2).length;
        for (n2 = 0; n2 < n3; ++n2) {
            CommandSenderWrapper sender;
            CommandSenderWrapper jv_03 = sender = object2[n2];
            boolean flag3 = false;
            ObjectUtilities.BaseCoreGenericHandler(jv_03);
            if (!(ch2.BaseCoreGenericHandler(dZ2, jv_03) && CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ2, jv_03))) continue;
            collection.add(sender);
        }
        object = (List)collection;
        flag = false;
        object2 = object.iterator();
        while (object2.hasNext()) {
            collection = object2.next();
            CommandSenderWrapper jv_04 = (CommandSenderWrapper)((Object)collection);
            n2 = 0;
            ObjectUtilities.BaseCoreGenericHandler(jv_04);
            CharSequence charSequence = GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, jv_04, n);
            o2.BaseCoreGenericHandler(jv_04, charSequence);
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LiteBansModule_82 ch2, SilentHandler dZ2, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = -1;
        }
        CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ2, n);
    }

    public static final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull SilentHandler dZ2, @NotNull CommandSenderWrapper sender) {
        return !dZ2.LiteBansModule_240() || ObjectUtilities.BaseCoreGenericHandler((Object)dZ2.DatabaseMonitorService(), (Object)sender.BaseCoreGenericHandler()) || !ch2.BaseCoreGenericHandler(sender.AsyncBackgroundTask_5(), dZ2.ServerSyncService());
    }

    public static final SilentHandler BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull LiteBansModule_327 j02, @NotNull SilentHandler dZ2, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, boolean flag) {
        SilentHandler dZ3 = dZ2;
        boolean flag2 = false;
        BroadcastService o2 = (BroadcastService)ch2.e().BaseCoreGenericHandler(BroadcastService.class);
        ConfigService configService = (ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class);
        CommandSenderWrapper sender = (CommandSenderWrapper)MessageHandler.BaseCoreGenericHandler.LiteBansModule_31().get();
        if (sender == null) {
            sender = ch2.e().HoverTextFormatter();
        }
        CommandSenderWrapper jv_03 = sender;
        ch2.e().getLogger().info("Banning linked account: " + string + " (linked to " + j02.e() + " via " + string4 + ')');
        Object object = dZ3.ServerSyncService();
        boolean flag3 = dZ3.AsyncBackgroundTask_5();
        long l3 = dZ3.BroadcastService();
        long l5 = dZ3.LiteBansModule_401();
        LiteBansModule_65 c12 = configService.AsyncBackgroundTask_21().BaseCoreGenericHandler(dZ3);
        if (c12 == null) {
            c12 = LiteBansModule_65.LiteBansModule_31.BaseCoreGenericHandler();
        }
        LiteBansModule_65 c13 = c12;
        LiteBansModule_297 iA2 = new LiteBansModule_297(string, string3, string4, null, 8, null);
        ObjectUtilities.BaseCoreGenericHandler(jv_03);
        CommandSenderWrapper jv_04 = jv_03;
        String string5 = ch2.BaseCoreGenericHandler(jv_03);
        String string6 = jv_03.BaseCoreGenericHandler();
        String string7 = dZ3.GnuSparseMapHandler();
        String string8 = dZ3.m();
        if (string8 == null) {
            string8 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
        }
        String string9 = string8;
        NoneHandler_2 cz2 = new NoneHandler_2((BanHandler)object, false, flag3, false, false, false, false, false, false, false, false, false, false, true, l3, l5, 0L, 0, c13, null, false, null, 0, null, iA2, null, null, jv_04, string5, string6, string9, string7, null, null, null, null, null, 117121018, 31, null);
        cz2.n().append(dZ3.LiteBansModule_31());
        object = cz2;
        flag3 = false;
        ((NoneHandler_2)object).BaseCoreGenericHandler(InitHandler.BaseCoreGenericHandler);
        LiteBansModule_297 iA3 = ((NoneHandler_2)object).AsyncBackgroundTask_22();
        LiteBansModule_297 iA4 = ((NoneHandler_2)object).AsyncBackgroundTask_22();
        SilentHandler dZ4 = new SilentHandler(((NoneHandler_2)object).ServerSyncService(), iA3 != null ? iA3.LiteBansModule_31() : null, iA4 != null ? iA4.i() : null, ((NoneHandler_2)object).n().toString(), dZ3.e(), dZ3.LiteBansModule_433(), ((NoneHandler_2)object).LiteBansModule_31(), ((NoneHandler_2)object).CommandThrottleService(), ((NoneHandler_2)object).J(), ((NoneHandler_2)object).DatabaseMonitorService(), ((NoneHandler_2)object).g().LiteBansModule_194(), ((NoneHandler_2)object).B(), ((NoneHandler_2)object).HoverTextFormatter() || flag, dZ3.AsyncBackgroundTask_22(), 0L, 16384, null);
        cz2.LiteBansModule_31(dZ4);
        ((NoneHandler_2)object).BaseCoreGenericHandler(InitHandler.i);
        BroadcastService o3 = o2;
        boolean flag4 = false;
        CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ4, false, false, 6, null);
        ((NoneHandler_2)object).BaseCoreGenericHandler(InitHandler.c);
        CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ4, 0, 2, null);
        ((NoneHandler_2)object).BaseCoreGenericHandler(InitHandler.e);
        o3.BaseCoreGenericHandler(ch2, dZ4, string);
        ((NoneHandler_2)object).BaseCoreGenericHandler(InitHandler.LiteBansModule_31);
        return dZ4;
    }

    public static /* synthetic */ SilentHandler BaseCoreGenericHandler(LiteBansModule_82 ch2, LiteBansModule_327 j02, SilentHandler dZ2, String string, String string2, String string3, String string4, boolean flag, int n, Object object) {
        if ((n & 0x10) != 0) {
            string3 = j02.LiteBansModule_31();
        }
        if ((n & 0x20) != 0) {
            string4 = string2;
        }
        if ((n & 0x40) != 0) {
            flag = false;
        }
        return CommandArgumentUtils.BaseCoreGenericHandler(ch2, j02, dZ2, string, string2, string3, string4, flag);
    }

    public static final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull SilentHandler dZ2, @Nullable LiteBansModule_297 iA2, long l3) {
        CharSequence[] charSequenceArray = new CharSequence[]{"duration", PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, l3, false, 2, null)};
        return AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)LiteBansModule_242.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.LiteBansModule_36, iA2, false, 2, null), charSequenceArray), (CharSequence)"seconds", l3 / (long)1000), dZ2, false, 2, null);
    }

    public static final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull LiteBansModule_82 ch3, @NotNull SilentHandler dZ2, long l3, long l5, long l7, @Nullable LiteBansModule_297 iA2, boolean flag) {
        SilentHandler dZ3;
        SilentHandler dZ4 = dZ3 = AllHandler_3.BaseCoreGenericHandler(ch3, dZ2.DatabaseMonitorService(), dZ2.PunishmentTableService(), dZ2.ServerSyncService(), dZ2.m(), true, false, 32, null);
        boolean flag2 = dZ4 != null ? dZ4.AsyncBackgroundTask_22() : false;
        if (flag2 && CommandArgumentUtils.BaseCoreGenericHandler(dZ3, l3, l5)) {
            long l8 = CommandArgumentUtils.LiteBansModule_31(dZ3, l3, l5);
            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ3, iA2, l8));
            throw new CommandExitException();
        }
        if (flag) {
            SilentHandler dZ5;
            String string = dZ2.e();
            BanHandler a_2 = dZ2.ServerSyncService();
            String string2 = dZ2.m();
            if (string2 == null) {
                string2 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
            }
            SilentHandler dZ6 = dZ5 = (SilentHandler)CollectionUtilities.AsyncBackgroundTask_5(ch3.BaseCoreGenericHandler(string, a_2, string2, 1));
            boolean flag3 = dZ6 != null ? dZ6.AsyncBackgroundTask_22() : false;
            if (flag3 && CommandArgumentUtils.BaseCoreGenericHandler(dZ5, l3, l5)) {
                long l9 = CommandArgumentUtils.LiteBansModule_31(dZ5, l3, l5);
                MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ5, iA2, l9));
                throw new CommandExitException();
            }
            if (l7 > 0L) {
                SilentHandler dZ7 = dZ5;
                if (ObjectUtilities.BaseCoreGenericHandler((Object)(dZ7 != null ? dZ7.AsyncBackgroundTask_21() : null), (Object)dZ2.e()) && !dZ5.AsyncBackgroundTask_22() && CommandArgumentUtils.BaseCoreGenericHandler(dZ5, l3, l7)) {
                    long l10 = CommandArgumentUtils.LiteBansModule_31(dZ5, l3, l7);
                    MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ5, iA2, l10));
                    throw new CommandExitException();
                }
            }
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LiteBansModule_82 ch2, LiteBansModule_82 ch3, SilentHandler dZ2, long l3, long l5, long l7, LiteBansModule_297 iA2, boolean flag, int n, Object object) {
        if ((n & 0x40) != 0) {
            flag = true;
        }
        CommandArgumentUtils.BaseCoreGenericHandler(ch2, ch3, dZ2, l3, l5, l7, iA2, flag);
    }

    private static final boolean BaseCoreGenericHandler(SilentHandler dZ2, long l3, long l5) {
        return l3 > dZ2.BroadcastService() && l3 - dZ2.BroadcastService() <= l5;
    }

    private static final long LiteBansModule_31(SilentHandler dZ2, long l3, long l5) {
        return Math.abs(l3 - dZ2.BroadcastService() - (l5 + (long)1000));
    }

    public static final String BaseCoreGenericHandler(@NotNull MessageHandler messageHandler, @NotNull String string) {
        String string2 = 0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler.Utf8Handler_2(string).AsyncBackgroundTask_5() == 0 ? PlayerProvider.get().provide(string) : string;
        ObjectUtilities.BaseCoreGenericHandler((Object)string2);
        return string2;
    }

    public static final String AsyncBackgroundTask_5(@NotNull MessageHandler messageHandler, @NotNull String string) {
        if (!0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler.LiteBansModule_240(string)) {
            return string;
        }
        MessageHandler fg_03 = messageHandler;
        boolean flag = false;
        long l3 = ((ConfigService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).Utf8Handler_2().LiteBansModule_31(string);
        if (l3 == -1L) {
            return string;
        }
        return String.valueOf(l3);
    }

    public static final CommandSenderWrapper LiteBansModule_31(@NotNull MessageHandler messageHandler, @NotNull String string) {
        NameHandler_3 jp_02 = 0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler.Utf8Handler_2(string);
        if (jp_02.AsyncBackgroundTask_5() == 1) {
            Object object;
            block5: {
                MessageHandler fg_03 = messageHandler;
                boolean flag = false;
                for (Object object2 : (Object[])fg_03.LiteBansModule_240().q()) {
                    CommandSenderWrapper sender = (CommandSenderWrapper)object2;
                    boolean flag2 = false;
                    if (!ObjectUtilities.BaseCoreGenericHandler((Object)sender.BaseCoreGenericHandler(), (Object)string)) continue;
                    object = object2;
                    break block5;
                }
                object = null;
            }
            return (CommandSenderWrapper)object;
        }
        String string2 = null;
        string2 = string;
        Object object = messageHandler;
        boolean flag = false;
        MessageHandler fg_04 = object;
        int n = 0;
        boolean flag3 = ((ConfigService)fg_04.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().F();
        if (flag3) {
            object = string2;
            string2 = ((String)object).toLowerCase(Locale.ENGLISH);
        }
        object = null;
        Object[] objectArray = messageHandler.LiteBansModule_240().q();
        boolean flag4 = false;
        for (Object object3 : objectArray) {
            String string3;
            CommandSenderWrapper jv_03 = (CommandSenderWrapper)object3;
            boolean flag5 = false;
            String string4 = jv_03.i();
            if (flag3 && StringUtilities.LiteBansModule_31((string3 = string4).toLowerCase(Locale.ENGLISH), string2, false, 2, null)) {
                object = jv_03;
            }
            if (!StringUtilities.BaseCoreGenericHandler(string4, string2, true)) continue;
            return jv_03;
        }
        return object;
    }

    public static final void c(@NotNull MessageHandler messageHandler, @NotNull String string) {
        boolean flag = false;
        CommandSenderWrapper sender = messageHandler.AsyncBackgroundTask_5();
        boolean flag2 = false;
        ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
        CommandSenderWrapper jv_03 = sender;
        boolean flag3 = false;
        CommandSenderWrapper jv_04 = jv_03;
        boolean flag4 = false;
        boolean flag5 = !jv_04.e(string);
        CharSequence charSequence = MessageKey.cZ;
        boolean flag6 = false;
        ChatFormatter fo_03 = chatFormatter;
        boolean flag7 = false;
        if (flag5) {
            ChatFormatter fo_04 = fo_03;
            boolean flag8 = false;
            fo_04.BaseCoreGenericHandler(charSequence);
            throw new CommandExitException();
        }
    }

    public static final void BaseCoreGenericHandler(@NotNull MessageHandler messageHandler, @NotNull String[] args) {
        boolean flag;
        Object object;
        boolean flag2;
        Object object2;
        ChatFormatter chatFormatter;
        block2: {
            chatFormatter = MessageHandler.BaseCoreGenericHandler;
            CommandSenderWrapper sender = messageHandler.AsyncBackgroundTask_5();
            object2 = Arrays.copyOf(args, args.length);
            flag2 = false;
            object = sender;
            String[] filteredArgs = Arrays.copyOf(object2, ((String[])object2).length);
            boolean flag3 = false;
            String[] parsedArgs = filteredArgs;
            boolean flag4 = false;
            int n = parsedArgs.length;
            for (int i = 0; i < n; ++i) {
                String string;
                String string2 = string = parsedArgs[i];
                boolean flag5 = false;
                if (!object.e(string2)) continue;
                flag = true;
                break block2;
            }
            flag = false;
        }
        boolean flag6 = !flag;
        object2 = MessageKey.cZ;
        flag2 = false;
        object = chatFormatter;
        boolean flag7 = false;
        if (flag6) {
            Object object3 = object;
            boolean flag8 = false;
            ((ChatFormatter)object3).BaseCoreGenericHandler(object2);
            throw new CommandExitException();
        }
    }

    public static final void BaseCoreGenericHandler(@NotNull MessageHandler var0, @NotNull LiteBansModule_65 v1, @NotNull LiteBansModule_66 v2) {
        v3 = v1.LiteBansModule_240().c();
        var4_4 = v2.c();
        var5_5 = MessageHandler.BaseCoreGenericHandler;
        if (v3 == null) ** GOTO lbl-1000
        var6_6 = var0.AsyncBackgroundTask_5();
        v7 = false;
        var8_14 = var6_6;
        var9_18 = false;
        if (var8_14.e(v3) == false) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        var6_7 = v0;
        var7_11 = MessageKey.cZ;
        var8_15 = false;
        var9_19 = var5_5;
        var10_22 = false;
        if (var6_7) {
            var11_23 = var9_19;
            var12_25 = false;
            var11_23.BaseCoreGenericHandler(var7_11);
            throw new CommandExitException();
        }
        var5_5 = MessageHandler.BaseCoreGenericHandler;
        if (var4_4 == null) ** GOTO lbl-1000
        v6 = var0.AsyncBackgroundTask_5();
        var7_12 = false;
        var8_16 = v6;
        var9_20 = false;
        if (var8_16.e(var4_4) == false) {
            v1 = true;
        } else lbl-1000:
        // 2 sources

        {
            v1 = false;
        }
        var6_9 = v1;
        var7_13 = MessageKey.cZ;
        var8_17 = false;
        var9_21 = var5_5;
        var10_22 = false;
        if (var6_9) {
            var11_24 = var9_21;
            var12_26 = false;
            var11_24.BaseCoreGenericHandler(var7_13);
            throw new CommandExitException();
        }
    }

    private static final LiteBansModule_297 BaseCoreGenericHandler(LiteBansModule_82 ch2, String string) {
        LiteBansModule_297 iA2 = ch2.c(string);
        if (iA2 == null) {
            throw new LiteBansModule_35();
        }
        return iA2;
    }

    public static final LiteBansModule_297 BaseCoreGenericHandler(@NotNull LiteBansModule_82 var0, @NotNull String v1, boolean v2) {
        block4: {
            v3 = v1;
            if (StringUtilities.c((CharSequence)v3, ':', false, 2, null)) {
                v3 = StringUtilities.BaseCoreGenericHandler(v3, "user:", null, 2, null);
            }
            var4_4 = CommandArgumentUtils.BaseCoreGenericHandler(var0, v3);
            if (!v2) break block4;
            var5_5 = var4_4.LiteBansModule_31();
            var6_6 = false;
            if (var5_5 == null) ** GOTO lbl-1000
            v0 = StringUtilities.BaseCoreGenericHandler((CharSequence)var5_5, 14);
            var7_7 = '4';
            if (v0 != null && v0.charValue() == var7_7) {
                v1 = true;
            } else lbl-1000:
            // 2 sources

            {
                v1 = false;
            }
            if (v1 && !0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler(v3)) {
                v2 = var4_4.LiteBansModule_31();
                ObjectUtilities.BaseCoreGenericHandler((Object)v2);
                return CommandArgumentUtils.BaseCoreGenericHandler(var0, v2);
            }
        }
        return var4_4;
    }

    public static /* synthetic */ LiteBansModule_297 BaseCoreGenericHandler(LiteBansModule_82 ch2, String string, boolean flag, int n, Object object) {
        if ((n & 2) != 0) {
            flag = true;
        }
        return CommandArgumentUtils.BaseCoreGenericHandler(ch2, string, flag);
    }

    public static final String[] BaseCoreGenericHandler(@NotNull MuteHandler var0, @NotNull String v1, @NotNull String[] v2) {
        block33: {
            block29: {
                block28: {
                    block32: {
                        block31: {
                            block30: {
                                block27: {
                                    v3 = v1;
                                    var4_4 = v2.length;
                                    var5_5 = StringUtilities.LiteBansModule_31((String)v3, "temp", false, 2, null);
                                    if (var5_5) {
                                        v3 = v3.substring(4);
                                    }
                                    if (var6_6 = StringUtilities.LiteBansModule_31((String)v3, "litebans:", false, 2, null)) {
                                        v3 = v3.substring(9);
                                    }
                                    var8_7 = v3;
                                    switch (var8_7.hashCode()) {
                                        case -1396405339: {
                                            if (!var8_7.equals("ban-ip")) {
                                                ** break;
                                            }
                                            break block27;
                                        }
                                        case 3641990: {
                                            if (!var8_7.equals("warn")) {
                                                ** break;
                                            }
                                            break block28;
                                        }
                                        case 111426262: {
                                            if (var8_7.equals("unban")) break;
                                            ** break;
                                        }
                                        case -840127329: {
                                            if (!var8_7.equals("unwarn")) {
                                                ** break;
                                            }
                                            break block29;
                                        }
                                        case 100403592: {
                                            if (!var8_7.equals("ipban")) {
                                                ** break;
                                            }
                                            break block27;
                                        }
                                        case 93503862: {
                                            if (!var8_7.equals("banip")) {
                                                ** break;
                                            }
                                            break block27;
                                        }
                                        case -1062781696: {
                                            if (!var8_7.equals("muteip")) {
                                                ** break;
                                            }
                                            break block30;
                                        }
                                        case -1182108736: {
                                            if (!var8_7.equals("ipmute")) {
                                                ** break;
                                            }
                                            break block30;
                                        }
                                        case 3363353: {
                                            if (!var8_7.equals("mute")) {
                                                ** break;
                                            }
                                            break block31;
                                        }
                                        case -840405966: {
                                            if (!var8_7.equals("unmute")) {
                                                ** break;
                                            }
                                            break block32;
                                        }
                                    }
                                    v0 = "-U";
                                    break block33;
                                }
                                v0 = "-BanHandler_5";
                                break block33;
                            }
                            v0 = "-IM";
                            break block33;
                        }
                        v0 = "-PlayerQuitListener";
                        break block33;
                    }
                    v0 = "-MU";
                    break block33;
                }
                v0 = "-W";
                break block33;
            }
            v0 = "-WU";
            break block33;
lbl69:
            // 11 sources

            if (!var6_6) {
                v0 = "-";
            } else {
                return v2;
            }
        }
        var7_8 = v0;
        if (var5_5) {
            var7_8 = var7_8 + 'T';
        }
        var8_7 = (String[])ArrayUtilities.BaseCoreGenericHandler(v2, new String[var4_4 + 1], 1, 0, 0, 12, null);
        var8_7[0] = var7_8;
        if (ObjectUtilities.BaseCoreGenericHandler((Object)var7_8, (Object)"-")) {
            return v2;
        }
        return var8_7;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "\ufeff", "Banning linked account: ", " (linked to ", " via ", "duration", "seconds", "user:", "#", "#", "#", "#", "#", "#", "temp", "litebans:", "ban-ip", "warn", "unban", "unwarn", "ipban", "banip", "muteip", "ipmute", "mute", "unmute", "-U", "-BanHandler_5", "-IM", "-PlayerQuitListener", "-MU", "-W", "-WU", "-", "-"};
    }

    }

