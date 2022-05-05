package step_definitions;

import io.cucumber.java.en.Given;
import org.testng.Assert;
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

import java.util.HashMap;

public class BaseStepDefinitions extends KeywordUtil {

    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    @Given("Read test data {string} and {string} from Excel file")
    public void readTestDataAndFromExcelFile(String sheetName, String testCaseID) {
        try {
            KeywordUtil.cucumberTagName = "Web";
            dataMap = ExcelDataUtil.getTestDataWithTestCaseID(sheetName, testCaseID);

        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
}
