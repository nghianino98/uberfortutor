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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://uberfortutor-react-staging.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_Gia S/b_Xem tt c k nng'))

WebUI.click(findTestObject('Object Repository/Page_Gia S/div_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_Gia S/input__email'), 'nyz15368@zzrgg.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Gia S/input__password'), 'zoM5qQG1dRNoNFvhmlgp8A==')

WebUI.click(findTestObject('Object Repository/Page_Gia S/button_ng nhp'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Page_Gia S/span_Hp ng hc'))

WebUI.click(findTestObject('Object Repository/Page_Gia S/button_Bt k'))

WebUI.click(findTestObject('Object Repository/Page_Gia S/button_ t chi'))

WebUI.click(findTestObject('Object Repository/Page_Gia S/i_Danh sch hp ng rng'))

WebUI.closeBrowser()

