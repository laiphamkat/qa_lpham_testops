import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_login'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/login')

'step 2: Login at https://testops.staging.katalon.com/login --> navigate to Page_home'

'--> At login page input username'

testObj = findTestObject('Object Repository/Page_login/input_username')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, GlobalVariable.username)

'--> At login page input password'

testObj = findTestObject('Object Repository/Page_login/input_password')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, GlobalVariable.password)

'--> At login page submit login form'

testObj = findTestObject('Object Repository/Page_login/form_login_info')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.submit(testObj)

'--> Wait for login action to be completed'

WebUI.delay(15)

'step 3: At Page_home click on hyperlink_team_project --> navigate to Page_project'

testObj = findTestObject('Object Repository/Page_organization_home/hyperlink_team_project')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/organization/.*/home(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_project click on hyperlink_tests --> navigate to Page_test-design_test-cases'

testObj = findTestObject('Object Repository/Page_team_project/hyperlink_tests')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page_test-design_test-cases click on div_root_uploaded_data'

testObj = findTestObject('Object Repository/Page_team_project_test-design_test-cases/div_root_uploaded_data')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/test-design/test-cases(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page_test-design_test-cases click on div_1743680'

testObj = findTestObject('Object Repository/Page_team_project_test-design_test-cases/div_1743680')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/test-design/test-cases(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page_test-design_test-cases click on hyperlink_test_case_detail --> navigate to Page_test-design_test-cases-sample-tc'

testObj = findTestObject('Object Repository/Page_team_project_test-design_test-cases/hyperlink_test_case_detail')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/test-design/test-cases(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page_test-design_test-cases-sample-tc click on button_object --> navigate to Page_test-design_test-cases'

testObj = findTestObject('Object Repository/Page_team_project_test-design_test-cases/button_object_22')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/test-design/test-cases/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page_test-design_test-cases click on hyperlink_executions --> navigate to Page_test-planning'

testObj = findTestObject('Object Repository/Page_team_project_test-design_test-cases/hyperlink_executions')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/test-design/test-cases(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: At Page_test-planning click on hyperlink_configurations --> navigate to Page_test-project'

testObj = findTestObject('Object Repository/Page_team_project_test-planning/hyperlink_configurations')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/test-planning(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 11: At Page_test-project click on hyperlink_team_project_test_project'

testObj = findTestObject('Object Repository/Page_team_project_test-project/hyperlink_team_project_test_project')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/test-project(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 12: At Page_test-project click on button_refresh_test_suite_collection'

testObj = findTestObject('Object Repository/Page_team_project_test-project/button_refresh_test_suite_collection')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/test-project/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 13: At Page_test-project click on hyperlink_testcloud_tunnels --> navigate to Page_testCloudTunnel'

testObj = findTestObject('Object Repository/Page_team_project_test-project/hyperlink_testcloud_tunnels')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/test-project/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 14: Add visual checkpoint at Page_testCloudTunnel'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00071_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
