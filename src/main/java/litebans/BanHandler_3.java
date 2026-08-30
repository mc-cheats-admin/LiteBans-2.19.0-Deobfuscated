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
            var4_3 = this;
            var5_4 = 0;
            var3_5 = (ConfigService)var4_3.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
            var4_3 = this.LiteBansModule_240().DatabaseMonitorService();
            var5_4 = var4_3.size();
            try {
                var6_6 = var3_5;
                var7_8 = false;
                if (var6_6.g()) {
                    var78_10 = var6_6;
                    var8_11 = false;
                    var79_15 = "[c] " + var5_4;
                    var78_10.BaseCoreGenericHandler((Object)var79_15);
                }
            }
            catch (LiteBansException_4 var6_7) {
                var7_9 = var3_5;
                var8_12 = false;
                if (ObjectUtilities.BaseCoreGenericHandler(LiteBansModule_253.BaseCoreGenericHandler((ConfigService)var7_9), (Object)MessageKey.BaseCoreGenericHandler(var7_9, false, true))) {
                    var3_5.LiteBansModule_31((byte)49);
                }
                var7_9 = this;
                var8_12 = false;
                ((DatabaseMonitorService)var7_9.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(var6_7);
                return;
            }
            var6_6 = this;
            var7_8 = false;
            var6_6 = (DatabaseMonitorService)var6_6.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            var7_8 = false;
            try {
                var8_13 = var6_6.LiteBansModule_194();
                var9_16 = var8_13;
                var10_17 = null;
                try {
                    block268: {
                        var11_18 = (LiteBansModule_82)var9_16;
                        var12_19 = false;
                        var13_22 = var8_13;
                        var14_23 = false;
                        var15_24 = new LiteBansException_2();
                        if (var13_22.LiteBansModule_31()) {
                            var16_25 = MessageHandler.BaseCoreGenericHandler;
                            var17_28 = var3_5.DatabaseMonitorService() != null;
                            var18_30 = BlackHandler.c + "[LiteBans]" + BlackHandler.F + " Plugin access has been disabled!";
                            var19_32 = v1;
                            var20_35 = "litebans.admin";
                            var21_39 = false;
                            var19_33 = var19_32.e(var20_35);
                            var20_36 = false;
                            if (var19_33) {
                                var21_39 = false;
                                var22_41 = BlackHandler.c + "[LiteBans]" + BlackHandler.AsyncBackgroundTask_5 + " If you have bought LiteBans, contact Ruan on SpigotMC + ";
                                var23_47 = false;
                                if (var22_41 != null && var22_41.length() > 0 != false) {
                                    var23_48 = var18_30;
                                    var24_53 = "\n";
                                    var25_62 = false;
                                    var23_48 = "" + var23_48 + var24_53;
                                    var24_54 = false;
                                    v0 = "" + var23_48 + var22_41;
                                } else {
                                    v0 = var18_30;
                                }
                            } else {
                                v0 = var18_30;
                            }
                            var18_30 = LiteBansModule_242.BaseCoreGenericHandler(v0, (CharSequence)var3_5.GnuSparseMapHandler());
                            var19_33 = false;
                            var20_37 = var16_25;
                            var21_39 = false;
                            if (var17_28) {
                                var22_41 = var20_37;
                                var23_49 = false;
                                var22_41.BaseCoreGenericHandler(var18_30);
                                throw new CommandExitException();
                            }
                            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.ServerEventListener);
                            throw new CommandExitException();
                        }
                        try {
                            if (LiteBansCommand.i == null) {
                                throw var15_24;
                            }
                            var16_26 = var3_5.LiteBansModule_194();
                            var17_29 = var13_22.e().q();
                            var18_31 = var16_26.BuilderactionHandler();
                            var20_38 = BanHandler.LiteBansModule_240;
                            var21_40 = var16_26.ServerSyncService();
                            var22_42 = var16_26.n();
                            var23_50 = var13_22.AsyncBackgroundTask_5().BaseCoreGenericHandler(v1);
                            var26_69 = DatabaseMonitorService.BaseCoreGenericHandler(var13_22.AsyncBackgroundTask_5(), false, 1, null);
                            var28_70 = var13_22.BaseCoreGenericHandler(v1);
                            var19_34 = new NoneHandler_2((BanHandler)var20_38, var21_40, var22_42, false, false, false, false, false, false, false, false, false, false, false, var26_69, 0L, 0L, 0, null, null, false, null, 0, null, null, null, null, v1, (String)var28_70, null, var18_31, var23_50, null, null, v2, null, null, 671072248, 27, null);
                            var20_38 = var19_34;
                            var21_40 = false;
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
                                                                                            NoneHandler_2.BaseCoreGenericHandler((NoneHandler_2)var20_38, var13_22, null, false, 3, null);
                                                                                            var22_43 = MessageHandler.BaseCoreGenericHandler;
                                                                                            var23_51 = var20_38.ServerSyncService().c() == BanHandler.GnuSparseMapHandler && var16_26.PunishmentTableService() == false ? 1 : 0;
                                                                                            var24_55 = MessageKey.LiteBansModule_134;
                                                                                            var25_63 = false;
                                                                                            var28_70 = var22_43;
                                                                                            var29_81 = false;
                                                                                            if (var23_51 != 0) {
                                                                                                var30_101 = var28_70;
                                                                                                var31_118 = false;
                                                                                                var30_101.BaseCoreGenericHandler(var24_55);
                                                                                                throw new CommandExitException();
                                                                                            }
                                                                                            var22_43 = MessageHandler.BaseCoreGenericHandler;
                                                                                            var23_51 = var20_38.Utf8Handler_2() != false && v1.e() != false && var16_26.LiteBansModule_24() != false ? 1 : 0;
                                                                                            var24_55 = MessageKey.LiteBansModule_31;
                                                                                            var25_63 = false;
                                                                                            var28_70 = var22_43;
                                                                                            var29_81 = false;
                                                                                            if (var23_51 != 0) {
                                                                                                var30_102 = var28_70;
                                                                                                var31_119 = false;
                                                                                                var30_102.BaseCoreGenericHandler(var24_55);
                                                                                                throw new CommandExitException();
                                                                                            }
                                                                                            var22_43 = MessageHandler.BaseCoreGenericHandler;
                                                                                            var23_51 = var20_38.F() != false && v1.e() != false && var16_26.LiteBansModule_17() != false ? 1 : 0;
                                                                                            var24_55 = MessageKey.LiteBansModule_31;
                                                                                            var25_63 = false;
                                                                                            var28_70 = var22_43;
                                                                                            var29_81 = false;
                                                                                            if (var23_51 != 0) {
                                                                                                var30_103 = var28_70;
                                                                                                var31_120 = false;
                                                                                                var30_103.BaseCoreGenericHandler(var24_55);
                                                                                                throw new CommandExitException();
                                                                                            }
                                                                                            var22_44 = var3_5.i().BaseCoreGenericHandler(10);
                                                                                            switch (var22_44) {
                                                                                                case 0: 
                                                                                                case 1: {
                                                                                                    var23_51 = var3_5.i().BaseCoreGenericHandler(10);
                                                                                                    if (var23_51 != 1) ** GOTO lbl182
                                                                                                    var24_55 = var3_5;
                                                                                                    var25_63 = false;
                                                                                                    if (!var24_55.g()) ** GOTO lbl183
                                                                                                    var32_136 = var24_55;
                                                                                                    var28_71 = false;
                                                                                                    v1 = new StringBuilder().append("Timeout after ");
                                                                                                    var29_82 = AbstractCommand.AsyncBackgroundTask_5;
                                                                                                    var30_104 /* !! */  = this.getName();
                                                                                                    var31_121 = false;
                                                                                                    var33_137 = var30_104 /* !! */ ;
                                                                                                    switch (var33_137.hashCode()) {
                                                                                                        case -1320563219: {
                                                                                                            if (var33_137.equals("dupeip")) break;
                                                                                                            ** break;
                                                                                                        }
                                                                                                        case 712910260: {
                                                                                                            if (!var33_137.equals("staffhistory")) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            ** GOTO lbl171
                                                                                                        }
                                                                                                        case 926934164: {
                                                                                                            if (!var33_137.equals("history")) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            ** GOTO lbl168
                                                                                                        }
                                                                                                    }
                                                                                                    var34_155 /* !! */  = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                                                                                                    v2 = var34_155 /* !! */ ;
                                                                                                    ** GOTO lbl177
lbl168:
                                                                                                    // 1 sources

                                                                                                    var34_155 /* !! */  = new String[]{"hist", "litebans:history"};
                                                                                                    v2 = var34_155 /* !! */ ;
                                                                                                    ** GOTO lbl177
lbl171:
                                                                                                    // 1 sources

                                                                                                    var34_155 /* !! */  = new String[]{"staffhist", "litebans:staffhistory"};
                                                                                                    v2 = var34_155 /* !! */ ;
                                                                                                    ** GOTO lbl177
lbl174:
                                                                                                    // 4 sources

                                                                                                    var34_155 /* !! */  = new String[]{"litebans:" + (String)var30_104 /* !! */ };
                                                                                                    v2 = var34_155 /* !! */ ;
lbl177:
                                                                                                    // 4 sources

                                                                                                    var35_170 = v2;
                                                                                                    var36_182 /* !! */  = v1.append((Object)LiteBansModule_72.c(new LiteBansModule_403(var3_5, Arrays.copyOf(var35_170, ((String[])var35_170).length)).LiteBansModule_31())).append(" seconds").toString();
                                                                                                    var32_136.BaseCoreGenericHandler((Object)var36_182 /* !! */ );
                                                                                                    ** GOTO lbl183
lbl182:
                                                                                                    // 1 sources

                                                                                                    var13_22.AsyncBackgroundTask_5().c();
lbl183:
                                                                                                    // 3 sources

                                                                                                    v3 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                case 2: {
                                                                                                    LiteBansModule_253.BaseCoreGenericHandler(var3_5, MessageKey.BaseCoreGenericHandler(var3_5.LiteBansModule_194(), false, true));
                                                                                                    v3 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                case 3: 
                                                                                                case 4: 
                                                                                                case 5: 
                                                                                                case 6: 
                                                                                                case 7: {
                                                                                                    var23_51 = var3_5.LiteBansModule_401();
                                                                                                    if (var23_51 == 1 && new LiteBansModule_324(0L, 1, null).BaseCoreGenericHandler((int)var3_5.q()) == 0 || var23_51 == 2 && (long)var17_29.length >= var3_5.q() || var23_51 == 3 && AllHandler_3.BaseCoreGenericHandler(var13_22, BansHandler_2.Utf8Handler_2, null, true, 2, null) >= var3_5.q()) {
                                                                                                        var3_5.BaseCoreGenericHandler(new LiteBansModule_324(0L, 1, null));
                                                                                                    }
                                                                                                    var24_56 = 0;
                                                                                                    while (var24_56 < var20_38.A().size()) {
                                                                                                        var28_72 = var20_38.A().get(var24_56);
                                                                                                        var25_65 = (String)var28_72;
                                                                                                        if (((CharSequence)var25_65).length() == 0) {
                                                                                                            ++var24_56;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (ObjectUtilities.BaseCoreGenericHandler((Object)var25_65, (Object)"duration:permanent") && (var20_38.F() || !var20_38.BanHandler_5() && var20_38.ServerSyncService().c() != BanHandler.c)) {
                                                                                                            var20_38.LiteBansModule_31(-2L);
                                                                                                            var20_38.LiteBansModule_401(false);
                                                                                                            ++var24_56;
                                                                                                            continue;
                                                                                                        }
                                                                                                        var25_65 = LiteBansModule_433.LiteBansModule_31.BaseCoreGenericHandler(var25_65, "\\-", (Object)"-");
                                                                                                        var28_73 = var24_56 == var20_38.A().size() - 1;
                                                                                                        var29_83 = LiteBansModule_81.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(), var25_65, "");
                                                                                                        var30_104 /* !! */  = this.plugin((NoneHandler_2)var20_38, var25_65);
                                                                                                        if (var30_104 /* !! */  == null) ** GOTO lbl214
                                                                                                        this.plugin((NoneHandler_2)var20_38, (LiteBansModule_65)var30_104 /* !! */ );
                                                                                                        ** GOTO lbl304
lbl214:
                                                                                                        // 1 sources

                                                                                                        if (!var20_38.F() && var20_38.BanHandler_5() || var20_38.ServerSyncService().c() == BanHandler.c || var20_38.DatabaseMonitorService() != -1L || !Character.isDigit(var25_65.charAt(0)) || StringUtilities.c((CharSequence)var25_65, ':', false, 2, null) || StringUtilities.c((CharSequence)var25_65, '%', false, 2, null) || StringUtilities.c((CharSequence)var25_65, '*', false, 2, null) || !0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler.c(var29_83) || 0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler(var25_65)) ** GOTO lbl296
                                                                                                        if (!(((CharSequence)var20_38.AsyncBackgroundTask_21()).length() == 0) || var25_65.length() <= 1) ** GOTO lbl251
                                                                                                        var31_122 = BlackHandler.BaseCoreGenericHandler((CharSequence)var25_65);
                                                                                                        ObjectUtilities.BaseCoreGenericHandler(var17_29);
                                                                                                        var34_155 /* !! */  = var17_29;
                                                                                                        ObjectUtilities.BaseCoreGenericHandler(var31_122);
                                                                                                        var35_170 = var31_122;
                                                                                                        var37_183 = true;
                                                                                                        var38_208 = false;
                                                                                                        var39_234 = var34_155 /* !! */ ;
                                                                                                        var41_280 = ((Object)var39_234).length;
                                                                                                        for (var40_252 = 0; var40_252 < var41_280; ++var40_252) {
                                                                                                            var43_332 = var42_304 = var39_234[var40_252];
                                                                                                            var44_357 = false;
                                                                                                            if (!StringUtilities.BaseCoreGenericHandler(var43_332.i(), (String)var35_170, var37_183)) continue;
                                                                                                            v4 = var42_304;
                                                                                                            ** GOTO lbl233
                                                                                                        }
                                                                                                        v4 = null;
lbl233:
                                                                                                        // 2 sources

                                                                                                        if ((var33_138 = v4) != null) {
                                                                                                            var34_155 /* !! */  = var33_138.i();
                                                                                                            var20_38.LiteBansModule_31((String)var34_155 /* !! */ );
                                                                                                            if (AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(var13_22.e(), var20_38.CommandThrottleService())) {
                                                                                                                var13_22.AsyncBackgroundTask_5().BaseCoreGenericHandler((LiteBansModule_178)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, BaseCoreGenericHandler(litebans.CommandSenderWrapper litebans.LiteBansModule_82 ), (Llitebans/LiteBansModule_82;)Llitebans/iV;)((CommandSenderWrapper)var33_138));
                                                                                                            }
                                                                                                            ++var24_56;
                                                                                                            continue;
                                                                                                        }
                                                                                                        var20_38.BaseCoreGenericHandler(var13_22.c(var25_65));
                                                                                                        if (var20_38.AsyncBackgroundTask_22() != null) {
                                                                                                            var34_155 /* !! */  = var20_38.AsyncBackgroundTask_22();
                                                                                                            v5 = var34_155 /* !! */ ;
                                                                                                            if (v5 == null || (v5 = (var35_170 = v5.BaseCoreGenericHandler())) == null) {
                                                                                                                v5 = "";
                                                                                                            }
                                                                                                            var20_38.LiteBansModule_31((String)v5);
                                                                                                            ++var24_56;
                                                                                                            continue;
                                                                                                        }
lbl251:
                                                                                                        // 3 sources

                                                                                                        if ((var31_122 = StringUtilities.LiteBansModule_31(var29_83)) == null) {
                                                                                                            if (((CharSequence)var20_38.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                                var20_38.LiteBansModule_31(var25_65);
                                                                                                            }
                                                                                                            ++var24_56;
                                                                                                            continue;
                                                                                                        }
                                                                                                        var33_139 = LiteBansModule_81.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5.LiteBansModule_31(), var25_65, "");
                                                                                                        var34_155 /* !! */  = SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var33_139);
                                                                                                        if (var34_155 /* !! */  == null) {
                                                                                                            if (var28_73) {
                                                                                                                if (((CharSequence)var20_38.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                                    var20_38.LiteBansModule_31(var25_65);
                                                                                                                } else {
                                                                                                                    this.LiteBansModule_31((NoneHandler_2)var20_38, var25_65);
                                                                                                                }
                                                                                                                ++var24_56;
                                                                                                                continue;
                                                                                                            }
                                                                                                            var37_184 /* !! */  = var20_38.A().get(++var24_56);
                                                                                                            var35_170 = (String)var37_184 /* !! */ ;
                                                                                                            var34_155 /* !! */  = SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var35_170);
                                                                                                            if (var34_155 /* !! */  == null) {
                                                                                                                if (((CharSequence)var20_38.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                                    var20_38.LiteBansModule_31(var25_65);
                                                                                                                    var37_184 /* !! */  = LiteBansModule_81.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5.LiteBansModule_31(), (CharSequence)var35_170, "");
                                                                                                                    var38_209 = SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var37_184 /* !! */ );
                                                                                                                    if (var38_209 == null) {
                                                                                                                        this.LiteBansModule_31((NoneHandler_2)var20_38, (String)var35_170);
                                                                                                                    } else {
                                                                                                                        var39_234 = StringUtilities.LiteBansModule_31(LiteBansModule_81.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(), (CharSequence)var35_170, ""));
                                                                                                                        if (var39_234 == null) {
                                                                                                                            this.LiteBansModule_31((NoneHandler_2)var20_38, (String)var35_170);
                                                                                                                        } else {
                                                                                                                            var20_38.BaseCoreGenericHandler(var38_209.LiteBansModule_31(var39_234.doubleValue()));
                                                                                                                            var20_38.LiteBansModule_31(var20_38.J() + var20_38.BroadcastService());
                                                                                                                            var20_38.BaseCoreGenericHandler((CharSequence)(LiteBansModule_287.BaseCoreGenericHandler(var39_234.doubleValue()) + ' ' + var38_209.BaseCoreGenericHandler(var39_234.doubleValue())));
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v6 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                                } else {
                                                                                                                    v6 = var20_38.n().append(var25_65).append(' ').append((String)var35_170).append(' ');
                                                                                                                }
                                                                                                                ++var24_56;
                                                                                                                continue;
                                                                                                            }
                                                                                                        }
                                                                                                        var20_38.BaseCoreGenericHandler(var34_155 /* !! */ .LiteBansModule_31(var31_122.doubleValue()));
                                                                                                        var20_38.LiteBansModule_31(var20_38.J() + var20_38.BroadcastService());
                                                                                                        var20_38.BaseCoreGenericHandler((CharSequence)(LiteBansModule_287.BaseCoreGenericHandler(var31_122.doubleValue()) + ' ' + var34_155 /* !! */ .BaseCoreGenericHandler(var31_122.doubleValue())));
                                                                                                        ** GOTO lbl304
lbl296:
                                                                                                        // 1 sources

                                                                                                        if (((CharSequence)var20_38.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                            var20_38.LiteBansModule_31(var25_65);
                                                                                                        } else {
                                                                                                            this.LiteBansModule_31((NoneHandler_2)var20_38, var25_65);
                                                                                                            var31_122 = this;
                                                                                                            var33_140 = false;
                                                                                                            if (((BroadcastService)var31_122.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).GnuSparseMapHandler() == 0) {
                                                                                                                throw var15_24;
                                                                                                            }
                                                                                                        }
lbl304:
                                                                                                        // 5 sources

                                                                                                        ++var24_56;
                                                                                                    }
                                                                                                    if (var20_38.DatabaseMonitorService() > 0L) {
                                                                                                        var20_38.LiteBansModule_401(true);
                                                                                                    }
                                                                                                    v3 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                default: {
                                                                                                    v3 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                }
                                                                                            }
                                                                                            var22_45 = var20_38;
                                                                                            var23_52 = this;
                                                                                            var24_57 = false;
                                                                                            var25_66 = NoneHandler_2.BaseCoreGenericHandler((NoneHandler_2)var22_45, null, 1, null);
                                                                                            if (!var22_45.HoverTextFormatter()) ** GOTO lbl-1000
                                                                                            var28_74 = var23_52;
                                                                                            var29_84 = false;
                                                                                            var30_104 /* !! */  = var28_74;
                                                                                            var31_124 = false;
                                                                                            if (!((ConfigService)var30_104 /* !! */ .LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().ServerSyncService()) {
                                                                                                v7 = true;
                                                                                            } else lbl-1000:
                                                                                            // 2 sources

                                                                                            {
                                                                                                v7 = false;
                                                                                            }
                                                                                            var33_141 = v7;
                                                                                            switch (LiteBansModule_43.BaseCoreGenericHandler[var22_45.ServerSyncService().ordinal()]) {
                                                                                                case 4: 
                                                                                                case 5: {
                                                                                                    if (var22_45.LiteBansModule_401()) {
                                                                                                        var31_125 = new String[]{"litebans.temp" + var22_45.ServerSyncService(), "litebans + " + var22_45.ServerSyncService(), "litebans.ip" + var22_45.ServerSyncService()};
                                                                                                        v8 = var31_125;
                                                                                                    } else {
                                                                                                        var31_125 = new String[]{"litebans + " + var22_45.ServerSyncService(), "litebans.ip" + var22_45.ServerSyncService()};
                                                                                                        v8 = var30_104 /* !! */  = var31_125;
                                                                                                    }
                                                                                                    if (var33_141) {
                                                                                                        var31_125 = var23_52;
                                                                                                        var34_155 /* !! */  = "litebans.ip" + var22_45.ServerSyncService();
                                                                                                        var35_171 = false;
                                                                                                        var37_185 = var31_125.AsyncBackgroundTask_5();
                                                                                                        var38_208 = false;
                                                                                                        var39_234 = MessageHandler.BaseCoreGenericHandler;
                                                                                                        var40_253 = var37_185;
                                                                                                        var41_280 = 0;
                                                                                                        var42_304 = var40_253;
                                                                                                        var43_333 = false;
                                                                                                        var40_252 = var42_304.e((String)var34_155 /* !! */ ) == false ? 1 : 0;
                                                                                                        var41_281 = MessageKey.cZ;
                                                                                                        var42_305 = false;
                                                                                                        var43_332 = var39_234;
                                                                                                        var44_357 = false;
                                                                                                        if (var40_252 != 0) {
                                                                                                            var45_376 = var43_332;
                                                                                                            var46_395 = false;
                                                                                                            var45_376.BaseCoreGenericHandler(var41_281);
                                                                                                            throw new CommandExitException();
                                                                                                        }
                                                                                                    }
                                                                                                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)var23_52, Arrays.copyOf(var30_104 /* !! */ , var30_104 /* !! */ .length));
                                                                                                    v9 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                case 6: {
                                                                                                    var30_104 /* !! */  = var23_52;
                                                                                                    var31_125 = "litebans + " + var22_45.ServerSyncService();
                                                                                                    var34_156 = false;
                                                                                                    var35_170 = var30_104 /* !! */ .AsyncBackgroundTask_5();
                                                                                                    var37_183 = false;
                                                                                                    var38_210 = MessageHandler.BaseCoreGenericHandler;
                                                                                                    var39_234 = var35_170;
                                                                                                    var40_252 = 0;
                                                                                                    var41_282 = var39_234;
                                                                                                    var42_306 = false;
                                                                                                    var39_235 = var41_282.e((String)var31_125) == false;
                                                                                                    var40_254 = MessageKey.cZ;
                                                                                                    var41_283 = false;
                                                                                                    var42_307 = var38_210;
                                                                                                    var43_334 = false;
                                                                                                    if (var39_235) {
                                                                                                        var44_358 = var42_307;
                                                                                                        var45_377 = false;
                                                                                                        var44_358.BaseCoreGenericHandler(var40_254);
                                                                                                        throw new CommandExitException();
                                                                                                    }
                                                                                                    v9 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                case 1: 
                                                                                                case 2: 
                                                                                                case 3: {
                                                                                                    var30_104 /* !! */  = var22_45.F() != false ? "litebans.modify" : "litebans + " + var22_45.ServerSyncService();
                                                                                                    var31_125 = new String[]{var30_104 /* !! */ , (String)var30_104 /* !! */  + ".own"};
                                                                                                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)var23_52, (String[])var31_125);
                                                                                                    v9 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                                                                    break;
                                                                                                }
                                                                                                default: {
                                                                                                    AssertionUtilities.BaseCoreGenericHandler();
                                                                                                    throw new CommandExitException();
                                                                                                }
                                                                                            }
                                                                                            if (!var22_45.BanHandler_5() && var25_66) {
                                                                                                var28_75 = var23_52;
                                                                                                var29_85 = "litebans.ip" + var22_45.ServerSyncService() + ".wildcard";
                                                                                                var30_105 = false;
                                                                                                var31_125 = var28_75.AsyncBackgroundTask_5();
                                                                                                var34_157 = false;
                                                                                                var35_170 = MessageHandler.BaseCoreGenericHandler;
                                                                                                var37_186 = var31_125;
                                                                                                var38_211 = false;
                                                                                                var39_237 = var37_186;
                                                                                                var40_256 = false;
                                                                                                var37_187 = var39_237.e(var29_85) == false;
                                                                                                var38_212 = MessageKey.cZ;
                                                                                                var39_238 = false;
                                                                                                var40_257 = var35_170;
                                                                                                var41_284 = false;
                                                                                                if (var37_187) {
                                                                                                    var42_308 = var40_257;
                                                                                                    var43_335 = false;
                                                                                                    var42_308.BaseCoreGenericHandler(var38_212);
                                                                                                    throw new CommandExitException();
                                                                                                }
                                                                                            }
                                                                                            var20_38.BaseCoreGenericHandler(InitHandler.LiteBansModule_194);
                                                                                            if (((CharSequence)var20_38.AsyncBackgroundTask_21()).length() == 0) {
                                                                                                var22_45 = BanHandler_3.GnuSparseMapHandler;
                                                                                                var23_52 = var20_38.ServerSyncService();
                                                                                                var24_57 = var20_38.BanHandler_5();
                                                                                                var25_66 = false;
                                                                                                var28_76 = MessageKey.cC;
                                                                                                var29_86 = false;
                                                                                                if (var24_57) {
                                                                                                    v10 = MessageKey.c(var23_52 + "_USAGE");
                                                                                                } else {
                                                                                                    switch (LiteBansModule_190.BaseCoreGenericHandler[var23_52.ordinal()]) {
                                                                                                        case 1: {
                                                                                                            if (var28_76 == MessageKey.LockdownCommandHandler) {
                                                                                                                v11 = MessageKey.NullHandler;
                                                                                                                break;
                                                                                                            }
                                                                                                            v11 = MessageKey.LiteBansModule_102;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            if (var28_76 == MessageKey.LockdownCommandHandler) {
                                                                                                                v11 = MessageKey.ah;
                                                                                                                break;
                                                                                                            }
                                                                                                            v11 = MessageKey.0a000Handler;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            v11 = MessageKey.LiteBansModule_37;
                                                                                                            break;
                                                                                                        }
                                                                                                        default: {
                                                                                                            v11 = var28_76;
                                                                                                        }
                                                                                                    }
                                                                                                    v10 = v11;
                                                                                                }
                                                                                                var30_106 = v10;
                                                                                                var28_76 = MessageHandler.BaseCoreGenericHandler;
                                                                                                var29_86 = var23_52 == BanHandler.g;
                                                                                                var31_126 = false;
                                                                                                var33_142 = var28_76;
                                                                                                var34_158 = false;
                                                                                                if (var29_86) {
                                                                                                    var35_170 = var33_142;
                                                                                                    var37_188 = false;
                                                                                                    var35_170.BaseCoreGenericHandler(var30_106);
                                                                                                    throw new CommandExitException();
                                                                                                }
                                                                                                var29_87 = var22_45;
                                                                                                var31_127 = MessageKey.LockdownCommandHandler;
                                                                                                var33_143 = false;
                                                                                                if (var24_57) {
                                                                                                    v12 = MessageKey.c(var23_52 + "_USAGE");
                                                                                                } else {
                                                                                                    switch (LiteBansModule_190.BaseCoreGenericHandler[var23_52.ordinal()]) {
                                                                                                        case 1: {
                                                                                                            if (var31_127 == MessageKey.LockdownCommandHandler) {
                                                                                                                v13 = MessageKey.NullHandler;
                                                                                                                break;
                                                                                                            }
                                                                                                            v13 = MessageKey.LiteBansModule_102;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            if (var31_127 == MessageKey.LockdownCommandHandler) {
                                                                                                                v13 = MessageKey.ah;
                                                                                                                break;
                                                                                                            }
                                                                                                            v13 = MessageKey.0a000Handler;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            v13 = MessageKey.LiteBansModule_37;
                                                                                                            break;
                                                                                                        }
                                                                                                        default: {
                                                                                                            v13 = var31_127;
                                                                                                        }
                                                                                                    }
                                                                                                    v12 = v13;
                                                                                                }
                                                                                                var28_76 = v12;
                                                                                                MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(LiteBansModule_242.BaseCoreGenericHandler(var30_106, var24_57 == false, (CharSequence)var28_76));
                                                                                                throw new CommandExitException();
                                                                                            }
                                                                                            this.plugin((NoneHandler_2)var20_38);
                                                                                            var20_38.LiteBansModule_31(var20_38.BaseCoreGenericHandler(this));
                                                                                            var22_45 = CommandArgumentUtils.LiteBansModule_31(this, var20_38.AsyncBackgroundTask_21());
                                                                                            v14 = var22_45;
                                                                                            v15 = v14 != null && (v14 = (var24_58 = v14.LiteBansModule_240())) != null ? LiteBansModule_242.BaseCoreGenericHandler((String)v14, 32) : (var23_52 = null);
                                                                                            if (LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(var18_31) || StringUtilities.BaseCoreGenericHandler(var20_38.LiteBansModule_31(), var18_31, true)) break block272;
                                                                                            if (!LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(var18_31)) break block273;
                                                                                            v16 = var20_38.LiteBansModule_31();
                                                                                            var24_59 = var20_38.CommandThrottleService();
                                                                                            v17 = var24_59;
                                                                                            if (v17 == null && (v17 = var23_52) == null) {
                                                                                                v17 = var13_22.AsyncBackgroundTask_5().ServerSyncService();
                                                                                            }
                                                                                            if (StringUtilities.BaseCoreGenericHandler(v16, (String)v17, true)) break block272;
                                                                                        }
                                                                                        var24_60 = v1;
                                                                                        var25_67 = new String[]{"litebans.server + " + var20_38.LiteBansModule_31(), "litebans.server + " + var20_38.LiteBansModule_31() + '.' + var20_38.ServerSyncService().c()};
                                                                                        var28_77 = false;
                                                                                        var29_88 = var24_60;
                                                                                        var30_107 = Arrays.copyOf(var25_67, var25_67.length);
                                                                                        var31_128 = false;
                                                                                        var33_144 = var30_107;
                                                                                        var34_159 = false;
                                                                                        var37_189 = var33_144.length;
                                                                                        for (var35_172 = 0; var35_172 < var37_189; ++var35_172) {
                                                                                            var39_239 = var38_213 = var33_144[var35_172];
                                                                                            var40_258 = false;
                                                                                            if (!var29_88.e(var39_239)) continue;
                                                                                            v18 = true;
                                                                                            break block267;
                                                                                        }
                                                                                        v18 = false;
                                                                                    }
                                                                                    if (v18 == false) {
                                                                                        var20_38.AsyncBackgroundTask_5(LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(var18_31, var13_22.AsyncBackgroundTask_5().ServerSyncService(), v1));
                                                                                    }
                                                                                }
                                                                                var24_61 = LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(var13_22.AsyncBackgroundTask_5().ServerSyncService(), var20_38.LiteBansModule_31()) != false || var23_52 != null && LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler((String)var23_52, var20_38.LiteBansModule_31()) != false;
                                                                                var25_68 /* !! */  = var3_5;
                                                                                var28_78 = false;
                                                                                if (var25_68 /* !! */ .g()) {
                                                                                    var32_136 = var25_68 /* !! */ ;
                                                                                    var29_89 = false;
                                                                                    var36_182 /* !! */  = var20_38.LiteBansModule_31();
                                                                                    var32_136.BaseCoreGenericHandler((Object)var36_182 /* !! */ );
                                                                                }
                                                                                var25_68 /* !! */  = null;
                                                                                if (var22_45 == null) break block274;
                                                                                var28_79 = var3_5;
                                                                                var29_90 = var22_45.g();
                                                                                var30_108 = var22_45.i();
                                                                                var31_129 = false;
                                                                                var25_68 /* !! */  = new LiteBansModule_113(var20_38.AsyncBackgroundTask_21(), var22_45.i(), var28_79.LiteBansModule_194().SetHandler() != false ? var29_90 : var30_108, var22_45.BaseCoreGenericHandler(), var22_45.LiteBansModule_31(), (CommandSenderWrapper)var22_45, null, 64, null);
                                                                                var20_38.BaseCoreGenericHandler(new LiteBansModule_297(var25_68 /* !! */ .AsyncBackgroundTask_5(), var25_68 /* !! */ .BaseCoreGenericHandler(), var25_68 /* !! */ .c(), new Date(var20_38.J())));
                                                                                break block275;
                                                                            }
                                                                            var20_38.BaseCoreGenericHandler(var13_22.c(var20_38.AsyncBackgroundTask_21()));
                                                                            var28_79 = var20_38.AsyncBackgroundTask_22();
                                                                            v19 = var28_79;
                                                                            if (!(v19 != null && (v19 = (var29_91 = v19.LiteBansModule_31())) != null ? !StringUtilities.BaseCoreGenericHandler((CharSequence)v19, '#', false, 2, null) : false)) {
                                                                                var20_38.BaseCoreGenericHandler((LiteBansModule_297)null);
                                                                            }
                                                                            if (var20_38.AsyncBackgroundTask_22() != null) break block276;
                                                                            var28_79 = var20_38.AsyncBackgroundTask_21();
                                                                            var29_92 = false;
                                                                            if (!0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler.i((String)var28_79)) break block277;
                                                                            var20_38.m(true);
                                                                            var28_79 = MessageHandler.BaseCoreGenericHandler;
                                                                            var29_93 = v1;
                                                                            var30_109 /* !! */  = "litebans.ip" + var20_38.ServerSyncService().c();
                                                                            var31_130 = false;
                                                                            var33_145 = var29_93;
                                                                            var34_160 = false;
                                                                            var29_94 = var33_145.e(var30_109 /* !! */ ) == false;
                                                                            var30_109 /* !! */  = MessageKey.cZ;
                                                                            var31_130 = false;
                                                                            var33_145 = var28_79;
                                                                            var34_160 = false;
                                                                            if (var29_94) {
                                                                                var35_173 = var33_145;
                                                                                var37_190 = false;
                                                                                var35_173.BaseCoreGenericHandler(var30_109 /* !! */ );
                                                                                throw new CommandExitException();
                                                                            }
                                                                            var20_38.BaseCoreGenericHandler(new LiteBansModule_297("#offline#", "#offline#", var20_38.AsyncBackgroundTask_21(), new Date()));
                                                                            break block278;
                                                                        }
                                                                        if (!var20_38.BanHandler_5()) break block279;
                                                                        var28_79 = CommandArgumentUtils.AsyncBackgroundTask_5(this, var20_38.AsyncBackgroundTask_21());
                                                                        if (ObjectUtilities.BaseCoreGenericHandler(var28_79, (Object)var20_38.AsyncBackgroundTask_21())) break block280;
                                                                        var29_95 = AllHandler_3.BaseCoreGenericHandler(var13_22, (String)var28_79, var20_38.ServerSyncService(), null, var20_38.BanHandler_2() == false, 4, null);
                                                                        if (var20_38.BanHandler_2()) break block281;
                                                                        v20 = var29_95;
                                                                        v21 = v20 != null ? var13_22.BaseCoreGenericHandler(v20) : false;
                                                                        if (!v21) break block280;
                                                                    }
                                                                    v22 = var29_95;
                                                                    var20_38.BaseCoreGenericHandler(var13_22.c(v22 != null ? v22.DatabaseMonitorService() : null));
                                                                    v23 = var29_95;
                                                                    if (v23 == null || (v23 = (var30_110 = v23.m())) == null) {
                                                                        v23 = var20_38.LiteBansModule_31();
                                                                    }
                                                                    var20_38.AsyncBackgroundTask_5((String)v23);
                                                                    var20_38.BaseCoreGenericHandler(var29_95);
                                                                }
                                                                if (var20_38.AsyncBackgroundTask_22() != null || !0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler.AsyncBackgroundTask_5(var20_38.AsyncBackgroundTask_21())) break block279;
                                                                var29_96 = AllHandler_3.BaseCoreGenericHandler(var13_22, var20_38.AsyncBackgroundTask_21(), var20_38.ServerSyncService(), null, var20_38.BanHandler_2() == false, 4, null);
                                                                if (var20_38.BanHandler_2()) break block282;
                                                                v24 = var29_96;
                                                                v25 = v24 != null ? var13_22.BaseCoreGenericHandler(v24) : false;
                                                                if (!v25) break block279;
                                                            }
                                                            v26 = var29_96;
                                                            var20_38.BaseCoreGenericHandler(var13_22.c(v26 != null ? v26.DatabaseMonitorService() : null));
                                                            v27 = var29_96;
                                                            if (v27 == null || (v27 = (var30_111 = v27.m())) == null) {
                                                                v27 = var20_38.LiteBansModule_31();
                                                            }
                                                            var20_38.AsyncBackgroundTask_5((String)v27);
                                                            var20_38.BaseCoreGenericHandler(var29_96);
                                                        }
                                                        if (var20_38.AsyncBackgroundTask_22() == null) {
                                                            var29_97 = this;
                                                            var30_112 = var20_38.AsyncBackgroundTask_21();
                                                            var33_146 = var29_97;
                                                            var34_161 = false;
                                                            var31_131 = ((ConfigService)var33_146.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().af();
                                                            var35_174 = false;
                                                            if (var31_131) {
                                                                if (0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler(var30_112)) {
                                                                    v28 = LiteBansModule_50.c.LiteBansModule_194(var30_112);
                                                                    if (v28 == null) {
                                                                        v29 = null;
                                                                    } else {
                                                                        var37_191 = v28;
                                                                        v29 = new LiteBansModule_297(var37_191, var30_112, "#", new Date());
                                                                    }
                                                                } else {
                                                                    v30 = LiteBansModule_50.c.BaseCoreGenericHandler(var30_112);
                                                                    if (v30 == null) {
                                                                        v29 = null;
                                                                    } else {
                                                                        var37_192 = v30;
                                                                        var33_147 = false;
                                                                        v31 = var37_192.BaseCoreGenericHandler();
                                                                        v29 = new LiteBansModule_297(var37_192.AsyncBackgroundTask_5(), v31 != null ? v31.toString() : null, null, new Date());
                                                                    }
                                                                }
                                                            } else {
                                                                if (0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler(var30_112)) {
                                                                    new LiteBansModule_297(LiteBansModule_242.BaseCoreGenericHandler(var30_112, 16), var30_112, "#", new Date());
                                                                }
                                                                v29 = new LiteBansModule_297(LiteBansModule_242.BaseCoreGenericHandler(var30_112, 16), LiteBansModule_242.BaseCoreGenericHandler(var30_112), "#", new Date());
                                                            }
                                                            v32 = var28_79 = v29;
                                                            if (v32 == null) {
                                                                var20_38.BaseCoreGenericHandler(var13_22, (Object)MessageKey.aN.BaseCoreGenericHandler("player", (Object)var20_38.AsyncBackgroundTask_21()));
                                                                throw new CommandExitException();
                                                            }
                                                            var20_38.BaseCoreGenericHandler((LiteBansModule_297)v32);
                                                        }
                                                    }
                                                    v33 = var28_79 = var20_38.AsyncBackgroundTask_22();
                                                    if ((v33 != null ? v33.LiteBansModule_31() : null) != null) {
                                                        v34 = var20_38.AsyncBackgroundTask_22();
                                                        ObjectUtilities.BaseCoreGenericHandler(v34);
                                                        v35 = v34.LiteBansModule_31();
                                                        ObjectUtilities.BaseCoreGenericHandler((Object)v35);
                                                        if (!StringUtilities.BaseCoreGenericHandler((CharSequence)v35, '#', false, 2, null)) {
                                                            v36 = var28_79 = var20_38.AsyncBackgroundTask_22();
                                                            if (!0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler.LiteBansModule_31(v36 != null ? v36.BaseCoreGenericHandler() : null) && AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(var13_22.e(), var20_38.CommandThrottleService())) {
                                                                var13_22.AsyncBackgroundTask_5().BaseCoreGenericHandler((LiteBansModule_178)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, BaseCoreGenericHandler(litebans.NoneHandler_2 litebans.LiteBansModule_82 ), (Llitebans/LiteBansModule_82;)Llitebans/iV;)((NoneHandler_2)var20_38));
                                                            }
                                                        }
                                                    }
                                                }
                                                v37 = var28_79 = var20_38.AsyncBackgroundTask_22();
                                                v38 = v37 != null ? v37.BaseCoreGenericHandler() : null;
                                                v39 = var28_79 = var20_38.AsyncBackgroundTask_22();
                                                v40 = v39 != null ? v39.LiteBansModule_31() : null;
                                                v41 = var28_79 = var20_38.AsyncBackgroundTask_22();
                                                var25_68 /* !! */  = new LiteBansModule_113(v38, null, null, v40, v41 != null ? v41.i() : null, null, var20_38.AsyncBackgroundTask_21(), 38, null);
                                                if (var25_68 /* !! */ .LiteBansModule_31()) {
                                                    var28_79 = var20_38.AsyncBackgroundTask_22();
                                                    v42 = var28_79;
                                                    v43 = v42 != null && (v42 = (var29_98 = v42.BaseCoreGenericHandler())) != null ? StringUtilities.BaseCoreGenericHandler((CharSequence)v42, '#', false, 2, null) : false;
                                                    if (v43) {
                                                        var28_79 = var25_68 /* !! */ ;
                                                        var29_99 = false;
                                                        if (var3_5.LiteBansModule_194().aa()) {
                                                            var3_5.BaseCoreGenericHandler((Object)("Hiding IP address from broadcast: " + var28_79.c()));
                                                            var28_79.BaseCoreGenericHandler(MessageKey.SecHandler.toString());
                                                        } else {
                                                            var28_79.BaseCoreGenericHandler(var28_79.c());
                                                        }
                                                        var28_79.LiteBansModule_31(var28_79.AsyncBackgroundTask_5());
                                                        var28_79 = var25_68 /* !! */ .c();
                                                        v44 = var28_79;
                                                        if (v44 == null) {
                                                            v44 = "";
                                                        }
                                                        var20_38.LiteBansModule_31((String)v44);
                                                    }
                                                }
                                            }
                                            var28_80 = NoneHandler_2.BaseCoreGenericHandler((NoneHandler_2)var20_38, null, 1, null);
                                            var29_100 = MessageHandler.BaseCoreGenericHandler;
                                            var30_113 = var28_80 != false && v1.LiteBansModule_194() == false && var3_5.LiteBansModule_194().MessageKey() >= 1 ? 1 : 0;
                                            var31_132 = MessageKey.LiteBansModule_31;
                                            var33_148 = false;
                                            var34_162 = var29_100;
                                            var35_175 = false;
                                            if (var30_113 != 0) {
                                                var37_193 = var34_162;
                                                var38_214 = false;
                                                var37_193.BaseCoreGenericHandler(var31_132);
                                                throw new CommandExitException();
                                            }
                                            var29_100 = MessageHandler.BaseCoreGenericHandler;
                                            var30_113 = var20_38.HoverTextFormatter() != false && var3_5.LiteBansModule_194().MessageKey() >= 2 && v1.LiteBansModule_194() == false ? 1 : 0;
                                            var31_132 = MessageKey.LiteBansModule_31;
                                            var33_148 = false;
                                            var34_162 = var29_100;
                                            var35_175 = false;
                                            if (var30_113 != 0) {
                                                var37_194 = var34_162;
                                                var38_215 = false;
                                                var37_194.BaseCoreGenericHandler(var31_132);
                                                throw new CommandExitException();
                                            }
                                            var29_100 = var20_38.CommandThrottleService();
                                            v45 = var29_100;
                                            if (v45 == null && (v45 = var23_52) == null) {
                                                v45 = var13_22.AsyncBackgroundTask_5().ServerSyncService();
                                            }
                                            var20_38.e((String)v45);
                                            var20_38.c(LiteBansModule_242.BaseCoreGenericHandler(var20_38.H(), 128));
                                            var20_38.BaseCoreGenericHandler(LiteBansModule_242.BaseCoreGenericHandler(var20_38.AsyncBackgroundTask_5(), 36));
                                            var29_100 = this;
                                            var30_113 = var20_38.Utf8Handler_2();
                                            var31_132 = var20_38.H();
                                            var33_149 = var20_38.AsyncBackgroundTask_5();
                                            var34_163 = false;
                                            var35_176 = (MessageHandler)var29_100;
                                            var37_195 = false;
                                            ((DatabaseMonitorService)var35_176.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(new ConsoleHandler((boolean)var30_113, (String)var31_132, (BanHandler_3)var29_100, (String)var33_149, v1));
                                            var20_38.BaseCoreGenericHandler(InitHandler.BaseCoreGenericHandler);
                                            if (var20_38.PunishmentService() && var25_68 /* !! */ .BaseCoreGenericHandler() != null) {
                                                var29_100 = var20_38.g().LiteBansModule_31();
                                                if (var20_38.i() == null) {
                                                    var20_38.BaseCoreGenericHandler(var13_22.BaseCoreGenericHandler(var20_38.g(), var25_68 /* !! */ .BaseCoreGenericHandler(), var25_68 /* !! */ .c()));
                                                    var20_38.BaseCoreGenericHandler(var20_38.g().BaseCoreGenericHandler(var20_38.D()));
                                                } else {
                                                    v46 = var20_38.i();
                                                    ObjectUtilities.BaseCoreGenericHandler(v46);
                                                    var30_114 = v46;
                                                    var29_100 = var30_114.LiteBansModule_194();
                                                    var31_132 = var13_22.BaseCoreGenericHandler(var25_68 /* !! */ .BaseCoreGenericHandler(), var25_68 /* !! */ .c(), var30_114, var20_38.g());
                                                    var20_38.BaseCoreGenericHandler((int)Math.floor(((Number)var31_132.e()).doubleValue()));
                                                    var20_38.BaseCoreGenericHandler(var30_114.BaseCoreGenericHandler(var20_38.D()));
                                                    var47_411 = ((Number)var31_132.LiteBansModule_31()).doubleValue();
                                                    if (var47_411 <= 0.0 || var20_38.D() != (int)Math.floor(var47_411)) {
                                                        var20_38.BaseCoreGenericHandler(true);
                                                    }
                                                    var35_176 = LiteBansModule_287.BaseCoreGenericHandler(var47_411);
                                                    var37_196 = LiteBansModule_287.BaseCoreGenericHandler(((Number)var31_132.e()).doubleValue());
                                                    var38_216 = Math.min(var30_114.LiteBansModule_194().size(), var20_38.D() + 1);
                                                    var3_5.BaseCoreGenericHandler((Object)("Applying " + var30_114.c() + " template group " + var30_114.BaseCoreGenericHandler() + ": weight " + (String)var35_176 + " => " + var37_196 + " (" + var38_216 + '/' + var29_100.size() + ')'));
                                                }
                                                var30_113 = Math.min(var29_100.size(), var20_38.D() + 1);
                                                var3_5.BaseCoreGenericHandler((Object)("Applying " + var20_38.g().AsyncBackgroundTask_5() + " template \"" + var20_38.g().g() + "\" LiteBansModule_21 level " + var30_113 + '/' + var29_100.size()));
                                                var33_149 = var20_38.L();
                                                ObjectUtilities.LiteBansModule_31(var33_149, "");
                                                var31_132 = (LiteBansModule_105)var33_149;
                                                var34_164 = var20_38.g().LiteBansModule_240();
                                                ObjectUtilities.LiteBansModule_31(var34_164, "");
                                                var33_149 = (LiteBansModule_105)var34_164;
                                                var35_176 = var31_132.BaseCoreGenericHandler();
                                                v47 = var35_176;
                                                if (v47 == null) {
                                                    v47 = var33_149.BaseCoreGenericHandler();
                                                }
                                                if ((var34_164 = v47) != null) {
                                                    if (var34_164.longValue() > 0L) {
                                                        var20_38.LiteBansModule_31(var20_38.J() + var34_164.longValue());
                                                        var20_38.LiteBansModule_401(true);
                                                        var49_412 = var34_164.longValue();
                                                        var38_217 = false;
                                                        var20_38.BaseCoreGenericHandler((CharSequence)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, var49_412, false, 2, null));
                                                    } else {
                                                        var20_38.LiteBansModule_31(-1L);
                                                        var20_38.LiteBansModule_401(false);
                                                        var20_38.BaseCoreGenericHandler(MessageKey.LiteBansModule_60);
                                                    }
                                                }
                                                if (var20_38.g().GnuSparseMapHandler()) {
                                                    var20_38.m(true);
                                                }
                                                CommandArgumentUtils.BaseCoreGenericHandler(this, var20_38.g(), var20_38.L());
                                                var20_38.BaseCoreGenericHandler(var13_22);
                                            }
                                            var29_100 = MessageHandler.BaseCoreGenericHandler;
                                            var30_113 = var20_38.LiteBansModule_401() != false && var20_38.BanHandler_5() == false && var20_38.DatabaseMonitorService() <= 0L ? 1 : 0;
                                            var31_132 = MessageKey.aL;
                                            var33_150 = false;
                                            var34_165 = var29_100;
                                            var35_177 = false;
                                            if (var30_113 != 0) {
                                                var37_197 = var34_165;
                                                var38_218 = false;
                                                var37_197.BaseCoreGenericHandler(var31_132);
                                                throw new CommandExitException();
                                            }
                                            var29_100 = var20_38.c(var13_22);
                                            v48 = var25_68 /* !! */ .AsyncBackgroundTask_5();
                                            ObjectUtilities.BaseCoreGenericHandler((Object)v48);
                                            v49 = var25_68 /* !! */ .BaseCoreGenericHandler();
                                            ObjectUtilities.BaseCoreGenericHandler((Object)v49);
                                            var20_38.BaseCoreGenericHandler(var13_22, v48, v49);
                                            if (!var20_38.BanHandler_5()) break block283;
                                            var30_115 = new LiteBansModule_278();
                                            var31_132 = null;
                                            var33_151 = var20_38.GnuSparseMapHandler();
                                            v50 = var33_151;
                                            if (v50 == null) {
                                                v50 = var13_22.BaseCoreGenericHandler(var25_68 /* !! */ .BaseCoreGenericHandler(), var25_68 /* !! */ .c(), var20_38.ServerSyncService(), var20_38.LiteBansModule_31(), true, true);
                                            }
                                            var20_38.LiteBansModule_31(v50);
                                            v51 = var34_165 = var20_38.q();
                                            var33_152 = ObjectUtilities.BaseCoreGenericHandler((Object)(v51 != null ? v51.e() : null), (Object)v1.BaseCoreGenericHandler());
                                            v52 = var34_165 = var33_152 != false ? ".own" : "";
                                            if (var20_38.q() != null && !var33_152 && var3_5.LiteBansModule_194().ac()) {
                                                var35_178 = MessageHandler.BaseCoreGenericHandler;
                                                v53 = var37_198 = var20_38.q();
                                                var37_199 = var20_38.BaseCoreGenericHandler(var13_22, v53 != null ? v53.e() : null) == false;
                                                var38_219 = MessageKey.cZ;
                                                var39_240 = false;
                                                var40_259 = var35_178;
                                                var41_285 = false;
                                                if (var37_199) {
                                                    var42_309 = var40_259;
                                                    var43_336 = false;
                                                    var42_309.BaseCoreGenericHandler(var38_219);
                                                    throw new CommandExitException();
                                                }
                                            }
                                            var35_179 = var20_38.q();
                                            var37_200 = 0;
                                            v54 = var35_179;
                                            if (!((v54 != null ? v54.DatabaseMonitorService() : null) != null)) break block284;
                                            var35_179 = var20_38.q();
                                            var37_200 = 0;
                                            if (!(var35_179 != null && var35_179.r() != -1)) break block284;
                                            v55 = var3_5.AsyncBackgroundTask_21();
                                            v56 = var20_38.q();
                                            ObjectUtilities.BaseCoreGenericHandler(v56);
                                            var35_179 = v55.BaseCoreGenericHandler(v56);
                                            if (var35_179 == null) break block284;
                                            var38_220 = var20_38.q();
                                            v57 = var38_220;
                                            var38_220 = var20_38.q();
                                            v58 = var38_220;
                                            var37_200 = var13_22.BaseCoreGenericHandler((LiteBansModule_65)var35_179, v57 != null ? v57.DatabaseMonitorService() : null, v58 != null ? v58.PunishmentTableService() : null);
                                            var38_220 = var35_179.BaseCoreGenericHandler(var37_200);
                                            var40_260 = var38_220.c();
                                            v59 = var40_260;
                                            if (v59 == null) {
                                                v59 = var35_179.LiteBansModule_240().c();
                                            }
                                            var39_241 = v59;
                                            var40_260 = MessageHandler.BaseCoreGenericHandler;
                                            if (var39_241 == null) ** GOTO lbl-1000
                                            var41_286 = v1;
                                            var42_310 = false;
                                            var43_337 = var41_286;
                                            var44_357 = false;
                                            if (var43_337.e(var39_241) == false) {
                                                v60 = true;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                v60 = false;
                                            }
                                            var41_287 = v60;
                                            var42_311 = MessageKey.cZ;
                                            var43_338 = false;
                                            var44_359 = var40_260;
                                            var45_378 = false;
                                            if (var41_287) {
                                                var46_396 = var44_359;
                                                var51_413 = false;
                                                var46_396.BaseCoreGenericHandler(var42_311);
                                                throw new CommandExitException();
                                            }
                                        }
                                        var35_179 = var3_5;
                                        var37_200 = 0;
                                        if (var35_179.g()) {
                                            var32_136 = var35_179;
                                            var38_221 = false;
                                            v61 = var20_38.q();
                                            var36_182 /* !! */  = "[0xff] " + (v61 != null ? v61.e() : null) + ' ' + v1.BaseCoreGenericHandler() + " (LiteBansModule_433=" + var33_152 + ')';
                                            var32_136.BaseCoreGenericHandler((Object)var36_182 /* !! */ );
                                        }
                                        if (var20_38.F()) {
                                            var37_201 = var20_38.q();
                                            v62 = var37_201;
                                            if (v62 == null) {
                                                var20_38.BaseCoreGenericHandler(var13_22, (Object)MessageKey.SQLiteDriverHandler_2);
                                                throw new CommandExitException();
                                            }
                                            var35_179 = v62;
                                            var37_201 = this;
                                            var38_222 = "litebans.modify" + (String)var34_165;
                                            var39_242 = false;
                                            var40_261 = var37_201.AsyncBackgroundTask_5();
                                            var41_288 = false;
                                            var42_312 = MessageHandler.BaseCoreGenericHandler;
                                            var43_339 = var40_261;
                                            var44_360 = false;
                                            var45_379 = var43_339;
                                            var46_397 = false;
                                            var43_340 = var45_379.e((String)var38_222) == false;
                                            var44_361 = MessageKey.cZ;
                                            var45_380 = false;
                                            var46_398 = var42_312;
                                            var51_414 = false;
                                            if (var43_340) {
                                                var52_424 = var46_398;
                                                var53_433 = false;
                                                var52_424.BaseCoreGenericHandler(var44_361);
                                                throw new CommandExitException();
                                            }
                                            var38_222 = var20_38.ServerSyncService();
                                            var39_242 = false;
                                            switch (LiteBansModule_274.BaseCoreGenericHandler[var38_222.c().ordinal()]) {
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
                                            var37_201 = ObjectUtilities.BaseCoreGenericHandler(var29_100, v63) != false ? var35_179.LiteBansModule_31() : var29_100;
                                            var54_440 = var20_38.DatabaseMonitorService() == -1L ? var35_179.LiteBansModule_401() : var20_38.DatabaseMonitorService();
                                            var20_38.LiteBansModule_31(var13_22);
                                            var13_22.BaseCoreGenericHandler((CharSequence)var37_201, var54_440, (SilentHandler)var35_179);
                                            var40_261 = new LiteBansModule_144();
                                            var41_289 = var35_179;
                                            var42_313 = false;
                                            var40_261.BaseCoreGenericHandler = new SilentHandler(var41_289.ServerSyncService(), var41_289.DatabaseMonitorService(), var41_289.PunishmentTableService(), (CharSequence)var37_201, var41_289.e(), var41_289.LiteBansModule_433(), var41_289.m(), var41_289.GnuSparseMapHandler(), var41_289.BroadcastService(), var54_440, var41_289.r(), var41_289.AsyncBackgroundTask_5(), var41_289.LiteBansModule_240(), var41_289.AsyncBackgroundTask_22(), var41_289.BaseCoreGenericHandler(), null);
                                            var20_38.BaseCoreGenericHandler(var13_22, AllHandler_3.BaseCoreGenericHandler(var13_22, (CharSequence)MessageKey.cj, (SilentHandler)var40_261.BaseCoreGenericHandler, false, 2, null));
                                        } else if (var20_38.BanHandler_2()) {
                                            var37_202 = var20_38.q();
                                            v64 = var37_202;
                                            if (v64 == null) {
                                                var20_38.BaseCoreGenericHandler(var13_22, (Object)MessageKey.SQLiteDriverHandler_2);
                                                throw new CommandExitException();
                                            }
                                            var35_179 = v64;
                                            var37_202 = this;
                                            var38_223 = "litebans.delete" + (String)var34_165;
                                            var39_243 = false;
                                            var40_262 = var37_202.AsyncBackgroundTask_5();
                                            var41_290 = false;
                                            var42_314 = MessageHandler.BaseCoreGenericHandler;
                                            var43_341 = var40_262;
                                            var44_362 = false;
                                            var45_381 = var43_341;
                                            var46_399 = false;
                                            var43_342 = var45_381.e(var38_223) == false;
                                            var44_363 = MessageKey.cZ;
                                            var45_382 = false;
                                            var46_400 = var42_314;
                                            var51_415 = false;
                                            if (var43_342) {
                                                var52_425 = var46_400;
                                                var53_434 = false;
                                                var52_425.BaseCoreGenericHandler(var44_363);
                                                throw new CommandExitException();
                                            }
                                            var20_38.LiteBansModule_31(var13_22);
                                            AllHandler_3.BaseCoreGenericHandler(var13_22, (SilentHandler)var35_179, null, null, null, true, 14, null);
                                            var20_38.BaseCoreGenericHandler(var13_22, MessageKey.af);
                                        } else {
                                            var35_179 = this;
                                            var37_203 = "litebans + " + var20_38.ServerSyncService() + (String)var34_165;
                                            var38_224 = false;
                                            var39_244 = var35_179.AsyncBackgroundTask_5();
                                            var40_263 = false;
                                            var41_291 = MessageHandler.BaseCoreGenericHandler;
                                            var42_315 = var39_244;
                                            var43_343 = false;
                                            var44_364 = var42_315;
                                            var45_378 = false;
                                            var42_316 = var44_364.e((String)var37_203) == false;
                                            var43_344 = MessageKey.cZ;
                                            var44_365 = false;
                                            var45_383 = var41_291;
                                            var46_401 = false;
                                            if (var42_316) {
                                                var51_416 = var45_383;
                                                var52_426 = false;
                                                var51_416.BaseCoreGenericHandler(var43_344);
                                                throw new CommandExitException();
                                            }
                                            if (var20_38.GnuSparseMapHandler() == null && var16_26.K() && var20_38.ServerSyncService() != BanHandler.e && ((Collection)(var35_179 = var13_22.BaseCoreGenericHandler(var25_68 /* !! */ .g(), 1024))).isEmpty() == false) {
                                                var37_203 = new HashSet<PunishmentService>();
                                                var38_225 = var35_179.iterator();
                                                while (var38_225.hasNext()) {
                                                    var39_244 = (LiteBansModule_297)var38_225.next();
                                                    var40_264 = var39_244.c();
                                                    var42_317 = AllHandler_3.BaseCoreGenericHandler(var13_22, var40_264, (String)(var41_291 = var39_244.AsyncBackgroundTask_5()), var20_38.ServerSyncService(), var20_38.LiteBansModule_31(), false, true, 16, null);
                                                    if (var42_317 == null || CollectionUtilities.BaseCoreGenericHandler((Iterable)var37_203, (Object)var40_264) || var42_317.LiteBansModule_240()) continue;
                                                    var43_344 = var3_5;
                                                    var44_365 = false;
                                                    if (var43_344.g()) {
                                                        var32_136 = var43_344;
                                                        var45_384 = false;
                                                        var36_182 /* !! */  = var42_317;
                                                        var32_136.BaseCoreGenericHandler((Object)var36_182 /* !! */ );
                                                    }
                                                    var31_132 = var42_317;
                                                    var30_115.BaseCoreGenericHandler = true;
                                                    AllHandler_3.BaseCoreGenericHandler(var13_22, var20_38.AsyncBackgroundTask_5(), var20_38.H(), (CharSequence)var29_100, var42_317, false, 16, null);
                                                    CommandArgumentUtils.BaseCoreGenericHandler(var13_22, var42_317, true, var24_61);
                                                    v65 = var40_264;
                                                    ObjectUtilities.BaseCoreGenericHandler((Object)v65);
                                                    var37_203.add(v65);
                                                }
                                            }
                                            var37_203 = var35_179 = var20_38;
                                            var38_226 = false;
                                            if (var37_203.q() == null) {
                                                if (!var30_115.BaseCoreGenericHandler) {
                                                    var39_244 = var3_5;
                                                    var40_265 = 1;
                                                    var41_292 = false;
                                                    if (var39_244.BaseCoreGenericHandler(var40_265)) {
                                                        var42_318 = var39_244;
                                                        var43_345 = false;
                                                        var44_366 = "No active " + var37_203.ServerSyncService().c() + " found for uuid:" + var25_68 /* !! */ .BaseCoreGenericHandler() + " / ip:" + var25_68 /* !! */ .c() + " on server:" + var37_203.LiteBansModule_31() + " (target: '" + var25_68 /* !! */ .AsyncBackgroundTask_5() + "')";
                                                        var45_385 = ObjectUtilities.BaseCoreGenericHandler((Object)var37_203.AsyncBackgroundTask_21(), (Object)var25_68 /* !! */ .BaseCoreGenericHandler()) == false;
                                                        var46_401 = false;
                                                        if (var45_385) {
                                                            var51_417 = false;
                                                            var52_427 = "Try targeting LiteBansModule_61 UUID instead of name + ";
                                                            var53_435 = false;
                                                            if (var52_427.length() > 0 != false) {
                                                                var53_436 = var44_366;
                                                                var56_441 = "\n";
                                                                var57_448 = false;
                                                                var53_436 = "" + var53_436 + var56_441;
                                                                var56_442 = false;
                                                                v66 = "" + var53_436 + var52_427;
                                                            } else {
                                                                v66 = var44_366;
                                                            }
                                                        } else {
                                                            v66 = var44_366;
                                                        }
                                                        var42_318.BaseCoreGenericHandler(v66);
                                                    }
                                                    var40_266 = var37_203.ServerSyncService();
                                                    var41_292 = false;
                                                    switch (LiteBansModule_274.BaseCoreGenericHandler[var40_266.c().ordinal()]) {
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
                                                    var39_244 = v67;
                                                    if (var37_203.ServerSyncService() == BanHandler.AsyncBackgroundTask_5 && !var25_68 /* !! */ .LiteBansModule_31() && var24_61 && !0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler(var25_68 /* !! */ .g())) {
                                                        var40_266 = v1;
                                                        var41_293 = "litebans.unban.queue";
                                                        var43_346 = false;
                                                        if (var40_266.e(var41_293) && !var37_203.K()) {
                                                            this.plugin((LiteBansModule_113)var25_68 /* !! */ );
                                                            var39_244 = MessageKey.LiteBansModule_14;
                                                        }
                                                    }
                                                    var37_203.BaseCoreGenericHandler(var13_22, var39_244);
                                                    throw new CommandExitException();
                                                }
                                            } else {
                                                var39_244 = var3_5;
                                                var40_267 = false;
                                                if (var39_244.g()) {
                                                    var42_319 = var39_244;
                                                    var41_294 = false;
                                                    var42_319.BaseCoreGenericHandler(var37_203.q());
                                                }
                                                if (var37_203.ServerSyncService() == BanHandler.e && var37_203.GnuSparseMapHandler() == null) {
                                                    v68 = var37_203.q();
                                                    ObjectUtilities.BaseCoreGenericHandler(v68);
                                                    AllHandler_3.BaseCoreGenericHandler(var13_22, v68, var37_203.AsyncBackgroundTask_5(), var37_203.H(), (CharSequence)var29_100, false, 16, null);
                                                } else {
                                                    v69 = var37_203.AsyncBackgroundTask_5();
                                                    v70 = var37_203.H();
                                                    v71 = var37_203.q();
                                                    ObjectUtilities.BaseCoreGenericHandler(v71);
                                                    var13_22.BaseCoreGenericHandler(v69, v70, (CharSequence)var29_100, v71, var37_203.GnuSparseMapHandler() != null);
                                                }
                                                if (var37_203.ServerSyncService() == BanHandler.e) {
                                                    var37_203.BaseCoreGenericHandler(var13_22, var13_22.BaseCoreGenericHandler((CharSequence)MessageKey.LiteBansModule_69, (CommandSenderWrapper)var22_45));
                                                }
                                                var39_244 = var13_22;
                                                var40_268 = BroadcastHandler.LiteBansModule_401.BaseCoreGenericHandler(var37_203.ServerSyncService());
                                                var41_295 = false;
                                                if (var39_244.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
                                                    var58_456 = var40_268;
                                                    var42_320 = var39_244;
                                                    var43_347 = false;
                                                    var44_367 = ServerSyncService.GnuSparseMapHandler;
                                                    v72 = var37_203.q();
                                                    ObjectUtilities.BaseCoreGenericHandler(v72);
                                                    var45_386 = v72;
                                                    var46_401 = false;
                                                    var51_418 = var25_68 /* !! */ ;
                                                    var52_428 = false;
                                                    var53_437 = ServerSyncService.GnuSparseMapHandler;
                                                    var56_443 = new CharSequence[2];
                                                    v73 = var51_418.BaseCoreGenericHandler();
                                                    if (v73 == null) {
                                                        v73 = "";
                                                    }
                                                    var56_443[0] = LiteBansModule_50.c.AsyncBackgroundTask_5(v73);
                                                    var56_443[1] = var45_386.LiteBansModule_240() != false ? String.valueOf(var51_418.c()) : "";
                                                    var57_449 = false;
                                                    var59_459 = ArrayUtilities.BaseCoreGenericHandler(var56_443, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                                    CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)var42_320, var58_456, var59_459, null, null, 12, null);
                                                }
                                                v74 = var13_22.e();
                                                v75 = var37_203.q();
                                                ObjectUtilities.BaseCoreGenericHandler(v75);
                                                LiteBansModule_268.BaseCoreGenericHandler.LiteBansModule_31(var13_22, v74, v75);
                                            }
                                            if (var20_38.q() == null) {
                                                var20_38.LiteBansModule_31((SilentHandler)var31_132);
                                            }
                                            if (var20_38.q() != null) {
                                                var37_203 = var20_38.ServerSyncService();
                                                var38_226 = false;
                                                switch (LiteBansModule_274.BaseCoreGenericHandler[var37_203.c().ordinal()]) {
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
                                                var35_179 = v76;
                                                var35_179 = AllHandler_3.BaseCoreGenericHandler(var13_22, (CharSequence)var35_179, var20_38.H(), var20_38.AsyncBackgroundTask_5(), false, 4, null);
                                                var35_179 = var13_22.BaseCoreGenericHandler((CharSequence)var35_179, (LiteBansModule_113)var25_68 /* !! */ );
                                                new BannedHandler((NoneHandler_2)var20_38, (CommandSenderWrapper)var22_45, var20_38.AsyncBackgroundTask_22(), (CharSequence)var35_179, var13_22.e(), null, false, var20_38.B(), 32, null).run();
                                                if (var20_38.ServerSyncService() == BanHandler.n) {
                                                    if (var24_61) {
                                                        var37_203 = this;
                                                        var38_226 = false;
                                                        ((PunishmentTableService)var37_203.LiteBansModule_240().BaseCoreGenericHandler(PunishmentTableService.class)).BaseCoreGenericHandler(var20_38.q());
                                                    }
                                                    var37_203 = var13_22;
                                                    var38_227 = BroadcastHandler.AsyncBackgroundTask_21;
                                                    var39_245 = false;
                                                    if (var37_203.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
                                                        var36_182 /* !! */  = var38_227;
                                                        var32_136 = var37_203;
                                                        var40_269 = false;
                                                        var41_296 = ServerSyncService.GnuSparseMapHandler;
                                                        v77 = var20_38.q();
                                                        ObjectUtilities.BaseCoreGenericHandler(v77);
                                                        var42_321 = v77;
                                                        var43_348 = false;
                                                        var44_368 = var25_68 /* !! */ ;
                                                        var45_387 = false;
                                                        var46_402 = ServerSyncService.GnuSparseMapHandler;
                                                        var51_418 = new CharSequence[2];
                                                        v78 = var44_368.BaseCoreGenericHandler();
                                                        if (v78 == null) {
                                                            v78 = "";
                                                        }
                                                        var51_418[0] = LiteBansModule_50.c.AsyncBackgroundTask_5(v78);
                                                        var51_418[1] = var42_321.LiteBansModule_240() != false ? String.valueOf(var44_368.c()) : "";
                                                        var52_428 = false;
                                                        var60_462 = ArrayUtilities.BaseCoreGenericHandler(var51_418, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                                        CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)var32_136, (BroadcastHandler)var36_182 /* !! */ , var60_462, null, null, 12, null);
                                                    }
                                                }
                                                var37_203 = this;
                                                var38_228 = false;
                                                v79 = ((BroadcastService)var37_203.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(var20_38.q());
                                            } else {
                                                ConfigService.BaseCoreGenericHandler(var3_5, null, 0, 2, null);
                                                v79 = KotlinUnitHandler.BaseCoreGenericHandler;
                                            }
                                        }
                                        break block268;
                                    }
                                    if (var20_38.ServerSyncService() == BanHandler.c) {
                                        var30_116 = var20_38.g();
                                        var31_133 = false;
                                        var33_153 = var30_116;
                                        var34_166 = false;
                                        if (ObjectUtilities.BaseCoreGenericHandler(var33_153.LiteBansModule_194() & 255, -1 & 255) < 0 == false) {
                                            var30_116 = SecHandler.AsyncBackgroundTask_5;
                                            var61_465 = var20_38.J();
                                            var34_167 = var16_26.ar();
                                            var35_177 = false;
                                            var63_466 = PermanentHandler.BaseCoreGenericHandler((PermanentHandler)var30_116, var34_167, 0.0, 2, null);
                                            var20_38.LiteBansModule_31((long)(var63_466 < 1.0 ? -1.0 : (double)var61_465 + var63_466));
                                        }
                                    }
                                    var20_38.LiteBansModule_31(var13_22);
                                    var20_38.LiteBansModule_31(Math.max(var20_38.DatabaseMonitorService(), 0L));
                                    var30_117 = new SilentHandler(var19_34, (LiteBansModule_113)var25_68 /* !! */ , (CharSequence)var29_100);
                                    var19_34.LiteBansModule_31(var30_117);
                                    var20_38.BaseCoreGenericHandler(InitHandler.i);
                                    var20_38.BaseCoreGenericHandler(var13_22, v1, var30_117, var20_38.AsyncBackgroundTask_22());
                                    var31_134 = this;
                                    var33_154 = var13_22;
                                    var34_168 /* !! */  = var25_68 /* !! */ .LiteBansModule_194();
                                    var35_177 = var20_38.LiteBansModule_433();
                                    var37_204 = var20_38.AsyncBackgroundTask_22();
                                    var38_229 = false;
                                    var39_246 = var30_117;
                                    var40_270 = false;
                                    switch (LiteBansModule_38.BaseCoreGenericHandler[var39_246.ServerSyncService().ordinal()]) {
                                        case 1: 
                                        case 2: {
                                            var41_297 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)var33_154, var39_246.DatabaseMonitorService(), var39_246.PunishmentTableService(), var39_246.ServerSyncService(), var39_246.m(), false, false, 48, null);
                                            if (var41_297 == null || LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(var41_297.m()) && !LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(var39_246.m()) || var41_297.LiteBansModule_240() && !var39_246.LiteBansModule_240() || var41_297.LiteBansModule_240() && var39_246.LiteBansModule_240() && (!ObjectUtilities.BaseCoreGenericHandler((Object)var39_246.DatabaseMonitorService(), (Object)var41_297.DatabaseMonitorService()) || !ObjectUtilities.BaseCoreGenericHandler((Object)var39_246.PunishmentTableService(), (Object)var41_297.PunishmentTableService()))) ** GOTO lbl1262
                                            var42_322 = var31_134.AsyncBackgroundTask_5();
                                            var43_349 = "litebans.override";
                                            var44_357 = false;
                                            var45_388 = var42_322;
                                            var46_403 = false;
                                            if (var45_388.e((String)var43_349) == false) {
                                                var42_322 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)var33_154, AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)var33_154, (CharSequence)(var39_246.ServerSyncService() == BanHandler.LiteBansModule_240 ? MessageKey.LiteBansModule_34 : MessageKey.SQLiteDriverHandler), var41_297, false, 2, null), var37_204, false, 2, null);
                                                MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(var42_322);
                                                throw new CommandExitException();
                                            }
                                            if (!var35_177) ** GOTO lbl1249
                                            var43_349 = (MessageHandler)var31_134;
                                            var44_357 = false;
                                            var45_388 = var43_349;
                                            var46_403 = false;
                                            if (!((ConfigService)var45_388.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().ax()) ** GOTO lbl-1000
                                            var43_349 = var41_297;
                                            var44_357 = false;
                                            if (var43_349.HoverTextFormatter() == false && (var39_246.HoverTextFormatter() || var39_246.n() > var41_297.n())) {
                                                v80 = true;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                v80 = false;
                                            }
                                            var42_323 = v80;
                                            var43_349 = MessageHandler.BaseCoreGenericHandler;
                                            var44_369 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)var33_154, (CharSequence)(var39_246.ServerSyncService() == BanHandler.LiteBansModule_240 ? MessageKey.ai : MessageKey.LiteBansModule_5), var37_204, false, 2, null);
                                            var45_389 = false;
                                            var46_404 = var43_349;
                                            var51_419 = var42_323 == false;
                                            var52_429 = false;
                                            if (var51_419) {
                                                var53_438 = var46_404;
                                                var56_444 = false;
                                                var53_438.BaseCoreGenericHandler(var44_369);
                                                throw new CommandExitException();
                                            }
lbl1249:
                                            // 3 sources

                                            AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)var33_154, var19_34.AsyncBackgroundTask_5(), var19_34.H(), var39_246.LiteBansModule_31(), var41_297, false, 16, null);
                                            v81 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)var33_154, (CharSequence)(var39_246.ServerSyncService() == BanHandler.LiteBansModule_240 ? MessageKey.dB : MessageKey.ServerSyncService), var41_297, false, 2, null);
                                            var43_349 = new CharSequence[4];
                                            var43_349[0] = "bannedPlayer";
                                            ObjectUtilities.BaseCoreGenericHandler(var34_168 /* !! */ );
                                            var43_349[2] = "mutedPlayer";
                                            var43_349[3] = var34_168 /* !! */ ;
                                            var42_324 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)var33_154, (CharSequence)LiteBansModule_242.BaseCoreGenericHandler(v81, var43_349), var37_204, false, 2, null);
                                            if (StringUtilities.c(var42_324, '#', false, 2, null)) {
                                                var42_324 = LiteBansModule_433.LiteBansModule_31.BaseCoreGenericHandler(var42_324, "#offline#", (Object)var39_246.PunishmentTableService());
                                            }
                                            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, var31_134.AsyncBackgroundTask_5(), var42_324, null, 4, null);
                                            CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)var33_154, var41_297, true, var24_61);
lbl1262:
                                            // 2 sources

                                            v82 = KotlinUnitHandler.BaseCoreGenericHandler;
                                            break;
                                        }
                                        default: {
                                            v82 = KotlinUnitHandler.BaseCoreGenericHandler;
                                        }
                                    }
                                    if (var20_38.ServerSyncService() == BanHandler.c && var22_45 != null && var24_61) {
                                        var30_117.BaseCoreGenericHandler(true);
                                    }
                                    CommandArgumentUtils.BaseCoreGenericHandler(var13_22, var30_117, false, false, 6, null);
                                    var20_38.BaseCoreGenericHandler(var13_22, (CommandSenderWrapper)var22_45, (LiteBansModule_113)var25_68 /* !! */ , var24_61);
                                    this.plugin((NoneHandler_2)var20_38, (LiteBansModule_113)var25_68 /* !! */ );
                                    var20_38.BaseCoreGenericHandler(InitHandler.c);
                                    try {
                                        var31_134 = this;
                                        var33_154 = var13_22;
                                        var34_169 = false;
                                        var35_180 = var20_38;
                                        var37_205 = false;
                                        var31_134.BaseCoreGenericHandler((LiteBansModule_82)var33_154, var30_117, (NoneHandler_2)var35_180);
                                        if (!var35_180.PunishmentTableService()) {
                                            var38_230 = var35_180.ServerSyncService();
                                            var39_247 = false;
                                            switch (LiteBansModule_274.BaseCoreGenericHandler[var38_230.c().ordinal()]) {
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
                                            }
                                            var35_180.BaseCoreGenericHandler((LiteBansModule_82)var33_154, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(v83, (CharSequence)"tempDuration", var35_180.LiteBansModule_240()));
                                            switch (LiteBansModule_38.BaseCoreGenericHandler[var30_117.ServerSyncService().ordinal()]) {
                                                case 1: {
                                                    CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)var33_154, var30_117, var35_180.D());
                                                    v84 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                    break;
                                                }
                                                case 2: {
                                                    var40_271 = var31_134;
                                                    var41_298 = var33_154;
                                                    var42_325 = false;
                                                    var43_350 = var41_298.e().q();
                                                    ObjectUtilities.BaseCoreGenericHandler(var43_350);
                                                    if (!(var43_350.length == 0)) {
                                                        var44_370 = var43_350;
                                                        var45_390 = false;
                                                        var46_406 = var44_370;
                                                        var51_420 /* !! */  = new ArrayList<PunishmentService>();
                                                        var52_429 = false;
                                                        var56_445 = ((CommandSenderWrapper[])var46_406).length;
                                                        for (var53_439 = 0; var53_439 < var56_445; ++var53_439) {
                                                            var58_457 = var57_450 = var46_406[var53_439];
                                                            var59_460 = false;
                                                            ObjectUtilities.BaseCoreGenericHandler(var58_457);
                                                            if (!var41_298.BaseCoreGenericHandler(var30_117, var58_457)) continue;
                                                            var51_420 /* !! */ .add(var57_450);
                                                        }
                                                        var44_370 = (List)var51_420 /* !! */ ;
                                                        var45_390 = false;
                                                        var46_406 = var44_370.iterator();
                                                        while (var46_406.hasNext()) {
                                                            var51_420 /* !! */  = var46_406.next();
                                                            var52_430 = (CommandSenderWrapper)var51_420 /* !! */ ;
                                                            var53_439 = 0;
                                                            var56_446 = (MessageHandler)var40_271;
                                                            var57_452 = false;
                                                            ((PunishmentTableService)var56_446.LiteBansModule_240().BaseCoreGenericHandler(PunishmentTableService.class)).BaseCoreGenericHandler(var52_430.BaseCoreGenericHandler(), var30_117);
                                                        }
                                                    }
                                                    v84 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                    break;
                                                }
                                                case 3: {
                                                    var40_272 = var31_134;
                                                    var41_299 = var33_154;
                                                    var42_326 = false;
                                                    var43_351 = var30_117;
                                                    var44_371 = false;
                                                    var45_391 = (MessageHandler)var40_272;
                                                    var46_407 = false;
                                                    var51_422 = var45_391;
                                                    var52_429 = false;
                                                    if (!(((ConfigService)var51_422.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().A().length == 0)) {
                                                        var45_391 = (CommandThrottleService)var41_299.e().BaseCoreGenericHandler(CommandThrottleService.class);
                                                        if (var43_351.DatabaseMonitorService() == null) {
                                                            var46_408 = (MessageHandler)var40_272;
                                                            var51_423 = false;
                                                            ConfigService.BaseCoreGenericHandler((ConfigService)var46_408.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class), (Object)"null", 0, 2, null);
                                                        } else {
                                                            var46_409 = var41_299.BaseCoreGenericHandler(var43_351, 512);
                                                            var51_422 = var41_299.c(var43_351.DatabaseMonitorService());
                                                            if (var51_422 == null) {
                                                                var52_431 = (MessageHandler)var40_272;
                                                                var53_439 = 0;
                                                                ConfigService.BaseCoreGenericHandler((ConfigService)var52_431.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class), (Object)"null", 0, 2, null);
                                                            } else {
                                                                var52_432 = var51_422.BaseCoreGenericHandler();
                                                                var53_439 = var46_409.size();
                                                                var56_447 = (MessageHandler)var40_272;
                                                                var57_453 = 0;
                                                                var56_447 = (ConfigService)var56_447.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                                                                var57_453 = 10;
                                                                var58_458 = 0;
                                                                if (var56_447.BaseCoreGenericHandler(var57_453)) {
                                                                    var59_461 = var56_447;
                                                                    var65_467 = false;
                                                                    var59_461.BaseCoreGenericHandler((Object)("Active warnings: " + var53_439));
                                                                }
                                                                var57_454 = (MessageHandler)var40_272;
                                                                var58_458 = 0;
                                                                var65_468 = var57_454;
                                                                var66_469 = false;
                                                                for (Object var65_468 : ((ConfigService)var65_468.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().A()) {
                                                                    if (StringUtilities.LiteBansModule_31((CharSequence)var65_468)) continue;
                                                                    var67_472 /* !! */  = new char[]{':'};
                                                                    var67_472 /* !! */  = (char[])StringUtilities.BaseCoreGenericHandler((CharSequence)var65_468, var67_472 /* !! */ , false, 2, 2, null);
                                                                    var68_473 = 0;
                                                                    var69_474 = var67_472 /* !! */ ;
                                                                    var66_470 = var69_474.toArray(new String[0]);
                                                                    var67_471 = false;
                                                                    if (StringUtilities.LiteBansModule_31((CharSequence)var66_470[0], '+', false, 2, null)) {
                                                                        var67_471 = true;
                                                                        var66_470[0] = var66_470[0].substring(0, var66_470[0].length() - 1);
                                                                    }
                                                                    if (!StringUtilities.c((CharSequence)var65_468, ':', false, 2, null) || !0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler.AsyncBackgroundTask_5(var66_470[0])) {
                                                                        var41_299.e().getLogger().warning("Warning action is invalid (bad format): '" + (String)var65_468 + "'. Ignored + ");
                                                                        continue;
                                                                    }
                                                                    var68_473 = Integer.parseInt(var66_470[0]);
                                                                    if (var68_473 < 1 && !var67_471) {
                                                                        var41_299.e().getLogger().warning("Warning action is invalid (threshold " + var68_473 + " < 1): '" + (String)var65_468 + "'. Ignored + ");
                                                                        continue;
                                                                    }
                                                                    if (var53_439 != var68_473 && (!var67_471 || var53_439 <= var68_473)) continue;
                                                                    var69_474 = new LiteBansModule_144();
                                                                    var69_474.BaseCoreGenericHandler = var66_470[1];
                                                                    if (StringUtilities.BaseCoreGenericHandler((CharSequence)var69_474.BaseCoreGenericHandler, '/', false, 2, null)) {
                                                                        var70_475 = (CharSequence)var69_474.BaseCoreGenericHandler;
                                                                        var71_477 = 1;
                                                                        var72_479 = var70_475.length();
                                                                        var69_474.BaseCoreGenericHandler = var70_475.subSequence(var71_477, var72_479).toString();
                                                                    }
                                                                    if (GeoIPLookupService.LiteBansModule_31((CharSequence)var69_474.BaseCoreGenericHandler, "list")) {
                                                                        var70_475 = new StringBuilder();
                                                                        var71_478 = var46_409;
                                                                        var72_479 = 0;
                                                                        for (T var74_481 : var71_478) {
                                                                            var75_484 = (SilentHandler)var74_481;
                                                                            var76_485 = false;
                                                                            var70_475.append('\n').append(AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)var41_299, (CharSequence)MessageKey.UsageHandler, var75_484, false, 2, null));
                                                                        }
                                                                        var69_474.BaseCoreGenericHandler = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)var69_474.BaseCoreGenericHandler, (CharSequence)"list", var70_475);
                                                                    }
                                                                    var69_474.BaseCoreGenericHandler = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)var41_299, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)var41_299, (CharSequence)var69_474.BaseCoreGenericHandler, var43_351, false, 2, null), (CharSequence)"player", (Object)var52_432), (LiteBansModule_297)var51_422, false, 2, null);
                                                                    var70_475 = (MessageHandler)var40_272;
                                                                    var71_477 = 0;
                                                                    ((ConfigService)var70_475.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler(10, var69_474.BaseCoreGenericHandler);
                                                                    var71_476 = (MessageHandler)var40_272;
                                                                    var72_479 = 0;
                                                                    var73_480 = var71_476;
                                                                    var74_482 = false;
                                                                    v85 = var70_475 = ((ConfigService)var73_480.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule() != false ? var41_299.e().HoverTextFormatter() : var40_272.AsyncBackgroundTask_5();
                                                                    ObjectUtilities.BaseCoreGenericHandler(v85);
                                                                    var45_391.LiteBansModule_31((byte)3, v85.BaseCoreGenericHandler());
                                                                    var41_299.e().c(new AsyncBackgroundTask_2((CommandSenderWrapper)var70_475, (LiteBansModule_144)var69_474));
                                                                    var71_476 = (MessageHandler)var40_272;
                                                                    var72_479 = 0;
                                                                    var73_480 = var71_476;
                                                                    var74_482 = false;
                                                                    if (!((ConfigService)var73_480.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_2()) continue;
                                                                    var71_476 = (MessageHandler)var40_272;
                                                                    var72_479 = 0;
                                                                    var73_480 = var71_476;
                                                                    var74_482 = false;
                                                                    if (var65_468 != ArrayUtilities.c(((ConfigService)var73_480.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().A())) continue;
                                                                    var71_476 = var46_409;
                                                                    var72_479 = 0;
                                                                    var73_480 = var71_476.iterator();
                                                                    while (var73_480.hasNext()) {
                                                                        var74_483 = var73_480.next();
                                                                        var75_484 = (SilentHandler)var74_483;
                                                                        var76_485 = false;
                                                                        AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)var41_299, var75_484, var43_351.e(), var43_351.LiteBansModule_433(), null, false, 24, null);
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
                                            var38_230 = (MessageHandler)var31_134;
                                            var39_247 = false;
                                            var39_246 = (BroadcastService)var38_230.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class);
                                            var40_270 = false;
                                            var39_246.BaseCoreGenericHandler((LiteBansModule_82)var33_154, (NoneHandler_2)var20_38);
                                        }
                                        if (!var35_180.PunishmentTableService()) {
                                            var38_231 = (MessageHandler)var31_134;
                                            var39_248 = false;
                                            var40_273 = var38_231;
                                            var41_300 = false;
                                            if (((ConfigService)var40_273.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().e() > 0 && var30_117.ServerSyncService() == BanHandler.LiteBansModule_240 && var30_117.LiteBansModule_240() && var30_117.DatabaseMonitorService() != null) {
                                                var38_231 = MessageHandler.BaseCoreGenericHandler;
                                                var39_248 = var33_154.AsyncBackgroundTask_5().CommandThrottleService() == false;
                                                var40_273 = MessageKey.LiteBansModule_117;
                                                var41_300 = false;
                                                var42_327 = var38_231;
                                                var43_352 = false;
                                                if (var39_248) {
                                                    var44_372 = var42_327;
                                                    var45_392 = false;
                                                    var44_372.BaseCoreGenericHandler(var40_273);
                                                    throw new CommandExitException();
                                                }
                                                var38_231 = new LiteBansModule_206(var30_117.DatabaseMonitorService(), (LiteBansModule_82)var33_154, null, false, 0, 28, null).i();
                                                if (var38_231.n()) {
                                                    block269: {
                                                        var39_249 = MessageHandler.BaseCoreGenericHandler;
                                                        var40_274 = var38_231.m() > 10 && var35_180.LiteBansModule_194() == false;
                                                        var41_300 = false;
                                                        if (var40_274) {
                                                            var77_486 = var39_249;
                                                            var42_328 = false;
                                                            var77_486.BaseCoreGenericHandler(MessageKey.U.BaseCoreGenericHandler("list", (Object)var38_231.c()));
                                                            throw new CommandExitException();
                                                        }
                                                        var39_249 = MessageHandler.BaseCoreGenericHandler;
                                                        var40_275 = var38_231.LiteBansModule_240();
                                                        var41_300 = false;
                                                        if (var40_275 instanceof Collection && ((Collection)var40_275).isEmpty()) {
                                                            v86 = false;
                                                        } else {
                                                            for (T var43_353 : var40_275) {
                                                                var44_373 = (LiteBansModule_327)var43_353;
                                                                var45_393 = false;
                                                                if (!ObjectUtilities.BaseCoreGenericHandler((Object)var44_373.LiteBansModule_31(), (Object)var35_180.AsyncBackgroundTask_5())) continue;
                                                                v86 = true;
                                                                break block269;
                                                            }
                                                            v86 = false;
                                                        }
                                                    }
                                                    var40_276 = v86;
                                                    var41_301 = MessageKey.aa;
                                                    var42_329 = false;
                                                    var43_354 = var39_249;
                                                    var44_374 = false;
                                                    if (var40_276) {
                                                        var45_394 = var43_354;
                                                        var46_410 = false;
                                                        var45_394.BaseCoreGenericHandler(var41_301);
                                                        throw new CommandExitException();
                                                    }
                                                    for (LiteBansModule_327 var40_277 : var38_231.LiteBansModule_240()) {
                                                        if (0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler.GnuSparseMapHandler(var40_277.LiteBansModule_31()) == null || ObjectUtilities.BaseCoreGenericHandler((Object)var40_277.LiteBansModule_31(), (Object)var30_117.DatabaseMonitorService()) || var40_277.c() != null && ObjectUtilities.BaseCoreGenericHandler((Object)var40_277.c().DatabaseMonitorService(), (Object)var40_277.LiteBansModule_31()) || AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)var33_154, (UUID)var41_301, null, 2, null)) continue;
                                                        var35_180.BaseCoreGenericHandler((LiteBansModule_82)var33_154, var40_277.e(), var40_277.LiteBansModule_31());
                                                        v87 = var35_180.AsyncBackgroundTask_22();
                                                        v88 = var35_180.AsyncBackgroundTask_22();
                                                        CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)var33_154, var40_277, var30_117, v87 != null ? v87.BaseCoreGenericHandler() : null, v88 != null ? v88.i() : null, null, null, false, 112, null);
                                                    }
                                                }
                                            }
                                        }
                                        var31_134 = var13_22;
                                        var33_154 = BroadcastHandler.LiteBansModule_401.BaseCoreGenericHandler(var20_38.ServerSyncService());
                                        var34_169 = false;
                                        if (!var31_134.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) break block270;
                                        var36_182 /* !! */  = var33_154;
                                        var32_136 = var31_134;
                                        var35_181 = false;
                                        var37_206 = ServerSyncService.GnuSparseMapHandler;
                                        var38_232 = false;
                                        var39_250 = var25_68 /* !! */ ;
                                        var40_278 = false;
                                        var41_302 = ServerSyncService.GnuSparseMapHandler;
                                    }
                                    catch (Throwable var31_135) {
                                        var33_154 = var13_22;
                                        var34_168 /* !! */  = BroadcastHandler.LiteBansModule_401.BaseCoreGenericHandler(var20_38.ServerSyncService());
                                        var35_177 = false;
                                        if (var33_154.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
                                            var36_182 /* !! */  = var34_168 /* !! */ ;
                                            var32_136 = var33_154;
                                            var37_207 = false;
                                            var38_233 = ServerSyncService.GnuSparseMapHandler;
                                            var39_251 = false;
                                            var40_279 = var25_68 /* !! */ ;
                                            var41_303 = false;
                                            var42_331 = ServerSyncService.GnuSparseMapHandler;
                                            var43_356 = new CharSequence[2];
                                            v89 = var40_279.BaseCoreGenericHandler();
                                            if (v89 == null) {
                                                v89 = "";
                                            }
                                            var43_356[0] = LiteBansModule_50.c.AsyncBackgroundTask_5(v89);
                                            var43_356[1] = var30_117.LiteBansModule_240() != false ? String.valueOf(var40_279.c()) : "";
                                            var44_375 = false;
                                            var60_464 = ArrayUtilities.BaseCoreGenericHandler(var43_356, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                            CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)var32_136, (BroadcastHandler)var36_182 /* !! */ , var60_464, null, null, 12, null);
                                        }
                                        throw var31_135;
                                    }
                                    var42_330 = new CharSequence[2];
                                    v90 = var39_250.BaseCoreGenericHandler();
                                    if (v90 == null) {
                                        v90 = "";
                                    }
                                    var42_330[0] = LiteBansModule_50.c.AsyncBackgroundTask_5(v90);
                                    var42_330[1] = var30_117.LiteBansModule_240() != false ? String.valueOf(var39_250.c()) : "";
                                    var43_355 = false;
                                    var60_463 = ArrayUtilities.BaseCoreGenericHandler(var42_330, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                    CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)var32_136, (BroadcastHandler)var36_182 /* !! */ , var60_463, null, null, 12, null);
                                }
                                var20_38.BaseCoreGenericHandler(InitHandler.e);
                            }
                            finally {
                                var20_38.BaseCoreGenericHandler(InitHandler.LiteBansModule_31);
                            }
                        }
                        catch (LiteBansException_2 var16_27) {
                        }
                    }
                    var11_18 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable var12_20) {
                    var10_17 = var12_20;
                    throw var12_20;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(var9_16, var10_17);
                }
            }
            catch (SQLException var8_14) {
                if (var6_6.LiteBansModule_31(var8_14)) break block271;
                throw var8_14;
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
        boolean flag = false;
        cz2.BaseCoreGenericHandler(((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).AsyncBackgroundTask_21().BaseCoreGenericHandler(cz2.ServerSyncService(), c12));
    }

    private final LiteBansModule_65 BaseCoreGenericHandler(NoneHandler_2 cz2, String string) {
        LiteBansModule_65 c12;
        if (((CharSequence)cz2.n()).length() > 0 || ((CharSequence)cz2.AsyncBackgroundTask_21()).length() == 0 || cz2.PunishmentService() || cz2.BanHandler_5()) {
            c12 = null;
        } else {
            MessageHandler messageHandler = this;
            boolean flag = false;
            c12 = ((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).AsyncBackgroundTask_21().BaseCoreGenericHandler(cz2.ServerSyncService(), string);
        }
        return c12;
    }

    private final void BaseCoreGenericHandler(NoneHandler_2 cz2, LiteBansModule_113 d92) {
        if (cz2.ServerSyncService() == BanHandler.LiteBansModule_240) {
            String string;
            Object object = this;
            boolean flag = false;
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
    }

    private final void BaseCoreGenericHandler(LiteBansModule_113 d92) {
        String string;
        String string2;
        Object object = this;
        boolean flag = false;
        MessageHandler messageHandler = (MessageHandler)object;
        boolean flag2 = false;
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
        boolean flag3 = false;
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
}

