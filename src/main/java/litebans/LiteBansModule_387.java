package litebans;

import kotlin.jvm.internal.Reflection;
public class LiteBansModule_387
extends LiteBansModule_382
implements LiteBansModule_135,
LiteBansModule_196 {
    private final int i;
    private final int LiteBansModule_240;
    public LiteBansModule_387(int n, Object targetObj, Class clazz, String string, String string2, int n2) {
        super(targetObj, clazz, string, string2, (n2 & 1) == 1);
        this.i = n;
        this.LiteBansModule_240 = n2 >> 1;
    }

    @Override
    protected LiteBansModule_133 e() {
        return Reflection.function(this);
    }

    public boolean equals(Object targetObj) {
        if (targetObj == this) {
            return true;
        }
        if (targetObj instanceof LiteBansModule_387) {
            LiteBansModule_387 kp_02 = (LiteBansModule_387)targetObj;
            return this.plugin().equals(kp_02.BaseCoreGenericHandler()) && this.AsyncBackgroundTask_5().equals(kp_02.AsyncBackgroundTask_5()) && this.LiteBansModule_240 == kp_02.LiteBansModule_240 && this.i == kp_02.i && ObjectUtilities.BaseCoreGenericHandler(this.c(), kp_02.c()) && ObjectUtilities.BaseCoreGenericHandler(this.LiteBansModule_31(), kp_02.LiteBansModule_31());
        }
        if (targetObj instanceof LiteBansModule_196) {
            return targetObj.equals(this.plugin());
        }
        return false;
    }

    public int hashCode() {
        return ((this.LiteBansModule_31() == null ? 0 : this.LiteBansModule_31().hashCode() * 31) + this.plugin().hashCode()) * 31 + this.AsyncBackgroundTask_5().hashCode();
    }

    public String toString() {
        LiteBansModule_133 dp_02 = this.plugin();
        if (dp_02 != this) {
            return dp_02.toString();
        }
        return "<init>".equals(this.plugin()) ? "constructor (Kotlin reflection is not available)" : "function " + this.plugin() + " (Kotlin reflection is not available)";
    }

    private static final void BaseCoreGenericHandler() {
        GnuSparseMapHandler = new String[]{"<init>", "constructor (Kotlin reflection is not available)", "function ", " (Kotlin reflection is not available)"};
}

