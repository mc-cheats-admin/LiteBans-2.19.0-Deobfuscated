package litebans;

import java.util.Collections;
import java.util.HashSet;

public class gt_0 {
    @SafeVarargs
    public static final HashSet a(Object[] objectArray) {
        HashSet hashSet = new HashSet(objectArray.length);
        Collections.addAll(hashSet, objectArray);
        return hashSet;
    }
}

