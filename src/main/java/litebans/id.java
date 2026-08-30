package litebans;

import java.io.Closeable;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import litebans.aJ;
import litebans.am;
import litebans.bt_0;
import litebans.bz;
import litebans.ch;
import litebans.eG;
import litebans.ew;
import litebans.f_;
import litebans.fg_0;
import litebans.fo_0;
import litebans.hl;
import litebans.iv_0;
import litebans.jv_0;
import litebans.kL;
import litebans.m_0;
import litebans.n_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class id {
    private static /* synthetic */ String[] a;

    private id() {
    }

    public final ThreadLocal a() {
        return m_0.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final boolean a(@NotNull w w2) {
        File file;
        boolean bl;
        Object object;
        Object object2;
        boolean bl2;
        eG eG2 = w2.p().f();
        String string = eG2.q();
        boolean bl3 = bl2 = bz.c((CharSequence)string, ':', false, 2, null) || ew.a((Object)string, (Object)"localhost") || ew.a((Object)string, (Object)"127.0.0.1");
        if (bl2) {
            object2 = w2.a.getDataFolder();
            object = "litebans.sqlite";
            bl = false;
            string = new File((File)object2, (String)object).getPath();
        }
        if ((file = new File(string)).exists()) {
            block21: {
                object2 = w2;
                object = "Converting SQLite database to H2 database.. + ";
                bl = false;
                ((n_0)object2).a.getLogger().info((String)object);
                object2 = new w(w2.a);
                ((w)object2).a(false);
                ((w)object2).e();
                eG2.c("h2");
                w2.k().b("h2");
                w2.a(w2.p());
                w.a(w2, 0L, false, false, false, 15, null);
                object = w2;
                bl = false;
                try {
                    ch ch2 = ((w)object).f();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object object3 = (ch)closeable;
                        boolean bl4 = false;
                        ch ch3 = ch2;
                        boolean bl5 = false;
                        AutoCloseable autoCloseable = ((w)object2).c();
                        Throwable throwable2 = null;
                        try {
                            Object object4 = (Connection)autoCloseable;
                            boolean bl6 = false;
                            if (object4 == null) {
                            } else {
                                kL[] kLArray = kL.values();
                                boolean bl7 = false;
                                int n = kLArray.length;
                                for (int i = 0; i < n; ++i) {
                                    kL kL2;
                                    kL kL3 = kL2 = kLArray[i];
                                    boolean bl8 = false;
                                    ch3.a((Connection)object4, kL3, true);
                                }
                                long l3 = ch3.c();
                                Object object5 = ch3.e().y();
                                Object object6 = am.cL.a("amount", (Object)l3);
                                boolean bl9 = false;
                                fo_0.a(fg_0.a, (jv_0)object5, (CharSequence)object6, null, 4, null);
                                object4.close();
                                ((w)object2).c();
                                if (file.exists()) {
                                    object6 = file.getParentFile();
                                    String string2 = file.getName() + ".backup";
                                    boolean bl10 = false;
                                    object5 = new File((File)object6, string2);
                                    if (file.renameTo((File)object5)) {
                                        object6 = w2;
                                        string2 = "Renamed SQLite database: " + file.getName() + " => " + ((File)object5).getName();
                                        bl10 = false;
                                        ((n_0)object6).a.getLogger().info(string2);
                                    }
                                }
                                object5 = w2;
                                object6 = "SQLite -> H2 conversion completed ";
                                boolean bl11 = false;
                                ((n_0)object5).a.getLogger().info((String)object6);
                                object4 = iv_0.a;
                            }
                        }
                        catch (Throwable throwable3) {
                            throwable2 = throwable3;
                            throw throwable3;
                        }
                        finally {
                            f_.a(autoCloseable, throwable2);
                        }
                        object3 = iv_0.a;
                    }
                    catch (Throwable throwable4) {
                        throwable = throwable4;
                        throw throwable4;
                    }
                    finally {
                        bt_0.a(closeable, throwable);
                    }
                }
                catch (SQLException sQLException) {
                    if (((w)object).b(sQLException)) break block21;
                    throw sQLException;
                }
            }
            return true;
        }
        eG2.c("h2");
        w2.k().b("h2");
        return false;
    }

    public /* synthetic */ id(aJ aJ2) {
        this();
    }

    private static final void b() {
        a = new String[]{"localhost", "127.0.0.1", "litebans.sqlite", "Converting SQLite database to H2 database.. + ", "h2", "h2", "amount", ".backup", "Renamed SQLite database: ", " => ", "SQLite -> H2 conversion completed ", "h2", "h2"};
    }

    static {
        id.b();
    }
}

