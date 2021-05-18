package excel_handling;

import java.io.File;
import java.io.IOException;

import org.omg.Messaging.SyncScopeHelper;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignment5 
{
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException, BiffException 
	{
		File f1 = new File("C:\\Users\\prade\\Desktop\\Excel FIle Handling\\xls format\\excel1_data.xls");
		Workbook wk1 = Workbook.getWorkbook(f1);
		Sheet ws1 = wk1.getSheet(0);
		int rowSize = ws1.getRows();
		int colSize = ws1.getColumns();
		
		File f2 = new File("C:\\Users\\prade\\Desktop\\Excel FIle Handling\\xls format\\Assignment5_copy_paste.xls");
		WritableWorkbook wk2 = Workbook.createWorkbook(f2);
		WritableSheet ws2 = wk2.createSheet("Prakash", 0);
		
		String data = null;
		for(int i =0; i<rowSize; i++)
		{
			for (int j =0; j<colSize; j++)
			{
				Cell c1 = ws1.getCell(j, i);
				data = c1.getContents();
				System.out.print(" "+data);
				System.out.print(" ");
				Label L = new Label(j, i, data);
				ws2.addCell(L);
			}
			System.out.println();
		}
		wk2.write();
		wk2.close();
	}
}
