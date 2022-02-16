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

WebUI.navigateToUrl('http://121.40.154.50:8049/login')

WebUI.setText(findTestObject('Object Repository/Page_Zetta Decision/input_Name_loginName'), '13666666666')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Zetta Decision/input_Password_loginPwd'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Zetta Decision/button_'))

WebUI.click(findTestObject('删除业务模型/Page_Zetta Decision/span__1 - Copy'))

'删除user主体'
WebUI.click(findTestObject('删除业务模型/Page_Zetta Decision/删除主体'))

WebUI.clickOffset(findTestObject('删除业务模型/Page_Zetta Decision/删除主体_1'), 0, 0)

WebUI.clickOffset(findTestObject('删除业务模型/Page_Zetta Decision/删除主体_1 - Copy'), 0, 0)

'删除视频主体'
WebUI.click(findTestObject('删除业务模型/Page_Zetta Decision/删除视频主体'))

WebUI.clickOffset(findTestObject('删除业务模型/Page_Zetta Decision/删除视频主体_1'), 0, 0)

WebUI.clickOffset(findTestObject('删除业务模型/Page_Zetta Decision/删除主体_1 - Copy - Copy'), 0, 0)

'验证user被删除'
WebUI.verifyElementNotPresent(findTestObject('删除业务模型/Page_Zetta Decision/验证user主体'), 5)

'验证user被删除'
WebUI.verifyElementNotPresent(findTestObject('删除业务模型/Page_Zetta Decision/验证视频主体'), 5)

