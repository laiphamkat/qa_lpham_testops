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

'step 3: At Page_home click on hyperlink_team_project_executions --> navigate to Page_executions'

testObj = findTestObject('Object Repository/Page_organization_home/hyperlink_team_project_executions')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/organization/.*/home(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_executions click on hyperlink_configurations --> navigate to Page_test-project'

testObj = findTestObject('Object Repository/Page_team_project_executions/hyperlink_configurations')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/executions/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page_test-project click on hyperlink_team_project_test_project'

testObj = findTestObject('Object Repository/Page_team_project_test-project/hyperlink_team_project_test_project_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/test-project(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page_test-project click on hyperlink_test_environments --> navigate to Page_agent'

testObj = findTestObject('Object Repository/Page_team_project_test-project/hyperlink_test_environments')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/test-project/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page_agent click on hyperlink_team_project_agent_k8s --> navigate to Page_agent_k8s'

testObj = findTestObject('Object Repository/Page_team_project_agent/hyperlink_team_project_agent_k8s')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/agent(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page_agent_k8s click on hyperlink_team_project_agent_circle_ci --> navigate to Page_agent_circle-ci'

testObj = findTestObject('Object Repository/Page_team_project_agent/hyperlink_team_project_agent_circle_ci')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/agent/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page_agent_circle-ci click on hyperlink_team_project_agent_test_cloud --> navigate to Page_agent_test-cloud'

testObj = findTestObject('Object Repository/Page_team_project_agent_circle-ci/hyperlink_team_project_agent_test_cloud')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/agent/circle-ci(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: Add visual checkpoint at Page_agent_test-cloud'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00076_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
