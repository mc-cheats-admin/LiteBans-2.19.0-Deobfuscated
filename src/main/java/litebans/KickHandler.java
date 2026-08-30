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
        block58: {
            v3 = this;
            v3 = (DatabaseMonitorService)v3.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
            try {
                v4 = v3.LiteBansModule_195();
                v5 = v4;
                try {
                    block56: {
                        block55: {
                            v6 = (LiteBansModule_83)v5;
                            v7 = v4;
                            v8 = (String[])this;
                            v9 = v8;
                            v10 = ((ConfigService)v9.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195();
                            try {
                                block59: {
                                    block62: {
                                        block60: {
                                            block61: {
                                                if (LiteBansCommand.i == null) break block59;
                                                v8 = this;
                                                if (!((ConfigService)v8.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).g()) break block55;
                                                v8 = this;
                                                v0 = (ConfigService)v8.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class);
                                                v11 = AbstractCommand.AsyncBackgroundTask_5;
                                                v9 = this.getName();
                                                v12 = v9;
                                                switch (v12.hashCode()) {
                                                    case -1320563219: {
                                                        if (v12.equals("dupeip")) break;
                                                        break;
                                                    }
                                                    case 712910260: {
                                                        if (!v12.equals("staffhistory")) {
                                                            break;
                                                        }
                                                        break block60;
                                                    }
                                                    case 926934164: {
                                                        if (!v12.equals("history")) {
                                                            break;
                                                        }
                                                        break block61;
                                                    }
                                                }
                                                v13   = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                                                v1 = v13  ;
                                                break block62;
                                            }
                                            v13   = new String[]{"hist", "litebans:history"};
                                            v1 = v13  ;
                                            break block62;
                                        }
                                        v13   = new String[]{"staffhist", "litebans:staffhistory"};
                                        v1 = v13  ;
                                        break block62;
                                                                                v13   = new String[]{"litebans:" + (String)v9};
                                        v1 = v13  ;
                                    }
                                    v8 = v1;
                                    v2 = v1.c();
                                    if (new LiteBansModule_405(v0, Arrays.copyOf(v8, ((String[])v8).length)).LiteBansModule_31() != (v2 != null ? v2.hashCode() : 0)) break block55;
                                }
                                throw new NullPointerException();
                            }
                            catch (Exception v14) {
                                break block56;
                            }
                        }
                        v15 = BanHandler.g;
                        v16 = v10.n();
                        v17 = v10.BuilderactionHandler();
                        v12 = v7.AsyncBackgroundTask_5().BaseCoreGenericHandler(v1);
                        v18 = DatabaseMonitorService.BaseCoreGenericHandler(v7.AsyncBackgroundTask_5(), false, 1, null);
                        v19 = v7.BaseCoreGenericHandler(v1);
                        v15 = v8 = new NoneHandler_2((BanHandler)v15, false, v16, false, false, false, false, false, false, false, false, false, false, false, v18, 0L, 0L, 0, null, null, false, null, 0, null, null, null, null, v1, (String)v19, null, (String)v17, (String)v12, null, null, v2, null, null, 671072250, 27, null);
                        try {
                            block65: {
                                block64: {
                                    block57: {
                                        block63: {
                                            NoneHandler_2.BaseCoreGenericHandler((NoneHandler_2)v15, v7, null, false, 3, null);
                                            v15.BaseCoreGenericHandler(InitHandler.LiteBansModule_195);
                                            v17 = MessageHandler.BaseCoreGenericHandler;
                                            v20 = v15.A().isEmpty();
                                            v13   = MessageKey.LiteBansModule_37;
                                            v19 = v17;
                                            if (v20) {
                                                v21 = v19;
                                                v21.BaseCoreGenericHandler(v13  );
                                                throw new CommandExitException();
                                            }
                                            v17 = this;
                                            v22 = v15.A();
                                            v15.LiteBansModule_31(CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)v17, (String)CollectionUtilities.LiteBansModule_241((Iterable)v22)));
                                            v17 = CommandArgumentUtils.LiteBansModule_31(this, v15.AsyncBackgroundTask_21());
                                            v22 = new LiteBansModule_145();
                                            v3 = v17;
                                            v22.BaseCoreGenericHandler = v3 != null ? v3.i() : null;
                                            v23 = new LiteBansModule_145();
                                            v4 = v17;
                                            v23.BaseCoreGenericHandler = v4 != null ? v4.BaseCoreGenericHandler() : null;
                                            v15.A().remove(0);
                                            if (((Collection)v15.A()).isEmpty() == false) {
                                                v24 = (String)CollectionUtilities.LiteBansModule_31(v15.A());
                                                v25 = this;
                                                v5 = ((ConfigService)v25.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).AsyncBackgroundTask_21().BaseCoreGenericHandler(BanHandler.g, v24);
                                                if (v5 == null) {
                                                    v5 = LiteBansModule_65.LiteBansModule_31.BaseCoreGenericHandler();
                                                }
                                                v15.BaseCoreGenericHandler(v5);
                                                v19 = v15.g();
                                                if (ObjectUtilities.BaseCoreGenericHandler(v19.LiteBansModule_195() & 255, -1 & 255) < 0) {
                                                    v15.A().remove(v24);
                                                }
                                            }
                                            v15.n().append(CollectionUtilities.BaseCoreGenericHandler(v15.A(), " ", null, null, 0, null, null, 62, null));
                                            if (v23.BaseCoreGenericHandler == null) {
                                                v15.BaseCoreGenericHandler(v7.c(v15.AsyncBackgroundTask_21()));
                                                v6 = v15.AsyncBackgroundTask_22();
                                                if (!(v6 != null && (v6 = v6.LiteBansModule_31()) != null ? !StringUtilities.BaseCoreGenericHandler((CharSequence)v6, '#', false, 2, null) : false)) {
                                                    v15.BaseCoreGenericHandler((LiteBansModule_298)null);
                                                }
                                                if (v15.AsyncBackgroundTask_22() == null) {
                                                    v26 = this;
                                                    v19 = v15.AsyncBackgroundTask_21();
                                                    v27 = v26;
                                                    v28 = ((ConfigService)v27.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().af();
                                                    if (v28) {
                                                        if (LiteBansModule_346.BaseCoreGenericHandler((String)v19)) {
                                                            v7 = LiteBansModule_50.c.LiteBansModule_195((String)v19);
                                                            if (v7 == null) {
                                                                v8 = null;
                                                            } else {
                                                                v29 = v7;
                                                                v8 = new LiteBansModule_298((String)v29, (String)v19, "#", new Date());
                                                            }
                                                        } else {
                                                            v9 = LiteBansModule_50.c.BaseCoreGenericHandler((String)v19);
                                                            if (v9 == null) {
                                                                v8 = null;
                                                            } else {
                                                                v29 = v9;
                                                                v10 = v29.BaseCoreGenericHandler();
                                                                v8 = new LiteBansModule_298(v29.AsyncBackgroundTask_5(), v10 != null ? v10.toString() : null, null, new Date());
                                                            }
                                                        }
                                                    } else {
                                                        if (LiteBansModule_346.BaseCoreGenericHandler((String)v19)) {
                                                            new LiteBansModule_298(LiteBansModule_243.BaseCoreGenericHandler((String)v19, 16), (String)v19, "#", new Date());
                                                        }
                                                        v8 = new LiteBansModule_298(LiteBansModule_243.BaseCoreGenericHandler((String)v19, 16), LiteBansModule_243.BaseCoreGenericHandler((String)v19), "#", new Date());
                                                    }
                                                    v15.BaseCoreGenericHandler(v8);
                                                }
                                                v11 = v15.AsyncBackgroundTask_22();
                                                v22.BaseCoreGenericHandler = v11 != null ? v11.BaseCoreGenericHandler() : null;
                                                v12 = v15.AsyncBackgroundTask_22();
                                                v23.BaseCoreGenericHandler = v12 != null ? v12.LiteBansModule_31() : null;
                                            }
                                            this.plugin((NoneHandler_2)v15);
                                            v30 = v15.g();
                                            if (ObjectUtilities.BaseCoreGenericHandler(v30.LiteBansModule_195() & 255, -1 & 255) < 0 && v23.BaseCoreGenericHandler != null) {
                                                v30 = v15.g().LiteBansModule_241();
                                                v13 = v17;
                                                v15.BaseCoreGenericHandler(v7.BaseCoreGenericHandler(v15.g(), (String)v23.BaseCoreGenericHandler, v13 != null ? v13.LiteBansModule_31() : null));
                                                v15.BaseCoreGenericHandler(v15.g().BaseCoreGenericHandler(v15.D()));
                                                v31 = this;
                                                ((ConfigService)v31.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler((Object)("Applying " + v15.g().AsyncBackgroundTask_5() + " template \"" + v15.g().g() + "\" LiteBansModule_21 level " + (v15.D() + 1) + '/' + v15.g().LiteBansModule_31().size()));
                                                if (StringUtilities.LiteBansModule_31(v15.n())) {
                                                    v14 = v15.n();
                                                    v15 = v15.L().BaseCoreGenericHandler();
                                                    if (v15 == null) {
                                                        v15 = v30.BaseCoreGenericHandler();
                                                    }
                                                    v14.append(v15);
                                                }
                                                CommandArgumentUtils.BaseCoreGenericHandler(this, v15.g(), v15.L());
                                                v15.BaseCoreGenericHandler(v7);
                                            }
                                            v30 = v15.n();
                                            v32 = v15.c(v7);
                                            StringUtilities.BaseCoreGenericHandler((StringBuilder)v30).append((CharSequence)v32);
                                            v15.LiteBansModule_31(v7);
                                            if (v17 != null && v17.GnuSparseMapHandler()) break block63;
                                            if (v23.BaseCoreGenericHandler != null) {
                                                v16 = v22.BaseCoreGenericHandler;
                                                ObjectUtilities.BaseCoreGenericHandler(v16);
                                                if (v15.LiteBansModule_31(v7, (String)v16, (String)v23.BaseCoreGenericHandler)) {
                                                    v30 = MessageHandler.BaseCoreGenericHandler;
                                                    v33 = v15.BaseCoreGenericHandler(v7, (String)v23.BaseCoreGenericHandler);
                                                    v34 = v30;
                                                    v35 = v33 == false;
                                                    if (v35) {
                                                        v36 = v34;
                                                        v36.BaseCoreGenericHandler(v7.BaseCoreGenericHandler(MessageKey.T, (String)v22.BaseCoreGenericHandler, (String)v22.BaseCoreGenericHandler, (String)v23.BaseCoreGenericHandler, null, null));
                                                        throw new CommandExitException();
                                                    }
                                                }
                                            }
                                            v30 = MessageHandler.BaseCoreGenericHandler;
                                            if (!v7.AsyncBackgroundTask_5().AsyncBackgroundTask_21() || v15.PunishmentTableService()) ** GOTO lbl-1000
                                            v37 = v1;
                                            v38 = "litebans.kick.global";
                                            v39 = v37;
                                            if (v39.e(v38) == false) lbl-1000:
                                                                                        {
                                                v17 = true;
                                            } else {
                                                v17 = false;
                                            }
                                            v40 = v17;
                                            v41 = MessageKey.dL;
                                            v42 = v30;
                                            if (v40) {
                                                v29 = v42;
                                                v29.BaseCoreGenericHandler(v41);
                                                throw new CommandExitException();
                                            }
                                            v30 = (ServerSyncService)v7.e().BaseCoreGenericHandler(ServerSyncService.class);
                                            v43 = new PlayerHandler((NoneHandler_2)v15, (ServerSyncService)v30, v1);
                                            v30.BaseCoreGenericHandler(v43);
                                            this.plugin(v7, (NoneHandler_2)v15, v15.n());
                                            v41 = this;
                                            v44 = 400L;
                                            v41.LiteBansModule_241().BaseCoreGenericHandler(new AsyncBackgroundTask((MessageHandler)v41, v43), v44);
                                            v15.BaseCoreGenericHandler(v7, (CharSequence)MessageKey.dz.BaseCoreGenericHandler("player", (Object)v15.AsyncBackgroundTask_21()));
                                        }
                                        if (AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(v7.e(), v17.LiteBansModule_241())) {
                                            v7.AsyncBackgroundTask_5().BaseCoreGenericHandler((LiteBansModule_179)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, BaseCoreGenericHandler(litebans.CommandSenderWrapper litebans.LiteBansModule_83 ), (Llitebans/LiteBansModule_83;)Llitebans/iV;)((CommandSenderWrapper)v17));
                                        }
                                        v15.BaseCoreGenericHandler(InitHandler.BaseCoreGenericHandler);
                                        if (v15.BaseCoreGenericHandler(v7, (CommandSenderWrapper)v17)) break block64;
                                        v30 = v17;
                                        v32 = new String[]{"litebans.exempt", "litebans.exempt.kick"};
                                        v45 = v32;
                                        v46 = v45.length;
                                        for (v47 = 0; v47 < v46; ++v47) {
                                            v48 = v49 = v45[v47];
                                            if (!v30.e(v48)) continue;
                                            v18 = true;
                                            break block57;
                                        }
                                        v18 = false;
                                    }
                                    if (!v18 || !v10.LockdownService()) break block65;
                                }
                                v30 = MessageHandler.BaseCoreGenericHandler;
                                v50 = v15.BaseCoreGenericHandler(v7, (String)v23.BaseCoreGenericHandler);
                                v51 = v30;
                                v35 = v50 == false;
                                if (v35) {
                                    v52 = v51;
                                    v52.BaseCoreGenericHandler(v7.BaseCoreGenericHandler((CharSequence)MessageKey.T, (CommandSenderWrapper)v17));
                                    throw new CommandExitException();
                                }
                            }
                            v19 = v17.BaseCoreGenericHandler();
                            v20 = v17.LiteBansModule_31();
                            v21 = v15.n();
                            v22 = v15.AsyncBackgroundTask_5();
                            v23 = v15.H();
                            v24 = LiteBansModule_182.LiteBansModule_195.LiteBansModule_31();
                            v25 = v7.AsyncBackgroundTask_5().BaseCoreGenericHandler(v1);
                            if (v25 == null) {
                                v25 = v7.AsyncBackgroundTask_5().ServerSyncService();
                            }
                            v30 = v15.g();
                            v26 = v30;
                            v15.LiteBansModule_31(new SilentHandler(BanHandler.g, v19, v20, v21, v22, v23, v24, v25, DatabaseMonitorService.BaseCoreGenericHandler(v7.AsyncBackgroundTask_5(), false, 1, null), 0L, v26 != null ? v26.LiteBansModule_195() : -1, v15.B(), false, false, 0L, 24576, null));
                            v15.BaseCoreGenericHandler(InitHandler.i);
                            v27 = v15.q();
                            ObjectUtilities.BaseCoreGenericHandler(v27);
                            v15.BaseCoreGenericHandler(v7, v1, v27, new LiteBansModule_298(v17.i(), v17.BaseCoreGenericHandler(), v17.LiteBansModule_31(), new Date()));
                            this.plugin((NoneHandler_2)v15, v7, (CommandSenderWrapper)v17);
                        }
                        finally {
                            v15.BaseCoreGenericHandler(InitHandler.LiteBansModule_31);
                        }
                    }
                    v6 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable v53) {
                    v54 = v53;
                    throw v53;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(v5, v54);
                }
            }
            catch (SQLException v55) {
                if (v3.LiteBansModule_31(v55)) break block58;
                throw v55;
            }
        }
    }

    private final void BaseCoreGenericHandler(LiteBansModule_83 ch2, NoneHandler_2 cz2, CharSequence charSequence) {
        LiteBansModule_83 ch3 = ch2;
        BroadcastHandler ij2 = BroadcastHandler.r;
        if (ch3.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
            BroadcastHandler ij3 = ij2;
            LiteBansModule_83 ch4 = ch3;
            LiteBansModule_304 iF2 = ServerSyncService.GnuSparseMapHandler;
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
            objectArray[6] = LiteBansModule_284.LiteBansModule_31(contextObj != null ? ((LiteBansModule_65)contextObj).LiteBansModule_195() : (byte)-1);
            objectArray[7] = String.valueOf(cz2.D());
            CharSequence charSequence2 = ArrayUtilities.BaseCoreGenericHandler(objectArray, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
            CommandArgumentUtils.BaseCoreGenericHandler(ch4, ij3, charSequence2, null, null, 12, null);
        }
    }

    public final void BaseCoreGenericHandler(@NotNull NoneHandler_2 cz2, @NotNull LiteBansModule_83 ch2, @NotNull CommandSenderWrapper sender) {
        CharSequence charSequence;
        boolean flag;
        boolean flag2;
        boolean flag3;
        int n;
        SilentHandler dZ2;
        block9: {
            boolean flag4;
            SilentHandler dZ3 = cz2.q();
            ObjectUtilities.BaseCoreGenericHandler(dZ3);
            dZ2 = dZ3;
            String string = ((Object)dZ2.LiteBansModule_31()).toString();
            String string2 = string.toLowerCase(Locale.ENGLISH);
            contextObj = this;
            n = 0;
            Object resultObj = contextObj;
            flag3 = false;
            contextObj = ((ConfigService)((MessageHandler)resultObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().H();
            n = 0;
            if (contextObj instanceof Collection && ((Collection)contextObj).isEmpty()) {
                flag4 = false;
            } else {
                resultObj = contextObj.iterator();
                while (resultObj.hasNext()) {
                    Object e = resultObj.next();
                    targetObj = (String)e;
                    flag2 = false;
                    if (!StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)targetObj, false, 2, null)) continue;
                    flag4 = true;
                    break block9;
                }
                flag4 = flag = false;
            }
        }
        if (!flag) {
            CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ2, false, false, 6, null);
        } else {
            contextObj = this;
            n = 0;
            contextObj = (ConfigService)((MessageHandler)contextObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class);
            n = 1;
            if (((ConfigService)contextObj).BaseCoreGenericHandler(n)) {
                Object helperObj = contextObj;
                flag3 = false;
                ((ConfigService)helperObj).BaseCoreGenericHandler((Object)("Kick not added to database due to reason: \"" + dZ2.LiteBansModule_31() + '\"'));
            }
        }
        cz2.BaseCoreGenericHandler(InitHandler.c);
        cz2.BaseCoreGenericHandler(new LiteBansModule_298(sender.i(), sender.BaseCoreGenericHandler(), sender.LiteBansModule_31(), new Date()));
        LiteBansModule_83 ch3 = ch2;
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
            ((BroadcastService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(sender, charSequence3);
            cz2.BaseCoreGenericHandler(ch3, MessageKey.LiteBansModule_100);
        }
        NoneHandler_2.BaseCoreGenericHandler(cz2, ch3, sender, null, false, 6, null);
        cz2.BaseCoreGenericHandler(InitHandler.e);
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(CommandSenderWrapper sender, LiteBansModule_83 ch2) {
        AllHandler_3.BaseCoreGenericHandler(ch2, sender.i(), sender.BaseCoreGenericHandler(), sender.LiteBansModule_31(), false, false, 16, null);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void LiteBansModule_31() {
        GnuSparseMapHandler = new String[]{"kick", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", " ", "#", "#", "#", "Applying ", " template \"", "\" LiteBansModule_21 level ", "litebans.kick.global", "player", "litebans.exempt", "litebans.exempt.kick", "1", "0", "1", "0", "\ufeff", "Kick not added to database due to reason: \""};
    }

    static {
        KickHandler.LiteBansModule_31();
    }
}
}
