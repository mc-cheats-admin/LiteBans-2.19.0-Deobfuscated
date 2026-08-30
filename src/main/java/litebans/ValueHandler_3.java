package litebans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

static final class ValueHandler_3
implements Map,
Serializable,
LiteBansModule_122 {
    public static final ValueHandler_3 LiteBansModule_31;
    private static final long c;
    private ValueHandler_3() {
    }

    @Override
    public boolean equals(@Nullable Object targetObj) {
        return targetObj instanceof Map && targetObj.isEmpty();
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public String toString() {
        return BaseCoreGenericHandler[0];
    }

    public int AsyncBackgroundTask_5() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean containsKey(@Nullable Object targetObj) {
        return false;
    }

    public boolean BaseCoreGenericHandler(@NotNull Void void_) {
        ObjectUtilities.BaseCoreGenericHandler(void_, BaseCoreGenericHandler[1]);
        return false;
    }

    public Void LiteBansModule_31(@Nullable Object targetObj) {
        return null;
    }

    public Set LiteBansModule_194() {
        return ElementHandler_2.LiteBansModule_31;
    }

    public Set c() {
        return ElementHandler_2.LiteBansModule_31;
    }

    public Collection LiteBansModule_31() {
        return ElementHandler.c;
    }

    private final Object e() {
        return LiteBansModule_31;
    }

    public Void BaseCoreGenericHandler(Object targetObj) {
        throw new UnsupportedOperationException(BaseCoreGenericHandler[3]);
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException(BaseCoreGenericHandler[4]);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException(BaseCoreGenericHandler[5]);
    }

    @Override
    public final int size() {
        return this.AsyncBackgroundTask_5();
    }

    @Override
    public final boolean containsValue(Object targetObj) {
        if (!(targetObj instanceof Void)) {
            return false;
        }
        return this.plugintargetObj;
    }

    public Object get(Object targetObj) {
        return this.LiteBansModule_31(targetObj);
    }

    public final Set entrySet() {
        return this.LiteBansModule_194();
    }

    public final Set keySet() {
        return this.c();
    }

    public final Collection values() {
        return this.LiteBansModule_31();
    }

    public Object put(Object targetObj, Object contextObj) {
        throw new UnsupportedOperationException(BaseCoreGenericHandler[6]);
    }

    public Object remove(Object targetObj) {
        return this.plugin(targetObj);
    }

    static {
        c = 8246714829545688274L;
        ValueHandler_3.BaseCoreGenericHandler();
        LiteBansModule_31 = new ValueHandler_3();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"{}", "value", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection"};
}

