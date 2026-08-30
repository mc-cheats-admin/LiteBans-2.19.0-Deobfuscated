package litebans;

import java.util.zip.CRC32;
import java.util.zip.ZipException;
public class LiteBansModule_306
implements LiteBansModule_177,
LiteBansModule_208,
Cloneable {
    private static final LiteBansModule_288 n;
    private static final int PunishmentTableService;
    private int i = 0;
    private int GnuSparseMapHandler = 0;
    private int LiteBansModule_401 = 0;
    private String m = "";
    private boolean BroadcastService = false;
    private CRC32 Utf8Handler_2 = new CRC32();

    @Override
    public LiteBansModule_288 c() {
        return n;
    }

    @Override
    public LiteBansModule_288 LiteBansModule_31() {
        return new LiteBansModule_288(14 + this.c().getBytes().length);
    }

    @Override
    public LiteBansModule_288 BaseCoreGenericHandler() {
        return this.LiteBansModule_31();
    }

    @Override
    public byte[] e() {
        byte[] byArray = new byte[this.LiteBansModule_31().BaseCoreGenericHandler() - 4];
        System.arraycopy(LiteBansModule_288.BaseCoreGenericHandler(this.e()), 0, byArray, 0, 2);
        byte[] byArray2 = this.c().getBytes();
        System.arraycopy(LiteBansModule_84.BaseCoreGenericHandler(byArray2.length), 0, byArray, 2, 4);
        System.arraycopy(LiteBansModule_288.BaseCoreGenericHandler(this.LiteBansModule_31()), 0, byArray, 6, 2);
        System.arraycopy(LiteBansModule_288.BaseCoreGenericHandler(this.AsyncBackgroundTask_5()), 0, byArray, 8, 2);
        System.arraycopy(byArray2, 0, byArray, 10, byArray2.length);
        this.Utf8Handler_2.reset();
        this.Utf8Handler_2.update(byArray);
        long l3 = this.Utf8Handler_2.getValue();
        byte[] byArray3 = new byte[byArray.length + 4];
        System.arraycopy(LiteBansModule_84.BaseCoreGenericHandler(l3), 0, byArray3, 0, 4);
        System.arraycopy(byArray, 0, byArray3, 4, byArray.length);
        return byArray3;
    }

    @Override
    public byte[] AsyncBackgroundTask_5() {
        return this.e();
    }

    public int LiteBansModule_31() {
        return this.GnuSparseMapHandler;
    }

    public int AsyncBackgroundTask_5() {
        return this.LiteBansModule_401;
    }

    public String c() {
        return this.m;
    }

    public boolean LiteBansModule_194() {
        return this.c().length() != 0;
    }

    public void BaseCoreGenericHandler(int n) {
        this.i = this.LiteBansModule_31(n);
    }

    public int e() {
        return this.i;
    }

    public void BaseCoreGenericHandler(boolean flag) {
        this.BroadcastService = flag;
        this.i = this.LiteBansModule_31(this.i);
    }

    public boolean BaseCoreGenericHandler() {
        return this.BroadcastService && !this.LiteBansModule_194();
    }

    @Override
    public void BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        long l3 = LiteBansModule_84.BaseCoreGenericHandler(byArray, n);
        byte[] byArray2 = new byte[n2 - 4];
        System.arraycopy(byArray, n + 4, byArray2, 0, n2 - 4);
        this.Utf8Handler_2.reset();
        this.Utf8Handler_2.update(byArray2);
        long l5 = this.Utf8Handler_2.getValue();
        if (l3 != l5) {
            throw new ZipException("Bad CRC checksum, expected " + Long.toHexString(l3) + " instead of " + Long.toHexString(l5));
        }
        int n3 = LiteBansModule_288.BaseCoreGenericHandler(byArray2, 0);
        byte[] byArray3 = new byte[(int)LiteBansModule_84.BaseCoreGenericHandler(byArray2, 2)];
        this.GnuSparseMapHandler = LiteBansModule_288.BaseCoreGenericHandler(byArray2, 6);
        this.LiteBansModule_401 = LiteBansModule_288.BaseCoreGenericHandler(byArray2, 8);
        if (byArray3.length == 0) {
            this.m = "";
        } else {
            if (byArray3.length > byArray2.length - 10) {
                throw new ZipException("Bad symbolic link name length " + byArray3.length + " InitializerHandler_3 ASI extra field");
            }
            System.arraycopy(byArray2, 10, byArray3, 0, byArray3.length);
            this.m = new String(byArray3);
        }
        this.plugin((n3 & 0x4000) != 0);
        this.plugin(n3);
    }

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
        this.plugin(byArray, n, n2);
    }

    protected int LiteBansModule_31(int n) {
        int n2 = 32768;
        if (this.LiteBansModule_194()) {
            n2 = 40960;
        } else if (this.plugin()) {
            n2 = 16384;
        }
        return n2 | n & 0xFFF;
    }

    public Object clone() {
        try {
            LiteBansModule_306 ii_02 = (LiteBansModule_306)super.clone();
            ii_02.Utf8Handler_2 = new CRC32();
            return ii_02;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
}

    static {
        PunishmentTableService = 4;
        n = new LiteBansModule_288(30062);
}

