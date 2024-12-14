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

WebUI.callTestCase(findTestCase('tc_kiem_thu_thanh_loc2'), [:], FailureHandling.STOP_ON_FAILURE)
// Hàm kiểm tra URL
void verifyCurrentUrl(String expectedUrl) {
	String actualUrl = WebUI.getUrl()
	if (actualUrl == expectedUrl) {
		WebUI.comment('URL is correct: ' + actualUrl)
	} else {
		WebUI.comment('Expected URL: ' + expectedUrl + ' but found: ' + actualUrl)
		WebUI.verifyEqual(actualUrl, expectedUrl, FailureHandling.STOP_ON_FAILURE)
	}
}
WebUI.click(findTestObject('Page_kiem_thu_thanh_loc3/a_Thit lp li'))
WebUI.delay(3)
verifyCurrentUrl('https://zshop.vn/khuyen-mai/')

WebUI.closeBrowser()

