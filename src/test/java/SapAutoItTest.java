import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class SapAutoItTest {
    private static final String PASSED_PARAMETER = System.getProperty("test.number");
    private static final String FILE_PATH = System.getProperty("file.path") + "file.txt";

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

        System.err.println("PASSED_PARAMETER: " + PASSED_PARAMETER);

        try (Stream<String> stream = Files.lines(Paths.get("files/test/file.txt"))) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertEquals((int) Integer.valueOf(PASSED_PARAMETER), 2);
    }
}