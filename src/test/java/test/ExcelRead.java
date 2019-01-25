package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utilities.Config;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelRead {
    public static void main (String [] args)    throws Exception{

        File file=new File("src/SampleData.xlsx");

        System.out.println(file.exists());

        FileInputStream inputStream=new FileInputStream(file);

        //Loading into the class
        XSSFWorkbook Workbook=new XSSFWorkbook(inputStream);

        XSSFSheet worksheet=Workbook.getSheet("Employees");
        System.out.println(worksheet.getRow(2).getCell(1));
        System.out.println(worksheet.getRow(3).getCell(2));
        //To get the physical number of rows used

        int usedRows=worksheet.getPhysicalNumberOfRows();// it is getting number of filled in rows.
        int lastUsedRow=worksheet.getLastRowNum();// it is getting index of last row including empty rows

        //TODO:Print out Nancys jobid

       for(int rowNum=0; rowNum<=usedRows; rowNum++){
           if(worksheet.getRow(rowNum).getCell(0).toString().equals("Nancy")){
               System.out.println(worksheet.getRow(rowNum).getCell(2));
               break;
           }
       }


       //TODO:if last name is matching , print out all the information for that person:
        //TODO: firstname, lastname, job_id
        //get the last name from config
String lastName= Config.getProperty("lastname");
        for(int rowNum=0; rowNum<=usedRows; rowNum++){
            if(worksheet.getRow(rowNum).getCell(1).toString().equals(lastName)){
                System.out.println("Information for employee "+lastName+"===>"+
                        worksheet.getRow(rowNum).getCell(0)+", "+worksheet.getRow(rowNum).getCell(2));
                break;
            }

        }


       Workbook.close();
       inputStream.close();
    }
}
