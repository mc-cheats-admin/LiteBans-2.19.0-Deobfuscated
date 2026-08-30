package litebans;

import java.util.ArrayList;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_368 {
    private final LiteBansModule_325 BaseCoreGenericHandler;
    private byte[] LiteBansModule_31;
        public LiteBansModule_368(@NotNull LiteBansModule_325 iX2, @NotNull byte[] byArray) {
        this.plugin = iX2;
        this.LiteBansModule_31 = byArray;
        if (this.LiteBansModule_31 == LiteBansModule_391.BaseCoreGenericHandler()) {
            LiteBansModule_368 k92 = this;
            k92.LiteBansModule_31 = new byte[8192];
        }
    }

    public /* synthetic */ LiteBansModule_368(LiteBansModule_325 iX2, byte[] byArray, int n, LiteBansModule_14 aJ2) {
        if ((n & 2) != 0) {
            byArray = LiteBansModule_391.BaseCoreGenericHandler();
        }
        this(iX2, byArray);
    }

    public final byte[] LiteBansModule_31() {
        return this.LiteBansModule_31;
    }

    public final void BaseCoreGenericHandler(@NotNull byte[] byArray) {
        this.LiteBansModule_31 = byArray;
    }

    public final int BaseCoreGenericHandler(@NotNull SortHandler br2, byte by2) {
        if (by2 < 0) {
            this.plugin.LiteBansModule_31();
            return 0;
        }
        int n = this.plugin.LiteBansModule_31(this.LiteBansModule_31.length);
        if (br2.GnuSparseMapHandler()) {
            if (br2.e().isEmpty()) {
                br2.LiteBansModule_31(new ArrayList(this.LiteBansModule_31.length));
            }
            br2.LiteBansModule_31(CollectionUtilities.BaseCoreGenericHandler((Collection)br2.e(), (Object)LiteBansModule_373.BaseCoreGenericHandler(n, by2)));
            return 0;
        }
        return this.LiteBansModule_31[n];
    }

    public String toString() {
        return "Bitflipper(table=" + ArrayUtilities.BaseCoreGenericHandler(this.LiteBansModule_31, (CharSequence)",", null, null, 0, null, LiteBansModule_368::BaseCoreGenericHandler, 30, null) + ')';
    }

    private static final CharSequence BaseCoreGenericHandler(byte by2) {
        return "0b" + Integer.toString(by2, LiteBansModule_339.BaseCoreGenericHandler(2));
    }

    private static final void BaseCoreGenericHandler() {
        c = new String[]{"Bitflipper(table=", ",", "0b"};
    }

    static {
        LiteBansModule_368.BaseCoreGenericHandler();
    }
}

