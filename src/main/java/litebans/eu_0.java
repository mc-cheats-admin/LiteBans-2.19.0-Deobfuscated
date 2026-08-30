package litebans;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import litebans.eA;
import litebans.ei_0;
import litebans.hl;
import litebans.v_0;

/*
 * Renamed from litebans.eU
 */
public static final class eu_0 {
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
        Preconditions.checkArgument((eA2 != null ? 1 : 0) != 0, (Object)a[0]);
        switch (eA2.ordinal()) {
            case 0: {
                return bl ? ei_0[].class : ei_0.class;
            }
        }
        throw new UnsupportedOperationException(a[1] + eA2.name() + a[2]);
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
        return a[3] + (Object)((Object)this.d()) + a[4] + this.c() + a[5] + this.b() + a[6];
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
        a = new String[]{hl.a("\ube60\ube62\ube75\ube68\ube6e\ube6f", -381370879), hl.a("\u71b7\u7195\u7182\u719f\u7199\u7198\u71d6\u71d1", 71856630), hl.a("\u3e11\u3e5f\u3e5e\u3e45\u3e11\u3e42\u3e44\u3e41\u3e41\u3e5e\u3e43\u3e45\u3e54\u3e55", 889273905), hl.a("\u3793\u37b4\u37ad\u37be\u37a9\u379e\u37ad\u37be\u37b5\u37af\u37f3\u37ba\u37b8\u37af\u37b2\u37b4\u37b5\u37e6", 69416923), hl.a("\u0b92\u0b9e\u0bdd\u0bd1\u0bd0\u0bca\u0bdb\u0bd0\u0bca\u0bcd\u0b83", -1466364994), hl.a("\u1252\u125e\u1212\u121b\u1219\u121f\u121d\u1207\u1243", -1640689026), hl.a("\u0ed5", 237768444)};
    }

    static {
        eu_0.a();
    }
}

