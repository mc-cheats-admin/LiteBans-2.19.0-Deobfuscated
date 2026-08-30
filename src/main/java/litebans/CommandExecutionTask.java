package litebans;

import org.jetbrains.annotations.NotNull;

public class CommandExecutionTask
implements Runnable {
    private final CommandSenderWrapper c;
    private final String[] LiteBansModule_31;
    private final AbstractCommand AsyncBackgroundTask_5;
    private final String BaseCoreGenericHandler;

    public CommandExecutionTask(@NotNull CommandSenderWrapper sender, @NotNull String[] args, @NotNull AbstractCommand abstractCommand, @NotNull String string) {
        this.c = sender;
        this.LiteBansModule_31 = args;
        this.AsyncBackgroundTask_5 = abstractCommand;
        this.plugin = string;
    }

    @Override
    public void run() {
        this.AsyncBackgroundTask_5.BaseCoreGenericHandler(this.c, this.LiteBansModule_31, this.plugin);
    }
}

