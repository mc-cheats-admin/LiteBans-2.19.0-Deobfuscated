package litebans;

import litebans.as;
import litebans.cg;
import litebans.dZ;
import litebans.hl;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class au {
    private final long f;
    private final long e;
    private final long d;
    private final long a;
    private final long c;
    private static /* synthetic */ String[] b;

    public au(long l3, long l5, long l7, long l8, long l9) {
        this.f = l3;
        this.e = l5;
        this.d = l7;
        this.a = l8;
        this.c = l9;
    }

    public final long a() {
        return this.c;
    }

    public final long a(@NotNull dZ dZ2) {
        long l3;
        switch (cg.a[dZ2.u().ordinal()]) {
            case 1: {
                l3 = this.f;
                break;
            }
            case 2: {
                l3 = this.e;
                break;
            }
            case 3: {
                l3 = this.d;
                break;
            }
            case 4: {
                l3 = this.a;
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
        return "(a=" + this.f + ", mute=" + this.e + ", warn=" + this.d + ", kick=" + this.a + ", redo=" + this.c + ')';
    }

    public int hashCode() {
        int n = Long.hashCode(this.f);
        n = n * 31 + Long.hashCode(this.e);
        n = n * 31 + Long.hashCode(this.d);
        n = n * 31 + Long.hashCode(this.a);
        n = n * 31 + Long.hashCode(this.c);
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof au)) {
            return false;
        }
        au au2 = (au)object;
        if (this.f != au2.f) {
            return false;
        }
        if (this.e != au2.e) {
            return false;
        }
        if (this.d != au2.d) {
            return false;
        }
        if (this.a != au2.a) {
            return false;
        }
        return this.c == au2.c;
    }

    private static final void b() {
        b = new String[]{"(a=", ", mute=", ", warn=", ", kick=", ", redo="};
    }

    static {
        au.b();
    }
}

