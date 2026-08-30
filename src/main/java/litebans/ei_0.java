package litebans;

import java.util.Arrays;
import litebans.ed_0;
import litebans.hl;
import litebans.v_0;

public class ei_0
extends ed_0 {
    private final Object b;
    private static /* synthetic */ String[] c;

    public ei_0(v_0[] v_0Array) {
        this.b = v_0Array;
    }

    public ei_0(String string) {
        this.b = string;
    }

    @Override
    public boolean equals(Object object) {
        if (this.b instanceof v_0[]) {
            return object instanceof ei_0 && ((ei_0)object).b instanceof v_0[] && Arrays.equals((v_0[])this.b, (v_0[])((ei_0)object).b);
        }
        return this.b.equals(object);
    }

    @Override
    public int hashCode() {
        return this.b instanceof v_0[] ? Arrays.hashCode((v_0[])this.b) : this.b.hashCode();
    }

    public Object a() {
        return this.b;
    }

    @Override
    public String toString() {
        return "Text(value=" + this.a() + ")";
    }

    private static final void b() {
        c = new String[]{"Text(value=", ")"};
    }

    static {
        ei_0.b();
    }
}

