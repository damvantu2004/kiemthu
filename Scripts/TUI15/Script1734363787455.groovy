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

WebUI.click(findTestObject('Object Repository/Page_zShop - Siu th k thut s My nh  Ph kin   cng/a_Fujifilm X-M5 (Chnh hng)'))

WebUI.click(findTestObject('Object Repository/Page_Fujifilm X-M5 (BlackSilver) Chnh hng  _656c31/span_Mua hng'))

WebUI.click(findTestObject('Object Repository/Page_Fujifilm X-M5 (BlackSilver) Chnh hng  _656c31/a_Xem gi hng'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/a_Fujifilm X-M5 (Chnh hng)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/div_Body Only  Black'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/strong_M'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/div_M X-M5_B'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/td_25,990,000'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/span_25,990,000'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/label_Mu Sc'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/img_Tng gi_det_img_2253224695'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/strong_M'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/span_X-M5_B'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/label_Ty Chn'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/select_Body Only                           _bc437f'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/label_Mu Sc'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/select_Black                               _20c3ee'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/h4_Qu tng'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/th_Sn phm'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/th_S lng'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/td_Th nh SDHC SanDisk Extreme Pro UHS-I 32G_0eedeb'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/td_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/th_n gi'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/span_25,990,000'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/bdi_25,990,000'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/th_S lng'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/input__cart_products2253224695amount'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/th_Tng gi'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/span_25,990,000_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/bdi_25,990,000'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/bdi_25,990,000'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/span_Tng'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/span_Tng chi ph'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ni dung gi hng/bdi_25,990,000'))

WebUI.closeBrowser()

