package litebans;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

public final class SQLiteDriverHandler_2 {
        private SQLiteDriverHandler_2() {
    }

    public final String LiteBansModule_31() {
        return DatabaseMonitorService.GnuSparseMapHandler();
    }

    public final String AsyncBackgroundTask_5() {
        return DatabaseMonitorService.g();
    }

    public final String c() {
        return DatabaseMonitorService.DatabaseMonitorService();
    }

    public final boolean LiteBansModule_31(@NotNull String string) {
        String string2 = string;
        return ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"mysql") || ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"mariadb");
    }

    public final boolean BaseCoreGenericHandler(@NotNull String string) {
        String string2 = string;
        return !ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"sqlite") && !ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"LiteBansModule_244");
    }

    public final String c(@NotNull String v1) {
        block15: {
            block13: {
                block12: {
                    block14: {
                        block11: {
                            v2 = v1;
                            v3 = v2.toLowerCase(Locale.ENGLISH);
                            switch (v3.hashCode()) {
                                case 839186932: {
                                    if (!v3.equals("mariadb")) {
                                        break;
                                    }
                                    break block11;
                                }
                                case -894935028: {
                                    if (!v3.equals("sqlite")) {
                                        break;
                                    }
                                    break block12;
                                }
                                case 104382626: {
                                    if (v3.equals("mysql")) break;
                                    break;
                                }
                                case 3274: {
                                    if (!v3.equals("LiteBansModule_244")) {
                                        break;
                                    }
                                    break block13;
                                }
                                case 106616951: {
                                    if (!v3.equals("pgsql")) {
                                        break;
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
                        v0 = v1;
        }
        return v0;
    }

    public /* synthetic */ SQLiteDriverHandler_2(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"mysql", "mariadb", "pgsql", "postgresql", "sqlite", "LiteBansModule_244", "mariadb", "sqlite", "mysql", "LiteBansModule_244", "pgsql", "MySQL", "MariaDB", "PostgreSQL", "SQLite", "H2"};
    }

    static {
        SQLiteDriverHandler_2.BaseCoreGenericHandler();
    }
}

