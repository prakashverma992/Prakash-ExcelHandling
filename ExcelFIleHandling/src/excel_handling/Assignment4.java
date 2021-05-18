package excel_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignment4 
{
	public void WriteData(int rowCount, int columnCount) throws IOException, WriteException
	{
		File f = new File("C:\\Users\\prade\\Desktop\\Excel FIle Handling\\xls format\\Assignment4_xls_write.xls");
		WritableWorkbook wk = Workbook.createWorkbook(f);
		WritableSheet ws = wk.createSheet("Prakash", 0);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data: ");
		String data = null;
		
		for (int i =0; i<rowCount; i++)
		{
			for (int j =0; j<columnCount; j++)
			{
				data = s.next();
				Label L = new Label(j, i, data);
				ws.addCell(L);
			}
		}
		wk.write();
		wk.close();
		
	}
	public static void main(String[] args) throws WriteException, IOException 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter row");
		int r = s1.nextInt();
		System.out.println("Enter column");
		int c = s1.nextInt();
		Assignment4 n = new Assignment4();
		n.WriteData(r, c);
	}
}
