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
            block6: {
                block5: {
                    if (!iterator.hasNext()) {
                        v0 = null;
                        return v0;
                    }
                    t2 = iterator.next();
                    LiteBansModule_109 cy2 = (LiteBansModule_109)t2;
                    boolean flag2 = false;
                    if (ObjectUtilities.BaseCoreGenericHandler((Object)cy2.BaseCoreGenericHandler(), (Object)"none")) break block5;
                    CommandSenderWrapper jv_03 = sender;
                    String string = cy2.BaseCoreGenericHandler();
                    boolean flag3 = false;
                    if (!jv_03.e(string)) break block6;
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

    }

