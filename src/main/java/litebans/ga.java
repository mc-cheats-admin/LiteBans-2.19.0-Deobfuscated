package litebans;

import java.io.ByteArrayOutputStream;

public final class ga
extends ByteArrayOutputStream {
    ga(int n) {
        super(n);
    }

    @Override
    public byte[] toByteArray() {
        return this.buf;
    }
}

