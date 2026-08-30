package litebans;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DiscordEmbedBuilder {
    private DiscordEmbedBuilder() {
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 v1, @NotNull NoneHandler_2 v2, @NotNull String v3) {
        if (((CharSequence)v3).length() == 0) {
            return;
        }
        var4_4 = v2;
        var5_5 = false;
        var6_6 = new ContentHandler(v3);
        v0 = var4_4.q();
        ObjectUtilities.BaseCoreGenericHandler(v0);
        var7_7 = v0;
        v1 = MessageKey.LiteBansModule_31("WEB_" + var4_4.ServerSyncService() + "_TITLE");
        if (v1 == null) {
            v1 = "";
        }
        var8_8 = v1;
        var9_9 = MessageKey.LiteBansModule_31("WEB_" + var4_4.ServerSyncService() + "_CONTENT");
        var10_10 = ContentHandler.GnuSparseMapHandler.BaseCoreGenericHandler(v1, MessageKey.LiteBansModule_31("WEB_" + var4_4.ServerSyncService() + "_COLOR"));
        v2 = var11_11 = MessageKey.LiteBansModule_31("WEB_" + var4_4.ServerSyncService() + "_THUMB");
        if (v2 != null ? StringUtilities.LiteBansModule_31((CharSequence)v2) : false) ** GOTO lbl-1000
        v3 = var11_11;
        v4 = v3 != null ? !StringUtilities.LiteBansModule_31(v3, "https://", false, 2, null) : false;
        if (v4) lbl-1000:
        // 2 sources

        {
            var11_11 = null;
        } else {
            v5 = var11_11;
            v6 = var11_11 = v5 != null && (v5 = v1.BaseCoreGenericHandler(v5, var4_4.H(), var4_4.AsyncBackgroundTask_5(), false)) != null && (v5 = v1.BaseCoreGenericHandler(v5, var7_7, var4_4.AsyncBackgroundTask_22(), false)) != null ? v5.toString() : null;
        }
        if ((v7 = MessageKey.LiteBansModule_31("WEB_" + var4_4.ServerSyncService() + "_FIELDS")) == null) {
            v7 = "";
        }
        var12_12 = v7;
        var13_13 = ContentHandler.GnuSparseMapHandler.BaseCoreGenericHandler(v1, var12_12, var4_4);
        var8_8 = v1.BaseCoreGenericHandler(v1.BaseCoreGenericHandler((CharSequence)var8_8, var4_4.H(), var4_4.AsyncBackgroundTask_5(), false), var7_7, var4_4.AsyncBackgroundTask_22(), false).toString();
        var14_14 = var9_9;
        ObjectUtilities.BaseCoreGenericHandler((Object)var14_14);
        var9_9 = v1.BaseCoreGenericHandler(v1.BaseCoreGenericHandler((CharSequence)var14_14, var4_4.H(), var4_4.AsyncBackgroundTask_5(), false), var7_7, var4_4.AsyncBackgroundTask_22(), false).toString();
        ContentHandler.GnuSparseMapHandler.BaseCoreGenericHandler(v1, var6_6, var8_8, var9_9, var10_10, var11_11, var13_13, StringUtilities.BaseCoreGenericHandler((CharSequence)var12_12, (CharSequence)"\n\n", false, 2, null) == false);
    }

    private final LiteBansModule_354[] BaseCoreGenericHandler(LiteBansModule_82 ch2, String string, NoneHandler_2 cz2) {
        LiteBansModule_354[] jTArray;
        Object object;
        NoneHandler_2 cz3 = cz2;
        boolean flag = false;
        if (StringUtilities.LiteBansModule_31((CharSequence)string)) {
            return null;
        }
        DiscordEmbedBuilder bc_02 = ContentHandler.GnuSparseMapHandler;
        CharSequence charSequence = ch2.BaseCoreGenericHandler((CharSequence)string, cz3.q(), cz3.AsyncBackgroundTask_22(), false);
        boolean flag2 = false;
        ArrayList<LiteBansModule_354> arrayList = new ArrayList<LiteBansModule_354>();
        String string2 = bc_02.BaseCoreGenericHandler(charSequence);
        List list = null;
        ObjectUtilities.BaseCoreGenericHandler((Object)string2);
        if (StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)"\n\n", false, 2, null)) {
            object = new String[]{"\n\n"};
            list = StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (String[])object, false, 0, 6, null);
        } else {
            object = new char[1];
            object[0] = (String)10;
            list = StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (char[])object, false, 0, 6, null);
        }
        object = list;
        boolean flag3 = false;
        Object object2 = object.iterator();
        while (object2.hasNext()) {
            Object t2 = object2.next();
            String string3 = (String)t2;
            boolean flag4 = false;
            if (((CharSequence)string3).length() == 0) continue;
            Object object3 = new char[]{':'};
            List list2 = StringUtilities.BaseCoreGenericHandler((CharSequence)string3, object3, false, 0, 6, null);
            if (list2.size() <= 1) {
                if (arrayList.isEmpty()) {
                    ((Collection)arrayList).add(LiteBansModule_371.BaseCoreGenericHandler(string3, string3));
                    continue;
                }
                object3 = (LiteBansModule_354)CollectionUtilities.BaseCoreGenericHandler(arrayList);
                arrayList.set(CollectionUtilities.LiteBansModule_31(arrayList), LiteBansModule_371.BaseCoreGenericHandler(object3.LiteBansModule_31(), (String)object3.e() + '\n' + string3));
                continue;
            }
            ((Collection)arrayList).add(LiteBansModule_371.BaseCoreGenericHandler(list2.get(0), list2.get(1)));
        }
        if (!((Collection)arrayList).isEmpty()) {
            object = arrayList;
            flag3 = false;
            object2 = object;
            jTArray = object2.toArray(new LiteBansModule_354[0]);
        } else {
            jTArray = null;
        }
        return jTArray;
    }

    public final int BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull CharSequence charSequence) {
        int n = 0xFFFFFF;
        try {
            n = ((Number)Integer.valueOf(StringUtilities.LiteBansModule_31(((Object)charSequence).toString(), '#', null, 2, null), 16)).intValue();
        }
        catch (NumberFormatException numberFormatException) {
            ch2.e().getLogger().warning("Invalid color format InitializerHandler_3 embed configuration, ");
        }
        return n;
    }

    public final String BaseCoreGenericHandler(@NotNull CharSequence charSequence) {
        return BlackHandler.BaseCoreGenericHandler((CharSequence)HoverTextFormatter.LiteBansModule_31.BaseCoreGenericHandler(((Object)charSequence).toString()));
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull ContentHandler i32, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, int n, @Nullable String string, @Nullable LiteBansModule_354[] jTArray, boolean flag) {
        if (charSequence2.length() == 0 && jTArray == null) {
            return;
        }
        try {
            Object[] objectArray;
            LiteBansModule_211 g92 = new LiteBansModule_211(this.plugin(charSequence), this.plugin(charSequence2), null, n, null, string, null, null, null, 468, null);
            if (jTArray != null) {
                objectArray = jTArray;
                boolean flag2 = false;
                int n2 = objectArray.length;
                for (int i = 0; i < n2; ++i) {
                    Object object;
                    Object object2 = object = objectArray[i];
                    boolean flag3 = false;
                    String string2 = (String)((LiteBansModule_354)object2).BaseCoreGenericHandler();
                    String string3 = (String)((LiteBansModule_354)object2).c();
                    g92.BaseCoreGenericHandler(string2, string3, flag);
                }
            }
            objectArray = new LiteBansModule_211[]{g92};
            i32.BaseCoreGenericHandler(CollectionUtilities.c(objectArray));
            i32.c();
        }
        catch (Exception exception) {
            if (exception instanceof IllegalArgumentException || exception instanceof MalformedURLException) {
                ch2.e().getLogger().warning("Unable to post Discord message to invalid URL: '" + i32.AsyncBackgroundTask_5() + "': " + exception.getLocalizedMessage());
            }
            ch2.e().getLogger().warning("Attempted to post Discord message but encountered HikariDataSource exception!\nJSON data:" + i32.LiteBansModule_31());
            ch2.AsyncBackgroundTask_5().BaseCoreGenericHandler(exception);
        }
    }

    public /* synthetic */ DiscordEmbedBuilder(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"WEB_", "_TITLE", "", "WEB_", "_CONTENT", "WEB_", "_COLOR", "WEB_", "_THUMB", "https://", "WEB_", "_FIELDS", "", "\n\n", "\n\n", "\n\n", "\n\n", "\n\n", "Invalid color format InitializerHandler_3 embed configuration, ", "Unable to post Discord message to invalid URL: '", "': ", "Attempted to post Discord message but encountered HikariDataSource exception!\nJSON data:"};
    }

    }

