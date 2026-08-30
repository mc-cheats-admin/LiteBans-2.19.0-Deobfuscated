package litebans;

import java.util.NoSuchElementException;
public final class LiteBansModule_322
extends LiteBansModule_290 {
    private final int c;
    private final int e;
    private boolean AsyncBackgroundTask_5;
    private int LiteBansModule_31;

    public LiteBansModule_322(int n, int n2, int n3) {
        this.c = n3;
        this.e = n2;
        this.AsyncBackgroundTask_5 = this.c > 0 ? n <= n2 : n >= n2;
        this.LiteBansModule_31 = this.AsyncBackgroundTask_5 ? n : this.e;
    }

    @Override
    public boolean hasNext() {
        return this.AsyncBackgroundTask_5;
    }

    @Override
    public int LiteBansModule_31() {
        int n = this.LiteBansModule_31;
        if (n == this.e) {
            if (!this.AsyncBackgroundTask_5) {
                throw new NoSuchElementException();
            }
            this.AsyncBackgroundTask_5 = false;
        } else {
            this.LiteBansModule_31 += this.c;
        }
        return n;
    }
}

