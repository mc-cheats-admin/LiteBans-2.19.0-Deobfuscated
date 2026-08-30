package litebans;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

static class DefaultvalueHandler
extends SelectorHandler {
    public static final char BaseCoreGenericHandler(@NotNull CharSequence charSequence) {
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is ");
        }
        return charSequence.charAt(0);
    }

    public static final Character BaseCoreGenericHandler(@NotNull CharSequence charSequence, int n) {
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence, "<this>");
        return (0 <= n ? n < charSequence.length() : false) ? Character.valueOf(charSequence.charAt(n)) : null;
    }

    public static final char LiteBansModule_31(@NotNull CharSequence charSequence) {
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is ");
        }
        return charSequence.charAt(StringUtilities.BaseCoreGenericHandler(charSequence));
    }

    public static final String LiteBansModule_31(@NotNull String string, int n) {
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "<this>");
        if (!(n >= 0)) {
            String string2 = "Requested character count " + n + " is less than ";
            throw new IllegalArgumentException(string2.toString());
        }
        return StringUtilities.BaseCoreGenericHandler(string, LiteBansModule_20.c(string.length() - n, 0));
    }

    public static final String BaseCoreGenericHandler(@NotNull String string, int n) {
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "<this>");
        if (!(n >= 0)) {
            String string2 = "Requested character count " + n + " is less than ";
            throw new IllegalArgumentException(string2.toString());
        }
        String string3 = string;
        int n3 = LiteBansModule_20.AsyncBackgroundTask_5(n, string.length());
        return string3.substring(n2, n3);
}

