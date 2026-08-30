package litebans;

import java.util.List;
import litebans.FabricPlugin;
import litebans.di_0;
import litebans.j_0;
import litebans.jv_0;

public class N
extends j_0 {
    public N(di_0 di_02) {
        super(di_02);
    }

    @Override
    public jv_0[] a() {
        List list = this.a().g().c();
        if (list == null) {
            return jv_0.a;
        }
        return (jv_0[])list.stream().map(this.a::a).toArray(jv_0[]::new);
    }

    @Override
    public int b() {
        List list = this.a().g().c();
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private final FabricPlugin a() {
        return (FabricPlugin)this.a;
    }
}

