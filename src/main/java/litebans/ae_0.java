package litebans;

/*
 * Renamed from litebans.aE
 */
public static class ae_0
extends Exception {
    private static final long e;
    public static final int f;
    public static final int a;
    public static final int d;
    private int b;
    private Object g;
    private int c;

    public ae_0(int n, int n2, Object object) {
        this.c = n;
        this.b = n2;
        this.g = object;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.b) {
            case 0: {
                stringBuffer.append("Unexpected character (").append(this.g).append(") at position ").append(this.c).append(".");
                break;
            }
            case 1: {
                stringBuffer.append("Unexpected token ").append(this.g).append(" at position ").append(this.c).append(".");
                break;
            }
            case 2: {
                stringBuffer.append("Unexpected exception at position ").append(this.c).append(": ").append(this.g);
                break;
            }
            default: {
                stringBuffer.append("Unkown error at position ").append(this.c).append(".");
            }
        }
        return stringBuffer.toString();
    }

    static {
        d = 2;
        a = 1;
        f = 0;
        e = -7880698968187728548L;
    }
}

