package testGetfunctionality;

import org.testng.annotations.Test;
import pages.getApiPage;

import static org.testng.Assert.assertTrue;

public class testGetUserCity extends BaseLine{
    @Test
    public void getUserCity(){
        getApiPage getCity = homePage.clickExpendNameSpace();
        getCity.clickGetUserCity();
        getCity.clickTryOutbutton();
        getCity.inputCityText("London");
        getCity.clickExecuteButton();
        assertTrue(getCity.responseUrl().contains("http://bpdts-test-app-v2.herokuapp.com/city/London/users"));

    }
}
