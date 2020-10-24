import org.junit.Test;

import java.io.IOException;

public class IoTest {

    @Test
    public void test1() throws IOException {
        Io io = new Io();
        io.readFile();
    }
}
