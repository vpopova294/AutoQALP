package PageObjectTests;

import PageObject.pages.HoversPage;
import org.testng.annotations.Test;

public class HoversTest extends BaseTest {

    @Test
    public void getUserName() {


        HoversPage hoversPage = openApp().goToHoversPage();
        hoversPage.hoverImagesAndGetUsernames();

    }
}
