package at.jku.isse.ecco.webdev.test;

import at.jku.isse.ecco.webdev.HelloWorldApplication;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class WebDevTest {
    @Test(groups = {"integration", "webdev"})
    public void WebDev_Test()  {
        HelloWorldApplication.main(new String[]{});
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("BEFORE");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        System.out.println("AFTER");
    }
}
