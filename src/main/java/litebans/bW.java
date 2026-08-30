package litebans;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class bW {
    private static /* synthetic */ String[] a;

    public static final long a(@NotNull InputStream inputStream, @NotNull OutputStream outputStream, int n) {
        ew.a((Object)inputStream, "<this>");
        ew.a((Object)outputStream, "out");
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
        ew.a((Object)inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        bW.a(inputStream, byteArrayOutputStream, 0, 2, null);
        return byteArrayOutputStream.toByteArray();
    }

    private static final void a() {
        a = new String[]{"<this>", "<this>", "charset", "<this>", "charset", "<this>", "<this>", "<this>", "<this>", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "<this>", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "out", "<this>", "<this>"};
    }

    static {
        bW.a();
    }
}

