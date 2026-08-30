package litebans;

import java.util.Comparator;
import litebans.br;
import litebans.hj_0;

public final class c_
implements Comparator {
    final /* synthetic */ br a;

    public c_(br br2) {
        this.a = br2;
    }

    public final int compare(Object object, Object object2) {
        int n;
        boolean bl;
        int n2;
        char c;
        char c10;
        int n3;
        String string = (String)object2;
        boolean bl2 = false;
        CharSequence charSequence = string;
        int n4 = 0;
        for (n3 = 0; n3 < charSequence.length(); ++n3) {
            c = c10 = charSequence.charAt(n3);
            n2 = n4;
            bl = false;
            n = this.a.a(c);
            n4 = n2 + n;
        }
        string = (String)object;
        Comparable comparable = Integer.valueOf(n4);
        bl2 = false;
        charSequence = string;
        n4 = 0;
        for (n3 = 0; n3 < charSequence.length(); ++n3) {
            c = c10 = charSequence.charAt(n3);
            n2 = n4;
            bl = false;
            n = this.a.a(c);
            n4 = n2 + n;
        }
        return hj_0.a(comparable, Integer.valueOf(n4));
    }
}

