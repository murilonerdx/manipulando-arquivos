package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExercicioProposto {
	public static void main(String[] args) {
		String path = "C:\\Users\\coelh\\eclipse-workspace\\manipulando-arquivos\\source.csv";
		String strPath = "C:\\Users\\coelh\\eclipse-workspace\\manipulando-arquivos";
		new File(strPath + "\\subdir").mkdir();
		String newPath = "C:\\Users\\coelh\\eclipse-workspace\\manipulando-arquivos\\subdir\\Output.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				Object[] produtos = line.split(",");
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(newPath, true))) {
					Double TransformDouble = Double.parseDouble(produtos[1].toString());
					Integer TransformInt = Integer.parseInt(produtos[2].toString());
					String TransformString = Double.toString(TransformDouble * TransformInt);
					bw.write(produtos[0] + "," + TransformString);
					bw.newLine();
					line = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
