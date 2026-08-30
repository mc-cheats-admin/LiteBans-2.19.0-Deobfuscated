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

public final class cz_0
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
            String string = "GeoLite2-Country.mmdb";
            String[] stringArray2 = stringArray;
            int n = 0;
            File file = new File((File)stringArray2, string);
            if (fileArray == null || fileArray.length < eG2.g().length + 1 || !file.exists()) {
                logger2.info("Downloading GeoIP API.. + ");
                for (String string2 : eG2.g()) {
                    CharSequence charSequence = string2;
                    Object object = new hN(":(?!(//))");
                    int n2 = 2;
                    List list = ((hN)object).a(charSequence, n2);
                    charSequence = (String)list.get(0);
                    object = (String)ll.a(list, 1);
                    if (ew.a(object, (Object)"d4f611abd54f725c67ade1983e5637140fac151dbbbe223ce894b7100d2a090c")) {
                        object = "81035e738fc392bcfb00be5d39f50fde56692ba305b21338412da9c0fc98e3fb";
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
                    logger2.info("Downloading GeoIP database (" + string + ").. + ");
                    if (bz.a((CharSequence)eG2.k(), (CharSequence)"YOUR_LICENSE_KEY", false, 2, null) || bz.a((CharSequence)eG2.k(), (CharSequence)"/geolite + ", false, 2, null)) {
                        logger2.warning("GeoIP download URL has not yet been ");
                        logger2.warning("https://gitlab.com/ruany/LiteBans/-/wikis/GeoIP#geoip-download-issue");
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
        c = new String[]{"GeoLite2-Country.mmdb", "Downloading GeoIP API.. + ", ":(?!(//))", "d4f611abd54f725c67ade1983e5637140fac151dbbbe223ce894b7100d2a090c", "81035e738fc392bcfb00be5d39f50fde56692ba305b21338412da9c0fc98e3fb", "Downloading GeoIP database (", ").. + ", "YOUR_LICENSE_KEY", "/geolite + ", "GeoIP download URL has not yet been ", "https://gitlab.com/ruany/LiteBans/-/wikis/GeoIP#geoip-download-issue"};
    }

    static {
        cz_0.a();
    }
}

