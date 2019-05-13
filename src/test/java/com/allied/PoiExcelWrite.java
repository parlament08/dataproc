package com.allied;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;
import java.util.ArrayList;

class PoiExcelWrite {

    static void PoiWrite( ArrayList data,Workbook wb, Sheet sheet, Integer index) throws IOException {

        System.out.println("url: " + data.get(1));
        System.out.println("index: " + index);

            // Create a row and put some cells in it. Rows are 0 based.
            Row row = sheet.createRow(index);
            // Create a cell and put a value in it.
            Cell cell = row.createCell(0);
            cell.setCellValue(index);
            // Or do it on one line.
            row.createCell(1).setCellValue(String.valueOf(data.get(0)));
            row.createCell(2).setCellValue(String.valueOf(data.get(1)));
            row.createCell(3).setCellValue(String.valueOf(data.get(2)));

    }
}
