package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import litebans.aa_0;
import litebans.ai_0;
import litebans.am;
import litebans.ao_0;
import litebans.b_0;
import litebans.bz;
import litebans.d8;
import litebans.da;
import litebans.di_0;
import litebans.ec_0;
import litebans.ew;
import litebans.fB;
import litebans.fg_0;
import litebans.fo_0;
import litebans.hl;
import litebans.jv_0;
import litebans.ll;
import litebans.q_0;
import litebans.y;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ai_0(a=0)
public final class C
extends b_0 {
    private static /* synthetic */ String[] e;

    public C(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public void a() {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        q_02.e();
        this.a.a(this);
        this.g();
        this.i();
        super.a();
    }

    @Override
    public void e() {
    }

    @Override
    public void b() {
        this.i();
    }

    private final void g() {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        ec_0 ec_02 = this.a.i();
        ew.b(ec_02, "");
        Plugin plugin = ao_0.a((ao_0)ec_02, null, 1, null);
        Map map = plugin.getDescription().getCommands();
        boolean bl = false;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry;
            Map.Entry entry2 = entry = iterator.next();
            boolean bl2 = false;
            String string = (String)entry2.getKey();
            PluginCommand pluginCommand = plugin.getServer().getPluginCommand(string);
            if (pluginCommand == null) continue;
            if (pluginCommand.getTabCompleter() != null && !ew.a((Object)pluginCommand.getPlugin(), this.a)) {
                q_02.a(1, (Object)("Command /" + string + " is tab-completed by " + pluginCommand.getTabCompleter() + '!'));
            }
            pluginCommand.setTabCompleter((TabCompleter)plugin);
            if (ew.a((Object)pluginCommand.getPlugin(), this.a)) continue;
            q_02.a(1, (Object)("Command /" + string + " is owned by " + pluginCommand.getPlugin().getDescription().getName() + '!'));
        }
    }

    private final void i() {
        ec_0 ec_02 = this.a.i();
        ew.b(ec_02, "");
        Plugin plugin = ao_0.a((ao_0)ec_02, null, 1, null);
        Map map = plugin.getDescription().getCommands();
        boolean bl = false;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry;
            Map.Entry entry2 = entry = iterator.next();
            boolean bl2 = false;
            String string = (String)entry2.getKey();
            PluginCommand pluginCommand = plugin.getServer().getPluginCommand(string);
            if (pluginCommand == null || !ew.a((Object)pluginCommand.getPlugin(), this.a)) continue;
            pluginCommand.setPermissionMessage(y.b.a(am.cZ.toString()));
        }
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String string, @NotNull String[] stringArray) {
        return this.a(commandSender, command, string, stringArray);
    }

    public final boolean a(@NotNull CommandSender commandSender, @Nullable Command command, @NotNull String string, @NotNull String[] object) {
        fB fB2;
        String[] stringArray;
        boolean bl;
        int n;
        Object object2;
        Object object3;
        boolean bl2;
        Object object4;
        Object object5;
        block10: {
            object5 = fB.d;
            boolean bl3 = false;
            object4 = object;
            bl2 = false;
            int n2 = ((String[])object4).length;
            for (int i = 0; i < n2; ++i) {
                object2 = object3 = object4[i];
                n = 0;
                if (!bz.b((CharSequence)object2)) continue;
                bl = false;
                break block10;
            }
            bl = true;
        }
        if (bl) {
            stringArray = object;
        } else {
            object4 = object;
            bl2 = false;
            Object object6 = object4;
            Collection collection = new ArrayList();
            boolean bl4 = false;
            n = ((Command)object6).length;
            for (int i = 0; i < n; ++i) {
                Command command2;
                Command command3 = command2 = object6[i];
                boolean bl5 = false;
                boolean bl6 = !bz.b((CharSequence)command3);
                if (!bl6) continue;
                collection.add(command2);
            }
            object4 = (List)collection;
            bl2 = false;
            object6 = object4;
            stringArray = object6.toArray(new String[0]);
        }
        String[] stringArray2 = stringArray;
        object5 = this.a.a(commandSender);
        Object object7 = command;
        if (object7 == null || (object7 = object7.getName()) == null) {
            object7 = string;
        }
        Object object8 = object7;
        object4 = object8;
        if (bz.b((String)object8, "litebans:", false, 2, null)) {
            object4 = object4.substring(9);
        }
        if ((fB2 = (fB)this.a((String)object8)) != null) {
            String string2 = fB2.getPermission();
            if (string2 != null) {
                ew.a(object5);
                Object object9 = object5;
                boolean bl7 = false;
                object2 = object9;
                n = 0;
                if (!object2.e(string2)) {
                    object9 = object5;
                    CharSequence charSequence = am.cZ;
                    boolean bl8 = false;
                    fo_0.a(fg_0.a, (jv_0)object9, charSequence, null, 4, null);
                    return true;
                }
            }
            ew.a(object5);
            this.a((jv_0)object5, stringArray2, fB2, (String)object4);
            return true;
        }
        String[] stringArray3 = aa_0.a(fB.d, (String)object8, stringArray2);
        fB fB3 = (fB)this.a("ban");
        if (fB3 == null) {
            ew.a(object5);
            object3 = object5;
            object2 = am.c6;
            n = 0;
            fo_0.a(fg_0.a, (jv_0)object3, (CharSequence)object2, null, 4, null);
            return true;
        }
        ew.a(object5);
        this.a((jv_0)object5, stringArray3, fB3, (String)object4);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List a(@Nullable d8 d82, @NotNull String string, @NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        List list;
        if (!(stringArray.length == 0)) {
            jv_0 jv_03 = jv_02;
            String string2 = "litebans.tabcomplete";
            boolean bl = false;
            if (jv_03.e(string2)) {
                list = fB.d.a(d82, string, jv_02, this.a, stringArray);
                return list;
            }
        }
        list = ll.e();
        return list;
    }

    private final void a(jv_0 jv_02, String[] stringArray, fB fB2, String string) {
        if (fB2.b()) {
            this.a.b(new da(jv_02, stringArray, fB2, string));
        } else {
            fB2.a(jv_02, stringArray, string);
        }
    }

    private static final void h() {
        e = new String[]{"", "Command /", " is tab-completed by ", "Command /", " is owned by ", "", "litebans:", "ban", "litebans.tabcomplete"};
    }

    static {
        C.h();
    }
}

