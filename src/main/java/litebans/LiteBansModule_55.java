package litebans;

public class LiteBansModule_55 {
    public static final int BaseCoreGenericHandler;
    public static final int LiteBansModule_31;
    public static final int g;
    public static final int GnuSparseMapHandler;
    public static final int i;
    public static final int c;
    public static final int AsyncBackgroundTask_5;
    public static final int LiteBansModule_194;
    public int LiteBansModule_240 = 0;
    public Object e = null;

    public LiteBansModule_55(int n, Object targetObj) {
        this.LiteBansModule_240 = n;
        this.e = targetObj;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.LiteBansModule_240) {
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
        return stringBuffer.toString();
    }

    static {
        LiteBansModule_194 = -1;
        AsyncBackgroundTask_5 = 6;
        c = 5;
        i = 4;
        GnuSparseMapHandler = 3;
        g = 2;
        LiteBansModule_31 = 1;
        BaseCoreGenericHandler = 0;
}

