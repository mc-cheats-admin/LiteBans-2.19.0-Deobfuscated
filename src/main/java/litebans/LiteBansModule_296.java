package litebans;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
public class LiteBansModule_296
extends LiteBansModule_153 {
    private LiteBansModule_316 g;
    private LiteBansModule_398 LiteBansModule_401;
    private boolean GnuSparseMapHandler;
    private boolean LiteBansModule_194;
    private long AsyncBackgroundTask_5;
    private long n;
    private int BroadcastService;
    private final byte[] PunishmentTableService = new byte[1024];
    private byte[] LiteBansModule_240;
    private int Utf8Handler_2;
    protected Bzlib2Handler e;
    private final Map i = new HashMap();
    private final Map q = new HashMap();
    private Queue AsyncBackgroundTask_21;
    private final LiteBansModule_119 m;
    final String r;

    public LiteBansModule_296(InputStream inputStream) {
        this(inputStream, null);
    }

    public LiteBansModule_296(InputStream inputStream, String string) {
        Object object;
        this.e = new Bzlib2Handler(inputStream);
        this.LiteBansModule_194 = false;
        this.r = string;
        this.m = Utf8Handler.LiteBansModule_31(string);
        try {
            object = this.e.LiteBansModule_31();
            if (!LiteBansModule_108.BaseCoreGenericHandler(object)) {
                throw new LiteBansModule_294();
            }
            this.g = new LiteBansModule_316((byte[])object, this.m);
            this.e.BaseCoreGenericHandler(this.g.BaseCoreGenericHandler(), this.g.AsyncBackgroundTask_5());
            this.LiteBansModule_240 = new byte[4096];
            this.LiteBansModule_31();
            this.plugin();
        }
        catch (IOException iOException) {
            throw new LiteBansException_8(iOException.getMessage(), iOException);
        }
        object = new LiteBansModule_163(2, 2, 4, " + ");
        this.i.put(2, object);
        this.AsyncBackgroundTask_21 = new PriorityQueue(10, new LiteBansModule_392(this));
    }

    @Override
    public long LiteBansModule_31() {
        return this.e.BaseCoreGenericHandler();
    }

    private final void LiteBansModule_31() {
        byte[] byArray = this.e.LiteBansModule_31();
        if (!LiteBansModule_108.BaseCoreGenericHandler(byArray)) {
            throw new LiteBansModule_308();
        }
        this.LiteBansModule_401 = LiteBansModule_398.BaseCoreGenericHandler(byArray);
        if (TapeHandler.AsyncBackgroundTask_5 != this.LiteBansModule_401.BaseCoreGenericHandler()) {
            throw new LiteBansModule_308();
        }
        if (this.e.skip(1024L * (long)this.LiteBansModule_401.LiteBansModule_31()) == -1L) {
            throw new EOFException();
        }
        this.BroadcastService = this.LiteBansModule_401.LiteBansModule_31();
    }

    private final void BaseCoreGenericHandler() {
        byte[] byArray = this.e.LiteBansModule_31();
        if (!LiteBansModule_108.BaseCoreGenericHandler(byArray)) {
            throw new LiteBansModule_308();
        }
        this.LiteBansModule_401 = LiteBansModule_398.BaseCoreGenericHandler(byArray);
        if (TapeHandler.LiteBansModule_240 != this.LiteBansModule_401.BaseCoreGenericHandler()) {
            throw new LiteBansModule_308();
        }
        if (this.e.skip(1024L * (long)this.LiteBansModule_401.LiteBansModule_31()) == -1L) {
            throw new EOFException();
        }
        this.BroadcastService = this.LiteBansModule_401.LiteBansModule_31();
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        if (n2 == 0) {
            return 0;
        }
        if (this.LiteBansModule_194 || this.GnuSparseMapHandler || this.n >= this.AsyncBackgroundTask_5) {
            return -1;
        }
        if (this.LiteBansModule_401 == null) {
            throw new IllegalStateException("No current dump entry");
        }
        if ((long)n2 + this.n > this.AsyncBackgroundTask_5) {
            n2 = (int)(this.AsyncBackgroundTask_5 - this.n);
        }
        while (n2 > 0) {
            int n4;
            int n5 = n4 = n2 > this.PunishmentTableService.length - this.Utf8Handler_2 ? this.PunishmentTableService.length - this.Utf8Handler_2 : n2;
            if (this.Utf8Handler_2 + n4 <= this.PunishmentTableService.length) {
                System.arraycopy(this.PunishmentTableService, this.Utf8Handler_2, byArray, n, n4);
                n3 += n4;
                this.Utf8Handler_2 += n4;
                n2 -= n4;
                n += n4;
            }
            if (n2 <= 0) continue;
            if (this.BroadcastService >= 512) {
                byte[] byArray2 = this.e.LiteBansModule_31();
                if (!LiteBansModule_108.BaseCoreGenericHandler(byArray2)) {
                    throw new LiteBansModule_308();
                }
                this.LiteBansModule_401 = LiteBansModule_398.BaseCoreGenericHandler(byArray2);
                this.BroadcastService = 0;
            }
            if (!this.LiteBansModule_401.AsyncBackgroundTask_5(this.BroadcastService++)) {
                int n6 = this.e.read(this.PunishmentTableService, 0, this.PunishmentTableService.length);
                if (n6 != this.PunishmentTableService.length) {
                    throw new EOFException();
} else {
                Arrays.fill(this.PunishmentTableService, (byte)0);
            }
            this.Utf8Handler_2 = 0;
        }
        this.n += (long)n3;
        return n3;
    }

    @Override
    public void close() {
        if (!this.GnuSparseMapHandler) {
            this.GnuSparseMapHandler = true;
            this.e.close();
}

