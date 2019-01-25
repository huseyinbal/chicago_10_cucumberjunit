package test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.tool.XsbDumper;
import utilities.Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelWrite {

    public static void main(String[] args) throws Exception{
        String path="src/SampleData.xlsx";
        XSSFWorkbook workbook;
        XSSFSheet worksheet;
        XSSFRow row;
        XSSFCell cell;

        File file=new File("src/SampleData.xlsx");
        FileInputStream inputStream=new FileInputStream(file);

        workbook=new XSSFWorkbook(inputStream);
        worksheet=workbook.getSheet("Employees");
        row=worksheet.getRow(4);
        cell=row.getCell(0);
        System.out.println(cell.toString());

        XSSFCell adamCell=worksheet.getRow(5).getCell(0);
        System.out.println("BEFORE "+adamCell);
        adamCell.setCellValue("Trump");
        FileOutputStream outputStream=new FileOutputStream(path);

        System.out.println("AFTER: "+adamCell);





        //TODO: change job_id for trump to "president" dynamically
        String firstName= Config.getProperty("firstname");
        for(int i=0; i<=worksheet.getPhysicalNumberOfRows(); i++){
            if(worksheet.getRow(i).getCell(0).toString().equals(firstName)){
                System.out.println("Before Election: "+worksheet.getRow(i).getCell(2));
                worksheet.getRow(i).getCell(2).setCellValue("newjob");
                System.out.println("After Election: "+ worksheet.getRow(i).getCell(2));

                break;
            }

        }





        workbook.write(outputStream);//this is to save file
outputStream.close();
inputStream.close();
workbook.close();


    }


}
