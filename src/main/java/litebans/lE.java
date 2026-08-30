package litebans;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import litebans.bz;
import litebans.d_;
import litebans.fz_0;
import litebans.hl;
import litebans.iX;
import litebans.jc_0;
import org.jetbrains.annotations.NotNull;

public final class lE {
    public static final d_ f;
    private final int b;
    private final HashMap c = new HashMap();
    private final HashMap e = new HashMap();
    public static final int d;
    public static final int h;
    public static final long g;
    private static /* synthetic */ String[] a;

    public lE(long l3) {
        iX iX2 = new iX(l3);
        this.b = 8500 + iX2.b(4000);
        this.a(iX2);
    }

    public final int b() {
        return this.b;
    }

    public final HashMap a() {
        return this.c;
    }

    public final String a(long l3) {
        try {
            long l5 = l3 + (long)this.b;
            String string = String.valueOf(l5);
            string = this.a(string);
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();
            boolean bl = true;
            String string2 = string;
            int n = string2.length();
            for (int i = 0; i < n; ++i) {
                char c = string2.charAt(i);
                stringBuilder2.append(c);
                if (stringBuilder2.length() < 3) continue;
                if (!bl) {
                    if (bz.c((CharSequence)stringBuilder2, "000", false, 2, null)) {
                        stringBuilder.append("m");
                    } else if (bz.c((CharSequence)stringBuilder2, "00", false, 2, null)) {
                        stringBuilder.append("v");
                    } else if (bz.c((CharSequence)stringBuilder2, "0", false, 2, null)) {
                        stringBuilder.append("z");
                    }
                }
                stringBuilder.append(this.a(stringBuilder2));
                stringBuilder2.setLength(0);
                bl = false;
            }
            if (((CharSequence)stringBuilder2).length() > 0) {
                throw new fz_0(null, 1, null);
            }
            return stringBuilder.toString().toUpperCase(Locale.ROOT);
        }
        catch (fz_0 fz_02) {
            return "error";
        }
    }

    private final String a(String string) {
        String string2;
        switch (string.length() % 3) {
            case 1: {
                string2 = "00" + string;
                break;
            }
            case 2: {
                string2 = '0' + string;
                break;
            }
            default: {
                string2 = string;
            }
        }
        return string2;
    }

    private final String a(int n, int n2) {
        String string;
        switch (n) {
            case 0: {
                string = String.valueOf(n2);
                break;
            }
            case 1: {
                string = "" + '0' + n2;
                break;
            }
            case 2: {
                string = "00" + n2;
                break;
            }
            case 3: {
                string = "000";
                break;
            }
            default: {
                throw new fz_0(null, 1, null);
            }
        }
        return string;
    }

    public final long b(@NotNull String string) {
        try {
            String string2 = string.toLowerCase(Locale.ROOT);
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();
            int n = 0;
            int n2 = string2.length();
            for (int i = 0; i < n2; ++i) {
                char c = string2.charAt(i);
                switch (c) {
                    case 'm': {
                        n = 3;
                        break;
                    }
                    case 'v': {
                        n = 2;
                        break;
                    }
                    case 'z': {
                        n = 1;
                        break;
                    }
                    default: {
                        stringBuilder2.append(c);
                    }
                }
                if (stringBuilder2.length() < 3) continue;
                stringBuilder.append(this.a(stringBuilder2, n));
                stringBuilder2.setLength(0);
                n = 0;
            }
            if (((CharSequence)stringBuilder2).length() > 0) {
                throw new fz_0(null, 1, null);
            }
            return Long.parseLong(stringBuilder.toString()) - (long)this.b;
        }
        catch (fz_0 fz_02) {
            return -1L;
        }
    }

    private final void a(iX iX2) {
        for (int i = 0; i < 1000; ++i) {
            String string = this.b(iX2);
            while (string.length() != 3 || ((Map)this.e).containsKey(string)) {
                string = this.b(iX2);
            }
            Integer n = i;
            ((Map)this.c).put(n, string);
            n = i;
            ((Map)this.e).put(string, n);
        }
    }

    private final String b(iX iX2) {
        return Long.toString(iX2.b() & 0xFFFL, jc_0.a(16));
    }

    private final String a(StringBuilder stringBuilder) {
        String string = (String)this.c.get(Integer.parseInt(stringBuilder.toString()));
        if (string == null) {
            throw new fz_0("No shuffle input for " + stringBuilder);
        }
        return string;
    }

    private final String a(StringBuilder stringBuilder, int n) {
        Integer n2 = (Integer)this.e.get(stringBuilder.toString());
        if (n2 == null) {
            throw new fz_0("No shuffle output for " + stringBuilder);
        }
        int n3 = n2;
        return this.a(n, n3);
    }

    static {
        g = -1L;
        h = 6;
        d = 3;
        lE.c();
        f = new d_(null);
    }

    private static final void c() {
        a = new String[]{"000", "m", "00", "v", "0", "z", "error", "00", "00", "000", "No shuffle input for ", "No shuffle output for "};
    }
}

