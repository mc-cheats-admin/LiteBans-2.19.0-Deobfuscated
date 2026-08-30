package litebans;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

public final class UpdateCheckTask
implements Runnable {
    private final PlatformPlugin LiteBansModule_31;
        public UpdateCheckTask(@NotNull PlatformPlugin plugin) {
        this.LiteBansModule_31 = plugin;
    }

    @Override
    public void run() {
        block10: {
            block8: {
                block9: {
                    v1 = (ConfigService)this.LiteBansModule_31.BaseCoreGenericHandler(ConfigService.class);
                    ObjectUtilities.BaseCoreGenericHandler(v1);
                    v2 = AbstractCommand.AsyncBackgroundTask_5;
                    v3 = "update";
                    v4 = v3;
                    switch (v4.hashCode()) {
                        case -1320563219: {
                            if (v4.equals("dupeip")) break;
                            break;
                        }
                        case 712910260: {
                            if (!v4.equals("staffhistory")) {
                                break;
                            }
                            break block8;
                        }
                        case 926934164: {
                            if (!v4.equals("history")) {
                                break;
                            }
                            break block9;
                        }
                    }
                    v5 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                    v0 = v5;
                    break block10;
                }
                v6 = new String[]{"hist", "litebans:history"};
                v0 = v6;
                break block10;
            }
            v7 = new String[]{"staffhist", "litebans:staffhistory"};
            v0 = v7;
            break block10;
                        v8 = new String[]{"litebans:" + (String)v3};
            v0 = v8;
        }
        v9 = v0;
        v10 = new LiteBansModule_15(new LiteBansModule_405(v1, Arrays.copyOf(v9, ((String[])v9).length)).LiteBansModule_31(), "disabled", "false", null);
        v1.BaseCoreGenericHandler(v10);
        v9 = ((DatabaseMonitorService)this.LiteBansModule_31.BaseCoreGenericHandler(DatabaseMonitorService.class)).LiteBansModule_403();
        if (v9 != null) {
            v9.BaseCoreGenericHandler(v10.e());
            v9.LiteBansModule_31(v10.AsyncBackgroundTask_5());
        }
        v3 = this.LiteBansModule_31.HoverTextFormatter();
        v4 = "[LiteBans] " + BlackHandler.ServerSyncService;
        v3.BaseCoreGenericHandler(v4 + "======================================");
        v3.BaseCoreGenericHandler(v4 + "|| " + BlackHandler.c + "Plugin access has been disabled! " + BlackHandler.ServerSyncService + "||");
        v3.BaseCoreGenericHandler(v4 + "|| " + BlackHandler.AsyncBackgroundTask_5 + "If you have bought LiteBans,     " + BlackHandler.ServerSyncService + "||");
        v3.BaseCoreGenericHandler(v4 + "|| " + BlackHandler.AsyncBackgroundTask_5 + "contact Ruan on SpigotMC + " + BlackHandler.ServerSyncService + "||");
        v3.BaseCoreGenericHandler(v4 + "======================================");
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"update", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "disabled", "false", "[LiteBans] ", "======================================", "|| ", "Plugin access has been disabled! ", "||", "|| ", "If you have bought LiteBans,     ", "||", "|| ", "contact Ruan on ", "||", "======================================"};
    }

    static {
        UpdateCheckTask.BaseCoreGenericHandler();
    }
}

