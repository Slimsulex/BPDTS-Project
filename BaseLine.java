package testGetfunctionality;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class BaseLine {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeTest
    public void BrowserSetup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://bpdts-test-app-v2.herokuapp.com/");
        homePage = new HomePage(driver);



    }
    @AfterTest
    public void tearDown(){
        //driver.quit();
    }
}

