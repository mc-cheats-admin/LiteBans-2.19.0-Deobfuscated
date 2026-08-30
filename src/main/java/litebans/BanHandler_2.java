package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ModulePriority(priority=0)
public final class BanHandler_2
extends LiteBansModule_41 {
    public BanHandler_2(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void BaseCoreGenericHandler() {
        ConfigService configService = this.plugin.BaseCoreGenericHandler(ConfigService.class);
        configService.e();
        this.plugin.BaseCoreGenericHandler(this);
        this.g();
        this.i();
        super.BaseCoreGenericHandler();
    }

    @Override
    public void e() {
    }

    @Override
    public void LiteBansModule_31() {
        this.i();
    }

    private final void g() {
        ConfigService configService = this.plugin.BaseCoreGenericHandler(ConfigService.class);
        LiteBansModule_158 ec_02 = this.plugin.i();
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        Plugin plugin = BungeecordHandler_2.BaseCoreGenericHandler((BungeecordHandler_2)ec_02, null, 1, null);
        Map map = plugin.getDescription().getCommands();
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry;
            Map.Entry entry2 = entry = iterator.next();
            String string = (String)entry2.getKey();
            PluginCommand pluginCommand = plugin.getServer().getPluginCommand(string);
            if (pluginCommand == null) continue;
            if (pluginCommand.getTabCompleter() != null && !ObjectUtilities.BaseCoreGenericHandler(pluginCommand.getPlugin(), this.plugin)) {
                configService.BaseCoreGenericHandler(1, (Object)("Command /" + string + " is tab-completed LiteBansModule_61 " + pluginCommand.getTabCompleter() + '!'));
            }
            pluginCommand.setTabCompleter((TabCompleter)plugin);
            if (ObjectUtilities.BaseCoreGenericHandler(pluginCommand.getPlugin(), this.plugin)) continue;
            configService.BaseCoreGenericHandler(1, (Object)("Command /" + string + " is owned LiteBansModule_61 " + pluginCommand.getPlugin().getDescription().getName() + '!'));
}

    private final void i() {
        LiteBansModule_158 ec_02 = this.plugin.i();
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        Plugin plugin = BungeecordHandler_2.BaseCoreGenericHandler((BungeecordHandler_2)ec_02, null, 1, null);
        Map map = plugin.getDescription().getCommands();
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry;
            Map.Entry entry2 = entry = iterator.next();
            String string = (String)entry2.getKey();
            PluginCommand pluginCommand = plugin.getServer().getPluginCommand(string);
            if (pluginCommand == null || !ObjectUtilities.BaseCoreGenericHandler(pluginCommand.getPlugin(), this.plugin)) continue;
            pluginCommand.setPermissionMessage(HoverTextFormatter.LiteBansModule_31.BaseCoreGenericHandler(MessageKey.cZ.toString()));
}

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String string, @NotNull String[] args) {
        return this.plugin(commandSender, command, string, args);
    }

    public final boolean BaseCoreGenericHandler(@NotNull CommandSender commandSender, @Nullable Command command, @NotNull String string, @NotNull String[] targetObj) {
        AbstractCommand abstractCommand;
        String[] args;
        boolean flag;
        int n;
        boolean flag2;
{
            tempObj = AbstractCommand.AsyncBackgroundTask_5;
            helperObj = targetObj;
            flag2 = false;
            int n2 = ((String[])helperObj).length;
            for (int i = 0; i < n2; ++i) {
                contextObj = resultObj = helperObj[i];
                n = 0;
                if (!StringUtilities.LiteBansModule_31(contextObj)) continue;
                flag = false;
                break;
            }
            flag = true;
        }
        if (flag) {
            args = targetObj;
        } else {
            helperObj = targetObj;
            flag2 = false;
            Object object6 = helperObj;
            Collection collection = new ArrayList();
            n = ((Command)object6).length;
            for (int i = 0; i < n; ++i) {
                Command command2;
                Command command3 = command2 = object6[i];
                boolean flag6 = !StringUtilities.LiteBansModule_31(command3);
                if (!flag6) continue;
                collection.add(command2);
            }
            helperObj = (List)collection;
            flag2 = false;
            object6 = helperObj;
            args = object6.toArray(new String[0]);
        }
        String[] filteredArgs = args;
        tempObj = this.plugin.BaseCoreGenericHandler(commandSender);
        Object object7 = command;
        if (object7 == null || (object7 = object7.getName()) == null) {
            object7 = string;
        }
        Object object8 = object7;
        helperObj = object8;
        if (StringUtilities.LiteBansModule_31((String)object8, "litebans:", false, 2, null)) {
            helperObj = helperObj.substring(9);
        }
        if ((abstractCommand = this.plugin((String)object8)) != null) {
            String string2 = abstractCommand.getPermission();
            if (string2 != null) {
                ObjectUtilities.BaseCoreGenericHandler(tempObj);
                Object object9 = tempObj;
                contextObj = object9;
                n = 0;
                if (!contextObj.e(string2)) {
                    object9 = tempObj;
                    CharSequence charSequence = MessageKey.cZ;
                    ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)object9, charSequence, null, 4, null);
                    return true;
}
            ObjectUtilities.BaseCoreGenericHandler(tempObj);
            this.plugin((CommandSenderWrapper)tempObj, filteredArgs, abstractCommand, (String)helperObj);
            return true;
        }
        String[] parsedArgs = CommandArgumentUtils.BaseCoreGenericHandler(AbstractCommand.AsyncBackgroundTask_5, (String)object8, filteredArgs);
        AbstractCommand banCommand = this.plugin("ban");
        if (banCommand == null) {
            ObjectUtilities.BaseCoreGenericHandler(tempObj);
            resultObj = tempObj;
            contextObj = MessageKey.LiteBansModule_67;
            n = 0;
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)resultObj, contextObj, null, 4, null);
            return true;
        }
        ObjectUtilities.BaseCoreGenericHandler(tempObj);
        this.plugin((CommandSenderWrapper)tempObj, parsedArgs, banCommand, (String)helperObj);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List BaseCoreGenericHandler(@Nullable LiteCommand command, @NotNull String string, @NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        List list;
        if (!(args.length == 0)) {
            CommandSenderWrapper senderWrapper = sender;
            String string2 = "litebans.tabcomplete";
            if (senderWrapper.e(string2)) {
                list = AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(command, string, sender, this.plugin, args);
                return list;
}
        list = CollectionUtilities.e();
        return list;
    }

    private final void BaseCoreGenericHandler(CommandSenderWrapper sender, String[] args, AbstractCommand abstractCommand, String string) {
        if (abstractCommand.LiteBansModule_31()) {
            this.plugin.LiteBansModule_31(new CommandExecutionTask(sender, args, abstractCommand, string));
        } else {
            abstractCommand.BaseCoreGenericHandler(sender, args, string);
}

    private static final void LiteBansModule_240() {
        e = new String[]{"", "Command /", " is tab-completed LiteBansModule_61 ", "Command /", " is owned LiteBansModule_61 ", "", "litebans:", "ban", "litebans.tabcomplete"};
}

