package litebans;

import litebans.bz;
import litebans.ew;
import litebans.g2;
import litebans.gl_0;
import litebans.hl;
import litebans.o;
import litebans.q_0;
import litebans.x;
import org.jetbrains.annotations.NotNull;

public final class aR
implements CharSequence {
    private final String a;
    private static /* synthetic */ String[] b;

    public static int c(String string) {
        return string.length();
    }

    public int b() {
        return aR.c(this.a);
    }

    public static char a(String string, int n) {
        return string.charAt(n);
    }

    public char a(int n) {
        return aR.a(this.a, n);
    }

    public static CharSequence a(String string, int n, int n2) {
        return string.subSequence(n, n2);
    }

    @Override
    public CharSequence subSequence(int n, int n2) {
        return aR.a(this.a, n, n2);
    }

    public static String b(String string) {
        String string2 = string;
        if (bz.c((CharSequence)string2, '{', false, 2, null)) {
            q_0 q_02 = (q_0)g2.b.a().a(q_0.class);
            o o2 = (o)g2.b.a().a(o.class);
            String string3 = q_02.f().aF();
            String string4 = "1";
            String string5 = "0";
            if (ew.a((Object)string3, (Object)"pgsql")) {
                string4 = "B'1'";
                string5 = "B'0'";
            }
            string2 = x.b.a(string2, b[5], (Object)string4);
            string2 = x.b.a(string2, b[6], (Object)string5);
            string2 = x.b.a(string2, b[7], (Object)(!ew.a((Object)string3, (Object)b[8]) ? b[9] : b[10]));
            string2 = x.b.a(string2, b[11], (Object)("" + o2.h() + '?' + o2.l()));
        }
        return string2;
    }

    @Override
    public String toString() {
        return aR.b(this.a);
    }

    public static final String b(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[20];
            throw new IllegalArgumentException(string2.toString());
        }
        return aR.e(aR.b(string) + b[21] + charSequence);
    }

    public static final String d(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[22];
            throw new IllegalArgumentException(string2.toString());
        }
        return aR.e(aR.b(string) + b[23] + charSequence);
    }

    public static final String e(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[24];
            throw new IllegalArgumentException(string2.toString());
        }
        gl_0.a(charSequence);
        return aR.e(aR.b(string) + b[25] + charSequence + b[26]);
    }

    public static final String c(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[30];
            throw new IllegalArgumentException(string2.toString());
        }
        gl_0.d(charSequence);
        return aR.e(aR.b(string) + b[31] + charSequence);
    }

    public static final String g(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[32];
            throw new IllegalArgumentException(string2.toString());
        }
        return aR.e(aR.b(string) + b[33] + charSequence);
    }

    public static final String f(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[34];
            throw new IllegalArgumentException(string2.toString());
        }
        gl_0.b(charSequence);
        return aR.e(aR.b(string) + b[35] + charSequence);
    }

    public static final String h(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[36];
            throw new IllegalArgumentException(string2.toString());
        }
        gl_0.a(charSequence);
        return aR.e(aR.b(string) + b[37] + charSequence);
    }

    public static final String a(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[38];
            throw new IllegalArgumentException(string2.toString());
        }
        return aR.e(aR.b(string) + b[39] + charSequence + b[40]);
    }

    public static final String a(String string, @NotNull Number number) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string)};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence;
            CharSequence charSequence2 = charSequence = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence2.length() > 0) continue;
            String string2 = b[44];
            throw new IllegalArgumentException(string2.toString());
        }
        return aR.e(aR.b(string) + b[45] + number);
    }

    public static int a(String string) {
        return string.hashCode();
    }

    public int hashCode() {
        return aR.a(this.a);
    }

    public static boolean a(String string, Object object) {
        if (!(object instanceof aR)) {
            return false;
        }
        return ew.a((Object)string, (Object)((aR)object).c());
    }

    public boolean equals(Object object) {
        return aR.a(this.a, object);
    }

    private /* synthetic */ aR(String string) {
        this.a = string;
    }

    public static String e(@NotNull String string) {
        return string;
    }

    public static final /* synthetic */ aR d(String string) {
        return new aR(string);
    }

    public final /* synthetic */ String c() {
        return this.a;
    }

    @Override
    public int length() {
        return this.b();
    }

    @Override
    public final char charAt(int n) {
        return this.a(n);
    }

    private static final void a() {
        b = new String[]{"1", "0", "pgsql", "B'1'", "B'0'", "{true}", "{false}", "{column.id}", "sqlite", "id", "rowid as id", "{=?}", "SELECT ", "INSERT ", "DELETE ", "UPDATE ", "ALTER ", "CREATE ", "Failed ", " WHERE ", "Failed ", " AND ", "Failed ", " OR ", "Failed ", " WHERE ", " IS NULL", "Failed ", " WHERE ", " IS NOT NULL", "Failed ", " SET ", "Failed ", " CONVERT TO ", "Failed ", " ADD COLUMN ", "Failed ", " DROP COLUMN ", "Failed ", " ORDER BY ", " DESC", "Failed ", " ORDER BY ", " ASC", "Failed ", " LIMIT ", " LIMIT ?", " OFFSET ?", " LIMIT ? OFFSET ?"};
    }

    static {
        aR.a();
    }
}

