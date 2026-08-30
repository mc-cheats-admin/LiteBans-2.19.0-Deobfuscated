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
implements LiteBansModule_82 {
    public static final NameHandler_2 LiteBansModule_401;
    private final PlatformPlugin LiteBansModule_240;
    private final Connection AsyncBackgroundTask_5;
    private final PunishmentTableService Utf8Handler_2;
    private final BroadcastService g;
    private final ConfigService LiteBansModule_194;
    private static final LiteBansModule_178 BaseCoreGenericHandler;
    public static final int e;
    public static final int GnuSparseMapHandler;
    public static final int LiteBansModule_31;
    public static final int c;
    private static int i;
    public SQLiteDriverHandler_3(@NotNull PlatformPlugin plugin, @NotNull Connection connection) {
        this.LiteBansModule_240 = plugin;
        this.AsyncBackgroundTask_5 = connection;
        this.Utf8Handler_2 = (PunishmentTableService)this.LiteBansModule_240.BaseCoreGenericHandler(PunishmentTableService.class);
        this.g = (BroadcastService)this.LiteBansModule_240.BaseCoreGenericHandler(BroadcastService.class);
        this.LiteBansModule_194 = (ConfigService)this.LiteBansModule_240.BaseCoreGenericHandler(ConfigService.class);
    }

    @Override
    public final PlatformPlugin e() {
        return this.LiteBansModule_240;
    }

    public final BroadcastService c() {
        return this.g;
    }

    public final ConfigService g() {
        return this.LiteBansModule_194;
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
            boolean flag = false;
            long l7 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, kL2, null, false, 6, null);
            l3 = l5 + l7;
        }
        return l3;
    }

    public final LiteBansModule_354 BaseCoreGenericHandler(@NotNull SilentHandler dZ2, boolean flag) {
        String string = "uuid,ip,reason,banned_by_uuid,banned_by_name,time,until,template,server_scope,server_origin,silent,ipban,ipban_wildcard,active" + dZ2.g();
        CharSequence charSequence = string;
        int n = 44;
        boolean flag2 = false;
        CharSequence charSequence2 = charSequence;
        boolean flag3 = false;
        int n2 = 0;
        for (int i = 0; i < charSequence2.length(); ++i) {
            int n3;
            int n4 = n3 = charSequence2.charAt(i);
            boolean flag4 = false;
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
        return LiteBansModule_371.BaseCoreGenericHandler(string, string2);
    }

    @Override
    public void c(@NotNull SilentHandler dZ2) {
        boolean flag;
        String string;
        String string2;
        int n;
        Object object;
        boolean flag2;
        ConfigService configService;
        LiteBansModule_354 jT2 = this.plugin(dZ2, ObjectUtilities.BaseCoreGenericHandler((Object)this.LiteBansModule_194.LiteBansModule_194().ElementsHandler(), (Object)"pgsql"));
        String string3 = (String)jT2.BaseCoreGenericHandler();
        String string4 = (String)jT2.c();
        Object object2 = this.LiteBansModule_194;
        int n2 = 1;
        boolean flag3 = false;
        if (((ConfigService)object2).BaseCoreGenericHandler(n2)) {
            configService = object2;
            flag2 = false;
            configService.BaseCoreGenericHandler((Object)("Created new " + dZ2.ServerSyncService() + " for server:" + LiteBansModule_181.LiteBansModule_194.c(dZ2.m())));
        }
        object2 = this.LiteBansModule_194;
        n2 = 1;
        flag3 = false;
        if (((ConfigService)object2).BaseCoreGenericHandler(n2)) {
            configService = object2;
            flag2 = false;
            configService.BaseCoreGenericHandler((Object)("Adding entry: " + dZ2));
        }
        Object object3 = dZ2;
        flag3 = false;
        object2 = "INSERT INTO " + ((SilentHandler)object3).ServerSyncService().BaseCoreGenericHandler() + '(' + string3 + ")VALUES(" + string4 + ')';
        object3 = this.c((CharSequence)object2);
        flag3 = false;
        SilentHandler dZ3 = dZ2;
        boolean flag4 = false;
        Object object4 = object3;
        Object object5 = new String[5];
        String string5 = dZ3.DatabaseMonitorService();
        object5[0] = string5 != null ? LiteBansModule_242.BaseCoreGenericHandler(string5, 36) : null;
        String string6 = dZ3.PunishmentTableService();
        object5[1] = string6 != null ? LiteBansModule_242.BaseCoreGenericHandler(string6, 45) : null;
        CharSequence charSequence = dZ3.LiteBansModule_31();
        int n3 = 2048;
        boolean flag5 = false;
        object5[2] = LiteBansModule_242.BaseCoreGenericHandler(((Object)charSequence).toString(), n3);
        String string7 = dZ3.e();
        object5[3] = string7 != null ? LiteBansModule_242.BaseCoreGenericHandler(string7, 36) : null;
        String string8 = dZ3.LiteBansModule_433();
        object5[4] = string8 != null ? LiteBansModule_242.BaseCoreGenericHandler(string8, 128) : null;
        boolean flag6 = false;
        Object object6 = object = object4;
        boolean flag7 = false;
        String[] args = object5;
        boolean flag8 = false;
        int n4 = args.length;
        for (n = 0; n < n4; ++n) {
            string = string2 = args[n];
            flag = false;
            ((LiteBansModule_60)object4).BaseCoreGenericHandler(string);
        }
        object4 = object;
        object5 = new long[2];
        object5[0] = (String)dZ3.BroadcastService();
        object5[1] = (String)dZ3.LiteBansModule_401();
        flag6 = false;
        object6 = object = object4;
        flag7 = false;
        args = object5;
        flag8 = false;
        n4 = args.length;
        for (n = 0; n < n4; ++n) {
            String string9;
            String string10 = string9 = args[n];
            boolean bl9 = false;
            ((LiteBansModule_60)object4).BaseCoreGenericHandler((long)string10);
        }
        object4 = ((LiteBansModule_60)object).BaseCoreGenericHandler(dZ3.r());
        object5 = new String[]{LiteBansModule_181.LiteBansModule_194.c(dZ3.m()), LiteBansModule_181.LiteBansModule_194.c(dZ3.GnuSparseMapHandler())};
        flag6 = false;
        object6 = object = object4;
        flag7 = false;
        args = object5;
        flag8 = false;
        n4 = args.length;
        for (n = 0; n < n4; ++n) {
            string = string2 = args[n];
            flag = false;
            ((LiteBansModule_60)object4).BaseCoreGenericHandler(string);
        }
        object4 = object;
        object5 = new boolean[4];
        object5[0] = (String)dZ3.AsyncBackgroundTask_5();
        object5[1] = (String)dZ3.LiteBansModule_240();
        object5[2] = (String)dZ3.i();
        object5[3] = (String)dZ3.AsyncBackgroundTask_22();
        flag6 = false;
        object6 = object = object4;
        flag7 = false;
        args = object5;
        flag8 = false;
        n4 = args.length;
        for (n = 0; n < n4; ++n) {
            String string11;
            String string12 = string11 = args[n];
            flag = false;
            ((LiteBansModule_60)object4).BaseCoreGenericHandler((boolean)string12);
        }
        object4 = object;
        object5 = object4;
        flag6 = false;
        if (dZ3.ServerSyncService() == BanHandler.c) {
            ((LiteBansModule_60)object3).BaseCoreGenericHandler(dZ3.c());
        }
        LiteBansModule_184.LiteBansModule_31((LiteBansModule_60)object4);
    }

    @Override
    public LiteBansModule_297 BaseCoreGenericHandler(@NotNull LiteBansModule_297 iA2, boolean flag) {
        LiteBansModule_297 iA3;
        LiteBansModule_297 iA4 = iA3 = iA2;
        boolean flag2 = false;
        AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, iA4.BaseCoreGenericHandler(), iA4.LiteBansModule_31(), iA4.i(), flag, false, 16, null);
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
        Object object = LiteBansModule_401;
        String[] args = this;
        boolean flag3 = false;
        int n = string5.length();
        byte by2 = args.g().LiteBansModule_194().be();
        boolean flag4 = false;
        if (!(ObjectUtilities.BaseCoreGenericHandler(n, by2 & 0xFF) <= 0)) {
            by2 = 0;
            String string8 = "Player name \"" + string5 + "\" length > " + LiteBansModule_283.LiteBansModule_31(args.g().LiteBansModule_194().be());
            throw new IllegalArgumentException(string8.toString());
        }
        if (!(string2 == null || string2.length() <= 36)) {
            by2 = 0;
            String string9 = "UUID \"" + string2 + "\" length > 36";
            throw new IllegalArgumentException(string9.toString());
        }
        try {
            Object object2;
            boolean flag5;
            int n2;
            String[] filteredArgs;
            int n3;
            int n4;
            Object object3;
            if (this.plugin(string5, string2, string7)) {
                if (flag && !StringUtilities.c((CharSequence)string7, '#', false, 2, null) && string2 != null) {
                    CharSequence charSequence;
                    int n5;
                    object = BansHandler_2.g;
                    boolean flag6 = false;
                    object = SQLiteDriverHandler.c(SQLiteDriverHandler.e("UPDATE " + object), "date=CURRENT_TIMESTAMP");
                    String[] parsedArgs = (String[])"ip=?";
                    SQLiteDriverHandler_3 gZ2 = this;
                    flag3 = false;
                    Object object4 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object), parsedArgs};
                    by2 = 0;
                    CharSequence[] charSequenceArray = object4;
                    boolean flag7 = false;
                    int n6 = charSequenceArray.length;
                    for (n5 = 0; n5 < n6; ++n5) {
                        CharSequence charSequence2;
                        charSequence = charSequence2 = charSequenceArray[n5];
                        boolean flag8 = false;
                        if (charSequence.length() > 0) continue;
                        String string10 = "Failed ";
                        throw new IllegalArgumentException(string10.toString());
                    }
                    object = gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object) + " WHERE " + parsedArgs), "uuid=?"), "name=?")));
                    parsedArgs = new String[]{string7, string2, string5};
                    flag3 = false;
                    Object object5 = object4 = object;
                    boolean bl9 = false;
                    String[] cmdArgs = parsedArgs;
                    n5 = 0;
                    int n7 = cmdArgs.length;
                    for (n6 = 0; n6 < n7; ++n6) {
                        CharSequence charSequence3 = charSequence = cmdArgs[n6];
                        boolean bl10 = false;
                        ((LiteBansModule_60)object).BaseCoreGenericHandler((String)charSequence3);
                    }
                    LiteBansModule_184.LiteBansModule_31((LiteBansModule_60)object4);
                }
                return;
            }
            if (this.LiteBansModule_194.LiteBansModule_194().LiteBansModule_3() && flag2) {
                CharSequence charSequence;
                object = BansHandler_2.g;
                boolean bl11 = false;
                object = SQLiteDriverHandler.e("DELETE FROM " + object);
                args = m[24];
                object3 = this;
                flag3 = false;
                Object object6 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object), args};
                by2 = 0;
                CharSequence[] charSequenceArray = object6;
                boolean bl12 = false;
                n4 = charSequenceArray.length;
                for (n3 = 0; n3 < n4; ++n3) {
                    CharSequence charSequence4;
                    charSequence = charSequence4 = charSequenceArray[n3];
                    boolean bl13 = false;
                    if (charSequence.length() > 0) continue;
                    String string11 = m[25];
                    throw new IllegalArgumentException(string11.toString());
                }
                object = ((SQLiteDriverHandler_3)object3).c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object) + m[26] + args), m[27])));
                args = new String[]{string5, string2};
                flag3 = false;
                Object object7 = object6 = object;
                flag4 = false;
                filteredArgs = args;
                n3 = 0;
                n2 = filteredArgs.length;
                for (n4 = 0; n4 < n2; ++n4) {
                    CharSequence charSequence5 = charSequence = filteredArgs[n4];
                    flag5 = false;
                    ((LiteBansModule_60)object).BaseCoreGenericHandler((String)charSequence5);
                }
                LiteBansModule_184.LiteBansModule_31((LiteBansModule_60)object6);
            }
            object = BansHandler_2.g;
            args = m[28];
            object3 = this;
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
                Iterable iterable = new LiteBansModule_166(0, n8);
                boolean bl14 = false;
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    n2 = n4 = ((LiteBansModule_290)iterator).LiteBansModule_31();
                    boolean bl15 = false;
                    stringBuilder.append(m[30]);
                }
                stringArray5 = StringUtilities.LiteBansModule_31(stringBuilder.toString(), 1);
            }
            Object object8 = object;
            boolean bl16 = false;
            object = ((SQLiteDriverHandler_3)object3).c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(m[31] + object8 + '(' + args + m[32] + (CharSequence)stringArray5 + ')')));
            int n9 = 0;
            Object object9 = object;
            stringArray5 = object9;
            boolean bl17 = false;
            Object object10 = object;
            String[] stringArray6 = new String[]{string5, string2, string7};
            boolean bl18 = false;
            Object object11 = object2 = object10;
            boolean bl19 = false;
            String[] stringArray7 = stringArray6;
            flag5 = false;
            int n10 = stringArray7.length;
            for (n8 = 0; n8 < n10; ++n8) {
                String string12;
                String string13 = string12 = stringArray7[n8];
                boolean bl20 = false;
                ((LiteBansModule_60)object10).BaseCoreGenericHandler(string13);
            }
            LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)object9);
            object = this.LiteBansModule_194;
            n9 = 1;
            boolean bl21 = false;
            if (((ConfigService)object).BaseCoreGenericHandler(n9)) {
                object3 = object;
                boolean bl22 = false;
                ((ConfigService)object3).BaseCoreGenericHandler((Object)(m[33] + string5 + ':' + string2 + ':' + string7 + ']'));
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

    public final Statement LiteBansModule_194() {
        return this.AsyncBackgroundTask_5.createStatement();
    }

    @Override
    public int BaseCoreGenericHandler(@NotNull DescHandler hc2, @NotNull BanHandler a_2) {
        ResultSet resultSet = hc2.BaseCoreGenericHandler(a_2, (CharSequence)m[35]);
        int n = 1;
        boolean flag = false;
        Integer n2 = resultSet.next() ? Integer.valueOf(resultSet.getInt(n)) : null;
        return n2 != null ? n2 : 0;
    }

    @Override
    public List BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, @NotNull BanHandler a_2, @Nullable String string3, boolean flag, int n) {
        CharSequence charSequence;
        Object object;
        LiteBansModule_144 dy_02 = new LiteBansModule_144();
        dy_02.BaseCoreGenericHandler = LiteBansModule_401.c();
        long l3 = this.LiteBansModule_194.LiteBansModule_194().LiteBansModule_43();
        String string4 = m[36];
        if (string2 == null || StringUtilities.BaseCoreGenericHandler((CharSequence)string2, '#', false, 2, null)) {
            dy_02.BaseCoreGenericHandler = LiteBansModule_401.BaseCoreGenericHandler((LiteBansModule_178)dy_02.BaseCoreGenericHandler, arg_0 -> SQLiteDriverHandler_3.LiteBansModule_31(string, arg_0));
        } else {
            object = m[37];
            charSequence = m[38];
            if (l3 > 0L) {
                string4 = string4 + m[39] + (String)object + m[40] + l3 + m[41] + charSequence + m[42];
                dy_02.BaseCoreGenericHandler = LiteBansModule_401.BaseCoreGenericHandler((LiteBansModule_178)dy_02.BaseCoreGenericHandler, arg_0 -> SQLiteDriverHandler_3.c(string, string2, arg_0));
            } else {
                string4 = string4 + m[43] + (String)object + m[44];
                dy_02.BaseCoreGenericHandler = LiteBansModule_401.BaseCoreGenericHandler((LiteBansModule_178)dy_02.BaseCoreGenericHandler, arg_0 -> SQLiteDriverHandler_3.LiteBansModule_31(string, string2, arg_0));
            }
        }
        object = this.LiteBansModule_194.AsyncBackgroundTask_21().BaseCoreGenericHandler(a_2);
        if (!((Collection)object).isEmpty()) {
            string4 = '(' + string4 + m[45] + CollectionUtilities.BaseCoreGenericHandler((Iterable)object, m[46], null, null, 0, null, null, 62, null) + ')';
        }
        String string5 = string4;
        UuidHandler jR2 = UuidHandler.c;
        LiteBansModule_82 ch2 = this;
        boolean flag2 = false;
        AllHandler jJ2 = new AllHandler(ch2.e(), string3);
        charSequence = new TimeHandler(this, flag, n, dy_02, string5, jR2, jJ2);
        return this.LiteBansModule_31(DescHandler.BaseCoreGenericHandler((DescHandler)charSequence, a_2, null, 2, null), a_2);
    }

    @Override
    public List BaseCoreGenericHandler(@NotNull String string, @NotNull BanHandler a_2, @NotNull String string2, int n) {
        LiteBansModule_121 df_02 = DescHandler.GnuSparseMapHandler;
        UuidHandler jR2 = UuidHandler.e;
        DescHandler hc2 = LiteBansModule_121.BaseCoreGenericHandler(df_02, this, string, string2, jR2, false, m[47], false, n, null, 168, null);
        return this.LiteBansModule_31(DescHandler.BaseCoreGenericHandler(hc2, a_2, null, 2, null), a_2);
    }

    @Override
    public boolean LiteBansModule_31(@NotNull BansHandler_2 kL2, @NotNull String string, boolean flag) {
        boolean flag2;
        if (flag) {
            flag2 = LiteBansModule_184.AsyncBackgroundTask_5(this.c((CharSequence)(m[48] + kL2 + m[49] + string + m[50]))).next();
        } else {
            String string2;
            DatabaseMetaData databaseMetaData = this.AsyncBackgroundTask_5();
            String string3 = BansHandler_2.BaseCoreGenericHandler(kL2, null, false, 3, null);
            DatabaseMonitorService w2 = this.AsyncBackgroundTask_5();
            boolean flag3 = false;
            ConfigService configService = (ConfigService)w2.BaseCoreGenericHandler.BaseCoreGenericHandler(ConfigService.class);
            if (ObjectUtilities.BaseCoreGenericHandler((Object)configService.LiteBansModule_194().ElementsHandler(), (Object)m[51])) {
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
        NameHandler_3 jp_02 = HexEncodingHelper.BaseCoreGenericHandler.Utf8Handler_2(string2);
        String string3 = jp_02.LiteBansModule_31();
        String string4 = LiteBansModule_401.BaseCoreGenericHandler(this, string3);
        if (jp_02.AsyncBackgroundTask_5() == 2 && StringUtilities.c((CharSequence)string2, '*', false, 2, null)) {
            string2 = StringUtilities.BaseCoreGenericHandler(string2, '*', '%', false, 4, null);
            string4 = m[52];
        }
        Object object = BansHandler_2.g;
        CharSequence charSequence = this.g.Utf8Handler_2();
        boolean flag = false;
        object = SQLiteDriverHandler.e(m[53] + charSequence + m[54] + object);
        SQLiteDriverHandler_3 gZ2 = this;
        boolean flag2 = false;
        CharSequence[] charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object), string4};
        boolean flag3 = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean flag4 = false;
        int n2 = charSequenceArray2.length;
        for (int i = 0; i < n2; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean flag5 = false;
            if (charSequence3.length() > 0) continue;
            String string5 = m[55];
            throw new IllegalArgumentException(string5.toString());
        }
        ResultSet resultSet = LiteBansModule_184.AsyncBackgroundTask_5(gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object) + m[56] + (CharSequence)string4), m[57]), (Number)n))).BaseCoreGenericHandler(string2));
        object = new ArrayList(4);
        while (resultSet.next()) {
            ((Collection)object).add(this.plugin(resultSet, true, this.LiteBansModule_194.LiteBansModule_194().ElementsHandler()));
        }
        return (List)object;
    }

    @Override
    public LiteBansModule_297 BaseCoreGenericHandler(@NotNull ResultSet resultSet, boolean flag, @Nullable String string) {
        return new LiteBansModule_297(resultSet.getString(m[58]), HexEncodingHelper.LiteBansModule_194(resultSet.getString(m[59])), resultSet.getString(m[60]), this.g.BaseCoreGenericHandler(resultSet, m[61], flag, string));
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
        return AllHandler_3.BaseCoreGenericHandler(this, dZ2.DatabaseMonitorService(), dZ2.LiteBansModule_240() ? dZ2.PunishmentTableService() : null, dZ2.ServerSyncService(), dZ2.m(), flag, false, 32, null);
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
        Object object;
        block13: {
            boolean flag3;
            Object object2;
            Object object3;
            boolean flag4;
            boolean flag5;
            AllHandler jJ2;
            boolean flag6;
            boolean flag7;
            Object object4;
            String string4 = HexEncodingHelper.BaseCoreGenericHandler.g(string);
            AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, false, 1, null);
            if (flag2) {
                object4 = this;
                flag7 = true;
                flag6 = false;
                jJ2 = new AllHandler_2(object4.e(), string3, flag7);
            } else {
                object4 = this;
                flag7 = false;
                jJ2 = new AllHandler(object4.e(), string3);
            }
            AllHandler jJ3 = jJ2;
            Object object5 = this;
            flag6 = false;
            object4 = m[65] + (m[66] + ((SQLiteDriverHandler_3)object5).c().LiteBansModule_31() + m[67]);
            object5 = m[68];
            String string5 = m[69];
            if (a_2 != BanHandler.c && a_2 != BanHandler.g && !this.LiteBansModule_194.LiteBansModule_194().aE()) {
                object5 = m[70] + this.g.LiteBansModule_31() + m[71] + this.g.LiteBansModule_31() + m[72];
                string5 = m[73] + this.g.LiteBansModule_31() + ')';
            }
            boolean flag8 = string4 == null || StringUtilities.BaseCoreGenericHandler((CharSequence)string4, '#', false, 2, null);
            boolean bl9 = flag5 = string2 == null || StringUtilities.BaseCoreGenericHandler((CharSequence)string2, '#', false, 2, null);
            if (flag5 && flag8) {
                return null;
            }
            String string6 = flag ? m[74] : m[75];
            long l7 = this.LiteBansModule_194.LiteBansModule_194().LiteBansModule_43();
            String string7 = l7 > 0L ? m[76] + this.g.LiteBansModule_31() + m[77] + (String)object5 + m[78] + l7 + m[79] + string5 + m[80] : m[81] + this.g.LiteBansModule_31() + m[82] + (String)object5 + m[83];
            String string8 = (flag5 ? m[84] + a_2.BaseCoreGenericHandler() + m[85] + jJ3 + ')' + (String)object4 : (flag8 ? m[86] + a_2.BaseCoreGenericHandler() + m[87] + string7 + jJ3 + ')' + (String)object4 : m[88] + a_2.BaseCoreGenericHandler() + m[89] + string7 + ')' + jJ3 + ')' + (String)object4)) + string6;
            Object object6 = this.LiteBansModule_194;
            boolean bl10 = false;
            if (((ConfigService)object6).g()) {
                ConfigService configService = object6;
                flag4 = false;
                configService.BaseCoreGenericHandler((Object)string8);
            }
            object6 = this.c((CharSequence)string8);
            if (!flag8) {
                Object object7 = object6;
                flag4 = false;
                object2 = object3 = object7;
                flag3 = false;
                ((LiteBansModule_60)object7).BaseCoreGenericHandler(string4);
            }
            if (!flag5) {
                ((LiteBansModule_60)object6).BaseCoreGenericHandler(string2);
                if (!StringUtilities.LiteBansModule_31((CharSequence)object5)) {
                    ((LiteBansModule_60)object6).BaseCoreGenericHandler(string2);
                }
                if (l7 > 0L) {
                    LiteBansModule_184.BaseCoreGenericHandler((LiteBansModule_60)object6);
                }
            }
            object = object6;
            flag4 = false;
            object2 = object3 = object;
            flag3 = false;
            jJ3.BaseCoreGenericHandler((LiteBansModule_60)object2);
            LiteBansModule_184.BaseCoreGenericHandler((LiteBansModule_60)object6);
            object = null;
            l5 = System.nanoTime();
            try {
                SilentHandler dZ2;
                object2 = LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)object6);
                if (!object2.next() || !(dZ2 = this.plugin((ResultSet)object2, a_2)).BaseCoreGenericHandler(string4, string2, DatabaseMonitorService.BaseCoreGenericHandler(this.AsyncBackgroundTask_5(), false, 1, null))) break block13;
                object = dZ2;
            }
            catch (Throwable throwable) {
                long l8 = System.nanoTime() - l5;
                double d11 = (double)l8 / 1.0E9;
                if (d11 > 4.0) {
                    this.LiteBansModule_240.getLogger().warning(m[92] + LiteBansModule_287.BaseCoreGenericHandler(d11) + m[93]);
                }
                throw throwable;
            }
        }
        if ((d10 = (double)(l3 = System.nanoTime() - l5) / 1.0E9) > 4.0) {
            this.LiteBansModule_240.getLogger().warning(m[90] + LiteBansModule_287.BaseCoreGenericHandler(d10) + m[91]);
        }
        return object;
    }

    @Override
    public SilentHandler BaseCoreGenericHandler(@NotNull String string, @Nullable String string2, @Nullable String string3, @NotNull BanHandler a_2) {
        List list = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, string, 0, 2, null);
        if (list.isEmpty()) {
            return null;
        }
        for (LiteBansModule_297 iA2 : list) {
            String string4;
            if (iA2.LiteBansModule_31() == null || ObjectUtilities.BaseCoreGenericHandler((Object)iA2.LiteBansModule_31(), (Object)string2)) continue;
            this.LiteBansModule_194.BaseCoreGenericHandler(10, (Object)(m[94] + iA2.LiteBansModule_31()));
            SilentHandler dZ2 = AllHandler_3.BaseCoreGenericHandler(this, iA2.LiteBansModule_31(), null, a_2, string3, false, false, 32, null);
            StringBuilder stringBuilder = new StringBuilder();
            BanHandler a_3 = a_2;
            boolean flag = false;
            String string5 = a_3.toString();
            if (((CharSequence)string5).length() > 0) {
                char c = string5.charAt(0);
                StringBuilder stringBuilder2 = new StringBuilder();
                int n = 0;
                String string6 = string5;
                n = 1;
                string4 = stringBuilder2.append((Object)(Character.isLowerCase(c) ? LiteBansModule_338.BaseCoreGenericHandler(c, Locale.getDefault()) : String.valueOf(c))).append(string6.substring(n)).toString();
            } else {
                string4 = string5;
            }
            this.LiteBansModule_194.BaseCoreGenericHandler(10, (Object)stringBuilder.append(string4).append(m[95]).append(dZ2).toString());
            if (dZ2 == null) continue;
            this.LiteBansModule_240.getLogger().info(m[96] + string + m[97] + a_2 + m[98] + dZ2.BaseCoreGenericHandler());
            return dZ2;
        }
        return null;
    }

    @Override
    public List BaseCoreGenericHandler(@NotNull String string, @Nullable String string2, @Nullable String string3, @NotNull BanHandler a_2, boolean flag) {
        Iterable iterable;
        List list = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, string, 0, 2, null);
        if (list.isEmpty()) {
            return CollectionUtilities.e();
        }
        List list2 = new ArrayList();
        for (LiteBansModule_297 iA2 : list) {
            if (iA2.LiteBansModule_31() == null || ObjectUtilities.BaseCoreGenericHandler((Object)iA2.LiteBansModule_31(), (Object)string2) || (iterable = this.plugin(iA2.LiteBansModule_31(), null, a_2, string3, true, 0)).isEmpty()) continue;
            list2.addAll((Collection)iterable);
        }
        if (flag) {
            Iterable iterable2 = list2;
            boolean flag2 = false;
            iterable = iterable2;
            Collection collection = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable2, 10));
            boolean flag3 = false;
            Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                SilentHandler dZ2 = (SilentHandler)t2;
                Collection collection2 = collection;
                boolean flag4 = false;
                collection2.add(new SilentHandler(a_2, string2, dZ2.PunishmentTableService(), dZ2.LiteBansModule_31(), dZ2.e(), dZ2.LiteBansModule_433(), dZ2.m(), dZ2.GnuSparseMapHandler(), dZ2.BroadcastService(), dZ2.LiteBansModule_401(), dZ2.r(), dZ2.AsyncBackgroundTask_5(), dZ2.LiteBansModule_240(), dZ2.AsyncBackgroundTask_22(), dZ2.BaseCoreGenericHandler(), null));
            }
            return CollectionUtilities.BaseCoreGenericHandler((Collection)((List)collection));
        }
        return list2;
    }

    @Override
    public SilentHandler BaseCoreGenericHandler(@NotNull String string, @NotNull BanHandler a_2, @NotNull String string2, boolean flag) {
        if (!HexEncodingHelper.BaseCoreGenericHandler.AsyncBackgroundTask_5(string)) {
            return null;
        }
        DescHandler hc2 = LiteBansModule_121.BaseCoreGenericHandler(DescHandler.GnuSparseMapHandler, this, string, string2, UuidHandler.AsyncBackgroundTask_5, flag, null, false, null, null, 240, null);
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
        Object object = this;
        boolean flag2 = true;
        boolean flag3 = false;
        AllHandler_2 jy2 = new AllHandler_2(object.e(), string, flag2);
        object = m[100];
        if (flag) {
            SQLiteDriverHandler_3 gZ2 = this;
            flag3 = false;
            object = m[101] + (m[102] + gZ2.c().LiteBansModule_31() + m[103]);
        }
        LiteBansModule_178 eo_02 = ((CharSequence)object).length() == 0 ? LiteBansModule_401.c() : LiteBansModule_401.BaseCoreGenericHandler(SQLiteDriverHandler_3::BaseCoreGenericHandler);
        NameHandler_2 dQ2 = LiteBansModule_401;
        String string3 = m[104];
        Object object2 = m[105];
        boolean flag4 = false;
        String string4 = ((CharSequence)object).length() == 0 ? m[106] + string3 : (!StringUtilities.BaseCoreGenericHandler((CharSequence)object, (CharSequence)m[107], false, 2, null) ? m[108] + (String)object + ' ' + (String)object2 + ' ' + string3 : (String)object + ' ' + (String)object2 + ' ' + string3);
        object = string4;
        if (((CharSequence)object).length() > 0) {
            string2 = string2 + ' ' + (String)object;
        }
        string2 = string2 + jy2;
        eo_02 = LiteBansModule_401.BaseCoreGenericHandler(eo_02, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(jy2, arg_0));
        object2 = LiteBansModule_184.BaseCoreGenericHandler(this.c((CharSequence)string2), eo_02);
        int n = 1;
        flag4 = false;
        Long l3 = object2.next() ? Long.valueOf(object2.getLong(n)) : null;
        return l3 != null ? l3 : 0L;
    }

    @Override
    public boolean BaseCoreGenericHandler(@NotNull UUID uUID, @NotNull BanHandler a_2) {
        CharSequence charSequence = BansHandler_2.LiteBansModule_240;
        CharSequence charSequence2 = m[109];
        boolean flag = false;
        charSequence = SQLiteDriverHandler.e(m[110] + charSequence2 + m[111] + charSequence);
        charSequence2 = m[112];
        SQLiteDriverHandler_3 gZ2 = this;
        flag = false;
        CharSequence[] charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)charSequence), charSequence2};
        boolean flag2 = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean flag3 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence3;
            CharSequence charSequence4 = charSequence3 = charSequenceArray2[i];
            boolean flag4 = false;
            if (charSequence4.length() > 0) continue;
            String string = m[113];
            throw new IllegalArgumentException(string.toString());
        }
        return LiteBansModule_184.c(gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)charSequence) + m[114] + charSequence2))).BaseCoreGenericHandler(uUID)).next();
    }

    @Override
    public ResultSet BaseCoreGenericHandler(@NotNull UUID uUID, int n) {
        char c;
        int n2;
        BansHandler_2 kL2 = BansHandler_2.LiteBansModule_240;
        CharSequence charSequence = m[115];
        SQLiteDriverHandler_3 gZ2 = this;
        boolean flag = false;
        CharSequence charSequence2 = charSequence;
        char c10 = ',';
        boolean flag2 = false;
        CharSequence charSequence3 = charSequence2;
        boolean flag3 = false;
        int n3 = 0;
        for (n2 = 0; n2 < charSequence3.length(); ++n2) {
            char c11 = c = charSequence3.charAt(n2);
            boolean flag4 = false;
            if (!(c11 == c10)) continue;
            ++n3;
        }
        int n4 = n3;
        charSequence2 = m[116];
        if (n4 > 0) {
            StringBuilder stringBuilder = new StringBuilder(n4 * 2);
            Iterable iterable = new LiteBansModule_166(0, n4);
            boolean flag5 = false;
            Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                n2 = n3 = ((LiteBansModule_290)iterator).LiteBansModule_31();
                c = '\u0000';
                stringBuilder.append(m[117]);
            }
            charSequence2 = StringUtilities.LiteBansModule_31(stringBuilder.toString(), 1);
        }
        BansHandler_2 kL3 = kL2;
        flag2 = false;
        return LiteBansModule_184.AsyncBackgroundTask_5(gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(m[118] + kL3 + '(' + charSequence + m[119] + charSequence2 + ')'))).BaseCoreGenericHandler(uUID).BaseCoreGenericHandler(n));
    }

    @Override
    public ResultSet BaseCoreGenericHandler(@NotNull UUID uUID) {
        CharSequence charSequence = BansHandler_2.LiteBansModule_240;
        boolean flag = false;
        charSequence = SQLiteDriverHandler.e(m[120] + charSequence);
        CharSequence charSequence2 = m[121];
        SQLiteDriverHandler_3 gZ2 = this;
        boolean flag2 = false;
        CharSequence[] charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)charSequence), charSequence2};
        boolean flag3 = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean flag4 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence3;
            CharSequence charSequence4 = charSequence3 = charSequenceArray2[i];
            boolean flag5 = false;
            if (charSequence4.length() > 0) continue;
            String string = m[122];
            throw new IllegalArgumentException(string.toString());
        }
        return LiteBansModule_184.AsyncBackgroundTask_5(gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)charSequence) + m[123] + charSequence2))).BaseCoreGenericHandler(uUID));
    }

    @Override
    public List BaseCoreGenericHandler(@NotNull String string) {
        Object object = string;
        boolean flag = false;
        if (HexEncodingHelper.BaseCoreGenericHandler.i((String)object)) {
            return AllHandler_3.LiteBansModule_31(this, string, 0, 2, null);
        }
        object = this.c(string);
        return object != null ? AllHandler_3.LiteBansModule_31(this, ((LiteBansModule_297)object).LiteBansModule_31(), 0, 2, null) : CollectionUtilities.e();
    }

    @Override
    public LiteBansModule_297 c(@Nullable String string) {
        Object object;
        boolean flag;
        Object object2;
        Object object3;
        Object object4;
        if (string == null) {
            return null;
        }
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)m[124])) {
            return new LiteBansModule_297(m[125], m[126], m[127], null, 8, null);
        }
        NameHandler_3 jp_02 = HexEncodingHelper.BaseCoreGenericHandler.Utf8Handler_2(string);
        String string2 = jp_02.LiteBansModule_31();
        String string3 = LiteBansModule_401.BaseCoreGenericHandler(this, string2);
        AsyncBackgroundTask_21 s2 = (AsyncBackgroundTask_21)this.LiteBansModule_240.BaseCoreGenericHandler(AsyncBackgroundTask_21.class);
        if (!((Collection)s2.BaseCoreGenericHandler()).isEmpty() && jp_02.AsyncBackgroundTask_5() == 0 || jp_02.AsyncBackgroundTask_5() == 1) {
            Object v0;
            block5: {
                object4 = s2.BaseCoreGenericHandler();
                Iterator iterator = object4.iterator();
                while (iterator.hasNext()) {
                    object3 = iterator.next();
                    object2 = (LiteBansModule_95)object3;
                    flag = false;
                    if (!(ObjectUtilities.BaseCoreGenericHandler((Object)((LiteBansModule_95)object2).c(), (Object)string) || ObjectUtilities.BaseCoreGenericHandler((Object)((LiteBansModule_95)object2).g(), (Object)string))) continue;
                    v0 = object3;
                    break block5;
                }
                v0 = null;
            }
            object = v0;
            if (object != null) {
                return new LiteBansModule_297(((LiteBansModule_95)object).c(), ((LiteBansModule_95)object).g(), ((LiteBansModule_95)object).LiteBansModule_31(), null, 8, null);
            }
        }
        LiteBansModule_60 bT2 = this.c((CharSequence)(m[128] + this.g.Utf8Handler_2() + m[129] + BansHandler_2.g + m[130] + string3 + m[131]));
        object4 = jp_02.BaseCoreGenericHandler();
        boolean flag2 = false;
        object3 = bT2;
        object2 = object3;
        flag = false;
        bT2.BaseCoreGenericHandler((String)object4);
        object = LiteBansModule_184.AsyncBackgroundTask_5(object3);
        return object.next() ? this.plugin((ResultSet)object, true, this.LiteBansModule_194.LiteBansModule_194().ElementsHandler()) : null;
    }

    @Override
    public List LiteBansModule_31(@Nullable String string, int n) {
        LiteBansModule_60 bT2;
        if (string == null) {
            return CollectionUtilities.e();
        }
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)m[132])) {
            return CollectionUtilities.BaseCoreGenericHandler(new LiteBansModule_297(m[133], m[134], m[135], null, 8, null));
        }
        NameHandler_3 jp_02 = HexEncodingHelper.BaseCoreGenericHandler.Utf8Handler_2(string);
        String string2 = jp_02.LiteBansModule_31();
        String string3 = LiteBansModule_401.BaseCoreGenericHandler(this, string2);
        Object object = this.c((CharSequence)(m[136] + this.g.Utf8Handler_2() + m[137] + BansHandler_2.g + m[138] + string3 + m[139] + n));
        Object object2 = jp_02.BaseCoreGenericHandler();
        boolean flag = false;
        LiteBansModule_60 bT3 = bT2 = object;
        boolean flag2 = false;
        ((LiteBansModule_60)object).BaseCoreGenericHandler((String)object2);
        ResultSet resultSet = LiteBansModule_184.AsyncBackgroundTask_5(bT2);
        object = new ArrayList();
        object2 = new ArrayList();
        while (resultSet.next()) {
            LiteBansModule_297 iA2 = this.plugin(resultSet, true, this.LiteBansModule_194.LiteBansModule_194().ElementsHandler());
            if (iA2.LiteBansModule_31() == null || ((ArrayList)object).contains(iA2.LiteBansModule_31())) continue;
            ((Collection)object).add(iA2.LiteBansModule_31());
            ((Collection)object2).add(iA2);
        }
        return (List)object2;
    }

    @Override
    public long LiteBansModule_31(@NotNull SilentHandler dZ2) {
        SilentHandler dZ3 = dZ2;
        boolean flag = false;
        Object object = dZ3;
        boolean flag2 = false;
        object = ((SilentHandler)object).ServerSyncService().BaseCoreGenericHandler();
        CharSequence charSequence = m[140];
        boolean flag3 = false;
        object = SQLiteDriverHandler.e(m[141] + charSequence + m[142] + object);
        charSequence = m[143];
        SQLiteDriverHandler_3 gZ2 = this;
        flag3 = false;
        CharSequence[] charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object), charSequence};
        boolean flag4 = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean flag5 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean flag6 = false;
            if (charSequence3.length() > 0) continue;
            String string = m[144];
            throw new IllegalArgumentException(string.toString());
        }
        object = LiteBansModule_184.AsyncBackgroundTask_5(gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object) + m[145] + charSequence), m[146]), m[147]), (Number)1))).BaseCoreGenericHandler(dZ3.DatabaseMonitorService()).BaseCoreGenericHandler(dZ3.BroadcastService()));
        charSequence = m[148];
        flag3 = false;
        Long l3 = object.next() ? Long.valueOf(object.getLong((String)charSequence)) : null;
        return l3 != null ? l3 : 0L;
    }

    @Override
    public boolean BaseCoreGenericHandler(@Nullable String v1, @Nullable String v2, @NotNull String v3) {
        var4_4 = SQLiteDriverHandler_3.LiteBansModule_401;
        var5_5 = this;
        var6_6 = false;
        if (v1 == null) ** GOTO lbl-1000
        var7_7 = v1.length();
        var8_9 = var5_5.g().LiteBansModule_194().be();
        var9_13 = false;
        if (ObjectUtilities.BaseCoreGenericHandler(var7_7, var8_9 & 255) <= 0) lbl-1000:
        // 2 sources

        {
            v0 = true;
        } else {
            v0 = false;
        }
        if (!v0) {
            var8_9 = 0;
            var8_10 = SQLiteDriverHandler_3.m[149] + v1 + SQLiteDriverHandler_3.m[150] + LiteBansModule_283.LiteBansModule_31(var5_5.g().LiteBansModule_194().be());
            throw new IllegalArgumentException(var8_10.toString());
        }
        if (!(v2 == null || v2.length() <= 36)) {
            var8_9 = 0;
            var8_11 = SQLiteDriverHandler_3.m[151] + v2 + SQLiteDriverHandler_3.m[152];
            throw new IllegalArgumentException(var8_11.toString());
        }
        var4_4 = BansHandler_2.g;
        var5_5 = SQLiteDriverHandler_3.m[153];
        var6_6 = false;
        var4_4 = SQLiteDriverHandler.e(SQLiteDriverHandler_3.m[154] + var5_5 + SQLiteDriverHandler_3.m[155] + var4_4);
        var5_5 = SQLiteDriverHandler_3.m[156];
        var23_16 = this;
        var6_6 = false;
        var7_8 /* !! */  = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)var4_4), var5_5};
        var8_9 = 0;
        var9_14 = var7_8 /* !! */ ;
        var10_17 = false;
        var12_21 = var9_14.length;
        for (var11_19 = 0; var11_19 < var12_21; ++var11_19) {
            var14_23 = var13_22 = var9_14[var11_19];
            var15_24 = false;
            if (var14_23.length() > 0) continue;
            var16_25 = SQLiteDriverHandler_3.m[157];
            throw new IllegalArgumentException(var16_25.toString());
        }
        var4_4 = var23_16.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)var4_4) + SQLiteDriverHandler_3.m[158] + var5_5), SQLiteDriverHandler_3.m[159]), SQLiteDriverHandler_3.m[160]), (Number)1)));
        var5_5 = HexEncodingHelper.BaseCoreGenericHandler.g(v2);
        var6_6 = false;
        var8_12 /* !! */  = var7_8 /* !! */  = var4_4;
        var9_15 = false;
        var10_18 = var4_4;
        var11_20 = new String[]{v1, var5_5, v3};
        var12_21 = 0;
        var14_23 = var13_22 = var10_18;
        var15_24 = false;
        var16_26 = var11_20;
        var17_27 = false;
        var19_29 = var16_26.length;
        for (var18_28 = 0; var18_28 < var19_29; ++var18_28) {
            var21_31 = var20_30 = var16_26[var18_28];
            var22_32 = false;
            var10_18.BaseCoreGenericHandler(var21_31);
        }
        return LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)var7_8 /* !! */ ).next();
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
                boolean flag4 = false;
                boolean flag5 = flag2 = charSequence == BansHandler_2.g;
                if (!flag) break block24;
                charSequence = kL2;
                flag4 = false;
                if (charSequence == BansHandler_2.c) break block25;
                charSequence = kL2;
                flag4 = false;
                if (!(charSequence == BansHandler_2.LiteBansModule_194) && kL2 != BansHandler_2.i) break block24;
            }
            return;
        }
        charSequence = flag ? m[161] : m[162];
        String string = BansHandler_2.BaseCoreGenericHandler(kL2, null, flag, 1, null);
        AutoCloseable autoCloseable = connection.prepareStatement(m[163] + string);
        Throwable throwable = null;
        try {
            Object object = (PreparedStatement)autoCloseable;
            boolean flag6 = false;
            AutoCloseable autoCloseable2 = object.executeQuery();
            Throwable throwable2 = null;
            try {
                Object object2 = (ResultSet)autoCloseable2;
                boolean flag7 = false;
                if (flag3) {
                    while (object2.next()) {
                        ObjectUtilities.BaseCoreGenericHandler(object2);
                        SilentHandler dZ2 = this.plugin((ResultSet)object2, kL2.c());
                        SilentHandler dZ3 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, dZ2, false, 2, null);
                        if (dZ3 != null && (!dZ3.LiteBansModule_240() || ObjectUtilities.BaseCoreGenericHandler((Object)dZ3.DatabaseMonitorService(), (Object)dZ2.DatabaseMonitorService()))) continue;
                        try {
                            this.c(dZ2);
                        }
                        catch (SQLException sQLException) {
                            this.LiteBansModule_240.getLogger().severe(m[164] + dZ2.ServerSyncService() + m[165] + sQLException.getMessage() + m[166] + dZ2);
                            if (!this.LiteBansModule_194.BaseCoreGenericHandler(1)) continue;
                            sQLException.printStackTrace();
                        }
                    }
                } else if (flag2) {
                    while (object2.next()) {
                        ObjectUtilities.BaseCoreGenericHandler(object2);
                        LiteBansModule_297 iA2 = this.plugin((ResultSet)object2, false, (String)charSequence);
                        String string2 = iA2.LiteBansModule_240();
                        String string3 = iA2.c();
                        String string4 = iA2.AsyncBackgroundTask_5();
                        AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, string2, string3, string4, false, false, 16, null);
                    }
                }
                object2 = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable3) {
                throwable2 = throwable3;
                throw throwable3;
            }
            finally {
                CloseactionHandler.BaseCoreGenericHandler(autoCloseable2, throwable2);
            }
            object = KotlinUnitHandler.BaseCoreGenericHandler;
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
        String string2 = HexEncodingHelper.LiteBansModule_194(resultSet.getString(m[167]));
        String string3 = resultSet.getString(m[168]);
        CharSequence charSequence = resultSet.getString(m[169]);
        String string4 = resultSet.getString(m[170]);
        if (string4 == null) {
            string4 = m[171];
        }
        Object object = resultSet;
        Object object2 = m[173];
        String string5 = resultSet.getString(m[172]);
        String string6 = string4;
        CharSequence charSequence2 = charSequence;
        String string7 = string3;
        String string8 = string2;
        CharSequence charSequence3 = a_3;
        boolean flag = false;
        try {
            string = object.getString((String)object2);
        }
        catch (SQLException sQLException) {
            string = null;
        }
        String string9 = string;
        object = resultSet;
        object2 = m[174];
        flag = false;
        try {
            string = object.getString((String)object2);
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
        byte by2 = LiteBansModule_283.BaseCoreGenericHandler((byte)resultSet.getInt(m[177]));
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
            object = Calendar.getInstance();
            ((Calendar)object).setTimeZone(TimeZone.getTimeZone(m[183]));
            object2 = resultSet.getTimestamp(m[184]);
            if (object2 != null) {
                ((Calendar)object).setTime((Date)object2);
                dZ2.c(((Calendar)object).getTimeInMillis() + (long)this.AsyncBackgroundTask_5().BaseCoreGenericHandler());
            } else {
                dZ2.c(0L);
            }
            ResultSet resultSet2 = resultSet;
            string = m[185];
            HexEncodingHelper jj_02 = HexEncodingHelper.BaseCoreGenericHandler;
            SilentHandler dZ3 = dZ2;
            boolean flag5 = false;
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
        Object object = this.LiteBansModule_194;
        boolean flag = false;
        if (((ConfigService)object).g()) {
            ((ConfigService)object).BaseCoreGenericHandler(charSequence);
        }
        PreparedStatement preparedStatement = this.AsyncBackgroundTask_5.prepareStatement(((Object)charSequence).toString());
        if (preparedStatement == null) {
            AssertionUtilities.BaseCoreGenericHandler();
            throw new CommandExitException();
        }
        object = preparedStatement;
        String string = charSequence instanceof SQLiteDriverHandler ? ((SQLiteDriverHandler)charSequence).c() : null;
        return ObjectUtilities.BaseCoreGenericHandler((Object)this.LiteBansModule_194.LiteBansModule_194().ElementsHandler(), (Object)m[188]) ? (LiteBansModule_60)new LiteBansModule_40(this, (PreparedStatement)object, string, null) : new LiteBansModule_60(this, (PreparedStatement)object, string, null);
    }

    @Override
    public void BaseCoreGenericHandler(@Nullable String string, long l3) {
        Object object;
        String string2 = HexEncodingHelper.BaseCoreGenericHandler.g(string);
        String string3 = m[189] + DatabaseMonitorService.BaseCoreGenericHandler(this.AsyncBackgroundTask_5(), false, 1, null) + m[190];
        Object object2 = BansHandler_2.values();
        boolean flag = false;
        Object object3 = object2;
        Collection collection = new ArrayList();
        boolean flag2 = false;
        for (BansHandler_2 kL2 : object3) {
            object = kL2;
            boolean flag3 = false;
            if (!((BansHandler_2)object).BaseCoreGenericHandler()) continue;
            collection.add(kL2);
        }
        object2 = (List)collection;
        flag = false;
        object3 = object2.iterator();
        while (object3.hasNext()) {
            collection = object3.next();
            BansHandler_2 kL3 = (BansHandler_2)((Object)collection);
            int n = 0;
            Object object4 = kL3;
            boolean flag4 = false;
            object4 = SQLiteDriverHandler.e(m[191] + object4);
            CharSequence charSequence = m[192];
            boolean flag5 = false;
            Object object5 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object4), charSequence};
            boolean flag6 = false;
            CharSequence[] charSequenceArray = object5;
            boolean flag7 = false;
            int n2 = charSequenceArray.length;
            for (int i = 0; i < n2; ++i) {
                CharSequence charSequence2;
                CharSequence charSequence3 = charSequence2 = charSequenceArray[i];
                boolean flag8 = false;
                if (charSequence3.length() > 0) continue;
                String string4 = m[193];
                throw new IllegalArgumentException(string4.toString());
            }
            String string5 = SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object4) + m[194] + charSequence), m[195]);
            if (kL3 != BansHandler_2.GnuSparseMapHandler) {
                string5 = SQLiteDriverHandler.LiteBansModule_31(string5, string3);
            }
            object4 = this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(string5));
            boolean bl9 = false;
            object = object4;
            object5 = object;
            flag6 = false;
            ((LiteBansModule_60)object4).BaseCoreGenericHandler(string2);
            LiteBansModule_184.AsyncBackgroundTask_5(((LiteBansModule_60)object).BaseCoreGenericHandler(l3));
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
        LiteBansModule_178 eo_02 = LiteBansModule_401.c();
        Object object = kL2;
        CharSequence charSequence = m[196];
        boolean flag4 = false;
        String string3 = SQLiteDriverHandler.e(m[197] + charSequence + m[198] + object);
        if (flag3) {
            object = m[199];
            flag2 = false;
            charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5(string3), object};
            flag = false;
            CharSequence[] charSequenceArray2 = charSequenceArray;
            boolean flag5 = false;
            int n = charSequenceArray2.length;
            for (int i = 0; i < n; ++i) {
                CharSequence charSequence2;
                CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
                boolean flag6 = false;
                if (charSequence3.length() > 0) continue;
                String string4 = m[200];
                throw new IllegalArgumentException(string4.toString());
            }
            string3 = SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31(string3) + m[201] + object), m[202]);
            eo_02 = LiteBansModule_401.BaseCoreGenericHandler(eo_02, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(string, string2, c12, arg_0));
        } else {
            object = m[203];
            flag2 = false;
            charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5(string3), object};
            flag = false;
            CharSequence[] charSequenceArray3 = charSequenceArray;
            boolean flag7 = false;
            int n = charSequenceArray3.length;
            for (int i = 0; i < n; ++i) {
                CharSequence charSequence4;
                CharSequence charSequence5 = charSequence4 = charSequenceArray3[i];
                boolean flag8 = false;
                if (charSequence5.length() > 0) continue;
                String string5 = m[204];
                throw new IllegalArgumentException(string5.toString());
            }
            string3 = SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31(string3) + m[205] + object), m[206]);
            eo_02 = LiteBansModule_401.BaseCoreGenericHandler(eo_02, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(string, c12, arg_0));
        }
        if (c12.AsyncBackgroundTask_5() == BanHandler.c) {
            object = this;
            flag2 = false;
            string3 = SQLiteDriverHandler.LiteBansModule_31(string3, m[207] + ((SQLiteDriverHandler_3)object).c().LiteBansModule_31() + m[208]);
            eo_02 = LiteBansModule_401.BaseCoreGenericHandler(eo_02, SQLiteDriverHandler_3::c);
        }
        if (c12.i() > 0L) {
            long l3 = DatabaseMonitorService.BaseCoreGenericHandler(this.AsyncBackgroundTask_5(), false, 1, null) - c12.i();
            string3 = SQLiteDriverHandler.LiteBansModule_31(string3, m[209]);
            eo_02 = LiteBansModule_401.BaseCoreGenericHandler(eo_02, arg_0 -> SQLiteDriverHandler_3.LiteBansModule_31(l3, arg_0));
        }
        ResultSet resultSet = LiteBansModule_184.LiteBansModule_31(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(string3)), eo_02);
        int n = 1;
        flag = false;
        Integer n2 = resultSet.next() ? Integer.valueOf(resultSet.getInt(n)) : null;
        return n2 != null ? n2 : 0;
    }

    @Override
    public LiteBansModule_354 BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, @NotNull LiteBansModule_174 eM2, @NotNull LiteBansModule_65 c12) {
        boolean flag;
        CharSequence charSequence;
        CharSequence charSequence2;
        int n;
        int n2;
        boolean flag2;
        Object object;
        boolean flag3;
        CharSequence[] charSequenceArray;
        if (string == null) {
            return LiteBansModule_371.BaseCoreGenericHandler(0.0, 0.0);
        }
        boolean flag4 = c12.GnuSparseMapHandler() && string2 != null && !StringUtilities.c((CharSequence)string2, '#', false, 2, null);
        BansHandler_2 kL2 = eM2.c().BaseCoreGenericHandler();
        Object object2 = kL2;
        Object object3 = m[210];
        boolean flag5 = false;
        String string3 = SQLiteDriverHandler.e(m[211] + object3 + m[212] + object2);
        object2 = null;
        object2 = LiteBansModule_401.c();
        if (flag4) {
            object3 = m[213];
            flag5 = false;
            charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5(string3), object3};
            flag3 = false;
            object = charSequenceArray;
            flag2 = false;
            n2 = ((CharSequence[])object).length;
            for (n = 0; n < n2; ++n) {
                charSequence = charSequence2 = object[n];
                flag = false;
                if (charSequence.length() > 0) continue;
                String string4 = m[214];
                throw new IllegalArgumentException(string4.toString());
            }
            string3 = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31(string3) + m[215] + object3);
            object2 = LiteBansModule_401.BaseCoreGenericHandler((LiteBansModule_178)object2, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(string, string2, arg_0));
        } else {
            object3 = m[216];
            flag5 = false;
            charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5(string3), object3};
            flag3 = false;
            object = charSequenceArray;
            flag2 = false;
            n2 = ((CharSequence[])object).length;
            for (n = 0; n < n2; ++n) {
                charSequence = charSequence2 = object[n];
                flag = false;
                if (charSequence.length() > 0) continue;
                String string5 = m[217];
                throw new IllegalArgumentException(string5.toString());
            }
            string3 = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31(string3) + m[218] + object3);
            object2 = LiteBansModule_401.BaseCoreGenericHandler((LiteBansModule_178)object2, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(string, arg_0));
        }
        if (eM2.c() == BanHandler.c) {
            object3 = this;
            flag5 = false;
            string3 = SQLiteDriverHandler.LiteBansModule_31(string3, m[219] + ((SQLiteDriverHandler_3)object3).c().LiteBansModule_31() + m[220]);
            object2 = LiteBansModule_401.BaseCoreGenericHandler((LiteBansModule_178)object2, SQLiteDriverHandler_3::LiteBansModule_31);
        }
        if (eM2.AsyncBackgroundTask_5() > 0L) {
            long l3 = DatabaseMonitorService.BaseCoreGenericHandler(this.AsyncBackgroundTask_5(), false, 1, null) - eM2.AsyncBackgroundTask_5();
            string3 = SQLiteDriverHandler.LiteBansModule_31(string3, m[221]);
            object2 = LiteBansModule_401.BaseCoreGenericHandler((LiteBansModule_178)object2, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(l3, arg_0));
        }
        String string6 = null;
        string6 = m[222];
        Object object4 = eM2.e();
        boolean flag6 = false;
        Iterator iterator = object4.entrySet().iterator();
        while (iterator.hasNext()) {
            Object object5 = object = iterator.next();
            n = 0;
            LiteBansModule_65 c13 = (LiteBansModule_65)object5.getKey();
            string6 = string6 + m[223];
            object2 = LiteBansModule_401.BaseCoreGenericHandler((LiteBansModule_178)object2, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(c13, arg_0));
        }
        string6 = string6.substring(0, string6.length() - 4);
        string3 = SQLiteDriverHandler.LiteBansModule_31(string3, '(' + string6 + ')');
        object4 = LiteBansModule_184.LiteBansModule_31(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(string3)), (LiteBansModule_178)object2);
        double d10 = 0.0;
        while (true) {
            String[] args;
            String[] filteredArgs;
            ConfigService configService;
            Object object6 = object4;
            n = 1;
            n2 = 0;
            Integer n3 = object6.next() ? Integer.valueOf(object6.getInt(n)) : null;
            if (n3 == null) {
                break;
            }
            byte by2 = LiteBansModule_283.BaseCoreGenericHandler((byte)n3.intValue());
            if ((LiteBansModule_65)eM2.LiteBansModule_31().get(LiteBansModule_283.AsyncBackgroundTask_5(by2)) == null) break;
            Object v2 = eM2.e().get(object);
            ObjectUtilities.BaseCoreGenericHandler(v2);
            float f10 = ((Number)v2).floatValue();
            d10 += (double)f10;
            ConfigService q_03 = this.LiteBansModule_194;
            n2 = 10;
            boolean flag7 = false;
            if (q_03.BaseCoreGenericHandler(n2)) {
                configService = q_03;
                boolean flag8 = false;
                configService.BaseCoreGenericHandler((Object)('[' + eM2.BaseCoreGenericHandler() + m[224] + LiteBansModule_287.BaseCoreGenericHandler(f10) + m[225] + ((LiteBansModule_65)object).g() + m[226] + LiteBansModule_287.BaseCoreGenericHandler(d10)));
            }
            q_03 = this.LiteBansModule_194;
            n2 = 0;
            if (!q_03.g()) continue;
            configService = q_03;
            flag7 = false;
            MuteHandler et2 = AbstractCommand.AsyncBackgroundTask_5;
            String string7 = m[227] + f10;
            boolean bl9 = false;
            if (ObjectUtilities.BaseCoreGenericHandler((Object)string7, (Object)m[228])) {
                filteredArgs = new String[]{m[229]};
                args = filteredArgs;
            } else {
                filteredArgs = new String[]{m[230] + string7};
                args = filteredArgs;
            }
            String[] parsedArgs = args;
            configService.BaseCoreGenericHandler(new LiteBansModule_403(this.LiteBansModule_194, Arrays.copyOf(parsedArgs, parsedArgs.length)));
        }
        Object v3 = eM2.e().get(c12);
        ObjectUtilities.BaseCoreGenericHandler(v3);
        float f11 = ((Number)v3).floatValue();
        double d11 = d10 + (double)f11;
        return LiteBansModule_371.BaseCoreGenericHandler(d10, d11);
    }

    @Override
    public ResultSet BaseCoreGenericHandler(@NotNull BansHandler_2 kL2, @NotNull String string, int n) {
        ResultSet resultSet;
        Object object = this;
        boolean flag = false;
        boolean flag2 = false;
        AllHandler_2 jy2 = new AllHandler_2(object.e(), string, flag);
        if (n == 1) {
            if (!kL2.BaseCoreGenericHandler()) {
                return LiteBansModule_397.BaseCoreGenericHandler();
            }
            object = kL2;
            flag = false;
            return LiteBansModule_184.AsyncBackgroundTask_5(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[231] + object), m[232]))));
        }
        if (n == 2) {
            if (!kL2.BaseCoreGenericHandler()) {
                return LiteBansModule_397.BaseCoreGenericHandler();
            }
            object = kL2;
            flag = false;
            object = SQLiteDriverHandler.e(m[233] + object);
            SQLiteDriverHandler_3 gZ2 = this;
            flag = false;
            Object object2 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object), jy2};
            boolean flag3 = false;
            CharSequence[] charSequenceArray = object2;
            boolean flag4 = false;
            int n2 = charSequenceArray.length;
            for (int i = 0; i < n2; ++i) {
                CharSequence charSequence;
                CharSequence charSequence2 = charSequence = charSequenceArray[i];
                boolean flag5 = false;
                if (charSequence2.length() > 0) continue;
                String string2 = m[234];
                throw new IllegalArgumentException(string2.toString());
            }
            object = gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object) + m[235] + (CharSequence)jy2), m[236])));
            flag = false;
            Object object3 = object2 = object;
            boolean flag6 = false;
            ((AllHandler)jy2).BaseCoreGenericHandler((LiteBansModule_60)object3);
            return LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)object2);
        }
        if (LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(string)) {
            object = kL2;
            flag = false;
            resultSet = LiteBansModule_184.AsyncBackgroundTask_5(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(m[237] + object))));
        } else {
            object = kL2;
            flag = false;
            object = SQLiteDriverHandler.e(m[238] + object);
            SQLiteDriverHandler_3 gZ3 = this;
            flag = false;
            Object object4 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object), jy2};
            boolean flag7 = false;
            CharSequence[] charSequenceArray = object4;
            boolean flag8 = false;
            int n3 = charSequenceArray.length;
            for (int i = 0; i < n3; ++i) {
                CharSequence charSequence;
                CharSequence charSequence3 = charSequence = charSequenceArray[i];
                boolean bl9 = false;
                if (charSequence3.length() > 0) continue;
                String string3 = m[239];
                throw new IllegalArgumentException(string3.toString());
            }
            object = gZ3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object) + m[240] + (CharSequence)jy2)));
            flag = false;
            Object object5 = object4 = object;
            boolean bl10 = false;
            ((AllHandler)jy2).BaseCoreGenericHandler((LiteBansModule_60)object5);
            resultSet = LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)object4);
        }
        return resultSet;
    }

    @Override
    public ResultSet BaseCoreGenericHandler(@NotNull BansHandler_2 kL2) {
        BansHandler_2 kL3 = kL2;
        boolean flag = false;
        return LiteBansModule_184.AsyncBackgroundTask_5(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[241] + kL3), m[242]))));
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull CharSequence charSequence, long l3, @NotNull SilentHandler dZ2) {
        Object object = this;
        Object object2 = dZ2.m();
        boolean flag = true;
        boolean flag2 = false;
        AllHandler_2 jy2 = new AllHandler_2(object.e(), (String)object2, flag);
        object2 = dZ2;
        flag = false;
        object2 = ((SilentHandler)object2).ServerSyncService().BaseCoreGenericHandler();
        flag = false;
        object2 = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[243] + object2), m[244]);
        CharSequence charSequence2 = m[245];
        flag2 = false;
        Object object3 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object2), charSequence2};
        boolean flag3 = false;
        CharSequence[] charSequenceArray = object3;
        boolean flag4 = false;
        int n = charSequenceArray.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence3;
            CharSequence charSequence4 = charSequence3 = charSequenceArray[i];
            boolean flag5 = false;
            if (charSequence4.length() > 0) continue;
            String string = m[246];
            throw new IllegalArgumentException(string.toString());
        }
        String string = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object2) + m[247] + charSequence2);
        object2 = this;
        boolean flag6 = false;
        object2 = SQLiteDriverHandler.LiteBansModule_31(string, m[248] + ((SQLiteDriverHandler_3)object2).c().LiteBansModule_31() + m[249]);
        flag6 = false;
        object = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object2) + (AllHandler)jy2);
        object2 = this.c(SQLiteDriverHandler.AsyncBackgroundTask_5((String)object)).BaseCoreGenericHandler(l3);
        flag6 = false;
        Object object4 = object2;
        object3 = object4;
        flag3 = false;
        ((LiteBansModule_60)object2).BaseCoreGenericHandler(String.valueOf(charSequence));
        object2 = LiteBansModule_184.BaseCoreGenericHandler(((LiteBansModule_60)object4).BaseCoreGenericHandler(dZ2.BaseCoreGenericHandler()));
        flag6 = false;
        object4 = object2;
        object3 = object4;
        flag3 = false;
        ((AllHandler)jy2).BaseCoreGenericHandler((LiteBansModule_60)object3);
        LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)object4);
    }

    @Override
    public void BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, @NotNull CharSequence charSequence, @NotNull SilentHandler dZ2, boolean flag) {
        CharSequence charSequence2;
        int n;
        LiteBansModule_354 jT2;
        String string3 = string2;
        String string4 = string3 != null ? LiteBansModule_242.BaseCoreGenericHandler(string3, 128) : null;
        LiteBansModule_82 ch2 = this;
        Object object = dZ2.m();
        boolean flag2 = true;
        boolean flag3 = false;
        AllHandler_2 jy2 = new AllHandler_2(ch2.e(), (String)object, flag2);
        boolean flag4 = dZ2.LiteBansModule_240() && dZ2.PunishmentTableService() != null && !StringUtilities.c((CharSequence)dZ2.PunishmentTableService(), '#', false, 2, null);
        if (flag) {
            SilentHandler dZ3 = dZ2;
            flag3 = false;
            jT2 = LiteBansModule_371.BaseCoreGenericHandler(m[250], String.valueOf(dZ3.BaseCoreGenericHandler()));
        } else {
            jT2 = flag4 ? LiteBansModule_371.BaseCoreGenericHandler(m[251], dZ2.PunishmentTableService()) : LiteBansModule_371.BaseCoreGenericHandler(m[252], dZ2.DatabaseMonitorService());
        }
        object = jT2;
        Object object2 = dZ2;
        boolean flag5 = false;
        object2 = ((SilentHandler)object2).ServerSyncService().BaseCoreGenericHandler();
        flag5 = false;
        object2 = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[253] + object2), m[254]);
        CharSequence charSequence3 = (String)((LiteBansModule_354)object).LiteBansModule_31() + m[255];
        boolean flag6 = false;
        Object object3 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object2), charSequence3};
        boolean flag7 = false;
        CharSequence[] charSequenceArray = object3;
        boolean flag8 = false;
        int n2 = charSequenceArray.length;
        for (n = 0; n < n2; ++n) {
            CharSequence charSequence4;
            charSequence2 = charSequence4 = charSequenceArray[n];
            boolean bl9 = false;
            if (charSequence2.length() > 0) continue;
            String string5 = m[256];
            throw new IllegalArgumentException(string5.toString());
        }
        String string6 = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object2) + m[257] + charSequence3);
        object2 = this;
        boolean bl10 = false;
        object2 = SQLiteDriverHandler.LiteBansModule_31(string6, m[258] + ((SQLiteDriverHandler_3)object2).c().LiteBansModule_31() + m[259]);
        bl10 = false;
        String string7 = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object2) + (AllHandler)jy2);
        object2 = this.LiteBansModule_194;
        bl10 = false;
        if (((ConfigService)object2).g()) {
            Object object4 = object2;
            flag6 = false;
            ((ConfigService)object4).BaseCoreGenericHandler((Object)(SQLiteDriverHandler.LiteBansModule_31(string7) + ' ' + dZ2.m() + ' ' + object));
        }
        object2 = this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(string7));
        String[] args = new String[]{string, string4, ((Object)charSequence).toString(), ((LiteBansModule_354)object).e()};
        flag6 = false;
        Object object5 = object3 = object2;
        boolean bl11 = false;
        String[] filteredArgs = args;
        n = 0;
        int n3 = filteredArgs.length;
        for (n2 = 0; n2 < n3; ++n2) {
            CharSequence charSequence5 = charSequence2 = filteredArgs[n2];
            boolean bl12 = false;
            ((LiteBansModule_60)object2).BaseCoreGenericHandler((String)charSequence5);
        }
        object2 = LiteBansModule_184.BaseCoreGenericHandler((LiteBansModule_60)object3);
        boolean bl13 = false;
        Object object6 = object2;
        object3 = object6;
        boolean bl14 = false;
        ((AllHandler)jy2).BaseCoreGenericHandler((LiteBansModule_60)object3);
        LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)object6);
        dZ2.BaseCoreGenericHandler(string4, string, charSequence);
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull SilentHandler dZ2, @Nullable String string, @Nullable String string2, @NotNull CharSequence charSequence, boolean flag) {
        if (flag) {
            Object object = dZ2;
            boolean flag2 = false;
            object = ((SilentHandler)object).ServerSyncService().BaseCoreGenericHandler();
            flag2 = false;
            object = SQLiteDriverHandler.e(m[260] + object);
            CharSequence charSequence2 = m[261];
            boolean flag3 = false;
            CharSequence[] charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object), charSequence2};
            boolean flag4 = false;
            CharSequence[] charSequenceArray2 = charSequenceArray;
            boolean flag5 = false;
            int n = charSequenceArray2.length;
            for (int i = 0; i < n; ++i) {
                CharSequence charSequence3;
                CharSequence charSequence4 = charSequence3 = charSequenceArray2[i];
                boolean flag6 = false;
                if (charSequence4.length() > 0) continue;
                String string3 = m[262];
                throw new IllegalArgumentException(string3.toString());
            }
            String string4 = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object) + m[263] + charSequence2);
            LiteBansModule_184.AsyncBackgroundTask_5(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(string4)).BaseCoreGenericHandler(dZ2.BaseCoreGenericHandler()));
        } else {
            CharSequence charSequence5;
            Object object;
            Object object2 = dZ2;
            boolean flag7 = false;
            object2 = ((SilentHandler)object2).ServerSyncService().BaseCoreGenericHandler();
            flag7 = false;
            object2 = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[264] + object2), m[265]);
            CharSequence charSequence6 = m[266];
            boolean flag8 = false;
            Object object3 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object2), charSequence6};
            boolean bl9 = false;
            CharSequence[] charSequenceArray = object3;
            boolean bl10 = false;
            int n = charSequenceArray.length;
            for (int i = 0; i < n; ++i) {
                CharSequence charSequence7;
                CharSequence charSequence8 = charSequence7 = charSequenceArray[i];
                boolean bl11 = false;
                if (charSequence8.length() > 0) continue;
                String string5 = m[267];
                throw new IllegalArgumentException(string5.toString());
            }
            String string6 = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object2) + m[268] + charSequence6);
            object2 = this.LiteBansModule_194;
            boolean bl12 = false;
            if (((ConfigService)object2).g()) {
                Object object4 = object2;
                flag8 = false;
                object3 = SQLiteDriverHandler.AsyncBackgroundTask_5(string6);
                CharSequence charSequence9 = m[269] + dZ2.BaseCoreGenericHandler();
                boolean bl13 = false;
                ((ConfigService)object4).BaseCoreGenericHandler((Object)("" + object3 + charSequence9));
            }
            object2 = this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(string6));
            bl12 = false;
            object3 = object = object2;
            boolean bl14 = false;
            ((LiteBansModule_60)object2).BaseCoreGenericHandler(string);
            object2 = object;
            String string7 = string2;
            CharSequence charSequence10 = string7 != null ? LiteBansModule_242.BaseCoreGenericHandler(string7, 128) : null;
            boolean bl15 = false;
            Object object5 = object3 = object2;
            boolean bl16 = false;
            ((LiteBansModule_60)object2).BaseCoreGenericHandler((String)charSequence10);
            object2 = object3;
            charSequence10 = charSequence;
            if (StringUtilities.LiteBansModule_31(charSequence10)) {
                bl15 = false;
                charSequence5 = null;
            } else {
                charSequence5 = charSequence10;
            }
            charSequence10 = charSequence5;
            bl15 = false;
            object5 = object3 = object2;
            bl16 = false;
            ((LiteBansModule_60)object2).BaseCoreGenericHandler(String.valueOf(charSequence10));
            LiteBansModule_184.AsyncBackgroundTask_5(((LiteBansModule_60)object3).BaseCoreGenericHandler(dZ2.BaseCoreGenericHandler()));
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
        Object object;
        LiteBansModule_82 ch2 = this;
        boolean flag4 = false;
        AllHandler jJ2 = new AllHandler(ch2.e(), string2);
        Object object2 = BansHandler_2.values();
        int n5 = 0;
        Object object3 = object2;
        Object object4 = new ArrayList();
        boolean flag5 = false;
        for (BansHandler_2 kL2 : object3) {
            object = kL2;
            boolean flag6 = false;
            if (!((BansHandler_2)object).BaseCoreGenericHandler()) continue;
            object4.add(kL2);
        }
        object2 = (List)object4;
        n5 = 0;
        object3 = object2.iterator();
        while (object3.hasNext()) {
            object4 = object3.next();
            BansHandler_2 kL3 = (BansHandler_2)object4;
            int n6 = n5;
            n4 = 0;
            Object object5 = kL3;
            boolean flag7 = false;
            object5 = SQLiteDriverHandler.e(m[270] + object5);
            CharSequence charSequence3 = m[271];
            object = this;
            boolean flag8 = false;
            Object object6 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object5), charSequence3};
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
            object5 = ((SQLiteDriverHandler_3)object).c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object5) + m[273] + charSequence3), m[274] + jJ2)));
            boolean bl9 = false;
            Object object7 = object5;
            object6 = object7;
            flag3 = false;
            ((LiteBansModule_60)object5).BaseCoreGenericHandler(string);
            object5 = ((LiteBansModule_60)object7).BaseCoreGenericHandler(l3);
            bl9 = false;
            object7 = object5;
            object6 = object7;
            flag3 = false;
            jJ2.BaseCoreGenericHandler((LiteBansModule_60)object6);
            int n7 = LiteBansModule_184.LiteBansModule_31((LiteBansModule_60)object7);
            n5 = n6 + n7;
        }
        long l5 = n5;
        object2 = null;
        object2 = LiteBansModule_401.BaseCoreGenericHandler(arg_0 -> SQLiteDriverHandler_3.c(string, arg_0));
        if (l3 > 0L) {
            Timestamp timestamp = new Timestamp(l3);
            object2 = LiteBansModule_401.BaseCoreGenericHandler((LiteBansModule_178)object2, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(timestamp, arg_0));
        }
        object2 = LiteBansModule_401.BaseCoreGenericHandler((LiteBansModule_178)object2, arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler(jJ2, arg_0));
        Object object8 = BansHandler_2.values();
        boolean bl10 = false;
        object4 = object8;
        Collection collection = new ArrayList();
        n4 = 0;
        int n8 = ((BansHandler_2[])object4).length;
        for (n = 0; n < n8; ++n) {
            Object object9 = object = object4[n];
            boolean bl11 = false;
            if (!(((BansHandler_2)object9).BaseCoreGenericHandler() && object9 != BansHandler_2.GnuSparseMapHandler)) continue;
            collection.add(object);
        }
        object8 = (List)collection;
        bl10 = false;
        object4 = object8.iterator();
        while (object4.hasNext()) {
            collection = object4.next();
            BansHandler_2 kL4 = (BansHandler_2)((Object)collection);
            n = 0;
            CharSequence charSequence4 = kL4;
            boolean bl12 = false;
            charSequence4 = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[275] + charSequence4), m[276]);
            object = SQLiteDriverHandler.AsyncBackgroundTask_5(LiteBansModule_227.c(m[277]));
            boolean bl13 = false;
            CharSequence[] charSequenceArray2 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)charSequence4), object};
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
            String string5 = SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)charSequence4) + m[279] + object), m[280] + jJ2);
            if (l3 > 0L) {
                string5 = SQLiteDriverHandler.LiteBansModule_31(string5, m[281]);
            }
            LiteBansModule_184.LiteBansModule_31(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(string5)), (LiteBansModule_178)object2);
        }
        if (this.LiteBansModule_194.LiteBansModule_194().PunishmentTableService()) {
            PunishmentTableService p2 = this.Utf8Handler_2;
            boolean bl14 = false;
            p2.BaseCoreGenericHandler(this);
        }
        return l5;
    }

    @Override
    public ResultSet LiteBansModule_31(@NotNull String string) {
        Object object = BansHandler_2.LiteBansModule_31;
        boolean flag = false;
        object = LiteBansModule_293.BaseCoreGenericHandler(SQLiteDriverHandler.e(m[282] + object), m[283]);
        CharSequence charSequence = m[284];
        SQLiteDriverHandler_3 gZ2 = this;
        boolean flag2 = false;
        Object object2 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object), charSequence};
        boolean flag3 = false;
        CharSequence[] charSequenceArray = object2;
        boolean flag4 = false;
        int n = charSequenceArray.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray[i];
            boolean flag5 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = m[285];
            throw new IllegalArgumentException(string2.toString());
        }
        object = gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object) + m[286] + charSequence), SQLiteDriverHandler.AsyncBackgroundTask_5(LiteBansModule_227.c(m[287])))));
        boolean flag6 = false;
        Object object3 = object;
        object2 = object3;
        flag3 = false;
        ((LiteBansModule_60)object).BaseCoreGenericHandler(string);
        return LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)object3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(boolean flag) {
        try {
            if (this.LiteBansModule_194.LiteBansModule_194().BanHandler_5()) {
                return;
            }
            long l3 = DatabaseMonitorService.BaseCoreGenericHandler(this.AsyncBackgroundTask_5(), false, 1, null);
            if (l3 - this.AsyncBackgroundTask_5().LiteBansModule_31() <= 72000000L && !flag) {
                return;
            }
            ServerSyncService u2 = (ServerSyncService)this.LiteBansModule_240.BaseCoreGenericHandler(ServerSyncService.class);
            Object object = this.AsyncBackgroundTask_5();
            int n = 0;
            boolean flag2 = false;
            ((DatabaseMonitorService)object).BaseCoreGenericHandler(l3 + (long)n);
            ServerSyncService.BaseCoreGenericHandler(u2, BroadcastHandler.PunishmentTableService, this, null, 0, 12, null);
            object = this.AsyncBackgroundTask_5.createStatement();
            Throwable throwable = null;
            try {
                int n2;
                int n3;
                boolean flag3;
                Object object2;
                int n4;
                boolean flag4;
                Object object3;
                Object object4 = (Statement)object;
                boolean flag5 = false;
                Object object5 = BansHandler_2.values();
                boolean flag6 = false;
                Object object6 = object5;
                Collection<BansHandler_2> collection = new ArrayList();
                boolean flag7 = false;
                for (CharSequence charSequence : object6) {
                    BansHandler_2 kL2 = charSequence;
                    boolean flag8 = false;
                    object3 = kL2;
                    flag4 = false;
                    boolean bl9 = object3.BaseCoreGenericHandler() && object3 != BansHandler_2.GnuSparseMapHandler;
                    if (!bl9) continue;
                    collection.add((BansHandler_2)charSequence);
                }
                object5 = (List)collection;
                flag6 = false;
                object6 = object5.iterator();
                while (object6.hasNext()) {
                    CharSequence charSequence;
                    collection = object6.next();
                    BansHandler_2 kL3 = (BansHandler_2)((Object)collection);
                    n4 = 0;
                    ObjectUtilities.BaseCoreGenericHandler(object4);
                    Statement statement = object4;
                    charSequence = kL3;
                    boolean bl10 = false;
                    charSequence = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[288] + charSequence), m[289]);
                    CharSequence charSequence2 = m[290];
                    boolean bl11 = false;
                    object3 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)charSequence), charSequence2};
                    flag4 = false;
                    object2 = object3;
                    flag3 = false;
                    n3 = ((CharSequence[])object2).length;
                    for (int i = 0; i < n3; ++i) {
                        CharSequence charSequence3;
                        CharSequence charSequence4 = charSequence3 = object2[i];
                        boolean bl12 = false;
                        if (charSequence4.length() > 0) continue;
                        String string = m[291];
                        throw new IllegalArgumentException(string.toString());
                    }
                    charSequence = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)charSequence) + m[292] + charSequence2), m[293]), m[294] + l3));
                    boolean bl13 = false;
                    Statement statement2 = statement;
                    object3 = statement2;
                    flag4 = false;
                    statement.addBatch(((Object)charSequence).toString());
                }
                long l5 = this.LiteBansModule_194.LiteBansModule_194().LiteBansModule_43();
                if (l5 > 0L) {
                    object6 = BansHandler_2.values();
                    boolean bl14 = false;
                    Iterator iterator = object6;
                    Collection<Object> collection2 = new ArrayList();
                    n2 = 0;
                    for (Object object7 : iterator) {
                        object3 = object7;
                        flag4 = false;
                        object2 = object3;
                        flag3 = false;
                        boolean bl15 = object2.BaseCoreGenericHandler() && object2 != BansHandler_2.GnuSparseMapHandler;
                        if (!bl15) continue;
                        collection2.add(object7);
                    }
                    object6 = (List)collection2;
                    bl14 = false;
                    iterator = object6.iterator();
                    while (iterator.hasNext()) {
                        collection2 = iterator.next();
                        BansHandler_2 kL4 = (BansHandler_2)((Object)collection2);
                        int n5 = 0;
                        ObjectUtilities.BaseCoreGenericHandler(object4);
                        Object object8 = object4;
                        CharSequence charSequence = kL4;
                        boolean bl16 = false;
                        charSequence = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[295] + charSequence), m[296]);
                        CharSequence charSequence5 = m[297];
                        boolean bl17 = false;
                        object2 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)charSequence), charSequence5};
                        flag3 = false;
                        CharSequence[] charSequenceArray = object2;
                        n3 = 0;
                        int n6 = charSequenceArray.length;
                        for (int i = 0; i < n6; ++i) {
                            CharSequence charSequence6;
                            CharSequence charSequence7 = charSequence6 = charSequenceArray[i];
                            boolean bl18 = false;
                            if (charSequence7.length() > 0) continue;
                            String string = m[298];
                            throw new IllegalArgumentException(string.toString());
                        }
                        charSequence = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.LiteBansModule_31(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)charSequence) + m[299] + charSequence5), m[300]), m[301] + l5 + m[302] + l3));
                        boolean bl19 = false;
                        Object object9 = object8;
                        object2 = object9;
                        flag3 = false;
                        object8.addBatch(((Object)charSequence).toString());
                    }
                }
                DatabaseMonitorService w2 = this.AsyncBackgroundTask_5();
                ObjectUtilities.BaseCoreGenericHandler(object4);
                object6 = w2.BaseCoreGenericHandler((Statement)object4);
                if (this.LiteBansModule_194.BaseCoreGenericHandler(100)) {
                    Object object10 = object6;
                    n4 = 0;
                    int n7 = ((BansHandler_2[])object10).length;
                    for (n2 = 0; n2 < n7; ++n2) {
                        BansHandler_2 kL5;
                        BansHandler_2 kL6 = kL5 = object10[n2];
                        int n8 = n4;
                        boolean bl20 = false;
                        int n9 = Math.max((int)kL6, 0);
                        n4 = n8 + n9;
                    }
                    int n10 = n4;
                    if (n10 > 0) {
                        this.LiteBansModule_194.BaseCoreGenericHandler((Object)(m[303] + n10 + m[304] + l3 + ')'));
                    }
                }
                object4 = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)object, throwable);
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
    public int BaseCoreGenericHandler(@NotNull LiteBansModule_297 iA2) {
        CharSequence charSequence;
        int n;
        Object object = BansHandler_2.g;
        boolean flag = false;
        object = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[306] + object), m[307]);
        String[] args = (String[])m[308];
        SQLiteDriverHandler_3 gZ2 = this;
        boolean flag2 = false;
        Object object2 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object), args};
        boolean flag3 = false;
        CharSequence[] charSequenceArray = object2;
        boolean flag4 = false;
        int n2 = charSequenceArray.length;
        for (n = 0; n < n2; ++n) {
            CharSequence charSequence2;
            charSequence = charSequence2 = charSequenceArray[n];
            boolean flag5 = false;
            if (charSequence.length() > 0) continue;
            String string = m[309];
            throw new IllegalArgumentException(string.toString());
        }
        object = gZ2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object) + m[310] + args), m[311])));
        args = new String[]{m[312], iA2.LiteBansModule_31(), iA2.i()};
        flag2 = false;
        Object object3 = object2 = object;
        boolean flag6 = false;
        String[] filteredArgs = args;
        n = 0;
        int n3 = filteredArgs.length;
        for (n2 = 0; n2 < n3; ++n2) {
            CharSequence charSequence3 = charSequence = filteredArgs[n2];
            boolean flag7 = false;
            ((LiteBansModule_60)object).BaseCoreGenericHandler((String)charSequence3);
        }
        return LiteBansModule_184.LiteBansModule_31((LiteBansModule_60)object2);
    }

    private final void BaseCoreGenericHandler(Statement statement) {
        BansHandler_2[] kLArray = BansHandler_2.values();
        boolean flag = false;
        int n = kLArray.length;
        for (int i = 0; i < n; ++i) {
            String string;
            BansHandler_2 kL2;
            BansHandler_2 kL3 = kL2 = kLArray[i];
            boolean flag2 = false;
            String string2 = BansHandler_2.BaseCoreGenericHandler(kL3, Locale.getDefault(), false, 2, null);
            if (ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)(string = BansHandler_2.BaseCoreGenericHandler(kL3, null, false, 3, null))) || this.LiteBansModule_31((CharSequence)string) || !this.LiteBansModule_31((CharSequence)string2)) continue;
            this.LiteBansModule_240.getLogger().info(m[325] + string2 + m[326] + string + '\"');
            statement.execute(m[327] + string2 + m[328] + string);
        }
    }

    public final SQLiteDriverHandler_5 LiteBansModule_31() {
        DiscordWebhookClient eG2 = this.LiteBansModule_194.LiteBansModule_194();
        boolean flag = false;
        return new SQLiteDriverHandler_5(MySqlCharsetHelper.g.BaseCoreGenericHandler(eG2.ElementsHandler(), eG2.BanHandler()));
    }

    public final CharSequence BaseCoreGenericHandler(@NotNull BansHandler_2 kL2, @NotNull SQLiteDriverHandler_5 jr_02) {
        boolean flag;
        Object object;
        String[] args;
        String string = null;
        string = m[329];
        String string2 = null;
        string2 = m[330];
        SQLiteDriverHandler_5 jr_03 = jr_02;
        boolean flag2 = false;
        if (kL2 == BansHandler_2.LiteBansModule_31) {
            args = m[331];
            object = m[332];
            boolean flag3 = false;
            string2 = (String)args + m[333] + (String)object;
        }
        if (kL2 != BansHandler_2.GnuSparseMapHandler) {
            args = m[334];
            int n = 36;
            String string3 = m[335];
            String string4 = jr_03.LiteBansModule_31().c();
            boolean flag4 = false;
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
            object = m[346];
            string3 = m[347];
            flag = false;
            string = string5 + ',' + string6 + ',' + string7 + ',' + ((String)object + m[348] + string3);
        }
        args = new String[18];
        object = jr_03;
        String string8 = m[349];
        flag = false;
        args[0] = ObjectUtilities.BaseCoreGenericHandler((Object)((SQLiteDriverHandler_5)object).LiteBansModule_31().BaseCoreGenericHandler(), (Object)m[350]) ? string8 + m[351] : string8 + m[352];
        object = m[353];
        int n = 36;
        String string9 = m[354];
        String string10 = m[355];
        boolean flag5 = false;
        args[1] = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object + m[356] + n + ')' + string9 + string10 : (String)object + m[357] + n + ')' + string10;
        object = m[358];
        n = 45;
        string9 = m[359];
        string10 = m[360];
        flag5 = false;
        args[2] = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object + m[361] + n + ')' + string9 + string10 : (String)object + m[362] + n + ')' + string10;
        object = m[363];
        n = 2048;
        string10 = m[364];
        string9 = jr_03.LiteBansModule_31().c();
        flag5 = false;
        args[3] = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object + m[365] + n + ')' + string9 + string10 : (String)object + m[366] + n + ')' + string10;
        object = m[367];
        n = 36;
        string10 = m[368];
        string9 = jr_03.LiteBansModule_31().c();
        flag5 = false;
        SQLiteDriverHandler_5 jr_04 = jr_03;
        String string11 = string10 + m[369];
        boolean flag6 = false;
        args[4] = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_04.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object + m[370] + n + ')' + string9 + string11 : (String)object + m[371] + n + ')' + string11;
        object = m[372];
        n = 128;
        string10 = m[373];
        string9 = jr_03.LiteBansModule_31().c();
        flag5 = false;
        args[5] = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object + m[374] + n + ')' + string9 + string10 : (String)object + m[375] + n + ')' + string10;
        args[6] = string;
        object = jr_03;
        String string12 = m[376];
        boolean flag7 = false;
        args[7] = string12 + m[377];
        object = jr_03;
        string12 = m[378];
        flag7 = false;
        args[8] = string12 + m[379];
        object = jr_03;
        string12 = m[380];
        String string13 = m[381];
        boolean flag8 = false;
        String string14 = ((SQLiteDriverHandler_5)object).LiteBansModule_31().BaseCoreGenericHandler();
        args[9] = ObjectUtilities.BaseCoreGenericHandler((Object)string14, (Object)m[382]) || ObjectUtilities.BaseCoreGenericHandler((Object)string14, (Object)m[383]) ? string12 + m[384] + string13 : string12 + m[385] + ((SQLiteDriverHandler_5)object).LiteBansModule_31().e() + m[386] + string13;
        object = m[387];
        int n2 = 32;
        string13 = m[388];
        String string15 = jr_03.LiteBansModule_31().c();
        boolean bl9 = false;
        args[10] = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object + m[389] + n2 + ')' + string15 + string13 : (String)object + m[390] + n2 + ')' + string13;
        object = m[391];
        n2 = 32;
        string13 = m[392];
        string15 = jr_03.LiteBansModule_31().c();
        bl9 = false;
        args[11] = DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_03.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object + m[393] + n2 + ')' + string15 + string13 : (String)object + m[394] + n2 + ')' + string13;
        object = m[395];
        String string16 = m[396];
        boolean bl10 = false;
        args[12] = (String)object + m[397] + string16;
        object = m[398];
        string16 = m[399];
        bl10 = false;
        args[13] = (String)object + m[400] + string16;
        object = jr_03;
        string16 = m[401];
        String string17 = m[402];
        boolean bl11 = false;
        args[14] = string16 + m[403] + string17;
        object = m[404];
        string16 = m[405];
        boolean bl12 = false;
        args[15] = (String)object + m[406] + string16;
        args[16] = string2;
        object = jr_03;
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
        boolean flag = false;
        AutoCloseable autoCloseable = this.LiteBansModule_194();
        Throwable throwable = null;
        try {
            Object object = (Statement)autoCloseable;
            boolean flag2 = false;
            if (dc_03.c()) {
                Iterable iterable = dc_03.LiteBansModule_31();
                boolean flag3 = false;
                for (Object t2 : iterable) {
                    String string = ((SQLiteDriverHandler)t2).c();
                    boolean flag4 = false;
                    try {
                        Object object2 = object;
                        SQLiteDriverHandler aR2 = SQLiteDriverHandler.AsyncBackgroundTask_5(string);
                        boolean flag5 = false;
                        object2.execute(((Object)aR2).toString());
                    }
                    catch (SQLException sQLException) {
                        ConfigService.BaseCoreGenericHandler(dc_03.e(), sQLException, 0, 2, null);
                    }
                }
            } else {
                Iterable iterable = dc_03.LiteBansModule_31();
                boolean flag6 = false;
                for (Object t3 : iterable) {
                    Object object3;
                    CharSequence charSequence = (CharSequence)t3;
                    boolean flag7 = false;
                    boolean flag8 = false;
                    Object object4 = object;
                    boolean bl9 = false;
                    Object object5 = object3 = object4;
                    boolean bl10 = false;
                    object4.addBatch(((Object)charSequence).toString());
                }
                if (!((Collection)dc_03.LiteBansModule_31()).isEmpty()) {
                    object.executeBatch();
                }
            }
            object = KotlinUnitHandler.BaseCoreGenericHandler;
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
        SQLConnectionHandler dc_02 = new SQLConnectionHandler(this.LiteBansModule_240, this, flag, null, 8, null);
        if (flag2) {
            n2 = 0;
        } else {
            int n3;
            try {
                String string;
                String string2;
                Object object = BansHandler_2.i;
                CharSequence charSequence = m[506];
                flag4 = false;
                object = LiteBansModule_184.AsyncBackgroundTask_5(this.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e(m[507] + charSequence + m[508] + object), (Number)1))));
                n = 1;
                flag4 = false;
                if (object.next()) {
                    String string3;
                    Object object2 = object;
                    flag3 = false;
                    try {
                        string3 = object2.getString(n);
                    }
                    catch (SQLException sQLException) {
                        string3 = null;
                    }
                    string2 = string3;
                } else {
                    string2 = string = null;
                }
                if (string2 == null) {
                    string = LiteBansModule_336.LiteBansModule_31();
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
        Object object = configService;
        boolean flag5 = false;
        if (((ConfigService)object).g()) {
            ConfigService q_03 = object;
            boolean flag6 = false;
            q_03.BaseCoreGenericHandler((Object)(m[509] + n4 + m[510] + LiteBansModule_336.LiteBansModule_31()));
        }
        if (n4 <= 1168) {
            Object object3 = object = (ServerSyncService)this.LiteBansModule_240.BaseCoreGenericHandler(ServerSyncService.class);
            boolean flag7 = false;
            ((ServerSyncService)object3).c(this);
        }
        object = this.LiteBansModule_194();
        Throwable throwable = null;
        try {
            boolean flag8;
            Object object4;
            int n3;
            Object object5;
            Object object6 = (Statement)object;
            n = 0;
            this.plugin((Statement)object6);
            flag4 = ObjectUtilities.BaseCoreGenericHandler((Object)configService.LiteBansModule_194().ElementsHandler(), (Object)m[511]);
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
                object5 = object6;
                Object object7 = this.plugin(BansHandler_2.m, jr_02);
                boolean bl13 = false;
                object5.execute(object7.toString());
                object5 = object6;
                object7 = this.plugin(BansHandler_2.LiteBansModule_31, jr_02);
                bl13 = false;
                object5.execute(object7.toString());
                object7 = object6;
                Object object8 = BansHandler_2.Utf8Handler_2;
                CharSequence charSequence2 = m[514];
                boolean bl14 = false;
                object8 = SQLiteDriverHandler.e(m[515] + charSequence2 + m[516] + object8);
                charSequence2 = m[517];
                bl14 = false;
                CharSequence[] charSequenceArray2 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object8), charSequence2};
                boolean bl15 = false;
                CharSequence[] bl21 = charSequenceArray2;
                n3 = 0;
                int n7 = bl21.length;
                for (n5 = 0; n5 < n7; ++n5) {
                    CharSequence charSequence3 = charSequence = bl21[n5];
                    boolean flag6 = false;
                    if (charSequence3.length() > 0) continue;
                    String string = m[518];
                    throw new IllegalArgumentException(string.toString());
                }
                object8 = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object8) + m[519] + charSequence2));
                boolean bl17 = false;
                object5 = object7.executeQuery(object8.toString());
                boolean bl18 = false;
                object8 = (AutoCloseable)object5;
                Throwable throwable2 = null;
                try {
                    charSequenceArray = (ResultSet)object8;
                    n6 = 0;
                    while (object5.next()) {
                        Object object9 = object5;
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
                object5 = object6;
                object4 = BansHandler_2.Utf8Handler_2;
                boolean bl20 = false;
                object4 = SQLiteDriverHandler.e(m[521] + object4);
                CharSequence charSequence4 = m[522];
                flag8 = false;
                charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object4), charSequence4};
                n6 = 0;
                CharSequence[] charSequenceArray4 = charSequenceArray;
                boolean flag7 = false;
                n5 = charSequenceArray4.length;
                for (n3 = 0; n3 < n5; ++n3) {
                    CharSequence charSequence5;
                    charSequence = charSequence5 = charSequenceArray4[n3];
                    boolean bl16 = false;
                    if (charSequence.length() > 0) continue;
                    String string = m[523];
                    throw new IllegalArgumentException(string.toString());
                }
                object4 = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object4) + m[524] + charSequence4));
                boolean bl23 = false;
                object5.executeUpdate(object4.toString());
            }
            if (!ObjectUtilities.BaseCoreGenericHandler((Object)configService.LiteBansModule_194().ElementsHandler(), (Object)m[525])) {
                object5 = this.LiteBansModule_31();
                if (bl11) {
                    object4 = object6;
                    CharSequence charSequence = BansHandler_2.Utf8Handler_2;
                    flag8 = false;
                    charSequence = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_240(SQLiteDriverHandler.e(m[526] + charSequence), m[527]));
                    flag8 = false;
                    object4.execute(((Object)charSequence).toString());
                }
                if (bl10 && !bl12) {
                    object4 = object6;
                    CharSequence charSequence = BansHandler_2.LiteBansModule_31;
                    flag8 = false;
                    charSequence = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_194(SQLiteDriverHandler.e(m[528] + charSequence), m[529]));
                    flag8 = false;
                    object4.execute(((Object)charSequence).toString());
                    object4 = object6;
                    charSequence = BansHandler_2.LiteBansModule_31;
                    flag8 = false;
                    charSequence = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[530] + charSequence), m[531]));
                    flag8 = false;
                    object4.executeUpdate(((Object)charSequence).toString());
                }
                if (flag || bl9) {
                    object4 = object5;
                    boolean bl24 = false;
                    for (BansHandler_2 kL2 : BansHandler_2.values()) {
                        if (kL2.BaseCoreGenericHandler()) {
                            dc_02.BaseCoreGenericHandler(kL2);
                            if (kL2 != BansHandler_2.GnuSparseMapHandler) {
                                dc_02.BaseCoreGenericHandler(LiteBansModule_371.BaseCoreGenericHandler(m[532], LiteBansModule_107.BaseCoreGenericHandler));
                                dc_02.BaseCoreGenericHandler(LiteBansModule_371.BaseCoreGenericHandler(m[533], LiteBansModule_335.LiteBansModule_31));
                                dc_02.BaseCoreGenericHandler(LiteBansModule_371.BaseCoreGenericHandler(m[534], LiteBansModule_406.BaseCoreGenericHandler));
                                dc_02.BaseCoreGenericHandler(LiteBansModule_371.BaseCoreGenericHandler(m[535], LiteBansModule_162.LiteBansModule_31));
                            }
                            dc_02.BaseCoreGenericHandler(LiteBansModule_371.BaseCoreGenericHandler(m[536], new TemplateHandler((SQLiteDriverHandler_5)object4)));
                            dc_02.BaseCoreGenericHandler(LiteBansModule_371.BaseCoreGenericHandler(m[537], new ServerOriginHandler((SQLiteDriverHandler_5)object4)));
                            dc_02.BaseCoreGenericHandler(LiteBansModule_371.BaseCoreGenericHandler(m[538], arg_0 -> SQLiteDriverHandler_3.LiteBansModule_31((SQLiteDriverHandler_5)object4, arg_0)));
                            dc_02.BaseCoreGenericHandler(LiteBansModule_371.BaseCoreGenericHandler(m[539], arg_0 -> SQLiteDriverHandler_3.BaseCoreGenericHandler((SQLiteDriverHandler_5)object4, arg_0)));
                        }
                        if (kL2 == BansHandler_2.g || !DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(configService.LiteBansModule_194().ElementsHandler()) || n4 > 680) continue;
                        BansHandler_2 kL3 = kL2;
                        n3 = 0;
                        SQLiteDriverHandler.g(SQLiteDriverHandler.e(m[540] + kL3), ((SQLiteDriverHandler_5)object5).LiteBansModule_31().c());
                    }
                    if (flag || n4 < 883) {
                        dc_02.BaseCoreGenericHandler(BansHandler_2.i);
                        dc_02.BaseCoreGenericHandler(LiteBansModule_371.BaseCoreGenericHandler(m[541], new AcceptHandler((SQLiteDriverHandler_5)object4)));
                    }
                    if (!((Collection)dc_02).isEmpty()) {
                        this.LiteBansModule_240.getLogger().info(m[542]);
                        this.plugin(dc_02);
                        this.LiteBansModule_240.getLogger().info(m[543]);
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
            CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)object, throwable);
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
    public List BaseCoreGenericHandler(@NotNull LiteBansModule_297 iA2, @NotNull BanHandler a_2, @NotNull String string, boolean flag, int n) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, iA2, a_2, string, flag, n);
    }

    @Override
    public List BaseCoreGenericHandler(@NotNull SilentHandler dZ2, int n) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, dZ2, n);
    }

    @Override
    public List BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull BanHandler a_2, boolean flag, int n) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, sender, a_2, flag, n);
    }

    @Override
    public List LiteBansModule_31(@NotNull ResultSet resultSet, @NotNull BanHandler a_2) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, resultSet, a_2);
    }

    @Override
    public String BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, sender);
    }

    @Override
    public CharSequence LiteBansModule_31(@NotNull CharSequence charSequence, @NotNull CommandSenderWrapper sender) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, charSequence, sender);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @Nullable String string, @Nullable String string2, boolean flag) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, charSequence, string, string2, flag);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, charSequence);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @Nullable LiteBansModule_297 iA2, boolean flag) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, charSequence, iA2, flag);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @Nullable CommandSenderWrapper sender) {
        return AllHandler_3.LiteBansModule_31(this, charSequence, sender);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull LiteBansModule_113 d92) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, charSequence, d92);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @Nullable SilentHandler dZ2, boolean flag) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, charSequence, dZ2, flag);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @Nullable SilentHandler dZ2, @Nullable LiteBansModule_297 iA2, boolean flag) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, charSequence, dZ2, iA2, flag);
    }

    @Override
    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, charSequence, string, string2, string3, string4, string5);
    }

    @Override
    public boolean BaseCoreGenericHandler(@NotNull SilentHandler dZ2, @NotNull CommandSenderWrapper sender) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, dZ2, sender);
    }

    @Override
    public boolean BaseCoreGenericHandler(@Nullable SilentHandler dZ2) {
        return AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)this, dZ2);
    }

    private static final LiteBansModule_60 LiteBansModule_31(String string, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        String[] args = new String[]{string};
        boolean flag = false;
        LiteBansModule_60 bT5 = bT3 = bT4;
        boolean flag2 = false;
        String[] filteredArgs = args;
        boolean flag3 = false;
        int n = filteredArgs.length;
        for (int i = 0; i < n; ++i) {
            String string2;
            String string3 = string2 = filteredArgs[i];
            boolean flag4 = false;
            bT4.BaseCoreGenericHandler(string3);
        }
        return bT3;
    }

    private static final LiteBansModule_60 c(String string, String string2, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        String[] args = new String[]{string, string2, string2};
        boolean flag = false;
        LiteBansModule_60 bT5 = bT3 = bT4;
        boolean flag2 = false;
        String[] filteredArgs = args;
        boolean flag3 = false;
        int n = filteredArgs.length;
        for (int i = 0; i < n; ++i) {
            String string3;
            String string4 = string3 = filteredArgs[i];
            boolean flag4 = false;
            bT4.BaseCoreGenericHandler(string4);
        }
        return LiteBansModule_184.BaseCoreGenericHandler(bT3);
    }

    private static final LiteBansModule_60 LiteBansModule_31(String string, String string2, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        String[] args = new String[]{string, string2, string2};
        boolean flag = false;
        LiteBansModule_60 bT5 = bT3 = bT4;
        boolean flag2 = false;
        String[] filteredArgs = args;
        boolean flag3 = false;
        int n = filteredArgs.length;
        for (int i = 0; i < n; ++i) {
            String string3;
            String string4 = string3 = filteredArgs[i];
            boolean flag4 = false;
            bT4.BaseCoreGenericHandler(string4);
        }
        return bT3;
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(LiteBansModule_60 bT2) {
        return LiteBansModule_184.BaseCoreGenericHandler(bT2);
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(AllHandler_2 jy2, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        boolean flag = false;
        LiteBansModule_60 bT5 = bT3 = bT4;
        boolean flag2 = false;
        ((AllHandler)jy2).BaseCoreGenericHandler(bT5);
        return bT3;
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(String string, String string2, LiteBansModule_65 c12, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        String[] args = new String[]{string, string2};
        boolean flag = false;
        LiteBansModule_60 bT5 = bT3 = bT4;
        boolean flag2 = false;
        String[] filteredArgs = args;
        boolean flag3 = false;
        int n = filteredArgs.length;
        for (int i = 0; i < n; ++i) {
            String string3;
            String string4 = string3 = filteredArgs[i];
            boolean flag4 = false;
            bT4.BaseCoreGenericHandler(string4);
        }
        bT4 = bT3;
        boolean flag5 = false;
        return bT4.BaseCoreGenericHandler(c12.LiteBansModule_194());
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(String string, LiteBansModule_65 c12, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3 = bT2.BaseCoreGenericHandler(string);
        boolean flag = false;
        return bT3.BaseCoreGenericHandler(c12.LiteBansModule_194());
    }

    private static final LiteBansModule_60 c(LiteBansModule_60 bT2) {
        return LiteBansModule_184.BaseCoreGenericHandler(bT2);
    }

    private static final LiteBansModule_60 LiteBansModule_31(long l3, LiteBansModule_60 bT2) {
        return bT2.BaseCoreGenericHandler(l3);
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(String string, String string2, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        String[] args = new String[]{string, string2};
        boolean flag = false;
        LiteBansModule_60 bT5 = bT3 = bT4;
        boolean flag2 = false;
        String[] filteredArgs = args;
        boolean flag3 = false;
        int n = filteredArgs.length;
        for (int i = 0; i < n; ++i) {
            String string3;
            String string4 = string3 = filteredArgs[i];
            boolean flag4 = false;
            bT4.BaseCoreGenericHandler(string4);
        }
        return bT3;
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(String string, LiteBansModule_60 bT2) {
        return bT2.BaseCoreGenericHandler(string);
    }

    private static final LiteBansModule_60 LiteBansModule_31(LiteBansModule_60 bT2) {
        return LiteBansModule_184.BaseCoreGenericHandler(bT2);
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(long l3, LiteBansModule_60 bT2) {
        return bT2.BaseCoreGenericHandler(l3);
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(LiteBansModule_65 c12, LiteBansModule_60 bT2) {
        return bT2.BaseCoreGenericHandler(c12.LiteBansModule_194());
    }

    private static final LiteBansModule_60 c(String string, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        boolean flag = false;
        LiteBansModule_60 bT5 = bT3 = bT4;
        boolean flag2 = false;
        bT4.BaseCoreGenericHandler(string);
        return bT3;
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(Timestamp timestamp, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        boolean flag = false;
        LiteBansModule_60 bT5 = bT3 = bT4;
        boolean flag2 = false;
        bT4.BaseCoreGenericHandler(timestamp);
        return bT3;
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(AllHandler jJ2, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        boolean flag = false;
        LiteBansModule_60 bT5 = bT3 = bT4;
        boolean flag2 = false;
        jJ2.BaseCoreGenericHandler(bT5);
        return bT3;
    }

    private static final SQLiteDriverHandler[] LiteBansModule_31(SQLiteDriverHandler_5 jr_02, BansHandler_2 kL2) {
        SQLiteDriverHandler[] aRArray = new SQLiteDriverHandler[2];
        CharSequence charSequence = kL2;
        int n = 0;
        String string = SQLiteDriverHandler.e(m[544] + charSequence);
        charSequence = m[545];
        n = 32;
        String string2 = m[546];
        String string3 = jr_02.LiteBansModule_31().c();
        boolean flag = false;
        aRArray[0] = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_194(string, DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(jr_02.LiteBansModule_31().BaseCoreGenericHandler()) ? (String)charSequence + m[547] + n + ')' + string3 + string2 : (String)charSequence + m[548] + n + ')' + string2));
        charSequence = kL2;
        n = 0;
        aRArray[1] = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[549] + charSequence), m[550]), m[551]));
        return aRArray;
    }

    private static final SQLiteDriverHandler[] BaseCoreGenericHandler(SQLiteDriverHandler_5 jr_02, BansHandler_2 kL2) {
        SQLiteDriverHandler[] aRArray = new SQLiteDriverHandler[2];
        Object object = kL2;
        boolean flag = false;
        String string = SQLiteDriverHandler.e(m[552] + object);
        object = jr_02;
        String string2 = m[553];
        String string3 = m[554];
        boolean flag2 = false;
        aRArray[0] = SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.LiteBansModule_194(string, string2 + m[555] + string3));
        object = kL2;
        boolean flag3 = false;
        object = SQLiteDriverHandler.c(SQLiteDriverHandler.e(m[556] + object), m[557]);
        CharSequence charSequence = m[558];
        int n = 1;
        SQLiteDriverHandler[] aRArray2 = aRArray;
        boolean flag4 = false;
        CharSequence[] charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object), charSequence};
        boolean flag5 = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean flag6 = false;
        int n2 = charSequenceArray2.length;
        for (int i = 0; i < n2; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean flag7 = false;
            if (charSequence3.length() > 0) continue;
            String string4 = m[559];
            throw new IllegalArgumentException(string4.toString());
        }
        String string5 = SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object) + m[560] + charSequence);
        aRArray2[n] = SQLiteDriverHandler.AsyncBackgroundTask_5(string5);
        return aRArray;
    }

    private static final LiteBansModule_60 AsyncBackgroundTask_5(LiteBansModule_60 bT2) {
        return bT2;
    }

    public static final /* synthetic */ LiteBansModule_178 BaseCoreGenericHandler() {
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
        SQLiteDriverHandler_3.LiteBansModule_240();
        LiteBansModule_401 = new NameHandler_2(null);
        BaseCoreGenericHandler = LiteBansModule_401.BaseCoreGenericHandler(SQLiteDriverHandler_3::AsyncBackgroundTask_5);
        i = 64;
    }

    private static final void LiteBansModule_240() {
        m = new String[]{"active=", " AND(until<1 OR until>?)", "uuid,ip,reason,banned_by_uuid,banned_by_name,time,until,template,server_scope,server_origin,silent,ipban,ipban_wildcard,active", "?::bit,", "pgsql", "Created new ", " for server:", "Adding entry: ", "INSERT INTO ", ")VALUES(", "#", "#", "Player name \"", "\" length > ", "UUID \"", "\" length > 36", "UPDATE ", "date=CURRENT_TIMESTAMP", "ip=?", "Failed ", " WHERE ", "uuid=?", "name=?", "DELETE FROM ", "name{=?}", "Failed ", " WHERE ", "uuid=?", "name,uuid,ip", "?", "?,", "INSERT INTO ", ")VALUES(", "New login record: [", "Duplicate entry", "COUNT(*)", "uuid=?", " OR(ipban_wildcard={true} AND active={true} AND ? LIKE ip)", " OR(ipban_wildcard={true})", " OR(ipban={true} AND(ip=?", ")AND((time+", ")>?", "))", " OR(ipban={true} AND(ip=?", "))", ")AND template NOT IN(", ",", "time", "SELECT 1 FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME LIKE '", "' AND COLUMN_NAME='", "' LIMIT 1", "LiteBansModule_243", "ip LIKE ?", "SELECT ", " FROM ", "Failed ", " WHERE ", "date", "name", "uuid", "ip", "date", "uuid IS NOT NULL", "__ALL__", "time", "AND ", "active=", " AND(until<1 OR until>?)", "", "", " OR(ipban_wildcard=", " AND active=", " AND ? LIKE ip)", " OR(ipban_wildcard=", "ORDER BY time DESC LIMIT 1", "LIMIT 1", "(ipban=", " AND(ip=?", ")AND((time+", ")>?", "))", "(ipban=", " AND(ip=?", "))", "SELECT * FROM ", " WHERE(uuid=?", "SELECT * FROM ", " WHERE(", "SELECT * FROM ", " WHERE((uuid=? OR", "Database is slow! Pooled connection took ", " seconds to retrieve result from ", "Database is slow! Pooled connection took ", " seconds to retrieve result from ", "UUID: ", ": ", "Player is name-banned: ", " - ", " ID is ", "SELECT COUNT(*) FROM ", "", "WHERE ", "active=", " AND(until<1 OR until>?)", "uuid IS NOT NULL", "AND", " WHERE ", "WHERE", " WHERE ", "1", "SELECT ", " FROM ", "uuid=?", "Failed ", " WHERE ", "uuid,type", "?", "?,", "INSERT INTO ", ")VALUES(", "DELETE FROM ", "uuid=?", "Failed ", " WHERE ", "[CONSOLE]", "[CONSOLE]", "CONSOLE", "#", "SELECT ", " FROM ", " WHERE ", " ORDER BY date DESC LIMIT 1", "[CONSOLE]", "[CONSOLE]", "CONSOLE", "#", "SELECT ", " FROM ", " WHERE ", " ORDER BY date DESC LIMIT ", "{column.SQLiteDriverHandler_4}", "SELECT ", " FROM ", "uuid=?", "Failed ", " WHERE ", "time=?", "SQLiteDriverHandler_4", "SQLiteDriverHandler_4", "Player name \"", "\" length > ", "UUID \"", "\" length > 36", "*", "SELECT ", " FROM ", "name{=?}", "Failed ", " WHERE ", "uuid=?", "ip=?", "LiteBansModule_243", "mysql", "SELECT * FROM ", "Failed to add ", ": ", " - ", "uuid", "ip", "reason", "banned_by_uuid", "#", "banned_by_name", "server_scope", "server_origin", "time", "until", "template", "silent", "ipban", "active", "warned", "SQLiteDriverHandler_4", "UTC", "removed_by_date", "removed_by_uuid", "removed_by_name", "removed_by_reason", "pgsql", "(active={false} OR(until>0 AND ", ">until))", "DELETE FROM ", "uuid=?", "Failed ", " WHERE ", "time>?", "COUNT(*)", "SELECT ", " FROM ", "(uuid=? OR ipban={true} AND ip=?)", "Failed ", " WHERE ", "template=?", "uuid=?", "Failed ", " WHERE ", "template=?", "active=", " AND(until<1 OR until>?)", "time>?", "template", "SELECT ", " FROM ", "(uuid=? OR ipban={true} AND ip=?)", "Failed ", " WHERE ", "uuid=?", "Failed ", " WHERE ", "active=", " AND(until<1 OR until>?)", "time>?", "", "template=? OR ", "] Add ", " from ", " = ", "BaseCoreGenericHandler:", "sort", "00", "01:", "UPDATE ", "active={false}", "DELETE FROM ", "Failed ", " WHERE ", "active={false}", "DROP TABLE ", "DELETE FROM ", "Failed ", " WHERE ", "UPDATE ", "template=255", "UPDATE ", "until=?,reason=?", "SQLiteDriverHandler_4=?", "Failed ", " WHERE ", "active=", " AND(until<1 OR until>?)", "SQLiteDriverHandler_4", "ip", "uuid", "UPDATE ", "active={false},removed_by_date=NOW(),removed_by_uuid=?,removed_by_name=?,removed_by_reason=?", "=?", "Failed ", " WHERE ", "active=", " AND(until<1 OR until>?)", "DELETE FROM ", "SQLiteDriverHandler_4=?", "Failed ", " WHERE ", "UPDATE ", "active={false},removed_by_date=NOW(),removed_by_uuid=?,removed_by_name=?,removed_by_reason=?", "SQLiteDriverHandler_4=?", "Failed ", " WHERE ", " SQLiteDriverHandler_4=", "DELETE FROM ", "banned_by_uuid=?", "Failed ", " WHERE ", "time>?", "UPDATE ", "active={true},removed_by_name=NULL,removed_by_uuid=NULL,removed_by_reason=NULL", "active", "Failed ", " WHERE ", "removed_by_uuid=?", "removed_by_date>?", "UPDATE ", "warned", "uuid=?", "Failed ", " WHERE ", "warned", "UPDATE ", "active={false},removed_by_name='#expired',removed_by_date=NOW()", "active={true}", "Failed ", " WHERE ", "until>0", "until<", "UPDATE ", "ipban={false}", "ipban={true}", "Failed ", " WHERE ", "ipban_wildcard={false}", "(time+", ")<", "Expired ", " entries(until<", "Deadlock ", "UPDATE ", "ip=?", "uuid=?", "Failed ", " WHERE ", "ip=?", "#", "SELECT * FROM ", " WHERE(", "active=", " AND(until<1 OR until>?)", ")AND(", "uuid=?", " OR(ipban=", " AND ", "ip=?)", " OR ", ")AND(server_scope='*' OR server_scope=? OR server_scope=?)", ": ", "Renaming table \"", "\" to \"", "RENAME TABLE ", " TO ", "", "", "warned", " NOT NULL", " BIT", "removed_by_uuid", "", " VARCHAR(", " VARCHAR(", "removed_by_name", "", " VARCHAR(", " VARCHAR(", "removed_by_reason", "", " VARCHAR(", " VARCHAR(", "removed_by_date", "", " TIMESTAMP", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "uuid", " CHARACTER SET ascii COLLATE ascii_general_ci", "", " VARCHAR(", " VARCHAR(", "ip", " CHARACTER SET ascii COLLATE ascii_general_ci", "", " VARCHAR(", " VARCHAR(", "reason", "", " VARCHAR(", " VARCHAR(", "banned_by_uuid", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "banned_by_name", "", " VARCHAR(", " VARCHAR(", "time", " BIGINT NOT NULL", "until", " BIGINT NOT NULL", "template", " DEFAULT 255", "pgsql", "LiteBansModule_243", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "server_scope", "", " VARCHAR(", " VARCHAR(", "server_origin", "", " VARCHAR(", " VARCHAR(", "silent", " NOT NULL", " BIT", "ipban", " NOT NULL", " BIT", "ipban_wildcard", " NOT NULL DEFAULT {false}", " BIT", "active", " NOT NULL", " BIT", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "info", " INT", " NOT NULL", "msg", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "time", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "uuid", "pgsql", " BYTEA NOT NULL", "BINARY", ")NOT NULL", "type", "", "pgsql", "LiteBansModule_243", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "name", "", " VARCHAR(", " VARCHAR(", "uuid", "", " VARCHAR(", " VARCHAR(", "ip", "", " VARCHAR(", " VARCHAR(", "SQLiteDriverHandler_4", "PRIMARY KEY(", "", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "name", "", " VARCHAR(", " VARCHAR(", "uuid", "", " VARCHAR(", " VARCHAR(", "ip", "", " VARCHAR(", " VARCHAR(", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "name", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "uuid", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "SQLiteDriverHandler_4", "PRIMARY KEY(", "build", "SELECT ", " FROM ", "Database build ", " => ", "mysql", "mode", "warned", "*", "SELECT ", " FROM ", "mode<>0", "Failed ", " WHERE ", "mode", "DELETE FROM ", "mode<>0", "Failed ", " WHERE ", "sqlite", "ALTER TABLE ", "mode", "ALTER TABLE ", "warned BIT", "UPDATE ", "warned={true}", "removed_by_uuid", "removed_by_name", "removed_by_date", "removed_by_reason", "template", "server_origin", "server_scope", "ipban_wildcard", "ALTER TABLE ", "accept", "Upgrading database tables.. + ", "Upgrade ", "ALTER TABLE ", "server_scope", "", " VARCHAR(", " VARCHAR(", "UPDATE ", "server_scope='*'", "server_scope", "ALTER TABLE ", "ipban_wildcard", " NOT NULL DEFAULT {false}", " BIT", "UPDATE ", "ipban_wildcard={true}", "ip like '%\\%%'", "Failed ", " WHERE "};
    }
}

