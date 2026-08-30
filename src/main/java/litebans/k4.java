package litebans;

import java.io.Closeable;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import litebans.aZ;
import litebans.a_;
import litebans.api.Database;
import litebans.api.Entry;
import litebans.bt_0;
import litebans.bz;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.ew;
import litebans.hl;
import litebans.hq;
import litebans.iA;
import litebans.jj_0;
import litebans.kL;
import litebans.kR;
import litebans.ll;
import litebans.p;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class k4
extends Database {
    private final di_0 a;
    private int b;
    private static /* synthetic */ String[] c;

    public k4(@NotNull di_0 di_02) {
        this.a = di_02;
    }

    public final int c() {
        return this.b;
    }

    @Override
    public boolean isPlayerBanned(@Nullable UUID uUID, @Nullable String string, @Nullable String string2) {
        return this.a(uUID, string, string2, a_.h) != null;
    }

    @Override
    public boolean isPlayerMuted(@Nullable UUID uUID, @Nullable String string, @Nullable String string2) {
        return this.a(uUID, string, string2, a_.j) != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final Entry a(UUID uUID, String string, String string2, a_ a_2) {
        Object object;
        Object object2;
        String string3;
        String string4;
        this.b();
        if (uUID == null && string == null) {
            return null;
        }
        w w2 = (w)this.a.a(w.class);
        if (ew.a((Object)string2, (Object)"__DEFAULT__")) {
            string4 = w2.u();
        } else {
            string4 = string2;
            if (string4 == null) {
                string4 = string3 = w2.u();
            }
        }
        if (uUID != null && a_2 == a_.j && (object2 = ((p)(object = (p)this.a.a(p.class))).a(uUID, string, string2)) != null) {
            return hq.a.a(this.a, (dZ)object2);
        }
        object = w2.f();
        object2 = null;
        try {
            dZ dZ2;
            ch ch2 = (ch)object;
            boolean bl = false;
            if (kR.a(ch2, Objects.toString(uUID), string, a_2, string3, false, false, 48, null) == null) {
                Entry entry = null;
                return entry;
            }
            dZ dZ3 = dZ2;
            Entry entry = hq.a.a(this.a, dZ3);
            return entry;
        }
        catch (Throwable throwable) {
            object2 = throwable;
            throw throwable;
        }
        finally {
            bt_0.a((Closeable)object, (Throwable)object2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final Entry a(long l3, String string, a_ a_2) {
        this.b();
        if (!(l3 >= 0L)) {
            boolean bl = false;
            String string2 = "Negative ID: " + l3;
            throw new IllegalArgumentException(string2.toString());
        }
        w w2 = (w)this.a.a(w.class);
        String string3 = ew.a((Object)string, (Object)"__DEFAULT__") ? w2.u() : string;
        Closeable closeable = w2.f();
        Throwable throwable = null;
        try {
            dZ dZ2;
            ch ch2 = (ch)closeable;
            boolean bl = false;
            String string4 = string3;
            if (string4 == null) {
                string4 = w2.u();
            }
            if (kR.a(ch2, l3, a_2, string4, false, 8, null) == null) {
                Entry entry = null;
                return entry;
            }
            dZ dZ3 = dZ2;
            Entry entry = hq.a.a(this.a, dZ3);
            return entry;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            bt_0.a(closeable, throwable);
        }
    }

    @Override
    public boolean isPlayerBanned(@Nullable UUID uUID, @Nullable String string) {
        return this.isPlayerBanned(uUID, string, "__DEFAULT__");
    }

    @Override
    public boolean isPlayerMuted(@Nullable UUID uUID, @Nullable String string) {
        return this.isPlayerMuted(uUID, string, "__DEFAULT__");
    }

    @Override
    public Entry getBan(@Nullable UUID uUID, @Nullable String string, @Nullable String string2) {
        return this.a(uUID, string, string2, a_.h);
    }

    @Override
    public Entry getBan(long l3, @Nullable String string) {
        return this.a(l3, string, a_.h);
    }

    @Override
    public Entry getMute(@Nullable UUID uUID, @Nullable String string, @Nullable String string2) {
        return this.a(uUID, string, string2, a_.j);
    }

    @Override
    public Entry getMute(long l3, @Nullable String string) {
        return this.a(l3, string, a_.j);
    }

    @Override
    public Entry getWarning(@Nullable UUID uUID, @Nullable String string, @Nullable String string2) {
        return this.a(uUID, string, string2, a_.c);
    }

    @Override
    public Entry getWarning(long l3, @Nullable String string) {
        return this.a(l3, string, a_.c);
    }

    @Override
    public Entry getKick(@Nullable UUID uUID, @Nullable String string, @Nullable String string2) {
        return this.a(uUID, string, string2, a_.g);
    }

    @Override
    public Entry getKick(long l3, @Nullable String string) {
        return this.a(l3, string, a_.g);
    }

    @Override
    public PreparedStatement prepareStatement(@NotNull String string) {
        String string2 = string;
        this.b();
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        w w2 = (w)this.a.a(w.class);
        ch ch2 = w2.f();
        if (ch2.b()) {
            throw new IllegalStateException("Database connection not available");
        }
        if (bz.c((CharSequence)string2, '{', false, 2, null)) {
            string2 = bz.a(string2, c[6], q_02.f().d(), false, 4, null);
            for (kL kL2 : kL.values()) {
                String string3 = kL2.name();
                string2 = bz.a(string2, '{' + string3.toLowerCase(Locale.ENGLISH) + '}', kL2.toString(), false, 4, null);
            }
        }
        int n = this.b;
        this.b = n + 1;
        return new aZ(ch2.c((CharSequence)string2).b(), ch2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection getUsersByIP(@Nullable String string) {
        Object object;
        block13: {
            block12: {
                this.b();
                if (string == null) break block12;
                object = string;
                boolean bl = false;
                if (jj_0.a.i((String)object) && !jj_0.a(string)) break block13;
            }
            throw new IllegalArgumentException(c[7] + string);
        }
        object = (w)this.a.a(w.class);
        Closeable closeable = ((w)object).f();
        Throwable throwable = null;
        try {
            boolean bl;
            iA iA2;
            ch ch2 = (ch)closeable;
            boolean bl2 = false;
            List list = kR.b(ch2, string, 0, 2, null);
            if (list.isEmpty()) {
                Collection collection = ll.e();
                return collection;
            }
            Iterable iterable = list;
            boolean bl3 = false;
            Iterable iterable2 = iterable;
            Collection collection = new ArrayList();
            boolean bl4 = false;
            for (Object t2 : iterable2) {
                iA2 = (iA)t2;
                bl = false;
                if (!jj_0.a(iA2.b())) continue;
                collection.add(t2);
            }
            iterable = (List)collection;
            bl3 = false;
            iterable2 = iterable;
            collection = new ArrayList(ll.a(iterable, 10));
            bl4 = false;
            for (Object t2 : iterable2) {
                iA2 = (iA)t2;
                Collection collection2 = collection;
                bl = false;
                collection2.add(UUID.fromString(iA2.b()));
            }
            Collection collection3 = ll.b((Iterable)((List)collection));
            return collection3;
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
    @Override
    public String getPlayerName(@NotNull UUID uUID) {
        this.b();
        w w2 = (w)this.a.a(w.class);
        Closeable closeable = w2.f();
        Throwable throwable = null;
        try {
            ch ch2 = (ch)closeable;
            boolean bl = false;
            iA iA2 = ch2.c(uUID.toString());
            String string = iA2 != null ? iA2.a() : null;
            return string;
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
    @Override
    public UUID getPlayerUUID(@NotNull String string) {
        this.b();
        w w2 = (w)this.a.a(w.class);
        Closeable closeable = w2.f();
        Throwable throwable = null;
        try {
            ch ch2 = (ch)closeable;
            boolean bl = false;
            iA iA2 = ch2.c(string);
            String string2 = jj_0.a.g(iA2 != null ? iA2.b() : null);
            if (jj_0.a(string2)) {
                UUID uUID = UUID.fromString(string2);
                return uUID;
            }
            UUID uUID = null;
            return uUID;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            bt_0.a(closeable, throwable);
        }
    }

    public String toString() {
        return c[8];
    }

    private final void b() {
        if (this.a.u()) {
            throw new IllegalStateException(c[9]);
        }
    }

    private static final void a() {
        c = new String[]{"__DEFAULT__", "Negative ID: ", "__DEFAULT__", "__DEFAULT__", "__DEFAULT__", "Database connection not available", "{table_prefix}", "Target is not an IP address: ", "Database", "Database queries cannot be executed on the main server thread!"};
    }

    static {
        k4.a();
    }
}

