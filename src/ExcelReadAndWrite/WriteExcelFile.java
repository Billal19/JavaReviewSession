package ExcelReadAndWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {

    private final static String FILE_NAME =System.getProperty("user.dir")+"/DataTest/Sample.xlsx";


    public static void main(String[] args) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data Type In Java ");



        Object [][] dataTypes = {

                {"DataTypes", "Type", "Size(in bytes)"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"char", "Primitive", 1},
                {"String", "Non Primitive", "not a fixed size"},
                {"Bill", "is a hard working ", "student"},

        };

        int rowNum = 0 ; // this method used to specify what row should our excel sheet start from
        System.out.println("Creating excel"); // this line of code is only for beatification and organization
        for (Object[] dataType: dataTypes){
            Row row = sheet.createRow(rowNum++);

            int colNum = 0;
            for (Object field: dataType){
                Cell cell = row.createCell(colNum++);
                if (field instanceof String){
                    cell.setCellValue((String) field);
                }else if (field instanceof  Integer){
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try{
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("DONE");

    }
}
