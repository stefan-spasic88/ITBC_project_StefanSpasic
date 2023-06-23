package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage{
    private WebElement textBoxBtn;
    private WebElement fullNameField;
    private WebElement emailField;
    private WebElement currentAddressField;
    private WebElement permanentAddressField;
    private WebElement submitBtn;
    private WebElement outputFullName;
    private WebElement outputEmail;
    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement getTextBoxBtn() {
        textBoxBtn = getDriver().findElement(By.xpath("//span[contains(text(), 'Text Box')]"));
        return textBoxBtn;
    }

    public WebElement getFullNameField() {
        fullNameField = getDriver().findElement(By.id("userName"));
        return fullNameField;
    }

    public WebElement getEmailField() {
        emailField = getDriver().findElement(By.id("userEmail"));
        return emailField;
    }

    public WebElement getCurrentAddressField() {
        currentAddressField = getDriver().findElement(By.id("currentAddress"));
        return currentAddressField;
    }

    public WebElement getPermanentAddressField() {
        permanentAddressField = getDriver().findElement(By.id("permanentAddress"));
        return permanentAddressField;
    }

    public WebElement getSubmitBtn() {
        submitBtn = getDriver().findElement(By.id("submit"));
        return submitBtn;
    }

    public WebElement getOutputFullName() {
        outputFullName = getDriver().findElement(By.id("name"));
        return outputFullName;
    }

    public WebElement getOutputEmail() {
        outputEmail = getDriver().findElement(By.id("email"));
        return outputEmail;
    }

    /***
     *Methods
     */

    public void clickTextBoxBtn(){
        getTextBoxBtn().click();
    }
    public void enterDataToFullNameField(String text){
        getFullNameField().sendKeys(text);
    }
    public void enterDataToEmailField(String text){
        getEmailField().sendKeys(text);
    }
    public void enterDataToCurrentAddressField(String text){
        getCurrentAddressField().sendKeys(text);
    }
    public void enterDataToPermanentAddressField(String text){
        getPermanentAddressField().sendKeys(text);
    }
    public void clickSubmitBtn(){
        getSubmitBtn().click();
    }
    public void checkOutputFullName(){
        getOutputFullName().getText();
    }
    public void checkOutputEmail(){
        getOutputEmail().getText();
    }

}
