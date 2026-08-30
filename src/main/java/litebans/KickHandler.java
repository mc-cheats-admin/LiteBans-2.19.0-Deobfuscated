package litebans;

import java.lang.invoke.LambdaMetafactory;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

public final class KickHandler
extends UnbanCommand {
    public KickHandler(@NotNull PlatformPlugin plugin) {
        super("kick", plugin);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper v1, @NotNull String[] v2) {
{
                        v3 = (DatabaseMonitorService)v3.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            try {
                arg1 = v3.LiteBansModule_194();
                arg2 = arg1;
                try {
{
                            arg3 = (LiteBansModule_82)arg2;
                            arg4 = arg1;
                            arg5 = (String[])this;
                            arg6 = arg5;
                            arg7 = ((ConfigService)arg6.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194();
                            try {
{
                                                if (LiteBansCommand.i == null) break;
                                                                                                if (!((ConfigService)arg5.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).g()) break;
                                                                                                v0 = (ConfigService)arg5.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                                                arg8 = AbstractCommand.AsyncBackgroundTask_5;
                                                arg6 = this.getName();
                                                arg9 = arg6;
                                                switch (arg9.hashCode()) {
                                                    case -1320563219: {
                                                        if (arg9.equals("dupeip")) break;
                                                        break;
                                                    }
                                                    case 712910260: {
                                                        if (!arg9.equals("staffhistory")) {
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 926934164: {
                                                        if (!arg9.equals("history")) {
                                                            break;
                                                        }
                                                        break;
}
                                                arg10   = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                                                v1 = arg10  ;
                                                break;
                                            }
                                            arg10   = new String[]{"hist", "litebans:history"};
                                            v1 = arg10  ;
                                            break;
                                        }
                                        arg10   = new String[]{"staffhist", "litebans:staffhistory"};
                                        v1 = arg10  ;
                                        break;
                                                                                arg10   = new String[]{"litebans:" + (String)arg6};
                                        v1 = arg10  ;
                                    }
                                    arg5 = v1;
                                    v2 = v1.c();
                                    if (new LiteBansModule_403(v0, Arrays.copyOf(arg5, ((String[])arg5).length)).LiteBansModule_31() != (v2 != null ? v2.hashCode() : 0)) break;
                                }
                                throw new NullPointerException();
                            }
                            catch (Exception arg11) {
                                break;
}
                        arg12 = BanHandler.g;
                        arg13 = arg7.n();
                        arg14 = arg7.BuilderactionHandler();
                        arg9 = arg4.AsyncBackgroundTask_5().BaseCoreGenericHandler(v1);
                        arg15 = DatabaseMonitorService.BaseCoreGenericHandler(arg4.AsyncBackgroundTask_5(), false, 1, null);
                        arg16 = arg4.BaseCoreGenericHandler(v1);
                        arg12 = arg5 = new NoneHandler_2((BanHandler)arg12, false, arg13, false, false, false, false, false, false, false, false, false, false, false, arg15, 0L, 0L, 0, null, null, false, null, 0, null, null, null, null, v1, (String)arg16, null, (String)arg14, (String)arg9, null, null, v2, null, null, 671072250, 27, null);
                        try {
{
                                            NoneHandler_2.BaseCoreGenericHandler((NoneHandler_2)arg12, arg4, null, false, 3, null);
                                            arg12.BaseCoreGenericHandler(InitHandler.LiteBansModule_194);
                                            arg14 = MessageHandler.BaseCoreGenericHandler;
                                            arg17 = arg12.A().isEmpty();
                                            arg10   = MessageKey.LiteBansModule_37;
                                            arg16 = arg14;
                                            if (arg17) {
                                                arg18 = arg16;
                                                arg18.BaseCoreGenericHandler(arg10  );
                                                throw new CommandExitException();
                                            }
                                                                                        arg19 = arg12.A();
                                            arg12.LiteBansModule_31(CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)arg14, (String)CollectionUtilities.LiteBansModule_240((Iterable)arg19)));
                                            arg14 = CommandArgumentUtils.LiteBansModule_31(this, arg12.AsyncBackgroundTask_21());
                                            arg19 = new LiteBansModule_144();
                                            v3 = arg14;
                                            arg19.BaseCoreGenericHandler = v3 != null ? v3.i() : null;
                                            arg20 = new LiteBansModule_144();
                                            v4 = arg14;
                                            arg20.BaseCoreGenericHandler = v4 != null ? v4.BaseCoreGenericHandler() : null;
                                            arg12.A().remove(0);
                                            if (((Collection)arg12.A()).isEmpty() == false) {
                                                arg21 = (String)CollectionUtilities.LiteBansModule_31(arg12.A());
                                                                                                v5 = ((ConfigService)arg22.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).AsyncBackgroundTask_21().BaseCoreGenericHandler(BanHandler.g, arg21);
                                                if (v5 == null) {
                                                    v5 = LiteBansModule_65.LiteBansModule_31.BaseCoreGenericHandler();
                                                }
                                                arg12.BaseCoreGenericHandler(v5);
                                                arg16 = arg12.g();
                                                if (ObjectUtilities.BaseCoreGenericHandler(arg16.LiteBansModule_194() & 255, -1 & 255) < 0) {
                                                    arg12.A().remove(arg21);
}
                                            arg12.n().append(CollectionUtilities.BaseCoreGenericHandler(arg12.A(), " ", null, null, 0, null, null, 62, null));
                                            if (arg20.BaseCoreGenericHandler == null) {
                                                arg12.BaseCoreGenericHandler(arg4.c(arg12.AsyncBackgroundTask_21()));
                                                v6 = arg12.AsyncBackgroundTask_22();
                                                if (!(v6 != null && (v6 = v6.LiteBansModule_31()) != null ? !StringUtilities.BaseCoreGenericHandler(v6, '#', false, 2, null) : false)) {
                                                    arg12.BaseCoreGenericHandler((LiteBansModule_297)null);
                                                }
                                                if (arg12.AsyncBackgroundTask_22() == null) {
                                                                                                        arg16 = arg12.AsyncBackgroundTask_21();
                                                    arg24 = arg23;
                                                    arg25 = ((ConfigService)arg24.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().af();
                                                    if (arg25) {
                                                        if (HexEncodingHelper.BaseCoreGenericHandler((String)arg16)) {
                                                            v7 = LiteBansModule_50.c.LiteBansModule_194((String)arg16);
                                                            if (v7 == null) {
                                                            } else {
                                                                arg26 = v7;
                                                                v8 = new LiteBansModule_297((String)arg26, (String)arg16, "#", new Date());
} else {
                                                            v9 = LiteBansModule_50.c.BaseCoreGenericHandler((String)arg16);
                                                            if (v9 == null) {
                                                            } else {
                                                                arg26 = v9;
                                                                v10 = arg26.BaseCoreGenericHandler();
                                                                v8 = new LiteBansModule_297(arg26.AsyncBackgroundTask_5(), v10 != null ? v10.toString() : null, null, new Date());
} else {
                                                        if (HexEncodingHelper.BaseCoreGenericHandler((String)arg16)) {
                                                            new LiteBansModule_297(LiteBansModule_242.BaseCoreGenericHandler((String)arg16, 16), (String)arg16, "#", new Date());
                                                        }
                                                        v8 = new LiteBansModule_297(LiteBansModule_242.BaseCoreGenericHandler((String)arg16, 16), LiteBansModule_242.BaseCoreGenericHandler((String)arg16), "#", new Date());
                                                    }
                                                    arg12.BaseCoreGenericHandler(v8);
                                                }
                                                v11 = arg12.AsyncBackgroundTask_22();
                                                arg19.BaseCoreGenericHandler = v11 != null ? v11.BaseCoreGenericHandler() : null;
                                                v12 = arg12.AsyncBackgroundTask_22();
                                                arg20.BaseCoreGenericHandler = v12 != null ? v12.LiteBansModule_31() : null;
                                            }
                                            this.plugin((NoneHandler_2)arg12);
                                            arg27 = arg12.g();
                                            if (ObjectUtilities.BaseCoreGenericHandler(arg27.LiteBansModule_194() & 255, -1 & 255) < 0 && arg20.BaseCoreGenericHandler != null) {
                                                arg27 = arg12.g().LiteBansModule_240();
                                                v13 = arg14;
                                                arg12.BaseCoreGenericHandler(arg4.BaseCoreGenericHandler(arg12.g(), (String)arg20.BaseCoreGenericHandler, v13 != null ? v13.LiteBansModule_31() : null));
                                                arg12.BaseCoreGenericHandler(arg12.g().BaseCoreGenericHandler(arg12.D()));
                                                                                                ((ConfigService)arg28.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler((Object)("Applying " + arg12.g().AsyncBackgroundTask_5() + " template \"" + arg12.g().g() + "\" LiteBansModule_21 level " + (arg12.D() + 1) + '/' + arg12.g().LiteBansModule_31().size()));
                                                if (StringUtilities.LiteBansModule_31(arg12.n())) {
                                                    v14 = arg12.n();
                                                    v15 = arg12.L().BaseCoreGenericHandler();
                                                    if (v15 == null) {
                                                        v15 = arg27.BaseCoreGenericHandler();
                                                    }
                                                    v14.append(v15);
                                                }
                                                CommandArgumentUtils.BaseCoreGenericHandler(this, arg12.g(), arg12.L());
                                                arg12.BaseCoreGenericHandler(arg4);
                                            }
                                            arg27 = arg12.n();
                                            arg29 = arg12.c(arg4);
                                            StringUtilities.BaseCoreGenericHandler((StringBuilder)arg27).append(arg29);
                                            arg12.LiteBansModule_31(arg4);
                                            if (arg14 != null && arg14.GnuSparseMapHandler()) break;
                                            if (arg20.BaseCoreGenericHandler != null) {
                                                v16 = arg19.BaseCoreGenericHandler;
                                                ObjectUtilities.BaseCoreGenericHandler(v16);
                                                if (arg12.LiteBansModule_31(arg4, (String)v16, (String)arg20.BaseCoreGenericHandler)) {
                                                    arg27 = MessageHandler.BaseCoreGenericHandler;
                                                    arg30 = arg12.BaseCoreGenericHandler(arg4, (String)arg20.BaseCoreGenericHandler);
                                                    arg31 = arg27;
                                                    arg32 = arg30 == false;
                                                    if (arg32) {
                                                        arg33 = arg31;
                                                        arg33.BaseCoreGenericHandler(arg4.BaseCoreGenericHandler(MessageKey.T, (String)arg19.BaseCoreGenericHandler, (String)arg19.BaseCoreGenericHandler, (String)arg20.BaseCoreGenericHandler, null, null));
                                                        throw new CommandExitException();
}
                                            arg27 = MessageHandler.BaseCoreGenericHandler;
                                            if (!arg4.AsyncBackgroundTask_5().AsyncBackgroundTask_21() || arg12.PunishmentTableService()) ** GOTO lbl-1000
                                            arg34 = v1;
                                            arg35 = "litebans.kick.global";
                                            arg36 = arg34;
                                            if (arg36.e(arg35) == false) lbl-1000:
                                                                                        {
                                            } else {
                                            }
                                            arg37 = v17;
                                            arg38 = MessageKey.dL;
                                            arg39 = arg27;
                                            if (arg37) {
                                                arg26 = arg39;
                                                arg26.BaseCoreGenericHandler(arg38);
                                                throw new CommandExitException();
                                            }
                                            arg27 = (ServerSyncService)arg4.e().BaseCoreGenericHandler(ServerSyncService.class);
                                            arg40 = new PlayerHandler((NoneHandler_2)arg12, (ServerSyncService)arg27, v1);
                                            arg27.BaseCoreGenericHandler(arg40);
                                            this.plugin(arg4, (NoneHandler_2)arg12, arg12.n());
                                                                                        arg41 = 400L;
                                            arg38.LiteBansModule_240().BaseCoreGenericHandler(new AsyncBackgroundTask((MessageHandler)arg38, arg40), arg41);
                                            arg12.BaseCoreGenericHandler(arg4, MessageKey.dz.BaseCoreGenericHandler("player", arg12.AsyncBackgroundTask_21()));
                                        }
                                        if (AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg4.e(), arg14.LiteBansModule_240())) {
                                            arg4.AsyncBackgroundTask_5().BaseCoreGenericHandler((LiteBansModule_178)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, BaseCoreGenericHandler(litebans.CommandSenderWrapper litebans.LiteBansModule_82 ), (Llitebans/LiteBansModule_82;)Llitebans/iV;)((CommandSenderWrapper)arg14));
                                        }
                                        arg12.BaseCoreGenericHandler(InitHandler.BaseCoreGenericHandler);
                                        if (arg12.BaseCoreGenericHandler(arg4, (CommandSenderWrapper)arg14)) break;
                                        arg27 = arg14;
                                        arg29 = new String[]{"litebans.exempt", "litebans.exempt.kick"};
                                        arg42 = arg29;
                                        arg43 = arg42.length;
                                        for (arg44 = 0; arg44 < arg43; ++arg44) {
                                            arg45 = arg46 = arg42[arg44];
                                            if (!arg27.e(arg45)) continue;
                                            break;
}
                                    if (!v18 || !arg7.LockdownService()) break;
                                }
                                arg27 = MessageHandler.BaseCoreGenericHandler;
                                arg47 = arg12.BaseCoreGenericHandler(arg4, (String)arg20.BaseCoreGenericHandler);
                                arg48 = arg27;
                                arg32 = arg47 == false;
                                if (arg32) {
                                    arg49 = arg48;
                                    arg49.BaseCoreGenericHandler(arg4.BaseCoreGenericHandler(MessageKey.T, (CommandSenderWrapper)arg14));
                                    throw new CommandExitException();
}
                            v19 = arg14.BaseCoreGenericHandler();
                            v20 = arg14.LiteBansModule_31();
                            v21 = arg12.n();
                            v22 = arg12.AsyncBackgroundTask_5();
                            v23 = arg12.H();
                            v24 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
                            v25 = arg4.AsyncBackgroundTask_5().BaseCoreGenericHandler(v1);
                            if (v25 == null) {
                                v25 = arg4.AsyncBackgroundTask_5().ServerSyncService();
                            }
                            arg27 = arg12.g();
                            v26 = arg27;
                            arg12.LiteBansModule_31(new SilentHandler(BanHandler.g, v19, v20, v21, v22, v23, v24, v25, DatabaseMonitorService.BaseCoreGenericHandler(arg4.AsyncBackgroundTask_5(), false, 1, null), 0L, v26 != null ? v26.LiteBansModule_194() : -1, arg12.B(), false, false, 0L, 24576, null));
                            arg12.BaseCoreGenericHandler(InitHandler.i);
                            v27 = arg12.q();
                            ObjectUtilities.BaseCoreGenericHandler(v27);
                            arg12.BaseCoreGenericHandler(arg4, v1, v27, new LiteBansModule_297(arg14.i(), arg14.BaseCoreGenericHandler(), arg14.LiteBansModule_31(), new Date()));
                            this.plugin((NoneHandler_2)arg12, arg4, (CommandSenderWrapper)arg14);
                        }
                        finally {
                            arg12.BaseCoreGenericHandler(InitHandler.LiteBansModule_31);
}
                    arg3 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable arg50) {
                    arg51 = arg50;
                    throw arg50;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(arg2, arg51);
}
            catch (SQLException arg52) {
                if (v3.LiteBansModule_31(arg52)) break;
                throw arg52;
}

    private final void BaseCoreGenericHandler(LiteBansModule_82 ch2, NoneHandler_2 cz2, CharSequence charSequence) {
        LiteBansModule_82 ch3 = ch2;
        BroadcastHandler ij2 = BroadcastHandler.r;
        if (ch3.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
            BroadcastHandler ij3 = ij2;
            LiteBansModule_82 ch4 = ch3;
            LiteBansModule_303 iF2 = ServerSyncService.GnuSparseMapHandler;
            Object[] objectArray = new CharSequence[8];
            objectArray[0] = cz2.AsyncBackgroundTask_5();
            objectArray[1] = cz2.H();
            objectArray[2] = cz2.AsyncBackgroundTask_21();
            objectArray[3] = charSequence;
            Object targetObj = ServerSyncService.GnuSparseMapHandler;
            boolean flag3 = cz2.B();
            objectArray[4] = flag3 ? "1" : "0";
            targetObj = ServerSyncService.GnuSparseMapHandler;
            flag3 = cz2.c();
            flag4 = false;
            objectArray[5] = flag3 ? "1" : "0";
            targetObj = cz2.g();
            flag3 = false;
            Object contextObj = targetObj;
            objectArray[6] = LiteBansModule_283.LiteBansModule_31(contextObj != null ? ((LiteBansModule_65)contextObj).LiteBansModule_194() : (byte)-1);
            objectArray[7] = String.valueOf(cz2.D());
            CharSequence charSequence2 = ArrayUtilities.BaseCoreGenericHandler(objectArray, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
            CommandArgumentUtils.BaseCoreGenericHandler(ch4, ij3, charSequence2, null, null, 12, null);
}

    public final void BaseCoreGenericHandler(@NotNull NoneHandler_2 cz2, @NotNull LiteBansModule_82 ch2, @NotNull CommandSenderWrapper sender) {
        CharSequence charSequence;
        boolean flag;
        boolean flag2;
        boolean flag3;
        int n;
        SilentHandler dZ2;
{
            boolean flag4;
            SilentHandler dZ3 = cz2.q();
            ObjectUtilities.BaseCoreGenericHandler(dZ3);
            dZ2 = dZ3;
            String string = (dZ2.LiteBansModule_31()).toString();
            String string2 = string.toLowerCase(Locale.ENGLISH);
            contextObj = this;
            n = 0;
            Object resultObj = contextObj;
            flag3 = false;
            contextObj = ((ConfigService)this.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().H();
            n = 0;
            if (contextObj instanceof Collection && ((Collection)contextObj).isEmpty()) {
                flag4 = false;
            } else {
                resultObj = contextObj.iterator();
                while (resultObj.hasNext()) {
                    Object e = resultObj.next();
                    targetObj = (String)e;
                    flag2 = false;
                    if (!StringUtilities.BaseCoreGenericHandler(string2, targetObj, false, 2, null)) continue;
                    flag4 = true;
                    break;
                }
                flag4 = flag = false;
}
        if (!flag) {
            CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ2, false, false, 6, null);
        } else {
            contextObj = this;
            n = 0;
            contextObj = (ConfigService)((MessageHandler)contextObj).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
            n = 1;
            if (((ConfigService)contextObj).BaseCoreGenericHandler(n)) {
                Object helperObj = contextObj;
                flag3 = false;
                ((ConfigService)helperObj).BaseCoreGenericHandler((Object)("Kick not added to database due to reason: \"" + dZ2.LiteBansModule_31() + '\"'));
}
        cz2.BaseCoreGenericHandler(InitHandler.c);
        cz2.BaseCoreGenericHandler(new LiteBansModule_297(sender.i(), sender.BaseCoreGenericHandler(), sender.LiteBansModule_31(), new Date()));
        LiteBansModule_82 ch3 = ch2;
        n = 0;
        CharSequence charSequence2 = GeoIPLookupService.BaseCoreGenericHandler(ch3, dZ2, cz2.D(), 0, 4, null);
        if (charSequence2 != null) {
            charSequence2 = ch3.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(ch3, charSequence2, dZ2, false, 2, null), sender);
        }
        if ((charSequence = charSequence2) == null) {
            charSequence = GeoIPLookupService.BaseCoreGenericHandler(ch3, dZ2, sender);
        }
        CharSequence charSequence3 = charSequence;
        this.plugin(ch3, dZ2, cz2);
        if (sender.GnuSparseMapHandler() && !cz2.PunishmentTableService()) {
            targetObj = this;
            flag2 = false;
            ((BroadcastService)targetObj.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(sender, charSequence3);
            cz2.BaseCoreGenericHandler(ch3, MessageKey.LiteBansModule_99);
        }
        NoneHandler_2.BaseCoreGenericHandler(cz2, ch3, sender, null, false, 6, null);
        cz2.BaseCoreGenericHandler(InitHandler.e);
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(CommandSenderWrapper sender, LiteBansModule_82 ch2) {
        AllHandler_3.BaseCoreGenericHandler(ch2, sender.i(), sender.BaseCoreGenericHandler(), sender.LiteBansModule_31(), false, false, 16, null);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void LiteBansModule_31() {
        GnuSparseMapHandler = new String[]{"kick", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", " ", "#", "#", "#", "Applying ", " template \"", "\" LiteBansModule_21 level ", "litebans.kick.global", "player", "litebans.exempt", "litebans.exempt.kick", "1", "0", "1", "0", "\ufeff", "Kick not added to database due to reason: \""};
}

