package test;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TextBoxTest extends BaseTest{
    @Test
    public void inputDataToTextBox() {
        getIndexPage().open();
        getIndexPage().clickElementsCard();
        getTextBoxPage().clickTextBoxBtn();
        getTextBoxPage().enterDataToFullNameField("Mitar Mitrovic");
        getTextBoxPage().enterDataToEmailField("x@x.com");
        getTextBoxPage().enterDataToCurrentAddressField("1 Central Park West, New York, NY 10023");
        getTextBoxPage().enterDataToPermanentAddressField("1 Central Park West, New York, NY 10023");
        getTextBoxPage().clickSubmitBtn();
        String name = "Mitar Mitrovic";
        String email = "x@x.com";
        Assert.assertTrue(getTextBoxPage().getOutputFullName().getText().contains(name));
        Assert.assertTrue(getTextBoxPage().getOutputEmail().getText().contains(email));
    }
}
