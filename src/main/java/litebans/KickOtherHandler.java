package litebans;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.md_5.bungee.api.event.LoginEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class KickOtherHandler
extends GeoIPLookupService_3 {
    private final ConcurrentHashMap g = new ConcurrentHashMap();
    private final ConcurrentHashMap e = new ConcurrentHashMap();
    public KickOtherHandler(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    public final ConcurrentHashMap LiteBansModule_31() {
        return this.g;
    }

    public final ConcurrentHashMap BaseCoreGenericHandler() {
        return this.e;
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull String string, @NotNull UUID uUID, @Nullable String string2, @NotNull String string3, @NotNull Collection collection) {
        Object object = this;
        int n = (int)uUID.getMostSignificantBits();
        object = (Collection)this.g.get(n);
        if (!collection.isEmpty()) {
            Iterable iterable = collection;
            for (Object t2 : iterable) {
                SilentHandler dZ2 = (SilentHandler)t2;
                ((Map)this.e).put(dZ2, GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, string, uUID.toString(), string2, string3, -1));
            }
            Integer n2 = n;
            ((Map)this.g).put(n2, this.plugin(collection, (Collection)object));
}

    private final Collection BaseCoreGenericHandler(Collection collection, Collection collection2) {
        Collection collection3 = collection2;
        if (collection3 == null || collection3.isEmpty()) {
            return collection;
        }
        collection3 = CollectionUtilities.BaseCoreGenericHandler(collection2);
        for (SilentHandler dZ2 : collection) {
            boolean flag;
{
                Iterable iterable = collection2;
                if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                    flag = true;
                } else {
                    for (Object t2 : iterable) {
                        SilentHandler dZ3 = (SilentHandler)t2;
                        if (!(dZ3.BaseCoreGenericHandler() == dZ2.BaseCoreGenericHandler())) continue;
                        flag = false;
                        break;
                    }
                    flag = true;
}
            if (!flag) continue;
            collection3.add(dZ2);
        }
        return collection3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public final void BaseCoreGenericHandler(@NotNull LoginEvent v1) {
{
            v0 = this.LiteBansModule_240().i();
            ObjectUtilities.LiteBansModule_31(v0, "");
            v2 = (GetcancelreasoncomponentsHandler)v0;
            v3 = v1.getConnection();
            arg1 = v3.getUniqueId();
            arg2 = arg1.toString();
            arg3 = v3.getName();
            v1 = v3.getAddress();
            arg4 = v1 != null && (v1 = v1.getAddress()) != null ? v1.getHostAddress() : null;
            ObjectUtilities.BaseCoreGenericHandler(v3);
            v2 = v2.BaseCoreGenericHandler(v3);
            if (v2 == null) {
                throw new AssertionError((Object)"No default server");
            }
            arg5 = v2;
            arg6 = new LiteBansModule_144();
            arg7 = arg5.getName();
            arg8 = this;
            arg8 = (DatabaseMonitorService)arg8.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            try {
                arg9 = arg8.LiteBansModule_194();
                arg10 = arg9;
                try {
{
                                arg11 = (LiteBansModule_82)arg10;
                                arg12 = arg9;
                                arg13 = this;
                                arg14 = ((ConfigService)arg13.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().be();
                                arg15 = arg3.length();
                                if (ObjectUtilities.BaseCoreGenericHandler(arg15, arg14 & 255) <= 0) break;
                                ObjectUtilities.BaseCoreGenericHandler((Object)arg3);
                                this.plugin(arg12, arg3, arg14);
                                if (this.plugin(arg12, v1, arg2, arg3, LiteBansModule_242.BaseCoreGenericHandler(BlackHandler.c, "Invalid username.\nMaximum " + BlackHandler.i + LiteBansModule_283.LiteBansModule_31(arg14) + ' ' + BlackHandler.c + "characters, found " + BlackHandler.ServerSyncService + BlackHandler.r + arg3.length()), null, "KICK_OTHER", false)) break;
                            }
                            arg6.BaseCoreGenericHandler = arg12.BaseCoreGenericHandler(arg2, arg4, BanHandler.LiteBansModule_240, "__ALL__", true, 0);
                            arg16 = this;
                            if (((ConfigService)arg16.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().NullHandler()) {
                                ObjectUtilities.BaseCoreGenericHandler((Object)arg3);
                                arg16 = arg12.BaseCoreGenericHandler(arg3, arg2, "__ALL__", BanHandler.LiteBansModule_240, true);
                                if (((Collection)arg16).isEmpty() == false) {
                                    v3 = arg6.BaseCoreGenericHandler;
                                    ObjectUtilities.LiteBansModule_31(v3, "");
                                    NullHandler_6.c(v3).addAll((Collection)arg16);
}
                            arg16 = this;
                            arg16 = (ConfigService)arg16.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                            arg17 = 3;
                            if (arg16.BaseCoreGenericHandler(arg17)) {
                                arg18 = arg16;
                                arg18.BaseCoreGenericHandler((Object)("Found " + ((List)arg6.BaseCoreGenericHandler).size() + " ban(AsyncBackgroundTask_21) for " + arg3 + " (uuid: '" + arg1 + "') + "));
                            }
                            arg16 = this;
                            if (((ConfigService)arg16.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler(10)) {
                                arg16 = (Iterable)arg6.BaseCoreGenericHandler;
                                arg19 = this;
                                arg19 = (ConfigService)arg19.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                                arg20 = arg16.iterator();
                                while (arg20.hasNext()) {
                                    arg21 = arg22 = arg20.next();
                                    arg19.BaseCoreGenericHandler(arg21);
}
                            if (!(((Collection)arg6.BaseCoreGenericHandler).isEmpty() == false)) ** GOTO lbl-1000
                            ObjectUtilities.BaseCoreGenericHandler(arg1);
                            if (arg12.BaseCoreGenericHandler(arg1, BanHandler.LiteBansModule_240)) {
                            } else lbl-1000:
                                                        {
                                v4 = arg23 = false;
                            }
                            if (arg23) {
                                arg24 = (Iterable)arg6.BaseCoreGenericHandler;
                                arg18 = arg6;
                                arg25 = arg24;
                                arg22 = new ArrayList<PunishmentService>();
                                arg26 = arg25.iterator();
                                while (arg26.hasNext()) {
                                    arg27 = arg28 = arg26.next();
                                    if (!ObjectUtilities.BaseCoreGenericHandler((Object)arg27.DatabaseMonitorService(), (Object)arg2)) continue;
                                    arg22.add(arg28);
                                }
                                arg18.BaseCoreGenericHandler = (List)arg22;
                            }
                            if ((arg29 = this.plugin(arg4)) != null && !arg23) {
                                ObjectUtilities.BaseCoreGenericHandler((Object)arg7);
                                ObjectUtilities.BaseCoreGenericHandler((Object)arg3);
                                this.plugin(arg12, v1, arg29, arg7, arg2, arg3);
                            }
                            arg30 = (Iterable)arg6.BaseCoreGenericHandler;
                            arg31 = arg30.iterator();
                            while (arg31.hasNext()) {
                                arg32 = arg31.next();
                                arg28 = (SilentHandler)arg32;
                                ObjectUtilities.BaseCoreGenericHandler((Object)arg7);
                                v5 = arg28.m();
                                if (v5 == null) {
                                    v5 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
                                }
                                if (!(LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(arg7, v5) != false && this.LiteBansModule_31(arg7) != false)) continue;
                                v6 = arg32;
                                break;
}
                        arg33 = v6;
                        arg30 = this;
                        arg30 = (ConfigService)arg30.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                        arg34 = 3;
                        if (arg30.BaseCoreGenericHandler(arg34)) {
                            arg18 = arg30;
                            arg18.BaseCoreGenericHandler((Object)("Ban for " + arg7 + " (uncached): " + arg33));
                        }
                        if (arg33 != null) {
                            ObjectUtilities.BaseCoreGenericHandler((Object)arg3);
                            this.plugin(arg12, v1, arg2, arg3, arg4, arg7, arg33);
                        } else {
                            ObjectUtilities.BaseCoreGenericHandler((Object)arg3);
                            ObjectUtilities.BaseCoreGenericHandler(arg1);
                            ObjectUtilities.BaseCoreGenericHandler((Object)arg7);
                            this.plugin(arg12, arg3, arg1, arg4, arg7, (Collection)arg6.BaseCoreGenericHandler);
}
                    arg11 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable arg35) {
                    arg36 = arg35;
                    throw arg35;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(arg10, arg36);
}
            catch (SQLException arg37) {
                if (arg8.LiteBansModule_31(arg37)) break;
                throw arg37;
}

    @Override
    public void LiteBansModule_31(@NotNull Object v1) {
        try {
{
                            v2 = this.plugin(v1);
                            arg38 = v2.LiteBansModule_194();
                            arg39 = v2.e();
                            arg40 = v2.AsyncBackgroundTask_5();
                            arg41 = this.c(v1);
                            if (!this.LiteBansModule_31(arg41)) break;
                            v0 = (Collection)this.g.get(this.plugin(arg39));
                            if (v0 == null) break;
                            arg42 = v0;
                            for (T arg43 : arg42) {
                                arg44 = (SilentHandler)arg43;
                                if (!arg44.BaseCoreGenericHandler(arg39, arg40, System.currentTimeMillis())) ** GOTO lbl-1000
                                v1 = arg44.m();
                                if (v1 == null) {
                                    v1 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
                                }
                                if (LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(arg41, v1)) {
                                } else lbl-1000:
                                                                {
                                }
                                if (!v2) continue;
                                v3 = arg43;
                                break;
}
                        v4 = v3;
                        break;
                    }
                    v4 = arg45 = null;
                }
                if (arg45 != null) {
                    arg46 = this;
                    if (!((BroadcastService)arg46.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler((SilentHandler)arg45, arg38)) {
                        arg47 = this.plugin(v1, arg39, arg38, arg40, arg41, (SilentHandler)arg45);
}
            arg45 = this;
            ((BroadcastService)arg45.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(arg38, arg40, arg39, arg41, arg47);
        }
        catch (LiteBansException_2 arg48) {
            arg49 = this;
            ConfigService.BaseCoreGenericHandler((ConfigService)arg49.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class), arg48, 0, 2, null);
        }
        catch (NullPointerException arg50) {
            arg51 = this.LiteBansModule_240();
            arg52 = arg51;
            if (arg52.isEnabled() == false != false || arg51.AsyncBackgroundTask_21() != false) {
                arg51 = this;
                ConfigService.BaseCoreGenericHandler((ConfigService)arg51.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class), arg50, 0, 2, null);
            }
            throw arg50;
        }
        catch (SQLException arg53) {
            arg54 = this;
            ((DatabaseMonitorService)arg54.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg53);
}

    public final int BaseCoreGenericHandler(@NotNull String string) {
        KickOtherHandler gx_02 = this;
        UUID uUID = UUID.fromString(string);
        return (int)uUID.getMostSignificantBits();
    }

    public final boolean BaseCoreGenericHandler(@NotNull Object object, @NotNull String string, @NotNull String string2, @Nullable String string3, @Nullable String string4, @NotNull SilentHandler dZ2) {
        CharSequence charSequence = (CharSequence)this.e.get(dZ2);
        if (charSequence == null) {
            charSequence = "null";
        }
        CharSequence charSequence2 = charSequence;
        Object object2 = this;
        object2 = (ConfigService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
        n = 3;
        if (((ConfigService)object2).BaseCoreGenericHandler(n)) {
            Object object3 = object2;
            ((ConfigService)object3).BaseCoreGenericHandler((Object)("Ban for " + string4 + " (cached): " + dZ2));
        }
        KickBannedHandler.BaseCoreGenericHandler(this.LiteBansModule_240().i(), object, charSequence2, null, false, null, 28, null);
        object2 = this;
        n = 0;
        if (((ConfigService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().aM()) {
            object2 = this;
            n = 0;
            ((DatabaseMonitorService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> KickOtherHandler.BaseCoreGenericHandler(dZ2, string2, string, string3, string4, this, arg_0));
        }
        this.plugin(object, arg_0 -> KickOtherHandler.BaseCoreGenericHandler(this, dZ2, charSequence2, arg_0));
        return true;
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull Object object, @NotNull LiteBansModule_178 eo_02) {
        if (object instanceof LoginEvent) {
            return;
        }
        super.BaseCoreGenericHandler(object, eo_02);
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(SilentHandler dZ2, String string, String string2, String string3, String string4, KickOtherHandler gx_02, LiteBansModule_82 ch2) {
        CharSequence charSequence = ch2.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.LiteBansModule_240, dZ2, false, 2, null), string, string, string2, string3, string4);
        MessageHandler messageHandler = gx_02;
        ((BroadcastService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).LiteBansModule_31(string2, charSequence, true);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final CharSequence BaseCoreGenericHandler(KickOtherHandler gx_02, SilentHandler dZ2, CharSequence charSequence, LiteBansModule_82 ch2) {
        return gx_02.BaseCoreGenericHandler(ch2, dZ2, charSequence);
}

