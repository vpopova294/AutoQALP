package tests;

import org.testng.annotations.Test;

public class DependingTest {
    @Test(groups = {"dependingtest"} , dependsOnGroups = {"login"})
    public void showDependingGroup() {
        System.out.println("this group depends on Login");
    }



}
