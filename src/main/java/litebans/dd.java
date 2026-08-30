package litebans;

import litebans.dd_0;

static final class dd
implements dd_0 {
    dd() {
    }

    @Override
    public String a(byte[] byArray) {
        int n = byArray.length;
        StringBuilder stringBuilder = new StringBuilder(n);
        for (byte by2 : byArray) {
            if (by2 == 0) break;
            stringBuilder.append((char)(by2 & 0xFF));
        }
        return stringBuilder.toString();
    }
}

