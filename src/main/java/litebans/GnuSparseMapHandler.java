package litebans;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
public class GnuSparseMapHandler
extends LiteBansModule_153 {
    private static final int q = 256;
    private final byte[] Utf8Handler_2 = new byte[256];
    private final int LiteBansModule_401;
    private final int r;
    private boolean n;
    private long g;
    private long e;
    private final InputStream i;
    private List PunishmentTableService;
    private int BroadcastService;
    private UserNameHandler AsyncBackgroundTask_5;
    private final LiteBansModule_119 AsyncBackgroundTask_21;
    final String LiteBansModule_240;
    private Map GnuSparseMapHandler = new HashMap();
    private final List m = new ArrayList();
    private final boolean LiteBansModule_194;

    public GnuSparseMapHandler(InputStream inputStream) {
        this(inputStream, 10240, 512);
    }

    public GnuSparseMapHandler(InputStream inputStream, String string) {
        this(inputStream, 10240, 512, string);
    }

    public GnuSparseMapHandler(InputStream inputStream, int n, int n2) {
        this(inputStream, n, n2, null);
    }

    public GnuSparseMapHandler(InputStream inputStream, int n, int n2, String string) {
        this(inputStream, n, n2, string, false);
    }

    public GnuSparseMapHandler(InputStream inputStream, int n, int n2, String string, boolean flag) {
        this.i = inputStream;
        this.n = false;
        this.LiteBansModule_240 = string;
        this.AsyncBackgroundTask_21 = Utf8Handler.LiteBansModule_31(string);
        this.LiteBansModule_401 = n2;
        this.r = n;
        this.LiteBansModule_194 = flag;
    }

    @Override
    public void close() {
        if (this.PunishmentTableService != null) {
            for (InputStream inputStream : this.PunishmentTableService) {
                inputStream.close();
}
        this.i.close();
    }

    @Override
    public int available() {
        if (this.GnuSparseMapHandler()) {
            return 0;
        }
        if (this.AsyncBackgroundTask_5.g() - this.e > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)(this.AsyncBackgroundTask_5.g() - this.e);
    }

    @Override
    public long skip(long l3) {
        if (l3 <= 0L || this.GnuSparseMapHandler()) {
            return 0L;
        }
        long l5 = this.AsyncBackgroundTask_5.g() - this.e;
        long l7 = !this.AsyncBackgroundTask_5.LiteBansModule_401() ? LiteBansModule_341.BaseCoreGenericHandler(this.i, Math.min(l3, l5)) : this.plugin(Math.min(l3, l5));
        this.LiteBansModule_31(l7);
        this.e += l7;
        return l7;
    }

    private final long BaseCoreGenericHandler(long l3) {
        if (this.PunishmentTableService == null || this.PunishmentTableService.size() == 0) {
            return this.i.skip(l3);
        }
        long l5 = 0L;
        while (l5 < l3 && this.BroadcastService < this.PunishmentTableService.size()) {
            InputStream inputStream = (InputStream)this.PunishmentTableService.get(this.BroadcastService);
            if ((l5 += inputStream.skip(l3 - l5)) >= l3) continue;
            ++this.BroadcastService;
        }
        return l5;
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public synchronized void mark(int n) {
    }

    @Override
    public synchronized void reset() {
    }

    public UserNameHandler AsyncBackgroundTask_5() {
        byte[] byArray;
        byte[] byArray2;
        if (this.e()) {
            return null;
        }
        if (this.AsyncBackgroundTask_5 != null) {
            LiteBansModule_341.BaseCoreGenericHandler((InputStream)this, Long.MAX_VALUE);
            this.LiteBansModule_194();
        }
        if ((byArray2 = this.LiteBansModule_240()) == null) {
            this.AsyncBackgroundTask_5 = null;
            return null;
        }
        try {
            this.AsyncBackgroundTask_5 = new UserNameHandler(byArray2, this.AsyncBackgroundTask_21, this.LiteBansModule_194);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException("Error detected parsing the header", illegalArgumentException);
        }
        this.e = 0L;
        this.g = this.AsyncBackgroundTask_5.getSize();
        if (this.AsyncBackgroundTask_5.Utf8Handler_2()) {
            byArray = this.Utf8Handler_2();
            if (byArray == null) {
                return null;
            }
            this.AsyncBackgroundTask_5.LiteBansModule_31(this.AsyncBackgroundTask_21.BaseCoreGenericHandler(byArray));
        }
        if (this.AsyncBackgroundTask_5.m()) {
            byArray = this.Utf8Handler_2();
            if (byArray == null) {
                return null;
            }
            this.AsyncBackgroundTask_5.c(this.AsyncBackgroundTask_21.BaseCoreGenericHandler(byArray));
        }
        if (this.AsyncBackgroundTask_5.BaseCoreGenericHandler()) {
            this.LiteBansModule_31();
        }
        if (this.AsyncBackgroundTask_5.c()) {
            this.c();
        } else if (!this.GnuSparseMapHandler.isEmpty()) {
            this.plugin(this.GnuSparseMapHandler, this.m);
        }
        if (this.AsyncBackgroundTask_5.AsyncBackgroundTask_5()) {
            this.n();
        }
        this.g = this.AsyncBackgroundTask_5.getSize();
        return this.AsyncBackgroundTask_5;
    }

    private final void LiteBansModule_194() {
        if (!this.GnuSparseMapHandler() && this.g > 0L && this.g % (long)this.LiteBansModule_401 != 0L) {
            long l3 = this.g / (long)this.LiteBansModule_401 + 1L;
            long l5 = l3 * (long)this.LiteBansModule_401 - this.g;
            long l7 = LiteBansModule_341.BaseCoreGenericHandler(this.i, l5);
            this.LiteBansModule_31(l7);
}

    protected byte[] Utf8Handler_2() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((n = this.read(this.Utf8Handler_2)) >= 0) {
            byteArrayOutputStream.write(this.Utf8Handler_2, 0, n);
        }
        this.plugin();
        if (this.AsyncBackgroundTask_5 == null) {
            return null;
        }
        byte[] byArray = byteArrayOutputStream.toByteArray();
        for (n = byArray.length; n > 0 && byArray[n - 1] == 0; --n) {
        }
        if (n != byArray.length) {
            byte[] byArray2 = new byte[n];
            System.arraycopy(byArray, 0, byArray2, 0, n);
            byArray = byArray2;
        }
        return byArray;
    }

    private final byte[] LiteBansModule_240() {
        byte[] byArray = this.LiteBansModule_401();
        this.plugin(this.plugin(byArray));
        if (this.e() && byArray != null) {
            this.plugin();
            this.g();
            byArray = null;
        }
        return byArray;
    }

    protected boolean BaseCoreGenericHandler(byte[] byArray) {
        return byArray == null || LiteBansModule_76.BaseCoreGenericHandler(byArray, this.LiteBansModule_401);
    }

    protected byte[] LiteBansModule_401() {
        byte[] byArray = new byte[this.LiteBansModule_401];
        int n = LiteBansModule_341.BaseCoreGenericHandler(this.i, byArray);
        this.plugin(n);
        if (n != this.LiteBansModule_401) {
            return null;
        }
        return byArray;
    }

    private final void LiteBansModule_31() {
        this.GnuSparseMapHandler = this.plugin(this, this.m);
        this.plugin();
    }

    private final void c() {
        List list = new ArrayList();
        Map map = this.plugin(this, list);
        if (map.containsKey("GNU.sparse.map")) {
            list = this.plugin((String)map.get("GNU.sparse.map"));
        }
        this.plugin();
        this.plugin(map, list);
        if (this.AsyncBackgroundTask_5.i()) {
            list = this.m();
            this.AsyncBackgroundTask_5.BaseCoreGenericHandler(list);
        }
        this.i();
    }

    private final List BaseCoreGenericHandler(String string) {
        ArrayList<LiteBansModule_292> arrayList = new ArrayList<LiteBansModule_292>();
        String[] args = string.split(",");
        for (int i = 0; i < args.length; i += 2) {
            long l3 = Long.parseLong(args[i]);
            long l5 = Long.parseLong(args[i + 1]);
            arrayList.add(new LiteBansModule_292(l3, l5));
        }
        return arrayList;
    }

    private final List m() {
        long l3;
        ArrayList<LiteBansModule_292> arrayList = new ArrayList<LiteBansModule_292>();
        long l5 = 0L;
        long[] lArray = this.plugin(this.i);
        long l7 = lArray[0];
        l5 += lArray[1];
        while (l7-- > 0L) {
            lArray = this.plugin(this.i);
            l3 = lArray[0];
            l5 += lArray[1];
            lArray = this.plugin(this.i);
            long l8 = lArray[0];
            l5 += lArray[1];
            arrayList.add(new LiteBansModule_292(l3, l8));
        }
        l3 = (long)this.LiteBansModule_401 - l5 % (long)this.LiteBansModule_401;
        LiteBansModule_341.BaseCoreGenericHandler(this.i, l3);
        return arrayList;
    }

    private final long[] BaseCoreGenericHandler(InputStream inputStream) {
        int n;
        long l3 = 0L;
        long l5 = 0L;
        while ((n = inputStream.read()) != 10) {
            ++l5;
            if (n == -1) {
                throw new IOException("Unexpected EOF when reading parse information of 1.X PAX format");
            }
            l3 = l3 * 10L + (long)(n - 48);
        }
        return new long[]{l3, ++l5};
    }

    Map BaseCoreGenericHandler(InputStream inputStream, List list) {
        int n;
        HashMap<String, String> hashMap = new HashMap<String, String>(this.GnuSparseMapHandler);
        Long l3 = null;
do {
            while ((n = inputStream.read()) != -1) {
                ++n3;
                if (n == 10) continue;
                if (n == 32) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while ((n = inputStream.read()) != -1) {
                        ++n3;
                        if (n == 61) {
                            String string = byteArrayOutputStream.toString("UTF-8");
                            int n4 = n2 - n3;
                            if (n4 == 1) {
                                hashMap.remove(string);
                                continue;
                            }
                            byte[] byArray = new byte[n4];
                            int n5 = LiteBansModule_341.BaseCoreGenericHandler(inputStream, byArray);
                            if (n5 != n4) {
                                throw new IOException("Failed to read Paxheader. Expected " + n4 + " bytes, read " + n5);
                            }
                            String string2 = new String(byArray, 0, n4 - 1, "UTF-8");
                            hashMap.put(string, string2);
                            if (string.equals("GNU.sparse.offset")) {
                                if (l3 != null) {
                                    list.add(new LiteBansModule_292(l3, 0L));
                                }
                                l3 = Long.valueOf(string2);
                            }
                            if (!string.equals("GNU.sparse.numbytes")) continue;
                            if (l3 == null) {
                                throw new IOException("Failed to read Paxheader.GNU.sparse.offset is expected before GNU.sparse.numbytes shows ");
                            }
                            list.add(new LiteBansModule_292(l3, Long.parseLong(string2)));
                            l3 = null;
                            continue;
                        }
                        byteArrayOutputStream.write((byte)n);
                    }
                    continue;
                }
                n2 *= 10;
                n2 += n - 48;
} while (n != -1);
        if (l3 != null) {
            list.add(new LiteBansModule_292(l3, 0L));
        }
        return hashMap;
    }

    private final void BaseCoreGenericHandler(Map map, List list) {
        this.AsyncBackgroundTask_5.c(map);
        this.AsyncBackgroundTask_5.BaseCoreGenericHandler(list);
    }

    private final void n() {
        if (this.AsyncBackgroundTask_5.LiteBansModule_31()) {
            LiteBansModule_136 dT2;
            do {
                byte[] byArray;
                if ((byArray = this.LiteBansModule_240()) == null) {
                    this.AsyncBackgroundTask_5 = null;
                    break;
                }
                dT2 = new LiteBansModule_136(byArray);
                this.AsyncBackgroundTask_5.LiteBansModule_194().addAll(dT2.BaseCoreGenericHandler());
            } while (dT2.LiteBansModule_31());
        }
        this.i();
    }

    private final boolean GnuSparseMapHandler() {
        return this.AsyncBackgroundTask_5 != null && this.AsyncBackgroundTask_5.isDirectory();
    }

    @Override
    public LiteBansModule_235 BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_5();
    }

    private final void BaseCoreGenericHandler() {
        boolean flag2 = this.i.markSupported();
        if (flag2) {
            this.i.mark(this.LiteBansModule_401);
        }
        try {
            flag = !this.plugin(this.LiteBansModule_401());
        }
        finally {
            if (flag && flag2) {
                this.plugin((long)this.LiteBansModule_401);
                this.i.reset();
}

    @Override
    public int read(byte[] byArray, int n, int n2) {
        if (n2 == 0) {
            return 0;
        }
        if (this.e() || this.GnuSparseMapHandler()) {
            return -1;
        }
        if (this.AsyncBackgroundTask_5 == null) {
            throw new IllegalStateException("No current tar entry");
        }
        if (!this.AsyncBackgroundTask_5.LiteBansModule_401() ? this.e >= this.g : this.e >= this.AsyncBackgroundTask_5.g()) {
            return -1;
        }
        n2 = Math.min(n2, this.available());
        n3 = this.AsyncBackgroundTask_5.LiteBansModule_401() ? this.plugin(byArray, n, n2) : this.i.read(byArray, n, n2);
        if (n3 == -1) {
            if (n2 > 0) {
                throw new IOException("Truncated TAR archive");
            }
            this.plugin(true);
        } else {
            this.plugin(n3);
            this.e += (long)n3;
        }
        return n3;
    }

    private final int BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        if (this.PunishmentTableService == null || this.PunishmentTableService.size() == 0) {
            return this.i.read(byArray, n, n2);
        }
        if (this.BroadcastService >= this.PunishmentTableService.size()) {
            return -1;
        }
        InputStream inputStream = (InputStream)this.PunishmentTableService.get(this.BroadcastService);
        int n3 = inputStream.read(byArray, n, n2);
        if (this.BroadcastService == this.PunishmentTableService.size() - 1) {
            return n3;
        }
        if (n3 == -1) {
            ++this.BroadcastService;
            return this.plugin(byArray, n, n2);
        }
        if (n3 < n2) {
            ++this.BroadcastService;
            int n4 = this.plugin(byArray, n + n3, n2 - n3);
            if (n4 == -1) {
                return n3;
            }
            return n3 + n4;
        }
        return n3;
    }

    protected final boolean e() {
        return this.n;
    }

    protected final void BaseCoreGenericHandler(boolean flag) {
        this.n = flag;
    }

    private final void g() {
        long l3 = this.LiteBansModule_31() % (long)this.r;
        if (l3 > 0L) {
            long l5 = LiteBansModule_341.BaseCoreGenericHandler(this.i, (long)this.r - l3);
            this.LiteBansModule_31(l5);
}

    private final void i() {
        Object object;
        this.BroadcastService = -1;
        this.PunishmentTableService = new ArrayList();
        List list = this.AsyncBackgroundTask_5.LiteBansModule_194();
        if (list != null && list.size() > 1) {
            object = new LiteBansModule_52(this);
            Collections.sort(list, object);
        }
        if (list != null) {
            LiteBansModule_292 i72;
            object = new LiteBansModule_129(null);
            long l3 = 0L;
            Iterator iterator = list.iterator();
            while (iterator.hasNext() && ((i72 = (LiteBansModule_292)iterator.next()).BaseCoreGenericHandler() != 0L || i72.LiteBansModule_31() != 0L)) {
                if (i72.BaseCoreGenericHandler() - l3 < 0L) {
                    throw new IOException("Corrupted struct sparse detected");
                }
                if (i72.BaseCoreGenericHandler() - l3 > 0L) {
                    this.PunishmentTableService.add(new LiteBansModule_279((InputStream)object, i72.BaseCoreGenericHandler() - l3));
                }
                if (i72.LiteBansModule_31() > 0L) {
                    this.PunishmentTableService.add(new LiteBansModule_279(this.i, i72.LiteBansModule_31()));
                }
                l3 = i72.BaseCoreGenericHandler() + i72.LiteBansModule_31();
}
        if (this.PunishmentTableService.size() > 0) {
            this.BroadcastService = 0;
}

