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

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 v1, @NotNull NoneHandler_2 v2, @NotNull String v3) {
        if (((CharSequence)v3).length() == 0) {
            return;
        }
        v4 = v2;
        v5 = new ContentHandler(v3);
        v0 = v4.q();
        ObjectUtilities.BaseCoreGenericHandler(v0);
        v6 = v0;
        v1 = MessageKey.LiteBansModule_31("WEB_" + v4.ServerSyncService() + "_TITLE");
        if (v1 == null) {
            v1 = "";
        }
        v7 = v1;
        v8 = MessageKey.LiteBansModule_31("WEB_" + v4.ServerSyncService() + "_CONTENT");
        v9 = ContentHandler.GnuSparseMapHandler.BaseCoreGenericHandler(v1, MessageKey.LiteBansModule_31("WEB_" + v4.ServerSyncService() + "_COLOR"));
        v2 = v10 = MessageKey.LiteBansModule_31("WEB_" + v4.ServerSyncService() + "_THUMB");
        if (v2 != null ? StringUtilities.LiteBansModule_31((CharSequence)v2) : false) ** GOTO lbl-1000
        v3 = v10;
        v4 = v3 != null ? !StringUtilities.LiteBansModule_31(v3, "https://", false, 2, null) : false;
        if (v4) lbl-1000:
                {
        } else {
            v5 = v10;
            v6 = v10 = v5 != null && (v5 = v1.BaseCoreGenericHandler(v5, v4.H(), v4.AsyncBackgroundTask_5(), false)) != null && (v5 = v1.BaseCoreGenericHandler(v5, v6, v4.AsyncBackgroundTask_22(), false)) != null ? v5.toString() : null;
        }
        if ((v7 = MessageKey.LiteBansModule_31("WEB_" + v4.ServerSyncService() + "_FIELDS")) == null) {
            v7 = "";
        }
        v11 = v7;
        v12 = ContentHandler.GnuSparseMapHandler.BaseCoreGenericHandler(v1, v11, v4);
        v7 = v1.BaseCoreGenericHandler(v1.BaseCoreGenericHandler((CharSequence)v7, v4.H(), v4.AsyncBackgroundTask_5(), false), v6, v4.AsyncBackgroundTask_22(), false).toString();
        v13 = v8;
        ObjectUtilities.BaseCoreGenericHandler((Object)v13);
        v8 = v1.BaseCoreGenericHandler(v1.BaseCoreGenericHandler((CharSequence)v13, v4.H(), v4.AsyncBackgroundTask_5(), false), v6, v4.AsyncBackgroundTask_22(), false).toString();
        ContentHandler.GnuSparseMapHandler.BaseCoreGenericHandler(v1, v5, v7, v8, v9, v10, v12, StringUtilities.BaseCoreGenericHandler((CharSequence)v11, (CharSequence)"\n\n", false, 2, null) == false);
    }

    private final LiteBansModule_356[] BaseCoreGenericHandler(LiteBansModule_83 ch2, String string, NoneHandler_2 cz2) {
        LiteBansModule_356[] jTArray;
        NoneHandler_2 cz3 = cz2;
        if (StringUtilities.LiteBansModule_31((CharSequence)string)) {
            return null;
        }
        DiscordEmbedBuilder bc_02 = ContentHandler.GnuSparseMapHandler;
        CharSequence charSequence = ch2.BaseCoreGenericHandler((CharSequence)string, cz3.q(), cz3.AsyncBackgroundTask_22(), false);
        ArrayList<LiteBansModule_356> arrayList = new ArrayList<LiteBansModule_356>();
        String string2 = bc_02.BaseCoreGenericHandler(charSequence);
        List list = null;
        ObjectUtilities.BaseCoreGenericHandler((Object)string2);
        if (StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)"\n\n", false, 2, null)) {
            targetObj = new String[]{"\n\n"};
            list = StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (String[])targetObj, false, 0, 6, null);
        } else {
            targetObj = new char[1];
            targetObj[0] = (String)10;
            list = StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (char[])targetObj, false, 0, 6, null);
        }
        targetObj = list;
        Object contextObj = targetObj.iterator();
        while (contextObj.hasNext()) {
            Object t2 = contextObj.next();
            String string3 = (String)t2;
            if (((CharSequence)string3).length() == 0) continue;
            Object resultObj = new char[]{':'};
            List list2 = StringUtilities.BaseCoreGenericHandler((CharSequence)string3, resultObj, false, 0, 6, null);
            if (list2.size() <= 1) {
                if (arrayList.isEmpty()) {
                    ((Collection)arrayList).add(LiteBansModule_373.BaseCoreGenericHandler(string3, string3));
                    continue;
                }
                resultObj = (LiteBansModule_356)CollectionUtilities.BaseCoreGenericHandler(arrayList);
                arrayList.set(CollectionUtilities.LiteBansModule_31(arrayList), LiteBansModule_373.BaseCoreGenericHandler(resultObj.LiteBansModule_31(), (String)resultObj.e() + '\n' + string3));
                continue;
            }
            ((Collection)arrayList).add(LiteBansModule_373.BaseCoreGenericHandler(list2.get(0), list2.get(1)));
        }
        if (!((Collection)arrayList).isEmpty()) {
            targetObj = arrayList;
            flag3 = false;
            contextObj = targetObj;
            jTArray = contextObj.toArray(new LiteBansModule_356[0]);
        } else {
            jTArray = null;
        }
        return jTArray;
    }

    public final int BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CharSequence charSequence) {
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

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull ContentHandler i32, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, int n, @Nullable String string, @Nullable LiteBansModule_356[] jTArray, boolean flag) {
        if (charSequence2.length() == 0 && jTArray == null) {
            return;
        }
        try {
            Object[] objectArray;
            LiteBansModule_212 g92 = new LiteBansModule_212(this.plugin(charSequence), this.plugin(charSequence2), null, n, null, string, null, null, null, 468, null);
            if (jTArray != null) {
                objectArray = jTArray;
                int n2 = objectArray.length;
                for (int i = 0; i < n2; ++i) {
                    Object contextObj = targetObj = objectArray[i];
                    String string2 = (String)((LiteBansModule_356)contextObj).BaseCoreGenericHandler();
                    String string3 = (String)((LiteBansModule_356)contextObj).c();
                    g92.BaseCoreGenericHandler(string2, string3, flag);
                }
            }
            objectArray = new LiteBansModule_212[]{g92};
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

    static {
        DiscordEmbedBuilder.BaseCoreGenericHandler();
    }
}

