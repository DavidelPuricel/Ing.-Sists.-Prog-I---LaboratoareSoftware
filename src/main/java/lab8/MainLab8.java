package lab8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;

public class MainLab8 {

    public static void main(String[] args) {
        MainLab8 app = new MainLab8();
        String fisierInput = "laborator8_input.xlsx";

        app.citesteDateExcel(fisierInput);
        app.genereazaMedieJava(fisierInput);
        app.genereazaMedieFormula(fisierInput);
    }

    public void citesteDateExcel(String numeFisier) {
        try (InputStream fisier = new FileInputStream(numeFisier);
             Workbook workbook = new XSSFWorkbook(fisier)) {
            Sheet foaie = workbook.getSheetAt(0);
            for (Row rand : foaie) {
                for (Cell celula : rand) {
                    if (celula.getCellType() == CellType.STRING) {
                        System.out.print(celula.getStringCellValue() + "\t");
                    } else if (celula.getCellType() == CellType.NUMERIC) {
                        System.out.print(celula.getNumericCellValue() + "\t");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void genereazaMedieJava(String numeFisierInput) {
        try (InputStream fisierIn = new FileInputStream(numeFisierInput);
             Workbook workbook = new XSSFWorkbook(fisierIn)) {
            Sheet foaie = workbook.getSheetAt(0);
            for (Row rand : foaie) {
                if (rand.getRowNum() == 0) continue;
                double n1 = rand.getCell(3).getNumericCellValue();
                double n2 = rand.getCell(4).getNumericCellValue();
                double n3 = rand.getCell(5).getNumericCellValue();
                rand.createCell(6).setCellValue((n1 + n2 + n3) / 3.0);
            }
            try (OutputStream out = new FileOutputStream("laborator8_output2.xlsx")) {
                workbook.write(out);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void genereazaMedieFormula(String numeFisierInput) {
        try (InputStream fisierIn = new FileInputStream(numeFisierInput);
             Workbook workbook = new XSSFWorkbook(fisierIn)) {
            Sheet foaie = workbook.getSheetAt(0);
            for (Row rand : foaie) {
                if (rand.getRowNum() == 0) continue;
                int r = rand.getRowNum() + 1;
                rand.createCell(6).setCellFormula("AVERAGE(D" + r + ":F" + r + ")");
            }
            try (OutputStream out = new FileOutputStream("laborator8_output3.xlsx")) {
                workbook.write(out);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}