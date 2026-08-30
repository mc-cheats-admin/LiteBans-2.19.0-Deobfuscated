package litebans;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import litebans.dd_0;
import litebans.gm_0;

static class gh_0
implements dd_0,
gm_0 {
    private final Charset b;
    private final boolean f;
    private static final char c = (char)63;
    private static final byte[] e = new byte[]{63};
    private static final String a = String.valueOf('?');
    private static final char[] d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    gh_0(Charset charset, boolean bl) {
        this.b = charset;
        this.f = bl;
    }

    @Override
    public String a(byte[] byArray) {
        return this.a().decode(ByteBuffer.wrap(byArray)).toString();
    }

    private final CharsetDecoder a() {
        if (!this.f) {
            return this.b.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
        }
        return this.b.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).replaceWith(a);
    }
}

