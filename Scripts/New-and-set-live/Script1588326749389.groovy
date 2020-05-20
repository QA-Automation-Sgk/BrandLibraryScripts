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

WebUI.comment('Login')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://encorebeta.vcg-online.net/User/Login?ReturnUrl=%2f')

WebUI.setText(findTestObject('Object Repository/Page_Encore/input_Username_UserID'), 'katalon@v.com')

'Testing123'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Encore/input_Password_Password'), '3Z9vEXbPUsD5eDQOwLR1+w==')

WebUI.click(findTestObject('Object Repository/Page_Encore/input_Remember Me_green-button'))

WebUI.comment('Select KJ')

WebUI.setText(findTestObject('Page_Home  Encore/HomeGridSearch'), ClientName)

WebUI.verifyElementText(findTestObject('Page_Home  Encore/td_VerifyClientName'), ClientName)

GetKJNum = WebUI.getText(findTestObject('Page_Home  Encore/GetKJValue'))

WebUI.click(findTestObject('Page_Home  Encore/a_ClickOnKJ'))

WebUI.comment('Create a KSJ')

WebUI.click(findTestObject('Page_KJ_Encore/a_Products'))

WebUI.click(findTestObject('Page_KJ_Encore/a_Add'))

WebUI.click(findTestObject('Page_KJ_Encore/a_Add KSJ'))

WebUI.setText(findTestObject('Page_KJ_Encore/input__SubJobName'), SubJobName)

WebUI.selectOptionByValue(findTestObject('Page_KJ_Encore/select_reasonforartwork'), '60', true)

WebUI.click(findTestObject('Page_KSJ_Encore/input_Chargeable_SubJobIsChargeable'))

WebUI.click(findTestObject('Page_KSJ_Encore/input_Core Service Order_SubJobPartNumber'))

WebUI.setText(findTestObject('Page_KSJ_Encore/input_Core Service Order_SubJobPartNumber'), ServiceOrder)

WebUI.click(findTestObject('Page_KJ_Encore/input_create_subjob'))

WebUI.verifyElementPresent(findTestObject('Page_KSJ_Encore/td_VerifyKSJcreated_Pending'), 20)

WebUI.comment('Set Workflow live booking Ref')

WebUI.click(findTestObject('Page_KSJ_Encore/a_EditBookingRefButton'))

WebUI.click(findTestObject('Page_KSJ_Encore/input_NA_BookingInfo0NotApplicable'))

WebUI.click(findTestObject('Page_KSJ_Encore/input_NA_BookingInfo1NotApplicable'))

WebUI.click(findTestObject('Page_KSJ_Encore/input_NA_BookingInfo2NotApplicable'))

WebUI.click(findTestObject('Page_KSJ_Encore/input_NA_BookingInfo3NotApplicable'))

WebUI.click(findTestObject('Page_KSJ_Encore/input_NA_BookingInfo4NotApplicable'))

WebUI.click(findTestObject('Page_KSJ_Encore/input_Bookinginfo-Ok-button'))

WebUI.comment('Set workflowlive Brief')

WebUI.click(findTestObject('Page_KSJ_Encore/KSJ Brief Tab'))

WebUI.click(findTestObject('Page_KSJ_Encore/a_Add SubJob Brief'))

WebUI.click(findTestObject('Page_KSJ_Encore/BriefBody'))

WebUI.setText(findTestObject('Page_KSJ_Encore/BriefBody'), 'test')

WebUI.click(findTestObject('Page_KSJ_Encore/a_Brief-Ok-button'))

not_run: WebUI.comment('Upload Asset Files')

not_run: WebUI.click(findTestObject('Page_KSJ_Encore/KSJ Asset Tab'))

not_run: WebUI.click(findTestObject('Page_KSJ_Encore/open-original-files-assettab'))

not_run: WebUI.rightClick(findTestObject('Page_KSJ_Encore/a_ArtworkPDFFolder'))

not_run: WebUI.click(findTestObject('Page_KSJ_Encore/a_rightclick-ToUploadfiles'))

not_run: WebUI.uploadFile(findTestObject('Page_KSJ_Encore/input_Select Files_toupload'), 'C:\\Users\\papa.danso\\Desktop\\katalonfiles\\Artwork.jpg')

not_run: WebUI.click(findTestObject('Page_KSJ_Encore/bt_UploadFile'))

not_run: WebUI.rightClick(findTestObject('Page_KSJ_Encore/a_SignoffPDFFolder'))

not_run: WebUI.click(findTestObject('Page_KSJ_Encore/a_rightclick-ToUploadfiles'))

not_run: WebUI.uploadFile(findTestObject('Page_KSJ_Encore/input_Select Files_toupload'), 'C:\\Users\\papa.danso\\Desktop\\katalonfiles\\signoff.pdf')

not_run: WebUI.click(findTestObject('Page_KSJ_Encore/bt_UploadFile'))

not_run: WebUI.comment('Rename Artwork image file')

not_run: GetKSJNum = WebUI.getText(findTestObject('Page_KSJ_Encore/a_GetKSJNumber'))

not_run: getsignKSJ = GetKSJNum

not_run: getsignKJ = GetKJNum

not_run: WebUI.rightClick(findTestObject('Page_KSJ_Encore/a_Artworkjpg-Uploadedfile'))

not_run: WebUI.click(findTestObject('Page_KSJ_Encore/a_Select-RenameUploadedFiles'))

not_run: WebUI.clearText(findTestObject('Page_KSJ_Encore/input_RenameTextBox'))

not_run: WebUI.delay(2)

not_run: namedfile = ((GetKJNum.trim() + '_') + GetKSJNum.trim())

not_run: WebUI.setText(findTestObject('Page_KSJ_Encore/input_RenameTextBox'), namedfile)

not_run: WebUI.click(findTestObject('Page_KSJ_Encore/input_renamefile-Ok-button'))

not_run: WebUI.comment('Rename SignOff PDF')

not_run: WebUI.rightClick(findTestObject('Page_KSJ_Encore/a_Signoffpdf-Uploadedfile'))

not_run: WebUI.click(findTestObject('Page_KSJ_Encore/a_Select-RenameUploadedFiles'))

not_run: WebUI.clearText(findTestObject('Page_KSJ_Encore/input_RenameTextBox'))

not_run: WebUI.delay(2)

not_run: signoffpdf = (((getsignKJ.trim() + '_') + getsignKSJ.trim()) + '_v1-1')

not_run: WebUI.setText(findTestObject('Page_KSJ_Encore/input_RenameTextBox'), signoffpdf)

not_run: WebUI.click(findTestObject('Page_KSJ_Encore/input_renamefile-Ok-button'))

not_run: WebUI.comment('Start and Complete Stage')

not_run: WebUI.rightClick(findTestObject('Page_KSJ_Encore/div_QA1_Stage'))

not_run: WebUI.click(findTestObject('Page_KSJ_Encore/WF_Stage_Start'))

not_run: WebUI.rightClick(findTestObject('Page_KSJ_Encore/div_QA1_Stage'))

not_run: WebUI.click(findTestObject('Page_KSJ_Encore/WF_Stage_Complete'))

not_run: WebUI.delay(2)

WebUI.comment('Clean up')

WebUI.click(findTestObject('Page_Home  Encore/a_Home'))

WebUI.clearText(findTestObject('Page_Home  Encore/HomeGridSearch'))

WebUI.closeBrowser()

