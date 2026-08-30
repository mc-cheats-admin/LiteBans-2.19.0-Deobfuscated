package litebans;

import litebans.gu_0;

/*
 * Renamed from litebans.jA
 */
public static class ja_0
implements gu_0 {
    public static final String c;
    public static final String f;
    private final String e;
    private static final int d;
    private final long b;

    public long a() {
        return this.b;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.e == null ? 0 : this.e.hashCode());
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ja_0 ja_02 = (ja_0)object;
        if (this.e == null) {
            return ja_02.e == null;
        }
        return this.e.equals(ja_02.e);
    }

    static {
        d = 33188;
        f = "`\n";
        c = "!<arch>\n";
    }
}

