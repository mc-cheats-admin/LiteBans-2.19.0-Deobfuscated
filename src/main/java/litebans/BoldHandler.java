package litebans;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
public class BoldHandler
implements JsonSerializer,
JsonDeserializer {
    private static final boolean BaseCoreGenericHandler(JsonElement jsonElement) {
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

    static void BaseCoreGenericHandler(LiteBansModule_368 ka_02, JsonObject jsonObject) {
        if (ka_02.q() != null) {
            jsonObject.addProperty("bold", ka_02.q());
        }
        if (ka_02.Utf8Handler_2() != null) {
            jsonObject.addProperty("italic", ka_02.Utf8Handler_2());
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
        if (ka_02.LiteBansModule_240() && ka_02.AsyncBackgroundTask_5().c() != null) {
            jsonObject.addProperty("color", ka_02.AsyncBackgroundTask_5().BaseCoreGenericHandler());
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
    public LiteBansModule_368 BaseCoreGenericHandler(JsonElement v1, Type v2, JsonDeserializationContext v3) {
        /*
         * This method has failed to decompile.  When submitting BaseCoreGenericHandler bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     LiteBansModule_21 org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     LiteBansModule_21 org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     LiteBansModule_21 org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     LiteBansModule_21 org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public JsonElement BaseCoreGenericHandler(LiteBansModule_368 ka_02, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        BoldHandler.BaseCoreGenericHandler(ka_02, jsonObject);
        return jsonObject;
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.plugin((LiteBansModule_368)object, type, jsonSerializationContext);
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.plugin(jsonElement, type, jsonDeserializationContext);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"bold", "italic", "underlined", "strikethrough", "obfuscated", "color", "shadow_color", "font", "bold", "italic", "underlined", "strikethrough", "obfuscated", "color", "shadow_color", "font"};
    }

    }

