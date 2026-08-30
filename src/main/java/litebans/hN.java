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

public static final class hN
implements Serializable {
    public static final ia_0 b;
    private final Pattern c;
    private static /* synthetic */ String[] a;

    public hN(@NotNull Pattern pattern) {
        ew.a((Object)pattern, a[0]);
        this.c = pattern;
    }

    public hN(@NotNull String string) {
        ew.a((Object)string, a[1]);
        this(Pattern.compile(string));
    }

    public final boolean a(@NotNull CharSequence charSequence) {
        ew.a((Object)charSequence, a[6]);
        return this.c.matcher(charSequence).matches();
    }

    public final String b(@NotNull CharSequence charSequence, @NotNull String string) {
        ew.a((Object)charSequence, a[15]);
        ew.a((Object)string, a[16]);
        return this.c.matcher(charSequence).replaceAll(string);
    }

    public final String a(@NotNull CharSequence charSequence, @NotNull String string) {
        ew.a((Object)charSequence, a[19]);
        ew.a((Object)string, a[20]);
        return this.c.matcher(charSequence).replaceFirst(string);
    }

    public final List a(@NotNull CharSequence charSequence, int n) {
        ew.a((Object)charSequence, a[21]);
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
        a = new String[]{hl.a("\ue2d1\ue2de\ue2cb\ue2d6\ue2c9\ue2da\ue2ef\ue2de\ue2cb\ue2cb\ue2da\ue2cd\ue2d1", 31253183), hl.a("\u1e7f\u1e6e\u1e7b\u1e7b\u1e6a\u1e7d\u1e61", -1840964081), hl.a("\u53ef\u53fe\u53eb\u53eb\u53fa\u53ed\u53f1", 1516131231), hl.a("\uf97e\uf961\uf965\uf978\uf97e\uf97f", 2118056209), hl.a("\u8c04\u8c15\u8c00\u8c00\u8c11\u8c06\u8c1a", 853642356), hl.a("\ue378\ue367\ue363\ue37e\ue378\ue379\ue364", -2114591977), hl.a("\u94a4\u94a3\u94bd\u94b8\u94b9", 1771017421), hl.a("\u13d0\u13d7\u13c9\u13cc\u13cd", -263253063), hl.a("\u0d90\u0d97\u0d89\u0d8c\u0d8d", 1867648505), hl.a("\uc617\uc610\uc60e\uc60b\uc60a", -1853700482), hl.a("\ubac8\ubaef\ubafa\ubae9\ubaef\ubabb\ubaf2\ubaf5\ubaff\ubafe\ubae3\ubabb\ubaf4\ubaee\ubaef\ubabb\ubaf4\ubafd\ubabb\ubaf9\ubaf4\ubaee\ubaf5\ubaff\ubae8\ubaa1\ubabb", -498419045), hl.a("\ud4a9\ud4a5\ud4ec\ud4eb\ud4f5\ud4f0\ud4f1\ud4a5\ud4e9\ud4e0\ud4eb\ud4e2\ud4f1\ud4ed\ud4bf\ud4a5", -1677863803), hl.a("\u1c07\u1c00\u1c1e\u1c1b\u1c1a", -1610212242), hl.a("\u9650\u9657\u9649\u964c\u964d", -213150151), hl.a("\u8edf\u8ed8\u8ec6\u8ec3\u8ec2", 185634486), hl.a("\ud1b9\ud1be\ud1a0\ud1a5\ud1a4", 2054279632), hl.a("\ud2e6\ud2f1\ud2e4\ud2f8\ud2f5\ud2f7\ud2f1\ud2f9\ud2f1\ud2fa\ud2e0", -292105580), hl.a("\udfd2\udfd5\udfcb\udfce\udfcf", 428531643), hl.a("\u48aa\u48ac\u48bf\u48b0\u48ad\u48b8\u48b1\u48ac\u48b3", -183875362), hl.a("\u8aff\u8af8\u8ae6\u8ae3\u8ae2", 756779670), hl.a("\u0b6f\u0b78\u0b6d\u0b71\u0b7c\u0b7e\u0b78\u0b70\u0b78\u0b73\u0b69", 12127005), hl.a("\u61e4\u61e3\u61fd\u61f8\u61f9", 1649893773), hl.a("\u1a4f\u1a48\u1a56\u1a53\u1a52", 898374182)};
    }
}

