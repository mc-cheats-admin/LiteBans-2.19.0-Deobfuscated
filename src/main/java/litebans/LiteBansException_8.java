package litebans;

public class LiteBansException_8
extends Exception {
    private static final long BaseCoreGenericHandler = 2772690708123267100L;

    public LiteBansException_8(String string) {
        super(string);
    }

    public LiteBansException_8(String string, Exception exception) {
        super(string);
        this.initCause(exception);
    }
}

