package litebans;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import litebans.aJ;
import litebans.bz;
import litebans.ew;
import litebans.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class h6 {
    private h6() {
    }

    public final String a(@NotNull Object object, @NotNull Object object2, @Nullable Object object3) {
        return this.a(object.toString(), object2.toString(), object3);
    }

    public final String a(@NotNull CharSequence charSequence, @NotNull String string, @Nullable Object object) {
        if (!bz.a(charSequence, (CharSequence)string, false, 2, null)) {
            return ((Object)charSequence).toString();
        }
        Pattern pattern = (Pattern)x.a().get(string);
        if (pattern == null) {
            pattern = this.a(string);
        }
        String string2 = pattern.matcher(charSequence).replaceAll(Matcher.quoteReplacement(String.valueOf(object)));
        ew.a((Object)string2);
        return string2;
    }

    private final Pattern a(String string) {
        Pattern pattern = Pattern.compile(string, 16);
        Map map = x.a();
        if (map.size() > 512) {
            map.clear();
        }
        map.put(string, pattern);
        ew.a(pattern);
        return pattern;
    }

    public /* synthetic */ h6(aJ aJ2) {
        this();
    }
}

