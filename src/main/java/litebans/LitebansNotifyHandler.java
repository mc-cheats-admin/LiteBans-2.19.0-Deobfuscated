package litebans;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

public final class LitebansNotifyHandler {
    private final NoneHandler_2 BaseCoreGenericHandler;
    public LitebansNotifyHandler(@NotNull NoneHandler_2 cz2) {
        this.plugin = cz2;
    }

    public final void BaseCoreGenericHandler(@NotNull String[] v1, boolean v2, boolean v3) {
        var4_4 = this.plugin;
        var5_5 = false;
        var6_6 = false;
        var8_8 = v1.length;
        block23: for (var7_7 = 0; var7_7 < var8_8; ++var7_7) {
            block53: {
                block61: {
                    block63: {
                        block57: {
                            block62: {
                                block58: {
                                    block59: {
                                        block56: {
                                            block60: {
                                                block54: {
                                                    block55: {
                                                        var10_10 = var9_9 = v1[var7_7];
                                                        var11_11 = true;
                                                        if (!StringUtilities.BaseCoreGenericHandler((CharSequence)var10_10, '-', false, 2, null) || var10_10.length() <= 1 || var6_6) break block53;
                                                        if (ObjectUtilities.BaseCoreGenericHandler((Object)var10_10, (Object)"--")) {
                                                            var6_6 = true;
                                                            continue;
                                                        }
                                                        var12_12 /* !! */  = new char[]{'-'};
                                                        if (ObjectUtilities.BaseCoreGenericHandler((Object)(var10_10 = StringUtilities.BaseCoreGenericHandler(var10_10, var12_12 /* !! */ )), (Object)"AsyncBackgroundTask_21") || ObjectUtilities.BaseCoreGenericHandler((Object)var10_10, (Object)"AsyncBackgroundTask_21:true") || ObjectUtilities.BaseCoreGenericHandler((Object)var10_10, (Object)("AsyncBackgroundTask_21:" + MessageKey.ap))) {
                                                            if (!v3) {
                                                                block52: {
                                                                    var12_12 /* !! */  = (char[])var4_4.BaseCoreGenericHandler();
                                                                    var13_13 = new String[]{"litebans.notify", "litebans.notify.silent"};
                                                                    var14_19 = false;
                                                                    var15_24 = var13_13;
                                                                    var16_29 = 0;
                                                                    for (String var19_32 : var15_24) {
                                                                        var20_34 = var19_32;
                                                                        var21_35 = false;
                                                                        if (!var12_12 /* !! */ .e((String)var20_34)) continue;
                                                                        v0 = true;
                                                                        break block52;
                                                                    }
                                                                    v0 = false;
                                                                }
                                                                if (!v0) continue;
                                                            }
                                                            var4_4.Utf8Handler_2(true);
                                                            continue;
                                                        }
                                                        if (ObjectUtilities.BaseCoreGenericHandler((Object)var10_10, (Object)"AsyncBackgroundTask_21:false") || ObjectUtilities.BaseCoreGenericHandler((Object)var10_10, (Object)("AsyncBackgroundTask_21:" + MessageKey.OutHandler))) {
                                                            var4_4.Utf8Handler_2(false);
                                                            var4_4.LiteBansModule_240(false);
                                                            continue;
                                                        }
                                                        if (!StringUtilities.LiteBansModule_31(var10_10, "sender", false, 2, null) && !StringUtilities.LiteBansModule_31(var10_10, "server-origin", false, 2, null)) break block54;
                                                        if (v3) break block55;
                                                        var12_12 /* !! */  = var4_4.BaseCoreGenericHandler();
                                                        var13_14 = "litebans.admin";
                                                        var14_20 = false;
                                                        if (!var12_12 /* !! */ .e(var13_14)) break block54;
                                                    }
                                                    if (StringUtilities.LiteBansModule_31(var10_10, "sender=", false, 2, null)) {
                                                        var4_4.c(var10_10.substring(7));
                                                        var4_4.i(true);
                                                        continue;
                                                    }
                                                    if (StringUtilities.LiteBansModule_31(var10_10, "sender-name=", false, 2, null)) {
                                                        var4_4.c(var10_10.substring(12));
                                                        var4_4.i(true);
                                                        continue;
                                                    }
                                                    if (StringUtilities.LiteBansModule_31(var10_10, "sender-uuid=", false, 2, null)) {
                                                        var4_4.BaseCoreGenericHandler(HexEncodingHelper.LiteBansModule_194(var10_10.substring(12)));
                                                        var4_4.i(true);
                                                        continue;
                                                    }
                                                    if (!StringUtilities.LiteBansModule_31(var10_10, "server-origin=", false, 2, null)) continue;
                                                    var4_4.e(var10_10.substring(14));
                                                    continue;
                                                }
                                                if (StringUtilities.LiteBansModule_31(var10_10, "stack=", false, 2, null)) {
                                                    var4_4.BaseCoreGenericHandler(Byte.parseByte(StringUtilities.BaseCoreGenericHandler(var10_10, "stack=", null, 2, null)));
                                                    if (var4_4.r() <= 32) continue;
                                                    MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.LiteBansModule_433);
                                                    throw new CommandExitException();
                                                }
                                                var12_12 /* !! */  = var10_10;
                                                switch (var12_12 /* !! */ .hashCode()) {
                                                    case 951117504: {
                                                        if (!var12_12 /* !! */ .equals("confirm")) {
                                                            ** break;
                                                        }
                                                        break block56;
                                                    }
                                                    case -1068795718: {
                                                        if (var12_12 /* !! */ .equals("modify")) break;
                                                        ** break;
                                                    }
                                                    case 3202370: {
                                                        if (!var12_12 /* !! */ .equals("hide")) {
                                                            ** break;
                                                        }
                                                        break block57;
                                                    }
                                                    case 3532159: {
                                                        if (!var12_12 /* !! */ .equals("skip")) {
                                                            ** break;
                                                        }
                                                        break block58;
                                                    }
                                                    case -439474683: {
                                                        if (!var12_12 /* !! */ .equals("no-queue")) {
                                                            ** break;
                                                        }
                                                        break block59;
                                                    }
                                                    case -1335458389: {
                                                        if (!var12_12 /* !! */ .equals("delete")) {
                                                            ** break;
                                                        }
                                                        break block60;
                                                    }
                                                }
                                                var4_4.LiteBansModule_31(true);
                                                break block61;
                                            }
                                            var4_4.g(true);
                                            break block61;
                                        }
                                        var4_4.e(true);
                                        break block61;
                                    }
                                    var4_4.AsyncBackgroundTask_5(true);
                                    break block61;
                                }
                                if (v3) break block62;
                                var13_15 = var4_4.BaseCoreGenericHandler();
                                var14_21 = "litebans.admin";
                                var15_25 = false;
                                if (!var13_15.e(var14_21)) break block61;
                            }
                            var4_4.c(true);
                            break block61;
                        }
                        if (v3) break block63;
                        var13_16 = var4_4.BaseCoreGenericHandler();
                        var14_22 = "litebans.admin";
                        var15_26 = false;
                        if (!var13_16.e(var14_22)) break block61;
                    }
                    var4_4.GnuSparseMapHandler(true);
                    break block61;
lbl122:
                    // 7 sources

                    var11_11 = false;
                }
                if (var11_11) continue;
                var12_12 /* !! */  = var10_10.toCharArray();
                var14_23 = var12_12 /* !! */ .length;
                block25: for (var13_17 = 0; var13_17 < var14_23; ++var13_17) {
                    var15_27 = var12_12 /* !! */ [var13_17];
                    switch (var15_27) {
                        case 'BanHandler_5': 
                        case 'PlayerQuitListener': 
                        case 'LiteBansModule_430': 
                        case 'S': 
                        case 'T': 
                        case 'U': 
                        case 'W': 
                        case 'AsyncBackgroundTask_5': 
                        case 'm': 
                        case 'PunishmentTableService': {
                            continue block25;
                        }
                        default: {
                            if (!v2) continue block23;
                            ((Collection)var4_4.A()).add(var9_9);
                            continue block23;
                        }
                    }
                }
                var13_18 /* !! */  = var12_12 /* !! */ ;
                var14_23 = 0;
                var16_29 = var13_18 /* !! */ .length;
                block26: for (var15_28 = 0; var15_28 < var16_29; ++var15_28) {
                    var18_31 = var17_30 = var13_18 /* !! */ [var15_28];
                    var19_33 = false;
                    switch (var18_31) {
                        case 77: {
                            var4_4.BaseCoreGenericHandler(BanHandler.GnuSparseMapHandler);
                            continue block26;
                        }
                        case 87: {
                            var4_4.BaseCoreGenericHandler(BanHandler.c);
                            var4_4.LiteBansModule_401(false);
                            continue block26;
                        }
                        case 84: {
                            var4_4.LiteBansModule_401(true);
                            continue block26;
                        }
                        case 73: {
                            var4_4.m(true);
                            continue block26;
                        }
                        case 85: {
                            var4_4.BanHandler_4();
                            continue block26;
                        }
                        case 83: {
                            if (!v3) {
                                var20_34 = var4_4.BaseCoreGenericHandler();
                                var21_36 = "litebans.extrasilent";
                                var22_37 = false;
                                if (!var20_34.e(var21_36)) continue block26;
                            }
                            var4_4.Utf8Handler_2(true);
                            var4_4.LiteBansModule_240(true);
                            continue block26;
                        }
                        case 78: {
                            var4_4.LiteBansModule_194(true);
                            continue block26;
                        }
                        case 112: {
                            if (!v3) {
                                var20_34 = var4_4.BaseCoreGenericHandler();
                                var21_36 = "litebans.public";
                                var22_37 = false;
                                if (!var20_34.e(var21_36)) continue block26;
                            }
                            var4_4.Utf8Handler_2(false);
                            var4_4.LiteBansModule_240(false);
                            continue block26;
                        }
                        case 109: {
                            var4_4.LiteBansModule_31(true);
                            continue block26;
                        }
                        case 100: {
                            var4_4.g(true);
                            continue block26;
                        }
                    }
                }
                continue;
            }
            if (!v2) continue;
            ((Collection)var4_4.A()).add(var9_9);
        }
        if (var4_4.F()) {
            var4_4.BanHandler_4();
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LitebansNotifyHandler bL2, String[] args, boolean flag, boolean flag2, int n, Object object) {
        if ((n & 1) != 0) {
            args = bL2.BaseCoreGenericHandler.z();
        }
        if ((n & 2) != 0) {
            flag = true;
        }
        if ((n & 4) != 0) {
            flag2 = false;
        }
        bL2.BaseCoreGenericHandler(args, flag, flag2);
    }

    public final boolean BaseCoreGenericHandler(@NotNull String string) {
        return StringUtilities.BaseCoreGenericHandler((CharSequence)string, '*', false, 2, null) && !StringUtilities.LiteBansModule_31((CharSequence)string, '*', false, 2, null) && string.length() > 3 && !StringUtilities.c((CharSequence)string, '.', false, 2, null) && !StringUtilities.c((CharSequence)string, ':', false, 2, null);
    }

    }

