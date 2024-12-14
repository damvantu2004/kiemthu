import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// Mở trình duyệt
WebUI.openBrowser('')

// Điều hướng đến trang chủ
WebUI.navigateToUrl('https://zshop.vn/')

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

// Kiểm tra danh mục Máy ảnh - Ống kính
WebUI.click(findTestObject('Object Repository/Page_kiemtra_danh_muc_sp/bdi_My nh - ng Knh'))
verifyCurrentUrl('https://zshop.vn/may-anh/')

// Kiểm tra danh mục Phụ kiện Máy ảnh
WebUI.click(findTestObject('Object Repository/Page_kiemtra_danh_muc_sp/bdi_Ph Kin My nh'))
verifyCurrentUrl('https://zshop.vn/phu-kien-may-anh/')

// Kiểm tra danh mục Apple
WebUI.click(findTestObject('Object Repository/Page_kiemtra_danh_muc_sp/bdi_Apple'))
verifyCurrentUrl('https://zshop.vn/apple/')

// Kiểm tra danh mục Máy tính - Laptop
WebUI.click(findTestObject('Object Repository/Page_kiemtra_danh_muc_sp/bdi_My tnh - Laptop'))
verifyCurrentUrl('https://zshop.vn/may-tinh-laptop/')

// Đóng trình duyệt
WebUI.closeBrowser()
