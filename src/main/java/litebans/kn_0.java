package litebans;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import litebans.aq_0;
import litebans.bW;
import litebans.bt_0;
import litebans.ew;
import litebans.hl;
import litebans.iv_0;
import litebans.ji_0;
import litebans.kB;
import litebans.kd_0;
import litebans.lo_0;
import org.jetbrains.annotations.NotNull;

static class kn_0
extends kB {
    private static /* synthetic */ String[] b;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final byte[] a(@NotNull File file) {
        Object object;
        ew.a((Object)file, "<this>");
        Closeable closeable = new FileInputStream(file);
        Throwable throwable = null;
        try {
            byte[] byArray;
            int n;
            long l3;
            object = (FileInputStream)closeable;
            boolean bl = false;
            int n2 = 0;
            long l5 = l3 = file.length();
            int n3 = 0;
            if (l5 > Integer.MAX_VALUE) {
                throw new OutOfMemoryError("File " + file + " is too big (" + l5 + " bytes) to fit in ");
            }
            int n4 = (int)l3;
            byte[] byArray2 = new byte[n4];
            while (n4 > 0 && (n = ((FileInputStream)object).read(byArray2, n2, n4)) >= 0) {
                n4 -= n;
                n2 += n;
            }
            if (n4 > 0) {
                byArray = Arrays.copyOf(byArray2, n2);
            } else {
                n = ((FileInputStream)object).read();
                if (n == -1) {
                    byArray = byArray2;
                } else {
                    aq_0 aq_02 = new aq_0(8193);
                    aq_02.write(n);
                    bW.a((InputStream)object, aq_02, 0, 2, null);
                    n3 = byArray2.length + aq_02.size();
                    if (n3 < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in ");
                    }
                    byArray = lo_0.a(aq_02.a(), Arrays.copyOf(byArray2, n3), byArray2.length, 0, aq_02.size());
                }
            }
            object = byArray;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            bt_0.a(closeable, throwable);
        }
        return object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final void a(@NotNull File file, @NotNull byte[] byArray) {
        ew.a((Object)file, "<this>");
        ew.a((Object)byArray, "array");
        Closeable closeable = new FileOutputStream(file);
        Throwable throwable = null;
        try {
            Object object = (FileOutputStream)closeable;
            boolean bl = false;
            ((FileOutputStream)object).write(byArray);
            object = iv_0.a;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            bt_0.a(closeable, throwable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final void a(@NotNull File file, @NotNull String string, @NotNull Charset charset) {
        ew.a((Object)file, "<this>");
        ew.a((Object)string, "text");
        ew.a((Object)charset, "charset");
        Closeable closeable = new FileOutputStream(file);
        Throwable throwable = null;
        try {
            Object object = (FileOutputStream)closeable;
            boolean bl = false;
            kd_0.a((OutputStream)object, string, charset);
            object = iv_0.a;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            bt_0.a(closeable, throwable);
        }
    }

    public static /* synthetic */ void a(File file, String string, Charset charset, int n, Object object) {
        if ((n & 2) != 0) {
            charset = ji_0.b;
        }
        kd_0.a(file, string, charset);
    }

    public static final void a(@NotNull OutputStream outputStream, @NotNull String string, @NotNull Charset charset) {
        ew.a((Object)outputStream, "<this>");
        ew.a((Object)string, "text");
        ew.a((Object)charset, "charset");
        int n = 8192;
        if (string.length() < 2 * n) {
            outputStream.write(string.getBytes(charset));
            return;
        }
        CharsetEncoder charsetEncoder = kd_0.a(charset);
        CharBuffer charBuffer = CharBuffer.allocate(n);
        ew.a(charsetEncoder);
        ByteBuffer byteBuffer = kd_0.a(n, charsetEncoder);
        int n2 = 0;
        int n3 = 0;
        while (n2 < string.length()) {
            int n4 = Math.min(n - n3, string.length() - n2);
            int n5 = n2 + n4;
            Object object = string;
            Object object2 = charBuffer.array();
            ((String)object).getChars(n2, n5, (char[])object2, n3);
            charBuffer.limit(n4 + n3);
            object = charsetEncoder.encode(charBuffer, byteBuffer, n5 == string.length());
            object2 = object;
            boolean bl = false;
            if (!((CoderResult)object2).isUnderflow()) {
                throw new IllegalStateException("Check ");
            }
            outputStream.write(byteBuffer.array(), 0, byteBuffer.position());
            if (charBuffer.position() != charBuffer.limit()) {
                charBuffer.put(0, charBuffer.get());
                n3 = 1;
            } else {
                n3 = 0;
            }
            charBuffer.clear();
            byteBuffer.clear();
            n2 = n5;
        }
    }

    public static final CharsetEncoder a(@NotNull Charset charset) {
        ew.a((Object)charset, "<this>");
        return charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
    }

    public static final ByteBuffer a(int n, @NotNull CharsetEncoder charsetEncoder) {
        ew.a((Object)charsetEncoder, "encoder");
        int n2 = (int)Math.ceil(charsetEncoder.maxBytesPerChar());
        return ByteBuffer.allocate(n * n2);
    }

    private static final void b() {
        b = new String[]{"<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "File ", " is too big (", " bytes) to fit in ", "File ", " is too big to fit in ", "<this>", "array", "<this>", "array", "<this>", "charset", "<this>", "text", "charset", "<this>", "text", "charset", "<this>", "text", "charset", "Check ", "<this>", "encoder", "<this>", "action", "<this>", "action", "<this>", "charset", "action", "<this>", "<this>", "<this>", "charset", "<this>", "charset", "block", "<this>", "charset", "block", "it"};
    }

    static {
        kn_0.b();
    }
}

