package litebans;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.zip.ZipException;
public class LiteBansModule_358
implements LiteBansModule_178,
Cloneable,
Serializable {
    private static final LiteBansModule_289 LiteBansModule_241;
    private static final LiteBansModule_289 AsyncBackgroundTask_5;
    private static final BigInteger LiteBansModule_31;
    private static final long c;
    private int LiteBansModule_195 = 1;
    private BigInteger e;
    private BigInteger g;

    public LiteBansModule_358() {
        this.plugin();
    }

    @Override
    public LiteBansModule_289 c() {
        return LiteBansModule_241;
    }

    @Override
    public LiteBansModule_289 LiteBansModule_31() {
        byte[] byArray = LiteBansModule_358.BaseCoreGenericHandler(this.e.toByteArray());
        int n = byArray == null ? 0 : byArray.length;
        byArray = LiteBansModule_358.BaseCoreGenericHandler(this.g.toByteArray());
        int n2 = byArray == null ? 0 : byArray.length;
        return new LiteBansModule_289(3 + n + n2);
    }

    @Override
    public LiteBansModule_289 BaseCoreGenericHandler() {
        return AsyncBackgroundTask_5;
    }

    @Override
    public byte[] e() {
        byte[] byArray = this.e.toByteArray();
        byte[] byArray2 = this.g.toByteArray();
        int n = (byArray = LiteBansModule_358.BaseCoreGenericHandler(byArray)) != null ? byArray.length : 0;
        byArray2 = LiteBansModule_358.BaseCoreGenericHandler(byArray2);
        int n2 = byArray2 != null ? byArray2.length : 0;
        byte[] byArray3 = new byte[3 + n + n2];
        if (byArray != null) {
            LiteBansModule_189.BaseCoreGenericHandler(byArray);
        }
        if (byArray2 != null) {
            LiteBansModule_189.BaseCoreGenericHandler(byArray2);
        }
        byArray3[n3++] = LiteBansModule_189.BaseCoreGenericHandler(this.LiteBansModule_195);
        byArray3[n3++] = LiteBansModule_189.BaseCoreGenericHandler(n);
        if (byArray != null) {
            System.arraycopy(byArray, 0, byArray3, n3, n);
        }
        n3 += n;
        byArray3[n3++] = LiteBansModule_189.BaseCoreGenericHandler(n2);
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
        this.LiteBansModule_195 = LiteBansModule_189.BaseCoreGenericHandler(byArray[n++]);
        if ((n4 = LiteBansModule_189.BaseCoreGenericHandler(byArray[n++])) + 3 > n2) {
            throw new ZipException("X7875_NewUnix invalid: uidSize " + n4 + " doesn'AsyncBackgroundTask_22 fit into " + n2 + " bytes");
        }
        byte[] byArray2 = Arrays.copyOfRange(byArray, n, n + n4);
        n += n4;
        this.e = new BigInteger(1, LiteBansModule_189.BaseCoreGenericHandler(byArray2));
        if (n4 + 3 + (n3 = LiteBansModule_189.BaseCoreGenericHandler(byArray[n++])) > n2) {
            throw new ZipException("X7875_NewUnix invalid: gidSize " + n3 + " doesn'AsyncBackgroundTask_22 fit into " + n2 + " bytes");
        }
        byte[] byArray3 = Arrays.copyOfRange(byArray, n, n + n3);
        this.g = new BigInteger(1, LiteBansModule_189.BaseCoreGenericHandler(byArray3));
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

    public boolean equals(Object targetObj) {
        if (targetObj instanceof LiteBansModule_358) {
            LiteBansModule_358 ju2 = (LiteBansModule_358)targetObj;
            return this.LiteBansModule_195 == ju2.LiteBansModule_195 && this.e.equals(ju2.e) && this.g.equals(ju2.g);
        }
        return false;
    }

    public int hashCode() {
        int n = -1234567 * this.LiteBansModule_195;
        n ^= Integer.rotateLeft(this.e.hashCode(), 16);
        return n ^= this.g.hashCode();
    }

    static final byte[] BaseCoreGenericHandler(byte[] byArray) {
        if (byArray == null) {
            return byArray;
        }
        for (byte by2 : byArray) {
            if (by2 != 0) break;
            ++n;
        }
        byte[] byArray2 = new byte[Math.max(1, byArray.length - n)];
        int n2 = byArray2.length - (byArray.length - n);
        System.arraycopy(byArray, n, byArray2, n2, byArray2.length - n2);
        return byArray2;
    }

    static {
        c = 1L;
        LiteBansModule_241 = new LiteBansModule_289(30837);
        AsyncBackgroundTask_5 = new LiteBansModule_289(0);
        LiteBansModule_31 = BigInteger.valueOf(1000L);
    }
}

