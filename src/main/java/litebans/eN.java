package litebans;

import java.util.ArrayList;
import java.util.Collection;
import litebans.eo_0;
import litebans.iv_0;
import litebans.jg_0;
import litebans.u;

public final class eN
implements eo_0 {
    final /* synthetic */ ArrayList b;
    final /* synthetic */ u a;

    public eN(ArrayList arrayList, u u2) {
        this.b = arrayList;
        this.a = u2;
    }

    public final void a(jg_0 jg_02) {
        ((Collection)this.b).add(jg_02.c());
    }

    @Override
    public Object a(Object object) {
        this.a((jg_0)object);
        return iv_0.a;
    }
}

