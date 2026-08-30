package litebans;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_435
extends PluginModule {
    public static final LiteBansModule_247 LiteBansModule_31;
    public static final boolean AsyncBackgroundTask_5;
    private static final Map c;

    public LiteBansModule_435(@Nullable PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void e() {
    }

    public static final /* synthetic */ Map BaseCoreGenericHandler() {
        return c;
    }

    static {
        AsyncBackgroundTask_5 = false;
        LiteBansModule_31 = new LiteBansModule_247(null);
        c = new ConcurrentHashMap();
    }
}

