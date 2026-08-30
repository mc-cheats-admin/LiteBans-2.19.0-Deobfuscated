package litebans;

import java.io.Closeable;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.UUID;
import litebans.aJ;
import litebans.ch;
import litebans.hy_0;
import litebans.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static class bT
implements Closeable {
    private final ch a;
    private final PreparedStatement b;
    private final String c;
    private byte d;

    private bT(ch ch2, PreparedStatement preparedStatement, String string) {
        this.a = ch2;
        this.b = preparedStatement;
        this.c = string;
    }

    public final ch c() {
        return this.a;
    }

    public final PreparedStatement b() {
        return this.b;
    }

    public final String a() {
        return this.c;
    }

    public bT a(boolean bl) {
        bT bT2;
        bT bT3 = bT2 = this;
        boolean bl2 = false;
        bT bT4 = this;
        boolean bl3 = false;
        bT4.d = hy_0.a((byte)(bT4.d + 1));
        this.b.setBoolean(bT4.d & 0xFF, bl);
        return bT2;
    }

    public final bT a(@NotNull byte[] byArray) {
        bT bT2;
        bT bT3 = bT2 = this;
        boolean bl = false;
        bT bT4 = this;
        boolean bl2 = false;
        bT4.d = hy_0.a((byte)(bT4.d + 1));
        this.b.setBytes(bT4.d & 0xFF, byArray);
        return bT2;
    }

    public final bT a(byte by2) {
        bT bT2;
        bT bT3 = bT2 = this;
        boolean bl = false;
        bT bT4 = this;
        boolean bl2 = false;
        bT4.d = hy_0.a((byte)(bT4.d + 1));
        this.b.setInt(bT4.d & 0xFF, by2 & 0xFF);
        return bT2;
    }

    public final bT a(int n) {
        bT bT2;
        bT bT3 = bT2 = this;
        boolean bl = false;
        bT bT4 = this;
        boolean bl2 = false;
        bT4.d = hy_0.a((byte)(bT4.d + 1));
        this.b.setInt(bT4.d & 0xFF, n);
        return bT2;
    }

    public final bT a(long l3) {
        bT bT2;
        bT bT3 = bT2 = this;
        boolean bl = false;
        bT bT4 = this;
        boolean bl2 = false;
        bT4.d = hy_0.a((byte)(bT4.d + 1));
        this.b.setLong(bT4.d & 0xFF, l3);
        return bT2;
    }

    public final bT a(@NotNull Number number) {
        bT bT2;
        bT bT3 = bT2 = this;
        boolean bl = false;
        bT bT4 = this;
        boolean bl2 = false;
        bT4.d = hy_0.a((byte)(bT4.d + 1));
        this.b.setLong(bT4.d & 0xFF, number.longValue());
        return bT2;
    }

    public final bT a(@Nullable String string) {
        bT bT2;
        bT bT3 = bT2 = this;
        boolean bl = false;
        bT bT4 = this;
        boolean bl2 = false;
        bT4.d = hy_0.a((byte)(bT4.d + 1));
        this.b.setString(bT4.d & 0xFF, string);
        return bT2;
    }

    public final bT a(@NotNull Timestamp timestamp) {
        bT bT2;
        bT bT3 = bT2 = this;
        boolean bl = false;
        bT bT4 = this;
        boolean bl2 = false;
        bT4.d = hy_0.a((byte)(bT4.d + 1));
        this.b.setTimestamp(bT4.d & 0xFF, timestamp);
        return bT2;
    }

    public final bT a(@NotNull UUID uUID) {
        return this.a(i0.a(uUID));
    }

    @Override
    public void close() {
        this.b.close();
    }

    public /* synthetic */ bT(ch ch2, PreparedStatement preparedStatement, String string, aJ aJ2) {
        this(ch2, preparedStatement, string);
    }
}

