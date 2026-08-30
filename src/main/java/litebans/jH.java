package litebans;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.Map;
import litebans.bD;
import litebans.gr_0;
import litebans.ip_0;
import litebans.ks_0;

public static class jH {
    public static final Object a(Reader reader) {
        try {
            ip_0 ip_02 = new ip_0();
            return ip_02.b(reader);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static final Object a(String string) {
        StringReader stringReader = new StringReader(string);
        return jH.a(stringReader);
    }

    public static final String a(Object object) {
        if (object == null) {
            return "null";
        }
        if (object instanceof String) {
            return "\"" + jH.b((String)object) + "\"";
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
        if (object instanceof bD) {
            return ((bD)object).a();
        }
        if (object instanceof Map) {
            return gr_0.a((Map)object);
        }
        if (object instanceof List) {
            return ks_0.a((List)object);
        }
        return object.toString();
    }

    public static final String b(String string) {
        if (string == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        jH.a(string, stringBuffer);
        return stringBuffer.toString();
    }

    static final void a(String string, StringBuffer stringBuffer) {
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
                case '\b': {
                    stringBuffer.append("\\b");
                    continue block10;
                }
                case '\f': {
                    stringBuffer.append("\\f");
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
                case '\t': {
                    stringBuffer.append("\\t");
                    continue block10;
                }
                case '/': {
                    stringBuffer.append("\\/");
                    continue block10;
                }
                default: {
                    if (c >= '\u0000' && c <= '\u001f' || c >= '\u007f' && c <= '\u009f' || c >= '\u2000' && c <= '\u20ff') {
                        String string2 = Integer.toHexString(c);
                        stringBuffer.append("\\u");
                        for (int i10 = 0; i10 < 4 - string2.length(); ++i10) {
                            stringBuffer.append('0');
                        }
                        stringBuffer.append(string2.toUpperCase());
                        continue block10;
                    }
                    stringBuffer.append(c);
                }
            }
        }
    }
}

