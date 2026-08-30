package litebans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

public final class NativepatternHandler
implements Serializable {
    public static final LiteralHandler LiteBansModule_31;
    private final Pattern c;
    public NativepatternHandler(@NotNull Pattern pattern) {
        ObjectUtilities.BaseCoreGenericHandler((Object)pattern, "nativePattern");
        this.c = pattern;
    }

    public NativepatternHandler(@NotNull String string) {
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "pattern");
        this(Pattern.compile(string));
    }

    public final boolean BaseCoreGenericHandler(@NotNull CharSequence charSequence) {
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence, "input");
        return this.c.matcher(charSequence).matches();
    }

    public final String LiteBansModule_31(@NotNull CharSequence charSequence, @NotNull String string) {
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence, "input");
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "replacement");
        return this.c.matcher(charSequence).replaceAll(string);
    }

    public final String BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull String string) {
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence, "input");
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "replacement");
        return this.c.matcher(charSequence).replaceFirst(string);
    }

    public final List BaseCoreGenericHandler(@NotNull CharSequence charSequence, int n) {
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence, "input");
        StringUtilities.BaseCoreGenericHandler(n);
        Matcher matcher = this.c.matcher(charSequence);
        if (n == 1 || !matcher.find()) {
            return CollectionUtilities.BaseCoreGenericHandler(((Object)charSequence).toString());
        }
        ArrayList<String> arrayList = new ArrayList<String>(n > 0 ? LiteBansModule_20.AsyncBackgroundTask_5(n, 10) : 10);
        int n2 = 0;
        int n3 = n - 1;
        do {
            arrayList.add(((Object)charSequence.subSequence(n2, matcher.start())).toString());
            n2 = matcher.end();
        } while ((n3 < 0 || arrayList.size() != n3) && matcher.find());
        arrayList.add(((Object)charSequence.subSequence(n2, charSequence.length())).toString());
        return arrayList;
    }

    public String toString() {
        return this.c.toString();
    }

    public final Pattern BaseCoreGenericHandler() {
        return this.c;
    }

    private final Object c() {
        return new PatternHandler(this.c.pattern(), this.c.flags());
    }

    static {
        NativepatternHandler.LiteBansModule_31();
        LiteBansModule_31 = new LiteralHandler(null);
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"nativePattern", "pattern", "pattern", "option", "pattern", "options", "input", "input", "input", "input", "Start index out of bounds: ", ", input length: ", "input", "input", "input", "input", "replacement", "input", "transform", "input", "replacement", "input", "input"};
    }
}

