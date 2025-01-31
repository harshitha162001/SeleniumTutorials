package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hover {
	ChromeDriver driver;
    public Hover(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="Hovers")
	private WebElement HoverClick;
	
	@FindBy(xpath="//img[@alt='User Avatar'][1]")
	private WebElement img;
	
    public void getLink(){
    HoverClick.click(); 
    }
    
    public void PerformAction() {
    	Actions act=new Actions(driver);
    	act.moveToElement(img).perform();
    }
    
}
