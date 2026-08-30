package litebans;

import java.util.Comparator;
public final class LiteBansModule_72
implements Comparator {
    final /* synthetic */ SortHandler BaseCoreGenericHandler;

    public LiteBansModule_72(SortHandler br2) {
        this.plugin = br2;
    }

    public final int compare(Object targetObj, Object contextObj) {
        int n;
        boolean flag;
        int n2;
        char c;
        char c10;
        int n3;
        String string = (String)contextObj;
        CharSequence charSequence = string;
        for (n3 = 0; n3 < charSequence.length(); ++n3) {
            c = c10 = charSequence.charAt(n3);
            n2 = n4;
            flag = false;
            n = this.plugin.BaseCoreGenericHandler(c);
            n4 = n2 + n;
        }
        string = (String)targetObj;
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
        return LiteBansModule_262.BaseCoreGenericHandler(comparable, Integer.valueOf(n4));
    }
}

