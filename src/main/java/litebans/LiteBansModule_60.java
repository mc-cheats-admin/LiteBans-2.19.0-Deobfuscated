package litebans;

import java.io.Closeable;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LiteBansModule_60
implements Closeable {
    private final LiteBansModule_82 BaseCoreGenericHandler;
    private final PreparedStatement LiteBansModule_31;
    private final String c;
    private byte AsyncBackgroundTask_5;

    private LiteBansModule_60(LiteBansModule_82 ch2, PreparedStatement preparedStatement, String string) {
        this.plugin = ch2;
        this.LiteBansModule_31 = preparedStatement;
        this.c = string;
    }

    public final LiteBansModule_82 c() {
        return this.plugin;
    }

    public final PreparedStatement LiteBansModule_31() {
        return this.LiteBansModule_31;
    }

    public final String BaseCoreGenericHandler() {
        return this.c;
    }

    public LiteBansModule_60 BaseCoreGenericHandler(boolean flag) {
        LiteBansModule_60 bT2;
        LiteBansModule_60 bT3 = bT2 = this;
        LiteBansModule_60 bT4 = this;
        bT4.AsyncBackgroundTask_5 = LiteBansModule_283.BaseCoreGenericHandler((byte)(bT4.AsyncBackgroundTask_5 + 1));
        this.LiteBansModule_31.setBoolean(bT4.AsyncBackgroundTask_5 & 0xFF, flag);
        return bT2;
    }

    public final LiteBansModule_60 BaseCoreGenericHandler(@NotNull byte[] byArray) {
        LiteBansModule_60 bT2;
        LiteBansModule_60 bT3 = bT2 = this;
        LiteBansModule_60 bT4 = this;
        bT4.AsyncBackgroundTask_5 = LiteBansModule_283.BaseCoreGenericHandler((byte)(bT4.AsyncBackgroundTask_5 + 1));
        this.LiteBansModule_31.setBytes(bT4.AsyncBackgroundTask_5 & 0xFF, byArray);
        return bT2;
    }

    public final LiteBansModule_60 BaseCoreGenericHandler(byte by2) {
        LiteBansModule_60 bT2;
        LiteBansModule_60 bT3 = bT2 = this;
        LiteBansModule_60 bT4 = this;
        bT4.AsyncBackgroundTask_5 = LiteBansModule_283.BaseCoreGenericHandler((byte)(bT4.AsyncBackgroundTask_5 + 1));
        this.LiteBansModule_31.setInt(bT4.AsyncBackgroundTask_5 & 0xFF, by2 & 0xFF);
        return bT2;
    }

    public final LiteBansModule_60 BaseCoreGenericHandler(int n) {
        LiteBansModule_60 bT2;
        LiteBansModule_60 bT3 = bT2 = this;
        LiteBansModule_60 bT4 = this;
        bT4.AsyncBackgroundTask_5 = LiteBansModule_283.BaseCoreGenericHandler((byte)(bT4.AsyncBackgroundTask_5 + 1));
        this.LiteBansModule_31.setInt(bT4.AsyncBackgroundTask_5 & 0xFF, n);
        return bT2;
    }

    public final LiteBansModule_60 BaseCoreGenericHandler(long l3) {
        LiteBansModule_60 bT2;
        LiteBansModule_60 bT3 = bT2 = this;
        LiteBansModule_60 bT4 = this;
        bT4.AsyncBackgroundTask_5 = LiteBansModule_283.BaseCoreGenericHandler((byte)(bT4.AsyncBackgroundTask_5 + 1));
        this.LiteBansModule_31.setLong(bT4.AsyncBackgroundTask_5 & 0xFF, l3);
        return bT2;
    }

    public final LiteBansModule_60 BaseCoreGenericHandler(@NotNull Number number) {
        LiteBansModule_60 bT2;
        LiteBansModule_60 bT3 = bT2 = this;
        LiteBansModule_60 bT4 = this;
        bT4.AsyncBackgroundTask_5 = LiteBansModule_283.BaseCoreGenericHandler((byte)(bT4.AsyncBackgroundTask_5 + 1));
        this.LiteBansModule_31.setLong(bT4.AsyncBackgroundTask_5 & 0xFF, number.longValue());
        return bT2;
    }

    public final LiteBansModule_60 BaseCoreGenericHandler(@Nullable String string) {
        LiteBansModule_60 bT2;
        LiteBansModule_60 bT3 = bT2 = this;
        LiteBansModule_60 bT4 = this;
        bT4.AsyncBackgroundTask_5 = LiteBansModule_283.BaseCoreGenericHandler((byte)(bT4.AsyncBackgroundTask_5 + 1));
        this.LiteBansModule_31.setString(bT4.AsyncBackgroundTask_5 & 0xFF, string);
        return bT2;
    }

    public final LiteBansModule_60 BaseCoreGenericHandler(@NotNull Timestamp timestamp) {
        LiteBansModule_60 bT2;
        LiteBansModule_60 bT3 = bT2 = this;
        LiteBansModule_60 bT4 = this;
        bT4.AsyncBackgroundTask_5 = LiteBansModule_283.BaseCoreGenericHandler((byte)(bT4.AsyncBackgroundTask_5 + 1));
        this.LiteBansModule_31.setTimestamp(bT4.AsyncBackgroundTask_5 & 0xFF, timestamp);
        return bT2;
    }

    public final LiteBansModule_60 BaseCoreGenericHandler(@NotNull UUID uUID) {
        return this.plugin(LiteBansModule_286.BaseCoreGenericHandler(uUID));
    }

    @Override
    public void close() {
        this.LiteBansModule_31.close();
    }

    public /* synthetic */ LiteBansModule_60(LiteBansModule_82 ch2, PreparedStatement preparedStatement, String string, LiteBansModule_14 aJ2) {
        this(ch2, preparedStatement, string);
}

