package litebans;

import litebans.api.RandomID;
import litebans.di_0;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lP
extends RandomID {
    private final di_0 a;

    public lP(@NotNull di_0 di_02) {
        this.a = di_02;
    }

    @Override
    public String convert(long l3) {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        return q_02.k().a(l3);
    }

    @Override
    public long reveal(@Nullable String string) {
        if (string == null) {
            return -1L;
        }
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        return q_02.k().b(string);
    }
}

