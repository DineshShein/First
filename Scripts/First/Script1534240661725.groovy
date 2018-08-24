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

WebUI.openBrowser("https://dev.gsihealth.net/dashboard/")
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Firsts/Username'),"gsi.qasuper@gsihealth.com")
WebUI.setText(findTestObject('Object Repository/Firsts/Password'), "Test123#")
WebUI.click(findTestObject('Object Repository/Firsts/Click'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Firsts/CarePlan'), 10)
WebUI.click(findTestObject('Object Repository/Firsts/CarePlan'))

WebUI.switchToWindowIndex(1)
WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/Firsts/PatientSearch'), 10)
WebUI.click(findTestObject('Object Repository/Firsts/PatientSearch'))
WebUI.setText(findTestObject('Object Repository/Firsts/PatientID'),"1032616")
WebUI.click(findTestObject('Object Repository/Firsts/LookUP'))
WebUI.click(findTestObject('Object Repository/Firsts/EncounterInformation'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Firsts/CCP'), 10)
WebUI.click(findTestObject('Object Repository/Firsts/CCP'))

WebUI.click(findTestObject('Object Repository/Firsts/CreateNewCCp'))
WebUI.setText(findTestObject('Object Repository/Firsts/NeedTitle'),"FirstTitle")
WebUI.click(findTestObject('Object Repository/Firsts/EducationRadio'))
WebUI.click(findTestObject('Object Repository/Firsts/Status'))
WebUI.click(findTestObject('Object Repository/Firsts/Complete'))

WebUI.click(findTestObject('Object Repository/Firsts/CareTeamMemberPriority'))
WebUI.click(findTestObject('Object Repository/Firsts/High'))
WebUI.click(findTestObject('Object Repository/Firsts/EnCounter'))


WebUI.click(findTestObject('Object Repository/Firsts/AddGoal'))
WebUI.click(findTestObject('Object Repository/Firsts/Type'))
WebUI.click(findTestObject('Object Repository/Firsts/ShortTermGoal'))
WebUI.click(findTestObject('Object Repository/Firsts/StatusGoal'))
WebUI.click(findTestObject('Object Repository/Firsts/Achived'))
WebUI.setText(findTestObject('Object Repository/Firsts/ObjectiveGoal'),"MyFirstGoals")
WebUI.click(findTestObject('Object Repository/Firsts/StartDate'))
WebUI.setText(findTestObject('Object Repository/Firsts/StartText'), "01-Aug-2018")
WebUI.click(findTestObject('Object Repository/Firsts/EndDate'))
WebUI.setText(findTestObject('Object Repository/Firsts/EndText'), "10-Aug-2018")
WebUI.click(findTestObject('Object Repository/Firsts/Button'))

WebUI.scrollToElement(findTestObject('Object Repository/Firsts/Intervention'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Firsts/Intervention'), 0)
WebUI.click(findTestObject('Object Repository/Firsts/Intervention'))
WebUI.click(findTestObject('Object Repository/Firsts/StartDateIntervention'))
WebUI.setText(findTestObject('Object Repository/Firsts/IntervenstionStartText'), "02-Aug-2018")
WebUI.click(findTestObject('Object Repository/Firsts/EndDateIntervention'))
WebUI.setText(findTestObject('Object Repository/Firsts/InterventionEndText'), "11-Aug-2018")
WebUI.click(findTestObject('Object Repository/Firsts/InterventionStatus'))
WebUI.click(findTestObject('Object Repository/Firsts/InterventionComplete'))
WebUI.setText(findTestObject('Object Repository/Firsts/InterventionTextArea'), "My First Intervention.")
WebUI.click(findTestObject('Object Repository/Firsts/LinkGoal'))
WebUI.click(findTestObject('Object Repository/Firsts/InterventionSubmit'))
WebUI.click(findTestObject('Object Repository/Firsts/CCPSubmit'))
WebUI.click(findTestObject('Object Repository/Firsts/IssueOk'))