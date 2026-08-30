package litebans;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import litebans.aq_0;
import litebans.bW;
import litebans.bt_0;
import litebans.ew;
import litebans.hl;
import litebans.iv_0;
import litebans.ji_0;
import litebans.kB;
import litebans.kd_0;
import litebans.lo_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.kn
 */
static class kn_0
extends kB {
    private static /* synthetic */ String[] b;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final byte[] a(@NotNull File file) {
        Object object;
        ew.a((Object)file, b[20]);
        Closeable closeable = new FileInputStream(file);
        Throwable throwable = null;
        try {
            byte[] byArray;
            int n;
            long l3;
            object = (FileInputStream)closeable;
            boolean bl = false;
            int n2 = 0;
            long l5 = l3 = file.length();
            int n3 = 0;
            if (l5 > Integer.MAX_VALUE) {
                throw new OutOfMemoryError(b[21] + file + b[22] + l5 + b[23]);
            }
            int n4 = (int)l3;
            byte[] byArray2 = new byte[n4];
            while (n4 > 0 && (n = ((FileInputStream)object).read(byArray2, n2, n4)) >= 0) {
                n4 -= n;
                n2 += n;
            }
            if (n4 > 0) {
                byArray = Arrays.copyOf(byArray2, n2);
            } else {
                n = ((FileInputStream)object).read();
                if (n == -1) {
                    byArray = byArray2;
                } else {
                    aq_0 aq_02 = new aq_0(8193);
                    aq_02.write(n);
                    bW.a((InputStream)object, aq_02, 0, 2, null);
                    n3 = byArray2.length + aq_02.size();
                    if (n3 < 0) {
                        throw new OutOfMemoryError(b[24] + file + b[25]);
                    }
                    byArray = lo_0.a(aq_02.a(), Arrays.copyOf(byArray2, n3), byArray2.length, 0, aq_02.size());
                }
            }
            object = byArray;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            bt_0.a(closeable, throwable);
        }
        return object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final void a(@NotNull File file, @NotNull byte[] byArray) {
        ew.a((Object)file, b[26]);
        ew.a((Object)byArray, b[27]);
        Closeable closeable = new FileOutputStream(file);
        Throwable throwable = null;
        try {
            Object object = (FileOutputStream)closeable;
            boolean bl = false;
            ((FileOutputStream)object).write(byArray);
            object = iv_0.a;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            bt_0.a(closeable, throwable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final void a(@NotNull File file, @NotNull String string, @NotNull Charset charset) {
        ew.a((Object)file, b[32]);
        ew.a((Object)string, b[33]);
        ew.a((Object)charset, b[34]);
        Closeable closeable = new FileOutputStream(file);
        Throwable throwable = null;
        try {
            Object object = (FileOutputStream)closeable;
            boolean bl = false;
            kd_0.a((OutputStream)object, string, charset);
            object = iv_0.a;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            bt_0.a(closeable, throwable);
        }
    }

    public static /* synthetic */ void a(File file, String string, Charset charset, int n, Object object) {
        if ((n & 2) != 0) {
            charset = ji_0.b;
        }
        kd_0.a(file, string, charset);
    }

    public static final void a(@NotNull OutputStream outputStream, @NotNull String string, @NotNull Charset charset) {
        ew.a((Object)outputStream, b[38]);
        ew.a((Object)string, b[39]);
        ew.a((Object)charset, b[40]);
        int n = 8192;
        if (string.length() < 2 * n) {
            outputStream.write(string.getBytes(charset));
            return;
        }
        CharsetEncoder charsetEncoder = kd_0.a(charset);
        CharBuffer charBuffer = CharBuffer.allocate(n);
        ew.a(charsetEncoder);
        ByteBuffer byteBuffer = kd_0.a(n, charsetEncoder);
        int n2 = 0;
        int n3 = 0;
        while (n2 < string.length()) {
            int n4 = Math.min(n - n3, string.length() - n2);
            int n5 = n2 + n4;
            Object object = string;
            Object object2 = charBuffer.array();
            ((String)object).getChars(n2, n5, (char[])object2, n3);
            charBuffer.limit(n4 + n3);
            object = charsetEncoder.encode(charBuffer, byteBuffer, n5 == string.length());
            object2 = object;
            boolean bl = false;
            if (!((CoderResult)object2).isUnderflow()) {
                throw new IllegalStateException(b[41]);
            }
            outputStream.write(byteBuffer.array(), 0, byteBuffer.position());
            if (charBuffer.position() != charBuffer.limit()) {
                charBuffer.put(0, charBuffer.get());
                n3 = 1;
            } else {
                n3 = 0;
            }
            charBuffer.clear();
            byteBuffer.clear();
            n2 = n5;
        }
    }

    public static final CharsetEncoder a(@NotNull Charset charset) {
        ew.a((Object)charset, b[42]);
        return charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
    }

    public static final ByteBuffer a(int n, @NotNull CharsetEncoder charsetEncoder) {
        ew.a((Object)charsetEncoder, b[43]);
        int n2 = (int)Math.ceil(charsetEncoder.maxBytesPerChar());
        return ByteBuffer.allocate(n * n2);
    }

    private static final void b() {
        b = new String[]{hl.a("\u5187\u51cf\u51d3\u51d2\u51c8\u5185", -1500556869), hl.a("\u0098\u0093\u009a\u0089\u0088\u009e\u008f", -240058117), hl.a("\udc3b\udc73\udc6f\udc6e\udc74\udc39", 1494539271), hl.a("\u0f3c\u0f37\u0f3e\u0f2d\u0f2c\u0f3a\u0f2b", -587853985), hl.a("\uf5fe\uf5b6\uf5aa\uf5ab\uf5b1\uf5fc", -1464797758), hl.a("\u3d02\u3d09\u3d00\u3d13\u3d12\u3d04\u3d15", 1679244641), hl.a("\ucd17\ucd5f\ucd43\ucd42\ucd58\ucd15", -1415459541), hl.a("\uf085\uf08e\uf087\uf094\uf095\uf083\uf092", -1262620442), hl.a("\u9a3f\u9a77\u9a6b\u9a6a\u9a70\u9a3d", 257661443), hl.a("\u8309\u8302\u830b\u8318\u8319\u830f\u831e", -1948548246), hl.a("\u6d7e\u6d36\u6d2a\u6d2b\u6d31\u6d7c", -916296382), hl.a("\u3b0d\u3b06\u3b0f\u3b1c\u3b1d\u3b0b\u3b1a", 1968716654), hl.a("\u510e\u5146\u515a\u515b\u5141\u510c", -1031843534), hl.a("\ue26f\ue264\ue26d\ue27e\ue27f\ue269\ue278", 1428021772), hl.a("\u5600\u5648\u5654\u5655\u564f\u5602", -1353034180), hl.a("\u26a4\u26af\u26a6\u26b5\u26b4\u26a2\u26b3", 217327303), hl.a("\u4a8d\u4ac5\u4ad9\u4ad8\u4ac2\u4a8f", 1415989937), hl.a("\u095d\u0956\u095f\u094c\u094d\u095b\u094a", -406845122), hl.a("\u5062\u502a\u5036\u5037\u502d\u5060", 1637044318), hl.a("\ude02\ude09\ude00\ude13\ude12\ude04\ude15", 320200289), hl.a("\ubc50\ubc18\ubc04\ubc05\ubc1f\ubc52", -1733116820), hl.a("\u2e24\u2e0b\u2e0e\u2e07\u2e42", 1819881058), hl.a("\u42a6\u42ef\u42f5\u42a6\u42f2\u42e9\u42e9\u42a6\u42e4\u42ef\u42e1\u42a6\u42ae", 1006060166), hl.a("\uc204\uc246\uc25d\uc250\uc241\uc257\uc20d\uc204\uc250\uc24b\uc204\uc242\uc24d\uc250\uc204\uc24d\uc24a\uc204\uc249\uc241\uc249\uc24b\uc256\uc25d\uc20a", 48874020), hl.a("\ufee5\ufeca\ufecf\ufec6\ufe83", -160498013), hl.a("\u8a8d\u8ac4\u8ade\u8a8d\u8ad9\u8ac2\u8ac2\u8a8d\u8acf\u8ac4\u8aca\u8a8d\u8ad9\u8ac2\u8a8d\u8acb\u8ac4\u8ad9\u8a8d\u8ac4\u8ac3\u8a8d\u8ac0\u8ac8\u8ac0\u8ac2\u8adf\u8ad4\u8a83", 1611827885), hl.a("\ua895\ua8dd\ua8c1\ua8c0\ua8da\ua897", 1420667049), hl.a("\uda5a\uda49\uda49\uda5a\uda42", 997907003), hl.a("\u12e5\u12ad\u12b1\u12b0\u12aa\u12e7", 147067609), hl.a("\u2db8\u2dab\u2dab\u2db8\u2da0", -1089983015), hl.a("\u1ed9\u1e91\u1e8d\u1e8c\u1e96\u1edb", -1814421787), hl.a("\u5546\u554d\u5544\u5557\u5556\u5540\u5551", -1424272091), hl.a("\ud190\ud1d8\ud1c4\ud1c5\ud1df\ud192", -114634324), hl.a("\u7a06\u7a17\u7a0a\u7a06", 9402994), hl.a("\u776b\u7760\u7769\u777a\u777b\u776d\u777c", -1426229496), hl.a("\u1846\u180e\u1812\u1813\u1809\u1844", -1574299526), hl.a("\ub84c\ub85d\ub840\ub84c", -1400391624), hl.a("\u0951\u095a\u0953\u0940\u0941\u0957\u0946", -73397966), hl.a("\u9309\u9341\u935d\u935c\u9346\u930b", -1653763275), hl.a("\u2d67\u2d76\u2d6b\u2d67", 718679315), hl.a("\ufc3b\ufc30\ufc39\ufc2a\ufc2b\ufc3d\ufc2c", 295697496), hl.a("\udcad\udc86\udc8b\udc8d\udc85\udcce\udc88\udc8f\udc87\udc82\udc8b\udc8a\udcc0", 273800430), hl.a("\u84df\u8497\u848b\u848a\u8490\u84dd", 943490275), hl.a("\u3755\u375e\u3753\u375f\u3754\u3755\u3742", -59164880), hl.a("\ufaac\ufae4\ufaf8\ufaf9\ufae3\ufaae", 460389008), hl.a("\u905d\u905f\u9048\u9055\u9053\u9052", 1448120380), hl.a("f.23)d", 2106261594), hl.a("\u29fe\u29fc\u29eb\u29f6\u29f0\u29f1", 409479583), hl.a("\u28ec\u28a4\u28b8\u28b9\u28a3\u28ee", -992270128), hl.a("\ub51a\ub511\ub518\ub50b\ub50a\ub51c\ub50d", -108546695), hl.a("\u8d86\u8d84\u8d93\u8d8e\u8d88\u8d89", 995986919), hl.a("\u5b1d\u5b55\u5b49\u5b48\u5b52\u5b1f", -1777575135), hl.a("\u18f9\u18b1\u18ad\u18ac\u18b6\u18fb", 1681856709), hl.a("\uf772\uf73a\uf726\uf727\uf73d\uf770", 1824061262), hl.a("\u4aeb\u4ae0\u4ae9\u4afa\u4afb\u4aed\u4afc", -875410808), hl.a("\u30fd\u30b5\u30a9\u30a8\u30b2\u30ff", 15282369), hl.a("\u69c7\u69cc\u69c5\u69d6\u69d7\u69c1\u69d0", -1964873308), hl.a("\u13a0\u13ae\u13ad\u13a1\u13a9", -1384770622), hl.a("\u765d\u7615\u7609\u7608\u7612\u765f", -2136508831), hl.a("\uad5f\uad54\uad5d\uad4e\uad4f\uad59\uad48", -137056964), hl.a("\u06bf\u06b1\u06b2\u06be\u06b6", 1384122077), hl.a("\u648e\u6493", -1740610329)};
    }

    static {
        kn_0.b();
    }
}

