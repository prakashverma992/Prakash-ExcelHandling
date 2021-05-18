package excel_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExcelWrite_xls 
{
	public static void main(String[] args) throws IOException, WriteException 
	{
		File f = new File("C:\\Users\\prade\\Desktop\\Excel FIle Handling\\xls format\\data_output.xls");
		WritableWorkbook wk = Workbook.createWorkbook(f);
		WritableSheet ws = wk.createSheet("Prakash", 0);
		Scanner s = new Scanner(System.in);
		String data = null;
		System.out.println("Please enter data");
		
		for (int i =0; i<3; i++)							//loop for rows
		{
			for (int j =0; j<3; j++)						//loop for column
			{
				data = s.next();
				Label L = new Label(j, i, data);		//Cell Structure
				ws.addCell(L);
			}
		}
		wk.write();					//for saving file
		wk.close();					//for closing file
	}
}
