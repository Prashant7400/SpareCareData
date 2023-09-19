package Script;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workshop_Management_Gainer_Field {
	
public static void main (String[] args) throws FileNotFoundException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeExtension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://scope.sparecare.in/UAD_SC_WAC/Login.aspx");
		
		driver.findElement(By.id("tbx_UserName")).sendKeys("PrashantT");
		driver.findElement(By.id("tbx_Password")).sendKeys("Prashant@7571");
		driver.findElement(By.id("btnsubmit")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Workshop Management  Gainer\"]")).click();
		
		// SELECT BREAND
		
		driver.findElement(By.xpath("//option[text()=\"JCB\"]")).click();
		
		// SELECT DEALER
		
		driver.findElement(By.xpath("//option[text()=\"Advaith Motors\"]")).click();
		
		// CLICK SHOW BUTTON
		
		driver.findElement(By.id("btnShow")).click();
		
		// CLICK EDIT IN ACTION
		
		driver.findElement(By.xpath("(//img[@title=\"Edit\"])[1]")).click();
		
	
		
		PrintStream ps = new PrintStream("C:\\Users\\Admin\\Desktop\\Scope\\workshop management gainer field.txt");
		System.setOut(ps);
			
		
		
		// GENERAL INFO
		
		
		WebElement gi = driver.findElement(By.xpath("//a[text()=\"General Info\"]"));
		System.out.println(gi.getText());
		
		// SPARE CARE CODE
		
		WebElement scc = driver.findElement(By.xpath("//*[@id=\"spcode\"]/label"));
		System.out.println(scc.getText());
		
		
		// DEALER ADDRESS
		
		WebElement da = driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[3]/label"));
		System.out.println(da.getText());
		
		
		// LATITUDE
		
		WebElement lat =  driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[4]/label"));
		System.out.println(lat.getText());
		
		// LONGITUDE
		
		WebElement log = driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[5]/label"));
		System.out.println(log.getText());
		
		
		// DELHI NCR REGION
		
		WebElement region = driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[6]/label"));
		System.out.println(region.getText());
		
		// LSP
		
		WebElement lsp = driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[7]/label"));
		System.out.println(lsp.getText());
		
		// DISPATCH
		
		WebElement disp = driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div[8]/label"));
		System.out.println(disp.getText());
		System.out.println();
		Thread.sleep(1000);
		
		
		
		// ADDRESS AND PERSONAL DETAILS
		
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")).click();
		
		WebElement address = driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a"));
		System.out.println(address.getText());
		
		// STATE
		
		WebElement state = driver.findElement(By.xpath("//*[@id=\"collapse2\"]/div/div/div[1]/label"));
		System.out.println(state.getText());
		
		// CITY
		
		WebElement city = driver.findElement(By.xpath("//*[@id=\"collapse2\"]/div/div/div[2]/label"));
		System.out.println(city.getText());
		
		// PINCODE
		
		WebElement pincode = driver.findElement(By.xpath("//*[@id=\"collapse2\"]/div/div/div[3]/label"));
		System.out.println(pincode.getText());
		
		// ACCOUNT HOLDER NAME
		
		WebElement holdername = driver.findElement(By.xpath("//*[@id=\"collapse2\"]/div/div/div[4]/label"));
		System.out.println(holdername.getText());
		
		// BANK NAME
		
		WebElement bankname = driver.findElement(By.xpath("//*[@id=\"collapse2\"]/div/div/div[5]/label"));
		System.out.println(bankname.getText());
		
		// BRANCH NAME
		
		WebElement branchname = driver.findElement(By.xpath("//*[@id=\"collapse2\"]/div/div/div[6]/label"));
		System.out.println(branchname.getText());
		
		// ACCOUNT NUMBER
		
		WebElement accountnum = driver.findElement(By.xpath("//*[@id=\"collapse2\"]/div/div/div[7]/label"));
		System.out.println(accountnum.getText());
		
		// IFSC CODE
		
		WebElement ifsc = driver.findElement(By.xpath("//*[@id=\"collapse2\"]/div/div/div[8]/label"));
		System.out.println(ifsc.getText());
		
		
		// TAN NUMBER
		
		WebElement tannum = driver.findElement(By.xpath("//*[@id=\"collapse2\"]/div/div/div[9]/label"));
		System.out.println(tannum.getText());
		
		// PAN NUMBER
		
		WebElement pannum = driver.findElement(By.xpath("//*[@id=\"collapse2\"]/div/div/div[10]/label"));
		System.out.println(pannum.getText());
		
		// GST NUMBER
		
		WebElement gstnum = driver.findElement(By.xpath("//*[@id=\"collapse2\"]/div/div/div[11]/label"));
		System.out.println(gstnum.getText());
		System.out.println();		
		
		
		// CONTACT MATRIX
		
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[3]/div[1]/h4/a")).click();
		
		WebElement matrix = driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[3]/div[1]/h4/a"));
		System.out.println(matrix.getText());
		
		// NAME
		
		WebElement name = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[1]"));
		System.out.println(name.getText());
		
		// DESIGATION
		
		WebElement desi = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[2]"));
		System.out.println(desi.getText());
		
		//EMAIL
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[3]"));
		System.out.println(email.getText());
		
		// CONTACT NUMBER
		
		WebElement contactnum = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[4]"));
		System.out.println(contactnum.getText());
		
		// DOB
		
		WebElement dob = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[5]"));
		System.out.println(dob.getText());
		
		// SEQUENCE
		
		WebElement seq = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[6]"));
		System.out.println(seq.getText());
		
		// CONSIGNEE PERSON
		
		WebElement conper = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[7]"));
		System.out.println(conper.getText());
		
		// CONSIGNEE PERSON FOR WARRANTY
		
		WebElement watt = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[8]"));
		System.out.println(watt.getText());
		
		// ALERT LIMIT
		
		WebElement alim = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[9]"));
		System.out.println(alim.getText());
		
		// UPPER LIMIT
		
		WebElement ulim = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[10]"));
		System.out.println(ulim.getText());
		
		// ORDER BLOCKED
		
		WebElement oblock = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[11]"));
		System.out.println(oblock.getText());
		
		// PUR DR
		
		WebElement dr = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[12]"));
		System.out.println(dr.getText());
		
		// SALE CR
		
		WebElement cr = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[13]"));
		System.out.println(cr.getText());
		
		// CLAIM SET
		
		WebElement claimset = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[14]"));
		System.out.println(claimset.getText());
		
		// MAC CR
		
		WebElement maccr = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[15]"));
		System.out.println(maccr.getText());
		
		// MAC DR
		
		WebElement macdr = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[16]"));
		System.out.println(macdr.getText());
		
		// WALLET FB
		
		WebElement wallet = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[17]"));
		System.out.println(wallet.getText());
		
		
		// NOT VISIBLE TO SPM
		
		WebElement spm = driver.findElement(By.xpath("//*[@id=\"tblContactMatrix\"]/thead/tr[1]/th[18]"));
		System.out.println(spm.getText());
		System.out.println();
		Thread.sleep(1000);
		
		
		// REJECTION LIST OF DEALER LOCATIONS
		
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[4]/div[1]/h4/a")).click();
		Thread.sleep(1000);
		
		WebElement rejection = driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[4]/div[1]/h4/a"));
		System.out.println(rejection.getText());
		Thread.sleep(1000);
		
		WebElement reject = driver.findElement(By.xpath("//*[@id=\"collapse4\"]/div/div/div/label"));
		System.out.println(reject.getText());
		System.out.println();
		Thread.sleep(1000);
		
		
		// REGION BY LOGISTIC COMPANY
		
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[5]/div[1]/h4/a")).click();
		Thread.sleep(1000);
		
		WebElement rej = driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[5]/div[1]/h4/a"));
		System.out.println(rej.getText());
		Thread.sleep(1000);
		
		WebElement regionlog = driver.findElement(By.xpath("//*[@id=\"collapse5\"]/div/div/div/label"));
		System.out.println(regionlog.getText());
		System.out.println();
		Thread.sleep(1000);
		
		
		// CLUSTER
		
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[6]/div[1]/h4/a")).click();
		
		WebElement cluster = driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[6]/div[1]/h4/a"));
		System.out.println(cluster.getText());
		Thread.sleep(1000);
		
		// CLUSTER
		
		WebElement clus = driver.findElement(By.xpath("//*[@id=\"collapse6\"]/div/div/div[1]/label"));
		System.out.println(clus.getText());
		Thread.sleep(1000);
		
		// WEFAST CLUSTER
		
		
		WebElement wefastclus = driver.findElement(By.xpath("//*[@id=\"collapse6\"]/div/div/div[3]/label"));
		System.out.println(wefastclus.getText());
		System.out.println();
		Thread.sleep(1000);
		
		
		// VIRTUAL ACCOUNT 
		
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[7]/div[1]/h4/a")).click();
		Thread.sleep(1000);
		
		WebElement viracc = driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[7]/div[1]/h4/a"));
		System.out.println(viracc.getText());
		
		WebElement viraccountno = driver.findElement(By.xpath("//*[@id=\"collapse7\"]/div/div/div/label"));
		System.out.println(viraccountno.getText());
		System.out.println();
		Thread.sleep(1000);
		
		
		// LOGISTIC COMPANY FOR WAREHOUSE
		
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[8]/div[1]/h4/a")).click();
		
		WebElement warehouse = driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[8]/div[1]/h4/a"));
		System.out.println(warehouse.getText());
		Thread.sleep(1000);
		
		// ALLOW SPARE CARE LOGISTICS
		
		WebElement allowspare = driver.findElement(By.xpath("//*[@id=\"collapse8\"]/div/div/div[1]/label"));
		System.out.println(allowspare.getText());
		Thread.sleep(1000);
		
		// Logistics Company For Warehouse 
		
		WebElement wareh = driver.findElement(By.xpath("//*[@id=\"collapse8\"]/div/div/div[2]/label"));
		System.out.println(wareh.getText());
		Thread.sleep(1000);
		
		// company name
		
		WebElement companyname = driver.findElement(By.xpath("//*[@id=\"tblWHLsp\"]/thead/tr[1]/th[1]"));
		System.out.println(companyname.getText());
		
		// zone
		
		WebElement zone = driver.findElement(By.xpath("//*[@id=\"tblWHLsp\"]/thead/tr[1]/th[2]"));
		System.out.println(zone.getText());
		
		// DEFAULT COMPANY
		
		WebElement defcom = driver.findElement(By.xpath("//*[@id=\"tblWHLsp\"]/thead/tr[1]/th[3]"));
		System.out.println(defcom.getText());
		
		// FOR WARRANTY
		
		WebElement warr = driver.findElement(By.xpath("//*[@id=\"tblWHLsp\"]/thead/tr[1]/th[4]"));
		System.out.println(warr.getText());
		
		// FOR OTHER
		
		WebElement other = driver.findElement(By.xpath("//*[@id=\"tblWHLsp\"]/thead/tr[1]/th[5]"));
		System.out.println(other.getText());
		
		// FOR DOC
		
		WebElement doc = driver.findElement(By.xpath("//*[@id=\"tblWHLsp\"]/thead/tr[1]/th[6]"));
		System.out.println(doc.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	
		
	
		
		
		
		
				
				
				
}
}
