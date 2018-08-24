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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Object Repository/Log_in/Page_Sign in - Google Accounts/input_identifier'), 'dineshr@kctechservices.com')

WebUI.click(findTestObject('Object Repository/Log_in/Page_Sign in - Google Accounts/content_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Log_in/Page_Sign in - Google Accounts/input_password'), 'xbF8gtRCNw+Z0xtf1SnR+w==')

WebUI.click(findTestObject('Object Repository/Log_in/Page_Sign in - Google Accounts/content_Next'))

WebUI.click(findTestObject('Object Repository/Log_in/Page_Inbox - dineshrkctechservices./td_Katalon Team Welcome to Kat'))

WebUI.closeBrowser()

WebUI.verifyElementPresent(findTestObject(null), 0)

