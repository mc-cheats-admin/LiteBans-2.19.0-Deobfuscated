package litebans;

import java.util.Arrays;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

public final class l6 {
    private final q_0 b;
    private final CharSequence[] a;

    public l6(@NotNull q_0 q_02, @NotNull CharSequence[] charSequenceArray) {
        this.b = q_02;
        this.a = charSequenceArray;
    }

    public final q_0 c() {
        return this.b;
    }

    public final CharSequence[] a() {
        return this.a;
    }

    public final int b() {
        CharSequence[] charSequenceArray = this.a;
        return this.b.a(Arrays.copyOf(charSequenceArray, charSequenceArray.length));
    }
}

