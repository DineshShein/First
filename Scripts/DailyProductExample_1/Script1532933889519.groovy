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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser("https://qa.gsihealth.net/dashboard/")
WebUI.maximizeWindow()

WebUI.setText(findTestObject('null'), "gsi.qasuper@gsihealth.com")
WebUI.setText(findTestObject('null'), "Test123#")
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/DailyProduct/AdminAPP'))
WebUI.click(findTestObject('Object Repository/DailyProduct/UpdateUser'))
WebUI.setText(findTestObject('Object Repository/DailyProduct/LastName'),"r")
WebUI.setText(findTestObject('Object Repository/DailyProduct/FirstName'),"din")
WebUI.setText(findTestObject('Object Repository/DailyProduct/EMail'),"din@gsihealth.com")
WebUI.click(findTestObject('Object Repository/DailyProduct/Search'))
WebUI.click(findTestObject('Object Repository/DailyProduct/Click_1'))
WebUI.scrollToElement(findTestObject('Object Repository/DailyProduct/Address1'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/DailyProduct/Address1'), 0)
WebUI.clearText(findTestObject('Object Repository/DailyProduct/Address1'))
WebUI.setText(findTestObject('Object Repository/DailyProduct/Address1'), "chennai")
WebUI.click(findTestObject('Object Repository/DailyProduct/Click_2'))
WebUI.click(findTestObject('Object Repository/DailyProduct/Ok'))
WebUI.setText(findTestObject('Object Repository/DailyProduct/LastName'), "r")
WebUI.setText(findTestObject('Object Repository/DailyProduct/FirstName'), "din")
WebUI.setText(findTestObject('Object Repository/DailyProduct/EMail'), "din@gsihealth.com")
WebUI.click(findTestObject('Object Repository/DailyProduct/Search'))
WebUI.click(findTestObject('Object Repository/DailyProduct/Click_1'))
WebUI.scrollToElement(findTestObject('Object Repository/DailyProduct/Address1'), 0)
