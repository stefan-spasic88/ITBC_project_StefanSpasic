package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BasePage{
    private WebElement radioButton;
    private WebElement yesBtn;
    private WebElement impressiveBtn;
    private WebElement noBtn;
    private WebElement resultText;
    public RadioButtonPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement getRadioButton() {
        radioButton = getDriver().findElement(By.xpath("//span[contains(text(), 'Radio Button')]"));
        return radioButton;
    }

    public WebElement getYesBtn() {
        yesBtn = getDriver().findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/label[1]"));
        return yesBtn;
    }

    public WebElement getImpressiveBtn() {
        impressiveBtn = getDriver().findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/label[1]"));
        return impressiveBtn;
    }

    public WebElement getNoBtn() {
        noBtn = getDriver().findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/label[1]"));
        return noBtn;
    }

    public WebElement getResultText() {
        resultText = getDriver().findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/p[1]"));
        return resultText;
    }
    public void clickRadioButton(){
        getRadioButton().click();
    }
    public void clickYesBtn(){
        getYesBtn().click();
    }
    public void clickImpressiveBtn(){
        getImpressiveBtn().click();
    }
    public void clickNoBtn(){
        getNoBtn().click();
    }
    public void textResultText(String text){
        getResultText().sendKeys(text);
    }

}
