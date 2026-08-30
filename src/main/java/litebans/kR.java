package litebans;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import litebans.a_;
import litebans.am;
import litebans.ao_0;
import litebans.bF;
import litebans.bz;
import litebans.ch;
import litebans.d9;
import litebans.dZ;
import litebans.e1;
import litebans.eG;
import litebans.ec_0;
import litebans.eq_0;
import litebans.ew;
import litebans.hd_0;
import litebans.hl;
import litebans.iA;
import litebans.jT;
import litebans.jj_0;
import litebans.jv_0;
import litebans.kL;
import litebans.ll;
import litebans.o;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class kR {
    private static /* synthetic */ String[] a;

    public static boolean b(@NotNull ch ch2) {
        return !ch2.b();
    }

    public static w a(@NotNull ch ch2) {
        return (w)ch2.e().a(w.class);
    }

    public static /* synthetic */ iA a(ch ch2, iA iA2, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            bl = true;
        }
        return ch2.a(iA2, bl);
    }

    public static /* synthetic */ void a(ch ch2, String string, String string2, String string3, boolean bl, boolean bl2, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 8) != 0) {
            bl = true;
        }
        if ((n & 0x10) != 0) {
            bl2 = true;
        }
        ch2.a(string, string2, string3, bl, bl2);
    }

    public static /* synthetic */ ResultSet a(ch ch2, UUID uUID, int n, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n2 & 2) != 0) {
            n = 0;
        }
        return ch2.a(uUID, n);
    }

    public static /* synthetic */ boolean a(ch ch2, UUID uUID, a_ a_2, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            a_2 = a_.h;
        }
        return ch2.a(uUID, a_2);
    }

    public static /* synthetic */ List b(ch ch2, String string, int n, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n2 & 2) != 0) {
            n = 256;
        }
        return ch2.a(string, n);
    }

    public static /* synthetic */ dZ a(ch ch2, dZ dZ2, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            bl = false;
        }
        return ch2.a(dZ2, bl);
    }

    public static /* synthetic */ dZ a(ch ch2, String string, String string2, a_ a_2, boolean bl, boolean bl2, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            string2 = null;
        }
        if ((n & 4) != 0) {
            a_2 = a_.h;
        }
        if ((n & 8) != 0) {
            bl = false;
        }
        if ((n & 0x10) != 0) {
            bl2 = false;
        }
        return ch2.a(string, string2, a_2, bl, bl2);
    }

    public static /* synthetic */ dZ a(ch ch2, String string, String string2, a_ a_2, String string3, boolean bl, boolean bl2, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            string2 = null;
        }
        if ((n & 4) != 0) {
            a_2 = a_.h;
        }
        if ((n & 0x10) != 0) {
            bl = false;
        }
        if ((n & 0x20) != 0) {
            bl2 = false;
        }
        return ch2.a(string, string2, a_2, string3, bl, bl2);
    }

    public static /* synthetic */ dZ a(ch ch2, String string, a_ a_2, String string2, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 4) != 0) {
            string2 = "__ALL__";
        }
        if ((n & 8) != 0) {
            bl = true;
        }
        return ch2.a(string, a_2, string2, bl);
    }

    public static /* synthetic */ dZ a(ch ch2, long l3, a_ a_2, String string, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 8) != 0) {
            bl = true;
        }
        return ch2.a(l3, a_2, string, bl);
    }

    public static /* synthetic */ long a(ch ch2, kL kL2, String string, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            string = "__ALL__";
        }
        if ((n & 4) != 0) {
            bl = false;
        }
        return ch2.a(kL2, string, bl);
    }

    public static /* synthetic */ dZ a(ch ch2, String string, String string2, String string3, a_ a_2, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 8) != 0) {
            a_2 = a_.h;
        }
        return ch2.a(string, string2, string3, a_2);
    }

    public static /* synthetic */ List a(ch ch2, String string, int n, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n2 & 2) != 0) {
            n = 8;
        }
        return ch2.b(string, n);
    }

    public static /* synthetic */ void a(ch ch2, String string, String string2, CharSequence charSequence, dZ dZ2, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 0x10) != 0) {
            bl = false;
        }
        ch2.a(string, string2, charSequence, dZ2, bl);
    }

    public static /* synthetic */ void a(ch ch2, dZ dZ2, String string, String string2, CharSequence charSequence, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            string = null;
        }
        if ((n & 4) != 0) {
            string2 = null;
        }
        if ((n & 8) != 0) {
            charSequence = "";
        }
        if ((n & 0x10) != 0) {
            bl = false;
        }
        ch2.a(dZ2, string, string2, charSequence, bl);
    }

    public static /* synthetic */ void a(ch ch2, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 1) != 0) {
            bl = false;
        }
        ch2.a(bl);
    }

    public static List a(@NotNull ch ch2, @NotNull ResultSet resultSet, @NotNull a_ a_2) {
        ArrayList arrayList;
        if (!resultSet.next()) {
            return ll.e();
        }
        ArrayList arrayList2 = arrayList = new ArrayList();
        boolean bl = false;
        do {
            ((Collection)arrayList2).add(ch2.a(resultSet, a_2));
        } while (resultSet.next());
        return arrayList;
    }

    public static List a(@NotNull ch ch2, @NotNull iA iA2, @NotNull a_ a_2, @NotNull String string, boolean bl, int n) {
        return ch2.a(iA2.b(), iA2.i(), a_2, string, bl, n);
    }

    public static List a(@NotNull ch ch2, @NotNull dZ dZ2, int n) {
        dZ dZ3 = dZ2;
        boolean bl = false;
        return ch2.a(dZ3.w(), dZ3.p(), dZ3.u(), dZ3.m(), dZ3.t(), n);
    }

    public static List a(@NotNull ch ch2, @NotNull jv_0 jv_02, @NotNull a_ a_2, boolean bl, int n) {
        jv_0 jv_03 = jv_02;
        boolean bl2 = false;
        String string = jv_03.a();
        String string2 = jv_03.b();
        String string3 = jv_03.h();
        if (string3 == null) {
            string3 = ch2.d().u();
        }
        return ch2.a(string, string2, a_2, string3, bl, n);
    }

    public static String a(@NotNull ch ch2, @NotNull jv_0 jv_02) {
        eG eG2 = ((q_0)ch2.e().a(q_0.class)).f();
        return jv_02.f() ? eG2.aR() : (eG2.bh() ? jv_02.g() : jv_02.i());
    }

    public static CharSequence a(@NotNull ch ch2, @NotNull CharSequence charSequence, @NotNull jv_0 jv_02) {
        return kR.a(ch2, charSequence, ch2.a(jv_02), jv_02.a(), false, 4, null);
    }

    public static CharSequence a(@NotNull ch ch2, @NotNull CharSequence charSequence, @Nullable String string, @Nullable String string2, boolean bl) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        CharSequence charSequence2 = charSequence;
        o o2 = (o)ch2.e().a(o.class);
        q_0 q_02 = (q_0)ch2.e().a(q_0.class);
        String string3 = string;
        String string4 = "";
        String string5 = "";
        if (string2 != null && (bF.b(charSequence2, "executorPrefix") || bF.b(charSequence2, "executorSuffix"))) {
            byte by2 = ch2.e().t();
            if (by2 == 0) {
                ec_0 ec_02 = ch2.e().i();
                ew.b(ec_02, "");
                e1 e12 = ((ao_0)ec_02).b();
                jv_0 jv_02 = o2.a(string2);
                if (jv_02 != null) {
                    string4 = e12.a(jv_02.c());
                    string5 = e12.b(jv_02.c());
                } else if (jj_0.a(string2)) {
                    try {
                        UUID uUID = UUID.fromString(string2);
                        string4 = e12.a(uUID);
                        string5 = e12.b(uUID);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        q_02.a(illegalArgumentException, 0);
                    }
                }
            } else {
                jT jT2 = bF.a(ch2, string2);
                string4 = (String)jT2.b();
                string5 = (String)jT2.e();
            }
        }
        if (ew.a((Object)string4, (Object)"null")) {
            string4 = "";
        }
        if (ew.a((Object)string5, (Object)"null")) {
            string5 = "";
        }
        if (bl) {
            string4 = am.a(string4, true);
            string5 = am.a(string5, true);
            string3 = string3 + hd_0.p;
        }
        return bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a(charSequence2, (CharSequence)"executorUUID", (Object)string2), (CharSequence)"executorPrefix", (Object)string4), (CharSequence)"executorSuffix", (Object)string5), (CharSequence)"executor", (Object)string3);
    }

    public static /* synthetic */ CharSequence a(ch ch2, CharSequence charSequence, String string, String string2, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 4) != 0) {
            bl = true;
        }
        return ch2.a(charSequence, string, string2, bl);
    }

    public static CharSequence a(@NotNull ch ch2, @NotNull CharSequence charSequence) {
        return bF.a(ch2, charSequence);
    }

    public static CharSequence a(@NotNull ch ch2, @NotNull CharSequence charSequence, @Nullable iA iA2, boolean bl) {
        if (iA2 == null) {
            return charSequence;
        }
        return bF.a(ch2, iA2, charSequence, bl);
    }

    public static /* synthetic */ CharSequence a(ch ch2, CharSequence charSequence, iA iA2, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            bl = true;
        }
        return ch2.a(charSequence, iA2, bl);
    }

    public static CharSequence b(@NotNull ch ch2, @NotNull CharSequence charSequence, @Nullable jv_0 jv_02) {
        if (jv_02 != null) {
            return bF.a(ch2, jv_02, charSequence, false, 4, null);
        }
        return charSequence;
    }

    public static CharSequence a(@NotNull ch ch2, @NotNull CharSequence charSequence, @NotNull d9 d92) {
        return d92.e() == null ? ch2.a(charSequence, d92.d(), d92.f(), d92.a(), d92.c(), null) : ch2.a(charSequence, d92.e());
    }

    public static CharSequence a(@NotNull ch ch2, @NotNull CharSequence charSequence, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5) {
        return bF.a(ch2, string, string2, string3, string4, string5, new Date(), charSequence, false, 128, null);
    }

    public static CharSequence a(@NotNull ch ch2, @NotNull CharSequence charSequence, @Nullable dZ dZ2, boolean bl) {
        if (dZ2 == null || bz.b(charSequence)) {
            return charSequence;
        }
        return bF.a(ch2, dZ2, charSequence, 0L, bl, 4, null);
    }

    public static /* synthetic */ CharSequence a(ch ch2, CharSequence charSequence, dZ dZ2, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            bl = true;
        }
        return ch2.a(charSequence, dZ2, bl);
    }

    public static CharSequence a(@NotNull ch ch2, @NotNull CharSequence charSequence, @Nullable dZ dZ2, @Nullable iA iA2, boolean bl) {
        return ch2.a(ch2.a(charSequence, dZ2, false), iA2, bl);
    }

    public static /* synthetic */ CharSequence a(ch ch2, CharSequence charSequence, dZ dZ2, iA iA2, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 4) != 0) {
            bl = true;
        }
        return ch2.a(charSequence, dZ2, iA2, bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(@NotNull ch ch2, @NotNull dZ dZ2, @NotNull jv_0 jv_02) {
        String string;
        w w2 = (w)ch2.e().a(w.class);
        if (!dZ2.a(jv_02.a(), jv_02.b(), w.a(w2, false, 1, null))) return false;
        String string2 = dZ2.m();
        if (string2 == null) {
            string2 = eq_0.f.b();
        }
        if ((string = jv_02.h()) == null) {
            string = w2.u();
        }
        if (!eq_0.f.a(string2, string)) return false;
        return true;
    }

    public static boolean a(@NotNull ch ch2, @Nullable dZ dZ2) {
        dZ dZ3 = dZ2;
        return dZ3 != null ? dZ3.a(dZ2.w(), dZ2.p(), w.a(ch2.d(), false, 1, null)) : false;
    }

    private static final void a() {
        a = new String[]{"", "", "", "", "", "", "", "", "", "", "__ALL__", "", "", "__ALL__", "", "", "", "", "", "", "", "", "executorPrefix", "executorSuffix", "", "null", "", "null", "", "executorUUID", "executorPrefix", "executorSuffix", "executor", "", "", "", ""};
    }

    static {
        kR.a();
    }
}

