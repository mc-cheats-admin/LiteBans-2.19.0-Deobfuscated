package litebans;

import java.util.List;
import litebans.ai_0;
import litebans.d8;
import litebans.di_0;
import litebans.hh_0;
import litebans.jv_0;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.hK
 */
@hh_0
@ai_0(a=1)
public static class hk_0
extends Command
implements d8,
TabExecutor {
    private final d8 a;
    private final di_0 c;
    private final String[] b;

    public hk_0(d8 d82, String string, di_0 di_02, String[] stringArray) {
        super(d82.getName(), string, stringArray);
        this.a = d82;
        this.c = di_02;
        this.b = stringArray;
    }

    public void execute(CommandSender commandSender, String[] stringArray) {
        this.a(this.c.a(commandSender), stringArray);
    }

    @Override
    public void a(@NotNull jv_0 jv_02, String[] stringArray) {
        try {
            this.c.z().a(this.a, jv_02, stringArray);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public @NotNull List suggest(@NotNull jv_0 jv_02, String[] stringArray) {
        return this.c.z().a(this, this.getName(), jv_02, stringArray);
    }

    public Iterable onTabComplete(CommandSender commandSender, String[] stringArray) {
        return this.suggest(this.c.a(commandSender), stringArray);
    }

    @Override
    public String[] getAliases() {
        return this.b;
    }
}

