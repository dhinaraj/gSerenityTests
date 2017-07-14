package plus65.goldenDynasty.steps.serinity;


import net.thucydides.core.annotations.Step;
import plus65.goldenDynasty.pages.AdminPage;

import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class AdminNavgation {
	
	AdminPage adminPage;
	
	  @Step
	    public void isAtLoginPage() {
		  adminPage.open();
	    }

	  
	  @Step
	    public void adminLogin(String userName, String password, String captcha) {
		  adminPage.adminLogin(userName, password, captcha);
		
	    }
	  
	  @Step
	    public void clickOnMembersLink() {
		  adminPage.clickOnMembersLink();
		
	    }
	  
	  @Step
	    public void createNewMemberAndEnterDetails(String fullName, String Gender, String email, String mobile, String countryID,
				String nationalId, String state, String city, String address, String postalCode, String primaryPassword,
				String secondaryPassword)
	    {
	        adminPage.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
		
	    }
	  
	  @Step
	    public void buyPackageForNewMemberWithoutDeductingSponsorCredit(String sponsorID, String placementID, String packageToSelect, String primaryPassword, String secondaryPassword) throws InterruptedException 
	    {
	        adminPage.buyPackageForNewMemberIWithoutDeductingSponsorCredit(sponsorID,placementID,packageToSelect, primaryPassword, secondaryPassword );
		
	    }
	  
	  @Step
	    public void buyPackageExistingMember(String memberNumber, String packageName) throws InterruptedException 
	    {
	        adminPage.buyPackageForExistingMember(memberNumber, packageName);
		
	    }
	  

}
