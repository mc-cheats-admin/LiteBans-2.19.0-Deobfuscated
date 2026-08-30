package litebans;

import java.util.Arrays;
public class LiteBansModule_168
extends LiteBansModule_161 {
    private final Object LiteBansModule_31;
        public LiteBansModule_168(LiteBansModule_434[] v_0Array) {
        this.LiteBansModule_31 = v_0Array;
    }

    public LiteBansModule_168(String string) {
        this.LiteBansModule_31 = string;
    }

    @Override
    public boolean equals(Object targetObj) {
        if (this.LiteBansModule_31 instanceof LiteBansModule_434[]) {
            return targetObj instanceof LiteBansModule_168 && ((LiteBansModule_168)targetObj).LiteBansModule_31 instanceof LiteBansModule_434[] && Arrays.equals((LiteBansModule_434[])this.LiteBansModule_31, (LiteBansModule_434[])((LiteBansModule_168)targetObj).LiteBansModule_31);
        }
        return this.LiteBansModule_31.equals(targetObj);
    }

    @Override
    public int hashCode() {
        return this.LiteBansModule_31 instanceof LiteBansModule_434[] ? Arrays.hashCode((LiteBansModule_434[])this.LiteBansModule_31) : this.LiteBansModule_31.hashCode();
    }

    public Object BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    @Override
    public String toString() {
        return "Text(value=" + this.plugin() + ")";
    }

    private static final void LiteBansModule_31() {
        c = new String[]{"Text(value=", ")"};
    }

    static {
        LiteBansModule_168.LiteBansModule_31();
    }
}

