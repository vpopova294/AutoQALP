package PageObjectTests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class WriteLinesToFile {
    public static void main(String[] args) throws IOException {
        File file = new File("target/downloads/empty.txt");
        List<String> lines = Files.readAllLines(file.toPath());


        String filePath = "target/downloads/empty.txt";
        String text = "\ntext from Lera \nnew text is added";

        try {
            Files.write(Paths.get(filePath),text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
