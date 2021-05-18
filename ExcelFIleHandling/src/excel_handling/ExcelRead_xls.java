package excel_handling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelRead_xls 
{
	public static void main(String[] args) throws BiffException, IOException 
	{
		File f = new File("C:\\Users\\prade\\Desktop\\Excel FIle Handling\\xls format\\excel1_data.xls");		
															//connection established with .xls file
															//Now Object creation of workbook and worksheet
		Workbook wk = Workbook.getWorkbook(f);		//Workbook(excel) files
		Sheet ws = wk.getSheet(0);									//Sheet 0-> represent 1st worksheet
		
		int r = ws.getRows();							//fetch the number of rows of sheet
		int c = ws.getColumns();						//fetch the number of  columns of sheet
		
		System.out.println("Total row size = "+r);
		System.out.println("Total column size = "+c);
		System.out.println();
		
		for (int i=0; i<r; i++)							//loop for rows
		{
			for (int j=0; j<c; j++)						//loop for columns
			{
				Cell c1 = ws.getCell(j, i);				//object creation of cell
																	//A1(A=row, 1=column)
				System.out.println(c1.getContents());		//read data and prints the data from each cell
			}
			System.out.println();
		}
	}
}
