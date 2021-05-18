package excel_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment3 
{
	public void ReadDataBasedUponRange(int initial_row, int end_row) throws BiffException, IOException
	{
		File f = new File("C:\\Users\\prade\\Desktop\\Excel FIle Handling\\xls format\\excel1_data.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int rowSize = ws.getRows();
		int colSize = ws.getColumns();
		System.out.println("Total row size = "+rowSize);
		System.out.println("Total column size = "+colSize);
		System.out.println("\n\tData of row no. ranging: "+initial_row+" to "+end_row);
		for (int i =initial_row; i<=end_row; i++)
		{
			System.out.print("\nrow: "+i+" =>");
			for (int j=0; j<colSize; j++)
			{
				Cell c1 = ws.getCell(j, i);
				System.out.print(" ["+c1.getContents()+"]");
			}
		}
	}
	
	public static void main(String[] args) throws BiffException, IOException 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Program: Read data of range given by user\n");
		System.out.println("Enter Initial row no.: ");
		int r1 =s.nextInt();
		System.out.println("Enter End row no.: ");
		int r2 =s.nextInt();
		Assignment3 n = new Assignment3();
		n.ReadDataBasedUponRange(r1, r2);
	}
}
