package litebans;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_211 {
    private String e;
    private String LiteBansModule_31;
    private String AsyncBackgroundTask_5;
    private int LiteBansModule_194;
    private LiteBansModule_25 c;
    private String i;
    private LiteBansModule_6 LiteBansModule_240;
    private LiteBansModule_141 BaseCoreGenericHandler;
    private final List g;

    public LiteBansModule_211(@Nullable String string, @Nullable String string2, @Nullable String string3, int n, @Nullable LiteBansModule_25 aw2, @Nullable String string4, @Nullable LiteBansModule_6 a92, @Nullable LiteBansModule_141 dw2, @NotNull List list) {
        this.e = string;
        this.LiteBansModule_31 = string2;
        this.AsyncBackgroundTask_5 = string3;
        this.LiteBansModule_194 = n;
        this.c = aw2;
        this.i = string4;
        this.LiteBansModule_240 = a92;
        this.plugin = dw2;
        this.g = list;
    }

    public /* synthetic */ LiteBansModule_211(String string, String string2, String string3, int n, LiteBansModule_25 aw2, String string4, LiteBansModule_6 a92, LiteBansModule_141 dw2, List list, int n2, LiteBansModule_14 aJ2) {
        if ((n2 & 1) != 0) {
            string = null;
        }
        if ((n2 & 2) != 0) {
            string2 = null;
        }
        if ((n2 & 4) != 0) {
            string3 = null;
        }
        if ((n2 & 8) != 0) {
            n = 0xFFFFFF;
        }
        if ((n2 & 0x10) != 0) {
            aw2 = null;
        }
        if ((n2 & 0x20) != 0) {
            string4 = null;
        }
        if ((n2 & 0x40) != 0) {
            a92 = null;
        }
        if ((n2 & 0x80) != 0) {
            dw2 = null;
        }
        if ((n2 & 0x100) != 0) {
            list = new ArrayList();
        }
        this(string, string2, string3, n, aw2, string4, a92, dw2, list);
    }

    public final String LiteBansModule_194() {
        return this.e;
    }

    public final String LiteBansModule_240() {
        return this.LiteBansModule_31;
    }

    public final String LiteBansModule_31() {
        return this.AsyncBackgroundTask_5;
    }

    public final int BaseCoreGenericHandler() {
        return this.LiteBansModule_194;
    }

    public final LiteBansModule_25 g() {
        return this.c;
    }

    public final String e() {
        return this.i;
    }

    public final LiteBansModule_6 AsyncBackgroundTask_5() {
        return this.LiteBansModule_240;
    }

    public final LiteBansModule_141 c() {
        return this.plugin;
    }

    public final List i() {
        return this.g;
    }

    public final LiteBansModule_211 BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, boolean flag) {
        this.g.add(new LiteBansModule_21(this, string, string2, flag));
        return this;
    }

    public LiteBansModule_211() {
        this(null, null, null, 0, null, null, null, null, null, 511, null);
    }
}

