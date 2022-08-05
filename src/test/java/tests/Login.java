package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {


    @Test(dataProvider = "testProvider", groups = "login")
    public void showUserData(String username, String password, String role) {
      System.out.println("display user info " + username + " " + role);
//      if (role.equals("moderator")) {
//          throw new RuntimeException("you're welcome");
//      }
    }
    @DataProvider(name = "testProvider")
    public Object[][] testProvider(){
        Object[][] result = {
                {"John", "pass1", "user"},
                {"Mary", "pass2", "moderator"},
                {"Alina", "pass3", "guest"},
        };
                return result;
    }


}
