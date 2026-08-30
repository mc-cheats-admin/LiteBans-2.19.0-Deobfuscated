package litebans;

import litebans.aJ;
import litebans.bz;
import litebans.ew;
import litebans.hN;
import litebans.hl;
import litebans.x;
import org.jetbrains.annotations.Nullable;

public final class gF {
    private static /* synthetic */ String[] a;

    private gF() {
    }

    public final boolean a(@Nullable String string, @Nullable String string2) {
        return string != null && ew.a((Object)string, (Object)string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(boolean bl, @Nullable String string, @Nullable String string2, boolean bl2) {
        if (!bl) return false;
        if (string2 == null) return false;
        if (string == null) return false;
        if (ew.a((Object)string2, (Object)string)) return true;
        if (!bl2) return false;
        CharSequence charSequence = string2;
        if (!new hN(x.b.a(string, "%", (Object)".*")).a(charSequence)) return false;
        return true;
    }

    public final boolean a(@Nullable String string) {
        return string != null && (bz.c((CharSequence)string, '%', false, 2, null) || bz.c((CharSequence)string, '_', false, 2, null));
    }

    public /* synthetic */ gF(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{"%", ".*"};
    }

    static {
        gF.a();
    }
}

