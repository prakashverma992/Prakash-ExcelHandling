package excel_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_csv_format 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Users\\prade\\Desktop\\Excel FIle Handling\\csv format\\Read_data_csv.csv");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		while ((s = b.readLine()) != null)
		{
			System.out.println(s);				//read and prints row by row ie. row 0, 1, 2, 3...
			String[] s1 = s.split(",");
			int L= s1.length;					//how many strings(words) in each row
			for (int i =0; i<L; i++)
			{
				System.out.println(s1[i] );
			}
			System.out.println();
		}
	}
}
