package litebans;

import java.util.ArrayList;
import java.util.List;
public class LiteBansModule_137
implements LiteBansModule_413 {
    private final boolean ap;
    private List TapeHandler;

    public LiteBansModule_137(byte[] byArray) {
        this.TapeHandler = new ArrayList();
        for (int i = 0; i < 21; ++i) {
            LiteBansModule_293 i72 = LiteBansModule_357.LiteBansModule_31(byArray, n + i * 24);
            if (i72.BaseCoreGenericHandler() <= 0L && i72.LiteBansModule_31() <= 0L) continue;
            this.TapeHandler.add(i72);
        }
        this.ap = LiteBansModule_357.BaseCoreGenericHandler(byArray, n += 504);
    }

    public boolean LiteBansModule_31() {
        return this.ap;
    }

    public List BaseCoreGenericHandler() {
        return this.TapeHandler;
    }
}

