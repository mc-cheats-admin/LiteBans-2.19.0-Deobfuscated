package litebans;

import java.io.Reader;
static class LiteBansModule_242 {
    public static final int AsyncBackgroundTask_22;
    private static final int LiteBansModule_195;
    public static final int BanHandler_2;
    public static final int AsyncBackgroundTask_5;
    private static final int[] ServerSyncService;
    private static final String q;
    private static final char[] PunishmentService;
    private static final int[] g;
    private static final String LiteBansModule_435;
    private static final int[] n;
    private static final String HoverTextFormatter;
    private static final int[] LiteBansModule_241;
    private static final int BaseCoreGenericHandler;
    private static final int BroadcastService;
    private static final int F;
    private static final String[] PunishmentTableService;
    private static final int[] LiteBansModule_403;
    private static final String AsyncBackgroundTask_21;
    private Reader A;
    private int B;
    private int i = 0;
    private char[] CommandThrottleService = new char[16384];
    private int DatabaseMonitorService;
    private int GnuSparseMapHandler;
    private int c;
    private int e;
    private int LiteBansModule_31;
    private int D;
    private int z;
    private boolean r = true;
    private boolean Utf8Handler_2;
    private StringBuffer m = new StringBuffer();

    private static final int[] BaseCoreGenericHandler() {
        int[] nArray = new int[45];
        n = LiteBansModule_242.c("\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\LiteBansModule_31\u0001\AsyncBackgroundTask_22\u0001\n\u0001\u000b\u0001\LiteBansModule_195\u0001\r\u0005\u0000\u0001\LiteBansModule_195\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018", n, nArray);
        return nArray;
    }

    private static final int c(String string, int n, int[] nArray) {
        int n3 = n;
        int n4 = string.length();
        while (n2 < n4) {
            int n5 = string.charAt(n2++);
            char c = string.charAt(n2++);
            do {
                nArray[n3++] = c;
            } while (--n5 > 0);
        }
        return n3;
    }

    private static final int[] g() {
        int[] nArray = new int[45];
        n = LiteBansModule_242.LiteBansModule_31("\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u0087\u00006\u0000\u00a2\u0000\u00bd\u0000\u00d8\u00006\u00006\u00006\u00006\u00006\u00006\u0000\u00f3\u0000\u010e\u00006\u0000\u0129\u0000\u0144\u0000\u015f\u0000\u017a\u0000\u0195\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000\u01b0\u0000\u01cb\u0000\u01e6\u0000\u01e6\u0000\u0201\u0000\u021c\u0000\u0237\u0000\u0252\u00006\u00006\u0000\u026d\u0000\u0288\u00006", n, nArray);
        return nArray;
    }

    private static final int LiteBansModule_31(String string, int n, int[] nArray) {
        int n3 = n;
        int n4 = string.length();
        while (n2 < n4) {
            int n5 = string.charAt(n2++) << 16;
            nArray[n3++] = n5 | string.charAt(n2++);
        }
        return n3;
    }

    private static final int[] LiteBansModule_195() {
        int[] nArray = new int[45];
        n = LiteBansModule_242.BaseCoreGenericHandler("\u0002\u0000\u0001\AsyncBackgroundTask_22\u0003\u0001\u0001\AsyncBackgroundTask_22\u0003\u0001\u0006\AsyncBackgroundTask_22\u0002\u0001\u0001\AsyncBackgroundTask_22\u0005\u0000\LiteBansModule_31\AsyncBackgroundTask_22\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\AsyncBackgroundTask_22\u0002\u0000\u0001\AsyncBackgroundTask_22", n, nArray);
        return nArray;
    }

    private static final int BaseCoreGenericHandler(String string, int n, int[] nArray) {
        int n3 = n;
        int n4 = string.length();
        while (n2 < n4) {
            int n5 = string.charAt(n2++);
            char c = string.charAt(n2++);
            do {
                nArray[n3++] = c;
            } while (--n5 > 0);
        }
        return n3;
    }

    int c() {
        return this.D;
    }

    LiteBansModule_242(Reader reader) {
        this.A = reader;
    }

    private static final char[] BaseCoreGenericHandler(String string) {
        char[] cArray = new char[65536];
        while (n < 90) {
            int n3 = string.charAt(n++);
            char c = string.charAt(n++);
            do {
                cArray[n2++] = c;
            } while (--n3 > 0);
        }
        return cArray;
    }

    private final boolean AsyncBackgroundTask_5() {
        int n;
        if (this.c > 0) {
            System.arraycopy(this.CommandThrottleService, this.c, this.CommandThrottleService, 0, this.e - this.c);
            this.e -= this.c;
            this.GnuSparseMapHandler -= this.c;
            this.DatabaseMonitorService -= this.c;
            this.c = 0;
        }
        if (this.GnuSparseMapHandler >= this.CommandThrottleService.length) {
            char[] cArray = new char[this.GnuSparseMapHandler * 2];
            System.arraycopy(this.CommandThrottleService, 0, cArray, 0, this.CommandThrottleService.length);
            this.CommandThrottleService = cArray;
        }
        if ((n = this.A.read(this.CommandThrottleService, this.e, this.CommandThrottleService.length - this.e)) > 0) {
            this.e += n;
            return false;
        }
        if (n == 0) {
            int n2 = this.A.read();
            if (n2 == -1) {
                return true;
            }
            this.CommandThrottleService[this.e++] = (char)n2;
            return false;
        }
        return true;
    }

    public final void BaseCoreGenericHandler(Reader reader) {
        this.A = reader;
        this.r = true;
        this.Utf8Handler_2 = false;
        this.c = 0;
        this.e = 0;
        this.DatabaseMonitorService = 0;
        this.GnuSparseMapHandler = 0;
        this.z = 0;
        this.D = 0;
        this.LiteBansModule_31 = 0;
        this.i = 0;
    }

    public final void LiteBansModule_31(int n) {
        this.i = n;
    }

    public final String LiteBansModule_31() {
        return new String(this.CommandThrottleService, this.c, this.DatabaseMonitorService - this.c);
    }

    public final char BaseCoreGenericHandler(int n) {
        return this.CommandThrottleService[this.c + n];
    }

    private final void c(int n) {
        String string;
        try {
            string = PunishmentTableService[n];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            string = "Unkown internal scanner error";
        }
        throw new Error(string);
    }

    public LiteBansModule_55 e() {
        int n = this.e;
        char[] cArray = this.CommandThrottleService;
        char[] cArray2 = PunishmentService;
        int[] nArray = LiteBansModule_241;
        int[] nArray2 = LiteBansModule_242.n;
        int[] nArray3 = LiteBansModule_403;
        block51: while (true) {
            int n2;
            int n3;
            int n4 = this.DatabaseMonitorService;
            this.D += n4 - this.c;
            int n5 = -1;
            this.GnuSparseMapHandler = this.c = n4;
            int n6 = this.c;
            this.B = ServerSyncService[this.i];
            while (true) {
                if (n6 < n) {
                    n3 = cArray[n6++];
                } else {
                    if (this.Utf8Handler_2) {
                        n3 = -1;
                        break;
                    }
                    this.GnuSparseMapHandler = n6;
                    this.DatabaseMonitorService = n4;
                    n2 = this.AsyncBackgroundTask_5();
                    n6 = this.GnuSparseMapHandler;
                    n4 = this.DatabaseMonitorService;
                    cArray = this.CommandThrottleService;
                    n = this.e;
                    if (n2 != 0) {
                        n3 = -1;
                        break;
                    }
                    n3 = cArray[n6++];
                }
                n2 = nArray[nArray2[this.B] + cArray2[n3]];
                if (n2 == -1) break;
                this.B = n2;
                int n7 = nArray3[this.B];
                if ((n7 & 1) != 1) continue;
                n5 = this.B;
                n4 = n6;
                if ((n7 & 8) == 8) break;
            }
            this.DatabaseMonitorService = n4;
            switch (n5 < 0 ? n5 : g[n5]) {
                case 11: {
                    this.m.append(this.LiteBansModule_31());
                }
                case 25: {
                    continue block51;
                }
                case 4: {
                    this.m.delete(0, this.m.length());
                    this.LiteBansModule_31(2);
                }
                case 26: {
                    continue block51;
                }
                case 16: {
                    this.m.append('\LiteBansModule_31');
                }
                case 27: {
                    continue block51;
                }
                case 6: {
                    return new LiteBansModule_55(2, null);
                }
                case 28: {
                    continue block51;
                }
                case 23: {
                    Boolean flag = Boolean.valueOf(this.LiteBansModule_31());
                    return new LiteBansModule_55(0, flag);
                }
                case 29: {
                    continue block51;
                }
                case 22: {
                    return new LiteBansModule_55(0, null);
                }
                case 30: {
                    continue block51;
                }
                case 13: {
                    this.LiteBansModule_31(0);
                    return new LiteBansModule_55(0, this.m.toString());
                }
                case 31: {
                    continue block51;
                }
                case 12: {
                    this.m.append('\\');
                }
                case 32: {
                    continue block51;
                }
                case 21: {
                    Double d10 = Double.valueOf(this.LiteBansModule_31());
                    return new LiteBansModule_55(0, d10);
                }
                case 33: {
                    continue block51;
                }
                case 1: {
                    throw new UnexpectedTokenException(this.D, 0, new Character(this.plugin(0)));
                }
                case 34: {
                    continue block51;
                }
                case 8: {
                    return new LiteBansModule_55(4, null);
                }
                case 35: {
                    continue block51;
                }
                case 19: {
                    this.m.append('\r');
                }
                case 36: {
                    continue block51;
                }
                case 15: {
                    this.m.append('/');
                }
                case 37: {
                    continue block51;
                }
                case 10: {
                    return new LiteBansModule_55(6, null);
                }
                case 38: {
                    continue block51;
                }
                case 14: {
                    this.m.append('\"');
                }
                case 39: {
                    continue block51;
                }
                case 5: {
                    return new LiteBansModule_55(1, null);
                }
                case 40: {
                    continue block51;
                }
                case 17: {
                    this.m.append('\LiteBansModule_195');
                }
                case 41: {
                    continue block51;
                }
                case 24: {
                    try {
                        n2 = Integer.parseInt(this.LiteBansModule_31().substring(2), 16);
                        this.m.append((char)n2);
                    }
                    catch (Exception exception) {
                        throw new UnexpectedTokenException(this.D, 2, exception);
                    }
                }
                case 42: {
                    continue block51;
                }
                case 20: {
                    this.m.append('\AsyncBackgroundTask_22');
                }
                case 43: {
                    continue block51;
                }
                case 7: {
                    return new LiteBansModule_55(3, null);
                }
                case 44: {
                    continue block51;
                }
                case 2: {
                    Long l3 = Long.valueOf(this.LiteBansModule_31());
                    return new LiteBansModule_55(0, l3);
                }
                case 45: {
                    continue block51;
                }
                case 18: {
                    this.m.append('\n');
                }
                case 46: {
                    continue block51;
                }
                case 9: {
                    return new LiteBansModule_55(5, null);
                }
                case 47: {
                    continue block51;
                }
                case 3: 
                case 48: {
                    continue block51;
                }
            }
            if (n3 == -1 && this.c == this.GnuSparseMapHandler) {
                this.Utf8Handler_2 = true;
                return null;
            }
            this.c(1);
        }
    }

    static {
        AsyncBackgroundTask_21 = "\u0002\u0000\u0001\AsyncBackgroundTask_22\u0003\u0001\u0001\AsyncBackgroundTask_22\u0003\u0001\u0006\AsyncBackgroundTask_22\u0002\u0001\u0001\AsyncBackgroundTask_22\u0005\u0000\LiteBansModule_31\AsyncBackgroundTask_22\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\AsyncBackgroundTask_22\u0002\u0000\u0001\AsyncBackgroundTask_22";
        F = 2;
        BroadcastService = 1;
        BaseCoreGenericHandler = 0;
        HoverTextFormatter = "\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u0087\u00006\u0000\u00a2\u0000\u00bd\u0000\u00d8\u00006\u00006\u00006\u00006\u00006\u00006\u0000\u00f3\u0000\u010e\u00006\u0000\u0129\u0000\u0144\u0000\u015f\u0000\u017a\u0000\u0195\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000\u01b0\u0000\u01cb\u0000\u01e6\u0000\u01e6\u0000\u0201\u0000\u021c\u0000\u0237\u0000\u0252\u00006\u00006\u0000\u026d\u0000\u0288\u00006";
        LiteBansModule_435 = "\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\LiteBansModule_31\u0001\AsyncBackgroundTask_22\u0001\n\u0001\u000b\u0001\LiteBansModule_195\u0001\r\u0005\u0000\u0001\LiteBansModule_195\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018";
        q = "\AsyncBackgroundTask_22\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\AsyncBackgroundTask_22\LiteBansModule_31\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\LiteBansModule_31\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\LiteBansModule_195\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016\uff82\u0000";
        AsyncBackgroundTask_5 = 2;
        BanHandler_2 = 0;
        LiteBansModule_195 = 16384;
        AsyncBackgroundTask_22 = -1;
        ServerSyncService = new int[]{0, 0, 1, 1};
        PunishmentService = LiteBansModule_242.BaseCoreGenericHandler("\AsyncBackgroundTask_22\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\AsyncBackgroundTask_22\LiteBansModule_31\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\LiteBansModule_31\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\LiteBansModule_195\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016\uff82\u0000");
        g = LiteBansModule_242.BaseCoreGenericHandler();
        n = LiteBansModule_242.g();
        LiteBansModule_241 = new int[]{2, 2, 3, 4, 2, 2, 2, 5, 2, 6, 2, 2, 7, 8, 2, 9, 2, 2, 2, 2, 2, 10, 11, 12, 13, 14, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 18, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, 19, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, 24, 25, 26, 27, 28, 29, 30, 31, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, 35, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, 39, -1, 39, -1, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, 42, -1, 42, -1, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, 43, -1, 43, -1, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, 44, -1, 44, -1, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1};
        PunishmentTableService = new String[]{"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
        LiteBansModule_403 = LiteBansModule_242.LiteBansModule_195();
    }
}
}
}
