package litebans;

import java.security.PrivilegedAction;
import java.util.SortedMap;
import java.util.TreeMap;
import litebans.dm_0;
import litebans.ep_0;

static final class e_
implements PrivilegedAction {
    e_() {
    }

    public SortedMap a() {
        TreeMap treeMap = new TreeMap();
        ep_0.a(ep_0.e().a(), ep_0.e(), treeMap);
        for (dm_0 dm_02 : ep_0.d()) {
            ep_0.a(dm_02.a(), dm_02, treeMap);
        }
        return treeMap;
    }

    public Object run() {
        return this.a();
    }
}

