package litebans;

import java.io.Serializable;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

static final class PatternHandler
implements Serializable {
    public static final LiteBansModule_12 e;
    private final String LiteBansModule_31;
    private final int c;
    private static final long BaseCoreGenericHandler;
    public PatternHandler(@NotNull String string, int n) {
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "pattern");
        this.LiteBansModule_31 = string;
        this.c = n;
    }

    private final Object LiteBansModule_31() {
        return new NativepatternHandler(Pattern.compile(this.LiteBansModule_31, this.c));
    }

    static {
        BaseCoreGenericHandler = 0L;
        PatternHandler.BaseCoreGenericHandler();
        e = new LiteBansModule_12(null);
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"pattern"};
    }
}

