package litebans;

import java.io.Serializable;
import litebans.eE;

/*
 * Renamed from litebans.cu
 */
public static final class cu_0
implements eE,
Serializable {
    private final Object a;

    public cu_0(Object object) {
        this.a = object;
    }

    @Override
    public Object a() {
        return this.a;
    }

    public String toString() {
        return String.valueOf(this.a());
    }
}

