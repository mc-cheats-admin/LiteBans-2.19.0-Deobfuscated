package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NoneHandler_2 {
    private BanHandler z;
    private boolean LiteBansModule_240;
    private boolean e;
    private boolean F;
    private boolean K;
    private boolean c;
    private boolean i;
    private boolean ServerSyncService;
    private boolean BaseCoreGenericHandler;
    private boolean H;
    private boolean BanHandler_2;
    private boolean AsyncBackgroundTask_5;
    private boolean PlayerQuitListener;
    private boolean LiteBansModule_401;
    private final long LiteBansModule_430;
    private long LiteBansModule_31;
    private long m;
    private byte L;
    private LiteBansModule_65 PunishmentService;
    private LiteBansModule_174 BanHandler_5;
    private boolean n;
    private LiteBansModule_66 PunishmentTableService;
    private int r;
    private CharSequence DatabaseMonitorService;
    private LiteBansModule_297 Utf8Handler_2;
    private SilentHandler BanHandler_4;
    private SilentHandler AsyncBackgroundTask_22;
    private final CommandSenderWrapper BroadcastService;
    private String LiteBansModule_433;
    private String LiteBansModule_194;
    private String B;
    private String GnuSparseMapHandler;
    private String HoverTextFormatter;
    private final StringBuilder A;
    private final String[] g;
    private final ArrayList q;
    private final List AsyncBackgroundTask_21;
    private InitHandler CommandThrottleService;
    private final LitebansNotifyHandler D;
    public NoneHandler_2(@NotNull BanHandler a_2, boolean flag, boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, boolean flag7, boolean flag8, boolean bl9, boolean bl10, boolean bl11, boolean bl12, boolean bl13, long l3, long l5, long l7, byte by2, @NotNull LiteBansModule_65 c12, @Nullable LiteBansModule_174 eM2, boolean bl14, @NotNull LiteBansModule_66 c52, int n, @NotNull CharSequence charSequence, @Nullable LiteBansModule_297 iA2, @Nullable SilentHandler dZ2, @Nullable SilentHandler dZ3, @NotNull CommandSenderWrapper sender, @NotNull String string, @NotNull String string2, @NotNull String string3, @Nullable String string4, @NotNull String string5, @NotNull StringBuilder stringBuilder, @NotNull String[] args, @NotNull ArrayList arrayList, @NotNull List list) {
        this.z = a_2;
        this.LiteBansModule_240 = flag;
        this.e = flag2;
        this.F = flag3;
        this.K = flag4;
        this.c = flag5;
        this.i = flag6;
        this.ServerSyncService = flag7;
        this.plugin = flag8;
        this.H = bl9;
        this.BanHandler_2 = bl10;
        this.AsyncBackgroundTask_5 = bl11;
        this.PlayerQuitListener = bl12;
        this.LiteBansModule_401 = bl13;
        this.LiteBansModule_430 = l3;
        this.LiteBansModule_31 = l5;
        this.m = l7;
        this.L = by2;
        this.PunishmentService = c12;
        this.BanHandler_5 = eM2;
        this.n = bl14;
        this.PunishmentTableService = c52;
        this.r = n;
        this.DatabaseMonitorService = charSequence;
        this.Utf8Handler_2 = iA2;
        this.BanHandler_4 = dZ2;
        this.AsyncBackgroundTask_22 = dZ3;
        this.BroadcastService = sender;
        this.LiteBansModule_433 = string;
        this.LiteBansModule_194 = string2;
        this.B = string3;
        this.GnuSparseMapHandler = string4;
        this.HoverTextFormatter = string5;
        this.A = stringBuilder;
        this.g = args;
        this.q = arrayList;
        this.AsyncBackgroundTask_21 = list;
        this.CommandThrottleService = InitHandler.LiteBansModule_240;
        this.D = new LitebansNotifyHandler(this);
        LitebansNotifyHandler.BaseCoreGenericHandler(this.D, null, false, false, 7, null);
    }

    public /* synthetic */ NoneHandler_2(BanHandler a_2, boolean flag, boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, boolean flag7, boolean flag8, boolean bl9, boolean bl10, boolean bl11, boolean bl12, boolean bl13, long l3, long l5, long l7, byte by2, LiteBansModule_65 c12, LiteBansModule_174 eM2, boolean bl14, LiteBansModule_66 c52, int n, CharSequence charSequence, LiteBansModule_297 iA2, SilentHandler dZ2, SilentHandler dZ3, CommandSenderWrapper sender, String string, String string2, String string3, String string4, String string5, StringBuilder stringBuilder, String[] args, ArrayList arrayList, List list, int n2, int n3, LiteBansModule_14 aJ2) {
        if ((n2 & 2) != 0) {
            flag = false;
        }
        if ((n2 & 4) != 0) {
            flag2 = false;
        }
        if ((n2 & 8) != 0) {
            flag3 = false;
        }
        if ((n2 & 0x10) != 0) {
            flag4 = false;
        }
        if ((n2 & 0x20) != 0) {
            flag5 = false;
        }
        if ((n2 & 0x40) != 0) {
            flag6 = false;
        }
        if ((n2 & 0x80) != 0) {
            flag7 = false;
        }
        if ((n2 & 0x100) != 0) {
            flag8 = false;
        }
        if ((n2 & 0x200) != 0) {
            bl9 = false;
        }
        if ((n2 & 0x400) != 0) {
            bl10 = false;
        }
        if ((n2 & 0x800) != 0) {
            bl11 = false;
        }
        if ((n2 & 0x1000) != 0) {
            bl12 = false;
        }
        if ((n2 & 0x2000) != 0) {
            bl13 = false;
        }
        if ((n2 & 0x8000) != 0) {
            l5 = -1L;
        }
        if ((n2 & 0x10000) != 0) {
            l7 = 0L;
        }
        if ((n2 & 0x20000) != 0) {
            by2 = 0;
        }
        if ((n2 & 0x40000) != 0) {
            c12 = LiteBansModule_65.LiteBansModule_31.BaseCoreGenericHandler();
        }
        if ((n2 & 0x80000) != 0) {
            eM2 = null;
        }
        if ((n2 & 0x100000) != 0) {
            bl14 = false;
        }
        if ((n2 & 0x200000) != 0) {
            c52 = LiteBansModule_65.LiteBansModule_31.LiteBansModule_31();
        }
        if ((n2 & 0x400000) != 0) {
            n = -1;
        }
        if ((n2 & 0x800000) != 0) {
            charSequence = MessageKey.LiteBansModule_60;
        }
        if ((n2 & 0x1000000) != 0) {
            iA2 = null;
        }
        if ((n2 & 0x2000000) != 0) {
            dZ2 = null;
        }
        if ((n2 & 0x4000000) != 0) {
            dZ3 = null;
        }
        if ((n2 & 0x20000000) != 0) {
            ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
            CommandSenderWrapper jv_03 = sender;
            string2 = jv_03.e() ? jv_03.BaseCoreGenericHandler() : jv_03.i();
        }
        if ((n3 & 1) != 0) {
            string5 = "";
        }
        if ((n3 & 2) != 0) {
            stringBuilder = new StringBuilder();
        }
        if ((n3 & 4) != 0) {
            args = new String[]{ }
        }
        if ((n3 & 8) != 0) {
            arrayList = new ArrayList(args.length);
        }
        if ((n3 & 0x10) != 0) {
            list = new ArrayList();
        }
        this(a_2, flag, flag2, flag3, flag4, flag5, flag6, flag7, flag8, bl9, bl10, bl11, bl12, bl13, l3, l5, l7, by2, c12, eM2, bl14, c52, n, charSequence, iA2, dZ2, dZ3, sender, string, string2, string3, string4, string5, stringBuilder, args, arrayList, list);
    }

    public final BanHandler ServerSyncService() {
        return this.z;
    }

    public final void BaseCoreGenericHandler(@NotNull BanHandler a_2) {
        this.z = a_2;
    }

    public final boolean HoverTextFormatter() {
        return this.LiteBansModule_240;
    }

    public final void m(boolean flag) {
        this.LiteBansModule_240 = flag;
    }

    public final boolean B() {
        return this.e;
    }

    public final void Utf8Handler_2(boolean flag) {
        this.e = flag;
    }

    public final boolean c() {
        return this.F;
    }

    public final void LiteBansModule_240(boolean flag) {
        this.F = flag;
    }

    public final boolean LiteBansModule_401() {
        return this.K;
    }

    public final void LiteBansModule_401(boolean flag) {
        this.K = flag;
    }

    public final boolean F() {
        return this.c;
    }

    public final void LiteBansModule_31(boolean flag) {
        this.c = flag;
    }

    public final boolean BanHandler_2() {
        return this.i;
    }

    public final void g(boolean flag) {
        this.i = flag;
    }

    public final boolean LiteBansModule_433() {
        return this.ServerSyncService;
    }

    public final void LiteBansModule_194(boolean flag) {
        this.ServerSyncService = flag;
    }

    public final boolean K() {
        return this.plugin;
    }

    public final void AsyncBackgroundTask_5(boolean flag) {
        this.plugin = flag;
    }

    public final boolean Utf8Handler_2() {
        return this.H;
    }

    public final void i(boolean flag) {
        this.H = flag;
    }

    public final boolean LiteBansModule_194() {
        return this.BanHandler_2;
    }

    public final void e(boolean flag) {
        this.BanHandler_2 = flag;
    }

    public final boolean PunishmentTableService() {
        return this.AsyncBackgroundTask_5;
    }

    public final void c(boolean flag) {
        this.AsyncBackgroundTask_5 = flag;
    }

    public final void GnuSparseMapHandler(boolean flag) {
        this.PlayerQuitListener = flag;
    }

    public final long J() {
        return this.LiteBansModule_430;
    }

    public final long DatabaseMonitorService() {
        return this.LiteBansModule_31;
    }

    public final void LiteBansModule_31(long l3) {
        this.LiteBansModule_31 = l3;
    }

    public final long BroadcastService() {
        return this.m;
    }

    public final void BaseCoreGenericHandler(long l3) {
        this.m = l3;
    }

    public final byte r() {
        return this.L;
    }

    public final void BaseCoreGenericHandler(byte by2) {
        this.L = by2;
    }

    public final LiteBansModule_65 g() {
        return this.PunishmentService;
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_65 c12) {
        this.PunishmentService = c12;
    }

    public final LiteBansModule_174 i() {
        return this.BanHandler_5;
    }

    public final void BaseCoreGenericHandler(@Nullable LiteBansModule_174 eM2) {
        this.BanHandler_5 = eM2;
    }

    public final boolean m() {
        return this.n;
    }

    public final void BaseCoreGenericHandler(boolean flag) {
        this.n = flag;
    }

    public final LiteBansModule_66 L() {
        return this.PunishmentTableService;
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_66 c52) {
        this.PunishmentTableService = c52;
    }

    public final int D() {
        return this.r;
    }

    public final void BaseCoreGenericHandler(int n) {
        this.r = n;
    }

    public final CharSequence LiteBansModule_240() {
        return this.DatabaseMonitorService;
    }

    public final void BaseCoreGenericHandler(@NotNull CharSequence charSequence) {
        this.DatabaseMonitorService = charSequence;
    }

    public final LiteBansModule_297 AsyncBackgroundTask_22() {
        return this.Utf8Handler_2;
    }

    public final void BaseCoreGenericHandler(@Nullable LiteBansModule_297 iA2) {
        this.Utf8Handler_2 = iA2;
    }

    public final SilentHandler q() {
        return this.BanHandler_4;
    }

    public final void LiteBansModule_31(@Nullable SilentHandler dZ2) {
        this.BanHandler_4 = dZ2;
    }

    public final SilentHandler GnuSparseMapHandler() {
        return this.AsyncBackgroundTask_22;
    }

    public final void BaseCoreGenericHandler(@Nullable SilentHandler dZ2) {
        this.AsyncBackgroundTask_22 = dZ2;
    }

    public final CommandSenderWrapper BaseCoreGenericHandler() {
        return this.BroadcastService;
    }

    public final String H() {
        return this.LiteBansModule_433;
    }

    public final void c(@NotNull String string) {
        this.LiteBansModule_433 = string;
    }

    public final String AsyncBackgroundTask_5() {
        return this.LiteBansModule_194;
    }

    public final void BaseCoreGenericHandler(@NotNull String string) {
        this.LiteBansModule_194 = string;
    }

    public final String LiteBansModule_31() {
        return this.B;
    }

    public final void AsyncBackgroundTask_5(@NotNull String string) {
        this.B = string;
    }

    public final String CommandThrottleService() {
        return this.GnuSparseMapHandler;
    }

    public final void e(@Nullable String string) {
        this.GnuSparseMapHandler = string;
    }

    public final String AsyncBackgroundTask_21() {
        return this.HoverTextFormatter;
    }

    public final void LiteBansModule_31(@NotNull String string) {
        this.HoverTextFormatter = string;
    }

    public final StringBuilder n() {
        return this.A;
    }

    public final String[] z() {
        return this.g;
    }

    public final ArrayList A() {
        return this.q;
    }

    public final void BaseCoreGenericHandler(@NotNull InitHandler aI2) {
        this.CommandThrottleService = aI2;
        Object object = this.AsyncBackgroundTask_21;
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            Consumer consumer = (Consumer)t2;
            consumer.accept(this);
        }
        if (this.CommandThrottleService == InitHandler.g) {
            object = MessageHandler.BaseCoreGenericHandler;
            flag = false;
            ((ChatFormatter)object).BaseCoreGenericHandler("");
            throw new CommandExitException();
}

    public final boolean PunishmentService() {
        LiteBansModule_65 c12 = this.PunishmentService;
        return ObjectUtilities.BaseCoreGenericHandler(c12.LiteBansModule_194() & 0xFF, 0xFFFFFFFF & 0xFF) < 0;
    }

    public final boolean BanHandler_5() {
        boolean flag;
        switch (LiteBansModule_43.BaseCoreGenericHandler[this.z.ordinal()]) {
            case 1:
            case 2:
            case 3: {
                flag = true;
                break;
            }
            default: {
                flag = false;
}
        return flag;
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2) {
        List list = this.PunishmentTableService.LiteBansModule_31();
        if (list.isEmpty()) {
            list = this.PunishmentService.LiteBansModule_240().LiteBansModule_31();
        }
        if (list.isEmpty()) {
            return;
        }
        Collection collection = list;
        Collection collection2 = collection;
        this.D.BaseCoreGenericHandler(collection2.toArray(new String[0]), false, true);
        this.plugin(ch2, CollectionUtilities.BaseCoreGenericHandler((Collection)list), false);
    }

    public final void BanHandler_4() {
        BanHandler a_2;
        switch (LiteBansModule_43.BaseCoreGenericHandler[this.z.ordinal()]) {
            case 4: {
                a_2 = BanHandler.AsyncBackgroundTask_5;
                break;
            }
            case 5: {
                a_2 = BanHandler.n;
                break;
            }
            case 6: {
                a_2 = BanHandler.e;
                break;
            }
            default: {
                a_2 = this.z;
}
        this.z = a_2;
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull String string, @NotNull String string2) {
        boolean flag = this.LiteBansModule_31(ch2, string, string2);
        if (!this.BanHandler_5() && flag && !this.plugin(ch2, string2)) {
            CharSequence charSequence;
            BanHandler a_2 = this.z;
            switch (LiteBansModule_274.BaseCoreGenericHandler[a_2.c().ordinal()]) {
                case 1: {
                    charSequence = MessageKey.LiteBansModule_105;
                    break;
                }
                case 2: {
                    charSequence = MessageKey.cY;
                    break;
                }
                case 3: {
                    charSequence = MessageKey.aS;
                    break;
                }
                case 4: {
                    charSequence = MessageKey.T;
                    break;
                }
                default: {
                    AssertionUtilities.BaseCoreGenericHandler();
                    throw new CommandExitException();
}
            this.plugin(ch2, (Object)charSequence);
            throw new CommandExitException();
}

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 v1, @NotNull CommandSenderWrapper v2, @NotNull SilentHandler v3, @Nullable LiteBansModule_297 arg1) {
{
            arg2 = v3;
            arg3 = (String[])v1.e().BaseCoreGenericHandler(ConfigService.class);
            arg4 = arg2.BroadcastService();
            if (v2.LiteBansModule_194()) {
                arg5 = arg3.LiteBansModule_194().PlayerproviderHandler();
                if (arg5 > 0L) {
                    CommandArgumentUtils.BaseCoreGenericHandler(v1, v1, arg2, arg4, arg5, 0L, arg1, false);
                }
                return;
            }
            arg6 = arg3.LiteBansModule_194().L();
            arg7 = CollectionUtilities.BaseCoreGenericHandler((Iterable)arg6, (Comparator)new LiteBansModule_218(v3));
            arg6 = arg3;
            if (arg6.g()) {
                arg8 = arg6;
                arg8.BaseCoreGenericHandler(arg7);
            }
            arg9 = arg7;
            for (T arg10 : arg9) {
                arg11 = (LiteBansModule_109)arg10;
                arg12 = arg3;
                if (arg12.g()) {
                    arg13 = arg12;
                    arg14 = v2;
                    arg15 = arg11.BaseCoreGenericHandler();
                    arg13.BaseCoreGenericHandler((Object)("for " + arg11.BaseCoreGenericHandler() + ' ' + arg14.e(arg15)));
                }
                if (ObjectUtilities.BaseCoreGenericHandler((Object)arg11.BaseCoreGenericHandler(), (Object)"none")) ** GOTO lbl-1000
                arg12 = v2;
                arg16 = arg11.BaseCoreGenericHandler();
                if (arg12.e(arg16)) lbl-1000:
                                {
                } else {
                }
                if (!v0) continue;
                v1 = arg10;
                break;
}
        arg6 = v1;
        if (arg6 != null) {
            arg17 = arg6.LiteBansModule_194().BaseCoreGenericHandler(v3);
            arg18 = arg3;
            arg19 = 5;
            if (arg18.BaseCoreGenericHandler(arg19)) {
                arg8 = arg18;
                arg20 = arg17;
                arg8.BaseCoreGenericHandler((Object)(v2.i() + "'AsyncBackgroundTask_21 " + arg2.ServerSyncService() + " cooldown is " + PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, arg20, false, 2, null) + '.'));
            }
            if (arg17 > 0L) {
{
                    arg18 = v2;
                    arg21 = new String[]{"litebans.cooldown.bypass", "litebans.cooldown.bypass + " + arg2.ServerSyncService()};
                    arg22 = arg18;
                    arg12 = Arrays.copyOf(arg21, arg21.length);
                    arg13 = arg12;
                    arg23 = arg13.length;
                    for (arg24 = 0; arg24 < arg23; ++arg24) {
                        arg25 = arg26 = arg13[arg24];
                        if (!arg22.e(arg25)) continue;
                        break;
}
                if (v2 == false) {
                    CommandArgumentUtils.BaseCoreGenericHandler(v1, v1, arg2, arg4, arg17, arg6.LiteBansModule_194().BaseCoreGenericHandler(), arg1, false, 64, null);
}

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull CommandSenderWrapper sender) {
        return this.LiteBansModule_31(ch2, sender.i(), sender.BaseCoreGenericHandler());
    }

    public final boolean LiteBansModule_31(@NotNull LiteBansModule_82 ch2, @NotNull String string, @NotNull String string2) {
        Object object;
        Object object2;
        ConfigService configService;
        BroadcastService o2 = (BroadcastService)ch2.e().BaseCoreGenericHandler(BroadcastService.class);
        ConfigService q_03 = (ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class);
        String string3 = null;
        string3 = string2;
        String string4 = this.z.toString();
        string3 = HexEncodingHelper.LiteBansModule_194(string3);
        if (q_03.r().LiteBansModule_31() || !q_03.LiteBansModule_194().LockdownService()) {
            q_03.BaseCoreGenericHandler(1, (Object)"Exempting is ");
            return false;
        }
        if (this.plugin(ch2, string, string3, this.z)) {
            return true;
        }
        ConfigService q_04 = q_03;
        int n = 1;
        byte by2 = 0;
        if (q_04.BaseCoreGenericHandler(n)) {
            configService = q_04;
            configService.BaseCoreGenericHandler((Object)(string + " is not InitializerHandler_3 "));
        }
        Object object3 = o2.AsyncBackgroundTask_5();
        by2 = ch2.e().AsyncBackgroundTask_22();
        if (by2 == 0) {
            object2 = null;
            try {
                object2 = UUID.fromString(string3);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                q_03.BaseCoreGenericHandler(illegalArgumentException, 0);
                return false;
            }
            LiteBansModule_158 ec_02 = ch2.e().i();
            ObjectUtilities.LiteBansModule_31(ec_02, "");
            BungeecordHandler_2 ao_02 = (BungeecordHandler_2)ec_02;
            flag = ao_02.LiteBansModule_31().c() != null && ao_02.LiteBansModule_31().BaseCoreGenericHandler(string3, (UUID)object2, string4, "litebans.exempt", q_03.LiteBansModule_194().aL(), q_03.LiteBansModule_194().CommandExitException());
        } else if (by2 == 3 || by2 == 1 || by2 == 2) {
            object2 = o2.BaseCoreGenericHandler(string3);
            if (object2 != null) {
                flag = object2.e("litebans.exempt") || object2.e("litebans + " + string4);
            } else if (ch2.e().AsyncBackgroundTask_22() == 1) {
                boolean flag2;
                GetcancelreasoncomponentsHandler k12;
{
                    LiteBansModule_158 ec_03 = ch2.e().i();
                    ObjectUtilities.LiteBansModule_31(ec_03, "");
                    k12 = (GetcancelreasoncomponentsHandler)ec_03;
                    String[] args = q_03.LiteBansModule_194().CommandExitException();
                    int n2 = args.length;
                    for (int i = 0; i < n2; ++i) {
                        String string5;
                        String string6 = string5 = args[i];
                        if (!k12.BaseCoreGenericHandler(string, string3, string6)) continue;
                        flag2 = true;
                        break;
                    }
                    flag2 = false;
                }
                flag = flag2;
                flag = flag || k12.LiteBansModule_31(string, string3, "litebans.exempt") || k12.LiteBansModule_31(string, string3, "litebans + " + string4);
} else {
            AssertionUtilities.BaseCoreGenericHandler();
            throw new CommandExitException();
        }
        if (!flag && object3 != null && (object = LiteBansModule_48.LiteBansModule_31.BaseCoreGenericHandler(object3, string3)) != null) {
            flag = LiteBansModule_48.LiteBansModule_31.LiteBansModule_31(object, "litebans.exempt") || LiteBansModule_48.LiteBansModule_31.LiteBansModule_31(object, "litebans + " + string4);
        }
        ConfigService q_05 = q_03;
        int n3 = 1;
        if (q_05.BaseCoreGenericHandler(n3)) {
            configService = q_05;
            configService.BaseCoreGenericHandler((Object)(string + " exempt? " + flag));
        }
        return flag;
    }

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull String string, @NotNull String string2, @NotNull BanHandler a_2) {
        ConfigService configService = (ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class);
        String string3 = a_2.toString();
        for (String string4 : configService.LiteBansModule_194().r()) {
            Object object = new char[]{':'};
            object = StringUtilities.BaseCoreGenericHandler((CharSequence)string4, object, false, 2, 2, null);
            Object object2 = object;
            String[] args = object2.toArray(new String[0]);
            if (!ObjectUtilities.BaseCoreGenericHandler(object = args[0], (Object)string2) && !StringUtilities.BaseCoreGenericHandler((String)object, string, true) || args.length != 1 && !StringUtilities.BaseCoreGenericHandler(args[1], string3, true)) continue;
            ConfigService q_03 = configService;
            int n = 1;
            if (q_03.BaseCoreGenericHandler(n)) {
                ConfigService q_04 = q_03;
                q_04.BaseCoreGenericHandler((Object)(string + " exempt? true"));
            }
            return true;
        }
        return false;
    }

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @Nullable String string) {
        boolean flag;
        boolean flag2;
        boolean flag3;
        Object object;
        ConfigService configService;
{
            Object object2;
            BroadcastService o2 = (BroadcastService)ch2.e().BaseCoreGenericHandler(BroadcastService.class);
            configService = (ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class);
            if (this.BroadcastService.LiteBansModule_194()) {
                return true;
            }
            if (this.BroadcastService.e()) {
                Object object3;
                if (configService.LiteBansModule_194().ac() && (object3 = o2.AsyncBackgroundTask_5()) != null && string != null) {
                    object = LiteBansModule_48.LiteBansModule_31.BaseCoreGenericHandler(object3, this.BroadcastService.BaseCoreGenericHandler());
                    object2 = LiteBansModule_48.LiteBansModule_31.BaseCoreGenericHandler(object3, string);
                    if (object != null && object2 != null) {
                        int n;
                        int n2 = LiteBansModule_48.LiteBansModule_31.BaseCoreGenericHandler(object3, object);
                        if (n2 >= (n = LiteBansModule_48.LiteBansModule_31.BaseCoreGenericHandler(object3, object2))) {
                            ConfigService q_03 = configService;
                            int n3 = 1;
                            if (q_03.BaseCoreGenericHandler(n3)) {
                                ConfigService q_04 = q_03;
                                q_04.BaseCoreGenericHandler((Object)("Group weight of " + this.BroadcastService.i() + " (" + n2 + ") >= target weight of " + n));
                            }
                            return n2 != n || configService.LiteBansModule_194().LiteBansModule_430();
                        }
                        ConfigService q_05 = configService;
                        int n4 = 1;
                        if (q_05.BaseCoreGenericHandler(n4)) {
                            ConfigService q_06 = q_05;
                            q_06.BaseCoreGenericHandler((Object)("Group weight of " + this.BroadcastService.i() + " (" + n2 + ") does not exceed " + n));
                        }
                        return false;
                    }
                    configService.BaseCoreGenericHandler(1, (Object)"Missing user!");
                }
                if (!configService.LiteBansModule_194().HikariConfig()) {
                    object3 = configService;
                    int n = 1;
                    if (((ConfigService)object3).BaseCoreGenericHandler(n)) {
                        Object object4 = object3;
                        ((ConfigService)object4).BaseCoreGenericHandler((Object)"allow_exempt_bypass is ");
                    }
                    return false;
}
            object = this.BroadcastService;
            object2 = new String[]{"litebans.exempt.bypass", "litebans.exempt + " + this.z};
            flag3 = false;
            Object object5 = object2;
            int n = ((String[])object5).length;
            for (int i = 0; i < n; ++i) {
                String string2;
                String string3 = string2 = object5[i];
                if (!object.e(string3)) continue;
                flag2 = true;
                break;
            }
            flag2 = false;
        }
        if (flag = flag2) {
            object = configService;
            int n = 1;
            flag3 = false;
            if (((ConfigService)object).BaseCoreGenericHandler(n)) {
                Object object6 = object;
                ((ConfigService)object6).BaseCoreGenericHandler((Object)(this.BroadcastService.i() + " bypasses exempt "));
}
        return flag;
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull CharSequence charSequence) {
        CommandSenderWrapper sender = (CommandSenderWrapper)MessageHandler.BaseCoreGenericHandler.LiteBansModule_31().get();
        if (sender != null) {
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, sender, AllHandler_3.BaseCoreGenericHandler(ch2, charSequence, this.BanHandler_4, this.Utf8Handler_2, false, 4, null), null, 4, null);
}

    public final Void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @Nullable Object object) {
        MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)String.valueOf(object), this.BanHandler_4, this.Utf8Handler_2, false, 4, null));
        throw new CommandExitException();
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull List list, boolean flag) {
        LiteBansModule_181 eq_02;
        DatabaseMonitorService w2 = (DatabaseMonitorService)ch2.e().BaseCoreGenericHandler(DatabaseMonitorService.class);
        LiteBansModule_181 eq_03 = eq_02 = LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(this.BroadcastService, list, w2.ServerSyncService(), flag);
        CharSequence charSequence = eq_03.BaseCoreGenericHandler();
        String string = charSequence == null || charSequence.length() == 0 ? null : eq_03.BaseCoreGenericHandler();
        if (string == null) {
            string = this.B;
        }
        this.B = string;
        this.B = LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(this.B, w2.ServerSyncService(), this.BroadcastService);
    }

    public static /* synthetic */ void BaseCoreGenericHandler(NoneHandler_2 cz2, LiteBansModule_82 ch2, List list, boolean flag, int n, Object object) {
        if ((n & 1) != 0) {
            list = cz2.q;
        }
        if ((n & 2) != 0) {
            flag = true;
        }
        cz2.BaseCoreGenericHandler(ch2, list, flag);
    }

    public final void LiteBansModule_31(@NotNull LiteBansModule_82 v1) {
{
                        v2 = (ConfigService)v1.e().BaseCoreGenericHandler(ConfigService.class);
                        v3 = v2.LiteBansModule_194();
                        arg1 = this.z.c();
                        arg2 = this.BroadcastService;
                        arg27 = new String[]{NoneHandler_2 + "litebans.unlimited", "litebans.unlimited + " + arg1, "litebans.group.unlimited"};
                        arg28 = arg2;
                        arg29 = Arrays.copyOf(arg27, arg27.length);
                        arg30 = arg29;
                        arg31 = ((String[])arg30).length;
                        for (arg32 = 0; arg32 < arg31; ++arg32) {
                            arg33 = arg34 = arg30[arg32];
                            if (!arg28.e(arg33)) continue;
                            break;
}
                    if (!(v0 == false)) break;
                    if (this.BanHandler_5()) break;
                    arg2 = v3.L();
                    if (arg2 instanceof Collection && ((Collection)arg2).isEmpty()) {
                    } else {
                        arg35 = arg2.iterator();
                        while (arg35.hasNext()) {
                            arg28 = arg35.next();
                            arg29 = (LiteBansModule_109)arg28;
                            if (!arg29.e().BaseCoreGenericHandler()) continue;
                            break;
}
                if (!v1) break;
                v6 = v3.L();
                arg2 = CollectionUtilities.BaseCoreGenericHandler((Iterable)v6, (Comparator)new LiteBansModule_61());
                v6 = NoneHandler_3.BaseCoreGenericHandler((Iterable)arg2, this.BroadcastService);
                arg36 = MessageHandler.BaseCoreGenericHandler;
                v2 = v6;
                v3 = v2 != null && (v2 = v2.e()) != null ? v2.BaseCoreGenericHandler() : false;
                if (!v3) ** GOTO lbl-1000
                arg28 = this.PunishmentService;
                arg37 = arg28;
                if (ObjectUtilities.BaseCoreGenericHandler(arg37.LiteBansModule_194() & 255, -1 & 255) < 0 == false) {
                } else lbl-1000:
                                {
                }
                arg38 = v4;
                arg29 = MessageKey.cm;
                arg30 = arg36;
                if (arg38) {
                    arg39 = arg30;
                    arg39.BaseCoreGenericHandler(arg29);
                    throw new CommandExitException();
}
            if (arg1 == BanHandler.LiteBansModule_240 || arg1 == BanHandler.GnuSparseMapHandler) {
                arg40 = v3.L();
                arg2 = CollectionUtilities.BaseCoreGenericHandler((Iterable)arg40, (Comparator)new LiteBansModule_361(arg1));
                arg40 = v2;
                if (arg40.g()) {
                    arg41 = arg40;
                    arg41.BaseCoreGenericHandler(arg2);
                }
                v5 = NoneHandler_3.BaseCoreGenericHandler((Iterable)arg2, this.BroadcastService);
                if (v5 == null) {
                    return;
                }
                arg40 = v5;
                arg42 = arg40.c().BaseCoreGenericHandler(arg1);
                if (arg42 > 0L && arg42 < 0x7FFFFFFFFFFFFFFFL && (this.LiteBansModule_31 > (arg43 = litebans.DatabaseMonitorService.BaseCoreGenericHandler(v1.AsyncBackgroundTask_5(), false, 1, null) + arg42) || this.LiteBansModule_31 <= 0L)) {
                    if (v3.LiteBansModule_433()) {
                        this.LiteBansModule_31 = arg43;
                        arg44 = arg42;
                        this.DatabaseMonitorService = PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, arg44, false, 2, null);
                    } else {
                        arg45 = arg42;
                        this.plugin(v1, (Object)MessageKey.g.BaseCoreGenericHandler("duration", (Object)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, arg45, false, 2, null)));
                        throw new CommandExitException();
}

    public final CharSequence c(@NotNull LiteBansModule_82 ch2) {
        CharSequence charSequence;
        char c;
        int n;
        DiscordWebhookClient eG2 = ((ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194();
        boolean flag = this.z == BanHandler.g ? eG2.i() : (this.z == BanHandler.c ? true : (this.BanHandler_5() ? eG2.ad() : eG2.aq()));
        Object object = this.A;
        int n3 = object.length() - 1;
        while (n2 <= n3) {
            n = !flag3 ? n2 : n3;
            c = object.charAt(n);
            char c10 = c = ObjectUtilities.BaseCoreGenericHandler(c, 32) <= 0 ? (char)'\u0001' : '\u0000';
            if (!flag3) {
                if (c == '\u0000') {
                    flag3 = true;
                    continue;
                }
                ++n2;
                continue;
            }
            if (c == '\u0000') break;
            --n3;
        }
        if (StringUtilities.c(charSequence = object.subSequence(n2, n3 + 1), '{', false, 2, null) || StringUtilities.c(charSequence, '}', false, 2, null)) {
            object = this.BroadcastService;
            String string = "litebans.admin";
            n2 = 0;
            Object object2 = object;
            flag3 = false;
            if (!object2.e(string)) {
                charSequence = StringUtilities.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler(((Object)charSequence).toString(), "{hoverText:", "", false, 4, null), "{run:", "", false, 4, null), "{url:", "", false, 4, null), J[43], J[44], false, 4, null);
}
        if (StringUtilities.c(charSequence, '\n', false, 2, null)) {
            object = this.BroadcastService;
            String string = J[45];
            n2 = 0;
            Object object3 = object;
            flag3 = false;
            if (!object3.e(string)) {
                charSequence = StringUtilities.BaseCoreGenericHandler(((Object)charSequence).toString(), J[46], J[47], false, 4, null);
}
        if (!this.BanHandler_5()) {
            if (StringUtilities.LiteBansModule_31(charSequence)) {
                if (this.PunishmentService()) {
                    CharSequence charSequence2;
                    String string = this.PunishmentTableService.BaseCoreGenericHandler();
                    if (string != null) {
                        charSequence2 = string;
                    } else {
                        String string2 = this.PunishmentService.LiteBansModule_240().BaseCoreGenericHandler();
                        if (string2 != null) {
                            charSequence2 = string2;
                        } else {
                            CharSequence charSequence3;
                            Object object4 = this.z;
                            flag3 = false;
                            switch (LiteBansModule_274.BaseCoreGenericHandler[((BanHandler)object4).c().ordinal()]) {
                                case 1: {
                                    charSequence3 = MessageKey.Utf8Handler_2;
                                    break;
                                }
                                case 2: {
                                    charSequence3 = MessageKey.LiteBansModule_118;
                                    break;
                                }
                                default: {
                                    charSequence3 = null;
}
                            charSequence2 = charSequence3;
                            if (charSequence3 == null) {
                                MessageKey am2;
                                MessageKey am3;
                                object4 = BanHandler_3.GnuSparseMapHandler;
                                BanHandler a_2 = this.z;
                                n = 0;
                                c = '\u0000';
                                Object object5 = MessageKey.cC;
                                switch (LiteBansModule_190.BaseCoreGenericHandler[a_2.ordinal()]) {
                                    case 1: {
                                        if (object5 == MessageKey.LockdownCommandHandler) {
                                            am3 = MessageKey.NullHandler;
                                            break;
                                        }
                                        am3 = MessageKey.LiteBansModule_102;
                                        break;
                                    }
                                    case 2: {
                                        if (object5 == MessageKey.LockdownCommandHandler) {
                                            am3 = MessageKey.ah;
                                            break;
                                        }
                                        am3 = MessageKey.HexEncodingHelper;
                                        break;
                                    }
                                    case 3: {
                                        am3 = MessageKey.LiteBansModule_37;
                                        break;
                                    }
                                    default: {
                                        am3 = object5;
}
                                CharSequence charSequence4 = am3;
                                object5 = MessageHandler.BaseCoreGenericHandler;
                                flag5 = a_2 == BanHandler.g;
                                Object object6 = object5;
                                if (flag5) {
                                    Object object7 = object6;
                                    ((ChatFormatter)object7).BaseCoreGenericHandler(charSequence4);
                                    throw new CommandExitException();
                                }
                                Object object8 = object4;
                                MessageKey am4 = MessageKey.LockdownCommandHandler;
                                switch (LiteBansModule_190.BaseCoreGenericHandler[a_2.ordinal()]) {
                                    case 1: {
                                        if (am4 == MessageKey.LockdownCommandHandler) {
                                            am2 = MessageKey.NullHandler;
                                            break;
                                        }
                                        am2 = MessageKey.LiteBansModule_102;
                                        break;
                                    }
                                    case 2: {
                                        if (am4 == MessageKey.LockdownCommandHandler) {
                                            am2 = MessageKey.ah;
                                            break;
                                        }
                                        am2 = MessageKey.HexEncodingHelper;
                                        break;
                                    }
                                    case 3: {
                                        am2 = MessageKey.LiteBansModule_37;
                                        break;
                                    }
                                    default: {
                                        am2 = am4;
}
                                object5 = am2;
                                MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(LiteBansModule_242.BaseCoreGenericHandler(charSequence4, true, (CharSequence)object5));
                                throw new CommandExitException();
}
                    charSequence = charSequence2;
                } else {
                    CharSequence charSequence5;
                    object = MessageHandler.BaseCoreGenericHandler;
                    CharSequence charSequence6 = MessageKey.cl;
                    n2 = 0;
                    Object object9 = object;
                    flag3 = false;
                    if (flag) {
                        Object object10 = object9;
                        c = '\u0000';
                        ((ChatFormatter)object10).BaseCoreGenericHandler(charSequence6);
                        throw new CommandExitException();
                    }
                    charSequence6 = this.z;
                    n2 = 0;
                    switch (LiteBansModule_274.BaseCoreGenericHandler[((BanHandler)charSequence6).c().ordinal()]) {
                        case 1: {
                            charSequence5 = MessageKey.Utf8Handler_2;
                            break;
                        }
                        case 2: {
                            charSequence5 = MessageKey.LiteBansModule_118;
                            break;
                        }
                        default: {
                            charSequence5 = null;
}
                    CharSequence charSequence7 = charSequence5;
                    if (charSequence5 == null) {
                        charSequence7 = J[48];
                    }
                    charSequence = charSequence7;
} else if (StringUtilities.LiteBansModule_31(charSequence)) {
            CharSequence charSequence8;
            object = MessageHandler.BaseCoreGenericHandler;
            Object object11 = MessageKey.be;
            n2 = 0;
            Object object12 = object;
            flag3 = false;
            if (flag) {
                Object object13 = object12;
                c = '\u0000';
                ((ChatFormatter)object13).BaseCoreGenericHandler(object11);
                throw new CommandExitException();
            }
            object11 = this.z;
            n2 = 0;
            switch (LiteBansModule_274.BaseCoreGenericHandler[((BanHandler)object11).c().ordinal()]) {
                case 1: {
                    charSequence8 = MessageKey.df;
                    break;
                }
                case 2: {
                    charSequence8 = MessageKey.LockdownService;
                    break;
                }
                case 3: {
                    charSequence8 = MessageKey.cu;
                    break;
                }
                default: {
                    charSequence8 = null;
}
            if (charSequence8 == null) {
                MessageKey am5;
                MessageKey am6;
                object11 = BanHandler_3.GnuSparseMapHandler;
                BanHandler a_3 = this.z;
                flag3 = false;
                Object object14 = MessageKey.cC;
                c = '\u0000';
                switch (LiteBansModule_190.BaseCoreGenericHandler[a_3.ordinal()]) {
                    case 1: {
                        if (object14 == MessageKey.LockdownCommandHandler) {
                            am6 = MessageKey.NullHandler;
                            break;
                        }
                        am6 = MessageKey.LiteBansModule_102;
                        break;
                    }
                    case 2: {
                        if (object14 == MessageKey.LockdownCommandHandler) {
                            am6 = MessageKey.ah;
                            break;
                        }
                        am6 = MessageKey.HexEncodingHelper;
                        break;
                    }
                    case 3: {
                        am6 = MessageKey.LiteBansModule_37;
                        break;
                    }
                    default: {
                        am6 = object14;
}
                CharSequence charSequence9 = am6;
                object14 = MessageHandler.BaseCoreGenericHandler;
                c = a_3 == BanHandler.g ? (char)'\u0001' : '\u0000';
                Object object15 = object14;
                if (c != '\u0000') {
                    Object object16 = object15;
                    ((ChatFormatter)object16).BaseCoreGenericHandler(charSequence9);
                    throw new CommandExitException();
                }
                Object object17 = object11;
                MessageKey am7 = MessageKey.LockdownCommandHandler;
                switch (LiteBansModule_190.BaseCoreGenericHandler[a_3.ordinal()]) {
                    case 1: {
                        if (am7 == MessageKey.LockdownCommandHandler) {
                            am5 = MessageKey.NullHandler;
                            break;
                        }
                        am5 = MessageKey.LiteBansModule_102;
                        break;
                    }
                    case 2: {
                        if (am7 == MessageKey.LockdownCommandHandler) {
                            am5 = MessageKey.ah;
                            break;
                        }
                        am5 = MessageKey.HexEncodingHelper;
                        break;
                    }
                    case 3: {
                        am5 = MessageKey.LiteBansModule_37;
                        break;
                    }
                    default: {
                        am5 = am7;
}
                object14 = am5;
                MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(LiteBansModule_242.BaseCoreGenericHandler(charSequence9, true, (CharSequence)object14));
                throw new CommandExitException();
            }
            charSequence = charSequence8;
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, charSequence, this.PunishmentService, this.r);
    }

    public final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_82 v1, @NotNull LiteBansModule_113 v2) {
{
                v0 = this.BanHandler_4;
                ObjectUtilities.BaseCoreGenericHandler(v0);
                v3 = v0;
                v1 = this.PunishmentTableService.LiteBansModule_194();
                if (v1 == null) break;
                v2 = v1;
                break;
            }
            switch (LiteBansModule_43.BaseCoreGenericHandler[v3.ServerSyncService().ordinal()]) {
                case 4: {
                    if (!v3.LiteBansModule_240()) ** GOTO lbl-1000
                    arg2 = v3;
                    if (arg2.HoverTextFormatter() == false) {
                        v3 = MessageKey.LiteBansModule_2;
                    } else if (v3.LiteBansModule_240() && v3.HoverTextFormatter()) {
                        v3 = MessageKey.LiteBansModule_6;
                    } else {
                        arg2 = v3;
                        v3 = arg2.HoverTextFormatter() == false != false ? MessageKey.cp : MessageKey.LiteBansModule_77;
                    }
                    v2 = v3;
                    break;
                }
                case 5: {
                    if (!v3.LiteBansModule_240()) ** GOTO lbl-1000
                    arg2 = v3;
                    if (arg2.HoverTextFormatter() == false) {
                        v4 = MessageKey.dq;
                    } else if (v3.LiteBansModule_240() && v3.HoverTextFormatter()) {
                        v4 = MessageKey.m;
                    } else {
                        arg2 = v3;
                        v4 = arg2.HoverTextFormatter() == false != false ? MessageKey.dx : MessageKey.ce;
                    }
                    v2 = v4;
                    break;
                }
                case 6: {
                    v2 = MessageKey.LiteBansModule_104;
                    break;
                }
                case 7: {
                    v2 = ((CharSequence)this.A).length() == 0 != false ? MessageKey.LiteBansModule_4 : MessageKey.LiteBansModule_78;
                    break;
                }
                default: {
                    AssertionUtilities.BaseCoreGenericHandler();
                    throw new CommandExitException();
}
        arg3 = v2;
        return this.plugin(v1, arg3, v2);
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @Nullable CommandSenderWrapper sender, @Nullable LiteBansModule_113 d92, boolean flag) {
        Object object;
        Object object2;
        NoneHandler_2 cz2 = this;
        if (cz2.PlayerQuitListener) {
            return;
        }
        LiteBansModule_113 d93 = d92;
        if (d93 == null) {
            CommandSenderWrapper jv_03 = sender;
            ObjectUtilities.BaseCoreGenericHandler(jv_03);
            object2 = jv_03.i();
            object = sender.BaseCoreGenericHandler();
            String string = ch2.BaseCoreGenericHandler(sender);
            String string2 = sender.LiteBansModule_31();
            d93 = new LiteBansModule_113((String)object2, null, string, (String)object, string2, sender, null, 66, null);
        }
        CharSequence charSequence = cz2.BaseCoreGenericHandler(ch2, d93);
        object2 = cz2.Utf8Handler_2;
        object = ch2.e();
        new BannedHandler(cz2, sender, (LiteBansModule_297)object2, charSequence, (PlatformPlugin)object, null, flag, false, 160, null).run();
    }

    public static /* synthetic */ void BaseCoreGenericHandler(NoneHandler_2 cz2, LiteBansModule_82 ch2, CommandSenderWrapper sender, LiteBansModule_113 d92, boolean flag, int n, Object object) {
        if ((n & 2) != 0) {
            d92 = null;
        }
        if ((n & 4) != 0) {
            flag = true;
        }
        cz2.BaseCoreGenericHandler(ch2, sender, d92, flag);
    }

    public final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull CharSequence charSequence, @NotNull LiteBansModule_113 d92) {
        CharSequence[] charSequenceArray = new CharSequence[]{J[49], this.DatabaseMonitorService};
        CharSequence charSequence2 = LiteBansModule_242.BaseCoreGenericHandler(charSequence, charSequenceArray);
        return d92.e() != null ? ch2.BaseCoreGenericHandler(charSequence2, d92.e()) : ch2.BaseCoreGenericHandler(charSequence2, d92);
    }

    public final String BaseCoreGenericHandler(@NotNull MessageHandler messageHandler) {
        return CommandArgumentUtils.BaseCoreGenericHandler(messageHandler, this.HoverTextFormatter);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean LiteBansModule_194(@Nullable String string) {
        if (!this.LiteBansModule_240) return false;
        if (string == null) return false;
        if (!StringUtilities.c((CharSequence)string, '*', false, 2, null) && !StringUtilities.c((CharSequence)string, '%', false, 2, null)) {
            if (!StringUtilities.c((CharSequence)string, '_', false, 2, null)) return false;
            String string2 = string;
            if (!HexEncodingHelper.BaseCoreGenericHandler.i(string2)) return false;
        }
        if (this.D.BaseCoreGenericHandler(string)) return false;
        return true;
    }

    public static /* synthetic */ boolean BaseCoreGenericHandler(NoneHandler_2 cz2, String string, int n, Object object) {
        if ((n & 1) != 0) {
            string = cz2.HoverTextFormatter;
        }
        return cz2.LiteBansModule_194(string);
    }

    private static final void e() {
        J = new String[]{"", StringDecryptor.BaseCoreGenericHandler("", 0x33F7337), "for ", "none", "'AsyncBackgroundTask_21 ", " cooldown is ", "litebans.cooldown.bypass", "litebans.cooldown + ", "Exempting is ", " is not InitializerHandler_3 ", "", "litebans.exempt", "litebans.exempt", "litebans + ", "", "litebans.exempt", "litebans + ", "litebans.exempt", "litebans + ", " exempt? ", " exempt? true", "Group weight of ", " (", ") >= target weight of ", "Group weight of ", " (", ") does not exceed ", "Missing user!", "allow_exempt_bypass is ", "litebans.exempt.bypass", "litebans.exempt + ", " bypasses exempt ", "litebans.unlimited", "litebans + ", "litebans.group.unlimited", "duration", "litebans.admin", "{hoverText:", "", "{run:", "", "{url:", "", "}", "", "litebans.newline", "\n", " ", "", "tempDuration", "litebans.temp", "", "litebans.ip", "", "litebans.ip", "litebans.ip", "", "litebans.modify", "", ".own", "litebans.ip", ".wildcard"};
}

