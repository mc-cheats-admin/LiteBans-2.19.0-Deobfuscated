package litebans;

import java.util.Arrays;
public class LiteBansModule_167
extends LiteBansModule_160 {
    private final Object LiteBansModule_31;
    public LiteBansModule_167(LiteBansModule_432[] v_0Array) {
        this.LiteBansModule_31 = v_0Array;
    }

    public LiteBansModule_167(String string) {
        this.LiteBansModule_31 = string;
    }

    @Override
    public boolean equals(Object object) {
        if (this.LiteBansModule_31 instanceof LiteBansModule_432[]) {
            return object instanceof LiteBansModule_167 && ((LiteBansModule_167)object).LiteBansModule_31 instanceof LiteBansModule_432[] && Arrays.equals((LiteBansModule_432[])this.LiteBansModule_31, (LiteBansModule_432[])((LiteBansModule_167)object).LiteBansModule_31);
        }
        return this.LiteBansModule_31.equals(object);
    }

    @Override
    public int hashCode() {
        return this.LiteBansModule_31 instanceof LiteBansModule_432[] ? Arrays.hashCode((LiteBansModule_432[])this.LiteBansModule_31) : this.LiteBansModule_31.hashCode();
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

