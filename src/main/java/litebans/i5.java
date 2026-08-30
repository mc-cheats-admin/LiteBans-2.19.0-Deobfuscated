package litebans;

import java.util.Iterator;
import litebans.dG;
import litebans.hl;

public static abstract class i5
implements Iterator,
dG {
    private static /* synthetic */ String[] a;

    public abstract int b();

    @Override
    public void remove() {
        throw new UnsupportedOperationException(a[0]);
    }

    public Object next() {
        return this.b();
    }

    private static final void a() {
        a = new String[]{hl.a("\uc236\uc209\uc21c\uc20b\uc218\uc20d\uc210\uc216\uc217\uc259\uc210\uc20a\uc259\uc217\uc216\uc20d\uc259\uc20a\uc20c\uc209\uc209\uc216\uc20b\uc20d\uc21c\uc21d\uc259\uc21f\uc216\uc20b\uc259\uc20b\uc21c\uc218\uc21d\uc254\uc216\uc217\uc215\uc200\uc259\uc21a\uc216\uc215\uc215\uc21c\uc21a\uc20d\uc210\uc216\uc217", -1470446983)};
    }

    static {
        i5.a();
    }
}

