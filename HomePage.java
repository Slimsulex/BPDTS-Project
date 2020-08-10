package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By expandNameSpace = By.className("expand-operation");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

 public getApiPage clickExpendNameSpace(){
     driver.findElement(expandNameSpace).click();
     return new getApiPage(driver);
 }
}
