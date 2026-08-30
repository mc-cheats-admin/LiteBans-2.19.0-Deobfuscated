package litebans;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
public class Utf8Handler_2
extends LiteBansModule_153
implements LiteBansModule_251 {
    private final LiteBansModule_119 LiteBansModule_433;
    final String HoverTextFormatter;
    private final boolean PunishmentService;
    private final InputStream q;
    private final Inflater Utf8Handler_2 = new Inflater(true);
    private final ByteBuffer z = ByteBuffer.allocate(512);
    private LiteBansModule_248 BroadcastService = null;
    private boolean GnuSparseMapHandler = false;
    private boolean CommandThrottleService = false;
    private ByteArrayInputStream B = null;
    private boolean A = false;
    private long i = 0L;
    private final boolean g;
    private static final int AsyncBackgroundTask_21;
    private static final int PunishmentTableService;
    private static final long LiteBansModule_240;
    private final byte[] AsyncBackgroundTask_22 = new byte[30];
    private final byte[] e = new byte[1024];
    private final byte[] AsyncBackgroundTask_5 = new byte[2];
    private final byte[] LiteBansModule_194 = new byte[4];
    private final byte[] LiteBansModule_401 = new byte[16];
    private int D = 0;
    private static final String DatabaseMonitorService;
    private static final byte[] BanHandler_2;
    private static final byte[] n;
    private static final byte[] m;
    private static final byte[] ServerSyncService;
    private static final BigInteger r;

    public Utf8Handler_2(InputStream inputStream) {
        this(inputStream, "UTF8");
    }

    public Utf8Handler_2(InputStream inputStream, String string) {
        this(inputStream, string, true);
    }

    public Utf8Handler_2(InputStream inputStream, String string, boolean flag) {
        this(inputStream, string, flag, false);
    }

    public Utf8Handler_2(InputStream inputStream, String string, boolean flag, boolean flag2) {
        this(inputStream, string, flag, flag2, false);
    }

    public Utf8Handler_2(InputStream inputStream, String string, boolean flag, boolean flag2, boolean flag3) {
        this.HoverTextFormatter = string;
        this.LiteBansModule_433 = Utf8Handler.LiteBansModule_31(string);
        this.PunishmentService = flag;
        this.q = new PushbackInputStream(inputStream, this.z.capacity());
        this.A = flag2;
        this.g = flag3;
        this.z.limit(0);
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        int n3;
        if (n2 == 0) {
            return 0;
        }
        if (this.GnuSparseMapHandler) {
            throw new IOException("The stream is closed");
        }
        if (this.BroadcastService == null) {
            return -1;
        }
        if (n > byArray.length || n2 < 0 || n < 0 || byArray.length - n < n2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        LiteBansModule_188.c(LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService));
        if (!this.plugin(LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService))) {
            throw new LiteBansModule_173(EncryptionHandler.BaseCoreGenericHandler, LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService));
        }
        if (!this.LiteBansModule_31(LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService))) {
            throw new LiteBansModule_173(EncryptionHandler.AsyncBackgroundTask_5, LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService));
        }
        if (LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).getMethod() == 0) {
            n3 = this.AsyncBackgroundTask_5(byArray, n, n2);
        } else if (LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).getMethod() == 8) {
            n3 = this.LiteBansModule_31(byArray, n, n2);
        } else if (LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).getMethod() == StoredHandler.CommandThrottleService.BaseCoreGenericHandler() || LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).getMethod() == StoredHandler.LiteBansModule_401.BaseCoreGenericHandler() || LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).getMethod() == StoredHandler.c.BaseCoreGenericHandler() || LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).getMethod() == StoredHandler.q.BaseCoreGenericHandler()) {
            n3 = LiteBansModule_248.LiteBansModule_31(this.BroadcastService).read(byArray, n, n2);
        } else {
            throw new LiteBansModule_173(StoredHandler.BaseCoreGenericHandler(LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).getMethod()), LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService));
        }
        if (n3 >= 0) {
            LiteBansModule_248.g(this.BroadcastService).update(byArray, n, n3);
            this.i += (long)n3;
        }
        return n3;
    }

    private final int AsyncBackgroundTask_5(byte[] byArray, int n, int n2) {
        LiteBansModule_248 h92;
        int n3;
        if (LiteBansModule_248.e(this.BroadcastService)) {
            if (this.B == null) {
                this.c();
            }
            return this.B.read(byArray, n, n2);
        }
        long l3 = LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).getSize();
        if (LiteBansModule_248.BaseCoreGenericHandler(this.BroadcastService) >= l3) {
            return -1;
        }
        if (this.z.position() >= this.z.limit()) {
            this.z.position(0);
            n3 = this.q.read(this.z.array());
            if (n3 == -1) {
                this.z.limit(0);
                throw new IOException("Truncated ZIP file");
            }
            this.z.limit(n3);
            this.plugin(n3);
            h92 = this.BroadcastService;
            LiteBansModule_248.LiteBansModule_31(h92, LiteBansModule_248.c(h92) + (long)n3);
        }
        n3 = Math.min(this.z.remaining(), n2);
        if (l3 - LiteBansModule_248.BaseCoreGenericHandler(this.BroadcastService) < (long)n3) {
            n3 = (int)(l3 - LiteBansModule_248.BaseCoreGenericHandler(this.BroadcastService));
        }
        this.z.get(byArray, n, n3);
        h92 = this.BroadcastService;
        LiteBansModule_248.BaseCoreGenericHandler(h92, LiteBansModule_248.BaseCoreGenericHandler(h92) + (long)n3);
        return n3;
    }

    private final int LiteBansModule_31(byte[] byArray, int n, int n2) {
        int n3 = this.c(byArray, n, n2);
        if (n3 <= 0) {
            if (this.Utf8Handler_2.finished()) {
                return -1;
            }
            if (this.Utf8Handler_2.needsDictionary()) {
                throw new ZipException("This archive needs BaseCoreGenericHandler preset dictionary which is not supported LiteBansModule_61 Commons ");
            }
            if (n3 == -1) {
                throw new IOException("Truncated ZIP file");
}
        return n3;
    }

    private final int c(byte[] byArray, int n, int n2) {
        do {
            if (this.Utf8Handler_2.needsInput()) {
                int n4 = this.LiteBansModule_31();
                if (n4 > 0) {
                    LiteBansModule_248 h92 = this.BroadcastService;
                    LiteBansModule_248.LiteBansModule_31(h92, LiteBansModule_248.c(h92) + this.z.limit());
                } else {
                    if (n4 != -1) break;
                    return -1;
}
            try {
                n3 = this.Utf8Handler_2.inflate(byArray, n, n2);
            }
            catch (DataFormatException dataFormatException) {
                throw (IOException)new ZipException(dataFormatException.getMessage()).initCause(dataFormatException);
} while (n3 == 0 && this.Utf8Handler_2.needsInput());
        return n3;
    }

    @Override
    public void close() {
        if (!this.GnuSparseMapHandler) {
            this.GnuSparseMapHandler = true;
            try {
                this.q.close();
            }
            finally {
                this.Utf8Handler_2.end();
}

    @Override
    public long skip(long l3) {
        if (l3 >= 0L) {
            long l5;
            int n;
            for (l5 = 0L; l5 < l3; l5 += (long)n) {
                long l7 = l3 - l5;
                n = this.read(this.e, 0, (int)(this.e.length > l7 ? l7 : this.e.length));
                if (n != -1) continue;
                return l5;
            }
            return l5;
        }
        throw new IllegalArgumentException();
    }

    private final int LiteBansModule_31() {
        if (this.GnuSparseMapHandler) {
            throw new IOException("The stream is closed");
        }
        int n = this.q.read(this.z.array());
        if (n > 0) {
            this.z.limit(n);
            this.plugin(this.z.limit());
            this.Utf8Handler_2.setInput(this.z.array(), 0, this.z.limit());
        }
        return n;
    }

    private final void BaseCoreGenericHandler(byte[] byArray) {
        this.plugin(byArray, 0);
    }

    private final void BaseCoreGenericHandler(byte[] byArray, int n) {
        int n2 = byArray.length - n;
        int n3 = LiteBansModule_341.BaseCoreGenericHandler(this.q, byArray, n, n2);
        this.plugin(n3);
        if (n3 < n2) {
            throw new EOFException();
}

    private final void BaseCoreGenericHandler() {
        this.plugin(this.LiteBansModule_194);
        LiteBansModule_84 ci_02 = new LiteBansModule_84(this.LiteBansModule_194);
        if (LiteBansModule_84.e.equals(ci_02)) {
            this.plugin(this.LiteBansModule_194);
            ci_02 = new LiteBansModule_84(this.LiteBansModule_194);
        }
        LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).setCrc(ci_02.BaseCoreGenericHandler());
        this.plugin(this.LiteBansModule_401);
        LiteBansModule_84 ci_03 = new LiteBansModule_84(this.LiteBansModule_401, 8);
        if (ci_03.equals(LiteBansModule_84.BaseCoreGenericHandler) || ci_03.equals(LiteBansModule_84.c)) {
            this.plugin(this.LiteBansModule_401, 8, 8);
            LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).setCompressedSize(LiteBansModule_84.BaseCoreGenericHandler(this.LiteBansModule_401));
            LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).setSize(LiteBansModule_84.BaseCoreGenericHandler(this.LiteBansModule_401, 4));
        } else {
            LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).setCompressedSize(LiteBansModule_323.BaseCoreGenericHandler(this.LiteBansModule_401));
            LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).setSize(LiteBansModule_323.BaseCoreGenericHandler(this.LiteBansModule_401, 8));
}

    private final boolean BaseCoreGenericHandler(LiteBansModule_396 kw_02) {
        return !kw_02.AsyncBackgroundTask_5().LiteBansModule_31() || this.A && kw_02.getMethod() == 0 || kw_02.getMethod() == 8 || kw_02.getMethod() == StoredHandler.c.BaseCoreGenericHandler();
    }

    private final boolean LiteBansModule_31(LiteBansModule_396 kw_02) {
        return kw_02.getCompressedSize() != -1L || kw_02.getMethod() == 8 || kw_02.getMethod() == StoredHandler.c.BaseCoreGenericHandler() || kw_02.AsyncBackgroundTask_5().LiteBansModule_31() && this.A && kw_02.getMethod() == 0;
    }

    private final void c() {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n3 = n = LiteBansModule_248.LiteBansModule_194(this.BroadcastService) ? 20 : 12;
        while (!flag) {
            int n4 = this.q.read(this.z.array(), n2, 512 - n2);
            if (n4 <= 0) {
                throw new IOException("Truncated ZIP file");
            }
            if (n4 + n2 < 4) {
                n2 += n4;
                continue;
            }
            flag = this.plugin(byteArrayOutputStream, n2, n4, n);
            if (flag) continue;
            n2 = this.LiteBansModule_31(byteArrayOutputStream, n2, n4, n);
        }
        if (LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).getCompressedSize() != LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).getSize()) {
            throw new ZipException("compressed and uncompressed size don'AsyncBackgroundTask_22 match while reading BaseCoreGenericHandler stored entry using data descriptor. Either the archive is broken or UpdateCheckTask can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is BaseCoreGenericHandler ZIP archive containing BaseCoreGenericHandler ZIP archive. See http://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile");
        }
        byte[] byArray = byteArrayOutputStream.toByteArray();
        if ((long)byArray.length != LiteBansModule_248.AsyncBackgroundTask_5(this.BroadcastService).getSize()) {
            throw new ZipException("actual and claimed size don'AsyncBackgroundTask_22 match while reading BaseCoreGenericHandler stored entry using data descriptor. Either the archive is broken or UpdateCheckTask can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is BaseCoreGenericHandler ZIP archive containing BaseCoreGenericHandler ZIP archive. See http://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile");
        }
        this.B = new ByteArrayInputStream(byArray);
    }

    private final boolean BaseCoreGenericHandler(ByteArrayOutputStream byteArrayOutputStream, int n, int n2, int n3) {
        for (int i = 0; !flag && i < n + n2 - 4; ++i) {
            if (this.z.array()[i] != BanHandler_2[0] || this.z.array()[i + 1] != BanHandler_2[1]) continue;
            int n4 = i;
            if (i >= n3 && this.z.array()[i + 2] == BanHandler_2[2] && this.z.array()[i + 3] == BanHandler_2[3] || this.z.array()[i] == litebans.Utf8Handler_2.n[2] && this.z.array()[i + 3] == litebans.Utf8Handler_2.n[3]) {
                n4 = i - n3;
                flag = true;
            } else if (this.z.array()[i + 2] == m[2] && this.z.array()[i + 3] == m[3]) {
                flag = true;
            }
            if (!flag) continue;
            this.plugin(this.z.array(), n4, n + n2 - n4);
            byteArrayOutputStream.write(this.z.array(), 0, n4);
            this.plugin();
        }
        return flag;
    }

    private final int LiteBansModule_31(ByteArrayOutputStream byteArrayOutputStream, int n, int n2, int n3) {
        int n4 = n + n2 - n3 - 3;
        if (n4 > 0) {
            byteArrayOutputStream.write(this.z.array(), 0, n4);
            System.arraycopy(this.z.array(), n4, this.z.array(), 0, n3 + 3);
            n = n3 + 3;
        } else {
            n += n2;
        }
        return n;
    }

    private final void BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        (this.q).unread(byArray, n, n2);
        this.plugin((long)n2);
    }

    static {
        DatabaseMonitorService = " while reading BaseCoreGenericHandler stored entry using data descriptor. Either the archive is broken or UpdateCheckTask can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is BaseCoreGenericHandler ZIP archive containing BaseCoreGenericHandler ZIP archive. See http://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile";
        LiteBansModule_240 = 0x100000000L;
        PunishmentTableService = 46;
        AsyncBackgroundTask_21 = 30;
        BanHandler_2 = LiteBansModule_84.c.c();
        n = LiteBansModule_84.BaseCoreGenericHandler.c();
        m = LiteBansModule_84.e.c();
        ServerSyncService = new byte[]{65, 80, 75, 32, 83, 105, 103, 32, 66, 108, 111, 99, 107, 32, 52, 50};
        r = BigInteger.valueOf(Long.MAX_VALUE);
}

