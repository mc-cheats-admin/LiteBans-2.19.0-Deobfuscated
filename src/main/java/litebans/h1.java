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

public static final class h1 {
    private static /* synthetic */ String[] a;

    public static final String a(@NotNull CharSequence charSequence, @NotNull CharSequence[] charSequenceArray) {
        String string = ((Object)charSequence).toString();
        int n = 0;
        int n2 = charSequenceArray.length;
        if (n2 % 2 == 1) {
            throw new ArrayIndexOutOfBoundsException(a[0] + n2);
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
            CharSequence charSequence5 = a[2];
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
            CharSequence charSequence5 = a[3];
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
        return bz.a(charSequence, (CharSequence)a[4], false, 2, null);
    }

    public static final String b(@NotNull CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        hN hN2 = new hN(a[5]);
        String string = a[6];
        return hN2.b(charSequence2, string);
    }

    public static final String a(@NotNull String string) {
        String string2 = a[7] + string;
        return UUID.nameUUIDFromBytes(string2.getBytes(ji_0.b)).toString();
    }

    public static final String a(@NotNull String string, int n) {
        return string.length() <= n ? string : string.substring(0, n);
    }

    public static final List a(@NotNull List list) {
        String string = ll.a(list, a[8], null, null, 0, null, null, 62, null);
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
        a = new String[]{hl.a("\u0c18\u0c33\u0c33\u0c77\u0c36\u0c25\u0c30\u0c77\u0c3b\u0c32\u0c39\u0c30\u0c23\u0c3f\u0c77", -1416819625), hl.a("\ubc45", 269794383), hl.a("\ufa6d", 217184871), hl.a("\ub0c1", -679890741), hl.a("\u423c\u423c", -1252834788), hl.a("\ue423\ue40c\ue454", -1067719553), hl.a("\u2aab", 1208167051), hl.a("\uc214\uc23d\uc23d\uc237\uc232\uc235\uc23e\uc20b\uc237\uc23a\uc222\uc23e\uc229\uc261", -230047141), hl.a("\u8f54", -494104716), hl.a("", -1972468011)};
    }

    static {
        h1.a();
    }
}

