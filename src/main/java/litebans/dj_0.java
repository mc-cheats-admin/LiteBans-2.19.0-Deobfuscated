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

/*
 * Renamed from litebans.dj
 */
public static class dj_0
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
            jsonObject.addProperty(a[0], ka_02.q());
        }
        if (ka_02.k() != null) {
            jsonObject.addProperty(a[1], ka_02.k());
        }
        if (ka_02.e() != null) {
            jsonObject.addProperty(a[2], ka_02.e());
        }
        if (ka_02.i() != null) {
            jsonObject.addProperty(a[3], ka_02.i());
        }
        if (ka_02.n() != null) {
            jsonObject.addProperty(a[4], ka_02.n());
        }
        if (ka_02.h() && ka_02.d().c() != null) {
            jsonObject.addProperty(a[5], ka_02.d().a());
        }
        if (ka_02.m()) {
            jsonObject.addProperty(a[6], (Number)ka_02.c().getRGB());
        }
        if (ka_02.r()) {
            jsonObject.addProperty(a[7], ka_02.g());
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
        a = new String[]{hl.a("\ub279\ub274\ub277\ub27f", 759804443), hl.a("\u4e2e\u4e33\u4e26\u4e2b\u4e2e\u4e24", 1674137159), hl.a("\ud671\ud66a\ud660\ud661\ud676\ud668\ud66d\ud66a\ud661\ud660", 841143812), hl.a("\ub6b9\ub6be\ub6b8\ub6a3\ub6a1\ub6af\ub6be\ub6a2\ub6b8\ub6a5\ub6bf\ub6ad\ub6a2", -404965686), hl.a("\u6f09\u6f04\u6f00\u6f13\u6f15\u6f05\u6f07\u6f12\u6f03\u6f02", 682323814), hl.a("\u907f\u9073\u9070\u9073\u906e", -1134981092), hl.a("\u5165\u517e\u5177\u5172\u5179\u5161\u5149\u5175\u5179\u517a\u5179\u5164", 679563542), hl.a("\u4f1a\u4f13\u4f12\u4f08", -679129220), hl.a("\u4bd8\u4bd5\u4bd6\u4bde", -274773062), hl.a("\u8484\u8499\u848c\u8481\u8484\u848e", 1633518829), hl.a("\u15e9\u15f2\u15f8\u15f9\u15ee\u15f0\u15f5\u15f2\u15f9\u15f8", -1085729380), hl.a("\u5210\u5217\u5211\u520a\u5208\u5206\u5217\u520b\u5211\u520c\u5216\u5204\u520b", 860050019), hl.a("\u11d8\u11d5\u11d1\u11c2\u11c4\u11d4\u11d6\u11c3\u11d2\u11d3", -1003548233), hl.a("\udfb6\udfba\udfb9\udfba\udfa7", 2009325525), hl.a("\uedcf\uedd4\ueddd\uedd8\uedd3\uedcb\uede3\ueddf\uedd3\uedd0\uedd3\uedce", 1432284604), hl.a("\uaf01\uaf08\uaf09\uaf13", 1588965223)};
    }

    static {
        dj_0.a();
    }
}

