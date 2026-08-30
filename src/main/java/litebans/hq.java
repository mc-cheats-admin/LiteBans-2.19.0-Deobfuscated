package litebans;

import java.util.Collection;
import litebans.api.Entry;
import litebans.api.Events;
import litebans.cb;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.eu;
import litebans.ew;
import litebans.hl;
import litebans.jv;
import litebans.kS;
import litebans.kV;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class hq {
    public static final hq a;
    private static /* synthetic */ String[] b;

    private hq() {
    }

    public final void a(@NotNull ch ch2, @NotNull di_0 di_02, @NotNull CharSequence charSequence, @Nullable String string) {
        hq hq2 = this;
        ch ch3 = ch2;
        boolean bl = false;
        Collection collection = hq2.b();
        boolean bl2 = false;
        if (!collection.isEmpty()) {
            di_02.b(new kS(collection, ch3, charSequence, string));
        }
    }

    public final Entry a(@NotNull di_0 di_02, @NotNull dZ dZ2) {
        dZ dZ3 = dZ2;
        boolean bl = false;
        return new jv(di_02, dZ3.a(), dZ3.u().c().toString(), dZ3.w(), dZ3.p(), ((Object)dZ3.b()).toString(), dZ3.e(), dZ3.x(), dZ3.s(), dZ3.q(), String.valueOf(dZ3.v()), dZ3.o(), dZ3.l(), dZ3.m(), dZ3.j(), dZ3.r(), dZ3.d(), dZ3.h(), dZ3.t());
    }

    public final void a(@NotNull ch ch2, @NotNull di_0 di_02, @NotNull dZ dZ2) {
        Entry entry = this.a(di_02, dZ2);
        hq hq2 = this;
        ch ch3 = ch2;
        boolean bl = false;
        Collection collection = hq2.b();
        boolean bl2 = false;
        if (!collection.isEmpty()) {
            di_02.b(new eu(collection, ch3, entry));
        }
    }

    public final void b(@NotNull ch ch2, @NotNull di_0 di_02, @NotNull dZ dZ2) {
        Entry entry = this.a(di_02, dZ2);
        hq hq2 = this;
        ch ch3 = ch2;
        boolean bl = false;
        Collection collection = hq2.b();
        boolean bl2 = false;
        if (!collection.isEmpty()) {
            di_02.b(new kV(collection, ch3, entry));
        }
    }

    public final void a(@NotNull ch ch2, @NotNull Throwable throwable) {
        ch2.e().getLogger().severe("An uncaught exception was thrown by a LiteBans API event ");
        if (throwable instanceof Exception) {
            ch2.e().getLogger().severe("This is likely a bug in a plugin which is using the LiteBans ");
        }
        throwable.printStackTrace();
    }

    public final Collection b() {
        Events events = Events.get();
        ew.b(events, "");
        return ((cb)events).b();
    }

    static {
        hq.a();
        a = new hq();
    }

    private static final void a() {
        b = new String[]{"An uncaught exception was thrown by a LiteBans API event ", "This is likely a bug in a plugin which is using the LiteBans ", ""};
    }
}

