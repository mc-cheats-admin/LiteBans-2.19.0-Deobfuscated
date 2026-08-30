package litebans;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class ActionHandler {
    private final ShowTextHandler LiteBansModule_31;
    private final List c;
    private boolean AsyncBackgroundTask_5 = false;
    @Deprecated
    public ActionHandler(ShowTextHandler eA2, LiteBansModule_432[] v_0Array) {
        this.LiteBansModule_31 = eA2;
        this.c = new ArrayList<LiteBansModule_167>(Collections.singletonList(new LiteBansModule_167(v_0Array)));
        this.AsyncBackgroundTask_5 = true;
    }

    public static Class BaseCoreGenericHandler(ShowTextHandler eA2, boolean flag) {
        Preconditions.checkArgument((eA2 != null ? 1 : 0) != 0, (Object)"action");
        switch (eA2.ordinal()) {
            case 0: {
                return flag ? LiteBansModule_167[].class : LiteBansModule_167.class;
}
        throw new UnsupportedOperationException("Action '" + eA2.name() + " not supported");
    }

    public ShowTextHandler AsyncBackgroundTask_5() {
        return this.LiteBansModule_31;
    }

    public List c() {
        return this.c;
    }

    public boolean LiteBansModule_31() {
        return this.AsyncBackgroundTask_5;
    }

    public String toString() {
        return "HoverEvent(action=" + (Object)((Object)this.AsyncBackgroundTask_5()) + ", contents=" + this.c() + ", legacy=" + this.LiteBansModule_31() + ")";
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ActionHandler)) {
            return false;
        }
        ActionHandler eu_02 = (ActionHandler)object;
        if (this.LiteBansModule_31() != eu_02.LiteBansModule_31()) {
            return false;
        }
        ShowTextHandler eA2 = this.AsyncBackgroundTask_5();
        ShowTextHandler eA3 = eu_02.AsyncBackgroundTask_5();
        if (eA2 == null ? eA3 != null : !((Object)((Object)eA2)).equals((Object)eA3)) {
            return false;
        }
        List list = this.c();
        List list2 = eu_02.c();
        return !(list == null ? list2 != null : !((Object)list).equals(list2));
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + (this.LiteBansModule_31() ? 79 : 97);
        ShowTextHandler eA2 = this.AsyncBackgroundTask_5();
        n2 = n2 * 59 + (eA2 == null ? 43 : ((Object)((Object)eA2)).hashCode());
        List list = this.c();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        return n2;
    }

    public ActionHandler(ShowTextHandler eA2, List list) {
        this.LiteBansModule_31 = eA2;
        this.c = list;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"action", "Action '", " not supported", "HoverEvent(action=", ", contents=", ", legacy=", ")"};
}

