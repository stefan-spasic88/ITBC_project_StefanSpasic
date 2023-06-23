package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkPage extends BasePage{
    private WebElement linksBtn;
    private WebElement homeLink;
    private WebElement homeDynamicLink;
    private WebElement createdLink;
    private WebElement noContentLink;
    private WebElement movedLink;
    private WebElement badRequestLink;
    private WebElement unauthorizedLink;
    private WebElement forbiddenLink;
    private WebElement notFoundLink;
    private WebElement response;
    public LinkPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getLinksBtn() {
        linksBtn = getDriver().findElement(By.xpath("//span[contains(text(), 'Links')]"));
        return linksBtn;
    }

    public WebElement getHomeLink() {
        homeLink = getDriver().findElement(By.xpath("//a[@id='simpleLink']"));
        return homeLink;
    }

    public WebElement getHomeDynamicLink() {
        homeDynamicLink = getDriver().findElement(By.xpath("//a[@id='dynamicLink']"));
        return homeDynamicLink;
    }

    public WebElement getCreatedLink() {
        createdLink = getDriver().findElement(By.xpath("//a[@id='created']"));
        return createdLink;
    }

    public WebElement getNoContentLink() {
        noContentLink = getDriver().findElement(By.xpath("//a[@id='no-content']"));
        return noContentLink;
    }

    public WebElement getMovedLink() {
        movedLink = getDriver().findElement(By.xpath("//a[@id='moved']"));
        return movedLink;
    }

    public WebElement getBadRequestLink() {
        badRequestLink = getDriver().findElement(By.xpath("//a[@id='bad-request']"));
        return badRequestLink;
    }

    public WebElement getUnauthorizedLink() {
        unauthorizedLink = getDriver().findElement(By.xpath("//a[@id='unauthorized']"));
        return unauthorizedLink;
    }

    public WebElement getForbiddenLink() {
        forbiddenLink = getDriver().findElement(By.xpath("//a[@id='forbidden']"));
        return forbiddenLink;
    }

    public WebElement getNotFoundLink() {
        notFoundLink = getDriver().findElement(By.xpath("//a[@id='invalid-url']"));
        return notFoundLink;
    }

    public WebElement getResponse() {
        response = getDriver().findElement(By.xpath("//p[@id='linkResponse']"));
        return response;
    }
    public void clickLinksBtn(){
        getLinksBtn().click();
    }
    public void clickHomeLink(){
        getHomeLink().click();
    }
    public void clickHomeDynamicLink(){
        getHomeDynamicLink().click();
    }
    public void clickCreatedLink(){
        getCreatedLink().click();
    }
    public void clickNoContentLink(){
        getNoContentLink().click();
    }
    public void clickMovedLink(){
        getMovedLink().click();
    }
    public void clickBadRequestLink(){
        getBadRequestLink().click();
    }
    public void clickUnauthorizedLink(){
        getUnauthorizedLink().click();
    }
    public void clickForbiddenLink(){
        getForbiddenLink().click();
    }
    public void clickNotFoundLink(){
        getNotFoundLink().click();
    }
    public void messageResponse(){
        getResponse().getText();
    }
}
