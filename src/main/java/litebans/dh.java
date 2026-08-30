package litebans;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import litebans.aJ;
import litebans.a_;
import litebans.bz;
import litebans.hl;
import org.jetbrains.annotations.Nullable;

public static final class dh {
    private static /* synthetic */ String[] a;

    private dh() {
    }

    public final List a() {
        return a_.d();
    }

    public final a_ a(@Nullable String string) {
        Object v1;
        block2: {
            String string2 = string;
            if (string2 == null) {
                return null;
            }
            Object object = string2;
            String string3 = bz.c(((String)object).toLowerCase(Locale.ROOT), 's', null, 2, null);
            object = a_.l.a();
            boolean bl = true;
            boolean bl2 = false;
            Object object2 = object;
            Iterator iterator = object2.iterator();
            while (iterator.hasNext()) {
                Object t2;
                Object t3 = t2 = iterator.next();
                boolean bl3 = false;
                if (!bz.a(string3, String.valueOf(t3), bl)) continue;
                v1 = t2;
                break block2;
            }
            v1 = null;
        }
        return v1;
    }

    public /* synthetic */ dh(aJ aJ2) {
        this();
    }

    private static final void b() {
        a = new String[]{hl.a("\u7d11\u7d0a", -850297500), hl.a("\ua5e3\ua5f2\ua5fa\ua5e7\ua5c8", -835869289), hl.a("\u33d1\u33c0\u33c8\u33d5\u33fa\u33cc\u33d5", 88748965), hl.a("\u10d7\u10ce", -849276738), hl.a("\u772d\u7736", 1092187992), hl.a("\u8806\u881d", 1626835059), hl.a("\ud61e\ud60f\ud607\ud61a\ud635", -2037787030), hl.a("\uf5e4\uf5f5\uf5fd\uf5e0\uf5cf\uf5f9\uf5e0", -1612647024), hl.a("\u4d73\u4d6a", 2130136346), hl.a("\u531d\u5306", 1826247528), hl.a("\u7d8c\u7d96\u7d93\u7d9a\u7d91\u7d8b\u7da0", -1246986753)};
    }

    static {
        dh.b();
    }
}

