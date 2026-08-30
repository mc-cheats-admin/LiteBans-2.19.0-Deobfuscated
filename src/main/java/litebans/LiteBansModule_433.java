package litebans;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_433
extends PluginModule {
    public static final LiteBansModule_246 LiteBansModule_31;
    public static final boolean AsyncBackgroundTask_5;
    private static final Map c;

    public LiteBansModule_433(@Nullable PlatformPlugin plugin) {
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
        LiteBansModule_31 = new LiteBansModule_246(null);
        c = new ConcurrentHashMap();
    }
}

