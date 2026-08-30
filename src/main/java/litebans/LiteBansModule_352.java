package litebans;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LiteBansModule_352
implements LiteCommand,
Command,
SuggestionProvider {
    private final LiteCommand LiteBansModule_31;
    private final String BaseCoreGenericHandler;
    private final PlatformPlugin e;
    private final String[] c;
    public LiteBansModule_352(LiteCommand command, String string, PlatformPlugin plugin, String[] args) {
        this.LiteBansModule_31 = command;
        this.plugin = string;
        this.e = plugin;
        this.c = args;
    }

    public int run(CommandContext commandContext) {
        CommandSenderWrapper sender = this.e.BaseCoreGenericHandler(commandContext.getSource());
        String[] args = commandContext.getInput().split(" ");
        if (args.length >= 2) {
            String[] filteredArgs = Arrays.copyOfRange(args, 1, args.length);
            this.plugin(sender, filteredArgs);
        } else {
            this.plugin(sender, new String[0]);
        }
        return 1;
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, String[] args) {
        try {
            this.e.z().BaseCoreGenericHandler(this.LiteBansModule_31, sender, args);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
}

    @Override
    public String getName() {
        return this.LiteBansModule_31.getName();
    }

    @Override
    public @Nullable String getPermission() {
        return this.plugin;
    }

    @Override
    public @NotNull List suggest(@NotNull CommandSenderWrapper sender, String[] args) {
        return this.e.z().BaseCoreGenericHandler(this, this.getName(), sender, args);
    }

    public CompletableFuture getSuggestions(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        CommandSenderWrapper sender = this.e.BaseCoreGenericHandler(commandContext.getSource());
        String[] args = commandContext.getInput().split(" ");
        List list = this.suggest(sender, args);
        list.forEach(arg_0 -> ((SuggestionsBuilder)suggestionsBuilder).suggest(arg_0));
        return suggestionsBuilder.buildFuture();
    }

    public LiteCommand BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    @Override
    public String[] getAliases() {
        return this.c;
    }

    private static final void LiteBansModule_31() {
        AsyncBackgroundTask_5 = new String[]{" ", " "};
}

