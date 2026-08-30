package litebans;

static final class LiteBansModule_119
implements LiteBansModule_120 {
    LiteBansModule_119() {
    }

    @Override
    public String BaseCoreGenericHandler(byte[] byArray) {
        int n = byArray.length;
        StringBuilder stringBuilder = new StringBuilder(n);
        for (byte by2 : byArray) {
            if (by2 == 0) break;
            stringBuilder.append((char)(by2 & 0xFF));
        }
        return stringBuilder.toString();
    }
}

