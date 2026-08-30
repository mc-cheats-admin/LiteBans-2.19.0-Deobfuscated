package litebans;

static class PairHandler
extends DefaultvalueHandler_3 {
    private static final int c = 0x40000000;
    public static final int BaseCoreGenericHandler(int n) {
        return n < 0 ? n : (n < 3 ? n + 1 : (n < 0x40000000 ? (int)((float)n / 0.75f + 1.0f) : Integer.MAX_VALUE));
    }

    }

