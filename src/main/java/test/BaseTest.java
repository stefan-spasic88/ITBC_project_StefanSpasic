package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page.*;
import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private WebTablesPage webTablesPage;
    private TextBoxPage textBoxPage;
    private UploadAndDownloadPage uploadAndDownloadPage;
    private ButtonsPage buttonsPage;
    private RadioButtonPage radioButtonPage;
    private Actions actions;
    private IndexPage indexPage;
    private LinkPage linkPage;
    private ModalDialogsPage modalDialogsPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Work1//Desktop//Chromedriver//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        webTablesPage = new WebTablesPage(driver, wait);
        textBoxPage = new TextBoxPage(driver, wait);
        uploadAndDownloadPage = new UploadAndDownloadPage(driver, wait);
        buttonsPage = new ButtonsPage(driver, wait);
        actions = new Actions(driver);
        radioButtonPage = new RadioButtonPage(driver, wait);
        indexPage = new IndexPage(driver, wait);
        linkPage = new LinkPage(driver,wait);
        modalDialogsPage = new ModalDialogsPage(driver, wait);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public WebTablesPage getWebTablesPage() {
        return webTablesPage;
    }

    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public UploadAndDownloadPage getUploadAndDownloadPage() {
        return uploadAndDownloadPage;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }

    public RadioButtonPage getRadioButtonPage() {
        return radioButtonPage;
    }

    public Actions getActions() {
        return actions;
    }

    public IndexPage getIndexPage() {
        return indexPage;
    }

    public LinkPage getLinkPage() {
        return linkPage;
    }

    public ModalDialogsPage getModalDialogsPage() {
        return modalDialogsPage;
    }

    @AfterClass
    public void cleanUp(){
        driver.close();
    }
}
