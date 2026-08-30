package litebans;

public abstract class LiteBansModule_161 {
        public String toString() {
        return "Content()";
    }

    public boolean equals(Object targetObj) {
        if (targetObj == this) {
            return true;
        }
        if (!(targetObj instanceof LiteBansModule_161)) {
            return false;
        }
        LiteBansModule_161 ed_02 = (LiteBansModule_161)targetObj;
        return ed_02.BaseCoreGenericHandler(this);
    }

    protected boolean BaseCoreGenericHandler(Object targetObj) {
        return targetObj instanceof LiteBansModule_161;
    }

    public int hashCode() {
        return 1;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"Content()"};
    }

    static {
        LiteBansModule_161.BaseCoreGenericHandler();
    }
}

