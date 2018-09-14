package pack1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Common {
static WebDriver driver;	
static File src;
static FileInputStream fis;
static XSSFWorkbook wb;
static XSSFSheet sheet1;
	
	public static void launchbrowser () {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver ();
	}
	
	public static void accessapplication (String url) {
		driver.get(url);
	}
	
	public static void maximize () {
		driver.manage().window().maximize();
	}

	public static void sendText (String locator, String locatorvalue, String value) {
	    if (locator=="id") {
	    driver.findElement(By.id(locatorvalue)).sendKeys(value);
	    } else if (locator=="name") {
	    driver.findElement(By.name(locatorvalue)).sendKeys(value);
	    } else if (locator=="xpath") {
	    driver.findElement(By.xpath(locatorvalue)).sendKeys(value);
	    }
	}
	
	public static void ButtonClick (String locator,String locatorvalue) {
		if (locator=="id") {
		driver.findElement(By.id(locatorvalue)).click();
		} else if (locator=="name") {
		driver.findElement(By.name(locatorvalue)).click();
		} else if (locator=="xpath") {
		driver.findElement(By.xpath(locatorvalue)).click();
		} else if (locator=="linkText") {
		driver.findElement(By.linkText(locatorvalue)).click();
		}
	}
	
	public static void linkClick (String locator,String locatorvalue) {
		if (locator=="id") {
		driver.findElement(By.id(locatorvalue)).click();
		} else if (locator=="name") {
		driver.findElement(By.name(locatorvalue)).click();
		} else if (locator=="xpath") {
		driver.findElement(By.xpath(locatorvalue)).click();
		}
	}
	
	 public static void closeBrowser () {
		  driver.close();
	  }
	 public static void datafileopen (String excellpath) throws Throwable {
		  src = new File (excellpath);
		  fis = new FileInputStream (src);
		  wb = new XSSFWorkbook (fis);
	  }
	  public static void readexcel (int value) {
		  sheet1 = wb.getSheetAt(value);
		 
	  }
	 
	  public static String readdata (int row, int cell) {
		 
		return sheet1.getRow(row).getCell(cell).getStringCellValue();
	  }
	  
	  
	  public static int getRowCount() {
		 return sheet1.getLastRowNum();
		  
	  }
	  
	  public static int getColumnCount() {
		 return sheet1.getRow(1).getLastCellNum();
	  }
	  
	  public static void excelClose() throws Throwable {
			wb.close();  
		  }

	  public static void selectelementtext(String locator, String locatorvalue, String value) {
			if (locator == "id") {
				new Select(driver.findElement(By.id(locatorvalue))).selectByVisibleText(value);
			} else if (locator == "name") {
				new Select(driver.findElement(By.name(locatorvalue))).selectByVisibleText(value);
			} else if (locator == "xpath") {
				new Select(driver.findElement(By.xpath(locatorvalue))).selectByVisibleText(value);
			}
		}

		public static void selectelementvalue(String locator, String locatorvalue, String value) {
			if (locator == "id") {
				new Select(driver.findElement(By.id(locatorvalue))).selectByValue(value);
			} else if (locator == "name") {
				new Select(driver.findElement(By.name(locatorvalue))).selectByValue(value);
			} else if (locator == "xpath") {
				new Select(driver.findElement(By.xpath(locatorvalue))).selectByValue(value);
			}
		}

		public static void selectelementindex(String locator, String locatorvalue, int number) {
			if (locator == "id") {
				new Select(driver.findElement(By.id(locatorvalue))).selectByIndex(number);
			} else if (locator == "name") {
				new Select(driver.findElement(By.name(locatorvalue))).selectByIndex(number);
			} else if (locator == "xpath") {
				new Select(driver.findElement(By.xpath(locatorvalue))).selectByIndex(number);
			}
		}

		
	}
	  
