package litebans;

import litebans.er_0;

public final class de_0 {
    public static final er_0 c = new er_0(null);
    private final int d;
    private final int b;
    private final int a;

    public de_0(int n, int n2, int n3) {
        this.d = n;
        this.b = n2;
        this.a = n3;
    }

    public final boolean a(int n, int n2, int n3) {
        if (this.d > n) {
            return true;
        }
        if (this.b > n2) {
            return true;
        }
        if (this.b < n2) {
            return false;
        }
        return this.a >= n3;
    }

    public String toString() {
        if (this.d >= 100 && this.b == 0 && this.a == 0) {
            return "" + '#' + this.d;
        }
        return "" + this.d + '.' + this.b + '.' + this.a;
    }
}

