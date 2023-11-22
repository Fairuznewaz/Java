package WeatherApp;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWriteUtility {

    public static void writeStringAsJsonFile(String jsonContent, String filePath) {
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonContent);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
