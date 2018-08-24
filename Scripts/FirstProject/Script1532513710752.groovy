import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
WebUI.openBrowser("https://qa.gsihealth.net/dashboard/")
WebUI.maximizeWindow()
static void Check1(String user,String pass)
{
	WebUI.setText(findTestObject('Object Repository/FirstProject/User' ),user )
	WebUI.setText(findTestObject('Object Repository/FirstProject/Pass'),pass )
	WebUI.click(findTestObject('Object Repository/FirstProject/DeliverQuality'))
	
	if (WebUI.verifyElementPresent(findTestObject('Object Repository/FirstProject/Homes'),0)) {
		WebUI.comment("LOGIN SUCCESSFUL")
	}
	else
	{
		WebUI.comment("NOT PRESENT")
	}
	
	WebUI.click(findTestObject('Object Repository/FirstProject/Logout'))
	WebUI.click(findTestObject('Object Repository/FirstProject/Yes'))
}
  Check1("gsi.qasuper@gsihealth.com","Test123#")
  
  WebUI.openBrowser("https://qa.gsihealth.net/dashboard/")
  WebUI.maximizeWindow()
  static void Check2(String user,String pass)
  {
	  WebUI.setText(findTestObject('Object Repository/FirstProject/User' ),user )
	  WebUI.setText(findTestObject('Object Repository/FirstProject/Pass'),pass )
	  WebUI.click(findTestObject('Object Repository/FirstProject/DeliverQuality'))
	  
	  WebUI.comment("FAILED.....")
	  
	  if(WebUI.verifyElementPresent(findTestObject('Object Repository/FirstProject/Click1') ,0))
	   {
		 WebUI.click(findTestObject('Object Repository/FirstProject/Click1'))
	   }
	   
	  WebUI.click(findTestObject('Object Repository/FirstProject/Logout'))
	  WebUI.click(findTestObject('Object Repository/FirstProject/Yes'))
  }
   Check2("gsi1.qasuper@gsihealth.com" ,"test123#")
 
