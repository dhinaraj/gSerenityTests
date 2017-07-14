package plus65.goldenDynasty.scenarios;

import java.sql.SQLException;
import java.util.Random;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import plus65.goldenDynasty.steps.serinity.AdminNavgation;
import plus65.goldenDynasty.steps.serinity.MySQLFunctions;

@RunWith(SerenityRunner.class)
//@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom(value="PurchaseNewSubscripton.csv") 

public class TwoStarManagerLeaderBonusUsers extends PageObject{
	
	MySQLFunctions mySqlFunctions = new MySQLFunctions();
	
	@Steps
	AdminNavgation adminNavigation;
	
    @Override
    public WebDriver getDriver() { return super.getDriver();}
    
	
	@Managed
    WebDriver browser;

   /* @TestData                                               
        public static Collection<Object[]> testData(){
            return Arrays.asList(new Object[][]{
            	

   
            });
        }*/
        
        private final String adminUserName= "dhina4";
        private final String adminPassword= "casuarina1";
        private final String captcha = "12345";
        String dataBaseName = "gdynasty_staging";

        /*  private final String subscriptionPack;
        private final String fullName;

        public BuyPackageFromAdmin(  String subscriptionPack, String fullName ) {
        	
        	this.subscriptionPack = subscriptionPack;
        	this.fullName = fullName;
        }*/
        
	private String subscriptionPack;
	private String fullName;
   
    private String Gender="male"; 
    private  Random rand = new Random(); 
    private  int value = rand.nextInt(500000); 
    private  String emailAppender = Integer.toString(value);
    private  String email ="dhinaplus65testing+"+emailAppender+"@gmail.com";
  
    private String mobile = "123456789";
    private String countryID = "India";
    private String nationalId= emailAppender; 
    private String state = "State"; 
    private String city = "City"; 
    private String address = "Address";
    private String postalCode = "123"; 
    private String primaryPassword = "123qwe";
    private String secondaryPassword = "1234qwer";

	@Test
	public void addNewMemberAndBuyPackageWithoutDedctingSponsorBonus() throws InterruptedException, SQLException {

		//// Member 1 ////
		
		subscriptionPack = "26";
		fullName = "Dhinakaran500014";

		
		String referrerId="GD07000000";
		String placementID="GD07000000";
		
		adminNavigation.isAtLoginPage();
		adminNavigation.adminLogin(adminUserName, adminPassword, captcha);
		
		adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
		adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
	
		
		String lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
		System.out.println("Last Member Number in System =: "+ lastMemberNumber);
		
		String memberNumber = lastMemberNumber;
		String packageName = "1kg";
		
		for (int i = 1; i<=8; i++)
		{
			adminNavigation.buyPackageExistingMember(memberNumber, packageName);
		}
			//adminNavigation.buyPackageExistingMember(memberNumber, "10000");
			
		
		//// Member 2 ////
		
	
			
		referrerId=lastMemberNumber;
		placementID=lastMemberNumber;

		subscriptionPack = "28";
		fullName = "Dhinakaran500015";
		email = "dhinaplus65testing+500015@gmail.com";
		nationalId = "500015";
		
		adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
		adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
		
		
		//// Member 3 ////
		
		lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
		System.out.println("Last Member Number in System =: "+ lastMemberNumber);
		
		referrerId=lastMemberNumber;
		placementID=lastMemberNumber;
		
		subscriptionPack = "26";
		fullName = "Dhinakaran500016";
		email = "dhinaplus65testing+500016@gmail.com";
		nationalId = "500016";
		
		adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
		adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
		
		lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
		System.out.println("Last Member Number in System =: "+ lastMemberNumber);
		
		memberNumber = lastMemberNumber;
		packageName = "1kg";
		
		for (int i = 1; i<=6; i++)
		{
			adminNavigation.buyPackageExistingMember(memberNumber, packageName);
		}
		
	   //// Member 4 ////
		
			lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
			System.out.println("Last Member Number in System =: "+ lastMemberNumber);
			
			referrerId=lastMemberNumber;
			placementID=lastMemberNumber;
			
			subscriptionPack = "26";
			fullName = "Dhinakaran500017";
			email = "dhinaplus65testing+500017@gmail.com";
			nationalId = "500017";
			
			adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
			adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
			
			lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
			System.out.println("Last Member Number in System =: "+ lastMemberNumber);
			
			memberNumber = lastMemberNumber;
			packageName = "1kg";
			
			for (int i = 1; i<=11; i++)
			{
				adminNavigation.buyPackageExistingMember(memberNumber, packageName);
			}
			
		//// Member 5 ////
			
			lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
			System.out.println("Last Member Number in System =: "+ lastMemberNumber);
			
			referrerId=lastMemberNumber;
			placementID=lastMemberNumber;
			
			subscriptionPack = "26";
			fullName = "Dhinakaran500018";
			email = "dhinaplus65testing+500018@gmail.com";
			nationalId = "500018";
			
			adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
			adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
			
			lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
			System.out.println("Last Member Number in System =: "+ lastMemberNumber);
			
			memberNumber = lastMemberNumber;
			packageName = "1kg";
			
			for (int i = 1; i<=6; i++)
			{
				adminNavigation.buyPackageExistingMember(memberNumber, packageName);
			}
	
	}
	

	
	


}
