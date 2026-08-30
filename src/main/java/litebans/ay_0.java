package litebans;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/*
 * Renamed from litebans.ay
 */
public static class ay_0 {
    public static final boolean a(Collection collection, Iterator iterator) {
        Objects.requireNonNull(collection);
        Objects.requireNonNull(iterator);
        boolean bl = false;
        while (iterator.hasNext()) {
            bl |= collection.add(iterator.next());
        }
        return bl;
    }
}

