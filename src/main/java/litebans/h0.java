package litebans;

import java.io.Reader;
import litebans.ae_0;
import litebans.bo_0;

static class h0 {
    public static final int t;
    private static final int f;
    public static final int C;
    public static final int d;
    private static final int[] u;
    private static final String q;
    private static final char[] E;
    private static final int[] g;
    private static final String x;
    private static final int[] n;
    private static final String y;
    private static final int[] h;
    private static final int a;
    private static final int o;
    private static final int F;
    private static final String[] p;
    private static final int[] l;
    private static final String s;
    private Reader A;
    private int B;
    private int i = 0;
    private char[] v = new char[16384];
    private int w;
    private int j;
    private int c;
    private int e;
    private int b;
    private int D;
    private int z;
    private boolean r = true;
    private boolean k;
    private StringBuffer m = new StringBuffer();

    private static final int[] a() {
        int[] nArray = new int[45];
        int n = 0;
        n = h0.c("\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0005\u0000\u0001\f\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018", n, nArray);
        return nArray;
    }

    private static final int c(String string, int n, int[] nArray) {
        int n2 = 0;
        int n3 = n;
        int n4 = string.length();
        while (n2 < n4) {
            int n5 = string.charAt(n2++);
            char c = string.charAt(n2++);
            do {
                nArray[n3++] = c;
            } while (--n5 > 0);
        }
        return n3;
    }

    private static final int[] g() {
        int[] nArray = new int[45];
        int n = 0;
        n = h0.b("\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u0087\u00006\u0000\u00a2\u0000\u00bd\u0000\u00d8\u00006\u00006\u00006\u00006\u00006\u00006\u0000\u00f3\u0000\u010e\u00006\u0000\u0129\u0000\u0144\u0000\u015f\u0000\u017a\u0000\u0195\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000\u01b0\u0000\u01cb\u0000\u01e6\u0000\u01e6\u0000\u0201\u0000\u021c\u0000\u0237\u0000\u0252\u00006\u00006\u0000\u026d\u0000\u0288\u00006", n, nArray);
        return nArray;
    }

    private static final int b(String string, int n, int[] nArray) {
        int n2 = 0;
        int n3 = n;
        int n4 = string.length();
        while (n2 < n4) {
            int n5 = string.charAt(n2++) << 16;
            nArray[n3++] = n5 | string.charAt(n2++);
        }
        return n3;
    }

    private static final int[] f() {
        int[] nArray = new int[45];
        int n = 0;
        n = h0.a("\u0002\u0000\u0001\t\u0003\u0001\u0001\t\u0003\u0001\u0006\t\u0002\u0001\u0001\t\u0005\u0000\b\t\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\t\u0002\u0000\u0001\t", n, nArray);
        return nArray;
    }

    private static final int a(String string, int n, int[] nArray) {
        int n2 = 0;
        int n3 = n;
        int n4 = string.length();
        while (n2 < n4) {
            int n5 = string.charAt(n2++);
            char c = string.charAt(n2++);
            do {
                nArray[n3++] = c;
            } while (--n5 > 0);
        }
        return n3;
    }

    int c() {
        return this.D;
    }

    h0(Reader reader) {
        this.A = reader;
    }

    private static final char[] a(String string) {
        char[] cArray = new char[65536];
        int n = 0;
        int n2 = 0;
        while (n < 90) {
            int n3 = string.charAt(n++);
            char c = string.charAt(n++);
            do {
                cArray[n2++] = c;
            } while (--n3 > 0);
        }
        return cArray;
    }

    private final boolean d() {
        int n;
        if (this.c > 0) {
            System.arraycopy(this.v, this.c, this.v, 0, this.e - this.c);
            this.e -= this.c;
            this.j -= this.c;
            this.w -= this.c;
            this.c = 0;
        }
        if (this.j >= this.v.length) {
            char[] cArray = new char[this.j * 2];
            System.arraycopy(this.v, 0, cArray, 0, this.v.length);
            this.v = cArray;
        }
        if ((n = this.A.read(this.v, this.e, this.v.length - this.e)) > 0) {
            this.e += n;
            return false;
        }
        if (n == 0) {
            int n2 = this.A.read();
            if (n2 == -1) {
                return true;
            }
            this.v[this.e++] = (char)n2;
            return false;
        }
        return true;
    }

    public final void a(Reader reader) {
        this.A = reader;
        this.r = true;
        this.k = false;
        this.c = 0;
        this.e = 0;
        this.w = 0;
        this.j = 0;
        this.z = 0;
        this.D = 0;
        this.b = 0;
        this.i = 0;
    }

    public final void b(int n) {
        this.i = n;
    }

    public final String b() {
        return new String(this.v, this.c, this.w - this.c);
    }

    public final char a(int n) {
        return this.v[this.c + n];
    }

    private final void c(int n) {
        String string;
        try {
            string = p[n];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            string = p[0];
        }
        throw new Error(string);
    }

    public bo_0 e() {
        int n = this.e;
        char[] cArray = this.v;
        char[] cArray2 = E;
        int[] nArray = h;
        int[] nArray2 = h0.n;
        int[] nArray3 = l;
        block51: while (true) {
            int n2;
            int n3;
            int n4 = this.w;
            this.D += n4 - this.c;
            int n5 = -1;
            this.j = this.c = n4;
            int n6 = this.c;
            this.B = u[this.i];
            while (true) {
                if (n6 < n) {
                    n3 = cArray[n6++];
                } else {
                    if (this.k) {
                        n3 = -1;
                        break;
                    }
                    this.j = n6;
                    this.w = n4;
                    n2 = this.d();
                    n6 = this.j;
                    n4 = this.w;
                    cArray = this.v;
                    n = this.e;
                    if (n2 != 0) {
                        n3 = -1;
                        break;
                    }
                    n3 = cArray[n6++];
                }
                n2 = nArray[nArray2[this.B] + cArray2[n3]];
                if (n2 == -1) break;
                this.B = n2;
                int n7 = nArray3[this.B];
                if ((n7 & 1) != 1) continue;
                n5 = this.B;
                n4 = n6;
                if ((n7 & 8) == 8) break;
            }
            this.w = n4;
            switch (n5 < 0 ? n5 : g[n5]) {
                case 11: {
                    this.m.append(this.b());
                }
                case 25: {
                    continue block51;
                }
                case 4: {
                    this.m.delete(0, this.m.length());
                    this.b(2);
                }
                case 26: {
                    continue block51;
                }
                case 16: {
                    this.m.append('\b');
                }
                case 27: {
                    continue block51;
                }
                case 6: {
                    return new bo_0(2, null);
                }
                case 28: {
                    continue block51;
                }
                case 23: {
                    Boolean bl = Boolean.valueOf(this.b());
                    return new bo_0(0, bl);
                }
                case 29: {
                    continue block51;
                }
                case 22: {
                    return new bo_0(0, null);
                }
                case 30: {
                    continue block51;
                }
                case 13: {
                    this.b(0);
                    return new bo_0(0, this.m.toString());
                }
                case 31: {
                    continue block51;
                }
                case 12: {
                    this.m.append('\\');
                }
                case 32: {
                    continue block51;
                }
                case 21: {
                    Double d10 = Double.valueOf(this.b());
                    return new bo_0(0, d10);
                }
                case 33: {
                    continue block51;
                }
                case 1: {
                    throw new ae_0(this.D, 0, new Character(this.a(0)));
                }
                case 34: {
                    continue block51;
                }
                case 8: {
                    return new bo_0(4, null);
                }
                case 35: {
                    continue block51;
                }
                case 19: {
                    this.m.append('\r');
                }
                case 36: {
                    continue block51;
                }
                case 15: {
                    this.m.append('/');
                }
                case 37: {
                    continue block51;
                }
                case 10: {
                    return new bo_0(6, null);
                }
                case 38: {
                    continue block51;
                }
                case 14: {
                    this.m.append('\"');
                }
                case 39: {
                    continue block51;
                }
                case 5: {
                    return new bo_0(1, null);
                }
                case 40: {
                    continue block51;
                }
                case 17: {
                    this.m.append('\f');
                }
                case 41: {
                    continue block51;
                }
                case 24: {
                    try {
                        n2 = Integer.parseInt(this.b().substring(2), 16);
                        this.m.append((char)n2);
                    }
                    catch (Exception exception) {
                        throw new ae_0(this.D, 2, exception);
                    }
                }
                case 42: {
                    continue block51;
                }
                case 20: {
                    this.m.append('\t');
                }
                case 43: {
                    continue block51;
                }
                case 7: {
                    return new bo_0(3, null);
                }
                case 44: {
                    continue block51;
                }
                case 2: {
                    Long l3 = Long.valueOf(this.b());
                    return new bo_0(0, l3);
                }
                case 45: {
                    continue block51;
                }
                case 18: {
                    this.m.append('\n');
                }
                case 46: {
                    continue block51;
                }
                case 9: {
                    return new bo_0(5, null);
                }
                case 47: {
                    continue block51;
                }
                case 3: 
                case 48: {
                    continue block51;
                }
            }
            if (n3 == -1 && this.c == this.j) {
                this.k = true;
                return null;
            }
            this.c(1);
        }
    }

    static {
        s = "\u0002\u0000\u0001\t\u0003\u0001\u0001\t\u0003\u0001\u0006\t\u0002\u0001\u0001\t\u0005\u0000\b\t\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\t\u0002\u0000\u0001\t";
        F = 2;
        o = 1;
        a = 0;
        y = "\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u0087\u00006\u0000\u00a2\u0000\u00bd\u0000\u00d8\u00006\u00006\u00006\u00006\u00006\u00006\u0000\u00f3\u0000\u010e\u00006\u0000\u0129\u0000\u0144\u0000\u015f\u0000\u017a\u0000\u0195\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000\u01b0\u0000\u01cb\u0000\u01e6\u0000\u01e6\u0000\u0201\u0000\u021c\u0000\u0237\u0000\u0252\u00006\u00006\u0000\u026d\u0000\u0288\u00006";
        x = "\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0005\u0000\u0001\f\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018";
        q = "\t\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\t\b\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\b\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\f\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016\uff82\u0000";
        d = 2;
        C = 0;
        f = 16384;
        t = -1;
        u = new int[]{0, 0, 1, 1};
        E = h0.a("\t\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\t\b\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\b\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\f\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016\uff82\u0000");
        g = h0.a();
        n = h0.g();
        h = new int[]{2, 2, 3, 4, 2, 2, 2, 5, 2, 6, 2, 2, 7, 8, 2, 9, 2, 2, 2, 2, 2, 10, 11, 12, 13, 14, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 18, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, 19, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, 24, 25, 26, 27, 28, 29, 30, 31, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, 35, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, 39, -1, 39, -1, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, 42, -1, 42, -1, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, 43, -1, 43, -1, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, 44, -1, 44, -1, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1};
        p = new String[]{"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
        l = h0.f();
    }
}

