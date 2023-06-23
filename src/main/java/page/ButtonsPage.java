package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage{
    private WebElement buttonsBtn;
    private WebElement doubleClickMeBtn;
    private WebElement rightClickMeBtn;
    private WebElement clickMeBtn;
    private WebElement doubleClickMeNotification;
    private WebElement rightClickMeNotification;
    private WebElement clickMeNotification;
    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getButtonsBtn() {
        buttonsBtn = getDriver().findElement(By.xpath("//span[contains(text(), 'Buttons')]"));
        return buttonsBtn;
    }

    public WebElement getDoubleClickMeBtn() {
        doubleClickMeBtn = getDriver().findElement(By.xpath("//button[contains(text(), 'Double Click Me')]"));
        return doubleClickMeBtn;
    }

    public WebElement getRightClickMeBtn() {
        rightClickMeBtn = getDriver().findElement(By.xpath("//button[contains(text(), 'Right Click Me')]"));
        return rightClickMeBtn;
    }

    public WebElement getClickMeBtn() {
        clickMeBtn = getDriver().findElement(By.xpath("//button[text() = 'Click Me']"));
        return clickMeBtn;
    }

    public WebElement getDoubleClickMeNotification() {
        doubleClickMeNotification = getDriver().findElement(By.id("doubleClickMessage"));
        return doubleClickMeNotification;
    }

    public WebElement getRightClickMeNotification() {
        rightClickMeNotification = getDriver().findElement(By.id("rightClickMessage"));
        return rightClickMeNotification;
    }

    public WebElement getClickMeNotification() {
        clickMeNotification = getDriver().findElement(By.xpath("//p[contains(text(),  'You have done a dynamic click')]"));
        return clickMeNotification;
    }

    public void clickButtonsBtn(){
        getButtonsBtn().click();
    }
//    public void clickDoubleClickMeBtn(){
//        getDoubleClickMeBtn().click();
//    }
//    public void clickRightClickMeBtn(){
//        getRightClickMeBtn().click();
//    }
//    public void clickClickMeBtn(){
//        getClickMeBtn().click();
//    }
//    public void textDoubleClickMeNotification(String text){
//        getDoubleClickMeNotification().sendKeys(text);
//    }
//    public void textRightClickMeNotification(String text){
//        getRightClickMeNotification().sendKeys(text);
//    }
//    public void textClickMeNotification(String text){
//        getClickMeNotification().sendKeys(text);
//    }

}
