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

public final class bF {
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
        CharSequence[] charSequenceArray = new CharSequence[]{"templateName", charSequence2};
        return h1.a((CharSequence)bF.a(charSequence, (CharSequence)"templateStep", n2), charSequenceArray);
    }

    public static final jT a(@NotNull ch ch2, @Nullable String string) {
        Object object;
        if (string == null) {
            return new jT("", "");
        }
        Object object2 = null;
        if (ch2.e().i().c("LuckPerms") != null) {
            object2 = bh_0.b.a();
        }
        if (object2 != null && (object = bh_0.b.a(object2, string)) != null) {
            String string2;
            String string3 = bh_0.b.d(object);
            if (string3 == null) {
                string3 = "";
            }
            if ((string2 = bh_0.b.a(object)) == null) {
                string2 = "";
            }
            return new jT(string3, string2);
        }
        return new jT("", "");
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
        CharSequence[] charSequenceArray = new CharSequence[]{"reason", string};
        charSequence = h1.a(charSequence, charSequenceArray);
        return bF.a(ch2, dZ2, jv_02, charSequence, 0L, 8, null);
    }

    public static final String a(@NotNull ch ch2, @NotNull String string, @NotNull String string2) {
        CharSequence[] charSequenceArray = new CharSequence[]{"serverOrigin", string2};
        String string3 = h1.a((CharSequence)am.db.a("geoip", (Object)string), charSequenceArray);
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
            return "";
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
            charSequence4 = "";
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
        Object object = new CharSequence[]{"duration", charSequence7};
        charSequence2 = h1.a(charSequence2, (CharSequence[])object);
        charSequence2 = ch2.a(charSequence2, o2.a(dZ2.x(), string), string, bl);
        object = q_02;
        boolean bl3 = false;
        CharSequence[] charSequenceArray = new CharSequence[]{"removalReason", charSequence4};
        charSequence2 = h1.a(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"serverScope", ((q_0)object).b((Object)string2)};
        CharSequence charSequence8 = h1.a(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"serverOrigin", ((q_0)object).b((Object)string4)};
        charSequence2 = h1.a(charSequence8, charSequenceArray);
        charSequenceArray = new CharSequence[]{"dateStart", charSequence3};
        CharSequence charSequence9 = h1.a(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"dateEnd", charSequence5};
        CharSequence charSequence10 = h1.a(charSequence9, charSequenceArray);
        charSequenceArray = new CharSequence[]{"dateRemoved", charSequence6};
        CharSequence charSequence11 = h1.a(charSequence10, charSequenceArray);
        charSequenceArray = new CharSequence[]{"date", charSequence3};
        charSequence2 = h1.a(charSequence11, charSequenceArray);
        charSequenceArray = new CharSequence[]{"originalDuration", bl2 ? am.bT : db_0.a(dk.d, dZ2.l() - dZ2.o(), false, 2, null)};
        charSequence2 = h1.a(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"timeSince", db_0.a(dk.d, l7, false, 2, null)};
        charSequence2 = h1.a(charSequence2, charSequenceArray);
        charSequence2 = bF.a(charSequence2, (CharSequence)"uuid", (Object)dZ2.w());
        charSequenceArray = new CharSequence[]{"permanent", ((q_0)object).b(bl2)};
        charSequence2 = h1.a(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"ipban", ((q_0)object).b(dZ2.h())};
        charSequence2 = h1.a(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"silent", ((q_0)object).b(dZ2.d())};
        charSequence2 = h1.a(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"type", string3};
        charSequence2 = h1.a(charSequence2, charSequenceArray);
        charSequence2 = bF.a(ch2, charSequence2);
        object = new CharSequence[]{"active", q_02.b(dZ2.t() && !dZ2.b(l3))};
        charSequence2 = h1.a(charSequence2, (CharSequence[])object);
        charSequence2 = bF.a(charSequence2, (CharSequence)"geoip", () -> bF.a(q_02, dZ2));
        object = new CharSequence[]{"reason", dZ2.b()};
        charSequence2 = h1.a(charSequence2, (CharSequence[])object);
        if (bl) {
            charSequence2 = am.a(charSequence2, true);
        }
        charSequence2 = bF.a(charSequence2, (CharSequence)"idRandom", () -> bF.b(q_02, dZ2));
        charSequence2 = bF.a(charSequence2, (CharSequence)"id", dZ2.a());
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
        if (bF.b(string, "player")) {
            if (ch2.e().t() == 0) {
                ec_0 ec_02 = ch2.e().i();
                ew.b(ec_02, "");
                e1 e12 = ((ao_0)ec_02).b();
                string = bF.a((CharSequence)bF.a((CharSequence)string, (CharSequence)"playerPrefix", () -> bF.a(e12, jv_02)), (CharSequence)"playerSuffix", () -> bF.b(e12, jv_02));
            } else {
                jT jT2 = bF.a(ch2, jv_02.a());
                string = bF.a((CharSequence)bF.a((CharSequence)string, (CharSequence)"playerPrefix", () -> bF.a(jT2)), (CharSequence)"playerSuffix", () -> bF.b(jT2));
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
        string6 = bF.a((CharSequence)string6, (CharSequence)"geoip", () -> bF.a(q_02, string4));
        string6 = bF.a((CharSequence)bF.a((CharSequence)string6, (CharSequence)"name", (Object)string), (CharSequence)"target", (Object)string);
        if (bF.b(string6 = bF.a((CharSequence)string6, (CharSequence)"uuid", (Object)string3), "player")) {
            CharSequence[] charSequenceArray;
            Object object2 = q_02;
            boolean bl2 = false;
            String string7 = ((q_0)object2).f().bh() ? string2 : string;
            object2 = new dy_0();
            ((dy_0)object2).a = "";
            dy_0 dy_03 = new dy_0();
            dy_03.a = "";
            byte by2 = ch2.e().t();
            if (string3 != null && jj_0.a(string3)) {
                if (by2 == 0) {
                    ec_0 ec_02 = ch2.e().i();
                    ew.b(ec_02, "");
                    charSequenceArray = ((ao_0)ec_02).b();
                    try {
                        UUID uUID = UUID.fromString(string3);
                        string6 = bF.a((CharSequence)string6, (CharSequence)"playerPrefix", () -> bF.a((e1)charSequenceArray, uUID));
                        string6 = bF.a((CharSequence)string6, (CharSequence)"playerSuffix", () -> bF.b((e1)charSequenceArray, uUID));
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
            string6 = bF.a((CharSequence)string6, (CharSequence)"playerPrefix", () -> bF.a((dy_0)object2));
            string6 = bF.a((CharSequence)string6, (CharSequence)"playerSuffix", () -> bF.b(dy_03));
            charSequenceArray = new CharSequence[]{"playerServer", dy_02.a};
            string6 = bF.a((CharSequence)h1.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)string6, (CharSequence)"playerDisplayName", (Object)string7), (CharSequence)"playerName", (Object)string), (CharSequence)"playerUUID", (Object)string3), (CharSequence)"playerIP", (Object)string4), charSequenceArray), (CharSequence)"playerLoginDate", () -> bF.a(ch2, date));
            string6 = bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)string6, (CharSequence)"playerBans", () -> bF.b(ch2, string3, dy_02)), (CharSequence)"playerMutes", () -> bF.a(ch2, string3, dy_02)), (CharSequence)"playerWarnings", () -> bF.c(ch2, string3, dy_02)), (CharSequence)"playerKicks", () -> bF.d(ch2, string3, dy_02));
            string6 = bF.a((CharSequence)string6, (CharSequence)"player", (Object)string7);
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
            string = bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)bF.a((CharSequence)string, (CharSequence)"activeBans", () -> bF.b(ch2)), (CharSequence)"activeMutes", () -> bF.g(ch2)), (CharSequence)"activeWarnings", () -> bF.e(ch2)), (CharSequence)"totalBans", () -> bF.d(ch2)), (CharSequence)"totalMutes", () -> bF.a(ch2)), (CharSequence)"totalWarnings", () -> bF.f(ch2)), (CharSequence)"totalKicks", () -> bF.c(ch2));
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
        CharSequence charSequence3 = "executor";
        boolean bl2 = false;
        CharSequence charSequence4 = "" + '$' + charSequence3;
        charSequence3 = null;
        Object object2 = new CharSequence[]{"bannerDisplayName", charSequence4};
        CharSequence charSequence5 = h1.a(charSequence, (CharSequence[])object2);
        object2 = new CharSequence[]{"banningPlayer", charSequence4};
        CharSequence charSequence6 = h1.a(charSequence5, (CharSequence[])object2);
        object2 = new CharSequence[]{"bannerName", charSequence4};
        CharSequence charSequence7 = h1.a(charSequence6, (CharSequence[])object2);
        object2 = new CharSequence[]{"bannedBy", charSequence4};
        CharSequence charSequence8 = h1.a(charSequence7, (CharSequence[])object2);
        object2 = new CharSequence[]{"mutedBy", charSequence4};
        CharSequence charSequence9 = h1.a(charSequence8, (CharSequence[])object2);
        object2 = new CharSequence[]{"warnedBy", charSequence4};
        CharSequence charSequence10 = h1.a(charSequence9, (CharSequence[])object2);
        object2 = new CharSequence[]{"kickedBy", charSequence4};
        CharSequence charSequence11 = h1.a(charSequence10, (CharSequence[])object2);
        object2 = new CharSequence[]{"kicker", charSequence4};
        CharSequence charSequence12 = h1.a(charSequence11, (CharSequence[])object2);
        object2 = new CharSequence[]{"displayName", charSequence4};
        CharSequence charSequence13 = h1.a(charSequence12, (CharSequence[])object2);
        object2 = new CharSequence[2];
        object2[0] = "bannedFrom";
        CharSequence charSequence14 = "dateStart";
        boolean bl3 = false;
        object2[1] = "" + '$' + charSequence14;
        CharSequence charSequence15 = h1.a(charSequence13, (CharSequence[])object2);
        object2 = new CharSequence[2];
        object2[0] = "bannedUntil";
        charSequence14 = "dateEnd";
        bl3 = false;
        object2[1] = "" + '$' + charSequence14;
        CharSequence charSequence16 = h1.a(charSequence15, (CharSequence[])object2);
        object2 = new CharSequence[2];
        object2[0] = "banTimeLeft";
        charSequence14 = "duration";
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
                    string = "banned";
                    break;
                }
                case 2: {
                    string = "muted";
                    break;
                }
                case 3: {
                    string = "warned";
                    break;
                }
                case 4: {
                    string = "kicked";
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
            object[0] = string + "Player";
            charSequence2 = "playerDisplayName";
            bl = false;
            object[1] = "" + '$' + charSequence2;
            charSequence3 = h1.a(charSequence3, object);
            object = new CharSequence[2];
            object[0] = string + "IP";
            charSequence2 = "playerDisplayName";
            bl = false;
            object[1] = "" + '$' + charSequence2;
            charSequence3 = h1.a(charSequence3, object);
        }
        return charSequence3;
    }

    public static final String b(@NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{"base", am.c5};
        CharSequence charSequence2 = h1.a(charSequence, charSequenceArray);
        charSequenceArray = new CharSequence[]{"appealMessage", am.v};
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
        a = new String[]{"templateStep", "templateName", "", "", "LuckPerms", "", "", "", "", "reason", "geoip", "serverOrigin", "", "", "duration", "removalReason", "serverScope", "serverOrigin", "dateStart", "dateEnd", "dateRemoved", "date", "originalDuration", "timeSince", "uuid", "permanent", "ipban", "silent", "type", "active", "geoip", "reason", "idRandom", "id", "player", "", "playerPrefix", "playerSuffix", "playerPrefix", "playerSuffix", "geoip", "name", "target", "uuid", "player", "", "", "", "playerPrefix", "playerSuffix", "playerPrefix", "playerSuffix", "playerDisplayName", "playerName", "playerUUID", "playerIP", "playerServer", "playerLoginDate", "playerBans", "playerMutes", "playerWarnings", "playerKicks", "player", "activeBans", "activeMutes", "activeWarnings", "totalBans", "totalMutes", "totalWarnings", "totalKicks", "executor", "bannerDisplayName", "banningPlayer", "bannerName", "bannedBy", "mutedBy", "warnedBy", "kickedBy", "kicker", "displayName", "bannedFrom", "dateStart", "bannedUntil", "dateEnd", "banTimeLeft", "duration", "banned", "muted", "warned", "kicked", "Player", "playerDisplayName", "IP", "playerDisplayName", "base", "appealMessage"};
    }

    static {
        bF.a();
    }
}

