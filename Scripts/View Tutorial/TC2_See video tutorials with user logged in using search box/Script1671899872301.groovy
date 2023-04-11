import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://vulnqa.cilsy.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Login/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Login/inputl_email'), 'kikiproject2@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/input_password'), 'xs6L6O8U1Hc2M5eYm7xT2A==')

WebUI.click(findTestObject('Login/button_masuk'))

WebUI.setText(findTestObject('View Tutorial/input_search box'), 'Tutorial mastering')

'\r\n'
WebUI.click(findTestObject('View Tutorial/click_icon search'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('View Tutorial/click_result item'))

WebUI.click(findTestObject('View Tutorial/click_icon play video'))

WebUI.takeFullPageScreenshot([], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

