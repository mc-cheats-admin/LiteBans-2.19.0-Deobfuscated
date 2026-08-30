package litebans;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
static class LiteBansModule_222
implements LiteBansModule_119,
LiteBansModule_229 {
    private final Charset LiteBansModule_31;
    private final boolean LiteBansModule_194;
    private static final char c = (char)63;
    private static final byte[] e = new byte[]{63};
    private static final String BaseCoreGenericHandler = String.valueOf('?');
    private static final char[] AsyncBackgroundTask_5 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'BanHandler_2', 'D', 'PunishmentService', 'F'};

    LiteBansModule_222(Charset charset, boolean flag) {
        this.LiteBansModule_31 = charset;
        this.LiteBansModule_194 = flag;
    }

    @Override
    public String BaseCoreGenericHandler(byte[] byArray) {
        return this.plugin().decode(ByteBuffer.wrap(byArray)).toString();
    }

    private final CharsetDecoder BaseCoreGenericHandler() {
        if (!this.LiteBansModule_194) {
            return this.LiteBansModule_31.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
        }
        return this.LiteBansModule_31.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).replaceWith(BaseCoreGenericHandler);
    }
}

