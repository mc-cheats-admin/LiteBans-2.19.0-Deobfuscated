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
        arg1 = v2;
        arg2 = new ContentHandler(v3);
        v0 = arg1.q();
        ObjectUtilities.BaseCoreGenericHandler(v0);
        arg3 = v0;
        v1 = MessageKey.LiteBansModule_31("WEB_" + arg1.ServerSyncService() + "_TITLE");
        if (v1 == null) {
            v1 = "";
        }
        arg4 = v1;
        arg5 = MessageKey.LiteBansModule_31("WEB_" + arg1.ServerSyncService() + "_CONTENT");
        arg6 = ContentHandler.GnuSparseMapHandler.BaseCoreGenericHandler(v1, MessageKey.LiteBansModule_31("WEB_" + arg1.ServerSyncService() + "_COLOR"));
        v2 = arg7 = MessageKey.LiteBansModule_31("WEB_" + arg1.ServerSyncService() + "_THUMB");
        if (v2 != null ? StringUtilities.LiteBansModule_31((CharSequence)v2) : false) ** GOTO lbl-1000
        v3 = arg7;
        v4 = v3 != null ? !StringUtilities.LiteBansModule_31(v3, "https://", false, 2, null) : false;
        if (v4) lbl-1000:
                {
        } else {
            v5 = arg7;
            v6 = arg7 = v5 != null && (v5 = v1.BaseCoreGenericHandler(v5, arg1.H(), arg1.AsyncBackgroundTask_5(), false)) != null && (v5 = v1.BaseCoreGenericHandler(v5, arg3, arg1.AsyncBackgroundTask_22(), false)) != null ? v5.toString() : null;
        }
        if ((v7 = MessageKey.LiteBansModule_31("WEB_" + arg1.ServerSyncService() + "_FIELDS")) == null) {
            v7 = "";
        }
        arg8 = v7;
        arg9 = ContentHandler.GnuSparseMapHandler.BaseCoreGenericHandler(v1, arg8, arg1);
        arg4 = v1.BaseCoreGenericHandler(v1.BaseCoreGenericHandler((CharSequence)arg4, arg1.H(), arg1.AsyncBackgroundTask_5(), false), arg3, arg1.AsyncBackgroundTask_22(), false).toString();
        arg10 = arg5;
        ObjectUtilities.BaseCoreGenericHandler((Object)arg10);
        arg5 = v1.BaseCoreGenericHandler(v1.BaseCoreGenericHandler((CharSequence)arg10, arg1.H(), arg1.AsyncBackgroundTask_5(), false), arg3, arg1.AsyncBackgroundTask_22(), false).toString();
        ContentHandler.GnuSparseMapHandler.BaseCoreGenericHandler(v1, arg2, arg4, arg5, arg6, arg7, arg9, StringUtilities.BaseCoreGenericHandler((CharSequence)arg8, (CharSequence)"\n\n", false, 2, null) == false);
    }

    private final LiteBansModule_354[] BaseCoreGenericHandler(LiteBansModule_82 ch2, String string, NoneHandler_2 cz2) {
        LiteBansModule_354[] jTArray;
        Object object;
        NoneHandler_2 cz3 = cz2;
        if (StringUtilities.LiteBansModule_31((CharSequence)string)) {
            return null;
        }
        DiscordEmbedBuilder bc_02 = ContentHandler.GnuSparseMapHandler;
        CharSequence charSequence = ch2.BaseCoreGenericHandler((CharSequence)string, cz3.q(), cz3.AsyncBackgroundTask_22(), false);
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
        Object object2 = object.iterator();
        while (object2.hasNext()) {
            Object t2 = object2.next();
            String string3 = (String)t2;
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
                int n2 = objectArray.length;
                for (int i = 0; i < n2; ++i) {
                    Object object;
                    Object object2 = object = objectArray[i];
                    String string2 = (String)((LiteBansModule_354)object2).BaseCoreGenericHandler();
                    String string3 = (String)((LiteBansModule_354)object2).c();
                    g92.BaseCoreGenericHandler(string2, string3, flag);
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

    public /* synthetic */ DiscordEmbedBuilder(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"WEB_", "_TITLE", "", "WEB_", "_CONTENT", "WEB_", "_COLOR", "WEB_", "_THUMB", "https://", "WEB_", "_FIELDS", "", "\n\n", "\n\n", "\n\n", "\n\n", "\n\n", "Invalid color format InitializerHandler_3 embed configuration, ", "Unable to post Discord message to invalid URL: '", "': ", "Attempted to post Discord message but encountered HikariDataSource exception!\nJSON data:"};
}

