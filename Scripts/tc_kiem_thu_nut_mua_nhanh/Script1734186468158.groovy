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

WebUI.click(findTestObject('Object Repository/Page_mua nhanh/img_Sp Ra Mt_det_img_18800066732'))

WebUI.click(findTestObject('Object Repository/Page_mua nhanh/span_Mua nhanh'))

WebUI.setText(findTestObject('Object Repository/Page_mua nhanh/input_H v Tn ca bn_call_dataname'), 'Hưng Phúc')

WebUI.setText(findTestObject('Object Repository/Page_mua nhanh/input_in thoi_call_dataphone'), '0987654321')

WebUI.setText(findTestObject('Object Repository/Page_mua nhanh/input_a ch_call_dataaddress'), '10 Trần Đại Nghĩa, HBT, Hà Nội')

WebUI.setText(findTestObject('Object Repository/Page_mua nhanh/input_E-mail_call_dataemail2'), 'hqr@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_mua nhanh/input_Xc nhn chng bot_native_captcha_response'), '')

WebUI.click(findTestObject('Object Repository/Page_mua nhanh/button_Gi'))

