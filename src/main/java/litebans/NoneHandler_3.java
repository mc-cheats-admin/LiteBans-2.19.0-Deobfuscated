package litebans;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public final class NoneHandler_3 {
    /*
     * Enabled aggressive block sorting
     */
    public static final LiteBansModule_109 BaseCoreGenericHandler(@NotNull Iterable iterable, @NotNull CommandSenderWrapper sender) {
        Object t2;
        Object v0;
        boolean flag;
        Iterable iterable2 = iterable;
        Iterator iterator = iterable2.iterator();
        do {
{
                    if (!iterator.hasNext()) {
                        return v0;
                    }
                    t2 = iterator.next();
                    LiteBansModule_109 cy2 = (LiteBansModule_109)t2;
                    if (ObjectUtilities.BaseCoreGenericHandler((Object)cy2.BaseCoreGenericHandler(), (Object)"none")) break;
                    CommandSenderWrapper jv_03 = sender;
                    String string = cy2.BaseCoreGenericHandler();
                    if (!jv_03.e(string)) break;
                }
                flag = true;
                continue;
            }
            flag = false;
        } while (!flag);
        v0 = t2;
        return v0;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"none"};
}

