package litebans;

import java.util.zip.ZipException;
import litebans.en_0;
import litebans.i2;

public final class km_0
implements en_0 {
    private static final i2 e = new i2(51966);
    private static final i2 d = new i2(0);
    private static final byte[] b = new byte[0];
    private static final km_0 c = new km_0();

    @Override
    public i2 c() {
        return e;
    }

    @Override
    public i2 b() {
        return d;
    }

    @Override
    public i2 a() {
        return d;
    }

    @Override
    public byte[] e() {
        return b;
    }

    @Override
    public byte[] d() {
        return b;
    }

    @Override
    public void a(byte[] byArray, int n, int n2) {
        if (n2 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }

    @Override
    public void b(byte[] byArray, int n, int n2) {
        this.a(byArray, n, n2);
    }
}

