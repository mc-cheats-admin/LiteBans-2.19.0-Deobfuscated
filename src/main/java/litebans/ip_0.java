package litebans;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import litebans.ae_0;
import litebans.bo_0;
import litebans.gr_0;
import litebans.h0;
import litebans.ju_0;
import litebans.ks_0;

public class ip_0 {
    public static final int k;
    public static final int h;
    public static final int l;
    public static final int d;
    public static final int a;
    public static final int i;
    public static final int g;
    public static final int b;
    private LinkedList e;
    private h0 f = new h0(null);
    private bo_0 j = null;
    private int c = 0;

    private final int a(LinkedList linkedList) {
        if (linkedList.size() == 0) {
            return -1;
        }
        Integer n = (Integer)linkedList.getFirst();
        return n;
    }

    public void b() {
        this.j = null;
        this.c = 0;
        this.e = null;
    }

    public void a(Reader reader) {
        this.f.a(reader);
        this.b();
    }

    public int c() {
        return this.f.c();
    }

    public Object a(String string) {
        return this.a(string, (ju_0)null);
    }

    public Object a(String string, ju_0 ju_02) {
        StringReader stringReader = new StringReader(string);
        try {
            return this.a(stringReader, ju_02);
        }
        catch (IOException iOException) {
            throw new ae_0(-1, 2, iOException);
        }
    }

    public Object b(Reader reader) {
        return this.a(reader, (ju_0)null);
    }

    public Object a(Reader reader, ju_0 ju_02) {
        this.a(reader);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        LinkedList<Object> linkedList2 = new LinkedList<Object>();
        do {
            this.a();
            block1 : switch (this.c) {
                case 0: {
                    switch (this.j.h) {
                        case 0: {
                            this.c = 1;
                            linkedList.addFirst(new Integer(this.c));
                            linkedList2.addFirst(this.j.e);
                            break block1;
                        }
                        case 1: {
                            this.c = 2;
                            linkedList.addFirst(new Integer(this.c));
                            linkedList2.addFirst(this.b(ju_02));
                            break block1;
                        }
                        case 3: {
                            this.c = 3;
                            linkedList.addFirst(new Integer(this.c));
                            linkedList2.addFirst(this.a(ju_02));
                            break block1;
                        }
                    }
                    this.c = -1;
                    break;
                }
                case 1: {
                    if (this.j.h == -1) {
                        return linkedList2.removeFirst();
                    }
                    throw new ae_0(this.c(), 1, this.j);
                }
                case 2: {
                    Object object;
                    switch (this.j.h) {
                        case 5: {
                            break block1;
                        }
                        case 0: {
                            if (this.j.e instanceof String) {
                                object = (String)this.j.e;
                                linkedList2.addFirst(object);
                                this.c = 4;
                                linkedList.addFirst(new Integer(this.c));
                                break block1;
                            }
                            this.c = -1;
                            break block1;
                        }
                        case 2: {
                            if (linkedList2.size() > 1) {
                                linkedList.removeFirst();
                                linkedList2.removeFirst();
                                this.c = this.a(linkedList);
                                break block1;
                            }
                            this.c = 1;
                            break block1;
                        }
                    }
                    this.c = -1;
                    break;
                }
                case 4: {
                    List list;
                    Map map;
                    Object object;
                    switch (this.j.h) {
                        case 6: {
                            break block1;
                        }
                        case 0: {
                            linkedList.removeFirst();
                            object = (String)linkedList2.removeFirst();
                            map = (Map)linkedList2.getFirst();
                            map.put(object, this.j.e);
                            this.c = this.a(linkedList);
                            break block1;
                        }
                        case 3: {
                            linkedList.removeFirst();
                            object = (String)linkedList2.removeFirst();
                            map = (Map)linkedList2.getFirst();
                            list = this.a(ju_02);
                            map.put(object, list);
                            this.c = 3;
                            linkedList.addFirst(new Integer(this.c));
                            linkedList2.addFirst(list);
                            break block1;
                        }
                        case 1: {
                            linkedList.removeFirst();
                            object = (String)linkedList2.removeFirst();
                            map = (Map)linkedList2.getFirst();
                            Map map2 = this.b(ju_02);
                            map.put(object, map2);
                            this.c = 2;
                            linkedList.addFirst(new Integer(this.c));
                            linkedList2.addFirst(map2);
                            break block1;
                        }
                    }
                    this.c = -1;
                    break;
                }
                case 3: {
                    List list;
                    Map map;
                    Object object;
                    switch (this.j.h) {
                        case 5: {
                            break block1;
                        }
                        case 0: {
                            object = (List)linkedList2.getFirst();
                            object.add(this.j.e);
                            break block1;
                        }
                        case 4: {
                            if (linkedList2.size() > 1) {
                                linkedList.removeFirst();
                                linkedList2.removeFirst();
                                this.c = this.a(linkedList);
                                break block1;
                            }
                            this.c = 1;
                            break block1;
                        }
                        case 1: {
                            object = (List)linkedList2.getFirst();
                            map = this.b(ju_02);
                            object.add(map);
                            this.c = 2;
                            linkedList.addFirst(new Integer(this.c));
                            linkedList2.addFirst(map);
                            break block1;
                        }
                        case 3: {
                            object = (List)linkedList2.getFirst();
                            list = this.a(ju_02);
                            object.add(list);
                            this.c = 3;
                            linkedList.addFirst(new Integer(this.c));
                            linkedList2.addFirst(list);
                            break block1;
                        }
                    }
                    this.c = -1;
                    break;
                }
                case -1: {
                    throw new ae_0(this.c(), 1, this.j);
                }
            }
            if (this.c != -1) continue;
            throw new ae_0(this.c(), 1, this.j);
        } while (this.j.h != -1);
        throw new ae_0(this.c(), 1, this.j);
    }

    private final void a() {
        this.j = this.f.e();
        if (this.j == null) {
            this.j = new bo_0(-1, null);
        }
    }

    private final Map b(ju_0 ju_02) {
        if (ju_02 == null) {
            return new gr_0();
        }
        Map map = ju_02.a();
        if (map == null) {
            return new gr_0();
        }
        return map;
    }

    private final List a(ju_0 ju_02) {
        if (ju_02 == null) {
            return new ks_0();
        }
        List list = ju_02.b();
        if (list == null) {
            return new ks_0();
        }
        return list;
    }

    static {
        b = -1;
        g = 6;
        i = 5;
        a = 4;
        d = 3;
        l = 2;
        h = 1;
        k = 0;
    }
}

