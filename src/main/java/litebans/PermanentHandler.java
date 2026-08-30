package litebans;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class PermanentHandler {
    private PermanentHandler() {
    }

    public final NativepatternHandler LiteBansModule_31() {
        return SecHandler.AsyncBackgroundTask_5();
    }

    public final NativepatternHandler BaseCoreGenericHandler() {
        return SecHandler.BaseCoreGenericHandler();
    }

    public final SecHandler BaseCoreGenericHandler(@NotNull String v1) {
{
            v2 = SecHandler.values();
            arg1 = v2.length;
            for (v3 = 0; v3 < arg1; ++v3) {
{
                    arg2 = arg3 = v2[v3];
                    arg4 = arg2;
                    if (arg4.LiteBansModule_31(v1)) ** GOTO lbl-1000
                    arg5 = arg4;
                    arg6 = SecHandler.BaseCoreGenericHandler(arg5);
                    arg7 = arg6.length;
                    for (arg8 = 0; arg8 < arg7; ++arg8) {
                        arg9 = arg10 = arg6[arg8];
                        if (!StringUtilities.BaseCoreGenericHandler(arg9, v1, true)) continue;
                        break;
}
                if (v0) lbl-1000:
                                {
                } else {
                }
                if (!v1) continue;
                v2 = arg3;
                break;
}
        return v2;
    }

    public final double BaseCoreGenericHandler(@NotNull String string, double d10) {
        Double d11;
        List list;
{
{
                List list2;
                if (ObjectUtilities.BaseCoreGenericHandler(string, (Object)"permanent") || ObjectUtilities.BaseCoreGenericHandler(string, (Object)"none") || ObjectUtilities.BaseCoreGenericHandler(string, (Object)"unlimited") || ObjectUtilities.BaseCoreGenericHandler(string, (Object)"never") || ObjectUtilities.BaseCoreGenericHandler(string, MessageKey.LiteBansModule_60.toString())) {
                    return 0.0;
                }
                contextObj = new char[]{' '};
                contextObj = StringUtilities.BaseCoreGenericHandler(string, contextObj, false, 0, 6, null);
                if (!contextObj.isEmpty()) {
                    targetObj = contextObj.listIterator(contextObj.size());
                    while (targetObj.hasPrevious()) {
                        String string2 = (String)targetObj.previous();
                        if ((string2).length() == 0) continue;
                        list2 = CollectionUtilities.BaseCoreGenericHandler((Iterable)contextObj, targetObj.nextIndex() + 1);
                        break;
} else {
                    list2 = list = CollectionUtilities.e();
                }
                if (list.isEmpty()) {
                    return d10;
                }
                contextObj = StringUtilities.BaseCoreGenericHandler((String)list.get(0), ',', '.', false, 4, null);
                d11 = StringUtilities.LiteBansModule_31((String)contextObj);
                if (d11 == null) break;
                String string3 = String.valueOf(StringUtilities.LiteBansModule_31(contextObj));
                ObjectUtilities.LiteBansModule_31(string3, "");
                if (!ObjectUtilities.BaseCoreGenericHandler(string3.toLowerCase(Locale.ROOT), (Object)"AsyncBackgroundTask_5")) break;
            }
            Double d12 = StringUtilities.LiteBansModule_31(LiteBansModule_81.BaseCoreGenericHandler(this.plugin(), contextObj, ""));
            if (d12 == null) {
                return d10;
            }
            double d13 = d12;
            String string4 = LiteBansModule_81.BaseCoreGenericHandler(this.LiteBansModule_31(), contextObj, "");
            SecHandler dk2 = this.plugin(string4);
            if (dk2 == null) {
                return d10;
            }
            SecHandler dk3 = dk2;
            return dk3.LiteBansModule_31(d13);
        }
        if (list.size() == 1) {
            return d11;
        }
        SecHandler dk4 = this.plugin((String)list.get(1));
        if (dk4 == null) {
            return d10;
        }
        targetObj = dk4;
        return ((SecHandler)(targetObj)).LiteBansModule_31(d11);
    }

    public static /* synthetic */ double BaseCoreGenericHandler(PermanentHandler db_02, String string, double d10, int n, Object targetObj) {
        if ((n & 2) != 0) {
            d10 = 0.0;
        }
        return db_02.BaseCoreGenericHandler(string, d10);
    }

    public final String BaseCoreGenericHandler(long l3, boolean flag) {
        String string;
        if (l3 <= 0L) {
            return MessageKey.LiteBansModule_60.toString();
        }
        long l5 = TimeUnit.MILLISECONDS.toDays(l3);
        long l7 = TimeUnit.MILLISECONDS.toHours(l3);
        long l8 = l7 - TimeUnit.DAYS.toHours(l5);
        long l9 = TimeUnit.MILLISECONDS.toMinutes(l3) - TimeUnit.HOURS.toMinutes(l7);
        long l10 = TimeUnit.MILLISECONDS.toSeconds(l3) - TimeUnit.MINUTES.toSeconds(l9);
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        CharSequence charSequence4 = null;
        if (flag) {
            charSequence = this.plugin(l5, MessageKey.LiteBansModule_125, MessageKey.aq);
            charSequence2 = this.plugin(l8, MessageKey.cH, MessageKey.SetHandler);
            charSequence3 = this.plugin(l9, MessageKey.r, MessageKey.cB);
            charSequence4 = this.plugin(l10, MessageKey.dC, MessageKey.bu);
        } else {
            charSequence = this.plugin(l5, (Object)"day", (Object)"days");
            charSequence2 = this.plugin(l8, (Object)"hour", (Object)"hours");
            charSequence3 = this.plugin(l9, (Object)"minute", (Object)"minutes");
            charSequence4 = this.plugin(l10, (Object)"second", (Object)"seconds");
        }
        String string2 = MessageKey.InputHandler.toString();
        String string3 = MessageKey.S.toString();
        if (l5 <= 0L) {
            if (l8 <= 0L) {
                if (l9 <= 0L) {
                    Object[] objectArray = new Object[]{l10, charSequence4};
                    string = String.format(string2, Arrays.copyOf(objectArray, objectArray.length));
                } else {
                    Object[] objectArray = new Object[]{l9, charSequence3};
                    string = String.format(string2, Arrays.copyOf(objectArray, objectArray.length));
} else if (l9 == 0L) {
                Object[] objectArray = new Object[]{l8, charSequence2};
                string = String.format(string2, Arrays.copyOf(objectArray, objectArray.length));
            } else {
                String string4 = string2 + string3 + string2;
                Object[] objectArray = new Object[]{l8, charSequence2, l9, charSequence3};
                string = String.format(string4, Arrays.copyOf(objectArray, objectArray.length));
} else if (l9 == 0L) {
            if (l8 == 0L) {
                Object[] objectArray = new Object[]{l5, charSequence};
                string = String.format(string2, Arrays.copyOf(objectArray, objectArray.length));
            } else {
                String string5 = string2 + string3 + string2;
                Object[] objectArray = new Object[]{l5, charSequence, l8, charSequence2};
                string = String.format(string5, Arrays.copyOf(objectArray, objectArray.length));
} else if (l8 == 0L) {
            String string6 = string2 + string3 + string2;
            Object[] objectArray = new Object[]{l5, charSequence, l9, charSequence3};
            string = String.format(string6, Arrays.copyOf(objectArray, objectArray.length));
        } else {
            String string7 = string2 + string3 + string2 + string3 + string2;
            Object[] objectArray = new Object[]{l5, charSequence, l8, charSequence2, l9, charSequence3};
            string = String.format(string7, Arrays.copyOf(objectArray, objectArray.length));
        }
        return string;
    }

    public static /* synthetic */ String BaseCoreGenericHandler(PermanentHandler db_02, long l3, boolean flag, int n, Object targetObj) {
        if ((n & 2) != 0) {
            flag = true;
        }
        return db_02.BaseCoreGenericHandler(l3, flag);
    }

    private final boolean BaseCoreGenericHandler(String string, Object targetObj) {
        return StringUtilities.BaseCoreGenericHandler(string, targetObj.toString(), true);
    }

    private final boolean BaseCoreGenericHandler(String string, Object targetObj, Object contextObj) {
        return this.plugin(string, targetObj) || this.plugin(string, contextObj);
    }

    public final CharSequence BaseCoreGenericHandler(@NotNull Number number, @NotNull Object targetObj, @NotNull Object contextObj) {
        return (number.doubleValue() == 1.0 ? targetObj : contextObj).toString();
    }

    public static final /* synthetic */ boolean BaseCoreGenericHandler(PermanentHandler db_02, String string, Object targetObj, Object contextObj) {
        return db_02.BaseCoreGenericHandler(string, targetObj, contextObj);
    }

    public /* synthetic */ PermanentHandler(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void c() {
        BaseCoreGenericHandler = new String[]{"permanent", "none", "unlimited", "never", "", "AsyncBackgroundTask_5", "", "", "day", "days", "hour", "hours", "minute", "minutes", "second", "seconds"};
}

