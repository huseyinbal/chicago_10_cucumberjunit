package test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelWrite2 {
    public static void main(String[] args) throws Exception{

        File file=new File("src/TestCase.xlsx");


        FileInputStream inputStream=new FileInputStream(file);

        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
        XSSFSheet worksheet=workbook.getSheet("test2");
//19,2
        XSSFCell huseyinCell=worksheet.getRow(1).getCell(2);
        System.out.println(huseyinCell);
        huseyinCell.setCellValue("Turkmenistan");
        FileOutputStream outputStream=new FileOutputStream("src/TestCase.xlsx");
        System.out.println(huseyinCell);
        workbook.write(outputStream);
    }
}
