import utils.Reader;

import java.io.IOException;

public class FileHandler {
    private static final String sourceDir = "src/resources/";

    public static void main(String[] args) {
        String fileName = sourceDir + "text.txt";
        try {
            Reader.Scan(fileName);
            Reader.Buffer(fileName);
            Reader.Stream(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
