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

public class Three_Four_Five_StarManagerLeaderBonusUsers extends PageObject{
	
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
   /* private  Random rand = new Random(); 
    private  int value = rand.nextInt(500000); 
    private  String emailAppender = Integer.toString(value);
    private  String email ="dhinaplus65testing+"+emailAppender+"@gmail.com";*/
  
    private String mobile = "123456789";
    private String countryID = "India";
   //private String nationalId= emailAppender; 
    private String state = "State"; 
    private String city = "City"; 
    private String address = "Address";
    private String postalCode = "123"; 
    private String primaryPassword = "123qwe";
    private String secondaryPassword = "1234qwer";
/*
	@Test
	
	public void addUsersForThreeStarManagerUseCase1() throws InterruptedException, SQLException {
		 Three Star Users Case 1
		//// Member 1 ////
		
		subscriptionPack = "26";
		fullName = "Dhinakaran500025";
		String email = "dhinaplus65testing+500025@gmail.com";
		String nationalId = "500025";

		
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
		
		for (int i = 1; i<=22; i++)
		{
			adminNavigation.buyPackageExistingMember(memberNumber, packageName);
		}
			
		
		//// Member 2 ////
		
		
		lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
		System.out.println("Last Member Number in System =: "+ lastMemberNumber);
		
		referrerId=lastMemberNumber;
		placementID=lastMemberNumber;
		
		subscriptionPack = "26";
		fullName = "Dhinakaran500026";
		email = "dhinaplus65testing+500026@gmail.com";
		nationalId = "500026";
		
		adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
		adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
		
		lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
		System.out.println("Last Member Number in System =: "+ lastMemberNumber);
		
		memberNumber = lastMemberNumber;
		packageName = "1kg";
		
		for (int i = 1; i<=22; i++)
		{
			adminNavigation.buyPackageExistingMember(memberNumber, packageName);
		}
		
	   //// Member 3 ////
		
			lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
			System.out.println("Last Member Number in System =: "+ lastMemberNumber);
			
			referrerId=lastMemberNumber;
			placementID=lastMemberNumber;
			
			subscriptionPack = "26";
			fullName = "Dhinakaran500027";
			email = "dhinaplus65testing+500027@gmail.com";
			nationalId = "500027";
			
			adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
			adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
			
			lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
			System.out.println("Last Member Number in System =: "+ lastMemberNumber);
			
			memberNumber = lastMemberNumber;
			packageName = "1kg";
			
			for (int i = 1; i<=22; i++)
			{
				adminNavigation.buyPackageExistingMember(memberNumber, packageName);
			}
			
	
	
	}*/
	
	
    /*@Test
	
	public void addUsersForThreeStarManagerUseCase2() throws InterruptedException, SQLException {
		 //Three Star Users Case 2
		//// Member 1 ////
		
		subscriptionPack = "26";
		fullName = "Dhinakaran500028";
		String email = "dhinaplus65testing+500028@gmail.com";
		String nationalId = "500028";

		
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
		
		for (int i = 1; i<=22; i++)
		{
			adminNavigation.buyPackageExistingMember(memberNumber, packageName);
		}
			
		
		//// Member 2 ////
		
		
		lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
		System.out.println("Last Member Number in System =: "+ lastMemberNumber);
		
		referrerId=lastMemberNumber;
		placementID=lastMemberNumber;
		
		subscriptionPack = "26";
		fullName = "Dhinakaran500029";
		email = "dhinaplus65testing+500029@gmail.com";
		nationalId = "500029";
		
		adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
		adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
		
		lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
		System.out.println("Last Member Number in System =: "+ lastMemberNumber);
		
		memberNumber = lastMemberNumber;
		packageName = "1kg";
		
		for (int i = 1; i<=21; i++)
		{
			adminNavigation.buyPackageExistingMember(memberNumber, packageName);
		}
		
	   //// Member 3 ////
		
			lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
			System.out.println("Last Member Number in System =: "+ lastMemberNumber);
			
			referrerId=lastMemberNumber;
			placementID=lastMemberNumber;
			
			subscriptionPack = "26";
			fullName = "Dhinakaran500030";
			email = "dhinaplus65testing+500030@gmail.com";
			nationalId = "500030";
			
			adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
			adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
			
			lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
			System.out.println("Last Member Number in System =: "+ lastMemberNumber);
			
			memberNumber = lastMemberNumber;
			packageName = "1kg";
			
			for (int i = 1; i<=22; i++)
			{
				adminNavigation.buyPackageExistingMember(memberNumber, packageName);
			}
			
	
	
	}


@Test

public void addUsersForThreeStarManagerUseCase3() throws InterruptedException, SQLException {
	 //Three Star Users Case 3
	//// Member 1 ////
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500031";
	String email = "dhinaplus65testing+500031@gmail.com";
	String nationalId = "500031";

	
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
	
	for (int i = 1; i<=22; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
		
	
	//// Member 2 ////
	
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	referrerId=lastMemberNumber;
	placementID=lastMemberNumber;
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500032";
	email = "dhinaplus65testing+500032@gmail.com";
	nationalId = "500032";
	
	adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
	adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	memberNumber = lastMemberNumber;
	packageName = "1kg";
	
	for (int i = 1; i<=22; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
	
   //// Member 3 ////
	
		lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
		System.out.println("Last Member Number in System =: "+ lastMemberNumber);
		
		referrerId=lastMemberNumber;
		placementID=lastMemberNumber;
		
		subscriptionPack = "26";
		fullName = "Dhinakaran500033";
		email = "dhinaplus65testing+500033@gmail.com";
		nationalId = "500033";
		
		adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
		adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
		
		lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
		System.out.println("Last Member Number in System =: "+ lastMemberNumber);
		
		memberNumber = lastMemberNumber;
		packageName = "1kg";
		
		for (int i = 1; i<=22; i++)
		{
			adminNavigation.buyPackageExistingMember(memberNumber, packageName);
		}
		


}*/


    /*@Test

public void addUsersForFourStarManagerUseCase1() throws InterruptedException, SQLException {
	// Four Star Users Case 1
	//// Member 1 ////
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500034";
	String email = "dhinaplus65testing+500034@gmail.com";
	String nationalId = "500034";

	
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
	
	for (int i = 1; i<=76; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
		
	
	//// Member 2 ////
	
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	referrerId=lastMemberNumber;
	placementID=lastMemberNumber;
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500035";
	email = "dhinaplus65testing+500035@gmail.com";
	nationalId = "500035";
	
	adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
	adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	memberNumber = lastMemberNumber;
	packageName = "1kg";
	
	for (int i = 1; i<=76; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
	
   //// Member 3 ////
	
	
	
		String lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
		System.out.println("Last Member Number in System =: "+ lastMemberNumber);
		
		String referrerId=lastMemberNumber;
		String placementID=lastMemberNumber;
		
		subscriptionPack = "26";
		fullName = "Dhinakaran500036";
		String email = "dhinaplus65testing+500036@gmail.com";
		String nationalId = "500036";
		
		adminNavigation.isAtLoginPage();
		adminNavigation.adminLogin(adminUserName, adminPassword, captcha);
		
		adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
		adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
		
		lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
		System.out.println("Last Member Number in System =: "+ lastMemberNumber);
		
		String memberNumber = lastMemberNumber;
		String packageName = "1kg";
		
		for (int i = 1; i<=76; i++)
		{
			adminNavigation.buyPackageExistingMember(memberNumber, packageName);
		}
		


}


@Test

public void addUsersForFourStarManagerUseCase2() throws InterruptedException, SQLException {
	 //Four Star Users Case 2
	//// Member 1 ////
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500037";
	String email = "dhinaplus65testing+500037@gmail.com";
	String nationalId = "500037";

	
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
	
	for (int i = 1; i<=75; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
		
	
	//// Member 2 ////
	
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	referrerId=lastMemberNumber;
	placementID=lastMemberNumber;
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500038";
	email = "dhinaplus65testing+500038@gmail.com";
	nationalId = "500038";
	
	adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
	adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	memberNumber = lastMemberNumber;
	packageName = "1kg";
	
	for (int i = 1; i<=75; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
	
   //// Member 3 ////
	
		lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
		System.out.println("Last Member Number in System =: "+ lastMemberNumber);
		
		referrerId=lastMemberNumber;
		placementID=lastMemberNumber;
		
		subscriptionPack = "26";
		fullName = "Dhinakaran500039";
		email = "dhinaplus65testing+500039@gmail.com";
		nationalId = "500039";
		
		adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
		adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
		
		lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
		System.out.println("Last Member Number in System =: "+ lastMemberNumber);
		
		memberNumber = lastMemberNumber;
		packageName = "1kg";
		
		for (int i = 1; i<=76; i++)
		{
			adminNavigation.buyPackageExistingMember(memberNumber, packageName);
		}
		


}


@Test

public void addUsersForFourStarManagerUseCase3() throws InterruptedException, SQLException {
 //Four Star Users Case 3
//// Member 1 ////

subscriptionPack = "26";
fullName = "Dhinakaran500040";
String email = "dhinaplus65testing+500040@gmail.com";
String nationalId = "500040";


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

for (int i = 1; i<=76; i++)
{
	adminNavigation.buyPackageExistingMember(memberNumber, packageName);
}
	

//// Member 2 ////


lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
System.out.println("Last Member Number in System =: "+ lastMemberNumber);

referrerId=lastMemberNumber;
placementID=lastMemberNumber;

subscriptionPack = "26";
fullName = "Dhinakaran500041";
email = "dhinaplus65testing+500041@gmail.com";
nationalId = "500041";

adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);

lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
System.out.println("Last Member Number in System =: "+ lastMemberNumber);

memberNumber = lastMemberNumber;
packageName = "1kg";

for (int i = 1; i<=76; i++)
{
	adminNavigation.buyPackageExistingMember(memberNumber, packageName);
}

//// Member 3 ////

	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	referrerId=lastMemberNumber;
	placementID=lastMemberNumber;
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500042";
	email = "dhinaplus65testing+500042@gmail.com";
	nationalId = "500042";
	
	adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
	adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	memberNumber = lastMemberNumber;
	packageName = "1kg";
	
	for (int i = 1; i<=76; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
	


}


@Test

public void addUsersForFiveStarManagerUseCase1() throws InterruptedException, SQLException {
 //Five Star Users Case 3
//// Member 1 ////

subscriptionPack = "26";
fullName = "Dhinakaran500043";
String email = "dhinaplus65testing+500043@gmail.com";
String nationalId = "500043";


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

for (int i = 1; i<=172; i++)
{
	adminNavigation.buyPackageExistingMember(memberNumber, packageName);
}
	

//// Member 2 ////


lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
System.out.println("Last Member Number in System =: "+ lastMemberNumber);

referrerId=lastMemberNumber;
placementID=lastMemberNumber;

subscriptionPack = "26";
fullName = "Dhinakaran500044";
email = "dhinaplus65testing+500044@gmail.com";
nationalId = "500044";

adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);

lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
System.out.println("Last Member Number in System =: "+ lastMemberNumber);

memberNumber = lastMemberNumber;
packageName = "1kg";

for (int i = 1; i<=172; i++)
{
	adminNavigation.buyPackageExistingMember(memberNumber, packageName);
}

//// Member 3 ////

	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	referrerId=lastMemberNumber;
	placementID=lastMemberNumber;
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500045";
	email = "dhinaplus65testing+500045@gmail.com";
	nationalId = "500045";
	
	adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
	adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	memberNumber = lastMemberNumber;
	packageName = "1kg";
	
	for (int i = 1; i<=171; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
	
////Member 4 ////

	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	referrerId=lastMemberNumber;
	placementID=lastMemberNumber;
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500046";
	email = "dhinaplus65testing+500046@gmail.com";
	nationalId = "500046";
	
	adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
	adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	memberNumber = lastMemberNumber;
	packageName = "1kg";
	
	for (int i = 1; i<=171; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
	


}*/


@Test

public void addUsersForFiveStarManagerUseCase2() throws InterruptedException, SQLException {
/* //Five Star Users Case 3
//// Member 1 ////

subscriptionPack = "26";
fullName = "Dhinakaran500047";
String email = "dhinaplus65testing+500047@gmail.com";
String nationalId = "500047";


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

for (int i = 1; i<=171; i++)
{
	adminNavigation.buyPackageExistingMember(memberNumber, packageName);
}*/
	

//// Member 2 ////


String lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
System.out.println("Last Member Number in System =: "+ lastMemberNumber);

String referrerId=lastMemberNumber;
String placementID=lastMemberNumber;

subscriptionPack = "26";
fullName = "Dhinakaran500048";
String email = "dhinaplus65testing+500048@gmail.com";
String nationalId = "500048";

adminNavigation.isAtLoginPage();
adminNavigation.adminLogin(adminUserName, adminPassword, captcha);

/*adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);*/



lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
System.out.println("Last Member Number in System =: "+ lastMemberNumber);

String memberNumber = "GD07444965";

adminNavigation.clickOnMembersLink();

String packageName = "1kg";

for (int i = 1; i<=154; i++)
{
	adminNavigation.buyPackageExistingMember(memberNumber, packageName);
}

//// Member 3 ////

	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	referrerId=lastMemberNumber;
	placementID=lastMemberNumber;
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500049";
	email = "dhinaplus65testing+500049@gmail.com";
	nationalId = "500049";
	
	adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
	adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	memberNumber = lastMemberNumber;
	packageName = "1kg";
	
	for (int i = 1; i<=171; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
	
////Member 4 ////

	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	referrerId=lastMemberNumber;
	placementID=lastMemberNumber;
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500050";
	email = "dhinaplus65testing+500050@gmail.com";
	nationalId = "500050";
	
	adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
	adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	memberNumber = lastMemberNumber;
	packageName = "1kg";
	
	for (int i = 1; i<=171; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
	


}

@Test

public void addUsersForFiveStarManagerUseCase3() throws InterruptedException, SQLException {
 //Five Star Users Case 3
//// Member 1 ////

subscriptionPack = "26";
fullName = "Dhinakaran500051";
String email = "dhinaplus65testing+500051@gmail.com";
String nationalId = "500051";


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

for (int i = 1; i<=172; i++)
{
	adminNavigation.buyPackageExistingMember(memberNumber, packageName);
}
	

//// Member 2 ////


lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
System.out.println("Last Member Number in System =: "+ lastMemberNumber);

referrerId=lastMemberNumber;
placementID=lastMemberNumber;

subscriptionPack = "26";
fullName = "Dhinakaran500052";
email = "dhinaplus65testing+500052@gmail.com";
nationalId = "500052";

adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);

lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
System.out.println("Last Member Number in System =: "+ lastMemberNumber);

memberNumber = lastMemberNumber;
packageName = "1kg";

for (int i = 1; i<=172; i++)
{
	adminNavigation.buyPackageExistingMember(memberNumber, packageName);
}

//// Member 3 ////

	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	referrerId=lastMemberNumber;
	placementID=lastMemberNumber;
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500053";
	email = "dhinaplus65testing+500053@gmail.com";
	nationalId = "500053";
	
	adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
	adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	memberNumber = lastMemberNumber;
	packageName = "1kg";
	
	for (int i = 1; i<=171; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
	
////Member 4 ////

	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	referrerId=lastMemberNumber;
	placementID=lastMemberNumber;
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500054";
	email = "dhinaplus65testing+500054@gmail.com";
	nationalId = "500054";
	
	adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
	adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	memberNumber = lastMemberNumber;
	packageName = "1kg";
	
	for (int i = 1; i<=171; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
	


}


@Test

public void addUsersForFiveStarManagerUseCase4() throws InterruptedException, SQLException {
 //Five Star Users Case 3
//// Member 1 ////

subscriptionPack = "26";
fullName = "Dhinakaran500055";
String email = "dhinaplus65testing+500055@gmail.com";
String nationalId = "500055";


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

for (int i = 1; i<=172; i++)
{
	adminNavigation.buyPackageExistingMember(memberNumber, packageName);
}
	

//// Member 2 ////


lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
System.out.println("Last Member Number in System =: "+ lastMemberNumber);

referrerId=lastMemberNumber;
placementID=lastMemberNumber;

subscriptionPack = "26";
fullName = "Dhinakaran500056";
email = "dhinaplus65testing+500056@gmail.com";
nationalId = "500056";

adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);

lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
System.out.println("Last Member Number in System =: "+ lastMemberNumber);

memberNumber = lastMemberNumber;
packageName = "1kg";

for (int i = 1; i<=172; i++)
{
	adminNavigation.buyPackageExistingMember(memberNumber, packageName);
}

//// Member 3 ////

	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	referrerId=lastMemberNumber;
	placementID=lastMemberNumber;
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500057";
	email = "dhinaplus65testing+500057@gmail.com";
	nationalId = "500057";
	
	adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
	adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	memberNumber = lastMemberNumber;
	packageName = "1kg";
	
	for (int i = 1; i<=171; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
	
////Member 4 ////

	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	referrerId=lastMemberNumber;
	placementID=lastMemberNumber;
	
	subscriptionPack = "26";
	fullName = "Dhinakaran500058";
	email = "dhinaplus65testing+500058@gmail.com";
	nationalId = "500058";
	
	adminNavigation.createNewMemberAndEnterDetails(fullName, Gender, email, mobile, countryID, nationalId, state, city, address, postalCode, primaryPassword, secondaryPassword);
	adminNavigation.buyPackageForNewMemberWithoutDeductingSponsorCredit(referrerId, placementID, subscriptionPack, primaryPassword, secondaryPassword);
	
	lastMemberNumber = mySqlFunctions.runSelectQuery("SELECT * FROM users WHERE id = (SELECT MAX(id) FROM users )", dataBaseName, "member_number");
	System.out.println("Last Member Number in System =: "+ lastMemberNumber);
	
	memberNumber = lastMemberNumber;
	packageName = "1kg";
	
	for (int i = 1; i<=171; i++)
	{
		adminNavigation.buyPackageExistingMember(memberNumber, packageName);
	}
	


}

	
	
	
	

	
	


}
