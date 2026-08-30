package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import litebans.ab_0;
import litebans.av_0;
import litebans.ch_0;
import litebans.dx_0;
import litebans.en_0;
import litebans.ex_0;
import litebans.gu_0;
import litebans.hn_0;
import litebans.i2;
import litebans.il;
import litebans.y_0;

/*
 * Renamed from litebans.kw
 */
public static class kw_0
extends ZipEntry
implements gu_0,
il {
    public static final int v;
    public static final int m;
    public static final int i;
    private static final int o;
    private static final int e;
    private static final byte[] k;
    private int c = -1;
    private long l = -1L;
    private int x = 0;
    private int h = 0;
    private long s = 0L;
    private int b = 0;
    private en_0[] p;
    private hn_0 t = null;
    private String f = null;
    private byte[] j = null;
    private ch_0 r = new ch_0();
    private static final en_0[] q;
    private long d = -1L;
    private long w = -1L;
    private boolean u = false;
    private av_0 n = av_0.a;
    private dx_0 g = dx_0.c;

    public kw_0(String string) {
        super(string);
        this.a(string);
    }

    protected kw_0() {
        this("");
    }

    @Override
    public Object clone() {
        kw_0 kw_02 = (kw_0)super.clone();
        kw_02.a(this.b());
        kw_02.a(this.c());
        kw_02.a(this.i());
        return kw_02;
    }

    @Override
    public int getMethod() {
        return this.c;
    }

    @Override
    public void setMethod(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("ZIP compression method can not be negative: " + n);
        }
        this.c = n;
    }

    public int b() {
        return this.x;
    }

    public void a(int n) {
        this.x = n;
    }

    public long c() {
        return this.s;
    }

    public void a(long l3) {
        this.s = l3;
    }

    public int f() {
        return this.h;
    }

    public void a(en_0[] en_0Array) {
        this.t = null;
        ArrayList<en_0> arrayList = new ArrayList<en_0>();
        if (en_0Array != null) {
            for (en_0 en_02 : en_0Array) {
                if (en_02 instanceof hn_0) {
                    this.t = (hn_0)en_02;
                    continue;
                }
                arrayList.add(en_02);
            }
        }
        this.p = arrayList.toArray(q);
        this.j();
    }

    private final en_0[] i() {
        if (this.p == null) {
            return this.a();
        }
        return this.t != null ? this.g() : this.p;
    }

    private final en_0[] g() {
        en_0[] en_0Array = this.a(this.p, this.p.length + 1);
        en_0Array[this.p.length] = this.t;
        return en_0Array;
    }

    private final en_0[] a() {
        en_0[] en_0Array;
        if (this.t == null) {
            en_0Array = q;
        } else {
            en_0[] en_0Array2 = new en_0[1];
            en_0Array = en_0Array2;
            en_0Array2[0] = this.t;
        }
        return en_0Array;
    }

    public void a(en_0 en_02) {
        if (en_02 instanceof hn_0) {
            this.t = (hn_0)en_02;
        } else if (this.p == null) {
            this.p = new en_0[]{en_02};
        } else {
            if (this.a(en_02.c()) != null) {
                this.b(en_02.c());
            }
            en_0[] en_0Array = this.a(this.p, this.p.length + 1);
            en_0Array[en_0Array.length - 1] = en_02;
            this.p = en_0Array;
        }
        this.j();
    }

    public void b(i2 i22) {
        if (this.p == null) {
            throw new NoSuchElementException();
        }
        ArrayList<en_0> arrayList = new ArrayList<en_0>();
        for (en_0 en_02 : this.p) {
            if (i22.equals(en_02.c())) continue;
            arrayList.add(en_02);
        }
        if (this.p.length == arrayList.size()) {
            throw new NoSuchElementException();
        }
        this.p = arrayList.toArray(q);
        this.j();
    }

    public en_0 a(i2 i22) {
        if (this.p != null) {
            for (en_0 en_02 : this.p) {
                if (!i22.equals(en_02.c())) continue;
                return en_02;
            }
        }
        return null;
    }

    @Override
    public void setExtra(byte[] byArray) {
        try {
            en_0[] en_0Array = ab_0.a(byArray, true, ex_0.f);
            this.a(en_0Array, true);
        }
        catch (ZipException zipException) {
            throw new RuntimeException("Error parsing extra fields for entry: " + this.getName() + " - " + zipException.getMessage(), zipException);
        }
    }

    protected void j() {
        super.setExtra(ab_0.b(this.i()));
    }

    public byte[] h() {
        byte[] byArray = this.getExtra();
        return byArray != null ? byArray : k;
    }

    public byte[] e() {
        return ab_0.a(this.i());
    }

    @Override
    public String getName() {
        return this.f == null ? super.getName() : this.f;
    }

    @Override
    public boolean isDirectory() {
        String string = this.getName();
        return string != null && string.endsWith("/");
    }

    protected void a(String string) {
        if (string != null && this.f() == 0 && !string.contains("/")) {
            string = string.replace('\\', '/');
        }
        this.f = string;
    }

    @Override
    public long getSize() {
        return this.l;
    }

    @Override
    public void setSize(long l3) {
        if (l3 < 0L) {
            throw new IllegalArgumentException("Invalid entry size");
        }
        this.l = l3;
    }

    @Override
    public int hashCode() {
        String string = this.getName();
        return (string == null ? "" : string).hashCode();
    }

    public ch_0 d() {
        return this.r;
    }

    private final void a(en_0[] en_0Array, boolean bl) {
        if (this.p == null) {
            this.a(en_0Array);
        } else {
            for (en_0 en_02 : en_0Array) {
                en_0 en_03 = en_02 instanceof hn_0 ? this.t : this.a(en_02.c());
                if (en_03 == null) {
                    this.a(en_02);
                    continue;
                }
                byte[] byArray = bl ? en_02.e() : en_02.d();
                try {
                    if (bl) {
                        en_03.a(byArray, 0, byArray.length);
                        continue;
                    }
                    en_03.b(byArray, 0, byArray.length);
                }
                catch (ZipException zipException) {
                    y_0 y_02 = new y_0();
                    y_02.a(en_03.c());
                    if (bl) {
                        y_02.b(byArray);
                        y_02.a(en_03.d());
                    } else {
                        y_02.b(en_03.e());
                        y_02.a(byArray);
                    }
                    this.b(en_03.c());
                    this.a(y_02);
                }
            }
            this.j();
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        kw_0 kw_02 = (kw_0)object;
        String string = this.getName();
        String string2 = kw_02.getName();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.getComment();
        String string4 = kw_02.getComment();
        if (string3 == null) {
            string3 = "";
        }
        if (string4 == null) {
            string4 = "";
        }
        return this.getTime() == kw_02.getTime() && string3.equals(string4) && this.b() == kw_02.b() && this.f() == kw_02.f() && this.c() == kw_02.c() && this.getMethod() == kw_02.getMethod() && this.getSize() == kw_02.getSize() && this.getCrc() == kw_02.getCrc() && this.getCompressedSize() == kw_02.getCompressedSize() && Arrays.equals(this.e(), kw_02.e()) && Arrays.equals(this.h(), kw_02.h()) && this.d == kw_02.d && this.w == kw_02.w && this.r.equals(kw_02.r);
    }

    private final en_0[] a(en_0[] en_0Array, int n) {
        en_0[] en_0Array2 = new en_0[n];
        System.arraycopy(en_0Array, 0, en_0Array2, 0, Math.min(en_0Array.length, n));
        return en_0Array2;
    }

    static {
        e = 16;
        o = 65535;
        i = -1;
        m = 0;
        v = 3;
        k = new byte[0];
        q = new en_0[0];
    }
}

