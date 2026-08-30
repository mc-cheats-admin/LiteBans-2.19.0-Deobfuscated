package litebans;

import litebans.a_0;
import litebans.ai_0;
import litebans.di_0;
import litebans.jv_0;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

@ai_0(a=0)
public abstract class b_0
extends a_0
implements CommandExecutor {
    public b_0(di_0 di_02) {
        super(di_02);
    }

    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] stringArray) {
        jv_0 jv_02 = this.a.a(commandSender);
        this.a(jv_02, command.getName(), stringArray);
        return true;
    }
}

