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

WebUI.navigateToUrl('https://zshop.vn/?fbclid=IwZXh0bgNhZW0CMTEAAR2YzA-5rjXtEhagtRNYCwuutGjC4um-pK1KAxZcbgm4HcWEJvUWZCJXEV4_aem_pkMnd_aeb2pYCwLmo4d5Ag')

WebUI.click(findTestObject('login/Page_zShop - Siu th k thut s My nh  Ph kin   cng/a_ng nhp'))

WebUI.click(findTestObject('login/Page_zShop - Siu th k thut s My nh  Ph kin   cng/i_'))

WebUI.setText(findTestObject('Object Repository/login/Page_zShop - Siu th k thut s My nh  Ph kin   cng/input_E-mail_user_login'), 
    email)

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_zShop - Siu th k thut s My nh  Ph kin   cng/input_Qun mt khu_password'), 
    matkhau)

WebUI.click(findTestObject('Object Repository/login/Page_zShop - Siu th k thut s My nh  Ph kin   cng/span_ng nhp'))

WebUI.closeBrowser()

