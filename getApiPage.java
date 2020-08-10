package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class getApiPage {
    private WebDriver driver;
    public getApiPage(WebDriver driver){
        this.driver = driver;
    }
    private By getUsers = By.id("operations-default-get_users4");
    private By getUserId = By.id("operations-default-get_users3");
    private By userInstructions = By.id("operations-default-get_users2");
    private By getUserCity = By.id("operations-default-get_users1");
    private By tryOutButton =By.className("try-out");
    private By executeButton = By.className("execute-wrapper");
    private By usertextfield = By.cssSelector("input[type='text']");
    private By userIDfield = By.cssSelector("input[type='text']");
    private By getResponse = By.className("responses-inner");

    public void clickGetUser(){
        driver.findElement(getUsers).click();
    }
    public void clickGetUserId(){
        driver.findElement(getUserId).click();
    }
    public void clickUserInstructions(){
        driver.findElement(userInstructions).click();
    }
    public void clickGetUserCity(){
        driver.findElement(getUserCity).click();
    }
    public void clickTryOutbutton(){
        driver.findElement(tryOutButton).click();
    }
    public void clickExecuteButton(){
        driver.findElement(executeButton).click();
    }
    public void inputCityText(String city){
         driver.findElement(usertextfield).sendKeys(city);
    }
    public void inputUserId(String inputId){
        int num = Integer.parseInt(inputId);
        driver.findElement(userIDfield).sendKeys(inputId);
    }
    public String responseUrl(){
        return driver.findElement(getResponse).getText();
    }
    public  String responseCode(){
        return driver.findElement(getResponse).getText();
    }
}
