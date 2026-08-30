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
{
                    v1 = (ConfigService)this.LiteBansModule_31.BaseCoreGenericHandler(ConfigService.class);
                    ObjectUtilities.BaseCoreGenericHandler(v1);
                    arg1 = AbstractCommand.AsyncBackgroundTask_5;
                    arg2 = "update";
                    arg3 = arg2;
                    switch (arg3.hashCode()) {
                        case -1320563219: {
                            if (arg3.equals("dupeip")) break;
                            break;
                        }
                        case 712910260: {
                            if (!arg3.equals("staffhistory")) {
                                break;
                            }
                            break;
                        }
                        case 926934164: {
                            if (!arg3.equals("history")) {
                                break;
                            }
                            break;
}
                    arg4 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                    v0 = arg4;
                    break;
                }
                arg5 = new String[]{"hist", "litebans:history"};
                v0 = arg5;
                break;
            }
            arg6 = new String[]{"staffhist", "litebans:staffhistory"};
            v0 = arg6;
            break;
                        arg7 = new String[]{"litebans:" + (String)arg2};
            v0 = arg7;
        }
        arg8 = v0;
        arg9 = new LiteBansModule_15(new LiteBansModule_403(v1, Arrays.copyOf(arg8, ((String[])arg8).length)).LiteBansModule_31(), "disabled", "false", null);
        v1.BaseCoreGenericHandler(arg9);
        arg8 = ((DatabaseMonitorService)this.LiteBansModule_31.BaseCoreGenericHandler(DatabaseMonitorService.class)).LiteBansModule_401();
        if (arg8 != null) {
            arg8.BaseCoreGenericHandler(arg9.e());
            arg8.LiteBansModule_31(arg9.AsyncBackgroundTask_5());
        }
        arg2 = this.LiteBansModule_31.HoverTextFormatter();
        arg3 = "[LiteBans] " + BlackHandler.ServerSyncService;
        arg2.BaseCoreGenericHandler(arg3 + "======================================");
        arg2.BaseCoreGenericHandler(arg3 + "|| " + BlackHandler.c + "Plugin access has been disabled! " + BlackHandler.ServerSyncService + "||");
        arg2.BaseCoreGenericHandler(arg3 + "|| " + BlackHandler.AsyncBackgroundTask_5 + "If you have bought LiteBans,     " + BlackHandler.ServerSyncService + "||");
        arg2.BaseCoreGenericHandler(arg3 + "|| " + BlackHandler.AsyncBackgroundTask_5 + "contact Ruan on SpigotMC + " + BlackHandler.ServerSyncService + "||");
        arg2.BaseCoreGenericHandler(arg3 + "======================================");
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"update", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "disabled", "false", "[LiteBans] ", "======================================", "|| ", "Plugin access has been disabled! ", "||", "|| ", "If you have bought LiteBans,     ", "||", "|| ", "contact Ruan on ", "||", "======================================"};
}

