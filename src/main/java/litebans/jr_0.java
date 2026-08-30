package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import litebans.aR;
import litebans.hl;
import litebans.kL;
import litebans.ll;
import litebans.lq;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.jr
 */
public static final class jr_0 {
    private final lq b;
    private static /* synthetic */ String[] a;

    public jr_0(@NotNull lq lq2) {
        this.b = lq2;
    }

    public final lq b() {
        return this.b;
    }

    public final String a(@NotNull kL kL2, @NotNull String[] stringArray) {
        kL kL3 = kL2;
        String[] stringArray2 = Arrays.copyOf(stringArray, stringArray.length);
        boolean bl = false;
        lq lq2 = this.b();
        boolean bl2 = false;
        kL kL4 = kL3;
        char c = '(';
        Object object = stringArray2;
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl3 = false;
        String[] stringArray3 = object;
        Collection collection = new ArrayList();
        boolean bl4 = false;
        int n = stringArray3.length;
        for (int i = 0; i < n; ++i) {
            String string;
            String string2 = string = stringArray3[i];
            boolean bl5 = false;
            boolean bl6 = ((CharSequence)string2).length() > 0;
            if (!bl6) continue;
            collection.add(string);
        }
        object = ll.a((List)collection, a[0], null, null, 0, null, null, 62, null);
        CharSequence charSequence = stringBuilder.append(c + (String)object).append(')').append(lq2.d()).append(lq2.c()).toString();
        boolean bl7 = false;
        return aR.e(a[1] + kL4 + charSequence);
    }

    private static final void a() {
        a = new String[]{hl.a("\u7c28", -1234273276), hl.a("\u8acd\u8adc\u8acb\u8acf\u8ada\u8acb\u8aae\u8ada\u8acf\u8acc\u8ac2\u8acb\u8aae\u8ac7\u8ac8\u8aae\u8ac0\u8ac1\u8ada\u8aae\u8acb\u8ad6\u8ac7\u8add\u8ada\u8add\u8aae", 720276110), hl.a("\u1eb9\u1eae\u1eba\u1eb8\u1ea5", 1781079753), hl.a("\u1f26\u1f44\u1f5f\u1f52\u1f43\u1f47\u1f26\u1f48\u1f49\u1f52\u1f26\u1f48\u1f53\u1f4a\u1f4a", 1805721350), hl.a("\u01e1\u01ea\u01ed\u01e2\u01f1\u01fa", 1196360099), hl.a("\ud8c0\ud8ce\ud8cd\ud8c0", -1573595006), hl.a("\u13cb\u13ac\u13ad\u13b6\u13c2\u13ac\u13b7\u13ae\u13ae", -81914910), hl.a("\u9fda\u9fcd\u9fd9\u9fdb\u9fc6", -1971282006), hl.a("\ucca8\uccca\uccd1\uccdc\ucccd\uccc9\ucca8\uccc6\uccc7\uccdc\ucca8\uccc6\uccdd\uccc4\uccc4", 1456786568), hl.a("\ub351\ub35a\ub35d\ub352\ub341\ub34a", 349942547), hl.a("\u42b2\u42bc\u42bf\u42b2", 1771782896), hl.a("\u8cd4\u8cb3\u8cb2\u8ca9\u8cdd\u8cb3\u8ca8\u8cb1\u8cb1", 21728509), hl.a("\u3c0b\u3c65\u3c64\u3c7f\u3c0b\u3c65\u3c7e\u3c67\u3c67", 148257835), hl.a("\u5880\u58f6\u58e1\u58f2\u58e3\u58e8\u58e1\u58f2\u5888", 1221089440), hl.a("\u5a85\u5af3\u5ae4\u5af7\u5ae6\u5aed\u5ae4\u5af7\u5a8d", 1555258021), hl.a("", 598676318), hl.a("\uee2a\uee44\uee45\uee5e\uee2a\uee44\uee5f\uee46\uee46", 1532292618), hl.a("\ufd24\ufd52\ufd45\ufd56\ufd47\ufd4c\ufd45\ufd56\ufd2c", 2033908996), hl.a("\u2682\u26f4\u26e3\u26f0\u26e1\u26ea\u26e3\u26f0\u268a", 129509026), hl.a("\uf195\uf1e3\uf1f4\uf1e7\uf1f6\uf1fd\uf1f4\uf1e7\uf19d", -1423183435), hl.a("\udf6d\udf1b\udf0c\udf1f\udf0e\udf05\udf0c\udf1f\udf65", -1824530611), hl.a("", -1469025081), hl.a("\u715a\u712c\u713b\u7128\u7139\u7132\u713b\u7128\u7152", 1990226298), hl.a("\u40f2\u4084\u4093\u4080\u4091\u409a\u4093\u4080\u40fa", 1156858066), hl.a("\u0f5f\u0f5d\u0f46\u0f42\u0f4e\u0f5d\u0f56\u0f2f\u0f44\u0f4a\u0f56\u0f27", 456462095), hl.a("\u99a7\u99c5\u99ce\u99c0\u99ce\u99c9\u99d3\u99a7\u99c9\u99c8\u99d3\u99a7\u99c9\u99d2\u99cb\u99cb", -974546553), hl.a("\u0d9c\u0dfe\u0df5\u0dfb\u0df5\u0df2\u0de8", -101577284), hl.a("\uc4df\uc4b1\uc4b0\uc4ab\uc4df\uc4b1\uc4aa\uc4b3\uc4b3", 65520895), hl.a("\u555f\u552b\u5536\u5532\u553a\u552c\u552b\u553e\u5532\u552f", -135899777), hl.a("\u5a92\u5af6\u5af7\u5af4\u5af3\u5ae7\u5afe\u5ae6\u5a92\u5af1\u5ae7\u5ae0\u5ae0\u5af7\u5afc\u5ae6\u5aed\u5ae6\u5afb\u5aff\u5af7\u5ae1\u5ae6\u5af3\u5aff\u5ae2", 1953389234), hl.a("\uc94b\uc93f\uc922\uc926\uc92e\uc938\uc93f\uc92a\uc926\uc93b", -267531925), hl.a("\ucd0d\ucd0f\ucd12\ucd17\ucd0a\ucd1b", -1566126722), hl.a("\u0b25\u0b4c\u0b4b\u0b51\u0b40\u0b42\u0b40\u0b57\u0b25\u0b55\u0b57\u0b4c\u0b48\u0b44\u0b57\u0b5c\u0b25\u0b4e\u0b40\u0b5c\u0b25\u0b44\u0b50\u0b51\u0b4a\u0b4c\u0b4b\u0b46\u0b57\u0b40\u0b48\u0b40\u0b4b\u0b51", 754715397), hl.a("\u8612\u8661\u8677\u8660\u867b\u8673\u867e", 971081266), hl.a("\u1008\u1061\u1066\u107c\u1008\u1066\u1067\u107c\u1008\u1066\u107d\u1064\u1064", 447287336), hl.a("\udd93\uddfa\uddfd\udde7", -1005003341), hl.a("\u3d4f\u3d21\u3d20\u3d3b\u3d4f\u3d21\u3d3a\u3d23\u3d23", -1886962321), hl.a("\u86c8\u86df\u86cb\u86c9\u86d4", 100042424), hl.a("\ud4da\ud4a9\ud4b7\ud4bb\ud4b6\ud4b6\ud4b3\ud4b4\ud4ae\ud4da\ud4b4\ud4b5\ud4ae\ud4da\ud4b4\ud4af\ud4b6\ud4b6", -223619846), hl.a("\u5383\u53f7\u53ea\u53ed\u53fa\u53ea\u53ed\u53f7\u5383\u53ed\u53ec\u53f7\u5383\u53ed\u53f6\u53ef\u53ef", -1465035869), hl.a("\u7796\u7781\u7795\u7797\u778a", -446072858), hl.a("\u8c56\u8c0c", 1134529598), hl.a("\ude4e\ude3d\ude23\ude2f\ude22\ude22\ude27\ude20\ude3a\ude4e\ude20\ude21\ude3a\ude4e\ude20\ude3b\ude22\ude22", 1060363886), hl.a("\udc67\udc13\udc0e\udc09\udc1e\udc0e\udc09\udc13", -882647993), hl.a("\ub040\ub02e\ub02f\ub034\ub040\ub02e\ub035\ub02c\ub02c", 404336736), hl.a("", -989874129), hl.a("\uafab\uafbc\uafa8\uafaa\uafb7", 1257484251), hl.a("\u42d7\u428d", 226312895), hl.a("\u3739\u374a\u3754\u3758\u3755\u3755\u3750\u3757\u374d\u3739\u3757\u3756\u374d\u3739\u3757\u374c\u3755\u3755", 540817177), hl.a("\u364b\u363f\u3622\u3625\u3632\u3622\u3625\u363f", -1543817621), hl.a("\u7e0f\u7e61\u7e60\u7e7b\u7e0f\u7e61\u7e7a\u7e63\u7e63", -1275363793), hl.a("\uc26a\uc208\uc203\uc21e", -847527350), hl.a("\u99eb\u9985\u9984\u999f\u99eb\u9985\u999e\u9987\u9987", 963877323), hl.a("\u4394\u43f6\u43fd\u43e0", 171197364)};
    }

    static {
        jr_0.a();
    }
}

