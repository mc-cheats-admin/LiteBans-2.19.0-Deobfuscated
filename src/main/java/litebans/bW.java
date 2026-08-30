package litebans;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public static final class bW {
    private static /* synthetic */ String[] a;

    public static final long a(@NotNull InputStream inputStream, @NotNull OutputStream outputStream, int n) {
        ew.a((Object)inputStream, a[27]);
        ew.a((Object)outputStream, a[28]);
        long l3 = 0L;
        byte[] byArray = new byte[n];
        int n2 = inputStream.read(byArray);
        while (n2 >= 0) {
            outputStream.write(byArray, 0, n2);
            l3 += (long)n2;
            n2 = inputStream.read(byArray);
        }
        return l3;
    }

    public static /* synthetic */ long a(InputStream inputStream, OutputStream outputStream, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 8192;
        }
        return bW.a(inputStream, outputStream, n);
    }

    public static final byte[] a(@NotNull InputStream inputStream) {
        ew.a((Object)inputStream, a[30]);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        bW.a(inputStream, byteArrayOutputStream, 0, 2, null);
        return byteArrayOutputStream.toByteArray();
    }

    private static final void a() {
        a = new String[]{hl.a("\u89c6\u898e\u8992\u8993\u8989\u89c4", 1652853242), hl.a("\ucfb3\ucffb\ucfe7\ucfe6\ucffc\ucfb1", -1909665905), hl.a("\u2b58\u2b53\u2b5a\u2b49\u2b48\u2b5e\u2b4f", -17552581), hl.a("\ub8a5\ub8ed\ub8f1\ub8f0\ub8ea\ub8a7", -2006206311), hl.a("\u8ccd\u8cc6\u8ccf\u8cdc\u8cdd\u8ccb\u8cda", -1838314322), hl.a("\uceed\ucea5\uceb9\uceb8\ucea2\uceef", 1830604497), hl.a("\u819b\u81d3\u81cf\u81ce\u81d4\u8199", 1759871399), hl.a("\u8cf9\u8cb1\u8cad\u8cac\u8cb6\u8cfb", -1706128187), hl.a("\u764b\u7603\u761f\u761e\u7604\u7649", 2137028215), hl.a("\u3f1b\u3f53\u3f4f\u3f4e\u3f54\u3f19", 568672039), hl.a("\u3938\u3933\u393a\u3929\u3928\u393e\u392f", 416561499), hl.a("\u238e\u23c6\u23da\u23db\u23c1\u238c", 955458482), hl.a("\u59a9\u59a2\u59ab\u59b8\u59b9\u59af\u59be", 1789680074), hl.a("\u2b32\u2b7a\u2b66\u2b67\u2b7d\u2b30", -326620402), hl.a("\ud144\ud14f\ud146\ud155\ud154\ud142\ud153", 1166725415), hl.a("\u9a63\u9a2b\u9a37\u9a36\u9a2c\u9a61", -1512924577), hl.a("\ube02\ube09\ube00\ube13\ube12\ube04\ube15", 1990180449), hl.a("\ue6b8\ue6f0\ue6ec\ue6ed\ue6f7\ue6ba", -565909884), hl.a("\uad7c\uad34\uad28\uad29\uad33\uad7e", 1174187328), hl.a("\u77b7\u77ff\u77e3\u77e2\u77f8\u77b5", 1005221771), hl.a("\u2000\u200b\u2002\u2011\u2010\u2006\u2017", -2113200029), hl.a("\u1f6d\u1f25\u1f39\u1f38\u1f22\u1f6f", 1523195729), hl.a("\ue02c\ue027\ue02e\ue03d\ue03c\ue02a\ue03b", 1272307791), hl.a("\uddba\uddf2\uddee\uddef\uddf5\uddb8", -863576698), hl.a("\u6b26\u6b2d\u6b24\u6b37\u6b36\u6b20\u6b31", -818451643), hl.a("\u700f\u7047\u705b\u705a\u7040\u700d", -1789759437), hl.a("\u844e\u8445\u844c\u845f\u845e\u8448\u8459", -77036499), hl.a("\u886f\u8827\u883b\u883a\u8820\u886d", 1736542291), hl.a("\u1f35\u1f2f\u1f2e", 1352933210), hl.a("\u7e80\u7ec8\u7ed4\u7ed5\u7ecf\u7e82", 247889596), hl.a("\u3b5b\u3b13\u3b0f\u3b0e\u3b14\u3b59", 852179815)};
    }

    static {
        bW.a();
    }
}

