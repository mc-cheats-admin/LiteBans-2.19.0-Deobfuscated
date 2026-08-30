package litebans;

import java.util.Locale;
import litebans.aJ;
import litebans.ew;
import litebans.hl;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class cJ {
    private static /* synthetic */ String[] a;

    private cJ() {
    }

    public final String b() {
        return w.j();
    }

    public final String d() {
        return w.g();
    }

    public final String c() {
        return w.w();
    }

    public final boolean b(@NotNull String string) {
        String string2 = string;
        return ew.a((Object)string2, (Object)"mysql") || ew.a((Object)string2, (Object)"mariadb");
    }

    public final boolean a(@NotNull String string) {
        String string2 = string;
        return !ew.a((Object)string2, (Object)"sqlite") && !ew.a((Object)string2, (Object)"h2");
    }

    public final String c(@NotNull String var1_1) {
        block15: {
            block13: {
                block12: {
                    block14: {
                        block11: {
                            var3_2 = var1_1;
                            var2_3 = var3_2.toLowerCase(Locale.ENGLISH);
                            switch (var2_3.hashCode()) {
                                case 839186932: {
                                    if (!var2_3.equals("mariadb")) {
                                        ** break;
                                    }
                                    break block11;
                                }
                                case -894935028: {
                                    if (!var2_3.equals("sqlite")) {
                                        ** break;
                                    }
                                    break block12;
                                }
                                case 104382626: {
                                    if (var2_3.equals("mysql")) break;
                                    ** break;
                                }
                                case 3274: {
                                    if (!var2_3.equals("h2")) {
                                        ** break;
                                    }
                                    break block13;
                                }
                                case 106616951: {
                                    if (!var2_3.equals("pgsql")) {
                                        ** break;
                                    }
                                    break block14;
                                }
                            }
                            v0 = "MySQL";
                            break block15;
                        }
                        v0 = "MariaDB";
                        break block15;
                    }
                    v0 = "PostgreSQL";
                    break block15;
                }
                v0 = "SQLite";
                break block15;
            }
            v0 = "H2";
            break block15;
lbl37:
            // 6 sources

            v0 = var1_1;
        }
        return v0;
    }

    public /* synthetic */ cJ(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{"mysql", "mariadb", "pgsql", "postgresql", "sqlite", "h2", "mariadb", "sqlite", "mysql", "h2", "pgsql", "MySQL", "MariaDB", "PostgreSQL", "SQLite", "H2"};
    }

    static {
        cJ.a();
    }
}

