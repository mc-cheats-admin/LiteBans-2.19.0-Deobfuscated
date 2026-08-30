package litebans;

import java.io.Serializable;
import kotlin.jvm.internal.Reflection;
public abstract class LiteBansModule_382
implements LiteBansModule_133,
Serializable {
    private transient LiteBansModule_133 e;
    protected final Object AsyncBackgroundTask_5;
    private final Class BaseCoreGenericHandler;
    private final String c;
    private final String LiteBansModule_194;
    private final boolean g;
    public static final Object LiteBansModule_31 = LiteBansModule_207.LiteBansModule_31();

    public LiteBansModule_382() {
        this(LiteBansModule_31);
    }

    protected LiteBansModule_382(Object object) {
        this(object, null, null, null, false);
    }

    protected LiteBansModule_382(Object object, Class clazz, String string, String string2, boolean flag) {
        this.AsyncBackgroundTask_5 = object;
        this.plugin = clazz;
        this.c = string;
        this.LiteBansModule_194 = string2;
        this.g = flag;
    }

    protected abstract LiteBansModule_133 e();

    public Object c() {
        return this.AsyncBackgroundTask_5;
    }

    public LiteBansModule_133 BaseCoreGenericHandler() {
        LiteBansModule_133 dp_02 = this.e;
        if (dp_02 == null) {
            this.e = dp_02 = this.e();
        }
        return dp_02;
    }

    public LiteBansModule_73 LiteBansModule_31() {
        return this.plugin == null ? null : (this.g ? Reflection.getOrCreateKotlinPackage((Class)this.plugin) : Reflection.getOrCreateKotlinClass((Class)this.plugin));
    }

    @Override
    public String BaseCoreGenericHandler() {
        return this.c;
    }

    public String AsyncBackgroundTask_5() {
        return this.LiteBansModule_194;
    }
}

