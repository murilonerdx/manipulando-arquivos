package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReader {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\coelh\\eclipse-workspace\\manipulando-arquivos\\init.txt");
		Scanner scan = null;
		
		try {
			scan = new Scanner(file);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		}catch(IOException e){
			System.out.println("O arquivo não pode ser lido " + e.getMessage());
			
		}finally {
			if(scan !=null)	
				scan.close();
		}

	}

}
