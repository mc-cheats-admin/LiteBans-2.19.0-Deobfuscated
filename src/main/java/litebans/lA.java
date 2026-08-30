package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import litebans.cK;
import litebans.ew;
import litebans.h_;
import litebans.hl;
import litebans.ll;
import litebans.lo_0;
import litebans.lw;
import org.jetbrains.annotations.NotNull;

static class lA
extends lw {
    private static /* synthetic */ String[] b;

    public static final Collection a(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, b[0]);
        return new h_(objectArray, false);
    }

    public static final List e() {
        return cK.c;
    }

    public static final List b(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, b[1]);
        return objectArray.length > 0 ? lo_0.a(objectArray) : ll.e();
    }

    public static final List d(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, b[2]);
        return objectArray.length == 0 ? (List)new ArrayList() : (List)new ArrayList(new h_(objectArray, true));
    }

    public static final ArrayList c(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, b[3]);
        return objectArray.length == 0 ? new ArrayList() : new ArrayList(new h_(objectArray, true));
    }

    public static final int b(@NotNull List list) {
        ew.a((Object)list, b[10]);
        return list.size() - 1;
    }

    public static final List a(@NotNull List list) {
        List list2;
        ew.a((Object)list, b[17]);
        switch (list.size()) {
            case 0: {
                list2 = ll.e();
                break;
            }
            case 1: {
                list2 = ll.a(list.get(0));
                break;
            }
            default: {
                list2 = list;
            }
        }
        return list2;
    }

    public static final void b() {
        throw new ArithmeticException(b[35]);
    }

    public static final void c() {
        throw new ArithmeticException(b[36]);
    }

    private static final void d() {
        b = new String[]{hl.a("\u8ef1\u8eb9\u8ea5\u8ea4\u8ebe\u8ef3", -1993306419), hl.a("\u9446\u944f\u9446\u944e\u9446\u944d\u9457\u9450", 680498211), hl.a("\u7068\u7061\u7068\u7060\u7068\u7063\u7079\u707e", 937390093), hl.a("\uc9b8\uc9b1\uc9b8\uc9b0\uc9b8\uc9b3\uc9a9\uc9ae", -1071658531), hl.a("\u3c3c\u3c35\u3c3c\u3c34\u3c3c\u3c37\u3c2d\u3c2a", 416037977), hl.a("\ub488\ub48f\ub488\ub495", -1991068447), hl.a("\u58df\u58d8\u58df\u58c2", -1089775434), hl.a("\uc786\uc791\uc78d\uc788\uc780\uc781\uc796\uc7a5\uc787\uc790\uc78d\uc78b\uc78a", 1198376932), hl.a("\u6c64\u6c73\u6c6f\u6c6a\u6c62\u6c63\u6c74\u6c47\u6c65\u6c72\u6c6f\u6c69\u6c68", -1063097338), hl.a("\uf8c0\uf888\uf894\uf895\uf88f\uf8c2", 1819146492), hl.a("\uf429\uf461\uf47d\uf47c\uf466\uf42b", 1280504853), hl.a("\u6523\u656b\u6577\u6576\u656c\u6521", -1011718881), hl.a("\ue3e3\ue3e2\ue3e1\ue3e6\ue3f2\ue3eb\ue3f3\ue3d1\ue3e6\ue3eb\ue3f2\ue3e2", 24503175), hl.a("\u9668\u9620\u963c\u963d\u9627\u966a", 1544263252), hl.a("\u45bd\u45b4\u45bd\u45b5\u45bd\u45b6\u45ac\u45ab", 893339096), hl.a("\u9adc\u9a94\u9a88\u9a89\u9a93\u9ade", -1183802656), hl.a("\u8fda\u8fc9\u8fc6\u8fcc\u8fc7\u8fc5", 1564774312), hl.a("\ud3c6\ud38e\ud392\ud393\ud389\ud3c4", 754897914), hl.a("\uaec9\uae81\uae9d\uae9c\uae86\uaecb", -1100960011), hl.a("\u22b9\u22f1\u22ed\u22ec\u22f6\u22bb", 845030021), hl.a("\u533e\u5332\u5330\u532d\u533c\u532f\u533c\u5329\u5332\u532f", 1323783005), hl.a("\u6248\u6200\u621c\u621d\u6207\u624a", -2022743436), hl.a("\ubc2d\ubc3b\ubc32\ubc3b\ubc3d\ubc2a\ubc31\ubc2c", 1086504030), hl.a("\u7ce7\u7caf\u7cb3\u7cb2\u7ca8\u7ce5", 233733339), hl.a("\ufc85\ufc93\ufc9a\ufc93\ufc95\ufc82\ufc99\ufc84", -2053767946), hl.a("\u7d83\u7dcb\u7dd7\u7dd6\u7dcc\u7d81", -1755087425), hl.a("\uc8a0\uc8ac\uc8ae\uc8b3\uc8a2\uc8b1\uc8aa\uc8b0\uc8ac\uc8ad", -746600253), hl.a("\u2f04\u2f10\u2f0d\u2f0f\u2f2b\u2f0c\u2f06\u2f07\u2f1a\u2f42\u2f4a", 2102931298), hl.a("\u03f7\u03fe\u03b7\u03ad\u03fe\u03b9\u03ac\u03bb\u03bf\u03aa\u03bb\u03ac\u03fe\u03aa\u03b6\u03bf\u03b0\u03fe\u03aa\u03b1\u0397\u03b0\u03ba\u03bb\u03a6\u03fe\u03f6", 982123486), hl.a("\uc671\uc676", -150354344), hl.a("\ufad6\ufac2\ufadf\ufadd\ufaf9\ufade\ufad4\ufad5\ufac8\ufa90\ufa98", 792394416), hl.a("\u2d33\u2d3a\u2d73\u2d69\u2d3a\u2d76\u2d7f\u2d69\u2d69\u2d3a\u2d6e\u2d72\u2d7b\u2d74\u2d3a\u2d60\u2d7f\u2d68\u2d75\u2d34", -1667289830), hl.a("\u2c11\u2c0a\u2c2c\u2c0b\u2c01\u2c00\u2c1d\u2c45\u2c4d", -1464325019), hl.a("\u9841\u9848\u9801\u981b\u9848\u980f\u981a\u980d\u9809\u981c\u980d\u981a\u9848\u981c\u9800\u9809\u9806\u9848\u981b\u9801\u9812\u980d\u9848\u9840", -693725080), hl.a("\u1c3d\u1c3a", -1167385580), hl.a("\u52da\u52fd\u52f7\u52f6\u52eb\u52b3\u52fc\u52e5\u52f6\u52e1\u52f5\u52ff\u52fc\u52e4\u52b3\u52fb\u52f2\u52e0\u52b3\u52fb\u52f2\u52e3\u52e3\u52f6\u52fd\u52f6\u52f7\u52bd", -242789741), hl.a("\u3ce3\u3ccf\u3cd5\u3cce\u3cd4\u3c80\u3ccf\u3cd6\u3cc5\u3cd2\u3cc6\u3ccc\u3ccf\u3cd7\u3c80\u3cc8\u3cc1\u3cd3\u3c80\u3cc8\u3cc1\u3cd0\u3cd0\u3cc5\u3cce\u3cc5\u3cc4\u3c8e", 2041658528), hl.a("\u2773\u277f\u277c\u277c\u2775\u2773\u2764\u2779\u277f\u277e", -901568752), hl.a("\u7fac\u7fa0\u7fa3\u7fa3\u7faa\u7fac\u7fbb\u7fa6\u7fa0\u7fa1", -1242791985), hl.a("\u0a8f\u0a9c\u0a9c\u0a8f\u0a97", 326568686)};
    }

    static {
        lA.d();
    }
}

