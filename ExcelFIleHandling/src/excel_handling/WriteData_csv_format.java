package excel_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteData_csv_format 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Users\\prade\\Desktop\\Excel FIle Handling\\csv format\\Write_data_csv.csv");
		FileWriter fr = new FileWriter(f);
		BufferedWriter b = new BufferedWriter(fr);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter row no.: ");
		int row = s.nextInt();
		System.out.println("Enter column no.: ");
		int col = s.nextInt();
		System.out.println("Enter data: ");
		String data = null;
		for (int i =0; i<row; i++)
		{
			for (int j =0; j<col; j++)
			{
				data = s.next();
				b.write(data);
				b.write(",");;
			}
			b.newLine();
		}
		b.close();
	}
}
