package litebans;

import java.util.NoSuchElementException;
import litebans.as_0;
import litebans.bv;
import litebans.bz;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

static class bf_0
extends bv {
    private static /* synthetic */ String[] l;

    public static final char a(@NotNull CharSequence charSequence) {
        ew.a((Object)charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is ");
        }
        return charSequence.charAt(0);
    }

    public static final Character a(@NotNull CharSequence charSequence, int n) {
        ew.a((Object)charSequence, "<this>");
        return (0 <= n ? n < charSequence.length() : false) ? Character.valueOf(charSequence.charAt(n)) : null;
    }

    public static final char b(@NotNull CharSequence charSequence) {
        ew.a((Object)charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is ");
        }
        return charSequence.charAt(bz.a(charSequence));
    }

    public static final String b(@NotNull String string, int n) {
        ew.a((Object)string, "<this>");
        if (!(n >= 0)) {
            boolean bl = false;
            String string2 = "Requested character count " + n + " is less than ";
            throw new IllegalArgumentException(string2.toString());
        }
        return bz.a(string, as_0.c(string.length() - n, 0));
    }

    public static final String a(@NotNull String string, int n) {
        ew.a((Object)string, "<this>");
        if (!(n >= 0)) {
            boolean bl = false;
            String string2 = "Requested character count " + n + " is less than ";
            throw new IllegalArgumentException(string2.toString());
        }
        String string3 = string;
        int n2 = 0;
        int n3 = as_0.d(n, string.length());
        return string3.substring(n2, n3);
    }

    private static final void l() {
        l = new String[]{"<this>", "defaultValue", "<this>", "<this>", "predicate", "<this>", "predicate", "<this>", "Char sequence is ", "<this>", "predicate", "Char sequence contains no character matching the ", "<this>", "transform", "No element of the char sequence was transformed to a non-null ", "<this>", "transform", "<this>", "<this>", "predicate", "<this>", "defaultValue", "<this>", "<this>", "predicate", "<this>", "predicate", "<this>", "Char sequence is ", "<this>", "predicate", "Char sequence contains no character matching the ", "<this>", "<this>", "predicate", "<this>", "<this>", "random", "Char sequence is ", "<this>", "<this>", "random", "<this>", "Char sequence is ", "Char sequence has more than one ", "<this>", "predicate", "Char sequence contains more than one matching ", "Char sequence contains no character matching the ", "", "<this>", "<this>", "predicate", "<this>", "Requested character count ", " is less than ", "<this>", "Requested character count ", " is less than ", "<this>", "Requested character count ", " is less than ", "<this>", "Requested character count ", " is less than ", "<this>", "predicate", "", "<this>", "predicate", "", "<this>", "predicate", "", "<this>", "predicate", "", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "destination", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "destination", "predicate", "<this>", "destination", "predicate", "<this>", "indices", "", "<this>", "indices", "", "<this>", "indices", "", "<this>", "indices", "<this>", "Requested character count ", " is less than ", "<this>", "Requested character count ", " is less than ", "<this>", "Requested character count ", " is less than ", "<this>", "Requested character count ", " is less than ", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "<this>", "<this>", "transform", "<this>", "keySelector", "<this>", "keySelector", "valueTransform", "<this>", "destination", "keySelector", "<this>", "destination", "keySelector", "valueTransform", "<this>", "destination", "transform", "<this>", "valueSelector", "<this>", "destination", "valueSelector", "<this>", "destination", "<this>", "<this>", "<this>", "<this>", "<this>", "transform", "<this>", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "keySelector", "<this>", "keySelector", "valueTransform", "<this>", "destination", "keySelector", "<this>", "destination", "keySelector", "valueTransform", "<this>", "keySelector", "<this>", "transform", "<this>", "transform", "<this>", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "<this>", "predicate", "<this>", "<this>", "predicate", "<this>", "<this>", "predicate", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "action", "<this>", "action", "<this>", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "comparator", "selector", "<this>", "comparator", "selector", "<this>", "<this>", "comparator", "<this>", "comparator", "<this>", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "comparator", "selector", "<this>", "comparator", "selector", "<this>", "<this>", "comparator", "<this>", "comparator", "<this>", "<this>", "predicate", "<this>", "action", "<this>", "action", "<this>", "operation", "Empty char sequence can't be ", "<this>", "operation", "Empty char sequence can't be ", "<this>", "operation", "<this>", "operation", "<this>", "operation", "Empty char sequence can't be ", "<this>", "operation", "Empty char sequence can't be ", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "<this>", "transform", "<this>", "<this>", "transform", "<this>", "predicate", "<this>", "predicate", "<this>", "<this>", "transform", "<this>", "<this>", "transform", "<this>", "other", "<this>", "other", "transform", "<this>", "<this>", "transform", "<this>", "<this>", "it", "it", "it"};
    }

    static {
        bf_0.l();
    }
}

