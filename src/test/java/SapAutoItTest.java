import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SapAutoItTest {
    private static final String PASSED_PARAMETER = System.getProperty("test.number");
    private static final String FILE_PATH = System.getProperty("file.path");

    @Test
    public void testInputKeyInSapLogonFromFile() throws IOException {
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader(FILE_PATH);
            br = new BufferedReader(fr);
            String sCurrentLine;
            br = new BufferedReader(new FileReader(FILE_PATH));
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {

                ex.printStackTrace();
            }
        }

        System.out.println("PASSED_PARAMETER: " + PASSED_PARAMETER);
        Assert.assertEquals((int) Integer.valueOf(PASSED_PARAMETER), 2);
    }
}