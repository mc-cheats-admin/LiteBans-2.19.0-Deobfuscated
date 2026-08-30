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

public static final class hq {
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
        ch2.e().getLogger().severe(b[0]);
        if (throwable instanceof Exception) {
            ch2.e().getLogger().severe(b[1]);
        }
        throwable.printStackTrace();
    }

    public final Collection b() {
        Events events = Events.get();
        ew.b(events, b[2]);
        return ((cb)events).b();
    }

    static {
        hq.a();
        a = new hq();
    }

    private static final void a() {
        b = new String[]{hl.a("\ud299\ud2b6\ud2f8\ud2ad\ud2b6\ud2bb\ud2b9\ud2ad\ud2bf\ud2b0\ud2ac\ud2f8\ud2bd\ud2a0\ud2bb\ud2bd\ud2a8\ud2ac\ud2b1\ud2b7\ud2b6\ud2f8\ud2af\ud2b9\ud2ab\ud2f8\ud2ac\ud2b0\ud2aa\ud2b7\ud2af\ud2b6\ud2f8\ud2ba\ud2a1\ud2f8\ud2b9\ud2f8\ud294\ud2b1\ud2ac\ud2bd\ud29a\ud2b9\ud2b6\ud2ab\ud2f8\ud299\ud288\ud291\ud2f8\ud2bd\ud2ae\ud2bd\ud2b6\ud2ac\ud2f8\ud2b4\ud2b1\ud2ab\ud2ac\ud2bd\ud2b6\ud2bd\ud2aa\ud2f6", -1747070248), hl.a("\u7fe5\u7fd9\u7fd8\u7fc2\u7f91\u7fd8\u7fc2\u7f91\u7fdd\u7fd8\u7fda\u7fd4\u7fdd\u7fc8\u7f91\u7fd0\u7f91\u7fd3\u7fc4\u7fd6\u7f91\u7fd8\u7fdf\u7f91\u7fd0\u7f91\u7fc1\u7fdd\u7fc4\u7fd6\u7fd8\u7fdf\u7f91\u7fc6\u7fd9\u7fd8\u7fd2\u7fd9\u7f91\u7fd8\u7fc2\u7f91\u7fc4\u7fc2\u7fd8\u7fdf\u7fd6\u7f91\u7fc5\u7fd9\u7fd4\u7f91\u7ffd\u7fd8\u7fc5\u7fd4\u7ff3\u7fd0\u7fdf\u7fc2\u7f91\u7ff0\u7fe1\u7ff8\u7f9f", -370507855), hl.a("", -1294729630)};
    }
}

