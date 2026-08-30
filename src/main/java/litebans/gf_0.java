package litebans;

import java.util.Collection;
import litebans.cp_0;
import litebans.di_0;
import litebans.ew;
import litebans.fg_0;
import litebans.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.gf
 */
public static final class gf_0
extends fg_0 {
    private final String e;
    private final String d;
    private final String f;

    public gf_0(@NotNull di_0 di_02, @NotNull String string, @NotNull String string2, @Nullable String string3) {
        super(di_02);
        this.e = string;
        this.d = string2;
        this.f = string3;
    }

    @Override
    public void run() {
        boolean bl;
        String string;
        String string2;
        String string3;
        s s2;
        block4: {
            s s3;
            s2 = s3 = (s)this.h().a(s.class);
            string3 = this.e;
            string2 = this.d;
            string = this.f;
            boolean bl2 = false;
            Iterable iterable = s2.a();
            boolean bl3 = false;
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                bl = false;
            } else {
                for (Object t2 : iterable) {
                    cp_0 cp_02 = (cp_0)t2;
                    boolean bl4 = false;
                    if (!(ew.a((Object)cp_02.c(), (Object)string3) && ew.a((Object)cp_02.g(), (Object)string2) && ew.a((Object)cp_02.b(), (Object)string))) continue;
                    bl = true;
                    break block4;
                }
                bl = false;
            }
        }
        if (!bl) {
            s2.a().put(new cp_0(string3, string2, string));
        }
    }
}

