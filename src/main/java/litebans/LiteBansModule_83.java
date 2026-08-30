package litebans;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface LiteBansModule_83
extends Closeable {
    public boolean LiteBansModule_31();

    public boolean BaseCoreGenericHandler();

    public PlatformPlugin e();

    public DatabaseMonitorService AsyncBackgroundTask_5();

    public void c(@NotNull SilentHandler var1);

    public LiteBansModule_298 BaseCoreGenericHandler(@NotNull LiteBansModule_298 var1, boolean var2);

    public void BaseCoreGenericHandler(@Nullable String var1, @Nullable String var2, @Nullable String var3, boolean var4, boolean var5);

    public ResultSet BaseCoreGenericHandler(@NotNull UUID var1, int var2);

    public boolean BaseCoreGenericHandler(@NotNull UUID var1, @NotNull BanHandler var2);

    public boolean LiteBansModule_31(@NotNull BansHandler_2 var1, @NotNull String var2, boolean var3);

    public SilentHandler BaseCoreGenericHandler(@NotNull ResultSet var1, @NotNull BanHandler var2);

    public SilentHandler c(@NotNull ResultSet var1, @NotNull BanHandler var2);

    public LiteBansModule_298 BaseCoreGenericHandler(@NotNull ResultSet var1, boolean var2, @Nullable String var3);

    public int BaseCoreGenericHandler(@NotNull DescHandler var1, @NotNull BanHandler var2);

    public int BaseCoreGenericHandler(@NotNull LiteBansModule_65 var1, @Nullable String var2, @Nullable String var3);

    public List BaseCoreGenericHandler(@Nullable String var1, @Nullable String var2, @NotNull BanHandler var3, @Nullable String var4, boolean var5, int var6);

    public List BaseCoreGenericHandler(@NotNull String var1, @NotNull BanHandler var2, @NotNull String var3, int var4);

    public List BaseCoreGenericHandler(@Nullable String var1, int var2);

    public Collection BaseCoreGenericHandler(@NotNull BanHandler var1, long var2, long var4, boolean var6);

    public SilentHandler BaseCoreGenericHandler(@NotNull SilentHandler var1, boolean var2);

    public SilentHandler BaseCoreGenericHandler(@Nullable String var1, @Nullable String var2, @NotNull BanHandler var3, boolean var4, boolean var5);

    public SilentHandler BaseCoreGenericHandler(@Nullable String var1, @Nullable String var2, @NotNull BanHandler var3, @Nullable String var4, boolean var5, boolean var6);

    public SilentHandler BaseCoreGenericHandler(@NotNull String var1, @NotNull BanHandler var2, @NotNull String var3, boolean var4);

    public SilentHandler BaseCoreGenericHandler(long var1, @NotNull BanHandler var3, @NotNull String var4, boolean var5);

    public long BaseCoreGenericHandler(@NotNull BansHandler_2 var1, @NotNull String var2, boolean var3);

    public long LiteBansModule_31(@NotNull SilentHandler var1);

    public SilentHandler BaseCoreGenericHandler(@NotNull String var1, @Nullable String var2, @Nullable String var3, @NotNull BanHandler var4);

    public List BaseCoreGenericHandler(@NotNull String var1, @Nullable String var2, @Nullable String var3, @NotNull BanHandler var4, boolean var5);

    public List BaseCoreGenericHandler(@NotNull String var1);

    public LiteBansModule_298 c(@Nullable String var1);

    public List LiteBansModule_31(@Nullable String var1, int var2);

    public boolean BaseCoreGenericHandler(@Nullable String var1, @Nullable String var2, @NotNull String var3);

    public void BaseCoreGenericHandler(@Nullable Connection var1, @NotNull BansHandler_2 var2, boolean var3);

    public LiteBansModule_60 c(@NotNull CharSequence var1);

    public void BaseCoreGenericHandler(@Nullable String var1, long var2);

    public LiteBansModule_356 BaseCoreGenericHandler(@Nullable String var1, @Nullable String var2, @NotNull LiteBansModule_175 var3, @NotNull LiteBansModule_65 var4);

    public ResultSet LiteBansModule_31(@NotNull String var1);

    public void BaseCoreGenericHandler(@NotNull CharSequence var1, long var2, @NotNull SilentHandler var4);

    public ResultSet BaseCoreGenericHandler(@NotNull UUID var1);

    public ResultSet BaseCoreGenericHandler(@NotNull BansHandler_2 var1, @NotNull String var2, int var3);

    public ResultSet BaseCoreGenericHandler(@NotNull BansHandler_2 var1);

    public void BaseCoreGenericHandler(@Nullable String var1, @Nullable String var2, @NotNull CharSequence var3, @NotNull SilentHandler var4, boolean var5);

    public void BaseCoreGenericHandler(@NotNull SilentHandler var1, @Nullable String var2, @Nullable String var3, @NotNull CharSequence var4, boolean var5);

    public long BaseCoreGenericHandler(@NotNull String var1, long var2, @NotNull String var4);

    public boolean LiteBansModule_31(@NotNull CharSequence var1);

    public long c();

    public int BaseCoreGenericHandler(@NotNull LiteBansModule_298 var1);

    public void BaseCoreGenericHandler(boolean var1);

    public List LiteBansModule_31(@NotNull ResultSet var1, @NotNull BanHandler var2);

    public List BaseCoreGenericHandler(@NotNull LiteBansModule_298 var1, @NotNull BanHandler var2, @NotNull String var3, boolean var4, int var5);

    public List BaseCoreGenericHandler(@NotNull SilentHandler var1, int var2);

    public List BaseCoreGenericHandler(@NotNull CommandSenderWrapper var1, @NotNull BanHandler var2, boolean var3, int var4);

    public String BaseCoreGenericHandler(@NotNull CommandSenderWrapper var1);

    public CharSequence LiteBansModule_31(@NotNull CharSequence var1, @NotNull CommandSenderWrapper var2);

    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence var1, @Nullable String var2, @Nullable String var3, boolean var4);

    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence var1);

    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence var1, @Nullable LiteBansModule_298 var2, boolean var3);

    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence var1, @Nullable CommandSenderWrapper var2);

    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence var1, @NotNull LiteBansModule_114 var2);

    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence var1, @Nullable String var2, @Nullable String var3, @Nullable String var4, @Nullable String var5, @Nullable String var6);

    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence var1, @Nullable SilentHandler var2, boolean var3);

    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence var1, @Nullable SilentHandler var2, @Nullable LiteBansModule_298 var3, boolean var4);

    public boolean BaseCoreGenericHandler(@NotNull SilentHandler var1, @NotNull CommandSenderWrapper var2);

    public boolean BaseCoreGenericHandler(@Nullable SilentHandler var1);
}

