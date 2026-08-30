package litebans;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
import litebans.hl;

public static final class g6
extends ThreadLocal {
    private static /* synthetic */ String[] a;

    g6() {
    }

    protected SimpleDateFormat a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(a[0]);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(a[1]));
        return simpleDateFormat;
    }

    public Object initialValue() {
        return this.a();
    }

    private static final void b() {
        a = new String[]{hl.a("\ua6df\ua6df\ua6df\ua6df\ua68b\ua6eb\ua6eb\ua68b\ua6c2\ua6c2\ua686\ua6ee\ua6ee\ua69c\ua6cb\ua6cb\ua69c\ua6d5\ua6d5", 2041423526), hl.a("\uf0da\uf0db\uf0cc", 44363919)};
    }

    static {
        g6.b();
    }
}

