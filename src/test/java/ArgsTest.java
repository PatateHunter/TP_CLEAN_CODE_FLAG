import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArgsTest {

    @Test
    void getBoolean() {

        String[] args = new String[1];
        args[0] = "-d";

        Args arg = new Args("d,p#,h*", args);

        boolean result = true;

        Assertions.assertEquals(result,arg.getBoolean("d"));
    }

    @Test
    void getNumber() {

        String[] args = new String[1];
        args[0] = "-p 134";

        Args arg = new Args("d,p#,h*", args);

        Integer result = 134;

        Assertions.assertEquals(result,arg.getNumber("p"));
    }

    @Test
    void getString() {

        String[] args = new String[1];
        args[0] = "-h Hello";

        Args arg = new Args("d,p#,h*", args);

        String result = "Hello";

        Assertions.assertEquals(result,arg.getString("h"));
    }
}