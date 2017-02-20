import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class SapAutoItTest {
    private static final String PASSED_PARAMETER = System.getProperty("test.number");

    @Test
    public void testInputKeyInSapLogonFromFile() throws IOException {
        Assert.assertEquals((int) Integer.valueOf(PASSED_PARAMETER), 2);
    }
}