package litebans;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public final class NoneHandler_3 {
        /*
     * Enabled aggressive block sorting
     */
    public static final LiteBansModule_110 BaseCoreGenericHandler(@NotNull Iterable iterable, @NotNull CommandSenderWrapper sender) {
        Object t2;
        Object v0;
        boolean flag;
        Iterable iterable2 = iterable;
        Iterator iterator = iterable2.iterator();
        do {
            block6: {
                block5: {
                    if (!iterator.hasNext()) {
                        v0 = null;
                        return v0;
                    }
                    t2 = iterator.next();
                    LiteBansModule_110 cy2 = (LiteBansModule_110)t2;
                    if (ObjectUtilities.BaseCoreGenericHandler((Object)cy2.BaseCoreGenericHandler(), (Object)"none")) break block5;
                    CommandSenderWrapper senderWrapper = sender;
                    String string = cy2.BaseCoreGenericHandler();
                    if (!senderWrapper.e(string)) break block6;
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

    static {
        NoneHandler_3.BaseCoreGenericHandler();
    }
}

