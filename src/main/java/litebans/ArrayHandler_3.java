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
import org.jetbrains.annotations.NotNull;

static class ArrayHandler_3
extends LiteBansModule_369 {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final byte[] BaseCoreGenericHandler(@NotNull File file) {
        Object object;
        ObjectUtilities.BaseCoreGenericHandler((Object)file, "<this>");
        Closeable closeable = new FileInputStream(file);
        Throwable throwable = null;
        try {
            byte[] byArray;
            int n;
            long l3;
            object = (FileInputStream)closeable;
            boolean flag = false;
            int n2 = 0;
            long l5 = l3 = file.length();
            int n3 = 0;
            if (l5 > Integer.MAX_VALUE) {
                throw new OutOfMemoryError("File " + file + " is too big (" + l5 + " bytes) to fit InitializerHandler_3 ");
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
                    LiteBansModule_19 aq_02 = new LiteBansModule_19(8193);
                    aq_02.write(n);
                    OutHandler.BaseCoreGenericHandler((InputStream)object, aq_02, 0, 2, null);
                    n3 = byArray2.length + aq_02.size();
                    if (n3 < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit InitializerHandler_3 ");
                    }
                    byArray = ArrayUtilities.BaseCoreGenericHandler(aq_02.BaseCoreGenericHandler(), Arrays.copyOf(byArray2, n3), byArray2.length, 0, aq_02.size());
                }
            }
            object = byArray;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            BlockHandler.BaseCoreGenericHandler(closeable, throwable);
        }
        return object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final void BaseCoreGenericHandler(@NotNull File file, @NotNull byte[] byArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)file, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)byArray, "array");
        Closeable closeable = new FileOutputStream(file);
        Throwable throwable = null;
        try {
            Object object = (FileOutputStream)closeable;
            boolean flag = false;
            ((FileOutputStream)object).write(byArray);
            object = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            BlockHandler.BaseCoreGenericHandler(closeable, throwable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final void BaseCoreGenericHandler(@NotNull File file, @NotNull String string, @NotNull Charset charset) {
        ObjectUtilities.BaseCoreGenericHandler((Object)file, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "text");
        ObjectUtilities.BaseCoreGenericHandler((Object)charset, "charset");
        Closeable closeable = new FileOutputStream(file);
        Throwable throwable = null;
        try {
            Object object = (FileOutputStream)closeable;
            boolean flag = false;
            LiteBansModule_373.BaseCoreGenericHandler((OutputStream)object, string, charset);
            object = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            BlockHandler.BaseCoreGenericHandler(closeable, throwable);
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(File file, String string, Charset charset, int n, Object object) {
        if ((n & 2) != 0) {
            charset = LiteBansModule_344.LiteBansModule_31;
        }
        LiteBansModule_373.BaseCoreGenericHandler(file, string, charset);
    }

    public static final void BaseCoreGenericHandler(@NotNull OutputStream outputStream, @NotNull String string, @NotNull Charset charset) {
        ObjectUtilities.BaseCoreGenericHandler((Object)outputStream, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "text");
        ObjectUtilities.BaseCoreGenericHandler((Object)charset, "charset");
        int n = 8192;
        if (string.length() < 2 * n) {
            outputStream.write(string.getBytes(charset));
            return;
        }
        CharsetEncoder charsetEncoder = LiteBansModule_373.BaseCoreGenericHandler(charset);
        CharBuffer charBuffer = CharBuffer.allocate(n);
        ObjectUtilities.BaseCoreGenericHandler(charsetEncoder);
        ByteBuffer byteBuffer = LiteBansModule_373.BaseCoreGenericHandler(n, charsetEncoder);
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
            boolean flag = false;
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

    public static final CharsetEncoder BaseCoreGenericHandler(@NotNull Charset charset) {
        ObjectUtilities.BaseCoreGenericHandler((Object)charset, "<this>");
        return charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
    }

    public static final ByteBuffer BaseCoreGenericHandler(int n, @NotNull CharsetEncoder charsetEncoder) {
        ObjectUtilities.BaseCoreGenericHandler((Object)charsetEncoder, "encoder");
        int n2 = (int)Math.ceil(charsetEncoder.maxBytesPerChar());
        return ByteBuffer.allocate(n * n2);
    }

    }

