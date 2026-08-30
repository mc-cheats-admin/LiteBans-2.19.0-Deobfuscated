package litebans;

import java.io.File;
import java.util.Locale;
import java.util.logging.Logger;
import litebans.aJ;
import litebans.di_0;
import litebans.gn_0;
import litebans.hl;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class k2 {
    private final di_0 b;
    private final File e;
    private final q_0 f;
    private Locale a;
    private gn_0 d;
    private static /* synthetic */ String[] c;

    public k2(@NotNull di_0 di_02, @NotNull File file) {
        this.b = di_02;
        this.e = file;
        this.f = (q_0)this.b.a(q_0.class);
        this.a = this.b();
    }

    public /* synthetic */ k2(di_0 di_02, File file, int n, aJ aJ2) {
        if ((n & 2) != 0) {
            File file2 = di_02.getDataFolder();
            String string = c[0];
            boolean bl = false;
            file = new File(file2, string);
        }
        this(di_02, file);
    }

    public final di_0 a() {
        return this.b;
    }

    public final File g() {
        return this.e;
    }

    public final q_0 e() {
        return this.f;
    }

    public final Locale d() {
        return this.a;
    }

    public final void a(@NotNull Locale locale) {
        this.a = locale;
    }

    public final gn_0 c() {
        return this.d;
    }

    public final void a(@Nullable gn_0 gn_02) {
        this.d = gn_02;
    }

    public final Locale b() {
        return Locale.getDefault(Locale.Category.FORMAT);
    }

    public final void a(@NotNull Exception exception) {
        Logger logger = this.b.getLogger();
        boolean bl = false;
        String string = c[33];
        this.f.a(string, exception);
        String string2 = c[34] + string + c[35];
        if (this.e.exists()) {
            logger.severe(string2 + c[36]);
        } else {
            logger.severe(string2 + c[37] + this.b.getDataFolder().getAbsolutePath());
        }
        if (this.f.a(1)) {
            this.f.a(exception);
        }
    }

    private static final void f() {
        c = new String[]{hl.a("\ua92b\ua923\ua935\ua935\ua927\ua921\ua923\ua935\ua968\ua93f\ua92b\ua92a", 832481606), hl.a("\u3660\u3668\u367e\u367e\u366c\u366a\u3668\u367e\u3623\u3674\u3660\u3661", -1927989747), hl.a("\u88f8\u88f0\u88e6\u88e6\u88f4\u88f2\u88f0\u88e6\u88bb\u88ec\u88f8\u88f9", -1539602283), hl.a("\u1c8e\u1c8d\u1c81\u1c83\u1c8e\u1c87", -232317726), hl.a("\ue6f9\ue6f3\ue6f9\ue6fe\ue6ef\ue6e7", 38200970), hl.a("\u6553\u6559\u6553\u6554\u6545\u654d", -106863328), hl.a("\u5da8\u5d8e\u5d94\u5d93\u5d9a\u5ddd\u5d9e\u5d92\u5d93\u5d9b\u5d94\u5d9a\u5d88\u5d8f\u5d98\u5d99\u5ddd\u5d91\u5d92\u5d9e\u5d9c\u5d91\u5d98\u5ddd\u5dd5", -1814143491), hl.a("\u8fd6\u8ff0\u8ff5\u8ff5\u8fea\u8ff7\u8ff1\u8fe0\u8fe1\u8fa5\u8fe9\u8fea\u8fe6\u8fe4\u8fe9\u8fe0\u8ff6\u8fbf\u8fa5", 530026373), hl.a("\u9bb2\u9b93\u9b88\u9b99\u9bc6\u9bdc\u9bb5\u9b9a\u9bdc\u9b88\u9b94\u9b99\u9bdc\u9b9f\u9b93\u9b92\u9b9a\u9b95\u9b9b\u9b89\u9b8e\u9b99\u9b98\u9bdc\u9b90\u9b93\u9b9f\u9b9d\u9b90\u9b99\u9bdc\u9b95\u9b8f\u9bdc\u9b89\u9b92\u9b8e\u9b99\u9b9f\u9b93\u9b9b\u9b92\u9b95\u9b86\u9b99\u9b98\u9bd0\u9bdc\u9b88\u9b94\u9b99\u9bdc\u9b8f\u9b85\u9b8f\u9b88\u9b99\u9b91\u9bdc\u9b98\u9b99\u9b9a\u9b9d\u9b89\u9b90\u9b88\u9bdc\u9b90\u9b93\u9b9f\u9b9d\u9b90\u9b99\u9bdc\u9b95\u9b8f\u9bdc\u9b89\u9b8f\u9b99\u9b98\u9bd2", 1410046972), hl.a("\ub0e5\ub0c3\ub0d9\ub0de\ub0d7\ub090\ub0c3\ub0c9\ub0c3\ub0c4\ub0d5\ub0dd\ub090\ub0dc\ub0df\ub0d3\ub0d1\ub0dc\ub0d5\ub090\ub098", -669798224), hl.a("\u228f\u22f5\u22f5\u2289\u22f4\u2297\u22bb\u22a1\u22b8\u22b0\u22f4\u22ba\u22bb\u22a0\u22f4\u22a7\u22b5\u22a2\u22b1\u22f4\u22b9\u22b1\u22a7\u22a7\u22b5\u22b3\u22b1\u22a7\u22fa\u22ad\u22b9\u22b8\u22fa", -193453356), hl.a("\uc618\uc65e\uc65d\uc652\uc652\uc659\uc658\uc66c\uc650\uc65d\uc645\uc659\uc64e", -473540), hl.a("\uf197\uf1d1\uf1d2\uf1dd\uf1dd\uf1d6\uf1d7\uf1e3\uf1df\uf1d2\uf1ca\uf1d6\uf1c1", 515371443), hl.a("\ufe42\ufe04\ufe07\ufe08\ufe08\ufe03\ufe02\ufe36\ufe0a\ufe07\ufe1f\ufe03\ufe14", 1869413990), hl.a("\uc89c\uc8d5\uc8cd\uc8cc\uc8dd\uc8dc\uc8e8\uc8d4\uc8d9\uc8c1\uc8dd\uc8ca", 1708574904), hl.a("\u4fc3\u4f85\u4f86\u4f89\u4f89\u4f82\u4f83\u4fb7\u4f8b\u4f86\u4f9e\u4f82\u4f95", -74887193), hl.a("\u20cd\u209e\u2088\u209b\u2087\u208c\u208d\u20b9\u2085\u2088\u2090\u208c\u209b", 611983593), hl.a("\u09bb\u09fa\u09be\u09bb\u09ed", -219477602), hl.a("\u05ac\u059d\u059a\u0589\u059c\u0581\u0587\u0586\u05c8\u058e\u0587\u059a\u0585\u0589\u059c\u05c8\u05c0\u05ca", -89455128), hl.a("\u979f\u9794\u979d\u97d4\u97ce\u979d\u97d4\u97d3\u97cb\u97dc\u97d1\u97d4\u97d9\u979c\u979d\u9795", -972449859), hl.a("\u49bf\u4999\u4983\u4984\u498d\u49ca\u498e\u498f\u498c\u498b\u499f\u4986\u499e\u49ca\u498c\u4985\u4998\u4987\u498b\u499e\u49ca\u4983\u4984\u4999\u499e\u498f\u498b\u498e\u49ca\u49c2\u49c8", 708069866), hl.a("\u90b2\u90b9\u90be", -1614442352), hl.a("\uc54b\uc50d\uc50e\uc501\uc501\uc50a\uc50b\uc53f\uc503\uc50e\uc516\uc50a\uc51d", -1767651985), hl.a("\ud110\ud156\ud155\ud15a\ud15a\ud151\ud150\ud164\ud158\ud155\ud14d\ud151\ud146", -1665019596), hl.a("\u20d5\u2093\u2090\u209f\u209f\u2094\u2095\u20a1\u209d\u2090\u2088\u2094\u2083", -874372879), hl.a("\u9402\u944b\u9453\u9452\u9443\u9442\u9476\u944a\u9447\u945f\u9443\u9454", -1366977498), hl.a("\uda74\uda32\uda31\uda3e\uda3e\uda35\uda34\uda00\uda3c\uda31\uda29\uda35\uda22", -462890416), hl.a("\u9ad4\u9a87\u9a91\u9a82\u9a9e\u9a95\u9a94\u9aa0\u9a9c\u9a91\u9a89\u9a95\u9a82", -296445200), hl.a("\ufb9a\ufbdb\ufb9f\ufb9a\ufbcc", 302709695), hl.a("\u0dac\u0d9d\u0d9a\u0d89\u0d9c\u0d81\u0d87\u0d86\u0dc8\u0d8e\u0d87\u0d9a\u0d85\u0d89\u0d9c\u0dc8\u0dc0\u0dca", 1492782568), hl.a("\u47e0\u47eb\u47e2\u47ab\u47b1\u47e2\u47ab\u47ac\u47b4\u47a3\u47ae\u47ab\u47a6\u47e3\u47e2\u47ea", 1315522498), hl.a("\uc755\uc773\uc769\uc76e\uc767\uc720\uc764\uc765\uc766\uc761\uc775\uc76c\uc774\uc720\uc766\uc76f\uc772\uc76d\uc761\uc774\uc720\uc769\uc76e\uc773\uc774\uc765\uc761\uc764\uc720\uc728\uc722", -404044032), hl.a("\u9212\u9219\u921e", 1767936560), hl.a("\u9ced\u9ce5\u9cf3\u9cf3\u9ce1\u9ce7\u9ce5\u9cf3", -864248704), hl.a("\ubb25\ubb5f\ubb5f\ubb23\ubb5e", -312165506), hl.a("\u0443\u0414\u0400\u0401", -792787859), hl.a("\u8a3b\u8a76\u8a7a\u8a62\u8a3b\u8a79\u8a7e\u8a3b\u8a72\u8a75\u8a6d\u8a7a\u8a77\u8a72\u8a7f\u8a35\u8a3b\u8a58\u8a73\u8a7e\u8a78\u8a70\u8a3b\u8a6c\u8a72\u8a6f\u8a73\u8a3b\u8a73\u8a6f\u8a6f\u8a6b\u8a68\u8a21\u8a34\u8a34\u8a62\u8a7a\u8a76\u8a77\u8a36\u8a74\u8a75\u8a77\u8a72\u8a75\u8a7e\u8a36\u8a6b\u8a7a\u8a69\u8a68\u8a7e\u8a69\u8a35\u8a7a\u8a6b\u8a6b\u8a68\u8a6b\u8a74\u8a6f\u8a35\u8a78\u8a74\u8a76", -357529061), hl.a("\u70ae\u70ed\u70e1\u70fb\u70e2\u70ea\u70ae\u70e0\u70e1\u70fa\u70ae\u70ec\u70eb\u70ae\u70ed\u70fc\u70eb\u70ef\u70fa\u70eb\u70ea\u70ae\u70e7\u70e0\u70ae", -2046070642)};
    }

    static {
        k2.f();
    }
}

