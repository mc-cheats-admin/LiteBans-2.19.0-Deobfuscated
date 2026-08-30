package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import org.jetbrains.annotations.NotNull;

public final class DupeIPCommand
extends AbstractCommand {
    public DupeIPCommand(@NotNull PlatformPlugin plugin) {
        super("dupeip", plugin);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper v1, @NotNull String[] v2) {
        block9: {
            var4_3 = this;
            var5_5 = false;
            var3_7 = CommandArgumentUtils.BaseCoreGenericHandler(var4_3, (String)ArrayUtilities.LiteBansModule_31(v2));
            var5_6 = this;
            v6 = false;
            var7_9 = var5_6;
            var8_11 = false;
            var4_4 = LiteBansModule_389.BaseCoreGenericHandler(v2, 1, ((ConfigService)var7_9.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().HoverTextFormatter());
            var5_6 = this;
            v6 = false;
            var5_6 = (DatabaseMonitorService)var5_6.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            v6 = false;
            try {
                var7_9 = var5_6.LiteBansModule_194();
                var8_12 = (Closeable)var7_9;
                var9_13 = null;
                try {
                    block10: {
                        block11: {
                            var10_14 = (LiteBansModule_82)var8_12;
                            var11_15 = false;
                            var12_18 = var7_9;
                            var13_19 = false;
                            var14_20 = new LiteBansModule_206(var3_7, (LiteBansModule_82)var12_18, v1, false, var4_4).i();
                            if (var14_20.e()) break block10;
                            if (v1.LiteBansModule_194()) break block11;
                            var15_21 = this;
                            var16_22 = false;
                            var17_25 = var15_21;
                            var18_27 = false;
                            if (((ConfigService)var17_25.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().O()) ** GOTO lbl-1000
                        }
                        var15_21 = v1;
                        var16_23 = "litebans.dupeip.viewip";
                        var17_26 = false;
                        var18_28 = var15_21;
                        var19_29 = false;
                        if (var18_28.e(var16_23) == false) lbl-1000:
                        // 2 sources

                        {
                            v0 = true;
                        } else {
                            v0 = false;
                        }
                        var20_30 = v0;
                        var15_21 = var14_20.LiteBansModule_194() != false ? MessageKey.PoolBase.BaseCoreGenericHandler("num", (Object)var14_20.Utf8Handler_2()) : var14_20.GnuSparseMapHandler();
                        var16_24 = var20_30 != false ? (CharSequence)MessageKey.P : (CharSequence)MessageKey.BanHandler_4;
                        v1 = GeoIPLookupService.BaseCoreGenericHandler(var16_24, (CharSequence)"ip", var15_21);
                        v2 = var14_20.LiteBansModule_401();
                        ObjectUtilities.BaseCoreGenericHandler(v2);
                        var16_24 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)var12_18, v1, v2, false, 2, null);
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, v1, var16_24, null, 4, null);
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, v1, var14_20.c(), null, 4, null);
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, v1, MessageKey.HikariPool, null, 4, null);
                    }
                    var10_14 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable var11_16) {
                    var9_13 = var11_16;
                    throw var11_16;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(var8_12, var9_13);
                }
            }
            catch (SQLException v7) {
                if (var5_6.LiteBansModule_31(v7)) break block9;
                throw v7;
            }
        }
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"dupeip", "litebans.dupeip.viewip", "num", "ip"};
    }

    }

