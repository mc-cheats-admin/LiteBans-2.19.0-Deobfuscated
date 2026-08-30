package litebans;

import litebans.as;
import litebans.cg;
import litebans.dZ;
import litebans.hl;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class au {
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
        return b[0] + this.f + b[1] + this.e + b[2] + this.d + b[3] + this.a + b[4] + this.c + ')';
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
        b = new String[]{hl.a("\u6167\u612e\u6172", -1701879473), hl.a("\uafb0\uafbc\uaff1\uafe9\uafe8\uaff9\uafa1", 706129820), hl.a("\u3a1f\u3a13\u3a44\u3a52\u3a41\u3a5d\u3a0e", 1579694643), hl.a("\ua4aa\ua4a6\ua4ed\ua4ef\ua4e5\ua4ed\ua4bb", -913988474), hl.a("\uf1e3\uf1ef\uf1bd\uf1aa\uf1ab\uf1a0\uf1f2", -1026494001)};
    }

    static {
        au.b();
    }
}

