package litebans;

import java.awt.Color;
public final class LiteBansModule_10 {
    private LiteBansType e;
    private Color c;
    private String LiteBansModule_194;
    private Boolean BaseCoreGenericHandler;
    private Boolean LiteBansModule_31;
    private Boolean LiteBansModule_240;
    private Boolean g;
    private Boolean AsyncBackgroundTask_5;

    public LiteBansModule_10 BaseCoreGenericHandler(LiteBansType gq2) {
        this.e = gq2;
        return this;
    }

    public LiteBansModule_10 BaseCoreGenericHandler(Color color) {
        this.c = color;
        return this;
    }

    public LiteBansModule_10 BaseCoreGenericHandler(String string) {
        this.LiteBansModule_194 = string;
        return this;
    }

    public LiteBansModule_10 c(Boolean flag) {
        this.plugin = flag;
        return this;
    }

    public LiteBansModule_10 BaseCoreGenericHandler(Boolean flag) {
        this.LiteBansModule_31 = flag;
        return this;
    }

    public LiteBansModule_10 e(Boolean flag) {
        this.LiteBansModule_240 = flag;
        return this;
    }

    public LiteBansModule_10 LiteBansModule_31(Boolean flag) {
        this.g = flag;
        return this;
    }

    public LiteBansModule_10 AsyncBackgroundTask_5(Boolean flag) {
        this.AsyncBackgroundTask_5 = flag;
        return this;
    }

    public LiteBansModule_368 BaseCoreGenericHandler() {
        return new LiteBansModule_368(this.e, this.c, this.LiteBansModule_194, this.plugin, this.LiteBansModule_31, this.LiteBansModule_240, this.g, this.AsyncBackgroundTask_5);
    }
}

