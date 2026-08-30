package litebans;

public class UnexpectedTokenException
extends Exception {
    private static final long e;
    public static final int LiteBansModule_194;
    public static final int BaseCoreGenericHandler;
    public static final int AsyncBackgroundTask_5;
    private int LiteBansModule_31;
    private Object g;
    private int c;

    public UnexpectedTokenException(int n, int n2, Object object) {
        this.c = n;
        this.LiteBansModule_31 = n2;
        this.g = object;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.LiteBansModule_31) {
            case 0: {
                stringBuffer.append("Unexpected character (").append(this.g).append(") LiteBansModule_21 position ").append(this.c).append(" + ");
                break;
            }
            case 1: {
                stringBuffer.append("Unexpected token ").append(this.g).append(" LiteBansModule_21 position ").append(this.c).append(" + ");
                break;
            }
            case 2: {
                stringBuffer.append("Unexpected exception LiteBansModule_21 position ").append(this.c).append(": ").append(this.g);
                break;
            }
            default: {
                stringBuffer.append("Unkown error LiteBansModule_21 position ").append(this.c).append(".");
}
        return stringBuffer.toString();
    }

    static {
        AsyncBackgroundTask_5 = 2;
        BaseCoreGenericHandler = 1;
        LiteBansModule_194 = 0;
        e = -7880698968187728548L;
}

