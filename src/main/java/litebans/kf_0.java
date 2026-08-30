package litebans;

import litebans.hl;
import litebans.hm_0;

/*
 * Renamed from litebans.kF
 */
public static final class kf_0 {
    private final hm_0 c;
    private final String a;
    private static /* synthetic */ String[] b;

    public hm_0 a() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public String toString() {
        return b[0] + (Object)((Object)this.a()) + b[1] + this.c() + b[2];
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kf_0)) {
            return false;
        }
        kf_0 kf_02 = (kf_0)object;
        hm_0 hm_02 = this.a();
        hm_0 hm_03 = kf_02.a();
        if (hm_02 == null ? hm_03 != null : !((Object)((Object)hm_02)).equals((Object)hm_03)) {
            return false;
        }
        String string = this.c();
        String string2 = kf_02.c();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        hm_0 hm_02 = this.a();
        n2 = n2 * 59 + (hm_02 == null ? 43 : ((Object)((Object)hm_02)).hashCode());
        String string = this.c();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    public kf_0(hm_0 hm_02, String string) {
        this.c = hm_02;
        this.a = string;
    }

    private static final void b() {
        b = new String[]{hl.a("\u7c5a\u7c75\u7c70\u7c7a\u7c72\u7c5c\u7c6f\u7c7c\u7c77\u7c6d\u7c31\u7c78\u7c7a\u7c6d\u7c70\u7c76\u7c77\u7c24", 181500953), hl.a("\ubcc3\ubccf\ubc99\ubc8e\ubc83\ubc9a\ubc8a\ubcd2", 1899281647), hl.a("\u1249", 701174368)};
    }

    static {
        kf_0.b();
    }
}

