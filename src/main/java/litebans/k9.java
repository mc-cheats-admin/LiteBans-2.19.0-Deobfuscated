package litebans;

import java.util.ArrayList;
import java.util.Collection;
import litebans.aJ;
import litebans.br;
import litebans.hl;
import litebans.iX;
import litebans.jc_0;
import litebans.kc_0;
import litebans.kq_0;
import litebans.ll;
import litebans.lo_0;
import org.jetbrains.annotations.NotNull;

public static final class k9 {
    private final iX a;
    private byte[] b;
    private static /* synthetic */ String[] c;

    public k9(@NotNull iX iX2, @NotNull byte[] byArray) {
        this.a = iX2;
        this.b = byArray;
        if (this.b == kq_0.a()) {
            k9 k92 = this;
            boolean bl = false;
            k92.b = new byte[8192];
        }
    }

    public /* synthetic */ k9(iX iX2, byte[] byArray, int n, aJ aJ2) {
        if ((n & 2) != 0) {
            byArray = kq_0.a();
        }
        this(iX2, byArray);
    }

    public final byte[] b() {
        return this.b;
    }

    public final void a(@NotNull byte[] byArray) {
        this.b = byArray;
    }

    public final int a(@NotNull br br2, byte by2) {
        if (by2 < 0) {
            this.a.b();
            return 0;
        }
        int n = this.a.b(this.b.length);
        if (br2.j()) {
            if (br2.e().isEmpty()) {
                br2.b(new ArrayList(this.b.length));
            }
            br2.b(ll.a((Collection)br2.e(), (Object)kc_0.a(n, by2)));
            return 0;
        }
        return this.b[n];
    }

    public String toString() {
        return c[0] + lo_0.a(this.b, (CharSequence)c[1], null, null, 0, null, k9::a, 30, null) + ')';
    }

    private static final CharSequence a(byte by2) {
        return c[2] + Integer.toString(by2, jc_0.a(2));
    }

    private static final void a() {
        c = new String[]{hl.a("\u9a89\u9aa2\u9abf\u9aad\u9aa7\u9aa2\u9abb\u9abb\u9aae\u9ab9\u9ae3\u9abf\u9aaa\u9aa9\u9aa7\u9aae\u9af6", 906271435), hl.a("\ua1fc", -1016421936), hl.a("\uaa78\uaa2a", 1309583944)};
    }

    static {
        k9.a();
    }
}

