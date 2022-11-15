package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {
        //we need to know the path of the file
        String path="Data/file.xlsx";
        //navigate to this path
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excelfile=new XSSFWorkbook(fileInputStream);
        Sheet sheet=excelfile.getSheet("Sheet1");
        Row row0=sheet.getRow(0);
        System.out.println(row0.getCell(0));
        //get the data from row1
        Row row1=sheet.getRow(1);
        System.out.println(row1.getCell(0));

        row1.forEach(x-> System.out.print(x+ " "));

    }
}
