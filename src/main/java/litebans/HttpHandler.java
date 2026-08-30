package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class HttpHandler
extends LiteBansModule_434 {
    private static final Pattern i;
    private String Utf8Handler_2;
        @Deprecated
    public static LiteBansModule_434[] BaseCoreGenericHandler(String string) {
        return HttpHandler.BaseCoreGenericHandler(string, LiteBansType.LiteBansModule_435);
    }

    @Deprecated
    public static LiteBansModule_434[] BaseCoreGenericHandler(String string, LiteBansType gq2) {
        ArrayList arrayList = new ArrayList();
        HttpHandler.BaseCoreGenericHandler(string, gq2, arrayList::add);
        return arrayList.toArray(new LiteBansModule_434[0]);
    }

    private static final void BaseCoreGenericHandler(String string, LiteBansType gq2, Consumer consumer) {
        StringBuilder stringBuilder = new StringBuilder();
        Object targetObj = new HttpHandler();
        Matcher matcher = i.matcher(string);
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == '\u00a7') {
                LiteBansType gq3;
                if (++i >= string.length()) break;
                c = string.charAt(i);
                if (c >= 'A' && c <= 'NullHandler_8') {
                    c = (char)(c + 32);
                }
                if (c == 'LiteBansModule_435' && i + 12 < string.length()) {
                    contextObj = new StringBuilder("#");
                    for (int i10 = 0; i10 < 6; ++i10) {
                        ((StringBuilder)contextObj).append(string.charAt(i + 2 + i10 * 2));
                    }
                    try {
                        gq3 = LiteBansType.BaseCoreGenericHandler(((StringBuilder)contextObj).toString());
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        gq3 = null;
                    }
                    i += 12;
                } else {
                    gq3 = LiteBansType.BaseCoreGenericHandler(c);
                }
                if (gq3 == null) continue;
                if (stringBuilder.length() > 0) {
                    contextObj = targetObj;
                    targetObj = new HttpHandler((HttpHandler)contextObj);
                    ((HttpHandler)contextObj).c(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                    consumer.accept(contextObj);
                }
                if (gq3 == LiteBansType.AsyncBackgroundTask_22) {
                    ((LiteBansModule_434)targetObj).AsyncBackgroundTask_5(true);
                    continue;
                }
                if (gq3 == LiteBansType.Utf8Handler_2) {
                    ((LiteBansModule_434)targetObj).c(true);
                    continue;
                }
                if (gq3 == LiteBansType.A) {
                    ((LiteBansModule_434)targetObj).LiteBansModule_31(true);
                    continue;
                }
                if (gq3 == LiteBansType.c) {
                    ((LiteBansModule_434)targetObj).e(true);
                    continue;
                }
                if (gq3 == LiteBansType.LiteBansModule_31) {
                    ((LiteBansModule_434)targetObj).BaseCoreGenericHandler((Boolean)true);
                    continue;
                }
                if (gq3 == LiteBansType.ServerSyncService) {
                    gq3 = gq2;
                }
                targetObj = new HttpHandler();
                ((LiteBansModule_434)targetObj).BaseCoreGenericHandler(gq3);
                ((LiteBansModule_434)targetObj).BaseCoreGenericHandler(true);
                continue;
            }
            int n = HttpHandler.BaseCoreGenericHandler(string, i);
            if (n == -1) {
                n = string.length();
            }
            if (matcher.region(i, n).find()) {
                if (stringBuilder.length() > 0) {
                    contextObj = targetObj;
                    targetObj = new HttpHandler((HttpHandler)contextObj);
                    ((HttpHandler)contextObj).c(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                    consumer.accept(contextObj);
                }
                contextObj = targetObj;
                targetObj = new HttpHandler((HttpHandler)contextObj);
                String string2 = BlackHandler.BaseCoreGenericHandler((CharSequence)string.substring(i, n));
                ((HttpHandler)targetObj).c(string2);
                ((LiteBansModule_434)targetObj).BaseCoreGenericHandler(new LiteBansModule_379(OpenUrlHandler.e, string2.startsWith("http") ? string2 : "http://" + string2));
                consumer.accept(targetObj);
                i += n - i - 1;
                targetObj = contextObj;
                continue;
            }
            stringBuilder.append(c);
        }
        ((HttpHandler)targetObj).c(stringBuilder.toString());
        consumer.accept(targetObj);
    }

    private static final int BaseCoreGenericHandler(String string, int n) {
        for (int i = n; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c != ' ' && !Character.isISOControl(c)) continue;
            return i;
        }
        return -1;
    }

    public HttpHandler() {
        this.Utf8Handler_2 = "";
    }

    public HttpHandler(HttpHandler w_02) {
        super(w_02);
        this.c(w_02.LiteBansModule_31());
    }

    public HttpHandler(LiteBansModule_434[] v_0Array) {
        this();
        if (v_0Array.length == 0) {
            return;
        }
        this.plugin(new ArrayList<LiteBansModule_434>(Arrays.asList(v_0Array)));
    }

    public HttpHandler c() {
        return new HttpHandler(this);
    }

    @Override
    protected void BaseCoreGenericHandler(StringBuilder stringBuilder) {
        this.LiteBansModule_31(stringBuilder);
        stringBuilder.append(this.Utf8Handler_2);
        super.BaseCoreGenericHandler(stringBuilder);
    }

    @Override
    public String toString() {
        return "TextComponent{text=" + this.Utf8Handler_2 + ", " + super.toString() + '}';
    }

    public String LiteBansModule_31() {
        return this.Utf8Handler_2;
    }

    public void c(String string) {
        this.Utf8Handler_2 = string;
    }

    public HttpHandler(String string) {
        this.Utf8Handler_2 = string;
    }

    @Override
    public boolean equals(Object targetObj) {
        if (targetObj == this) {
            return true;
        }
        if (!(targetObj instanceof HttpHandler)) {
            return false;
        }
        HttpHandler w_02 = (HttpHandler)targetObj;
        if (!w_02.BaseCoreGenericHandler((Object)this)) {
            return false;
        }
        if (!super.equals(targetObj)) {
            return false;
        }
        String string = this.LiteBansModule_31();
        String string2 = w_02.LiteBansModule_31();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    @Override
    protected boolean BaseCoreGenericHandler(Object targetObj) {
        return targetObj instanceof HttpHandler;
    }

    @Override
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        String string = this.LiteBansModule_31();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    @Override
    public LiteBansModule_434 PunishmentTableService() {
        return this.c();
    }

    static {
        HttpHandler.BaseCoreGenericHandler();
        i = Pattern.compile(GnuSparseMapHandler[6]);
    }

    private static final void BaseCoreGenericHandler() {
        GnuSparseMapHandler = new String[]{"#", "http", "http://", "", "TextComponent{text=", ", ", "^(?:(https?)://)?([-\\w_\\.]{2,}\\.[BaseCoreGenericHandler-z]{2,4})(/[BaseCoreGenericHandler-z0-9]*)?$"};
    }
}
}
}
}
