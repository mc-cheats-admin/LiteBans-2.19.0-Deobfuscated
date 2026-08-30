package litebans;

import java.util.zip.ZipException;
import litebans.en_0;
import litebans.i2;

public class ek
implements en_0 {
    public static final i2 f;
    public static final int g;
    private static final int e;
    private short d;
    private boolean c;
    private int b = 0;

    @Override
    public i2 c() {
        return f;
    }

    @Override
    public i2 b() {
        return new i2(2 + this.b);
    }

    @Override
    public i2 a() {
        return new i2(2);
    }

    @Override
    public byte[] e() {
        byte[] byArray = new byte[2 + this.b];
        i2.a(this.d | (this.c ? 32768 : 0), byArray, 0);
        return byArray;
    }

    @Override
    public byte[] d() {
        return i2.a(this.d | (this.c ? 32768 : 0));
    }

    @Override
    public void a(byte[] byArray, int n, int n2) {
        this.b(byArray, n, n2);
        this.b = n2 - 2;
    }

    @Override
    public void b(byte[] byArray, int n, int n2) {
        if (n2 < 2) {
            throw new ZipException("Too short content for ResourceAlignmentExtraField (0xa11e): " + n2);
        }
        int n3 = i2.a(byArray, n);
        this.d = (short)(n3 & Short.MAX_VALUE);
        this.c = (n3 & 0x8000) != 0;
    }

    static {
        e = 32768;
        g = 2;
        f = new i2(41246);
    }
}

