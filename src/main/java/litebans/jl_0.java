package litebans;

import java.util.Arrays;

/*
 * Renamed from litebans.jl
 */
static class jl_0 {
    int k;
    int i;
    int p;
    int h;
    int t;
    int b;
    int s;
    int o;
    int q;
    long f;
    int a;
    int j;
    int l;
    int d;
    int c;
    int g;
    int n;
    String m;
    String r;
    byte[] e = null;

    jl_0() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MainHeader [archiverVersionNumber=");
        stringBuilder.append(this.k);
        stringBuilder.append(", minVersionToExtract=");
        stringBuilder.append(this.i);
        stringBuilder.append(", hostOS=");
        stringBuilder.append(this.p);
        stringBuilder.append(", arjFlags=");
        stringBuilder.append(this.h);
        stringBuilder.append(", securityVersion=");
        stringBuilder.append(this.t);
        stringBuilder.append(", fileType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", reserved=");
        stringBuilder.append(this.s);
        stringBuilder.append(", dateTimeCreated=");
        stringBuilder.append(this.o);
        stringBuilder.append(", dateTimeModified=");
        stringBuilder.append(this.q);
        stringBuilder.append(", archiveSize=");
        stringBuilder.append(this.f);
        stringBuilder.append(", securityEnvelopeFilePosition=");
        stringBuilder.append(this.a);
        stringBuilder.append(", fileSpecPosition=");
        stringBuilder.append(this.j);
        stringBuilder.append(", securityEnvelopeLength=");
        stringBuilder.append(this.l);
        stringBuilder.append(", encryptionVersion=");
        stringBuilder.append(this.d);
        stringBuilder.append(", lastChapter=");
        stringBuilder.append(this.c);
        stringBuilder.append(", arjProtectionFactor=");
        stringBuilder.append(this.g);
        stringBuilder.append(", arjFlags2=");
        stringBuilder.append(this.n);
        stringBuilder.append(", name=");
        stringBuilder.append(this.m);
        stringBuilder.append(", comment=");
        stringBuilder.append(this.r);
        stringBuilder.append(", extendedHeaderBytes=");
        stringBuilder.append(Arrays.toString(this.e));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

