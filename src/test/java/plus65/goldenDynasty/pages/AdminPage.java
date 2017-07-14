package plus65.goldenDynasty.pages;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("https://staging.gdrocks.com/admin/login")



public class AdminPage extends PageObject{
	
    @Override
    public WebDriver getDriver() { return super.getDriver();}
    


	public void adminLogin(String userName, String password, String captcha) {
		getDriver().manage().window().maximize();
		getDriver().findElement(By.name("username")).clear();
		getDriver().findElement(By.name("username")).sendKeys(userName);
		getDriver().findElement(By.name("password")).clear();
		getDriver().findElement(By.name("password")).sendKeys(password);
		getDriver().findElement(By.name("user-captcha")).clear();
		getDriver().findElement(By.name("user-captcha")).sendKeys(captcha);
		getDriver().findElement(By.xpath("//button[@type='submit']")).click();
	}

	public void createNewMemberAndEnterDetails(String fullName, String gender, String email, String mobile, String countryID,
			String nationalId, String state, String city, String address, String postalCode, String primaryPassword,
			String secondaryPassword) {
		getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div/ul/li[1]/a")).click();
		getDriver().findElement(By.xpath("html/body/div[3]/div[2]/div/div/div[1]/a")).click();
		getDriver().findElement(By.name("fullname")).clear();
		getDriver().findElement(By.name("fullname")).sendKeys(fullName);
		new Select(getDriver().findElement(By.name("gender"))).selectByVisibleText(gender);
		getDriver().findElement(By.name("email")).clear();
		getDriver().findElement(By.name("email")).sendKeys(email);
		getDriver().findElement(By.name("mobile")).clear();
		getDriver().findElement(By.name("mobile")).sendKeys(mobile);
		new Select(getDriver().findElement(By.name("country_id"))).selectByVisibleText(countryID);
		getDriver().findElement(By.name("national_id")).clear();
		getDriver().findElement(By.name("national_id")).sendKeys(nationalId);
		getDriver().findElement(By.name("state")).clear();
		getDriver().findElement(By.name("state")).sendKeys(state);
		getDriver().findElement(By.name("city")).clear();
		getDriver().findElement(By.name("city")).sendKeys(city);
		getDriver().findElement(By.name("address")).sendKeys(address);
		getDriver().findElement(By.name("postal_code")).clear();
		getDriver().findElement(By.name("postal_code")).sendKeys(postalCode);
		getDriver().findElement(By.name("password")).clear();
		getDriver().findElement(By.name("password")).sendKeys(primaryPassword);
		getDriver().findElement(By.name("password_confirmation")).clear();
		getDriver().findElement(By.name("password_confirmation")).sendKeys(primaryPassword);
		getDriver().findElement(By.name("secondary_password")).clear();
		getDriver().findElement(By.name("secondary_password")).sendKeys(secondaryPassword);
		getDriver().findElement(By.name("secondary_password_confirmation")).clear();
		getDriver().findElement(By.name("secondary_password_confirmation")).sendKeys(secondaryPassword);

	}

	public void buyPackageForNewMemberIWithoutDeductingSponsorCredit(String sponsorID, String placementID, String packageToSelect, String primaryPassword, String secondaryPassword) throws InterruptedException {
		getDriver().findElement(By.name("sponsor")).clear();
		getDriver().findElement(By.name("sponsor")).sendKeys(sponsorID);
		getDriver().findElement(By.name("placement")).clear();
		getDriver().findElement(By.name("placement")).sendKeys(placementID);
		getDriver().findElement(By.cssSelector("button.btn.btn-primary")).click();
		getDriver().findElement(By.name("password")).clear();
		getDriver().findElement(By.name("password")).sendKeys(primaryPassword);
		getDriver().findElement(By.name("password_confirmation")).clear();
		getDriver().findElement(By.name("password_confirmation")).sendKeys(primaryPassword);
		getDriver().findElement(By.name("secondary_password")).clear();
		getDriver().findElement(By.name("secondary_password")).sendKeys(secondaryPassword);
		getDriver().findElement(By.name("secondary_password_confirmation")).clear();
		getDriver().findElement(By.name("secondary_password_confirmation")).sendKeys(secondaryPassword);
		new Select(getDriver().findElement(By.xpath(".//*[@id='package_id']"))).selectByValue(packageToSelect);
		getDriver().findElement(By.xpath(".//*[@id='buy_package_yes']/div[2]/div/div[2]/label/input")).click();
		getDriver().findElement(By.cssSelector("button.btn.btn-primary")).click();
	}
	
	public void clickOnMembersLink()  {
		getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div/ul/li[1]/a")).click();
	}
	
	
	
	
	public void buyPackageForExistingMember(String memberNumber, String packageName) throws InterruptedException {
		//getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div/ul/li[1]/a")).click();
		getDriver().findElement(By.name("member_number")).clear();
		getDriver().findElement(By.name("member_number")).sendKeys(memberNumber);
		getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		getDriver().findElement(By.xpath("html/body/div[3]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[13]/a[13]")).click();
		
		if (packageName.equalsIgnoreCase("500g")) {
			getDriver().findElement(By.xpath("html/body/div[3]/div[2]/div/div/div/div[2]/div[1]/div[3]/a")).click();
		}

		if (packageName.equalsIgnoreCase("1kg")) {
			getDriver().findElement(By.xpath("html/body/div[3]/div[2]/div/div/div/div[2]/div[2]/div[3]/a")).click();
		}

		if (packageName.equalsIgnoreCase("1000")) {
			getDriver().findElement(By.xpath("html/body/div[3]/div[2]/div/div/div/div[2]/div[3]/div[3]/a")).click();
		}

		if (packageName.equalsIgnoreCase("5000")) {
			getDriver().findElement(By.xpath("html/body/div[3]/div[2]/div/div/div/div[2]/div[4]/div[3]/a")).click();
		}

		if (packageName.equalsIgnoreCase("10000")) {
			getDriver().findElement(By.xpath("html/body/div[3]/div[2]/div/div/div/div[2]/div[5]/div[3]/a")).click();
		}
		
		getDriver().findElement(By.xpath(".//*[@id='purchaseform']/div/div[2]/div/div[2]/label/input")).click();
		getDriver().findElement(By.xpath(".//*[@id='purchaseform']/div/div[4]/div/a[1]")).click();
		getDriver().findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[2]")).click();
		
		
	}
	
	    
   
}
