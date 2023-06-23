package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class IndexPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement elementsCard;
    private WebElement alertsFrameWindowCard;

    public IndexPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
    public WebElement getElementsCard() {
        elementsCard = getDriver().findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1) > div > div.card-body > h5"));
        return elementsCard;
    }

    public WebElement getAlertsFrameWindowCard() {
        alertsFrameWindowCard = getDriver().findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(3) > div > div.card-body > h5"));
        return alertsFrameWindowCard;
    }

    public void clickElementsCard(){
        getElementsCard().click();
    }
    public void clickAlertsFrameWindowCard(){
        getAlertsFrameWindowCard().click();
    }
    @AfterClass
    public void cleanUp(){
        driver.close();
    }
    public void open(){
        getDriver().get("https://demoqa.com/");
    }
}


