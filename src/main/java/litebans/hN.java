package litebans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import litebans.as_0;
import litebans.bz;
import litebans.ew;
import litebans.hl;
import litebans.ia_0;
import litebans.k8;
import litebans.ll;
import org.jetbrains.annotations.NotNull;

public final class hN
implements Serializable {
    public static final ia_0 b;
    private final Pattern c;
    private static /* synthetic */ String[] a;

    public hN(@NotNull Pattern pattern) {
        ew.a((Object)pattern, "nativePattern");
        this.c = pattern;
    }

    public hN(@NotNull String string) {
        ew.a((Object)string, "pattern");
        this(Pattern.compile(string));
    }

    public final boolean a(@NotNull CharSequence charSequence) {
        ew.a((Object)charSequence, "input");
        return this.c.matcher(charSequence).matches();
    }

    public final String b(@NotNull CharSequence charSequence, @NotNull String string) {
        ew.a((Object)charSequence, "input");
        ew.a((Object)string, "replacement");
        return this.c.matcher(charSequence).replaceAll(string);
    }

    public final String a(@NotNull CharSequence charSequence, @NotNull String string) {
        ew.a((Object)charSequence, "input");
        ew.a((Object)string, "replacement");
        return this.c.matcher(charSequence).replaceFirst(string);
    }

    public final List a(@NotNull CharSequence charSequence, int n) {
        ew.a((Object)charSequence, "input");
        bz.a(n);
        Matcher matcher = this.c.matcher(charSequence);
        if (n == 1 || !matcher.find()) {
            return ll.a(((Object)charSequence).toString());
        }
        ArrayList<String> arrayList = new ArrayList<String>(n > 0 ? as_0.d(n, 10) : 10);
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

    public final Pattern a() {
        return this.c;
    }

    private final Object c() {
        return new k8(this.c.pattern(), this.c.flags());
    }

    static {
        hN.b();
        b = new ia_0(null);
    }

    private static final void b() {
        a = new String[]{"nativePattern", "pattern", "pattern", "option", "pattern", "options", "input", "input", "input", "input", "Start index out of bounds: ", ", input length: ", "input", "input", "input", "input", "replacement", "input", "transform", "input", "replacement", "input", "input"};
    }
}

