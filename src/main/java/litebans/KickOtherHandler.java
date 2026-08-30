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

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull String string, @NotNull UUID uUID, @Nullable String string2, @NotNull String string3, @NotNull Collection collection) {
                int n = (int)uUID.getMostSignificantBits();
        targetObj = (Collection)this.g.get(n);
        if (!collection.isEmpty()) {
            Iterable iterable = collection;
            for (Object t2 : iterable) {
                SilentHandler dZ2 = (SilentHandler)t2;
                ((Map)this.e).put(dZ2, GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, string, uUID.toString(), string2, string3, -1));
            }
            Integer n2 = n;
            ((Map)this.g).put(n2, this.plugin(collection, (Collection)targetObj));
        }
    }

    private final Collection BaseCoreGenericHandler(Collection collection, Collection collection2) {
        Collection collection3 = collection2;
        if (collection3 == null || collection3.isEmpty()) {
            return collection;
        }
        collection3 = CollectionUtilities.BaseCoreGenericHandler(collection2);
        for (SilentHandler dZ2 : collection) {
            boolean flag;
            block5: {
                Iterable iterable = collection2;
                if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                    flag = true;
                } else {
                    for (Object t2 : iterable) {
                        SilentHandler dZ3 = (SilentHandler)t2;
                        if (!(dZ3.BaseCoreGenericHandler() == dZ2.BaseCoreGenericHandler())) continue;
                        flag = false;
                        break block5;
                    }
                    flag = true;
                }
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
        block24: {
            v0 = this.LiteBansModule_241().i();
            ObjectUtilities.LiteBansModule_31(v0, "");
            v2 = (GetcancelreasoncomponentsHandler)v0;
            v3 = v1.getConnection();
            v4 = v3.getUniqueId();
            v5 = v4.toString();
            v6 = v3.getName();
            v1 = v3.getAddress();
            v7 = v1 != null && (v1 = v1.getAddress()) != null ? v1.getHostAddress() : null;
            ObjectUtilities.BaseCoreGenericHandler(v3);
            v2 = v2.BaseCoreGenericHandler(v3);
            if (v2 == null) {
                throw new AssertionError((Object)"No default server");
            }
            v8 = v2;
            v9 = new LiteBansModule_145();
            v10 = v8.getName();
            v11 = this;
            v11 = (DatabaseMonitorService)v11.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
            try {
                v12 = v11.LiteBansModule_195();
                v13 = v12;
                try {
                    block26: {
                        block23: {
                            block25: {
                                v14 = (LiteBansModule_83)v13;
                                v15 = v12;
                                v16 = this;
                                v17 = ((ConfigService)v16.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().be();
                                v18 = v6.length();
                                if (ObjectUtilities.BaseCoreGenericHandler(v18, v17 & 255) <= 0) break block25;
                                ObjectUtilities.BaseCoreGenericHandler((Object)v6);
                                this.plugin(v15, v6, v17);
                                if (this.plugin(v15, v1, v5, v6, LiteBansModule_243.BaseCoreGenericHandler(BlackHandler.c, "Invalid username.\nMaximum " + BlackHandler.i + LiteBansModule_284.LiteBansModule_31(v17) + ' ' + BlackHandler.c + "characters, found " + BlackHandler.ServerSyncService + BlackHandler.r + v6.length()), null, "KICK_OTHER", false)) break block26;
                            }
                            v9.BaseCoreGenericHandler = v15.BaseCoreGenericHandler(v5, v7, BanHandler.LiteBansModule_241, "__ALL__", true, 0);
                            v19 = this;
                            if (((ConfigService)v19.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().NullHandler()) {
                                ObjectUtilities.BaseCoreGenericHandler((Object)v6);
                                v19 = v15.BaseCoreGenericHandler(v6, v5, "__ALL__", BanHandler.LiteBansModule_241, true);
                                if (((Collection)v19).isEmpty() == false) {
                                    v3 = v9.BaseCoreGenericHandler;
                                    ObjectUtilities.LiteBansModule_31(v3, "");
                                    NullHandler_6.c(v3).addAll((Collection)v19);
                                }
                            }
                            v19 = this;
                            v19 = (ConfigService)v19.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class);
                            v20 = 3;
                            if (v19.BaseCoreGenericHandler(v20)) {
                                v21 = v19;
                                v21.BaseCoreGenericHandler((Object)("Found " + ((List)v9.BaseCoreGenericHandler).size() + " ban(AsyncBackgroundTask_21) for " + v6 + " (uuid: '" + v4 + "') + "));
                            }
                            v19 = this;
                            if (((ConfigService)v19.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler(10)) {
                                v19 = (Iterable)v9.BaseCoreGenericHandler;
                                v22 = this;
                                v22 = (ConfigService)v22.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class);
                                v23 = v19.iterator();
                                while (v23.hasNext()) {
                                    v24 = v25 = v23.next();
                                    v22.BaseCoreGenericHandler(v24);
                                }
                            }
                            if (!(((Collection)v9.BaseCoreGenericHandler).isEmpty() == false)) ** GOTO lbl-1000
                            ObjectUtilities.BaseCoreGenericHandler(v4);
                            if (v15.BaseCoreGenericHandler(v4, BanHandler.LiteBansModule_241)) {
                                v4 = true;
                            } else lbl-1000:
                                                        {
                                v4 = v26 = false;
                            }
                            if (v26) {
                                v27 = (Iterable)v9.BaseCoreGenericHandler;
                                v21 = v9;
                                v28 = v27;
                                v25 = new ArrayList<PunishmentService>();
                                v29 = v28.iterator();
                                while (v29.hasNext()) {
                                    v30 = v31 = v29.next();
                                    if (!ObjectUtilities.BaseCoreGenericHandler((Object)v30.DatabaseMonitorService(), (Object)v5)) continue;
                                    v25.add(v31);
                                }
                                v21.BaseCoreGenericHandler = (List)v25;
                            }
                            if ((v32 = this.plugin(v7)) != null && !v26) {
                                ObjectUtilities.BaseCoreGenericHandler((Object)v10);
                                ObjectUtilities.BaseCoreGenericHandler((Object)v6);
                                this.plugin(v15, v1, v32, v10, v5, v6);
                            }
                            v33 = (Iterable)v9.BaseCoreGenericHandler;
                            v34 = v33.iterator();
                            while (v34.hasNext()) {
                                v35 = v34.next();
                                v31 = (SilentHandler)v35;
                                ObjectUtilities.BaseCoreGenericHandler((Object)v10);
                                v5 = v31.m();
                                if (v5 == null) {
                                    v5 = LiteBansModule_182.LiteBansModule_195.LiteBansModule_31();
                                }
                                if (!(LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(v10, v5) != false && this.LiteBansModule_31(v10) != false)) continue;
                                v6 = v35;
                                break block23;
                            }
                            v6 = null;
                        }
                        v36 = v6;
                        v33 = this;
                        v33 = (ConfigService)v33.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class);
                        v37 = 3;
                        if (v33.BaseCoreGenericHandler(v37)) {
                            v21 = v33;
                            v21.BaseCoreGenericHandler((Object)("Ban for " + v10 + " (uncached): " + v36));
                        }
                        if (v36 != null) {
                            ObjectUtilities.BaseCoreGenericHandler((Object)v6);
                            this.plugin(v15, v1, v5, v6, v7, v10, v36);
                        } else {
                            ObjectUtilities.BaseCoreGenericHandler((Object)v6);
                            ObjectUtilities.BaseCoreGenericHandler(v4);
                            ObjectUtilities.BaseCoreGenericHandler((Object)v10);
                            this.plugin(v15, v6, v4, v7, v10, (Collection)v9.BaseCoreGenericHandler);
                        }
                    }
                    v14 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable v38) {
                    v39 = v38;
                    throw v38;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(v13, v39);
                }
            }
            catch (SQLException v40) {
                if (v11.LiteBansModule_31(v40)) break block24;
                throw v40;
            }
        }
    }

    @Override
    public void LiteBansModule_31(@NotNull Object v1) {
        try {
            block12: {
                block14: {
                    block13: {
                        block11: {
                            v2 = this.plugin(v1);
                            v41 = v2.LiteBansModule_195();
                            v42 = v2.e();
                            v43 = v2.AsyncBackgroundTask_5();
                            v44 = this.c(v1);
                            if (!this.LiteBansModule_31(v44)) break block12;
                            v0 = (Collection)this.g.get(this.plugin(v42));
                            if (v0 == null) break block13;
                            v45 = v0;
                            for (T v46 : v45) {
                                v47 = (SilentHandler)v46;
                                if (!v47.BaseCoreGenericHandler(v42, v43, System.currentTimeMillis())) ** GOTO lbl-1000
                                v1 = v47.m();
                                if (v1 == null) {
                                    v1 = LiteBansModule_182.LiteBansModule_195.LiteBansModule_31();
                                }
                                if (LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(v44, v1)) {
                                    v2 = true;
                                } else lbl-1000:
                                                                {
                                    v2 = false;
                                }
                                if (!v2) continue;
                                v3 = v46;
                                break block11;
                            }
                            v3 = null;
                        }
                        v4 = v3;
                        break block14;
                    }
                    v4 = v48 = null;
                }
                if (v48 != null) {
                    v49 = this;
                    if (!((BroadcastService)v49.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler((SilentHandler)v48, v41)) {
                        v50 = this.plugin(v1, v42, v41, v43, v44, (SilentHandler)v48);
                    }
                }
            }
            v48 = this;
            ((BroadcastService)v48.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(v41, v43, v42, v44, v50);
        }
        catch (LiteBansException_2 v51) {
            v52 = this;
            ConfigService.BaseCoreGenericHandler((ConfigService)v52.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class), v51, 0, 2, null);
        }
        catch (NullPointerException v53) {
            v54 = this.LiteBansModule_241();
            v55 = v54;
            if (v55.isEnabled() == false != false || v54.AsyncBackgroundTask_21() != false) {
                v54 = this;
                ConfigService.BaseCoreGenericHandler((ConfigService)v54.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class), v53, 0, 2, null);
            }
            throw v53;
        }
        catch (SQLException v56) {
            v57 = this;
            ((DatabaseMonitorService)v57.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(v56);
        }
    }

    public final int BaseCoreGenericHandler(@NotNull String string) {
        KickOtherHandler gx_02 = this;
        UUID uUID = UUID.fromString(string);
        return (int)uUID.getMostSignificantBits();
    }

    public final boolean BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull String string, @NotNull String string2, @Nullable String string3, @Nullable String string4, @NotNull SilentHandler dZ2) {
        CharSequence charSequence = (CharSequence)this.e.get(dZ2);
        if (charSequence == null) {
            charSequence = "null";
        }
        CharSequence charSequence2 = charSequence;
                contextObj = (ConfigService)((MessageHandler)contextObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class);
        n = 3;
        if (((ConfigService)contextObj).BaseCoreGenericHandler(n)) {
            Object resultObj = contextObj;
            ((ConfigService)resultObj).BaseCoreGenericHandler((Object)("Ban for " + string4 + " (cached): " + dZ2));
        }
        KickBannedHandler.BaseCoreGenericHandler(this.LiteBansModule_241().i(), targetObj, charSequence2, null, false, null, 28, null);
        contextObj = this;
        n = 0;
        if (((ConfigService)((MessageHandler)contextObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().aM()) {
            contextObj = this;
            n = 0;
            ((DatabaseMonitorService)((MessageHandler)contextObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> KickOtherHandler.BaseCoreGenericHandler(dZ2, string2, string, string3, string4, this, arg_0));
        }
        this.plugin(targetObj, arg_0 -> KickOtherHandler.BaseCoreGenericHandler(this, dZ2, charSequence2, arg_0));
        return true;
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull LiteBansModule_179 eo_02) {
        if (targetObj instanceof LoginEvent) {
            return;
        }
        super.BaseCoreGenericHandler(targetObj, eo_02);
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(SilentHandler dZ2, String string, String string2, String string3, String string4, KickOtherHandler gx_02, LiteBansModule_83 ch2) {
        CharSequence charSequence = ch2.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.LiteBansModule_241, dZ2, false, 2, null), string, string, string2, string3, string4);
        MessageHandler messageHandler = gx_02;
        ((BroadcastService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).LiteBansModule_31(string2, charSequence, true);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final CharSequence BaseCoreGenericHandler(KickOtherHandler gx_02, SilentHandler dZ2, CharSequence charSequence, LiteBansModule_83 ch2) {
        return gx_02.BaseCoreGenericHandler(ch2, dZ2, charSequence);
    }

    private static final void c() {
        LiteBansModule_195 = new String[]{"", "No default server", "Invalid username.\nMaximum ", "characters, found ", "KICK_OTHER", "__ALL__", "__ALL__", "", "Found ", " ban(AsyncBackgroundTask_21) for ", " (uuid: '", "') + ", "Ban for ", " (uncached): ", "null", "Ban for ", " (cached): "};
    }

    static {
        KickOtherHandler.c();
    }
}

