package tests;

//import com.beust.jcommander.Parameter;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersNG {
    @Parameters({"first name","last name"})
    @Test
    public void showName(String firstname, String lastname) {
        System.out.println("Show initials " +  firstname + " " + lastname);
    }
}
