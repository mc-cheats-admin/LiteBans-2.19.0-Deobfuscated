package litebans;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.zip.ZipException;
public class LiteBansModule_98
implements LiteBansModule_178,
Cloneable,
Serializable {
    private static final LiteBansModule_289 c;
    private static final long AsyncBackgroundTask_5;
    public static final byte LiteBansModule_195;
    public static final byte i;
    public static final byte LiteBansModule_241;
    private byte g;
    private boolean LiteBansModule_403;
    private boolean LiteBansModule_31;
    private boolean m;
    private LiteBansModule_85 Utf8Handler_2;
    private LiteBansModule_85 GnuSparseMapHandler;
    private LiteBansModule_85 e;

    @Override
    public LiteBansModule_289 c() {
        return c;
    }

    @Override
    public LiteBansModule_289 LiteBansModule_31() {
        return new LiteBansModule_289(1 + (this.LiteBansModule_403 ? 4 : 0) + (this.LiteBansModule_31 && this.GnuSparseMapHandler != null ? 4 : 0) + (this.m && this.e != null ? 4 : 0));
    }

    @Override
    public LiteBansModule_289 BaseCoreGenericHandler() {
        return new LiteBansModule_289(1 + (this.LiteBansModule_403 ? 4 : 0));
    }

    @Override
    public byte[] e() {
        byte[] byArray = new byte[this.LiteBansModule_31().BaseCoreGenericHandler()];
        byArray[n++] = 0;
        if (this.LiteBansModule_403) {
            byArray[0] = (byte)(byArray[0] | 1);
            System.arraycopy(this.Utf8Handler_2.c(), 0, byArray, n, 4);
            n += 4;
        }
        if (this.LiteBansModule_31 && this.GnuSparseMapHandler != null) {
            byArray[0] = (byte)(byArray[0] | 2);
            System.arraycopy(this.GnuSparseMapHandler.c(), 0, byArray, n, 4);
            n += 4;
        }
        if (this.m && this.e != null) {
            byArray[0] = (byte)(byArray[0] | 4);
            System.arraycopy(this.e.c(), 0, byArray, n, 4);
            n += 4;
        }
        return byArray;
    }

    @Override
    public byte[] AsyncBackgroundTask_5() {
        return Arrays.copyOf(this.e(), this.plugin().BaseCoreGenericHandler());
    }

    @Override
    public void BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        this.plugin();
        if (n2 < 1) {
            throw new ZipException("X5455_ExtendedTimestamp too short, only " + n2 + " bytes");
        }
        int n3 = n + n2;
        this.plugin(byArray[n++]);
        if (this.LiteBansModule_403 && n + 4 <= n3) {
            this.Utf8Handler_2 = new LiteBansModule_85(byArray, n);
            n += 4;
        }
        if (this.LiteBansModule_31 && n + 4 <= n3) {
            this.GnuSparseMapHandler = new LiteBansModule_85(byArray, n);
            n += 4;
        }
        if (this.m && n + 4 <= n3) {
            this.e = new LiteBansModule_85(byArray, n);
            n += 4;
        }
    }

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
        this.plugin();
        this.plugin(byArray, n, n2);
    }

    private final void BaseCoreGenericHandler() {
        this.plugin((byte)0);
        this.Utf8Handler_2 = null;
        this.GnuSparseMapHandler = null;
        this.e = null;
    }

    public void BaseCoreGenericHandler(byte by2) {
        this.g = by2;
        this.LiteBansModule_403 = (by2 & 1) == 1;
        this.LiteBansModule_31 = (by2 & 2) == 2;
        this.m = (by2 & 4) == 4;
    }

    public Date LiteBansModule_31() {
        return LiteBansModule_98.BaseCoreGenericHandler(this.Utf8Handler_2);
    }

    public Date c() {
        return LiteBansModule_98.BaseCoreGenericHandler(this.GnuSparseMapHandler);
    }

    public Date AsyncBackgroundTask_5() {
        return LiteBansModule_98.BaseCoreGenericHandler(this.e);
    }

    public String toString() {
        Date date;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x5455 Zip Extra Field: Flags=");
        stringBuilder.append(Integer.toBinaryString(LiteBansModule_189.BaseCoreGenericHandler((int)this.g))).append(" ");
        if (this.LiteBansModule_403 && this.Utf8Handler_2 != null) {
            date = this.LiteBansModule_31();
            stringBuilder.append(" Modify:[").append(date).append("] ");
        }
        if (this.LiteBansModule_31 && this.GnuSparseMapHandler != null) {
            date = this.c();
            stringBuilder.append(" Access:[").append(date).append("] ");
        }
        if (this.m && this.e != null) {
            date = this.AsyncBackgroundTask_5();
            stringBuilder.append(" Create:[").append(date).append("] ");
        }
        return stringBuilder.toString();
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object targetObj) {
        if (targetObj instanceof LiteBansModule_98) {
            LiteBansModule_98 cq_02 = (LiteBansModule_98)targetObj;
            return (this.g & 7) == (cq_02.g & 7) && (this.Utf8Handler_2 == cq_02.Utf8Handler_2 || this.Utf8Handler_2 != null && this.Utf8Handler_2.equals(cq_02.Utf8Handler_2)) && (this.GnuSparseMapHandler == cq_02.GnuSparseMapHandler || this.GnuSparseMapHandler != null && this.GnuSparseMapHandler.equals(cq_02.GnuSparseMapHandler)) && (this.e == cq_02.e || this.e != null && this.e.equals(cq_02.e));
        }
        return false;
    }

    public int hashCode() {
        int n = -123 * (this.g & 7);
        if (this.Utf8Handler_2 != null) {
            n ^= this.Utf8Handler_2.hashCode();
        }
        if (this.GnuSparseMapHandler != null) {
            n ^= Integer.rotateLeft(this.GnuSparseMapHandler.hashCode(), 11);
        }
        if (this.e != null) {
            n ^= Integer.rotateLeft(this.e.hashCode(), 22);
        }
        return n;
    }

    private static final Date BaseCoreGenericHandler(LiteBansModule_85 ci_02) {
        return ci_02 != null ? new Date((long)ci_02.LiteBansModule_31() * 1000L) : null;
    }

    static {
        LiteBansModule_241 = (byte)4;
        i = (byte)2;
        LiteBansModule_195 = 1;
        AsyncBackgroundTask_5 = 1L;
        c = new LiteBansModule_289(21589);
    }
}

