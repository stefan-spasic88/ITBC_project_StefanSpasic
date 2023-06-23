package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesPage extends BasePage{
    private WebElement webTablesBtn;
    private WebElement addBtn;
    private WebElement firstName;
    private WebElement lastName;
    private WebElement emailAddress;
    private WebElement age;
    private WebElement salary;
    private WebElement department;
    private WebElement submitBtn;
    private WebElement checkName;
    public WebTablesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    /***
     * Getters
     * @return
     */

    public WebElement getWebTablesBtn(){
        webTablesBtn = getDriver().findElement(By.xpath("//span[contains(text(), 'Web Tables')]"));
        return webTablesBtn;
    }
    public WebElement getAddBtn() {
        addBtn = getDriver().findElement(By.id("addNewRecordButton"));
        return addBtn;
    }

    public WebElement getFirstName() {
        firstName = getDriver().findElement(By.id("firstName"));
        return firstName;
    }

    public WebElement getLastName() {
        lastName = getDriver().findElement(By.id("lastName"));
        return lastName;
    }

    public WebElement getEmailAddress() {
        emailAddress = getDriver().findElement(By.id("userEmail"));
        return emailAddress;
    }

    public WebElement getCheckName() {
        checkName = getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]"));
        return checkName;
    }

    public WebElement getAge() {
        age = getDriver().findElement(By.id("age"));
        return age;
    }

    public WebElement getSalary() {
        salary = getDriver().findElement(By.id("salary"));
        return salary;
    }

    public WebElement getDepartment() {
        department = getDriver().findElement(By.id("department"));
        return department;
    }

    public WebElement getSubmitBtn() {
        submitBtn = getDriver().findElement(By.id("submit"));
        return submitBtn;
    }
    /***
     * Methods
     */

    public void clickWebTablesBtn(){
        getWebTablesBtn().click();
    }
    public void clickAddBtn(){
        getAddBtn().click();
    }
    public void enterDataToFirstName(String text){
        getFirstName().sendKeys(text);
    }
    public void enterDataToLastName(String text){
        getLastName().sendKeys(text);
    }
    public void enterDataToEmailAddress(String text){
        getEmailAddress().sendKeys(text);
    }
    public void enterDataToAge(String text){
        getAge().sendKeys(text);
    }
    public void enterDataToSalary(String text){
        getSalary().sendKeys(text);
    }
    public void enterDataToDepartment(String text){
        getDepartment().sendKeys(text);
    }
    public void clickSubmitBtn(){
        getSubmitBtn().click();
    }
    public void fieldCheckName(){
        getCheckName().getText();
    }
}
