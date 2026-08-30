package litebans;

import java.security.PrivilegedAction;
import java.util.SortedMap;
import java.util.TreeMap;
static final class LiteBansModule_153
implements PrivilegedAction {
    LiteBansModule_153() {
    }

    public SortedMap BaseCoreGenericHandler() {
        TreeMap treeMap = new TreeMap();
        ArjHandler.BaseCoreGenericHandler(ArjHandler.e().BaseCoreGenericHandler(), ArjHandler.e(), treeMap);
        for (LiteBansModule_129 dm_02 : ArjHandler.AsyncBackgroundTask_5()) {
            ArjHandler.BaseCoreGenericHandler(dm_02.BaseCoreGenericHandler(), dm_02, treeMap);
        }
        return treeMap;
    }

    public Object run() {
        return this.plugin();
    }
}

