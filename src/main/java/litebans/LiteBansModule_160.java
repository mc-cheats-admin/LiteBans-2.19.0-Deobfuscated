package litebans;

public abstract class LiteBansModule_160 {
    public String toString() {
        return "Content()";
    }

    public boolean equals(Object targetObj) {
        if (targetObj == this) {
            return true;
        }
        if (!(targetObj instanceof LiteBansModule_160)) {
            return false;
        }
        LiteBansModule_160 ed_02 = (LiteBansModule_160)targetObj;
        return ed_02.BaseCoreGenericHandler(this);
    }

    protected boolean BaseCoreGenericHandler(Object targetObj) {
        return targetObj instanceof LiteBansModule_160;
    }

    public int hashCode() {
        return 1;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"Content()"};
}

