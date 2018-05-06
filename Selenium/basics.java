import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;


/*
 * Supported:
 * 1- page title. 
 * 2- tag name
 */
public class PG2 {
    /**
     * @param args
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
    	

    	System.setProperty("webdriver.chrome.driver","C:\\Users\\NAHIR\\Google Drive\\ELTE\\software testing and quality\\final exam\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
        String baseUrl = "http://www.facebook.com";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        
//        String expectedTitle = "Welcome: Mercury Tours";
//        String actualTitle = "";

        // get the actual value of the title (title of the page)
//        actualTitle = driver.getTitle();
        
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
//        if (actualTitle.contentEquals(expectedTitle)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
       
        
        // get the tag name -- Output -> "input"
        String tagName = "";
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        
        // Instantiating Web Elements
        WebElement element_1 = driver.findElement(By.id("email"));
        if(element_1.isEnabled())
        element_1.sendKeys("06702183673");
        // to delete the value from the text box
//        element_1.clear();
        
        // find element by name
        WebElement element_2 = driver.findElement(By.name("pass"));
        if (element_2.isEnabled())
        element_2.sendKeys("ferassfuu1`");
        
        
        // click on an element
        WebElement element_3 = driver.findElement(By.id("loginbutton"));
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(element_3)
                .click()
                .build();
        mouseOverHome.perform();
//        element_3.submit();
//                
//        //switch to a frame and find element by link
//        driver.get("http://demo.guru99.com/selenium/deprecated.html");
//        driver.switchTo().frame("classFrame");
//        driver.findElement(By.linkText("Deprecated")).click();
//        
//        // find and select radio elements
//        driver.get("http://demo.guru99.com/test/radio.html");					
//        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
//        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));	
//        //Radio Button1 is selected		
//        radio1.click();			
//        System.out.println("Radio Button Option 1 Selected");					
//        //Radio Button1 is de-selected and Radio Button2 is selected		
//        radio2.click();			
//        System.out.println("Radio Button Option 2 Selected");	
//        
//        // find and select a check box:
//        WebElement option1 = driver.findElement(By.id("vfb-6-1"));							
//        // This will Toggle the Check box 		
//        option1.click();			
//        // Check whether the Check box is toggled on 		
//        if (option1.isSelected()) {					
//            System.out.println("Checkbox is Toggled On");					
//        } else {			
//            System.out.println("Checkbox is Toggled Off");					
//        }		
//         
//        
//        //find and select DropDown 
//        driver.get("http://demo.guru99.com/test/newtours/register.php");
//		Select drpCountry = new Select(driver.findElement(By.name("country")));
//		drpCountry.selectByVisibleText("ANTARCTICA");
//		
//
//		//Selecting Items in a Multiple SELECT elements
//		driver.get("http://jsbin.com/osebed/2");
//		Select fruits = new Select(driver.findElement(By.id("fruits")));
//		fruits.selectByVisibleText("Banana");
//		fruits.selectByIndex(1);
//		
//		
//		//KeyBoard and Mouse
//		
//        driver.get("http://demo.guru99.com/test/newtours/");   
//        WebElement link_Home = driver.findElement(By.linkText("Home"));
//        WebElement td_Home = driver
//                .findElement(By
//                .xpath("//html/body/div"
//                + "/table/tbody/tr/td"
//                + "/table/tbody/tr/td"
//                + "/table/tbody/tr/td"
//                + "/table/tbody/tr")); 
//        
//        Actions builder = new Actions(driver);
//        Action mouseOverHome = builder
//                .moveToElement(link_Home)
//                .build();
//        String bgColor = td_Home.getCssValue("background-color");
//        System.out.println("Before hover: " + bgColor);        
//        mouseOverHome.perform();        
//        bgColor = td_Home.getCssValue("background-color");
//        System.out.println("After hover: " + bgColor);
        
        //Keyboard
//        driver.get(baseUrl);
//        WebElement txtusername = driver.findElement(By.id("email"));
//        
//        Actions builder_1 = new Actions(driver);
//        Action seriesOfActions = builder_1
//        		.moveToElement(txtusername)
//        		.click()
//        		.keyDown(txtusername,Keys.SHIFT)
//        		.sendKeys(txtusername,"hello")
//        		.keyUp(txtusername,Keys.SHIFT)
//        		.doubleClick(txtusername)
//        		.contextClick()
//        		.build();
//        seriesOfActions.perform();
//		
		
		

        
        //close Fire fox
        driver.close();
        
        // close the java program
        System.exit(0);
        
       
        
       
}
}