package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class LiteBansModule_333
implements Iterator,
LiteBansModule_122 {
    private int LiteBansModule_194 = -1;
    private int AsyncBackgroundTask_5;
    private int c;
    private LiteBansModule_166 g;
    private int BaseCoreGenericHandler;
    final /* synthetic */ InputHandler_2 LiteBansModule_31;
    LiteBansModule_333(InputHandler_2 ee_02) {
        this.LiteBansModule_31 = ee_02;
        this.c = this.AsyncBackgroundTask_5 = LiteBansModule_20.BaseCoreGenericHandler(InputHandler_2.BaseCoreGenericHandler(ee_02), 0, InputHandler_2.c(ee_02).length());
    }

    private final void c() {
{
                    if (this.c >= 0) break;
                    this.LiteBansModule_194 = 0;
                    this.g = null;
                    break;
                }
                if (InputHandler_2.AsyncBackgroundTask_5(this.LiteBansModule_31) <= 0) break;
                ++this.plugin;
                if (this.plugin >= InputHandler_2.AsyncBackgroundTask_5(this.LiteBansModule_31)) ** GOTO lbl-1000
            }
            if (this.c > InputHandler_2.c(this.LiteBansModule_31).length()) lbl-1000:
                        {
                this.g = new LiteBansModule_166(this.AsyncBackgroundTask_5, StringUtilities.BaseCoreGenericHandler(InputHandler_2.c(this.LiteBansModule_31)));
                this.c = -1;
            } else {
                v1 = (LiteBansModule_354)InputHandler_2.LiteBansModule_31(this.LiteBansModule_31).BaseCoreGenericHandler(InputHandler_2.c(this.LiteBansModule_31), this.c);
                if (v1 == null) {
                    this.g = new LiteBansModule_166(this.AsyncBackgroundTask_5, StringUtilities.BaseCoreGenericHandler(InputHandler_2.c(this.LiteBansModule_31)));
                    this.c = -1;
                } else {
                    v2 = ((Number)v1.BaseCoreGenericHandler()).intValue();
                    v3 = ((Number)v1.c()).intValue();
                    this.g = LiteBansModule_20.LiteBansModule_31(this.AsyncBackgroundTask_5, v2);
                    this.AsyncBackgroundTask_5 = v2 + v3;
                    this.c = this.AsyncBackgroundTask_5 + (v3 == 0 ? 1 : 0);
}
            this.LiteBansModule_194 = 1;
}

    public LiteBansModule_166 BaseCoreGenericHandler() {
        if (this.LiteBansModule_194 == -1) {
            this.c();
        }
        if (this.LiteBansModule_194 == 0) {
            throw new NoSuchElementException();
        }
        LiteBansModule_166 eI2 = this.g;
        ObjectUtilities.LiteBansModule_31(eI2, "");
        LiteBansModule_166 eI3 = eI2;
        this.g = null;
        this.LiteBansModule_194 = -1;
        return eI3;
    }

    @Override
    public boolean hasNext() {
        if (this.LiteBansModule_194 == -1) {
            this.c();
        }
        return this.LiteBansModule_194 == 1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object next() {
        return this.plugin();
    }

    private static final void LiteBansModule_31() {
        e = new String[]{"", "Operation is not supported for read-only collection"};
}

