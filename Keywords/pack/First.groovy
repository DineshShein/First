package pack

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

@Keyword
public class First {
	String s1="Chennai"
	String s2="Chennai,Perungudi"
	public void Search(String username,String password){

		WebUI.navigateToUrl("https://qa.gsihealth.net/dashboard/")
		WebUI.maximizeWindow()

		WebUI.setText(findTestObject('Firsts/Username'), username)
		WebUI.setText(findTestObject('Firsts/Password'), password)
		WebUI.click(findTestObject('Firsts/Click'))

		WebUI.click(findTestObject('Object Repository/TestPath/Admin'))

		WebUI.click(findTestObject('Object Repository/TestPath/Update'))
	}
	public void Search2(String lastname,String firstname,String mail){
		WebUI.setText(findTestObject('Object Repository/TestPath/LastName'), lastname)
		WebUI.setText(findTestObject('Object Repository/TestPath/FirstName'), firstname)
		WebUI.setText(findTestObject('Object Repository/TestPath/Mail'), mail)
		WebUI.click(findTestObject('Object Repository/TestPath/Click_1'))
		WebUI.click(findTestObject('Object Repository/TestPath/Click_2'))
		WebUI.scrollToElement(findTestObject('Object Repository/TestPath/Address'), 1)
	}
	public void Search3(){
		WebUI.setText(findTestObject('Object Repository/TestPath/Address'), s1)
		WebUI.clearText(findTestObject('Object Repository/TestPath/Address'))
		WebUI.setText(findTestObject('Object Repository/TestPAth/Address'),s2)
		WebUI.click(findTestObject('Object Repository/TestPath/Save'))
		WebUI.click(findTestObject('Object Repository/TestPath/OK'))
	}
	public void Search4(){
		WebUI.setText(findTestObject('Object Repository/TestPath/Address'), s1)
		WebUI.click(findTestObject('Object Repository/TestPath/Save'))
		WebUI.click(findTestObject('Object Repository/TestPath/OK'))
	}
}
