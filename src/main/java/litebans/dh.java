package litebans;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import litebans.aJ;
import litebans.a_;
import litebans.bz;
import litebans.hl;
import org.jetbrains.annotations.Nullable;

public final class dh {
    private static /* synthetic */ String[] a;

    private dh() {
    }

    public final List a() {
        return a_.d();
    }

    public final a_ a(@Nullable String string) {
        Object v1;
        block2: {
            String string2 = string;
            if (string2 == null) {
                return null;
            }
            Object object = string2;
            String string3 = bz.c(((String)object).toLowerCase(Locale.ROOT), 's', null, 2, null);
            object = a_.l.a();
            boolean bl = true;
            boolean bl2 = false;
            Object object2 = object;
            Iterator iterator = object2.iterator();
            while (iterator.hasNext()) {
                Object t2;
                Object t3 = t2 = iterator.next();
                boolean bl3 = false;
                if (!bz.a(string3, String.valueOf(t3), bl)) continue;
                v1 = t2;
                break block2;
            }
            v1 = null;
        }
        return v1;
    }

    public /* synthetic */ dh(aJ aJ2) {
        this();
    }

    private static final void b() {
        a = new String[]{"un", "temp_", "temp_ip", "ip", "un", "un", "temp_", "temp_ip", "ip", "un", "silent_"};
    }

    static {
        dh.b();
    }
}

