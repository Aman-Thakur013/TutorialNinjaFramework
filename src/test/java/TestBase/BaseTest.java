package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	public WebDriver driver;
	public Logger logger;
	public Properties p ;
	@BeforeClass
	@Parameters({"Browser"})
	public void SetUp(String br) throws IOException
	{
		FileInputStream fs = new FileInputStream(".//src//test//resources//config.properties");
		p = new Properties();
		p.load(fs);
		
		//Loading log4j file
		
	logger = LogManager.getLogger(this.getClass());
		
		switch(br.toLowerCase())
		{
		case "chrome":
			driver =new ChromeDriver();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			break;
			
			default:
				System.out.println("Invalid Browser.....Try Another one");
				return;
		}
		
		driver.get(p.getProperty("appURL1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	public String randomstring()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String captureScreen(WebDriver driver,String tname) throws IOException
	{
		System.out.println("Capturing Screenshot......");
		
		String timeStamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		File sourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String targetDir=System.getProperty("user.dir")+"/Screenshots/";
		File dir = new File(targetDir);
		
		if(!dir.exists())
		{
			dir.mkdirs();
		}
		String targetFilePath = targetDir + tname +"_"+ timeStamp +".png";
		File targetFile =  new File(targetFilePath);
		
		FileUtils.copyFile(sourceFile, targetFile);
		
		System.out.println("ScreenShot saved at :"+targetFilePath);
		return targetFilePath;
	}
	@AfterClass
	void Teardown()
	{
		driver.close();
	}

}
