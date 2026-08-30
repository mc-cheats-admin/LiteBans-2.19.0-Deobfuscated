package litebans;

import java.util.NoSuchElementException;
import litebans.i5;

public static final class iW
extends i5 {
    private final int c;
    private final int e;
    private boolean d;
    private int b;

    public iW(int n, int n2, int n3) {
        this.c = n3;
        this.e = n2;
        this.d = this.c > 0 ? n <= n2 : n >= n2;
        this.b = this.d ? n : this.e;
    }

    @Override
    public boolean hasNext() {
        return this.d;
    }

    @Override
    public int b() {
        int n = this.b;
        if (n == this.e) {
            if (!this.d) {
                throw new NoSuchElementException();
            }
            this.d = false;
        } else {
            this.b += this.c;
        }
        return n;
    }
}

