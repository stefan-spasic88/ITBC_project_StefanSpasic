package test;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;


public class LinkTest extends BaseTest{

    @BeforeMethod
    public void beforeEachTest(){
        getIndexPage().open();
        getIndexPage().clickElementsCard();
        getLinkPage().clickLinksBtn();
    }

    @Test
    public void testHomeLink() {
        getLinkPage().clickHomeLink();
        List<String> browserTabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(browserTabs.get(1));
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/");
        getDriver().close();
        getDriver().switchTo().window(browserTabs.get(0));

    }
    @Test
    public void testHomeDynamicLink(){
        getLinkPage().clickHomeDynamicLink();
        List<String> browserTabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(browserTabs.get(1));
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/");
        getDriver().close();
        getDriver().switchTo().window(browserTabs.get(0));
    }

    @Test
    public void testCreatedLink(){
        getLinkPage().clickCreatedLink();
        Assert.assertTrue(getLinkPage().getResponse().getText().contains("Created"));
    }

    @Test
    public void testNoContentLink(){
        getLinkPage().clickNoContentLink();
        Assert.assertTrue(getLinkPage().getResponse().getText().contains("No Content"));
    }

    @Test
    public void testMovedLink(){
        getLinkPage().clickMovedLink();
        Assert.assertTrue(getLinkPage().getResponse().getText().contains("Moved Permanently"));
    }

    @Test
    public void testBadRequestLink(){
        getLinkPage().clickBadRequestLink();
        Assert.assertTrue(getLinkPage().getResponse().getText().contains("Bad Request"));
    }

    @Test
    public void testUnauthorizedLink(){
        getLinkPage().clickUnauthorizedLink();
        Assert.assertTrue(getLinkPage().getResponse().getText().contains("Unauthorized"));
    }

    @Test
    public void testForbiddenLink(){
        getLinkPage().clickForbiddenLink();
        Assert.assertTrue(getLinkPage().getResponse().getText().contains("Forbidden"));
    }

    @Test
    public void testNotFoundLink(){
        getLinkPage().clickNotFoundLink();
        Assert.assertTrue(getLinkPage().getResponse().getText().contains("Not Found"));
    }
}
