package com.academy.lessons12;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class JavaExcelApp {
    public static void main(String[] args) throws IOException {

        Workbook wb = new HSSFWorkbook();
        Sheet sheet0 = wb.createSheet("Издатели");
        Row row = sheet0.createRow(3);
        Cell cell = row.createCell(4);
        cell.setCellValue("Lolita");

        Sheet sheet1 = wb.createSheet("Книги");
        Row row1 = sheet0.createRow(3);
        Cell cell1 = row.createCell(4);
        cell.setCellValue("Lolita");

        Sheet sheet2 = wb.createSheet("Авторы");


        FileOutputStream fos = new FileOutputStream("/Users/nataliiatereshchuk/Desktop/workflow/file.xls");
        wb.write(fos);
        fos.close();
    }
}
