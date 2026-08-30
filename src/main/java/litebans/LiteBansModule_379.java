package litebans;

public final class LiteBansModule_379 {
    private final OpenUrlHandler c;
    private final String BaseCoreGenericHandler;
        public OpenUrlHandler BaseCoreGenericHandler() {
        return this.c;
    }

    public String c() {
        return this.plugin;
    }

    public String toString() {
        return "ClickEvent(action=" + (Object)((Object)this.plugin()) + ", value=" + this.c() + ")";
    }

    public boolean equals(Object targetObj) {
        if (targetObj == this) {
            return true;
        }
        if (!(targetObj instanceof LiteBansModule_379)) {
            return false;
        }
        LiteBansModule_379 kf_02 = (LiteBansModule_379)targetObj;
        OpenUrlHandler hm_02 = this.plugin();
        OpenUrlHandler hm_03 = kf_02.BaseCoreGenericHandler();
        if (hm_02 == null ? hm_03 != null : !((Object)((Object)hm_02)).equals((Object)hm_03)) {
            return false;
        }
        String string = this.c();
        String string2 = kf_02.c();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        OpenUrlHandler hm_02 = this.plugin();
        n2 = n2 * 59 + (hm_02 == null ? 43 : ((Object)((Object)hm_02)).hashCode());
        String string = this.c();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    public LiteBansModule_379(OpenUrlHandler hm_02, String string) {
        this.c = hm_02;
        this.plugin = string;
    }

    private static final void LiteBansModule_31() {
        LiteBansModule_31 = new String[]{"ClickEvent(action=", ", value=", ")"};
    }

    static {
        LiteBansModule_379.LiteBansModule_31();
    }
}

