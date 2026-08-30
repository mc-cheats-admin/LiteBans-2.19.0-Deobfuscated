package litebans;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
import litebans.hl;

public final class g6
extends ThreadLocal {
    private static /* synthetic */ String[] a;

    g6() {
    }

    protected SimpleDateFormat a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    public Object initialValue() {
        return this.a();
    }

    private static final void b() {
        a = new String[]{"yyyy-MM-dd HH:mm:ss", "UTC"};
    }

    static {
        g6.b();
    }
}

