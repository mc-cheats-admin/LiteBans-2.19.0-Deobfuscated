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
        GlobalHandler_2 jG2 = LiteBansModule_182.LiteBansModule_195;
        Object targetObj = messageHandler;
        targetObj = ((DatabaseMonitorService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService();
        flag = false;
        LiteBansModule_182 eq_02 = jG2.BaseCoreGenericHandler(sender, CollectionUtilities.AsyncBackgroundTask_5(Arrays.copyOf(args, args.length)), (String)targetObj, false);
        CharSequence charSequence = eq_02.BaseCoreGenericHandler();
        return charSequence == null || charSequence.length() == 0 ? LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(string, (String)targetObj, sender) : eq_02.BaseCoreGenericHandler();
    }

    public static /* synthetic */ String BaseCoreGenericHandler(MessageHandler messageHandler, CommandSenderWrapper sender, String[] args, String string, int n, Object targetObj) {
        if ((n & 4) != 0) {
            MessageHandler fg_03 = messageHandler;
            MessageHandler fg_04 = fg_03;
            string = ((ConfigService)fg_04.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().BuilderactionHandler();
        }
        return CommandArgumentUtils.BaseCoreGenericHandler(messageHandler, sender, args, string);
    }

    public static final void BaseCoreGenericHandler(@NotNull MessageHandler messageHandler, @NotNull CharSequence charSequence) {
        CommandSenderWrapper sender = (CommandSenderWrapper)MessageHandler.BaseCoreGenericHandler.LiteBansModule_31().get();
        if (sender != null) {
            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(sender, charSequence, messageHandler.LiteBansModule_241());
        }
    }

    public static final SilentHandler BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull SilentHandler dZ2, boolean flag, boolean flag2) {
        SilentHandler dZ3;
        SilentHandler dZ4 = dZ3 = dZ2;
        if (flag) {
            LiteBansModule_269.BaseCoreGenericHandler.LiteBansModule_31(ch2, ch2.e(), dZ2);
            PunishmentTableService p2 = (PunishmentTableService)ch2.e().BaseCoreGenericHandler(PunishmentTableService.class);
            BroadcastService o2 = (BroadcastService)ch2.e().BaseCoreGenericHandler(BroadcastService.class);
            if (flag2) {
                p2.BaseCoreGenericHandler(dZ2);
            }
            o2.BaseCoreGenericHandler(dZ2);
        } else {
            ch2.c(dZ2);
            dZ2.BaseCoreGenericHandler(ch2.LiteBansModule_31(dZ2));
            LiteBansModule_269.BaseCoreGenericHandler.BaseCoreGenericHandler(ch2, ch2.e(), dZ2);
        }
        return dZ3;
    }

    public static /* synthetic */ SilentHandler BaseCoreGenericHandler(LiteBansModule_83 ch2, SilentHandler dZ2, boolean flag, boolean flag2, int n, Object targetObj) {
        if ((n & 2) != 0) {
            flag = false;
        }
        if ((n & 4) != 0) {
            flag2 = true;
        }
        return CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ2, flag, flag2);
    }

    public static final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull BroadcastHandler ij2, @NotNull CharSequence charSequence, @Nullable BanHandler a_2, @Nullable String string) {
        ServerSyncService u2 = (ServerSyncService)ch2.e().BaseCoreGenericHandler(ServerSyncService.class);
        CharSequence charSequence2 = charSequence;
        if (a_2 != null) {
            LiteBansModule_304 iF2 = ServerSyncService.GnuSparseMapHandler;
            Object[] objectArray = new CharSequence[3];
            objectArray[0] = charSequence;
            objectArray[1] = a_2;
            String string2 = string;
            if (string2 == null) {
                string2 = "";
            }
            objectArray[2] = string2;
            charSequence2 = ArrayUtilities.BaseCoreGenericHandler(objectArray, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
        }
        ServerSyncService.BaseCoreGenericHandler(u2, ij2, ch2, charSequence2, 0, 8, null);
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LiteBansModule_83 ch2, BroadcastHandler ij2, CharSequence charSequence, BanHandler a_2, String string, int n, Object targetObj) {
        if ((n & 4) != 0) {
            a_2 = null;
        }
        if ((n & 8) != 0) {
            string = null;
        }
        CommandArgumentUtils.BaseCoreGenericHandler(ch2, ij2, charSequence, a_2, string);
    }

    public static final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull SilentHandler dZ2, int n) {
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
        Object targetObj = jv_0Array;
        Object contextObj = targetObj;
        Collection<CommandSenderWrapper> collection = new ArrayList();
        int n3 = ((CommandSenderWrapper[])contextObj).length;
        for (n2 = 0; n2 < n3; ++n2) {
            CommandSenderWrapper sender;
            CommandSenderWrapper senderWrapper = sender = contextObj[n2];
            ObjectUtilities.BaseCoreGenericHandler(senderWrapper);
            if (!(ch2.BaseCoreGenericHandler(dZ2, senderWrapper) && CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ2, senderWrapper))) continue;
            collection.add(sender);
        }
        targetObj = (List)collection;
        flag = false;
        contextObj = targetObj.iterator();
        while (contextObj.hasNext()) {
            collection = contextObj.next();
            CommandSenderWrapper senderWrapper = (CommandSenderWrapper)((Object)collection);
            n2 = 0;
            ObjectUtilities.BaseCoreGenericHandler(senderWrapper);
            CharSequence charSequence = GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, senderWrapper, n);
            o2.BaseCoreGenericHandler(senderWrapper, charSequence);
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LiteBansModule_83 ch2, SilentHandler dZ2, int n, int n2, Object targetObj) {
        if ((n2 & 2) != 0) {
            n = -1;
        }
        CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ2, n);
    }

    public static final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull SilentHandler dZ2, @NotNull CommandSenderWrapper sender) {
        return !dZ2.LiteBansModule_241() || ObjectUtilities.BaseCoreGenericHandler((Object)dZ2.DatabaseMonitorService(), (Object)sender.BaseCoreGenericHandler()) || !ch2.BaseCoreGenericHandler(sender.AsyncBackgroundTask_5(), dZ2.ServerSyncService());
    }

    public static final SilentHandler BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull LiteBansModule_328 j02, @NotNull SilentHandler dZ2, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, boolean flag) {
        SilentHandler dZ3 = dZ2;
        BroadcastService o2 = (BroadcastService)ch2.e().BaseCoreGenericHandler(BroadcastService.class);
        ConfigService configService = (ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class);
        CommandSenderWrapper sender = (CommandSenderWrapper)MessageHandler.BaseCoreGenericHandler.LiteBansModule_31().get();
        if (sender == null) {
            sender = ch2.e().HoverTextFormatter();
        }
        CommandSenderWrapper senderWrapper = sender;
        ch2.e().getLogger().info("Banning linked account: " + string + " (linked to " + j02.e() + " via " + string4 + ')');
        Object targetObj = dZ3.ServerSyncService();
        boolean flag3 = dZ3.AsyncBackgroundTask_5();
        long l3 = dZ3.BroadcastService();
        long l5 = dZ3.LiteBansModule_403();
        LiteBansModule_65 c12 = configService.AsyncBackgroundTask_21().BaseCoreGenericHandler(dZ3);
        if (c12 == null) {
            c12 = LiteBansModule_65.LiteBansModule_31.BaseCoreGenericHandler();
        }
        LiteBansModule_65 c13 = c12;
        LiteBansModule_298 iA2 = new LiteBansModule_298(string, string3, string4, null, 8, null);
        ObjectUtilities.BaseCoreGenericHandler(senderWrapper);
        CommandSenderWrapper senderWrapper = senderWrapper;
        String string5 = ch2.BaseCoreGenericHandler(senderWrapper);
        String string6 = senderWrapper.BaseCoreGenericHandler();
        String string7 = dZ3.GnuSparseMapHandler();
        String string8 = dZ3.m();
        if (string8 == null) {
            string8 = LiteBansModule_182.LiteBansModule_195.LiteBansModule_31();
        }
        String string9 = string8;
        NoneHandler_2 cz2 = new NoneHandler_2((BanHandler)targetObj, false, flag3, false, false, false, false, false, false, false, false, false, false, true, l3, l5, 0L, 0, c13, null, false, null, 0, null, iA2, null, null, senderWrapper, string5, string6, string9, string7, null, null, null, null, null, 117121018, 31, null);
        cz2.n().append(dZ3.LiteBansModule_31());
        targetObj = cz2;
        flag3 = false;
        ((NoneHandler_2)targetObj).BaseCoreGenericHandler(InitHandler.BaseCoreGenericHandler);
        LiteBansModule_298 iA3 = ((NoneHandler_2)targetObj).AsyncBackgroundTask_22();
        LiteBansModule_298 iA4 = ((NoneHandler_2)targetObj).AsyncBackgroundTask_22();
        SilentHandler dZ4 = new SilentHandler(((NoneHandler_2)targetObj).ServerSyncService(), iA3 != null ? iA3.LiteBansModule_31() : null, iA4 != null ? iA4.i() : null, ((NoneHandler_2)targetObj).n().toString(), dZ3.e(), dZ3.LiteBansModule_435(), ((NoneHandler_2)targetObj).LiteBansModule_31(), ((NoneHandler_2)targetObj).CommandThrottleService(), ((NoneHandler_2)targetObj).J(), ((NoneHandler_2)targetObj).DatabaseMonitorService(), ((NoneHandler_2)targetObj).g().LiteBansModule_195(), ((NoneHandler_2)targetObj).B(), ((NoneHandler_2)targetObj).HoverTextFormatter() || flag, dZ3.AsyncBackgroundTask_22(), 0L, 16384, null);
        cz2.LiteBansModule_31(dZ4);
        ((NoneHandler_2)targetObj).BaseCoreGenericHandler(InitHandler.i);
        BroadcastService o3 = o2;
        CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ4, false, false, 6, null);
        ((NoneHandler_2)targetObj).BaseCoreGenericHandler(InitHandler.c);
        CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ4, 0, 2, null);
        ((NoneHandler_2)targetObj).BaseCoreGenericHandler(InitHandler.e);
        o3.BaseCoreGenericHandler(ch2, dZ4, string);
        ((NoneHandler_2)targetObj).BaseCoreGenericHandler(InitHandler.LiteBansModule_31);
        return dZ4;
    }

    public static /* synthetic */ SilentHandler BaseCoreGenericHandler(LiteBansModule_83 ch2, LiteBansModule_328 j02, SilentHandler dZ2, String string, String string2, String string3, String string4, boolean flag, int n, Object targetObj) {
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

    public static final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull SilentHandler dZ2, @Nullable LiteBansModule_298 iA2, long l3) {
        CharSequence[] charSequenceArray = new CharSequence[]{"duration", PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, l3, false, 2, null)};
        return AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)LiteBansModule_243.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.LiteBansModule_36, iA2, false, 2, null), charSequenceArray), (CharSequence)"seconds", l3 / (long)1000), dZ2, false, 2, null);
    }

    public static final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull LiteBansModule_83 ch3, @NotNull SilentHandler dZ2, long l3, long l5, long l7, @Nullable LiteBansModule_298 iA2, boolean flag) {
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
                string2 = LiteBansModule_182.LiteBansModule_195.LiteBansModule_31();
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

    public static /* synthetic */ void BaseCoreGenericHandler(LiteBansModule_83 ch2, LiteBansModule_83 ch3, SilentHandler dZ2, long l3, long l5, long l7, LiteBansModule_298 iA2, boolean flag, int n, Object targetObj) {
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
        String string2 = LiteBansModule_346.BaseCoreGenericHandler.Utf8Handler_2(string).AsyncBackgroundTask_5() == 0 ? PlayerProvider.get().provide(string) : string;
        ObjectUtilities.BaseCoreGenericHandler((Object)string2);
        return string2;
    }

    public static final String AsyncBackgroundTask_5(@NotNull MessageHandler messageHandler, @NotNull String string) {
        if (!LiteBansModule_346.BaseCoreGenericHandler.LiteBansModule_241(string)) {
            return string;
        }
        MessageHandler fg_03 = messageHandler;
        long l3 = ((ConfigService)fg_03.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).Utf8Handler_2().LiteBansModule_31(string);
        if (l3 == -1L) {
            return string;
        }
        return String.valueOf(l3);
    }

    public static final CommandSenderWrapper LiteBansModule_31(@NotNull MessageHandler messageHandler, @NotNull String string) {
        NameHandler_3 jp_02 = LiteBansModule_346.BaseCoreGenericHandler.Utf8Handler_2(string);
        if (jp_02.AsyncBackgroundTask_5() == 1) {
            block5: {
                MessageHandler fg_03 = messageHandler;
                for (Object contextObj : (Object[])fg_03.LiteBansModule_241().q()) {
                    CommandSenderWrapper sender = (CommandSenderWrapper)contextObj;
                    if (!ObjectUtilities.BaseCoreGenericHandler((Object)sender.BaseCoreGenericHandler(), (Object)string)) continue;
                    targetObj = contextObj;
                    break block5;
                }
                targetObj = null;
            }
            return (CommandSenderWrapper)targetObj;
        }
        String string2 = null;
        string2 = string;
        Object targetObj = messageHandler;
        MessageHandler fg_04 = targetObj;
        boolean flag3 = ((ConfigService)fg_04.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().F();
        if (flag3) {
            targetObj = string2;
            string2 = ((String)targetObj).toLowerCase(Locale.ENGLISH);
        }
        targetObj = null;
        Object[] objectArray = messageHandler.LiteBansModule_241().q();
        for (Object resultObj : objectArray) {
            String string3;
            CommandSenderWrapper senderWrapper = (CommandSenderWrapper)resultObj;
            String string4 = senderWrapper.i();
            if (flag3 && StringUtilities.LiteBansModule_31((string3 = string4).toLowerCase(Locale.ENGLISH), string2, false, 2, null)) {
                targetObj = senderWrapper;
            }
            if (!StringUtilities.BaseCoreGenericHandler(string4, string2, true)) continue;
            return senderWrapper;
        }
        return targetObj;
    }

    public static final void c(@NotNull MessageHandler messageHandler, @NotNull String string) {
        CommandSenderWrapper sender = messageHandler.AsyncBackgroundTask_5();
        ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
        CommandSenderWrapper senderWrapper = sender;
        CommandSenderWrapper senderWrapper = senderWrapper;
        boolean flag5 = !senderWrapper.e(string);
        CharSequence charSequence = MessageKey.cZ;
        ChatFormatter fo_03 = chatFormatter;
        if (flag5) {
            ChatFormatter fo_04 = fo_03;
            fo_04.BaseCoreGenericHandler(charSequence);
            throw new CommandExitException();
        }
    }

    public static final void BaseCoreGenericHandler(@NotNull MessageHandler messageHandler, @NotNull String[] args) {
        boolean flag;
        boolean flag2;
        ChatFormatter chatFormatter;
        block2: {
            chatFormatter = MessageHandler.BaseCoreGenericHandler;
            CommandSenderWrapper sender = messageHandler.AsyncBackgroundTask_5();
            contextObj = Arrays.copyOf(args, args.length);
            flag2 = false;
            targetObj = sender;
            String[] filteredArgs = Arrays.copyOf(contextObj, ((String[])contextObj).length);
            String[] parsedArgs = filteredArgs;
            int n = parsedArgs.length;
            for (int i = 0; i < n; ++i) {
                String string;
                String string2 = string = parsedArgs[i];
                if (!targetObj.e(string2)) continue;
                flag = true;
                break block2;
            }
            flag = false;
        }
        boolean flag6 = !flag;
        contextObj = MessageKey.cZ;
        flag2 = false;
        targetObj = chatFormatter;
        if (flag6) {
            Object resultObj = targetObj;
            ((ChatFormatter)resultObj).BaseCoreGenericHandler(contextObj);
            throw new CommandExitException();
        }
    }

    public static final void BaseCoreGenericHandler(@NotNull MessageHandler var0, @NotNull LiteBansModule_65 v1, @NotNull LiteBansModule_67 v2) {
        v3 = v1.LiteBansModule_241().c();
        v4 = v2.c();
        v5 = MessageHandler.BaseCoreGenericHandler;
        if (v3 == null) ** GOTO lbl-1000
        v6 = var0.AsyncBackgroundTask_5();
        v7 = v6;
        if (v7.e(v3) == false) {
            v0 = true;
        } else lbl-1000:
                {
            v0 = false;
        }
        v8 = v0;
        v9 = MessageKey.cZ;
        v10 = v5;
        if (v8) {
            v11 = v10;
            v11.BaseCoreGenericHandler(v9);
            throw new CommandExitException();
        }
        v5 = MessageHandler.BaseCoreGenericHandler;
        if (v4 == null) ** GOTO lbl-1000
        v12 = var0.AsyncBackgroundTask_5();
        v13 = v12;
        if (v13.e(v4) == false) {
            v1 = true;
        } else lbl-1000:
                {
            v1 = false;
        }
        v14 = v1;
        v15 = MessageKey.cZ;
        v16 = v5;
        if (v14) {
            v17 = v16;
            v17.BaseCoreGenericHandler(v15);
            throw new CommandExitException();
        }
    }

    private static final LiteBansModule_298 BaseCoreGenericHandler(LiteBansModule_83 ch2, String string) {
        LiteBansModule_298 iA2 = ch2.c(string);
        if (iA2 == null) {
            throw new LiteBansModule_35();
        }
        return iA2;
    }

    public static final LiteBansModule_298 BaseCoreGenericHandler(@NotNull LiteBansModule_83 var0, @NotNull String v1, boolean v2) {
        block4: {
            v3 = v1;
            if (StringUtilities.c((CharSequence)v3, ':', false, 2, null)) {
                v3 = StringUtilities.BaseCoreGenericHandler(v3, "user:", null, 2, null);
            }
            v4 = CommandArgumentUtils.BaseCoreGenericHandler(var0, v3);
            if (!v2) break block4;
            v5 = v4.LiteBansModule_31();
            if (v5 == null) ** GOTO lbl-1000
            v0 = StringUtilities.BaseCoreGenericHandler((CharSequence)v5, 14);
            v18 = '4';
            if (v0 != null && v0.charValue() == v18) {
                v1 = true;
            } else lbl-1000:
                        {
                v1 = false;
            }
            if (v1 && !LiteBansModule_346.BaseCoreGenericHandler(v3)) {
                v2 = v4.LiteBansModule_31();
                ObjectUtilities.BaseCoreGenericHandler((Object)v2);
                return CommandArgumentUtils.BaseCoreGenericHandler(var0, v2);
            }
        }
        return v4;
    }

    public static /* synthetic */ LiteBansModule_298 BaseCoreGenericHandler(LiteBansModule_83 ch2, String string, boolean flag, int n, Object targetObj) {
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
                                    v4 = v2.length;
                                    v5 = StringUtilities.LiteBansModule_31((String)v3, "temp", false, 2, null);
                                    if (v5) {
                                        v3 = v3.substring(4);
                                    }
                                    if (v6 = StringUtilities.LiteBansModule_31((String)v3, "litebans:", false, 2, null)) {
                                        v3 = v3.substring(9);
                                    }
                                    v19 = v3;
                                    switch (v19.hashCode()) {
                                        case -1396405339: {
                                            if (!v19.equals("ban-ip")) {
                                                break;
                                            }
                                            break block27;
                                        }
                                        case 3641990: {
                                            if (!v19.equals("warn")) {
                                                break;
                                            }
                                            break block28;
                                        }
                                        case 111426262: {
                                            if (v19.equals("unban")) break;
                                            break;
                                        }
                                        case -840127329: {
                                            if (!v19.equals("unwarn")) {
                                                break;
                                            }
                                            break block29;
                                        }
                                        case 100403592: {
                                            if (!v19.equals("ipban")) {
                                                break;
                                            }
                                            break block27;
                                        }
                                        case 93503862: {
                                            if (!v19.equals("banip")) {
                                                break;
                                            }
                                            break block27;
                                        }
                                        case -1062781696: {
                                            if (!v19.equals("muteip")) {
                                                break;
                                            }
                                            break block30;
                                        }
                                        case -1182108736: {
                                            if (!v19.equals("ipmute")) {
                                                break;
                                            }
                                            break block30;
                                        }
                                        case 3363353: {
                                            if (!v19.equals("mute")) {
                                                break;
                                            }
                                            break block31;
                                        }
                                        case -840405966: {
                                            if (!v19.equals("unmute")) {
                                                break;
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
                        if (!v6) {
                v0 = "-";
            } else {
                return v2;
            }
        }
        v20 = v0;
        if (v5) {
            v20 = v20 + 'T';
        }
        v19 = (String[])ArrayUtilities.BaseCoreGenericHandler(v2, new String[v4 + 1], 1, 0, 0, 12, null);
        v19[0] = v20;
        if (ObjectUtilities.BaseCoreGenericHandler((Object)v20, (Object)"-")) {
            return v2;
        }
        return v19;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "\ufeff", "Banning linked account: ", " (linked to ", " via ", "duration", "seconds", "user:", "#", "#", "#", "#", "#", "#", "temp", "litebans:", "ban-ip", "warn", "unban", "unwarn", "ipban", "banip", "muteip", "ipmute", "mute", "unmute", "-U", "-BanHandler_5", "-IM", "-PlayerQuitListener", "-MU", "-W", "-WU", "-", "-"};
    }

    static {
        CommandArgumentUtils.BaseCoreGenericHandler();
    }
}

