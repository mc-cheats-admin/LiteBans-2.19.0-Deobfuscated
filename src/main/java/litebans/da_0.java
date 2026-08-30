package litebans;

import litebans.d4;
import litebans.gu_0;

/*
 * Renamed from litebans.dA
 */
public static class da_0
implements d4,
gu_0 {
    private final short K;
    private final int J;
    private long I;
    private long H;
    private String L;

    private final void a() {
        if ((this.K & 3) == 0) {
            throw new UnsupportedOperationException();
        }
    }

    public long d() {
        this.a();
        return this.I & 0xFFFFFFFFL;
    }

    @Override
    public long getSize() {
        return this.H;
    }

    public short c() {
        return this.K;
    }

    public int b() {
        if (this.J == 0) {
            return 0;
        }
        long l3 = this.H;
        int n = (int)(l3 % (long)this.J);
        if (n > 0) {
            return this.J - n;
        }
        return 0;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.L == null ? 0 : this.L.hashCode());
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        da_0 da_02 = (da_0)object;
        if (this.L == null) {
            return da_02.L == null;
        }
        return this.L.equals(da_02.L);
    }
}

