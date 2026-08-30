package litebans;

import java.io.Serializable;
import kotlin.jvm.internal.Reflection;
public abstract class LiteBansModule_384
implements LiteBansModule_134,
Serializable {
    private transient LiteBansModule_134 e;
    protected final Object AsyncBackgroundTask_5;
    private final Class BaseCoreGenericHandler;
    private final String c;
    private final String LiteBansModule_195;
    private final boolean g;
    public static final Object LiteBansModule_31 = LiteBansModule_208.LiteBansModule_31();

    public LiteBansModule_384() {
        this(LiteBansModule_31);
    }

    protected LiteBansModule_384(Object targetObj) {
        this(targetObj, null, null, null, false);
    }

    protected LiteBansModule_384(Object targetObj, Class clazz, String string, String string2, boolean flag) {
        this.AsyncBackgroundTask_5 = targetObj;
        this.plugin = clazz;
        this.c = string;
        this.LiteBansModule_195 = string2;
        this.g = flag;
    }

    protected abstract LiteBansModule_134 e();

    public Object c() {
        return this.AsyncBackgroundTask_5;
    }

    public LiteBansModule_134 BaseCoreGenericHandler() {
        LiteBansModule_134 dp_02 = this.e;
        if (dp_02 == null) {
            this.e = dp_02 = this.e();
        }
        return dp_02;
    }

    public LiteBansModule_74 LiteBansModule_31() {
        return this.plugin == null ? null : (this.g ? Reflection.getOrCreateKotlinPackage((Class)this.plugin) : Reflection.getOrCreateKotlinClass((Class)this.plugin));
    }

    @Override
    public String BaseCoreGenericHandler() {
        return this.c;
    }

    public String AsyncBackgroundTask_5() {
        return this.LiteBansModule_195;
    }
}

