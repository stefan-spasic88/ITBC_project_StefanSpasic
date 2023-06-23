package test;

import org.testng.annotations.Test;

public class UploadAndDownloadTest extends BaseTest{
    @Test
    public void uploadAndDownload(){
        getIndexPage().open();
        getIndexPage().clickElementsCard();
        getUploadAndDownloadPage().clickUploadAndDownloadBtn();
        getUploadAndDownloadPage().clickChooseFileBtn();
        getUploadAndDownloadPage().clickDownloadBtn();
    }
}
