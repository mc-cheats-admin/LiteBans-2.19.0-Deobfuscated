package litebans;

import java.util.ArrayList;
import java.util.List;
public class LiteBansModule_136
implements LiteBansModule_411 {
    private final boolean ap;
    private List TapeHandler;

    public LiteBansModule_136(byte[] byArray) {
        int n = 0;
        this.TapeHandler = new ArrayList();
        for (int i = 0; i < 21; ++i) {
            LiteBansModule_292 i72 = LiteBansModule_355.LiteBansModule_31(byArray, n + i * 24);
            if (i72.BaseCoreGenericHandler() <= 0L && i72.LiteBansModule_31() <= 0L) continue;
            this.TapeHandler.add(i72);
        }
        this.ap = LiteBansModule_355.BaseCoreGenericHandler(byArray, n += 504);
    }

    public boolean LiteBansModule_31() {
        return this.ap;
    }

    public List BaseCoreGenericHandler() {
        return this.TapeHandler;
    }
}

