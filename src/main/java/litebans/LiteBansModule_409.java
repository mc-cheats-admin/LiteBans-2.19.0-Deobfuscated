package litebans;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_409 {
    public static final LiteBansModule_114 LiteBansModule_194;
    private final int LiteBansModule_31;
    private final HashMap c = new HashMap();
    private final HashMap e = new HashMap();
    public static final int AsyncBackgroundTask_5;
    public static final int LiteBansModule_240;
    public static final long g;
    public LiteBansModule_409(long l3) {
        LiteBansModule_324 iX2 = new LiteBansModule_324(l3);
        this.LiteBansModule_31 = 8500 + iX2.LiteBansModule_31(4000);
        this.plugin(iX2);
    }

    public final int LiteBansModule_31() {
        return this.LiteBansModule_31;
    }

    public final HashMap BaseCoreGenericHandler() {
        return this.c;
    }

    public final String BaseCoreGenericHandler(long l3) {
        try {
            long l5 = l3 + (long)this.LiteBansModule_31;
            String string = String.valueOf(l5);
            string = this.plugin(string);
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();
            boolean flag = true;
            String string2 = string;
            int n = string2.length();
            for (int i = 0; i < n; ++i) {
                char c = string2.charAt(i);
                stringBuilder2.append(c);
                if (stringBuilder2.length() < 3) continue;
                if (!flag) {
                    if (StringUtilities.c((CharSequence)stringBuilder2, "000", false, 2, null)) {
                        stringBuilder.append("m");
                    } else if (StringUtilities.c((CharSequence)stringBuilder2, "00", false, 2, null)) {
                        stringBuilder.append("CommandThrottleService");
                    } else if (StringUtilities.c((CharSequence)stringBuilder2, "0", false, 2, null)) {
                        stringBuilder.append("z");
                    }
                }
                stringBuilder.append(this.plugin(stringBuilder2));
                stringBuilder2.setLength(0);
                flag = false;
            }
            if (((CharSequence)stringBuilder2).length() > 0) {
                throw new LiteBansException_7(null, 1, null);
            }
            return stringBuilder.toString().toUpperCase(Locale.ROOT);
        }
        catch (LiteBansException_7 fz_02) {
            return "error";
        }
    }

    private final String BaseCoreGenericHandler(String string) {
        String string2;
        switch (string.length() % 3) {
            case 1: {
                string2 = "00" + string;
                break;
            }
            case 2: {
                string2 = '0' + string;
                break;
            }
            default: {
                string2 = string;
            }
        }
        return string2;
    }

    private final String BaseCoreGenericHandler(int n, int n2) {
        String string;
        switch (n) {
            case 0: {
                string = String.valueOf(n2);
                break;
            }
            case 1: {
                string = "" + '0' + n2;
                break;
            }
            case 2: {
                string = "00" + n2;
                break;
            }
            case 3: {
                string = "000";
                break;
            }
            default: {
                throw new LiteBansException_7(null, 1, null);
            }
        }
        return string;
    }

    public final long LiteBansModule_31(@NotNull String string) {
        try {
            String string2 = string.toLowerCase(Locale.ROOT);
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();
            int n = 0;
            int n2 = string2.length();
            for (int i = 0; i < n2; ++i) {
                char c = string2.charAt(i);
                switch (c) {
                    case 'm': {
                        n = 3;
                        break;
                    }
                    case 'CommandThrottleService': {
                        n = 2;
                        break;
                    }
                    case 'z': {
                        n = 1;
                        break;
                    }
                    default: {
                        stringBuilder2.append(c);
                    }
                }
                if (stringBuilder2.length() < 3) continue;
                stringBuilder.append(this.plugin(stringBuilder2, n));
                stringBuilder2.setLength(0);
                n = 0;
            }
            if (((CharSequence)stringBuilder2).length() > 0) {
                throw new LiteBansException_7(null, 1, null);
            }
            return Long.parseLong(stringBuilder.toString()) - (long)this.LiteBansModule_31;
        }
        catch (LiteBansException_7 fz_02) {
            return -1L;
        }
    }

    private final void BaseCoreGenericHandler(LiteBansModule_324 iX2) {
        for (int i = 0; i < 1000; ++i) {
            String string = this.LiteBansModule_31(iX2);
            while (string.length() != 3 || ((Map)this.e).containsKey(string)) {
                string = this.LiteBansModule_31(iX2);
            }
            Integer n = i;
            ((Map)this.c).put(n, string);
            n = i;
            ((Map)this.e).put(string, n);
        }
    }

    private final String LiteBansModule_31(LiteBansModule_324 iX2) {
        return Long.toString(iX2.LiteBansModule_31() & 0xFFFL, LiteBansModule_338.BaseCoreGenericHandler(16));
    }

    private final String BaseCoreGenericHandler(StringBuilder stringBuilder) {
        String string = (String)this.c.get(Integer.parseInt(stringBuilder.toString()));
        if (string == null) {
            throw new LiteBansException_7("No shuffle input for " + stringBuilder);
        }
        return string;
    }

    private final String BaseCoreGenericHandler(StringBuilder stringBuilder, int n) {
        Integer n2 = (Integer)this.e.get(stringBuilder.toString());
        if (n2 == null) {
            throw new LiteBansException_7("No shuffle output for " + stringBuilder);
        }
        int n3 = n2;
        return this.plugin(n, n3);
    }

    static {
        g = -1L;
        LiteBansModule_240 = 6;
        AsyncBackgroundTask_5 = 3;
        LiteBansModule_409.c();
        LiteBansModule_194 = new LiteBansModule_114(null);
    }

    private static final void c() {
        BaseCoreGenericHandler = new String[]{"000", "m", "00", "CommandThrottleService", "0", "z", "error", "00", "00", "000", "No shuffle input for ", "No shuffle output for "};
    }
}

