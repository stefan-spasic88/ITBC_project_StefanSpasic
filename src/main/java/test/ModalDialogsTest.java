package test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModalDialogsTest extends BaseTest{

    @BeforeMethod
    public void beforeEachTest(){
        getIndexPage().open();
        getIndexPage().clickAlertsFrameWindowCard();
        getModalDialogsPage().clickModalDialogsBtn();
    }

    @Test
    public void testSmallModal(){
        getModalDialogsPage().clickSmallBtn();
        String smallModal = "Small Modal";
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(getModalDialogsPage().getSmallModal())).getText().contains(smallModal));
        getModalDialogsPage().clickSmallCloseBtn();
    }

    @Test
    public void testLargeModal(){
        getModalDialogsPage().clickLargeBtn();
        String largeModal = "Large Modal";
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(getModalDialogsPage().getLargeModal())).getText().contains(largeModal));
        getModalDialogsPage().clickLargeCloseBtn();
    }
}
