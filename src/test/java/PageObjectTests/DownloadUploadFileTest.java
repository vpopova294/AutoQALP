package PageObjectTests;

import PageObject.pages.DownloadPage;
import PageObject.pages.UploadPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class DownloadUploadFileTest extends BaseTest {
    @Test
    public void downloadTest() throws IOException {
        DownloadPage downloadPage = openApp().goToDownloadPage();
        downloadPage.downloadFile();


        UploadPage uploadPage = openApp().goToUploadPage();
        uploadPage.clickUploadButton();

    }

}
