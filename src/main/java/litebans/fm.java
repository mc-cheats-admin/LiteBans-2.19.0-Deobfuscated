package litebans;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;
import java.util.UUID;
import litebans.a_;
import litebans.ch;
import litebans.cn;
import litebans.di_0;
import litebans.ew;
import litebans.fS;
import litebans.f_;
import litebans.fg_0;
import litebans.hl;
import litebans.i0;
import litebans.iv_0;
import litebans.jv_0;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

public final class fm
extends fS {
    private final byte[] m = i0.a(jv_0.b);
    private static /* synthetic */ String[] n;

    public fm(@NotNull di_0 di_02) {
        super(di_02, "LibertyBans", "libertybans_", 0, 0L, 24, null);
    }

    public final byte[] a() {
        return this.m;
    }

    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        fm.a(this, connection, bl, ch2, a_.h, null, 16, null);
        fm.a(this, connection, bl, ch2, a_.j, null, 16, null);
        this.a(connection, bl, ch2, a_.c, "warns");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(Connection connection, boolean bl, ch ch2, a_ a_2, String string) {
        String string2 = "SELECT * FROM " + this.i() + "applicable_" + string;
        Object object = this;
        boolean bl2 = false;
        object = (q_0)((fg_0)object).h().a(q_0.class);
        bl2 = false;
        if (((q_0)object).g()) {
            Object object2 = object;
            boolean bl3 = false;
            ((q_0)object2).a((Object)string2);
        }
        object = connection.prepareStatement(string2);
        AutoCloseable autoCloseable = (AutoCloseable)object;
        Throwable throwable = null;
        try {
            Object object3 = (PreparedStatement)autoCloseable;
            boolean bl4 = false;
            if (object.execute()) {
                ResultSet resultSet = object.getResultSet();
                AutoCloseable autoCloseable2 = resultSet;
                Throwable throwable2 = null;
                try {
                    Object object4 = (ResultSet)autoCloseable2;
                    boolean bl5 = false;
                    while (resultSet.next()) {
                        Object object5;
                        String string3;
                        Object object6;
                        long l3;
                        long l5;
                        Object object7;
                        UUID uUID;
                        Object object8;
                        Object object9;
                        Object object10;
                        block29: {
                            boolean bl6;
                            boolean bl7;
                            int n = resultSet.getInt("victim_type");
                            object10 = this;
                            ew.a(resultSet);
                            object9 = resultSet;
                            boolean bl8 = false;
                            byte[] byArray = object9.getBytes("victim_uuid");
                            Object object11 = null;
                            Object object12 = byArray;
                            boolean bl9 = false;
                            if (object12 != null && ((byte[])object12).length == 16) {
                                object12 = byArray;
                                ew.a(object12);
                                object11 = i0.a((byte[])object12);
                            }
                            if (object11 == null || ew.a(object11, cn.c())) {
                                byArray = object9.getBytes("uuid");
                                object12 = byArray;
                                bl9 = false;
                                if (object12 != null && ((Object)object12).length == 16) {
                                    object12 = byArray;
                                    ew.a(object12);
                                    object11 = i0.a((byte[])object12);
                                }
                            }
                            object12 = (fg_0)object10;
                            bl9 = false;
                            object12 = (q_0)((fg_0)object12).h().a(q_0.class);
                            bl9 = false;
                            if (((q_0)object12).g()) {
                                object8 = object12;
                                bl7 = false;
                                ((q_0)object8).a((Object)("victim: " + object11));
                            }
                            uUID = object11;
                            object9 = this;
                            object7 = resultSet;
                            boolean bl10 = false;
                            object12 = object11 = (Object)object7.getBytes("operator");
                            bl9 = false;
                            object8 = object12;
                            bl7 = false;
                            if (!(object8 != null && ((Object)object8).length == 16)) {
                                object11 = ((fm)object9).a();
                            }
                            object12 = object11;
                            ew.a(object12);
                            object10 = i0.a((byte[])object12);
                            object9 = null;
                            if (bl) {
                                byte[] byArray2;
                                object7 = this;
                                ResultSet resultSet2 = resultSet;
                                boolean bl11 = false;
                                object12 = null;
                                if (n != 0 && (byArray2 = resultSet2.getBytes("address")).length >= 4) {
                                    object8 = (fS)object7;
                                    ew.a(byArray2);
                                    byte[] byArray3 = byArray2;
                                    bl6 = false;
                                    object12 = InetAddress.getByAddress(byArray3).getHostAddress().toString();
                                }
                                object9 = object12;
                            }
                            object7 = resultSet.getString("reason");
                            l5 = resultSet.getLong("start") * (long)1000;
                            l3 = resultSet.getLong("end") * (long)1000;
                            object6 = this;
                            bl6 = false;
                            if (uUID == null) {
                                string3 = null;
                            } else {
                                object5 = connection.prepareStatement("SELECT name FROM " + ((fS)object6).i() + "latest_names WHERE uuid=?");
                                AutoCloseable autoCloseable3 = (AutoCloseable)object5;
                                Throwable throwable3 = null;
                                try {
                                    Object object13 = (PreparedStatement)autoCloseable3;
                                    boolean bl12 = false;
                                    object5.setBytes(1, i0.a(uUID));
                                    object5.execute();
                                    ResultSet resultSet3 = object5.getResultSet();
                                    if (resultSet3 != null && resultSet3.next()) {
                                        String string4 = resultSet3.getString(1);
                                        string3 = string4;
                                        break block29;
                                    }
                                    object13 = iv_0.a;
                                }
                                catch (Throwable throwable4) {
                                    throwable3 = throwable4;
                                    throw throwable4;
                                }
                                finally {
                                    f_.a(autoCloseable3, throwable3);
                                }
                                string3 = null;
                            }
                        }
                        object8 = string3;
                        ew.a(object7);
                        object6 = object7;
                        String string5 = this.a((UUID)object10);
                        object5 = object9;
                        fS.a(this, ch2, (String)object8, (String)object6, l5, l3, string5, uUID, (UUID)object10, (String)object5, null, a_2, 512, null);
                    }
                    object4 = iv_0.a;
                }
                catch (Throwable throwable5) {
                    throwable2 = throwable5;
                    throw throwable5;
                }
                finally {
                    f_.a(autoCloseable2, throwable2);
                }
            }
            object3 = iv_0.a;
        }
        catch (Throwable throwable6) {
            throwable = throwable6;
            throw throwable6;
        }
        finally {
            f_.a(autoCloseable, throwable);
        }
    }

    static /* synthetic */ void a(fm fm2, Connection connection, boolean bl, ch ch2, a_ a_2, String string, int n, Object object) {
        if ((n & 0x10) != 0) {
            String string2 = a_2.a().name();
            string = string2.toLowerCase(Locale.ENGLISH);
        }
        fm2.a(connection, bl, ch2, a_2, string);
    }

    private static final void c() {
        n = new String[]{"LibertyBans", "libertybans_", "warns", "SELECT * FROM ", "applicable_", "victim_type", "victim_uuid", "uuid", "victim: ", "operator", "address", "reason", "start", "end", "SELECT name FROM ", "latest_names WHERE uuid=?", "address", "victim_uuid", "uuid", "victim: ", "operator", "SELECT name FROM ", "latest_names WHERE uuid=?"};
    }

    static {
        fm.c();
    }
}

