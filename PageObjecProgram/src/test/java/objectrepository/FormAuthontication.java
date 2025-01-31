package objectrepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormAuthontication {
	ChromeDriver driver;
    public FormAuthontication(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="Form Authentication")
	private WebElement FormAuthonticationClick;
	
    @FindBy(id = "username")
    private WebElement username;
    
    @FindBy(id="password")
    private WebElement password;
    
    @FindBy(css=".radius")
    private WebElement submit;
    
    @FindBy(css="a i")
    private WebElement  logoutbtn;

    public void getLink(){
    	FormAuthonticationClick.click();
    }
    
    public void getUsernameandPassword() {
    	username.sendKeys("tomsmith");
    	password.sendKeys("SuperSecretPassword!");
    	submit.click();
    }
    public void logoutbtn() {
    	logoutbtn.click();
    }
    

  
}
