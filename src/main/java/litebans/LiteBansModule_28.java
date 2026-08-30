package litebans;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class LiteBansModule_28 {
    public static final boolean BaseCoreGenericHandler(Collection collection, Iterator iterator) {
        Objects.requireNonNull(collection);
        Objects.requireNonNull(iterator);
        while (iterator.hasNext()) {
            flag |= collection.add(iterator.next());
        }
        return flag;
}

