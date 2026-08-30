package litebans;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import litebans.eA;
import litebans.ei_0;
import litebans.hl;
import litebans.v_0;

public final class eu_0 {
    private final eA b;
    private final List c;
    private boolean d = false;
    private static /* synthetic */ String[] a;

    @Deprecated
    public eu_0(eA eA2, v_0[] v_0Array) {
        this.b = eA2;
        this.c = new ArrayList<ei_0>(Collections.singletonList(new ei_0(v_0Array)));
        this.d = true;
    }

    public static Class a(eA eA2, boolean bl) {
        Preconditions.checkArgument((eA2 != null ? 1 : 0) != 0, (Object)"action");
        switch (eA2.ordinal()) {
            case 0: {
                return bl ? ei_0[].class : ei_0.class;
            }
        }
        throw new UnsupportedOperationException("Action '" + eA2.name() + " not supported");
    }

    public eA d() {
        return this.b;
    }

    public List c() {
        return this.c;
    }

    public boolean b() {
        return this.d;
    }

    public String toString() {
        return "HoverEvent(action=" + (Object)((Object)this.d()) + ", contents=" + this.c() + ", legacy=" + this.b() + ")";
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eu_0)) {
            return false;
        }
        eu_0 eu_02 = (eu_0)object;
        if (this.b() != eu_02.b()) {
            return false;
        }
        eA eA2 = this.d();
        eA eA3 = eu_02.d();
        if (eA2 == null ? eA3 != null : !((Object)((Object)eA2)).equals((Object)eA3)) {
            return false;
        }
        List list = this.c();
        List list2 = eu_02.c();
        return !(list == null ? list2 != null : !((Object)list).equals(list2));
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + (this.b() ? 79 : 97);
        eA eA2 = this.d();
        n2 = n2 * 59 + (eA2 == null ? 43 : ((Object)((Object)eA2)).hashCode());
        List list = this.c();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        return n2;
    }

    public eu_0(eA eA2, List list) {
        this.b = eA2;
        this.c = list;
    }

    private static final void a() {
        a = new String[]{"action", "Action '", " not supported", "HoverEvent(action=", ", contents=", ", legacy=", ")"};
    }

    static {
        eu_0.a();
    }
}

