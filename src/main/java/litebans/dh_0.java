package litebans;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.dH
 */
public static final class dh_0
implements HostnameVerifier {
    @Override
    public boolean verify(@Nullable String string, @Nullable SSLSession sSLSession) {
        return true;
    }
}

