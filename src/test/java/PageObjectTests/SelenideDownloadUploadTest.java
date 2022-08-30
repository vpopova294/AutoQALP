package PageObjectTests;

import PageObject.pages.SelenideDownloadPage;
import PageObject.pages.SelenideUploadPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class SelenideDownloadUploadTest {
    @Test()
    public void selenideTest() throws IOException {

        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.holdBrowserOpen = true;

        open("/download");


        SelenideDownloadPage downloadPage = new SelenideDownloadPage();
        File downloadedFile = downloadPage.downloadFile();


            File file = new File(String.valueOf(downloadedFile));
            List<String> lines = Files.readAllLines(file.toPath());


            //String filePath = "build/downloads/73f53fad-db86-45cf-bc1e-d84e9c89f4b8/empty.txt";
            String text = "\nselenide text from Lera \nnew text is added";

            try {
                Files.write(Paths.get(String.valueOf(downloadedFile)),text.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println(e);
            }


        open("/upload");
        SelenideUploadPage uploadPage = new SelenideUploadPage();
        uploadPage.chooseFile(downloadedFile)
                .clickButton();


    }
}
