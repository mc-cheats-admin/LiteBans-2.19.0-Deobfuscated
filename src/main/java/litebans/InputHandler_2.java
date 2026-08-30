package litebans;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

static final class InputHandler_2
implements LiteBansModule_295 {
    private final CharSequence e;
    private final int AsyncBackgroundTask_5;
    private final int BaseCoreGenericHandler;
    private final LiteBansModule_96 LiteBansModule_31;
    public InputHandler_2(@NotNull CharSequence charSequence, int n, int n2, @NotNull LiteBansModule_96 cQ2) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "input");
        ObjectUtilities.BaseCoreGenericHandler(cQ2, "getNextMatch");
        this.e = charSequence;
        this.AsyncBackgroundTask_5 = n;
        this.plugin = n2;
        this.LiteBansModule_31 = cQ2;
    }

    @Override
    public Iterator BaseCoreGenericHandler() {
        return new LiteBansModule_333(this);
    }

    public static final /* synthetic */ int BaseCoreGenericHandler(InputHandler_2 ee_02) {
        return ee_02.AsyncBackgroundTask_5;
    }

    public static final /* synthetic */ CharSequence c(InputHandler_2 ee_02) {
        return ee_02.e;
    }

    public static final /* synthetic */ int AsyncBackgroundTask_5(InputHandler_2 ee_02) {
        return ee_02.BaseCoreGenericHandler;
    }

    public static final /* synthetic */ LiteBansModule_96 LiteBansModule_31(InputHandler_2 ee_02) {
        return ee_02.LiteBansModule_31;
    }

    private static final void BaseCoreGenericHandler() {
        c = new String[]{"input", "getNextMatch"};
}

