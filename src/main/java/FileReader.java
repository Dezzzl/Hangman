import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class FileReader {
    public String getWordFromFile() throws IOException {
        List<String> wordList = Files.readAllLines(Paths.get("src/main/resources/dictionary.txt"));
        return wordList.get(new Random().nextInt(wordList.size()));
    }
}
