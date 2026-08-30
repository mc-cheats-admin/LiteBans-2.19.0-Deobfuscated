package litebans;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import litebans.a_;
import litebans.am;
import litebans.ao_0;
import litebans.as;
import litebans.bh_0;
import litebans.bz;
import litebans.c1;
import litebans.c5;
import litebans.ch;
import litebans.cz;
import litebans.dZ;
import litebans.db_0;
import litebans.df_0;
import litebans.dk;
import litebans.dy_0;
import litebans.e0;
import litebans.e1;
import litebans.eM;
import litebans.ec_0;
import litebans.ew;
import litebans.fv_0;
import litebans.h1;
import litebans.hc;
import litebans.hl;
import litebans.ht_0;
import litebans.iA;
import litebans.jT;
import litebans.jj_0;
import litebans.jv_0;
import litebans.kL;
import litebans.kR;
import litebans.ll;
import litebans.o;
import litebans.q_0;
import litebans.w;
import litebans.x;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class bF {
    private static /* synthetic */ String[] a;

    public static final String a(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @Nullable Object object) {
        CharSequence charSequence3 = charSequence2;
        boolean bl = false;
        return x.b.a((Object)charSequence, (Object)("" + '$' + charSequence3), object);
    }

    public static final String a(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull e0 e02) {
        return bF.a(charSequence, charSequence2) ? bF.a(charSequence, charSequence2, e02.a()) : ((Object)charSequence).toString();
    }

    public static final CharSequence a(@NotNull ch ch2, @NotNull dZ dZ2, int n, int n2) {
        q_0 q_02 = (q_0)ch2.e().a(q_0.class);
        Object object = dZ2;
        boolean bl = false;
        if (object != null && ((dZ)object).r() != -1 && (object = q_02.s().a(dZ2)) != null) {
            Object object2;
            eM eM2 = q_02.s().a(dZ2.u(), (c1)object);
            int n3 = n;
            c5 c52 = null;
            if (eM2 != null) {
                if (n3 == -1) {
                    String string = dZ2.w();
                    ew.a((Object)string);
                    object2 = ch2.a(string, dZ2.p(), eM2, (c1)object);
                    n3 = (int)Math.floor(((Number)((jT)object2).e()).doubleValue()) + n2;
                }
                c52 = eM2.a(n3);
            } else {
                if (n3 == -1) {
                    String string = dZ2.w();
                    ew.a((Object)string);
                    n3 = ch2.a((c1)object, string, dZ2.p()) + n2;
                }
                c52 = ((c1)object).a(n3);
            }
            String string = c52.e();
            Object object3 = object2 = string != null ? (CharSequence)string : (CharSequence)((c1)object).h().e();
            if (object2 == null) {
                return null;
            }
            return bF.a(ch2, (CharSequence)object2, (c1)object, n3);
        }
        return null;
    }

    public static /* synthetic */ CharSequence a(ch ch2, dZ dZ2, int n, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n = -1;
        }
        if ((n3 & 4) != 0) {
            n2 = -1;
        }
        return bF.a(ch2, dZ2, n, n2);
    }

    public static final String a(@NotNull ch ch2, @NotNull CharSequence charSequence, @NotNull cz cz2) {
        return bF.a(ch2, charSequence, cz2.g(), cz2.D());
    }

    public static final String a(@NotNull ch ch2, @NotNull CharSequence charSequence, @NotNull c1 c12, int n) {
        c1 c13 = c12;
        boolean bl = false;
        CharSequence charSequence2 = ew.a(c13.f() & 0xFF, 0xFFFFFFFF & 0xFF) < 0 ? c12.g() : am.ay;
        int n2 = n + 1;
        CharSequence[] charSequenceArray = new CharSequence[]{a[1], charSequence2};
        return h1.a((CharSequence)bF.a(charSequence, (CharSequence)a[0], n2), charSequenceArray);
    }

    public static final jT a(@NotNull ch ch2, @Nullable String string) {
        Object object;
        if (string == null) {
            return new jT(a[2], a[3]);
        }
        Object object2 = null;
        if (ch2.e().i().c(a[4]) != null) {
            object2 = bh_0.b.a();
        }
        if (object2 != null && (object = bh_0.b.a(object2, string)) != null) {
            String string2;
            String string3 = bh_0.b.d(object);
            if (string3 == null) {
                string3 = a[5];
            }
            if ((string2 = bh_0.b.a(object)) == null) {
                string2 = a[6];
            }
            return new jT(string3, string2);
        }
        return new jT(a[7], a[8]);
    }

    public static final CharSequence a(@NotNull ch ch2, @NotNull dZ dZ2, @NotNull jv_0 jv_02, int n) {
        CharSequence charSequence = bF.a(ch2, dZ2, n, -1);
        if (charSequence == null) {
            charSequence = dZ2.y() ? (CharSequence)am.F : (CharSequence)am.bS;
        }
        return bF.a(ch2, dZ2, jv_02, charSequence, 0L, 8, null);
    }

    public static final String a(@NotNull ch ch2, @NotNull dZ dZ2, @NotNull jv_0 jv_02) {
        String string = ((Object)dZ2.b()).toString();
        CharSequence charSequence = ((CharSequence)string).length() == 0 ? (CharSequence)am.bm : (CharSequence)am.bf;
        CharSequence[] charSequenceArray = new CharSequence[]{a[9], string};
        charSequence = h1.a(charSequence, charSequenceArray);
        return bF.a(ch2, dZ2, jv_02, charSequence, 0L, 8, null);
    }

    public static final String a(@NotNull ch ch2, @NotNull String string, @NotNull String string2) {
        CharSequence[] charSequenceArray = new CharSequence[]{a[11], string2};
        String string3 = h1.a((CharSequence)am.db.a(a[10], (Object)string), charSequenceArray);
        return am.a(string3, true);
    }

    public static final CharSequence a(@NotNull ch ch2, @NotNull dZ dZ2, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, int n) {
        CharSequence charSequence = bF.a(ch2, dZ2, n, -1);
        if (charSequence == null) {
            charSequence = dZ2.y() ? (CharSequence)am.F : (CharSequence)am.bS;
        }
        charSequence = bF.a(ch2, dZ2, charSequence, 0L, false, 12, null);
        return bF.a(ch2, string, string, string2, string3, string4, new Date(System.currentTimeMillis()), charSequence, false, 128, null);
    }

    public static final String a(@NotNull ch ch2, @NotNull dZ dZ2, @NotNull jv_0 jv_02, @NotNull CharSequence charSequence, long l3) {
        CharSequence charSequence2 = bF.a(ch2, dZ2, charSequence, l3, false, 8, null);
        return bF.a(ch2, jv_02, charSequence2, false, 4, null);
    }

    public static /* synthetic */ String a(ch ch2, dZ dZ2, jv_0 jv_02, CharSequence charSequence, long l3, int n, Object object) {
        if ((n & 8) != 0) {
            l3 = w.a(ch2.d(), false, 1, null);
        }
        return bF.a(ch2, dZ2, jv_02, charSequence, l3);
    }

    public static final CharSequence a(@NotNull ch ch2, @NotNull dZ dZ2, @NotNull CharSequence charSequence, long l3, boolean bl) {
        if (charSequence.length() == 0) {
            return a[12];
        }
        q_0 q_02 = (q_0)ch2.e().a(q_0.class);
        o o2 = (o)ch2.e().a(o.class);
        CharSequence charSequence2 = null;
        charSequence2 = charSequence;
        boolean bl2 = dZ2.y();
        String string = dZ2.e();
        String string2 = dZ2.u().name();
        String string3 = string2.toLowerCase(Locale.ENGLISH);
        string2 = dZ2.m();
        String string4 = dZ2.j();
        CharSequence charSequence3 = o2.a(dZ2.o(), false);
        CharSequence charSequence4 = null;
        charSequence4 = dZ2.v();
        if (charSequence4 == null) {
            charSequence4 = a[13];
        }
        CharSequence charSequence5 = bl2 ? (CharSequence)am.bT : o2.a(dZ2.l(), false);
        long l5 = dZ2.f();
        CharSequence charSequence6 = l5 <= 0L ? (CharSequence)am.ay : o2.a(l5, true);
        long l7 = l3 - dZ2.o();
        long l8 = dZ2.l() - l3;
        if (l7 - (long)999 <= 999L) {
            l8 += l7 + (long)450;
        }
        if (l8 <= 999L) {
            l8 += (long)999;
        }
        CharSequence charSequence7 = dZ2.b(l3) ? (CharSequence)am.aB : (CharSequence)db_0.a(dk.d, l8, false, 2, null);
        charSequence2 = bF.b(charSequence2);
        Object object = new CharSequence[]{a[14], charSequence7};
        charSequence2 = h1.a(charSequence2, (CharSequence[])object);
        charSequence2 = ch2.a(charSequence2, o2.a(dZ2.x(), string), string, bl);
        object = q_02;
        boolean bl3 = false;
        CharSequence[] charSequenceArray = new CharSequence[]{a[15], charSequence4};
        charSequence2 = h1.a(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{a[16], ((q_0)object).b((Object)string2)};
        CharSequence charSequence8 = h1.a(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{a[17], ((q_0)object).b((Object)string4)};
        charSequence2 = h1.a(charSequence8, charSequenceArray);
        charSequenceArray = new CharSequence[]{a[18], charSequence3};
        CharSequence charSequence9 = h1.a(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{a[19], charSequence5};
        CharSequence charSequence10 = h1.a(charSequence9, charSequenceArray);
        charSequenceArray = new CharSequence[]{a[20], charSequence6};
        CharSequence charSequence11 = h1.a(charSequence10, charSequenceArray);
        charSequenceArray = new CharSequence[]{a[21], charSequence3};
        charSequence2 = h1.a(charSequence11, charSequenceArray);
        charSequenceArray = new CharSequence[]{a[22], bl2 ? am.bT : db_0.a(dk.d, dZ2.l() - dZ2.o(), false, 2, null)};
        charSequence2 = h1.a(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{a[23], db_0.a(dk.d, l7, false, 2, null)};
        charSequence2 = h1.a(charSequence2, charSequenceArray);
        charSequence2 = bF.a(charSequence2, (CharSequence)a[24], (Object)dZ2.w());
        charSequenceArray = new CharSequence[]{a[25], ((q_0)object).b(bl2)};
        charSequence2 = h1.a(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{a[26], ((q_0)object).b(dZ2.h())};
        charSequence2 = h1.a(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{a[27], ((q_0)object).b(dZ2.d())};
        charSequence2 = h1.a(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{a[28], string3};
        charSequence2 = h1.a(charSequence2, charSequenceArray);
        charSequence2 = bF.a(ch2, charSequence2);
        object = new CharSequence[]{a[29], q_02.b(dZ2.t() && !dZ2.b(l3))};
        charSequence2 = h1.a(charSequence2, (CharSequence[])object);
        charSequence2 = bF.a(charSequence2, (CharSequence)a[30], () -> bF.a(q_02, dZ2));
        object = new CharSequence[]{a[31], dZ2.b()};
        charSequence2 = h1.a(charSequence2, (CharSequence[])object);
        if (bl) {
            charSequence2 = am.a(charSequence2, true);
        }
        charSequence2 = bF.a(charSequence2, (CharSequence)a[32], () -> bF.b(q_02, dZ2));
        charSequence2 = bF.a(charSequence2, (CharSequence)a[33], dZ2.a());
        return charSequence2;
    }

    public static /* synthetic */ CharSequence a(ch ch2, dZ dZ2, CharSequence charSequence, long l3, boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            l3 = w.a(ch2.d(), false, 1, null);
        }
        if ((n & 8) != 0) {
            bl = true;
        }
        return bF.a(ch2, dZ2, charSequence, l3, bl);
    }

    public static final String a(@NotNull ch ch2, @NotNull iA iA2, @NotNull CharSequence charSequence, boolean bl) {
        return bF.a(ch2, iA2.a(), iA2.a(), iA2.b(), iA2.i(), null, iA2.f(), charSequence, bl);
    }

    public static final String a(@NotNull ch ch2, @NotNull jv_0 jv_02, @NotNull CharSequence charSequence, boolean bl) {
        String string = ((Object)charSequence).toString();
        if (bF.b(string, a[34])) {
            if (ch2.e().t() == 0) {
                ec_0 ec_02 = ch2.e().i();
                ew.b(ec_02, a[35]);
                e1 e12 = ((ao_0)ec_02).b();
                string = bF.a((CharSequence)bF.a((CharSequence)string, (CharSequence)a[36], () -> bF.a(e12, jv_02)), (CharSequence)a[37], () -> bF.b(e12, jv_02));
            } else {
                jT jT2 = bF.a(ch2, jv_02.a());
                string = bF.a((CharSequence)bF.a((CharSequence)string, (CharSequence)a[38], () -> bF.a(jT2)), (CharSequence)a[39], () -> bF.b(jT2));
            }
        }
        return bF.a(ch2, jv_02.i(), jv_02.g(), jv_02.a(), jv_02.b(), jv_02.h(), new java.util.Date(), string, bl);
    }

    public static /* synthetic */ String a(ch ch2, jv_0 jv_02, CharSequence charSequence, boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            bl = true;
        }
        return bF.a(ch2, jv_02, charSequence, bl);
    }

    public static final String a(@NotNull ch ch2, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5, @Nullable java.util.Date date, @NotNull CharSequence charSequence, boolean bl) {
        String string6;
        q_0 q_02 = (q_0)ch2.e().a(q_0.class);
        dy_0 dy_02 = new dy_0();
        Object object = string5;
        if (object == null) {
            object = dy_02.a = q_02.f().aw();
        }
        if (bz.b((CharSequence)(string6 = ((Object)charSequence).toString()))) {
            return string6;
        }
        string6 = bF.a((CharSequence)string6, (CharSequence)a[40], () -> bF.a(q_02, string4));
        string6 = bF.a((CharSequence)bF.a((CharSequence)string6, (CharSequence)a[41], (Object)string), (CharSequence)a[42], (Object)string);
        if (bF.b(string6 = bF.a((CharSequence)string6, (CharSequence)a[43], (Object)string3), a[44])) {
            CharSequence[] charSequenceArray;
            Object object2 = q_02;
            boolean bl2 = false;
            String string7 = ((q_0)object2).f().bh() ? string2 : string;
            object2 = new dy_0();
            ((dy_0)object2).a = a[45];
            dy_0 dy_03 = new dy_0();
            dy_03.a = a[46];
            byte by2 = ch2.e().t();
            if (string3 != null && jj_0.a(string3)) {
                if (by2 == 0) {
                    ec_0 ec_02 = ch2.e().i();
                    ew.b(ec_02, a[47]);
                    charSequenceArray = ((ao_0)ec_02).b();
                    try {
                        UUID uUID = UUID.fromString(string3);
                        string6 = bF.a((CharSequence)string6, (CharSequence)a[48], () -> bF.a((e1)charSequenceArray, uUID));
                        string6 = bF.a((CharSequence)string6, (CharSequence)a[49], () -> bF.b((e1)charSequenceArray, uUID));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        q_0.a(q_02, illegalArgumentException, 0, 2, null);
                    }
                } else {
                    charSequenceArray = bF.a(ch2, string3);
                    ((dy_0)object2).a = charSequenceArray.b();
                    dy_03.a = charSequenceArray.e();
                }
            }
            string6 = bF.a((CharSequence)string6, (CharSequence)a[50], () -> bF.a((dy_0)object2));
            string6 = bF.a((CharSequence)string6, (CharSequence)a[51], () -> bF.b(dy_03));
            charSequenceArray = new CharSequence[]{a[56], dy_02.a};
            string6 = bF.a((CharSequence)h1.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)string6, (CharSequence)a[52], (Object)string7), (CharSequence)a[53], (Object)string), (CharSequence)a[54], (Object)string3), (CharSequence)a[55], (Object)string4), charSequenceArray), (CharSequence)a[57], () -> bF.a(ch2, date));
            string6 = bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)string6, (CharSequence)a[58], () -> bF.b(ch2, string3, dy_02)), (CharSequence)a[59], () -> bF.a(ch2, string3, dy_02)), (CharSequence)a[60], () -> bF.c(ch2, string3, dy_02)), (CharSequence)a[61], () -> bF.d(ch2, string3, dy_02));
            string6 = bF.a((CharSequence)string6, (CharSequence)a[62], (Object)string7);
        }
        if (!bl) {
            return ((Object)ch2.a((CharSequence)string6)).toString();
        }
        return am.a(ch2.a((CharSequence)string6), true);
    }

    public static /* synthetic */ String a(ch ch2, String string, String string2, String string3, String string4, String string5, java.util.Date date, CharSequence charSequence, boolean bl, int n, Object object) {
        if ((n & 0x80) != 0) {
            bl = true;
        }
        return bF.a(ch2, string, string2, string3, string4, string5, date, charSequence, bl);
    }

    public static final String a(@NotNull ch ch2, @NotNull CharSequence charSequence) {
        String string = ((Object)charSequence).toString();
        try {
            string = bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)string, (CharSequence)a[63], () -> bF.b(ch2)), (CharSequence)a[64], () -> bF.g(ch2)), (CharSequence)a[65], () -> bF.e(ch2)), (CharSequence)a[66], () -> bF.d(ch2)), (CharSequence)a[67], () -> bF.a(ch2)), (CharSequence)a[68], () -> bF.f(ch2)), (CharSequence)a[69], () -> bF.c(ch2));
        }
        catch (Exception exception) {
            w w2 = (w)ch2.e().a(w.class);
            w2.a(exception);
        }
        return string;
    }

    public static final String a(@NotNull CharSequence charSequence) {
        boolean bl;
        CharSequence charSequence2;
        Object object;
        CharSequence charSequence3 = a[70];
        boolean bl2 = false;
        CharSequence charSequence4 = "" + '$' + charSequence3;
        charSequence3 = null;
        Object object2 = new CharSequence[]{a[71], charSequence4};
        CharSequence charSequence5 = h1.a(charSequence, (CharSequence[])object2);
        object2 = new CharSequence[]{a[72], charSequence4};
        CharSequence charSequence6 = h1.a(charSequence5, (CharSequence[])object2);
        object2 = new CharSequence[]{a[73], charSequence4};
        CharSequence charSequence7 = h1.a(charSequence6, (CharSequence[])object2);
        object2 = new CharSequence[]{a[74], charSequence4};
        CharSequence charSequence8 = h1.a(charSequence7, (CharSequence[])object2);
        object2 = new CharSequence[]{a[75], charSequence4};
        CharSequence charSequence9 = h1.a(charSequence8, (CharSequence[])object2);
        object2 = new CharSequence[]{a[76], charSequence4};
        CharSequence charSequence10 = h1.a(charSequence9, (CharSequence[])object2);
        object2 = new CharSequence[]{a[77], charSequence4};
        CharSequence charSequence11 = h1.a(charSequence10, (CharSequence[])object2);
        object2 = new CharSequence[]{a[78], charSequence4};
        CharSequence charSequence12 = h1.a(charSequence11, (CharSequence[])object2);
        object2 = new CharSequence[]{a[79], charSequence4};
        CharSequence charSequence13 = h1.a(charSequence12, (CharSequence[])object2);
        object2 = new CharSequence[2];
        object2[0] = a[80];
        CharSequence charSequence14 = a[81];
        boolean bl3 = false;
        object2[1] = "" + '$' + charSequence14;
        CharSequence charSequence15 = h1.a(charSequence13, (CharSequence[])object2);
        object2 = new CharSequence[2];
        object2[0] = a[82];
        charSequence14 = a[83];
        bl3 = false;
        object2[1] = "" + '$' + charSequence14;
        CharSequence charSequence16 = h1.a(charSequence15, (CharSequence[])object2);
        object2 = new CharSequence[2];
        object2[0] = a[84];
        charSequence14 = a[85];
        bl3 = false;
        object2[1] = "" + '$' + charSequence14;
        charSequence3 = h1.a(charSequence16, (CharSequence[])object2);
        object2 = a_.l.a();
        boolean bl4 = false;
        Object object3 = object2;
        Collection collection = new ArrayList(ll.a((Iterable)object2, 10));
        boolean bl5 = false;
        Iterator iterator = object3.iterator();
        while (iterator.hasNext()) {
            String string;
            object = iterator.next();
            charSequence2 = (a_)object;
            Collection collection2 = collection;
            bl = false;
            a_ a_2 = charSequence2;
            boolean bl6 = false;
            switch (ht_0.a[a_2.c().ordinal()]) {
                case 1: {
                    string = a[86];
                    break;
                }
                case 2: {
                    string = a[87];
                    break;
                }
                case 3: {
                    string = a[88];
                    break;
                }
                case 4: {
                    string = a[89];
                    break;
                }
                default: {
                    x_0.a();
                    throw new as();
                }
            }
            collection2.add(string);
        }
        object2 = (List)collection;
        bl4 = false;
        object3 = object2.iterator();
        while (object3.hasNext()) {
            collection = object3.next();
            String string = (String)((Object)collection);
            boolean bl7 = false;
            object = new CharSequence[2];
            object[0] = string + a[90];
            charSequence2 = a[91];
            bl = false;
            object[1] = "" + '$' + charSequence2;
            charSequence3 = h1.a(charSequence3, object);
            object = new CharSequence[2];
            object[0] = string + a[92];
            charSequence2 = a[93];
            bl = false;
            object[1] = "" + '$' + charSequence2;
            charSequence3 = h1.a(charSequence3, object);
        }
        return charSequence3;
    }

    public static final String b(@NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{a[94], am.c5};
        CharSequence charSequence2 = h1.a(charSequence, charSequenceArray);
        charSequenceArray = new CharSequence[]{a[95], am.v};
        return h1.a(charSequence2, charSequenceArray);
    }

    public static final CharSequence c(@NotNull CharSequence charSequence) {
        boolean bl = false;
        return "" + '$' + charSequence;
    }

    public static final boolean b(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        CharSequence charSequence3 = charSequence2;
        boolean bl = false;
        return bz.a(charSequence, (CharSequence)("" + '$' + charSequence3), false, 2, null);
    }

    public static final boolean a(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        return bz.a(charSequence, charSequence2, false, 2, null) && bF.b(charSequence, charSequence2);
    }

    private static final Object a(q_0 q_02, dZ dZ2) {
        fv_0 fv_02 = q_02.h();
        return fv_02 != null ? fv_02.b(dZ2.p()) : null;
    }

    private static final Object b(q_0 q_02, dZ dZ2) {
        return q_02.k().a(dZ2.a());
    }

    private static final Object a(e1 e12, jv_0 jv_02) {
        return am.a(e12.a(jv_02.c()), true);
    }

    private static final Object b(e1 e12, jv_0 jv_02) {
        return am.a(e12.b(jv_02.c()), true);
    }

    private static final Object a(jT jT2) {
        return jT2.b();
    }

    private static final Object b(jT jT2) {
        return jT2.e();
    }

    private static final Object a(q_0 q_02, String string) {
        return q_02.b(string);
    }

    private static final Object a(e1 e12, UUID uUID) {
        return e12.a(uUID);
    }

    private static final Object b(e1 e12, UUID uUID) {
        return e12.b(uUID);
    }

    private static final Object a(dy_0 dy_02) {
        return dy_02.a;
    }

    private static final Object b(dy_0 dy_02) {
        return dy_02.a;
    }

    private static final Object a(ch ch2, java.util.Date date) {
        java.util.Date date2 = date;
        return ((o)ch2.e().a(o.class)).a(date2 != null ? date2.getTime() : 0L, true);
    }

    private static final Object b(ch ch2, String string, dy_0 dy_02) {
        return ch2.a(df_0.a(hc.j, ch2, string, (String)dy_02.a, null, false, null, false, null, null, 252, null), a_.h);
    }

    private static final Object a(ch ch2, String string, dy_0 dy_02) {
        return ch2.a(df_0.a(hc.j, ch2, string, (String)dy_02.a, null, false, null, false, null, null, 252, null), a_.j);
    }

    private static final Object c(ch ch2, String string, dy_0 dy_02) {
        return ch2.a(df_0.a(hc.j, ch2, string, (String)dy_02.a, null, false, null, false, null, null, 252, null), a_.c);
    }

    private static final Object d(ch ch2, String string, dy_0 dy_02) {
        return ch2.a(df_0.a(hc.j, ch2, string, (String)dy_02.a, null, false, null, false, null, null, 252, null), a_.g);
    }

    private static final Object b(ch ch2) {
        return kR.a(ch2, kL.k, null, true, 2, null);
    }

    private static final Object g(ch ch2) {
        return kR.a(ch2, kL.m, null, true, 2, null);
    }

    private static final Object e(ch ch2) {
        return kR.a(ch2, kL.b, null, true, 2, null);
    }

    private static final Object d(ch ch2) {
        return kR.a(ch2, kL.k, null, false, 6, null);
    }

    private static final Object a(ch ch2) {
        return kR.a(ch2, kL.m, null, false, 6, null);
    }

    private static final Object f(ch ch2) {
        return kR.a(ch2, kL.b, null, false, 6, null);
    }

    private static final Object c(ch ch2) {
        return kR.a(ch2, kL.j, null, false, 6, null);
    }

    private static final void a() {
        a = new String[]{hl.a("\ucdb8\ucda9\ucda1\ucdbc\ucda0\ucdad\ucdb8\ucda9\ucd9f\ucdb8\ucda9\ucdbc", -1914253876), hl.a("\u8d37\u8d26\u8d2e\u8d33\u8d2f\u8d22\u8d37\u8d26\u8d0d\u8d22\u8d2e\u8d26", 1959562563), hl.a("", 538821019), hl.a("", -1007631352), hl.a("\u464e\u4677\u4661\u4669\u4652\u4667\u4670\u466f\u4671", 277759490), hl.a("", 558318799), hl.a("", 1331616150), hl.a("", 556458671), hl.a("", -538757142), hl.a("\ua529\ua53e\ua53a\ua528\ua534\ua535", 599172443), hl.a("\u1c58\u1c5a\u1c50\u1c56\u1c4f", 2112232511), hl.a("\u8aa2\u8ab4\u8aa3\u8aa7\u8ab4\u8aa3\u8a9e\u8aa3\u8ab8\u8ab6\u8ab8\u8abf", -781153583), hl.a("", 1564441382), hl.a("", 105473699), hl.a("\u76cd\u76dc\u76db\u76c8\u76dd\u76c0\u76c6\u76c7", 409892521), hl.a("\u141d\u140a\u1402\u1400\u1419\u140e\u1403\u143d\u140a\u140e\u141c\u1400\u1401", 2071204975), hl.a("\u3f50\u3f46\u3f51\u3f55\u3f46\u3f51\u3f70\u3f40\u3f4c\u3f53\u3f46", 90652451), hl.a("\uc161\uc177\uc160\uc164\uc177\uc160\uc15d\uc160\uc17b\uc175\uc17b\uc17c", -1877688046), hl.a("\u23b1\u23b4\u23a1\u23b0\u2386\u23a1\u23b4\u23a7\u23a1", -567270443), hl.a("\u6bb1\u6bb4\u6ba1\u6bb0\u6b90\u6bbb\u6bb1", -177181739), hl.a("\u59db\u59de\u59cb\u59da\u59ed\u59da\u59d2\u59d0\u59c9\u59da\u59db", -1452058177), hl.a("\u8244\u8241\u8254\u8245", -802717152), hl.a("\u3d81\u3d9c\u3d87\u3d89\u3d87\u3d80\u3d8f\u3d82\u3daa\u3d9b\u3d9c\u3d8f\u3d9a\u3d87\u3d81\u3d80", 870596078), hl.a("\ua490\ua48d\ua489\ua481\ua4b7\ua48d\ua48a\ua487\ua481", -1235376924), hl.a("\u18d9\u18d9\u18c5\u18c8", -518645588), hl.a("\u6df2\u6de7\u6df0\u6def\u6de3\u6dec\u6de7\u6dec\u6df6", 1413770626), hl.a("\u5c92\u5c8b\u5c99\u5c9a\u5c95", 548691195), hl.a("\u2b8c\u2b96\u2b93\u2b9a\u2b91\u2b8b", -1631769601), hl.a("\u6117\u611a\u6113\u6106", 337797475), hl.a("\u8bec\u8bee\u8bf9\u8be4\u8bfb\u8be8", 461278093), hl.a("\u2f83\u2f81\u2f8b\u2f8d\u2f94", -1539231772), hl.a("\u6f72\u6f65\u6f61\u6f73\u6f6f\u6f6e", 793472768), hl.a("\u1905\u1908\u193e\u190d\u1902\u1908\u1903\u1901", 1352997228), hl.a("\udc0f\udc02", -1286022042), hl.a("\u196b\u1977\u197a\u1962\u197e\u1969", 723196187), hl.a("", -986781623), hl.a("\u6b49\u6b55\u6b58\u6b40\u6b5c\u6b4b\u6b69\u6b4b\u6b5c\u6b5f\u6b50\u6b41", 1211263801), hl.a("\ubf17\ubf0b\ubf06\ubf1e\ubf02\ubf15\ubf34\ubf12\ubf01\ubf01\ubf0e\ubf1f", -1991262361), hl.a("\ub14a\ub156\ub15b\ub143\ub15f\ub148\ub16a\ub148\ub15f\ub15c\ub153\ub142", 190492986), hl.a("\ud40b\ud417\ud41a\ud402\ud41e\ud409\ud428\ud40e\ud41d\ud41d\ud412\ud403", -1293298565), hl.a("\u9f8a\u9f88\u9f82\u9f84\u9f9d", -1414357011), hl.a("\ud784\ud78b\ud787\ud78f", -90384406), hl.a("\ue99c\ue989\ue99a\ue98f\ue98d\ue99c", -933893656), hl.a("\uc098\uc098\uc084\uc089", 1551352045), hl.a("\u8996\u898a\u8987\u899f\u8983\u8994", -241727002), hl.a("", 1175344512), hl.a("", -1441607001), hl.a("", -1758463862), hl.a("\u1aed\u1af1\u1afc\u1ae4\u1af8\u1aef\u1acd\u1aef\u1af8\u1afb\u1af4\u1ae5", 1626020509), hl.a("\u46d6\u46ca\u46c7\u46df\u46c3\u46d4\u46f5\u46d3\u46c0\u46c0\u46cf\u46de", 2108638886), hl.a("\u86f9\u86e5\u86e8\u86f0\u86ec\u86fb\u86d9\u86fb\u86ec\u86ef\u86e0\u86f1", -1960540535), hl.a("\ub013\ub00f\ub002\ub01a\ub006\ub011\ub030\ub016\ub005\ub005\ub00a\ub01b", -927158173), hl.a("\ua0ca\ua0d6\ua0db\ua0c3\ua0df\ua0c8\ua0fe\ua0d3\ua0c9\ua0ca\ua0d6\ua0db\ua0c3\ua0f4\ua0db\ua0d7\ua0df", 916431034), hl.a("\u2002\u201e\u2013\u200b\u2017\u2000\u203c\u2013\u201f\u2017", 918036594), hl.a("\u21a2\u21be\u21b3\u21ab\u21b7\u21a0\u2187\u2187\u219b\u2196", 463544786), hl.a("\u8c95\u8c89\u8c84\u8c9c\u8c80\u8c97\u8cac\u8cb5", 1652985061), hl.a("\uc18a\uc196\uc19b\uc183\uc19f\uc188\uc1a9\uc19f\uc188\uc18c\uc19f\uc188", -496254470), hl.a("\u71bb\u71a7\u71aa\u71b2\u71ae\u71b9\u7187\u71a4\u71ac\u71a2\u71a5\u718f\u71aa\u71bf\u71ae", 63730123), hl.a("\u9cf2\u9cee\u9ce3\u9cfb\u9ce7\u9cf0\u9cc0\u9ce3\u9cec\u9cf1", -28074878), hl.a("\ua8ac\ua8b0\ua8bd\ua8a5\ua8b9\ua8ae\ua891\ua8a9\ua8a8\ua8b9\ua8af", 177121500), hl.a("\u2f69\u2f75\u2f78\u2f60\u2f7c\u2f6b\u2f4e\u2f78\u2f6b\u2f77\u2f70\u2f77\u2f7e\u2f6a", -1290195175), hl.a("\ucd84\ucd98\ucd95\ucd8d\ucd91\ucd86\ucdbf\ucd9d\ucd97\ucd9f\ucd87", -350958092), hl.a("\u3919\u3905\u3908\u3910\u390c\u391b", -1392297623), hl.a("\u489f\u489d\u488a\u4897\u4888\u489b\u48bc\u489f\u4890\u488d", -1230485250), hl.a("\u6886\u6884\u6893\u688e\u6891\u6882\u68aa\u6892\u6893\u6882\u6894", 1674406119), hl.a("\uae2b\uae29\uae3e\uae23\uae3c\uae2f\uae1d\uae2b\uae38\uae24\uae23\uae24\uae2d\uae39", -470438326), hl.a("\u6130\u612b\u6130\u6125\u6128\u6106\u6125\u612a\u6137", -337288892), hl.a("\u4f12\u4f09\u4f12\u4f07\u4f0a\u4f2b\u4f13\u4f12\u4f03\u4f15", -1157345434), hl.a("\ue37d\ue366\ue37d\ue368\ue365\ue35e\ue368\ue37b\ue367\ue360\ue367\ue36e\ue37a", -1293098231), hl.a("\u2ee8\u2ef3\u2ee8\u2efd\u2ef0\u2ed7\u2ef5\u2eff\u2ef7\u2eef", -517067108), hl.a("\ub1f9\ub1e4\ub1f9\ub1ff\ub1e9\ub1e8\ub1f3\ub1ee", 1342419356), hl.a("\u19b0\u19b3\u19bc\u19bc\u19b7\u19a0\u1996\u19bb\u19a1\u19a2\u19be\u19b3\u19ab\u199c\u19b3\u19bf\u19b7", -1347151406), hl.a("\uef63\uef60\uef6f\uef6f\uef68\uef6f\uef66\uef51\uef6d\uef60\uef78\uef64\uef73", -1605832959), hl.a("\ubb86\ubb85\ubb8a\ubb8a\ubb81\ubb96\ubbaa\ubb85\ubb89\ubb81", 1113045988), hl.a("\u2ae4\u2ae7\u2ae8\u2ae8\u2ae3\u2ae2\u2ac4\u2aff", -450155898), hl.a("\u5138\u5120\u5121\u5130\u5131\u5117\u512c", -116043435), hl.a("\ub1a6\ub1b0\ub1a3\ub1bf\ub1b4\ub1b5\ub193\ub1a8", 1579594193), hl.a("\u32ba\u32b8\u32b2\u32ba\u32b4\u32b5\u3293\u32a8", 1112290001), hl.a("\u2402\u2400\u240a\u2402\u240c\u241b", -919460759), hl.a("\u2e01\u2e0c\u2e16\u2e15\u2e09\u2e04\u2e1c\u2e2b\u2e04\u2e08\u2e00", -1228984731), hl.a("\u1c9d\u1c9e\u1c91\u1c91\u1c9a\u1c9b\u1cb9\u1c8d\u1c90\u1c92", 1285692671), hl.a("\uf584\uf581\uf594\uf585\uf5b3\uf594\uf581\uf592\uf594", -1477839392), hl.a("\ue5da\ue5d9\ue5d6\ue5d6\ue5dd\ue5dc\ue5ed\ue5d6\ue5cc\ue5d1\ue5d4", 1995695544), hl.a("\u1e00\u1e05\u1e10\u1e01\u1e21\u1e0a\u1e00", 342695524), hl.a("\ue239\ue23a\ue235\ue20f\ue232\ue236\ue23e\ue217\ue23e\ue23d\ue22f", 1173086811), hl.a("\u9490\u9481\u9486\u9495\u9480\u949d\u949b\u949a", 683447540), hl.a("\uffbe\uffbd\uffb2\uffb2\uffb9\uffb8", -79626276), hl.a("\u7f7a\u7f62\u7f63\u7f72\u7f73", -999063785), hl.a("\uf923\uf935\uf926\uf93a\uf931\uf930", -1519257260), hl.a("\ud58e\ud58c\ud586\ud58e\ud580\ud581", -1707026971), hl.a("\u3eff\u3ec3\u3ece\u3ed6\u3eca\u3edd", 742276783), hl.a("\u9c57\u9c4b\u9c46\u9c5e\u9c42\u9c55\u9c63\u9c4e\u9c54\u9c57\u9c4b\u9c46\u9c5e\u9c69\u9c46\u9c4a\u9c42", 123378727), hl.a("\u450d\u4514", 1828930884), hl.a("\u5bce\u5bd2\u5bdf\u5bc7\u5bdb\u5bcc\u5bfa\u5bd7\u5bcd\u5bce\u5bd2\u5bdf\u5bc7\u5bf0\u5bdf\u5bd3\u5bdb", -127968322), hl.a("\u3559\u355a\u3548\u355e", 847852859), hl.a("\ud30f\ud31e\ud31e\ud30b\ud30f\ud302\ud323\ud30b\ud31d\ud31d\ud30f\ud309\ud30b", -68365458)};
    }

    static {
        bF.a();
    }
}

