package litebans;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
public class Cp437Handler
extends LiteBansModule_153 {
    private static final int LiteBansModule_240;
    private static final int LiteBansModule_194;
    private final DataInputStream GnuSparseMapHandler;
    private final String e;
    private final LiteBansModule_347 g;
    private LiteBansModule_22 AsyncBackgroundTask_5 = null;
    private InputStream i = null;

    public Cp437Handler(InputStream inputStream, String string) {
        this.GnuSparseMapHandler = new DataInputStream(inputStream);
        this.e = string;
        try {
            this.g = this.LiteBansModule_31();
            if ((this.g.LiteBansModule_240 & 1) != 0) {
                throw new LiteBansException_8("Encrypted ARJ files are unsupported");
            }
            if ((this.g.LiteBansModule_240 & 4) != 0) {
                throw new LiteBansException_8("Multi-volume ARJ files are unsupported");
            }
        }
        catch (IOException iOException) {
            throw new LiteBansException_8(iOException.getMessage(), iOException);
        }
    }

    public Cp437Handler(InputStream inputStream) {
        this(inputStream, "CP437");
    }

    @Override
    public void close() {
        this.GnuSparseMapHandler.close();
    }

    private final int c(DataInputStream dataInputStream) {
        int n = dataInputStream.readUnsignedByte();
        this.plugin(1);
        return n;
    }

    private final int LiteBansModule_31(DataInputStream dataInputStream) {
        int n = dataInputStream.readUnsignedShort();
        this.plugin(2);
        return Integer.reverseBytes(n) >>> 16;
    }

    private final int AsyncBackgroundTask_5(DataInputStream dataInputStream) {
        int n = dataInputStream.readInt();
        this.plugin(4);
        return Integer.reverseBytes(n);
    }

    private final String BaseCoreGenericHandler(DataInputStream dataInputStream) {
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

    private final void BaseCoreGenericHandler(DataInputStream dataInputStream, byte[] byArray) {
        dataInputStream.readFully(byArray);
        this.plugin(byArray.length);
    }

    private final byte[] BaseCoreGenericHandler() {
        boolean flag = false;
        byte[] byArray = null;
        do {
            int n = 0;
            int n2 = this.c(this.GnuSparseMapHandler);
            do {
                n = n2;
                n2 = this.c(this.GnuSparseMapHandler);
            } while (n != 96 && n2 != 234);
            int n3 = this.LiteBansModule_31(this.GnuSparseMapHandler);
            if (n3 == 0) {
                return null;
            }
            if (n3 > 2600) continue;
            byArray = new byte[n3];
            this.plugin(this.GnuSparseMapHandler, byArray);
            long l3 = (long)this.AsyncBackgroundTask_5(this.GnuSparseMapHandler) & 0xFFFFFFFFL;
            CRC32 cRC32 = new CRC32();
            cRC32.update(byArray);
            if (l3 != cRC32.getValue()) continue;
            flag = true;
        } while (!flag);
        return byArray;
    }

    private final LiteBansModule_347 LiteBansModule_31() {
        byte[] byArray = this.plugin();
        if (byArray == null) {
            throw new IOException("Archive ends without any headers");
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
        int n = dataInputStream.readUnsignedByte();
        byte[] byArray2 = new byte[n - 1];
        dataInputStream.readFully(byArray2);
        DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(byArray2));
        LiteBansModule_347 jl_02 = new LiteBansModule_347();
        jl_02.Utf8Handler_2 = dataInputStream2.readUnsignedByte();
        jl_02.i = dataInputStream2.readUnsignedByte();
        jl_02.PunishmentTableService = dataInputStream2.readUnsignedByte();
        jl_02.LiteBansModule_240 = dataInputStream2.readUnsignedByte();
        jl_02.AsyncBackgroundTask_22 = dataInputStream2.readUnsignedByte();
        jl_02.LiteBansModule_31 = dataInputStream2.readUnsignedByte();
        jl_02.AsyncBackgroundTask_21 = dataInputStream2.readUnsignedByte();
        jl_02.BroadcastService = this.AsyncBackgroundTask_5(dataInputStream2);
        jl_02.q = this.AsyncBackgroundTask_5(dataInputStream2);
        jl_02.LiteBansModule_194 = 0xFFFFFFFFL & (long)this.AsyncBackgroundTask_5(dataInputStream2);
        jl_02.BaseCoreGenericHandler = this.AsyncBackgroundTask_5(dataInputStream2);
        jl_02.GnuSparseMapHandler = this.LiteBansModule_31(dataInputStream2);
        jl_02.LiteBansModule_401 = this.LiteBansModule_31(dataInputStream2);
        this.plugin(20L);
        jl_02.AsyncBackgroundTask_5 = dataInputStream2.readUnsignedByte();
        jl_02.c = dataInputStream2.readUnsignedByte();
        if (n >= 33) {
            jl_02.g = dataInputStream2.readUnsignedByte();
            jl_02.n = dataInputStream2.readUnsignedByte();
            dataInputStream2.readUnsignedByte();
            dataInputStream2.readUnsignedByte();
        }
        jl_02.m = this.plugin(dataInputStream);
        jl_02.r = this.plugin(dataInputStream);
        int n2 = this.LiteBansModule_31(this.GnuSparseMapHandler);
        if (n2 > 0) {
            jl_02.e = new byte[n2];
            this.plugin(this.GnuSparseMapHandler, jl_02.e);
            long l3 = 0xFFFFFFFFL & (long)this.AsyncBackgroundTask_5(this.GnuSparseMapHandler);
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
        if (this.AsyncBackgroundTask_5 == null) {
            throw new IllegalStateException("No current arj entry");
        }
        if (this.AsyncBackgroundTask_5.AsyncBackgroundTask_5 != 0) {
            throw new IOException("Unsupported compression method " + this.AsyncBackgroundTask_5.AsyncBackgroundTask_5);
        }
        return this.i.read(byArray, n, n2);
    }

    static {
        LiteBansModule_194 = 234;
        LiteBansModule_240 = 96;
    }
}

