package litebans;

import litebans.aJ;
import litebans.bT;
import litebans.eo_0;
import litebans.ew;
import litebans.gZ;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class dQ {
    private static /* synthetic */ String[] a;

    private dQ() {
    }

    public final eo_0 a() {
        return gZ.a();
    }

    public final int b() {
        return gZ.e();
    }

    public final void a(int n) {
        gZ.a(n);
    }

    public final eo_0 c() {
        return this.a();
    }

    public final eo_0 a(@NotNull eo_0 eo_02) {
        return eo_02;
    }

    public final eo_0 b(@NotNull eo_0 eo_02, @NotNull eo_0 eo_03) {
        return this.a(arg_0 -> dQ.a(eo_02, eo_03, arg_0));
    }

    public final eo_0 a(@NotNull eo_0 eo_02, @NotNull eo_0 eo_03) {
        if (ew.a((Object)eo_02, this.a())) {
            return eo_03;
        }
        return this.b(eo_02, eo_03);
    }

    public final String a(@NotNull gZ gZ2, @NotNull String string) {
        CharSequence charSequence;
        String string2 = string;
        boolean bl = ew.a((Object)string, (Object)"name");
        StringBuilder stringBuilder = new StringBuilder().append(string2);
        if (bl) {
            CharSequence charSequence2 = gZ2.c().h();
            CharSequence charSequence3 = "?";
            boolean bl2 = false;
            charSequence = "" + charSequence2 + charSequence3;
        } else {
            charSequence = "=?";
        }
        string2 = stringBuilder.append((Object)charSequence).toString();
        if (bl) {
            string2 = string2 + gZ2.c().l();
        }
        return string2;
    }

    private static final bT a(eo_0 eo_02, eo_0 eo_03, bT bT2) {
        eo_02.a(bT2);
        return (bT)eo_03.a(bT2);
    }

    public /* synthetic */ dQ(aJ aJ2) {
        this();
    }

    private static final void d() {
        a = new String[]{"name", "?", "=?", " WHERE ", "WHERE", " WHERE ", "AND", " WHERE ", "WHERE", " WHERE ", "Player name \"", "\" length > ", "UUID \"", "\" length > 36"};
    }

    static {
        dQ.d();
    }
}

