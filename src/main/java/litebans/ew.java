package litebans;

import java.util.Arrays;
import litebans.dr_0;
import litebans.hl;

public static class ew {
    private static /* synthetic */ String[] a;

    private ew() {
    }

    public static void a(Object object) {
        if (object == null) {
            ew.a();
        }
    }

    public static void b(Object object, String string) {
        if (object == null) {
            ew.d(string);
        }
    }

    public static void a() {
        throw (NullPointerException)ew.a(new NullPointerException());
    }

    public static void d(String string) {
        throw (NullPointerException)ew.a(new NullPointerException(string));
    }

    public static void a(String string) {
        throw (dr_0)ew.a(new dr_0(string));
    }

    public static void e(String string) {
        ew.a(a[0] + string + a[1]);
    }

    public static void c(Object object, String string) {
        if (object == null) {
            throw (NullPointerException)ew.a(new NullPointerException(string + a[3]));
        }
    }

    public static void a(Object object, String string) {
        if (object == null) {
            ew.b(string);
        }
    }

    private static final void b(String string) {
        throw (NullPointerException)ew.a(new NullPointerException(ew.c(string)));
    }

    private static final String c(String string) {
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        String string2 = ew.class.getName();
        int n = 0;
        while (!stackTraceElementArray[n].getClassName().equals(string2)) {
            ++n;
        }
        while (stackTraceElementArray[n].getClassName().equals(string2)) {
            ++n;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[n];
        String string3 = stackTraceElement.getClassName();
        String string4 = stackTraceElement.getMethodName();
        return a[8] + string3 + a[9] + string4 + a[10] + string;
    }

    public static int a(long l3, long l5) {
        return l3 < l5 ? -1 : (l3 == l5 ? 0 : 1);
    }

    public static int a(int n, int n2) {
        return n < n2 ? -1 : (n == n2 ? 0 : 1);
    }

    public static boolean a(Object object, Object object2) {
        return object == null ? object2 == null : object.equals(object2);
    }

    private static final Throwable a(Throwable throwable) {
        return ew.a(throwable, ew.class.getName());
    }

    static Throwable a(Throwable throwable, String string) {
        StackTraceElement[] stackTraceElementArray = throwable.getStackTrace();
        int n = stackTraceElementArray.length;
        int n2 = -1;
        for (int i = 0; i < n; ++i) {
            if (!string.equals(stackTraceElementArray[i].getClassName())) continue;
            n2 = i;
        }
        StackTraceElement[] stackTraceElementArray2 = Arrays.copyOfRange(stackTraceElementArray, n2 + 1, n);
        throwable.setStackTrace(stackTraceElementArray2);
        return throwable;
    }

    private static final void b() {
        a = new String[]{hl.a("\uff54\uff59\uff4c\uff5d\uff51\uff56\uff51\uff4c\uff18\uff48\uff4a\uff57\uff48\uff5d\uff4a\uff4c\uff41\uff18", -2034237640), hl.a("\u99b7\u99ff\u99f6\u99e4\u99b7\u99f9\u99f8\u99e3\u99b7\u99f5\u99f2\u99f2\u99f9\u99b7\u99fe\u99f9\u99fe\u99e3\u99fe\u99f6\u99fb\u99fe\u99ed\u99f2\u99f3", 1337039255), hl.a("\ue0ff\ue0b2\ue0aa\ue0ac\ue0ab\ue0ff\ue0b1\ue0b0\ue0ab\ue0ff\ue0bd\ue0ba\ue0ff\ue0b1\ue0aa\ue0b3\ue0b3", 509665503), hl.a("\u52a1\u52ec\u52f4\u52f2\u52f5\u52a1\u52ef\u52ee\u52f5\u52a1\u52e3\u52e4\u52a1\u52ef\u52f4\u52ed\u52ed", 736383617), hl.a("\u3b03\u3b2b\u3b3a\u3b26\u3b21\u3b2a\u3b6e\u3b3d\u3b3e\u3b2b\u3b2d\u3b27\u3b28\u3b27\u3b2b\u3b2a\u3b6e\u3b2f\u3b3d\u3b6e\u3b20\u3b21\u3b20\u3b63\u3b20\u3b3b\u3b22\u3b22\u3b6e\u3b3c\u3b2b\u3b3a\u3b3b\u3b3c\u3b20\u3b2b\u3b2a\u3b6e\u3b20\u3b3b\u3b22\u3b22\u3b74\u3b6e", -1394656434), hl.a("\u5716", -1839704264), hl.a("\ucfd2\ucffd\ucff1\ucff8\ucff0\ucfb4\ucfe7\ucfe4\ucff1\ucff7\ucffd\ucff2\ucffd\ucff1\ucff0\ucfb4\ucff5\ucfe7\ucfb4\ucffa\ucffb\ucffa\ucfb9\ucffa\ucfe1\ucff8\ucff8\ucfb4\ucffd\ucfe7\ucfb4\ucffa\ucfe1\ucff8\ucff8\ucfae\ucfb4", 1700908948), hl.a("\ub6b8", -2134198634), hl.a("\u7e31\u7e00\u7e13\u7e00\u7e0c\u7e04\u7e15\u7e04\u7e13\u7e41\u7e12\u7e11\u7e04\u7e02\u7e08\u7e07\u7e08\u7e04\u7e05\u7e41\u7e00\u7e12\u7e41\u7e0f\u7e0e\u7e0f\u7e4c\u7e0f\u7e14\u7e0d\u7e0d\u7e41\u7e08\u7e12\u7e41\u7e0f\u7e14\u7e0d\u7e0d\u7e5b\u7e41\u7e0c\u7e04\u7e15\u7e09\u7e0e\u7e05\u7e41", 1711701601), hl.a("\u0472", -846527396), hl.a("\ucfb1\ucfbd\ucfed\ucffc\ucfef\ucffc\ucff0\ucff8\ucfe9\ucff8\ucfef\ucfbd", 2008469405), hl.a("\uf11f\uf123\uf122\uf138\uf16b\uf12d\uf13e\uf125\uf128\uf13f\uf122\uf124\uf125\uf16b\uf123\uf12a\uf138\uf16b\uf12a\uf16b\uf139\uf12e\uf122\uf12d\uf122\uf12e\uf12f\uf16b\uf13f\uf132\uf13b\uf12e\uf16b\uf13b\uf12a\uf139\uf12a\uf126\uf12e\uf13f\uf12e\uf139\uf16b\uf12a\uf125\uf12f\uf16b\uf13f\uf123\uf13e\uf138\uf16b\uf128\uf12a\uf125\uf16b\uf124\uf125\uf127\uf132\uf16b\uf129\uf12e\uf16b\uf122\uf125\uf127\uf122\uf125\uf12e\uf12f\uf16b\uf12a\uf13f\uf16b\uf128\uf124\uf126\uf13b\uf122\uf127\uf12a\uf13f\uf122\uf124\uf125\uf16b\uf13f\uf122\uf126\uf12e\uf167\uf16b\uf125\uf124\uf13f\uf16b\uf128\uf12a\uf127\uf127\uf12e\uf12f\uf16b\uf12f\uf122\uf139\uf12e\uf128\uf13f\uf127\uf132\uf165", -1179389621), hl.a("\u9d8d\u9da2\u9daf\u9dbd\u9dbd\u9dee", -1683448370), hl.a("\ua114\ua15d\ua147\ua114\ua15a\ua15b\ua140\ua114\ua152\ua15b\ua141\ua15a\ua150\ua11a\ua114\ua164\ua158\ua151\ua155\ua147\ua151\ua114\ua141\ua144\ua150\ua155\ua140\ua151\ua114\ua140\ua15c\ua151\ua114\ua17f\ua15b\ua140\ua158\ua15d\ua15a\ua114\ua146\ua141\ua15a\ua140\ua15d\ua159\ua151\ua114\ua140\ua15b\ua114\ua140\ua15c\ua151\ua114\ua158\ua155\ua140\ua151\ua147\ua140\ua114\ua142\ua151\ua146\ua147\ua15d\ua15b\ua15a", -1728204), hl.a("\u9d3b\u9d14\u9d19\u9d0b\u9d0b\u9d58", -262955656), hl.a("\u4a58\u4a11\u4a0b\u4a58\u4a16\u4a17\u4a0c\u4a58\u4a1e\u4a17\u4a0d\u4a16\u4a1c\u4a42\u4a58\u4a0c\u4a10\u4a11\u4a0b\u4a58\u4a1b\u4a17\u4a1c\u4a1d\u4a58\u4a0a\u4a1d\u4a09\u4a0d\u4a11\u4a0a\u4a1d\u4a0b\u4a58\u4a0c\u4a10\u4a1d\u4a58\u4a33\u4a17\u4a0c\u4a14\u4a11\u4a16\u4a58\u4a0a\u4a0d\u4a16\u4a0c\u4a11\u4a15\u4a1d\u4a58\u4a17\u4a1e\u4a58\u4a0e\u4a1d\u4a0a\u4a0b\u4a11\u4a17\u4a16\u4a58\u4a19\u4a0c\u4a58\u4a14\u4a1d\u4a19\u4a0b\u4a0c\u4a58", -383366536)};
    }

    static {
        ew.b();
    }
}

