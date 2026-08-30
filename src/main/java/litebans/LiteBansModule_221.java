package litebans;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_221
extends MessageHandler {
    private final String e;
    private final String AsyncBackgroundTask_5;
    private final String LiteBansModule_194;

    public LiteBansModule_221(@NotNull PlatformPlugin plugin, @NotNull String string, @NotNull String string2, @Nullable String string3) {
        super(plugin);
        this.e = string;
        this.AsyncBackgroundTask_5 = string2;
        this.LiteBansModule_194 = string3;
    }

    @Override
    public void run() {
        boolean flag;
        String string;
        String string2;
        String string3;
        AsyncBackgroundTask_21 s2;
        block4: {
            AsyncBackgroundTask_21 s3;
            s2 = s3 = (AsyncBackgroundTask_21)this.LiteBansModule_240().BaseCoreGenericHandler(AsyncBackgroundTask_21.class);
            string3 = this.e;
            string2 = this.AsyncBackgroundTask_5;
            string = this.LiteBansModule_194;
            boolean flag2 = false;
            Iterable iterable = s2.BaseCoreGenericHandler();
            boolean flag3 = false;
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                flag = false;
            } else {
                for (Object t2 : iterable) {
                    LiteBansModule_95 cp_02 = (LiteBansModule_95)t2;
                    boolean flag4 = false;
                    if (!(ObjectUtilities.BaseCoreGenericHandler((Object)cp_02.c(), (Object)string3) && ObjectUtilities.BaseCoreGenericHandler((Object)cp_02.g(), (Object)string2) && ObjectUtilities.BaseCoreGenericHandler((Object)cp_02.LiteBansModule_31(), (Object)string))) continue;
                    flag = true;
                    break block4;
                }
                flag = false;
            }
        }
        if (!flag) {
            s2.BaseCoreGenericHandler().put(new LiteBansModule_95(string3, string2, string));
        }
    }
}

