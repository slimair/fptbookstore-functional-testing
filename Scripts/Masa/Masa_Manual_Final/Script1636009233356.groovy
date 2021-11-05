import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.TearDown as TearDown
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as Keys
import org.openqa.selenium.remote.server.handler.FindElement as FindElement

WebUI.openBrowser('')

WebUI.navigateToUrl('http://masa.slimair.cool/')

WebUI.scrollToElement(findTestObject('Object Repository/Masa_Manual_Final/Masa_Login/button_Login'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Masa_Manual_Final/Masa_Login/button_Login'))

WebUI.setText(findTestObject('Object Repository/Masa_Manual_Final/Masa_Login/input_Email_email'), 'katalontestingse1504@gmail.com')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Masa_Manual_Final/Masa_Login/button_Email_next'))

//WebUI.click(findTestObject('Object Repository/Masa/checkbox_Password_show'))
//WebUI.setText(findTestObject('Object Repository/Masa/input_Password_password'), 'ktse1504.')
WebUI.setEncryptedText(findTestObject('Object Repository/Masa/input_Password_password'), 'jknRhYAj/6Z7301WMXOrqA==')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Masa_Manual_Final/Masa_Login/button_Password_next'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Masa_Manual_Final/Masa_Meeting_Create/button_Create'))

WebUI.delay(3)

name = 'Demo SWT301'

WebUI.setText(findTestObject('Object Repository/Masa_Manual_Final/Masa_Meeting_Create/input_Meeting_title'), name)


WebUI.click(findTestObject('Object Repository/Masa_Manual_Final/Masa_Meeting_Create/input_Meeting_toDate'))

WebUI.setText(findTestObject('Object Repository/Masa_Manual_Final/Masa_Meeting_Create/input_Meeting_toDate'), '11/11/2021')

WebUI.delay(2)

CustomKeywords.'com.phuong.masa.MeetingPlatform.getPlatform'('Google Meet')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Masa_Manual_Final/Masa_Meeting_Create/symbol_Notification_close'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Object Repository/Masa_Manual_Final/Masa_Meeting_Create/input_Meeting_content'))

WebUI.setText(findTestObject('Object Repository/Masa_Manual_Final/Masa_Meeting_Create/input_Meeting_content'), 'This is the content of Demo SWT301')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Masa_Manual_Final/Masa_Meeting_Create/button_Meeting_create'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Masa_Manual_Final/Masa_Meeting_View/button_Home'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Masa_Manual_Final/Masa_Meeting_View/button_YourMeetings'))

WebUI.delay(3)

// chỉnh phần object repository
WebUI.verifyElementText(findTestObject('Object Repository/Masa_Manual_Final/Masa_Meeting_View/h1_View_Meeting'), name)

System.out.println('They are equal')

@TearDown
def onFailure() {
    WebUI.closeBrowser()
}

