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
            var4_4 = false;
            v3 = (DatabaseMonitorService)v3.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            var4_4 = false;
            try {
                var5_5 = v3.LiteBansModule_194();
                var6_7 = var5_5;
                var7_8 = null;
                try {
                    block56: {
                        block55: {
                            var8_9 = (LiteBansModule_82)var6_7;
                            var9_10 = false;
                            var10_13 = var5_5;
                            var11_14 = false;
                            var12_15 = (String[])this;
                            var13_17 = false;
                            var14_20 = var12_15;
                            var15_22 = false;
                            var16_25 = ((ConfigService)var14_20.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194();
                            try {
                                block59: {
                                    block62: {
                                        block60: {
                                            block61: {
                                                if (LiteBansCommand.i == null) break block59;
                                                var12_15 = this;
                                                var13_17 = false;
                                                if (!((ConfigService)var12_15.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).g()) break block55;
                                                var12_15 = this;
                                                var13_17 = false;
                                                v0 = (ConfigService)var12_15.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                                                var13_18 = AbstractCommand.AsyncBackgroundTask_5;
                                                var14_20 = this.getName();
                                                var15_22 = false;
                                                var17_26 = var14_20;
                                                switch (var17_26.hashCode()) {
                                                    case -1320563219: {
                                                        if (var17_26.equals("dupeip")) break;
                                                        ** break;
                                                    }
                                                    case 712910260: {
                                                        if (!var17_26.equals("staffhistory")) {
                                                            ** break;
                                                        }
                                                        break block60;
                                                    }
                                                    case 926934164: {
                                                        if (!var17_26.equals("history")) {
                                                            ** break;
                                                        }
                                                        break block61;
                                                    }
                                                }
                                                var18_29 /* !! */  = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                                                v1 = var18_29 /* !! */ ;
                                                break block62;
                                            }
                                            var18_29 /* !! */  = new String[]{"hist", "litebans:history"};
                                            v1 = var18_29 /* !! */ ;
                                            break block62;
                                        }
                                        var18_29 /* !! */  = new String[]{"staffhist", "litebans:staffhistory"};
                                        v1 = var18_29 /* !! */ ;
                                        break block62;
lbl58:
                                        // 4 sources

                                        var18_29 /* !! */  = new String[]{"litebans:" + (String)var14_20};
                                        v1 = var18_29 /* !! */ ;
                                    }
                                    var12_15 = v1;
                                    v2 = v1.c();
                                    if (new LiteBansModule_403(v0, Arrays.copyOf(var12_15, ((String[])var12_15).length)).LiteBansModule_31() != (v2 != null ? v2.hashCode() : 0)) break block55;
                                }
                                throw new NullPointerException();
                            }
                            catch (Exception var12_16) {
                                break block56;
                            }
                        }
                        var13_19 = BanHandler.g;
                        var14_21 = var16_25.n();
                        var15_23 = var16_25.BuilderactionHandler();
                        var17_26 = var10_13.AsyncBackgroundTask_5().BaseCoreGenericHandler(v1);
                        var19_32 = DatabaseMonitorService.BaseCoreGenericHandler(var10_13.AsyncBackgroundTask_5(), false, 1, null);
                        var21_33 = var10_13.BaseCoreGenericHandler(v1);
                        var13_19 = var12_15 = new NoneHandler_2((BanHandler)var13_19, false, var14_21, false, false, false, false, false, false, false, false, false, false, false, var19_32, 0L, 0L, 0, null, null, false, null, 0, null, null, null, null, v1, (String)var21_33, null, (String)var15_23, (String)var17_26, null, null, v2, null, null, 671072250, 27, null);
                        var14_21 = false;
                        try {
                            block65: {
                                block64: {
                                    block57: {
                                        block63: {
                                            NoneHandler_2.BaseCoreGenericHandler((NoneHandler_2)var13_19, var10_13, null, false, 3, null);
                                            var13_19.BaseCoreGenericHandler(InitHandler.LiteBansModule_194);
                                            var15_23 = MessageHandler.BaseCoreGenericHandler;
                                            var17_27 = var13_19.A().isEmpty();
                                            var18_29 /* !! */  = MessageKey.LiteBansModule_37;
                                            var22_43 = false;
                                            var21_33 = var15_23;
                                            var23_48 = false;
                                            if (var17_27) {
                                                var24_52 = var21_33;
                                                var25_61 = false;
                                                var24_52.BaseCoreGenericHandler(var18_29 /* !! */ );
                                                throw new CommandExitException();
                                            }
                                            var15_23 = this;
                                            var17_28 = var13_19.A();
                                            var18_30 = false;
                                            var13_19.LiteBansModule_31(CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)var15_23, (String)CollectionUtilities.LiteBansModule_240((Iterable)var17_28)));
                                            var15_23 = CommandArgumentUtils.LiteBansModule_31(this, var13_19.AsyncBackgroundTask_21());
                                            var17_28 = new LiteBansModule_144();
                                            v3 = var15_23;
                                            var17_28.BaseCoreGenericHandler = v3 != null ? v3.i() : null;
                                            var18_31 = new LiteBansModule_144();
                                            v4 = var15_23;
                                            var18_31.BaseCoreGenericHandler = v4 != null ? v4.BaseCoreGenericHandler() : null;
                                            var13_19.A().remove(0);
                                            if (((Collection)var13_19.A()).isEmpty() == false) {
                                                var22_44 = (String)CollectionUtilities.LiteBansModule_31(var13_19.A());
                                                var23_49 = this;
                                                var24_53 = false;
                                                v5 = ((ConfigService)var23_49.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).AsyncBackgroundTask_21().BaseCoreGenericHandler(BanHandler.g, var22_44);
                                                if (v5 == null) {
                                                    v5 = LiteBansModule_65.LiteBansModule_31.BaseCoreGenericHandler();
                                                }
                                                var13_19.BaseCoreGenericHandler(v5);
                                                var21_33 = var13_19.g();
                                                var23_48 = false;
                                                if (ObjectUtilities.BaseCoreGenericHandler(var21_33.LiteBansModule_194() & 255, -1 & 255) < 0) {
                                                    var13_19.A().remove(var22_44);
                                                }
                                            }
                                            var13_19.n().append(CollectionUtilities.BaseCoreGenericHandler(var13_19.A(), " ", null, null, 0, null, null, 62, null));
                                            if (var18_31.BaseCoreGenericHandler == null) {
                                                var13_19.BaseCoreGenericHandler(var10_13.c(var13_19.AsyncBackgroundTask_21()));
                                                v6 = var13_19.AsyncBackgroundTask_22();
                                                if (!(v6 != null && (v6 = v6.LiteBansModule_31()) != null ? !StringUtilities.BaseCoreGenericHandler((CharSequence)v6, '#', false, 2, null) : false)) {
                                                    var13_19.BaseCoreGenericHandler((LiteBansModule_297)null);
                                                }
                                                if (var13_19.AsyncBackgroundTask_22() == null) {
                                                    var22_45 = this;
                                                    var21_33 = var13_19.AsyncBackgroundTask_21();
                                                    var24_54 = var22_45;
                                                    var25_62 = false;
                                                    var23_48 = ((ConfigService)var24_54.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().af();
                                                    var26_66 = 0;
                                                    if (var23_48) {
                                                        if (HexEncodingHelper.BaseCoreGenericHandler((String)var21_33)) {
                                                            v7 = LiteBansModule_50.c.LiteBansModule_194((String)var21_33);
                                                            if (v7 == null) {
                                                                v8 = null;
                                                            } else {
                                                                var27_67 = v7;
                                                                v8 = new LiteBansModule_297((String)var27_67, (String)var21_33, "#", new Date());
                                                            }
                                                        } else {
                                                            v9 = LiteBansModule_50.c.BaseCoreGenericHandler((String)var21_33);
                                                            if (v9 == null) {
                                                                v8 = null;
                                                            } else {
                                                                var27_67 = v9;
                                                                var24_55 = false;
                                                                v10 = var27_67.BaseCoreGenericHandler();
                                                                v8 = new LiteBansModule_297(var27_67.AsyncBackgroundTask_5(), v10 != null ? v10.toString() : null, null, new Date());
                                                            }
                                                        }
                                                    } else {
                                                        if (HexEncodingHelper.BaseCoreGenericHandler((String)var21_33)) {
                                                            new LiteBansModule_297(LiteBansModule_242.BaseCoreGenericHandler((String)var21_33, 16), (String)var21_33, "#", new Date());
                                                        }
                                                        v8 = new LiteBansModule_297(LiteBansModule_242.BaseCoreGenericHandler((String)var21_33, 16), LiteBansModule_242.BaseCoreGenericHandler((String)var21_33), "#", new Date());
                                                    }
                                                    var13_19.BaseCoreGenericHandler(v8);
                                                }
                                                v11 = var13_19.AsyncBackgroundTask_22();
                                                var17_28.BaseCoreGenericHandler = v11 != null ? v11.BaseCoreGenericHandler() : null;
                                                v12 = var13_19.AsyncBackgroundTask_22();
                                                var18_31.BaseCoreGenericHandler = v12 != null ? v12.LiteBansModule_31() : null;
                                            }
                                            this.plugin((NoneHandler_2)var13_19);
                                            var22_46 = var13_19.g();
                                            var21_34 = false;
                                            if (ObjectUtilities.BaseCoreGenericHandler(var22_46.LiteBansModule_194() & 255, -1 & 255) < 0 && var18_31.BaseCoreGenericHandler != null) {
                                                var22_46 = var13_19.g().LiteBansModule_240();
                                                v13 = var15_23;
                                                var13_19.BaseCoreGenericHandler(var10_13.BaseCoreGenericHandler(var13_19.g(), (String)var18_31.BaseCoreGenericHandler, v13 != null ? v13.LiteBansModule_31() : null));
                                                var13_19.BaseCoreGenericHandler(var13_19.g().BaseCoreGenericHandler(var13_19.D()));
                                                var21_35 = this;
                                                var23_48 = false;
                                                ((ConfigService)var21_35.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler((Object)("Applying " + var13_19.g().AsyncBackgroundTask_5() + " template \"" + var13_19.g().g() + "\" LiteBansModule_21 level " + (var13_19.D() + 1) + '/' + var13_19.g().LiteBansModule_31().size()));
                                                if (StringUtilities.LiteBansModule_31(var13_19.n())) {
                                                    v14 = var13_19.n();
                                                    v15 = var13_19.L().BaseCoreGenericHandler();
                                                    if (v15 == null) {
                                                        v15 = var22_46.BaseCoreGenericHandler();
                                                    }
                                                    v14.append(v15);
                                                }
                                                CommandArgumentUtils.BaseCoreGenericHandler(this, var13_19.g(), var13_19.L());
                                                var13_19.BaseCoreGenericHandler(var10_13);
                                            }
                                            var22_46 = var13_19.n();
                                            var21_36 = var13_19.c(var10_13);
                                            var23_48 = false;
                                            StringUtilities.BaseCoreGenericHandler((StringBuilder)var22_46).append((CharSequence)var21_36);
                                            var13_19.LiteBansModule_31(var10_13);
                                            if (var15_23 != null && var15_23.GnuSparseMapHandler()) break block63;
                                            if (var18_31.BaseCoreGenericHandler != null) {
                                                v16 = var17_28.BaseCoreGenericHandler;
                                                ObjectUtilities.BaseCoreGenericHandler(v16);
                                                if (var13_19.LiteBansModule_31(var10_13, (String)v16, (String)var18_31.BaseCoreGenericHandler)) {
                                                    var22_46 = MessageHandler.BaseCoreGenericHandler;
                                                    var21_37 = var13_19.BaseCoreGenericHandler(var10_13, (String)var18_31.BaseCoreGenericHandler);
                                                    var23_48 = false;
                                                    var24_56 = var22_46;
                                                    var25_62 = var21_37 == false;
                                                    var26_66 = 0;
                                                    if (var25_62) {
                                                        var28_71 = var24_56;
                                                        var27_68 = false;
                                                        var28_71.BaseCoreGenericHandler(var10_13.BaseCoreGenericHandler(MessageKey.T, (String)var17_28.BaseCoreGenericHandler, (String)var17_28.BaseCoreGenericHandler, (String)var18_31.BaseCoreGenericHandler, null, null));
                                                        throw new CommandExitException();
                                                    }
                                                }
                                            }
                                            var22_46 = MessageHandler.BaseCoreGenericHandler;
                                            if (!var10_13.AsyncBackgroundTask_5().AsyncBackgroundTask_21() || var13_19.PunishmentTableService()) ** GOTO lbl-1000
                                            var21_38 = v1;
                                            var23_50 = "litebans.kick.global";
                                            var24_57 = false;
                                            var25_63 = var21_38;
                                            var26_66 = 0;
                                            if (var25_63.e(var23_50) == false) lbl-1000:
                                            // 2 sources

                                            {
                                                v17 = true;
                                            } else {
                                                v17 = false;
                                            }
                                            var21_39 = v17;
                                            var23_51 = MessageKey.dL;
                                            var24_58 = false;
                                            var25_65 = var22_46;
                                            var26_66 = 0;
                                            if (var21_39) {
                                                var27_67 = var25_65;
                                                var29_73 = false;
                                                var27_67.BaseCoreGenericHandler(var23_51);
                                                throw new CommandExitException();
                                            }
                                            var22_46 = (ServerSyncService)var10_13.e().BaseCoreGenericHandler(ServerSyncService.class);
                                            var21_40 = new PlayerHandler((NoneHandler_2)var13_19, (ServerSyncService)var22_46, v1);
                                            var22_46.BaseCoreGenericHandler(var21_40);
                                            this.plugin(var10_13, (NoneHandler_2)var13_19, var13_19.n());
                                            var23_51 = this;
                                            var30_75 = 400L;
                                            var26_66 = 0;
                                            var23_51.LiteBansModule_240().BaseCoreGenericHandler(new AsyncBackgroundTask((MessageHandler)var23_51, var21_40), var30_75);
                                            var13_19.BaseCoreGenericHandler(var10_13, (CharSequence)MessageKey.dz.BaseCoreGenericHandler("player", (Object)var13_19.AsyncBackgroundTask_21()));
                                        }
                                        if (AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(var10_13.e(), var15_23.LiteBansModule_240())) {
                                            var10_13.AsyncBackgroundTask_5().BaseCoreGenericHandler((LiteBansModule_178)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, BaseCoreGenericHandler(litebans.CommandSenderWrapper litebans.LiteBansModule_82 ), (Llitebans/LiteBansModule_82;)Llitebans/iV;)((CommandSenderWrapper)var15_23));
                                        }
                                        var13_19.BaseCoreGenericHandler(InitHandler.BaseCoreGenericHandler);
                                        if (var13_19.BaseCoreGenericHandler(var10_13, (CommandSenderWrapper)var15_23)) break block64;
                                        var22_46 = var15_23;
                                        var21_36 = new String[]{"litebans.exempt", "litebans.exempt.kick"};
                                        var23_48 = false;
                                        var24_59 = var21_36;
                                        var25_62 = false;
                                        var27_69 = var24_59.length;
                                        for (var26_66 = 0; var26_66 < var27_69; ++var26_66) {
                                            var32_76 = var29_74 = var24_59[var26_66];
                                            var33_77 = false;
                                            if (!var22_46.e(var32_76)) continue;
                                            v18 = true;
                                            break block57;
                                        }
                                        v18 = false;
                                    }
                                    if (!v18 || !var16_25.LockdownService()) break block65;
                                }
                                var22_46 = MessageHandler.BaseCoreGenericHandler;
                                var21_41 = var13_19.BaseCoreGenericHandler(var10_13, (String)var18_31.BaseCoreGenericHandler);
                                var23_48 = false;
                                var24_60 = var22_46;
                                var25_62 = var21_41 == false;
                                var26_66 = 0;
                                if (var25_62) {
                                    var28_72 = var24_60;
                                    var27_70 = false;
                                    var28_72.BaseCoreGenericHandler(var10_13.BaseCoreGenericHandler((CharSequence)MessageKey.T, (CommandSenderWrapper)var15_23));
                                    throw new CommandExitException();
                                }
                            }
                            v19 = var15_23.BaseCoreGenericHandler();
                            v20 = var15_23.LiteBansModule_31();
                            v21 = var13_19.n();
                            v22 = var13_19.AsyncBackgroundTask_5();
                            v23 = var13_19.H();
                            v24 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
                            v25 = var10_13.AsyncBackgroundTask_5().BaseCoreGenericHandler(v1);
                            if (v25 == null) {
                                v25 = var10_13.AsyncBackgroundTask_5().ServerSyncService();
                            }
                            var22_46 = var13_19.g();
                            var21_42 = false;
                            v26 = var22_46;
                            var13_19.LiteBansModule_31(new SilentHandler(BanHandler.g, v19, v20, v21, v22, v23, v24, v25, DatabaseMonitorService.BaseCoreGenericHandler(var10_13.AsyncBackgroundTask_5(), false, 1, null), 0L, v26 != null ? v26.LiteBansModule_194() : -1, var13_19.B(), false, false, 0L, 24576, null));
                            var13_19.BaseCoreGenericHandler(InitHandler.i);
                            v27 = var13_19.q();
                            ObjectUtilities.BaseCoreGenericHandler(v27);
                            var22_47 = false;
                            var13_19.BaseCoreGenericHandler(var10_13, v1, v27, new LiteBansModule_297(var15_23.i(), var15_23.BaseCoreGenericHandler(), var15_23.LiteBansModule_31(), new Date()));
                            this.plugin((NoneHandler_2)var13_19, var10_13, (CommandSenderWrapper)var15_23);
                        }
                        finally {
                            var13_19.BaseCoreGenericHandler(InitHandler.LiteBansModule_31);
                        }
                    }
                    var8_9 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable var9_11) {
                    var7_8 = var9_11;
                    throw var9_11;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(var6_7, var7_8);
                }
            }
            catch (SQLException var5_6) {
                if (v3.LiteBansModule_31(var5_6)) break block58;
                throw var5_6;
            }
        }
    }

    private final void BaseCoreGenericHandler(LiteBansModule_82 ch2, NoneHandler_2 cz2, CharSequence charSequence) {
        LiteBansModule_82 ch3 = ch2;
        BroadcastHandler ij2 = BroadcastHandler.r;
        boolean flag = false;
        if (ch3.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
            BroadcastHandler ij3 = ij2;
            LiteBansModule_82 ch4 = ch3;
            boolean flag2 = false;
            LiteBansModule_303 iF2 = ServerSyncService.GnuSparseMapHandler;
            Object[] objectArray = new CharSequence[8];
            objectArray[0] = cz2.AsyncBackgroundTask_5();
            objectArray[1] = cz2.H();
            objectArray[2] = cz2.AsyncBackgroundTask_21();
            objectArray[3] = charSequence;
            Object object = ServerSyncService.GnuSparseMapHandler;
            boolean flag3 = cz2.B();
            boolean flag4 = false;
            objectArray[4] = flag3 ? "1" : "0";
            object = ServerSyncService.GnuSparseMapHandler;
            flag3 = cz2.c();
            flag4 = false;
            objectArray[5] = flag3 ? "1" : "0";
            object = cz2.g();
            flag3 = false;
            Object object2 = object;
            objectArray[6] = LiteBansModule_283.LiteBansModule_31(object2 != null ? ((LiteBansModule_65)object2).LiteBansModule_194() : (byte)-1);
            objectArray[7] = String.valueOf(cz2.D());
            boolean flag5 = false;
            CharSequence charSequence2 = ArrayUtilities.BaseCoreGenericHandler(objectArray, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
            CommandArgumentUtils.BaseCoreGenericHandler(ch4, ij3, charSequence2, null, null, 12, null);
        }
    }

    public final void BaseCoreGenericHandler(@NotNull NoneHandler_2 cz2, @NotNull LiteBansModule_82 ch2, @NotNull CommandSenderWrapper sender) {
        CharSequence charSequence;
        boolean flag;
        boolean flag2;
        Object object;
        boolean flag3;
        int n;
        Object object2;
        SilentHandler dZ2;
        block9: {
            boolean flag4;
            SilentHandler dZ3 = cz2.q();
            ObjectUtilities.BaseCoreGenericHandler(dZ3);
            dZ2 = dZ3;
            String string = ((Object)dZ2.LiteBansModule_31()).toString();
            String string2 = string.toLowerCase(Locale.ENGLISH);
            object2 = this;
            n = 0;
            Object object3 = object2;
            flag3 = false;
            object2 = ((ConfigService)((MessageHandler)object3).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().H();
            n = 0;
            if (object2 instanceof Collection && ((Collection)object2).isEmpty()) {
                flag4 = false;
            } else {
                object3 = object2.iterator();
                while (object3.hasNext()) {
                    Object e = object3.next();
                    object = (String)e;
                    flag2 = false;
                    if (!StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)object, false, 2, null)) continue;
                    flag4 = true;
                    break block9;
                }
                flag4 = flag = false;
            }
        }
        if (!flag) {
            CommandArgumentUtils.BaseCoreGenericHandler(ch2, dZ2, false, false, 6, null);
        } else {
            object2 = this;
            n = 0;
            object2 = (ConfigService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
            n = 1;
            boolean flag5 = false;
            if (((ConfigService)object2).BaseCoreGenericHandler(n)) {
                Object object4 = object2;
                flag3 = false;
                ((ConfigService)object4).BaseCoreGenericHandler((Object)("Kick not added to database due to reason: \"" + dZ2.LiteBansModule_31() + '\"'));
            }
        }
        cz2.BaseCoreGenericHandler(InitHandler.c);
        boolean flag6 = false;
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
            object = this;
            flag2 = false;
            ((BroadcastService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(sender, charSequence3);
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

    }

