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
            v3 = this;
            v4 = CommandArgumentUtils.BaseCoreGenericHandler(v3, (String)ArrayUtilities.LiteBansModule_31(v2));
            v5 = this;
            v6 = v5;
            v7 = LiteBansModule_391.BaseCoreGenericHandler(v2, 1, ((ConfigService)v6.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().HoverTextFormatter());
            v5 = this;
            v5 = (DatabaseMonitorService)v5.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
            try {
                v6 = v5.LiteBansModule_195();
                v8 = (Closeable)v6;
                try {
                    block10: {
                        block11: {
                            v9 = (LiteBansModule_83)v8;
                            v10 = v6;
                            v11 = new LiteBansModule_207(v4, (LiteBansModule_83)v10, v1, false, v7).i();
                            if (v11.e()) break block10;
                            if (v1.LiteBansModule_195()) break block11;
                            v12 = this;
                            v13 = v12;
                            if (((ConfigService)v13.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().O()) ** GOTO lbl-1000
                        }
                        v12 = v1;
                        v14 = "litebans.dupeip.viewip";
                        v15 = v12;
                        if (v15.e(v14) == false) lbl-1000:
                                                {
                            v0 = true;
                        } else {
                            v0 = false;
                        }
                        v16 = v0;
                        v12 = v11.LiteBansModule_195() != false ? MessageKey.PoolBase.BaseCoreGenericHandler("num", (Object)v11.Utf8Handler_2()) : v11.GnuSparseMapHandler();
                        v17 = v16 != false ? (CharSequence)MessageKey.P : (CharSequence)MessageKey.BanHandler_4;
                        v1 = GeoIPLookupService.BaseCoreGenericHandler(v17, (CharSequence)"ip", v12);
                        v2 = v11.LiteBansModule_403();
                        ObjectUtilities.BaseCoreGenericHandler(v2);
                        v17 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)v10, v1, v2, false, 2, null);
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, v1, v17, null, 4, null);
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, v1, v11.c(), null, 4, null);
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, v1, MessageKey.HikariPool, null, 4, null);
                    }
                    v9 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable v18) {
                    v19 = v18;
                    throw v18;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(v8, v19);
                }
            }
            catch (SQLException v20) {
                if (v5.LiteBansModule_31(v20)) break block9;
                throw v20;
            }
        }
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"dupeip", "litebans.dupeip.viewip", "num", "ip"};
    }

    static {
        DupeIPCommand.BaseCoreGenericHandler();
    }
}

