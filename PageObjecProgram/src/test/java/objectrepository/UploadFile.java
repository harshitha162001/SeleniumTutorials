package objectrepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFile {
	ChromeDriver driver;
    public UploadFile(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="File Upload")
	private WebElement FileUploadClick;
	
    @FindBy(css = "input[id='file-upload']")
    private WebElement fileUploadButton;
    
   

    public void getfileUploadLink(){
    	FileUploadClick.click();
    }
    
    public void getClickButton()
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		fileUploadButton.sendKeys("C:\\Users\\haithal\\Pictures\\Camera Roll\\pic.jpg");
		
    	}
    

}
