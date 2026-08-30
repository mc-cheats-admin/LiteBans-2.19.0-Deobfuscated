package litebans;

import java.sql.ResultSet;
import litebans.aJ;
import litebans.aR;
import litebans.a_;
import litebans.bT;
import litebans.bz;
import litebans.ch;
import litebans.cj_0;
import litebans.df_0;
import litebans.eS;
import litebans.eo_0;
import litebans.ew;
import litebans.gZ;
import litebans.h3;
import litebans.hl;
import litebans.jJ;
import litebans.jR;
import litebans.kL;
import litebans.kx_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class hc
implements CharSequence {
    public static final df_0 j;
    private final ch g;
    private final String f;
    private final jR a;
    private final boolean k;
    private final jJ l;
    private final String b;
    private final boolean e;
    private final Number h;
    private final Number c;
    private eo_0 d;
    private static /* synthetic */ String[] i;

    public hc(@NotNull ch ch2, @Nullable String string, @NotNull jR jR2, boolean bl, @NotNull jJ jJ2, @Nullable String string2, boolean bl2, @NotNull Number number, @NotNull Number number2) {
        this.g = ch2;
        this.f = string;
        this.a = jR2;
        this.k = bl;
        this.l = jJ2;
        this.b = string2;
        this.e = bl2;
        this.h = number;
        this.c = number2;
        this.d = gZ.l.c();
    }

    public /* synthetic */ hc(ch ch2, String string, jR jR2, boolean bl, jJ jJ2, String string2, boolean bl2, Number number, Number number2, int n, aJ aJ2) {
        if ((n & 4) != 0) {
            jR2 = jR.g;
        }
        if ((n & 8) != 0) {
            bl = false;
        }
        if ((n & 0x20) != 0) {
            string2 = null;
        }
        if ((n & 0x40) != 0) {
            bl2 = true;
        }
        if ((n & 0x80) != 0) {
            number = 0;
        }
        if ((n & 0x100) != 0) {
            number2 = 0;
        }
        this(ch2, string, jR2, bl, jJ2, string2, bl2, number, number2);
    }

    public final String c() {
        return this.f;
    }

    public final eo_0 a() {
        return this.d;
    }

    public final void a(@NotNull eo_0 eo_02) {
        this.d = eo_02;
    }

    public int b() {
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
        Object object;
        this.e();
        CharSequence charSequence = "";
        charSequence = this.b(this.c(this.a(charSequence)));
        if (this.b != null) {
            object = this.e ? "DESC" : "ASC";
            CharSequence charSequence2 = charSequence;
            CharSequence charSequence3 = " ORDER BY " + this.b + ' ' + (String)object;
            boolean bl = false;
            charSequence = "" + charSequence2 + charSequence3;
        }
        object = this.h;
        int n = 0;
        boolean bl = false;
        if (ew.a(((Number)object).intValue(), n) > 0) {
            object = charSequence;
            CharSequence charSequence4 = " LIMIT ? OFFSET ?";
            bl = false;
            charSequence = "" + object + charSequence4;
            this.d = gZ.l.a(this.d, arg_0 -> hc.b(this, arg_0));
        }
        return ((Object)charSequence).toString();
    }

    private final CharSequence c(CharSequence charSequence) {
        if (this.k) {
            this.d = gZ.l.a(this.d, hc::a);
            return this.a(charSequence, (CharSequence)i[5]);
        }
        return charSequence;
    }

    private final CharSequence b(CharSequence charSequence) {
        this.d = gZ.l.a(this.d, arg_0 -> hc.a(this, arg_0));
        CharSequence charSequence2 = charSequence;
        CharSequence charSequence3 = this.l;
        boolean bl = false;
        return "" + charSequence2 + charSequence3;
    }

    public void e() {
        if (!ew.a((Object)this.d, gZ.l.a())) {
            this.d = gZ.l.c();
        }
    }

    public CharSequence a(@NotNull CharSequence charSequence) {
        if (this.f == null) {
            return charSequence;
        }
        switch (cj_0.a[this.a.ordinal()]) {
            case 1: {
                return this.a(this.f, i[6], charSequence);
            }
            case 2: {
                return this.a(this.f, i[7], charSequence);
            }
            case 3: {
                hc hc2 = this;
                boolean bl = false;
                Object object = hc2.c();
                return this.a(object != null && (object = bz.b((String)object)) != null ? (Long)object : -1L, i[8], charSequence);
            }
        }
        return this.a(charSequence, (CharSequence)('(' + this.f + ')'));
    }

    private final CharSequence a(String string, String string2, CharSequence charSequence) {
        this.d = gZ.l.a(this.d, arg_0 -> hc.a(string, arg_0));
        return this.a(charSequence, (CharSequence)(string2 + i[9]));
    }

    private final CharSequence a(long l3, String string, CharSequence charSequence) {
        this.d = gZ.l.a(this.d, arg_0 -> hc.a(l3, arg_0));
        return this.a(charSequence, (CharSequence)(string + i[10]));
    }

    public final CharSequence a(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        return charSequence.length() == 0 ? charSequence2 : (charSequence2.length() == 0 ? charSequence : (CharSequence)(charSequence + i[11] + charSequence2));
    }

    public final ResultSet a(@NotNull a_ a_2, @NotNull CharSequence charSequence) {
        return this.a(a_2.a(), charSequence);
    }

    public static /* synthetic */ ResultSet a(hc hc2, a_ a_2, CharSequence charSequence, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException(i[12]);
        }
        if ((n & 2) != 0) {
            charSequence = i[13];
        }
        return hc2.a(a_2, charSequence);
    }

    public final ResultSet a(@NotNull kL kL2, @NotNull CharSequence charSequence) {
        if (this.g instanceof h3) {
            return kx_0.a();
        }
        ch ch2 = this.g;
        ew.b(ch2, i[14]);
        kL kL3 = kL2;
        boolean bl = false;
        return eS.a(((gZ)ch2).c(aR.d(aR.e(i[15] + charSequence + i[16] + kL3 + i[17] + this))), this);
    }

    private static final bT b(hc hc2, bT bT2) {
        bT bT3;
        bT bT4 = bT2;
        Number[] numberArray = new Number[]{hc2.h, hc2.c};
        boolean bl = false;
        bT bT5 = bT3 = bT4;
        boolean bl2 = false;
        Number[] numberArray2 = numberArray;
        boolean bl3 = false;
        int n = numberArray2.length;
        for (int i = 0; i < n; ++i) {
            Number number;
            Number number2 = number = numberArray2[i];
            boolean bl4 = false;
            bT4.a(number2);
        }
        return bT3;
    }

    private static final bT a(bT bT2) {
        return eS.a(bT2);
    }

    private static final bT a(hc hc2, bT bT2) {
        bT bT3;
        bT bT4 = bT2;
        jJ jJ2 = hc2.l;
        boolean bl = false;
        bT bT5 = bT3 = bT4;
        boolean bl2 = false;
        jJ2.a(bT5);
        return bT3;
    }

    private static final bT a(String string, bT bT2) {
        return bT2.a(string);
    }

    private static final bT a(long l3, bT bT2) {
        return bT2.a(l3);
    }

    @Override
    public final int length() {
        return this.b();
    }

    @Override
    public final char charAt(int n) {
        return this.a(n);
    }

    static {
        hc.d();
        j = new df_0(null);
    }

    private static final void d() {
        i = new String[]{"", "DESC", "ASC", " ORDER BY ", " LIMIT ? OFFSET ?", "(active={true} AND(until<1 OR until>?))", "uuid", "banned_by_uuid", "id", "=?", "=?", " AND ", "", "*", "", "SELECT ", " FROM ", " WHERE ", "", "*"};
    }
}

