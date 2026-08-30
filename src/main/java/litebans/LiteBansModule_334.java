package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class LiteBansModule_334
implements Iterator,
LiteBansModule_123 {
    private int LiteBansModule_195 = -1;
    private int AsyncBackgroundTask_5;
    private int c;
    private LiteBansModule_167 g;
    private int BaseCoreGenericHandler;
    final /* synthetic */ InputHandler_2 LiteBansModule_31;
        LiteBansModule_334(InputHandler_2 ee_02) {
        this.LiteBansModule_31 = ee_02;
        this.c = this.AsyncBackgroundTask_5 = LiteBansModule_20.BaseCoreGenericHandler(InputHandler_2.BaseCoreGenericHandler(ee_02), 0, InputHandler_2.c(ee_02).length());
    }

    private final void c() {
        block5: {
            block6: {
                block4: {
                    if (this.c >= 0) break block4;
                    this.LiteBansModule_195 = 0;
                    this.g = null;
                    break block5;
                }
                if (InputHandler_2.AsyncBackgroundTask_5(this.LiteBansModule_31) <= 0) break block6;
                ++this.plugin;
                if (this.plugin >= InputHandler_2.AsyncBackgroundTask_5(this.LiteBansModule_31)) ** GOTO lbl-1000
            }
            if (this.c > InputHandler_2.c(this.LiteBansModule_31).length()) lbl-1000:
                        {
                this.g = new LiteBansModule_167(this.AsyncBackgroundTask_5, StringUtilities.BaseCoreGenericHandler(InputHandler_2.c(this.LiteBansModule_31)));
                this.c = -1;
            } else {
                v1 = (LiteBansModule_356)InputHandler_2.LiteBansModule_31(this.LiteBansModule_31).BaseCoreGenericHandler(InputHandler_2.c(this.LiteBansModule_31), this.c);
                if (v1 == null) {
                    this.g = new LiteBansModule_167(this.AsyncBackgroundTask_5, StringUtilities.BaseCoreGenericHandler(InputHandler_2.c(this.LiteBansModule_31)));
                    this.c = -1;
                } else {
                    v2 = ((Number)v1.BaseCoreGenericHandler()).intValue();
                    v3 = ((Number)v1.c()).intValue();
                    this.g = LiteBansModule_20.LiteBansModule_31(this.AsyncBackgroundTask_5, v2);
                    this.AsyncBackgroundTask_5 = v2 + v3;
                    this.c = this.AsyncBackgroundTask_5 + (v3 == 0 ? 1 : 0);
                }
            }
            this.LiteBansModule_195 = 1;
        }
    }

    public LiteBansModule_167 BaseCoreGenericHandler() {
        if (this.LiteBansModule_195 == -1) {
            this.c();
        }
        if (this.LiteBansModule_195 == 0) {
            throw new NoSuchElementException();
        }
        LiteBansModule_167 eI2 = this.g;
        ObjectUtilities.LiteBansModule_31(eI2, "");
        LiteBansModule_167 eI3 = eI2;
        this.g = null;
        this.LiteBansModule_195 = -1;
        return eI3;
    }

    @Override
    public boolean hasNext() {
        if (this.LiteBansModule_195 == -1) {
            this.c();
        }
        return this.LiteBansModule_195 == 1;
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

    static {
        LiteBansModule_334.LiteBansModule_31();
    }
}

