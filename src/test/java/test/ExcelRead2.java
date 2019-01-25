package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRead2 {

    public static void main(String[] args) throws Exception{

        File file= new File("src/TestCase.xlsx");

        System.out.println(file.exists());

        FileInputStream inputStream=new FileInputStream(file);

        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
        XSSFSheet worksheet=workbook.getSheet("test2");
        System.out.println(worksheet.getRow(0).getCell(2));

        System.out.println(worksheet.getPhysicalNumberOfRows());
        System.out.println(worksheet.getRepeatingRows());

    }






}
