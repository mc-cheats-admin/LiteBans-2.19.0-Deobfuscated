package litebans;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CommandThrottleService
extends PluginModule {
    private final LiteBansModule_161 c = ProxyConnection.BaseCoreGenericHandler(() -> CommandThrottleService.BaseCoreGenericHandler(this));
    private final Set LiteBansModule_31 = Collections.newSetFromMap(new ConcurrentHashMap());
    public CommandThrottleService(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    public final ConfigService e() {
        LiteBansModule_161 eE2 = this.c;
        return (ConfigService)eE2.BaseCoreGenericHandler();
    }

    @Override
    public void e() {
        this.e().e();
        this.LiteBansModule_31.clear();
        long l3 = this.e().LiteBansModule_194().bf();
        if (l3 > 0L) {
            this.plugin.LiteBansModule_31(this.LiteBansModule_31::clear, l3, l3);
        }
    }

    @Override
    public void LiteBansModule_31() {
        this.e();
    }

    public final boolean BaseCoreGenericHandler(byte by2, @Nullable String string) {
        if (string == null) {
            return false;
        }
        if (this.e().LiteBansModule_194().bf() <= 0) {
            return false;
        }
        boolean flag = !this.LiteBansModule_31.add("" + by2 + ':' + string);
        ConfigService configService = this.e();
        int n = 10;
        boolean flag2 = false;
        if (configService.BaseCoreGenericHandler(n)) {
            ConfigService q_03 = configService;
            boolean flag3 = false;
            q_03.BaseCoreGenericHandler((Object)("Throttled! " + string));
        }
        return flag;
    }

    public final void LiteBansModule_31(byte by2, @Nullable String string) {
        if (string == null) {
            return;
        }
        if (this.e().LiteBansModule_194().bf() <= 0) {
            return;
        }
        this.LiteBansModule_31.remove("" + by2 + ':' + string);
    }

    private static final ConfigService BaseCoreGenericHandler(CommandThrottleService v2) {
        return (ConfigService)v2.BaseCoreGenericHandler.BaseCoreGenericHandler(ConfigService.class);
    }

    private static final void AsyncBackgroundTask_5() {
        AsyncBackgroundTask_5 = new String[]{"Throttled! "};
    }

    }

