package practice2;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class ApachePOIExcelWrite {

    //static void PoiWrite(String numCode, String charCode, int nominal, String name, double value, String id, String date, int index) {
    static void PoiWrite(ValCurs valCurs) throws IOException {

        String path = "archive_currencies.xlsx";
        FileInputStream fileinp = new FileInputStream(path);
        Workbook wb = new XSSFWorkbook(fileinp);
//        Workbook wb = new XSSFWorkbook();

        int index = 0;
        Sheet sheet = wb.createSheet(valCurs.getDate());

        for (Valute currentVal : valCurs.getValutes()) {

            // Create a row and put some cells in it. Rows are 0 based.
            Row row = sheet.createRow(index++);
            // Create a cell and put a value in it.
            Cell cell = row.createCell(0);
            cell.setCellValue(currentVal.getNumCode());
            // Or do it on one line.
            row.createCell(1).setCellValue(currentVal.getСharCode());
            row.createCell(2).setCellValue(currentVal.getNominal());
            row.createCell(3).setCellValue(currentVal.getName());
            row.createCell(4).setCellValue(currentVal.getValue());
            row.createCell(5).setCellValue(currentVal.getId());

        }

        // Write the output to a file
        try {
            OutputStream fileOut = new FileOutputStream("archive_currencies.xlsx");
            wb.write(fileOut);
            fileOut.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
