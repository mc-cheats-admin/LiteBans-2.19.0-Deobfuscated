package litebans;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import litebans.at_0;
import litebans.e_0;
import litebans.hc_0;
import litebans.jl_0;

/*
 * Renamed from litebans.g
 */
public static class g_0
extends e_0 {
    private static final int h;
    private static final int f;
    private final DataInputStream j;
    private final String e;
    private final jl_0 g;
    private at_0 d = null;
    private InputStream i = null;

    public g_0(InputStream inputStream, String string) {
        this.j = new DataInputStream(inputStream);
        this.e = string;
        try {
            this.g = this.b();
            if ((this.g.h & 1) != 0) {
                throw new hc_0("Encrypted ARJ files are unsupported");
            }
            if ((this.g.h & 4) != 0) {
                throw new hc_0("Multi-volume ARJ files are unsupported");
            }
        }
        catch (IOException iOException) {
            throw new hc_0(iOException.getMessage(), iOException);
        }
    }

    public g_0(InputStream inputStream) {
        this(inputStream, "CP437");
    }

    @Override
    public void close() {
        this.j.close();
    }

    private final int c(DataInputStream dataInputStream) {
        int n = dataInputStream.readUnsignedByte();
        this.a(1);
        return n;
    }

    private final int b(DataInputStream dataInputStream) {
        int n = dataInputStream.readUnsignedShort();
        this.a(2);
        return Integer.reverseBytes(n) >>> 16;
    }

    private final int d(DataInputStream dataInputStream) {
        int n = dataInputStream.readInt();
        this.a(4);
        return Integer.reverseBytes(n);
    }

    private final String a(DataInputStream dataInputStream) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
            int n;
            while ((n = dataInputStream.readUnsignedByte()) != 0) {
                byteArrayOutputStream.write(n);
            }
            if (this.e != null) {
                String string = new String(byteArrayOutputStream.toByteArray(), this.e);
                return string;
            }
            String string = new String(byteArrayOutputStream.toByteArray());
            return string;
        }
    }

    private final void a(DataInputStream dataInputStream, byte[] byArray) {
        dataInputStream.readFully(byArray);
        this.a(byArray.length);
    }

    private final byte[] a() {
        boolean bl = false;
        byte[] byArray = null;
        do {
            int n = 0;
            int n2 = this.c(this.j);
            do {
                n = n2;
                n2 = this.c(this.j);
            } while (n != 96 && n2 != 234);
            int n3 = this.b(this.j);
            if (n3 == 0) {
                return null;
            }
            if (n3 > 2600) continue;
            byArray = new byte[n3];
            this.a(this.j, byArray);
            long l3 = (long)this.d(this.j) & 0xFFFFFFFFL;
            CRC32 cRC32 = new CRC32();
            cRC32.update(byArray);
            if (l3 != cRC32.getValue()) continue;
            bl = true;
        } while (!bl);
        return byArray;
    }

    private final jl_0 b() {
        byte[] byArray = this.a();
        if (byArray == null) {
            throw new IOException("Archive ends without any headers");
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
        int n = dataInputStream.readUnsignedByte();
        byte[] byArray2 = new byte[n - 1];
        dataInputStream.readFully(byArray2);
        DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(byArray2));
        jl_0 jl_02 = new jl_0();
        jl_02.k = dataInputStream2.readUnsignedByte();
        jl_02.i = dataInputStream2.readUnsignedByte();
        jl_02.p = dataInputStream2.readUnsignedByte();
        jl_02.h = dataInputStream2.readUnsignedByte();
        jl_02.t = dataInputStream2.readUnsignedByte();
        jl_02.b = dataInputStream2.readUnsignedByte();
        jl_02.s = dataInputStream2.readUnsignedByte();
        jl_02.o = this.d(dataInputStream2);
        jl_02.q = this.d(dataInputStream2);
        jl_02.f = 0xFFFFFFFFL & (long)this.d(dataInputStream2);
        jl_02.a = this.d(dataInputStream2);
        jl_02.j = this.b(dataInputStream2);
        jl_02.l = this.b(dataInputStream2);
        this.a(20L);
        jl_02.d = dataInputStream2.readUnsignedByte();
        jl_02.c = dataInputStream2.readUnsignedByte();
        if (n >= 33) {
            jl_02.g = dataInputStream2.readUnsignedByte();
            jl_02.n = dataInputStream2.readUnsignedByte();
            dataInputStream2.readUnsignedByte();
            dataInputStream2.readUnsignedByte();
        }
        jl_02.m = this.a(dataInputStream);
        jl_02.r = this.a(dataInputStream);
        int n2 = this.b(this.j);
        if (n2 > 0) {
            jl_02.e = new byte[n2];
            this.a(this.j, jl_02.e);
            long l3 = 0xFFFFFFFFL & (long)this.d(this.j);
            CRC32 cRC32 = new CRC32();
            cRC32.update(jl_02.e);
            if (l3 != cRC32.getValue()) {
                throw new IOException("Extended header CRC32 verification failure");
            }
        }
        return jl_02;
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        if (n2 == 0) {
            return 0;
        }
        if (this.d == null) {
            throw new IllegalStateException("No current arj entry");
        }
        if (this.d.d != 0) {
            throw new IOException("Unsupported compression method " + this.d.d);
        }
        return this.i.read(byArray, n, n2);
    }

    static {
        f = 234;
        h = 96;
    }
}

