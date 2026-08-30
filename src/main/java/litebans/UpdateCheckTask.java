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
                    var4_2 = AbstractCommand.AsyncBackgroundTask_5;
                    var5_3 = "update";
                    var6_4 = false;
                    var7_5 = var5_3;
                    switch (var7_5.hashCode()) {
                        case -1320563219: {
                            if (var7_5.equals("dupeip")) break;
                            ** break;
                        }
                        case 712910260: {
                            if (!var7_5.equals("staffhistory")) {
                                ** break;
                            }
                            break block8;
                        }
                        case 926934164: {
                            if (!var7_5.equals("history")) {
                                ** break;
                            }
                            break block9;
                        }
                    }
                    var8_6 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                    v0 = var8_6;
                    break block10;
                }
                var8_7 = new String[]{"hist", "litebans:history"};
                v0 = var8_7;
                break block10;
            }
            var8_8 = new String[]{"staffhist", "litebans:staffhistory"};
            v0 = var8_8;
            break block10;
lbl30:
            // 4 sources

            var8_9 = new String[]{"litebans:" + (String)var5_3};
            v0 = var8_9;
        }
        var3_10 = v0;
        var2_11 = new LiteBansModule_15(new LiteBansModule_403(v1, Arrays.copyOf(var3_10, ((String[])var3_10).length)).LiteBansModule_31(), "disabled", "false", null);
        v1.BaseCoreGenericHandler(var2_11);
        var3_10 = ((DatabaseMonitorService)this.LiteBansModule_31.BaseCoreGenericHandler(DatabaseMonitorService.class)).LiteBansModule_401();
        if (var3_10 != null) {
            var3_10.BaseCoreGenericHandler(var2_11.e());
            var3_10.LiteBansModule_31(var2_11.AsyncBackgroundTask_5());
        }
        var5_3 = this.LiteBansModule_31.HoverTextFormatter();
        var6_4 = false;
        var7_5 = "[LiteBans] " + BlackHandler.ServerSyncService;
        var5_3.BaseCoreGenericHandler(var7_5 + "======================================");
        var5_3.BaseCoreGenericHandler(var7_5 + "|| " + BlackHandler.c + "Plugin access has been disabled! " + BlackHandler.ServerSyncService + "||");
        var5_3.BaseCoreGenericHandler(var7_5 + "|| " + BlackHandler.AsyncBackgroundTask_5 + "If you have bought LiteBans,     " + BlackHandler.ServerSyncService + "||");
        var5_3.BaseCoreGenericHandler(var7_5 + "|| " + BlackHandler.AsyncBackgroundTask_5 + "contact Ruan on SpigotMC + " + BlackHandler.ServerSyncService + "||");
        var5_3.BaseCoreGenericHandler(var7_5 + "======================================");
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"update", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "disabled", "false", "[LiteBans] ", "======================================", "|| ", "Plugin access has been disabled! ", "||", "|| ", "If you have bought LiteBans,     ", "||", "|| ", "contact Ruan on ", "||", "======================================"};
    }

    }

