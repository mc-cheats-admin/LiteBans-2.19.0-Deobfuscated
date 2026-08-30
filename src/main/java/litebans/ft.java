package litebans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;
import litebans.a_;
import litebans.bK;
import litebans.bz;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.eq_0;
import litebans.ew;
import litebans.fS;
import litebans.f_;
import litebans.fg_0;
import litebans.gf_0;
import litebans.hl;
import litebans.iv_0;
import litebans.jj_0;
import litebans.kR;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public static final class ft
extends fS {
    private static /* synthetic */ String[] m;

    public ft(@NotNull di_0 di_02) {
        super(di_02, m[0], null, 0, 0L, 28, null);
    }

    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        this.a(m[1], a_.h, connection, ch2);
        this.a(m[2], a_.j, connection, ch2);
    }

    private final void a(String string, a_ a_2, Connection connection, ch ch2) {
        try {
            String string2 = bz.a(string, Locale.ENGLISH);
            String string3 = m[3] + string2 + m[4] + string + m[5] + string2 + m[6] + string + m[7] + string2 + m[8] + string + m[9] + string2 + '\'';
            ft.a(this, connection, m[10] + string3, string, ch2, a_2, false, 32, null);
            this.a(connection, m[11] + string3, string, ch2, a_2, false);
        }
        catch (Exception exception) {
            fg_0 fg_02 = this;
            boolean bl = false;
            ((w)fg_02.h().a(w.class)).a(exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(Connection connection, String string, String string2, ch ch2, a_ a_2, boolean bl) {
        PreparedStatement preparedStatement = connection.prepareStatement(string);
        AutoCloseable autoCloseable = preparedStatement;
        Throwable throwable = null;
        try {
            Object object = (PreparedStatement)autoCloseable;
            boolean bl2 = false;
            ResultSet resultSet = preparedStatement.executeQuery();
            AutoCloseable autoCloseable2 = resultSet;
            Throwable throwable2 = null;
            try {
                Object object2 = (ResultSet)autoCloseable2;
                boolean bl3 = false;
                while (resultSet.next()) {
                    String string3 = resultSet.getString(m[12]);
                    String string4 = bK.c.e(resultSet.getString(m[13]));
                    String string5 = resultSet.getString(m[14]);
                    String string6 = resultSet.getString(m[15]);
                    String string7 = resultSet.getString(m[16]);
                    ew.a((Object)string7);
                    String string8 = string7;
                    String string9 = string8.toLowerCase(Locale.ENGLISH);
                    string8 = null;
                    boolean bl4 = bz.a((CharSequence)string9, (CharSequence)(m[17] + string2), false, 2, null);
                    String string10 = string4;
                    boolean bl5 = false;
                    if (jj_0.a.i(string10) && !bl4) {
                        this.m().warning(m[18] + string7 + '!');
                        bl4 = true;
                    }
                    if (bl4) {
                        string8 = string4;
                        string4 = this.b(string3);
                    }
                    string10 = string4;
                    bl5 = false;
                    if (!jj_0.a(string10)) {
                        this.m().warning(m[19] + string4 + m[20] + string7 + '!');
                        string4 = this.b(string4);
                    }
                    string10 = string4;
                    bl5 = false;
                    if (!jj_0.a(string10)) {
                        this.m().warning(m[21] + string7 + m[22] + string4);
                        string4 = null;
                    }
                    long l3 = resultSet.getLong(m[23]);
                    long l5 = Math.max(resultSet.getLong(m[24]), 0L);
                    Object object3 = this;
                    boolean bl6 = false;
                    String string11 = ((q_0)((fg_0)object3).h().a(q_0.class)).f().aw();
                    Object object4 = this;
                    boolean bl7 = false;
                    object3 = eq_0.f.a(((q_0)((fg_0)object4).h().a(q_0.class)).f().a5(), string11, this.h().y());
                    if (!bl || kR.a(ch2, string4, null, null, false, false, 30, null) == null) {
                        ew.a((Object)string6);
                        object4 = new dZ(a_2, string4, string8, string6, this.b(string5), string5, (String)object3, string11, l3, l5, 0, false, bl4, bl, 0L, 19456, null);
                        ch2.c((dZ)object4);
                        if (a_2 == a_.h) {
                            this.g().incrementAndGet();
                        }
                    } else {
                        this.m().warning(m[25] + string2 + m[26] + string4);
                    }
                    if (string4 == null) continue;
                    di_0 di_02 = this.h();
                    ew.a((Object)string3);
                    new gf_0(di_02, string3, string4, string8).run();
                }
                object2 = iv_0.a;
            }
            catch (Throwable throwable3) {
                throwable2 = throwable3;
                throw throwable3;
            }
            finally {
                f_.a(autoCloseable2, throwable2);
            }
            object = iv_0.a;
        }
        catch (Throwable throwable4) {
            throwable = throwable4;
            throw throwable4;
        }
        finally {
            f_.a(autoCloseable, throwable);
        }
    }

    static /* synthetic */ void a(ft ft2, Connection connection, String string, String string2, ch ch2, a_ a_2, boolean bl, int n, Object object) {
        if ((n & 0x20) != 0) {
            bl = true;
        }
        ft2.a(connection, string, string2, ch2, a_2, bl);
    }

    private static final void a() {
        m = new String[]{hl.a("\u1a36\u1a13\u1a01\u1a16\u1a19\u1a14\u1a12\u1a13\u1a35\u1a16\u1a19", 33692279), hl.a("\u2e01\u2e02\u2e0d", 518925923), hl.a("\ue9de\ue9c6\ue9c7\ue9d6", -116987469), hl.a("\u1347\u1358\u1355\u1342\u1355\u1330\u1360\u1365\u137e\u1379\u1363\u1378\u137d\u1375\u137e\u1364\u1344\u1369\u1360\u1375\u132d\u1337", 1023283984), hl.a("\u20ab\u20ac\u20c3\u20de\u20ac\u20fc\u20f9\u20e2\u20e5\u20ff\u20e4\u20e1\u20e9\u20e2\u20f8\u20d8\u20f5\u20fc\u20e9\u20b1\u20ab\u20d8\u20e9\u20e1\u20fc", 1304830092), hl.a("\ucfba\ucfbd\ucfd2\ucfcf\ucfbd\ucfed\ucfe8\ucff3\ucff4\ucfee\ucff5\ucff0\ucff8\ucff3\ucfe9\ucfc9\ucfe4\ucfed\ucff8\ucfa0\ucfba\ucfc9\ucfd8\ucfd0\ucfcd\ucfc2", 374132637), hl.a("\u8fa2\u8fa5\u8fca\u8fd7\u8fa5\u8ff5\u8ff0\u8feb\u8fec\u8ff6\u8fed\u8fe8\u8fe0\u8feb\u8ff1\u8fd1\u8ffc\u8ff5\u8fe0\u8fb8\u8fa2\u8fcc\u8ff5", 2047512453), hl.a("\uc108\uc10f\uc160\uc17d\uc10f\uc15f\uc15a\uc141\uc146\uc15c\uc147\uc142\uc14a\uc141\uc15b\uc17b\uc156\uc15f\uc14a\uc112\uc108\uc166\uc17f\uc170", -589119185), hl.a("\uea73\uea74\uea1b\uea06\uea74\uea24\uea21\uea3a\uea3d\uea27\uea3c\uea39\uea31\uea3a\uea20\uea00\uea2d\uea24\uea31\uea69\uea73\uea00\uea31\uea39\uea24\uea3d\uea24", -608966060), hl.a("\u47f5\u47f2\u479d\u4780\u47f2\u47a2\u47a7\u47bc\u47bb\u47a1\u47ba\u47bf\u47b7\u47bc\u47a6\u4786\u47ab\u47a2\u47b7\u47ef\u47f5\u4786\u4797\u479f\u4782\u478d\u479b\u4782\u478d", 547309522), hl.a("\u374a\u375c\u3755\u375c\u375a\u374d\u3739\u3733\u3739\u375f\u374b\u3756\u3754\u3739\u3749\u376c\u3777\u3770\u376a\u3771\u3774\u377c\u3777\u376d\u376a\u3739", 599340825), hl.a("\u80c5\u80d3\u80da\u80d3\u80d5\u80c2\u80b6\u80bc\u80b6\u80d0\u80c4\u80d9\u80db\u80b6\u80c6\u80e3\u80f8\u80ff\u80e5\u80fe\u80fb\u80f3\u80f8\u80e2\u80de\u80ff\u80e5\u80e2\u80f9\u80e4\u80ef\u80b6", 1292402838), hl.a("\u7380\u738f\u7383\u738b", -1196657682), hl.a("\u1eae\u1eae\u1eb2\u1ebf", 1384849115), hl.a("\u14b9\u14a6\u14b3\u14a4\u14b7\u14a2\u14b9\u14a4", 1311577302), hl.a("\ua57d\ua56a\ua56e\ua57c\ua560\ua561", -1456036593), hl.a("\u2fd1\u2fd4\u2fcf\u2fc8\u2fd2\u2fc9\u2fcc\u2fc4\u2fcf\u2fd5\u2ff5\u2fd8\u2fd1\u2fc4", 636956577), hl.a("\u9bfa\u9be3", 1621728147), hl.a("\u1a31\u1a28\u1a58\u1a0f\u1a19\u1a0b\u1a58\u1a0b\u1a0c\u1a17\u1a0a\u1a1d\u1a1c\u1a58\u1a11\u1a16\u1a58\u1a2d\u1a2d\u1a31\u1a3c\u1a58\u1a1b\u1a17\u1a14\u1a0d\u1a15\u1a16\u1a58\u1a1e\u1a17\u1a0a\u1a58", -969991560), hl.a("\u6388\u63ae\u63b8\u63af\u63b3\u63bc\u63b0\u63b8\u63fd\u63f5\u63fa", 120677341), hl.a("\ud320\ud32e\ud327\ud370\ud366\ud374\ud327\ud374\ud373\ud368\ud375\ud362\ud363\ud327\ud36e\ud369\ud327\ud352\ud352\ud34e\ud343\ud327\ud364\ud368\ud36b\ud372\ud36a\ud369\ud327\ud361\ud368\ud375\ud327", -951332089), hl.a("\u5ea5\u5e82\u5e8a\u5e8f\u5e86\u5e87\u5ec3\u5e97\u5e8c\u5ec3\u5e8a\u5e8e\u5e93\u5e8c\u5e91\u5e97\u5ec3", -1962451229), hl.a("\u8a15\u8a53\u8a5a\u8a47\u8a15", -833582539), hl.a("\u279b\u279c\u2789\u279a\u279c", -830068760), hl.a("\ub888\ub883\ub889", 369998061), hl.a("\uad89\uada7\uadae\uadaf\uadb2\uada9\uadae\uada7\uade0\uada4\uadb5\uadb0\uadac\uada9\uada3\uada1\uadb4\uada5\uade0", -47731264), hl.a("\ud8bf\ud8f9\ud8f0\ud8ed\ud8bf", 217372831)};
    }

    static {
        ft.a();
    }
}

