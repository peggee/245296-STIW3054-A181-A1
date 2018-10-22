/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;

import static com.mycompany.assignment1.Data.data;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
    public static void excel() throws IOException {
        System.out.println("Processing excel file...");
        File ExcelFile = new File("C:\\Users\\user\\Desktop\\Trivia_Table.xlsx");
        XSSFWorkbook workBook = new XSSFWorkbook();
        XSSFSheet sheet = workBook.createSheet("Malaysia");

        try {
            int r = 0;
            for (int a = 0; a < data.size(); a++){
                Row row = sheet.createRow(r++);
                Cell col_1 = row.createCell(0);
                col_1.setCellValue(data.get(a).getHeader());
                Cell col_2 = row.createCell(1);
                col_2.setCellValue(data.get(a).getData());
            }
            for (int b = 0; b < 24; b++) {
                sheet.autoSizeColumn(b);
            }
            try (
                    FileOutputStream output = new FileOutputStream(ExcelFile)) {
                workBook.write(output);
            }
            System.out.println("Well Done! Your excel file created successfully!");
            System.out.println("Your file located at: "+ExcelFile);
        } catch (FileNotFoundException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    
}
