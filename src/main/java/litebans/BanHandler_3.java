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
{
            arg1 = this;
            arg2 = (ConfigService)arg1.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
            arg1 = this.LiteBansModule_240().DatabaseMonitorService();
            arg3 = arg1.size();
            try {
                arg4 = arg2;
                if (arg4.g()) {
                    arg5 = arg4;
                    arg6 = "[c] " + arg3;
                    arg5.BaseCoreGenericHandler((Object)arg6);
}
            catch (LiteBansException_4 arg7) {
                arg8 = arg2;
                if (ObjectUtilities.BaseCoreGenericHandler(LiteBansModule_253.BaseCoreGenericHandler((ConfigService)arg8), (Object)MessageKey.BaseCoreGenericHandler(arg8, false, true))) {
                    arg2.LiteBansModule_31((byte)49);
                }
                arg8 = this;
                ((DatabaseMonitorService)arg8.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg7);
                return;
            }
            arg4 = this;
            arg4 = (DatabaseMonitorService)arg4.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            try {
                arg9 = arg4.LiteBansModule_194();
                arg10 = arg9;
                try {
{
                        arg11 = (LiteBansModule_82)arg10;
                        arg12 = arg9;
                        arg13 = new LiteBansException_2();
                        if (arg12.LiteBansModule_31()) {
                            arg14 = MessageHandler.BaseCoreGenericHandler;
                            arg15 = arg2.DatabaseMonitorService() != null;
                            arg16 = BlackHandler.c + "[LiteBans]" + BlackHandler.F + " Plugin access has been disabled!";
                            arg17 = v1;
                            arg18 = "litebans.admin";
                            arg19 = arg17.e(arg18);
                            if (arg19) {
                                arg20 = BlackHandler.c + "[LiteBans]" + BlackHandler.AsyncBackgroundTask_5 + " If you have bought LiteBans, contact Ruan on SpigotMC + ";
                                if (arg20 != null && arg20.length() > 0 != false) {
                                    arg21 = arg16;
                                    arg22 = "\n";
                                    arg21 = "" + arg21 + arg22;
                                    v0 = "" + arg21 + arg20;
                                } else {
                                    v0 = arg16;
} else {
                                v0 = arg16;
                            }
                            arg16 = LiteBansModule_242.BaseCoreGenericHandler(v0, (CharSequence)arg2.GnuSparseMapHandler());
                            arg23 = arg14;
                            if (arg15) {
                                arg20 = arg23;
                                arg20.BaseCoreGenericHandler(arg16);
                                throw new CommandExitException();
                            }
                            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.ServerEventListener);
                            throw new CommandExitException();
                        }
                        try {
                            if (LiteBansCommand.i == null) {
                                throw arg13;
                            }
                            arg24 = arg2.LiteBansModule_194();
                            arg25 = arg12.e().q();
                            arg26 = arg24.BuilderactionHandler();
                            arg27 = BanHandler.LiteBansModule_240;
                            arg28 = arg24.ServerSyncService();
                            arg29 = arg24.n();
                            arg30 = arg12.AsyncBackgroundTask_5().BaseCoreGenericHandler(v1);
                            arg31 = DatabaseMonitorService.BaseCoreGenericHandler(arg12.AsyncBackgroundTask_5(), false, 1, null);
                            arg32 = arg12.BaseCoreGenericHandler(v1);
                            arg33 = new NoneHandler_2((BanHandler)arg27, arg28, arg29, false, false, false, false, false, false, false, false, false, false, false, arg31, 0L, 0L, 0, null, null, false, null, 0, null, null, null, null, v1, (String)arg32, null, arg26, arg30, null, null, v2, null, null, 671072248, 27, null);
                            arg27 = arg33;
                            try {
{
                                                                                            NoneHandler_2.BaseCoreGenericHandler((NoneHandler_2)arg27, arg12, null, false, 3, null);
                                                                                            arg34 = MessageHandler.BaseCoreGenericHandler;
                                                                                            arg35 = arg27.ServerSyncService().c() == BanHandler.GnuSparseMapHandler && arg24.PunishmentTableService() == false ? 1 : 0;
                                                                                            arg36 = MessageKey.LiteBansModule_134;
                                                                                            arg32 = arg34;
                                                                                            if (arg35 != 0) {
                                                                                                arg37 = arg32;
                                                                                                arg37.BaseCoreGenericHandler(arg36);
                                                                                                throw new CommandExitException();
                                                                                            }
                                                                                            arg34 = MessageHandler.BaseCoreGenericHandler;
                                                                                            arg35 = arg27.Utf8Handler_2() != false && v1.e() != false && arg24.LiteBansModule_24() != false ? 1 : 0;
                                                                                            arg36 = MessageKey.LiteBansModule_31;
                                                                                            arg32 = arg34;
                                                                                            if (arg35 != 0) {
                                                                                                arg38 = arg32;
                                                                                                arg38.BaseCoreGenericHandler(arg36);
                                                                                                throw new CommandExitException();
                                                                                            }
                                                                                            arg34 = MessageHandler.BaseCoreGenericHandler;
                                                                                            arg35 = arg27.F() != false && v1.e() != false && arg24.LiteBansModule_17() != false ? 1 : 0;
                                                                                            arg36 = MessageKey.LiteBansModule_31;
                                                                                            arg32 = arg34;
                                                                                            if (arg35 != 0) {
                                                                                                arg39 = arg32;
                                                                                                arg39.BaseCoreGenericHandler(arg36);
                                                                                                throw new CommandExitException();
                                                                                            }
                                                                                            arg40 = arg2.i().BaseCoreGenericHandler(10);
                                                                                            switch (arg40) {
                                                                                                case 0:
                                                                                                case 1: {
                                                                                                    arg35 = arg2.i().BaseCoreGenericHandler(10);
                                                                                                    if (arg35 != 1) ** GOTO lbl182
                                                                                                    arg36 = arg2;
                                                                                                    if (!arg36.g()) ** GOTO lbl183
                                                                                                    arg41 = arg36;
                                                                                                    v1 = new StringBuilder().append("Timeout after ");
                                                                                                    arg42 = AbstractCommand.AsyncBackgroundTask_5;
                                                                                                    arg43   = this.getName();
                                                                                                    arg44 = arg43  ;
                                                                                                    switch (arg44.hashCode()) {
                                                                                                        case -1320563219: {
                                                                                                            if (arg44.equals("dupeip")) break;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 712910260: {
                                                                                                            if (!arg44.equals("staffhistory")) {
                                                                                                                break;
                                                                                                            }
                                                                                                            ** GOTO lbl171
                                                                                                        }
                                                                                                        case 926934164: {
                                                                                                            if (!arg44.equals("history")) {
                                                                                                                break;
                                                                                                            }
                                                                                                            ** GOTO lbl168
}
                                                                                                    arg45   = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                                                                                                    v2 = arg45  ;
                                                                                                    ** GOTO lbl177
                                                                                                                                                                                                        arg45   = new String[]{"hist", "litebans:history"};
                                                                                                    v2 = arg45  ;
                                                                                                    ** GOTO lbl177
                                                                                                                                                                                                        arg45   = new String[]{"staffhist", "litebans:staffhistory"};
                                                                                                    v2 = arg45  ;
                                                                                                    ** GOTO lbl177
                                                                                                                                                                                                        arg45   = new String[]{"litebans:" + (String)arg43  };
                                                                                                    v2 = arg45  ;
                                                                                                                                                                                                        arg46 = v2;
                                                                                                    arg47   = v1.append((Object)LiteBansModule_72.c(new LiteBansModule_403(arg2, Arrays.copyOf(arg46, ((String[])arg46).length)).LiteBansModule_31())).append(" seconds").toString();
                                                                                                    arg41.BaseCoreGenericHandler((Object)arg47  );
                                                                                                    ** GOTO lbl183
                                                                                                                                                                                                        arg12.AsyncBackgroundTask_5().c();
                                                                                                                                                                                                        v3 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                case 2: {
                                                                                                    LiteBansModule_253.BaseCoreGenericHandler(arg2, MessageKey.BaseCoreGenericHandler(arg2.LiteBansModule_194(), false, true));
                                                                                                    v3 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                case 3:
                                                                                                case 4:
                                                                                                case 5:
                                                                                                case 6:
                                                                                                case 7: {
                                                                                                    arg35 = arg2.LiteBansModule_401();
                                                                                                    if (arg35 == 1 && new LiteBansModule_324(0L, 1, null).BaseCoreGenericHandler((int)arg2.q()) == 0 || arg35 == 2 && (long)arg25.length >= arg2.q() || arg35 == 3 && AllHandler_3.BaseCoreGenericHandler(arg12, BansHandler_2.Utf8Handler_2, null, true, 2, null) >= arg2.q()) {
                                                                                                        arg2.BaseCoreGenericHandler(new LiteBansModule_324(0L, 1, null));
                                                                                                    }
                                                                                                    while (arg48 < arg27.A().size()) {
                                                                                                        arg49 = arg27.A().get(arg48);
                                                                                                        arg50 = (String)arg49;
                                                                                                        if (((CharSequence)arg50).length() == 0) {
                                                                                                            ++arg48;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (ObjectUtilities.BaseCoreGenericHandler((Object)arg50, (Object)"duration:permanent") && (arg27.F() || !arg27.BanHandler_5() && arg27.ServerSyncService().c() != BanHandler.c)) {
                                                                                                            arg27.LiteBansModule_31(-2L);
                                                                                                            arg27.LiteBansModule_401(false);
                                                                                                            ++arg48;
                                                                                                            continue;
                                                                                                        }
                                                                                                        arg50 = LiteBansModule_433.LiteBansModule_31.BaseCoreGenericHandler(arg50, "\\-", (Object)"-");
                                                                                                        arg51 = arg48 == arg27.A().size() - 1;
                                                                                                        arg52 = LiteBansModule_81.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(), arg50, "");
                                                                                                        arg43   = this.plugin((NoneHandler_2)arg27, arg50);
                                                                                                        if (arg43   == null) ** GOTO lbl214
                                                                                                        this.plugin((NoneHandler_2)arg27, (LiteBansModule_65)arg43  );
                                                                                                        ** GOTO lbl304
                                                                                                                                                                                                                if (!arg27.F() && arg27.BanHandler_5() || arg27.ServerSyncService().c() == BanHandler.c || arg27.DatabaseMonitorService() != -1L || !Character.isDigit(arg50.charAt(0)) || StringUtilities.c((CharSequence)arg50, ':', false, 2, null) || StringUtilities.c((CharSequence)arg50, '%', false, 2, null) || StringUtilities.c((CharSequence)arg50, '*', false, 2, null) || !HexEncodingHelper.BaseCoreGenericHandler.c(arg52) || HexEncodingHelper.BaseCoreGenericHandler(arg50)) ** GOTO lbl296
                                                                                                        if (!(((CharSequence)arg27.AsyncBackgroundTask_21()).length() == 0) || arg50.length() <= 1) ** GOTO lbl251
                                                                                                        arg53 = BlackHandler.BaseCoreGenericHandler((CharSequence)arg50);
                                                                                                        ObjectUtilities.BaseCoreGenericHandler(arg25);
                                                                                                        arg45   = arg25;
                                                                                                        ObjectUtilities.BaseCoreGenericHandler(arg53);
                                                                                                        arg46 = arg53;
                                                                                                        arg54 = arg45  ;
                                                                                                        arg55 = ((Object)arg54).length;
                                                                                                        for (arg56 = 0; arg56 < arg55; ++arg56) {
                                                                                                            arg57 = arg58 = arg54[arg56];
                                                                                                            if (!StringUtilities.BaseCoreGenericHandler(arg57.i(), (String)arg46, arg59)) continue;
                                                                                                            v4 = arg58;
                                                                                                            ** GOTO lbl233
                                                                                                        }
                                                                                                                                                                                                                if ((arg60 = v4) != null) {
                                                                                                            arg45   = arg60.i();
                                                                                                            arg27.LiteBansModule_31((String)arg45  );
                                                                                                            if (AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg12.e(), arg27.CommandThrottleService())) {
                                                                                                                arg12.AsyncBackgroundTask_5().BaseCoreGenericHandler((LiteBansModule_178)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, BaseCoreGenericHandler(litebans.CommandSenderWrapper litebans.LiteBansModule_82 ), (Llitebans/LiteBansModule_82;)Llitebans/iV;)((CommandSenderWrapper)arg60));
                                                                                                            }
                                                                                                            ++arg48;
                                                                                                            continue;
                                                                                                        }
                                                                                                        arg27.BaseCoreGenericHandler(arg12.c(arg50));
                                                                                                        if (arg27.AsyncBackgroundTask_22() != null) {
                                                                                                            arg45   = arg27.AsyncBackgroundTask_22();
                                                                                                            v5 = arg45  ;
                                                                                                            if (v5 == null || (v5 = (arg46 = v5.BaseCoreGenericHandler())) == null) {
                                                                                                                v5 = "";
                                                                                                            }
                                                                                                            arg27.LiteBansModule_31((String)v5);
                                                                                                            ++arg48;
                                                                                                            continue;
                                                                                                        }
                                                                                                                                                                                                                if ((arg53 = StringUtilities.LiteBansModule_31(arg52)) == null) {
                                                                                                            if (((CharSequence)arg27.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                                arg27.LiteBansModule_31(arg50);
                                                                                                            }
                                                                                                            ++arg48;
                                                                                                            continue;
                                                                                                        }
                                                                                                        arg61 = LiteBansModule_81.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5.LiteBansModule_31(), arg50, "");
                                                                                                        arg45   = SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg61);
                                                                                                        if (arg45   == null) {
                                                                                                            if (arg51) {
                                                                                                                if (((CharSequence)arg27.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                                    arg27.LiteBansModule_31(arg50);
                                                                                                                } else {
                                                                                                                    this.LiteBansModule_31((NoneHandler_2)arg27, arg50);
                                                                                                                }
                                                                                                                ++arg48;
                                                                                                                continue;
                                                                                                            }
                                                                                                            arg62   = arg27.A().get(++arg48);
                                                                                                            arg46 = (String)arg62  ;
                                                                                                            arg45   = SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg46);
                                                                                                            if (arg45   == null) {
                                                                                                                if (((CharSequence)arg27.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                                    arg27.LiteBansModule_31(arg50);
                                                                                                                    arg62   = LiteBansModule_81.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5.LiteBansModule_31(), (CharSequence)arg46, "");
                                                                                                                    arg63 = SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg62  );
                                                                                                                    if (arg63 == null) {
                                                                                                                        this.LiteBansModule_31((NoneHandler_2)arg27, (String)arg46);
                                                                                                                    } else {
                                                                                                                        arg54 = StringUtilities.LiteBansModule_31(LiteBansModule_81.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(), (CharSequence)arg46, ""));
                                                                                                                        if (arg54 == null) {
                                                                                                                            this.LiteBansModule_31((NoneHandler_2)arg27, (String)arg46);
                                                                                                                        } else {
                                                                                                                            arg27.BaseCoreGenericHandler(arg63.LiteBansModule_31(arg54.doubleValue()));
                                                                                                                            arg27.LiteBansModule_31(arg27.J() + arg27.BroadcastService());
                                                                                                                            arg27.BaseCoreGenericHandler((CharSequence)(LiteBansModule_287.BaseCoreGenericHandler(arg54.doubleValue()) + ' ' + arg63.BaseCoreGenericHandler(arg54.doubleValue())));
}
                                                                                                                    v6 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                                } else {
                                                                                                                    v6 = arg27.n().append(arg50).append(' ').append((String)arg46).append(' ');
                                                                                                                }
                                                                                                                ++arg48;
                                                                                                                continue;
}
                                                                                                        arg27.BaseCoreGenericHandler(arg45  .LiteBansModule_31(arg53.doubleValue()));
                                                                                                        arg27.LiteBansModule_31(arg27.J() + arg27.BroadcastService());
                                                                                                        arg27.BaseCoreGenericHandler((CharSequence)(LiteBansModule_287.BaseCoreGenericHandler(arg53.doubleValue()) + ' ' + arg45  .BaseCoreGenericHandler(arg53.doubleValue())));
                                                                                                        ** GOTO lbl304
                                                                                                                                                                                                                if (((CharSequence)arg27.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                            arg27.LiteBansModule_31(arg50);
                                                                                                        } else {
                                                                                                            this.LiteBansModule_31((NoneHandler_2)arg27, arg50);
                                                                                                            arg53 = this;
                                                                                                            if (((BroadcastService)arg53.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).GnuSparseMapHandler() == 0) {
                                                                                                                throw arg13;
}
                                                                                                                                                                                                                ++arg48;
                                                                                                    }
                                                                                                    if (arg27.DatabaseMonitorService() > 0L) {
                                                                                                        arg27.LiteBansModule_401(true);
                                                                                                    }
                                                                                                    v3 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                default: {
                                                                                                    v3 = KotlinUnitHandler.BaseCoreGenericHandler;
}
                                                                                            arg64 = arg27;
                                                                                            arg65 = this;
                                                                                            arg66 = NoneHandler_2.BaseCoreGenericHandler((NoneHandler_2)arg64, null, 1, null);
                                                                                            if (!arg64.HoverTextFormatter()) ** GOTO lbl-1000
                                                                                            arg67 = arg65;
                                                                                            arg43   = arg67;
                                                                                            if (!((ConfigService)arg43  .LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().ServerSyncService()) {
                                                                                            } else lbl-1000:
                                                                                                                                                                                        {
                                                                                            }
                                                                                            arg68 = v7;
                                                                                            switch (LiteBansModule_43.BaseCoreGenericHandler[arg64.ServerSyncService().ordinal()]) {
                                                                                                case 4:
                                                                                                case 5: {
                                                                                                    if (arg64.LiteBansModule_401()) {
                                                                                                        arg69 = new String[]{"litebans.temp" + arg64.ServerSyncService(), "litebans + " + arg64.ServerSyncService(), "litebans.ip" + arg64.ServerSyncService()};
                                                                                                        v8 = arg69;
                                                                                                    } else {
                                                                                                        arg69 = new String[]{"litebans + " + arg64.ServerSyncService(), "litebans.ip" + arg64.ServerSyncService()};
                                                                                                        v8 = arg43   = arg69;
                                                                                                    }
                                                                                                    if (arg68) {
                                                                                                        arg69 = arg65;
                                                                                                        arg45   = "litebans.ip" + arg64.ServerSyncService();
                                                                                                        arg70 = arg69.AsyncBackgroundTask_5();
                                                                                                        arg54 = MessageHandler.BaseCoreGenericHandler;
                                                                                                        arg71 = arg70;
                                                                                                        arg58 = arg71;
                                                                                                        arg56 = arg58.e((String)arg45  ) == false ? 1 : 0;
                                                                                                        arg72 = MessageKey.cZ;
                                                                                                        arg57 = arg54;
                                                                                                        if (arg56 != 0) {
                                                                                                            arg73 = arg57;
                                                                                                            arg73.BaseCoreGenericHandler(arg72);
                                                                                                            throw new CommandExitException();
}
                                                                                                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)arg65, Arrays.copyOf(arg43  , arg43  .length));
                                                                                                    v9 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                case 6: {
                                                                                                    arg43   = arg65;
                                                                                                    arg69 = "litebans + " + arg64.ServerSyncService();
                                                                                                    arg46 = arg43  .AsyncBackgroundTask_5();
                                                                                                    arg74 = MessageHandler.BaseCoreGenericHandler;
                                                                                                    arg54 = arg46;
                                                                                                    arg75 = arg54;
                                                                                                    arg76 = arg75.e((String)arg69) == false;
                                                                                                    arg77 = MessageKey.cZ;
                                                                                                    arg78 = arg74;
                                                                                                    if (arg76) {
                                                                                                        arg79 = arg78;
                                                                                                        arg79.BaseCoreGenericHandler(arg77);
                                                                                                        throw new CommandExitException();
                                                                                                    }
                                                                                                    v9 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                case 1:
                                                                                                case 2:
                                                                                                case 3: {
                                                                                                    arg43   = arg64.F() != false ? "litebans.modify" : "litebans + " + arg64.ServerSyncService();
                                                                                                    arg69 = new String[]{arg43  , (String)arg43   + ".own"};
                                                                                                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)arg65, (String[])arg69);
                                                                                                    v9 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                default: {
                                                                                                    AssertionUtilities.BaseCoreGenericHandler();
                                                                                                    throw new CommandExitException();
}
                                                                                            if (!arg64.BanHandler_5() && arg66) {
                                                                                                arg80 = arg65;
                                                                                                arg81 = "litebans.ip" + arg64.ServerSyncService() + ".wildcard";
                                                                                                arg69 = arg80.AsyncBackgroundTask_5();
                                                                                                arg46 = MessageHandler.BaseCoreGenericHandler;
                                                                                                arg82 = arg69;
                                                                                                arg83 = arg82;
                                                                                                arg84 = arg83.e(arg81) == false;
                                                                                                arg85 = MessageKey.cZ;
                                                                                                arg86 = arg46;
                                                                                                if (arg84) {
                                                                                                    arg87 = arg86;
                                                                                                    arg87.BaseCoreGenericHandler(arg85);
                                                                                                    throw new CommandExitException();
}
                                                                                            arg27.BaseCoreGenericHandler(InitHandler.LiteBansModule_194);
                                                                                            if (((CharSequence)arg27.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                arg64 = BanHandler_3.GnuSparseMapHandler;
                                                                                                arg65 = arg27.ServerSyncService();
                                                                                                arg88 = arg27.BanHandler_5();
                                                                                                arg89 = MessageKey.cC;
                                                                                                if (arg88) {
                                                                                                    v10 = MessageKey.c(arg65 + "_USAGE");
                                                                                                } else {
                                                                                                    switch (LiteBansModule_190.BaseCoreGenericHandler[arg65.ordinal()]) {
                                                                                                        case 1: {
                                                                                                            if (arg89 == MessageKey.LockdownCommandHandler) {
                                                                                                                v11 = MessageKey.NullHandler;
                                                                                                                break;
                                                                                                            }
                                                                                                            v11 = MessageKey.LiteBansModule_102;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            if (arg89 == MessageKey.LockdownCommandHandler) {
                                                                                                                v11 = MessageKey.ah;
                                                                                                                break;
                                                                                                            }
                                                                                                            v11 = MessageKey.HexEncodingHelper;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            v11 = MessageKey.LiteBansModule_37;
                                                                                                            break;
                                                                                                        }
                                                                                                        default: {
                                                                                                            v11 = arg89;
}
                                                                                                    v10 = v11;
                                                                                                }
                                                                                                arg90 = v10;
                                                                                                arg89 = MessageHandler.BaseCoreGenericHandler;
                                                                                                arg91 = arg65 == BanHandler.g;
                                                                                                arg92 = arg89;
                                                                                                if (arg91) {
                                                                                                    arg46 = arg92;
                                                                                                    arg46.BaseCoreGenericHandler(arg90);
                                                                                                    throw new CommandExitException();
                                                                                                }
                                                                                                arg93 = arg64;
                                                                                                arg94 = MessageKey.LockdownCommandHandler;
                                                                                                if (arg88) {
                                                                                                    v12 = MessageKey.c(arg65 + "_USAGE");
                                                                                                } else {
                                                                                                    switch (LiteBansModule_190.BaseCoreGenericHandler[arg65.ordinal()]) {
                                                                                                        case 1: {
                                                                                                            if (arg94 == MessageKey.LockdownCommandHandler) {
                                                                                                                v13 = MessageKey.NullHandler;
                                                                                                                break;
                                                                                                            }
                                                                                                            v13 = MessageKey.LiteBansModule_102;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            if (arg94 == MessageKey.LockdownCommandHandler) {
                                                                                                                v13 = MessageKey.ah;
                                                                                                                break;
                                                                                                            }
                                                                                                            v13 = MessageKey.HexEncodingHelper;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            v13 = MessageKey.LiteBansModule_37;
                                                                                                            break;
                                                                                                        }
                                                                                                        default: {
                                                                                                            v13 = arg94;
}
                                                                                                    v12 = v13;
                                                                                                }
                                                                                                arg89 = v12;
                                                                                                MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(LiteBansModule_242.BaseCoreGenericHandler(arg90, arg88 == false, (CharSequence)arg89));
                                                                                                throw new CommandExitException();
                                                                                            }
                                                                                            this.plugin((NoneHandler_2)arg27);
                                                                                            arg27.LiteBansModule_31(arg27.BaseCoreGenericHandler(this));
                                                                                            arg64 = CommandArgumentUtils.LiteBansModule_31(this, arg27.AsyncBackgroundTask_21());
                                                                                            v14 = arg64;
                                                                                            v15 = v14 != null && (v14 = (arg95 = v14.LiteBansModule_240())) != null ? LiteBansModule_242.BaseCoreGenericHandler((String)v14, 32) : (arg65 = null);
                                                                                            if (LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(arg26) || StringUtilities.BaseCoreGenericHandler(arg27.LiteBansModule_31(), arg26, true)) break;
                                                                                            if (!LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(arg26)) break;
                                                                                            v16 = arg27.LiteBansModule_31();
                                                                                            arg96 = arg27.CommandThrottleService();
                                                                                            v17 = arg96;
                                                                                            if (v17 == null && (v17 = arg65) == null) {
                                                                                                v17 = arg12.AsyncBackgroundTask_5().ServerSyncService();
                                                                                            }
                                                                                            if (StringUtilities.BaseCoreGenericHandler(v16, (String)v17, true)) break;
                                                                                        }
                                                                                        arg97 = v1;
                                                                                        arg98 = new String[]{"litebans.server + " + arg27.LiteBansModule_31(), "litebans.server + " + arg27.LiteBansModule_31() + '.' + arg27.ServerSyncService().c()};
                                                                                        arg99 = arg97;
                                                                                        arg100 = Arrays.copyOf(arg98, arg98.length);
                                                                                        arg101 = arg100;
                                                                                        arg102 = arg101.length;
                                                                                        for (arg103 = 0; arg103 < arg102; ++arg103) {
                                                                                            arg104 = arg105 = arg101[arg103];
                                                                                            if (!arg99.e(arg104)) continue;
                                                                                            break;
}
                                                                                    if (v18 == false) {
                                                                                        arg27.AsyncBackgroundTask_5(LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(arg26, arg12.AsyncBackgroundTask_5().ServerSyncService(), v1));
}
                                                                                arg106 = LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(arg12.AsyncBackgroundTask_5().ServerSyncService(), arg27.LiteBansModule_31()) != false || arg65 != null && LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler((String)arg65, arg27.LiteBansModule_31()) != false;
                                                                                arg107   = arg2;
                                                                                if (arg107  .g()) {
                                                                                    arg41 = arg107  ;
                                                                                    arg47   = arg27.LiteBansModule_31();
                                                                                    arg41.BaseCoreGenericHandler((Object)arg47  );
                                                                                }
                                                                                if (arg64 == null) break;
                                                                                arg108 = arg2;
                                                                                arg109 = arg64.g();
                                                                                arg110 = arg64.i();
                                                                                arg107   = new LiteBansModule_113(arg27.AsyncBackgroundTask_21(), arg64.i(), arg108.LiteBansModule_194().SetHandler() != false ? arg109 : arg110, arg64.BaseCoreGenericHandler(), arg64.LiteBansModule_31(), (CommandSenderWrapper)arg64, null, 64, null);
                                                                                arg27.BaseCoreGenericHandler(new LiteBansModule_297(arg107  .AsyncBackgroundTask_5(), arg107  .BaseCoreGenericHandler(), arg107  .c(), new Date(arg27.J())));
                                                                                break;
                                                                            }
                                                                            arg27.BaseCoreGenericHandler(arg12.c(arg27.AsyncBackgroundTask_21()));
                                                                            arg108 = arg27.AsyncBackgroundTask_22();
                                                                            v19 = arg108;
                                                                            if (!(v19 != null && (v19 = (arg111 = v19.LiteBansModule_31())) != null ? !StringUtilities.BaseCoreGenericHandler((CharSequence)v19, '#', false, 2, null) : false)) {
                                                                                arg27.BaseCoreGenericHandler((LiteBansModule_297)null);
                                                                            }
                                                                            if (arg27.AsyncBackgroundTask_22() != null) break;
                                                                            arg108 = arg27.AsyncBackgroundTask_21();
                                                                            if (!HexEncodingHelper.BaseCoreGenericHandler.i((String)arg108)) break;
                                                                            arg27.m(true);
                                                                            arg108 = MessageHandler.BaseCoreGenericHandler;
                                                                            arg112 = v1;
                                                                            arg113   = "litebans.ip" + arg27.ServerSyncService().c();
                                                                            arg114 = arg112;
                                                                            arg115 = arg114.e(arg113  ) == false;
                                                                            arg113   = MessageKey.cZ;
                                                                            arg114 = arg108;
                                                                            if (arg115) {
                                                                                arg116 = arg114;
                                                                                arg116.BaseCoreGenericHandler(arg113  );
                                                                                throw new CommandExitException();
                                                                            }
                                                                            arg27.BaseCoreGenericHandler(new LiteBansModule_297("#offline#", "#offline#", arg27.AsyncBackgroundTask_21(), new Date()));
                                                                            break;
                                                                        }
                                                                        if (!arg27.BanHandler_5()) break;
                                                                        arg108 = CommandArgumentUtils.AsyncBackgroundTask_5(this, arg27.AsyncBackgroundTask_21());
                                                                        if (ObjectUtilities.BaseCoreGenericHandler(arg108, (Object)arg27.AsyncBackgroundTask_21())) break;
                                                                        arg117 = AllHandler_3.BaseCoreGenericHandler(arg12, (String)arg108, arg27.ServerSyncService(), null, arg27.BanHandler_2() == false, 4, null);
                                                                        if (arg27.BanHandler_2()) break;
                                                                        v20 = arg117;
                                                                        v21 = v20 != null ? arg12.BaseCoreGenericHandler(v20) : false;
                                                                        if (!v21) break;
                                                                    }
                                                                    v22 = arg117;
                                                                    arg27.BaseCoreGenericHandler(arg12.c(v22 != null ? v22.DatabaseMonitorService() : null));
                                                                    v23 = arg117;
                                                                    if (v23 == null || (v23 = (arg118 = v23.m())) == null) {
                                                                        v23 = arg27.LiteBansModule_31();
                                                                    }
                                                                    arg27.AsyncBackgroundTask_5((String)v23);
                                                                    arg27.BaseCoreGenericHandler(arg117);
                                                                }
                                                                if (arg27.AsyncBackgroundTask_22() != null || !HexEncodingHelper.BaseCoreGenericHandler.AsyncBackgroundTask_5(arg27.AsyncBackgroundTask_21())) break;
                                                                arg119 = AllHandler_3.BaseCoreGenericHandler(arg12, arg27.AsyncBackgroundTask_21(), arg27.ServerSyncService(), null, arg27.BanHandler_2() == false, 4, null);
                                                                if (arg27.BanHandler_2()) break;
                                                                v24 = arg119;
                                                                v25 = v24 != null ? arg12.BaseCoreGenericHandler(v24) : false;
                                                                if (!v25) break;
                                                            }
                                                            v26 = arg119;
                                                            arg27.BaseCoreGenericHandler(arg12.c(v26 != null ? v26.DatabaseMonitorService() : null));
                                                            v27 = arg119;
                                                            if (v27 == null || (v27 = (arg120 = v27.m())) == null) {
                                                                v27 = arg27.LiteBansModule_31();
                                                            }
                                                            arg27.AsyncBackgroundTask_5((String)v27);
                                                            arg27.BaseCoreGenericHandler(arg119);
                                                        }
                                                        if (arg27.AsyncBackgroundTask_22() == null) {
                                                            arg121 = this;
                                                            arg122 = arg27.AsyncBackgroundTask_21();
                                                            arg123 = arg121;
                                                            arg124 = ((ConfigService)arg123.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().af();
                                                            if (arg124) {
                                                                if (HexEncodingHelper.BaseCoreGenericHandler(arg122)) {
                                                                    v28 = LiteBansModule_50.c.LiteBansModule_194(arg122);
                                                                    if (v28 == null) {
                                                                    } else {
                                                                        arg125 = v28;
                                                                        v29 = new LiteBansModule_297(arg125, arg122, "#", new Date());
} else {
                                                                    v30 = LiteBansModule_50.c.BaseCoreGenericHandler(arg122);
                                                                    if (v30 == null) {
                                                                    } else {
                                                                        arg126 = v30;
                                                                        v31 = arg126.BaseCoreGenericHandler();
                                                                        v29 = new LiteBansModule_297(arg126.AsyncBackgroundTask_5(), v31 != null ? v31.toString() : null, null, new Date());
} else {
                                                                if (HexEncodingHelper.BaseCoreGenericHandler(arg122)) {
                                                                    new LiteBansModule_297(LiteBansModule_242.BaseCoreGenericHandler(arg122, 16), arg122, "#", new Date());
                                                                }
                                                                v29 = new LiteBansModule_297(LiteBansModule_242.BaseCoreGenericHandler(arg122, 16), LiteBansModule_242.BaseCoreGenericHandler(arg122), "#", new Date());
                                                            }
                                                            v32 = arg108 = v29;
                                                            if (v32 == null) {
                                                                arg27.BaseCoreGenericHandler(arg12, (Object)MessageKey.aN.BaseCoreGenericHandler("player", (Object)arg27.AsyncBackgroundTask_21()));
                                                                throw new CommandExitException();
                                                            }
                                                            arg27.BaseCoreGenericHandler((LiteBansModule_297)v32);
}
                                                    v33 = arg108 = arg27.AsyncBackgroundTask_22();
                                                    if ((v33 != null ? v33.LiteBansModule_31() : null) != null) {
                                                        v34 = arg27.AsyncBackgroundTask_22();
                                                        ObjectUtilities.BaseCoreGenericHandler(v34);
                                                        v35 = v34.LiteBansModule_31();
                                                        ObjectUtilities.BaseCoreGenericHandler((Object)v35);
                                                        if (!StringUtilities.BaseCoreGenericHandler((CharSequence)v35, '#', false, 2, null)) {
                                                            v36 = arg108 = arg27.AsyncBackgroundTask_22();
                                                            if (!HexEncodingHelper.BaseCoreGenericHandler.LiteBansModule_31(v36 != null ? v36.BaseCoreGenericHandler() : null) && AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg12.e(), arg27.CommandThrottleService())) {
                                                                arg12.AsyncBackgroundTask_5().BaseCoreGenericHandler((LiteBansModule_178)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, BaseCoreGenericHandler(litebans.NoneHandler_2 litebans.LiteBansModule_82 ), (Llitebans/LiteBansModule_82;)Llitebans/iV;)((NoneHandler_2)arg27));
}
                                                v37 = arg108 = arg27.AsyncBackgroundTask_22();
                                                v38 = v37 != null ? v37.BaseCoreGenericHandler() : null;
                                                v39 = arg108 = arg27.AsyncBackgroundTask_22();
                                                v40 = v39 != null ? v39.LiteBansModule_31() : null;
                                                v41 = arg108 = arg27.AsyncBackgroundTask_22();
                                                arg107   = new LiteBansModule_113(v38, null, null, v40, v41 != null ? v41.i() : null, null, arg27.AsyncBackgroundTask_21(), 38, null);
                                                if (arg107  .LiteBansModule_31()) {
                                                    arg108 = arg27.AsyncBackgroundTask_22();
                                                    v42 = arg108;
                                                    v43 = v42 != null && (v42 = (arg127 = v42.BaseCoreGenericHandler())) != null ? StringUtilities.BaseCoreGenericHandler((CharSequence)v42, '#', false, 2, null) : false;
                                                    if (v43) {
                                                        arg108 = arg107  ;
                                                        if (arg2.LiteBansModule_194().aa()) {
                                                            arg2.BaseCoreGenericHandler((Object)("Hiding IP address from broadcast: " + arg108.c()));
                                                            arg108.BaseCoreGenericHandler(MessageKey.SecHandler.toString());
                                                        } else {
                                                            arg108.BaseCoreGenericHandler(arg108.c());
                                                        }
                                                        arg108.LiteBansModule_31(arg108.AsyncBackgroundTask_5());
                                                        arg108 = arg107  .c();
                                                        v44 = arg108;
                                                        if (v44 == null) {
                                                            v44 = "";
                                                        }
                                                        arg27.LiteBansModule_31((String)v44);
}
                                            arg128 = NoneHandler_2.BaseCoreGenericHandler((NoneHandler_2)arg27, null, 1, null);
                                            arg129 = MessageHandler.BaseCoreGenericHandler;
                                            arg130 = arg128 != false && v1.LiteBansModule_194() == false && arg2.LiteBansModule_194().MessageKey() >= 1 ? 1 : 0;
                                            arg131 = MessageKey.LiteBansModule_31;
                                            arg132 = arg129;
                                            if (arg130 != 0) {
                                                arg133 = arg132;
                                                arg133.BaseCoreGenericHandler(arg131);
                                                throw new CommandExitException();
                                            }
                                            arg129 = MessageHandler.BaseCoreGenericHandler;
                                            arg130 = arg27.HoverTextFormatter() != false && arg2.LiteBansModule_194().MessageKey() >= 2 && v1.LiteBansModule_194() == false ? 1 : 0;
                                            arg131 = MessageKey.LiteBansModule_31;
                                            arg132 = arg129;
                                            if (arg130 != 0) {
                                                arg134 = arg132;
                                                arg134.BaseCoreGenericHandler(arg131);
                                                throw new CommandExitException();
                                            }
                                            arg129 = arg27.CommandThrottleService();
                                            v45 = arg129;
                                            if (v45 == null && (v45 = arg65) == null) {
                                                v45 = arg12.AsyncBackgroundTask_5().ServerSyncService();
                                            }
                                            arg27.e((String)v45);
                                            arg27.c(LiteBansModule_242.BaseCoreGenericHandler(arg27.H(), 128));
                                            arg27.BaseCoreGenericHandler(LiteBansModule_242.BaseCoreGenericHandler(arg27.AsyncBackgroundTask_5(), 36));
                                            arg129 = this;
                                            arg130 = arg27.Utf8Handler_2();
                                            arg131 = arg27.H();
                                            arg135 = arg27.AsyncBackgroundTask_5();
                                            arg136 = (MessageHandler)arg129;
                                            ((DatabaseMonitorService)arg136.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(new ConsoleHandler((boolean)arg130, (String)arg131, (BanHandler_3)arg129, (String)arg135, v1));
                                            arg27.BaseCoreGenericHandler(InitHandler.BaseCoreGenericHandler);
                                            if (arg27.PunishmentService() && arg107  .BaseCoreGenericHandler() != null) {
                                                arg129 = arg27.g().LiteBansModule_31();
                                                if (arg27.i() == null) {
                                                    arg27.BaseCoreGenericHandler(arg12.BaseCoreGenericHandler(arg27.g(), arg107  .BaseCoreGenericHandler(), arg107  .c()));
                                                    arg27.BaseCoreGenericHandler(arg27.g().BaseCoreGenericHandler(arg27.D()));
                                                } else {
                                                    v46 = arg27.i();
                                                    ObjectUtilities.BaseCoreGenericHandler(v46);
                                                    arg137 = v46;
                                                    arg129 = arg137.LiteBansModule_194();
                                                    arg131 = arg12.BaseCoreGenericHandler(arg107  .BaseCoreGenericHandler(), arg107  .c(), arg137, arg27.g());
                                                    arg27.BaseCoreGenericHandler((int)Math.floor(((Number)arg131.e()).doubleValue()));
                                                    arg27.BaseCoreGenericHandler(arg137.BaseCoreGenericHandler(arg27.D()));
                                                    arg138 = ((Number)arg131.LiteBansModule_31()).doubleValue();
                                                    if (arg138 <= 0.0 || arg27.D() != (int)Math.floor(arg138)) {
                                                        arg27.BaseCoreGenericHandler(true);
                                                    }
                                                    arg136 = LiteBansModule_287.BaseCoreGenericHandler(arg138);
                                                    arg139 = LiteBansModule_287.BaseCoreGenericHandler(((Number)arg131.e()).doubleValue());
                                                    arg140 = Math.min(arg137.LiteBansModule_194().size(), arg27.D() + 1);
                                                    arg2.BaseCoreGenericHandler((Object)("Applying " + arg137.c() + " template group " + arg137.BaseCoreGenericHandler() + ": weight " + (String)arg136 + " => " + arg139 + " (" + arg140 + '/' + arg129.size() + ')'));
                                                }
                                                arg130 = Math.min(arg129.size(), arg27.D() + 1);
                                                arg2.BaseCoreGenericHandler((Object)("Applying " + arg27.g().AsyncBackgroundTask_5() + " template \"" + arg27.g().g() + "\" LiteBansModule_21 level " + arg130 + '/' + arg129.size()));
                                                arg135 = arg27.L();
                                                ObjectUtilities.LiteBansModule_31(arg135, "");
                                                arg131 = (LiteBansModule_105)arg135;
                                                arg141 = arg27.g().LiteBansModule_240();
                                                ObjectUtilities.LiteBansModule_31(arg141, "");
                                                arg135 = (LiteBansModule_105)arg141;
                                                arg136 = arg131.BaseCoreGenericHandler();
                                                v47 = arg136;
                                                if (v47 == null) {
                                                    v47 = arg135.BaseCoreGenericHandler();
                                                }
                                                if ((arg141 = v47) != null) {
                                                    if (arg141.longValue() > 0L) {
                                                        arg27.LiteBansModule_31(arg27.J() + arg141.longValue());
                                                        arg27.LiteBansModule_401(true);
                                                        arg142 = arg141.longValue();
                                                        arg27.BaseCoreGenericHandler((CharSequence)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, arg142, false, 2, null));
                                                    } else {
                                                        arg27.LiteBansModule_31(-1L);
                                                        arg27.LiteBansModule_401(false);
                                                        arg27.BaseCoreGenericHandler(MessageKey.LiteBansModule_60);
}
                                                if (arg27.g().GnuSparseMapHandler()) {
                                                    arg27.m(true);
                                                }
                                                CommandArgumentUtils.BaseCoreGenericHandler(this, arg27.g(), arg27.L());
                                                arg27.BaseCoreGenericHandler(arg12);
                                            }
                                            arg129 = MessageHandler.BaseCoreGenericHandler;
                                            arg130 = arg27.LiteBansModule_401() != false && arg27.BanHandler_5() == false && arg27.DatabaseMonitorService() <= 0L ? 1 : 0;
                                            arg131 = MessageKey.aL;
                                            arg143 = arg129;
                                            if (arg130 != 0) {
                                                arg144 = arg143;
                                                arg144.BaseCoreGenericHandler(arg131);
                                                throw new CommandExitException();
                                            }
                                            arg129 = arg27.c(arg12);
                                            v48 = arg107  .AsyncBackgroundTask_5();
                                            ObjectUtilities.BaseCoreGenericHandler((Object)v48);
                                            v49 = arg107  .BaseCoreGenericHandler();
                                            ObjectUtilities.BaseCoreGenericHandler((Object)v49);
                                            arg27.BaseCoreGenericHandler(arg12, v48, v49);
                                            if (!arg27.BanHandler_5()) break;
                                            arg145 = new LiteBansModule_278();
                                            arg146 = arg27.GnuSparseMapHandler();
                                            v50 = arg146;
                                            if (v50 == null) {
                                                v50 = arg12.BaseCoreGenericHandler(arg107  .BaseCoreGenericHandler(), arg107  .c(), arg27.ServerSyncService(), arg27.LiteBansModule_31(), true, true);
                                            }
                                            arg27.LiteBansModule_31(v50);
                                            v51 = arg143 = arg27.q();
                                            arg147 = ObjectUtilities.BaseCoreGenericHandler((Object)(v51 != null ? v51.e() : null), (Object)v1.BaseCoreGenericHandler());
                                            v52 = arg143 = arg147 != false ? ".own" : "";
                                            if (arg27.q() != null && !arg147 && arg2.LiteBansModule_194().ac()) {
                                                arg148 = MessageHandler.BaseCoreGenericHandler;
                                                v53 = arg149 = arg27.q();
                                                arg150 = arg27.BaseCoreGenericHandler(arg12, v53 != null ? v53.e() : null) == false;
                                                arg151 = MessageKey.cZ;
                                                arg152 = arg148;
                                                if (arg150) {
                                                    arg153 = arg152;
                                                    arg153.BaseCoreGenericHandler(arg151);
                                                    throw new CommandExitException();
}
                                            arg154 = arg27.q();
                                            v54 = arg154;
                                            if (!((v54 != null ? v54.DatabaseMonitorService() : null) != null)) break;
                                            arg154 = arg27.q();
                                            if (!(arg154 != null && arg154.r() != -1)) break;
                                            v55 = arg2.AsyncBackgroundTask_21();
                                            v56 = arg27.q();
                                            ObjectUtilities.BaseCoreGenericHandler(v56);
                                            arg154 = v55.BaseCoreGenericHandler(v56);
                                            if (arg154 == null) break;
                                            arg155 = arg27.q();
                                            v57 = arg155;
                                            arg155 = arg27.q();
                                            v58 = arg155;
                                            arg156 = arg12.BaseCoreGenericHandler((LiteBansModule_65)arg154, v57 != null ? v57.DatabaseMonitorService() : null, v58 != null ? v58.PunishmentTableService() : null);
                                            arg155 = arg154.BaseCoreGenericHandler(arg156);
                                            arg157 = arg155.c();
                                            v59 = arg157;
                                            if (v59 == null) {
                                                v59 = arg154.LiteBansModule_240().c();
                                            }
                                            arg158 = v59;
                                            arg157 = MessageHandler.BaseCoreGenericHandler;
                                            if (arg158 == null) ** GOTO lbl-1000
                                            arg159 = v1;
                                            arg160 = arg159;
                                            if (arg160.e(arg158) == false) {
                                            } else lbl-1000:
                                                                                        {
                                            }
                                            arg161 = v60;
                                            arg162 = MessageKey.cZ;
                                            arg163 = arg157;
                                            if (arg161) {
                                                arg164 = arg163;
                                                arg164.BaseCoreGenericHandler(arg162);
                                                throw new CommandExitException();
}
                                        arg154 = arg2;
                                        if (arg154.g()) {
                                            arg41 = arg154;
                                            v61 = arg27.q();
                                            arg47   = "[0xff] " + (v61 != null ? v61.e() : null) + ' ' + v1.BaseCoreGenericHandler() + " (LiteBansModule_433=" + arg147 + ')';
                                            arg41.BaseCoreGenericHandler((Object)arg47  );
                                        }
                                        if (arg27.F()) {
                                            arg165 = arg27.q();
                                            v62 = arg165;
                                            if (v62 == null) {
                                                arg27.BaseCoreGenericHandler(arg12, (Object)MessageKey.SQLiteDriverHandler_2);
                                                throw new CommandExitException();
                                            }
                                            arg154 = v62;
                                            arg165 = this;
                                            arg166 = "litebans.modify" + (String)arg143;
                                            arg167 = arg165.AsyncBackgroundTask_5();
                                            arg168 = MessageHandler.BaseCoreGenericHandler;
                                            arg169 = arg167;
                                            arg170 = arg169;
                                            arg171 = arg170.e((String)arg166) == false;
                                            arg172 = MessageKey.cZ;
                                            arg173 = arg168;
                                            if (arg171) {
                                                arg174 = arg173;
                                                arg174.BaseCoreGenericHandler(arg172);
                                                throw new CommandExitException();
                                            }
                                            arg166 = arg27.ServerSyncService();
                                            switch (LiteBansModule_274.BaseCoreGenericHandler[arg166.c().ordinal()]) {
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
}
                                            arg165 = ObjectUtilities.BaseCoreGenericHandler(arg129, v63) != false ? arg154.LiteBansModule_31() : arg129;
                                            arg175 = arg27.DatabaseMonitorService() == -1L ? arg154.LiteBansModule_401() : arg27.DatabaseMonitorService();
                                            arg27.LiteBansModule_31(arg12);
                                            arg12.BaseCoreGenericHandler((CharSequence)arg165, arg175, (SilentHandler)arg154);
                                            arg167 = new LiteBansModule_144();
                                            arg176 = arg154;
                                            arg167.BaseCoreGenericHandler = new SilentHandler(arg176.ServerSyncService(), arg176.DatabaseMonitorService(), arg176.PunishmentTableService(), (CharSequence)arg165, arg176.e(), arg176.LiteBansModule_433(), arg176.m(), arg176.GnuSparseMapHandler(), arg176.BroadcastService(), arg175, arg176.r(), arg176.AsyncBackgroundTask_5(), arg176.LiteBansModule_240(), arg176.AsyncBackgroundTask_22(), arg176.BaseCoreGenericHandler(), null);
                                            arg27.BaseCoreGenericHandler(arg12, AllHandler_3.BaseCoreGenericHandler(arg12, (CharSequence)MessageKey.cj, (SilentHandler)arg167.BaseCoreGenericHandler, false, 2, null));
                                        } else if (arg27.BanHandler_2()) {
                                            arg177 = arg27.q();
                                            v64 = arg177;
                                            if (v64 == null) {
                                                arg27.BaseCoreGenericHandler(arg12, (Object)MessageKey.SQLiteDriverHandler_2);
                                                throw new CommandExitException();
                                            }
                                            arg154 = v64;
                                            arg177 = this;
                                            arg178 = "litebans.delete" + (String)arg143;
                                            arg179 = arg177.AsyncBackgroundTask_5();
                                            arg180 = MessageHandler.BaseCoreGenericHandler;
                                            arg181 = arg179;
                                            arg182 = arg181;
                                            arg183 = arg182.e(arg178) == false;
                                            arg184 = MessageKey.cZ;
                                            arg185 = arg180;
                                            if (arg183) {
                                                arg186 = arg185;
                                                arg186.BaseCoreGenericHandler(arg184);
                                                throw new CommandExitException();
                                            }
                                            arg27.LiteBansModule_31(arg12);
                                            AllHandler_3.BaseCoreGenericHandler(arg12, (SilentHandler)arg154, null, null, null, true, 14, null);
                                            arg27.BaseCoreGenericHandler(arg12, MessageKey.af);
                                        } else {
                                            arg154 = this;
                                            arg187 = "litebans + " + arg27.ServerSyncService() + (String)arg143;
                                            arg188 = arg154.AsyncBackgroundTask_5();
                                            arg189 = MessageHandler.BaseCoreGenericHandler;
                                            arg190 = arg188;
                                            arg191 = arg190;
                                            arg192 = arg191.e((String)arg187) == false;
                                            arg193 = MessageKey.cZ;
                                            arg194 = arg189;
                                            if (arg192) {
                                                arg195 = arg194;
                                                arg195.BaseCoreGenericHandler(arg193);
                                                throw new CommandExitException();
                                            }
                                            if (arg27.GnuSparseMapHandler() == null && arg24.K() && arg27.ServerSyncService() != BanHandler.e && ((Collection)(arg154 = arg12.BaseCoreGenericHandler(arg107  .g(), 1024))).isEmpty() == false) {
                                                arg187 = new HashSet<PunishmentService>();
                                                arg196 = arg154.iterator();
                                                while (arg196.hasNext()) {
                                                    arg188 = (LiteBansModule_297)arg196.next();
                                                    arg197 = arg188.c();
                                                    arg198 = AllHandler_3.BaseCoreGenericHandler(arg12, arg197, (String)(arg189 = arg188.AsyncBackgroundTask_5()), arg27.ServerSyncService(), arg27.LiteBansModule_31(), false, true, 16, null);
                                                    if (arg198 == null || CollectionUtilities.BaseCoreGenericHandler((Iterable)arg187, (Object)arg197) || arg198.LiteBansModule_240()) continue;
                                                    arg193 = arg2;
                                                    if (arg193.g()) {
                                                        arg41 = arg193;
                                                        arg47   = arg198;
                                                        arg41.BaseCoreGenericHandler((Object)arg47  );
                                                    }
                                                    arg131 = arg198;
                                                    arg145.BaseCoreGenericHandler = true;
                                                    AllHandler_3.BaseCoreGenericHandler(arg12, arg27.AsyncBackgroundTask_5(), arg27.H(), (CharSequence)arg129, arg198, false, 16, null);
                                                    CommandArgumentUtils.BaseCoreGenericHandler(arg12, arg198, true, arg106);
                                                    v65 = arg197;
                                                    ObjectUtilities.BaseCoreGenericHandler((Object)v65);
                                                    arg187.add(v65);
}
                                            arg187 = arg154 = arg27;
                                            if (arg187.q() == null) {
                                                if (!arg145.BaseCoreGenericHandler) {
                                                    arg188 = arg2;
                                                    arg199 = 1;
                                                    if (arg188.BaseCoreGenericHandler(arg199)) {
                                                        arg200 = arg188;
                                                        arg201 = "No active " + arg187.ServerSyncService().c() + " found for uuid:" + arg107  .BaseCoreGenericHandler() + " / ip:" + arg107  .c() + " on server:" + arg187.LiteBansModule_31() + " (target: '" + arg107  .AsyncBackgroundTask_5() + "')";
                                                        arg202 = ObjectUtilities.BaseCoreGenericHandler((Object)arg187.AsyncBackgroundTask_21(), (Object)arg107  .BaseCoreGenericHandler()) == false;
                                                        if (arg202) {
                                                            arg203 = "Try targeting LiteBansModule_61 UUID instead of name + ";
                                                            if (arg203.length() > 0 != false) {
                                                                arg204 = arg201;
                                                                arg205 = "\n";
                                                                arg204 = "" + arg204 + arg205;
                                                                v66 = "" + arg204 + arg203;
                                                            } else {
                                                                v66 = arg201;
} else {
                                                            v66 = arg201;
                                                        }
                                                        arg200.BaseCoreGenericHandler(v66);
                                                    }
                                                    arg206 = arg187.ServerSyncService();
                                                    switch (LiteBansModule_274.BaseCoreGenericHandler[arg206.c().ordinal()]) {
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
                                                    arg188 = v67;
                                                    if (arg187.ServerSyncService() == BanHandler.AsyncBackgroundTask_5 && !arg107  .LiteBansModule_31() && arg106 && !HexEncodingHelper.BaseCoreGenericHandler(arg107  .g())) {
                                                        arg206 = v1;
                                                        arg207 = "litebans.unban.queue";
                                                        if (arg206.e(arg207) && !arg187.K()) {
                                                            this.plugin((LiteBansModule_113)arg107  );
                                                            arg188 = MessageKey.LiteBansModule_14;
}
                                                    arg187.BaseCoreGenericHandler(arg12, arg188);
                                                    throw new CommandExitException();
} else {
                                                arg188 = arg2;
                                                if (arg188.g()) {
                                                    arg208 = arg188;
                                                    arg208.BaseCoreGenericHandler(arg187.q());
                                                }
                                                if (arg187.ServerSyncService() == BanHandler.e && arg187.GnuSparseMapHandler() == null) {
                                                    v68 = arg187.q();
                                                    ObjectUtilities.BaseCoreGenericHandler(v68);
                                                    AllHandler_3.BaseCoreGenericHandler(arg12, v68, arg187.AsyncBackgroundTask_5(), arg187.H(), (CharSequence)arg129, false, 16, null);
                                                } else {
                                                    v69 = arg187.AsyncBackgroundTask_5();
                                                    v70 = arg187.H();
                                                    v71 = arg187.q();
                                                    ObjectUtilities.BaseCoreGenericHandler(v71);
                                                    arg12.BaseCoreGenericHandler(v69, v70, (CharSequence)arg129, v71, arg187.GnuSparseMapHandler() != null);
                                                }
                                                if (arg187.ServerSyncService() == BanHandler.e) {
                                                    arg187.BaseCoreGenericHandler(arg12, arg12.BaseCoreGenericHandler((CharSequence)MessageKey.LiteBansModule_69, (CommandSenderWrapper)arg64));
                                                }
                                                arg188 = arg12;
                                                arg209 = BroadcastHandler.LiteBansModule_401.BaseCoreGenericHandler(arg187.ServerSyncService());
                                                if (arg188.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
                                                    arg210 = arg209;
                                                    arg211 = arg188;
                                                    arg212 = ServerSyncService.GnuSparseMapHandler;
                                                    v72 = arg187.q();
                                                    ObjectUtilities.BaseCoreGenericHandler(v72);
                                                    arg213 = v72;
                                                    arg214 = arg107  ;
                                                    arg215 = ServerSyncService.GnuSparseMapHandler;
                                                    arg216 = new CharSequence[2];
                                                    v73 = arg214.BaseCoreGenericHandler();
                                                    if (v73 == null) {
                                                        v73 = "";
                                                    }
                                                    arg216[0] = LiteBansModule_50.c.AsyncBackgroundTask_5(v73);
                                                    arg216[1] = arg213.LiteBansModule_240() != false ? String.valueOf(arg214.c()) : "";
                                                    arg217 = ArrayUtilities.BaseCoreGenericHandler(arg216, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                                    CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)arg211, arg210, arg217, null, null, 12, null);
                                                }
                                                v74 = arg12.e();
                                                v75 = arg187.q();
                                                ObjectUtilities.BaseCoreGenericHandler(v75);
                                                LiteBansModule_268.BaseCoreGenericHandler.LiteBansModule_31(arg12, v74, v75);
                                            }
                                            if (arg27.q() == null) {
                                                arg27.LiteBansModule_31((SilentHandler)arg131);
                                            }
                                            if (arg27.q() != null) {
                                                arg187 = arg27.ServerSyncService();
                                                switch (LiteBansModule_274.BaseCoreGenericHandler[arg187.c().ordinal()]) {
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
                                                arg154 = v76;
                                                arg154 = AllHandler_3.BaseCoreGenericHandler(arg12, (CharSequence)arg154, arg27.H(), arg27.AsyncBackgroundTask_5(), false, 4, null);
                                                arg154 = arg12.BaseCoreGenericHandler((CharSequence)arg154, (LiteBansModule_113)arg107  );
                                                new BannedHandler((NoneHandler_2)arg27, (CommandSenderWrapper)arg64, arg27.AsyncBackgroundTask_22(), (CharSequence)arg154, arg12.e(), null, false, arg27.B(), 32, null).run();
                                                if (arg27.ServerSyncService() == BanHandler.n) {
                                                    if (arg106) {
                                                        arg187 = this;
                                                        ((PunishmentTableService)arg187.LiteBansModule_240().BaseCoreGenericHandler(PunishmentTableService.class)).BaseCoreGenericHandler(arg27.q());
                                                    }
                                                    arg187 = arg12;
                                                    arg218 = BroadcastHandler.AsyncBackgroundTask_21;
                                                    if (arg187.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
                                                        arg47   = arg218;
                                                        arg41 = arg187;
                                                        arg219 = ServerSyncService.GnuSparseMapHandler;
                                                        v77 = arg27.q();
                                                        ObjectUtilities.BaseCoreGenericHandler(v77);
                                                        arg220 = v77;
                                                        arg221 = arg107  ;
                                                        arg222 = ServerSyncService.GnuSparseMapHandler;
                                                        arg214 = new CharSequence[2];
                                                        v78 = arg221.BaseCoreGenericHandler();
                                                        if (v78 == null) {
                                                            v78 = "";
                                                        }
                                                        arg214[0] = LiteBansModule_50.c.AsyncBackgroundTask_5(v78);
                                                        arg214[1] = arg220.LiteBansModule_240() != false ? String.valueOf(arg221.c()) : "";
                                                        arg223 = ArrayUtilities.BaseCoreGenericHandler(arg214, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                                        CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)arg41, (BroadcastHandler)arg47  , arg223, null, null, 12, null);
}
                                                arg187 = this;
                                                v79 = ((BroadcastService)arg187.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(arg27.q());
                                            } else {
                                                ConfigService.BaseCoreGenericHandler(arg2, null, 0, 2, null);
                                                v79 = KotlinUnitHandler.BaseCoreGenericHandler;
}
                                        break;
                                    }
                                    if (arg27.ServerSyncService() == BanHandler.c) {
                                        arg224 = arg27.g();
                                        arg225 = arg224;
                                        if (ObjectUtilities.BaseCoreGenericHandler(arg225.LiteBansModule_194() & 255, -1 & 255) < 0 == false) {
                                            arg224 = SecHandler.AsyncBackgroundTask_5;
                                            arg226 = arg27.J();
                                            arg227 = arg24.ar();
                                            arg228 = PermanentHandler.BaseCoreGenericHandler((PermanentHandler)arg224, arg227, 0.0, 2, null);
                                            arg27.LiteBansModule_31((long)(arg228 < 1.0 ? -1.0 : (double)arg226 + arg228));
}
                                    arg27.LiteBansModule_31(arg12);
                                    arg27.LiteBansModule_31(Math.max(arg27.DatabaseMonitorService(), 0L));
                                    arg229 = new SilentHandler(arg33, (LiteBansModule_113)arg107  , (CharSequence)arg129);
                                    arg33.LiteBansModule_31(arg229);
                                    arg27.BaseCoreGenericHandler(InitHandler.i);
                                    arg27.BaseCoreGenericHandler(arg12, v1, arg229, arg27.AsyncBackgroundTask_22());
                                    arg230 = this;
                                    arg231 = arg12;
                                    arg232   = arg107  .LiteBansModule_194();
                                    arg233 = arg27.LiteBansModule_433();
                                    arg234 = arg27.AsyncBackgroundTask_22();
                                    arg235 = arg229;
                                    switch (LiteBansModule_38.BaseCoreGenericHandler[arg235.ServerSyncService().ordinal()]) {
                                        case 1:
                                        case 2: {
                                            arg236 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)arg231, arg235.DatabaseMonitorService(), arg235.PunishmentTableService(), arg235.ServerSyncService(), arg235.m(), false, false, 48, null);
                                            if (arg236 == null || LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(arg236.m()) && !LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(arg235.m()) || arg236.LiteBansModule_240() && !arg235.LiteBansModule_240() || arg236.LiteBansModule_240() && arg235.LiteBansModule_240() && (!ObjectUtilities.BaseCoreGenericHandler((Object)arg235.DatabaseMonitorService(), (Object)arg236.DatabaseMonitorService()) || !ObjectUtilities.BaseCoreGenericHandler((Object)arg235.PunishmentTableService(), (Object)arg236.PunishmentTableService()))) ** GOTO lbl1262
                                            arg237 = arg230.AsyncBackgroundTask_5();
                                            arg238 = "litebans.override";
                                            arg239 = arg237;
                                            if (arg239.e((String)arg238) == false) {
                                                arg237 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)arg231, AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)arg231, (CharSequence)(arg235.ServerSyncService() == BanHandler.LiteBansModule_240 ? MessageKey.LiteBansModule_34 : MessageKey.SQLiteDriverHandler), arg236, false, 2, null), arg234, false, 2, null);
                                                MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(arg237);
                                                throw new CommandExitException();
                                            }
                                            if (!arg233) ** GOTO lbl1249
                                            arg238 = (MessageHandler)arg230;
                                            arg239 = arg238;
                                            if (!((ConfigService)arg239.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().ax()) ** GOTO lbl-1000
                                            arg238 = arg236;
                                            if (arg238.HoverTextFormatter() == false && (arg235.HoverTextFormatter() || arg235.n() > arg236.n())) {
                                            } else lbl-1000:
                                                                                        {
                                            }
                                            arg240 = v80;
                                            arg238 = MessageHandler.BaseCoreGenericHandler;
                                            arg241 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)arg231, (CharSequence)(arg235.ServerSyncService() == BanHandler.LiteBansModule_240 ? MessageKey.ai : MessageKey.LiteBansModule_5), arg234, false, 2, null);
                                            arg242 = arg238;
                                            arg243 = arg240 == false;
                                            if (arg243) {
                                                arg244 = arg242;
                                                arg244.BaseCoreGenericHandler(arg241);
                                                throw new CommandExitException();
                                            }
                                                                                        AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)arg231, arg33.AsyncBackgroundTask_5(), arg33.H(), arg235.LiteBansModule_31(), arg236, false, 16, null);
                                            v81 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)arg231, (CharSequence)(arg235.ServerSyncService() == BanHandler.LiteBansModule_240 ? MessageKey.dB : MessageKey.ServerSyncService), arg236, false, 2, null);
                                            arg238 = new CharSequence[4];
                                            arg238[0] = "bannedPlayer";
                                            ObjectUtilities.BaseCoreGenericHandler(arg232  );
                                            arg238[2] = "mutedPlayer";
                                            arg238[3] = arg232  ;
                                            arg245 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)arg231, (CharSequence)LiteBansModule_242.BaseCoreGenericHandler(v81, arg238), arg234, false, 2, null);
                                            if (StringUtilities.c(arg245, '#', false, 2, null)) {
                                                arg245 = LiteBansModule_433.LiteBansModule_31.BaseCoreGenericHandler(arg245, "#offline#", (Object)arg235.PunishmentTableService());
                                            }
                                            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, arg230.AsyncBackgroundTask_5(), arg245, null, 4, null);
                                            CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)arg231, arg236, true, arg106);
                                                                                        v82 = KotlinUnitHandler.BaseCoreGenericHandler;
                                            break;
                                        }
                                        default: {
                                            v82 = KotlinUnitHandler.BaseCoreGenericHandler;
}
                                    if (arg27.ServerSyncService() == BanHandler.c && arg64 != null && arg106) {
                                        arg229.BaseCoreGenericHandler(true);
                                    }
                                    CommandArgumentUtils.BaseCoreGenericHandler(arg12, arg229, false, false, 6, null);
                                    arg27.BaseCoreGenericHandler(arg12, (CommandSenderWrapper)arg64, (LiteBansModule_113)arg107  , arg106);
                                    this.plugin((NoneHandler_2)arg27, (LiteBansModule_113)arg107  );
                                    arg27.BaseCoreGenericHandler(InitHandler.c);
                                    try {
                                        arg230 = this;
                                        arg231 = arg12;
                                        arg246 = arg27;
                                        arg230.BaseCoreGenericHandler((LiteBansModule_82)arg231, arg229, (NoneHandler_2)arg246);
                                        if (!arg246.PunishmentTableService()) {
                                            arg247 = arg246.ServerSyncService();
                                            switch (LiteBansModule_274.BaseCoreGenericHandler[arg247.c().ordinal()]) {
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
                                                    v83 = MessageKey.LiteBansModule_99;
                                                    break;
                                                }
                                                default: {
                                                    AssertionUtilities.BaseCoreGenericHandler();
                                                    throw new CommandExitException();
}
                                            arg246.BaseCoreGenericHandler((LiteBansModule_82)arg231, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(v83, (CharSequence)"tempDuration", arg246.LiteBansModule_240()));
                                            switch (LiteBansModule_38.BaseCoreGenericHandler[arg229.ServerSyncService().ordinal()]) {
                                                case 1: {
                                                    CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)arg231, arg229, arg246.D());
                                                    v84 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                    break;
                                                }
                                                case 2: {
                                                    arg248 = arg230;
                                                    arg249 = arg231;
                                                    arg250 = arg249.e().q();
                                                    ObjectUtilities.BaseCoreGenericHandler(arg250);
                                                    if (!(arg250.length == 0)) {
                                                        arg251 = arg250;
                                                        arg252 = arg251;
                                                        arg253   = new ArrayList<PunishmentService>();
                                                        arg254 = ((CommandSenderWrapper[])arg252).length;
                                                        for (arg255 = 0; arg255 < arg254; ++arg255) {
                                                            arg256 = arg257 = arg252[arg255];
                                                            ObjectUtilities.BaseCoreGenericHandler(arg256);
                                                            if (!arg249.BaseCoreGenericHandler(arg229, arg256)) continue;
                                                            arg253  .add(arg257);
                                                        }
                                                        arg251 = (List)arg253  ;
                                                        arg252 = arg251.iterator();
                                                        while (arg252.hasNext()) {
                                                            arg253   = arg252.next();
                                                            arg258 = (CommandSenderWrapper)arg253  ;
                                                            arg259 = (MessageHandler)arg248;
                                                            ((PunishmentTableService)arg259.LiteBansModule_240().BaseCoreGenericHandler(PunishmentTableService.class)).BaseCoreGenericHandler(arg258.BaseCoreGenericHandler(), arg229);
}
                                                    v84 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                    break;
                                                }
                                                case 3: {
                                                    arg260 = arg230;
                                                    arg261 = arg231;
                                                    arg262 = arg229;
                                                    arg263 = (MessageHandler)arg260;
                                                    arg264 = arg263;
                                                    if (!(((ConfigService)arg264.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().A().length == 0)) {
                                                        arg263 = (CommandThrottleService)arg261.e().BaseCoreGenericHandler(CommandThrottleService.class);
                                                        if (arg262.DatabaseMonitorService() == null) {
                                                            arg265 = (MessageHandler)arg260;
                                                            ConfigService.BaseCoreGenericHandler((ConfigService)arg265.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class), (Object)"null", 0, 2, null);
                                                        } else {
                                                            arg266 = arg261.BaseCoreGenericHandler(arg262, 512);
                                                            arg264 = arg261.c(arg262.DatabaseMonitorService());
                                                            if (arg264 == null) {
                                                                arg267 = (MessageHandler)arg260;
                                                                ConfigService.BaseCoreGenericHandler((ConfigService)arg267.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class), (Object)"null", 0, 2, null);
                                                            } else {
                                                                arg268 = arg264.BaseCoreGenericHandler();
                                                                arg255 = arg266.size();
                                                                arg269 = (MessageHandler)arg260;
                                                                arg269 = (ConfigService)arg269.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                                                                arg270 = 10;
                                                                if (arg269.BaseCoreGenericHandler(arg270)) {
                                                                    arg271 = arg269;
                                                                    arg271.BaseCoreGenericHandler((Object)("Active warnings: " + arg255));
                                                                }
                                                                arg272 = (MessageHandler)arg260;
                                                                arg273 = arg272;
                                                                for (Object arg273 : ((ConfigService)arg273.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().A()) {
                                                                    if (StringUtilities.LiteBansModule_31((CharSequence)arg273)) continue;
                                                                    arg274   = new char[]{':'};
                                                                    arg274   = (char[])StringUtilities.BaseCoreGenericHandler((CharSequence)arg273, arg274  , false, 2, 2, null);
                                                                    arg275 = arg274  ;
                                                                    arg276 = arg275.toArray(new String[0]);
                                                                    if (StringUtilities.LiteBansModule_31((CharSequence)arg276[0], '+', false, 2, null)) {
                                                                        arg276[0] = arg276[0].substring(0, arg276[0].length() - 1);
                                                                    }
                                                                    if (!StringUtilities.c((CharSequence)arg273, ':', false, 2, null) || !HexEncodingHelper.BaseCoreGenericHandler.AsyncBackgroundTask_5(arg276[0])) {
                                                                        arg261.e().getLogger().warning("Warning action is invalid (bad format): '" + (String)arg273 + "'. Ignored + ");
                                                                        continue;
                                                                    }
                                                                    arg277 = Integer.parseInt(arg276[0]);
                                                                    if (arg277 < 1 && !arg278) {
                                                                        arg261.e().getLogger().warning("Warning action is invalid (threshold " + arg277 + " < 1): '" + (String)arg273 + "'. Ignored + ");
                                                                        continue;
                                                                    }
                                                                    if (arg255 != arg277 && (!arg278 || arg255 <= arg277)) continue;
                                                                    arg275 = new LiteBansModule_144();
                                                                    arg275.BaseCoreGenericHandler = arg276[1];
                                                                    if (StringUtilities.BaseCoreGenericHandler((CharSequence)arg275.BaseCoreGenericHandler, '/', false, 2, null)) {
                                                                        arg279 = (CharSequence)arg275.BaseCoreGenericHandler;
                                                                        arg280 = 1;
                                                                        arg281 = arg279.length();
                                                                        arg275.BaseCoreGenericHandler = arg279.subSequence(arg280, arg281).toString();
                                                                    }
                                                                    if (GeoIPLookupService.LiteBansModule_31((CharSequence)arg275.BaseCoreGenericHandler, "list")) {
                                                                        arg279 = new StringBuilder();
                                                                        arg282 = arg266;
                                                                        for (T arg283 : arg282) {
                                                                            arg284 = (SilentHandler)arg283;
                                                                            arg279.append('\n').append(AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)arg261, (CharSequence)MessageKey.UsageHandler, arg284, false, 2, null));
                                                                        }
                                                                        arg275.BaseCoreGenericHandler = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)arg275.BaseCoreGenericHandler, (CharSequence)"list", arg279);
                                                                    }
                                                                    arg275.BaseCoreGenericHandler = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)arg261, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)arg261, (CharSequence)arg275.BaseCoreGenericHandler, arg262, false, 2, null), (CharSequence)"player", (Object)arg268), (LiteBansModule_297)arg264, false, 2, null);
                                                                    arg279 = (MessageHandler)arg260;
                                                                    ((ConfigService)arg279.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler(10, arg275.BaseCoreGenericHandler);
                                                                    arg285 = (MessageHandler)arg260;
                                                                    arg286 = arg285;
                                                                    v85 = arg279 = ((ConfigService)arg286.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule() != false ? arg261.e().HoverTextFormatter() : arg260.AsyncBackgroundTask_5();
                                                                    ObjectUtilities.BaseCoreGenericHandler(v85);
                                                                    arg263.LiteBansModule_31((byte)3, v85.BaseCoreGenericHandler());
                                                                    arg261.e().c(new AsyncBackgroundTask_2((CommandSenderWrapper)arg279, (LiteBansModule_144)arg275));
                                                                    arg285 = (MessageHandler)arg260;
                                                                    arg286 = arg285;
                                                                    if (!((ConfigService)arg286.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_2()) continue;
                                                                    arg285 = (MessageHandler)arg260;
                                                                    arg286 = arg285;
                                                                    if (arg273 != ArrayUtilities.c(((ConfigService)arg286.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().A())) continue;
                                                                    arg285 = arg266;
                                                                    arg286 = arg285.iterator();
                                                                    while (arg286.hasNext()) {
                                                                        arg287 = arg286.next();
                                                                        arg284 = (SilentHandler)arg287;
                                                                        AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)arg261, arg284, arg262.e(), arg262.LiteBansModule_433(), null, false, 24, null);
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
                                            arg247 = (MessageHandler)arg230;
                                            arg235 = (BroadcastService)arg247.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class);
                                            arg235.BaseCoreGenericHandler((LiteBansModule_82)arg231, (NoneHandler_2)arg27);
                                        }
                                        if (!arg246.PunishmentTableService()) {
                                            arg288 = (MessageHandler)arg230;
                                            arg289 = arg288;
                                            if (((ConfigService)arg289.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().e() > 0 && arg229.ServerSyncService() == BanHandler.LiteBansModule_240 && arg229.LiteBansModule_240() && arg229.DatabaseMonitorService() != null) {
                                                arg288 = MessageHandler.BaseCoreGenericHandler;
                                                arg290 = arg231.AsyncBackgroundTask_5().CommandThrottleService() == false;
                                                arg289 = MessageKey.LiteBansModule_117;
                                                arg291 = arg288;
                                                if (arg290) {
                                                    arg292 = arg291;
                                                    arg292.BaseCoreGenericHandler(arg289);
                                                    throw new CommandExitException();
                                                }
                                                arg288 = new LiteBansModule_206(arg229.DatabaseMonitorService(), (LiteBansModule_82)arg231, null, false, 0, 28, null).i();
                                                if (arg288.n()) {
{
                                                        arg293 = MessageHandler.BaseCoreGenericHandler;
                                                        arg294 = arg288.m() > 10 && arg246.LiteBansModule_194() == false;
                                                        if (arg294) {
                                                            arg295 = arg293;
                                                            arg295.BaseCoreGenericHandler(MessageKey.U.BaseCoreGenericHandler("list", (Object)arg288.c()));
                                                            throw new CommandExitException();
                                                        }
                                                        arg293 = MessageHandler.BaseCoreGenericHandler;
                                                        arg296 = arg288.LiteBansModule_240();
                                                        if (arg296 instanceof Collection && ((Collection)arg296).isEmpty()) {
                                                        } else {
                                                            for (T arg297 : arg296) {
                                                                arg298 = (LiteBansModule_327)arg297;
                                                                if (!ObjectUtilities.BaseCoreGenericHandler((Object)arg298.LiteBansModule_31(), (Object)arg246.AsyncBackgroundTask_5())) continue;
                                                                break;
}
                                                    arg299 = v86;
                                                    arg300 = MessageKey.aa;
                                                    arg301 = arg293;
                                                    if (arg299) {
                                                        arg302 = arg301;
                                                        arg302.BaseCoreGenericHandler(arg300);
                                                        throw new CommandExitException();
                                                    }
                                                    for (LiteBansModule_327 arg303 : arg288.LiteBansModule_240()) {
                                                        if (HexEncodingHelper.BaseCoreGenericHandler.GnuSparseMapHandler(arg303.LiteBansModule_31()) == null || ObjectUtilities.BaseCoreGenericHandler((Object)arg303.LiteBansModule_31(), (Object)arg229.DatabaseMonitorService()) || arg303.c() != null && ObjectUtilities.BaseCoreGenericHandler((Object)arg303.c().DatabaseMonitorService(), (Object)arg303.LiteBansModule_31()) || AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)arg231, (UUID)arg300, null, 2, null)) continue;
                                                        arg246.BaseCoreGenericHandler((LiteBansModule_82)arg231, arg303.e(), arg303.LiteBansModule_31());
                                                        v87 = arg246.AsyncBackgroundTask_22();
                                                        v88 = arg246.AsyncBackgroundTask_22();
                                                        CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)arg231, arg303, arg229, v87 != null ? v87.BaseCoreGenericHandler() : null, v88 != null ? v88.i() : null, null, null, false, 112, null);
}
                                        arg230 = arg12;
                                        arg231 = BroadcastHandler.LiteBansModule_401.BaseCoreGenericHandler(arg27.ServerSyncService());
                                        if (!arg230.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) break;
                                        arg47   = arg231;
                                        arg41 = arg230;
                                        arg304 = ServerSyncService.GnuSparseMapHandler;
                                        arg305 = arg107  ;
                                        arg306 = ServerSyncService.GnuSparseMapHandler;
                                    }
                                    catch (Throwable arg307) {
                                        arg231 = arg12;
                                        arg232   = BroadcastHandler.LiteBansModule_401.BaseCoreGenericHandler(arg27.ServerSyncService());
                                        if (arg231.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
                                            arg47   = arg232  ;
                                            arg41 = arg231;
                                            arg308 = ServerSyncService.GnuSparseMapHandler;
                                            arg309 = arg107  ;
                                            arg310 = ServerSyncService.GnuSparseMapHandler;
                                            arg311 = new CharSequence[2];
                                            v89 = arg309.BaseCoreGenericHandler();
                                            if (v89 == null) {
                                                v89 = "";
                                            }
                                            arg311[0] = LiteBansModule_50.c.AsyncBackgroundTask_5(v89);
                                            arg311[1] = arg229.LiteBansModule_240() != false ? String.valueOf(arg309.c()) : "";
                                            arg312 = ArrayUtilities.BaseCoreGenericHandler(arg311, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                            CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)arg41, (BroadcastHandler)arg47  , arg312, null, null, 12, null);
                                        }
                                        throw arg307;
                                    }
                                    arg313 = new CharSequence[2];
                                    v90 = arg305.BaseCoreGenericHandler();
                                    if (v90 == null) {
                                        v90 = "";
                                    }
                                    arg313[0] = LiteBansModule_50.c.AsyncBackgroundTask_5(v90);
                                    arg313[1] = arg229.LiteBansModule_240() != false ? String.valueOf(arg305.c()) : "";
                                    arg314 = ArrayUtilities.BaseCoreGenericHandler(arg313, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                    CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)arg41, (BroadcastHandler)arg47  , arg314, null, null, 12, null);
                                }
                                arg27.BaseCoreGenericHandler(InitHandler.e);
                            }
                            finally {
                                arg27.BaseCoreGenericHandler(InitHandler.LiteBansModule_31);
}
                        catch (LiteBansException_2 arg315) {
}
                    arg11 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable arg316) {
                    arg317 = arg316;
                    throw arg316;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(arg10, arg317);
}
            catch (SQLException arg318) {
                if (arg4.LiteBansModule_31(arg318)) break;
                throw arg318;
}

    private final void LiteBansModule_31(NoneHandler_2 cz2, String string) {
        LiteBansModule_65 c12 = this.plugin(cz2, string);
        if (c12 == null) {
            cz2.n().append(string).append(' ');
        } else {
            this.plugin(cz2, c12);
}

    private final void BaseCoreGenericHandler(NoneHandler_2 cz2, LiteBansModule_65 c12) {
        cz2.BaseCoreGenericHandler(c12);
        MessageHandler messageHandler = this;
        cz2.BaseCoreGenericHandler(((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).AsyncBackgroundTask_21().BaseCoreGenericHandler(cz2.ServerSyncService(), c12));
    }

    private final LiteBansModule_65 BaseCoreGenericHandler(NoneHandler_2 cz2, String string) {
        LiteBansModule_65 c12;
        if (((CharSequence)cz2.n()).length() > 0 || ((CharSequence)cz2.AsyncBackgroundTask_21()).length() == 0 || cz2.PunishmentService() || cz2.BanHandler_5()) {
            c12 = null;
        } else {
            MessageHandler messageHandler = this;
            c12 = ((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).AsyncBackgroundTask_21().BaseCoreGenericHandler(cz2.ServerSyncService(), string);
        }
        return c12;
    }

    private final void BaseCoreGenericHandler(NoneHandler_2 cz2, LiteBansModule_113 d92) {
        if (cz2.ServerSyncService() == BanHandler.LiteBansModule_240) {
            String string;
            Object object = this;
            object = ((BroadcastService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).LiteBansModule_194();
            String string2 = d92.AsyncBackgroundTask_5();
            if (string2 != null) {
                String string3 = string2;
                string = string3.toLowerCase(Locale.ENGLISH);
            } else {
                string = null;
            }
            String string4 = string;
            NullHandler_6.LiteBansModule_31(object).remove(string4);
}

    private final void BaseCoreGenericHandler(LiteBansModule_113 d92) {
        String string;
        String string2;
        Object object = this;
        MessageHandler messageHandler = (MessageHandler)object;
        if (((BroadcastService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).LiteBansModule_194().size() >= 128) {
            messageHandler = (MessageHandler)object;
            flag2 = false;
            ((BroadcastService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).LiteBansModule_194().clear();
            ((MessageHandler)object).LiteBansModule_240().getLogger().warning("Too many unbanned players InitializerHandler_3 queue! Cleared list to prevent memory ");
        }
        if ((string2 = d92.g()) == null || (string2 = (string = string2).toLowerCase(Locale.ENGLISH)) == null) {
            return;
        }
        object = string2;
        MessageHandler fg_03 = this;
        ((BroadcastService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).LiteBansModule_194().add(object);
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(CommandSenderWrapper sender, LiteBansModule_82 ch2) {
        AllHandler_3.BaseCoreGenericHandler(ch2, sender.i(), sender.BaseCoreGenericHandler(), sender.LiteBansModule_31(), false, false, 16, null);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(NoneHandler_2 cz2, LiteBansModule_82 ch2) {
        LiteBansModule_297 iA2 = cz2.AsyncBackgroundTask_22();
        ObjectUtilities.BaseCoreGenericHandler(iA2);
        ch2.BaseCoreGenericHandler(iA2, false);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    static {
        BanHandler_3.LiteBansModule_31();
        GnuSparseMapHandler = new UsageHandler(null);
    }

    private static final void LiteBansModule_31() {
        Utf8Handler_2 = new String[]{"ban", "[c] ", "[LiteBans]", " Plugin access has been disabled!", "litebans.admin", "[LiteBans]", " If you have bought LiteBans, contact Ruan on ", "\n", "Timeout after ", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", " seconds", "duration:permanent", "\\-", "-", "", "", "", "", "", "litebans.temp", "", "litebans.ip", "", "litebans.ip", "litebans.ip", "", "litebans.modify", "", ".own", "litebans.ip", ".wildcard", "_USAGE", "_USAGE", "litebans + ", "litebans + ", "litebans.ip", "#offline#", "#offline#", "#", "#", "#", "player", "Hiding IP address from broadcast: ", "", "Applying ", " template group ", ": weight ", " => ", " (", "Applying ", " template \"", "\" LiteBansModule_21 level ", "", "", ".own", "", "[0xff] ", " (LiteBansModule_433=", "litebans.modify", "litebans.delete", "", "No active ", " found for uuid:", " / ip:", " on server:", " (target: '", "')", "Try targeting LiteBansModule_61 UUID instead of ", "\n", "litebans.unban.queue", "", "", "\ufeff", "", "", "\ufeff", "litebans.override", "bannedPlayer", "mutedPlayer", "#offline#", "tempDuration", "null", "null", "Active warnings: ", "Warning action is invalid (bad format): '", "' + ", "Warning action is invalid (threshold ", " < 1): '", "' + ", "list", "list", "player", "list", "", "", "\ufeff", "", "", "\ufeff", "Too many unbanned players InitializerHandler_3 queue! Cleared list to prevent memory ", "Too many unbanned players InitializerHandler_3 queue! Cleared list to prevent memory ", "litebans.override", "bannedPlayer", "mutedPlayer", "#offline#", "null", "null", "Active warnings: ", "Warning action is invalid (bad format): '", "' + ", "Warning action is invalid (threshold ", " < 1): '", "' + ", "list", "list", "player", "tempDuration", "null", "null", "Active warnings: ", "Warning action is invalid (bad format): '", "' + ", "Warning action is invalid (threshold ", " < 1): '", "' + ", "list", "list", "player", "list"};
}

