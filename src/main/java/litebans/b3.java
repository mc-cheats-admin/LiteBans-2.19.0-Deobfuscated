package litebans;

import litebans.aQ;
import litebans.a_;
import litebans.as;
import litebans.hl;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class b3 {
    private final long c;
    private final long b;
    private static /* synthetic */ String[] a;

    public b3(long l3, long l5) {
        this.c = l3;
        this.b = l5;
    }

    public final long a(@NotNull a_ a_2) {
        long l3;
        switch (aQ.a[a_2.ordinal()]) {
            case 1: {
                l3 = this.c;
                break;
            }
            case 2: {
                l3 = this.b;
                break;
            }
            default: {
                x_0.a();
                throw new as();
            }
        }
        return l3;
    }

    public String toString() {
        return a[0] + this.c + a[1] + this.b + ')';
    }

    public int hashCode() {
        int n = Long.hashCode(this.c);
        n = n * 31 + Long.hashCode(this.b);
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b3)) {
            return false;
        }
        b3 b32 = (b3)object;
        if (this.c != b32.c) {
            return false;
        }
        return this.b == b32.b;
    }

    private static final void a() {
        a = new String[]{hl.a("\u93c2\u938b\u93d7", -213871638), hl.a("\ud310\ud31c\ud351\ud349\ud348\ud359\ud301", 1337316156)};
    }

    static {
        b3.a();
    }
}

