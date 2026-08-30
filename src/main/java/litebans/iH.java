package litebans;

import java.io.Serializable;
import litebans.cu_0;
import litebans.e0;
import litebans.eE;
import litebans.ew;
import litebans.hl;
import litebans.kv_0;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class iH
implements eE,
Serializable {
    private e0 a;
    private Object b;
    private static /* synthetic */ String[] c;

    public iH(@NotNull e0 e02) {
        ew.a((Object)e02, c[0]);
        this.a = e02;
        this.b = kv_0.a;
    }

    @Override
    public Object a() {
        if (this.b == kv_0.a) {
            e0 e02 = this.a;
            ew.a(e02);
            this.b = e02.a();
            this.a = null;
        }
        return this.b;
    }

    @Override
    public boolean b() {
        return this.b != kv_0.a;
    }

    public String toString() {
        return this.b() ? String.valueOf(this.a()) : c[1];
    }

    private final Object b() {
        return new cu_0(this.a());
    }

    private static final void c() {
        c = new String[]{hl.a("\uad2a\uad2d\uad2a\uad37\uad2a\uad22\uad2f\uad2a\uad39\uad26\uad31", 636988739), hl.a("\u7bf6\u7bdb\u7bc0\u7bc3\u7b9a\u7bcc\u7bdb\u7bd6\u7bcf\u7bdf\u7b9a\u7bd4\u7bd5\u7bce\u7b9a\u7bd3\u7bd4\u7bd3\u7bce\u7bd3\u7bdb\u7bd6\u7bd3\u7bc0\u7bdf\u7bde\u7b9a\u7bc3\u7bdf\u7bce\u7b94", 747731898)};
    }

    static {
        iH.c();
    }
}

