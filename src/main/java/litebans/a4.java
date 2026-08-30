package litebans;

import litebans.hl;
import org.jetbrains.annotations.Nullable;

public static final class a4 {
    private final boolean a;
    private static /* synthetic */ String[] b;

    public a4(boolean bl) {
        this.a = bl;
    }

    public final boolean a() {
        return this.a;
    }

    public String toString() {
        return b[0] + this.a + ')';
    }

    public int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a4)) {
            return false;
        }
        a4 a42 = (a4)object;
        return this.a == a42.a;
    }

    private static final void b() {
        b = new String[]{hl.a("\u2262\u2257\u224a\u2250\u2255\u2269\u224c\u2248\u224c\u2251\u226a\u2251\u224d\u2240\u2257\u220d\u2251\u2240\u2248\u2255\u2249\u2244\u2251\u2240\u226a\u224b\u2249\u225c\u2218", 1394614821)};
    }

    static {
        a4.b();
    }
}

