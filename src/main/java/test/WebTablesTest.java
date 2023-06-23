package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest{

    @Test
    public void inputDataToWebTables(){
        getIndexPage().open();
        getIndexPage().clickElementsCard();
        getWebTablesPage().clickWebTablesBtn();
        getWebTablesPage().clickAddBtn();
        getWebTablesPage().enterDataToFirstName("Mitar");
        getWebTablesPage().enterDataToLastName("Mitrovic");
        getWebTablesPage().enterDataToEmailAddress("x@x.com");
        getWebTablesPage().enterDataToAge("30");
        getWebTablesPage().enterDataToSalary("5000");
        getWebTablesPage().enterDataToDepartment("Research");
        getWebTablesPage().clickSubmitBtn();
        String name = "Mitar";
        Assert.assertTrue(getWebTablesPage().getCheckName().getText().contains(name));
    }
}
