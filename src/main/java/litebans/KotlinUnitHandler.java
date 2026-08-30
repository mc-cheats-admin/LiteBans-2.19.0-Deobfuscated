package litebans;

public final class KotlinUnitHandler {
    public static final KotlinUnitHandler BaseCoreGenericHandler;
    private KotlinUnitHandler() {
    }

    public String toString() {
        return "kotlin.Unit";
    }

    static {
        KotlinUnitHandler.BaseCoreGenericHandler();
        BaseCoreGenericHandler = new KotlinUnitHandler();
}

