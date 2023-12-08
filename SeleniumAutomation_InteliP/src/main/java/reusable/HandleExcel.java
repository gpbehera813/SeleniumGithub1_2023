package reusable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class HandleExcel {

    public static String readExcel(String name, int row, int column) throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/testdata/SampleTestData1.xlsx"));

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheet(name);

        return sheet.getRow(row).getCell(column).getStringCellValue();



    }

}
