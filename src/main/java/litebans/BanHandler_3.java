package litebans;

import java.lang.invoke.LambdaMetafactory;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public final class BanHandler_3
extends UnbanCommand {
    public static final UsageHandler GnuSparseMapHandler;
        public BanHandler_3(@NotNull PlatformPlugin plugin) {
        super("ban", plugin);
    }

    @Override
    public boolean BaseCoreGenericHandler() {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper v1, @NotNull String[] v2) {
        block271: {
            v3 = this;
            v4 = (ConfigService)v3.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class);
            v3 = this.LiteBansModule_241().DatabaseMonitorService();
            v5 = v3.size();
            try {
                v6 = v4;
                if (v6.g()) {
                    v7 = v6;
                    v8 = "[c] " + v5;
                    v7.BaseCoreGenericHandler((Object)v8);
                }
            }
            catch (LiteBansException_4 v9) {
                v10 = v4;
                if (ObjectUtilities.BaseCoreGenericHandler(LiteBansModule_254.BaseCoreGenericHandler((ConfigService)v10), (Object)MessageKey.BaseCoreGenericHandler(v10, false, true))) {
                    v4.LiteBansModule_31((byte)49);
                }
                v10 = this;
                ((DatabaseMonitorService)v10.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(v9);
                return;
            }
            v6 = this;
            v6 = (DatabaseMonitorService)v6.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
            try {
                v11 = v6.LiteBansModule_195();
                v12 = v11;
                try {
                    block268: {
                        v13 = (LiteBansModule_83)v12;
                        v14 = v11;
                        v15 = new LiteBansException_2();
                        if (v14.LiteBansModule_31()) {
                            v16 = MessageHandler.BaseCoreGenericHandler;
                            v17 = v4.DatabaseMonitorService() != null;
                            v18 = BlackHandler.c + "[LiteBans]" + BlackHandler.F + " Plugin access has been disabled!";
                            v19 = v1;
                            v20 = "litebans.admin";
                            v21 = v19.e(v20);
                            if (v21) {
                                v22 = BlackHandler.c + "[LiteBans]" + BlackHandler.AsyncBackgroundTask_5 + " If you have bought LiteBans, contact Ruan on SpigotMC + ";
                                if (v22 != null && v22.length() > 0 != false) {
                                    v23 = v18;
                                    v24 = "\n";
                                    v23 = "" + v23 + v24;
                                    v0 = "" + v23 + v22;
                                } else {
                                    v0 = v18;
                                }
                            } else {
                                v0 = v18;
                            }
                            v18 = LiteBansModule_243.BaseCoreGenericHandler(v0, (CharSequence)v4.GnuSparseMapHandler());
                            v25 = v16;
                            if (v17) {
                                v22 = v25;
                                v22.BaseCoreGenericHandler(v18);
                                throw new CommandExitException();
                            }
                            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.ServerEventListener);
                            throw new CommandExitException();
                        }
                        try {
                            if (LiteBansCommand.i == null) {
                                throw v15;
                            }
                            v26 = v4.LiteBansModule_195();
                            v27 = v14.e().q();
                            v28 = v26.BuilderactionHandler();
                            v29 = BanHandler.LiteBansModule_241;
                            v30 = v26.ServerSyncService();
                            v31 = v26.n();
                            v32 = v14.AsyncBackgroundTask_5().BaseCoreGenericHandler(v1);
                            v33 = DatabaseMonitorService.BaseCoreGenericHandler(v14.AsyncBackgroundTask_5(), false, 1, null);
                            v34 = v14.BaseCoreGenericHandler(v1);
                            v35 = new NoneHandler_2((BanHandler)v29, v30, v31, false, false, false, false, false, false, false, false, false, false, false, v33, 0L, 0L, 0, null, null, false, null, 0, null, null, null, null, v1, (String)v34, null, v28, v32, null, null, v2, null, null, 671072248, 27, null);
                            v29 = v35;
                            try {
                                block270: {
                                    block283: {
                                        block284: {
                                            block275: {
                                                block276: {
                                                    block278: {
                                                        block279: {
                                                            block282: {
                                                                block280: {
                                                                    block281: {
                                                                        block277: {
                                                                            block274: {
                                                                                block272: {
                                                                                    block267: {
                                                                                        block273: {
                                                                                            NoneHandler_2.BaseCoreGenericHandler((NoneHandler_2)v29, v14, null, false, 3, null);
                                                                                            v36 = MessageHandler.BaseCoreGenericHandler;
                                                                                            v37 = v29.ServerSyncService().c() == BanHandler.GnuSparseMapHandler && v26.PunishmentTableService() == false ? 1 : 0;
                                                                                            v38 = MessageKey.LiteBansModule_135;
                                                                                            v34 = v36;
                                                                                            if (v37 != 0) {
                                                                                                v39 = v34;
                                                                                                v39.BaseCoreGenericHandler(v38);
                                                                                                throw new CommandExitException();
                                                                                            }
                                                                                            v36 = MessageHandler.BaseCoreGenericHandler;
                                                                                            v37 = v29.Utf8Handler_2() != false && v1.e() != false && v26.LiteBansModule_24() != false ? 1 : 0;
                                                                                            v38 = MessageKey.LiteBansModule_31;
                                                                                            v34 = v36;
                                                                                            if (v37 != 0) {
                                                                                                v40 = v34;
                                                                                                v40.BaseCoreGenericHandler(v38);
                                                                                                throw new CommandExitException();
                                                                                            }
                                                                                            v36 = MessageHandler.BaseCoreGenericHandler;
                                                                                            v37 = v29.F() != false && v1.e() != false && v26.LiteBansModule_17() != false ? 1 : 0;
                                                                                            v38 = MessageKey.LiteBansModule_31;
                                                                                            v34 = v36;
                                                                                            if (v37 != 0) {
                                                                                                v41 = v34;
                                                                                                v41.BaseCoreGenericHandler(v38);
                                                                                                throw new CommandExitException();
                                                                                            }
                                                                                            v42 = v4.i().BaseCoreGenericHandler(10);
                                                                                            switch (v42) {
                                                                                                case 0: 
                                                                                                case 1: {
                                                                                                    v37 = v4.i().BaseCoreGenericHandler(10);
                                                                                                    if (v37 != 1) ** GOTO lbl182
                                                                                                    v38 = v4;
                                                                                                    if (!v38.g()) ** GOTO lbl183
                                                                                                    v43 = v38;
                                                                                                    v1 = new StringBuilder().append("Timeout after ");
                                                                                                    v44 = AbstractCommand.AsyncBackgroundTask_5;
                                                                                                    v45   = this.getName();
                                                                                                    v46 = v45  ;
                                                                                                    switch (v46.hashCode()) {
                                                                                                        case -1320563219: {
                                                                                                            if (v46.equals("dupeip")) break;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 712910260: {
                                                                                                            if (!v46.equals("staffhistory")) {
                                                                                                                break;
                                                                                                            }
                                                                                                            ** GOTO lbl171
                                                                                                        }
                                                                                                        case 926934164: {
                                                                                                            if (!v46.equals("history")) {
                                                                                                                break;
                                                                                                            }
                                                                                                            ** GOTO lbl168
                                                                                                        }
                                                                                                    }
                                                                                                    v47   = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                                                                                                    v2 = v47  ;
                                                                                                    ** GOTO lbl177
                                                                                                                                                                                                        v47   = new String[]{"hist", "litebans:history"};
                                                                                                    v2 = v47  ;
                                                                                                    ** GOTO lbl177
                                                                                                                                                                                                        v47   = new String[]{"staffhist", "litebans:staffhistory"};
                                                                                                    v2 = v47  ;
                                                                                                    ** GOTO lbl177
                                                                                                                                                                                                        v47   = new String[]{"litebans:" + (String)v45  };
                                                                                                    v2 = v47  ;
                                                                                                                                                                                                        v48 = v2;
                                                                                                    v49   = v1.append((Object)LiteBansModule_73.c(new LiteBansModule_405(v4, Arrays.copyOf(v48, ((String[])v48).length)).LiteBansModule_31())).append(" seconds").toString();
                                                                                                    v43.BaseCoreGenericHandler((Object)v49  );
                                                                                                    ** GOTO lbl183
                                                                                                                                                                                                        v14.AsyncBackgroundTask_5().c();
                                                                                                                                                                                                        v3 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                case 2: {
                                                                                                    LiteBansModule_254.BaseCoreGenericHandler(v4, MessageKey.BaseCoreGenericHandler(v4.LiteBansModule_195(), false, true));
                                                                                                    v3 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                case 3: 
                                                                                                case 4: 
                                                                                                case 5: 
                                                                                                case 6: 
                                                                                                case 7: {
                                                                                                    v37 = v4.LiteBansModule_403();
                                                                                                    if (v37 == 1 && new LiteBansModule_325(0L, 1, null).BaseCoreGenericHandler((int)v4.q()) == 0 || v37 == 2 && (long)v27.length >= v4.q() || v37 == 3 && AllHandler_3.BaseCoreGenericHandler(v14, BansHandler_2.Utf8Handler_2, null, true, 2, null) >= v4.q()) {
                                                                                                        v4.BaseCoreGenericHandler(new LiteBansModule_325(0L, 1, null));
                                                                                                    }
                                                                                                    while (v50 < v29.A().size()) {
                                                                                                        v51 = v29.A().get(v50);
                                                                                                        v52 = (String)v51;
                                                                                                        if (((CharSequence)v52).length() == 0) {
                                                                                                            ++v50;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (ObjectUtilities.BaseCoreGenericHandler((Object)v52, (Object)"duration:permanent") && (v29.F() || !v29.BanHandler_5() && v29.ServerSyncService().c() != BanHandler.c)) {
                                                                                                            v29.LiteBansModule_31(-2L);
                                                                                                            v29.LiteBansModule_403(false);
                                                                                                            ++v50;
                                                                                                            continue;
                                                                                                        }
                                                                                                        v52 = LiteBansModule_435.LiteBansModule_31.BaseCoreGenericHandler(v52, "\\-", (Object)"-");
                                                                                                        v53 = v50 == v29.A().size() - 1;
                                                                                                        v54 = LiteBansModule_82.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(), v52, "");
                                                                                                        v45   = this.plugin((NoneHandler_2)v29, v52);
                                                                                                        if (v45   == null) ** GOTO lbl214
                                                                                                        this.plugin((NoneHandler_2)v29, (LiteBansModule_65)v45  );
                                                                                                        ** GOTO lbl304
                                                                                                                                                                                                                if (!v29.F() && v29.BanHandler_5() || v29.ServerSyncService().c() == BanHandler.c || v29.DatabaseMonitorService() != -1L || !Character.isDigit(v52.charAt(0)) || StringUtilities.c((CharSequence)v52, ':', false, 2, null) || StringUtilities.c((CharSequence)v52, '%', false, 2, null) || StringUtilities.c((CharSequence)v52, '*', false, 2, null) || !LiteBansModule_346.BaseCoreGenericHandler.c(v54) || LiteBansModule_346.BaseCoreGenericHandler(v52)) ** GOTO lbl296
                                                                                                        if (!(((CharSequence)v29.AsyncBackgroundTask_21()).length() == 0) || v52.length() <= 1) ** GOTO lbl251
                                                                                                        v55 = BlackHandler.BaseCoreGenericHandler((CharSequence)v52);
                                                                                                        ObjectUtilities.BaseCoreGenericHandler(v27);
                                                                                                        v47   = v27;
                                                                                                        ObjectUtilities.BaseCoreGenericHandler(v55);
                                                                                                        v48 = v55;
                                                                                                        v56 = v47  ;
                                                                                                        v57 = ((Object)v56).length;
                                                                                                        for (v58 = 0; v58 < v57; ++v58) {
                                                                                                            v59 = v60 = v56[v58];
                                                                                                            if (!StringUtilities.BaseCoreGenericHandler(v59.i(), (String)v48, v61)) continue;
                                                                                                            v4 = v60;
                                                                                                            ** GOTO lbl233
                                                                                                        }
                                                                                                        v4 = null;
                                                                                                                                                                                                                if ((v62 = v4) != null) {
                                                                                                            v47   = v62.i();
                                                                                                            v29.LiteBansModule_31((String)v47  );
                                                                                                            if (AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(v14.e(), v29.CommandThrottleService())) {
                                                                                                                v14.AsyncBackgroundTask_5().BaseCoreGenericHandler((LiteBansModule_179)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, BaseCoreGenericHandler(litebans.CommandSenderWrapper litebans.LiteBansModule_83 ), (Llitebans/LiteBansModule_83;)Llitebans/iV;)((CommandSenderWrapper)v62));
                                                                                                            }
                                                                                                            ++v50;
                                                                                                            continue;
                                                                                                        }
                                                                                                        v29.BaseCoreGenericHandler(v14.c(v52));
                                                                                                        if (v29.AsyncBackgroundTask_22() != null) {
                                                                                                            v47   = v29.AsyncBackgroundTask_22();
                                                                                                            v5 = v47  ;
                                                                                                            if (v5 == null || (v5 = (v48 = v5.BaseCoreGenericHandler())) == null) {
                                                                                                                v5 = "";
                                                                                                            }
                                                                                                            v29.LiteBansModule_31((String)v5);
                                                                                                            ++v50;
                                                                                                            continue;
                                                                                                        }
                                                                                                                                                                                                                if ((v55 = StringUtilities.LiteBansModule_31(v54)) == null) {
                                                                                                            if (((CharSequence)v29.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                                v29.LiteBansModule_31(v52);
                                                                                                            }
                                                                                                            ++v50;
                                                                                                            continue;
                                                                                                        }
                                                                                                        v63 = LiteBansModule_82.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5.LiteBansModule_31(), v52, "");
                                                                                                        v47   = SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v63);
                                                                                                        if (v47   == null) {
                                                                                                            if (v53) {
                                                                                                                if (((CharSequence)v29.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                                    v29.LiteBansModule_31(v52);
                                                                                                                } else {
                                                                                                                    this.LiteBansModule_31((NoneHandler_2)v29, v52);
                                                                                                                }
                                                                                                                ++v50;
                                                                                                                continue;
                                                                                                            }
                                                                                                            v64   = v29.A().get(++v50);
                                                                                                            v48 = (String)v64  ;
                                                                                                            v47   = SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v48);
                                                                                                            if (v47   == null) {
                                                                                                                if (((CharSequence)v29.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                                    v29.LiteBansModule_31(v52);
                                                                                                                    v64   = LiteBansModule_82.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5.LiteBansModule_31(), (CharSequence)v48, "");
                                                                                                                    v65 = SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v64  );
                                                                                                                    if (v65 == null) {
                                                                                                                        this.LiteBansModule_31((NoneHandler_2)v29, (String)v48);
                                                                                                                    } else {
                                                                                                                        v56 = StringUtilities.LiteBansModule_31(LiteBansModule_82.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(), (CharSequence)v48, ""));
                                                                                                                        if (v56 == null) {
                                                                                                                            this.LiteBansModule_31((NoneHandler_2)v29, (String)v48);
                                                                                                                        } else {
                                                                                                                            v29.BaseCoreGenericHandler(v65.LiteBansModule_31(v56.doubleValue()));
                                                                                                                            v29.LiteBansModule_31(v29.J() + v29.BroadcastService());
                                                                                                                            v29.BaseCoreGenericHandler((CharSequence)(LiteBansModule_288.BaseCoreGenericHandler(v56.doubleValue()) + ' ' + v65.BaseCoreGenericHandler(v56.doubleValue())));
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v6 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                                } else {
                                                                                                                    v6 = v29.n().append(v52).append(' ').append((String)v48).append(' ');
                                                                                                                }
                                                                                                                ++v50;
                                                                                                                continue;
                                                                                                            }
                                                                                                        }
                                                                                                        v29.BaseCoreGenericHandler(v47  .LiteBansModule_31(v55.doubleValue()));
                                                                                                        v29.LiteBansModule_31(v29.J() + v29.BroadcastService());
                                                                                                        v29.BaseCoreGenericHandler((CharSequence)(LiteBansModule_288.BaseCoreGenericHandler(v55.doubleValue()) + ' ' + v47  .BaseCoreGenericHandler(v55.doubleValue())));
                                                                                                        ** GOTO lbl304
                                                                                                                                                                                                                if (((CharSequence)v29.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                            v29.LiteBansModule_31(v52);
                                                                                                        } else {
                                                                                                            this.LiteBansModule_31((NoneHandler_2)v29, v52);
                                                                                                            v55 = this;
                                                                                                            if (((BroadcastService)v55.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).GnuSparseMapHandler() == 0) {
                                                                                                                throw v15;
                                                                                                            }
                                                                                                        }
                                                                                                                                                                                                                ++v50;
                                                                                                    }
                                                                                                    if (v29.DatabaseMonitorService() > 0L) {
                                                                                                        v29.LiteBansModule_403(true);
                                                                                                    }
                                                                                                    v3 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                default: {
                                                                                                    v3 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                }
                                                                                            }
                                                                                            v66 = v29;
                                                                                            v67 = this;
                                                                                            v68 = NoneHandler_2.BaseCoreGenericHandler((NoneHandler_2)v66, null, 1, null);
                                                                                            if (!v66.HoverTextFormatter()) ** GOTO lbl-1000
                                                                                            v69 = v67;
                                                                                            v45   = v69;
                                                                                            if (!((ConfigService)v45  .LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().ServerSyncService()) {
                                                                                                v7 = true;
                                                                                            } else lbl-1000:
                                                                                                                                                                                        {
                                                                                                v7 = false;
                                                                                            }
                                                                                            v70 = v7;
                                                                                            switch (LiteBansModule_43.BaseCoreGenericHandler[v66.ServerSyncService().ordinal()]) {
                                                                                                case 4: 
                                                                                                case 5: {
                                                                                                    if (v66.LiteBansModule_403()) {
                                                                                                        v71 = new String[]{"litebans.temp" + v66.ServerSyncService(), "litebans + " + v66.ServerSyncService(), "litebans.ip" + v66.ServerSyncService()};
                                                                                                        v8 = v71;
                                                                                                    } else {
                                                                                                        v71 = new String[]{"litebans + " + v66.ServerSyncService(), "litebans.ip" + v66.ServerSyncService()};
                                                                                                        v8 = v45   = v71;
                                                                                                    }
                                                                                                    if (v70) {
                                                                                                        v71 = v67;
                                                                                                        v47   = "litebans.ip" + v66.ServerSyncService();
                                                                                                        v72 = v71.AsyncBackgroundTask_5();
                                                                                                        v56 = MessageHandler.BaseCoreGenericHandler;
                                                                                                        v73 = v72;
                                                                                                        v60 = v73;
                                                                                                        v58 = v60.e((String)v47  ) == false ? 1 : 0;
                                                                                                        v74 = MessageKey.cZ;
                                                                                                        v59 = v56;
                                                                                                        if (v58 != 0) {
                                                                                                            v75 = v59;
                                                                                                            v75.BaseCoreGenericHandler(v74);
                                                                                                            throw new CommandExitException();
                                                                                                        }
                                                                                                    }
                                                                                                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)v67, Arrays.copyOf(v45  , v45  .length));
                                                                                                    v9 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                case 6: {
                                                                                                    v45   = v67;
                                                                                                    v71 = "litebans + " + v66.ServerSyncService();
                                                                                                    v48 = v45  .AsyncBackgroundTask_5();
                                                                                                    v76 = MessageHandler.BaseCoreGenericHandler;
                                                                                                    v56 = v48;
                                                                                                    v77 = v56;
                                                                                                    v78 = v77.e((String)v71) == false;
                                                                                                    v79 = MessageKey.cZ;
                                                                                                    v80 = v76;
                                                                                                    if (v78) {
                                                                                                        v81 = v80;
                                                                                                        v81.BaseCoreGenericHandler(v79);
                                                                                                        throw new CommandExitException();
                                                                                                    }
                                                                                                    v9 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                case 1: 
                                                                                                case 2: 
                                                                                                case 3: {
                                                                                                    v45   = v66.F() != false ? "litebans.modify" : "litebans + " + v66.ServerSyncService();
                                                                                                    v71 = new String[]{v45  , (String)v45   + ".own"};
                                                                                                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)v67, (String[])v71);
                                                                                                    v9 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                default: {
                                                                                                    AssertionUtilities.BaseCoreGenericHandler();
                                                                                                    throw new CommandExitException();
                                                                                                }
                                                                                            }
                                                                                            if (!v66.BanHandler_5() && v68) {
                                                                                                v82 = v67;
                                                                                                v83 = "litebans.ip" + v66.ServerSyncService() + ".wildcard";
                                                                                                v71 = v82.AsyncBackgroundTask_5();
                                                                                                v48 = MessageHandler.BaseCoreGenericHandler;
                                                                                                v84 = v71;
                                                                                                v85 = v84;
                                                                                                v86 = v85.e(v83) == false;
                                                                                                v87 = MessageKey.cZ;
                                                                                                v88 = v48;
                                                                                                if (v86) {
                                                                                                    v89 = v88;
                                                                                                    v89.BaseCoreGenericHandler(v87);
                                                                                                    throw new CommandExitException();
                                                                                                }
                                                                                            }
                                                                                            v29.BaseCoreGenericHandler(InitHandler.LiteBansModule_195);
                                                                                            if (((CharSequence)v29.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                v66 = BanHandler_3.GnuSparseMapHandler;
                                                                                                v67 = v29.ServerSyncService();
                                                                                                v90 = v29.BanHandler_5();
                                                                                                v91 = MessageKey.cC;
                                                                                                if (v90) {
                                                                                                    v10 = MessageKey.c(v67 + "_USAGE");
                                                                                                } else {
                                                                                                    switch (LiteBansModule_191.BaseCoreGenericHandler[v67.ordinal()]) {
                                                                                                        case 1: {
                                                                                                            if (v91 == MessageKey.LockdownCommandHandler) {
                                                                                                                v11 = MessageKey.NullHandler;
                                                                                                                break;
                                                                                                            }
                                                                                                            v11 = MessageKey.LiteBansModule_103;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            if (v91 == MessageKey.LockdownCommandHandler) {
                                                                                                                v11 = MessageKey.ah;
                                                                                                                break;
                                                                                                            }
                                                                                                            v11 = MessageKey.LiteBansModule_66;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            v11 = MessageKey.LiteBansModule_37;
                                                                                                            break;
                                                                                                        }
                                                                                                        default: {
                                                                                                            v11 = v91;
                                                                                                        }
                                                                                                    }
                                                                                                    v10 = v11;
                                                                                                }
                                                                                                v92 = v10;
                                                                                                v91 = MessageHandler.BaseCoreGenericHandler;
                                                                                                v93 = v67 == BanHandler.g;
                                                                                                v94 = v91;
                                                                                                if (v93) {
                                                                                                    v48 = v94;
                                                                                                    v48.BaseCoreGenericHandler(v92);
                                                                                                    throw new CommandExitException();
                                                                                                }
                                                                                                v95 = v66;
                                                                                                v96 = MessageKey.LockdownCommandHandler;
                                                                                                if (v90) {
                                                                                                    v12 = MessageKey.c(v67 + "_USAGE");
                                                                                                } else {
                                                                                                    switch (LiteBansModule_191.BaseCoreGenericHandler[v67.ordinal()]) {
                                                                                                        case 1: {
                                                                                                            if (v96 == MessageKey.LockdownCommandHandler) {
                                                                                                                v13 = MessageKey.NullHandler;
                                                                                                                break;
                                                                                                            }
                                                                                                            v13 = MessageKey.LiteBansModule_103;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            if (v96 == MessageKey.LockdownCommandHandler) {
                                                                                                                v13 = MessageKey.ah;
                                                                                                                break;
                                                                                                            }
                                                                                                            v13 = MessageKey.LiteBansModule_66;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            v13 = MessageKey.LiteBansModule_37;
                                                                                                            break;
                                                                                                        }
                                                                                                        default: {
                                                                                                            v13 = v96;
                                                                                                        }
                                                                                                    }
                                                                                                    v12 = v13;
                                                                                                }
                                                                                                v91 = v12;
                                                                                                MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(LiteBansModule_243.BaseCoreGenericHandler(v92, v90 == false, (CharSequence)v91));
                                                                                                throw new CommandExitException();
                                                                                            }
                                                                                            this.plugin((NoneHandler_2)v29);
                                                                                            v29.LiteBansModule_31(v29.BaseCoreGenericHandler(this));
                                                                                            v66 = CommandArgumentUtils.LiteBansModule_31(this, v29.AsyncBackgroundTask_21());
                                                                                            v14 = v66;
                                                                                            v15 = v14 != null && (v14 = (v97 = v14.LiteBansModule_241())) != null ? LiteBansModule_243.BaseCoreGenericHandler((String)v14, 32) : (v67 = null);
                                                                                            if (LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(v28) || StringUtilities.BaseCoreGenericHandler(v29.LiteBansModule_31(), v28, true)) break block272;
                                                                                            if (!LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(v28)) break block273;
                                                                                            v16 = v29.LiteBansModule_31();
                                                                                            v98 = v29.CommandThrottleService();
                                                                                            v17 = v98;
                                                                                            if (v17 == null && (v17 = v67) == null) {
                                                                                                v17 = v14.AsyncBackgroundTask_5().ServerSyncService();
                                                                                            }
                                                                                            if (StringUtilities.BaseCoreGenericHandler(v16, (String)v17, true)) break block272;
                                                                                        }
                                                                                        v99 = v1;
                                                                                        v100 = new String[]{"litebans.server + " + v29.LiteBansModule_31(), "litebans.server + " + v29.LiteBansModule_31() + '.' + v29.ServerSyncService().c()};
                                                                                        v101 = v99;
                                                                                        v102 = Arrays.copyOf(v100, v100.length);
                                                                                        v103 = v102;
                                                                                        v104 = v103.length;
                                                                                        for (v105 = 0; v105 < v104; ++v105) {
                                                                                            v106 = v107 = v103[v105];
                                                                                            if (!v101.e(v106)) continue;
                                                                                            v18 = true;
                                                                                            break block267;
                                                                                        }
                                                                                        v18 = false;
                                                                                    }
                                                                                    if (v18 == false) {
                                                                                        v29.AsyncBackgroundTask_5(LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(v28, v14.AsyncBackgroundTask_5().ServerSyncService(), v1));
                                                                                    }
                                                                                }
                                                                                v108 = LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(v14.AsyncBackgroundTask_5().ServerSyncService(), v29.LiteBansModule_31()) != false || v67 != null && LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler((String)v67, v29.LiteBansModule_31()) != false;
                                                                                v109   = v4;
                                                                                if (v109  .g()) {
                                                                                    v43 = v109  ;
                                                                                    v49   = v29.LiteBansModule_31();
                                                                                    v43.BaseCoreGenericHandler((Object)v49  );
                                                                                }
                                                                                if (v66 == null) break block274;
                                                                                v110 = v4;
                                                                                v111 = v66.g();
                                                                                v112 = v66.i();
                                                                                v109   = new LiteBansModule_114(v29.AsyncBackgroundTask_21(), v66.i(), v110.LiteBansModule_195().SetHandler() != false ? v111 : v112, v66.BaseCoreGenericHandler(), v66.LiteBansModule_31(), (CommandSenderWrapper)v66, null, 64, null);
                                                                                v29.BaseCoreGenericHandler(new LiteBansModule_298(v109  .AsyncBackgroundTask_5(), v109  .BaseCoreGenericHandler(), v109  .c(), new Date(v29.J())));
                                                                                break block275;
                                                                            }
                                                                            v29.BaseCoreGenericHandler(v14.c(v29.AsyncBackgroundTask_21()));
                                                                            v110 = v29.AsyncBackgroundTask_22();
                                                                            v19 = v110;
                                                                            if (!(v19 != null && (v19 = (v113 = v19.LiteBansModule_31())) != null ? !StringUtilities.BaseCoreGenericHandler((CharSequence)v19, '#', false, 2, null) : false)) {
                                                                                v29.BaseCoreGenericHandler((LiteBansModule_298)null);
                                                                            }
                                                                            if (v29.AsyncBackgroundTask_22() != null) break block276;
                                                                            v110 = v29.AsyncBackgroundTask_21();
                                                                            if (!LiteBansModule_346.BaseCoreGenericHandler.i((String)v110)) break block277;
                                                                            v29.m(true);
                                                                            v110 = MessageHandler.BaseCoreGenericHandler;
                                                                            v114 = v1;
                                                                            v115   = "litebans.ip" + v29.ServerSyncService().c();
                                                                            v116 = v114;
                                                                            v117 = v116.e(v115  ) == false;
                                                                            v115   = MessageKey.cZ;
                                                                            v116 = v110;
                                                                            if (v117) {
                                                                                v118 = v116;
                                                                                v118.BaseCoreGenericHandler(v115  );
                                                                                throw new CommandExitException();
                                                                            }
                                                                            v29.BaseCoreGenericHandler(new LiteBansModule_298("#offline#", "#offline#", v29.AsyncBackgroundTask_21(), new Date()));
                                                                            break block278;
                                                                        }
                                                                        if (!v29.BanHandler_5()) break block279;
                                                                        v110 = CommandArgumentUtils.AsyncBackgroundTask_5(this, v29.AsyncBackgroundTask_21());
                                                                        if (ObjectUtilities.BaseCoreGenericHandler(v110, (Object)v29.AsyncBackgroundTask_21())) break block280;
                                                                        v119 = AllHandler_3.BaseCoreGenericHandler(v14, (String)v110, v29.ServerSyncService(), null, v29.BanHandler_2() == false, 4, null);
                                                                        if (v29.BanHandler_2()) break block281;
                                                                        v20 = v119;
                                                                        v21 = v20 != null ? v14.BaseCoreGenericHandler(v20) : false;
                                                                        if (!v21) break block280;
                                                                    }
                                                                    v22 = v119;
                                                                    v29.BaseCoreGenericHandler(v14.c(v22 != null ? v22.DatabaseMonitorService() : null));
                                                                    v23 = v119;
                                                                    if (v23 == null || (v23 = (v120 = v23.m())) == null) {
                                                                        v23 = v29.LiteBansModule_31();
                                                                    }
                                                                    v29.AsyncBackgroundTask_5((String)v23);
                                                                    v29.BaseCoreGenericHandler(v119);
                                                                }
                                                                if (v29.AsyncBackgroundTask_22() != null || !LiteBansModule_346.BaseCoreGenericHandler.AsyncBackgroundTask_5(v29.AsyncBackgroundTask_21())) break block279;
                                                                v121 = AllHandler_3.BaseCoreGenericHandler(v14, v29.AsyncBackgroundTask_21(), v29.ServerSyncService(), null, v29.BanHandler_2() == false, 4, null);
                                                                if (v29.BanHandler_2()) break block282;
                                                                v24 = v121;
                                                                v25 = v24 != null ? v14.BaseCoreGenericHandler(v24) : false;
                                                                if (!v25) break block279;
                                                            }
                                                            v26 = v121;
                                                            v29.BaseCoreGenericHandler(v14.c(v26 != null ? v26.DatabaseMonitorService() : null));
                                                            v27 = v121;
                                                            if (v27 == null || (v27 = (v122 = v27.m())) == null) {
                                                                v27 = v29.LiteBansModule_31();
                                                            }
                                                            v29.AsyncBackgroundTask_5((String)v27);
                                                            v29.BaseCoreGenericHandler(v121);
                                                        }
                                                        if (v29.AsyncBackgroundTask_22() == null) {
                                                            v123 = this;
                                                            v124 = v29.AsyncBackgroundTask_21();
                                                            v125 = v123;
                                                            v126 = ((ConfigService)v125.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().af();
                                                            if (v126) {
                                                                if (LiteBansModule_346.BaseCoreGenericHandler(v124)) {
                                                                    v28 = LiteBansModule_50.c.LiteBansModule_195(v124);
                                                                    if (v28 == null) {
                                                                        v29 = null;
                                                                    } else {
                                                                        v127 = v28;
                                                                        v29 = new LiteBansModule_298(v127, v124, "#", new Date());
                                                                    }
                                                                } else {
                                                                    v30 = LiteBansModule_50.c.BaseCoreGenericHandler(v124);
                                                                    if (v30 == null) {
                                                                        v29 = null;
                                                                    } else {
                                                                        v128 = v30;
                                                                        v31 = v128.BaseCoreGenericHandler();
                                                                        v29 = new LiteBansModule_298(v128.AsyncBackgroundTask_5(), v31 != null ? v31.toString() : null, null, new Date());
                                                                    }
                                                                }
                                                            } else {
                                                                if (LiteBansModule_346.BaseCoreGenericHandler(v124)) {
                                                                    new LiteBansModule_298(LiteBansModule_243.BaseCoreGenericHandler(v124, 16), v124, "#", new Date());
                                                                }
                                                                v29 = new LiteBansModule_298(LiteBansModule_243.BaseCoreGenericHandler(v124, 16), LiteBansModule_243.BaseCoreGenericHandler(v124), "#", new Date());
                                                            }
                                                            v32 = v110 = v29;
                                                            if (v32 == null) {
                                                                v29.BaseCoreGenericHandler(v14, (Object)MessageKey.aN.BaseCoreGenericHandler("player", (Object)v29.AsyncBackgroundTask_21()));
                                                                throw new CommandExitException();
                                                            }
                                                            v29.BaseCoreGenericHandler((LiteBansModule_298)v32);
                                                        }
                                                    }
                                                    v33 = v110 = v29.AsyncBackgroundTask_22();
                                                    if ((v33 != null ? v33.LiteBansModule_31() : null) != null) {
                                                        v34 = v29.AsyncBackgroundTask_22();
                                                        ObjectUtilities.BaseCoreGenericHandler(v34);
                                                        v35 = v34.LiteBansModule_31();
                                                        ObjectUtilities.BaseCoreGenericHandler((Object)v35);
                                                        if (!StringUtilities.BaseCoreGenericHandler((CharSequence)v35, '#', false, 2, null)) {
                                                            v36 = v110 = v29.AsyncBackgroundTask_22();
                                                            if (!LiteBansModule_346.BaseCoreGenericHandler.LiteBansModule_31(v36 != null ? v36.BaseCoreGenericHandler() : null) && AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(v14.e(), v29.CommandThrottleService())) {
                                                                v14.AsyncBackgroundTask_5().BaseCoreGenericHandler((LiteBansModule_179)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, BaseCoreGenericHandler(litebans.NoneHandler_2 litebans.LiteBansModule_83 ), (Llitebans/LiteBansModule_83;)Llitebans/iV;)((NoneHandler_2)v29));
                                                            }
                                                        }
                                                    }
                                                }
                                                v37 = v110 = v29.AsyncBackgroundTask_22();
                                                v38 = v37 != null ? v37.BaseCoreGenericHandler() : null;
                                                v39 = v110 = v29.AsyncBackgroundTask_22();
                                                v40 = v39 != null ? v39.LiteBansModule_31() : null;
                                                v41 = v110 = v29.AsyncBackgroundTask_22();
                                                v109   = new LiteBansModule_114(v38, null, null, v40, v41 != null ? v41.i() : null, null, v29.AsyncBackgroundTask_21(), 38, null);
                                                if (v109  .LiteBansModule_31()) {
                                                    v110 = v29.AsyncBackgroundTask_22();
                                                    v42 = v110;
                                                    v43 = v42 != null && (v42 = (v129 = v42.BaseCoreGenericHandler())) != null ? StringUtilities.BaseCoreGenericHandler((CharSequence)v42, '#', false, 2, null) : false;
                                                    if (v43) {
                                                        v110 = v109  ;
                                                        if (v4.LiteBansModule_195().aa()) {
                                                            v4.BaseCoreGenericHandler((Object)("Hiding IP address from broadcast: " + v110.c()));
                                                            v110.BaseCoreGenericHandler(MessageKey.SecHandler.toString());
                                                        } else {
                                                            v110.BaseCoreGenericHandler(v110.c());
                                                        }
                                                        v110.LiteBansModule_31(v110.AsyncBackgroundTask_5());
                                                        v110 = v109  .c();
                                                        v44 = v110;
                                                        if (v44 == null) {
                                                            v44 = "";
                                                        }
                                                        v29.LiteBansModule_31((String)v44);
                                                    }
                                                }
                                            }
                                            v130 = NoneHandler_2.BaseCoreGenericHandler((NoneHandler_2)v29, null, 1, null);
                                            v131 = MessageHandler.BaseCoreGenericHandler;
                                            v132 = v130 != false && v1.LiteBansModule_195() == false && v4.LiteBansModule_195().MessageKey() >= 1 ? 1 : 0;
                                            v133 = MessageKey.LiteBansModule_31;
                                            v134 = v131;
                                            if (v132 != 0) {
                                                v135 = v134;
                                                v135.BaseCoreGenericHandler(v133);
                                                throw new CommandExitException();
                                            }
                                            v131 = MessageHandler.BaseCoreGenericHandler;
                                            v132 = v29.HoverTextFormatter() != false && v4.LiteBansModule_195().MessageKey() >= 2 && v1.LiteBansModule_195() == false ? 1 : 0;
                                            v133 = MessageKey.LiteBansModule_31;
                                            v134 = v131;
                                            if (v132 != 0) {
                                                v136 = v134;
                                                v136.BaseCoreGenericHandler(v133);
                                                throw new CommandExitException();
                                            }
                                            v131 = v29.CommandThrottleService();
                                            v45 = v131;
                                            if (v45 == null && (v45 = v67) == null) {
                                                v45 = v14.AsyncBackgroundTask_5().ServerSyncService();
                                            }
                                            v29.e((String)v45);
                                            v29.c(LiteBansModule_243.BaseCoreGenericHandler(v29.H(), 128));
                                            v29.BaseCoreGenericHandler(LiteBansModule_243.BaseCoreGenericHandler(v29.AsyncBackgroundTask_5(), 36));
                                            v131 = this;
                                            v132 = v29.Utf8Handler_2();
                                            v133 = v29.H();
                                            v137 = v29.AsyncBackgroundTask_5();
                                            v138 = (MessageHandler)v131;
                                            ((DatabaseMonitorService)v138.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(new ConsoleHandler((boolean)v132, (String)v133, (BanHandler_3)v131, (String)v137, v1));
                                            v29.BaseCoreGenericHandler(InitHandler.BaseCoreGenericHandler);
                                            if (v29.PunishmentService() && v109  .BaseCoreGenericHandler() != null) {
                                                v131 = v29.g().LiteBansModule_31();
                                                if (v29.i() == null) {
                                                    v29.BaseCoreGenericHandler(v14.BaseCoreGenericHandler(v29.g(), v109  .BaseCoreGenericHandler(), v109  .c()));
                                                    v29.BaseCoreGenericHandler(v29.g().BaseCoreGenericHandler(v29.D()));
                                                } else {
                                                    v46 = v29.i();
                                                    ObjectUtilities.BaseCoreGenericHandler(v46);
                                                    v139 = v46;
                                                    v131 = v139.LiteBansModule_195();
                                                    v133 = v14.BaseCoreGenericHandler(v109  .BaseCoreGenericHandler(), v109  .c(), v139, v29.g());
                                                    v29.BaseCoreGenericHandler((int)Math.floor(((Number)v133.e()).doubleValue()));
                                                    v29.BaseCoreGenericHandler(v139.BaseCoreGenericHandler(v29.D()));
                                                    v140 = ((Number)v133.LiteBansModule_31()).doubleValue();
                                                    if (v140 <= 0.0 || v29.D() != (int)Math.floor(v140)) {
                                                        v29.BaseCoreGenericHandler(true);
                                                    }
                                                    v138 = LiteBansModule_288.BaseCoreGenericHandler(v140);
                                                    v141 = LiteBansModule_288.BaseCoreGenericHandler(((Number)v133.e()).doubleValue());
                                                    v142 = Math.min(v139.LiteBansModule_195().size(), v29.D() + 1);
                                                    v4.BaseCoreGenericHandler((Object)("Applying " + v139.c() + " template group " + v139.BaseCoreGenericHandler() + ": weight " + (String)v138 + " => " + v141 + " (" + v142 + '/' + v131.size() + ')'));
                                                }
                                                v132 = Math.min(v131.size(), v29.D() + 1);
                                                v4.BaseCoreGenericHandler((Object)("Applying " + v29.g().AsyncBackgroundTask_5() + " template \"" + v29.g().g() + "\" LiteBansModule_21 level " + v132 + '/' + v131.size()));
                                                v137 = v29.L();
                                                ObjectUtilities.LiteBansModule_31(v137, "");
                                                v133 = (LiteBansModule_106)v137;
                                                v143 = v29.g().LiteBansModule_241();
                                                ObjectUtilities.LiteBansModule_31(v143, "");
                                                v137 = (LiteBansModule_106)v143;
                                                v138 = v133.BaseCoreGenericHandler();
                                                v47 = v138;
                                                if (v47 == null) {
                                                    v47 = v137.BaseCoreGenericHandler();
                                                }
                                                if ((v143 = v47) != null) {
                                                    if (v143.longValue() > 0L) {
                                                        v29.LiteBansModule_31(v29.J() + v143.longValue());
                                                        v29.LiteBansModule_403(true);
                                                        v144 = v143.longValue();
                                                        v29.BaseCoreGenericHandler((CharSequence)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, v144, false, 2, null));
                                                    } else {
                                                        v29.LiteBansModule_31(-1L);
                                                        v29.LiteBansModule_403(false);
                                                        v29.BaseCoreGenericHandler(MessageKey.LiteBansModule_60);
                                                    }
                                                }
                                                if (v29.g().GnuSparseMapHandler()) {
                                                    v29.m(true);
                                                }
                                                CommandArgumentUtils.BaseCoreGenericHandler(this, v29.g(), v29.L());
                                                v29.BaseCoreGenericHandler(v14);
                                            }
                                            v131 = MessageHandler.BaseCoreGenericHandler;
                                            v132 = v29.LiteBansModule_403() != false && v29.BanHandler_5() == false && v29.DatabaseMonitorService() <= 0L ? 1 : 0;
                                            v133 = MessageKey.aL;
                                            v145 = v131;
                                            if (v132 != 0) {
                                                v146 = v145;
                                                v146.BaseCoreGenericHandler(v133);
                                                throw new CommandExitException();
                                            }
                                            v131 = v29.c(v14);
                                            v48 = v109  .AsyncBackgroundTask_5();
                                            ObjectUtilities.BaseCoreGenericHandler((Object)v48);
                                            v49 = v109  .BaseCoreGenericHandler();
                                            ObjectUtilities.BaseCoreGenericHandler((Object)v49);
                                            v29.BaseCoreGenericHandler(v14, v48, v49);
                                            if (!v29.BanHandler_5()) break block283;
                                            v147 = new LiteBansModule_279();
                                            v148 = v29.GnuSparseMapHandler();
                                            v50 = v148;
                                            if (v50 == null) {
                                                v50 = v14.BaseCoreGenericHandler(v109  .BaseCoreGenericHandler(), v109  .c(), v29.ServerSyncService(), v29.LiteBansModule_31(), true, true);
                                            }
                                            v29.LiteBansModule_31(v50);
                                            v51 = v145 = v29.q();
                                            v149 = ObjectUtilities.BaseCoreGenericHandler((Object)(v51 != null ? v51.e() : null), (Object)v1.BaseCoreGenericHandler());
                                            v52 = v145 = v149 != false ? ".own" : "";
                                            if (v29.q() != null && !v149 && v4.LiteBansModule_195().ac()) {
                                                v150 = MessageHandler.BaseCoreGenericHandler;
                                                v53 = v151 = v29.q();
                                                v152 = v29.BaseCoreGenericHandler(v14, v53 != null ? v53.e() : null) == false;
                                                v153 = MessageKey.cZ;
                                                v154 = v150;
                                                if (v152) {
                                                    v155 = v154;
                                                    v155.BaseCoreGenericHandler(v153);
                                                    throw new CommandExitException();
                                                }
                                            }
                                            v156 = v29.q();
                                            v54 = v156;
                                            if (!((v54 != null ? v54.DatabaseMonitorService() : null) != null)) break block284;
                                            v156 = v29.q();
                                            if (!(v156 != null && v156.r() != -1)) break block284;
                                            v55 = v4.AsyncBackgroundTask_21();
                                            v56 = v29.q();
                                            ObjectUtilities.BaseCoreGenericHandler(v56);
                                            v156 = v55.BaseCoreGenericHandler(v56);
                                            if (v156 == null) break block284;
                                            v157 = v29.q();
                                            v57 = v157;
                                            v157 = v29.q();
                                            v58 = v157;
                                            v158 = v14.BaseCoreGenericHandler((LiteBansModule_65)v156, v57 != null ? v57.DatabaseMonitorService() : null, v58 != null ? v58.PunishmentTableService() : null);
                                            v157 = v156.BaseCoreGenericHandler(v158);
                                            v159 = v157.c();
                                            v59 = v159;
                                            if (v59 == null) {
                                                v59 = v156.LiteBansModule_241().c();
                                            }
                                            v160 = v59;
                                            v159 = MessageHandler.BaseCoreGenericHandler;
                                            if (v160 == null) ** GOTO lbl-1000
                                            v161 = v1;
                                            v162 = v161;
                                            if (v162.e(v160) == false) {
                                                v60 = true;
                                            } else lbl-1000:
                                                                                        {
                                                v60 = false;
                                            }
                                            v163 = v60;
                                            v164 = MessageKey.cZ;
                                            v165 = v159;
                                            if (v163) {
                                                v166 = v165;
                                                v166.BaseCoreGenericHandler(v164);
                                                throw new CommandExitException();
                                            }
                                        }
                                        v156 = v4;
                                        if (v156.g()) {
                                            v43 = v156;
                                            v61 = v29.q();
                                            v49   = "[0xff] " + (v61 != null ? v61.e() : null) + ' ' + v1.BaseCoreGenericHandler() + " (LiteBansModule_435=" + v149 + ')';
                                            v43.BaseCoreGenericHandler((Object)v49  );
                                        }
                                        if (v29.F()) {
                                            v167 = v29.q();
                                            v62 = v167;
                                            if (v62 == null) {
                                                v29.BaseCoreGenericHandler(v14, (Object)MessageKey.SQLiteDriverHandler_2);
                                                throw new CommandExitException();
                                            }
                                            v156 = v62;
                                            v167 = this;
                                            v168 = "litebans.modify" + (String)v145;
                                            v169 = v167.AsyncBackgroundTask_5();
                                            v170 = MessageHandler.BaseCoreGenericHandler;
                                            v171 = v169;
                                            v172 = v171;
                                            v173 = v172.e((String)v168) == false;
                                            v174 = MessageKey.cZ;
                                            v175 = v170;
                                            if (v173) {
                                                v176 = v175;
                                                v176.BaseCoreGenericHandler(v174);
                                                throw new CommandExitException();
                                            }
                                            v168 = v29.ServerSyncService();
                                            switch (LiteBansModule_275.BaseCoreGenericHandler[v168.c().ordinal()]) {
                                                case 1: {
                                                    v63 = MessageKey.df;
                                                    break;
                                                }
                                                case 2: {
                                                    v63 = MessageKey.LockdownService;
                                                    break;
                                                }
                                                case 3: {
                                                    v63 = MessageKey.cu;
                                                    break;
                                                }
                                                default: {
                                                    v63 = null;
                                                }
                                            }
                                            v167 = ObjectUtilities.BaseCoreGenericHandler(v131, v63) != false ? v156.LiteBansModule_31() : v131;
                                            v177 = v29.DatabaseMonitorService() == -1L ? v156.LiteBansModule_403() : v29.DatabaseMonitorService();
                                            v29.LiteBansModule_31(v14);
                                            v14.BaseCoreGenericHandler((CharSequence)v167, v177, (SilentHandler)v156);
                                            v169 = new LiteBansModule_145();
                                            v178 = v156;
                                            v169.BaseCoreGenericHandler = new SilentHandler(v178.ServerSyncService(), v178.DatabaseMonitorService(), v178.PunishmentTableService(), (CharSequence)v167, v178.e(), v178.LiteBansModule_435(), v178.m(), v178.GnuSparseMapHandler(), v178.BroadcastService(), v177, v178.r(), v178.AsyncBackgroundTask_5(), v178.LiteBansModule_241(), v178.AsyncBackgroundTask_22(), v178.BaseCoreGenericHandler(), null);
                                            v29.BaseCoreGenericHandler(v14, AllHandler_3.BaseCoreGenericHandler(v14, (CharSequence)MessageKey.cj, (SilentHandler)v169.BaseCoreGenericHandler, false, 2, null));
                                        } else if (v29.BanHandler_2()) {
                                            v179 = v29.q();
                                            v64 = v179;
                                            if (v64 == null) {
                                                v29.BaseCoreGenericHandler(v14, (Object)MessageKey.SQLiteDriverHandler_2);
                                                throw new CommandExitException();
                                            }
                                            v156 = v64;
                                            v179 = this;
                                            v180 = "litebans.delete" + (String)v145;
                                            v181 = v179.AsyncBackgroundTask_5();
                                            v182 = MessageHandler.BaseCoreGenericHandler;
                                            v183 = v181;
                                            v184 = v183;
                                            v185 = v184.e(v180) == false;
                                            v186 = MessageKey.cZ;
                                            v187 = v182;
                                            if (v185) {
                                                v188 = v187;
                                                v188.BaseCoreGenericHandler(v186);
                                                throw new CommandExitException();
                                            }
                                            v29.LiteBansModule_31(v14);
                                            AllHandler_3.BaseCoreGenericHandler(v14, (SilentHandler)v156, null, null, null, true, 14, null);
                                            v29.BaseCoreGenericHandler(v14, MessageKey.af);
                                        } else {
                                            v156 = this;
                                            v189 = "litebans + " + v29.ServerSyncService() + (String)v145;
                                            v190 = v156.AsyncBackgroundTask_5();
                                            v191 = MessageHandler.BaseCoreGenericHandler;
                                            v192 = v190;
                                            v193 = v192;
                                            v194 = v193.e((String)v189) == false;
                                            v195 = MessageKey.cZ;
                                            v196 = v191;
                                            if (v194) {
                                                v197 = v196;
                                                v197.BaseCoreGenericHandler(v195);
                                                throw new CommandExitException();
                                            }
                                            if (v29.GnuSparseMapHandler() == null && v26.K() && v29.ServerSyncService() != BanHandler.e && ((Collection)(v156 = v14.BaseCoreGenericHandler(v109  .g(), 1024))).isEmpty() == false) {
                                                v189 = new HashSet<PunishmentService>();
                                                v198 = v156.iterator();
                                                while (v198.hasNext()) {
                                                    v190 = (LiteBansModule_298)v198.next();
                                                    v199 = v190.c();
                                                    v200 = AllHandler_3.BaseCoreGenericHandler(v14, v199, (String)(v191 = v190.AsyncBackgroundTask_5()), v29.ServerSyncService(), v29.LiteBansModule_31(), false, true, 16, null);
                                                    if (v200 == null || CollectionUtilities.BaseCoreGenericHandler((Iterable)v189, (Object)v199) || v200.LiteBansModule_241()) continue;
                                                    v195 = v4;
                                                    if (v195.g()) {
                                                        v43 = v195;
                                                        v49   = v200;
                                                        v43.BaseCoreGenericHandler((Object)v49  );
                                                    }
                                                    v133 = v200;
                                                    v147.BaseCoreGenericHandler = true;
                                                    AllHandler_3.BaseCoreGenericHandler(v14, v29.AsyncBackgroundTask_5(), v29.H(), (CharSequence)v131, v200, false, 16, null);
                                                    CommandArgumentUtils.BaseCoreGenericHandler(v14, v200, true, v108);
                                                    v65 = v199;
                                                    ObjectUtilities.BaseCoreGenericHandler((Object)v65);
                                                    v189.add(v65);
                                                }
                                            }
                                            v189 = v156 = v29;
                                            if (v189.q() == null) {
                                                if (!v147.BaseCoreGenericHandler) {
                                                    v190 = v4;
                                                    v201 = 1;
                                                    if (v190.BaseCoreGenericHandler(v201)) {
                                                        v202 = v190;
                                                        v203 = "No active " + v189.ServerSyncService().c() + " found for uuid:" + v109  .BaseCoreGenericHandler() + " / ip:" + v109  .c() + " on server:" + v189.LiteBansModule_31() + " (target: '" + v109  .AsyncBackgroundTask_5() + "')";
                                                        v204 = ObjectUtilities.BaseCoreGenericHandler((Object)v189.AsyncBackgroundTask_21(), (Object)v109  .BaseCoreGenericHandler()) == false;
                                                        if (v204) {
                                                            v205 = "Try targeting LiteBansModule_61 UUID instead of name + ";
                                                            if (v205.length() > 0 != false) {
                                                                v206 = v203;
                                                                v207 = "\n";
                                                                v206 = "" + v206 + v207;
                                                                v66 = "" + v206 + v205;
                                                            } else {
                                                                v66 = v203;
                                                            }
                                                        } else {
                                                            v66 = v203;
                                                        }
                                                        v202.BaseCoreGenericHandler(v66);
                                                    }
                                                    v208 = v189.ServerSyncService();
                                                    switch (LiteBansModule_275.BaseCoreGenericHandler[v208.c().ordinal()]) {
                                                        case 1: {
                                                            v67 = MessageKey.SQLiteDriverHandler_2;
                                                            break;
                                                        }
                                                        case 2: {
                                                            v67 = MessageKey.di;
                                                            break;
                                                        }
                                                        case 3: {
                                                            v67 = MessageKey.BuilderactionHandler;
                                                            break;
                                                        }
                                                        default: {
                                                            AssertionUtilities.BaseCoreGenericHandler();
                                                            throw new CommandExitException();
                                                        }
                                                    }
                                                    v190 = v67;
                                                    if (v189.ServerSyncService() == BanHandler.AsyncBackgroundTask_5 && !v109  .LiteBansModule_31() && v108 && !LiteBansModule_346.BaseCoreGenericHandler(v109  .g())) {
                                                        v208 = v1;
                                                        v209 = "litebans.unban.queue";
                                                        if (v208.e(v209) && !v189.K()) {
                                                            this.plugin((LiteBansModule_114)v109  );
                                                            v190 = MessageKey.LiteBansModule_14;
                                                        }
                                                    }
                                                    v189.BaseCoreGenericHandler(v14, v190);
                                                    throw new CommandExitException();
                                                }
                                            } else {
                                                v190 = v4;
                                                if (v190.g()) {
                                                    v210 = v190;
                                                    v210.BaseCoreGenericHandler(v189.q());
                                                }
                                                if (v189.ServerSyncService() == BanHandler.e && v189.GnuSparseMapHandler() == null) {
                                                    v68 = v189.q();
                                                    ObjectUtilities.BaseCoreGenericHandler(v68);
                                                    AllHandler_3.BaseCoreGenericHandler(v14, v68, v189.AsyncBackgroundTask_5(), v189.H(), (CharSequence)v131, false, 16, null);
                                                } else {
                                                    v69 = v189.AsyncBackgroundTask_5();
                                                    v70 = v189.H();
                                                    v71 = v189.q();
                                                    ObjectUtilities.BaseCoreGenericHandler(v71);
                                                    v14.BaseCoreGenericHandler(v69, v70, (CharSequence)v131, v71, v189.GnuSparseMapHandler() != null);
                                                }
                                                if (v189.ServerSyncService() == BanHandler.e) {
                                                    v189.BaseCoreGenericHandler(v14, v14.BaseCoreGenericHandler((CharSequence)MessageKey.LiteBansModule_70, (CommandSenderWrapper)v66));
                                                }
                                                v190 = v14;
                                                v211 = BroadcastHandler.LiteBansModule_403.BaseCoreGenericHandler(v189.ServerSyncService());
                                                if (v190.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
                                                    v212 = v211;
                                                    v213 = v190;
                                                    v214 = ServerSyncService.GnuSparseMapHandler;
                                                    v72 = v189.q();
                                                    ObjectUtilities.BaseCoreGenericHandler(v72);
                                                    v215 = v72;
                                                    v216 = v109  ;
                                                    v217 = ServerSyncService.GnuSparseMapHandler;
                                                    v218 = new CharSequence[2];
                                                    v73 = v216.BaseCoreGenericHandler();
                                                    if (v73 == null) {
                                                        v73 = "";
                                                    }
                                                    v218[0] = LiteBansModule_50.c.AsyncBackgroundTask_5(v73);
                                                    v218[1] = v215.LiteBansModule_241() != false ? String.valueOf(v216.c()) : "";
                                                    v219 = ArrayUtilities.BaseCoreGenericHandler(v218, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                                    CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_83)v213, v212, v219, null, null, 12, null);
                                                }
                                                v74 = v14.e();
                                                v75 = v189.q();
                                                ObjectUtilities.BaseCoreGenericHandler(v75);
                                                LiteBansModule_269.BaseCoreGenericHandler.LiteBansModule_31(v14, v74, v75);
                                            }
                                            if (v29.q() == null) {
                                                v29.LiteBansModule_31((SilentHandler)v133);
                                            }
                                            if (v29.q() != null) {
                                                v189 = v29.ServerSyncService();
                                                switch (LiteBansModule_275.BaseCoreGenericHandler[v189.c().ordinal()]) {
                                                    case 1: {
                                                        v76 = MessageKey.cO;
                                                        break;
                                                    }
                                                    case 2: {
                                                        v76 = MessageKey.PlayerproviderHandler;
                                                        break;
                                                    }
                                                    case 3: {
                                                        v76 = MessageKey.ad;
                                                        break;
                                                    }
                                                    default: {
                                                        AssertionUtilities.BaseCoreGenericHandler();
                                                        throw new CommandExitException();
                                                    }
                                                }
                                                v156 = v76;
                                                v156 = AllHandler_3.BaseCoreGenericHandler(v14, (CharSequence)v156, v29.H(), v29.AsyncBackgroundTask_5(), false, 4, null);
                                                v156 = v14.BaseCoreGenericHandler((CharSequence)v156, (LiteBansModule_114)v109  );
                                                new BannedHandler((NoneHandler_2)v29, (CommandSenderWrapper)v66, v29.AsyncBackgroundTask_22(), (CharSequence)v156, v14.e(), null, false, v29.B(), 32, null).run();
                                                if (v29.ServerSyncService() == BanHandler.n) {
                                                    if (v108) {
                                                        v189 = this;
                                                        ((PunishmentTableService)v189.LiteBansModule_241().BaseCoreGenericHandler(PunishmentTableService.class)).BaseCoreGenericHandler(v29.q());
                                                    }
                                                    v189 = v14;
                                                    v220 = BroadcastHandler.AsyncBackgroundTask_21;
                                                    if (v189.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
                                                        v49   = v220;
                                                        v43 = v189;
                                                        v221 = ServerSyncService.GnuSparseMapHandler;
                                                        v77 = v29.q();
                                                        ObjectUtilities.BaseCoreGenericHandler(v77);
                                                        v222 = v77;
                                                        v223 = v109  ;
                                                        v224 = ServerSyncService.GnuSparseMapHandler;
                                                        v216 = new CharSequence[2];
                                                        v78 = v223.BaseCoreGenericHandler();
                                                        if (v78 == null) {
                                                            v78 = "";
                                                        }
                                                        v216[0] = LiteBansModule_50.c.AsyncBackgroundTask_5(v78);
                                                        v216[1] = v222.LiteBansModule_241() != false ? String.valueOf(v223.c()) : "";
                                                        v225 = ArrayUtilities.BaseCoreGenericHandler(v216, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                                        CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_83)v43, (BroadcastHandler)v49  , v225, null, null, 12, null);
                                                    }
                                                }
                                                v189 = this;
                                                v79 = ((BroadcastService)v189.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(v29.q());
                                            } else {
                                                ConfigService.BaseCoreGenericHandler(v4, null, 0, 2, null);
                                                v79 = KotlinUnitHandler.BaseCoreGenericHandler;
                                            }
                                        }
                                        break block268;
                                    }
                                    if (v29.ServerSyncService() == BanHandler.c) {
                                        v226 = v29.g();
                                        v227 = v226;
                                        if (ObjectUtilities.BaseCoreGenericHandler(v227.LiteBansModule_195() & 255, -1 & 255) < 0 == false) {
                                            v226 = SecHandler.AsyncBackgroundTask_5;
                                            v228 = v29.J();
                                            v229 = v26.ar();
                                            v230 = PermanentHandler.BaseCoreGenericHandler((PermanentHandler)v226, v229, 0.0, 2, null);
                                            v29.LiteBansModule_31((long)(v230 < 1.0 ? -1.0 : (double)v228 + v230));
                                        }
                                    }
                                    v29.LiteBansModule_31(v14);
                                    v29.LiteBansModule_31(Math.max(v29.DatabaseMonitorService(), 0L));
                                    v231 = new SilentHandler(v35, (LiteBansModule_114)v109  , (CharSequence)v131);
                                    v35.LiteBansModule_31(v231);
                                    v29.BaseCoreGenericHandler(InitHandler.i);
                                    v29.BaseCoreGenericHandler(v14, v1, v231, v29.AsyncBackgroundTask_22());
                                    v232 = this;
                                    v233 = v14;
                                    v234   = v109  .LiteBansModule_195();
                                    v235 = v29.LiteBansModule_435();
                                    v236 = v29.AsyncBackgroundTask_22();
                                    v237 = v231;
                                    switch (LiteBansModule_38.BaseCoreGenericHandler[v237.ServerSyncService().ordinal()]) {
                                        case 1: 
                                        case 2: {
                                            v238 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)v233, v237.DatabaseMonitorService(), v237.PunishmentTableService(), v237.ServerSyncService(), v237.m(), false, false, 48, null);
                                            if (v238 == null || LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(v238.m()) && !LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(v237.m()) || v238.LiteBansModule_241() && !v237.LiteBansModule_241() || v238.LiteBansModule_241() && v237.LiteBansModule_241() && (!ObjectUtilities.BaseCoreGenericHandler((Object)v237.DatabaseMonitorService(), (Object)v238.DatabaseMonitorService()) || !ObjectUtilities.BaseCoreGenericHandler((Object)v237.PunishmentTableService(), (Object)v238.PunishmentTableService()))) ** GOTO lbl1262
                                            v239 = v232.AsyncBackgroundTask_5();
                                            v240 = "litebans.override";
                                            v241 = v239;
                                            if (v241.e((String)v240) == false) {
                                                v239 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)v233, AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)v233, (CharSequence)(v237.ServerSyncService() == BanHandler.LiteBansModule_241 ? MessageKey.LiteBansModule_34 : MessageKey.SQLiteDriverHandler), v238, false, 2, null), v236, false, 2, null);
                                                MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(v239);
                                                throw new CommandExitException();
                                            }
                                            if (!v235) ** GOTO lbl1249
                                            v240 = (MessageHandler)v232;
                                            v241 = v240;
                                            if (!((ConfigService)v241.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().ax()) ** GOTO lbl-1000
                                            v240 = v238;
                                            if (v240.HoverTextFormatter() == false && (v237.HoverTextFormatter() || v237.n() > v238.n())) {
                                                v80 = true;
                                            } else lbl-1000:
                                                                                        {
                                                v80 = false;
                                            }
                                            v242 = v80;
                                            v240 = MessageHandler.BaseCoreGenericHandler;
                                            v243 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)v233, (CharSequence)(v237.ServerSyncService() == BanHandler.LiteBansModule_241 ? MessageKey.ai : MessageKey.LiteBansModule_5), v236, false, 2, null);
                                            v244 = v240;
                                            v245 = v242 == false;
                                            if (v245) {
                                                v246 = v244;
                                                v246.BaseCoreGenericHandler(v243);
                                                throw new CommandExitException();
                                            }
                                                                                        AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)v233, v35.AsyncBackgroundTask_5(), v35.H(), v237.LiteBansModule_31(), v238, false, 16, null);
                                            v81 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)v233, (CharSequence)(v237.ServerSyncService() == BanHandler.LiteBansModule_241 ? MessageKey.dB : MessageKey.ServerSyncService), v238, false, 2, null);
                                            v240 = new CharSequence[4];
                                            v240[0] = "bannedPlayer";
                                            ObjectUtilities.BaseCoreGenericHandler(v234  );
                                            v240[2] = "mutedPlayer";
                                            v240[3] = v234  ;
                                            v247 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)v233, (CharSequence)LiteBansModule_243.BaseCoreGenericHandler(v81, v240), v236, false, 2, null);
                                            if (StringUtilities.c(v247, '#', false, 2, null)) {
                                                v247 = LiteBansModule_435.LiteBansModule_31.BaseCoreGenericHandler(v247, "#offline#", (Object)v237.PunishmentTableService());
                                            }
                                            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, v232.AsyncBackgroundTask_5(), v247, null, 4, null);
                                            CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_83)v233, v238, true, v108);
                                                                                        v82 = KotlinUnitHandler.BaseCoreGenericHandler;
                                            break;
                                        }
                                        default: {
                                            v82 = KotlinUnitHandler.BaseCoreGenericHandler;
                                        }
                                    }
                                    if (v29.ServerSyncService() == BanHandler.c && v66 != null && v108) {
                                        v231.BaseCoreGenericHandler(true);
                                    }
                                    CommandArgumentUtils.BaseCoreGenericHandler(v14, v231, false, false, 6, null);
                                    v29.BaseCoreGenericHandler(v14, (CommandSenderWrapper)v66, (LiteBansModule_114)v109  , v108);
                                    this.plugin((NoneHandler_2)v29, (LiteBansModule_114)v109  );
                                    v29.BaseCoreGenericHandler(InitHandler.c);
                                    try {
                                        v232 = this;
                                        v233 = v14;
                                        v248 = v29;
                                        v232.BaseCoreGenericHandler((LiteBansModule_83)v233, v231, (NoneHandler_2)v248);
                                        if (!v248.PunishmentTableService()) {
                                            v249 = v248.ServerSyncService();
                                            switch (LiteBansModule_275.BaseCoreGenericHandler[v249.c().ordinal()]) {
                                                case 1: {
                                                    v83 = MessageKey.D;
                                                    break;
                                                }
                                                case 2: {
                                                    v83 = MessageKey.dA;
                                                    break;
                                                }
                                                case 3: {
                                                    v83 = MessageKey.CommandExitException;
                                                    break;
                                                }
                                                case 4: {
                                                    v83 = MessageKey.LiteBansModule_100;
                                                    break;
                                                }
                                                default: {
                                                    AssertionUtilities.BaseCoreGenericHandler();
                                                    throw new CommandExitException();
                                                }
                                            }
                                            v248.BaseCoreGenericHandler((LiteBansModule_83)v233, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(v83, (CharSequence)"tempDuration", v248.LiteBansModule_241()));
                                            switch (LiteBansModule_38.BaseCoreGenericHandler[v231.ServerSyncService().ordinal()]) {
                                                case 1: {
                                                    CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_83)v233, v231, v248.D());
                                                    v84 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                    break;
                                                }
                                                case 2: {
                                                    v250 = v232;
                                                    v251 = v233;
                                                    v252 = v251.e().q();
                                                    ObjectUtilities.BaseCoreGenericHandler(v252);
                                                    if (!(v252.length == 0)) {
                                                        v253 = v252;
                                                        v254 = v253;
                                                        v255   = new ArrayList<PunishmentService>();
                                                        v256 = ((CommandSenderWrapper[])v254).length;
                                                        for (v257 = 0; v257 < v256; ++v257) {
                                                            v258 = v259 = v254[v257];
                                                            ObjectUtilities.BaseCoreGenericHandler(v258);
                                                            if (!v251.BaseCoreGenericHandler(v231, v258)) continue;
                                                            v255  .add(v259);
                                                        }
                                                        v253 = (List)v255  ;
                                                        v254 = v253.iterator();
                                                        while (v254.hasNext()) {
                                                            v255   = v254.next();
                                                            v260 = (CommandSenderWrapper)v255  ;
                                                            v261 = (MessageHandler)v250;
                                                            ((PunishmentTableService)v261.LiteBansModule_241().BaseCoreGenericHandler(PunishmentTableService.class)).BaseCoreGenericHandler(v260.BaseCoreGenericHandler(), v231);
                                                        }
                                                    }
                                                    v84 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                    break;
                                                }
                                                case 3: {
                                                    v262 = v232;
                                                    v263 = v233;
                                                    v264 = v231;
                                                    v265 = (MessageHandler)v262;
                                                    v266 = v265;
                                                    if (!(((ConfigService)v266.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().A().length == 0)) {
                                                        v265 = (CommandThrottleService)v263.e().BaseCoreGenericHandler(CommandThrottleService.class);
                                                        if (v264.DatabaseMonitorService() == null) {
                                                            v267 = (MessageHandler)v262;
                                                            ConfigService.BaseCoreGenericHandler((ConfigService)v267.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class), (Object)"null", 0, 2, null);
                                                        } else {
                                                            v268 = v263.BaseCoreGenericHandler(v264, 512);
                                                            v266 = v263.c(v264.DatabaseMonitorService());
                                                            if (v266 == null) {
                                                                v269 = (MessageHandler)v262;
                                                                ConfigService.BaseCoreGenericHandler((ConfigService)v269.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class), (Object)"null", 0, 2, null);
                                                            } else {
                                                                v270 = v266.BaseCoreGenericHandler();
                                                                v257 = v268.size();
                                                                v271 = (MessageHandler)v262;
                                                                v271 = (ConfigService)v271.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class);
                                                                v272 = 10;
                                                                if (v271.BaseCoreGenericHandler(v272)) {
                                                                    v273 = v271;
                                                                    v273.BaseCoreGenericHandler((Object)("Active warnings: " + v257));
                                                                }
                                                                v274 = (MessageHandler)v262;
                                                                v275 = v274;
                                                                for (Object v275 : ((ConfigService)v275.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().A()) {
                                                                    if (StringUtilities.LiteBansModule_31((CharSequence)v275)) continue;
                                                                    v276   = new char[]{':'};
                                                                    v276   = (char[])StringUtilities.BaseCoreGenericHandler((CharSequence)v275, v276  , false, 2, 2, null);
                                                                    v277 = v276  ;
                                                                    v278 = v277.toArray(new String[0]);
                                                                    if (StringUtilities.LiteBansModule_31((CharSequence)v278[0], '+', false, 2, null)) {
                                                                        v278[0] = v278[0].substring(0, v278[0].length() - 1);
                                                                    }
                                                                    if (!StringUtilities.c((CharSequence)v275, ':', false, 2, null) || !LiteBansModule_346.BaseCoreGenericHandler.AsyncBackgroundTask_5(v278[0])) {
                                                                        v263.e().getLogger().warning("Warning action is invalid (bad format): '" + (String)v275 + "'. Ignored + ");
                                                                        continue;
                                                                    }
                                                                    v279 = Integer.parseInt(v278[0]);
                                                                    if (v279 < 1 && !v280) {
                                                                        v263.e().getLogger().warning("Warning action is invalid (threshold " + v279 + " < 1): '" + (String)v275 + "'. Ignored + ");
                                                                        continue;
                                                                    }
                                                                    if (v257 != v279 && (!v280 || v257 <= v279)) continue;
                                                                    v277 = new LiteBansModule_145();
                                                                    v277.BaseCoreGenericHandler = v278[1];
                                                                    if (StringUtilities.BaseCoreGenericHandler((CharSequence)v277.BaseCoreGenericHandler, '/', false, 2, null)) {
                                                                        v281 = (CharSequence)v277.BaseCoreGenericHandler;
                                                                        v282 = 1;
                                                                        v283 = v281.length();
                                                                        v277.BaseCoreGenericHandler = v281.subSequence(v282, v283).toString();
                                                                    }
                                                                    if (GeoIPLookupService.LiteBansModule_31((CharSequence)v277.BaseCoreGenericHandler, "list")) {
                                                                        v281 = new StringBuilder();
                                                                        v284 = v268;
                                                                        for (T v285 : v284) {
                                                                            v286 = (SilentHandler)v285;
                                                                            v281.append('\n').append(AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)v263, (CharSequence)MessageKey.UsageHandler, v286, false, 2, null));
                                                                        }
                                                                        v277.BaseCoreGenericHandler = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)v277.BaseCoreGenericHandler, (CharSequence)"list", v281);
                                                                    }
                                                                    v277.BaseCoreGenericHandler = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)v263, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)v263, (CharSequence)v277.BaseCoreGenericHandler, v264, false, 2, null), (CharSequence)"player", (Object)v270), (LiteBansModule_298)v266, false, 2, null);
                                                                    v281 = (MessageHandler)v262;
                                                                    ((ConfigService)v281.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler(10, v277.BaseCoreGenericHandler);
                                                                    v287 = (MessageHandler)v262;
                                                                    v288 = v287;
                                                                    v85 = v281 = ((ConfigService)v288.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule() != false ? v263.e().HoverTextFormatter() : v262.AsyncBackgroundTask_5();
                                                                    ObjectUtilities.BaseCoreGenericHandler(v85);
                                                                    v265.LiteBansModule_31((byte)3, v85.BaseCoreGenericHandler());
                                                                    v263.e().c(new AsyncBackgroundTask_2((CommandSenderWrapper)v281, (LiteBansModule_145)v277));
                                                                    v287 = (MessageHandler)v262;
                                                                    v288 = v287;
                                                                    if (!((ConfigService)v288.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_2()) continue;
                                                                    v287 = (MessageHandler)v262;
                                                                    v288 = v287;
                                                                    if (v275 != ArrayUtilities.c(((ConfigService)v288.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().A())) continue;
                                                                    v287 = v268;
                                                                    v288 = v287.iterator();
                                                                    while (v288.hasNext()) {
                                                                        v289 = v288.next();
                                                                        v286 = (SilentHandler)v289;
                                                                        AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)v263, v286, v264.e(), v264.LiteBansModule_435(), null, false, 24, null);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    v84 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                    break;
                                                }
                                                case 4: {
                                                    AssertionUtilities.BaseCoreGenericHandler();
                                                    throw new CommandExitException();
                                                }
                                                default: {
                                                    AssertionUtilities.BaseCoreGenericHandler();
                                                    throw new CommandExitException();
                                                }
                                            }
                                            v249 = (MessageHandler)v232;
                                            v237 = (BroadcastService)v249.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class);
                                            v237.BaseCoreGenericHandler((LiteBansModule_83)v233, (NoneHandler_2)v29);
                                        }
                                        if (!v248.PunishmentTableService()) {
                                            v290 = (MessageHandler)v232;
                                            v291 = v290;
                                            if (((ConfigService)v291.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().e() > 0 && v231.ServerSyncService() == BanHandler.LiteBansModule_241 && v231.LiteBansModule_241() && v231.DatabaseMonitorService() != null) {
                                                v290 = MessageHandler.BaseCoreGenericHandler;
                                                v292 = v233.AsyncBackgroundTask_5().CommandThrottleService() == false;
                                                v291 = MessageKey.LiteBansModule_118;
                                                v293 = v290;
                                                if (v292) {
                                                    v294 = v293;
                                                    v294.BaseCoreGenericHandler(v291);
                                                    throw new CommandExitException();
                                                }
                                                v290 = new LiteBansModule_207(v231.DatabaseMonitorService(), (LiteBansModule_83)v233, null, false, 0, 28, null).i();
                                                if (v290.n()) {
                                                    block269: {
                                                        v295 = MessageHandler.BaseCoreGenericHandler;
                                                        v296 = v290.m() > 10 && v248.LiteBansModule_195() == false;
                                                        if (v296) {
                                                            v297 = v295;
                                                            v297.BaseCoreGenericHandler(MessageKey.U.BaseCoreGenericHandler("list", (Object)v290.c()));
                                                            throw new CommandExitException();
                                                        }
                                                        v295 = MessageHandler.BaseCoreGenericHandler;
                                                        v298 = v290.LiteBansModule_241();
                                                        if (v298 instanceof Collection && ((Collection)v298).isEmpty()) {
                                                            v86 = false;
                                                        } else {
                                                            for (T v299 : v298) {
                                                                v300 = (LiteBansModule_328)v299;
                                                                if (!ObjectUtilities.BaseCoreGenericHandler((Object)v300.LiteBansModule_31(), (Object)v248.AsyncBackgroundTask_5())) continue;
                                                                v86 = true;
                                                                break block269;
                                                            }
                                                            v86 = false;
                                                        }
                                                    }
                                                    v301 = v86;
                                                    v302 = MessageKey.aa;
                                                    v303 = v295;
                                                    if (v301) {
                                                        v304 = v303;
                                                        v304.BaseCoreGenericHandler(v302);
                                                        throw new CommandExitException();
                                                    }
                                                    for (LiteBansModule_328 v305 : v290.LiteBansModule_241()) {
                                                        if (LiteBansModule_346.BaseCoreGenericHandler.GnuSparseMapHandler(v305.LiteBansModule_31()) == null || ObjectUtilities.BaseCoreGenericHandler((Object)v305.LiteBansModule_31(), (Object)v231.DatabaseMonitorService()) || v305.c() != null && ObjectUtilities.BaseCoreGenericHandler((Object)v305.c().DatabaseMonitorService(), (Object)v305.LiteBansModule_31()) || AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)v233, (UUID)v302, null, 2, null)) continue;
                                                        v248.BaseCoreGenericHandler((LiteBansModule_83)v233, v305.e(), v305.LiteBansModule_31());
                                                        v87 = v248.AsyncBackgroundTask_22();
                                                        v88 = v248.AsyncBackgroundTask_22();
                                                        CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_83)v233, v305, v231, v87 != null ? v87.BaseCoreGenericHandler() : null, v88 != null ? v88.i() : null, null, null, false, 112, null);
                                                    }
                                                }
                                            }
                                        }
                                        v232 = v14;
                                        v233 = BroadcastHandler.LiteBansModule_403.BaseCoreGenericHandler(v29.ServerSyncService());
                                        if (!v232.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) break block270;
                                        v49   = v233;
                                        v43 = v232;
                                        v306 = ServerSyncService.GnuSparseMapHandler;
                                        v307 = v109  ;
                                        v308 = ServerSyncService.GnuSparseMapHandler;
                                    }
                                    catch (Throwable v309) {
                                        v233 = v14;
                                        v234   = BroadcastHandler.LiteBansModule_403.BaseCoreGenericHandler(v29.ServerSyncService());
                                        if (v233.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
                                            v49   = v234  ;
                                            v43 = v233;
                                            v310 = ServerSyncService.GnuSparseMapHandler;
                                            v311 = v109  ;
                                            v312 = ServerSyncService.GnuSparseMapHandler;
                                            v313 = new CharSequence[2];
                                            v89 = v311.BaseCoreGenericHandler();
                                            if (v89 == null) {
                                                v89 = "";
                                            }
                                            v313[0] = LiteBansModule_50.c.AsyncBackgroundTask_5(v89);
                                            v313[1] = v231.LiteBansModule_241() != false ? String.valueOf(v311.c()) : "";
                                            v314 = ArrayUtilities.BaseCoreGenericHandler(v313, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                            CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_83)v43, (BroadcastHandler)v49  , v314, null, null, 12, null);
                                        }
                                        throw v309;
                                    }
                                    v315 = new CharSequence[2];
                                    v90 = v307.BaseCoreGenericHandler();
                                    if (v90 == null) {
                                        v90 = "";
                                    }
                                    v315[0] = LiteBansModule_50.c.AsyncBackgroundTask_5(v90);
                                    v315[1] = v231.LiteBansModule_241() != false ? String.valueOf(v307.c()) : "";
                                    v316 = ArrayUtilities.BaseCoreGenericHandler(v315, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                    CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_83)v43, (BroadcastHandler)v49  , v316, null, null, 12, null);
                                }
                                v29.BaseCoreGenericHandler(InitHandler.e);
                            }
                            finally {
                                v29.BaseCoreGenericHandler(InitHandler.LiteBansModule_31);
                            }
                        }
                        catch (LiteBansException_2 v317) {
                        }
                    }
                    v13 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable v318) {
                    v319 = v318;
                    throw v318;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(v12, v319);
                }
            }
            catch (SQLException v320) {
                if (v6.LiteBansModule_31(v320)) break block271;
                throw v320;
            }
        }
    }

    private final void LiteBansModule_31(NoneHandler_2 cz2, String string) {
        LiteBansModule_65 c12 = this.plugin(cz2, string);
        if (c12 == null) {
            cz2.n().append(string).append(' ');
        } else {
            this.plugin(cz2, c12);
        }
    }

    private final void BaseCoreGenericHandler(NoneHandler_2 cz2, LiteBansModule_65 c12) {
        cz2.BaseCoreGenericHandler(c12);
        MessageHandler messageHandler = this;
        cz2.BaseCoreGenericHandler(((ConfigService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).AsyncBackgroundTask_21().BaseCoreGenericHandler(cz2.ServerSyncService(), c12));
    }

    private final LiteBansModule_65 BaseCoreGenericHandler(NoneHandler_2 cz2, String string) {
        LiteBansModule_65 c12;
        if (((CharSequence)cz2.n()).length() > 0 || ((CharSequence)cz2.AsyncBackgroundTask_21()).length() == 0 || cz2.PunishmentService() || cz2.BanHandler_5()) {
            c12 = null;
        } else {
            MessageHandler messageHandler = this;
            c12 = ((ConfigService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).AsyncBackgroundTask_21().BaseCoreGenericHandler(cz2.ServerSyncService(), string);
        }
        return c12;
    }

    private final void BaseCoreGenericHandler(NoneHandler_2 cz2, LiteBansModule_114 d92) {
        if (cz2.ServerSyncService() == BanHandler.LiteBansModule_241) {
            String string;
                        targetObj = ((BroadcastService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).LiteBansModule_195();
            String string2 = d92.AsyncBackgroundTask_5();
            if (string2 != null) {
                String string3 = string2;
                string = string3.toLowerCase(Locale.ENGLISH);
            } else {
                string = null;
            }
            String string4 = string;
            NullHandler_6.LiteBansModule_31(targetObj).remove(string4);
        }
    }

    private final void BaseCoreGenericHandler(LiteBansModule_114 d92) {
        String string;
        String string2;
                MessageHandler messageHandler = (MessageHandler)targetObj;
        if (((BroadcastService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).LiteBansModule_195().size() >= 128) {
            messageHandler = (MessageHandler)targetObj;
            flag2 = false;
            ((BroadcastService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).LiteBansModule_195().clear();
            ((MessageHandler)targetObj).LiteBansModule_241().getLogger().warning("Too many unbanned players InitializerHandler_3 queue! Cleared list to prevent memory ");
        }
        if ((string2 = d92.g()) == null || (string2 = (string = string2).toLowerCase(Locale.ENGLISH)) == null) {
            return;
        }
        targetObj = string2;
        MessageHandler fg_03 = this;
        ((BroadcastService)fg_03.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).LiteBansModule_195().add(targetObj);
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(CommandSenderWrapper sender, LiteBansModule_83 ch2) {
        AllHandler_3.BaseCoreGenericHandler(ch2, sender.i(), sender.BaseCoreGenericHandler(), sender.LiteBansModule_31(), false, false, 16, null);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(NoneHandler_2 cz2, LiteBansModule_83 ch2) {
        LiteBansModule_298 iA2 = cz2.AsyncBackgroundTask_22();
        ObjectUtilities.BaseCoreGenericHandler(iA2);
        ch2.BaseCoreGenericHandler(iA2, false);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    static {
        BanHandler_3.LiteBansModule_31();
        GnuSparseMapHandler = new UsageHandler(null);
    }

    private static final void LiteBansModule_31() {
        Utf8Handler_2 = new String[]{"ban", "[c] ", "[LiteBans]", " Plugin access has been disabled!", "litebans.admin", "[LiteBans]", " If you have bought LiteBans, contact Ruan on ", "\n", "Timeout after ", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", " seconds", "duration:permanent", "\\-", "-", "", "", "", "", "", "litebans.temp", "", "litebans.ip", "", "litebans.ip", "litebans.ip", "", "litebans.modify", "", ".own", "litebans.ip", ".wildcard", "_USAGE", "_USAGE", "litebans + ", "litebans + ", "litebans.ip", "#offline#", "#offline#", "#", "#", "#", "player", "Hiding IP address from broadcast: ", "", "Applying ", " template group ", ": weight ", " => ", " (", "Applying ", " template \"", "\" LiteBansModule_21 level ", "", "", ".own", "", "[0xff] ", " (LiteBansModule_435=", "litebans.modify", "litebans.delete", "", "No active ", " found for uuid:", " / ip:", " on server:", " (target: '", "')", "Try targeting LiteBansModule_61 UUID instead of ", "\n", "litebans.unban.queue", "", "", "\ufeff", "", "", "\ufeff", "litebans.override", "bannedPlayer", "mutedPlayer", "#offline#", "tempDuration", "null", "null", "Active warnings: ", "Warning action is invalid (bad format): '", "' + ", "Warning action is invalid (threshold ", " < 1): '", "' + ", "list", "list", "player", "list", "", "", "\ufeff", "", "", "\ufeff", "Too many unbanned players InitializerHandler_3 queue! Cleared list to prevent memory ", "Too many unbanned players InitializerHandler_3 queue! Cleared list to prevent memory ", "litebans.override", "bannedPlayer", "mutedPlayer", "#offline#", "null", "null", "Active warnings: ", "Warning action is invalid (bad format): '", "' + ", "Warning action is invalid (threshold ", " < 1): '", "' + ", "list", "list", "player", "tempDuration", "null", "null", "Active warnings: ", "Warning action is invalid (bad format): '", "' + ", "Warning action is invalid (threshold ", " < 1): '", "' + ", "list", "list", "player", "list"};
    }
}

