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

WebUI.mouseOver(findTestObject('Object Repository/Page_iphone_16_series/Page_zShop - Siu th k thut s My nh  Ph kin   cng/bdi_Apple'))

WebUI.click(findTestObject('Object Repository/Page_iphone_16_series/Page_Apple Store Chnh hng  Trung tm mua sm zShop/bdi_iPhone 16 Series'))

WebUI.click(findTestObject('Object Repository/Page_iphone_16_series/Page_iPhone 16 Series Chnh hng Gi Tt - Tr Gp 0/img__det_img_66920'))

WebUI.takeScreenshotAsCheckpoint('ui_iphone_16_pro_max_nhap_khau')

WebUI.closeBrowser()

