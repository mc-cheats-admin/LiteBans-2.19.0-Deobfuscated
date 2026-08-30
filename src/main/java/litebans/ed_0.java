package litebans;

import litebans.hl;

/*
 * Renamed from litebans.eD
 */
public static abstract class ed_0 {
    private static /* synthetic */ String[] a;

    public String toString() {
        return a[0];
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ed_0)) {
            return false;
        }
        ed_0 ed_02 = (ed_0)object;
        return ed_02.a(this);
    }

    protected boolean a(Object object) {
        return object instanceof ed_0;
    }

    public int hashCode() {
        boolean bl = true;
        return 1;
    }

    private static final void a() {
        a = new String[]{hl.a("\u7706\u772a\u772b\u7731\u7720\u772b\u7731\u776d\u776c", 646739781)};
    }

    static {
        ed_0.a();
    }
}

