import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Method {
    public static ArrayList<Map<String, String>> read(String path) throws IOException {
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        Sheet sheet=excel.getSheet("Sheet1");

        int noOfRows=sheet.getPhysicalNumberOfRows();

        Row headerRow=sheet.getRow(0);

        ArrayList<Map<String, String>> excelData=new ArrayList<>();

        for (int rowNo = 0; rowNo < noOfRows; rowNo++) {
            LinkedHashMap<String,String> rowMap=new LinkedHashMap<>();
            Row dataRow=sheet.getRow(rowNo);
            int noOfCell=dataRow.getPhysicalNumberOfCells();

            for (int cellNo = 0; cellNo < noOfCell; cellNo++) {
                String key=headerRow.getCell(cellNo).toString();
                String value=dataRow.getCell(cellNo).toString();
                rowMap.put(key,value);
            }
            excelData.add(rowMap);
        }
        return excelData;
    }
}
