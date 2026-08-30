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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static class fD
extends fB {
    public static Object i;
    final Map k = new HashMap();
    private static /* synthetic */ String[] j;

    @Override
    public boolean a() {
        return false;
    }

    public fD(di_0 di_02) {
        super(j[0], di_02);
    }

    private final void a(jv_0 jv_02, CharSequence charSequence) {
        fD.a(jv_02, charSequence, this.h());
    }

    @Override
    public void a(@NotNull jv_0 jv_02, String[] stringArray) {
        Object object;
        Object object2;
        if (stringArray.length == 0 || stringArray[0].equalsIgnoreCase(j[1])) {
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
        if (string2.equals(j[2])) {
            new gj(stringArray, di_02).run();
            return;
        }
        if (string2.equals(j[3])) {
            boolean bl = bK.c.d(jv_02.a()).equals(j[4]);
            if (!bl) {
                aa_0.a((fg_0)this, new String[]{j[5], j[6]});
            } else {
                this.a(jv_02, hd_0.u + cD.a + j[7] + kf.a + j[8] + gv_0.a);
            }
            try {
                String string = j[9];
                String calendar = ep.a;
                SimpleDateFormat string8 = new SimpleDateFormat(j[10]);
                string8.setTimeZone(TimeZone.getTimeZone(j[11]));
                String string3 = string8.format(new Date());
                String string4 = string3 + j[12];
                MessageDigest messageDigest = MessageDigest.getInstance(j[13]);
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
                string = j[14] + stringBuilder.substring(0, 8);
                this.a(jv_02, hd_0.o + j[15] + hd_0.i + string);
                return;
            }
            catch (NoSuchAlgorithmException timeZone) {
                throw new RuntimeException(timeZone);
            }
        }
        if (string2.equals(j[16])) {
            new f7(stringArray, di_02, true).run();
            return;
        }
        if (string2.equals(j[17]) || string2.equals(j[18]) || string2.equals(j[19])) {
            if (stringArray.length < 2) {
                return;
            }
            new go(stringArray, di_02).run();
            return;
        }
        if (string2.equals(j[20]) && stringArray.length >= 2) {
            new fu_0(stringArray, di_02).run();
            return;
        }
        if (string2.equals(j[21])) {
            new f5(di_02).run();
            return;
        }
        aa_0.c(this, j[22]);
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
        if (string2.equals(j[23])) {
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
        if (string2.equals(j[24])) {
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
        if (string2.equals(j[25])) {
            new f3(di_02).run();
            return;
        }
        if (string2.equals(j[26])) {
            new fq_0(di_02).run();
            return;
        }
        if (string2.equals(j[27])) {
            if (stringArray.length >= 2) {
                byte simpleDateFormat = (byte)Integer.parseInt(stringArray[1]);
                q_02.a(simpleDateFormat);
                this.a(jv_02, hd_0.i + j[28] + hd_0.m + simpleDateFormat);
            }
            if (q_02.g()) {
                this.a(jv_02, hd_0.i + j[29] + q_02.a() + j[30] + q_02.q() + j[31] + q_02.l() + j[32]);
            }
            return;
        }
        if (string2.equals(j[33])) {
            SimpleDateFormat uUID = new SimpleDateFormat(j[34]);
            TimeZone string11 = TimeZone.getTimeZone(w2.n());
            Calendar object3 = Calendar.getInstance(string11);
            uUID.setCalendar(object3);
            if (stringArray.length == 1) {
                this.a(jv_02, hd_0.i + j[35] + hd_0.m + w2.n() + j[36] + hd_0.i + j[37] + hd_0.m + uUID.format(object3.getTime()));
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
        if (string2.equals(j[38]) || string2.equals(j[39])) {
            di_02.a(() -> this.a(w2, jv_02, false));
            return;
        }
        if (string2.startsWith(j[40])) {
            if (stringArray.length >= 2) {
                UUID string9 = UUID.fromString(stringArray[1]);
                dZ object22 = (dZ)p2.a().b().remove(string9);
                if (object22 != null) {
                    this.a(jv_02, hd_0.i + j[41] + object22 + j[42]);
                } else {
                    fg_0.a.a(hd_0.c + j[43] + string9);
                }
                return;
            }
            p2.a().b().clear();
            this.a(jv_02, hd_0.i + j[44]);
            return;
        }
        if (string2.equals(j[45]) && jv_02.f()) {
            this.a(jv_02, Arrays.toString(p2.a().b().entrySet().toArray()));
            return;
        }
        if (string2.equals(j[46])) {
            String string10;
            if (stringArray.length == 1) {
                fg_0.a.a(am.cP);
            }
            if ((string10 = stringArray[1].toLowerCase(Locale.ENGLISH)).equals(j[47])) {
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
        if (string2.equals(j[48])) {
            new fm_0(stringArray, di_02).run();
            return;
        }
        if (string2.equals(j[49])) {
            new f0(di_02).run();
            return;
        }
        if (string2.equals(j[50]) || string2.equals(j[51]) || string2.equals(j[52])) {
            new fL(stringArray, di_02).run();
            return;
        }
        if (string2.equals(j[53]) && stringArray.length >= 3) {
            jv_0 jv_03;
            String string = stringArray[1];
            String string6 = kg_0.a(Arrays.copyOfRange(stringArray, 2, stringArray.length), j[54]);
            if (q_02.g()) {
                q_02.a((Object)(j[55] + string + j[56] + string6));
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
        if (string2.equals(j[57]) && stringArray.length >= 2) {
            String string = stringArray[1];
            object2 = UUID.fromString(string);
            object = stringArray.length == 3 ? stringArray[2] : null;
            if (di_02.t() == 0) {
                di_02.b(() -> this.a(di_02, (UUID)object2, (String)object, jv_02));
                return;
            }
            fg_0.a.a(j[58]);
        }
        if (string2.equals(j[59]) && stringArray.length >= 2) {
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
            this.a(jv_02, hd_0.i + j[60] + string7 + j[61] + string8);
            return;
        }
        if (string2.equals(j[62])) {
            di_02.b(() -> {
                try (ch ch2 = w2.f();){
                    ch2.a(true);
                }
                catch (Exception exception) {
                    w2.a(exception);
                }
            });
            this.a(jv_02, hd_0.i + j[63]);
            return;
        }
        if (string2.equals(j[64])) {
            this.b(jv_02);
            return;
        }
        if (string2.equals(j[65]) && jv_02.f() && q_02.g()) {
            new gw(stringArray, di_02).run();
            return;
        }
        if (string2.equals(j[66]) && jv_02.f() && q_02.g()) {
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
        this.h().getLogger().info(j[67] + string);
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
                    this.a(jv_02, am.a3.a(j[68], (Object)kL2.toString()));
                }
                bT bT2 = ch2.c((CharSequence)(j[69] + kL2));
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
                    ch2.a(string, string2, j[70], false, true);
                    ++n;
                }
                if (!bl) {
                    this.a(jv_02, am.c1.a(j[71], (Object)n));
                }
                if (l3 <= 0L || bl) continue;
                this.a(jv_02, am.aw.a(j[72], (Object)l3));
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
            this.a(jv_02, hd_0.c + j[73] + hd_0.F + j[74]);
            if (q_02.j() != null) {
                this.a(jv_02, q_02.j());
            }
        }
        switch (this.h().t()) {
            case 0: {
                if (es_0.c()) {
                    string = j[75];
                    break;
                }
                if (es_0.a()) {
                    string = j[76];
                    break;
                }
                string = j[77];
                try {
                    Class.forName(j[78]);
                    string = j[79];
                }
                catch (ClassNotFoundException classNotFoundException) {}
                break;
            }
            case 1: {
                string = j[80];
                break;
            }
            case 2: {
                string = j[81];
                break;
            }
            case 3: {
                string = j[82];
                break;
            }
            default: {
                string = j[83];
            }
        }
        String string2 = de_0.c.a(this.h().i().b(), new Integer[]{0, 0, 0}).toString();
        this.a(jv_02, hd_0.i + j[84] + hd_0.m + eq.d + hd_0.i + j[85] + hd_0.g(string) + j[86] + hd_0.a(string2));
        this.a(jv_02, hd_0.m.toString() + hd_0.r + j[87]);
    }

    private final /* synthetic */ void a(di_0 di_02, UUID uUID, String string, jv_0 jv_02) {
        ao_0 ao_02 = (ao_0)di_02.i();
        boolean bl = ao_02.b().a(ao_02.a(uUID), j[89], string);
        this.a(jv_02, hd_0.i + j[90] + (bl ? hd_0.i + j[91] : hd_0.c + j[92]));
    }

    private static final void a() {
        j = new String[]{hl.a("\ud5e0\ud5e5\ud5f8\ud5e9\ud5ee\ud5ed\ud5e2\ud5ff", -181348980), hl.a("\u2882\u2891\u2886\u2887\u289d\u289b\u289a", -772396812), hl.a("\u27ec\u27fc\u27e1\u27ef\u27ea\u27ed\u27ef\u27fd\u27fa", -1379063922), hl.a("\u240f\u241c\u240b\u2410\u241f\u2400", -312204167), hl.a("\u797c\u792d\u792d\u792a\u797e\u792c\u792c\u797c\u7976\u797f\u797c\u797f\u797a\u797d\u7978\u797f\u7976\u797e\u797d\u792f\u7977\u797a\u797b\u792c\u7976\u7928\u797e\u7978\u797a\u797a\u792f\u792c", -371951282), hl.a("\u41bd\u41b8\u41a5\u41b4\u41b3\u41b0\u41bf\u41a2\u41ff\u41b0\u41b5\u41bc\u41b8\u41bf", -1907277359), hl.a("\u6276\u6273\u626e\u627f\u6278\u627b\u6274\u6269\u6234\u626c\u627f\u6268\u6273\u627c\u6263", -1841798630), hl.a("\u3e2e", 199048718), hl.a("\uba3a", 1405729306), hl.a("\u9a70\u9a6b\u9a61\u9a60\u9a63\u9a6c\u9a6b\u9a60\u9a61", -1862034939), hl.a("\u7573\u7573\u7573\u7573\u7527\u7547\u7547\u7527\u756e\u756e", 1084781834), hl.a("\u53bd\u53bc\u53ab", -461220888), hl.a("\ud5d9\ud5bb\ud5ae\ud5ab\ud5ea\ud5c8", -83962472), hl.a("\ued08\ued13\ued1a\ued76\ued6e\ued6a\ued69", 419753307), hl.a("\u3005", -857657228), hl.a("\u8db0\u8d83\u8d94\u8d8f\u8d80\u8d8f\u8d85\u8d87\u8d92\u8d8f\u8d89\u8d88\u8dc6\u8d85\u8d89\u8d82\u8d83\u8ddc\u8dc6", -1137668634), hl.a("\uf393\uf39e\uf39e\uf39d\uf385", -672795662), hl.a("\u0c7e\u0c65\u0c67\u0c62\u0c65\u0c60", 1508314123), hl.a("\u1275\u127a\u1273\u1277\u1264\u127e\u127f\u1265\u1262\u1279\u1264\u126f", 399053334), hl.a("\u3ce2\u3ced\u3ce4\u3ce0\u3cf3\u3ce8\u3cf1\u3ce9\u3ce8\u3cf2\u3cf5\u3cee\u3cf3\u3cf8", 1946696833), hl.a("\u80ab\u80bc\u80af\u80bc\u80b8\u80b5", 1259634905), hl.a("\u0894\u0891\u089b\u089d\u0896\u088b\u089d", 1177749752), hl.a("\u6acd\u6ac8\u6ad5\u6ac4\u6ac3\u6ac0\u6acf\u6ad2\u6a8f\u6ac0\u6ac5\u6acc\u6ac8\u6acf", 801663649), hl.a("\u1a6e\u1a79\u1a70\u1a73\u1a7d\u1a78", -1300555236), hl.a("\u1f4f\u1f48\u1f40\u1f49", -33743066), hl.a("\u8681\u8697\u8680\u8684\u8697\u8680\u8681", -789084430), hl.a("\ue458\ue45a\ue45a\ue45c\ue449\ue44d", -1640111047), hl.a("\u01f6\u01f7\u01f0\u01e7\u01f5", 2003566994), hl.a("\u6d1c\u6d3d\u6d3a\u6d2d\u6d3f\u6d78\u6d34\u6d3d\u6d2e\u6d3d\u6d34\u6d78\u6d30\u6d39\u6d2b\u6d78\u6d3a\u6d3d\u6d3d\u6d36\u6d78\u6d2b\u6d3d\u6d2c\u6d78\u6d2c\u6d37\u6d62\u6d78", 11824472), hl.a("\u3521\u3500\u3507\u3510\u3502\u3545\u3509\u3500\u3513\u3500\u3509\u3516\u355f\u3545", -690866843), hl.a("\u2c77\u2c7f\u2c34\u2c38\u2c39\u2c31\u2c3e\u2c30\u2c7e\u2c6c\u2c77", -647222185), hl.a("\ub375", -244862118), hl.a("\u29b1\u29b9\u29f5\u29f0\u29e5\u29f0\u29f3\u29f0\u29e2\u29f4\u29b8\u29bf", -2100942447), hl.a("\u9a01\u9a1c\u9a18\u9a10\u9a0f\u9a1a\u9a1b\u9a10", 100571765), hl.a("\uf984\uf984\uf984\uf984\uf9d0\uf9b0\uf9b0\uf9d0\uf999\uf999\uf9dd\uf9b5\uf9b5\uf9c7\uf990\uf990\uf9c7\uf98e\uf98e", -151651843), hl.a("\uf1c5\uf1f3\uf1f4\uf1f4\uf1e3\uf1e8\uf1f2\uf1a6\uf1f2\uf1ef\uf1eb\uf1e3\uf1fc\uf1e9\uf1e8\uf1e3\uf1bc\uf1a6", 800649606), hl.a("\u15a6", 872748460), hl.a("\u2e16\u2e20\u2e27\u2e27\u2e30\u2e3b\u2e21\u2e75\u2e21\u2e3c\u2e38\u2e30\u2e6f\u2e75", 758722133), hl.a("\ua66a\ua665\ua674\ua664\ua665\ua67f\ua678\ua663\ua67e\ua675", 1431938572), hl.a("\u446f\u4460\u4471\u4460\u4479\u4461\u4460\u447a\u447d\u4466\u447b\u4470", 2068923401), hl.a("\u8d42\u8d4d\u8d44\u8d40\u8d53\u8d4c\u8d54\u8d55\u8d44", -1544712927), hl.a("\u95cd\u95fa\u95f2\u95f0\u95e9\u95fa\u95fb\u95bf\u95fe\u95fc\u95eb\u95f6\u95e9\u95fa\u95bf\u95f2\u95ea\u95eb\u95fa\u95bf\u95f9\u95f0\u95ed\u95bf", 1349621151), hl.a("\u43b6\u43e5\u43e3\u43f5\u43f5\u43f3\u43e5\u43e5\u43f0\u43e3\u43fa\u43fa\u43ef\u43b8", -761773162), hl.a("\u7fe1\u7fc0\u7f8f\u7fc2\u7fda\u7fdb\u7fca\u7f8f\u7fc9\u7fc0\u7fda\u7fc1\u7fcb\u7f8f\u7fc9\u7fc0\u7fdd\u7f8f", 1961197487), hl.a("\uc9c3\uc9e1\uc9f6\uc9eb\uc9f4\uc9e7\uc9a2\uc9ef\uc9f7\uc9f6\uc9e7\uc9f1\uc9a2\uc9ea\uc9e3\uc9f4\uc9e7\uc9a2\uc9e0\uc9e7\uc9e7\uc9ec\uc9a2\uc9e1\uc9ee\uc9e7\uc9e3\uc9f0\uc9e7\uc9e6\uc9ac", -1409431166), hl.a("\u8d7b\u8d7e\u8d64\u8d63\u8d7a\u8d62\u8d63\u8d72\u8d64", -1113748201), hl.a("\u39c0\u39c4\u39d9\u39c6\u39db\u39dd", 514603433), hl.a("\u1a5b\u1a5c\u1a49\u1a5a\u1a5c", -1578427864), hl.a("\u6b2d\u6b3a\u6b2c\u6b3a\u6b2b\u6b72\u6b3b\u6b3e\u6b2b\u6b3e\u6b3d\u6b3e\u6b2c\u6b3a", -1162187937), hl.a("\u3b03\u3b14\u3b02\u3b14\u3b05\u3b5c\u3b05\u3b14\u3b1c\u3b01\u3b1d\u3b10\u3b05\u3b14\u3b02", 1117797233), hl.a("\ub713\ub716\ub716\ub71a\ub71b\ub701\ub706\ub71d\ub700\ub70b", 153335666), hl.a("\ub2e5\ub2e0\ub2e0\ub2ed\ub2f4\ub2ec\ub2ed\ub2f7\ub2f0\ub2eb\ub2f6\ub2fd", -1501711740), hl.a("\u8fef\u8fea\u8fea\u8fa3\u8fe2\u8fe1\u8fe9\u8fe7\u8fe0", 577015694), hl.a("\u1f32\u1f2b\u1f37\u1f36\u1f75\u1f3c\u1f31\u1f2b\u1f3b\u1f37\u1f36\u1f36\u1f3d\u1f3b\u1f2c", -1257889960), hl.a("\u58b1", 606034065), hl.a("\u8b7a\u8b6f\u8b7c\u8b69\u8b6b\u8b7a\u8b34", 1421642510), hl.a("\uc3f2\uc3fe\uc3ac\uc3bb\uc3bf\uc3ad\uc3b1\uc3b0\uc3e4", -1593588770), hl.a("\u3146\u3157\u3141\u3146\u311f\u3144\u3153\u3147\u315e\u3146", 277623090), hl.a("\u2938\u2914\u2916\u2916\u291a\u2915\u291f\u295b\u2912\u2908\u295b\u2915\u2914\u290f\u295b\u2908\u290e\u290b\u290b\u2914\u2909\u290f\u291e\u291f\u295b\u2914\u2915\u295b\u290f\u2913\u2912\u2908\u295b\u290b\u2917\u291a\u290f\u291d\u2914\u2909\u2916\u2955", -849467013), hl.a("\u9c41\u9c56\u9c55\u9c41\u9c56\u9c40\u9c5b", 1889770547), hl.a("\ud860\ud857\ud854\ud840\ud857\ud841\ud85a\ud857\ud856\ud812\ud842\ud85e\ud853\ud84b\ud857\ud840\ud808\ud812\ud815", -711010254), hl.a("\u99e0\u99eb\u99e7\u99b4\u99a2\u99b5\u99b1\u99a2\u99b5\u99fd\u99e7", -1718249017), hl.a("\uc63a\uc627\uc62f\uc636\uc62d\uc626\uc672\uc62a\uc62f\uc63b\uc63e\uc62b\uc63a", -954546593), hl.a("\u043d\u0400\u0408\u0411\u040a\u0401\u0458\u040d\u0408\u041c\u0419\u040c\u041d\u0458\u041d\u0400\u041d\u041b\u040d\u040c\u041d\u041c\u0456", -551222152), hl.a("\u4a0f\u4a0a\u4a1d\u4a08\u4a1b\u4a1e\u4a1f", -1690547590), hl.a("\uf7d0\uf7d7\uf7dc\uf7d1\uf7da\uf7d5\uf7d7\uf7dc", 944109490), hl.a("\u663d\u663a\u6631\u663c\u6637\u6635\u6630\u6636\u6631", -753441185), hl.a("\u0752\u0775\u0777\u0779\u077e\u0730\u0779\u077d\u0760\u077f\u0762\u0764\u0730\u0776\u0762\u077f\u077d\u072a\u0730", -2079389936), hl.a("\u4f01\u4f14\u4f17\u4f19\u4f10", 1031294837), hl.a("\u2f6f\u2f79\u2f70\u2f79\u2f7f\u2f68\u2f1c\u2f16\u2f1c\u2f7a\u2f6e\u2f73\u2f71\u2f1c", 1642344252), hl.a("\u0fe1", 213127106), hl.a("\ufcdb\ufcd7\ufcd5\ufccf\ufcd4\ufcce", -1927611206), hl.a("\ua6a5\ua6a9\ua6ab\ua6b1\ua6aa\ua6b0", 1844094660), hl.a("\u84a8\u84bf\u849a\u8487\u8496\u84b1\u8492\u849d\u8480\u84ae\u84d3", 1563788531), hl.a("\uc55c\uc560\uc579\uc56b\uc565\uc562\uc52c\uc56d\uc56f\uc56f\uc569\uc57f\uc57f\uc52c\uc564\uc56d\uc57f\uc52c\uc56e\uc569\uc569\uc562\uc52c\uc568\uc565\uc57f\uc56d\uc56e\uc560\uc569\uc568\uc52d", 1257293068), hl.a("\u26db\u26f2\u26f1\u26f4\u26fc", -252107107), hl.a("\ue8d6\ue8e7\ue8f6\ue8e3\ue8f4", 715384966), hl.a("\ua8e7\ua8d0\ua8ce\ua8ce\ua8cc\ua8d1", -460740443), hl.a("\u669c\u6681\u6694\u66dd\u6680\u6683\u669a\u6694\u669c\u6687\u669e\u6690\u66dd\u66a0\u6683\u669a\u6694\u669c\u6687\u66b0\u669c\u669d\u6695\u669a\u6694", -92313869), hl.a("\ude62\ude41\ude58\ude56\ude5e\ude45", 884137521), hl.a("\ud3a1\ud396\ud38d\ud384\ud386\ud386\ud3a0\ud38c\ud391\ud387", 1662964707), hl.a("\ufd7a\ufd49\ufd40\ufd43\ufd4f\ufd45\ufd58\ufd55", -425067220), hl.a("\u61c8\u61ef\u61ec\u61fc\u61e7\u61ed", -1988599410), hl.a("\uf32e\uf315\uf310\uf315\uf314\uf30c\uf315", 1025504123), hl.a("\u4ba1\u4b84\u4b99\u4b88\u4baf\u4b8c\u4b83\u4b9e\u4bcd\u4b9b\u4b88\u4b9f\u4b9e\u4b84\u4b82\u4b83\u4bcd", 1156664301), hl.a("\ua6ca\ua698\ua69f\ua684\ua684\ua683\ua684\ua68d\ua6ca\ua685\ua684\ua6ca", -1731877142), hl.a("\ufbe4", -1866531900), hl.a("\ufe7c\ufe60\ufe60\ufe64\ufe67\ufe2e\ufe3b\ufe3b\ufe63\ufe63\ufe63\ufe3a\ufe67\ufe64\ufe7d\ufe73\ufe7b\ufe60\ufe79\ufe77\ufe3a\ufe7b\ufe66\ufe73\ufe3b\ufe66\ufe71\ufe67\ufe7b\ufe61\ufe66\ufe77\ufe71\ufe67\ufe3b\ufe78\ufe7d\ufe60\ufe71\ufe76\ufe75\ufe7a\ufe67\ufe3a\ufe27\ufe23\ufe25\ufe21\ufe3b\ufe34\ufe6f\ufe61\ufe66\ufe78\ufe2e\ufe34\ufe7c\ufe60\ufe60\ufe64\ufe67\ufe2e\ufe3b\ufe3b\ufe63\ufe63\ufe63\ufe3a\ufe67\ufe64\ufe7d\ufe73\ufe7b\ufe60\ufe79\ufe77\ufe3a\ufe7b\ufe66\ufe73\ufe3b\ufe66\ufe71\ufe67\ufe7b\ufe61\ufe66\ufe77\ufe71\ufe67\ufe3b\ufe78\ufe7d\ufe60\ufe71\ufe76\ufe75\ufe7a\ufe67\ufe3a\ufe27\ufe23\ufe25\ufe21\ufe3b\ufe69", 368573972), hl.a("\u3c78\u3c5d\u3c4a\u3c5f\u3c4c\u3c49\u3c48\u3c0d\u3c4e\u3c45\u3c48\u3c4e\u3c46\u3c0d\u3c48\u3c55\u3c48\u3c4e\u3c58\u3c59\u3c48\u3c49\u3c0d\u3c5e\u3c58\u3c4e\u3c4e\u3c48\u3c5e\u3c5e\u3c4b\u3c58\u3c41\u3c41\u3c54\u3c03", -516539347), hl.a("\uf4f5\uf4f0\uf4ed\uf4fc\uf4fb\uf4f8\uf4f7\uf4ea\uf4b7\uf4ed\uf4fc\uf4ea\uf4ed", 907474073), hl.a("\u28c1\u28c4\u28d9\u28c8\u28cf\u28cc\u28c3\u28de\u2883\u28d9\u28c8\u28de\u28d9\u2897\u288d", 110897325), hl.a("\u9c0a\u9c0c\u9c0b\u9c1b", -1550082946), hl.a("\ueaef\ueae8\ueae5\ueafa\ueaec", -376771959), hl.a("\u5b94", 574053300), hl.a("\u5aab", 140860043), hl.a("", 1246275178), hl.a("\ua90c\ua91b\ua914\ua913\ua916\ua916\ua91b", 805874042), hl.a("\u15b1\u15b2\u15bd\u15bd\u15b6\u15b7\u15fe\u15a3\u15bf\u15b2\u15aa\u15b6\u15a1\u15a0", 1052906963), hl.a("\uc064\uc072\uc072\uc064\uc06f\uc075\uc068\uc060\uc06d\uc072", -1577271295), hl.a("\uc61d\uc61f\uc602\uc607\uc61a\uc60b", 1830733422), hl.a("\u99af\u99aa\u99b7\u99a6\u99a1\u99a2\u99ad\u99b0", -885810749), hl.a("\u489e\u48c4", 1953974518), hl.a("\ub6df\ub6da\ub6c7\ub6d6\ub6d1\ub6d2\ub6dd\ub6c0", 1338160819), hl.a("\u06b1\u06b2\u06bd\u06be\u06b2\u06bd\u06b2\u06b4\u06b6\u06a1\u06e4", 942540499), hl.a("\ue8d3\ue8d0\ue8df\ue8dc\ue8d0\ue8df\ue8d0\ue8d6\ue8d4\ue8c3\ue8c7\ue886", 952035505), hl.a("\ucc4e\ucc14", 762170406), hl.a("\ueac6\ueada\ueac3\uead1\ueadf\uead8\ueac5\uea99\ueaf4\uead7\uead8\ueafb\uead7\uead8\uead7\uead1\uead3\ueac4", 682748598), hl.a("\u307d\u307e\u3072\u3070\u307d\u304e\u3073\u3070\u307f\u3062", -2093469679), hl.a("\u4fb7\u4ff4\u4fef\u4fb7\u4ffd\u4ffb", 1594249113), hl.a("\u4d7f\u4d79", -816034533), hl.a("\ud178\ud176\ud170\ud171\ud128", -1895378670), hl.a("\uad24\uad31\uad31", 14527774), hl.a("\u0600\u0614\u061e\u061c\u0601", 488244845), hl.a("\u5a01\u5a0f\u5a09\u5a08\u5a51\u5a06\u5a12\u5a18\u5a1a\u5a07\u5a51\u5a44\u5a44", -1814930837), hl.a("\u12da\u12dc", 1508315838), hl.a("\u1c97\u1c94\u1c94\u1c94\u1c94", -421061468), hl.a("\u7b74\u7b78\u7b79\u7b79\u7b72\u7b74\u7b63\u7b43\u7b7e\u7b7a\u7b72\u7b78\u7b62\u7b63", -1187218665), hl.a("\u7512\u750e\u7502\u750a\u7504\u7515\u7535\u7508\u750c\u7504\u750e\u7514\u7515", 58815841), hl.a("\ubfd0\ubfc4\ubfc5\ubfde\ubfe3\ubfd4\ubfd2\ubfde\ubfdf\ubfdf\ubfd4\ubfd2\ubfc5", 1004584881), hl.a("\u052a\u052c\u052b\u053b", 489751902), hl.a("\u5dd1\u5dd7\u5dc1\u5df1\u5dca\u5dcd\u5dc7\u5dcb\u5dc0\u5dc1", 1922391460), hl.a("\u3c69\u3c6f\u3c68\u3c78", -1780270051), hl.a("\u45ad\u45a1\u45a0\u45a0\u45ab\u45ad\u45ba\u45a7\u45a1\u45a0\u458d\u45a1\u45a2\u45a2\u45af\u45ba\u45a7\u45a1\u45a0", 1546864078), hl.a("\u8c9c\u8c9d\u8c8f\u8cd1\u8c84\u8c8b\u8cdd\u8cb6\u8c9c\u8c87\u8c80\u8c8a\u8c86\u8c8d\u8c8c\u8cb6\u8c8a\u8c80", 951749865), hl.a("\u429b\u4290\u4299\u428a\u4299\u429b\u428c\u429d\u428a\u42bd\u4296\u429b\u4297\u429c\u4291\u4296\u429f", 292963064), hl.a("\u947c\u947d\u946f\u9424\u9431", 1508676617), hl.a("\u6544\u654f\u6546\u6555\u6546\u6544\u6553\u6542\u6555\u6574\u6542\u6553\u6575\u6542\u6554\u6552\u654b\u6553\u6554", 287401255), hl.a("\u56c3\u56c2\u56d0\u569b\u568e", 260789942), hl.a("\u7447\u7451\u7446\u7442\u7451\u7446\u7460\u745d\u7459\u7451\u744e\u745b\u745a\u7451", 458454068), hl.a("\ufce4\ufce5\ufcf2", 2035416241), hl.a("\u1439\u1424\u1420\u1428\u1437\u1422\u1423\u1428", 1225725005), hl.a("\u0dbe\u0dbf\u0da8", -1473835541), hl.a("\ud7c3\ud7c5\ud7d3\ud7c4", 494589878), hl.a("\u5fa0\u5fb1\u5fa3\u5fa3\u5fa7\u5fbf\u5fa2\u5fb4", -288727088), hl.a("\uf62b\uf62d", 44693071), hl.a("\u922c\u922f\u9220\u9220\u922b\u922a\u9263\u923e\u9222\u922f\u9237\u922b\u923c\u923d\u9260\u9224\u923d\u9221\u9220", 1048482382), hl.a("\u4b0b\u4b0a\u4b09\u4b0e\u4b1a\u4b03\u4b1b", -2036053137), hl.a("\u6c78\u6c77\u6c7b\u6c73", -1659147242), hl.a("\u6782\u6787\u6793\u6796\u6783\u6792\u67f7", 638543831), hl.a("\u4688\u46fb\u46ed\u46fc\u4688\u46dc\u46c1\u46c5\u46cd\u46d2\u46c7\u46c6\u46cd\u4695\u4697", 1698449064), hl.a("\ub41a\ub427\ub423\ub42b\ub434\ub421\ub420\ub42b\ub46e\ub43b\ub43e\ub42a\ub42f\ub43a\ub42b\ub42a\ub474\ub46e", -1002326962), hl.a("\u183e", 1342969908), hl.a("\ua19f\ua1a9\ua1ae\ua1ae\ua1b9\ua1b2\ua1a8\ua1fc\ua1a8\ua1b5\ua1b1\ua1b9\ua1e6\ua1fc", -806313508), hl.a("\ub4cd\ub4e8\ub4f5\ub4e4\ub4c3\ub4e0\ub4ef\ub4f2\ub4a1\ub4e8\ub4f2\ub4a1\ub4e2\ub4ee\ub4ef\ub4ef\ub4e4\ub4e2\ub4f5\ub4e4\ub4e5\ub4a1\ub4f5\ub4ee\ub4a1\ub4e0\ub4a1", 762295425), hl.a("\u0cad\u0ce9\u0cec\u0cf9\u0cec\u0cef\u0cec\u0cfe\u0ce8\u0ca3", 763563149), hl.a("", -1070126035), hl.a("", 2004810298), hl.a("\u9988\u9988\u9988", -29976151), hl.a("\u215d\u216b\u217c\u2178\u216b\u217c\u212e\u2160\u216f\u2163\u216b\u2134\u212e", 54206734), hl.a("\u65d7\u65e1\u65f6\u65f2\u65e1\u65f6\u65a4\u65d1\u65d1\u65cd\u65c0\u65be\u65a4", -575117948), hl.a("\ue073\ue06f", -1931222957), hl.a("\u6dfe", 1278897600), hl.a("\uf10d\uf132\uf132\uf131\uf138\uf139\uf17d\uf13e\uf132\uf133\uf133\uf138\uf13e\uf129\uf134\uf132\uf133\uf12e\uf167\uf17d", -367267491), hl.a("\u8fd1", -1484419074), hl.a("\ua72b\ua723\ua766\ua762\ua765\ua762\ua766\ua77e\ua766\ua731\ua72b", 1280419595), hl.a("\u1dce\u1dc2\u1d8b\u1d86\u1d8e\u1d87\u1dd8\u1dc2", -315548190), hl.a("\u0087", -1667104594), hl.a("\ue0a8\ue094\ue08e\ue099\ue09d\ue098\ue08f\ue0dc\ue09d\ue08b\ue09d\ue095\ue088\ue095\ue092\ue09b\ue0dc\ue09f\ue093\ue092\ue092\ue099\ue09f\ue088\ue095\ue093\ue092\ue0c6\ue0dc", 1452007676), hl.a("\u7565\u754f\u7558\u7555\u7516\u7553\u7540\u7553\u7558\u7542\u7545\u7516\u755f\u7558\u7519\u7559\u7543\u7542\u7519\u7545\u755d\u755f\u7546\u7546\u7553\u7552\u750c\u7516", -946440906), hl.a("\ubc92\ubc9e", 1642577086), hl.a("\ub729\ub725", 308721413)};
    }

    static {
        fD.a();
    }
}

