package litebans;

public static class d3
extends RuntimeException {
    private static final long a = 929872118275916520L;

    public d3(Throwable throwable) {
        super("Failed to initialize pool: " + throwable.getMessage(), throwable);
    }
}

