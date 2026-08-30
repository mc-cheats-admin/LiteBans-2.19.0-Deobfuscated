package litebans;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
public class LiteBansModule_314 {
    public static final int Utf8Handler_2;
    public static final int LiteBansModule_240;
    public static final int LiteBansModule_401;
    public static final int AsyncBackgroundTask_5;
    public static final int BaseCoreGenericHandler;
    public static final int i;
    public static final int g;
    public static final int LiteBansModule_31;
    private LinkedList e;
    private LiteBansModule_241 LiteBansModule_194 = new LiteBansModule_241(null);
    private LiteBansModule_55 GnuSparseMapHandler = null;
    private int c = 0;

    private final int BaseCoreGenericHandler(LinkedList linkedList) {
        if (linkedList.size() == 0) {
            return -1;
        }
        Integer n = (Integer)linkedList.getFirst();
        return n;
    }

    public void LiteBansModule_31() {
        this.GnuSparseMapHandler = null;
        this.c = 0;
        this.e = null;
    }

    public void BaseCoreGenericHandler(Reader reader) {
        this.LiteBansModule_194.BaseCoreGenericHandler(reader);
        this.LiteBansModule_31();
    }

    public int c() {
        return this.LiteBansModule_194.c();
    }

    public Object BaseCoreGenericHandler(String string) {
        return this.plugin(string, (LiteBansModule_357)null);
    }

    public Object BaseCoreGenericHandler(String string, LiteBansModule_357 ju_02) {
        StringReader stringReader = new StringReader(string);
        try {
            return this.plugin(stringReader, ju_02);
        }
        catch (IOException iOException) {
            throw new UnexpectedTokenException(-1, 2, iOException);
}

    public Object LiteBansModule_31(Reader reader) {
        return this.plugin(reader, (LiteBansModule_357)null);
    }

    public Object BaseCoreGenericHandler(Reader reader, LiteBansModule_357 ju_02) {
        this.plugin(reader);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        LinkedList<Object> linkedList2 = new LinkedList<Object>();
        do {
            this.plugin();
switch (this.c) {
                case 0: {
                    switch (this.GnuSparseMapHandler.LiteBansModule_240) {
                        case 0: {
                            this.c = 1;
                            linkedList.addFirst(new Integer(this.c));
                            linkedList2.addFirst(this.GnuSparseMapHandler.e);
                            break;
                        }
                        case 1: {
                            this.c = 2;
                            linkedList.addFirst(new Integer(this.c));
                            linkedList2.addFirst(this.LiteBansModule_31(ju_02));
                            break;
                        }
                        case 3: {
                            this.c = 3;
                            linkedList.addFirst(new Integer(this.c));
                            linkedList2.addFirst(this.plugin(ju_02));
                            break;
}
                    this.c = -1;
                    break;
                }
                case 1: {
                    if (this.GnuSparseMapHandler.LiteBansModule_240 == -1) {
                        return linkedList2.removeFirst();
                    }
                    throw new UnexpectedTokenException(this.c(), 1, this.GnuSparseMapHandler);
                }
                case 2: {
                    Object object;
                    switch (this.GnuSparseMapHandler.LiteBansModule_240) {
                        case 5: {
                            break;
                        }
                        case 0: {
                            if (this.GnuSparseMapHandler.e instanceof String) {
                                object = (String)this.GnuSparseMapHandler.e;
                                linkedList2.addFirst(object);
                                this.c = 4;
                                linkedList.addFirst(new Integer(this.c));
                                break;
                            }
                            this.c = -1;
                            break;
                        }
                        case 2: {
                            if (linkedList2.size() > 1) {
                                linkedList.removeFirst();
                                linkedList2.removeFirst();
                                this.c = this.plugin(linkedList);
                                break;
                            }
                            this.c = 1;
                            break;
}
                    this.c = -1;
                    break;
                }
                case 4: {
                    List list;
                    Map map;
                    Object object;
                    switch (this.GnuSparseMapHandler.LiteBansModule_240) {
                        case 6: {
                            break;
                        }
                        case 0: {
                            linkedList.removeFirst();
                            object = (String)linkedList2.removeFirst();
                            map = (Map)linkedList2.getFirst();
                            map.put(object, this.GnuSparseMapHandler.e);
                            this.c = this.plugin(linkedList);
                            break;
                        }
                        case 3: {
                            linkedList.removeFirst();
                            object = (String)linkedList2.removeFirst();
                            map = (Map)linkedList2.getFirst();
                            list = this.plugin(ju_02);
                            map.put(object, list);
                            this.c = 3;
                            linkedList.addFirst(new Integer(this.c));
                            linkedList2.addFirst(list);
                            break;
                        }
                        case 1: {
                            linkedList.removeFirst();
                            object = (String)linkedList2.removeFirst();
                            map = (Map)linkedList2.getFirst();
                            Map map2 = this.LiteBansModule_31(ju_02);
                            map.put(object, map2);
                            this.c = 2;
                            linkedList.addFirst(new Integer(this.c));
                            linkedList2.addFirst(map2);
                            break;
}
                    this.c = -1;
                    break;
                }
                case 3: {
                    List list;
                    Map map;
                    Object object;
                    switch (this.GnuSparseMapHandler.LiteBansModule_240) {
                        case 5: {
                            break;
                        }
                        case 0: {
                            object = (List)linkedList2.getFirst();
                            object.add(this.GnuSparseMapHandler.e);
                            break;
                        }
                        case 4: {
                            if (linkedList2.size() > 1) {
                                linkedList.removeFirst();
                                linkedList2.removeFirst();
                                this.c = this.plugin(linkedList);
                                break;
                            }
                            this.c = 1;
                            break;
                        }
                        case 1: {
                            object = (List)linkedList2.getFirst();
                            map = this.LiteBansModule_31(ju_02);
                            object.add(map);
                            this.c = 2;
                            linkedList.addFirst(new Integer(this.c));
                            linkedList2.addFirst(map);
                            break;
                        }
                        case 3: {
                            object = (List)linkedList2.getFirst();
                            list = this.plugin(ju_02);
                            object.add(list);
                            this.c = 3;
                            linkedList.addFirst(new Integer(this.c));
                            linkedList2.addFirst(list);
                            break;
}
                    this.c = -1;
                    break;
                }
                case -1: {
                    throw new UnexpectedTokenException(this.c(), 1, this.GnuSparseMapHandler);
}
            if (this.c != -1) continue;
            throw new UnexpectedTokenException(this.c(), 1, this.GnuSparseMapHandler);
        } while (this.GnuSparseMapHandler.LiteBansModule_240 != -1);
        throw new UnexpectedTokenException(this.c(), 1, this.GnuSparseMapHandler);
    }

    private final void BaseCoreGenericHandler() {
        this.GnuSparseMapHandler = this.LiteBansModule_194.e();
        if (this.GnuSparseMapHandler == null) {
            this.GnuSparseMapHandler = new LiteBansModule_55(-1, null);
}

    private final Map LiteBansModule_31(LiteBansModule_357 ju_02) {
        if (ju_02 == null) {
            return new NullHandler_3();
        }
        Map map = ju_02.BaseCoreGenericHandler();
        if (map == null) {
            return new NullHandler_3();
        }
        return map;
    }

    private final List BaseCoreGenericHandler(LiteBansModule_357 ju_02) {
        if (ju_02 == null) {
            return new NullHandler_7();
        }
        List list = ju_02.LiteBansModule_31();
        if (list == null) {
            return new NullHandler_7();
        }
        return list;
    }

    static {
        LiteBansModule_31 = -1;
        g = 6;
        i = 5;
        BaseCoreGenericHandler = 4;
        AsyncBackgroundTask_5 = 3;
        LiteBansModule_401 = 2;
        LiteBansModule_240 = 1;
        Utf8Handler_2 = 0;
}

