package utils.files;

import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.*;


		public class Writing
		{

			static FileWriter filewrt;
			static FileReader fr;
			public static void Openfile()
			{
				try
				{
					File file = new File("Hero.txt");
					if (!file.exists())
					{
						file.createNewFile();
					}
					filewrt = new FileWriter(file, true);

				}
				catch(IOException ioe)
				{

				}
			}
			public static void closefile()
			{
				try
				{
					filewrt.close();
				}
				catch(IOException ieo)
				{

				}
			}
			public static void reading()
			{
				try {
					BufferedReader in = new BufferedReader(new FileReader("Hero.txt"));
					String line;
					while ((line = in.readLine()) != null)
					{
						System.out.println(line);
					}
					in.close();
				}
				catch (IOException ieo)
				{

				}

			}

			public static List<String[]> readFile()
			{
				List<String[]> temps = new ArrayList<String[]>();
				try
				{
					File file = new File("Hero.txt");

					BufferedReader br = new BufferedReader(new FileReader(file));
					String st;
				
					while ((st = br.readLine()) != null)
					{
						String[] line = st.split(",");
						temps.add(line);
					}
					br.close();
				}
				catch(IOException ieo)
				{

				}
				return temps;
		}

			public static void writeToFile(String line)
			{

				try
				{
					
					filewrt.write(line);
					filewrt.write("\n");
				}

				catch (Exception e)
				{

					e.printStackTrace();

				}
			}
		}
