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

public static class jJ
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
        if (ew.a((Object)jJ2.d, (Object)a[0])) {
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
                string = a[2];
                break;
            }
            case 1: {
                string = a[3];
                break;
            }
            case 2: {
                string = a[4];
                break;
            }
            case 3: {
                string = a[5];
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
        a = new String[]{hl.a("\ued17\ued17\ued09\ued04\ued04\ued17\ued17", -743838392), hl.a("\u69cb\u69cb\u69d5\u69d8\u69d8\u69cb\u69cb", 227174804), hl.a("", 172800466), hl.a("\u7fdf\u7fbe\u7fb1\u7fbb\u7fd7\u7f8c\u7f9a\u7f8d\u7f89\u7f9a\u7f8d\u7fa0\u7f8c\u7f9c\u7f90\u7f8f\u7f9a\u7fc2\u7fd8\u7fd5\u7fd8\u7fd6", -1821540353), hl.a("\u417b\u411a\u4115\u411f\u4173\u4128\u413e\u4129\u412d\u413e\u4129\u4104\u4128\u4138\u4134\u412b\u413e\u4166\u417c\u4171\u417c\u417b\u4114\u4109\u417b\u4128\u413e\u4129\u412d\u413e\u4129\u4104\u4128\u4138\u4134\u412b\u413e\u4166\u4164\u4172", -810139301), hl.a("\uad33\uad52\uad5d\uad57\uad3b\uad60\uad76\uad61\uad65\uad76\uad61\uad4c\uad60\uad70\uad7c\uad63\uad76\uad2e\uad34\uad39\uad34\uad33\uad5c\uad41\uad33\uad60\uad76\uad61\uad65\uad76\uad61\uad4c\uad60\uad70\uad7c\uad63\uad76\uad2e\uad2c\uad33\uad5c\uad41\uad33\uad60\uad76\uad61\uad65\uad76\uad61\uad4c\uad60\uad70\uad7c\uad63\uad76\uad2e\uad2c\uad3a", -1404916461)};
    }

    static {
        jJ.b();
    }
}

