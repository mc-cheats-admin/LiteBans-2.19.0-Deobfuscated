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

    private static final void LiteBansModule_403() {
        LiteBansModule_403 = new String[]{"<this>", "defaultValue", "<this>", "<this>", "predicate", "<this>", "predicate", "<this>", "Char sequence is ", "<this>", "predicate", "Char sequence contains no character matching the ", "<this>", "transform", "No element of the char sequence was transformed to BaseCoreGenericHandler non-null ", "<this>", "transform", "<this>", "<this>", "predicate", "<this>", "defaultValue", "<this>", "<this>", "predicate", "<this>", "predicate", "<this>", "Char sequence is ", "<this>", "predicate", "Char sequence contains no character matching the ", "<this>", "<this>", "predicate", "<this>", "<this>", "random", "Char sequence is ", "<this>", "<this>", "random", "<this>", "Char sequence is ", "Char sequence has more than one ", "<this>", "predicate", "Char sequence contains more than one matching ", "Char sequence contains no character matching the ", "", "<this>", "<this>", "predicate", "<this>", "Requested character count ", " is less than ", "<this>", "Requested character count ", " is less than ", "<this>", "Requested character count ", " is less than ", "<this>", "Requested character count ", " is less than ", "<this>", "predicate", "", "<this>", "predicate", "", "<this>", "predicate", "", "<this>", "predicate", "", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "destination", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "destination", "predicate", "<this>", "destination", "predicate", "<this>", "indices", "", "<this>", "indices", "", "<this>", "indices", "", "<this>", "indices", "<this>", "Requested character count ", " is less than ", "<this>", "Requested character count ", " is less than ", "<this>", "Requested character count ", " is less than ", "<this>", "Requested character count ", " is less than ", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "<this>", "<this>", "transform", "<this>", "keySelector", "<this>", "keySelector", "valueTransform", "<this>", "destination", "keySelector", "<this>", "destination", "keySelector", "valueTransform", "<this>", "destination", "transform", "<this>", "valueSelector", "<this>", "destination", "valueSelector", "<this>", "destination", "<this>", "<this>", "<this>", "<this>", "<this>", "transform", "<this>", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "keySelector", "<this>", "keySelector", "valueTransform", "<this>", "destination", "keySelector", "<this>", "destination", "keySelector", "valueTransform", "<this>", "keySelector", "<this>", "transform", "<this>", "transform", "<this>", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "<this>", "predicate", "<this>", "<this>", "predicate", "<this>", "<this>", "predicate", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "action", "<this>", "action", "<this>", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "comparator", "selector", "<this>", "comparator", "selector", "<this>", "<this>", "comparator", "<this>", "comparator", "<this>", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "comparator", "selector", "<this>", "comparator", "selector", "<this>", "<this>", "comparator", "<this>", "comparator", "<this>", "<this>", "predicate", "<this>", "action", "<this>", "action", "<this>", "operation", "Empty char sequence can'AsyncBackgroundTask_22 be ", "<this>", "operation", "Empty char sequence can'AsyncBackgroundTask_22 be ", "<this>", "operation", "<this>", "operation", "<this>", "operation", "Empty char sequence can'AsyncBackgroundTask_22 be ", "<this>", "operation", "Empty char sequence can'AsyncBackgroundTask_22 be ", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "<this>", "transform", "<this>", "<this>", "transform", "<this>", "predicate", "<this>", "predicate", "<this>", "<this>", "transform", "<this>", "<this>", "transform", "<this>", "other", "<this>", "other", "transform", "<this>", "<this>", "transform", "<this>", "<this>", "UpdateCheckTask", "UpdateCheckTask", "UpdateCheckTask"};
    }

    static {
        DefaultvalueHandler.LiteBansModule_403();
    }
}

