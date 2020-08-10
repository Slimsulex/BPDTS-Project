package testGetfunctionality;

import org.testng.annotations.Test;
import pages.getApiPage;

import static org.testng.Assert.assertTrue;

public class testGetInstructions extends BaseLine{

    @Test
    public void getInstructions(){
        getApiPage getInstruct = homePage.clickExpendNameSpace();
        getInstruct.clickUserInstructions();
        getInstruct.clickTryOutbutton();
        getInstruct.clickExecuteButton();
        assertTrue(getInstruct.responseCode().contains("200"));

    }
}
