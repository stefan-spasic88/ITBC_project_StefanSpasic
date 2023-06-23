package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalDialogsPage extends BasePage{
    private WebElement modalDialogsBtn;
    private WebElement smallBtn;
    private WebElement largeBtn;
    private WebElement smallModal;
    private WebElement largeModal;
    private WebElement smallCloseBtn;
    private WebElement largeCloseBtn;
    public ModalDialogsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getModalDialogsBtn() {
        modalDialogsBtn = getDriver().findElement(By.xpath("//span[contains(text(), 'Modal Dialogs')]"));
        return modalDialogsBtn;
    }

    public WebElement getSmallBtn() {
        smallBtn = getDriver().findElement(By.id("showSmallModal"));
        return smallBtn;
    }

    public WebElement getLargeBtn() {
        largeBtn = getDriver().findElement(By.id("showLargeModal"));
        return largeBtn;
    }

    public WebElement getSmallModal() {
        smallModal = getDriver().findElement(By.xpath("//div[contains(text(), 'Small Modal')]"));
        return smallModal;
    }

    public WebElement getLargeModal() {
        largeModal = getDriver().findElement(By.xpath("//div[contains(text(), 'Large Modal')]"));
        return largeModal;
    }

    public WebElement getSmallCloseBtn() {
        smallCloseBtn = getDriver().findElement(By.id("closeSmallModal"));
        return smallCloseBtn;
    }

    public WebElement getLargeCloseBtn() {
        largeCloseBtn = getDriver().findElement(By.id("closeLargeModal"));
        return largeCloseBtn;
    }

    public void clickModalDialogsBtn(){
        getModalDialogsBtn().click();
    }
    public void clickSmallBtn(){
        getSmallBtn().click();
    }
    public void clickLargeBtn(){
        getLargeBtn().click();
    }
    public void clickSmallCloseBtn(){
        getSmallCloseBtn().click();
    }
    public void clickLargeCloseBtn(){
        getLargeCloseBtn().click();
    }
}
