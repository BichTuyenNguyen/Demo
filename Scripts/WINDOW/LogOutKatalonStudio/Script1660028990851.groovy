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

Windows.startApplicationWithTitle('C:\\Users\\tuyen.nguyen\\Documents\\Katalon_Studio_Windows_64-8.4.1\\katalon.exe', 'Katalon')

// wait for application ready
def isLoginPopUpPresent = true
WebUI.delay(10)


//try{
//	Windows.waitForElementPresent(findWindowsObject('Object Repository/WINDOW/TitleBar'), 25)}
//catch (StepFailedException ex) {
//	isLoginPopUpPresent = false
//	println ex
//}

if(isLoginPopUpPresent) {
	//logout
	Windows.click(findWindowsObject('Object Repository/WINDOW/SplitButton'))
	
	Windows.click(findWindowsObject('Object Repository/WINDOW/MenuItem'))
	
	Windows.verifyElementPresent(findWindowsObject('TitleBar'), 25)
}
else {

	Windows.setText(findWindowsObject('Object Repository/WINDOW/Edit'), 'tuyen.nguyen@katalon.com')
	
	Windows.setEncryptedText(findWindowsObject('Edit(1)'), 'CkvKh4ec5baDmwWdCNAByg==')
	
	Windows.click(findWindowsObject('Object Repository/WINDOW/Button'))
	
	WebUI.delay(2)
	
	// logout
	Windows.click(findWindowsObject('Object Repository/WINDOW/SplitButton'))
	
	Windows.click(findWindowsObject('Object Repository/WINDOW/MenuItem'))
	
	Windows.verifyElementPresent(findWindowsObject('TitleBar'), 25)
}

WebUI.delay(2)

Windows.closeApplication()

