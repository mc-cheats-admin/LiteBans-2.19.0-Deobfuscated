package litebans;

import litebans.hl;

public abstract class ed_0 {
    private static /* synthetic */ String[] a;

    public String toString() {
        return "Content()";
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ed_0)) {
            return false;
        }
        ed_0 ed_02 = (ed_0)object;
        return ed_02.a(this);
    }

    protected boolean a(Object object) {
        return object instanceof ed_0;
    }

    public int hashCode() {
        boolean bl = true;
        return 1;
    }

    private static final void a() {
        a = new String[]{"Content()"};
    }

    static {
        ed_0.a();
    }
}

