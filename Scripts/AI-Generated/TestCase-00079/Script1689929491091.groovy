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

'step 4: At Page_project click on hyperlink_configurations --> navigate to Page_test-project'

testObj = findTestObject('Object Repository/Page_team_project/hyperlink_configurations')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page_test-project click on hyperlink_connect_git_script_repository --> navigate to Page_git-test-project_setup'

testObj = findTestObject('Object Repository/Page_team_project_test-project/hyperlink_connect_git_script_repository')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/test-project(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page_git-test-project_setup click on div_object'

testObj = findTestObject('Object Repository/Page_team_project_git-test-project_setup/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/git-test-project/setup(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page_git-test-project_setup click on div_object'

testObj = findTestObject('Object Repository/Page_team_project_git-test-project_setup/div_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/git-test-project/setup(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page_git-test-project_setup click on div_object'

testObj = findTestObject('Object Repository/Page_team_project_git-test-project_setup/div_object_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/git-test-project/setup(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page_git-test-project_setup click on button_object --> navigate to Page_test-project'

testObj = findTestObject('Object Repository/Page_team_project_git-test-project_setup/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/git-test-project/setup(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: At Page_test-project click on hyperlink_executions --> navigate to Page_test-planning'

testObj = findTestObject('Object Repository/Page_team_project_test-project/hyperlink_executions')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/test-project/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 11: At Page_test-planning click on hyperlink_test_run_list --> navigate to Page_grid'

testObj = findTestObject('Object Repository/Page_team_project_test-planning/hyperlink_test_run_list')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/test-planning(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 12: At Page_grid click on hyperlink_team_project_grid_plan_job --> navigate to Page_job'

testObj = findTestObject('Object Repository/Page_team_project_grid/hyperlink_team_project_grid_plan_job')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/grid(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 13: At Page_job click on hyperlink_team_project_grid_plan_job_summary --> navigate to Page_job_summary'

testObj = findTestObject('Object Repository/Page_team_project_grid_plan_job/hyperlink_object_3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/grid/plan/.*/job(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 14: At Page_job_summary click on hyperlink_team_project_grid_plan_job_session --> navigate to Page_job_session'

testObj = findTestObject('Object Repository/Page_team_project_grid_plan_job_summary/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), '.*/team/.*/project/.*/grid/plan/.*/job/summary(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 15: Add visual checkpoint at Page_job_session'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00079_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
