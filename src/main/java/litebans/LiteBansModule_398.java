package litebans;

import java.util.Collections;
import java.util.Date;
import java.util.Set;
public class LiteBansModule_398
implements LiteBansModule_235 {
    private String LiteBansModule_31;
    private WhiteoutHandler PunishmentTableService = WhiteoutHandler.e;
    private int q;
    private Set n = Collections.emptySet();
    private long c;
    private long Utf8Handler_2;
    private long r;
    private int GnuSparseMapHandler;
    private int LiteBansModule_401;
    private final LiteBansModule_316 i = null;
    private final LiteBansModule_284 g = new LiteBansModule_284();
    private String LiteBansModule_194;
    private int m;
    private int BroadcastService;
    private int LiteBansModule_240;
    private long AsyncBackgroundTask_5;
    private int e;

    public TapeHandler BaseCoreGenericHandler() {
        return this.g.BaseCoreGenericHandler();
    }

    public int LiteBansModule_31() {
        return this.g.LiteBansModule_31();
    }

    public boolean AsyncBackgroundTask_5(int n) {
        return (this.g.BaseCoreGenericHandler(n) & 1) == 0;
    }

    public int hashCode() {
        return this.BroadcastService;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || !object.getClass().equals(this.getClass())) {
            return false;
        }
        LiteBansModule_398 ky_02 = (LiteBansModule_398)object;
        if (ky_02.g == null) {
            return false;
        }
        if (this.BroadcastService != ky_02.BroadcastService) {
            return false;
        }
        return (this.i != null || ky_02.i == null) && (this.i == null || this.i.equals(ky_02.i));
    }

    public String toString() {
        return this.getName();
    }

    static final LiteBansModule_398 BaseCoreGenericHandler(byte[] byArray) {
        LiteBansModule_398 ky_02 = new LiteBansModule_398();
        LiteBansModule_284 hz2 = ky_02.g;
        LiteBansModule_284.BaseCoreGenericHandler(hz2, TapeHandler.BaseCoreGenericHandler(LiteBansModule_108.LiteBansModule_31(byArray, 0)));
        LiteBansModule_284.AsyncBackgroundTask_5(hz2, LiteBansModule_108.LiteBansModule_31(byArray, 12));
        ky_02.BroadcastService = LiteBansModule_284.c(hz2, LiteBansModule_108.LiteBansModule_31(byArray, 20));
        int n = LiteBansModule_108.c(byArray, 32);
        ky_02.BaseCoreGenericHandler(WhiteoutHandler.BaseCoreGenericHandler(n >> 12 & 0xF));
        ky_02.c(n);
        ky_02.LiteBansModule_240 = LiteBansModule_108.c(byArray, 34);
        ky_02.BaseCoreGenericHandler(LiteBansModule_108.BaseCoreGenericHandler(byArray, 40));
        long l3 = 1000L * (long)LiteBansModule_108.LiteBansModule_31(byArray, 48) + (long)(LiteBansModule_108.LiteBansModule_31(byArray, 52) / 1000);
        ky_02.LiteBansModule_31(new Date(l3));
        l3 = 1000L * (long)LiteBansModule_108.LiteBansModule_31(byArray, 56) + (long)(LiteBansModule_108.LiteBansModule_31(byArray, 60) / 1000);
        ky_02.BaseCoreGenericHandler(new Date(l3));
        ky_02.AsyncBackgroundTask_5 = l3 = 1000L * (long)LiteBansModule_108.LiteBansModule_31(byArray, 64) + (long)(LiteBansModule_108.LiteBansModule_31(byArray, 68) / 1000);
        ky_02.e = LiteBansModule_108.LiteBansModule_31(byArray, 140);
        ky_02.LiteBansModule_31(LiteBansModule_108.LiteBansModule_31(byArray, 144));
        ky_02.BaseCoreGenericHandler(LiteBansModule_108.LiteBansModule_31(byArray, 148));
        LiteBansModule_284.LiteBansModule_31(hz2, LiteBansModule_108.LiteBansModule_31(byArray, 160));
        LiteBansModule_284.BaseCoreGenericHandler(hz2, 0);
        for (int i = 0; i < 512 && i < LiteBansModule_284.LiteBansModule_31(hz2); ++i) {
            if (byArray[164 + i] != 0) continue;
            LiteBansModule_284.BaseCoreGenericHandler(hz2);
        }
        System.arraycopy(byArray, 164, LiteBansModule_284.c(hz2), 0, 512);
        ky_02.m = hz2.c();
        return ky_02;
    }

    @Override
    public String getName() {
        return this.LiteBansModule_31;
    }

    String c() {
        return this.LiteBansModule_194;
    }

    public void BaseCoreGenericHandler(WhiteoutHandler lh_02) {
        this.PunishmentTableService = lh_02;
    }

    public void c(int n) {
        this.q = n & 0xFFF;
        this.n = SetuidHandler.BaseCoreGenericHandler(n);
    }

    public void BaseCoreGenericHandler(long l3) {
        this.c = l3;
    }

    public void BaseCoreGenericHandler(Date date) {
        this.r = date.getTime();
    }

    public void LiteBansModule_31(Date date) {
        this.Utf8Handler_2 = date.getTime();
    }

    public void LiteBansModule_31(int n) {
        this.GnuSparseMapHandler = n;
    }

    public void BaseCoreGenericHandler(int n) {
        this.LiteBansModule_401 = n;
    }
}

