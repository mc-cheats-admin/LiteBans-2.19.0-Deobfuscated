package litebans;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import litebans.aK;
import litebans.aa_0;
import litebans.am;
import litebans.an;
import litebans.ao_0;
import litebans.bK;
import litebans.bT;
import litebans.cD;
import litebans.ch;
import litebans.dZ;
import litebans.de_0;
import litebans.di_0;
import litebans.du_0;
import litebans.eG;
import litebans.ep;
import litebans.eq;
import litebans.es_0;
import litebans.f0;
import litebans.f3;
import litebans.f5;
import litebans.f7;
import litebans.fB;
import litebans.fL;
import litebans.fS;
import litebans.fg_0;
import litebans.fm_0;
import litebans.fq_0;
import litebans.fu_0;
import litebans.gZ;
import litebans.ga_0;
import litebans.gj;
import litebans.gn_0;
import litebans.go;
import litebans.gv_0;
import litebans.gw;
import litebans.hd_0;
import litebans.hl;
import litebans.iA;
import litebans.iI;
import litebans.id_0;
import litebans.jv_0;
import litebans.k1;
import litebans.kL;
import litebans.kf;
import litebans.kg_0;
import litebans.n_0;
import litebans.o;
import litebans.p;
import litebans.q_0;
import litebans.u;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public class fD
extends fB {
    public static Object i;
    final Map k = new HashMap();
    private static /* synthetic */ String[] j;

    @Override
    public boolean a() {
        return false;
    }

    public fD(di_0 di_02) {
        super("litebans", di_02);
    }

    private final void a(jv_0 jv_02, CharSequence charSequence) {
        fD.a(jv_02, charSequence, this.h());
    }

    @Override
    public void a(@NotNull jv_0 jv_02, String[] stringArray) {
        Object object;
        Object object2;
        if (stringArray.length == 0 || stringArray[0].equalsIgnoreCase("version")) {
            this.a(jv_02);
            return;
        }
        di_0 di_02 = this.h();
        u u2 = (u)di_02.a(u.class);
        o o2 = this.a();
        w w2 = this.g();
        q_0 q_02 = this.b();
        p p2 = this.e();
        eG eG2 = q_02.f();
        String string2 = stringArray[0].toLowerCase(Locale.ENGLISH);
        if (string2.equals("broadcast")) {
            new gj(stringArray, di_02).run();
            return;
        }
        if (string2.equals("verify")) {
            boolean bl = bK.c.d(jv_02.a()).equals("2ccd0bb281214361803a945b8f0644ab");
            if (!bl) {
                aa_0.a((fg_0)this, new String[]{"litebans.admin", "litebans.verify"});
            } else {
                this.a(jv_02, hd_0.u + cD.a + " " + kf.a + " " + gv_0.a);
            }
            try {
                String string = "undefined";
                String calendar = ep.a;
                SimpleDateFormat string8 = new SimpleDateFormat("yyyy-MM-dd");
                string8.setTimeZone(TimeZone.getTimeZone("UTC"));
                String string3 = string8.format(new Date());
                String string4 = string3 + "A#63rP";
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                messageDigest.update((string4 + calendar).getBytes(StandardCharsets.UTF_8));
                byte[] byArray = messageDigest.digest();
                StringBuilder stringBuilder = new StringBuilder();
                for (byte by2 : byArray) {
                    String string5 = Integer.toHexString(0xFF & by2);
                    if (string5.length() == 1) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(string5);
                }
                string = "q" + stringBuilder.substring(0, 8);
                this.a(jv_02, hd_0.o + "Verification code: " + hd_0.i + string);
                return;
            }
            catch (NoSuchAlgorithmException timeZone) {
                throw new RuntimeException(timeZone);
            }
        }
        if (string2.equals("allow")) {
            new f7(stringArray, di_02, true).run();
            return;
        }
        if (string2.equals("unlink") || string2.equals("clearhistory") || string2.equals("cleariphistory")) {
            if (stringArray.length < 2) {
                return;
            }
            new go(stringArray, di_02).run();
            return;
        }
        if (string2.equals("reveal") && stringArray.length >= 2) {
            new fu_0(stringArray, di_02).run();
            return;
        }
        if (string2.equals("license")) {
            new f5(di_02).run();
            return;
        }
        aa_0.c(this, "litebans.admin");
        try {
            if (i == null) {
                throw new IOException();
            }
        }
        catch (Exception exception) {
            q_02.a(exception, 0);
            this.a(jv_02);
            return;
        }
        if (string2.equals("reload")) {
            q_02.c();
            try {
                for (n_0 k12 : di_02.p()) {
                    k12.b();
                }
                Throwable throwable = di_02.h().b();
                if (throwable != null) {
                    this.a(jv_02, am.ar);
                    this.a(jv_02, am.bU);
                    throw throwable;
                }
                di_02.b(() -> {
                    boolean bl = true;
                    try {
                        w2.c();
                        o2.b(q_02.f().aF());
                        w2.e();
                        try (ch ch2 = w2.f();){
                            if (ch2.b()) {
                                this.a(jv_02, am.bM);
                                return;
                            }
                            gn_0 gn_02 = q_02.z().c();
                            if (q_02.A.a() == null) {
                                this.a(jv_02, am.aV);
                                bl = false;
                            }
                            if (gn_02 != null && gn_02.b() != null) {
                                this.a(jv_02, am.ar.b(am.bs));
                                bl = false;
                            }
                            if (bl) {
                                this.a(jv_02, am.aW);
                            }
                        }
                    }
                    catch (Exception exception) {
                        w2.a(exception);
                    }
                });
            }
            catch (Throwable by3) {
                w2.a(by3);
            }
            return;
        }
        if (string2.equals("info")) {
            di_02.b(() -> {
                try (ch ch2 = w2.f();){
                    an an2 = w2.y();
                    if (ch2.b() || an2 == null) {
                        this.a(jv_02, am.aX);
                        return;
                    }
                    iI iI2 = an2.a();
                    String string = q_02.f().aF();
                    String string2 = w.v.c(string);
                    this.a(jv_02, hd_0.c(j[143]) + hd_0.g(string2) + hd_0.c(j[144]));
                    int n = q_02.f().a8();
                    int n2 = q_02.f().V();
                    aK aK2 = w2.l();
                    if (aK2 != null) {
                        String string3 = j[145] + hd_0.m + aK2.a();
                        if (aK2.f()) {
                            string3 = j[146] + hd_0.c + aK2.a() + j[147];
                        }
                        this.a(jv_02, hd_0.i + j[148] + hd_0.m + aK2.e());
                        this.a(jv_02, hd_0.i + j[149] + hd_0.m + aK2.d() + hd_0.i + j[150] + string3 + hd_0.i + j[151]);
                    }
                    this.a(jv_02, hd_0.i + j[152] + hd_0.m + iI2.f() + hd_0.i + j[153] + hd_0.m + n + hd_0.i + j[154] + hd_0.m + n2 + hd_0.i + j[155] + hd_0.m + iI2.b() + hd_0.i + j[156]);
                    int n3 = iI2.c();
                    if (n3 > 0) {
                        this.a(jv_02, hd_0.i + j[157] + hd_0.m + n3);
                    }
                    id_0 id_02 = u2.i();
                    AtomicLong atomicLong = (AtomicLong)id_02.g();
                    long l3 = ((AtomicLong)id_02.e()).get();
                    long l5 = Math.max(0L, ((AtomicLong)id_02.d()).get() - l3);
                    this.a(jv_02, hd_0.i + j[158] + hd_0.m + atomicLong + hd_0.i + j[159] + hd_0.m + l3 + hd_0.i + j[160] + hd_0.m + l5);
                }
                catch (Exception exception) {
                    w2.a(exception);
                }
            });
            return;
        }
        if (string2.equals("servers")) {
            new f3(di_02).run();
            return;
        }
        if (string2.equals("accept")) {
            new fq_0(di_02).run();
            return;
        }
        if (string2.equals("debug")) {
            if (stringArray.length >= 2) {
                byte simpleDateFormat = (byte)Integer.parseInt(stringArray[1]);
                q_02.a(simpleDateFormat);
                this.a(jv_02, hd_0.i + "Debug level has been set to: " + hd_0.m + simpleDateFormat);
            }
            if (q_02.g()) {
                this.a(jv_02, hd_0.i + "Debug levels: " + q_02.a() + " (config); " + q_02.q() + "/" + q_02.l() + " (database) + ");
            }
            return;
        }
        if (string2.equals("timezone")) {
            SimpleDateFormat uUID = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            TimeZone string11 = TimeZone.getTimeZone(w2.n());
            Calendar object3 = Calendar.getInstance(string11);
            uUID.setCalendar(object3);
            if (stringArray.length == 1) {
                this.a(jv_02, hd_0.i + "Current timezone: " + hd_0.m + w2.n() + "\n" + hd_0.i + "Current time: " + hd_0.m + uUID.format(object3.getTime()));
            } else {
                String string13 = stringArray[1];
                di_02.b(() -> {
                    try {
                        w2.a(string8);
                        calendar.setTimeZone(TimeZone.getTimeZone(string8));
                        try (ch ch2 = w2.f();){
                            try (bT bT2 = ch2.c((CharSequence)(j[138] + kL.i + j[139])).a(string8);){
                                w2.b(bT2);
                            }
                            this.a(jv_02, hd_0.i + j[140] + hd_0.m + w2.n() + j[141] + hd_0.i + j[142] + hd_0.m + simpleDateFormat.format(calendar.getTime()));
                        }
                    }
                    catch (Exception exception) {
                        w2.a(exception);
                    }
                });
            }
            return;
        }
        if (string2.equals("fixhistory") || string2.equals("fixiphistory")) {
            di_02.a(() -> this.a(w2, jv_02, false));
            return;
        }
        if (string2.startsWith("clearmute")) {
            if (stringArray.length >= 2) {
                UUID string9 = UUID.fromString(stringArray[1]);
                dZ object22 = (dZ)p2.a().b().remove(string9);
                if (object22 != null) {
                    this.a(jv_02, hd_0.i + "Removed active mute for " + object22 + " ");
                } else {
                    fg_0.a.a(hd_0.c + "No mute found for " + string9);
                }
                return;
            }
            p2.a().b().clear();
            this.a(jv_02, hd_0.i + "Active mutes have been ");
            return;
        }
        if (string2.equals("listmutes") && jv_02.f()) {
            this.a(jv_02, Arrays.toString(p2.a().b().entrySet().toArray()));
            return;
        }
        if (string2.equals("import")) {
            String string10;
            if (stringArray.length == 1) {
                fg_0.a.a(am.cP);
            }
            if ((string10 = stringArray[1].toLowerCase(Locale.ENGLISH)).equals("start")) {
                di_02.b(() -> {
                    String string = eG2.bd().toLowerCase(Locale.ENGLISH);
                    if (string.contains(j[93])) {
                        string = string.replace(j[94], j[95]);
                    }
                    boolean bl = string.equals(j[96]) || string.contains(j[97]) || string.contains(j[98]);
                    Connection connection = null;
                    try (ch ch2 = w2.f();){
                        Object object;
                        String string2;
                        Object object2;
                        Object object3;
                        if (ch2.b()) {
                            this.a(jv_02, am.aX);
                            return;
                        }
                        if (!bl) {
                            String string3;
                            Properties properties = new Properties();
                            object3 = null;
                            object2 = null;
                            string2 = j[99];
                            if (eG2.ai()) {
                                string3 = eG2.m();
                                boolean bl2 = string.equals(j[100]);
                                if (bl2) {
                                    string2 = j[101];
                                    string3 = new File(di_02.getDataFolder(), j[102]).getAbsolutePath();
                                    object3 = eG2.P();
                                    object2 = eG2.ah();
                                } else if (string.equals(j[103]) || string.equals(j[104])) {
                                    string2 = j[105];
                                    string3 = new File(j[106], j[107]).getAbsolutePath();
                                }
                                File file = new File(string3);
                                File file2 = new File(string3 + j[108]);
                                if (!(bl2 || file.exists() || file2.exists())) {
                                    throw new FileNotFoundException(string3);
                                }
                                this.a(jv_02, am.aO.a(j[109], (Object)string3));
                                object = j[110] + string2 + j[111] + file.getAbsolutePath();
                            } else {
                                string2 = j[112];
                                object3 = eG2.P();
                                object2 = eG2.ah();
                                object = j[113] + eG2.G() + '/' + eG2.ao();
                                this.a(jv_02, am.aO.a(j[114], object));
                            }
                            Driver driver = (Driver)w2.a(Objects.requireNonNull(w2.a(q_02, string2)), true, true);
                            if (driver == null) {
                                return;
                            }
                            string3 = j[115];
                            properties.put(j[116], string3);
                            properties.put(j[117], string3);
                            properties.put(j[118], j[119]);
                            properties.put(j[120], j[121]);
                            properties.put(j[122], j[123]);
                            properties.put(j[124], j[125]);
                            properties.put(j[126], j[127]);
                            properties.put(j[128], j[129]);
                            properties.put(j[130], j[131]);
                            if (object3 != null && !((String)object3).isEmpty()) {
                                properties.put(j[132], object3);
                            }
                            if (object2 != null && !((String)object2).isEmpty()) {
                                properties.put(j[133], object2);
                            }
                            connection = driver.connect((String)object, properties);
                        } else {
                            this.a(jv_02, am.aO.a(j[134], (Object)j[135]));
                        }
                        boolean bl3 = eG2.X();
                        object = di_02.f().a(fS.class, new Class[]{di_0.class}, new Object[]{di_02});
                        boolean bl4 = false;
                        object3 = object.iterator();
                        while (object3.hasNext()) {
                            object2 = (fS)object3.next();
                            if (!((fS)object2).c(string) || ((fS)object2).l() && connection == null) continue;
                            this.a(((fS)object2).k());
                            string2 = q_02.n.az();
                            if (!string2.equals(j[136])) {
                                ((fS)object2).a(string2);
                            }
                            ((fS)object2).a(string, connection, ch2, bl3);
                            bl4 = true;
                            ((fS)object2).a(jv_02);
                            if (((fS)object2).e()) break;
                            return;
                        }
                        if (!bl4) {
                            this.a(jv_02, am.bF.a(j[137], (Object)string));
                            return;
                        }
                        this.a(w2, jv_02, true);
                        return;
                    }
                    catch (Throwable throwable) {
                        this.a(jv_02, am.b9);
                        w2.a(throwable);
                        return;
                    }
                    finally {
                        this.k.clear();
                        if (connection != null) {
                            try {
                                connection.close();
                            }
                            catch (Exception exception) {
                                throw new RuntimeException(exception);
                            }
                        }
                    }
                });
            }
            return;
        }
        if (string2.equals("reset-database")) {
            new fm_0(stringArray, di_02).run();
            return;
        }
        if (string2.equals("reset-templates")) {
            new f0(di_02).run();
            return;
        }
        if (string2.equals("addhistory") || string2.equals("addiphistory") || string2.equals("add-login")) {
            new fL(stringArray, di_02).run();
            return;
        }
        if (string2.equals("json-disconnect") && stringArray.length >= 3) {
            jv_0 jv_03;
            String string = stringArray[1];
            String string6 = kg_0.a(Arrays.copyOfRange(stringArray, 2, stringArray.length), " ");
            if (q_02.g()) {
                q_02.a((Object)("target:" + string + ", reason:" + string6));
            }
            if ((jv_03 = aa_0.b(this, string)) != null) {
                switch (di_02.t()) {
                    case 0: {
                        du_0.b.a(jv_03.c(), string6);
                        break;
                    }
                    case 1: {
                        k1 k12 = (k1)di_02.i();
                        k12.a(jv_03, string6);
                        break;
                    }
                    default: {
                        throw new UnsupportedOperationException();
                    }
                }
            }
            return;
        }
        if (string2.equals("test-vault") && stringArray.length >= 2) {
            String string = stringArray[1];
            object2 = UUID.fromString(string);
            object = stringArray.length == 3 ? stringArray[2] : null;
            if (di_02.t() == 0) {
                di_02.b(() -> this.a(di_02, (UUID)object2, (String)object, jv_02));
                return;
            }
            fg_0.a.a("Command is not supported on this ");
        }
        if (string2.equals("refresh") && stringArray.length >= 2) {
            String string;
            String string7 = bK.c.e(stringArray[1]);
            object2 = null;
            if (stringArray.length >= 3) {
                object2 = stringArray[2];
            }
            object = o2.a(string7);
            String string8 = q_02.n.aw();
            if (object != null && (string = object.h()) != null) {
                string8 = string;
            }
            string = null;
            if (object != null) {
                string = object.i();
            }
            p2.a(string, string7, (String)object2, string8);
            this.a(jv_02, hd_0.i + "Refreshed player: '" + string7 + "', server: " + string8);
            return;
        }
        if (string2.equals("expiry-update")) {
            di_02.b(() -> {
                try (ch ch2 = w2.f();){
                    ch2.a(true);
                }
                catch (Exception exception) {
                    w2.a(exception);
                }
            });
            this.a(jv_02, hd_0.i + "Expiry update ");
            return;
        }
        if (string2.equals("upgrade")) {
            this.b(jv_02);
            return;
        }
        if (string2.equals("benchgen") && jv_02.f() && q_02.g()) {
            new gw(stringArray, di_02).run();
            return;
        }
        if (string2.equals("benchjoin") && jv_02.f() && q_02.g()) {
            new ga_0(stringArray, di_02).run();
            return;
        }
        this.a(jv_02);
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public String getPermission() {
        return null;
    }

    public void a(String string) {
        this.h().getLogger().info("Begin import from: " + string);
    }

    public void b(jv_0 jv_02) {
        w w2 = (w)this.h().a(w.class);
        this.h().b(() -> {
            try (ch ch2 = w2.f();){
                w2.a(ch2, ((gZ)ch2).b(), true, true);
                ch2.close();
                w2.c();
                w2.e();
                this.a(jv_02, hd_0.i + j[88]);
            }
            catch (Exception exception) {
                w2.a(exception);
            }
        });
    }

    void a(w w2, jv_0 jv_02, boolean bl) {
        try (ch ch2 = w2.f();){
            if (ch2.b()) {
                return;
            }
            for (kL kL2 : kL.values()) {
                if (!kL2.a()) continue;
                long l3 = 0L;
                if (!bl) {
                    this.a(jv_02, am.a3.a("table", (Object)kL2.toString()));
                }
                bT bT2 = ch2.c((CharSequence)("SELECT * FROM " + kL2));
                ResultSet resultSet = w2.a(bT2);
                int n = 0;
                List list = ch2.b(resultSet, kL2.c());
                for (dZ dZ2 : list) {
                    String string;
                    String string2 = dZ2.w();
                    if (string2 == null) continue;
                    if (bK.c.c(string2)) {
                        ++l3;
                        continue;
                    }
                    iA iA2 = ch2.c(string2);
                    if (iA2 != null || (string = bK.c.f(string2)) == null) continue;
                    ch2.a(string, string2, "#", false, true);
                    ++n;
                }
                if (!bl) {
                    this.a(jv_02, am.c1.a("amount", (Object)n));
                }
                if (l3 <= 0L || bl) continue;
                this.a(jv_02, am.aw.a("amount", (Object)l3));
            }
        }
        catch (Exception exception) {
            w2.a(exception);
        }
    }

    void a(jv_0 jv_02) {
        String string;
        q_0 q_02 = (q_0)this.h().a(q_0.class);
        if (q_02.w() != null) {
            this.a(jv_02, hd_0.c + "[LiteBans] " + hd_0.F + "Plugin access has been disabled!");
            if (q_02.j() != null) {
                this.a(jv_02, q_02.j());
            }
        }
        switch (this.h().t()) {
            case 0: {
                if (es_0.c()) {
                    string = "Folia";
                    break;
                }
                if (es_0.a()) {
                    string = "Paper";
                    break;
                }
                string = "Bukkit";
                try {
                    Class.forName("org.spigotmc.SpigotConfig");
                    string = "Spigot";
                }
                catch (ClassNotFoundException classNotFoundException) {}
                break;
            }
            case 1: {
                string = "BungeeCord";
                break;
            }
            case 2: {
                string = "Velocity";
                break;
            }
            case 3: {
                string = "Fabric";
                break;
            }
            default: {
                string = "Unknown";
            }
        }
        String string2 = de_0.c.a(this.h().i().b(), new Integer[]{0, 0, 0}).toString();
        this.a(jv_02, hd_0.i + "LiteBans version " + hd_0.m + eq.d + hd_0.i + " running on " + hd_0.g(string) + " " + hd_0.a(string2));
        this.a(jv_02, hd_0.m.toString() + hd_0.r + j[87]);
    }

    private final /* synthetic */ void a(di_0 di_02, UUID uUID, String string, jv_0 jv_02) {
        ao_0 ao_02 = (ao_0)di_02.i();
        boolean bl = ao_02.b().a(ao_02.a(uUID), j[89], string);
        this.a(jv_02, hd_0.i + j[90] + (bl ? hd_0.i + j[91] : hd_0.c + j[92]));
    }

    private static final void a() {
        j = new String[]{"litebans", "version", "broadcast", "verify", "2ccd0bb281214361803a945b8f0644ab", "litebans.admin", "litebans.verify", " ", " ", "undefined", "yyyy-MM-dd", "UTC", "A#63rP", "SHA-512", "q", "Verification code: ", "allow", "unlink", "clearhistory", "cleariphistory", "reveal", "license", "litebans.admin", "reload", "info", "servers", "accept", "debug", "Debug level has been set to: ", "Debug levels: ", " (config); ", "/", " (database) + ", "timezone", "yyyy-MM-dd HH:mm:ss", "Current timezone: ", "\n", "Current time: ", "fixhistory", "fixiphistory", "clearmute", "Removed active mute for ", " ", "No mute found for ", "Active mutes have been ", "listmutes", "import", "start", "reset-database", "reset-templates", "addhistory", "addiphistory", "add-login", "json-disconnect", " ", "target:", ", reason:", "test-vault", "Command is not supported on this ", "refresh", "Refreshed player: '", "', server: ", "expiry-update", "Expiry update ", "upgrade", "benchgen", "benchjoin", "Begin import from: ", "table", "SELECT * FROM ", "#", "amount", "amount", "[LiteBans] ", "Plugin access has been disabled!", "Folia", "Paper", "Bukkit", "org.spigotmc.SpigotConfig", "Spigot", "BungeeCord", "Velocity", "Fabric", "Unknown", "LiteBans version ", " running on ", " ", "https://www.spigotmc.org/resources/litebans.3715/ {url: https://www.spigotmc.org/resources/litebans.3715/}", "Upgrade check executed ", "litebans.test", "litebans.test: ", "true", "false", " ", " ", "", "vanilla", "banned-players", "essentials", "sqlite", "litebans", "h2", "litebans", "banmanager7", "banmanagerv7", "h2", "plugins/BanManager", "local_bans", ".mv.db", "db", "jdbc:", "://", "mysql", "jdbc:mysql://", "db", "30000", "connectTimeout", "socketTimeout", "autoReconnect", "true", "useUnicode", "true", "connectionCollation", "utf8mb4_unicode_ci", "characterEncoding", "utf-8", "characterSetResults", "utf-8", "serverTimezone", "UTC", "timezone", "UTC", "user", "password", "db", "banned-players.json", "default", "name", "UPDATE ", " SET timezone=?", "Timezone updated: ", "\n", "Current time: ", "LiteBans is connected to a ", " ", "", "", "!!!", "Server name: ", "Server UUID: ", " <", ">", "Pooled connections: ", "/", " (minimum: ", ", idle: ", ")", "Threads awaiting connection: ", "Sync events in/out/skipped: ", ", ", ", "};
    }

    static {
        fD.a();
    }
}

