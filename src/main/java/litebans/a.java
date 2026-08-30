package litebans;

import java.util.List;
import litebans.di_0;
import litebans.hl;
import litebans.n_0;

public abstract class a
implements di_0 {
    private static /* synthetic */ String[] b;

    public static n_0[] a(di_0 di_02) {
        List list = di_02.f().a(n_0.class, new Class[]{di_0.class}, new Object[]{di_02});
        list.removeIf(n_02 -> !di_02.a((n_0)n_02));
        return list.toArray(new n_0[list.size()]);
    }

    private static final void a() {
        b = new String[]{"base.core.generic.data_folder", " + ", "ReflectManager", "1.0"};
    }

    static {
        a.a();
    }
}

