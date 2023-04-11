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

WebUI.click(findTestObject('Object Repository/Register/a_Daftar'))

WebUI.setText(findTestObject('Object Repository/Register/input_username'), 'Kiki Sahnakrii Project_2')

WebUI.setText(findTestObject('Object Repository/Register/input_email'), 'tugassproject_dua@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/input_password'), 'xs6L6O8U1Hc2M5eYm7xT2A==')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/input_konfirmasi_password'), 'xs6L6O8U1Hc2M5eYm7xT2A==')

WebUI.click(findTestObject('Register/button_daftar'))

WebUI.click(findTestObject('Register/dropdown_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Register/redirect_profile'))

WebUI.verifyElementText(findTestObject('Register/verify_success_created_user'), 'Tutorial yang ikuti')

WebUI.takeFullPageScreenshot([], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

