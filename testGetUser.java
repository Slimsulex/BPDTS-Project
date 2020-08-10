package testGetfunctionality;

import org.testng.annotations.Test;
import pages.getApiPage;
import static org.testng.Assert.assertTrue;

public class testGetUser extends BaseLine{
    @Test
    public void testGetUserApi(){
        getApiPage getUser = homePage.clickExpendNameSpace();
        getUser.clickGetUser();
        getUser.clickTryOutbutton();
        getUser.clickExecuteButton();
        assertTrue(getUser.responseCode().contains("200"));

    }

}
