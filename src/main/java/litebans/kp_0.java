package litebans;

import kotlin.jvm.internal.Reflection;
import litebans.dp_0;
import litebans.ds_0;
import litebans.ew;
import litebans.f1;
import litebans.hl;
import litebans.kl_0;

public class kp_0
extends kl_0
implements ds_0,
f1 {
    private final int i;
    private final int h;
    private static /* synthetic */ String[] j;

    public kp_0(int n, Object object, Class clazz, String string, String string2, int n2) {
        super(object, clazz, string, string2, (n2 & 1) == 1);
        this.i = n;
        this.h = n2 >> 1;
    }

    @Override
    protected dp_0 e() {
        return Reflection.function((kp_0)this);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof kp_0) {
            kp_0 kp_02 = (kp_0)object;
            return this.a().equals(kp_02.a()) && this.d().equals(kp_02.d()) && this.h == kp_02.h && this.i == kp_02.i && ew.a(this.c(), kp_02.c()) && ew.a((Object)this.b(), kp_02.b());
        }
        if (object instanceof f1) {
            return object.equals(this.a());
        }
        return false;
    }

    public int hashCode() {
        return ((this.b() == null ? 0 : this.b().hashCode() * 31) + this.a().hashCode()) * 31 + this.d().hashCode();
    }

    public String toString() {
        dp_0 dp_02 = this.a();
        if (dp_02 != this) {
            return dp_02.toString();
        }
        return "<init>".equals(this.a()) ? "constructor (Kotlin reflection is not available)" : "function " + this.a() + " (Kotlin reflection is not available)";
    }

    private static final void a() {
        j = new String[]{"<init>", "constructor (Kotlin reflection is not available)", "function ", " (Kotlin reflection is not available)"};
    }

    static {
        kp_0.a();
    }
}

