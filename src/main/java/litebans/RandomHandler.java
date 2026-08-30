package litebans;

static class RandomHandler
extends ThatHandler {
    public static final LiteBansModule_159 BaseCoreGenericHandler(int n, int n2) {
        return LiteBansModule_159.BaseCoreGenericHandler.BaseCoreGenericHandler(n, n2, -1);
    }

    public static final LiteBansModule_166 LiteBansModule_31(int n, int n2) {
        if (n2 <= Integer.MIN_VALUE) {
            return LiteBansModule_166.LiteBansModule_240.BaseCoreGenericHandler();
        }
        return new LiteBansModule_166(n, n2 - 1);
    }

    public static final int c(int n, int n2) {
        return n < n2 ? n2 : n;
    }

    public static final int AsyncBackgroundTask_5(int n, int n2) {
        return n > n2 ? n2 : n;
    }

    public static final int BaseCoreGenericHandler(int n, int n2, int n3) {
        if (n2 > n3) {
            throw new IllegalArgumentException("Cannot coerce value to HikariDataSource empty range: maximum " + n3 + " is less than minimum " + n2 + '.');
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
}

