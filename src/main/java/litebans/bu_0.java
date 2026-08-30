package litebans;

import java.util.Locale;
import litebans.as_0;
import litebans.b_;
import litebans.bz;
import litebans.ew;
import litebans.hl;
import litebans.jc_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.bu
 */
static class bu_0
extends b_ {
    private static /* synthetic */ String[] i;

    public static final boolean a(@Nullable String string, @Nullable String string2, boolean bl) {
        if (string == null) {
            return string2 == null;
        }
        return !bl ? string.equals(string2) : string.equalsIgnoreCase(string2);
    }

    public static final String a(@NotNull String string, char c, char c10, boolean bl) {
        StringBuilder stringBuilder;
        ew.a((Object)string, i[6]);
        if (!bl) {
            return string.replace(c, c10);
        }
        int n = string.length();
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder(n);
        boolean bl2 = false;
        CharSequence charSequence = string;
        boolean bl3 = false;
        for (int i = 0; i < charSequence.length(); ++i) {
            char c11;
            char c12 = c11 = charSequence.charAt(i);
            boolean bl4 = false;
            stringBuilder2.append(jc_0.a(c12, c, bl) ? c10 : c12);
        }
        return stringBuilder.toString();
    }

    public static /* synthetic */ String a(String string, char c, char c10, boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            bl = false;
        }
        return bz.a(string, c, c10, bl);
    }

    public static final String a(@NotNull String string, @NotNull String string2, @NotNull String string3, boolean bl) {
        ew.a((Object)string, i[7]);
        ew.a((Object)string2, i[8]);
        ew.a((Object)string3, i[9]);
        String string4 = string;
        boolean bl2 = false;
        int n = bz.b((CharSequence)string4, string2, 0, bl);
        if (n < 0) {
            return string4;
        }
        int n2 = string2.length();
        int n3 = as_0.c(n2, 1);
        int n4 = string4.length() - n2 + string3.length();
        if (n4 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder stringBuilder = new StringBuilder(n4);
        int n5 = 0;
        do {
            stringBuilder.append(string4, n5, n).append(string3);
            n5 = n + n2;
        } while (n < string4.length() && (n = bz.b((CharSequence)string4, string2, n + n3, bl)) > 0);
        return stringBuilder.append(string4, n5, string4.length()).toString();
    }

    public static /* synthetic */ String a(String string, String string2, String string3, boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            bl = false;
        }
        return bz.a(string, string2, string3, bl);
    }

    public static final boolean c(@NotNull String string, @NotNull String string2, boolean bl) {
        ew.a((Object)string, i[45]);
        ew.a((Object)string2, i[46]);
        if (!bl) {
            return string.startsWith(string2);
        }
        return bz.a(string, 0, string2, 0, string2.length(), bl);
    }

    public static /* synthetic */ boolean b(String string, String string2, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return bz.c(string, string2, bl);
    }

    public static final boolean b(@NotNull String string, @NotNull String string2, boolean bl) {
        ew.a((Object)string, i[49]);
        ew.a((Object)string2, i[50]);
        if (!bl) {
            return string.endsWith(string2);
        }
        return bz.a(string, string.length() - string2.length(), string2, 0, string2.length(), true);
    }

    public static /* synthetic */ boolean a(String string, String string2, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return bz.b(string, string2, bl);
    }

    public static final boolean a(@NotNull String string, int n, @NotNull String string2, int n2, int n3, boolean bl) {
        ew.a((Object)string, i[75]);
        ew.a((Object)string2, i[76]);
        return !bl ? string.regionMatches(n, string2, n2, n3) : string.regionMatches(bl, n, string2, n2, n3);
    }

    public static final String a(@NotNull String string, @NotNull Locale locale) {
        char c;
        ew.a((Object)string, i[92]);
        ew.a((Object)locale, i[93]);
        if (((CharSequence)string).length() > 0 && Character.isLowerCase(c = string.charAt(0))) {
            int n;
            String string2;
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            StringBuilder stringBuilder3 = stringBuilder2 = new StringBuilder();
            boolean bl = false;
            char c10 = Character.toTitleCase(c);
            if (c10 != Character.toUpperCase(c)) {
                stringBuilder = stringBuilder3.append(c10);
            } else {
                string2 = string;
                n = 0;
                int n2 = 1;
                string2 = string2.substring(n, n2);
                ew.b(string2, i[94]);
                stringBuilder = stringBuilder3.append(string2.toUpperCase(locale));
            }
            string2 = string;
            n = 1;
            stringBuilder3.append(string2.substring(n));
            return stringBuilder2.toString();
        }
        return string;
    }

    private static final void i() {
        i = new String[]{hl.a("\ube99\ubed1\ubecd\ubecc\ubed6\ube9b", 1966259877), hl.a("\ufdb1\ufdf9\ufde5\ufde4\ufdfe\ufdb3", 1451425165), hl.a("\ue0e8\ue0ef\ue0e9", -340074341), hl.a("\u6372\u633a\u6326\u6327\u633d\u6370", 1460298574), hl.a("\u2b2c\u2b64\u2b78\u2b79\u2b63\u2b2e", -457037040), hl.a("\ud820\ud827\ud821", -1931159469), hl.a("\u5eee\u5ea6\u5eba\u5ebb\u5ea1\u5eec", 1307205330), hl.a("\u2c95\u2cdd\u2cc1\u2cc0\u2cda\u2c97", -415880023), hl.a("\u709d\u709e\u7096\u70a4\u7093\u709e\u7087\u7097", -576294670), hl.a("\u0d20\u0d2b\u0d39\u0d18\u0d2f\u0d22\u0d3b\u0d2b", 958532942), hl.a("\ufaf7\ufabf\ufaa3\ufaa2\ufab8\ufaf5", -2136016181), hl.a("\u33c4\u338c\u3390\u3391\u338b\u33c6", -560253960), hl.a("\u9158\u915b\u9153\u9161\u9156\u915b\u9142\u9152", -1362259657), hl.a("\u5c78\u5c73\u5c61\u5c40\u5c77\u5c7a\u5c63\u5c73", -1986044906), hl.a("\uc80b\uc843\uc85f\uc85e\uc844\uc809", 1326368823), hl.a("\u7f8e\u7fc6\u7fda\u7fdb\u7fc1\u7f8c", 134709170), hl.a("\ue888\ue8c0\ue8dc\ue8dd\ue8c7\ue88a", -1665734476), hl.a("\u2c6c\u2c24\u2c38\u2c39\u2c23\u2c6e", 1142565968), hl.a("\u7d89\u7dc1\u7ddd\u7ddc\u7dc6\u7d8b", -1788707403), hl.a("\u3f89\u3fc1\u3fdd\u3fdc\u3fc6\u3f8b", 834879413), hl.a("\u3ca8\u3ce0\u3cfc\u3cfd\u3ce7\u3caa", -229294956), hl.a("\ucb84\ucbcc\ucbd0\ucbd1\ucbcb\ucb86", 183880632), hl.a("\u310d\u3145\u3159\u3158\u3142\u310f", 73216305), hl.a("\u59b8\u59f0\u59ec\u59ed\u59f7\u59ba", -1133356668), hl.a("\ue72a\ue762\ue77e\ue77f\ue765\ue728", 1008592662), hl.a("", -1424261787), hl.a("\uf241\uf209\uf215\uf214\uf20e\uf243", -692325763), hl.a("\ucae2\ucaaa\ucab6\ucab7\ucaad\ucae0", 1253100254), hl.a("\u45d1\u45d0\u45c6\u45c1\u45dc\u45db\u45d4\u45c1\u45dc\u45da\u45db", -204388939), hl.a("\u478f\u47c7\u47db\u47da\u47c0\u478d", -330020941), hl.a("\u19f9\u19f8\u19ee\u19e9\u19f4\u19f3\u19fc\u19e9\u19f4\u19f2\u19f3", 833034653), hl.a("\ub08a\ub0c2\ub0de\ub0df\ub0c5\ub088", 918597814), hl.a("\u139e\u138d\u1398\u138c", 1761219583), hl.a("\ucad4\uca9c\uca80\uca81\uca9b\ucad6", 868666088), hl.a("\u7a91\u7a98\u7a85\u7a9a\u7a96\u7a83", -1567917321), hl.a("\u1314\u1307\u1312\u1306", 140907381), hl.a("\u2169\u2121\u213d\u213c\u2126\u216b", 1063002453), hl.a("\u5878\u586b\u587e\u586a", -415541223), hl.a("\u7219\u7251\u724d\u724c\u7256\u721b", -997035483), hl.a("\ubb00\ubb09\ubb14\ubb0b\ubb07\ubb12", 1234680678), hl.a("\u98ed\u98fe\u98eb\u98ff", 163420300), hl.a("\u18ad\u18e5\u18f9\u18f8\u18e2\u18af", 622270609), hl.a("\ueb77\ueb60\ueb62\ueb60\ueb7d", -916854011), hl.a("\u334a\u3302\u331e\u331f\u3305\u3348", 2033464182), hl.a("\u81e0\u81a8\u81b4\u81b5\u81af\u81e2", -107773476), hl.a("\u6880\u68c8\u68d4\u68d5\u68cf\u6882", -1509529412), hl.a("\u607d\u607f\u6068\u606b\u6064\u6075", -1089511411), hl.a("\udc17\udc5f\udc43\udc42\udc58\udc15", -237773781), hl.a("\u1220\u1222\u1235\u1236\u1239\u1228", -668528048), hl.a("\u069e\u06d6\u06ca\u06cb\u06d1\u069c", 428082850), hl.a("\uacc4\uacc2\uacd1\uacd1\uacde\uaccf", 182758583), hl.a("\ubbfa\ubbe1\ubbec\ubbfd\ubbeb", 542358424), hl.a("\u22bd\u22b6\u22bf\u22ac\u22ad\u22bb\u22aa", 107684574), hl.a("\u6fc4\u6fdf\u6fd2\u6fc3\u6fd5", 244608934), hl.a("\u9735\u973e\u9737\u9724\u9725\u9733\u9722", -1534879914), hl.a("\ufdcb\ufdd0\ufddd\ufdcc\ufdda", -1398342231), hl.a("\uf9d3\uf9c8\uf9c5\uf9d4\uf9c2", 477231537), hl.a("\u2481\u248a\u2483\u2490\u2491", 813049058), hl.a("\u53cb\u53c0\u53c9\u53da\u53db", -1635363928), hl.a("\uba19\uba15\uba1e\uba1f\uba2a\uba15\uba13\uba14\uba0e\uba09", -549864838), hl.a("\ud9b7\ud9b0\ud9b6\ud9ad\ud9aa\ud9a3\ud986\ud9b1\ud9a2\ud9a2\ud9a1\ud9b6", 482793924), hl.a("\ue3ca\ue3cd\ue3cb\ue3d0\ue3d7\ue3de\ue3fb\ue3cc\ue3d0\ue3d5\ue3dd\ue3dc\ue3cb", 1447814073), hl.a("\u3887\u38cf\u38d3\u38d2\u38c8\u3885", 126105787), hl.a("\ufb0d\ufb45\ufb59\ufb58\ufb42\ufb0f", 1193016113), hl.a("\uf069\uf021\uf03d\uf03c\uf026\uf06b", -2081623979), hl.a("\u61be\u61f6\u61ea\u61eb\u61f1\u61bc", -591568510), hl.a("\u010e\u0115\u0109\u0104\u0113", 2013135201), hl.a("\u940b\u9443\u945f\u945e\u9444\u9409", 1297912887), hl.a("\u28b9\u28b2\u28bb\u28a8\u2889\u28bf\u28ab\u28af\u28bf\u28b4\u28b9\u28bf", -1999951654), hl.a("\ua83c\ua874\ua868\ua869\ua873\ua83e", -693065728), hl.a("\u1cfa\u1cfd\u1cfb\u1ce0\u1ce7\u1cee\u1ccb\u1cfc\u1ce0\u1ce5\u1ced\u1cec\u1cfb", 1508777097), hl.a("\u6b3b\u6b73\u6b6f\u6b6e\u6b74\u6b39", 604859143), hl.a("\u1245\u120d\u1211\u1210\u120a\u1247", -169209223), hl.a("\ub839\ub871\ub86d\ub86c\ub876\ub83b", 953595909), hl.a("\uf209\uf212\uf20e\uf203\uf214", 462811750), hl.a("\u0f65\u0f2d\u0f31\u0f30\u0f2a\u0f67", 1266945881), hl.a("\uafb9\uafa2\uafbe\uafb3\uafa4", -621170730), hl.a("\u3b10\u3b58\u3b44\u3b45\u3b5f\u3b12", -282510548), hl.a("\u7616\u7615\u7619\u761b\u7616\u761f", -1024035206), hl.a("\uec73\uec3b\uec27\uec26\uec3c\uec71", 250342479), hl.a("\u59b4\u59b7\u59bb\u59b9\u59b4\u59bd", 552622552), hl.a("\ucfeb\ucfa3\ucfbf\ucfbe\ucfa4\ucfe9", -2126721065), hl.a("\u86fb\u86f8\u86f4\u86f6\u86fb\u86f2", -571767145), hl.a("\ufb80\ufbc8\ufbd4\ufbd5\ufbcf\ufb82", -450430020), hl.a("\ud131\ud132\ud13e\ud13c\ud131\ud138", -1722953379), hl.a("\ua21f\ua257\ua24b\ua24a\ua250\ua21d", 1191420451), hl.a("\u9941\u994a\u9943\u9950\u9951\u9947\u9956", 404920610), hl.a("\u95e2\u95aa\u95b6\u95b7\u95ad\u95e0", 559912414), hl.a("\u3393\u3398\u3391\u3382\u3383\u3395\u3384", 1569207280), hl.a("\u6c7f\u6c37\u6c2b\u6c2a\u6c30\u6c7d", 1787391043), hl.a("\u6150\u6118\u6104\u6105\u611f\u6152", 686252396), hl.a("\u987c\u9834\u9828\u9829\u9833\u987e", -1177184192), hl.a("\uc468\uc420\uc43c\uc43d\uc427\uc46a", -1055800236), hl.a("\ub7d8\ub7db\ub7d7\ub7d5\ub7d8\ub7d1", 879015860), hl.a("", -614815961), hl.a("\u228c\u22c4\u22d8\u22d9\u22c3\u228e", 1594761904), hl.a("", 815432638), hl.a("\ub57e\ub536\ub52a\ub52b\ub531\ub57c", -842746558), hl.a("\ua292\ua291\ua29d\ua29f\ua292\ua29b", 1200661246), hl.a("", 1423967093), hl.a("\u468e\u46c6\u46da\u46db\u46c1\u468c", -1593162062), hl.a("\ua7ab\ua787\ua79d\ua786\ua79c\ua7c8\ua7cf\ua786\ua7cf\ua7c8\ua785\ua79d\ua79b\ua79c\ua7c8\ua78a\ua78d\ua7c8\ua786\ua787\ua786\ua7c5\ua786\ua78d\ua78f\ua789\ua79c\ua781\ua79e\ua78d\ua7c4\ua7c8\ua78a\ua79d\ua79c\ua7c8\ua79f\ua789\ua79b\ua7c8", 476358632), hl.a("", -1800607391), hl.a("", 824174024), hl.a("\uc7ed\uc7a5\uc7b9\uc7b8\uc7a2\uc7ef", 1158662097)};
    }

    static {
        bu_0.i();
    }
}

