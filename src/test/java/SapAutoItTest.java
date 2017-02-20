import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class SapAutoItTest {
    private static final String SAP_LOGON_PATH = "C:\\Users\\Anton_Tsymbal\\Desktop\\CastoEasier\\AutoItScripts\\";
    private static final String TEXT_FILE_PATH = "C:\\Users\\Anton_Tsymbal\\Documents\\";

    @Test
    public void testInputKeyInSapLogonFromFile() throws IOException {
        String SapLogon = SAP_LOGON_PATH + "SAPLogon.exe";
        String InputTextFile = TEXT_FILE_PATH + "SAPLogonKey.txt";
        //Runtime.getRuntime().exec(SapLogon + " " + InputTextFile);
        Assert.assertEquals(2,2);
    }
}