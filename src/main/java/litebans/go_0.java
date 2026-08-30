package litebans;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import litebans.b1;
import litebans.bt_0;
import litebans.eo_0;
import litebans.ew;
import litebans.gt;
import litebans.hl;
import litebans.i_;
import litebans.iv_0;
import org.jetbrains.annotations.NotNull;

public final class go_0 {
    private static /* synthetic */ String[] a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final void a(@NotNull Reader reader, @NotNull eo_0 eo_02) {
        ew.a((Object)reader, "<this>");
        ew.a((Object)eo_02, "action");
        Reader reader2 = reader;
        boolean bl = false;
        Closeable closeable = reader2;
        int n = 8192;
        closeable = closeable instanceof BufferedReader ? (BufferedReader)closeable : new BufferedReader((Reader)closeable, n);
        Throwable throwable = null;
        try {
            Object object = (BufferedReader)closeable;
            boolean bl2 = false;
            i_ i_2 = go_0.a((BufferedReader)object);
            boolean bl3 = false;
            i_ i_3 = i_2;
            boolean bl4 = false;
            Iterator iterator = i_3.a();
            while (iterator.hasNext()) {
                Object e = iterator.next();
                eo_02.a(e);
            }
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

    public static final List a(@NotNull Reader reader) {
        ew.a((Object)reader, "<this>");
        ArrayList arrayList = new ArrayList();
        go_0.a(reader, arg_0 -> go_0.a(arrayList, arg_0));
        return arrayList;
    }

    public static final i_ a(@NotNull BufferedReader bufferedReader) {
        ew.a((Object)bufferedReader, "<this>");
        return gt.a(new b1(bufferedReader));
    }

    private static final iv_0 a(ArrayList arrayList, String string) {
        ew.a((Object)string, "it");
        arrayList.add(string);
        return iv_0.a;
    }

    private static final void a() {
        a = new String[]{"<this>", "<this>", "<this>", "<this>", "<this>", "action", "<this>", "<this>", "block", "<this>", "<this>", "<this>", "<this>", "out", "<this>", "charset", "<this>", "charset", "<this>", "it"};
    }

    static {
        go_0.a();
    }
}

