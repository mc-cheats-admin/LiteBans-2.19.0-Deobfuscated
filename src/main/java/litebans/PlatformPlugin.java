package litebans;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Supplier;
import java.util.logging.Logger;
public interface PlatformPlugin
extends LiteBansModule_362 {
    public static final PluginModule[] BaseCoreGenericHandler = new PluginModule[0];

    public void m();

    public DatabaseService LiteBansModule_241();

    public PluginModule[] Utf8Handler_2();

    public void AsyncBackgroundTask_5();

    public boolean BaseCoreGenericHandler(PluginModule var1);

    public StackTraceAnalyzer LiteBansModule_195();

    public CommandManager z();

    public ConfigurationManager LiteBansModule_31();

    public void BaseCoreGenericHandler(CommandManager var1);

    public CommandSenderWrapper HoverTextFormatter();

    public CommandSenderWrapper CommandThrottleService();

    public DatabaseService BroadcastService();

    public File getDataFolder();

    public Logger getLogger();

    public PluginModule BaseCoreGenericHandler(Class var1);

    public PluginModule LiteBansModule_31(Class var1);

    public PluginModule[] PunishmentTableService();

    public int BaseCoreGenericHandler();

    public CommandSenderWrapper[] q();

    public Map DatabaseMonitorService();

    public ThreadPoolExecutor LiteBansModule_435();

    public long g();

    public byte AsyncBackgroundTask_22();

    public LiteBansModule_159 i();

    public String e();

    public void GnuSparseMapHandler();

    public boolean isEnabled();

    public boolean n();

    public boolean AsyncBackgroundTask_21();

    public boolean c();

    public boolean ServerSyncService();

    public boolean LiteBansModule_403();

    public DatabaseService BaseCoreGenericHandler(File var1);

    public void LiteBansModule_31(LiteBansModule_176[] var1);

    public boolean BaseCoreGenericHandler(String var1, Supplier var2);

    public void c(Runnable var1);

    public void LiteBansModule_31(Runnable var1, long var2);

    public void BaseCoreGenericHandler(Runnable var1);

    public void BaseCoreGenericHandler(Runnable var1, long var2);

    public void LiteBansModule_31(Runnable var1);

    public void BaseCoreGenericHandler(Runnable var1, long var2, long var4);

    public void LiteBansModule_31(Runnable var1, long var2, long var4);

    public void BaseCoreGenericHandler(String var1);

    public void BaseCoreGenericHandler(LiteBansModule_419 var1);

    public void BaseCoreGenericHandler(ConfigurationManager var1);

    public void r();

    public void BaseCoreGenericHandler(LiteBansModule_176[] var1);

    public CommandSenderWrapper LiteBansModule_31(Object var1);

    public CommandSenderWrapper BaseCoreGenericHandler(Object var1);
}

