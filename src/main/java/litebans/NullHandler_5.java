package litebans;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.Map;
public class NullHandler_5 {
    public static final Object BaseCoreGenericHandler(Reader reader) {
        try {
            LiteBansModule_315 ip_02 = new LiteBansModule_315();
            return ip_02.LiteBansModule_31(reader);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static final Object BaseCoreGenericHandler(String string) {
        StringReader stringReader = new StringReader(string);
        return NullHandler_5.BaseCoreGenericHandler(stringReader);
    }

    public static final String BaseCoreGenericHandler(Object targetObj) {
        if (targetObj == null) {
            return "null";
        }
        if (targetObj instanceof String) {
            return "\"" + NullHandler_5.LiteBansModule_31((String)targetObj) + "\"";
        }
        if (targetObj instanceof Double) {
            if (((Double)targetObj).isInfinite() || ((Double)targetObj).isNaN()) {
                return "null";
            }
            return targetObj.toString();
        }
        if (targetObj instanceof Float) {
            if (((Float)targetObj).isInfinite() || ((Float)targetObj).isNaN()) {
                return "null";
            }
            return targetObj.toString();
        }
        if (targetObj instanceof Number) {
            return targetObj.toString();
        }
        if (targetObj instanceof Boolean) {
            return targetObj.toString();
        }
        if (targetObj instanceof LiteBansModule_44) {
            return ((LiteBansModule_44)targetObj).BaseCoreGenericHandler();
        }
        if (targetObj instanceof Map) {
            return NullHandler_3.BaseCoreGenericHandler((Map)targetObj);
        }
        if (targetObj instanceof List) {
            return NullHandler_7.BaseCoreGenericHandler((List)targetObj);
        }
        return targetObj.toString();
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
        block10: for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            switch (c) {
                case '\"': {
                    stringBuffer.append("\\\"");
                    continue block10;
                }
                case '\\': {
                    stringBuffer.append("\\\\");
                    continue block10;
                }
                case '\LiteBansModule_31': {
                    stringBuffer.append("\\LiteBansModule_31");
                    continue block10;
                }
                case '\LiteBansModule_195': {
                    stringBuffer.append("\\LiteBansModule_195");
                    continue block10;
                }
                case '\n': {
                    stringBuffer.append("\\n");
                    continue block10;
                }
                case '\r': {
                    stringBuffer.append("\\r");
                    continue block10;
                }
                case '\AsyncBackgroundTask_22': {
                    stringBuffer.append("\\AsyncBackgroundTask_22");
                    continue block10;
                }
                case '/': {
                    stringBuffer.append("\\/");
                    continue block10;
                }
                default: {
                    if (c >= '\u0000' && c <= '\u001f' || c >= '\u007f' && c <= '\u009f' || c >= '\u2000' && c <= '\u20ff') {
                        String string2 = Integer.toHexString(c);
                        stringBuffer.append("\\ServerSyncService");
                        for (int i10 = 0; i10 < 4 - string2.length(); ++i10) {
                            stringBuffer.append('0');
                        }
                        stringBuffer.append(string2.toUpperCase());
                        continue block10;
                    }
                    stringBuffer.append(c);
                }
            }
