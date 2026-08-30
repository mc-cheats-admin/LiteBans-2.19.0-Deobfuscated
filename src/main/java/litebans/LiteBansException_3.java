package litebans;

public class LiteBansException_3
extends RuntimeException {
    private static final long BaseCoreGenericHandler = 929872118275916520L;

    public LiteBansException_3(Throwable throwable) {
        super("Failed to initialize pool: " + throwable.getMessage(), throwable);
    }
}

