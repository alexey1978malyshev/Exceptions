package hwSem3.task2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaderException extends IOException {
    public ReaderException(String s, Exception e) {
        super(s,e);
    }
}
