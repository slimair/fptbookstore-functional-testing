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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://FptBookTest:80')

WebUI.navigateToUrl('http://FptBookTest:80')

WebUI.maximizeWindow()

WebUI.click(findTestObject('FptBook_Product_Cart_Repo/Page_Home  FptBookStore/a_Login'))

WebUI.setText(findTestObject('FptBook_Product_Cart_Repo/Page_Home  FptBookStore/input_Email_Input.Email'), 'phuongnnse@fpt.edu.vn')

WebUI.setEncryptedText(findTestObject('FptBook_Product_Cart_Repo/Page_Home  FptBookStore/input_Password_Input.Password'), 
    'rBiF04Ek6lW1rw3U6XrRJA==')

WebUI.click(findTestObject('FptBook_Product_Cart_Repo/Page_Home  FptBookStore/button_Log in'))

WebUI.delay(5)

WebUI.navigateToUrl('http://FptBookTest:80/Customer/Cart')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('FptBook_Product_Cart_Repo/Page_Home  FptBookStore/empty_product_Cart'), 0)

WebUI.click(findTestObject('FptBook_Product_Cart_Repo/Page_Home  FptBookStore/empty_product_Cart'))

WebUI.takeElementScreenshotAsCheckpoint('report_Empty_Cart', findTestObject('FptBook_Product_Cart_Repo/Page_Home  FptBookStore/empty_product_Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home  FptBookStore/p_There is no item in the shopping cart'), 
    'There is no item in the shopping cart')

@TearDown
def tearDown() {
    WebUI.closeBrowser()
}

