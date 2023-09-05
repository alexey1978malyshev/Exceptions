package hwSem3.task2;

import java.io.IOException;

public class WriteException extends IOException {
    public WriteException(String message, Exception e) {
        super(message, e);
    }
}
