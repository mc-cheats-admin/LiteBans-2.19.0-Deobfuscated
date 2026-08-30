package litebans;

import java.util.Comparator;
public final class LiteBansModule_71
implements Comparator {
    final /* synthetic */ SortHandler BaseCoreGenericHandler;

    public LiteBansModule_71(SortHandler br2) {
        this.plugin = br2;
    }

    public final int compare(Object object, Object object2) {
        int n;
        boolean flag;
        int n2;
        char c;
        char c10;
        int n3;
        String string = (String)object2;
        CharSequence charSequence = string;
        for (n3 = 0; n3 < charSequence.length(); ++n3) {
            c = c10 = charSequence.charAt(n3);
            n2 = n4;
            flag = false;
            n = this.plugin.BaseCoreGenericHandler(c);
            n4 = n2 + n;
        }
        string = (String)object;
        Comparable comparable = Integer.valueOf(n4);
        flag2 = false;
        charSequence = string;
        n4 = 0;
        for (n3 = 0; n3 < charSequence.length(); ++n3) {
            c = c10 = charSequence.charAt(n3);
            n2 = n4;
            flag = false;
            n = this.plugin.BaseCoreGenericHandler(c);
            n4 = n2 + n;
        }
        return LiteBansModule_261.BaseCoreGenericHandler(comparable, Integer.valueOf(n4));
}

