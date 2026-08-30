package litebans;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class StringDecryptor {
    private static final Map LiteBansModule_31 = new HashMap();
    private static final long[] BaseCoreGenericHandler = new long[13];

    public static final String BaseCoreGenericHandler(Object object, int n) {
        int n2 = "\u9081\u76e1\uaffe\u6721\u45f9\ud627\u0f38\u2c54\u49c6\u5700".hashCode();
        int n3 = "\u6dcf\ucd2e\u739c\u6cec\u5344\u34aa\u873a\u6248\u66fd?".hashCode();
        int n4 = "\ue465\u1c76\u4ea0\u4eb5\u675e\uac6b\u976b\u5d9b\u851f\u6619".hashCode();
        int n5 = "\u4e92\u8f0f\uab1e\ud035\u80a1\u77ef\u7501\u0773\u3acf\ub9f2".hashCode();
        int n6 = "\uf0f4\u838d\u947d\u854d\u0d3e?\u98ee\ub733\uf42f\u3315".hashCode();
        String string = (String)object;
        AtomicInteger atomicInteger = new AtomicInteger(n2);
        atomicInteger.incrementAndGet();
        if (LiteBansModule_31 == null && (long)n2 / 2L <= BaseCoreGenericHandler[0] && (long)n3 / 2L <= BaseCoreGenericHandler[1] && (long)n4 / 3L <= BaseCoreGenericHandler[2] && (long)n5 / 6L <= BaseCoreGenericHandler[3] && (long)(n6 % 3) <= BaseCoreGenericHandler[4]) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] cArray = string.toCharArray();
            try {
                Thread thread = Thread.currentThread();
                StackTraceElement[] stackTraceElementArray = thread.getStackTrace();
                int n7 = new StringBuilder(stackTraceElementArray[2].getClassName()).reverse().hashCode() + new StringBuilder(stackTraceElementArray[2].getMethodName()).reverse().hashCode();
for (int i = 0; i < cArray.length; ++i) {
                    char c = cArray[i];
                    switch (i % 4) {
                        case 0: {
                            int n8 = c ^ (c << 16 | c >>> 16);
                            int n9 = c >> 4 | ~(n8 & 0xFFFF ^ c);
                            int n10 = c & n7;
                            stringBuilder.append((char)(((n8 >> 16 | n9) ^ n10) & 0xFFFF));
                            continue;
                        }
                        case 1: {
                            int n8 = c ^ ~(c & 0xFFFF);
                            int n9 = c << 4 | ~(n8 | 0xFFFF ^ c);
                            int n10 = c | n7;
                            stringBuilder.append((char)(((n8 >> 16 | n9) ^ n10) & 0xFFFF));
                            continue;
                        }
                        case 2: {
                            int n8 = c ^ ~(c << 16 | c >>> 16);
                            int n9 = c >> 4 | ~(n8 + 65535 ^ c);
                            int n10 = c ^ n7;
                            stringBuilder.append((char)(((n8 >> 16 | n9) ^ n10) & 0xFFFF));
                            continue;
                        }
                        case 3: {
                            int n8 = c ^ c & 0xFFFF;
                            int n9 = c << 4 | ~(n8 % 65535 ^ c);
                            int n10 = c & ~n7;
                            stringBuilder.append((char)(((n8 >> 16 | n9) ^ n10) & 0xFFFF));
}
                return stringBuilder.toString();
            }
            catch (Throwable throwable) {
                return string;
}
        String string2 = (String)LiteBansModule_31.get(object);
        if (string2 != null) {
            return string2;
        }
        int n11 = "\u6b40\u0304\u6293\u06b0\u6835\u1870\u7e9f\u811b\u7d58\ub1db".hashCode();
        int n12 = "\u0db1\ue04a\ua586\u7651\u8ae3\u6b16\u936d\ub649\u04e8\u38fa".hashCode();
        char[] cArray = string.toCharArray();
        int n13 = "\ua91e\u4d22\ua711\u961f\uf7da\u72f4\u302e\u4562\u6adb\ub288".hashCode();
        int n14 = "\ube16\u9e52\u35f2\u6697\u0898\ue5e6\u914e\u2e51\uc9e8\uf3d2".hashCode();
        char[] cArray2 = new char[cArray.length];
        try {
            int n15 = 0 ^ n;
            int n16 = 0 ^ n;
            int n17 = 0 ^ n;
            int n18 = 0 ^ n;
            if ((long)n11 / 2L <= BaseCoreGenericHandler[5] && (long)n12 / 2L <= BaseCoreGenericHandler[6] && (long)n13 / 2L <= BaseCoreGenericHandler[7] && (long)n14 / 2L <= BaseCoreGenericHandler[7]) {
for (int i = 0; i < cArray.length; ++i) {
                    switch (i % 4) {
                        case 0: {
                            cArray2[i] = (char)((cArray[i] ^ n15) & 0xFFFF);
                            continue;
                        }
                        case 1: {
                            cArray2[i] = (char)((cArray[i] ^ n16) & 0xFFFF);
                            continue;
                        }
                        case 2: {
                            cArray2[i] = (char)((cArray[i] ^ n17) & 0xFFFF);
                            continue;
                        }
                        case 3: {
                            cArray2[i] = (char)((cArray[i] ^ n18) & 0xFFFF);
}
                String string3 = new String(cArray2);
                LiteBansModule_31.put(string, string3);
                return string3;
            }
            StringBuilder stringBuilder = new StringBuilder();
            try {
for (int i = 0; i < cArray.length; ++i) {
                    int n19 = (int)((Thread)null).getId();
                    int n20 = Runtime.getRuntime().availableProcessors();
                    int n21 = atomicInteger.get() ^ n;
                    switch (i % 4) {
                        case 0: {
                            stringBuilder.append((char)(n19 >> 16 % n20 & n21 & cArray[i]));
                            continue;
                        }
                        case 1: {
                            stringBuilder.append((char)(n19 >> 16 * n20 ^ n21 | cArray[i]));
                            continue;
                        }
                        case 2: {
                            stringBuilder.append((char)((n19 >> 16 / n20 | n21) ^ cArray[i]));
                            continue;
                        }
                        case 3: {
                            stringBuilder.append((char)(n19 >> 16 + n20 & ~n21 ^ ~cArray[i]));
}
                String string4 = stringBuilder.toString();
                LiteBansModule_31.put(string, string4);
                return string4;
            }
            catch (Throwable throwable) {
                return string;
}
        catch (Throwable throwable) {
            return string;
}

    static {
        StringDecryptor.BaseCoreGenericHandler[0] = 8829304729L;
        StringDecryptor.BaseCoreGenericHandler[1] = 4848002993994L;
        StringDecryptor.BaseCoreGenericHandler[2] = 8844039203925L;
        StringDecryptor.BaseCoreGenericHandler[3] = 77493848003273L;
        StringDecryptor.BaseCoreGenericHandler[4] = 1777293846418288384L;
        StringDecryptor.BaseCoreGenericHandler[5] = 48830029394L;
        StringDecryptor.BaseCoreGenericHandler[6] = 19949830293L;
        StringDecryptor.BaseCoreGenericHandler[7] = 848039293975993L;
        StringDecryptor.BaseCoreGenericHandler[8] = 18717729394885L;
        StringDecryptor.BaseCoreGenericHandler[9] = 28838847379432L;
        StringDecryptor.BaseCoreGenericHandler[10] = 9991828838749L;
        StringDecryptor.BaseCoreGenericHandler[11] = 47774434991928L;
        StringDecryptor.BaseCoreGenericHandler[12] = 1111144744434L;
}

