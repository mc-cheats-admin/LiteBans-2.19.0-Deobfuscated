package litebans;

public class hc_0
extends Exception {
    private static final long a = 2772690708123267100L;

    public hc_0(String string) {
        super(string);
    }

    public hc_0(String string, Exception exception) {
        super(string);
        this.initCause(exception);
    }
}

