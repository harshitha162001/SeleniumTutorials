package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frames {
	ChromeDriver driver;
    public Frames(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="Frames")
	private WebElement FrameClick;
	
	@FindBy(linkText="iFrame")
	private WebElement iFrameClick;
	
	@FindBy(id="mce_0_ifr")
	private WebElement frameid;
	
	@FindBy(css="body p")
	private WebElement text;
	
   
    
   
    public void getLink(){
    FrameClick.click();
    iFrameClick.click();
    }
    
    public void PerformAction() {
    	driver.switchTo().frame(frameid);
    	text.sendKeys("hello everyone!!!");
    }
    
    
}
