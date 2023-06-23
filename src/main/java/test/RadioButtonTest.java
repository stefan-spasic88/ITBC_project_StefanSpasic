package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest{

    @BeforeMethod
    public void beforeEachTest(){
        getIndexPage().open();
        getIndexPage().clickElementsCard();
        getRadioButtonPage().clickRadioButton();
    }

    @Test
    public void yes(){
        getRadioButtonPage().clickYesBtn();
        Assert.assertTrue(getRadioButtonPage().getResultText().getText().contains("Yes"));
    }

    @Test
    public void impressive(){
        getRadioButtonPage().clickImpressiveBtn();
        Assert.assertTrue(getRadioButtonPage().getResultText().getText().contains("Impressive"));
    }

    @Test
    public void no(){
        getRadioButtonPage().clickNoBtn();
        Assert.assertFalse(getRadioButtonPage().getNoBtn().isSelected());
    }
}
