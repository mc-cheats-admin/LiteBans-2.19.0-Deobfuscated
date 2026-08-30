package litebans;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
public class LiteBansModule_240
extends LiteBansModule_153
implements LiteBansModule_111 {
    private boolean J = false;
    private LiteBansModule_115 P;
    private long K = 0L;
    private boolean O = false;
    private final byte[] T = new byte[4096];
    private long LiteBansModule_430 = 0L;
    private final InputStream PlayerQuitListener;
    private final byte[] BanHandler_5 = new byte[2];
    private final byte[] L = new byte[4];
    private final byte[] S = new byte[6];
    private final int LockdownService;
    private final LiteBansModule_119 H;
    final String PluginHookService;

    public LiteBansModule_240(InputStream inputStream) {
        this(inputStream, 512, "US-ASCII");
    }

    public LiteBansModule_240(InputStream inputStream, String string) {
        this(inputStream, 512, string);
    }

    public LiteBansModule_240(InputStream inputStream, int n, String string) {
        this.PlayerQuitListener = inputStream;
        if (n <= 0) {
            throw new IllegalArgumentException("blockSize must be bigger than 0");
        }
        this.LockdownService = n;
        this.PluginHookService = string;
        this.H = Utf8Handler.LiteBansModule_31(string);
    }

    @Override
    public int available() {
        this.plugin();
        if (this.O) {
            return 0;
        }
        return 1;
    }

    @Override
    public void close() {
        if (!this.J) {
            this.PlayerQuitListener.close();
            this.J = true;
}

    private final void BaseCoreGenericHandler() {
        if (this.J) {
            throw new IOException("Stream closed");
}

    private final void LiteBansModule_31(int n) {
        if (n > 0) {
            this.plugin(this.L, 0, n);
}

    @Override
    public int read(byte[] byArray, int n, int n2) {
        this.plugin();
        if (n < 0 || n2 < 0 || n > byArray.length - n2) {
            throw new IndexOutOfBoundsException();
        }
        if (n2 == 0) {
            return 0;
        }
        if (this.P == null || this.O) {
            return -1;
        }
        if (this.K == this.P.getSize()) {
            this.LiteBansModule_31(this.P.LiteBansModule_31());
            this.O = true;
            if (this.P.c() == 2 && this.LiteBansModule_430 != this.P.AsyncBackgroundTask_5()) {
                throw new IOException("CRC Error. Occured LiteBansModule_21 byte: " + this.LiteBansModule_31());
            }
            return -1;
        }
        int n3 = (int)Math.min((long)n2, this.P.getSize() - this.K);
        if (n3 < 0) {
            return -1;
        }
        int n4 = this.plugin(byArray, n, n3);
        if (this.P.c() == 2) {
            for (int i = 0; i < n4; ++i) {
                this.LiteBansModule_430 += (long)(byArray[i] & 0xFF);
                this.LiteBansModule_430 &= 0xFFFFFFFFL;
}
        if (n4 > 0) {
            this.K += (long)n4;
        }
        return n4;
    }

    private final int BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        int n3 = LiteBansModule_341.BaseCoreGenericHandler(this.PlayerQuitListener, byArray, n, n2);
        this.plugin(n3);
        if (n3 < n2) {
            throw new EOFException();
        }
        return n3;
    }

    @Override
    public long skip(long l3) {
        int n;
        int n2;
        if (l3 < 0L) {
            throw new IllegalArgumentException("Negative skip length");
        }
        this.plugin();
        int n3 = (int)Math.min(l3, Integer.MAX_VALUE);
        for (n = 0; n < n3; n += n2) {
            n2 = n3 - n;
            if (n2 > this.T.length) {
                n2 = this.T.length;
            }
            if ((n2 = this.read(this.T, 0, n2)) != -1) continue;
            this.O = true;
            break;
        }
        return n;
}

