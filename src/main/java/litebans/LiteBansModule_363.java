package litebans;

import java.util.Date;
public class LiteBansModule_363
implements LiteBansModule_177 {
    private static final LiteBansModule_288 e;
    private static final LiteBansModule_288 AsyncBackgroundTask_5;
    private static final LiteBansModule_288 c;
    private LiteBansModule_323 LiteBansModule_240 = LiteBansModule_323.BaseCoreGenericHandler;
    private LiteBansModule_323 LiteBansModule_194 = LiteBansModule_323.BaseCoreGenericHandler;
    private LiteBansModule_323 g = LiteBansModule_323.BaseCoreGenericHandler;
    private static final long LiteBansModule_31;

    @Override
    public LiteBansModule_288 c() {
        return e;
    }

    @Override
    public LiteBansModule_288 LiteBansModule_31() {
        return new LiteBansModule_288(32);
    }

    @Override
    public LiteBansModule_288 BaseCoreGenericHandler() {
        return this.LiteBansModule_31();
    }

    @Override
    public byte[] e() {
        byte[] byArray = new byte[this.LiteBansModule_31().BaseCoreGenericHandler()];
        int n = 4;
        System.arraycopy(AsyncBackgroundTask_5.LiteBansModule_31(), 0, byArray, n, 2);
        System.arraycopy(c.LiteBansModule_31(), 0, byArray, n += 2, 2);
        System.arraycopy(this.LiteBansModule_240.c(), 0, byArray, n += 2, 8);
        System.arraycopy(this.LiteBansModule_194.c(), 0, byArray, n += 8, 8);
        System.arraycopy(this.g.c(), 0, byArray, n += 8, 8);
        return byArray;
    }

    @Override
    public byte[] AsyncBackgroundTask_5() {
        return this.e();
    }

    @Override
    public void BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        int n3 = n + n2;
        n += 4;
        while (n + 4 <= n3) {
            LiteBansModule_288 i22 = new LiteBansModule_288(byArray, n);
            n += 2;
            if (i22.equals(AsyncBackgroundTask_5)) {
                this.c(byArray, n, n3 - n);
                break;
            }
            LiteBansModule_288 i23 = new LiteBansModule_288(byArray, n);
            n += 2 + i23.BaseCoreGenericHandler();
        }
    }

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
        this.AsyncBackgroundTask_5();
        this.plugin(byArray, n, n2);
    }

    public Date BaseCoreGenericHandler() {
        return LiteBansModule_363.BaseCoreGenericHandler(this.LiteBansModule_240);
    }

    public Date LiteBansModule_31() {
        return LiteBansModule_363.BaseCoreGenericHandler(this.LiteBansModule_194);
    }

    public Date c() {
        return LiteBansModule_363.BaseCoreGenericHandler(this.g);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x000A Zip Extra Field:").append(" Modify:[").append(this.plugin()).append("] ").append(" Access:[").append(this.LiteBansModule_31()).append("] ").append(" Create:[").append(this.c()).append("] ");
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        if (object instanceof LiteBansModule_363) {
            LiteBansModule_363 jz_02 = (LiteBansModule_363)object;
            return (this.LiteBansModule_240 == jz_02.LiteBansModule_240 || this.LiteBansModule_240 != null && this.LiteBansModule_240.equals(jz_02.LiteBansModule_240)) && (this.LiteBansModule_194 == jz_02.LiteBansModule_194 || this.LiteBansModule_194 != null && this.LiteBansModule_194.equals(jz_02.LiteBansModule_194)) && (this.g == jz_02.g || this.g != null && this.g.equals(jz_02.g));
        }
        return false;
    }

    public int hashCode() {
        int n = -123;
        if (this.LiteBansModule_240 != null) {
            n ^= this.LiteBansModule_240.hashCode();
        }
        if (this.LiteBansModule_194 != null) {
            n ^= Integer.rotateLeft(this.LiteBansModule_194.hashCode(), 11);
        }
        if (this.g != null) {
            n ^= Integer.rotateLeft(this.g.hashCode(), 22);
        }
        return n;
    }

    private final void AsyncBackgroundTask_5() {
        this.LiteBansModule_240 = LiteBansModule_323.BaseCoreGenericHandler;
        this.LiteBansModule_194 = LiteBansModule_323.BaseCoreGenericHandler;
        this.g = LiteBansModule_323.BaseCoreGenericHandler;
    }

    private final void c(byte[] byArray, int n, int n2) {
        LiteBansModule_288 i22;
        if (n2 >= 26 && c.equals(i22 = new LiteBansModule_288(byArray, n))) {
            this.LiteBansModule_240 = new LiteBansModule_323(byArray, n += 2);
            this.LiteBansModule_194 = new LiteBansModule_323(byArray, n += 8);
            this.g = new LiteBansModule_323(byArray, n += 8);
        }
    }

    private static final Date BaseCoreGenericHandler(LiteBansModule_323 iw_02) {
        if (iw_02 == null || LiteBansModule_323.BaseCoreGenericHandler.equals(iw_02)) {
            return null;
        }
        long l3 = (iw_02.LiteBansModule_31() + -116444736000000000L) / 10000L;
        return new Date(l3);
    }

    static {
        LiteBansModule_31 = -116444736000000000L;
        e = new LiteBansModule_288(10);
        AsyncBackgroundTask_5 = new LiteBansModule_288(1);
        c = new LiteBansModule_288(24);
    }
}

