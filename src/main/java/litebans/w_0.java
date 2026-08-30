package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import litebans.gq;
import litebans.hd_0;
import litebans.hl;
import litebans.hm_0;
import litebans.kf_0;
import litebans.v_0;

/*
 * Renamed from litebans.W
 */
public static final class w_0
extends v_0 {
    private static final Pattern i;
    private String k;
    private static /* synthetic */ String[] j;

    @Deprecated
    public static v_0[] a(String string) {
        return w_0.a(string, gq.x);
    }

    @Deprecated
    public static v_0[] a(String string, gq gq2) {
        ArrayList arrayList = new ArrayList();
        w_0.a(string, gq2, arrayList::add);
        return arrayList.toArray(new v_0[0]);
    }

    private static final void a(String string, gq gq2, Consumer consumer) {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = new w_0();
        Matcher matcher = i.matcher(string);
        for (int i = 0; i < string.length(); ++i) {
            Object object2;
            char c = string.charAt(i);
            if (c == '\u00a7') {
                gq gq3;
                if (++i >= string.length()) break;
                c = string.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    c = (char)(c + 32);
                }
                if (c == 'x' && i + 12 < string.length()) {
                    object2 = new StringBuilder(j[0]);
                    for (int i10 = 0; i10 < 6; ++i10) {
                        ((StringBuilder)object2).append(string.charAt(i + 2 + i10 * 2));
                    }
                    try {
                        gq3 = gq.a(((StringBuilder)object2).toString());
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        gq3 = null;
                    }
                    i += 12;
                } else {
                    gq3 = gq.a(c);
                }
                if (gq3 == null) continue;
                if (stringBuilder.length() > 0) {
                    object2 = object;
                    object = new w_0((w_0)object2);
                    ((w_0)object2).c(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                    consumer.accept(object2);
                }
                if (gq3 == gq.t) {
                    ((v_0)object).d(true);
                    continue;
                }
                if (gq3 == gq.k) {
                    ((v_0)object).c(true);
                    continue;
                }
                if (gq3 == gq.A) {
                    ((v_0)object).b(true);
                    continue;
                }
                if (gq3 == gq.c) {
                    ((v_0)object).e(true);
                    continue;
                }
                if (gq3 == gq.b) {
                    ((v_0)object).a((Boolean)true);
                    continue;
                }
                if (gq3 == gq.u) {
                    gq3 = gq2;
                }
                object = new w_0();
                ((v_0)object).a(gq3);
                ((v_0)object).a(true);
                continue;
            }
            int n = w_0.a(string, i);
            if (n == -1) {
                n = string.length();
            }
            if (matcher.region(i, n).find()) {
                if (stringBuilder.length() > 0) {
                    object2 = object;
                    object = new w_0((w_0)object2);
                    ((w_0)object2).c(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                    consumer.accept(object2);
                }
                object2 = object;
                object = new w_0((w_0)object2);
                String string2 = hd_0.a((CharSequence)string.substring(i, n));
                ((w_0)object).c(string2);
                ((v_0)object).a(new kf_0(hm_0.e, string2.startsWith(j[1]) ? string2 : j[2] + string2));
                consumer.accept(object);
                i += n - i - 1;
                object = object2;
                continue;
            }
            stringBuilder.append(c);
        }
        ((w_0)object).c(stringBuilder.toString());
        consumer.accept(object);
    }

    private static final int a(String string, int n) {
        for (int i = n; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c != ' ' && !Character.isISOControl(c)) continue;
            return i;
        }
        return -1;
    }

    public w_0() {
        this.k = j[3];
    }

    public w_0(w_0 w_02) {
        super(w_02);
        this.c(w_02.b());
    }

    public w_0(v_0[] v_0Array) {
        this();
        if (v_0Array.length == 0) {
            return;
        }
        this.a(new ArrayList<v_0>(Arrays.asList(v_0Array)));
    }

    public w_0 c() {
        return new w_0(this);
    }

    @Override
    protected void a(StringBuilder stringBuilder) {
        this.b(stringBuilder);
        stringBuilder.append(this.k);
        super.a(stringBuilder);
    }

    @Override
    public String toString() {
        return j[4] + this.k + j[5] + super.toString() + '}';
    }

    public String b() {
        return this.k;
    }

    public void c(String string) {
        this.k = string;
    }

    public w_0(String string) {
        this.k = string;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof w_0)) {
            return false;
        }
        w_0 w_02 = (w_0)object;
        if (!w_02.a((Object)this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        String string = this.b();
        String string2 = w_02.b();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    @Override
    protected boolean a(Object object) {
        return object instanceof w_0;
    }

    @Override
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        String string = this.b();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    @Override
    public v_0 p() {
        return this.c();
    }

    static {
        w_0.a();
        i = Pattern.compile(j[6]);
    }

    private static final void a() {
        j = new String[]{hl.a("\u1bd0", 23272435), hl.a("\u2e8d\u2e91\u2e91\u2e95", 1688481509), hl.a("\uce02\uce1e\uce1e\uce1a\uce50\uce45\uce45", -351482262), hl.a("", -989259645), hl.a("\ub9ee\ub9df\ub9c2\ub9ce\ub9f9\ub9d5\ub9d7\ub9ca\ub9d5\ub9d4\ub9df\ub9d4\ub9ce\ub9c1\ub9ce\ub9df\ub9c2\ub9ce\ub987", -73025094), hl.a("\u1a35\u1a39", -1756947943), hl.a("\ub300\ub376\ub361\ub364\ub376\ub336\ub32a\ub32a\ub32e\ub32d\ub361\ub377\ub364\ub371\ub371\ub377\ub361\ub376\ub305\ub373\ub302\ub329\ub301\ub302\ub370\ub303\ub325\ub36c\ub372\ub323\ub302\ub370\ub305\ub33f\ub373\ub324\ub303\ub325\ub36c\ub372\ub36a\ub323\ub377\ub376\ub371\ub305\ub33f\ub373\ub324\ub36e\ub373\ub367\ub303\ub374\ub377\ub361\ub37a", -2049723554)};
    }
}

