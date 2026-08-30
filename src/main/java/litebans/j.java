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
import litebans.bl_0;
import litebans.bv_0;
import litebans.c4;
import litebans.cd_0;
import litebans.dN;
import litebans.dT;
import litebans.dd_0;
import litebans.e_0;
import litebans.gu_0;
import litebans.hw;
import litebans.i7;
import litebans.je_0;

public class j
extends e_0 {
    private static final int q = 256;
    private final byte[] k = new byte[256];
    private final int l;
    private final int r;
    private boolean n;
    private long g;
    private long e;
    private final InputStream i;
    private List p;
    private int o;
    private bv_0 d;
    private final dd_0 s;
    final String h;
    private Map j = new HashMap();
    private final List m = new ArrayList();
    private final boolean f;

    public j(InputStream inputStream) {
        this(inputStream, 10240, 512);
    }

    public j(InputStream inputStream, String string) {
        this(inputStream, 10240, 512, string);
    }

    public j(InputStream inputStream, int n, int n2) {
        this(inputStream, n, n2, null);
    }

    public j(InputStream inputStream, int n, int n2, String string) {
        this(inputStream, n, n2, string, false);
    }

    public j(InputStream inputStream, int n, int n2, String string, boolean bl) {
        this.i = inputStream;
        this.n = false;
        this.h = string;
        this.s = c4.b(string);
        this.l = n2;
        this.r = n;
        this.f = bl;
    }

    @Override
    public void close() {
        if (this.p != null) {
            for (InputStream inputStream : this.p) {
                inputStream.close();
            }
        }
        this.i.close();
    }

    @Override
    public int available() {
        if (this.j()) {
            return 0;
        }
        if (this.d.g() - this.e > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)(this.d.g() - this.e);
    }

    @Override
    public long skip(long l3) {
        if (l3 <= 0L || this.j()) {
            return 0L;
        }
        long l5 = this.d.g() - this.e;
        long l7 = !this.d.l() ? je_0.a(this.i, Math.min(l3, l5)) : this.a(Math.min(l3, l5));
        this.b(l7);
        this.e += l7;
        return l7;
    }

    private final long a(long l3) {
        if (this.p == null || this.p.size() == 0) {
            return this.i.skip(l3);
        }
        long l5 = 0L;
        while (l5 < l3 && this.o < this.p.size()) {
            InputStream inputStream = (InputStream)this.p.get(this.o);
            if ((l5 += inputStream.skip(l3 - l5)) >= l3) continue;
            ++this.o;
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

    public bv_0 d() {
        byte[] byArray;
        byte[] byArray2;
        if (this.e()) {
            return null;
        }
        if (this.d != null) {
            je_0.a((InputStream)this, Long.MAX_VALUE);
            this.f();
        }
        if ((byArray2 = this.h()) == null) {
            this.d = null;
            return null;
        }
        try {
            this.d = new bv_0(byArray2, this.s, this.f);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException("Error detected parsing the header", illegalArgumentException);
        }
        this.e = 0L;
        this.g = this.d.getSize();
        if (this.d.k()) {
            byArray = this.k();
            if (byArray == null) {
                return null;
            }
            this.d.b(this.s.a(byArray));
        }
        if (this.d.m()) {
            byArray = this.k();
            if (byArray == null) {
                return null;
            }
            this.d.c(this.s.a(byArray));
        }
        if (this.d.a()) {
            this.b();
        }
        if (this.d.c()) {
            this.c();
        } else if (!this.j.isEmpty()) {
            this.a(this.j, this.m);
        }
        if (this.d.d()) {
            this.n();
        }
        this.g = this.d.getSize();
        return this.d;
    }

    private final void f() {
        if (!this.j() && this.g > 0L && this.g % (long)this.l != 0L) {
            long l3 = this.g / (long)this.l + 1L;
            long l5 = l3 * (long)this.l - this.g;
            long l7 = je_0.a(this.i, l5);
            this.b(l7);
        }
    }

    protected byte[] k() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n = 0;
        while ((n = this.read(this.k)) >= 0) {
            byteArrayOutputStream.write(this.k, 0, n);
        }
        this.a();
        if (this.d == null) {
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

    private final byte[] h() {
        byte[] byArray = this.l();
        this.a(this.a(byArray));
        if (this.e() && byArray != null) {
            this.a();
            this.g();
            byArray = null;
        }
        return byArray;
    }

    protected boolean a(byte[] byArray) {
        return byArray == null || cd_0.a(byArray, this.l);
    }

    protected byte[] l() {
        byte[] byArray = new byte[this.l];
        int n = je_0.a(this.i, byArray);
        this.a(n);
        if (n != this.l) {
            return null;
        }
        return byArray;
    }

    private final void b() {
        this.j = this.a(this, this.m);
        this.a();
    }

    private final void c() {
        List list = new ArrayList();
        Map map = this.a(this, list);
        if (map.containsKey("GNU.sparse.map")) {
            list = this.a((String)map.get("GNU.sparse.map"));
        }
        this.a();
        this.a(map, list);
        if (this.d.i()) {
            list = this.m();
            this.d.a(list);
        }
        this.i();
    }

    private final List a(String string) {
        ArrayList<i7> arrayList = new ArrayList<i7>();
        String[] stringArray = string.split(",");
        for (int i = 0; i < stringArray.length; i += 2) {
            long l3 = Long.parseLong(stringArray[i]);
            long l5 = Long.parseLong(stringArray[i + 1]);
            arrayList.add(new i7(l3, l5));
        }
        return arrayList;
    }

    private final List m() {
        long l3;
        ArrayList<i7> arrayList = new ArrayList<i7>();
        long l5 = 0L;
        long[] lArray = this.a(this.i);
        long l7 = lArray[0];
        l5 += lArray[1];
        while (l7-- > 0L) {
            lArray = this.a(this.i);
            l3 = lArray[0];
            l5 += lArray[1];
            lArray = this.a(this.i);
            long l8 = lArray[0];
            l5 += lArray[1];
            arrayList.add(new i7(l3, l8));
        }
        l3 = (long)this.l - l5 % (long)this.l;
        je_0.a(this.i, l3);
        return arrayList;
    }

    private final long[] a(InputStream inputStream) {
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

    Map a(InputStream inputStream, List list) {
        int n;
        HashMap<String, String> hashMap = new HashMap<String, String>(this.j);
        Long l3 = null;
        block0: do {
            int n2 = 0;
            int n3 = 0;
            while ((n = inputStream.read()) != -1) {
                ++n3;
                if (n == 10) continue block0;
                if (n == 32) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while ((n = inputStream.read()) != -1) {
                        ++n3;
                        if (n == 61) {
                            String string = byteArrayOutputStream.toString("UTF-8");
                            int n4 = n2 - n3;
                            if (n4 == 1) {
                                hashMap.remove(string);
                                continue block0;
                            }
                            byte[] byArray = new byte[n4];
                            int n5 = je_0.a(inputStream, byArray);
                            if (n5 != n4) {
                                throw new IOException("Failed to read Paxheader. Expected " + n4 + " bytes, read " + n5);
                            }
                            String string2 = new String(byArray, 0, n4 - 1, "UTF-8");
                            hashMap.put(string, string2);
                            if (string.equals("GNU.sparse.offset")) {
                                if (l3 != null) {
                                    list.add(new i7(l3, 0L));
                                }
                                l3 = Long.valueOf(string2);
                            }
                            if (!string.equals("GNU.sparse.numbytes")) continue block0;
                            if (l3 == null) {
                                throw new IOException("Failed to read Paxheader.GNU.sparse.offset is expected before GNU.sparse.numbytes shows ");
                            }
                            list.add(new i7(l3, Long.parseLong(string2)));
                            l3 = null;
                            continue block0;
                        }
                        byteArrayOutputStream.write((byte)n);
                    }
                    continue block0;
                }
                n2 *= 10;
                n2 += n - 48;
            }
        } while (n != -1);
        if (l3 != null) {
            list.add(new i7(l3, 0L));
        }
        return hashMap;
    }

    private final void a(Map map, List list) {
        this.d.c(map);
        this.d.a(list);
    }

    private final void n() {
        if (this.d.b()) {
            dT dT2;
            do {
                byte[] byArray;
                if ((byArray = this.h()) == null) {
                    this.d = null;
                    break;
                }
                dT2 = new dT(byArray);
                this.d.f().addAll(dT2.a());
            } while (dT2.b());
        }
        this.i();
    }

    private final boolean j() {
        return this.d != null && this.d.isDirectory();
    }

    @Override
    public gu_0 a() {
        return this.d();
    }

    private final void a() {
        boolean bl = true;
        boolean bl2 = this.i.markSupported();
        if (bl2) {
            this.i.mark(this.l);
        }
        try {
            bl = !this.a(this.l());
        }
        finally {
            if (bl && bl2) {
                this.a((long)this.l);
                this.i.reset();
            }
        }
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        if (n2 == 0) {
            return 0;
        }
        int n3 = 0;
        if (this.e() || this.j()) {
            return -1;
        }
        if (this.d == null) {
            throw new IllegalStateException("No current tar entry");
        }
        if (!this.d.l() ? this.e >= this.g : this.e >= this.d.g()) {
            return -1;
        }
        n2 = Math.min(n2, this.available());
        n3 = this.d.l() ? this.a(byArray, n, n2) : this.i.read(byArray, n, n2);
        if (n3 == -1) {
            if (n2 > 0) {
                throw new IOException("Truncated TAR archive");
            }
            this.a(true);
        } else {
            this.a(n3);
            this.e += (long)n3;
        }
        return n3;
    }

    private final int a(byte[] byArray, int n, int n2) {
        if (this.p == null || this.p.size() == 0) {
            return this.i.read(byArray, n, n2);
        }
        if (this.o >= this.p.size()) {
            return -1;
        }
        InputStream inputStream = (InputStream)this.p.get(this.o);
        int n3 = inputStream.read(byArray, n, n2);
        if (this.o == this.p.size() - 1) {
            return n3;
        }
        if (n3 == -1) {
            ++this.o;
            return this.a(byArray, n, n2);
        }
        if (n3 < n2) {
            ++this.o;
            int n4 = this.a(byArray, n + n3, n2 - n3);
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

    protected final void a(boolean bl) {
        this.n = bl;
    }

    private final void g() {
        long l3 = this.b() % (long)this.r;
        if (l3 > 0L) {
            long l5 = je_0.a(this.i, (long)this.r - l3);
            this.b(l5);
        }
    }

    private final void i() {
        Object object;
        this.o = -1;
        this.p = new ArrayList();
        List list = this.d.f();
        if (list != null && list.size() > 1) {
            object = new bl_0(this);
            Collections.sort(list, object);
        }
        if (list != null) {
            i7 i72;
            object = new dN(null);
            long l3 = 0L;
            Iterator iterator = list.iterator();
            while (iterator.hasNext() && ((i72 = (i7)iterator.next()).a() != 0L || i72.b() != 0L)) {
                if (i72.a() - l3 < 0L) {
                    throw new IOException("Corrupted struct sparse detected");
                }
                if (i72.a() - l3 > 0L) {
                    this.p.add(new hw((InputStream)object, i72.a() - l3));
                }
                if (i72.b() > 0L) {
                    this.p.add(new hw(this.i, i72.b()));
                }
                l3 = i72.a() + i72.b();
            }
        }
        if (this.p.size() > 0) {
            this.o = 0;
        }
    }
}

