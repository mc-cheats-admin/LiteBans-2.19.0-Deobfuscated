package litebans;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import litebans.bF;
import litebans.bz;
import litebans.hN;
import litebans.hd_0;
import litebans.hl;
import litebans.ji_0;
import litebans.ll;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class h1 {
    private static /* synthetic */ String[] a;

    public static final String a(@NotNull CharSequence charSequence, @NotNull CharSequence[] charSequenceArray) {
        String string = ((Object)charSequence).toString();
        int n = 0;
        int n2 = charSequenceArray.length;
        if (n2 % 2 == 1) {
            throw new ArrayIndexOutOfBoundsException("Odd arg length " + n2);
        }
        while (n < n2) {
            CharSequence charSequence2 = charSequenceArray[n++];
            CharSequence charSequence3 = charSequenceArray[n++];
            string = bF.a((CharSequence)string, charSequence2, charSequence3);
        }
        return string;
    }

    public static final CharSequence a(@NotNull CharSequence charSequence, boolean bl, @Nullable CharSequence charSequence2) {
        CharSequence charSequence3;
        boolean bl2 = false;
        if (charSequence2 != null && charSequence2.length() > 0 && bl) {
            CharSequence charSequence4 = charSequence;
            CharSequence charSequence5 = "\n";
            boolean bl3 = false;
            charSequence4 = "" + charSequence4 + charSequence5;
            boolean bl4 = false;
            charSequence3 = "" + charSequence4 + charSequence2;
        } else {
            charSequence3 = charSequence;
        }
        return charSequence3;
    }

    public static final CharSequence a(@NotNull CharSequence charSequence, @Nullable CharSequence charSequence2) {
        CharSequence charSequence3;
        boolean bl = false;
        if (charSequence2 != null && charSequence2.length() > 0) {
            CharSequence charSequence4 = charSequence;
            CharSequence charSequence5 = "\n";
            boolean bl2 = false;
            charSequence4 = "" + charSequence4 + charSequence5;
            boolean bl3 = false;
            charSequence3 = "" + charSequence4 + charSequence2;
        } else {
            charSequence3 = charSequence;
        }
        return charSequence3;
    }

    public static final byte[] a(@NotNull StringBuilder stringBuilder, @NotNull Charset charset) {
        return stringBuilder.toString().getBytes(charset);
    }

    public static final String a(char c, @NotNull CharSequence charSequence) {
        return "" + c + charSequence;
    }

    public static final String a(@NotNull hd_0 hd_02, @NotNull String string) {
        return hd_02 + string;
    }

    public static final boolean a(@NotNull CharSequence charSequence) {
        return bz.a(charSequence, (CharSequence)"  ", false, 2, null);
    }

    public static final String b(@NotNull CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        hN hN2 = new hN("\\s+");
        String string = " ";
        return hN2.b(charSequence2, string);
    }

    public static final String a(@NotNull String string) {
        String string2 = "OfflinePlayer:" + string;
        return UUID.nameUUIDFromBytes(string2.getBytes(ji_0.b)).toString();
    }

    public static final String a(@NotNull String string, int n) {
        return string.length() <= n ? string : string.substring(0, n);
    }

    public static final List a(@NotNull List list) {
        String string = ll.a(list, " ", null, null, 0, null, null, 62, null);
        if (!bz.c((CharSequence)string, '\"', false, 2, null) && !bz.c((CharSequence)string, '\'', false, 2, null)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = false;
        for (char c : string.toCharArray()) {
            if (c == ' ' && !bl) {
                ((Collection)arrayList).add(stringBuilder.toString());
                bz.a(stringBuilder);
                continue;
            }
            if (c == '\"' || c == '\'') {
                boolean bl2 = bl = !bl;
                if (bl) continue;
                ((Collection)arrayList).add(stringBuilder.toString());
                bz.a(stringBuilder);
                continue;
            }
            stringBuilder.append(c);
        }
        return arrayList;
    }

    private static final void a() {
        a = new String[]{"Odd arg length ", "\n", "\n", "\n", "  ", "\\s+", " ", "OfflinePlayer:", " ", ""};
    }

    static {
        h1.a();
    }
}

