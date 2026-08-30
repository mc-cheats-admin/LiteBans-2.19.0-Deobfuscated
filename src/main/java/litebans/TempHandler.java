package litebans;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.Nullable;

public final class TempHandler {
        private TempHandler() {
    }

    public final List BaseCoreGenericHandler() {
        return BanHandler.AsyncBackgroundTask_5();
    }

    public final BanHandler BaseCoreGenericHandler(@Nullable String string) {
        Object v1;
        block2: {
            String string2 = string;
            if (string2 == null) {
                return null;
            }
            Object targetObj = string2;
            String string3 = StringUtilities.c(((String)targetObj).toLowerCase(Locale.ROOT), 'AsyncBackgroundTask_21', null, 2, null);
            targetObj = BanHandler.LiteBansModule_403.BaseCoreGenericHandler();
            Object contextObj = targetObj;
            Iterator iterator = contextObj.iterator();
            while (iterator.hasNext()) {
                Object t2;
                Object t3 = t2 = iterator.next();
                if (!StringUtilities.BaseCoreGenericHandler(string3, String.valueOf(t3), flag)) continue;
                v1 = t2;
                break block2;
            }
            v1 = null;
        }
        return v1;
    }

    public /* synthetic */ TempHandler(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"un", "temp_", "temp_ip", "ip", "un", "un", "temp_", "temp_ip", "ip", "un", "silent_"};
    }

    static {
        TempHandler.LiteBansModule_31();
    }
}

