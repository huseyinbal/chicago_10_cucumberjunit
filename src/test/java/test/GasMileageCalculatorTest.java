package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.GasMileageCalculatorPage;
import utilities.Config;
import utilities.Driver;

import java.io.FileInputStream;
import java.text.DecimalFormat;

import static java.util.concurrent.TimeUnit.SECONDS;

public class GasMileageCalculatorTest {

    GasMileageCalculatorPage gasObj;
    private WebDriver driver;

    XSSFWorkbook workbook;
    XSSFSheet worksheet;
    FileInputStream inputStream;

    @Before
    public void setup() throws Exception{

        driver= Driver.getDriver();

        driver.get("https://www.calculator.net/gas-mileage-calculator.html");
        inputStream=new FileInputStream(Config.getProperty("gasmileage.testdata.path"));
        workbook=new XSSFWorkbook(inputStream);
        worksheet=workbook.getSheet("Sheet1");
    }

    @Test
    public void dataDrivenMileageCalculatorTest(){
        gasObj=new GasMileageCalculatorPage();

        double currentOdo=123000;
        gasObj.currentOdometerReadingInput.clear();
        gasObj.currentOdometerReadingInput.sendKeys(String.valueOf(currentOdo));

        double previousOdo=122000;
        gasObj.previousOdometerReadingInput.clear();
        gasObj.previousOdometerReadingInput.sendKeys(String.valueOf(previousOdo));

        double gas=70;
        gasObj.gasInput.clear();
        gasObj.gasInput.sendKeys(String.valueOf(gas));

        gasObj.calculateButton.click();

        double expectedResult = (currentOdo - previousOdo) / gas;
        System.out.println("Expected result: "+expectedResult);

        String [] actualResult = gasObj.resultInGallon.getText().split(" ");
        System.out.println("Actual result: " +actualResult[0].toString());

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        System.out.println("Formulated result: " +decimalFormat.format(expectedResult));

        if(String.valueOf(decimalFormat.format(expectedResult)).equals(actualResult[0])){

            System.out.println("PASS!");

        }else{
            System.out.println("FAIL");
        }


    }







    }





