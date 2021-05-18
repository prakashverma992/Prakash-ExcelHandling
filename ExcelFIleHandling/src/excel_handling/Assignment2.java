package excel_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment2 
{
	public void ReadDataBasedUponRowNo(int row) throws BiffException, IOException
	{
		File f = new File("C:\\Users\\prade\\Desktop\\Excel FIle Handling\\xls format\\excel1_data.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int rowSize = ws.getRows();
		int colSize = ws.getColumns();
		System.out.println("Total row size = "+rowSize);
		System.out.println("Total column size = "+colSize);
		System.out.println("\n\t \tData of row no.: "+row);
		System.out.print("\nrow ("+row+") => ");
		for (int j = 0; j<colSize; j++)
			{
				Cell c1 = ws.getCell(j, row);
				System.out.print("["+c1.getContents()+"] ");
			}
	}

	public static void main(String[] args) throws BiffException, IOException 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Program: Read data of a row given by user\n");
		System.out.println("Enter the row number to read:");
		int r = s.nextInt();
		Assignment2 n = new Assignment2();
		n.ReadDataBasedUponRowNo(r);
	}
}
