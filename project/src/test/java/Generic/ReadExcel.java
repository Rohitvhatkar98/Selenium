package Generic;

import java.io.FileInputStream;

public class ReadExcel //implements IConstant 
{
public String getData(String sheet, int row, int cell)
FileInputStream fis=new FileInputStream (EXCEL_PATH);
Workbook wb=WorkbookFactory.create(fis);
return wb.getSheet(Sheet).getRow(row).getCell(cell).toString();
}
