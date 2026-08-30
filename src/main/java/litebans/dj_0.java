package litebans;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import litebans.hl;
import litebans.ka_0;

public class dj_0
implements JsonSerializer,
JsonDeserializer {
    private static /* synthetic */ String[] a;

    private static final boolean a(JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            Number number;
            JsonPrimitive jsonPrimitive = (JsonPrimitive)jsonElement;
            if (jsonPrimitive.isBoolean()) {
                return jsonPrimitive.getAsBoolean();
            }
            if (jsonPrimitive.isNumber() && (number = jsonPrimitive.getAsNumber()) instanceof Byte) {
                return number.byteValue() != 0;
            }
        }
        return false;
    }

    static void a(ka_0 ka_02, JsonObject jsonObject) {
        if (ka_02.q() != null) {
            jsonObject.addProperty("bold", ka_02.q());
        }
        if (ka_02.k() != null) {
            jsonObject.addProperty("italic", ka_02.k());
        }
        if (ka_02.e() != null) {
            jsonObject.addProperty("underlined", ka_02.e());
        }
        if (ka_02.i() != null) {
            jsonObject.addProperty("strikethrough", ka_02.i());
        }
        if (ka_02.n() != null) {
            jsonObject.addProperty("obfuscated", ka_02.n());
        }
        if (ka_02.h() && ka_02.d().c() != null) {
            jsonObject.addProperty("color", ka_02.d().a());
        }
        if (ka_02.m()) {
            jsonObject.addProperty("shadow_color", (Number)ka_02.c().getRGB());
        }
        if (ka_02.r()) {
            jsonObject.addProperty("font", ka_02.g());
        }
    }

    /*
     * Exception decompiling
     */
    public ka_0 a(JsonElement var1_1, Type var2_2, JsonDeserializationContext var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public JsonElement a(ka_0 ka_02, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        dj_0.a(ka_02, jsonObject);
        return jsonObject;
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((ka_0)object, type, jsonSerializationContext);
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }

    private static final void a() {
        a = new String[]{"bold", "italic", "underlined", "strikethrough", "obfuscated", "color", "shadow_color", "font", "bold", "italic", "underlined", "strikethrough", "obfuscated", "color", "shadow_color", "font"};
    }

    static {
        dj_0.a();
    }
}

