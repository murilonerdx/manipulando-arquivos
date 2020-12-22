package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriter {

	public static void main(String[] args) throws IOException {
		//Cria/recria o arquivo: new FileWriter(path)
		//Acressenta ao arquivo existente: new FileWritter(path, true)
		
		String[] lines = new String[] {"Novo arquivo modificado"};
		
		String path = "C:\\Users\\coelh\\eclipse-workspace\\manipulando-arquivos\\newInit.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
	}

}
