package litebans;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_246 {
    private LiteBansModule_246() {
    }

    public final String BaseCoreGenericHandler(@NotNull Object object, @NotNull Object object2, @Nullable Object object3) {
        return this.plugin(object.toString(), object2.toString(), object3);
    }

    public final String BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull String string, @Nullable Object object) {
        if (!StringUtilities.BaseCoreGenericHandler(charSequence, (CharSequence)string, false, 2, null)) {
            return ((Object)charSequence).toString();
        }
        Pattern pattern = (Pattern)LiteBansModule_433.BaseCoreGenericHandler().get(string);
        if (pattern == null) {
            pattern = this.plugin(string);
        }
        String string2 = pattern.matcher(charSequence).replaceAll(Matcher.quoteReplacement(String.valueOf(object)));
        ObjectUtilities.BaseCoreGenericHandler((Object)string2);
        return string2;
    }

    private final Pattern BaseCoreGenericHandler(String string) {
        Pattern pattern = Pattern.compile(string, 16);
        Map map = LiteBansModule_433.BaseCoreGenericHandler();
        if (map.size() > 512) {
            map.clear();
        }
        map.put(string, pattern);
        ObjectUtilities.BaseCoreGenericHandler(pattern);
        return pattern;
    }

    public /* synthetic */ LiteBansModule_246(LiteBansModule_14 aJ2) {
        this();
    }
}

