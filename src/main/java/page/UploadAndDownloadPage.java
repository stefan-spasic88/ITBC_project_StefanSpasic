package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadAndDownloadPage extends BasePage{
    private WebElement uploadAndDownloadBtn;
    private WebElement chooseFileBtn;
    private WebElement downloadBtn;
    public UploadAndDownloadPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getUploadAndDownloadBtn() {
        uploadAndDownloadBtn = getDriver().findElement(By.xpath("//span[contains(text(), 'Upload and Download')]"));
        return uploadAndDownloadBtn;
    }

    public WebElement getChooseFileBtn() {
        chooseFileBtn = getDriver().findElement(By.id("uploadFile"));
        return chooseFileBtn;
    }

    public WebElement getDownloadBtn() {
        downloadBtn = getDriver().findElement(By.id("downloadButton"));
        return downloadBtn;
    }

    public void clickUploadAndDownloadBtn(){
        getUploadAndDownloadBtn().click();
    }
    public void clickChooseFileBtn(){
        getChooseFileBtn().sendKeys("C://Users//Work1//IdeaProjects//java06.06.cas//src//main//java//zadatak1//ITbootcampsparta.png");
    }
    public void clickDownloadBtn(){
        getDownloadBtn().click();
    }
}
