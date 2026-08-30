package litebans;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import litebans.d8;
import litebans.di_0;
import litebans.hl;
import litebans.jv_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.jq
 */
public static class jq_0
implements d8,
Command,
SuggestionProvider {
    private final d8 b;
    private final String a;
    private final di_0 e;
    private final String[] c;
    private static /* synthetic */ String[] d;

    public jq_0(d8 d82, String string, di_0 di_02, String[] stringArray) {
        this.b = d82;
        this.a = string;
        this.e = di_02;
        this.c = stringArray;
    }

    public int run(CommandContext commandContext) {
        jv_0 jv_02 = this.e.a(commandContext.getSource());
        String[] stringArray = commandContext.getInput().split(d[0]);
        if (stringArray.length >= 2) {
            String[] stringArray2 = Arrays.copyOfRange(stringArray, 1, stringArray.length);
            this.a(jv_02, stringArray2);
        } else {
            this.a(jv_02, new String[0]);
        }
        return 1;
    }

    @Override
    public void a(@NotNull jv_0 jv_02, String[] stringArray) {
        try {
            this.e.z().a(this.b, jv_02, stringArray);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public String getName() {
        return this.b.getName();
    }

    @Override
    public @Nullable String getPermission() {
        return this.a;
    }

    @Override
    public @NotNull List suggest(@NotNull jv_0 jv_02, String[] stringArray) {
        return this.e.z().a(this, this.getName(), jv_02, stringArray);
    }

    public CompletableFuture getSuggestions(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        jv_0 jv_02 = this.e.a(commandContext.getSource());
        String[] stringArray = commandContext.getInput().split(d[1]);
        List list = this.suggest(jv_02, stringArray);
        list.forEach(arg_0 -> ((SuggestionsBuilder)suggestionsBuilder).suggest(arg_0));
        return suggestionsBuilder.buildFuture();
    }

    public d8 a() {
        return this.b;
    }

    @Override
    public String[] getAliases() {
        return this.c;
    }

    private static final void b() {
        d = new String[]{hl.a("\u0905", 75303205), hl.a("\ubc4b", -512967573)};
    }

    static {
        jq_0.b();
    }
}

