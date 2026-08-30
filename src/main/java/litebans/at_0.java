package litebans;

import java.util.Arrays;
import java.util.Objects;

static class at_0 {
    int r;
    int b;
    int k;
    int o;
    int d;
    int g;
    int t;
    int f;
    long j;
    long a;
    long h;
    int i;
    int m;
    int c;
    int n;
    int e;
    int l;
    int p;
    int v;
    String u;
    String s;
    byte[][] q = null;

    at_0() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LocalFileHeader [archiverVersionNumber=");
        stringBuilder.append(this.r);
        stringBuilder.append(", minVersionToExtract=");
        stringBuilder.append(this.b);
        stringBuilder.append(", hostOS=");
        stringBuilder.append(this.k);
        stringBuilder.append(", arjFlags=");
        stringBuilder.append(this.o);
        stringBuilder.append(", method=");
        stringBuilder.append(this.d);
        stringBuilder.append(", fileType=");
        stringBuilder.append(this.g);
        stringBuilder.append(", reserved=");
        stringBuilder.append(this.t);
        stringBuilder.append(", dateTimeModified=");
        stringBuilder.append(this.f);
        stringBuilder.append(", compressedSize=");
        stringBuilder.append(this.j);
        stringBuilder.append(", originalSize=");
        stringBuilder.append(this.a);
        stringBuilder.append(", originalCrc32=");
        stringBuilder.append(this.h);
        stringBuilder.append(", fileSpecPosition=");
        stringBuilder.append(this.i);
        stringBuilder.append(", fileAccessMode=");
        stringBuilder.append(this.m);
        stringBuilder.append(", firstChapter=");
        stringBuilder.append(this.c);
        stringBuilder.append(", lastChapter=");
        stringBuilder.append(this.n);
        stringBuilder.append(", extendedFilePosition=");
        stringBuilder.append(this.e);
        stringBuilder.append(", dateTimeAccessed=");
        stringBuilder.append(this.l);
        stringBuilder.append(", dateTimeCreated=");
        stringBuilder.append(this.p);
        stringBuilder.append(", originalSizeEvenForVolumes=");
        stringBuilder.append(this.v);
        stringBuilder.append(", name=");
        stringBuilder.append(this.u);
        stringBuilder.append(", comment=");
        stringBuilder.append(this.s);
        stringBuilder.append(", extendedHeaders=");
        stringBuilder.append(Arrays.toString((Object[])this.q));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        return this.u == null ? 0 : this.u.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        at_0 at_02 = (at_0)object;
        return this.r == at_02.r && this.b == at_02.b && this.k == at_02.k && this.o == at_02.o && this.d == at_02.d && this.g == at_02.g && this.t == at_02.t && this.f == at_02.f && this.j == at_02.j && this.a == at_02.a && this.h == at_02.h && this.i == at_02.i && this.m == at_02.m && this.c == at_02.c && this.n == at_02.n && this.e == at_02.e && this.l == at_02.l && this.p == at_02.p && this.v == at_02.v && Objects.equals(this.u, at_02.u) && Objects.equals(this.s, at_02.s) && Arrays.deepEquals((Object[])this.q, (Object[])at_02.q);
    }
}

