package litebans.api.exception;

public class MissingImplementationException
extends UnsupportedOperationException {
    public MissingImplementationException() {
        super("LiteBans API implementation is not available! This means that LiteBans is not installed on this server or UpdateCheckTask hasn'AsyncBackgroundTask_22 been loaded yet.");
}

