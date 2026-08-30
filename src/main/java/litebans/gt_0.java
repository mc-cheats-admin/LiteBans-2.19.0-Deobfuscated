package litebans;

import java.util.Collections;
import java.util.HashSet;

/*
 * Renamed from litebans.gT
 */
public static class gt_0 {
    @SafeVarargs
    public static final HashSet a(Object[] objectArray) {
        HashSet hashSet = new HashSet(objectArray.length);
        Collections.addAll(hashSet, objectArray);
        return hashSet;
    }
}

