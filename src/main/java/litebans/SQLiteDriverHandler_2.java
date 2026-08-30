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
        return !ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"sqlite") && !ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"LiteBansModule_243");
    }

    public final String c(@NotNull String v1) {
{
                            arg1 = v1;
                            arg2 = arg1.toLowerCase(Locale.ENGLISH);
                            switch (arg2.hashCode()) {
                                case 839186932: {
                                    if (!arg2.equals("mariadb")) {
                                        break;
                                    }
                                    break;
                                }
                                case -894935028: {
                                    if (!arg2.equals("sqlite")) {
                                        break;
                                    }
                                    break;
                                }
                                case 104382626: {
                                    if (arg2.equals("mysql")) break;
                                    break;
                                }
                                case 3274: {
                                    if (!arg2.equals("LiteBansModule_243")) {
                                        break;
                                    }
                                    break;
                                }
                                case 106616951: {
                                    if (!arg2.equals("pgsql")) {
                                        break;
                                    }
                                    break;
}
                            v0 = "MySQL";
                            break;
                        }
                        v0 = "MariaDB";
                        break;
                    }
                    v0 = "PostgreSQL";
                    break;
                }
                v0 = "SQLite";
                break;
            }
            v0 = "H2";
            break;
                        v0 = v1;
        }
        return v0;
    }

    public /* synthetic */ SQLiteDriverHandler_2(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"mysql", "mariadb", "pgsql", "postgresql", "sqlite", "LiteBansModule_243", "mariadb", "sqlite", "mysql", "LiteBansModule_243", "pgsql", "MySQL", "MariaDB", "PostgreSQL", "SQLite", "H2"};
}

