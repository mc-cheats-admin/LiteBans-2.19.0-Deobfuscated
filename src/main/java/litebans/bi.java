package litebans;

import org.jetbrains.annotations.Nullable;

public class bi
extends RuntimeException {
    private final Object a;

    public bi(@Nullable Object object) {
        super(String.valueOf(object));
        this.a = object;
    }

    public final Object a() {
        return this.a;
    }
}

