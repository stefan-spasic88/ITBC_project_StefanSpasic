package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ButtonsTest extends BaseTest {

    @BeforeMethod
    public void beforeEachTest(){
        getIndexPage().open();
        getIndexPage().clickElementsCard();
        getButtonsPage().clickButtonsBtn();
    }

    @Test
    public void doubleClickOnButton() {
        getActions().doubleClick(getButtonsPage().getDoubleClickMeBtn()).perform();
        String notification = "You have done a double click";
        Assert.assertEquals(getButtonsPage().getDoubleClickMeNotification().getText(), notification);
    }

    @Test
    public void rightClickOnMe() {
        getActions().contextClick(getButtonsPage().getRightClickMeBtn()).perform();//contextClick desni klik
        String notification = "You have done a right click";
        Assert.assertEquals(getButtonsPage().getRightClickMeNotification().getText(), notification);
    }

    @Test
    public void clickMe()  {
        getActions().click(getButtonsPage().getClickMeBtn()).perform();
        String notification = "You have done a dynamic click";
        Assert.assertEquals(getButtonsPage().getClickMeNotification().getText(), notification);
    }
}
