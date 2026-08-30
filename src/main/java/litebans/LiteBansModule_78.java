package litebans;

public final class LiteBansModule_78 {
    private static final int BaseCoreGenericHandler(int n, int n2) {
        int n3 = n % n2;
        return n3 >= 0 ? n3 : n3 + n2;
    }

    private static final int BaseCoreGenericHandler(int n, int n2, int n3) {
        return LiteBansModule_78.BaseCoreGenericHandler(LiteBansModule_78.BaseCoreGenericHandler(n, n3) - LiteBansModule_78.BaseCoreGenericHandler(n2, n3), n3);
    }

    public static final int LiteBansModule_31(int n, int n2, int n3) {
        int n4;
        if (n3 > 0) {
            n4 = n >= n2 ? n2 : n2 - LiteBansModule_78.BaseCoreGenericHandler(n2, n, n3);
        } else if (n3 < 0) {
            n4 = n <= n2 ? n2 : n2 + LiteBansModule_78.BaseCoreGenericHandler(n, n2, -n3);
        } else {
            throw new IllegalArgumentException("Step is ");
        }
        return n4;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"Step is ", "Step is zero."};
}

