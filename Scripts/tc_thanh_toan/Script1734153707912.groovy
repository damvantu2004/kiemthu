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

WebUI.navigateToUrl('https://zshop.vn/')
void verifyCurrentUrl(String expectedUrl) {
	String actualUrl = WebUI.getUrl()

	if (actualUrl == expectedUrl) {
		WebUI.comment('URL is correct: ' + actualUrl)
	} else {
		WebUI.comment((('Expected URL: ' + expectedUrl) + ' but found: ') + actualUrl)

		WebUI.verifyEqual(actualUrl, expectedUrl, FailureHandling.STOP_ON_FAILURE)
	}
}
WebUI.click(findTestObject('Object Repository/Page_thanhtoan/img_Ph kin my nh_det_img_21900059832'))

WebUI.click(findTestObject('Object Repository/Page_thanhtoan/span_Mua hng'))

WebUI.click(findTestObject('Object Repository/Page_thanhtoan/span_Tip tc mua hng'))

WebUI.click(findTestObject('Object Repository/Page_thanhtoan/span_Mua hng'))

WebUI.click(findTestObject('Object Repository/Page_thanhtoan/span_Tip tc mua hng'))

WebUI.click(findTestObject('Object Repository/Page_thanhtoan/img_KHCH THNG MUA THM_ty-pict   cm-image ls_51fc65'))

WebUI.click(findTestObject('Object Repository/Page_thanhtoan/span_Mua hng (1)'))

WebUI.click(findTestObject('Object Repository/Page_thanhtoan/span_Xem gi hng'))

WebUI.click(findTestObject('Object Repository/Page_thanhtoan/a_Tin hnh thanh ton'))
verifyCurrentUrl('https://zshop.vn/checkout-checkout.html')
WebUI.delay(2)
WebUI.closeBrowser()


