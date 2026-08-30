package litebans;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SQLiteDriverHandler_3
implements LiteBansModule_83 {
    public static final NameHandler_2 LiteBansModule_403;
    private final PlatformPlugin LiteBansModule_241;
    private final Connection AsyncBackgroundTask_5;
    private final PunishmentTableService Utf8Handler_2;
    private final BroadcastService g;
    private final ConfigService LiteBansModule_195;
    private static final LiteBansModule_179 BaseCoreGenericHandler;
    public static final int e;
    public static final int GnuSparseMapHandler;
    public static final int LiteBansModule_31;
    public static final int c;
    private static int i;
        public SQLiteDriverHandler_3(@NotNull PlatformPlugin plugin, @NotNull Connection connection) {
        this.LiteBansModule_241 = plugin;
        this.AsyncBackgroundTask_5 = connection;
        this.Utf8Handler_2 = (PunishmentTableService)this.LiteBansModule_241.BaseCoreGenericHandler(PunishmentTableService.class);
        this.g = (BroadcastService)this.LiteBansModule_241.BaseCoreGenericHandler(BroadcastService.class);
        this.LiteBansModule_195 = (ConfigService)this.LiteBansModule_241.BaseCoreGenericHandler(ConfigService.class);
    }

    @Override
    public final PlatformPlugin e() {
        return this.LiteBansModule_241;
    }

    public final BroadcastService c() {
        return this.g;
    }

    public final ConfigService g() {
        return this.LiteBansModule_195;
    }

    public DatabaseMetaData AsyncBackgroundTask_5() {
        return this.AsyncBackgroundTask_5.getMetaData();
    }

    @Override
    public boolean LiteBansModule_31() {
        return this.AsyncBackgroundTask_5.isClosed();
    }

    @Override
    public long c() {
        Iterable iterable = BansHandler_2.AsyncBackgroundTask_5.BaseCoreGenericHandler();
        long l3 = 0L;
        for (Object t2 : iterable) {
            BansHandler_2 kL2 = (BansHandler_2)t2;
            long l5 = l3;
            long l7 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, kL2, null, false, 6, null);
            l3 = l5 + l7;
        }
        return l3;
    }

    public final LiteBansModule_356 BaseCoreGenericHandler(@NotNull SilentHandler dZ2, boolean flag) {
        String string = "uuid,ip,reason,banned_by_uuid,banned_by_name,time,until,template,server_scope,server_origin,silent,ipban,ipban_wildcard,active" + dZ2.g();
        CharSequence charSequence = string;
        int n = 44;
        CharSequence charSequence2 = charSequence;
        for (int i = 0; i < charSequence2.length(); ++i) {
            int n3;
            int n4 = n3 = charSequence2.charAt(i);
            if (!(n4 == n)) continue;
            ++n2;
        }
        int n5 = n2 + 1;
        charSequence = new StringBuilder((n5 + 1) * 2);
        for (n = 0; n < n5; ++n) {
            if (flag && n > 9) {
                ((StringBuilder)charSequence).append("?::bit,");
                continue;
            }
            ((StringBuilder)charSequence).append('?').append(',');
        }
        String string2 = ((StringBuilder)charSequence).substring(0, ((StringBuilder)charSequence).length() - 1);
        return LiteBansModule_373.BaseCoreGenericHandler(string, string2);
    }

    @Override
    public void c(@NotNull SilentHandler dZ2) {
        boolean flag;
        String string;
        String string2;
        int n;
        boolean flag2;
        ConfigService configService;
        LiteBansModule_356 jT2 = this.plugin(dZ2, ObjectUtilities.BaseCoreGenericHandler((Object)this.LiteBansModule_195.LiteBansModule_195().ElementsHandler(), (Object)"pgsql"));
        String string3 = (String)jT2.BaseCoreGenericHandler();
        String string4 = (String)jT2.c();
        Object contextObj = this.LiteBansModule_195;
        int n2 = 1;
        if (((ConfigService)contextObj).BaseCoreGenericHandler(n2)) {
            configService = contextObj;
            flag2 = false;
            configService.BaseCoreGenericHandler((Object)("Created new " + dZ2.ServerSyncService() + " for server:" + LiteBansModule_182.LiteBansModule_195.c(dZ2.m())));
        }
        contextObj = this.LiteBansModule_195;
        n2 = 1;
        flag3 = false;
        if (((ConfigService)contextObj).BaseCoreGenericHandler(n2)) {
            configService = contextObj;
            flag2 = false;
            configService.BaseCoreGenericHandler((Object)("Adding entry: " + dZ2));
        }
        Object resultObj = dZ2;
        flag3 = false;
        contextObj = "INSERT INTO " + ((SilentHandler)resultObj).ServerSyncService().BaseCoreGenericHandler() + '(' + string3 + ")VALUES(" + string4 + ')';
        resultObj = this.c((CharSequence)contextObj);
        flag3 = false;
        SilentHandler dZ3 = dZ2;
        Object helperObj = resultObj;
        Object tempObj = new String[5];
        String string5 = dZ3.DatabaseMonitorService();
        tempObj[0] = string5 != null ? LiteBansModule_243.BaseCoreGenericHandler(string5, 36) : null;
        String string6 = dZ3.PunishmentTableService();
        tempObj[1] = string6 != null ? LiteBansModule_243.BaseCoreGenericHandler(string6, 45) : null;
        CharSequence charSequence = dZ3.LiteBansModule_31();
        int n3 = 2048;
        tempObj[2] = LiteBansModule_243.BaseCoreGenericHandler(((Object)charSequence).toString(), n3);
        String string7 = dZ3.e();
        tempObj[3] = string7 != null ? LiteBansModule_243.BaseCoreGenericHandler(string7, 36) : null;
        String string8 = dZ3.LiteBansModule_435();
        tempObj[4] = string8 != null ? LiteBansModule_243.BaseCoreGenericHandler(string8, 128) : null;
        Object object6 = targetObj = helperObj;
        String[] args = tempObj;
        int n4 = args.length;
        for (n = 0; n < n4; ++n) {
            string = string2 = args[n];
            flag = false;
            ((LiteBansModule_60)helperObj).BaseCoreGenericHandler(string);
        }
        helperObj = targetObj;
        tempObj = new long[2];
        tempObj[0] = (String)dZ3.BroadcastService();
        tempObj[1] = (String)dZ3.LiteBansModule_403();
        flag6 = false;
        object6 = targetObj = helperObj;
        flag7 = false;
        args = tempObj;
        flag8 = false;
        n4 = args.length;
        for (n = 0; n < n4; ++n) {
            String string9;
            String string10 = string9 = args[n];
            ((LiteBansModule_60)helperObj).BaseCoreGenericHandler((long)string10);
        }
        helperObj = ((LiteBansModule_60)targetObj).BaseCoreGenericHandler(dZ3.r());
        tempObj = new String[]{LiteBansModule_182.LiteBansModule_195.c(dZ3.m()), LiteBansModule_182.LiteBansModule_195.c(dZ3.GnuSparseMapHandler())};
        flag6 = false;
        object6 = targetObj = helperObj;
        flag7 = false;
        args = tempObj;
        flag8 = false;
        n4 = args.length;
        for (n = 0; n < n4; ++n) {
            string = string2 = args[n];
            flag = false;
            ((LiteBansModule_60)helperObj).BaseCoreGenericHandler(string);
        }
        helperObj = targetObj;
        tempObj = new boolean[4];
        tempObj[0] = (String)dZ3.AsyncBackgroundTask_5();
        tempObj[1] = (String)dZ3.LiteBansModule_241();
        tempObj[2] = (String)dZ3.i();
        tempObj[3] = (String)dZ3.AsyncBackgroundTask_22();
        flag6 = false;
        object6 = targetObj = helperObj;
        flag7 = false;
        args = tempObj;
        flag8 = false;
        n4 = args.length;
        for (n = 0; n < n4; ++n) {
            String string11;
            String string12 = string11 = args[n];
            flag = false;
            ((LiteBansModule_60)helperObj).BaseCoreGenericHandler((boolean)string12);
        }
        helperObj = targetObj;
        tempObj = helperObj;
        flag6 = false;
        if (dZ3.ServerSyncService() == BanHandler.c) {
            ((LiteBansModule_60)resultObj).BaseCoreGenericHandler(dZ3.c());
        }
        LiteBansModule_185.LiteBansModule_31((LiteBansModule_60)helperObj);
    }

    @Override
    public LiteBansModule_298 BaseCoreGenericHandler(@NotNull LiteBansModule_298 iA2, boolean flag) {
        LiteBansModule_298 iA3;
        LiteBansModule_298 iA4 = iA3 = iA2;
        AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, iA4.BaseCoreGenericHandler(), iA4.LiteBansModule_31(), iA4.i(), flag, false, 16, null);
        return iA3;
    }

    @Override
    public void BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, @Nullable String string3, boolean flag, boolean flag2) {
        String string4;
        String string5;
        String string6 = string;
        if (string6 == null) {
            string6 = string5 = "#";
        }
        if ((string4 = string3) == null) {
            string4 = "#";
        }
        String string7 = string4;
        Object targetObj = LiteBansModule_403;
        String[] args = this;
        int n = string5.length();
        byte by2 = args.g().LiteBansModule_195().be();
        if (!(ObjectUtilities.BaseCoreGenericHandler(n, by2 & 0xFF) <= 0)) {
            by2 = 0;
            String string8 = "Player name \"" + string5 + "\" length > " + LiteBansModule_284.LiteBansModule_31(args.g().LiteBansModule_195().be());
            throw new IllegalArgumentException(string8.toString());
        }
        if (!(string2 == null || string2.length() <= 36)) {
            by2 = 0;
            String string9 = "UUID \"" + string2 + "\" length > 36";
            throw new IllegalArgumentException(string9.toString());
        }
        try {
            boolean flag5;
            int n2;
            String[] filteredArgs;
            int n3;
            int n4;
            if (this.plugin(string5, string2, string7)) {
                if (flag && !StringUtilities.c((CharSequence)string7, '#', false, 2, null) && string2 != null) {
                    CharSequence charSequence;
                    int n5;
                    targetObj = BansHandler_2.g;
                    targetObj = SQLiteDriverHandler.c(SQLiteDriverHandler.e("UPDATE " + targetObj), "date=CURRENT_TIMESTAMP");
                    String[] parsedArgs = (String[])"ip=?";
                    SQLiteDriverHandler_3 gZ2 = this;
                    flag3 = false;
                    Object helperObj = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)targetObj), parsedArgs};
                    by2 = 0;
                    CharSequence[] charSequenceArray = helperObj;
                    int n6 = charSequenceArray.length;
                    for (n5 = 0; n5 < n6; ++n5) {
                        CharSequence charSequence2;
                        charSequence = charSequence2 = charSequenceArray[n5];
                        if (charSequence.length() > 0) continue;
                        String string10 = "Failed ";
                        throw new IllegalArgumentException(string10.toString());
                    }
                    targetObj = gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)targetObj) + " WHERE " + parsedArgs), "uuid=?"), "name=?")));
                    parsedArgs = new String[]{string7, string2, string5};
                    flag3 = false;
                    Object tempObj = helperObj = targetObj;
                    String[] cmdArgs = parsedArgs;
                    n5 = 0;
                    int n7 = cmdArgs.length;
                    for (n6 = 0; n6 < n7; ++n6) {
                        CharSequence charSequence3 = charSequence = cmdArgs[n6];
                        ((LiteBansModule_60)targetObj).BaseCoreGenericHandler((String)charSequence3);
                    }
                    LiteBansModule_185.LiteBansModule_31((LiteBansModule_60)helperObj);
                }
                return;
            }
            if (this.LiteBansModule_195.LiteBansModule_195().LiteBansModule_3() && flag2) {
                CharSequence charSequence;
                targetObj = BansHandler_2.g;
                targetObj = SQLiteDriverHandler.e("DELETE FROM " + targetObj);
                args = m[24];
                resultObj = this;
                flag3 = false;
                Object object6 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)targetObj), args};
                by2 = 0;
                CharSequence[] charSequenceArray = object6;
                n4 = charSequenceArray.length;
                for (n3 = 0; n3 < n4; ++n3) {
                    CharSequence charSequence4;
                    charSequence = charSequence4 = charSequenceArray[n3];
                    if (charSequence.length() > 0) continue;
                    String string11 = m[25];
                    throw new IllegalArgumentException(string11.toString());
                }
                targetObj = ((SQLiteDriverHandler_3)resultObj).c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)targetObj) + m[26] + args), m[27])));
                args = new String[]{string5, string2};
                flag3 = false;
                Object object7 = object6 = targetObj;
                flag4 = false;
                filteredArgs = args;
                n3 = 0;
                n2 = filteredArgs.length;
                for (n4 = 0; n4 < n2; ++n4) {
                    CharSequence charSequence5 = charSequence = filteredArgs[n4];
                    flag5 = false;
                    ((LiteBansModule_60)targetObj).BaseCoreGenericHandler((String)charSequence5);
                }
                LiteBansModule_185.LiteBansModule_31((LiteBansModule_60)object6);
            }
            targetObj = BansHandler_2.g;
            args = m[28];
            resultObj = this;
            flag3 = false;
            String[] stringArray5 = args;
            char c = ',';
            flag4 = false;
            filteredArgs = stringArray5;
            n3 = 0;
            n4 = 0;
            for (n2 = 0; n2 < filteredArgs.length(); ++n2) {
                char c10;
                char c11 = c10 = filteredArgs.charAt(n2);
                flag5 = false;
                if (!(c11 == c)) continue;
                ++n4;
            }
            int n8 = n4;
            stringArray5 = m[29];
            if (n8 > 0) {
                StringBuilder stringBuilder = new StringBuilder(n8 * 2);
                Iterable iterable = new LiteBansModule_167(0, n8);
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    n2 = n4 = ((LiteBansModule_291)iterator).LiteBansModule_31();
                    stringBuilder.append(m[30]);
                }
                stringArray5 = StringUtilities.LiteBansModule_31(stringBuilder.toString(), 1);
            }
            Object object8 = targetObj;
            targetObj = ((SQLiteDriverHandler_3)resultObj).c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(m[31] + object8 + '(' + args + m[32] + (CharSequence)stringArray5 + ')')));
            Object object9 = targetObj;
            stringArray5 = object9;
            Object object10 = targetObj;
            String[] stringArray6 = new String[]{string5, string2, string7};
            Object object11 = contextObj = object10;
            String[] stringArray7 = stringArray6;
            flag5 = false;
            int n10 = stringArray7.length;
            for (n8 = 0; n8 < n10; ++n8) {
                String string12;
                String string13 = string12 = stringArray7[n8];
                ((LiteBansModule_60)object10).BaseCoreGenericHandler(string13);
            }
            LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)object9);
            targetObj = this.LiteBansModule_195;
            n9 = 1;
            if (((ConfigService)targetObj).BaseCoreGenericHandler(n9)) {
                resultObj = targetObj;
                ((ConfigService)resultObj).BaseCoreGenericHandler((Object)(m[33] + string5 + ':' + string2 + ':' + string7 + ']'));
            }
        }
        catch (SQLException sQLException) {
            String string14 = sQLException.getMessage();
            boolean bl23 = string14 != null ? StringUtilities.BaseCoreGenericHandler((CharSequence)string14, (CharSequence)m[34], false, 2, null) : false;
            if (bl23) {
                return;
            }
            this.AsyncBackgroundTask_5().BaseCoreGenericHandler(sQLException);
        }
    }

    @Override
    public void close() {
        this.AsyncBackgroundTask_5.close();
    }

    public final Statement LiteBansModule_195() {
        return this.AsyncBackgroundTask_5.createStatement();
    }

    @Override
    public int BaseCoreGenericHandler(@NotNull DescHandler hc2, @NotNull BanHandler a_2) {
        ResultSet resultSet = hc2.BaseCoreGenericHandler(a_2, (CharSequence)m[35]);
        int n = 1;
        Integer n2 = resultSet.next() ? Integer.valueOf(resultSet.getInt(n)) : null;
        return n2 != null ? n2 : 0;
    }

    @Override
    public List BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, @NotNull BanHandler a_2, @Nullable String string3, boolean flag, int n) {
        CharSequence charSequence;
        LiteBansModule_145 dy_02 = new LiteBansModule_145();
        dy_02.BaseCoreGenericHandler = LiteBansModule_403.c();
        long l3 = this.LiteBansModule_195.LiteBansModule_195().LiteBansModule_43();
        String string4 = m[36];
        if (string2 == null || StringUtilities.BaseCoreGenericHandler((CharSequence)string2, '#', false, 2, null)) {
            dy_02.BaseCoreGenericHandler = LiteBansModule_403.BaseCoreGenericHandler((LiteBansModule_179)dy_02.BaseCoreGenericHandler, arg_0 -> SQLiteDriverHandler_3.LiteBansModule_31(string, arg_0));
        } else {
            targetObj = m[37];
            charSequence = m[38];
            if (l3 > 0L) {
                string4 = string4 + m[39] + (String)targetObj + m[40] + l3 + m[41] + charSequence + m[42];
                dy_02.BaseCoreGenericHandler = LiteBansModule_403.BaseCoreGenericHandler((LiteBansModule_179)dy_02.BaseCoreGenericHandler, arg_0 -> SQLiteDriverHandler_3.c(string, string2, arg_0));
            } else {
                string4 = string4 + m[43] + (String)targetObj + m[44];
                dy_02.BaseCoreGenericHandler = LiteBansModule_403.BaseCoreGenericHandler((LiteBansModule_179)dy_02.BaseCoreGenericHandler, arg_0 -> SQLiteDriverHandler_3.LiteBansModule_31(string, string2, arg_0));
            }
        }
        targetObj = this.LiteBansModule_195.AsyncBackgroundTask_21().BaseCoreGenericHandler(a_2);
        if (!((Collection)targetObj).isEmpty()) {
            string4 = '(' + string4 + m[45] + CollectionUtilities.BaseCoreGenericHandler((Iterable)targetObj, m[46], null, null, 0, null, null, 62, null) + ')';
        }
        String string5 = string4;
        UuidHandler jR2 = UuidHandler.c;
        LiteBansModule_83 ch2 = this;
        AllHandler jJ2 = new AllHandler(ch2.e(), string3);
        charSequence = new TimeHandler(this, flag, n, dy_02, string5, jR2, jJ2);
        return this.LiteBansModule_31(DescHandler.BaseCoreGenericHandler((DescHandler)charSequence, a_2, null, 2, null), a_2);
    }

    @Override
    public List BaseCoreGenericHandler(@NotNull String string, @NotNull BanHandler a_2, @NotNull String string2, int n) {
        LiteBansModule_122 df_02 = DescHandler.GnuSparseMapHandler;
        UuidHandler jR2 = UuidHandler.e;
        DescHandler hc2 = LiteBansModule_122.BaseCoreGenericHandler(df_02, this, string, string2, jR2, false, m[47], false, n, null, 168, null);
        return this.LiteBansModule_31(DescHandler.BaseCoreGenericHandler(hc2, a_2, null, 2, null), a_2);
    }

    @Override
    public boolean LiteBansModule_31(@NotNull BansHandler_2 kL2, @NotNull String string, boolean flag) {
        boolean flag2;
        if (flag) {
            flag2 = LiteBansModule_185.AsyncBackgroundTask_5(this.c((CharSequence)(m[48] + kL2 + m[49] + string + m[50]))).next();
        } else {
            String string2;
            DatabaseMetaData databaseMetaData = this.AsyncBackgroundTask_5();
            String string3 = BansHandler_2.BaseCoreGenericHandler(kL2, null, false, 3, null);
            DatabaseMonitorService w2 = this.AsyncBackgroundTask_5();
            ConfigService configService = (ConfigService)w2.BaseCoreGenericHandler.BaseCoreGenericHandler(ConfigService.class);
            if (ObjectUtilities.BaseCoreGenericHandler((Object)configService.LiteBansModule_195().ElementsHandler(), (Object)m[51])) {
                String string4 = string;
                string2 = string4.toUpperCase(Locale.ENGLISH);
            } else {
                string2 = string;
            }
            flag2 = databaseMetaData.getColumns(null, null, string3, string2).next();
        }
        return flag2;
    }

    @Override
    public boolean LiteBansModule_31(@NotNull CharSequence charSequence) {
        return this.AsyncBackgroundTask_5().getTables(null, null, ((Object)charSequence).toString(), null).next();
    }

    @Override
    public List BaseCoreGenericHandler(@Nullable String string, int n) {
        String string2 = string;
        if (string2 == null || StringUtilities.BaseCoreGenericHandler((CharSequence)string2, '#', false, 2, null)) {
            return CollectionUtilities.e();
        }
        NameHandler_3 jp_02 = LiteBansModule_346.BaseCoreGenericHandler.Utf8Handler_2(string2);
        String string3 = jp_02.LiteBansModule_31();
        String string4 = LiteBansModule_403.BaseCoreGenericHandler(this, string3);
        if (jp_02.AsyncBackgroundTask_5() == 2 && StringUtilities.c((CharSequence)string2, '*', false, 2, null)) {
            string2 = StringUtilities.BaseCoreGenericHandler(string2, '*', '%', false, 4, null);
            string4 = m[52];
        }
        Object targetObj = BansHandler_2.g;
        CharSequence charSequence = this.g.Utf8Handler_2();
        targetObj = SQLiteDriverHandler.e(m[53] + charSequence + m[54] + targetObj);
        SQLiteDriverHandler_3 gZ2 = this;
        CharSequence[] charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)targetObj), string4};
        CharSequence[] charSequenceArray2 = charSequenceArray;
        int n2 = charSequenceArray2.length;
        for (int i = 0; i < n2; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            if (charSequence3.length() > 0) continue;
            String string5 = m[55];
            throw new IllegalArgumentException(string5.toString());
        }
        ResultSet resultSet = LiteBansModule_185.AsyncBackgroundTask_5(gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)targetObj) + m[56] + (CharSequence)string4), m[57]), (Number)n))).BaseCoreGenericHandler(string2));
        targetObj = new ArrayList(4);
        while (resultSet.next()) {
            ((Collection)targetObj).add(this.plugin(resultSet, true, this.LiteBansModule_195.LiteBansModule_195().ElementsHandler()));
        }
        return (List)targetObj;
    }

    @Override
    public LiteBansModule_298 BaseCoreGenericHandler(@NotNull ResultSet resultSet, boolean flag, @Nullable String string) {
        return new LiteBansModule_298(resultSet.getString(m[58]), LiteBansModule_346.LiteBansModule_195(resultSet.getString(m[59])), resultSet.getString(m[60]), this.g.BaseCoreGenericHandler(resultSet, m[61], flag, string));
    }

    @Override
    public Collection BaseCoreGenericHandler(@NotNull BanHandler a_2, long l3, long l5, boolean flag) {
        long l7 = Math.max(0L, l3);
        long l8 = Math.max(0L, l7 * l5);
        DescHandler hc2 = DescHandler.GnuSparseMapHandler.BaseCoreGenericHandler(this, m[62], m[63], UuidHandler.c, flag, m[64], false, l5, l8);
        return this.LiteBansModule_31(DescHandler.BaseCoreGenericHandler(hc2, a_2, null, 2, null), a_2);
    }

    @Override
    public SilentHandler BaseCoreGenericHandler(@NotNull SilentHandler dZ2, boolean flag) {
        return AllHandler_3.BaseCoreGenericHandler(this, dZ2.DatabaseMonitorService(), dZ2.LiteBansModule_241() ? dZ2.PunishmentTableService() : null, dZ2.ServerSyncService(), dZ2.m(), flag, false, 32, null);
    }

    @Override
    public SilentHandler BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, @NotNull BanHandler a_2, boolean flag, boolean flag2) {
        return this.plugin(string, string2, a_2, this.AsyncBackgroundTask_5().ServerSyncService(), flag, flag2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SilentHandler BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, @NotNull BanHandler a_2, @Nullable String string3, boolean flag, boolean flag2) {
        long l3;
        double d10;
        long l5;
        block13: {
            boolean flag3;
            boolean flag4;
            boolean flag5;
            AllHandler jJ2;
            boolean flag6;
            boolean flag7;
            String string4 = LiteBansModule_346.BaseCoreGenericHandler.g(string);
            AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, false, 1, null);
            if (flag2) {
                helperObj = this;
                flag7 = true;
                flag6 = false;
                jJ2 = new AllHandler_2(helperObj.e(), string3, flag7);
            } else {
                helperObj = this;
                flag7 = false;
                jJ2 = new AllHandler(helperObj.e(), string3);
            }
            AllHandler jJ3 = jJ2;
                        flag6 = false;
            helperObj = m[65] + (m[66] + ((SQLiteDriverHandler_3)tempObj).c().LiteBansModule_31() + m[67]);
            tempObj = m[68];
            String string5 = m[69];
            if (a_2 != BanHandler.c && a_2 != BanHandler.g && !this.LiteBansModule_195.LiteBansModule_195().aE()) {
                tempObj = m[70] + this.g.LiteBansModule_31() + m[71] + this.g.LiteBansModule_31() + m[72];
                string5 = m[73] + this.g.LiteBansModule_31() + ')';
            }
            boolean flag8 = string4 == null || StringUtilities.BaseCoreGenericHandler((CharSequence)string4, '#', false, 2, null);
            boolean bl9 = flag5 = string2 == null || StringUtilities.BaseCoreGenericHandler((CharSequence)string2, '#', false, 2, null);
            if (flag5 && flag8) {
                return null;
            }
            String string6 = flag ? m[74] : m[75];
            long l7 = this.LiteBansModule_195.LiteBansModule_195().LiteBansModule_43();
            String string7 = l7 > 0L ? m[76] + this.g.LiteBansModule_31() + m[77] + (String)tempObj + m[78] + l7 + m[79] + string5 + m[80] : m[81] + this.g.LiteBansModule_31() + m[82] + (String)tempObj + m[83];
            String string8 = (flag5 ? m[84] + a_2.BaseCoreGenericHandler() + m[85] + jJ3 + ')' + (String)helperObj : (flag8 ? m[86] + a_2.BaseCoreGenericHandler() + m[87] + string7 + jJ3 + ')' + (String)helperObj : m[88] + a_2.BaseCoreGenericHandler() + m[89] + string7 + ')' + jJ3 + ')' + (String)helperObj)) + string6;
            Object object6 = this.LiteBansModule_195;
            if (((ConfigService)object6).g()) {
                ConfigService configService = object6;
                flag4 = false;
                configService.BaseCoreGenericHandler((Object)string8);
            }
            object6 = this.c((CharSequence)string8);
            if (!flag8) {
                Object object7 = object6;
                flag4 = false;
                contextObj = resultObj = object7;
                flag3 = false;
                ((LiteBansModule_60)object7).BaseCoreGenericHandler(string4);
            }
            if (!flag5) {
                ((LiteBansModule_60)object6).BaseCoreGenericHandler(string2);
                if (!StringUtilities.LiteBansModule_31((CharSequence)tempObj)) {
                    ((LiteBansModule_60)object6).BaseCoreGenericHandler(string2);
                }
                if (l7 > 0L) {
                    LiteBansModule_185.BaseCoreGenericHandler((LiteBansModule_60)object6);
                }
            }
            targetObj = object6;
            flag4 = false;
            contextObj = resultObj = targetObj;
            flag3 = false;
            jJ3.BaseCoreGenericHandler((LiteBansModule_60)contextObj);
            LiteBansModule_185.BaseCoreGenericHandler((LiteBansModule_60)object6);
            targetObj = null;
            l5 = System.nanoTime();
            try {
                SilentHandler dZ2;
                contextObj = LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)object6);
                if (!contextObj.next() || !(dZ2 = this.plugin((ResultSet)contextObj, a_2)).BaseCoreGenericHandler(string4, string2, DatabaseMonitorService.BaseCoreGenericHandler(this.AsyncBackgroundTask_5(), false, 1, null))) break block13;
                targetObj = dZ2;
            }
            catch (Throwable throwable) {
                long l8 = System.nanoTime() - l5;
                double d11 = (double)l8 / 1.0E9;
                if (d11 > 4.0) {
                    this.LiteBansModule_241.getLogger().warning(m[92] + LiteBansModule_288.BaseCoreGenericHandler(d11) + m[93]);
                }
                throw throwable;
            }
        }
        if ((d10 = (double)(l3 = System.nanoTime() - l5) / 1.0E9) > 4.0) {
            this.LiteBansModule_241.getLogger().warning(m[90] + LiteBansModule_288.BaseCoreGenericHandler(d10) + m[91]);
        }
        return targetObj;
    }

    @Override
    public SilentHandler BaseCoreGenericHandler(@NotNull String string, @Nullable String string2, @Nullable String string3, @NotNull BanHandler a_2) {
        List list = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, string, 0, 2, null);
        if (list.isEmpty()) {
            return null;
        }
        for (LiteBansModule_298 iA2 : list) {
            String string4;
            if (iA2.LiteBansModule_31() == null || ObjectUtilities.BaseCoreGenericHandler((Object)iA2.LiteBansModule_31(), (Object)string2)) continue;
            this.LiteBansModule_195.BaseCoreGenericHandler(10, (Object)(m[94] + iA2.LiteBansModule_31()));
            SilentHandler dZ2 = AllHandler_3.BaseCoreGenericHandler(this, iA2.LiteBansModule_31(), null, a_2, string3, false, false, 32, null);
            StringBuilder stringBuilder = new StringBuilder();
            BanHandler a_3 = a_2;
            String string5 = a_3.toString();
            if (((CharSequence)string5).length() > 0) {
                char c = string5.charAt(0);
                StringBuilder stringBuilder2 = new StringBuilder();
                String string6 = string5;
                n = 1;
                string4 = stringBuilder2.append((Object)(Character.isLowerCase(c) ? LiteBansModule_339.BaseCoreGenericHandler(c, Locale.getDefault()) : String.valueOf(c))).append(string6.substring(n)).toString();
            } else {
                string4 = string5;
            }
            this.LiteBansModule_195.BaseCoreGenericHandler(10, (Object)stringBuilder.append(string4).append(m[95]).append(dZ2).toString());
            if (dZ2 == null) continue;
            this.LiteBansModule_241.getLogger().info(m[96] + string + m[97] + a_2 + m[98] + dZ2.BaseCoreGenericHandler());
            return dZ2;
        }
        return null;
    }

    @Override
    public List BaseCoreGenericHandler(@NotNull String string, @Nullable String string2, @Nullable String string3, @NotNull BanHandler a_2, boolean flag) {
        Iterable iterable;
        List list = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, string, 0, 2, null);
        if (list.isEmpty()) {
            return CollectionUtilities.e();
        }
        List list2 = new ArrayList();
        for (LiteBansModule_298 iA2 : list) {
            if (iA2.LiteBansModule_31() == null || ObjectUtilities.BaseCoreGenericHandler((Object)iA2.LiteBansModule_31(), (Object)string2) || (iterable = this.plugin(iA2.LiteBansModule_31(), null, a_2, string3, true, 0)).isEmpty()) continue;
            list2.addAll((Collection)iterable);
        }
        if (flag) {
            Iterable iterable2 = list2;
            iterable = iterable2;
            Collection collection = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable2, 10));
            Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                SilentHandler dZ2 = (SilentHandler)t2;
                Collection collection2 = collection;
                collection2.add(new SilentHandler(a_2, string2, dZ2.PunishmentTableService(), dZ2.LiteBansModule_31(), dZ2.e(), dZ2.LiteBansModule_435(), dZ2.m(), dZ2.GnuSparseMapHandler(), dZ2.BroadcastService(), dZ2.LiteBansModule_403(), dZ2.r(), dZ2.AsyncBackgroundTask_5(), dZ2.LiteBansModule_241(), dZ2.AsyncBackgroundTask_22(), dZ2.BaseCoreGenericHandler(), null));
            }
            return CollectionUtilities.BaseCoreGenericHandler((Collection)((List)collection));
        }
        return list2;
    }

    @Override
    public SilentHandler BaseCoreGenericHandler(@NotNull String string, @NotNull BanHandler a_2, @NotNull String string2, boolean flag) {
        if (!LiteBansModule_346.BaseCoreGenericHandler.AsyncBackgroundTask_5(string)) {
            return null;
        }
        DescHandler hc2 = LiteBansModule_122.BaseCoreGenericHandler(DescHandler.GnuSparseMapHandler, this, string, string2, UuidHandler.AsyncBackgroundTask_5, flag, null, false, null, null, 240, null);
        ResultSet resultSet = DescHandler.BaseCoreGenericHandler(hc2, a_2, null, 2, null);
        SilentHandler dZ2 = this.c(resultSet, a_2);
        return !flag || this.plugin(dZ2) ? dZ2 : null;
    }

    @Override
    public SilentHandler BaseCoreGenericHandler(long l3, @NotNull BanHandler a_2, @NotNull String string, boolean flag) {
        return this.plugin(String.valueOf(l3), a_2, string, flag);
    }

    @Override
    public long BaseCoreGenericHandler(@NotNull BansHandler_2 kL2, @NotNull String string, boolean flag) {
        String string2 = m[99] + kL2;
                AllHandler_2 jy2 = new AllHandler_2(targetObj.e(), string, flag2);
        targetObj = m[100];
        if (flag) {
            SQLiteDriverHandler_3 gZ2 = this;
            flag3 = false;
            targetObj = m[101] + (m[102] + gZ2.c().LiteBansModule_31() + m[103]);
        }
        LiteBansModule_179 eo_02 = ((CharSequence)targetObj).length() == 0 ? LiteBansModule_403.c() : LiteBansModule_403.BaseCoreGenericHandler(SQLiteDriverHandler_3::BaseCoreGenericHandler);
        NameHandler_2 dQ2 = LiteBansModule_403;
        String string3 = m[104];
        Object contextObj = m[105];
        String string4 = ((CharSequence)targetObj).length() == 0 ? m[106] + string3 : (!StringUtilities.BaseCoreGenericHandler((CharSequence)targetObj, (CharSequence)m[107], false, 2, null) ? m[108] + (String)targetObj + ' ' + (String)contextObj + ' ' + string3 : (String)targetObj + ' ' + (String)contextObj + ' ' + string3);
        targetObj = string4;
        if (((CharSequence)targetObj).length() > 0) {
            string2 = string2 + ' ' + (String)targetObj;
        }
        string2 = string2 + jy2;
        eo_02 = LiteBansModule_403.BaseCoreGenericHandler(eo_02, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(jy2, arg_0));
        contextObj = LiteBansModule_185.BaseCoreGenericHandler(this.c((CharSequence)string2), eo_02);
        int n = 1;
        flag4 = false;
        Long l3 = contextObj.next() ? Long.valueOf(contextObj.getLong(n)) : null;
        return l3 != null ? l3 : 0L;
    }

    @Override
    public boolean BaseCoreGenericHandler(@NotNull UUID uUID, @NotNull BanHandler a_2) {
        CharSequence charSequence = BansHandler_2.LiteBansModule_241;
        CharSequence charSequence2 = m[109];
        charSequence = SQLiteDriverHandler.e(m[110] + charSequence2 + m[111] + charSequence);
        charSequence2 = m[112];
        SQLiteDriverHandler_3 gZ2 = this;
        flag = false;
        CharSequence[] charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)charSequence), charSequence2};
        CharSequence[] charSequenceArray2 = charSequenceArray;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence3;
            CharSequence charSequence4 = charSequence3 = charSequenceArray2[i];
            if (charSequence4.length() > 0) continue;
            String string = m[113];
            throw new IllegalArgumentException(string.toString());
        }
        return LiteBansModule_185.c(gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)charSequence) + m[114] + charSequence2))).BaseCoreGenericHandler(uUID)).next();
    }

    @Override
    public ResultSet BaseCoreGenericHandler(@NotNull UUID uUID, int n) {
        char c;
        int n2;
        BansHandler_2 kL2 = BansHandler_2.LiteBansModule_241;
        CharSequence charSequence = m[115];
        SQLiteDriverHandler_3 gZ2 = this;
        CharSequence charSequence2 = charSequence;
        char c10 = ',';
        CharSequence charSequence3 = charSequence2;
        for (n2 = 0; n2 < charSequence3.length(); ++n2) {
            char c11 = c = charSequence3.charAt(n2);
            if (!(c11 == c10)) continue;
            ++n3;
        }
        int n4 = n3;
        charSequence2 = m[116];
        if (n4 > 0) {
            StringBuilder stringBuilder = new StringBuilder(n4 * 2);
            Iterable iterable = new LiteBansModule_167(0, n4);
            Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                n2 = n3 = ((LiteBansModule_291)iterator).LiteBansModule_31();
                c = '\u0000';
                stringBuilder.append(m[117]);
            }
            charSequence2 = StringUtilities.LiteBansModule_31(stringBuilder.toString(), 1);
        }
        BansHandler_2 kL3 = kL2;
        flag2 = false;
        return LiteBansModule_185.AsyncBackgroundTask_5(gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(m[118] + kL3 + '(' + charSequence + m[119] + charSequence2 + ')'))).BaseCoreGenericHandler(uUID).BaseCoreGenericHandler(n));
    }

    @Override
    public ResultSet BaseCoreGenericHandler(@NotNull UUID uUID) {
        CharSequence charSequence = BansHandler_2.LiteBansModule_241;
        charSequence = SQLiteDriverHandler.e(m[120] + charSequence);
        CharSequence charSequence2 = m[121];
        SQLiteDriverHandler_3 gZ2 = this;
        CharSequence[] charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)charSequence), charSequence2};
        CharSequence[] charSequenceArray2 = charSequenceArray;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence3;
            CharSequence charSequence4 = charSequence3 = charSequenceArray2[i];
            if (charSequence4.length() > 0) continue;
            String string = m[122];
            throw new IllegalArgumentException(string.toString());
        }
        return LiteBansModule_185.AsyncBackgroundTask_5(gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)charSequence) + m[123] + charSequence2))).BaseCoreGenericHandler(uUID));
    }

    @Override
    public List BaseCoreGenericHandler(@NotNull String string) {
        Object targetObj = string;
        if (LiteBansModule_346.BaseCoreGenericHandler.i((String)targetObj)) {
            return AllHandler_3.LiteBansModule_31(this, string, 0, 2, null);
        }
        targetObj = this.c(string);
        return targetObj != null ? AllHandler_3.LiteBansModule_31(this, ((LiteBansModule_298)targetObj).LiteBansModule_31(), 0, 2, null) : CollectionUtilities.e();
    }

    @Override
    public LiteBansModule_298 c(@Nullable String string) {
        boolean flag;
        if (string == null) {
            return null;
        }
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)m[124])) {
            return new LiteBansModule_298(m[125], m[126], m[127], null, 8, null);
        }
        NameHandler_3 jp_02 = LiteBansModule_346.BaseCoreGenericHandler.Utf8Handler_2(string);
        String string2 = jp_02.LiteBansModule_31();
        String string3 = LiteBansModule_403.BaseCoreGenericHandler(this, string2);
        AsyncBackgroundTask_21 s2 = (AsyncBackgroundTask_21)this.LiteBansModule_241.BaseCoreGenericHandler(AsyncBackgroundTask_21.class);
        if (!((Collection)s2.BaseCoreGenericHandler()).isEmpty() && jp_02.AsyncBackgroundTask_5() == 0 || jp_02.AsyncBackgroundTask_5() == 1) {
            Object v0;
            block5: {
                helperObj = s2.BaseCoreGenericHandler();
                Iterator iterator = helperObj.iterator();
                while (iterator.hasNext()) {
                    resultObj = iterator.next();
                    contextObj = (LiteBansModule_96)resultObj;
                    flag = false;
                    if (!(ObjectUtilities.BaseCoreGenericHandler((Object)((LiteBansModule_96)contextObj).c(), (Object)string) || ObjectUtilities.BaseCoreGenericHandler((Object)((LiteBansModule_96)contextObj).g(), (Object)string))) continue;
                    v0 = resultObj;
                    break block5;
                }
                v0 = null;
            }
            targetObj = v0;
            if (targetObj != null) {
                return new LiteBansModule_298(((LiteBansModule_96)targetObj).c(), ((LiteBansModule_96)targetObj).g(), ((LiteBansModule_96)targetObj).LiteBansModule_31(), null, 8, null);
            }
        }
        LiteBansModule_60 bT2 = this.c((CharSequence)(m[128] + this.g.Utf8Handler_2() + m[129] + BansHandler_2.g + m[130] + string3 + m[131]));
        helperObj = jp_02.BaseCoreGenericHandler();
        resultObj = bT2;
        contextObj = resultObj;
        flag = false;
        bT2.BaseCoreGenericHandler((String)helperObj);
        targetObj = LiteBansModule_185.AsyncBackgroundTask_5(resultObj);
        return targetObj.next() ? this.plugin((ResultSet)targetObj, true, this.LiteBansModule_195.LiteBansModule_195().ElementsHandler()) : null;
    }

    @Override
    public List LiteBansModule_31(@Nullable String string, int n) {
        LiteBansModule_60 bT2;
        if (string == null) {
            return CollectionUtilities.e();
        }
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)m[132])) {
            return CollectionUtilities.BaseCoreGenericHandler(new LiteBansModule_298(m[133], m[134], m[135], null, 8, null));
        }
        NameHandler_3 jp_02 = LiteBansModule_346.BaseCoreGenericHandler.Utf8Handler_2(string);
        String string2 = jp_02.LiteBansModule_31();
        String string3 = LiteBansModule_403.BaseCoreGenericHandler(this, string2);
        Object targetObj = this.c((CharSequence)(m[136] + this.g.Utf8Handler_2() + m[137] + BansHandler_2.g + m[138] + string3 + m[139] + n));
        Object contextObj = jp_02.BaseCoreGenericHandler();
        LiteBansModule_60 bT3 = bT2 = targetObj;
        ((LiteBansModule_60)targetObj).BaseCoreGenericHandler((String)contextObj);
        ResultSet resultSet = LiteBansModule_185.AsyncBackgroundTask_5(bT2);
        targetObj = new ArrayList();
        contextObj = new ArrayList();
        while (resultSet.next()) {
            LiteBansModule_298 iA2 = this.plugin(resultSet, true, this.LiteBansModule_195.LiteBansModule_195().ElementsHandler());
            if (iA2.LiteBansModule_31() == null || ((ArrayList)targetObj).contains(iA2.LiteBansModule_31())) continue;
            ((Collection)targetObj).add(iA2.LiteBansModule_31());
            ((Collection)contextObj).add(iA2);
        }
        return (List)contextObj;
    }

    @Override
    public long LiteBansModule_31(@NotNull SilentHandler dZ2) {
        SilentHandler dZ3 = dZ2;
        Object targetObj = dZ3;
        targetObj = ((SilentHandler)targetObj).ServerSyncService().BaseCoreGenericHandler();
        CharSequence charSequence = m[140];
        targetObj = SQLiteDriverHandler.e(m[141] + charSequence + m[142] + targetObj);
        charSequence = m[143];
        SQLiteDriverHandler_3 gZ2 = this;
        flag3 = false;
        CharSequence[] charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)targetObj), charSequence};
        CharSequence[] charSequenceArray2 = charSequenceArray;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            if (charSequence3.length() > 0) continue;
            String string = m[144];
            throw new IllegalArgumentException(string.toString());
        }
        targetObj = LiteBansModule_185.AsyncBackgroundTask_5(gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)targetObj) + m[145] + charSequence), m[146]), m[147]), (Number)1))).BaseCoreGenericHandler(dZ3.DatabaseMonitorService()).BaseCoreGenericHandler(dZ3.BroadcastService()));
        charSequence = m[148];
        flag3 = false;
        Long l3 = targetObj.next() ? Long.valueOf(targetObj.getLong((String)charSequence)) : null;
        return l3 != null ? l3 : 0L;
    }

    @Override
    public boolean BaseCoreGenericHandler(@Nullable String v1, @Nullable String v2, @NotNull String v3) {
        v4 = SQLiteDriverHandler_3.LiteBansModule_403;
        v5 = this;
        if (v1 == null) ** GOTO lbl-1000
        v6 = v1.length();
        v7 = v5.g().LiteBansModule_195().be();
        if (ObjectUtilities.BaseCoreGenericHandler(v6, v7 & 255) <= 0) lbl-1000:
                {
            v0 = true;
        } else {
            v0 = false;
        }
        if (!v0) {
            v8 = SQLiteDriverHandler_3.m[149] + v1 + SQLiteDriverHandler_3.m[150] + LiteBansModule_284.LiteBansModule_31(v5.g().LiteBansModule_195().be());
            throw new IllegalArgumentException(v8.toString());
        }
        if (!(v2 == null || v2.length() <= 36)) {
            v9 = SQLiteDriverHandler_3.m[151] + v2 + SQLiteDriverHandler_3.m[152];
            throw new IllegalArgumentException(v9.toString());
        }
        v4 = BansHandler_2.g;
        v5 = SQLiteDriverHandler_3.m[153];
        v4 = SQLiteDriverHandler.e(SQLiteDriverHandler_3.m[154] + v5 + SQLiteDriverHandler_3.m[155] + v4);
        v5 = SQLiteDriverHandler_3.m[156];
        v10 = this;
        v11   = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)v4), v5};
        v12 = v11  ;
        v13 = v12.length;
        for (v14 = 0; v14 < v13; ++v14) {
            v15 = v16 = v12[v14];
            if (v15.length() > 0) continue;
            v17 = SQLiteDriverHandler_3.m[157];
            throw new IllegalArgumentException(v17.toString());
        }
        v4 = v10.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)v4) + SQLiteDriverHandler_3.m[158] + v5), SQLiteDriverHandler_3.m[159]), SQLiteDriverHandler_3.m[160]), (Number)1)));
        v5 = LiteBansModule_346.BaseCoreGenericHandler.g(v2);
        v18   = v11   = v4;
        v19 = v4;
        v20 = new String[]{v1, v5, v3};
        v15 = v16 = v19;
        v21 = v20;
        v22 = v21.length;
        for (v23 = 0; v23 < v22; ++v23) {
            v24 = v25 = v21[v23];
            v19.BaseCoreGenericHandler(v24);
        }
        return LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)v11  ).next();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@Nullable Connection connection, @NotNull BansHandler_2 kL2, boolean flag) {
        boolean flag2;
        CharSequence charSequence;
        boolean flag3;
        block24: {
            block25: {
                if (connection == null) {
                    return;
                }
                flag3 = kL2.BaseCoreGenericHandler();
                charSequence = kL2;
                boolean flag5 = flag2 = charSequence == BansHandler_2.g;
                if (!flag) break block24;
                charSequence = kL2;
                flag4 = false;
                if (charSequence == BansHandler_2.c) break block25;
                charSequence = kL2;
                flag4 = false;
                if (!(charSequence == BansHandler_2.LiteBansModule_195) && kL2 != BansHandler_2.i) break block24;
            }
            return;
        }
        charSequence = flag ? m[161] : m[162];
        String string = BansHandler_2.BaseCoreGenericHandler(kL2, null, flag, 1, null);
        AutoCloseable autoCloseable = connection.prepareStatement(m[163] + string);
        Throwable throwable = null;
        try {
            Object targetObj = (PreparedStatement)autoCloseable;
            AutoCloseable autoCloseable2 = targetObj.executeQuery();
            Throwable throwable2 = null;
            try {
                Object contextObj = (ResultSet)autoCloseable2;
                if (flag3) {
                    while (contextObj.next()) {
                        ObjectUtilities.BaseCoreGenericHandler(contextObj);
                        SilentHandler dZ2 = this.plugin((ResultSet)contextObj, kL2.c());
                        SilentHandler dZ3 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, dZ2, false, 2, null);
                        if (dZ3 != null && (!dZ3.LiteBansModule_241() || ObjectUtilities.BaseCoreGenericHandler((Object)dZ3.DatabaseMonitorService(), (Object)dZ2.DatabaseMonitorService()))) continue;
                        try {
                            this.c(dZ2);
                        }
                        catch (SQLException sQLException) {
                            this.LiteBansModule_241.getLogger().severe(m[164] + dZ2.ServerSyncService() + m[165] + sQLException.getMessage() + m[166] + dZ2);
                            if (!this.LiteBansModule_195.BaseCoreGenericHandler(1)) continue;
                            sQLException.printStackTrace();
                        }
                    }
                } else if (flag2) {
                    while (contextObj.next()) {
                        ObjectUtilities.BaseCoreGenericHandler(contextObj);
                        LiteBansModule_298 iA2 = this.plugin((ResultSet)contextObj, false, (String)charSequence);
                        String string2 = iA2.LiteBansModule_241();
                        String string3 = iA2.c();
                        String string4 = iA2.AsyncBackgroundTask_5();
                        AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, string2, string3, string4, false, false, 16, null);
                    }
                }
                contextObj = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable3) {
                throwable2 = throwable3;
                throw throwable3;
            }
            finally {
                CloseactionHandler.BaseCoreGenericHandler(autoCloseable2, throwable2);
            }
            targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable4) {
            throwable = throwable4;
            throw throwable4;
        }
        finally {
            CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable);
        }
    }

    @Override
    public SilentHandler BaseCoreGenericHandler(@NotNull ResultSet resultSet, @NotNull BanHandler a_2) {
        String string;
        BanHandler a_3 = a_2.c();
        String string2 = LiteBansModule_346.LiteBansModule_195(resultSet.getString(m[167]));
        String string3 = resultSet.getString(m[168]);
        CharSequence charSequence = resultSet.getString(m[169]);
        String string4 = resultSet.getString(m[170]);
        if (string4 == null) {
            string4 = m[171];
        }
        Object targetObj = resultSet;
        Object contextObj = m[173];
        String string5 = resultSet.getString(m[172]);
        String string6 = string4;
        CharSequence charSequence2 = charSequence;
        String string7 = string3;
        String string8 = string2;
        CharSequence charSequence3 = a_3;
        try {
            string = targetObj.getString((String)contextObj);
        }
        catch (SQLException sQLException) {
            string = null;
        }
        String string9 = string;
        targetObj = resultSet;
        contextObj = m[174];
        flag = false;
        try {
            string = targetObj.getString((String)contextObj);
        }
        catch (SQLException sQLException) {
            string = null;
        }
        String string10 = string;
        LiteBansModule_14 aJ2 = null;
        int n = 16384;
        long l3 = 0L;
        boolean flag2 = resultSet.getBoolean(m[180]);
        boolean flag3 = resultSet.getBoolean(m[179]);
        boolean flag4 = resultSet.getBoolean(m[178]);
        byte by2 = LiteBansModule_284.BaseCoreGenericHandler((byte)resultSet.getInt(m[177]));
        long l5 = resultSet.getLong(m[176]);
        long l7 = resultSet.getLong(m[175]);
        String string11 = string10;
        String string12 = string9;
        String string13 = string5;
        String string14 = string6;
        CharSequence charSequence4 = charSequence2;
        String string15 = string7;
        String string16 = string8;
        BanHandler a_4 = charSequence3;
        SilentHandler dZ2 = new SilentHandler(a_4, string16, string15, charSequence4, string14, string13, string12, string11, l7, l5, by2, flag4, flag3, flag2, l3, n, aJ2);
        if (a_2 == BanHandler.c) {
            dZ2.BaseCoreGenericHandler(resultSet.getBoolean(m[181]));
        }
        if (!this.g.BaseCoreGenericHandler(resultSet)) {
            dZ2.BaseCoreGenericHandler(resultSet.getLong(m[182]));
        }
        if (a_2 != BanHandler.g) {
            String string17;
            targetObj = Calendar.getInstance();
            ((Calendar)targetObj).setTimeZone(TimeZone.getTimeZone(m[183]));
            contextObj = resultSet.getTimestamp(m[184]);
            if (contextObj != null) {
                ((Calendar)targetObj).setTime((Date)contextObj);
                dZ2.c(((Calendar)targetObj).getTimeInMillis() + (long)this.AsyncBackgroundTask_5().BaseCoreGenericHandler());
            } else {
                dZ2.c(0L);
            }
            ResultSet resultSet2 = resultSet;
            string = m[185];
            LiteBansModule_346 jj_02 = LiteBansModule_346.BaseCoreGenericHandler;
            SilentHandler dZ3 = dZ2;
            try {
                string17 = resultSet2.getString(string);
            }
            catch (SQLException sQLException) {
                string17 = null;
            }
            charSequence3 = string17;
            dZ3.BaseCoreGenericHandler(jj_02.g((String)charSequence3));
            resultSet2 = resultSet;
            string = m[186];
            dZ3 = dZ2;
            flag5 = false;
            try {
                string17 = resultSet2.getString(string);
            }
            catch (SQLException sQLException) {
                string17 = null;
            }
            dZ3.LiteBansModule_31(string17);
            resultSet2 = resultSet;
            string = m[187];
            dZ3 = dZ2;
            flag5 = false;
            try {
                string17 = resultSet2.getString(string);
            }
            catch (SQLException sQLException) {
                string17 = null;
            }
            dZ3.BaseCoreGenericHandler((CharSequence)string17);
        }
        return dZ2;
    }

    @Override
    public SilentHandler c(@NotNull ResultSet resultSet, @NotNull BanHandler a_2) {
        return resultSet.next() ? this.plugin(resultSet, a_2) : null;
    }

    @Override
    public LiteBansModule_60 c(@NotNull CharSequence charSequence) {
        Object targetObj = this.LiteBansModule_195;
        if (((ConfigService)targetObj).g()) {
            ((ConfigService)targetObj).BaseCoreGenericHandler(charSequence);
        }
        PreparedStatement preparedStatement = this.AsyncBackgroundTask_5.prepareStatement(((Object)charSequence).toString());
        if (preparedStatement == null) {
            AssertionUtilities.BaseCoreGenericHandler();
            throw new CommandExitException();
        }
        targetObj = preparedStatement;
        String string = charSequence instanceof SQLiteDriverHandler ? ((SQLiteDriverHandler)charSequence).c() : null;
        return ObjectUtilities.BaseCoreGenericHandler((Object)this.LiteBansModule_195.LiteBansModule_195().ElementsHandler(), (Object)m[188]) ? (LiteBansModule_60)new LiteBansModule_40(this, (PreparedStatement)targetObj, string, null) : new LiteBansModule_60(this, (PreparedStatement)targetObj, string, null);
    }

    @Override
    public void BaseCoreGenericHandler(@Nullable String string, long l3) {
        String string2 = LiteBansModule_346.BaseCoreGenericHandler.g(string);
        String string3 = m[189] + DatabaseMonitorService.BaseCoreGenericHandler(this.AsyncBackgroundTask_5(), false, 1, null) + m[190];
        Object contextObj = BansHandler_2.values();
        Object resultObj = contextObj;
        Collection collection = new ArrayList();
        for (BansHandler_2 kL2 : resultObj) {
            targetObj = kL2;
            if (!((BansHandler_2)targetObj).BaseCoreGenericHandler()) continue;
            collection.add(kL2);
        }
        contextObj = (List)collection;
        flag = false;
        resultObj = contextObj.iterator();
        while (resultObj.hasNext()) {
            collection = resultObj.next();
            BansHandler_2 kL3 = (BansHandler_2)((Object)collection);
            Object helperObj = kL3;
            helperObj = SQLiteDriverHandler.e(m[191] + helperObj);
            CharSequence charSequence = m[192];
            Object tempObj = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)helperObj), charSequence};
            CharSequence[] charSequenceArray = tempObj;
            int n2 = charSequenceArray.length;
            for (int i = 0; i < n2; ++i) {
                CharSequence charSequence2;
                CharSequence charSequence3 = charSequence2 = charSequenceArray[i];
                if (charSequence3.length() > 0) continue;
                String string4 = m[193];
                throw new IllegalArgumentException(string4.toString());
            }
            String string5 = SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)helperObj) + m[194] + charSequence), m[195]);
            if (kL3 != BansHandler_2.GnuSparseMapHandler) {
                string5 = SQLiteDriverHandler.LiteBansModule_31(string5, string3);
            }
            helperObj = this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(string5));
            targetObj = helperObj;
            tempObj = targetObj;
            flag6 = false;
            ((LiteBansModule_60)helperObj).BaseCoreGenericHandler(string2);
            LiteBansModule_185.AsyncBackgroundTask_5(((LiteBansModule_60)targetObj).BaseCoreGenericHandler(l3));
        }
    }

    @Override
    public int BaseCoreGenericHandler(@NotNull LiteBansModule_65 c12, @Nullable String string, @Nullable String string2) {
        boolean flag;
        CharSequence[] charSequenceArray;
        boolean flag2;
        if (string == null) {
            return 0;
        }
        boolean flag3 = c12.GnuSparseMapHandler() && string2 != null && !StringUtilities.c((CharSequence)string2, '#', false, 2, null);
        BansHandler_2 kL2 = c12.AsyncBackgroundTask_5().BaseCoreGenericHandler();
        LiteBansModule_179 eo_02 = LiteBansModule_403.c();
        Object targetObj = kL2;
        CharSequence charSequence = m[196];
        String string3 = SQLiteDriverHandler.e(m[197] + charSequence + m[198] + targetObj);
        if (flag3) {
            targetObj = m[199];
            flag2 = false;
            charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5(string3), targetObj};
            flag = false;
            CharSequence[] charSequenceArray2 = charSequenceArray;
            int n = charSequenceArray2.length;
            for (int i = 0; i < n; ++i) {
                CharSequence charSequence2;
                CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
                if (charSequence3.length() > 0) continue;
                String string4 = m[200];
                throw new IllegalArgumentException(string4.toString());
            }
            string3 = SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31(string3) + m[201] + targetObj), m[202]);
            eo_02 = LiteBansModule_403.BaseCoreGenericHandler(eo_02, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(string, string2, c12, arg_0));
        } else {
            targetObj = m[203];
            flag2 = false;
            charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5(string3), targetObj};
            flag = false;
            CharSequence[] charSequenceArray3 = charSequenceArray;
            int n = charSequenceArray3.length;
            for (int i = 0; i < n; ++i) {
                CharSequence charSequence4;
                CharSequence charSequence5 = charSequence4 = charSequenceArray3[i];
                if (charSequence5.length() > 0) continue;
                String string5 = m[204];
                throw new IllegalArgumentException(string5.toString());
            }
            string3 = SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31(string3) + m[205] + targetObj), m[206]);
            eo_02 = LiteBansModule_403.BaseCoreGenericHandler(eo_02, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(string, c12, arg_0));
        }
        if (c12.AsyncBackgroundTask_5() == BanHandler.c) {
            targetObj = this;
            flag2 = false;
            string3 = SQLiteDriverHandler.LiteBansModule_31(string3, m[207] + ((SQLiteDriverHandler_3)targetObj).c().LiteBansModule_31() + m[208]);
            eo_02 = LiteBansModule_403.BaseCoreGenericHandler(eo_02, SQLiteDriverHandler_3::c);
        }
        if (c12.i() > 0L) {
            long l3 = DatabaseMonitorService.BaseCoreGenericHandler(this.AsyncBackgroundTask_5(), false, 1, null) - c12.i();
            string3 = SQLiteDriverHandler.LiteBansModule_31(string3, m[209]);
            eo_02 = LiteBansModule_403.BaseCoreGenericHandler(eo_02, arg_0 -> SQLiteDriverHandler_3.LiteBansModule_31(l3, arg_0));
        }
        ResultSet resultSet = LiteBansModule_185.LiteBansModule_31(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(string3)), eo_02);
        int n = 1;
        flag = false;
        Integer n2 = resultSet.next() ? Integer.valueOf(resultSet.getInt(n)) : null;
        return n2 != null ? n2 : 0;
    }

    @Override
    public LiteBansModule_356 BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, @NotNull LiteBansModule_175 eM2, @NotNull LiteBansModule_65 c12) {
        boolean flag;
        CharSequence charSequence;
        CharSequence charSequence2;
        int n;
        int n2;
        boolean flag2;
        boolean flag3;
        CharSequence[] charSequenceArray;
        if (string == null) {
            return LiteBansModule_373.BaseCoreGenericHandler(0.0, 0.0);
        }
        boolean flag4 = c12.GnuSparseMapHandler() && string2 != null && !StringUtilities.c((CharSequence)string2, '#', false, 2, null);
        BansHandler_2 kL2 = eM2.c().BaseCoreGenericHandler();
        Object contextObj = kL2;
        Object resultObj = m[210];
        String string3 = SQLiteDriverHandler.e(m[211] + resultObj + m[212] + contextObj);
        contextObj = null;
        contextObj = LiteBansModule_403.c();
        if (flag4) {
            resultObj = m[213];
            flag5 = false;
            charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5(string3), resultObj};
            flag3 = false;
            targetObj = charSequenceArray;
            flag2 = false;
            n2 = ((CharSequence[])targetObj).length;
            for (n = 0; n < n2; ++n) {
                charSequence = charSequence2 = targetObj[n];
                flag = false;
                if (charSequence.length() > 0) continue;
                String string4 = m[214];
                throw new IllegalArgumentException(string4.toString());
            }
            string3 = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31(string3) + m[215] + resultObj);
            contextObj = LiteBansModule_403.BaseCoreGenericHandler((LiteBansModule_179)contextObj, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(string, string2, arg_0));
        } else {
            resultObj = m[216];
            flag5 = false;
            charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5(string3), resultObj};
            flag3 = false;
            targetObj = charSequenceArray;
            flag2 = false;
            n2 = ((CharSequence[])targetObj).length;
            for (n = 0; n < n2; ++n) {
                charSequence = charSequence2 = targetObj[n];
                flag = false;
                if (charSequence.length() > 0) continue;
                String string5 = m[217];
                throw new IllegalArgumentException(string5.toString());
            }
            string3 = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31(string3) + m[218] + resultObj);
            contextObj = LiteBansModule_403.BaseCoreGenericHandler((LiteBansModule_179)contextObj, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(string, arg_0));
        }
        if (eM2.c() == BanHandler.c) {
            resultObj = this;
            flag5 = false;
            string3 = SQLiteDriverHandler.LiteBansModule_31(string3, m[219] + ((SQLiteDriverHandler_3)resultObj).c().LiteBansModule_31() + m[220]);
            contextObj = LiteBansModule_403.BaseCoreGenericHandler((LiteBansModule_179)contextObj, SQLiteDriverHandler_3::LiteBansModule_31);
        }
        if (eM2.AsyncBackgroundTask_5() > 0L) {
            long l3 = DatabaseMonitorService.BaseCoreGenericHandler(this.AsyncBackgroundTask_5(), false, 1, null) - eM2.AsyncBackgroundTask_5();
            string3 = SQLiteDriverHandler.LiteBansModule_31(string3, m[221]);
            contextObj = LiteBansModule_403.BaseCoreGenericHandler((LiteBansModule_179)contextObj, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(l3, arg_0));
        }
        String string6 = null;
        string6 = m[222];
        Object helperObj = eM2.e();
        Iterator iterator = helperObj.entrySet().iterator();
        while (iterator.hasNext()) {
            Object tempObj = targetObj = iterator.next();
            n = 0;
            LiteBansModule_65 c13 = (LiteBansModule_65)tempObj.getKey();
            string6 = string6 + m[223];
            contextObj = LiteBansModule_403.BaseCoreGenericHandler((LiteBansModule_179)contextObj, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(c13, arg_0));
        }
        string6 = string6.substring(0, string6.length() - 4);
        string3 = SQLiteDriverHandler.LiteBansModule_31(string3, '(' + string6 + ')');
        helperObj = LiteBansModule_185.LiteBansModule_31(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(string3)), (LiteBansModule_179)contextObj);
        double d10 = 0.0;
        while (true) {
            String[] args;
            String[] filteredArgs;
            ConfigService configService;
            Object object6 = helperObj;
            n = 1;
            n2 = 0;
            Integer n3 = object6.next() ? Integer.valueOf(object6.getInt(n)) : null;
            if (n3 == null) {
                break;
            }
            byte by2 = LiteBansModule_284.BaseCoreGenericHandler((byte)n3.intValue());
            if ((LiteBansModule_65)eM2.LiteBansModule_31().get(LiteBansModule_284.AsyncBackgroundTask_5(by2)) == null) break;
            Object v2 = eM2.e().get(targetObj);
            ObjectUtilities.BaseCoreGenericHandler(v2);
            float f10 = ((Number)v2).floatValue();
            d10 += (double)f10;
            ConfigService q_03 = this.LiteBansModule_195;
            n2 = 10;
            if (q_03.BaseCoreGenericHandler(n2)) {
                configService = q_03;
                configService.BaseCoreGenericHandler((Object)('[' + eM2.BaseCoreGenericHandler() + m[224] + LiteBansModule_288.BaseCoreGenericHandler(f10) + m[225] + ((LiteBansModule_65)targetObj).g() + m[226] + LiteBansModule_288.BaseCoreGenericHandler(d10)));
            }
            q_03 = this.LiteBansModule_195;
            n2 = 0;
            if (!q_03.g()) continue;
            configService = q_03;
            flag7 = false;
            MuteHandler et2 = AbstractCommand.AsyncBackgroundTask_5;
            String string7 = m[227] + f10;
            if (ObjectUtilities.BaseCoreGenericHandler((Object)string7, (Object)m[228])) {
                filteredArgs = new String[]{m[229]};
                args = filteredArgs;
            } else {
                filteredArgs = new String[]{m[230] + string7};
                args = filteredArgs;
            }
            String[] parsedArgs = args;
            configService.BaseCoreGenericHandler(new LiteBansModule_405(this.LiteBansModule_195, Arrays.copyOf(parsedArgs, parsedArgs.length)));
        }
        Object v3 = eM2.e().get(c12);
        ObjectUtilities.BaseCoreGenericHandler(v3);
        float f11 = ((Number)v3).floatValue();
        double d11 = d10 + (double)f11;
        return LiteBansModule_373.BaseCoreGenericHandler(d10, d11);
    }

    @Override
    public ResultSet BaseCoreGenericHandler(@NotNull BansHandler_2 kL2, @NotNull String string, int n) {
        ResultSet resultSet;
                AllHandler_2 jy2 = new AllHandler_2(targetObj.e(), string, flag);
        if (n == 1) {
            if (!kL2.BaseCoreGenericHandler()) {
                return LiteBansModule_399.BaseCoreGenericHandler();
            }
            targetObj = kL2;
            flag = false;
            return LiteBansModule_185.AsyncBackgroundTask_5(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[231] + targetObj), m[232]))));
        }
        if (n == 2) {
            if (!kL2.BaseCoreGenericHandler()) {
                return LiteBansModule_399.BaseCoreGenericHandler();
            }
            targetObj = kL2;
            flag = false;
            targetObj = SQLiteDriverHandler.e(m[233] + targetObj);
            SQLiteDriverHandler_3 gZ2 = this;
            flag = false;
            Object contextObj = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)targetObj), jy2};
            CharSequence[] charSequenceArray = contextObj;
            int n2 = charSequenceArray.length;
            for (int i = 0; i < n2; ++i) {
                CharSequence charSequence;
                CharSequence charSequence2 = charSequence = charSequenceArray[i];
                if (charSequence2.length() > 0) continue;
                String string2 = m[234];
                throw new IllegalArgumentException(string2.toString());
            }
            targetObj = gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)targetObj) + m[235] + (CharSequence)jy2), m[236])));
            flag = false;
            Object resultObj = contextObj = targetObj;
            ((AllHandler)jy2).BaseCoreGenericHandler((LiteBansModule_60)resultObj);
            return LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)contextObj);
        }
        if (LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(string)) {
            targetObj = kL2;
            flag = false;
            resultSet = LiteBansModule_185.AsyncBackgroundTask_5(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(m[237] + targetObj))));
        } else {
            targetObj = kL2;
            flag = false;
            targetObj = SQLiteDriverHandler.e(m[238] + targetObj);
            SQLiteDriverHandler_3 gZ3 = this;
            flag = false;
            Object helperObj = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)targetObj), jy2};
            CharSequence[] charSequenceArray = helperObj;
            int n3 = charSequenceArray.length;
            for (int i = 0; i < n3; ++i) {
                CharSequence charSequence;
                CharSequence charSequence3 = charSequence = charSequenceArray[i];
                if (charSequence3.length() > 0) continue;
                String string3 = m[239];
                throw new IllegalArgumentException(string3.toString());
            }
            targetObj = gZ3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)targetObj) + m[240] + (CharSequence)jy2)));
            flag = false;
            Object tempObj = helperObj = targetObj;
            ((AllHandler)jy2).BaseCoreGenericHandler((LiteBansModule_60)tempObj);
            resultSet = LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)helperObj);
        }
        return resultSet;
    }

    @Override
    public ResultSet BaseCoreGenericHandler(@NotNull BansHandler_2 kL2) {
        BansHandler_2 kL3 = kL2;
        return LiteBansModule_185.AsyncBackgroundTask_5(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[241] + kL3), m[242]))));
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull CharSequence charSequence, long l3, @NotNull SilentHandler dZ2) {
                Object contextObj = dZ2.m();
        AllHandler_2 jy2 = new AllHandler_2(targetObj.e(), (String)contextObj, flag);
        contextObj = dZ2;
        flag = false;
        contextObj = ((SilentHandler)contextObj).ServerSyncService().BaseCoreGenericHandler();
        flag = false;
        contextObj = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[243] + contextObj), m[244]);
        CharSequence charSequence2 = m[245];
        flag2 = false;
        Object resultObj = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)contextObj), charSequence2};
        CharSequence[] charSequenceArray = resultObj;
        int n = charSequenceArray.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence3;
            CharSequence charSequence4 = charSequence3 = charSequenceArray[i];
            if (charSequence4.length() > 0) continue;
            String string = m[246];
            throw new IllegalArgumentException(string.toString());
        }
        String string = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)contextObj) + m[247] + charSequence2);
        contextObj = this;
        contextObj = SQLiteDriverHandler.LiteBansModule_31(string, m[248] + ((SQLiteDriverHandler_3)contextObj).c().LiteBansModule_31() + m[249]);
        flag6 = false;
        targetObj = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)contextObj) + (AllHandler)jy2);
        contextObj = this.c(SQLiteDriverHandler.AsyncBackgroundTask_5((String)targetObj)).BaseCoreGenericHandler(l3);
        flag6 = false;
        Object helperObj = contextObj;
        resultObj = helperObj;
        flag3 = false;
        ((LiteBansModule_60)contextObj).BaseCoreGenericHandler(String.valueOf(charSequence));
        contextObj = LiteBansModule_185.BaseCoreGenericHandler(((LiteBansModule_60)helperObj).BaseCoreGenericHandler(dZ2.BaseCoreGenericHandler()));
        flag6 = false;
        helperObj = contextObj;
        resultObj = helperObj;
        flag3 = false;
        ((AllHandler)jy2).BaseCoreGenericHandler((LiteBansModule_60)resultObj);
        LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)helperObj);
    }

    @Override
    public void BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, @NotNull CharSequence charSequence, @NotNull SilentHandler dZ2, boolean flag) {
        CharSequence charSequence2;
        int n;
        LiteBansModule_356 jT2;
        String string3 = string2;
        String string4 = string3 != null ? LiteBansModule_243.BaseCoreGenericHandler(string3, 128) : null;
        LiteBansModule_83 ch2 = this;
        Object targetObj = dZ2.m();
        AllHandler_2 jy2 = new AllHandler_2(ch2.e(), (String)targetObj, flag2);
        boolean flag4 = dZ2.LiteBansModule_241() && dZ2.PunishmentTableService() != null && !StringUtilities.c((CharSequence)dZ2.PunishmentTableService(), '#', false, 2, null);
        if (flag) {
            SilentHandler dZ3 = dZ2;
            flag3 = false;
            jT2 = LiteBansModule_373.BaseCoreGenericHandler(m[250], String.valueOf(dZ3.BaseCoreGenericHandler()));
        } else {
            jT2 = flag4 ? LiteBansModule_373.BaseCoreGenericHandler(m[251], dZ2.PunishmentTableService()) : LiteBansModule_373.BaseCoreGenericHandler(m[252], dZ2.DatabaseMonitorService());
        }
        targetObj = jT2;
        Object contextObj = dZ2;
        contextObj = ((SilentHandler)contextObj).ServerSyncService().BaseCoreGenericHandler();
        flag5 = false;
        contextObj = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[253] + contextObj), m[254]);
        CharSequence charSequence3 = (String)((LiteBansModule_356)targetObj).LiteBansModule_31() + m[255];
        Object resultObj = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)contextObj), charSequence3};
        CharSequence[] charSequenceArray = resultObj;
        int n2 = charSequenceArray.length;
        for (n = 0; n < n2; ++n) {
            CharSequence charSequence4;
            charSequence2 = charSequence4 = charSequenceArray[n];
            if (charSequence2.length() > 0) continue;
            String string5 = m[256];
            throw new IllegalArgumentException(string5.toString());
        }
        String string6 = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)contextObj) + m[257] + charSequence3);
        contextObj = this;
        contextObj = SQLiteDriverHandler.LiteBansModule_31(string6, m[258] + ((SQLiteDriverHandler_3)contextObj).c().LiteBansModule_31() + m[259]);
        bl10 = false;
        String string7 = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)contextObj) + (AllHandler)jy2);
        contextObj = this.LiteBansModule_195;
        bl10 = false;
        if (((ConfigService)contextObj).g()) {
            Object helperObj = contextObj;
            flag6 = false;
            ((ConfigService)helperObj).BaseCoreGenericHandler((Object)(SQLiteDriverHandler.LiteBansModule_31(string7) + ' ' + dZ2.m() + ' ' + targetObj));
        }
        contextObj = this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(string7));
        String[] args = new String[]{string, string4, ((Object)charSequence).toString(), ((LiteBansModule_356)targetObj).e()};
        flag6 = false;
        Object tempObj = resultObj = contextObj;
        String[] filteredArgs = args;
        n = 0;
        int n3 = filteredArgs.length;
        for (n2 = 0; n2 < n3; ++n2) {
            CharSequence charSequence5 = charSequence2 = filteredArgs[n2];
            ((LiteBansModule_60)contextObj).BaseCoreGenericHandler((String)charSequence5);
        }
        contextObj = LiteBansModule_185.BaseCoreGenericHandler((LiteBansModule_60)resultObj);
        Object object6 = contextObj;
        resultObj = object6;
        ((AllHandler)jy2).BaseCoreGenericHandler((LiteBansModule_60)resultObj);
        LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)object6);
        dZ2.BaseCoreGenericHandler(string4, string, charSequence);
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull SilentHandler dZ2, @Nullable String string, @Nullable String string2, @NotNull CharSequence charSequence, boolean flag) {
        if (flag) {
            Object targetObj = dZ2;
            targetObj = ((SilentHandler)targetObj).ServerSyncService().BaseCoreGenericHandler();
            flag2 = false;
            targetObj = SQLiteDriverHandler.e(m[260] + targetObj);
            CharSequence charSequence2 = m[261];
            CharSequence[] charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)targetObj), charSequence2};
            CharSequence[] charSequenceArray2 = charSequenceArray;
            int n = charSequenceArray2.length;
            for (int i = 0; i < n; ++i) {
                CharSequence charSequence3;
                CharSequence charSequence4 = charSequence3 = charSequenceArray2[i];
                if (charSequence4.length() > 0) continue;
                String string3 = m[262];
                throw new IllegalArgumentException(string3.toString());
            }
            String string4 = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)targetObj) + m[263] + charSequence2);
            LiteBansModule_185.AsyncBackgroundTask_5(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(string4)).BaseCoreGenericHandler(dZ2.BaseCoreGenericHandler()));
        } else {
            CharSequence charSequence5;
            Object contextObj = dZ2;
            contextObj = ((SilentHandler)contextObj).ServerSyncService().BaseCoreGenericHandler();
            flag7 = false;
            contextObj = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[264] + contextObj), m[265]);
            CharSequence charSequence6 = m[266];
            Object resultObj = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)contextObj), charSequence6};
            CharSequence[] charSequenceArray = resultObj;
            int n = charSequenceArray.length;
            for (int i = 0; i < n; ++i) {
                CharSequence charSequence7;
                CharSequence charSequence8 = charSequence7 = charSequenceArray[i];
                if (charSequence8.length() > 0) continue;
                String string5 = m[267];
                throw new IllegalArgumentException(string5.toString());
            }
            String string6 = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)contextObj) + m[268] + charSequence6);
            contextObj = this.LiteBansModule_195;
            if (((ConfigService)contextObj).g()) {
                Object helperObj = contextObj;
                flag8 = false;
                resultObj = SQLiteDriverHandler.AsyncBackgroundTask_5(string6);
                CharSequence charSequence9 = m[269] + dZ2.BaseCoreGenericHandler();
                ((ConfigService)helperObj).BaseCoreGenericHandler((Object)("" + resultObj + charSequence9));
            }
            contextObj = this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(string6));
            bl12 = false;
            resultObj = targetObj = contextObj;
            ((LiteBansModule_60)contextObj).BaseCoreGenericHandler(string);
            contextObj = targetObj;
            String string7 = string2;
            CharSequence charSequence10 = string7 != null ? LiteBansModule_243.BaseCoreGenericHandler(string7, 128) : null;
            Object tempObj = resultObj = contextObj;
            ((LiteBansModule_60)contextObj).BaseCoreGenericHandler((String)charSequence10);
            contextObj = resultObj;
            charSequence10 = charSequence;
            if (StringUtilities.LiteBansModule_31(charSequence10)) {
                bl15 = false;
                charSequence5 = null;
            } else {
                charSequence5 = charSequence10;
            }
            charSequence10 = charSequence5;
            bl15 = false;
            tempObj = resultObj = contextObj;
            bl16 = false;
            ((LiteBansModule_60)contextObj).BaseCoreGenericHandler(String.valueOf(charSequence10));
            LiteBansModule_185.AsyncBackgroundTask_5(((LiteBansModule_60)resultObj).BaseCoreGenericHandler(dZ2.BaseCoreGenericHandler()));
            dZ2.BaseCoreGenericHandler(string2, string, charSequence);
        }
    }

    @Override
    public long BaseCoreGenericHandler(@NotNull String string, long l3, @NotNull String string2) {
        int n;
        boolean flag;
        CharSequence charSequence;
        CharSequence charSequence2;
        int n2;
        int n3;
        boolean flag2;
        CharSequence[] charSequenceArray;
        boolean flag3;
        int n4;
        LiteBansModule_83 ch2 = this;
        AllHandler jJ2 = new AllHandler(ch2.e(), string2);
        Object contextObj = BansHandler_2.values();
        Object resultObj = contextObj;
        Object helperObj = new ArrayList();
        for (BansHandler_2 kL2 : resultObj) {
            targetObj = kL2;
            if (!((BansHandler_2)targetObj).BaseCoreGenericHandler()) continue;
            helperObj.add(kL2);
        }
        contextObj = (List)helperObj;
        n5 = 0;
        resultObj = contextObj.iterator();
        while (resultObj.hasNext()) {
            helperObj = resultObj.next();
            BansHandler_2 kL3 = (BansHandler_2)helperObj;
            int n6 = n5;
            n4 = 0;
            Object tempObj = kL3;
            tempObj = SQLiteDriverHandler.e(m[270] + tempObj);
            CharSequence charSequence3 = m[271];
            targetObj = this;
            Object object6 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)tempObj), charSequence3};
            flag3 = false;
            charSequenceArray = object6;
            flag2 = false;
            n3 = charSequenceArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                charSequence = charSequence2 = charSequenceArray[n2];
                flag = false;
                if (charSequence.length() > 0) continue;
                String string3 = m[272];
                throw new IllegalArgumentException(string3.toString());
            }
            tempObj = ((SQLiteDriverHandler_3)targetObj).c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)tempObj) + m[273] + charSequence3), m[274] + jJ2)));
            Object object7 = tempObj;
            object6 = object7;
            flag3 = false;
            ((LiteBansModule_60)tempObj).BaseCoreGenericHandler(string);
            tempObj = ((LiteBansModule_60)object7).BaseCoreGenericHandler(l3);
            bl9 = false;
            object7 = tempObj;
            object6 = object7;
            flag3 = false;
            jJ2.BaseCoreGenericHandler((LiteBansModule_60)object6);
            int n7 = LiteBansModule_185.LiteBansModule_31((LiteBansModule_60)object7);
            n5 = n6 + n7;
        }
        long l5 = n5;
        contextObj = null;
        contextObj = LiteBansModule_403.BaseCoreGenericHandler(arg_0 -> SQLiteDriverHandler_3.c(string, arg_0));
        if (l3 > 0L) {
            Timestamp timestamp = new Timestamp(l3);
            contextObj = LiteBansModule_403.BaseCoreGenericHandler((LiteBansModule_179)contextObj, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(timestamp, arg_0));
        }
        contextObj = LiteBansModule_403.BaseCoreGenericHandler((LiteBansModule_179)contextObj, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(jJ2, arg_0));
        Object object8 = BansHandler_2.values();
        helperObj = object8;
        Collection collection = new ArrayList();
        n4 = 0;
        int n8 = ((BansHandler_2[])helperObj).length;
        for (n = 0; n < n8; ++n) {
            Object object9 = targetObj = helperObj[n];
            if (!(((BansHandler_2)object9).BaseCoreGenericHandler() && object9 != BansHandler_2.GnuSparseMapHandler)) continue;
            collection.add(targetObj);
        }
        object8 = (List)collection;
        bl10 = false;
        helperObj = object8.iterator();
        while (helperObj.hasNext()) {
            collection = helperObj.next();
            BansHandler_2 kL4 = (BansHandler_2)((Object)collection);
            n = 0;
            CharSequence charSequence4 = kL4;
            charSequence4 = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[275] + charSequence4), m[276]);
            targetObj = SQLiteDriverHandler.AsyncBackgroundTask_5(LiteBansModule_228.c(m[277]));
            CharSequence[] charSequenceArray2 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)charSequence4), targetObj};
            flag3 = false;
            charSequenceArray = charSequenceArray2;
            flag2 = false;
            n3 = charSequenceArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                charSequence = charSequence2 = charSequenceArray[n2];
                flag = false;
                if (charSequence.length() > 0) continue;
                String string4 = m[278];
                throw new IllegalArgumentException(string4.toString());
            }
            String string5 = SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)charSequence4) + m[279] + targetObj), m[280] + jJ2);
            if (l3 > 0L) {
                string5 = SQLiteDriverHandler.LiteBansModule_31(string5, m[281]);
            }
            LiteBansModule_185.LiteBansModule_31(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(string5)), (LiteBansModule_179)contextObj);
        }
        if (this.LiteBansModule_195.LiteBansModule_195().PunishmentTableService()) {
            PunishmentTableService p2 = this.Utf8Handler_2;
            p2.BaseCoreGenericHandler(this);
        }
        return l5;
    }

    @Override
    public ResultSet LiteBansModule_31(@NotNull String string) {
        Object targetObj = BansHandler_2.LiteBansModule_31;
        targetObj = LiteBansModule_294.BaseCoreGenericHandler(SQLiteDriverHandler.e(m[282] + targetObj), m[283]);
        CharSequence charSequence = m[284];
        SQLiteDriverHandler_3 gZ2 = this;
        Object contextObj = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)targetObj), charSequence};
        CharSequence[] charSequenceArray = contextObj;
        int n = charSequenceArray.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray[i];
            if (charSequence3.length() > 0) continue;
            String string2 = m[285];
            throw new IllegalArgumentException(string2.toString());
        }
        targetObj = gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)targetObj) + m[286] + charSequence), SQLiteDriverHandler.AsyncBackgroundTask_5(LiteBansModule_228.c(m[287])))));
        Object resultObj = targetObj;
        contextObj = resultObj;
        flag3 = false;
        ((LiteBansModule_60)targetObj).BaseCoreGenericHandler(string);
        return LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)resultObj);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(boolean flag) {
        try {
            if (this.LiteBansModule_195.LiteBansModule_195().BanHandler_5()) {
                return;
            }
            long l3 = DatabaseMonitorService.BaseCoreGenericHandler(this.AsyncBackgroundTask_5(), false, 1, null);
            if (l3 - this.AsyncBackgroundTask_5().LiteBansModule_31() <= 72000000L && !flag) {
                return;
            }
            ServerSyncService u2 = (ServerSyncService)this.LiteBansModule_241.BaseCoreGenericHandler(ServerSyncService.class);
            Object targetObj = this.AsyncBackgroundTask_5();
            ((DatabaseMonitorService)targetObj).BaseCoreGenericHandler(l3 + (long)n);
            ServerSyncService.BaseCoreGenericHandler(u2, BroadcastHandler.PunishmentTableService, this, null, 0, 12, null);
            targetObj = this.AsyncBackgroundTask_5.createStatement();
            Throwable throwable = null;
            try {
                int n2;
                int n3;
                boolean flag3;
                int n4;
                boolean flag4;
                Object helperObj = (Statement)targetObj;
                Object tempObj = BansHandler_2.values();
                Object object6 = tempObj;
                Collection<BansHandler_2> collection = new ArrayList();
                for (CharSequence charSequence : object6) {
                    BansHandler_2 kL2 = charSequence;
                    resultObj = kL2;
                    flag4 = false;
                    boolean bl9 = resultObj.BaseCoreGenericHandler() && resultObj != BansHandler_2.GnuSparseMapHandler;
                    if (!bl9) continue;
                    collection.add((BansHandler_2)charSequence);
                }
                tempObj = (List)collection;
                flag6 = false;
                object6 = tempObj.iterator();
                while (object6.hasNext()) {
                    CharSequence charSequence;
                    collection = object6.next();
                    BansHandler_2 kL3 = (BansHandler_2)((Object)collection);
                    n4 = 0;
                    ObjectUtilities.BaseCoreGenericHandler(helperObj);
                    Statement statement = helperObj;
                    charSequence = kL3;
                    charSequence = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[288] + charSequence), m[289]);
                    CharSequence charSequence2 = m[290];
                    resultObj = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)charSequence), charSequence2};
                    flag4 = false;
                    contextObj = resultObj;
                    flag3 = false;
                    n3 = ((CharSequence[])contextObj).length;
                    for (int i = 0; i < n3; ++i) {
                        CharSequence charSequence3;
                        CharSequence charSequence4 = charSequence3 = contextObj[i];
                        if (charSequence4.length() > 0) continue;
                        String string = m[291];
                        throw new IllegalArgumentException(string.toString());
                    }
                    charSequence = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)charSequence) + m[292] + charSequence2), m[293]), m[294] + l3));
                    Statement statement2 = statement;
                    resultObj = statement2;
                    flag4 = false;
                    statement.addBatch(((Object)charSequence).toString());
                }
                long l5 = this.LiteBansModule_195.LiteBansModule_195().LiteBansModule_43();
                if (l5 > 0L) {
                    object6 = BansHandler_2.values();
                    Iterator iterator = object6;
                    Collection<Object> collection2 = new ArrayList();
                    n2 = 0;
                    for (Object object7 : iterator) {
                        resultObj = object7;
                        flag4 = false;
                        contextObj = resultObj;
                        flag3 = false;
                        boolean bl15 = contextObj.BaseCoreGenericHandler() && contextObj != BansHandler_2.GnuSparseMapHandler;
                        if (!bl15) continue;
                        collection2.add(object7);
                    }
                    object6 = (List)collection2;
                    bl14 = false;
                    iterator = object6.iterator();
                    while (iterator.hasNext()) {
                        collection2 = iterator.next();
                        BansHandler_2 kL4 = (BansHandler_2)((Object)collection2);
                        ObjectUtilities.BaseCoreGenericHandler(helperObj);
                        Object object8 = helperObj;
                        CharSequence charSequence = kL4;
                        charSequence = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[295] + charSequence), m[296]);
                        CharSequence charSequence5 = m[297];
                        contextObj = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)charSequence), charSequence5};
                        flag3 = false;
                        CharSequence[] charSequenceArray = contextObj;
                        n3 = 0;
                        int n6 = charSequenceArray.length;
                        for (int i = 0; i < n6; ++i) {
                            CharSequence charSequence6;
                            CharSequence charSequence7 = charSequence6 = charSequenceArray[i];
                            if (charSequence7.length() > 0) continue;
                            String string = m[298];
                            throw new IllegalArgumentException(string.toString());
                        }
                        charSequence = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)charSequence) + m[299] + charSequence5), m[300]), m[301] + l5 + m[302] + l3));
                        Object object9 = object8;
                        contextObj = object9;
                        flag3 = false;
                        object8.addBatch(((Object)charSequence).toString());
                    }
                }
                DatabaseMonitorService w2 = this.AsyncBackgroundTask_5();
                ObjectUtilities.BaseCoreGenericHandler(helperObj);
                object6 = w2.BaseCoreGenericHandler((Statement)helperObj);
                if (this.LiteBansModule_195.BaseCoreGenericHandler(100)) {
                    Object object10 = object6;
                    n4 = 0;
                    int n7 = ((BansHandler_2[])object10).length;
                    for (n2 = 0; n2 < n7; ++n2) {
                        BansHandler_2 kL5;
                        BansHandler_2 kL6 = kL5 = object10[n2];
                        int n8 = n4;
                        int n9 = Math.max((int)kL6, 0);
                        n4 = n8 + n9;
                    }
                    int n10 = n4;
                    if (n10 > 0) {
                        this.LiteBansModule_195.BaseCoreGenericHandler((Object)(m[303] + n10 + m[304] + l3 + ')'));
                    }
                }
                helperObj = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)targetObj, throwable);
            }
        }
        catch (SQLException sQLException) {
            String string = sQLException.getMessage();
            boolean bl21 = string != null ? StringUtilities.LiteBansModule_31(string, m[305], false, 2, null) : false;
            if (bl21) {
                return;
            }
            throw sQLException;
        }
    }

    @Override
    public int BaseCoreGenericHandler(@NotNull LiteBansModule_298 iA2) {
        CharSequence charSequence;
        int n;
        Object targetObj = BansHandler_2.g;
        targetObj = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[306] + targetObj), m[307]);
        String[] args = (String[])m[308];
        SQLiteDriverHandler_3 gZ2 = this;
        Object contextObj = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)targetObj), args};
        CharSequence[] charSequenceArray = contextObj;
        int n2 = charSequenceArray.length;
        for (n = 0; n < n2; ++n) {
            CharSequence charSequence2;
            charSequence = charSequence2 = charSequenceArray[n];
            if (charSequence.length() > 0) continue;
            String string = m[309];
            throw new IllegalArgumentException(string.toString());
        }
        targetObj = gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)targetObj) + m[310] + args), m[311])));
        args = new String[]{m[312], iA2.LiteBansModule_31(), iA2.i()};
        flag2 = false;
        Object resultObj = contextObj = targetObj;
        String[] filteredArgs = args;
        n = 0;
        int n3 = filteredArgs.length;
        for (n2 = 0; n2 < n3; ++n2) {
            CharSequence charSequence3 = charSequence = filteredArgs[n2];
            ((LiteBansModule_60)targetObj).BaseCoreGenericHandler((String)charSequence3);
        }
        return LiteBansModule_185.LiteBansModule_31((LiteBansModule_60)contextObj);
    }

    private final void BaseCoreGenericHandler(Statement statement) {
        BansHandler_2[] kLArray = BansHandler_2.values();
        int n = kLArray.length;
        for (int i = 0; i < n; ++i) {
            String string;
            BansHandler_2 kL2;
            BansHandler_2 kL3 = kL2 = kLArray[i];
            String string2 = BansHandler_2.BaseCoreGenericHandler(kL3, Locale.getDefault(), false, 2, null);
            if (ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)(string = BansHandler_2.BaseCoreGenericHandler(kL3, null, false, 3, null))) || this.LiteBansModule_31((CharSequence)string) || !this.LiteBansModule_31((CharSequence)string2)) continue;
            this.LiteBansModule_241.getLogger().info(m[325] + string2 + m[326] + string + '\"');
            statement.execute(m[327] + string2 + m[328] + string);
        }
    }

    public final SQLiteDriverHandler_5 LiteBansModule_31() {
        DiscordWebhookClient eG2 = this.LiteBansModule_195.LiteBansModule_195();
        return new SQLiteDriverHandler_5(Utf8mb4UnicodeCiHandler.g.BaseCoreGenericHandler(eG2.ElementsHandler(), eG2.BanHandler()));
    }

    public final CharSequence BaseCoreGenericHandler(@NotNull BansHandler_2 kL2, @NotNull SQLiteDriverHandler_5 jr_02) {
        boolean flag;
        String[] args;
        String string = null;
        string = m[329];
        String string2 = null;
        string2 = m[330];
        SQLiteDriverHandler_5 jr_03 = jr_02;
        if (kL2 == BansHandler_2.LiteBansModule_31) {
            args = m[331];
            targetObj = m[332];
            string2 = (String)args + m[333] + (String)targetObj;
        }
        if (kL2 != BansHandler_2.GnuSparseMapHandler) {
            args = m[334];
            int n = 36;
            String string3 = m[335];
            String string4 = jr_03.LiteBansModule_31().c();
            String string5 = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)args + m[336] + n + ')' + string4 + string3 : (String)args + m[337] + n + ')' + string3;
            args = m[338];
            n = 128;
            string3 = m[339];
            string4 = jr_03.LiteBansModule_31().c();
            flag4 = false;
            String string6 = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)args + m[340] + n + ')' + string4 + string3 : (String)args + m[341] + n + ')' + string3;
            args = m[342];
            n = 2048;
            string3 = m[343];
            string4 = jr_03.LiteBansModule_31().c();
            flag4 = false;
            String string7 = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)args + m[344] + n + ')' + string4 + string3 : (String)args + m[345] + n + ')' + string3;
            args = jr_03;
            targetObj = m[346];
            string3 = m[347];
            flag = false;
            string = string5 + ',' + string6 + ',' + string7 + ',' + ((String)targetObj + m[348] + string3);
        }
        args = new String[18];
        targetObj = jr_03;
        String string8 = m[349];
        flag = false;
        args[0] = ObjectUtilities.BaseCoreGenericHandler((Object)((SQLiteDriverHandler_5)targetObj).LiteBansModule_31().BaseCoreGenericHandler(), (Object)m[350]) ? string8 + m[351] : string8 + m[352];
        targetObj = m[353];
        int n = 36;
        String string9 = m[354];
        String string10 = m[355];
        args[1] = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)targetObj + m[356] + n + ')' + string9 + string10 : (String)targetObj + m[357] + n + ')' + string10;
        targetObj = m[358];
        n = 45;
        string9 = m[359];
        string10 = m[360];
        flag5 = false;
        args[2] = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)targetObj + m[361] + n + ')' + string9 + string10 : (String)targetObj + m[362] + n + ')' + string10;
        targetObj = m[363];
        n = 2048;
        string10 = m[364];
        string9 = jr_03.LiteBansModule_31().c();
        flag5 = false;
        args[3] = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)targetObj + m[365] + n + ')' + string9 + string10 : (String)targetObj + m[366] + n + ')' + string10;
        targetObj = m[367];
        n = 36;
        string10 = m[368];
        string9 = jr_03.LiteBansModule_31().c();
        flag5 = false;
        SQLiteDriverHandler_5 jr_04 = jr_03;
        String string11 = string10 + m[369];
        args[4] = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_04.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)targetObj + m[370] + n + ')' + string9 + string11 : (String)targetObj + m[371] + n + ')' + string11;
        targetObj = m[372];
        n = 128;
        string10 = m[373];
        string9 = jr_03.LiteBansModule_31().c();
        flag5 = false;
        args[5] = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)targetObj + m[374] + n + ')' + string9 + string10 : (String)targetObj + m[375] + n + ')' + string10;
        args[6] = string;
        targetObj = jr_03;
        String string12 = m[376];
        args[7] = string12 + m[377];
        targetObj = jr_03;
        string12 = m[378];
        flag7 = false;
        args[8] = string12 + m[379];
        targetObj = jr_03;
        string12 = m[380];
        String string13 = m[381];
        String string14 = ((SQLiteDriverHandler_5)targetObj).LiteBansModule_31().BaseCoreGenericHandler();
        args[9] = ObjectUtilities.BaseCoreGenericHandler((Object)string14, (Object)m[382]) || ObjectUtilities.BaseCoreGenericHandler((Object)string14, (Object)m[383]) ? string12 + m[384] + string13 : string12 + m[385] + ((SQLiteDriverHandler_5)targetObj).LiteBansModule_31().e() + m[386] + string13;
        targetObj = m[387];
        int n2 = 32;
        string13 = m[388];
        String string15 = jr_03.LiteBansModule_31().c();
        args[10] = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)targetObj + m[389] + n2 + ')' + string15 + string13 : (String)targetObj + m[390] + n2 + ')' + string13;
        targetObj = m[391];
        n2 = 32;
        string13 = m[392];
        string15 = jr_03.LiteBansModule_31().c();
        bl9 = false;
        args[11] = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)targetObj + m[393] + n2 + ')' + string15 + string13 : (String)targetObj + m[394] + n2 + ')' + string13;
        targetObj = m[395];
        String string16 = m[396];
        args[12] = (String)targetObj + m[397] + string16;
        targetObj = m[398];
        string16 = m[399];
        bl10 = false;
        args[13] = (String)targetObj + m[400] + string16;
        targetObj = jr_03;
        string16 = m[401];
        String string17 = m[402];
        args[14] = string16 + m[403] + string17;
        targetObj = m[404];
        string16 = m[405];
        args[15] = (String)targetObj + m[406] + string16;
        args[16] = string2;
        targetObj = jr_03;
        string16 = m[407];
        bl12 = false;
        args[17] = m[408] + string16 + ')';
        return SQLiteDriverHandler.AsyncBackgroundTask_5(jr_03.BaseCoreGenericHandler(kL2, args));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void BaseCoreGenericHandler(SQLConnectionHandler dc_02) {
        SQLConnectionHandler dc_03 = dc_02;
        AutoCloseable autoCloseable = this.LiteBansModule_195();
        Throwable throwable = null;
        try {
            Object targetObj = (Statement)autoCloseable;
            if (dc_03.c()) {
                Iterable iterable = dc_03.LiteBansModule_31();
                for (Object t2 : iterable) {
                    String string = ((SQLiteDriverHandler)t2).c();
                    try {
                        Object contextObj = targetObj;
                        SQLiteDriverHandler aR2 = SQLiteDriverHandler.AsyncBackgroundTask_5(string);
                        contextObj.execute(((Object)aR2).toString());
                    }
                    catch (SQLException sQLException) {
                        ConfigService.BaseCoreGenericHandler(dc_03.e(), sQLException, 0, 2, null);
                    }
                }
            } else {
                Iterable iterable = dc_03.LiteBansModule_31();
                for (Object t3 : iterable) {
                    CharSequence charSequence = (CharSequence)t3;
                    Object helperObj = targetObj;
                    Object tempObj = resultObj = helperObj;
                    helperObj.addBatch(((Object)charSequence).toString());
                }
                if (!((Collection)dc_03.LiteBansModule_31()).isEmpty()) {
                    targetObj.executeBatch();
                }
            }
            targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void BaseCoreGenericHandler(boolean flag, @NotNull ConfigService configService, @NotNull SQLiteDriverHandler_5 jr_02, boolean flag2) {
        boolean flag3;
        int n;
        boolean flag4;
        int n2;
        SQLConnectionHandler dc_02 = new SQLConnectionHandler(this.LiteBansModule_241, this, flag, null, 8, null);
        if (flag2) {
            n2 = 0;
        } else {
            int n3;
            try {
                String string;
                String string2;
                Object targetObj = BansHandler_2.i;
                CharSequence charSequence = m[506];
                flag4 = false;
                targetObj = LiteBansModule_185.AsyncBackgroundTask_5(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e(m[507] + charSequence + m[508] + targetObj), (Number)1))));
                n = 1;
                flag4 = false;
                if (targetObj.next()) {
                    String string3;
                    Object contextObj = targetObj;
                    flag3 = false;
                    try {
                        string3 = contextObj.getString(n);
                    }
                    catch (SQLException sQLException) {
                        string3 = null;
                    }
                    string2 = string3;
                } else {
                    string2 = string = null;
                }
                if (string2 == null) {
                    string = LiteBansModule_337.LiteBansModule_31();
                }
                String string4 = string;
                ObjectUtilities.BaseCoreGenericHandler((Object)string4);
                n3 = Integer.parseInt(string4);
            }
            catch (SQLException sQLException) {
                ConfigService.BaseCoreGenericHandler(configService, sQLException, 0, 2, null);
                n3 = 0;
            }
            n2 = n3;
        }
        int n4 = n2;
        Object targetObj = configService;
        if (((ConfigService)targetObj).g()) {
            ConfigService q_03 = targetObj;
            q_03.BaseCoreGenericHandler((Object)(m[509] + n4 + m[510] + LiteBansModule_337.LiteBansModule_31()));
        }
        if (n4 <= 1168) {
            Object resultObj = targetObj = (ServerSyncService)this.LiteBansModule_241.BaseCoreGenericHandler(ServerSyncService.class);
            ((ServerSyncService)resultObj).c(this);
        }
        targetObj = this.LiteBansModule_195();
        Throwable throwable = null;
        try {
            boolean flag8;
            int n3;
            Object object6 = (Statement)targetObj;
            n = 0;
            this.plugin((Statement)object6);
            flag4 = ObjectUtilities.BaseCoreGenericHandler((Object)configService.LiteBansModule_195().ElementsHandler(), (Object)m[511]);
            boolean bl9 = this.LiteBansModule_31(BansHandler_2.Utf8Handler_2);
            flag3 = this.LiteBansModule_31(BansHandler_2.m);
            boolean bl10 = this.LiteBansModule_31(BansHandler_2.LiteBansModule_31);
            boolean bl11 = this.LiteBansModule_31(BansHandler_2.Utf8Handler_2, m[512], flag4);
            boolean bl12 = this.LiteBansModule_31(BansHandler_2.LiteBansModule_31, m[513], flag4);
            if (!flag3 && bl9 && bl11) {
                int n6;
                CharSequence[] charSequenceArray;
                CharSequence charSequence;
                int n5;
                tempObj = object6;
                Object object7 = this.plugin(BansHandler_2.m, jr_02);
                tempObj.execute(object7.toString());
                tempObj = object6;
                object7 = this.plugin(BansHandler_2.LiteBansModule_31, jr_02);
                bl13 = false;
                tempObj.execute(object7.toString());
                object7 = object6;
                Object object8 = BansHandler_2.Utf8Handler_2;
                CharSequence charSequence2 = m[514];
                object8 = SQLiteDriverHandler.e(m[515] + charSequence2 + m[516] + object8);
                charSequence2 = m[517];
                bl14 = false;
                CharSequence[] charSequenceArray2 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object8), charSequence2};
                CharSequence[] bl21 = charSequenceArray2;
                n3 = 0;
                int n7 = bl21.length;
                for (n5 = 0; n5 < n7; ++n5) {
                    CharSequence charSequence3 = charSequence = bl21[n5];
                    if (charSequence3.length() > 0) continue;
                    String string = m[518];
                    throw new IllegalArgumentException(string.toString());
                }
                object8 = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object8) + m[519] + charSequence2));
                tempObj = object7.executeQuery(object8.toString());
                object8 = (AutoCloseable)tempObj;
                Throwable throwable2 = null;
                try {
                    charSequenceArray = (ResultSet)object8;
                    n6 = 0;
                    while (tempObj.next()) {
                        Object object9 = tempObj;
                        boolean charSequenceArray3 = false;
                        this.c(this.plugin((ResultSet)object9, BanHandler.values()[object9.getInt(m[520])]));
                    }
                    charSequenceArray = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable3) {
                    throwable2 = throwable3;
                    throw throwable3;
                }
                finally {
                    CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)object8, throwable2);
                }
                tempObj = object6;
                helperObj = BansHandler_2.Utf8Handler_2;
                helperObj = SQLiteDriverHandler.e(m[521] + helperObj);
                CharSequence charSequence4 = m[522];
                flag8 = false;
                charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)helperObj), charSequence4};
                n6 = 0;
                CharSequence[] charSequenceArray4 = charSequenceArray;
                n5 = charSequenceArray4.length;
                for (n3 = 0; n3 < n5; ++n3) {
                    CharSequence charSequence5;
                    charSequence = charSequence5 = charSequenceArray4[n3];
                    if (charSequence.length() > 0) continue;
                    String string = m[523];
                    throw new IllegalArgumentException(string.toString());
                }
                helperObj = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)helperObj) + m[524] + charSequence4));
                tempObj.executeUpdate(helperObj.toString());
            }
            if (!ObjectUtilities.BaseCoreGenericHandler((Object)configService.LiteBansModule_195().ElementsHandler(), (Object)m[525])) {
                tempObj = this.LiteBansModule_31();
                if (bl11) {
                    helperObj = object6;
                    CharSequence charSequence = BansHandler_2.Utf8Handler_2;
                    flag8 = false;
                    charSequence = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_241(SQLiteDriverHandler.e(m[526] + charSequence), m[527]));
                    flag8 = false;
                    helperObj.execute(((Object)charSequence).toString());
                }
                if (bl10 && !bl12) {
                    helperObj = object6;
                    CharSequence charSequence = BansHandler_2.LiteBansModule_31;
                    flag8 = false;
                    charSequence = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_195(SQLiteDriverHandler.e(m[528] + charSequence), m[529]));
                    flag8 = false;
                    helperObj.execute(((Object)charSequence).toString());
                    helperObj = object6;
                    charSequence = BansHandler_2.LiteBansModule_31;
                    flag8 = false;
                    charSequence = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[530] + charSequence), m[531]));
                    flag8 = false;
                    helperObj.executeUpdate(((Object)charSequence).toString());
                }
                if (flag || bl9) {
                    helperObj = tempObj;
                    for (BansHandler_2 kL2 : BansHandler_2.values()) {
                        if (kL2.BaseCoreGenericHandler()) {
                            dc_02.BaseCoreGenericHandler(kL2);
                            if (kL2 != BansHandler_2.GnuSparseMapHandler) {
                                dc_02.BaseCoreGenericHandler(LiteBansModule_373.BaseCoreGenericHandler(m[532], LiteBansModule_108.BaseCoreGenericHandler));
                                dc_02.BaseCoreGenericHandler(LiteBansModule_373.BaseCoreGenericHandler(m[533], LiteBansModule_336.LiteBansModule_31));
                                dc_02.BaseCoreGenericHandler(LiteBansModule_373.BaseCoreGenericHandler(m[534], LiteBansModule_408.BaseCoreGenericHandler));
                                dc_02.BaseCoreGenericHandler(LiteBansModule_373.BaseCoreGenericHandler(m[535], LiteBansModule_163.LiteBansModule_31));
                            }
                            dc_02.BaseCoreGenericHandler(LiteBansModule_373.BaseCoreGenericHandler(m[536], new TemplateHandler((SQLiteDriverHandler_5)helperObj)));
                            dc_02.BaseCoreGenericHandler(LiteBansModule_373.BaseCoreGenericHandler(m[537], new ServerOriginHandler((SQLiteDriverHandler_5)helperObj)));
                            dc_02.BaseCoreGenericHandler(LiteBansModule_373.BaseCoreGenericHandler(m[538], arg_0 -> SQLiteDriverHandler_3.LiteBansModule_31((SQLiteDriverHandler_5)helperObj, arg_0)));
                            dc_02.BaseCoreGenericHandler(LiteBansModule_373.BaseCoreGenericHandler(m[539], arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler((SQLiteDriverHandler_5)helperObj, arg_0)));
                        }
                        if (kL2 == BansHandler_2.g || !DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(configService.LiteBansModule_195().ElementsHandler()) || n4 > 680) continue;
                        BansHandler_2 kL3 = kL2;
                        n3 = 0;
                        SQLiteDriverHandler.g(SQLiteDriverHandler.e(m[540] + kL3), ((SQLiteDriverHandler_5)tempObj).LiteBansModule_31().c());
                    }
                    if (flag || n4 < 883) {
                        dc_02.BaseCoreGenericHandler(BansHandler_2.i);
                        dc_02.BaseCoreGenericHandler(LiteBansModule_373.BaseCoreGenericHandler(m[541], new AcceptHandler((SQLiteDriverHandler_5)helperObj)));
                    }
                    if (!((Collection)dc_02).isEmpty()) {
                        this.LiteBansModule_241.getLogger().info(m[542]);
                        this.plugin(dc_02);
                        this.LiteBansModule_241.getLogger().info(m[543]);
                    }
                }
            }
            object6 = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable4) {
            throwable = throwable4;
            throw throwable4;
        }
        finally {
            CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)targetObj, throwable);
        }
    }

    @Override
    public boolean BaseCoreGenericHandler() {
        return AllHandler_3.LiteBansModule_31(this);
    }

    @Override
    public DatabaseMonitorService AsyncBackgroundTask_5() {
        return AllHandler_3.BaseCoreGenericHandler(this);
    }

    @Override
    public List BaseCoreGenericHandler(@NotNull LiteBansModule_298 iA2, @NotNull BanHandler a_2, @NotNull String string, boolean flag, int n) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, iA2, a_2, string, flag, n);
    }

    @Override
    public List BaseCoreGenericHandler(@NotNull SilentHandler dZ2, int n) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, dZ2, n);
    }

    @Override
    public List BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull BanHandler a_2, boolean flag, int n) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, sender, a_2, flag, n);
    }

    @Override
    public List LiteBansModule_31(@NotNull ResultSet resultSet, @NotNull BanHandler a_2) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, resultSet, a_2);
    }

    @Override
    public String BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, sender);
    }

    @Override
    public CharSequence LiteBansModule_31(@NotNull CharSequence charSequence, @NotNull CommandSenderWrapper sender) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, charSequence, sender);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @Nullable String string, @Nullable String string2, boolean flag) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, charSequence, string, string2, flag);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, charSequence);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @Nullable LiteBansModule_298 iA2, boolean flag) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, charSequence, iA2, flag);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @Nullable CommandSenderWrapper sender) {
        return AllHandler_3.LiteBansModule_31(this, charSequence, sender);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull LiteBansModule_114 d92) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, charSequence, d92);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @Nullable SilentHandler dZ2, boolean flag) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, charSequence, dZ2, flag);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @Nullable SilentHandler dZ2, @Nullable LiteBansModule_298 iA2, boolean flag) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, charSequence, dZ2, iA2, flag);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, charSequence, string, string2, string3, string4, string5);
    }

    @Override
    public boolean BaseCoreGenericHandler(@NotNull SilentHandler dZ2, @NotNull CommandSenderWrapper sender) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, dZ2, sender);
    }

    @Override
    public boolean BaseCoreGenericHandler(@Nullable SilentHandler dZ2) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)this, dZ2);
    }

    private static final LiteBansModule_60 LiteBansModule_31(String string, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        String[] args = new String[]{string};
        LiteBansModule_60 bT5 = bT3 = bT4;
        String[] filteredArgs = args;
        int n = filteredArgs.length;
        for (int i = 0; i < n; ++i) {
            String string2;
            String string3 = string2 = filteredArgs[i];
            bT4.BaseCoreGenericHandler(string3);
        }
        return bT3;
    }

    private static final LiteBansModule_60 c(String string, String string2, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        String[] args = new String[]{string, string2, string2};
        LiteBansModule_60 bT5 = bT3 = bT4;
        String[] filteredArgs = args;
        int n = filteredArgs.length;
        for (int i = 0; i < n; ++i) {
            String string3;
            String string4 = string3 = filteredArgs[i];
            bT4.BaseCoreGenericHandler(string4);
        }
        return LiteBansModule_185.BaseCoreGenericHandler(bT3);
    }

    private static final LiteBansModule_60 LiteBansModule_31(String string, String string2, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        String[] args = new String[]{string, string2, string2};
        LiteBansModule_60 bT5 = bT3 = bT4;
        String[] filteredArgs = args;
        int n = filteredArgs.length;
        for (int i = 0; i < n; ++i) {
            String string3;
            String string4 = string3 = filteredArgs[i];
            bT4.BaseCoreGenericHandler(string4);
        }
        return bT3;
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(LiteBansModule_60 bT2) {
        return LiteBansModule_185.BaseCoreGenericHandler(bT2);
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(AllHandler_2 jy2, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        LiteBansModule_60 bT5 = bT3 = bT4;
        ((AllHandler)jy2).BaseCoreGenericHandler(bT5);
        return bT3;
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(String string, String string2, LiteBansModule_65 c12, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        String[] args = new String[]{string, string2};
        LiteBansModule_60 bT5 = bT3 = bT4;
        String[] filteredArgs = args;
        int n = filteredArgs.length;
        for (int i = 0; i < n; ++i) {
            String string3;
            String string4 = string3 = filteredArgs[i];
            bT4.BaseCoreGenericHandler(string4);
        }
        bT4 = bT3;
        return bT4.BaseCoreGenericHandler(c12.LiteBansModule_195());
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(String string, LiteBansModule_65 c12, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3 = bT2.BaseCoreGenericHandler(string);
        return bT3.BaseCoreGenericHandler(c12.LiteBansModule_195());
    }

    private static final LiteBansModule_60 c(LiteBansModule_60 bT2) {
        return LiteBansModule_185.BaseCoreGenericHandler(bT2);
    }

    private static final LiteBansModule_60 LiteBansModule_31(long l3, LiteBansModule_60 bT2) {
        return bT2.BaseCoreGenericHandler(l3);
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(String string, String string2, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        String[] args = new String[]{string, string2};
        LiteBansModule_60 bT5 = bT3 = bT4;
        String[] filteredArgs = args;
        int n = filteredArgs.length;
        for (int i = 0; i < n; ++i) {
            String string3;
            String string4 = string3 = filteredArgs[i];
            bT4.BaseCoreGenericHandler(string4);
        }
        return bT3;
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(String string, LiteBansModule_60 bT2) {
        return bT2.BaseCoreGenericHandler(string);
    }

    private static final LiteBansModule_60 LiteBansModule_31(LiteBansModule_60 bT2) {
        return LiteBansModule_185.BaseCoreGenericHandler(bT2);
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(long l3, LiteBansModule_60 bT2) {
        return bT2.BaseCoreGenericHandler(l3);
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(LiteBansModule_65 c12, LiteBansModule_60 bT2) {
        return bT2.BaseCoreGenericHandler(c12.LiteBansModule_195());
    }

    private static final LiteBansModule_60 c(String string, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        LiteBansModule_60 bT5 = bT3 = bT4;
        bT4.BaseCoreGenericHandler(string);
        return bT3;
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(Timestamp timestamp, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        LiteBansModule_60 bT5 = bT3 = bT4;
        bT4.BaseCoreGenericHandler(timestamp);
        return bT3;
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(AllHandler jJ2, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        LiteBansModule_60 bT5 = bT3 = bT4;
        jJ2.BaseCoreGenericHandler(bT5);
        return bT3;
    }

    private static final SQLiteDriverHandler[] LiteBansModule_31(SQLiteDriverHandler_5 jr_02, BansHandler_2 kL2) {
        SQLiteDriverHandler[] aRArray = new SQLiteDriverHandler[2];
        CharSequence charSequence = kL2;
        String string = SQLiteDriverHandler.e(m[544] + charSequence);
        charSequence = m[545];
        n = 32;
        String string2 = m[546];
        String string3 = jr_02.LiteBansModule_31().c();
        aRArray[0] = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_195(string, DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_02.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)charSequence + m[547] + n + ')' + string3 + string2 : (String)charSequence + m[548] + n + ')' + string2));
        charSequence = kL2;
        n = 0;
        aRArray[1] = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[549] + charSequence), m[550]), m[551]));
        return aRArray;
    }

    private static final SQLiteDriverHandler[] BaseCoreGenericHandler(SQLiteDriverHandler_5 jr_02, BansHandler_2 kL2) {
        SQLiteDriverHandler[] aRArray = new SQLiteDriverHandler[2];
        Object targetObj = kL2;
        String string = SQLiteDriverHandler.e(m[552] + targetObj);
        targetObj = jr_02;
        String string2 = m[553];
        String string3 = m[554];
        aRArray[0] = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_195(string, string2 + m[555] + string3));
        targetObj = kL2;
        targetObj = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[556] + targetObj), m[557]);
        CharSequence charSequence = m[558];
        int n = 1;
        SQLiteDriverHandler[] aRArray2 = aRArray;
        CharSequence[] charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)targetObj), charSequence};
        CharSequence[] charSequenceArray2 = charSequenceArray;
        int n2 = charSequenceArray2.length;
        for (int i = 0; i < n2; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            if (charSequence3.length() > 0) continue;
            String string4 = m[559];
            throw new IllegalArgumentException(string4.toString());
        }
        String string5 = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)targetObj) + m[560] + charSequence);
        aRArray2[n] = SQLiteDriverHandler.AsyncBackgroundTask_5(string5);
        return aRArray;
    }

    private static final LiteBansModule_60 AsyncBackgroundTask_5(LiteBansModule_60 bT2) {
        return bT2;
    }

    public static final /* synthetic */ LiteBansModule_179 BaseCoreGenericHandler() {
        return BaseCoreGenericHandler;
    }

    public static final /* synthetic */ int e() {
        return i;
    }

    public static final /* synthetic */ void BaseCoreGenericHandler(int n) {
        i = n;
    }

    static {
        c = 64;
        LiteBansModule_31 = 28800000;
        GnuSparseMapHandler = 57600000;
        e = 72000000;
        SQLiteDriverHandler_3.LiteBansModule_241();
        LiteBansModule_403 = new NameHandler_2(null);
        BaseCoreGenericHandler = LiteBansModule_403.BaseCoreGenericHandler(SQLiteDriverHandler_3::AsyncBackgroundTask_5);
        i = 64;
    }

    private static final void LiteBansModule_241() {
        m = new String[]{"active=", " AND(until<1 OR until>?)", "uuid,ip,reason,banned_by_uuid,banned_by_name,time,until,template,server_scope,server_origin,silent,ipban,ipban_wildcard,active", "?::bit,", "pgsql", "Created new ", " for server:", "Adding entry: ", "INSERT INTO ", ")VALUES(", "#", "#", "Player name \"", "\" length > ", "UUID \"", "\" length > 36", "UPDATE ", "date=CURRENT_TIMESTAMP", "ip=?", "Failed ", " WHERE ", "uuid=?", "name=?", "DELETE FROM ", "name{=?}", "Failed ", " WHERE ", "uuid=?", "name,uuid,ip", "?", "?,", "INSERT INTO ", ")VALUES(", "New login record: [", "Duplicate entry", "COUNT(*)", "uuid=?", " OR(ipban_wildcard={true} AND active={true} AND ? LIKE ip)", " OR(ipban_wildcard={true})", " OR(ipban={true} AND(ip=?", ")AND((time+", ")>?", "))", " OR(ipban={true} AND(ip=?", "))", ")AND template NOT IN(", ",", "time", "SELECT 1 FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME LIKE '", "' AND COLUMN_NAME='", "' LIMIT 1", "LiteBansModule_244", "ip LIKE ?", "SELECT ", " FROM ", "Failed ", " WHERE ", "date", "name", "uuid", "ip", "date", "uuid IS NOT NULL", "__ALL__", "time", "AND ", "active=", " AND(until<1 OR until>?)", "", "", " OR(ipban_wildcard=", " AND active=", " AND ? LIKE ip)", " OR(ipban_wildcard=", "ORDER BY time DESC LIMIT 1", "LIMIT 1", "(ipban=", " AND(ip=?", ")AND((time+", ")>?", "))", "(ipban=", " AND(ip=?", "))", "SELECT * FROM ", " WHERE(uuid=?", "SELECT * FROM ", " WHERE(", "SELECT * FROM ", " WHERE((uuid=? OR", "Database is slow! Pooled connection took ", " seconds to retrieve result from ", "Database is slow! Pooled connection took ", " seconds to retrieve result from ", "UUID: ", ": ", "Player is name-banned: ", " - ", " ID is ", "SELECT COUNT(*) FROM ", "", "WHERE ", "active=", " AND(until<1 OR until>?)", "uuid IS NOT NULL", "AND", " WHERE ", "WHERE", " WHERE ", "1", "SELECT ", " FROM ", "uuid=?", "Failed ", " WHERE ", "uuid,type", "?", "?,", "INSERT INTO ", ")VALUES(", "DELETE FROM ", "uuid=?", "Failed ", " WHERE ", "[CONSOLE]", "[CONSOLE]", "CONSOLE", "#", "SELECT ", " FROM ", " WHERE ", " ORDER BY date DESC LIMIT 1", "[CONSOLE]", "[CONSOLE]", "CONSOLE", "#", "SELECT ", " FROM ", " WHERE ", " ORDER BY date DESC LIMIT ", "{column.SQLiteDriverHandler_4}", "SELECT ", " FROM ", "uuid=?", "Failed ", " WHERE ", "time=?", "SQLiteDriverHandler_4", "SQLiteDriverHandler_4", "Player name \"", "\" length > ", "UUID \"", "\" length > 36", "*", "SELECT ", " FROM ", "name{=?}", "Failed ", " WHERE ", "uuid=?", "ip=?", "LiteBansModule_244", "mysql", "SELECT * FROM ", "Failed to add ", ": ", " - ", "uuid", "ip", "reason", "banned_by_uuid", "#", "banned_by_name", "server_scope", "server_origin", "time", "until", "template", "silent", "ipban", "active", "warned", "SQLiteDriverHandler_4", "UTC", "removed_by_date", "removed_by_uuid", "removed_by_name", "removed_by_reason", "pgsql", "(active={false} OR(until>0 AND ", ">until))", "DELETE FROM ", "uuid=?", "Failed ", " WHERE ", "time>?", "COUNT(*)", "SELECT ", " FROM ", "(uuid=? OR ipban={true} AND ip=?)", "Failed ", " WHERE ", "template=?", "uuid=?", "Failed ", " WHERE ", "template=?", "active=", " AND(until<1 OR until>?)", "time>?", "template", "SELECT ", " FROM ", "(uuid=? OR ipban={true} AND ip=?)", "Failed ", " WHERE ", "uuid=?", "Failed ", " WHERE ", "active=", " AND(until<1 OR until>?)", "time>?", "", "template=? OR ", "] Add ", " from ", " = ", "BaseCoreGenericHandler:", "sort", "00", "01:", "UPDATE ", "active={false}", "DELETE FROM ", "Failed ", " WHERE ", "active={false}", "DROP TABLE ", "DELETE FROM ", "Failed ", " WHERE ", "UPDATE ", "template=255", "UPDATE ", "until=?,reason=?", "SQLiteDriverHandler_4=?", "Failed ", " WHERE ", "active=", " AND(until<1 OR until>?)", "SQLiteDriverHandler_4", "ip", "uuid", "UPDATE ", "active={false},removed_by_date=NOW(),removed_by_uuid=?,removed_by_name=?,removed_by_reason=?", "=?", "Failed ", " WHERE ", "active=", " AND(until<1 OR until>?)", "DELETE FROM ", "SQLiteDriverHandler_4=?", "Failed ", " WHERE ", "UPDATE ", "active={false},removed_by_date=NOW(),removed_by_uuid=?,removed_by_name=?,removed_by_reason=?", "SQLiteDriverHandler_4=?", "Failed ", " WHERE ", " SQLiteDriverHandler_4=", "DELETE FROM ", "banned_by_uuid=?", "Failed ", " WHERE ", "time>?", "UPDATE ", "active={true},removed_by_name=NULL,removed_by_uuid=NULL,removed_by_reason=NULL", "active", "Failed ", " WHERE ", "removed_by_uuid=?", "removed_by_date>?", "UPDATE ", "warned", "uuid=?", "Failed ", " WHERE ", "warned", "UPDATE ", "active={false},removed_by_name='#expired',removed_by_date=NOW()", "active={true}", "Failed ", " WHERE ", "until>0", "until<", "UPDATE ", "ipban={false}", "ipban={true}", "Failed ", " WHERE ", "ipban_wildcard={false}", "(time+", ")<", "Expired ", " entries(until<", "Deadlock ", "UPDATE ", "ip=?", "uuid=?", "Failed ", " WHERE ", "ip=?", "#", "SELECT * FROM ", " WHERE(", "active=", " AND(until<1 OR until>?)", ")AND(", "uuid=?", " OR(ipban=", " AND ", "ip=?)", " OR ", ")AND(server_scope='*' OR server_scope=? OR server_scope=?)", ": ", "Renaming table \"", "\" to \"", "RENAME TABLE ", " TO ", "", "", "warned", " NOT NULL", " BIT", "removed_by_uuid", "", " VARCHAR(", " VARCHAR(", "removed_by_name", "", " VARCHAR(", " VARCHAR(", "removed_by_reason", "", " VARCHAR(", " VARCHAR(", "removed_by_date", "", " TIMESTAMP", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "uuid", " CHARACTER SET ascii COLLATE ascii_general_ci", "", " VARCHAR(", " VARCHAR(", "ip", " CHARACTER SET ascii COLLATE ascii_general_ci", "", " VARCHAR(", " VARCHAR(", "reason", "", " VARCHAR(", " VARCHAR(", "banned_by_uuid", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "banned_by_name", "", " VARCHAR(", " VARCHAR(", "time", " BIGINT NOT NULL", "until", " BIGINT NOT NULL", "template", " DEFAULT 255", "pgsql", "LiteBansModule_244", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "server_scope", "", " VARCHAR(", " VARCHAR(", "server_origin", "", " VARCHAR(", " VARCHAR(", "silent", " NOT NULL", " BIT", "ipban", " NOT NULL", " BIT", "ipban_wildcard", " NOT NULL DEFAULT {false}", " BIT", "active", " NOT NULL", " BIT", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "info", " INT", " NOT NULL", "msg", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "time", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "uuid", "pgsql", " BYTEA NOT NULL", "BINARY", ")NOT NULL", "type", "", "pgsql", "LiteBansModule_244", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "name", "", " VARCHAR(", " VARCHAR(", "uuid", "", " VARCHAR(", " VARCHAR(", "ip", "", " VARCHAR(", " VARCHAR(", "SQLiteDriverHandler_4", "PRIMARY KEY(", "", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "name", "", " VARCHAR(", " VARCHAR(", "uuid", "", " VARCHAR(", " VARCHAR(", "ip", "", " VARCHAR(", " VARCHAR(", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "name", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "uuid", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "SQLiteDriverHandler_4", "PRIMARY KEY(", "build", "SELECT ", " FROM ", "Database build ", " => ", "mysql", "mode", "warned", "*", "SELECT ", " FROM ", "mode<>0", "Failed ", " WHERE ", "mode", "DELETE FROM ", "mode<>0", "Failed ", " WHERE ", "sqlite", "ALTER TABLE ", "mode", "ALTER TABLE ", "warned BIT", "UPDATE ", "warned={true}", "removed_by_uuid", "removed_by_name", "removed_by_date", "removed_by_reason", "template", "server_origin", "server_scope", "ipban_wildcard", "ALTER TABLE ", "accept", "Upgrading database tables.. + ", "Upgrade ", "ALTER TABLE ", "server_scope", "", " VARCHAR(", " VARCHAR(", "UPDATE ", "server_scope='*'", "server_scope", "ALTER TABLE ", "ipban_wildcard", " NOT NULL DEFAULT {false}", " BIT", "UPDATE ", "ipban_wildcard={true}", "ip like '%\\%%'", "Failed ", " WHERE "};
    }
}

