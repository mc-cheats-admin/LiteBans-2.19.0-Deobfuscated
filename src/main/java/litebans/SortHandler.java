package litebans;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SortHandler {
    public static final LiteBansModule_277 P;
    private final long BanHandler_5;
    private final LiteBansModule_324 B;
    private final byte[] LiteBansModule_240;
    private final LiteBansModule_366 ServerSyncService;
    private final boolean J;
    private long O;
    private int c;
    private int T;
    private final byte[] X;
    private final byte[] AsyncBackgroundTask_22;
    private final byte[] HoverTextFormatter;
    private List m;
    private List BaseCoreGenericHandler;
    private byte[][] Utf8Handler_2;
    private boolean q;
    private boolean PunishmentTableService;
    public static final boolean H;
    public static final int CommandThrottleService;
    public static final int LiteBansModule_401;
    public static final boolean LiteBansModule_430;
    public static final char A;
    public static final byte V;
    public static final int BanHandler_2;
    public static final int LiteBansModule_433;
    public static final byte i;
    public static final int W;
    public static final int GnuSparseMapHandler;
    public static final int PlayerQuitListener;
    public static final int n;
    public static final int S;
    public static final int AsyncBackgroundTask_5;
    public static final int r;
    public static final int K;
    public static final boolean z;
    public static final int LockdownService;
    public static final int PluginHookService;
    public static final int g;
    public static final int PunishmentService;
    public static final int DatabaseMonitorService;
    public static final boolean L;
    public static final boolean U;
    public static final boolean BroadcastService;
    public static final boolean F;
    public static final boolean BanHandler_4;
    public static final boolean e;
    public static final boolean D;
    public static final boolean AsyncBackgroundTask_21;
    public static final boolean LiteBansModule_31;
    private SortHandler(long l3, LiteBansModule_324 iX2, byte[] byArray, LiteBansModule_366 k92, boolean flag, long l5, int n, int n2) {
        this.BanHandler_5 = l3;
        this.B = iX2;
        this.LiteBansModule_240 = byArray;
        this.ServerSyncService = k92;
        this.J = flag;
        this.O = l5;
        this.c = n;
        this.T = n2;
        this.X = new byte[80];
        this.AsyncBackgroundTask_22 = new byte[80];
        byte[] byArray2 = new byte[]{32, 16, 8, 4, 2, 1};
        this.HoverTextFormatter = byArray2;
        this.m = CollectionUtilities.e();
        this.plugin = CollectionUtilities.e();
        this.i();
    }

    public /* synthetic */ SortHandler(long l3, LiteBansModule_324 iX2, byte[] byArray, LiteBansModule_366 k92, boolean flag, long l5, int n, int n2, int n3, LiteBansModule_14 aJ2) {
        if ((n3 & 8) != 0) {
            k92 = new LiteBansModule_366(iX2, null, 2, null);
        }
        if ((n3 & 0x10) != 0) {
            flag = false;
        }
        if ((n3 & 0x20) != 0) {
            l5 = 0L;
        }
        if ((n3 & 0x40) != 0) {
            n = 0;
        }
        if ((n3 & 0x80) != 0) {
            n2 = 0;
        }
        this(l3, iX2, byArray, k92, flag, l5, n, n2, null);
    }

    public final long c() {
        return this.BanHandler_5;
    }

    public final LiteBansModule_324 m() {
        return this.B;
    }

    public final LiteBansModule_366 LiteBansModule_31() {
        return this.ServerSyncService;
    }

    public final boolean LiteBansModule_194() {
        return this.J;
    }

    public final byte[] n() {
        return this.X;
    }

    public final byte[] AsyncBackgroundTask_5() {
        return this.AsyncBackgroundTask_22;
    }

    public final List LiteBansModule_401() {
        return this.m;
    }

    public final void BaseCoreGenericHandler(@NotNull List list) {
        this.m = list;
    }

    public final List e() {
        return this.plugin;
    }

    public final void LiteBansModule_31(@NotNull List list) {
        this.plugin = list;
    }

    public final byte[][] BaseCoreGenericHandler() {
        return this.Utf8Handler_2;
    }

    public final void BaseCoreGenericHandler(@Nullable byte[][] byArray) {
        this.Utf8Handler_2 = byArray;
    }

    public final boolean GnuSparseMapHandler() {
        return this.q;
    }

    public final void LiteBansModule_31(boolean flag) {
        this.q = flag;
    }

    public final void BaseCoreGenericHandler(boolean flag) {
        this.PunishmentTableService = flag;
    }

    public final StringBuilder BaseCoreGenericHandler(@NotNull byte[] byArray) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder(byArray.length + 1);
        byte[] byArray2 = byArray;
        int n = byArray2.length;
        for (int i = 0; i < n; ++i) {
            byte by2;
            byte by3 = by2 = byArray2[i];
            SortHandler br2 = this;
            stringBuilder2.append((char)(br2.AsyncBackgroundTask_5()[by3] + 44));
        }
        return stringBuilder;
    }

    public final void i() {
        this.X[53] = 1;
        this.AsyncBackgroundTask_22[1] = 53;
        this.X[57] = 2;
        this.AsyncBackgroundTask_22[2] = 57;
        this.X[71] = 3;
        this.AsyncBackgroundTask_22[3] = 71;
        this.X[64] = 4;
        this.AsyncBackgroundTask_22[4] = 64;
        this.X[70] = 5;
        this.AsyncBackgroundTask_22[5] = 70;
        this.X[61] = 6;
        this.AsyncBackgroundTask_22[6] = 61;
        this.X[65] = 7;
        this.AsyncBackgroundTask_22[7] = 65;
        this.X[66] = 8;
        this.AsyncBackgroundTask_22[8] = 66;
        this.X[67] = 9;
        this.AsyncBackgroundTask_22[9] = 67;
        this.X[72] = 10;
        this.AsyncBackgroundTask_22[10] = 72;
        this.X[63] = 11;
        this.AsyncBackgroundTask_22[11] = 63;
        this.X[55] = 12;
        this.AsyncBackgroundTask_22[12] = 55;
        this.X[56] = 13;
        this.AsyncBackgroundTask_22[13] = 56;
        this.X[73] = 14;
        this.AsyncBackgroundTask_22[14] = 73;
        this.X[51] = 15;
        this.AsyncBackgroundTask_22[15] = 51;
        this.X[5] = 16;
        this.AsyncBackgroundTask_22[16] = 5;
        this.X[54] = 17;
        this.AsyncBackgroundTask_22[17] = 54;
        this.X[68] = 18;
        this.AsyncBackgroundTask_22[18] = 68;
        this.X[60] = 19;
        this.AsyncBackgroundTask_22[19] = 60;
        this.X[78] = 20;
        this.AsyncBackgroundTask_22[20] = 78;
        this.X[77] = 21;
        this.AsyncBackgroundTask_22[21] = 77;
        this.X[6] = 22;
        this.AsyncBackgroundTask_22[22] = 6;
        this.X[59] = 23;
        this.AsyncBackgroundTask_22[23] = 59;
        this.X[7] = 24;
        this.AsyncBackgroundTask_22[24] = 7;
        this.X[74] = 25;
        this.AsyncBackgroundTask_22[25] = 74;
        this.X[4] = 26;
        this.AsyncBackgroundTask_22[26] = 4;
        this.X[76] = 27;
        this.AsyncBackgroundTask_22[27] = 76;
        this.X[62] = 28;
        this.AsyncBackgroundTask_22[28] = 62;
        this.X[58] = 29;
        this.AsyncBackgroundTask_22[29] = 58;
        this.X[8] = 30;
        this.AsyncBackgroundTask_22[30] = 8;
        this.X[9] = 31;
        this.AsyncBackgroundTask_22[31] = 9;
        this.X[13] = 32;
        this.AsyncBackgroundTask_22[32] = 13;
        this.X[12] = 33;
        this.AsyncBackgroundTask_22[33] = 12;
        this.X[10] = 34;
        this.AsyncBackgroundTask_22[34] = 10;
        this.X[11] = 35;
        this.AsyncBackgroundTask_22[35] = 11;
        this.X[75] = 36;
        this.AsyncBackgroundTask_22[36] = 75;
        this.X[69] = 37;
        this.AsyncBackgroundTask_22[37] = 69;
        this.X[1] = 79;
        this.AsyncBackgroundTask_22[79] = 1;
    }

    public final int BaseCoreGenericHandler(char c) {
        SortHandler br2 = this;
        return br2.n()[c - 44] << 16;
    }

    public final void LiteBansModule_31(@NotNull LiteBansModule_342 jg_02) {
        List list = this.m;
        ObjectUtilities.LiteBansModule_31(list, "");
        ((Collection)NullHandler_6.c(list)).add(jg_02);
    }

    public final void LiteBansModule_240() {
        Iterable iterable = this.m;
        SortHandler br2 = this;
        Iterable iterable2 = iterable;
        Collection collection = new ArrayList();
        for (Object t2 : iterable2) {
            LiteBansModule_342 jg_02 = (LiteBansModule_342)t2;
            if (!(jg_02.e() != 0)) continue;
            collection.add(t2);
        }
        br2.m = (List)collection;
    }

    public final void BaseCoreGenericHandler(@NotNull byte[] byArray, @NotNull ByteArrayOutputStream byteArrayOutputStream) {
        for (byte by2 : byArray) {
            if (by2 >= 128 || by2 < -8) {
                Object v0;
{
                    Iterable iterable = this.m;
                    for (Object t2 : iterable) {
                        LiteBansModule_342 jg_02 = (LiteBansModule_342)t2;
                        if (!(jg_02.e() == by2)) continue;
                        v0 = t2;
                        break;
}
                LiteBansModule_342 jg_03 = v0;
                if (jg_03 != null) {
                    byteArrayOutputStream.write(jg_03.c());
                    continue;
}
            byteArrayOutputStream.write(by2);
}

    public final byte[] BaseCoreGenericHandler(@NotNull byte[] byArray, @NotNull LiteBansModule_342 jg_02) {
        byte[] byArray2 = jg_02.c();
        byte[] byArray3 = new byte[byArray.length];
        int n2 = byArray.length - byArray2.length;
        n3 = Integer.MIN_VALUE;
        byte[] byArray4 = byArray;
        for (byte by2 : byArray4) {
            int n6;
            int n7 = n5++;
            byte by3 = by2;
            int n8 = n7;
            if (n8 >= n3) {
                if (n8 < n2 && LiteBansModule_389.BaseCoreGenericHandler(byArray2, byArray, n8, n8 + byArray2.length)) {
                    flag = true;
                    n6 = n;
                    n = n6 + 1;
                    byArray3[n6] = jg_02.e();
                    ++n4;
                    n3 = n8 + byArray2.length;
                    continue;
                }
                flag = false;
            }
            if (flag) continue;
            n6 = n;
            n = n6 + 1;
            byArray3[n6] = by3;
        }
        if (n == byArray.length) {
            return byArray;
        }
        byArray4 = ArrayUtilities.BaseCoreGenericHandler(byArray3, 0, n);
        return byArray4;
    }

    public final byte[] BaseCoreGenericHandler(@NotNull byte[] byArray, int n, int n2, @NotNull LiteBansModule_178 eo_02) {
        byte[] byArray2 = null;
        byArray2 = byArray;
        byte by2 = 0;
        by2 = (byte)n;
        List list = this.m;
        Object targetObj = list;
        Object contextObj = targetObj.iterator();
        while (contextObj.hasNext()) {
            byte[] byArray3;
            boolean flag2;
            Object t2 = contextObj.next();
            LiteBansModule_342 jg_02 = (LiteBansModule_342)t2;
            if (++n3 > n2) {
                return byArray2;
            }
            boolean flag4 = flag2 = jg_02.e() == 0;
            if (flag2) {
                byte by3 = by2;
                by2 = (byte)(by3 + 1);
                jg_02.BaseCoreGenericHandler(by3);
            } else {
                by2 = (byte)(jg_02.e() + 1);
            }
            if ((byArray3 = this.plugin(byArray2, jg_02)) != byArray2) {
                byArray2 = byArray3;
                eo_02.BaseCoreGenericHandler(jg_02);
                continue;
            }
            if (!flag2) continue;
            jg_02.BaseCoreGenericHandler((byte)0);
            by2 = (byte)(by2 + -1);
            n3 += -1;
        }
        targetObj = this;
        Object arg1 = null;
        contextObj = byArray.toString();
        return byArray2;
    }

    public static /* synthetic */ byte[] BaseCoreGenericHandler(SortHandler br2, byte[] byArray, int n, int n2, LiteBansModule_178 eo_02, int n3, Object targetObj) {
        if ((n3 & 2) != 0) {
            n = 128;
        }
        if ((n3 & 4) != 0) {
            n2 = 70;
        }
        if ((n3 & 8) != 0) {
            eo_02 = SortHandler::BaseCoreGenericHandler;
        }
        return br2.BaseCoreGenericHandler(byArray, n, n2, eo_02);
    }

    public final void BaseCoreGenericHandler(@NotNull byte[] byArray, @NotNull byte[] byArray2, boolean flag, boolean flag2) {
        if (flag2) {
            this.B.BaseCoreGenericHandler(this.BanHandler_5);
        }
        if (flag) {
            byte[] byArray3 = byArray2;
            for (byte by2 : byArray3) {
                int n2 = n++;
                byArray2[n2] = this.plugin(byArray[n2]);
} else {
            byte[] byArray4 = byArray2;
            for (byte by3 : byArray4) {
                int n3 = n++;
                byArray2[n3] = this.LiteBansModule_31(byArray[n3]);
}

    public static /* synthetic */ void BaseCoreGenericHandler(SortHandler br2, byte[] byArray, byte[] byArray2, boolean flag, boolean flag2, int n, Object targetObj) {
        if ((n & 4) != 0) {
            flag = true;
        }
        if ((n & 8) != 0) {
            flag2 = true;
        }
        br2.BaseCoreGenericHandler(byArray, byArray2, flag, flag2);
    }

    public final void LiteBansModule_31(@NotNull byte[] byArray, int n, boolean flag, boolean flag2) {
        for (int i = 0; i < n; ++i) {
            int n2 = i;
            int n3 = n2 * 2;
            byte by2 = LiteBansModule_245.AsyncBackgroundTask_5(this.LiteBansModule_240, this.B);
            if (flag2) {
                by2 = (byte)(by2 + LiteBansModule_245.AsyncBackgroundTask_5(this.LiteBansModule_240, this.B));
            }
            byArray[n3] = by2;
            byte by3 = LiteBansModule_245.AsyncBackgroundTask_5(this.ServerSyncService.LiteBansModule_31(), this.B);
            if (!flag) continue;
            byArray[n3 + 1] = by3;
}

    public final int BaseCoreGenericHandler(@NotNull byte[] byArray, int n, @NotNull CharSequence charSequence, boolean flag) {
        for (int i = 0; i < n; ++i) {
            int n3 = i;
            int n4 = n3 * 2;
            byte by2 = byArray[n4];
            SortHandler br2 = this;
            char c = charSequence.charAt(n3);
            byte by3 = (byte)(br2.n()[c - 44] - by2);
            if (flag) {
                byte by4 = byArray[n4 + 1];
                by3 = (byte)(by3 ^ by4);
            }
            if ((n2 += this.c(by3)) > -7) continue;
            return n2;
        }
        return n2;
    }

    public final byte[] BroadcastService() {
        Serializable serializable;
        Iterator iterator;
        byte by222;
        byte[] byArray = this.ServerSyncService.LiteBansModule_31();
        int n = this.plugin.size();
        LiteBansModule_45 bE2 = new LiteBansModule_45(Math.max(1, n / 4096), Math.max(1, n / 1024), Math.max(1, n / 512));
        HashMap hashMap = new HashMap(32);
        HashMap hashMap2 = new HashMap(this.ServerSyncService.LiteBansModule_31().length);
        for (LiteBansModule_354 jT2 : this.plugin) {
            int n2 = ((Number)jT2.LiteBansModule_31()).intValue();
            byte by3 = ((Number)jT2.e()).byteValue();
            for (byte by222 : this.HoverTextFormatter) {
                if ((byte)(by3 ^ by222) >= by3) continue;
                n3 |= by222;
            }
            contextObj = hashMap2;
            targetObj = n2;
            by222 = 0;
            iterator = contextObj.get(targetObj);
            if (iterator == null) {
                serializable = new ArrayList(32);
                contextObj.put(targetObj, serializable);
                resultObj = serializable;
            } else {
                resultObj = iterator;
            }
            ArrayList helperObj = (ArrayList)resultObj;
            ((Collection)helperObj).add((byte)n3);
        }
        Map map = hashMap2;
        Iterator iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Serializable serializable2;
            int n4;
            int n5;
            Map.Entry entry;
            Map.Entry entry2 = entry = iterator2.next();
            contextObj = (ArrayList)entry2.getValue();
            targetObj = ((ArrayList)contextObj).iterator();
            while (targetObj.hasNext()) {
                by222 = ((Number)targetObj.next()).byteValue();
                iterator = hashMap;
                serializable = by222;
                n5 = 0;
                tempObj = iterator.get(serializable);
                if (tempObj == null) {
                    int n2;
                    n4 = 0;
                    Iterable iterable = (Iterable)contextObj;
                    if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                        n2 = 0;
                    } else {
                        for (Object t2 : iterable) {
                            byte by4 = ((Number)t2).byteValue();
                            if (!(by4 == by222) || ++n7 >= 0) continue;
                            CollectionUtilities.c();
                        }
                        n2 = n7;
                    }
                    Integer n8 = n2;
                    iterator.put(serializable, n8);
                    helperObj = n8;
                } else {
                    helperObj = tempObj;
                }
                int n9 = ((Number)helperObj).intValue();
                this.plugin(n9, by222, ((Number)entry2.getKey()).intValue(), bE2);
            }
            Iterable iterable = ((Map)hashMap).entrySet();
            iterator = iterable.iterator();
            if (!iterator.hasNext()) {
                throw new NoSuchElementException();
            }
            serializable = iterator.next();
            if (!iterator.hasNext()) {
                serializable2 = serializable;
            } else {
                Map.Entry entry3 = (Map.Entry)(serializable);
                n5 = ((Number)entry3.getValue()).intValue();
                do {
                    tempObj = iterator.next();
                    Map.Entry entry4 = (Map.Entry)tempObj;
                    n4 = ((Number)entry4.getValue()).intValue();
                    if (n5 >= n4) continue;
                    serializable = tempObj;
                    n5 = n4;
                } while (iterator.hasNext());
                serializable2 = serializable;
            }
            targetObj = (Map.Entry)(serializable2);
            this.plugin(((Number)targetObj.getValue()).intValue(), ((Number)targetObj.getKey()).byteValue(), ((Number)entry2.getKey()).intValue(), bE2);
            hashMap.clear();
        }
        this.plugin = CollectionUtilities.e();
        return byArray;
    }

    private final void BaseCoreGenericHandler(int n, byte by2, int n2, LiteBansModule_45 bE2) {
        if (by2 <= 7 && n >= bE2.c() || by2 <= 31 && n >= bE2.LiteBansModule_31() || n > bE2.BaseCoreGenericHandler()) {
            this.ServerSyncService.LiteBansModule_31()[n2] = by2;
}

    private final int c(byte by2) {
        int n;
        switch (by2) {
            case 0: {
                n = 7;
                break;
            }
            case -3:
            case -1:
            case 1:
            case 13: {
                n = 3;
                break;
            }
            default: {
                n = -1;
}
        return n;
    }

    public final byte BaseCoreGenericHandler(byte by2) {
        if (by2 == 79) {
            this.PunishmentTableService = !this.PunishmentTableService;
            return by2;
        }
        byte by3 = LiteBansModule_245.AsyncBackgroundTask_5(this.LiteBansModule_240, this.B);
        int n = by2 - by3;
        int n2 = this.ServerSyncService.BaseCoreGenericHandler(this, (byte)n);
        return (byte)(n ^ n2);
    }

    public final byte LiteBansModule_31(byte by2) {
        if (by2 == 79) {
            this.PunishmentTableService = !this.PunishmentTableService;
            return 0;
        }
        byte by3 = LiteBansModule_245.AsyncBackgroundTask_5(this.LiteBansModule_240, this.B);
        byte by4 = this.ServerSyncService.BaseCoreGenericHandler(this, by2);
        return (byte)((byte)(by2 ^ by4) + by3);
    }

    public final byte[] BaseCoreGenericHandler(@Nullable PlatformPlugin plugin, @NotNull String string, boolean flag, boolean flag2, @NotNull LiteBansModule_324 iX2, @NotNull byte[] byArray) {
        byte[] byArray2;
        byte[] byArray3;
        int n;
        this.B.BaseCoreGenericHandler(this.BanHandler_5);
        Object targetObj = new char[]{','};
        List list = CollectionUtilities.BaseCoreGenericHandler((Collection)StringUtilities.BaseCoreGenericHandler(string, targetObj, false, 0, 6, null));
        if (list.size() <= 1) {
            targetObj = this;
            Object helperObj = plugin;
            if (helperObj != null && (helperObj = (ConfigService)helperObj.BaseCoreGenericHandler(ConfigService.class)) != null) {
                String[] args;
                String[] filteredArgs;
                String[] parsedArgs;
                Object tempObj = helperObj;
                resultObj = AbstractCommand.AsyncBackgroundTask_5;
                contextObj = (string).toString();
                if (ObjectUtilities.BaseCoreGenericHandler(contextObj, (Object)"sort")) {
                    parsedArgs = new String[]{"00"};
                    filteredArgs = parsedArgs;
                } else {
                    parsedArgs = new String[]{"01:" + (String)contextObj};
                    filteredArgs = parsedArgs;
                }
                if (new LiteBansModule_403((ConfigService)tempObj, Arrays.copyOf(args = filteredArgs, args.length)).LiteBansModule_31() == tempObj.hashCode()) {
                    throw new IllegalArgumentException();
}
            targetObj = this;
            byte[] byArray4 = string.getBytes(LiteBansModule_344.AsyncBackgroundTask_5);
            Object object6 = contextObj = (resultObj = byArray4);
            for (Object object7 : object6) {
                int n3 = n2++;
                Object object8 = object7;
                int n4 = n3;
                char[] cArray = targetObj;
                byArray4[n4] = cArray.n()[object8 - 44];
            }
            return resultObj;
        }
        targetObj = new StringBuilder(16);
        StringBuilder stringBuilder = new StringBuilder(string.length());
        SortHandler br2 = this;
        int n5 = 1500;
        boolean bl10 = flag2;
        String string2 = (String)list.get(0);
        while (list.size() != 1) {
            int n6 = string2.length() + 1;
            int n7 = n5 / (n6 + 4);
            long l3 = br2.m().c()[0];
            long l5 = br2.m().c()[1];
            bl11 = false;
            br2.LiteBansModule_31(byArray, n6, flag, bl12);
            StringUtilities.BaseCoreGenericHandlertargetObj.append(string2).append(',');
            n = br2.BaseCoreGenericHandler(byArray, n6, targetObj, flag);
            if (n >= Math.min(7 * n6, n7)) {
                n5 += 4 * n6;
                list.remove(string2);
                stringBuilder.append(string2).append(',');
                string2 = (String)list.get(0);
                continue;
            }
            --n5;
            br2.m().BaseCoreGenericHandler(l3, l5);
            if (list.size() < 10) {
                n5 -= 128;
            }
            string2 = (String)LiteBansModule_245.c(list, iX2);
        }
        stringBuilder.append((String)list.get(0));
        br2 = this;
        byte[] byArray5 = LiteBansModule_242.BaseCoreGenericHandler(stringBuilder, LiteBansModule_344.AsyncBackgroundTask_5);
        n5 = 0;
        byte[] byArray6 = byArray3 = (byArray2 = byArray5);
        for (byte by2 : byArray6) {
            int n9 = n8++;
            byte by3 = by2;
            int n10 = n9;
            SortHandler br3 = br2;
            n = 0;
            byArray5[n10] = br3.n()[by3 - 44];
        }
        return byArray2;
    }

    public final void BaseCoreGenericHandler(@NotNull byte[] byArray, int n, boolean flag, boolean flag2) {
        int n2 = n;
        int n3 = 10;
        if (!(this.m instanceof ArrayList)) {
            this.m = new ArrayList(512);
        }
        if (flag) {
            n3 = 10;
        }
        while (n2-- > 0 && n3 >= 2) {
            int n4 = n3;
            int n5 = Math.max(1, this.plugin(n4));
            LiteBansModule_354 jT2 = LiteBansModule_342.c.BaseCoreGenericHandler(byArray, n4, n5, this, !flag);
            if (jT2 == LiteBansModule_342.c.BaseCoreGenericHandler()) {
                n3 = n4 - 1;
                continue;
            }
            short s2 = ((LiteBansModule_193)jT2.LiteBansModule_31()).BaseCoreGenericHandler();
            byte[] byArray2 = (byte[])jT2.e();
            this.LiteBansModule_31(new LiteBansModule_342(byArray2, 0, s2, 2, null));
        }
        this.Utf8Handler_2();
    }

    public static /* synthetic */ void BaseCoreGenericHandler(SortHandler br2, byte[] byArray, int n, boolean flag, boolean flag2, int n2, Object targetObj) {
        if ((n2 & 2) != 0) {
            n = 16000;
        }
        if ((n2 & 4) != 0) {
            flag = false;
        }
        if ((n2 & 8) != 0) {
            flag2 = false;
        }
        br2.BaseCoreGenericHandler(byArray, n, flag, flag2);
    }

    private final int BaseCoreGenericHandler(int n) {
        return 30 / n / n - 2;
    }

    public final void Utf8Handler_2() {
        if (!(this.m).isEmpty()) {
            List list;
            List list2 = this.m;
            ObjectUtilities.LiteBansModule_31(list2, "");
            List list3 = list = NullHandler_6.c(list2);
            if (list3.size() > 1) {
                CollectionUtilities.BaseCoreGenericHandler(list3, new LiteBansModule_266());
}

    private static final KotlinUnitHandler BaseCoreGenericHandler(LiteBansModule_342 jg_02) {
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    public /* synthetic */ SortHandler(long l3, LiteBansModule_324 iX2, byte[] byArray, LiteBansModule_366 k92, boolean flag, long l5, int n, int n2, LiteBansModule_14 aJ2) {
        this(l3, iX2, byArray, k92, flag, l5, n, n2);
    }

    static {
        LiteBansModule_31 = false;
        AsyncBackgroundTask_21 = false;
        D = false;
        e = false;
        BanHandler_4 = false;
        F = false;
        BroadcastService = false;
        U = false;
        L = false;
        DatabaseMonitorService = 1;
        PunishmentService = 2400;
        g = 512;
        PluginHookService = 1024;
        LockdownService = 4096;
        z = false;
        K = 28;
        r = 4;
        AsyncBackgroundTask_5 = 140;
        S = -7;
        n = 7;
        PlayerQuitListener = 16;
        GnuSparseMapHandler = 1500;
        W = 128;
        i = (byte)127;
        LiteBansModule_433 = 40;
        BanHandler_2 = 12;
        V = (byte)79;
        A = (char)45;
        LiteBansModule_430 = false;
        LiteBansModule_401 = 80;
        CommandThrottleService = 44;
        H = false;
        SortHandler.g();
        P = new LiteBansModule_277(null);
}

