package litebans;

public class bo_0 {
    public static final int a;
    public static final int b;
    public static final int g;
    public static final int j;
    public static final int i;
    public static final int c;
    public static final int d;
    public static final int f;
    public int h = 0;
    public Object e = null;

    public bo_0(int n, Object object) {
        this.h = n;
        this.e = object;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.h) {
            case 0: {
                stringBuffer.append("VALUE(").append(this.e).append(")");
                break;
            }
            case 1: {
                stringBuffer.append("LEFT BRACE({)");
                break;
            }
            case 2: {
                stringBuffer.append("RIGHT BRACE(})");
                break;
            }
            case 3: {
                stringBuffer.append("LEFT SQUARE([)");
                break;
            }
            case 4: {
                stringBuffer.append("RIGHT SQUARE(])");
                break;
            }
            case 5: {
                stringBuffer.append("COMMA(,)");
                break;
            }
            case 6: {
                stringBuffer.append("COLON(:)");
                break;
            }
            case -1: {
                stringBuffer.append("END OF FILE");
            }
        }
        return stringBuffer.toString();
    }

    static {
        f = -1;
        d = 6;
        c = 5;
        i = 4;
        j = 3;
        g = 2;
        b = 1;
        a = 0;
    }
}

