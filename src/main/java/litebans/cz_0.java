package litebans;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;
import litebans.bz;
import litebans.eG;
import litebans.ew;
import litebans.fv_0;
import litebans.hN;
import litebans.hl;
import litebans.ig_0;
import litebans.iv;
import litebans.kd_0;
import litebans.ll;
import litebans.q_0;

/*
 * Renamed from litebans.cZ
 */
public static final class cz_0
implements Runnable {
    final /* synthetic */ q_0 b;
    final /* synthetic */ File d;
    final /* synthetic */ eG a;
    private static /* synthetic */ String[] c;

    public cz_0(q_0 q_02, File file, eG eG2) {
        this.b = q_02;
        this.d = file;
        this.a = eG2;
    }

    @Override
    public final void run() {
        try {
            Logger logger = this.b.a.getLogger();
            String[] stringArray = this.d;
            eG eG2 = this.a;
            q_0 q_02 = this.b;
            Logger logger2 = logger;
            boolean bl = false;
            File[] fileArray = stringArray.listFiles();
            String string = c[0];
            String[] stringArray2 = stringArray;
            int n = 0;
            File file = new File((File)stringArray2, string);
            if (fileArray == null || fileArray.length < eG2.g().length + 1 || !file.exists()) {
                logger2.info(c[1]);
                for (String string2 : eG2.g()) {
                    CharSequence charSequence = string2;
                    Object object = new hN(c[2]);
                    int n2 = 2;
                    List list = ((hN)object).a(charSequence, n2);
                    charSequence = (String)list.get(0);
                    object = (String)ll.a(list, 1);
                    if (ew.a(object, (Object)c[3])) {
                        object = c[4];
                    }
                    String string3 = stringArray.getAbsolutePath() + File.separator + ((String)charSequence).substring(bz.b(charSequence, '/', 0, false, 6, null) + 1);
                    ig_0.a(q_0.j, string3, (String)charSequence, null, null, 12, null);
                    File file2 = new File(string3);
                    String string4 = q_0.j.b(kd_0.a(file2));
                    if (object == null || ew.a((Object)string4, object)) continue;
                    file2.delete();
                    throw new iv(file2, (String)object, string4);
                }
                if (!file.exists()) {
                    logger2.info(c[5] + string + c[6]);
                    if (bz.a((CharSequence)eG2.k(), (CharSequence)c[7], false, 2, null) || bz.a((CharSequence)eG2.k(), (CharSequence)c[8], false, 2, null)) {
                        logger2.warning(c[9]);
                        logger2.warning(c[10]);
                        return;
                    }
                }
                ig_0.a(q_0.j, file.getAbsolutePath(), eG2.k(), string, null, 8, null);
            }
            q_02.a(new fv_0(q_02.a, (File)stringArray, file));
        }
        catch (Exception exception) {
            this.b.a(exception);
        }
    }

    private static final void a() {
        c = new String[]{hl.a("\u50c3\u50e1\u50eb\u50c8\u50ed\u50f0\u50e1\u50b6\u50a9\u50c7\u50eb\u50f1\u50ea\u50f0\u50f6\u50fd\u50aa\u50e9\u50e9\u50e0\u50e6", -1310175100), hl.a("\u2cfc\u2cd7\u2ccf\u2cd6\u2cd4\u2cd7\u2cd9\u2cdc\u2cd1\u2cd6\u2cdf\u2c98\u2cff\u2cdd\u2cd7\u2cf1\u2ce8\u2c98\u2cf9\u2ce8\u2cf1\u2c96\u2c96\u2c96", -2099237704), hl.a("\u974c\u975e\u9749\u9757\u975e\u9759\u9759\u975f\u975f", -183396490), hl.a("\u6612\u6642\u6610\u6640\u6647\u6647\u6617\u6614\u6612\u6643\u6642\u6610\u6641\u6644\u6643\u6615\u6640\u6641\u6617\u6612\u6613\u6647\u664f\u664e\u6645\u6613\u6643\u6640\u6645\u6641\u6647\u6642\u6646\u6610\u6617\u6615\u6647\u6643\u6647\u6612\u6614\u6614\u6614\u6613\u6644\u6644\u6645\u6615\u6613\u664e\u664f\u6642\u6614\u6641\u6647\u6646\u6646\u6612\u6644\u6617\u6646\u664f\u6646\u6615", -271489418), hl.a("\u8b19\u8b10\u8b11\u8b12\u8b14\u8b44\u8b16\u8b12\u8b19\u8b47\u8b42\u8b12\u8b18\u8b13\u8b43\u8b42\u8b47\u8b43\u8b11\u8b11\u8b43\u8b44\u8b14\u8b45\u8b12\u8b18\u8b47\u8b14\u8b11\u8b47\u8b45\u8b44\u8b14\u8b17\u8b17\u8b18\u8b13\u8b43\u8b40\u8b12\u8b11\u8b14\u8b43\u8b13\u8b10\u8b12\u8b12\u8b19\u8b15\u8b10\u8b13\u8b45\u8b40\u8b18\u8b42\u8b11\u8b47\u8b42\u8b18\u8b19\u8b44\u8b12\u8b47\u8b43", 1858374433), hl.a("\u9a5e\u9a75\u9a6d\u9a74\u9a76\u9a75\u9a7b\u9a7e\u9a73\u9a74\u9a7d\u9a3a\u9a5d\u9a7f\u9a75\u9a53\u9a4a\u9a3a\u9a7e\u9a7b\u9a6e\u9a7b\u9a78\u9a7b\u9a69\u9a7f\u9a3a\u9a32", -519071206), hl.a("\udf0f\udf08\udf08\udf08", -1210130650), hl.a("\u4e5b\u4e4d\u4e57\u4e50\u4e5d\u4e4e\u4e4b\u4e41\u4e47\u4e4c\u4e51\u4e47\u4e5d\u4e49\u4e47\u4e5b", -2119217662), hl.a("\u8223\u826b\u8269\u8263\u8260\u8265\u8278\u8269\u8222\u8261\u826d\u8274\u8261\u8265\u8262\u8268\u8222", -1675132404), hl.a("\u4dd3\u4df1\u4dfb\u4ddd\u4dc4\u4db4\u4df0\u4dfb\u4de3\u4dfa\u4df8\u4dfb\u4df5\u4df0\u4db4\u4dc1\u4dc6\u4dd8\u4db4\u4dfc\u4df5\u4de7\u4db4\u4dfa\u4dfb\u4de0\u4db4\u4ded\u4df1\u4de0\u4db4\u4df6\u4df1\u4df1\u4dfa\u4db4\u4df7\u4dfb\u4dfa\u4df2\u4dfd\u4df3\u4de1\u4de6\u4df1\u4df0\u4dba", -353153644), hl.a("\u376f\u3773\u3773\u3777\u3774\u373d\u3728\u3728\u3760\u376e\u3773\u376b\u3766\u3765\u3729\u3764\u3768\u376a\u3728\u3775\u3772\u3766\u3769\u377e\u3728\u374b\u376e\u3773\u3762\u3745\u3766\u3769\u3774\u3728\u372a\u3728\u3770\u376e\u376c\u376e\u3774\u3728\u3740\u3762\u3768\u374e\u3757\u3724\u3760\u3762\u3768\u376e\u3777\u372a\u3763\u3768\u3770\u3769\u376b\u3768\u3766\u3763\u372a\u376e\u3774\u3774\u3772\u3762", -1296681209)};
    }

    static {
        cz_0.a();
    }
}

