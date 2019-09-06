import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		LinkedListApp app = new LinkedListApp();
		
		 Scanner scan = new Scanner(System.in);

		System.out.println("Please give me your file name");
		String file = scan.nextLine();
		scan.close();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				String parts[] = line.split(" ");
				for(int i = 0; i < parts.length; i++)
				{
					int num = (Math.abs(Integer.valueOf(parts[i])));
					
					app.ordered(num);
					
					
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		app.printList();
		System.out.println();
		System.out.println(app.getSize());

	

	
	}


	


	}
