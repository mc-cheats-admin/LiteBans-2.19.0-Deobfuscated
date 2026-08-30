package litebans;

import com.velocitypowered.api.command.CommandInvocation;
import com.velocitypowered.api.command.SimpleCommand;
import java.util.List;
import litebans.ai_0;
import litebans.d8;
import litebans.di_0;
import litebans.hh_0;
import litebans.jv_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@hh_0
@ai_0(a=2)
public class bm_0
implements d8,
SimpleCommand {
    private final d8 d;
    private final String b;
    private final di_0 a;
    private final String[] c;

    public bm_0(d8 d82, String string, di_0 di_02, String[] stringArray) {
        this.d = d82;
        this.b = string;
        this.a = di_02;
        this.c = stringArray;
    }

    public List suggest(SimpleCommand.Invocation invocation) {
        return this.suggest(this.a.a(invocation.source()), (String[])invocation.arguments());
    }

    public void b(SimpleCommand.Invocation invocation) {
        this.a(this.a.a(invocation.source()), (String[])invocation.arguments());
    }

    @Override
    public void a(@NotNull jv_0 jv_02, String[] stringArray) {
        try {
            this.a.z().a(this.d, jv_02, stringArray);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public String getName() {
        return this.d.getName();
    }

    @Override
    public @Nullable String getPermission() {
        return this.b;
    }

    @Override
    public @NotNull List suggest(@NotNull jv_0 jv_02, String[] stringArray) {
        return this.a.z().a(this, this.getName(), jv_02, stringArray);
    }

    public boolean a(SimpleCommand.Invocation invocation) {
        String string = this.getPermission();
        if (string == null) {
            return true;
        }
        return invocation.source().hasPermission(string);
    }

    @Override
    public String[] getAliases() {
        return this.c;
    }

    public boolean hasPermission(CommandInvocation commandInvocation) {
        return this.a((SimpleCommand.Invocation)commandInvocation);
    }

    public List suggest(CommandInvocation commandInvocation) {
        return this.suggest((SimpleCommand.Invocation)commandInvocation);
    }

    public void execute(CommandInvocation commandInvocation) {
        this.b((SimpleCommand.Invocation)commandInvocation);
    }
}

