package testGetfunctionality;

import org.testng.annotations.Test;
import pages.getApiPage;

import static org.testng.Assert.assertTrue;

public class testGetUserId extends BaseLine{

    @Test
    public void getUserId(){
       getApiPage getId = homePage.clickExpendNameSpace();
       getId.clickGetUserId();
       getId.clickTryOutbutton();
       getId.inputUserId("23");
       getId.clickExecuteButton();
        assertTrue(getId.responseCode().contains("23"));
    }
}
