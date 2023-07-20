import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_api_v1_katone_page_organization-home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/api/v1/katone/page/organization-home')

'step 2: Add visual checkpoint at Page_api_v1_katone_page_organization-home'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00083_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
