package litebans;

import java.nio.ByteBuffer;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_286 {
    public static final byte[] BaseCoreGenericHandler(@NotNull UUID uUID) {
        return ByteBuffer.wrap(new byte[16]).putLong(uUID.getMostSignificantBits()).putLong(uUID.getLeastSignificantBits()).array();
    }

    public static final UUID BaseCoreGenericHandler(@NotNull byte[] byArray) {
        if (!(byArray.length == 16)) {
            boolean flag = false;
            Integer n = byArray.length;
            throw new IllegalArgumentException(((Object)n).toString());
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        long l3 = byteBuffer.getLong();
        long l5 = byteBuffer.getLong();
        return new UUID(l3, l5);
    }
}

