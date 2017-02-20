import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class SapAutoItTest {
    private static final String PASSED_PARAMETER = System.getProperty("test.number");

    @Test
    public void testInputKeyInSapLogonFromFile() throws IOException {
        System.out.println("PASSED_PARAMETER: " + PASSED_PARAMETER);
        Assert.assertEquals((int) Integer.valueOf(PASSED_PARAMETER), 2);
    }
}