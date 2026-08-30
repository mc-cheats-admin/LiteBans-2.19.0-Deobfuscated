package litebans;

import litebans.bT;
import litebans.di_0;
import litebans.dp;
import litebans.eq_0;
import litebans.ew;
import litebans.hl;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class jJ
implements CharSequence {
    private final di_0 b;
    private String d;
    private final byte c;
    private static /* synthetic */ String[] a;

    public jJ(@NotNull di_0 di_02, @Nullable String string) {
        byte by2;
        this.b = di_02;
        this.d = string;
        this.d = eq_0.f.c(this.d);
        jJ jJ2 = this;
        boolean bl = false;
        if (ew.a((Object)jJ2.d, (Object)"__ALL__")) {
            by2 = 0;
        } else {
            String string2 = jJ2.d().u();
            byte by3 = 1;
            if (jJ2.d != null && !eq_0.f.b(jJ2.d)) {
                by3 = (byte)(by3 + 1);
            }
            if (jJ2.b.l() && !ew.a((Object)string2, (Object)jJ2.d)) {
                by3 = (byte)(by3 + 1);
            }
            by2 = by3;
        }
        this.c = by2;
    }

    public final String c() {
        return this.d;
    }

    public final w d() {
        return (w)this.b.a(w.class);
    }

    public void a(@NotNull bT bT2) {
        if (this.c >= 2) {
            bT2.a(this.d);
        }
        if (this.c >= 3) {
            bT2.a(this.d().u());
        }
    }

    public int a() {
        return this.toString().length();
    }

    public char a(int n) {
        return this.toString().charAt(n);
    }

    @Override
    public CharSequence subSequence(int n, int n2) {
        return this.toString().subSequence(n, n2);
    }

    @Override
    public String toString() {
        String string;
        switch (this.c) {
            case 0: {
                string = "";
                break;
            }
            case 1: {
                string = " AND(server_scope='*')";
                break;
            }
            case 2: {
                string = " AND(server_scope='*' OR server_scope=?)";
                break;
            }
            case 3: {
                string = " AND(server_scope='*' OR server_scope=? OR server_scope=?)";
                break;
            }
            default: {
                throw new dp();
            }
        }
        return string;
    }

    @Override
    public final int length() {
        return this.a();
    }

    @Override
    public final char charAt(int n) {
        return this.a(n);
    }

    private static final void b() {
        a = new String[]{"__ALL__", "__ALL__", "", " AND(server_scope='*')", " AND(server_scope='*' OR server_scope=?)", " AND(server_scope='*' OR server_scope=? OR server_scope=?)"};
    }

    static {
        jJ.b();
    }
}

