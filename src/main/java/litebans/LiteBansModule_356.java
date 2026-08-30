package litebans;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.zip.ZipException;
public class LiteBansModule_356
implements LiteBansModule_177,
Cloneable,
Serializable {
    private static final LiteBansModule_288 LiteBansModule_240;
    private static final LiteBansModule_288 AsyncBackgroundTask_5;
    private static final BigInteger LiteBansModule_31;
    private static final long c;
    private int LiteBansModule_194 = 1;
    private BigInteger e;
    private BigInteger g;

    public LiteBansModule_356() {
        this.plugin();
    }

    @Override
    public LiteBansModule_288 c() {
        return LiteBansModule_240;
    }

    @Override
    public LiteBansModule_288 LiteBansModule_31() {
        byte[] byArray = LiteBansModule_356.BaseCoreGenericHandler(this.e.toByteArray());
        int n = byArray == null ? 0 : byArray.length;
        byArray = LiteBansModule_356.BaseCoreGenericHandler(this.g.toByteArray());
        int n2 = byArray == null ? 0 : byArray.length;
        return new LiteBansModule_288(3 + n + n2);
    }

    @Override
    public LiteBansModule_288 BaseCoreGenericHandler() {
        return AsyncBackgroundTask_5;
    }

    @Override
    public byte[] e() {
        byte[] byArray = this.e.toByteArray();
        byte[] byArray2 = this.g.toByteArray();
        int n = (byArray = LiteBansModule_356.BaseCoreGenericHandler(byArray)) != null ? byArray.length : 0;
        byArray2 = LiteBansModule_356.BaseCoreGenericHandler(byArray2);
        int n2 = byArray2 != null ? byArray2.length : 0;
        byte[] byArray3 = new byte[3 + n + n2];
        if (byArray != null) {
            LiteBansModule_188.BaseCoreGenericHandler(byArray);
        }
        if (byArray2 != null) {
            LiteBansModule_188.BaseCoreGenericHandler(byArray2);
        }
        int n3 = 0;
        byArray3[n3++] = LiteBansModule_188.BaseCoreGenericHandler(this.LiteBansModule_194);
        byArray3[n3++] = LiteBansModule_188.BaseCoreGenericHandler(n);
        if (byArray != null) {
            System.arraycopy(byArray, 0, byArray3, n3, n);
        }
        n3 += n;
        byArray3[n3++] = LiteBansModule_188.BaseCoreGenericHandler(n2);
        if (byArray2 != null) {
            System.arraycopy(byArray2, 0, byArray3, n3, n2);
        }
        return byArray3;
    }

    @Override
    public byte[] AsyncBackgroundTask_5() {
        return new byte[0];
    }

    @Override
    public void BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        int n3;
        int n4;
        this.plugin();
        if (n2 < 3) {
            throw new ZipException("X7875_NewUnix length is too short, only " + n2 + " bytes");
        }
        this.LiteBansModule_194 = LiteBansModule_188.BaseCoreGenericHandler(byArray[n++]);
        if ((n4 = LiteBansModule_188.BaseCoreGenericHandler(byArray[n++])) + 3 > n2) {
            throw new ZipException("X7875_NewUnix invalid: uidSize " + n4 + " doesn'AsyncBackgroundTask_22 fit into " + n2 + " bytes");
        }
        byte[] byArray2 = Arrays.copyOfRange(byArray, n, n + n4);
        n += n4;
        this.e = new BigInteger(1, LiteBansModule_188.BaseCoreGenericHandler(byArray2));
        if (n4 + 3 + (n3 = LiteBansModule_188.BaseCoreGenericHandler(byArray[n++])) > n2) {
            throw new ZipException("X7875_NewUnix invalid: gidSize " + n3 + " doesn'AsyncBackgroundTask_22 fit into " + n2 + " bytes");
        }
        byte[] byArray3 = Arrays.copyOfRange(byArray, n, n + n3);
        this.g = new BigInteger(1, LiteBansModule_188.BaseCoreGenericHandler(byArray3));
    }

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
    }

    private final void BaseCoreGenericHandler() {
        this.e = LiteBansModule_31;
        this.g = LiteBansModule_31;
    }

    public String toString() {
        return "0x7875 Zip Extra Field: UID=" + this.e + " GID=" + this.g;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object object) {
        if (object instanceof LiteBansModule_356) {
            LiteBansModule_356 ju2 = (LiteBansModule_356)object;
            return this.LiteBansModule_194 == ju2.LiteBansModule_194 && this.e.equals(ju2.e) && this.g.equals(ju2.g);
        }
        return false;
    }

    public int hashCode() {
        int n = -1234567 * this.LiteBansModule_194;
        n ^= Integer.rotateLeft(this.e.hashCode(), 16);
        return n ^= this.g.hashCode();
    }

    static final byte[] BaseCoreGenericHandler(byte[] byArray) {
        if (byArray == null) {
            return byArray;
        }
        int n = 0;
        for (byte by2 : byArray) {
            if (by2 != 0) break;
            ++n;
        }
        boolean flag = true;
        byte[] byArray2 = new byte[Math.max(1, byArray.length - n)];
        int n2 = byArray2.length - (byArray.length - n);
        System.arraycopy(byArray, n, byArray2, n2, byArray2.length - n2);
        return byArray2;
    }

    static {
        c = 1L;
        LiteBansModule_240 = new LiteBansModule_288(30837);
        AsyncBackgroundTask_5 = new LiteBansModule_288(0);
        LiteBansModule_31 = BigInteger.valueOf(1000L);
    }
}

