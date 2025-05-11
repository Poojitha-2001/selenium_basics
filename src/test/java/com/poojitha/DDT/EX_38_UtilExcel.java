package com.poojitha.DDT;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EX_38_UtilExcel {
    // Apache POI
    // Read the File - TestData.xlsX
    //  Workbook Create
    // Sheet
    // Row and Cell
    // 2D Object  - getData()

    static Workbook book;
    static Sheet sheet;
    static String path=System.getProperty("user.dir");
    public static String Sheet_path=path+"/src/test/resources/TestData.xlsx";
    public static Object[][] getTestDataFromExcel(String sheetName ) {
        FileInputStream file;
        {
            try {
                file = new FileInputStream(Sheet_path);
                book = WorkbookFactory.create(file);//converts static sheet to stream
                sheet = book.getSheet(sheetName);

            } catch (IOException e) {
                System.out.println("Either File Not Found! or workbook not created!");
            }

            Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
            for (int i = 0; i < sheet.getLastRowNum(); i++) {
                for (int j = 0; j < sheet.getRow(1).getLastCellNum(); j++) {
                    data[i][j] = sheet.getRow(i + 1).getCell(j).toString();

                }
            }
            return data;
        }

    }}
