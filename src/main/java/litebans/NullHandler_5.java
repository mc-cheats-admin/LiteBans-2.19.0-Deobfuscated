package litebans;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.Map;
public class NullHandler_5 {
    public static final Object BaseCoreGenericHandler(Reader reader) {
        try {
            LiteBansModule_314 ip_02 = new LiteBansModule_314();
            return ip_02.LiteBansModule_31(reader);
        }
        catch (Exception exception) {
            return null;
}

    public static final Object BaseCoreGenericHandler(String string) {
        StringReader stringReader = new StringReader(string);
        return NullHandler_5.BaseCoreGenericHandler(stringReader);
    }

    public static final String BaseCoreGenericHandler(Object object) {
        if (object == null) {
            return "null";
        }
        if (object instanceof String) {
            return "\"" + NullHandler_5.LiteBansModule_31((String)object) + "\"";
        }
        if (object instanceof Double) {
            if (((Double)object).isInfinite() || ((Double)object).isNaN()) {
                return "null";
            }
            return object.toString();
        }
        if (object instanceof Float) {
            if (((Float)object).isInfinite() || ((Float)object).isNaN()) {
                return "null";
            }
            return object.toString();
        }
        if (object instanceof Number) {
            return object.toString();
        }
        if (object instanceof Boolean) {
            return object.toString();
        }
        if (object instanceof LiteBansModule_44) {
            return ((LiteBansModule_44)object).BaseCoreGenericHandler();
        }
        if (object instanceof Map) {
            return NullHandler_3.BaseCoreGenericHandler((Map)object);
        }
        if (object instanceof List) {
            return NullHandler_7.BaseCoreGenericHandler((List)object);
        }
        return object.toString();
    }

    public static final String LiteBansModule_31(String string) {
        if (string == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        NullHandler_5.BaseCoreGenericHandler(string, stringBuffer);
        return stringBuffer.toString();
    }

    static final void BaseCoreGenericHandler(String string, StringBuffer stringBuffer) {
for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            switch (c) {
                case '\"': {
                    stringBuffer.append("\\\"");
                    continue;
                }
                case '\\': {
                    stringBuffer.append("\\\\");
                    continue;
                }
                case '\LiteBansModule_31': {
                    stringBuffer.append("\\LiteBansModule_31");
                    continue;
                }
                case '\LiteBansModule_194': {
                    stringBuffer.append("\\LiteBansModule_194");
                    continue;
                }
                case '\n': {
                    stringBuffer.append("\\n");
                    continue;
                }
                case '\r': {
                    stringBuffer.append("\\r");
                    continue;
                }
                case '\AsyncBackgroundTask_22': {
                    stringBuffer.append("\\AsyncBackgroundTask_22");
                    continue;
                }
                case '/': {
                    stringBuffer.append("\\/");
                    continue;
                }
                default: {
                    if (c >= '\u0000' && c <= '\u001f' || c >= '\u007f' && c <= '\u009f' || c >= '\u2000' && c <= '\u20ff') {
                        String string2 = Integer.toHexString(c);
                        stringBuffer.append("\\ServerSyncService");
                        for (int i10 = 0; i10 < 4 - string2.length(); ++i10) {
                            stringBuffer.append('0');
                        }
                        stringBuffer.append(string2.toUpperCase());
                        continue;
                    }
                    stringBuffer.append(c);
}

