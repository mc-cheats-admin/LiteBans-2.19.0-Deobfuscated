package litebans;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;

public final class OutHandler {
    public static final long BaseCoreGenericHandler(@NotNull InputStream inputStream, @NotNull OutputStream outputStream, int n) {
        ObjectUtilities.BaseCoreGenericHandler((Object)inputStream, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)outputStream, "out");
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

    public static /* synthetic */ long BaseCoreGenericHandler(InputStream inputStream, OutputStream outputStream, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 8192;
        }
        return OutHandler.BaseCoreGenericHandler(inputStream, outputStream, n);
    }

    public static final byte[] BaseCoreGenericHandler(@NotNull InputStream inputStream) {
        ObjectUtilities.BaseCoreGenericHandler((Object)inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        OutHandler.BaseCoreGenericHandler(inputStream, byteArrayOutputStream, 0, 2, null);
        return byteArrayOutputStream.toByteArray();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"<this>", "<this>", "charset", "<this>", "charset", "<this>", "<this>", "<this>", "<this>", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "<this>", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "charset", "<this>", "out", "<this>", "<this>"};
}

