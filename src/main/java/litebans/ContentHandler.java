package litebans;

import java.io.Closeable;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ContentHandler {
    public static final DiscordEmbedBuilder GnuSparseMapHandler;
    private final String LiteBansModule_31;
    private String AsyncBackgroundTask_5;
    private String g;
    private String e;
    private boolean LiteBansModule_195;
    private List i;
    private final NullHandler_3 c;
    private static final Character[] LiteBansModule_241;
        public ContentHandler(@NotNull String string) {
        this.LiteBansModule_31 = string;
        this.i = CollectionUtilities.e();
        this.c = new NullHandler_3();
    }

    public final String AsyncBackgroundTask_5() {
        return this.LiteBansModule_31;
    }

    public final void BaseCoreGenericHandler(@NotNull List list) {
        this.i = list;
    }

    public final NullHandler_3 LiteBansModule_31() {
        return this.c;
    }

    public final String BaseCoreGenericHandler(@Nullable String string, boolean flag) {
        String string2 = string;
        if (string2 == null) {
            return null;
        }
        String string3 = string2;
        if (!flag) {
            Character[] characterArray = LiteBansModule_241;
            int n = characterArray.length;
            for (int i = 0; i < n; ++i) {
                char c = characterArray[i].charValue();
                if (!StringUtilities.c((CharSequence)string3, c, false, 2, null)) continue;
                string3 = StringUtilities.BaseCoreGenericHandler(string3, String.valueOf(c), "" + '\\' + c, false, 4, null);
            }
        }
        return string3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public final void c() {
        block13: {
            boolean flag;
            ((Map)this.c).put("content", this.plugin(this.AsyncBackgroundTask_5, false));
            ((Map)this.c).put("username", this.g);
            ((Map)this.c).put("avatar_url", this.e);
            ((Map)this.c).put("tts", this.LiteBansModule_195);
            Object helperObj = this.c;
            Object tempObj = "embeds";
            Object object6 = this.i;
            Iterable iterable = object6;
            Object object7 = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)object6, 10));
            for (Object t2 : iterable) {
                resultObj = (LiteBansModule_212)t2;
                Collection collection = object7;
                flag = false;
                collection.add(this.plugin((LiteBansModule_212)resultObj));
            }
            object6 = (List)object7;
            flag2 = false;
            try {
                contextObj = new LiteBansModule_315().BaseCoreGenericHandler(NullHandler_7.BaseCoreGenericHandler((List)object6));
            }
            catch (Throwable throwable) {
                System.err.println(NullHandler_7.BaseCoreGenericHandler((List)object6));
                throw throwable;
            }
            object6 = contextObj;
            helperObj.put(tempObj, object6);
            helperObj = this;
            tempObj = this.c;
            targetObj = helperObj;
            URLConnection uRLConnection = URI.create(((ContentHandler)targetObj).LiteBansModule_31).toURL().openConnection();
            ObjectUtilities.LiteBansModule_31(uRLConnection, "");
            Object object8 = object7 = (HttpsURLConnection)uRLConnection;
            ((URLConnection)object8).addRequestProperty("Content-Type", "application/json");
            ((URLConnection)object8).addRequestProperty("User-Agent", "Java (LiteBans " + LiteBansModule_337.c() + ')');
            ((URLConnection)object8).setConnectTimeout(80000);
            ((URLConnection)object8).setReadTimeout(80000);
            ((URLConnection)object8).setDoOutput(true);
            ((HttpURLConnection)object8).setRequestMethod("POST");
            targetObj = (HttpURLConnection)object7;
            flag5 = false;
            object7 = ((URLConnection)targetObj).getOutputStream();
            object8 = null;
            OutputStream outputStream = (OutputStream)object7;
            ObjectUtilities.BaseCoreGenericHandler(outputStream);
            resultObj = outputStream;
            flag = false;
            Object object9 = resultObj;
            Object object10 = tempObj;
            ((OutputStream)object9).write(((NullHandler_3)object10).toString().getBytes(LiteBansModule_345.LiteBansModule_31));
            KotlinUnitHandler iv_02 = KotlinUnitHandler.BaseCoreGenericHandler;
            resultObj = iv_02;
            break block13;
            {
                catch (Throwable throwable) {
                    object8 = throwable;
                    throw throwable;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler((Closeable)object7, (Throwable)object8);
                }
                {
                    catch (Throwable throwable) {
                        try {
                            ((URLConnection)targetObj).getInputStream().close();
                            ((HttpURLConnection)targetObj).disconnect();
                        }
                        catch (Throwable throwable2) {
                            throw new RuntimeException(throwable2);
                        }
                        throw throwable;
                    }
                }
            }
        }
        ((URLConnection)targetObj).getInputStream().close();
        ((HttpURLConnection)targetObj).disconnect();
    }

    private final NullHandler_3 BaseCoreGenericHandler(LiteBansModule_212 g92) {
        Map map;
        NullHandler_3 gr_02 = new NullHandler_3();
        LiteBansModule_212 g93 = g92;
        ((Map)gr_02).put("title", this.plugin(g93.LiteBansModule_195(), true));
        ((Map)gr_02).put("description", this.plugin(g93.LiteBansModule_241(), true));
        Object contextObj = gr_02;
        Object resultObj = "url";
        String string = g93.LiteBansModule_31();
        if (string == null) {
            string = "";
        }
        String string2 = string;
        contextObj.put(resultObj, string2);
        contextObj = g93.g();
        resultObj = g93.AsyncBackgroundTask_5();
        string2 = g93.e();
        LiteBansModule_142 dw2 = g93.c();
        List list = g93.i();
        int n = g93.BaseCoreGenericHandler();
        if (contextObj != null) {
            map = new NullHandler_3();
            ((Map)map).put("text", ((LiteBansModule_25)contextObj).LiteBansModule_31());
            ((Map)map).put("icon_url", ((LiteBansModule_25)contextObj).BaseCoreGenericHandler());
            ((Map)gr_02).put("footer", map);
        }
        if (resultObj != null) {
            map = new NullHandler_3();
            ((Map)map).put("url", ((LiteBansModule_6)resultObj).BaseCoreGenericHandler());
            ((Map)gr_02).put("image", map);
        }
        if (dw2 != null) {
            map = new NullHandler_3();
            ((Map)map).put("name", dw2.c());
            ((Map)map).put("url", dw2.LiteBansModule_31());
            ((Map)map).put("icon_url", dw2.BaseCoreGenericHandler());
            ((Map)gr_02).put("author", map);
        }
        if (string2 != null) {
            map = new NullHandler_3();
            ((Map)map).put("url", string2);
            ((Map)gr_02).put("thumbnail", map);
        }
        Object helperObj = n;
        ((Map)gr_02).put("color", helperObj);
        map = gr_02;
        String string3 = "fields";
        helperObj = list;
        Object tempObj = helperObj;
        Collection collection = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)helperObj, 10));
        Iterator iterator = tempObj.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            LiteBansModule_21 at2 = (LiteBansModule_21)t2;
            Collection collection2 = collection;
            NullHandler_3 gr_03 = new NullHandler_3();
            LiteBansModule_21 at3 = at2;
            ((Map)gr_03).put("name", at3.c());
            ((Map)gr_03).put("value", at3.LiteBansModule_31());
            ((Map)gr_03).put("inline", at3.BaseCoreGenericHandler());
            collection2.add(gr_03);
        }
        helperObj = (List)collection;
        flag2 = false;
        try {
            targetObj = new LiteBansModule_315().BaseCoreGenericHandler(NullHandler_7.BaseCoreGenericHandler((List)helperObj));
        }
        catch (Throwable throwable) {
            System.err.println(NullHandler_7.BaseCoreGenericHandler((List)helperObj));
            throw throwable;
        }
        helperObj = targetObj;
        map.put(string3, helperObj);
        return gr_02;
    }

    static {
        ContentHandler.BaseCoreGenericHandler();
        GnuSparseMapHandler = new DiscordEmbedBuilder(null);
        Character[] characterArray = new Character[]{Character.valueOf('_'), Character.valueOf('*'), Character.valueOf('`'), Character.valueOf('~'), Character.valueOf('#'), Character.valueOf('-')};
        LiteBansModule_241 = characterArray;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"content", "username", "avatar_url", "tts", "embeds", "", "Content-Type", "application/json", "User-Agent", "Java (LiteBans ", "POST", "", "Content-Type", "application/json", "User-Agent", "Java (LiteBans ", "POST", "", "Content-Type", "application/json", "User-Agent", "Java (LiteBans ", "POST", "title", "description", "url", "", "text", "icon_url", "footer", "url", "image", "name", "url", "icon_url", "author", "url", "thumbnail", "color", "fields", "name", "value", "inline"};
    }
}

