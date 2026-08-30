package litebans;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_243 {
        public static final String BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull CharSequence[] charSequenceArray) {
        String string = ((Object)charSequence).toString();
        int n2 = charSequenceArray.length;
        if (n2 % 2 == 1) {
            throw new ArrayIndexOutOfBoundsException("Odd arg length " + n2);
        }
        while (n < n2) {
            CharSequence charSequence2 = charSequenceArray[n++];
            CharSequence charSequence3 = charSequenceArray[n++];
            string = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string, charSequence2, charSequence3);
        }
        return string;
    }

    public static final CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, boolean flag, @Nullable CharSequence charSequence2) {
        CharSequence charSequence3;
        if (charSequence2 != null && charSequence2.length() > 0 && flag) {
            CharSequence charSequence4 = charSequence;
            CharSequence charSequence5 = "\n";
            charSequence4 = "" + charSequence4 + charSequence5;
            charSequence3 = "" + charSequence4 + charSequence2;
        } else {
            charSequence3 = charSequence;
        }
        return charSequence3;
    }

    public static final CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @Nullable CharSequence charSequence2) {
        CharSequence charSequence3;
        if (charSequence2 != null && charSequence2.length() > 0) {
            CharSequence charSequence4 = charSequence;
            CharSequence charSequence5 = "\n";
            charSequence4 = "" + charSequence4 + charSequence5;
            charSequence3 = "" + charSequence4 + charSequence2;
        } else {
            charSequence3 = charSequence;
        }
        return charSequence3;
    }

    public static final byte[] BaseCoreGenericHandler(@NotNull StringBuilder stringBuilder, @NotNull Charset charset) {
        return stringBuilder.toString().getBytes(charset);
    }

    public static final String BaseCoreGenericHandler(char c, @NotNull CharSequence charSequence) {
        return "" + c + charSequence;
    }

    public static final String BaseCoreGenericHandler(@NotNull BlackHandler hd_02, @NotNull String string) {
        return hd_02 + string;
    }

    public static final boolean BaseCoreGenericHandler(@NotNull CharSequence charSequence) {
        return StringUtilities.BaseCoreGenericHandler(charSequence, (CharSequence)"  ", false, 2, null);
    }

    public static final String LiteBansModule_31(@NotNull CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        NativepatternHandler hN2 = new NativepatternHandler("\\AsyncBackgroundTask_21+");
        String string = " ";
        return hN2.LiteBansModule_31(charSequence2, string);
    }

    public static final String BaseCoreGenericHandler(@NotNull String string) {
        String string2 = "OfflinePlayer:" + string;
        return UUID.nameUUIDFromBytes(string2.getBytes(LiteBansModule_345.LiteBansModule_31)).toString();
    }

    public static final String BaseCoreGenericHandler(@NotNull String string, int n) {
        return string.length() <= n ? string : string.substring(0, n);
    }

    public static final List BaseCoreGenericHandler(@NotNull List list) {
        String string = CollectionUtilities.BaseCoreGenericHandler(list, " ", null, null, 0, null, null, 62, null);
        if (!StringUtilities.c((CharSequence)string, '\"', false, 2, null) && !StringUtilities.c((CharSequence)string, '\'', false, 2, null)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (c == ' ' && !flag) {
                ((Collection)arrayList).add(stringBuilder.toString());
                StringUtilities.BaseCoreGenericHandler(stringBuilder);
                continue;
            }
            if (c == '\"' || c == '\'') {
                boolean flag2 = flag = !flag;
                if (flag) continue;
                ((Collection)arrayList).add(stringBuilder.toString());
                StringUtilities.BaseCoreGenericHandler(stringBuilder);
                continue;
            }
            stringBuilder.append(c);
        }
        return arrayList;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"Odd arg length ", "\n", "\n", "\n", "  ", "\\AsyncBackgroundTask_21+", " ", "OfflinePlayer:", " ", ""};
    }

    static {
        LiteBansModule_243.BaseCoreGenericHandler();
    }
