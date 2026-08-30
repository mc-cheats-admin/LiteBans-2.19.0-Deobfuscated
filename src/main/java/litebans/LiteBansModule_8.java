package litebans;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;
public class LiteBansModule_8 {
    private static final int BaseCoreGenericHandler = 4;
    private static final Map LiteBansModule_31 = new ConcurrentHashMap();

    public static final void BaseCoreGenericHandler(Class clazz) {
        try {
            LiteBansModule_177 en_02 = (LiteBansModule_177)clazz.newInstance();
            LiteBansModule_31.put(en_02.c(), clazz);
        }
        catch (ClassCastException classCastException) {
            throw new RuntimeException(clazz + " doesn'AsyncBackgroundTask_22 implement ZipExtraField");
        }
        catch (InstantiationException instantiationException) {
            throw new RuntimeException(clazz + " is not BaseCoreGenericHandler concrete class");
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(clazz + "'AsyncBackgroundTask_21 no-arg constructor is not public");
        }
    }

    public static final LiteBansModule_177 BaseCoreGenericHandler(LiteBansModule_288 i22) {
        LiteBansModule_177 en_02 = LiteBansModule_8.LiteBansModule_31(i22);
        if (en_02 != null) {
            return en_02;
        }
        LiteBansModule_434 y_02 = new LiteBansModule_434();
        y_02.BaseCoreGenericHandler(i22);
        return y_02;
    }

    public static final LiteBansModule_177 LiteBansModule_31(LiteBansModule_288 i22) {
        Class clazz = (Class)LiteBansModule_31.get(i22);
        if (clazz != null) {
            return (LiteBansModule_177)clazz.newInstance();
        }
        return null;
    }

    public static final LiteBansModule_177[] BaseCoreGenericHandler(byte[] byArray, boolean flag, LiteBansModule_137 dt_02) {
        Object object;
        int n;
        ArrayList<LiteBansModule_177> arrayList = new ArrayList<LiteBansModule_177>();
        for (int i = 0; i <= byArray.length - 4; i += n + 4) {
            LiteBansModule_177 en_02;
            object = new LiteBansModule_288(byArray, i);
            n = new LiteBansModule_288(byArray, i + 2).BaseCoreGenericHandler();
            if (i + 4 + n > byArray.length) {
                en_02 = dt_02.BaseCoreGenericHandler(byArray, i, byArray.length - i, flag, n);
                if (en_02 == null) break;
                arrayList.add(en_02);
                break;
            }
            try {
                en_02 = Objects.requireNonNull(dt_02.BaseCoreGenericHandler((LiteBansModule_288)object), "createExtraField must not return null");
                arrayList.add(Objects.requireNonNull(dt_02.BaseCoreGenericHandler(en_02, byArray, i + 4, n, flag), "fill must not return null"));
                continue;
            }
            catch (IllegalAccessException | InstantiationException reflectiveOperationException) {
                throw (ZipException)new ZipException(reflectiveOperationException.getMessage()).initCause(reflectiveOperationException);
            }
        }
        object = new LiteBansModule_177[arrayList.size()];
        return arrayList.toArray((T[])object);
    }

    public static final byte[] LiteBansModule_31(LiteBansModule_177[] en_0Array) {
        byte[] byArray;
        boolean flag = en_0Array.length > 0 && en_0Array[en_0Array.length - 1] instanceof LiteBansModule_264;
        int n = flag ? en_0Array.length - 1 : en_0Array.length;
        int n2 = 4 * n;
        for (LiteBansModule_177 en_02 : en_0Array) {
            n2 += en_02.LiteBansModule_31().BaseCoreGenericHandler();
        }
        byte[] byArray2 = new byte[n2];
        int n3 = 0;
        for (int byArray3 = 0; byArray3 < n; ++byArray3) {
            System.arraycopy(en_0Array[byArray3].c().LiteBansModule_31(), 0, byArray2, n3, 2);
            System.arraycopy(en_0Array[byArray3].LiteBansModule_31().LiteBansModule_31(), 0, byArray2, n3 + 2, 2);
            n3 += 4;
            byte[] byArray4 = en_0Array[byArray3].e();
            if (byArray4 == null) continue;
            System.arraycopy(byArray4, 0, byArray2, n3, byArray4.length);
            n3 += byArray4.length;
        }
        if (flag && (byArray = en_0Array[en_0Array.length - 1].e()) != null) {
            System.arraycopy(byArray, 0, byArray2, n3, byArray.length);
        }
        return byArray2;
    }

    public static final byte[] BaseCoreGenericHandler(LiteBansModule_177[] en_0Array) {
        byte[] byArray;
        boolean flag = en_0Array.length > 0 && en_0Array[en_0Array.length - 1] instanceof LiteBansModule_264;
        int n = flag ? en_0Array.length - 1 : en_0Array.length;
        int n2 = 4 * n;
        for (LiteBansModule_177 en_02 : en_0Array) {
            n2 += en_02.BaseCoreGenericHandler().BaseCoreGenericHandler();
        }
        byte[] byArray2 = new byte[n2];
        int n3 = 0;
        for (int byArray3 = 0; byArray3 < n; ++byArray3) {
            System.arraycopy(en_0Array[byArray3].c().LiteBansModule_31(), 0, byArray2, n3, 2);
            System.arraycopy(en_0Array[byArray3].BaseCoreGenericHandler().LiteBansModule_31(), 0, byArray2, n3 + 2, 2);
            n3 += 4;
            byte[] byArray4 = en_0Array[byArray3].AsyncBackgroundTask_5();
            if (byArray4 == null) continue;
            System.arraycopy(byArray4, 0, byArray2, n3, byArray4.length);
            n3 += byArray4.length;
        }
        if (flag && (byArray = en_0Array[en_0Array.length - 1].AsyncBackgroundTask_5()) != null) {
            System.arraycopy(byArray, 0, byArray2, n3, byArray.length);
        }
        return byArray2;
    }

    public static final LiteBansModule_177 BaseCoreGenericHandler(LiteBansModule_177 en_02, byte[] byArray, int n, int n2, boolean flag) {
        try {
            if (flag) {
                en_02.BaseCoreGenericHandler(byArray, n, n2);
            } else {
                en_02.LiteBansModule_31(byArray, n, n2);
            }
            return en_02;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw (ZipException)new ZipException("Failed to parse corrupt ZIP extra field of type " + Integer.toHexString(en_02.c().BaseCoreGenericHandler())).initCause(arrayIndexOutOfBoundsException);
        }
    }

    static {
        LiteBansModule_8.BaseCoreGenericHandler(LiteBansModule_306.class);
        LiteBansModule_8.BaseCoreGenericHandler(LiteBansModule_97.class);
        LiteBansModule_8.BaseCoreGenericHandler(LiteBansModule_356.class);
        LiteBansModule_8.BaseCoreGenericHandler(LiteBansModule_383.class);
        LiteBansModule_8.BaseCoreGenericHandler(LiteBansModule_37.class);
        LiteBansModule_8.BaseCoreGenericHandler(LiteBansModule_33.class);
        LiteBansModule_8.BaseCoreGenericHandler(LiteBansModule_59.class);
        LiteBansModule_8.BaseCoreGenericHandler(LiteBansModule_363.class);
        LiteBansModule_8.BaseCoreGenericHandler(LiteBansModule_11.class);
        LiteBansModule_8.BaseCoreGenericHandler(LiteBansModule_30.class);
        LiteBansModule_8.BaseCoreGenericHandler(LiteBansModule_2.class);
        LiteBansModule_8.BaseCoreGenericHandler(IvsizeHandler.class);
        LiteBansModule_8.BaseCoreGenericHandler(LiteBansModule_17.class);
        LiteBansModule_8.BaseCoreGenericHandler(LiteBansModule_170.class);
    }
}

