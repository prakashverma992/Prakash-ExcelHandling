package excel_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment1
{
	public void ReadData(int row , int column) throws BiffException, IOException
	{
		File f = new File("C:\\Users\\prade\\Desktop\\Excel FIle Handling\\xls format\\excel1_data.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		
		Cell c1 = ws.getCell(column, row);
		System.out.println("\nCell("+row+", "+column+"):===> "+c1.getContents());
		wk.close();
	}
	
	public static void main(String[] args) throws BiffException, IOException 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Program: Read data of a cell\n");
		System.out.println("Enter Row number: ");
		int r = s.nextInt();
		System.out.println("Enter Column number: ");
		int c = s.nextInt();
		System.out.println("\n**********Cell Data***********");
		Assignment1 n = new Assignment1();
		n.ReadData(r, c);
	}
}
