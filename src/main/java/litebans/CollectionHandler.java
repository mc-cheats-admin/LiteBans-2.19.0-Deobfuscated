package litebans;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CollectionHandler {
    private static final Object[] LiteBansModule_31;
    private static final int BaseCoreGenericHandler;
    public static final Object[] BaseCoreGenericHandler(@NotNull Collection collection) {
        Object[] objectArray;
        block9: {
            ObjectUtilities.BaseCoreGenericHandler((Object)collection, "collection");
            boolean flag = false;
            int n = collection.size();
            if (n == 0) {
                boolean flag2 = false;
                objectArray = LiteBansModule_31;
            } else {
                Iterator iterator = collection.iterator();
                if (!iterator.hasNext()) {
                    boolean flag3 = false;
                    objectArray = LiteBansModule_31;
                } else {
                    int n2 = n;
                    int n3 = 0;
                    Object[] objectArray2 = new Object[n2];
                    n3 = 0;
                    while (true) {
                        objectArray2[n3++] = iterator.next();
                        if (n3 >= objectArray2.length) {
                            if (!iterator.hasNext()) {
                                objectArray = objectArray2;
                                break block9;
                            }
                            int n4 = n3 * 3 + 1 >>> 1;
                            if (n4 <= n3) {
                                if (n3 >= 0x7FFFFFFD) {
                                    throw new OutOfMemoryError();
                                }
                                n4 = 0x7FFFFFFD;
                            }
                            objectArray2 = Arrays.copyOf(objectArray2, n4);
                            continue;
                        }
                        if (!iterator.hasNext()) break;
                    }
                    int n5 = n3;
                    Object[] objectArray3 = objectArray2;
                    boolean flag4 = false;
                    objectArray = Arrays.copyOf(objectArray3, n5);
                }
            }
        }
        return objectArray;
    }

    public static final Object[] BaseCoreGenericHandler(@NotNull Collection collection, @Nullable Object[] objectArray) {
        Object[] objectArray2;
        block16: {
            ObjectUtilities.BaseCoreGenericHandler((Object)collection, "collection");
            if (objectArray == null) {
                throw new NullPointerException();
            }
            boolean flag = false;
            int n = collection.size();
            if (n == 0) {
                boolean flag2 = false;
                if (objectArray.length > 0) {
                    objectArray[0] = null;
                }
                objectArray2 = objectArray;
            } else {
                Iterator iterator = collection.iterator();
                if (!iterator.hasNext()) {
                    boolean flag3 = false;
                    if (objectArray.length > 0) {
                        objectArray[0] = null;
                    }
                    objectArray2 = objectArray;
                } else {
                    Object[] objectArray3;
                    int n2 = n;
                    int n3 = 0;
                    if (n2 <= objectArray.length) {
                        objectArray3 = objectArray;
                    } else {
                        Object object = Array.newInstance(objectArray.getClass().getComponentType(), n2);
                        ObjectUtilities.LiteBansModule_31(object, "");
                        objectArray3 = (Object[])object;
                    }
                    Object[] objectArray4 = objectArray3;
                    n2 = 0;
                    while (true) {
                        objectArray4[n2++] = iterator.next();
                        if (n2 >= objectArray4.length) {
                            if (!iterator.hasNext()) {
                                objectArray2 = objectArray4;
                                break block16;
                            }
                            n3 = n2 * 3 + 1 >>> 1;
                            if (n3 <= n2) {
                                if (n2 >= 0x7FFFFFFD) {
                                    throw new OutOfMemoryError();
                                }
                                n3 = 0x7FFFFFFD;
                            }
                            objectArray4 = Arrays.copyOf(objectArray4, n3);
                            continue;
                        }
                        if (!iterator.hasNext()) break;
                    }
                    int n4 = n2;
                    Object[] objectArray5 = objectArray4;
                    boolean flag4 = false;
                    if (objectArray5 == objectArray) {
                        objectArray[n4] = null;
                        objectArray2 = objectArray;
                    } else {
                        objectArray2 = Arrays.copyOf(objectArray5, n4);
                    }
                }
            }
        }
        return objectArray2;
    }

    static {
        BaseCoreGenericHandler = 0x7FFFFFFD;
        CollectionHandler.BaseCoreGenericHandler();
        LiteBansModule_31 = new Object[0];
    }

    private static final void BaseCoreGenericHandler() {
        c = new String[]{"collection", "collection", ""};
    }
}

