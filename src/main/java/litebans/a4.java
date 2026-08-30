package litebans;

import litebans.hl;
import org.jetbrains.annotations.Nullable;

public final class a4 {
    private final boolean a;
    private static /* synthetic */ String[] b;

    public a4(boolean bl) {
        this.a = bl;
    }

    public final boolean a() {
        return this.a;
    }

    public String toString() {
        return "GroupLimitOther(templateOnly=" + this.a + ')';
    }

    public int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a4)) {
            return false;
        }
        a4 a42 = (a4)object;
        return this.a == a42.a;
    }

    private static final void b() {
        b = new String[]{"GroupLimitOther(templateOnly="};
    }

    static {
        a4.b();
    }
}

