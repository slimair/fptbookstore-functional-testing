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

//1. Open a browser: Chrome

//2. Navigate to URL: 'http://masa.slimair.cool/'

//3. Scroll down to "Join with FPT email" button

//3. Hit the "Join with FPT email" button

//4. Fill in the email on the email input
WebUI.setText(findTestObject('Masa_Manual_Final/Masa_Login/input_Email_email'), 'katalontestingse1504@gmail.com')
WebUI.delay(1)

//5. Hit the "Tiếp theo" button
WebUI.click(findTestObject('Masa_Manual_Final/Masa_Login/button_Email_next'))

//6.1 Fill in the password on the email input (Encrypted password - explanation)
WebUI.setEncryptedText(findTestObject('Masa_Manual_Final/Masa_Login/input_Password_password'), 'jknRhYAj/6Z7301WMXOrqA==')
WebUI.delay(1)

//6.2 Fill in the password on the email iput (Text password)
/*
WebUI.click(findTestObject('Masa_Manual_Final/Masa_Login/checkbox_Password_show'))
WebUI.delay(1)
WebUI.setText(findTestObject('Masa_Manual_Final/Masa_Login/input_Password_password'), 'ktse1504.')
WebUI.delay(1)
*/

//7. Hit the "Tiếp theo" button
WebUI.click(findTestObject('Masa_Manual_Final/Masa_Login/button_Password_next'))

//8. Hit the "Your meeting" button
WebUI.delay(5)
WebUI.click(findTestObject('Masa_Manual_Final/Masa_Meeting_View/button_YourMeetings'))

//9. Close the browser
