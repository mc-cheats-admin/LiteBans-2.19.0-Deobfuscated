package litebans;

import java.io.Serializable;
import kotlin.jvm.internal.Reflection;
import litebans.cA;
import litebans.dp_0;
import litebans.fw_0;

public abstract class kl_0
implements dp_0,
Serializable {
    private transient dp_0 e;
    protected final Object d;
    private final Class a;
    private final String c;
    private final String f;
    private final boolean g;
    public static final Object b = fw_0.b();

    public kl_0() {
        this(b);
    }

    protected kl_0(Object object) {
        this(object, null, null, null, false);
    }

    protected kl_0(Object object, Class clazz, String string, String string2, boolean bl) {
        this.d = object;
        this.a = clazz;
        this.c = string;
        this.f = string2;
        this.g = bl;
    }

    protected abstract dp_0 e();

    public Object c() {
        return this.d;
    }

    public dp_0 a() {
        dp_0 dp_02 = this.e;
        if (dp_02 == null) {
            this.e = dp_02 = this.e();
        }
        return dp_02;
    }

    public cA b() {
        return this.a == null ? null : (this.g ? Reflection.getOrCreateKotlinPackage((Class)this.a) : Reflection.getOrCreateKotlinClass((Class)this.a));
    }

    @Override
    public String a() {
        return this.c;
    }

    public String d() {
        return this.f;
    }
}

