package general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Userlogin {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.firefox.marionette", "‪C:\\Selinium Software\\FirefoxDriver0.26v\\geckodriver.exe");
		WebDriver rock = new ChromeDriver();
		rock.manage().window().maximize();
		rock.get("https://my.excitel.com/login");
		if(rock.getTitle().equals("Excitel"))
			System.out.println("Build path pass");
			else
				System.out.println("Build path fail");
		Thread.sleep(7000);
		/*rock.findElement(By.xpath(".//*[@id='login']/div/div[2]/div/form/div[1]/div/input")).sendKeys("shubham660");
		rock.findElement(By.xpath(".//*[@id='login']/div/div[2]/div/form/div[2]/div/input")).sendKeys("odisharock201");
		rock.findElement(By.xpath(".//*[@id='login']/div/div[2]/div/form/div[3]/div/button")).click();
		
		if(rock.getTitle().equals("Excitel"))
		System.out.println("Login Sucessfully pass");
		else
			System.out.println("Login Sucessfully fail");
		Thread.sleep(7000);
		
		rock.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
		Thread.sleep(3000);
		rock.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		System.out.println("Logout Sucessfully");
		Thread.sleep(7000);*/
		
//		rock.findElement(By.xpath(".//*[@id='login']/div/div[2]/div/form/div[1]/div/input")).sendKeys("");
//		rock.findElement(By.xpath(".//*[@id='login']/div/div[2]/div/form/div[2]/div/input")).sendKeys("");
//		rock.findElement(By.xpath(".//*[@id='login']/div/div[2]/div/form/div[3]/div/button")).click();
//		Thread.sleep(3000);
//	    if(rock.switchTo().alert().getText().equals("Please fill out this field."))
//	    	System.out.println("TC_4_pass");
//	    else
//	    	System.out.println("TC_4_fail");
		
		/*rock.findElement(By.xpath("//a[@class='phone-link nowrap']")).click();
		Thread.sleep(3000);
		rock.quit();
		rock = new ChromeDriver(); 
		rock.get("https://my.excitel.com/login");
		Thread.sleep(3000);
		rock.findElement(By.xpath("//a[contains(text(),'Android')]")).click();
		rock.close();
		rock = new ChromeDriver(); 
		rock.get("https://my.excitel.com/login");
		Thread.sleep(3000);
		rock.findElement(By.xpath("//a[contains(text(),'iOS')]")).click();
		/*rock.navigate().back();
		 
		rock.get("https://my.excitel.com/login");
		rock.findElement(By.xpath(".//*[@id='login']/div/footer/div/div[1]/a")).click();
		
		Thread.sleep(3000);
		
		rock.close();*/
	
		

	}

}
