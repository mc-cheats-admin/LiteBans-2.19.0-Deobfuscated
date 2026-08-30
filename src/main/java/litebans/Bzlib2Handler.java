package litebans;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
static class Bzlib2Handler
extends FilterInputStream {
    private byte[] BaseCoreGenericHandler = new byte[1024];
    private int LiteBansModule_31 = -1;
    private int LiteBansModule_195 = 1024;
    private static final int g = 1024;
    private int c = 1024;
    private boolean AsyncBackgroundTask_5 = false;
    private long e = 0L;

    public Bzlib2Handler(InputStream inputStream) {
        super(inputStream);
    }

    public void BaseCoreGenericHandler(int n, boolean flag) {
        this.AsyncBackgroundTask_5 = flag;
        if (n < 1) {
            throw new IOException("Block with " + n + " records found, must be LiteBansModule_21 least 1");
        }
        this.LiteBansModule_195 = 1024 * n;
        byte[] byArray = this.plugin;
        this.plugin = new byte[this.LiteBansModule_195];
        System.arraycopy(byArray, 0, this.plugin, 0, 1024);
        this.plugin(this.plugin, 1024, this.LiteBansModule_195 - 1024);
        this.LiteBansModule_31 = 0;
        this.c = 1024;
    }

    @Override
    public int available() {
        if (this.c < this.LiteBansModule_195) {
            return this.LiteBansModule_195 - this.c;
        }
        return this.InitializerHandler_3.available();
    }

    @Override
    public int read() {
        throw new IllegalArgumentException("All reads must be multiple of record size (1024 ");
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        if (n2 == 0) {
            return 0;
        }
        if (n2 % 1024 != 0) {
            throw new IllegalArgumentException("All reads must be multiple of record size (1024 ");
        }
        while (n3 < n2) {
            if (this.c == this.LiteBansModule_195) {
                try {
                    this.plugin(true);
                }
                catch (LiteBansModule_321 it_02) {
                    return -1;
                }
            }
            n4 = this.c + (n2 - n3) <= this.LiteBansModule_195 ? n2 - n3 : this.LiteBansModule_195 - this.c;
            System.arraycopy(this.plugin, this.c, byArray, n, n4);
            this.c += n4;
            n3 += n4;
            n += n4;
        }
        return n3;
    }

    @Override
    public long skip(long l3) {
        long l5;
        long l7;
        if (l3 % 1024L != 0L) {
            throw new IllegalArgumentException("All reads must be multiple of record size (1024 ");
        }
        for (l5 = 0L; l5 < l3; l5 += l7) {
            if (this.c == this.LiteBansModule_195) {
                try {
                    this.plugin(l3 - l5 < (long)this.LiteBansModule_195);
                }
                catch (LiteBansModule_321 it_02) {
                    return -1L;
                }
            }
            l7 = 0L;
            l7 = (long)this.c + (l3 - l5) <= (long)this.LiteBansModule_195 ? l3 - l5 : (long)this.LiteBansModule_195 - (long)this.c;
            this.c = (int)((long)this.c + l7);
        }
        return l5;
    }

    @Override
    public void close() {
        if (this.InitializerHandler_3 != null && this.InitializerHandler_3 != System.InitializerHandler_3) {
            this.InitializerHandler_3.close();
        }
    }

    public byte[] LiteBansModule_31() {
        byte[] byArray = new byte[1024];
        if (-1 == this.read(byArray, 0, byArray.length)) {
            throw new LiteBansModule_321();
        }
        return byArray;
    }

    private final void BaseCoreGenericHandler(boolean flag) {
        if (this.InitializerHandler_3 == null) {
            throw new IOException("Input buffer is closed");
        }
        if (!this.AsyncBackgroundTask_5 || this.LiteBansModule_31 == -1) {
            this.plugin(this.plugin, 0, this.LiteBansModule_195);
            this.e += (long)this.LiteBansModule_195;
        } else {
            boolean flag2;
            this.plugin(this.plugin, 0, 4);
            this.e += 4L;
            int n = LiteBansModule_109.LiteBansModule_31(this.plugin, 0);
            boolean flag3 = flag2 = (n & 1) == 1;
            if (!flag2) {
                this.plugin(this.plugin, 0, this.LiteBansModule_195);
                this.e += (long)this.LiteBansModule_195;
            } else {
                int n2 = n >> 1 & 7;
                int n3 = n >> 4 & 0xFFFFFFF;
                byte[] byArray = new byte[n3];
                this.plugin(byArray, 0, n3);
                this.e += (long)n3;
                if (!flag) {
                    Arrays.fill(this.plugin, (byte)0);
                } else {
                    switch (ZlibHandler.BaseCoreGenericHandler(n2 & 3)) {
                        case c: {
                            Inflater inflater = new Inflater();
                            try {
                                inflater.setInput(byArray, 0, byArray.length);
                                n3 = inflater.inflate(this.plugin);
                                if (n3 != this.LiteBansModule_195) {
                                    throw new LiteBansModule_321();
                                }
                                break;
                            }
                            catch (DataFormatException dataFormatException) {
                                throw new LiteBansModule_301("Bad data", dataFormatException);
                            }
                            finally {
                                inflater.end();
                            }
                        }
                        case LiteBansModule_31: {
                            throw new LiteBansModule_311("BZLIB2");
                        }
                        case AsyncBackgroundTask_5: {
                            throw new LiteBansModule_311("LZO");
                        }
                        default: {
                            throw new LiteBansModule_311();
                        }
                    }
                }
            }
        }
        ++this.LiteBansModule_31;
        this.c = 0;
    }

    private final void BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        int n3 = LiteBansModule_342.BaseCoreGenericHandler(this.InitializerHandler_3, byArray, n, n2);
        if (n3 < n2) {
            throw new LiteBansModule_321();
        }
    }

    public long BaseCoreGenericHandler() {
        return this.e;
    }
}

